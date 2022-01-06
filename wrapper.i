/* wrapper.i */
%module example
%include "stdint.i"
//versuch SWIGTYPE_p_uint_8 zu verhindern
typedef unsigned char uint8_t;

%rename(XsScannerClass) XsScanner;
%rename(XsDataPacketClass) XsDataPacket;
%include "cpointer.i" 
%include "primitive_type_ptr.i"

//avoids SWIGTYPE_p_Communicator.java
%include "./xsens/public/xspublic/xscontroller/communicator.h"
//%newobject communicator;
//Communicator* communicator();

//avoids SWIGTYPE_p_Datalogger.java
%include "./xsens/public/xspublic/xscontroller/datalogger.h"
//%newobject logFileInterface();
//DataLogger* logFileInterface(std::unique_ptr<xsens::Lock>& myLock);

//avoids SWIGTYPE_p_Datapacket
%include "./xsens/public/xspublic/xstypes/datapacket_p.h"

#define XSTYPES_DLL_API 
//avoids SWIGTYPE_p_f_p_q_const__void_p_q_const__void__int.java
%ignore XsArray::XsArray_removeDuplicatesPredicate;
%ignore xsarray::XsArray_removeDuplicatesPredicate;

//avoids iprotocolhandler Swigtype
%include "./xsens/public/xspublic/xscontroller/iprotocolhandler.h"

//avoid OpenPortStage Swigtype
%include "./xsens/public/xspublic/xscontroller/openportstage.h"


//attempt to remove Swigtype CallbackPlainC files
//ignore all bytearray usages
%ignore XsByteArray;
%ignore XsCallbackPlainC::m_onMessageDetected;
%ignore XsCallbackPlainC::m_onTransmissionRequest;

//ignore all xsdeviceptrarray usages
%ignore XsDevicePtrArray;
%ignore XsCallbackPlainC::m_onAllLiveDataAvailable;
%ignore XsCallbackPlainC::m_onAllBufferedDataAvailable;
%ignore XsCallbackPlainC::m_onAllDataAvailable;
%ignore XsCallbackPlainC::m_onAllRecordedDataAvailable;

//ignore all xsdatapacket usages
%ignore XsDataPacket;
%ignore XsCallbackPlainC::m_onLiveDataAvailable;
%ignore XsCallbackPlainC::m_onBufferedDataAvailable;
%ignore XsCallbackPlainC::m_onDataAvailable;
%ignore XsCallbackPlainC::m_onRecordedDataAvailable;

//ignore all xsdatapacketptrarray usages
%ignore XsDataPacketPtrArray;
%ignore XsCallbackPlainC::m_onAllLiveDataAvailable;
%ignore XsCallbackPlainC::m_onAllBufferedDataAvailable;
%ignore XsCallbackPlainC::m_onAllDataAvailable;
%ignore XsCallbackPlainC::m_onAllRecordedDataAvailable;

//ignore all xsstring usages
%ignore XsString;
%ignore XsCallbackPlainC::m_onProgressUpdated;
%ignore XsCallbackPlainC::m_onRestoreCommunication;

%include "./xsens/public/xspublic/xscontroller/xscallbackplainc.h"

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