/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class XsDeviceConfigurationException {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsDeviceConfigurationException(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsDeviceConfigurationException obj) {
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
        minimalJNI.delete_XsDeviceConfigurationException(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsDeviceConfigurationException() {
    this(minimalJNI.new_XsDeviceConfigurationException(), true);
  }

}
