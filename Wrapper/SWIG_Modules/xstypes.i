/*minimal wrapper */
%module types

#define XSTYPES_DLL_API 
#define XSNOCOMEXPORT
#define XSCPPPROTECTED
#define XS_PACKED_STRUCT_START 
#define XS_PACKED_STRUCT_END

%include "../../xsens/public/xspublic/xscontroller/xsselftestresult.h"
%include "rename_ops.i"
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
%rename (XsFilterProfile_emptyClass) XsFilterProfile_empty;
%rename (XsDeviceConfiguration_emptyClass) XsDeviceConfiguration_empty;

%rename (XsDeviceConfiguration_deviceInfo) XsDeviceConfiguration::deviceInfo(XsDeviceId const &);
%rename (XsDeviceConfiguration_deviceInfo) XsDeviceConfiguration::deviceInfo(XsSize);
%rename (XsDeviceConfiguration_masterInfo) XsDeviceConfiguration::masterInfo();
%rename (XsSyncSetting_swapClass) XsSyncSetting_swap;
%rename (XsFilterProfile_swapClass) XsFilterProfile_swap;
%rename (XsFilterProfile_toStringClass) XsFilterProfile_toString;



// -----------
//ignore C Methods
%ignore XsDeviceConfiguration_readFromMessage;
%ignore XsDeviceConfiguration_writeToMessage;
// -----------




%include "../../xsens/public/xspublic/xstypes/xsanalogindata.h"
%include "../../xsens/public/xspublic/xstypes/xsdatapacket.h"
%include "../../xsens/public/xspublic/xstypes/xsbaudrate.h"

%include "../../xsens/public/xspublic/xstypes/xscalibrateddata.h"
%include "../../xsens/public/xspublic/xstypes/xsdataidentifier.h"


%include "../../xsens/public/xspublic/xscontroller/xsdeviceparameter.h"
%include "../../xsens/public/xspublic/xscontroller/xsdeviceparameteridentifier.h"


%include "../../xsens/include/xstypes/xscandataidentifier.h"
%include "../../xsens/public/xspublic/xstypes/xscanoutputconfiguration.h"
%include "../../xsens/public/xspublic/xstypes/xsfilterprofile.h"
%include "../../xsens/public/xspublic/xstypes/xscanframeformat.h"
%include "../../xsens/public/xspublic/xscontroller/xsiccrepmotionresult.h"


%include "../../xsens/public/xspublic/xstypes/xstimestamp.h"

%include "../../xsens/public/xspublic/xstypes/xsrange.h"
%include "../../xsens/public/xspublic/xstypes/xssnapshot.h"
%include "../../xsens/public/xspublic/xstypes/xsglovesnapshot.h"

%include "../../xsens/public/xspublic/xstypes/xsrawgnsspvtdata.h"



//-----------------

%include "../../xsens/public/xspublic/xstypes/xsportinfo.h"
%include "../../xsens/public/xspublic/xstypes/xspressure.h"
%include "../../xsens/public/xspublic/xstypes/xshandid.h"
%include "../../xsens/public/xspublic/xstypes/xssdidata.h"
%include "../../xsens/public/xspublic/xstypes/xsscrdata.h"
%include "../../xsens/public/xspublic/xstypes/xsresultvalue.h"
%include "../../xsens/public/xspublic/xstypes/xsrawgnsssatinfo.h"
%include "../../xsens/include/xstypes/xsglovedata.h"


%import "../../xsens/public/xspublic/xscontroller/xscallbackplainc.h"
%import "../../xsens/public/xspublic/xscontroller/xscallback.h"
%include "../../xsens/public/xspublic/xscontroller/callbackmanagerxda.h"
%include "../../xsens/public/xspublic/xscontroller/communicator.h"
%include "../../xsens/public/xspublic/xscontroller/datalogger.h"
%include "../../xsens/public/xspublic/xscontroller/xsaccesscontrolmode.h"
%include "../../xsens/public/xspublic/xscontroller/xsalignmentframe.h"

#define XSDEPRECATED_START
#define XSDEPRECATED 
%include "../../xsens/public/xspublic/xstypes/xsdeviceid.h"
#undef XSDEPRECATED_START
#undef XSDEPRECATED 




//-------------------



#define XDA_DLL_API
%include "../../xsens/public/xspublic/xscontroller/xsconnectivitystate.h"
#undef XDA_DLL_API

%include "../../xsens/public/xspublic/xstypes/xsdeviceoptionflag.h"

#define XDA_DLL_API
%include "../../xsens/public/xspublic/xscontroller/xsdevicestate.h"
#undef XDA_DLL_API

%include "../../xsens/public/xspublic/xscontroller/xserrormode.h"
%include "../../xsens/public/xspublic/xstypes/xsfilepos.h"
%include "../../xsens/public/xspublic/xscontroller/xsgnssplatform.h"


%include "../../xsens/public/xspublic/xscontroller/xsoperationalmode.h"
%include "../../xsens/public/xspublic/xstypes/xsoption.h"

%include "../../xsens/public/xspublic/xstypes/xsoutputconfiguration.h"

//-----------------------------

%include "../../xsens/public/xspublic/xscontroller/xsprotocoltype.h"
#define XDA_DLL_API
%include "../../xsens/public/xspublic/xscontroller/xsrejectreason.h"
#undef XDA_DLL_API
%include "../../xsens/public/xspublic/xstypes/xsresetmethod.h"

%include "../../xsens/public/xspublic/xstypes/xsstringoutputtype.h"
%include "../../xsens/public/xspublic/xstypes/xssyncrole.h"
%include "../../xsens/public/xspublic/xscontroller/iprotocolhandler.h"
%include "../../xsens/public/xspublic/xscontroller/messagelocation.h"
%include "../../xsens/public/xspublic/xscontroller/openportstage.h"
%include "../../xsens/public/xspublic/xscontroller/replyobject.h"
%include "../../xsens/public/xspublic/xstypes/xssyncrole.h"

 #define XDA_DLL_API 
 %include "../../xsens/public/xspublic/xscontroller/xsdeviceconfiguration.h"
 #undef XDA_DLL_API 

 %include "../../xsens/public/xspublic/xstypes/xsfilterprofile.h"

#define XSDEPRECATED
#define XSDEPRECATED_START
%include "../../xsens/public/xspublic/xstypes/xsdeviceid.h"

%include "array_variations.i"