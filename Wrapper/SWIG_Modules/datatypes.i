%module math_structures


%{
#include "../../xsens/public/xspublic/xstypes/xsquaternion.h"
#include "../../xsens/public/xspublic/xstypes/xseuler.h"
#include "../../xsens/public/xspublic/xstypes/xsmatrix.h"
#include "../../xsens/public/xspublic/xstypes/xsvector.h"
#include "../../xsens/public/xspublic/xstypes/xsvector3.h"
#include "../../xsens/public/xspublic/xstypes/xsushortvector.h"
#include "../../xsens/public/xspublic/xstypes/xsmessage.h"
#include "../../xsens/public/xspublic/xstypes/xsstring.h"
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
%include "../../xsens/public/xspublic/xstypes/xsquaternion.h"


//--------------
//Euler
%ignore XsEuler::operator[](XsSize);
%include "../../xsens/public/xspublic/xstypes/xseuler.h"


//--------------
//Matrixes
%ignore XsMatrix::operator[](XsSize);
%include "../../xsens/public/xspublic/xstypes/xsmatrix.h"

//--------------
//Vector
%ignore XsVector::at(XsSize);
%ignore XsVector::operator[](XsSize);
%include "../../xsens/public/xspublic/xstypes/xsvector.h"

//--------------
//vector 3
%include "../../xsens/public/xspublic/xstypes/xsvector3.h"

//--------------
//xsshortvector
%ignore XsUShortVector::operator[](XsSize);
%include "../../xsens/public/xspublic/xstypes/xsushortvector.h"

//--------------
//messages
%include "../../xsens/public/xspublic/xstypes/xsmessage.h"

//--------------
//Strings
%ignore XsString::c_str();
%include "../../xsens/public/xspublic/xstypes/xsstring.h"

