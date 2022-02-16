/*minimal wrapper */
%module minimal
#pragma SWIG nowarn=302
#pragma SWIG nowarn=315

%include "xstypes.i"
//%include  "xscontroller/xsscanner.h"

%{
    #include "stub.h"
   
    #include  "xstypes/xsdatapacket.h"
    #include  "xstypes/xsportinfo.h"
    #include  "xscontroller/xsdevice_def.h"


%}
%import  "xscontroller/xscallbackplainc.h"
%import  "xscontroller/xscallback.h"
//%include  "../../xsens/examples/mtsdk/xda_public_cpp/stub.cpp"
%rename(XsDataPacketClass) XsDataPacket;

#define XSNOCOMEXPORT
%rename(opSet) operator=;
%include  "xstypes/xsdatapacket.h"

#undef XSNOCOMEXPORT
%include  "xstypes/xsportinfo.h"
%rename(opEquals) operator==;
%rename(opLessThen) operator<;
#define XSENS_NO_PORT_NUMBERS
%include  "xscontroller/xsdevice_def.h"
#undef XSENS_NO_PORT_NUMBERS
#define XSNOCOMEXPORT
%include  "xscontroller/xscontrol_def.h"
#undef XSNOCOMEXPORT
//struct XsDataPacket{};
%{
#include  "xscontroller/xsscanner.h"
%}
class XsScanner{
  public:
	static inline XsPortInfoArray scanPorts(XsBaudRate baudrate = XBR_Invalid, int singleScanTimeout = 100, bool ignoreNonXsensDevices = true, bool detectRs485 = false);
};



