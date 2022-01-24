#!/bin/bash


projectDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
wrapperDir="$projectDir/_dependencies/Wrapper"

#Has to be: <Project Folder>/natives/<os-arch> !!
linuxNativesPath="./natives/linux-amd64"
windowsNativesPath="./natives/windows-amd64"

if [[ "$currentPlatform" == "$platformLinux" ]]; then
	currentNativesPath="$linuxNativesPath"
elif [[ "$currentPlatform" == "$platformWindows" ]]; then
	currentNativesPath="$windowsNativesPath"
else
	echo "Error: currentPlatform=$currentPlatform not supported."
	exit 1
fi

implPackageDir="java/de/dhbw/rahmlab/urcl/impl"

