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


//-------------------
//
//CanOutPutConfigurationsArray
//
//
//
// //template for outputconfigarray to deny warning 401: "nothing known about ..."
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::begin();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::end();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::rbegin();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::rend();
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::operator [](int);
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::at(XsSize);
// %ignore XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >::inherited();

// %template(XsCanOutputArray) XsArrayImpl< XsCanOutputConfiguration,g_xsCanOutputConfigurationArrayDescriptor,XsCanOutputConfigurationArray >;
// %include "../../xsens/public/xspublic/xstypes/xscanoutputconfigurationarray.h"