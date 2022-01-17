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

// typedef double		std_double;

%rename (XsQuaternionClass) XsQuaternion;
%rename (XsAnalogInDataClass) XsAnalogInData;
%rename (XsDataPacketClass) XsDataPacket;
%rename (XsBaudrateClass) XsBaudrate;
// %rename (XsByteArrayClass) XsByteArray;
// %rename (XsCalibratedDataClass) XsCalibratedData;
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

%rename(opSet) operator=;
%rename(opSelfMultiplication) operator*=;
%rename(opEquals) operator==;
%rename(opSubtract) operator-;
%rename(opMult) operator*;
%rename(opSquareBracket) operator[];
%rename(opAnd) operator&;
%rename(opOr) operator|;
%rename(opNot) operator~;
%rename(opUnequals) operator!=;
%rename(opPlus) operator+;
%rename(opSubtractEquals) operator-=;
%rename(opPlusEquals) operator +=;
%rename(opLessThen) operator<;
%rename(opLessEquals) operator<=;
%rename(opGreaterThen) operator>;
%rename(opGreaterEquals) operator>=;
%rename(opIncrement) operator++;
%rename(opDecrement) operator--;
%rename(opLeftShift) operator <<;
%rename(opRoundBrackets) operator();
%rename(opXOr) operator^;

// typedef XsArrayImpl<T, D, I> ArrayImpl;
%include "../xsens/public/xspublic/xstypes/xsarray.h"

%ignore XsQuaternion::w();
%ignore XsQuaternion::operator[](XsSize);
%ignore XsQuaternion::x();
%ignore XsQuaternion::y();
%ignore XsQuaternion::z();
%include "../xsens/public/xspublic/xstypes/xsquaternion.h"
%include "../xsens/public/xspublic/xstypes/xsanalogindata.h"
%include "../xsens/public/xspublic/xstypes/xsdatapacket.h"
%include "../xsens/public/xspublic/xstypes/xsbaudrate.h"

//%template(XsByteArray) XsArrayImpl<uint8_t,g_xsByteArrayDescriptor,XsByteArray>;
//%include "../xsens/public/xspublic/xstypes/xsbytearray.h"
%include "../xsens/public/xspublic/xstypes/xscalibrateddata.h"
%include "../xsens/public/xspublic/xstypes/xsdataidentifier.h"

%ignore XsEuler::operator[](XsSize);

%include "../xsens/public/xspublic/xstypes/xseuler.h"

%ignore XsMatrix::operator[](XsSize);

%include "../xsens/public/xspublic/xstypes/xsmatrix.h"
%include "../xsens/public/xspublic/xstypes/xsmessage.h"

%ignore XsVector::at(XsSize);
%ignore XsVector::operator[](XsSize);

%include "../xsens/public/xspublic/xstypes/xsvector.h"
%include "../xsens/public/xspublic/xstypes/xstimestamp.h"
%include "../xsens/public/xspublic/xstypes/xsvector3.h"
%include "../xsens/public/xspublic/xstypes/xsrange.h"
%include "../xsens/public/xspublic/xstypes/xssnapshot.h"
%include "../xsens/public/xspublic/xstypes/xsglovesnapshot.h"


%ignore XsString::c_str();

%include "../xsens/public/xspublic/xstypes/xsstring.h"
%include "../xsens/public/xspublic/xstypes/xsrawgnsspvtdata.h"

//-----------------
//ignoring overloaded methods
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::begin();
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::end();
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::rbegin();
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::rend();
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::operator [](int);
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::at(XsSize);
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::inherited();
%template (XsPortInfoArray) XsArrayImpl<XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray>;
%include "../xsens/public/xspublic/xstypes/xsportinfoarray.h"

//-----------------

%include "../xsens/public/xspublic/xstypes/xsportinfo.h"
%include "../xsens/public/xspublic/xstypes/xspressure.h"
%include "../xsens/public/xspublic/xstypes/xshandid.h"
%include "../xsens/public/xspublic/xstypes/xssdidata.h"
%include "../xsens/public/xspublic/xstypes/xsscrdata.h"
%include "../xsens/public/xspublic/xstypes/xsresultvalue.h"
%include "../xsens/public/xspublic/xstypes/xsrawgnsssatinfo.h"
%include "../xsens/include/xstypes/xsglovedata.h"

%ignore XsUShortVector::operator[](XsSize);

%include "../xsens/public/xspublic/xstypes/xsushortvector.h"
%import "../xsens/public/xspublic/xscontroller/xscallbackplainc.h"
%import "../xsens/public/xspublic/xscontroller/xscallback.h"
%include "../xsens/public/xspublic/xscontroller/callbackmanagerxda.h"
%include "../xsens/public/xspublic/xscontroller/communicator.h"
%include "../xsens/public/xspublic/xscontroller/datalogger.h"
// %include  "../xsens/public/xspublic/xstypes/datapacket_p.h"
%include "../xsens/public/xspublic/xscontroller/xsaccesscontrolmode.h"
%include "../xsens/public/xspublic/xscontroller/xsalignmentframe.h"

