/*minimal wrapper */
%module types

%{
#include  "xscontroller/xsselftestresult.h"
#include  "xstypes/xsstringoutputtype.h"
#include "xstypes/xscandataidentifier.h"
#include  "xscontroller/xsdeviceparameter.h"
#include  "xscontroller/xsdeviceparameteridentifier.h"
#include  "xstypes/xscanoutputconfiguration.h"
#include  "xstypes/xscanframeformat.h"
#include  "xscontroller/xsiccrepmotionresult.h"
#include  "xscontroller/datalogger.h"
#include  "xstypes/xsportinfo.h"

//using all includes results in more errors. This seems like the variant
// #include  "xscontroller/xsselftestresult.h"
// #include  "xstypes/xsstringoutputtype.h"
// #include  "xscontroller/xsdeviceptr.h"
// #include  "xstypes/xsdeviceid.h"
// #include  "xstypes/xsfilterprofile.h"
// #include  "xstypes/xsanalogindata.h"
// #include  "xstypes/xsbaudrate.h"
// #include  "xstypes/xscalibrateddata.h"
// #include  "xscontroller/xsdeviceparameter.h"
// #include  "xscontroller/xsdeviceparameteridentifier.h"
// #include "xstypes/xscandataidentifier.h"
// #include  "xstypes/xscanoutputconfiguration.h"
// #include  "xstypes/xscanframeformat.h"
// #include  "xscontroller/xsiccrepmotionresult.h"
// #include  "xstypes/xstimestamp.h"
// #include  "xstypes/xsrange.h"
// #include  "xstypes/xssnapshot.h"
// #include  "xstypes/xsglovesnapshot.h"
// #include  "xstypes/xsrawgnsspvtdata.h"
// #include  "xstypes/xsportinfo.h"
// #include  "xstypes/xspressure.h"
// #include  "xstypes/xshandid.h"
// #include  "xstypes/xssdidata.h"
// #include  "xstypes/xsscrdata.h"
// #include  "xstypes/xsresultvalue.h"
// #include  "xstypes/xsrawgnsssatinfo.h"
// #include "xstypes/xsglovedata.h"
// #include  "xscontroller/xscallbackplainc.h"
// #include  "xscontroller/xscallback.h"
// #include  "xscontroller/callbackmanagerxda.h"
// #include  "xscontroller/communicator.h"
// #include  "xscontroller/datalogger.h"
// #include  "xscontroller/xsaccesscontrolmode.h"
// #include  "xscontroller/xsalignmentframe.h"
// #include  "xscontroller/xsconnectivitystate.h"
// #include  "xstypes/xsdeviceoptionflag.h"
// #include  "xscontroller/xserrormode.h"
// #include  "xstypes/xsfilepos.h"
// #include  "xscontroller/xsgnssplatform.h"
// #include  "xscontroller/xsoperationalmode.h"
// #include  "xstypes/xsoption.h"
// #include  "xstypes/xsoutputconfiguration.h"
// #include  "xscontroller/xsprotocoltype.h"
// #include  "xscontroller/xsrejectreason.h"
// #include  "xstypes/xsresetmethod.h"
// #include  "xstypes/xsstringoutputtype.h"
// #include  "xstypes/xssyncrole.h"
// #include  "xscontroller/iprotocolhandler.h"
// #include  "xscontroller/messagelocation.h"
// #include  "xscontroller/openportstage.h"
// #include  "xscontroller/replyobject.h"
// #include  "xstypes/xssyncrole.h"
// #include  "xscontroller/xsdeviceconfiguration.h"
// #include  "xstypes/xsfilterprofile.h"
// #include  "xstypes/xsdeviceid.h"
%}


#define XSNOCOMEXPORT
#define XS_PACKED_STRUCT_START 
#define XS_PACKED_STRUCT_END


//these 2 imports set all necessary flag and macros
%import  "xscontroller/xscontrollerconfig.h"
%import  "xstypes/xstypesconfig.h"

%include "rename_ops.i"

%rename (XsFilterProfile_emptyClass) XsFilterProfile_empty;
%rename (XsFilterProfile_swapClass) XsFilterProfile_swap;
%rename (XsFilterProfile_toStringClass) XsFilterProfile_toString;




%include  "xscontroller/xsselftestresult.h"

%include "cpointer.i" 
%include "primitive_type_ptr.i"
%include "stdint.i"
%include "primitive_type_ptr.i"
%include "datatypes.i"


%rename (XsDataPacketClass) XsDataPacket;
%rename (XsBaudrateClass) XsBaudrate;
%rename (XsTimeStampClass) XsTimeStamp;
%rename (XsDeviceIdClass) XsDeviceId;
%rename (XsRangeClass) XsRange;

