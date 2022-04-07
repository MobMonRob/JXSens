#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	mkdir -p "$linuxTarget"

	local -r wrapLibTarget="$wrapLibDir/$linuxTarget"
	local -r wrapLibInclude="$wrapLibTarget/include/xsens_mti_library"
	local -r libInclude="$wrapLibTarget/include"
	local -r wrapLibBinary="$wrapLibTarget/lib"

	local -r SwigCppArray=($(find "$linuxTmp"/*.cpp -maxdepth 0 -mindepth 0 -type f -printf '%f\n'))

	for swigCpp in ${SwigCppArray[@]}
	do
		echo "->$swigCpp"

	#-flto
	#-c für nicht linken (nur .o erzeugen)
	#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
	g++ -shared -fPIC -O3 -cpp -std=c++17 "$linuxTmp/$swigCpp" \
	-shared -L../xsens/public/xspublic/ -Wl, --verbose -l:xsenslib.so  -I"$javaIncludeLinux/linux" -I"$javaIncludeLinux" -I"$wrapLibInclude" -I"$xsenspublicpath" -I"$swigmodules" -I"$libInclude" \
	-o "$linuxTmp/$swigCpp.o" 
	done
	

	

	local -r oArray=(${SwigCppArray[@]/%/.o})
	local -r pathArray=(${oArray[@]/#/$linuxTmp/})

	#-flto
	g++ -shared -L"$wrapLibBinary" \
	-Wl,--start-group \
	${pathArray[@]} \
	 -lpthread \
	-Wl,--end-group \
	-Wl,-rpath,'$ORIGIN/.' -o "$linuxTarget/libJ"$wrapLibName".so" \
	-Wl,--as-needed -Wl,--no-undefined -Wl,--no-allow-shlib-undefined
}

run_bash run $@

