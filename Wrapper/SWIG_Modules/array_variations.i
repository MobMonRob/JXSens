%module array_variations

%rename (XsPortInfoArrayClass) XsPortInfoArray;


%include "../../xsens/public/xspublic/xstypes/xsarray.h"


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
%include "../../xsens/public/xspublic/xstypes/xsportinfoarray.h"



//-----------------------------
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::begin();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::end();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::rbegin();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::rend();
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::operator [](int);
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::at(XsSize);
%ignore XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >::inherited();


%template (XsOutputConfigurationArray) XsArrayImpl< XsOutputConfiguration,g_xsOutputConfigurationArrayDescriptor,XsOutputConfigurationArray >;
%include "../../xsens/public/xspublic/xstypes/xsoutputconfigurationarray.h"




#define XDA_DLL_API

%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::begin();
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::end();
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::rbegin();
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::rend();
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::operator [](int);
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::at(XsSize);
%ignore XsArrayImpl< XsDevice *,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >::inherited();

%template (XsDevicePtrArray) XsArrayImpl< XsDevicePtr,g_xsDevicePtrArrayDescriptor,XsDevicePtrArray >;
%include "../../xsens/public/xspublic/xscontroller/xsdeviceptrarray.h"
#undef XDA_DLL_API


%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::begin();
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::end();
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::rbegin();
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::rend();
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::operator [](int);
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::at(XsSize);
%ignore XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >::inherited();
%template (XsFilterProfileArray) XsArrayImpl< XsFilterProfile,g_xsFilterProfileArrayDescriptor,XsFilterProfileArray >;
%include "../../xsens/public/xspublic/xstypes/xsfilterprofilearray.h"


%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::begin();
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::end();
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::rbegin();
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::rend();
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::operator [](int);
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray  >::at(XsSize);
%ignore XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >::inherited();
%template (XsDeviceIdArray) XsArrayImpl< XsDeviceId,g_xsDeviceIdArrayDescriptor,XsDeviceIdArray >;
%include "../../xsens/public/xspublic/xstypes/xsdeviceidarray.h"

%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::begin();
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::end();
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::rbegin();
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::rend();
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::operator [](int);
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::at(XsSize);
%ignore XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >::inherited();
%template (XsSyncSettingArray) XsArrayImpl< XsSyncSetting,g_xsSyncSettingArrayDescriptor,XsSyncSettingArray >;
%include "../../xsens/public/xspublic/xstypes/xssyncsettingarray.h"