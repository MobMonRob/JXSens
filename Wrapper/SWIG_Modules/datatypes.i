%module math_structures


%{
#include  "xstypes/xsquaternion.h"
#include  "xstypes/xseuler.h"
#include  "xstypes/xsmatrix.h"
#include  "xstypes/xsvector.h"
#include  "xstypes/xsvector3.h"
#include  "xstypes/xsushortvector.h"
#include  "xstypes/xsmessage.h"
#include  "xstypes/xsstring.h"
#include  "xstypes/xsdatapacket.h"
%}
%rename (XsQuaternionClass) XsQuaternion;
%rename (XsDataPacketClass) XsDataPacket;
%rename (XsBaudrateClass) XsBaudrate;
%rename (XsEulerClass) XsEuler;
%rename (XsMatrixClass) XsMatrix;
%rename (XsMessageClass) XsMessage;
%rename (XsVectorClass) XsVector;
%rename (XsStringClass) XsString;

//---------------
//Quaternions
%ignore XsQuaternion::w();
%ignore XsQuaternion::operator[](XsSize);
%ignore XsQuaternion::x();
%ignore XsQuaternion::y();
%ignore XsQuaternion::z();
%include  "xstypes/xsquaternion.h"


//--------------
//Euler
%ignore XsEuler::operator[](XsSize);
%include  "xstypes/xseuler.h"


//--------------
//Matrixes
%ignore XsMatrix::operator[](XsSize);
%include  "xstypes/xsmatrix.h"

//--------------
//Vector
%ignore XsVector::at(XsSize);
%ignore XsVector::operator[](XsSize);
%include  "xstypes/xsvector.h"

//--------------
//vector 3
%include  "xstypes/xsvector3.h"

//--------------
//xsshortvector
%ignore XsUShortVector::operator[](XsSize);
%include  "xstypes/xsushortvector.h"

//--------------
//messages
%include  "xstypes/xsmessage.h"

//--------------
//Strings
%ignore XsString::c_str();
%include  "xstypes/xsstring.h"

//-------------
//datapacket
%include  "xstypes/xsdatapacket.h"