//-------------------
// //template for outputconfigarray to deny warning 401: "nothing known about ..."
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::begin();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::end();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::rbegin();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::rend();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::operator [](int);
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::at(XsSize);
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::inherited();

// %template(XsCanOutputArray) XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >;
// %include "../xsens/public/xspublic/xstypes/xscanoutputconfigurationarray.h"

//-------------------


%include "../xsens/public/xspublic/xstypes/xscanoutputconfiguration.h"
%include "../xsens/include/xstypes/xscandataidentifier.h"
%include "../xsens/public/xspublic/xstypes/xscanframeformat.h"
#define XDA_DLL_API
%include "../xsens/public/xspublic/xscontroller/xsconnectivitystate.h"
#undef XDA_DLL_API
// %include "../xsens/public/xspublic/xstypes/xsdeviceidarray.h"
%include "../xsens/public/xspublic/xstypes/xsdeviceoptionflag.h"
%include "../xsens/public/xspublic/xscontroller/xsdeviceparameter.h"
#define XDA_DLL_API
%include "../xsens/public/xspublic/xscontroller/xsdevicestate.h"
#undef XDA_DLL_API
%include "../xsens/public/xspublic/xscontroller/xsdeviceparameteridentifier.h"
%include "../xsens/public/xspublic/xscontroller/xserrormode.h"
%include "../xsens/public/xspublic/xstypes/xsfilepos.h"
// %include "../xsens/public/xspublic/xstypes/xsfilterprofilearray.h"
%include "../xsens/public/xspublic/xscontroller/xsgnssplatform.h"
%include "../xsens/public/xspublic/xscontroller/xsiccrepmotionresult.h"
// %include "../xsens/public/xspublic/xstypes/xsintarray.h"
%include "../xsens/public/xspublic/xscontroller/xsoperationalmode.h"
%include "../xsens/public/xspublic/xstypes/xsoption.h"

%include "../xsens/public/xspublic/xstypes/xsoutputconfiguration.h"
//-----------------------------
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::begin();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::end();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::rbegin();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::rend();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::operator [](int);
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::at(XsSize);
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::inherited();


%template (XsOutputConfigurationArray) XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >;
%include "../xsens/public/xspublic/xstypes/xsoutputconfigurationarray.h"

//-----------------------------

%include "../xsens/public/xspublic/xscontroller/xsprotocoltype.h"
#define XDA_DLL_API
%include "../xsens/public/xspublic/xscontroller/xsrejectreason.h"
#undef XDA_DLL_API
%include "../xsens/public/xspublic/xstypes/xsresetmethod.h"
%include "../xsens/public/xspublic/xscontroller/xsselftestresult.h"

// //template for xsstringoutput to deny warning 401: "nothing known about ..."
// %template(XsStringOutputTypeArray) XsArrayImpl<XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray>;

%include "../xsens/public/xspublic/xstypes/xsstringoutputtype.h"
// %include "../xsens/public/xspublic/xstypes/xsstringoutputtypearray.h"
%include "../xsens/public/xspublic/xstypes/xssyncrole.h"
%include "../xsens/public/xspublic/xscontroller/iprotocolhandler.h"
%include "../xsens/public/xspublic/xscontroller/messagelocation.h"
%include "../xsens/public/xspublic/xscontroller/openportstage.h"
%include "../xsens/public/xspublic/xscontroller/replyobject.h"
%include "../xsens/public/xspublic/xstypes/xssyncrole.h"
// %include "../xsens/public/xspublic/xstypes/xssyncsettingarray.h"

// //if included with deffine XDA_DLL_API it doesn t properly create the java proxy classes and all stubs dissapear
// #define XDA_DLL_API 
// %include "../xsens/public/xspublic/xscontroller/xsdeviceconfiguration.h"
// #undef XDA_DLL_API 

// //template for xsfilterprofile to deny warning 401: "nothing known about ..."
// %template(XsFilterProfileArray) XsArrayImpl<XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray>;
// %include "../xsens/public/xspublic/xstypes/xsfilterprofile.h"

// //template for xssyncsetting to deny warning 401: "nothing known about ..."
// %template(XsSyncSettingArray) XsArrayImpl<XsSyncSetting,g_xsSyncSettingDescriptor,XsSyncSettingArray>;
// //continuing

// %include "../xsens/public/xspublic/xstypes/xssyncsetting.h"



 


#define XSDEPRECATED
#define XSDEPRECATED_START
%include "../xsens/public/xspublic/xstypes/xsdeviceid.h"


//probably not needed in a practical java application, therefore only imported and class not wrapped
%import "../xsens/public/xspublic/xstypes/xstriggerindicationdata.h"
%import "../xsens/public/xspublic/xstypes/xsxbusmessageid.h"
%import "../xsens/public/xspublic/xstypes/xsversion.h"
%import "../xsens/public/xspublic/xstypes/xstimeinfo.h"




// //%ignore operator(==);

#undef XSTYPES_DLL_API 
#undef XSCPPPROTECTED
