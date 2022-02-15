/*minimal wrapper */
%module minimal
#pragma SWIG nowarn=302
#pragma SWIG nowarn=315

%include "xstypes.i"
//%include "../../xsens/xsens_ros_mti_driver/lib/xspublic/xscontroller/xsscanner.h"
#define XDA_DLL_API
%{
    #include "stub.h"
   
    #include "../../xsens/xsens_ros_mti_driver/lib/xspublic/xstypes/xsdatapacket.h"
    #include "../../xsens/xsens_ros_mti_driver/lib/xspublic/xstypes/xsportinfo.h"
    #include "../../xsens/xsens_ros_mti_driver/lib/xspublic/xscontroller/xsdevice_def.h"


%}
%import "../../xsens/public/xspublic/xscontroller/xscallbackplainc.h"
%import "../../xsens/public/xspublic/xscontroller/xscallback.h"
%include  "../../xsens/examples/mtsdk/xda_public_cpp/stub.cpp"
%rename(XsDataPacketClass) XsDataPacket;
#define XSTYPES_DLL_API
#define XSNOCOMEXPORT
%rename(opSet) operator=;
%include "../../xsens/public/xspublic/xstypes/xsdatapacket.h"
#undef XSTYPES_DLL_API
#undef XSNOCOMEXPORT
%include "../../xsens/public/xspublic/xstypes/xsportinfo.h"
%rename(opEquals) operator==;
%rename(opLessThen) operator<;
#define XSENS_NO_PORT_NUMBERS
%include "../../xsens/public/xspublic/xscontroller/xsdevice_def.h"
#undef XSENS_NO_PORT_NUMBERS
#define XSNOCOMEXPORT
%include "../../xsens/public/xspublic/xscontroller/xscontrol_def.h"
#undef XSNOCOMEXPORT
//struct XsDataPacket{};
%{
#include "../../xsens/public/xspublic/xscontroller/xsscanner.h"
%}
class XsScanner{
  public:
	static inline XsPortInfoArray scanPorts(XsBaudRate baudrate = XBR_Invalid, int singleScanTimeout = 100, bool ignoreNonXsensDevices = true, bool detectRs485 = false);
};



