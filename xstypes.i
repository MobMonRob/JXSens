/*minimal wrapper */
%module types

#define XSTYPES_DLL_API 
#define XSNOCOMEXPORT
#define XSCPPPROTECTED
#define XS_PACKED_STRUCT_START 
#define XS_PACKED_STRUCT_END
%include "cpointer.i" 
%include "primitive_type_ptr.i"
%include "stdint.i"
%include "primitive_type_ptr.i"

typedef double		std_double;

%rename (XsQuaternionClass) XsQuaternion;
%rename (XsAnalogInDataClass) XsAnalogInData;
%rename (XsDataPacketClass) XsDataPacket;
%rename (XsBaudrateClass) XsBaudrate;
%rename (XsByteArrayClass) XsByteArray;
%rename (XsCalibratedDataClass) XsCalibratedData;
%rename (XsEulerClass) XsEuler;
%rename (XsMatrixClass) XsMatrix;
%rename (XsMessageClass) XsMessage;
%rename (XsVectorClass) XsVector;
%rename (XsTimeStampClass) XsTimeStamp;
%rename (XsDeviceIdClass) XsDeviceId;
%rename (XsRangeClass) XsRange;
%rename (XsStringClass) XsString;
%rename (XsPortInfoArrayClass) XsPortInfoArray;
%rename (XsPortInfoClass) XsPortInfo;
%rename (XsGloveData_swapClass) XsGloveData_swap;
%rename (XsFingerData_swapClass) XsFingerData_swap;
%rename (XsSyncSetting_isInputClass) XsSyncSetting_isInput;
%rename (XsSyncSetting_isOutputClass) XsSyncSetting_isOutput;
%rename (XsFilterProfile_emptyClass) XsFilterProfile_empty;
%rename (XsDeviceConfiguration_emptyClass) XsDeviceConfiguration_empty;
%rename (XsDeviceConfiguration_readFromMessageClass) XsDeviceConfigurationreadFromMessage;
%rename (XsDeviceConfiguration_writeToMessageClass) XsDeviceConfigurationwriteToMessage;
%rename (XsSyncSetting_swapClass) XsSyncSetting_swap;
%rename (XsFilterProfile_swapClass) XsFilterProfile_swap;
%rename (XsFilterProfile_toStringClass) XsFilterProfile_toString;


%include "./xsens/public/xspublic/xstypes/xsarray.h"
%include "./xsens/public/xspublic/xstypes/xsquaternion.h"
%include "./xsens/public/xspublic/xstypes/xsanalogindata.h"
%include "./xsens/public/xspublic/xstypes/xsdatapacket.h"
%include "./xsens/public/xspublic/xstypes/xsbaudrate.h"
%include "./xsens/public/xspublic/xstypes/xsbytearray.h"
%include "./xsens/public/xspublic/xstypes/xscalibrateddata.h"
%include "./xsens/public/xspublic/xstypes/xsdataidentifier.h"
%include "./xsens/public/xspublic/xstypes/xseuler.h"
%include "./xsens/public/xspublic/xstypes/xsmatrix.h"
%include "./xsens/public/xspublic/xstypes/xsmessage.h"
%include "./xsens/public/xspublic/xstypes/xsvector.h"
%include "./xsens/public/xspublic/xstypes/xstimestamp.h"
%include "./xsens/public/xspublic/xstypes/xsvector3.h"
%include "./xsens/public/xspublic/xstypes/xsrange.h"
%include "./xsens/public/xspublic/xstypes/xssnapshot.h"
%include "./xsens/public/xspublic/xstypes/xsglovesnapshot.h"
%include "./xsens/public/xspublic/xstypes/xsstring.h"
%include "./xsens/public/xspublic/xstypes/xsrawgnsspvtdata.h"
%include "./xsens/public/xspublic/xstypes/xsportinfoarray.h"
%include "./xsens/public/xspublic/xstypes/xsportinfo.h"
%include "./xsens/public/xspublic/xstypes/xspressure.h"
%include "./xsens/public/xspublic/xstypes/xshandid.h"
%include "./xsens/public/xspublic/xstypes/xssdidata.h"
%include "./xsens/public/xspublic/xstypes/xsscrdata.h"
%include "./xsens/public/xspublic/xstypes/xsresultvalue.h"
%include "./xsens/public/xspublic/xstypes/xsrawgnsssatinfo.h"
%include "./xsens/include/xstypes/xsglovedata.h"
%include "./xsens/public/xspublic/xstypes/xsushortvector.h"
%include "./xsens/public/xspublic/xscontroller/communicator.h"
%include "./xsens/public/xspublic/xscontroller/datalogger.h"
%include  "./xsens/public/xspublic/xstypes/datapacket_p.h"
%include "./xsens/public/xspublic/xscontroller/xsaccesscontrolmode.h"
%include "./xsens/public/xspublic/xscontroller/xsalignmentframe.h"


