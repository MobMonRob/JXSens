 /* wrapper.i */
 %module example
 %{

#include "./xsens/public/xspublic/xscontroller/xscontrol_def.h"
#include  "./xsens/public/xspublic/xscontroller/xsdevice_def.h"
#include  "./xsens/public/xspublic/xscontroller/xsscanner.h"
#include  "./xsens/public/xspublic/xstypes/xsoutputconfigurationarray.h"
#include  "./xsens/public/xspublic/xstypes/xsdatapacket.h"
#include  "./xsens/public/xspublic/xstypes/xstime.h"
#include  "./xsens/public/xspublic/xscommon/xsens_mutex.h"

 /* Put header files here or function declarations like below */

 %}
#define XSNOEXPORT
#define XSNOCOMEXPORT 
#define XSENS_NO_PORT_NUMBERS
#define XDA_DLL_API 

#define XSTYPES_DLL_API

%include "./xsens/public/xspublic/xscontroller/xscontrol_def.h"

%include  "./xsens/public/xspublic/xscontroller/xsdevice_def.h"
#undef XSENS_NO_PORT_NUMBERS
#undef XSNOEXPORT
%include  "./xsens/public/xspublic/xscontroller/xsscanner.h"
#undef XDA_DLL_API 

%include  "./xsens/public/xspublic/xstypes/xsoutputconfigurationarray.h"
%include  "./xsens/public/xspublic/xstypes/xsdatapacket.h"

#undef XSNOCOMEXPORT

%include  "./xsens/public/xspublic/xstypes/xstime.h"
#undef XSTYPES_DLL_API
%include  "./xsens/public/xspublic/xscommon/xsens_mutex.h"




