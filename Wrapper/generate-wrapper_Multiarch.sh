#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	local -r swigJavaOutDir="$currentTarget/java/de/dhbw/rahmlab/"$wrapLibName"/impl"

	local -r wrapLibTarget="$wrapLibDir/$currentTarget"
	local -r wrapLibInclude="$wrapLibTarget/include/xsens_mti_library"

	mkdir -p "$swigJavaOutDir"
	mkdir -p "$currentTmp"

	local -r swigModulesDirectory="$projectDir/SWIG_Modules"
	local -r swigLibDirectory="$projectDir/SWIG_Lib"

	local -r SwigModulesArray=($(find "$swigModulesDirectory"/* -maxdepth 0 -mindepth 0 -type f -printf '%f\n'))

	#local -r moduleOfInterest="urcl_data_package.i"
	#local -r moduleOfInterest="urcl_log.i"
	local -r moduleOfInterest="minimalwrapper.i"
	local -r xsenspublicpath="../xsens/public/xspublic"
	local -r swigModule="minimalwrapper.i"
	# local -r filterModule="false"

	# for swigModule in ${SwigModulesArray[@]}
	# do
	# 	if [[ $filterModule == "true" ]]; then
	# 		if [[ $swigModule != $moduleOfInterest ]]; then
	# 			continue
	# 		fi
	# 	fi

	# 	echo "->$swigModule"


		#-debug-tmused -debug-tmsearch -debug-typemap
	swig -c++ -java -package "de.dhbw.rahmlab."$wrapLibName".impl" -outdir "$swigJavaOutDir" -o "$currentTmp/"$swigModule"_wrap.cpp" -I"$wrapLibInclude" -I"$xsenspublicpath" -I"$swigLibDirectory" "$swigModulesDirectory/$swigModule" 
}
run_bash run $@

