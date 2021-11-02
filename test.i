%module testwrap
%rename(XsScannerClass) XsScanner;
 %{

#include "./xsens/public/xspublic/xscontroller/xscontrol_def.h"
#include  "./xsens/public/xspublic/xscontroller/xsdevice_def.h"
#include  "./xsens/public/xspublic/xscontroller/xsscanner.h"
 /* Put header files here or function declarations like below */

 %}
#define XSNOEXPORT
#define XSNOCOMEXPORT 
#define XSENS_NO_PORT_NUMBERS
#define XDA_DLL_API 

#define XSTYPES_DLL_API

%include "./xsens/public/xspublic/xscontroller/xscontrol_def.h"
%include  "./xsens/public/xspublic/xscontroller/xsdevice_def.h"
%include  "./xsens/public/xspublic/xscontroller/xsscanner.h"
#undef XSENS_NO_PORT_NUMBERS
#undef XSNOEXPORT

#undef XDA_DLL_API 


#undef XSNOCOMEXPORT


#undef XSTYPES_DLL_API