//template for outputconfigarray to deny warning 401: "nothing known about ..."
%template(XsOutputArray) XsArrayImpl<XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray>;
// continuing

%include "./xsens/public/xspublic/xstypes/xscanoutputconfigurationarray.h"
%include "./xsens/public/xspublic/xstypes/xscanoutputconfiguration.h"
%include "./xsens/include/xstypes/xscandataidentifier.h"
%include "./xsens/public/xspublic/xstypes/xscanframeformat.h"
#define XDA_DLL_API
%include "./xsens/public/xspublic/xscontroller/xsconnectivitystate.h"
#undef XDA_DLL_API
%include "./xsens/public/xspublic/xstypes/xsdeviceidarray.h"
%include "./xsens/public/xspublic/xstypes/xsdeviceoptionflag.h"
%include "./xsens/public/xspublic/xscontroller/xsdeviceparameter.h"
#define XDA_DLL_API
%include "./xsens/public/xspublic/xscontroller/xsdevicestate.h"
#undef XDA_DLL_API
%include "./xsens/public/xspublic/xscontroller/xsdeviceparameteridentifier.h"
%include "./xsens/public/xspublic/xscontroller/xserrormode.h"
%include "./xsens/public/xspublic/xstypes/xsfilepos.h"
%include "./xsens/public/xspublic/xstypes/xsfilterprofilearray.h"
%include "./xsens/public/xspublic/xscontroller/xsgnssplatform.h"
%include "./xsens/public/xspublic/xscontroller/xsiccrepmotionresult.h"
%include "./xsens/public/xspublic/xstypes/xsintarray.h"
%include "./xsens/public/xspublic/xscontroller/xsoperationalmode.h"
%include "./xsens/public/xspublic/xstypes/xsoption.h"
%include "./xsens/public/xspublic/xstypes/xsoutputconfigurationarray.h"
%include "./xsens/public/xspublic/xstypes/xsoutputconfiguration.h"
%include "./xsens/public/xspublic/xscontroller/xsprotocoltype.h"
#define XDA_DLL_API
%include "./xsens/public/xspublic/xscontroller/xsrejectreason.h"
#undef XDA_DLL_API
%include "./xsens/public/xspublic/xstypes/xsresetmethod.h"
%include "./xsens/public/xspublic/xscontroller/xsselftestresult.h"

//template for xsstringoutput to deny warning 401: "nothing known about ..."
%template(XsStringOutputTypeArray) XsArrayImpl<XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray>;

%include "./xsens/public/xspublic/xstypes/xsstringoutputtype.h"
%include "./xsens/public/xspublic/xstypes/xsstringoutputtypearray.h"
%include "./xsens/public/xspublic/xstypes/xssyncrole.h"
%include "./xsens/public/xspublic/xscontroller/iprotocolhandler.h"
%include "./xsens/public/xspublic/xscontroller/messagelocation.h"
%include "./xsens/public/xspublic/xscontroller/openportstage.h"
%include "./xsens/public/xspublic/xscontroller/replyobject.h"
%include "./xsens/public/xspublic/xstypes/xssyncrole.h"
%include "./xsens/public/xspublic/xstypes/xssyncsettingarray.h"

//if included with deffine XDA_DLL_API it doesn t properly create the java proxy classes and all stubs dissapear
#define XDA_DLL_API 
%include "./xsens/public/xspublic/xscontroller/xsdeviceconfiguration.h"
#undef XDA_DLL_API 

//template for xsfilterprofile to deny warning 401: "nothing known about ..."
%template(XsFilterProfileArray) XsArrayImpl<XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray>;
%include "./xsens/public/xspublic/xstypes/xsfilterprofile.h"

//template for xssyncsetting to deny warning 401: "nothing known about ..."
%template(XsSyncSettingArray) XsArrayImpl<XsSyncSetting,g_xsSyncSettingDescriptor,XsSyncSettingArray>;
//continuing

%include "./xsens/public/xspublic/xstypes/xssyncsetting.h"



 


#define XSDEPRECATED
#define XSDEPRECATED_START
%include "./xsens/public/xspublic/xstypes/xsdeviceid.h"


//probably not needed in a practical java application, therefore only imported and class not wrapped
%import "./xsens/public/xspublic/xstypes/xstriggerindicationdata.h"
%import "./xsens/public/xspublic/xstypes/xsxbusmessageid.h"
%import "./xsens/public/xspublic/xstypes/xsversion.h"
%import "./xsens/public/xspublic/xstypes/xstimeinfo.h"




//%ignore operator(==);

#undef XSTYPES_DLL_API 
#undef XSCPPPROTECTED
