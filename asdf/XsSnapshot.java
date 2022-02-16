/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsSnapshot {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsSnapshot(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsSnapshot obj) {
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
        minimalJNI.delete_XsSnapshot(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_deviceId(XsDeviceIdClass value) {
    minimalJNI.XsSnapshot_m_deviceId_set(swigCPtr, this, XsDeviceIdClass.getCPtr(value), value);
  }

  public XsDeviceIdClass getM_deviceId() {
    long cPtr = minimalJNI.XsSnapshot_m_deviceId_get(swigCPtr, this);
    return (cPtr == 0) ? null : new XsDeviceIdClass(cPtr, false);
  }

  public void setM_frameNumber(long value) {
    minimalJNI.XsSnapshot_m_frameNumber_set(swigCPtr, this, value);
  }

  public long getM_frameNumber() {
    return minimalJNI.XsSnapshot_m_frameNumber_get(swigCPtr, this);
  }

  public void setM_timestamp(java.math.BigInteger value) {
    minimalJNI.XsSnapshot_m_timestamp_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getM_timestamp() {
    return minimalJNI.XsSnapshot_m_timestamp_get(swigCPtr, this);
  }

  public void setM_iQ(SWIGTYPE_p_int value) {
    minimalJNI.XsSnapshot_m_iQ_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getM_iQ() {
    long cPtr = minimalJNI.XsSnapshot_m_iQ_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setM_iV(SWIGTYPE_p_long_long value) {
    minimalJNI.XsSnapshot_m_iV_set(swigCPtr, this, SWIGTYPE_p_long_long.getCPtr(value));
  }

  public SWIGTYPE_p_long_long getM_iV() {
    long cPtr = minimalJNI.XsSnapshot_m_iV_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_long_long(cPtr, false);
  }

  public void setM_mag(SWIGTYPE_p_int value) {
    minimalJNI.XsSnapshot_m_mag_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getM_mag() {
    long cPtr = minimalJNI.XsSnapshot_m_mag_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setM_baro(int value) {
    minimalJNI.XsSnapshot_m_baro_set(swigCPtr, this, value);
  }

  public int getM_baro() {
    return minimalJNI.XsSnapshot_m_baro_get(swigCPtr, this);
  }

  public void setM_status(int value) {
    minimalJNI.XsSnapshot_m_status_set(swigCPtr, this, value);
  }

  public int getM_status() {
    return minimalJNI.XsSnapshot_m_status_get(swigCPtr, this);
  }

  public void setM_accClippingCounter(short value) {
    minimalJNI.XsSnapshot_m_accClippingCounter_set(swigCPtr, this, value);
  }

  public short getM_accClippingCounter() {
    return minimalJNI.XsSnapshot_m_accClippingCounter_get(swigCPtr, this);
  }

  public void setM_gyrClippingCounter(short value) {
    minimalJNI.XsSnapshot_m_gyrClippingCounter_set(swigCPtr, this, value);
  }

  public short getM_gyrClippingCounter() {
    return minimalJNI.XsSnapshot_m_gyrClippingCounter_get(swigCPtr, this);
  }

  public void setM_type(SnapshotType value) {
    minimalJNI.XsSnapshot_m_type_set(swigCPtr, this, value.swigValue());
  }

  public SnapshotType getM_type() {
    return SnapshotType.swigToEnum(minimalJNI.XsSnapshot_m_type_get(swigCPtr, this));
  }

  public boolean opEquals(XsSnapshot other) {
    return minimalJNI.XsSnapshot_opEquals(swigCPtr, this, XsSnapshot.getCPtr(other), other);
  }

  public XsSnapshot() {
    this(minimalJNI.new_XsSnapshot(), true);
  }

}