%module array_variations

%{
#include  "xstypes/xsarray.h"
#include  "xstypes/xsportinfoarray.h"
#include  "xstypes/xsoutputconfigurationarray.h"
#include  "xscontroller/xsdeviceptrarray.h"
#include  "xstypes/xsfilterprofilearray.h"
#include  "xstypes/xsdeviceidarray.h"
#include  "xstypes/xssyncsettingarray.h"
#include  "xstypes/xsstringoutputtypearray.h"
#include  "xstypes/xscanoutputconfigurationarray.h"
%}

%rename (XsPortInfoArrayClass) XsPortInfoArray;


%include  "xstypes/xsarray.h"


//-----------------
//PortInfoArray


//ignoring overloaded methods
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::begin();
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::end();
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::rbegin();
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::rend();
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::operator [](int);
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::at(XsSize);
%ignore XsArrayImpl< XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray >::inherited();
%template (XsPortInfoArray) XsArrayImpl<XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray>;
%include  "xstypes/xsportinfoarray.h"



//-----------------------------
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::begin();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::end();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::rbegin();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::rend();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::operator [](int);
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::at(XsSize);
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::inherited();


%template (XsOutputConfigurationArray) XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >;
%include  "xstypes/xsoutputconfigurationarray.h"




#define XDA_DLL_API

%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::begin();
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::end();
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::rbegin();
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::rend();
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::operator [](int);
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::at(XsSize);
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::inherited();

%template (XsDevicePtrArray) XsArrayImpl< XsDevicePtr,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >;
%include  "xscontroller/xsdeviceptrarray.h"
#undef XDA_DLL_API


%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::begin();
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::end();
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::rbegin();
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::rend();
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::operator [](int);
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::at(XsSize);
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::inherited();

%template (XsFilterProfileArray) XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >;
%include  "xstypes/xsfilterprofilearray.h"


%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::begin();
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::end();
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::rbegin();
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::rend();
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::operator [](int);
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray  >::at(XsSize);
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::inherited();

%template (XsDeviceIdArray) XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >;
%include  "xstypes/xsdeviceidarray.h"

%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::begin();
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::end();
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::rbegin();
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::rend();
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::operator [](int);
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::at(XsSize);
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::inherited();

%template (XsSyncSettingArray) XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >;
%include  "xstypes/xssyncsettingarray.h"


%ignore  XsArrayImpl< XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray >::begin();
%ignore XsArrayImpl< XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray >::end();
%ignore XsArrayImpl< XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray >::rbegin();
%ignore XsArrayImpl< XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray >::rend();
%ignore XsArrayImpl< XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray >::operator [](int);
%ignore XsArrayImpl< XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray >::at(XsSize);
%ignore XsArrayImpl< XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray >::inherited() ;

%template (XsStringOutputTypeArray) XsArrayImpl< XsStringOutputType,g_xsStringOutputTypeArrayDescriptor,XsStringOutputTypeArray >;
%include  "xstypes/xsstringoutputtypearray.h"

// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::begin();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::end();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::rbegin();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::rend();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::operator [](int);
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::at(XsSize);
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::inherited();

// %template (XsSCanOutputConfigurationArray) XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >;
// %include  "xstypes/xscanoutputconfigurationarray.h"