%rename (XsPortInfoClass) XsPortInfo;
%rename (XsGloveData_swapClass) XsGloveData_swap;
%rename (XsFingerData_swapClass) XsFingerData_swap;
%rename (XsSyncSetting_isInputClass) XsSyncSetting_isInput;
%rename (XsSyncSetting_isOutputClass) XsSyncSetting_isOutput;

%rename (XsDeviceConfiguration_emptyClass) XsDeviceConfiguration_empty;

%rename (XsDeviceConfiguration_deviceInfo) XsDeviceConfiguration::deviceInfo(XsDeviceId const &);
%rename (XsDeviceConfiguration_deviceInfo) XsDeviceConfiguration::deviceInfo(XsSize);
%rename (XsDeviceConfiguration_masterInfo) XsDeviceConfiguration::masterInfo();
%rename (XsSyncSetting_swapClass) XsSyncSetting_swap;



// -----------
//ignore C Methods
%ignore XsDeviceConfiguration_readFromMessage;
%ignore XsDeviceConfiguration_writeToMessage;
// -----------


//stringoutputtype has to be include before xsfilterprofile
%include  "xstypes/xsstringoutputtype.h"

%include  "xscontroller/xsdeviceptr.h"
#define XSDEPRECATED_START
#define XSDEPRECATED 
%include  "xstypes/xsdeviceid.h"
#undef XSDEPRECATED_START
#undef XSDEPRECATED 
%include "array_variations.i"
%include  "xstypes/xsfilterprofile.h"

%include  "xstypes/xsanalogindata.h"

%include  "xstypes/xsbaudrate.h"

%include  "xstypes/xscalibrateddata.h"



%include  "xscontroller/xsdeviceparameter.h"
%include  "xscontroller/xsdeviceparameteridentifier.h"


%include "xstypes/xscandataidentifier.h"
%include  "xstypes/xscanoutputconfiguration.h"





%include  "xstypes/xscanframeformat.h"
%include  "xscontroller/xsiccrepmotionresult.h"


%include  "xstypes/xstimestamp.h"

%include  "xstypes/xsrange.h"
%include  "xstypes/xssnapshot.h"
%include  "xstypes/xsglovesnapshot.h"

%include  "xstypes/xsrawgnsspvtdata.h"



//-----------------

%include  "xstypes/xsportinfo.h"
%include  "xstypes/xspressure.h"
%include  "xstypes/xshandid.h"
%include  "xstypes/xssdidata.h"
%include  "xstypes/xsscrdata.h"
%include  "xstypes/xsresultvalue.h"
%include  "xstypes/xsrawgnsssatinfo.h"
%include "xstypes/xsglovedata.h"


%import  "xscontroller/xscallbackplainc.h"
%import  "xscontroller/xscallback.h"
%include  "xscontroller/callbackmanagerxda.h"
%include  "xscontroller/communicator.h"
%include  "xscontroller/datalogger.h"
%include  "xscontroller/xsaccesscontrolmode.h"
%include  "xscontroller/xsalignmentframe.h"






//-------------------



#define XDA_DLL_API
%include  "xscontroller/xsconnectivitystate.h"
#undef XDA_DLL_API

%include  "xstypes/xsdeviceoptionflag.h"

#define XDA_DLL_API
%include  "xscontroller/xsdevicestate.h"
#undef XDA_DLL_API

%include  "xscontroller/xserrormode.h"
%include  "xstypes/xsfilepos.h"
%include  "xscontroller/xsgnssplatform.h"


%include  "xscontroller/xsoperationalmode.h"
%include  "xstypes/xsoption.h"

%include  "xstypes/xsoutputconfiguration.h"

//-----------------------------

%include  "xscontroller/xsprotocoltype.h"
#define XDA_DLL_API
%include  "xscontroller/xsrejectreason.h"
#undef XDA_DLL_API
%include  "xstypes/xsresetmethod.h"

%include  "xstypes/xsstringoutputtype.h"
%include  "xstypes/xssyncrole.h"
%include  "xscontroller/iprotocolhandler.h"
%include  "xscontroller/messagelocation.h"
%include  "xscontroller/openportstage.h"
%include  "xscontroller/replyobject.h"
%include  "xstypes/xssyncrole.h"

 #define XDA_DLL_API 
 %include  "xscontroller/xsdeviceconfiguration.h"
 #undef XDA_DLL_API 

 %include  "xstypes/xsfilterprofile.h"

#define XSDEPRECATED
#define XSDEPRECATED_START
%include  "xstypes/xsdeviceid.h"
