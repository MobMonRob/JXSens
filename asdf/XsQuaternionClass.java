/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsQuaternionClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsQuaternionClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsQuaternionClass obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        minimalJNI.delete_XsQuaternionClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsQuaternionClass(SWIGTYPE_p_XsReal w_, SWIGTYPE_p_XsReal x_, SWIGTYPE_p_XsReal y_, SWIGTYPE_p_XsReal z_) {
    this(minimalJNI.new_XsQuaternionClass__SWIG_0(SWIGTYPE_p_XsReal.getCPtr(w_), SWIGTYPE_p_XsReal.getCPtr(x_), SWIGTYPE_p_XsReal.getCPtr(y_), SWIGTYPE_p_XsReal.getCPtr(z_)), true);
  }

  public XsQuaternionClass(SWIGTYPE_p_XsReal w_, SWIGTYPE_p_XsReal x_, SWIGTYPE_p_XsReal y_) {
    this(minimalJNI.new_XsQuaternionClass__SWIG_1(SWIGTYPE_p_XsReal.getCPtr(w_), SWIGTYPE_p_XsReal.getCPtr(x_), SWIGTYPE_p_XsReal.getCPtr(y_)), true);
  }

  public XsQuaternionClass(SWIGTYPE_p_XsReal w_, SWIGTYPE_p_XsReal x_) {
    this(minimalJNI.new_XsQuaternionClass__SWIG_2(SWIGTYPE_p_XsReal.getCPtr(w_), SWIGTYPE_p_XsReal.getCPtr(x_)), true);
  }

  public XsQuaternionClass(SWIGTYPE_p_XsReal w_) {
    this(minimalJNI.new_XsQuaternionClass__SWIG_3(SWIGTYPE_p_XsReal.getCPtr(w_)), true);
  }

  public XsQuaternionClass() {
    this(minimalJNI.new_XsQuaternionClass__SWIG_4(), true);
  }

  public XsQuaternionClass(SWIGTYPE_p_XsReal w_, SWIGTYPE_p_XsReal x_, SWIGTYPE_p_XsReal y_, SWIGTYPE_p_XsReal z_, boolean normalize_) {
    this(minimalJNI.new_XsQuaternionClass__SWIG_5(SWIGTYPE_p_XsReal.getCPtr(w_), SWIGTYPE_p_XsReal.getCPtr(x_), SWIGTYPE_p_XsReal.getCPtr(y_), SWIGTYPE_p_XsReal.getCPtr(z_), normalize_), true);
  }

  public XsQuaternionClass(XsQuaternionClass other) {
    this(minimalJNI.new_XsQuaternionClass__SWIG_6(XsQuaternionClass.getCPtr(other), other), true);
  }

  public XsQuaternionClass(XsEulerClass euler) {
    this(minimalJNI.new_XsQuaternionClass__SWIG_7(XsEulerClass.getCPtr(euler), euler), true);
  }

  public XsQuaternionClass(XsMatrixClass ori) {
    this(minimalJNI.new_XsQuaternionClass__SWIG_8(XsMatrixClass.getCPtr(ori), ori), true);
  }

  public XsQuaternionClass opSet(XsQuaternionClass other) {
    return new XsQuaternionClass(minimalJNI.XsQuaternionClass_opSet(swigCPtr, this, XsQuaternionClass.getCPtr(other), other), false);
  }

  public void assign(SWIGTYPE_p_XsReal w_, SWIGTYPE_p_XsReal x_, SWIGTYPE_p_XsReal y_, SWIGTYPE_p_XsReal z_) {
    minimalJNI.XsQuaternionClass_assign__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsReal.getCPtr(w_), SWIGTYPE_p_XsReal.getCPtr(x_), SWIGTYPE_p_XsReal.getCPtr(y_), SWIGTYPE_p_XsReal.getCPtr(z_));
  }

  public void assign(SWIGTYPE_p_XsReal values) {
    minimalJNI.XsQuaternionClass_assign__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsReal.getCPtr(values));
  }

  public SWIGTYPE_p_XsReal opSquareBracket(SWIGTYPE_p_XsSize index) {
    return new SWIGTYPE_p_XsReal(minimalJNI.XsQuaternionClass_opSquareBracket(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index)), true);
  }

  public SWIGTYPE_p_XsReal data() {
    long cPtr = minimalJNI.XsQuaternionClass_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_XsReal(cPtr, false);
  }

  public XsQuaternionClass inverse() {
    return new XsQuaternionClass(minimalJNI.XsQuaternionClass_inverse(swigCPtr, this), true);
  }

  public XsQuaternionClass conjugate() {
    return new XsQuaternionClass(minimalJNI.XsQuaternionClass_conjugate(swigCPtr, this), true);
  }

  public XsQuaternionClass normalized() {
    return new XsQuaternionClass(minimalJNI.XsQuaternionClass_normalized(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsReal normalize() {
    return new SWIGTYPE_p_XsReal(minimalJNI.XsQuaternionClass_normalize(swigCPtr, this), true);
  }

  public boolean empty() {
    return minimalJNI.XsQuaternionClass_empty(swigCPtr, this);
  }

  public XsQuaternionClass fromEulerAngles(XsEulerClass src) {
    return new XsQuaternionClass(minimalJNI.XsQuaternionClass_fromEulerAngles(swigCPtr, this, XsEulerClass.getCPtr(src), src), false);
  }

  public XsQuaternionClass fromRotationMatrix(XsMatrixClass ori) {
    return new XsQuaternionClass(minimalJNI.XsQuaternionClass_fromRotationMatrix(swigCPtr, this, XsMatrixClass.getCPtr(ori), ori), false);
  }

  public static XsQuaternionClass identity() {
    return new XsQuaternionClass(minimalJNI.XsQuaternionClass_identity(), false);
  }

  public void opSelfMultiplication(XsQuaternionClass other) {
    minimalJNI.XsQuaternionClass_opSelfMultiplication(swigCPtr, this, XsQuaternionClass.getCPtr(other), other);
  }

  public void multiply(XsQuaternionClass a, XsQuaternionClass b) {
    minimalJNI.XsQuaternionClass_multiply(swigCPtr, this, XsQuaternionClass.getCPtr(a), a, XsQuaternionClass.getCPtr(b), b);
  }

  public SWIGTYPE_p_XsReal w() {
    return new SWIGTYPE_p_XsReal(minimalJNI.XsQuaternionClass_w(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsReal x() {
    return new SWIGTYPE_p_XsReal(minimalJNI.XsQuaternionClass_x(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsReal y() {
    return new SWIGTYPE_p_XsReal(minimalJNI.XsQuaternionClass_y(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsReal z() {
    return new SWIGTYPE_p_XsReal(minimalJNI.XsQuaternionClass_z(swigCPtr, this), true);
  }

  public void swap(XsQuaternionClass other) {
    minimalJNI.XsQuaternionClass_swap(swigCPtr, this, XsQuaternionClass.getCPtr(other), other);
  }

  public boolean opEquals(XsQuaternionClass other) {
    return minimalJNI.XsQuaternionClass_opEquals(swigCPtr, this, XsQuaternionClass.getCPtr(other), other);
  }

  public boolean isEqual(XsQuaternionClass other, SWIGTYPE_p_XsReal tolerance) {
    return minimalJNI.XsQuaternionClass_isEqual(swigCPtr, this, XsQuaternionClass.getCPtr(other), other, SWIGTYPE_p_XsReal.getCPtr(tolerance));
  }

  public SWIGTYPE_p_XsReal dotProduct(XsQuaternionClass other) {
    return new SWIGTYPE_p_XsReal(minimalJNI.XsQuaternionClass_dotProduct(swigCPtr, this, XsQuaternionClass.getCPtr(other), other), true);
  }

}