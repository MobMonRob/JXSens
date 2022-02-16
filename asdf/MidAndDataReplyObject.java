/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class MidAndDataReplyObject extends ReplyObject {
  private transient long swigCPtr;

  protected MidAndDataReplyObject(long cPtr, boolean cMemoryOwn) {
    super(minimalJNI.MidAndDataReplyObject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MidAndDataReplyObject obj) {
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
        minimalJNI.delete_MidAndDataReplyObject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MidAndDataReplyObject(short messageId, SWIGTYPE_p_XsSize offset, SWIGTYPE_p_XsSize size, SWIGTYPE_p_unsigned_char data) {
    this(minimalJNI.new_MidAndDataReplyObject(messageId, SWIGTYPE_p_XsSize.getCPtr(offset), SWIGTYPE_p_XsSize.getCPtr(size), SWIGTYPE_p_unsigned_char.getCPtr(data)), true);
  }

  public void setData(SWIGTYPE_p_unsigned_char data) {
    minimalJNI.MidAndDataReplyObject_setData(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data));
  }

  public boolean isReplyFor(XsMessageClass message) {
    return minimalJNI.MidAndDataReplyObject_isReplyFor(swigCPtr, this, XsMessageClass.getCPtr(message), message);
  }

  public short msgId() {
    return minimalJNI.MidAndDataReplyObject_msgId(swigCPtr, this);
  }

}
