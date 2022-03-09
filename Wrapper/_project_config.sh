#!/bin/bash

readonly projectDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
readonly wrapLibName="XSens"
readonly wrapLibDir="$projectDir/_dependencies/XSensMTi"

readonly javaIncludeLinux="$projectDir/jdk-include/java-11-openjdk-amd64/include"
readonly javaIncludeWindows="$projectDir/jdk-include/jdk-11.0.11+9/include"
xsenspublicpath="../xsens/public/xspublic"
swigmodules="./SWIG_Modules/"
readonly mingwLibPath1="/usr/x86_64-w64-mingw32/lib"
#all the mingw and minw lib are probably not necessary
local -r minwLibPath2Beginning="/usr/lib/gcc/x86_64-w64-mingw32"
local -r minwLibPath2FoundArray=($(find "$minwLibPath2Beginning"/*-posix -maxdepth 0 -mindepth 0 -type d -printf '%f\n'))
readonly mingwLibPath2="$minwLibPath2Beginning/${minwLibPath2FoundArray[0]}"

readonly xsensDir="$projectDir/_dependencies/XSensMTi"

