/* wrapper.i */
%module example
//versuch SWIGTYPE_p_uint_8 zu verhindern
typedef unsigned char uint_8;

%rename(XsScannerClass) XsScanner;
%rename(XsDataPacketClass) XsDataPacket;
%include "cpointer.i" 
%include "primitive_type_ptr.i"

//Wird vermutlich implizit included sobald -java flag gesetzt ist
%include "java.swg"
 //define templates

 %{

#include "./xsens/public/xspublic/xscontroller/xscontrol_def.h"
#include  "./xsens/public/xspublic/xscontroller/xsdevice_def.h"
#include  "./xsens/public/xspublic/xscontroller/xsscanner.h"
#include  "./xsens/public/xspublic/xstypes/xsoutputconfigurationarray.h"
#include  "./xsens/public/xspublic/xstypes/xsdatapacket.h"
#include  "./xsens/public/xspublic/xstypes/xstime.h"
#include  "./xsens/public/xspublic/xscommon/xsens_mutex.h"
#include "./xsens/public/xspublic/xstypes/xsthread.h"


 /* Put header files here or function declarations like below */

 %}
%include "./xsens/include/xscontroller/xscallbackplainc.h"
%include "./xsens/public/xspublic/xscontroller/xscallback.h"
%include "./xsens/public/xspublic/xscontroller/callbackmanagerxda.h"


#define XSNOEXPORT
#define XSNOCOMEXPORT 
#define XSENS_NO_PORT_NUMBERS
#define XDA_DLL_API 

#define XSTYPES_DLL_API

%include "./xsens/public/xspublic/xstypes/xsthread.h"
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


//Fabians beispielcode
%{
#include "./xsens/public/xspublic/xstypes/xstypesconfig.h"
#include "./xsens/public/xspublic/xstypes/xsarray.h"
#include  "./xsens/public/xspublic/xstypes/xsoutputconfigurationarray.h"
%}

//Da sind viele #define drin, die andere Header benutzen
%include "./xsens/public/xspublic/xstypes/xstypesconfig.h"

// Hier ist XsArrayImpl definiert
// Das ist erst nach dem %include xsarray.h (oder %import) dem SWIG bekannt
// Daher vor dem %xsoutputconfigurationarray.h notwendig.
#define XSENS_NOITERATOR
%include "./xsens/public/xspublic/xstypes/xsarray.h"
#undef XSENS_NOITERATOR

// Die Template Instanzierung geht erst, nachdem %include xsarray.h
// weil dort das Template definiert wird.
%template(XsOutputArray) XsArrayImpl<XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray>;

%include  "./xsens/public/xspublic/xstypes/xsoutputconfigurationarray.h"