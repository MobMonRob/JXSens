/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsStringClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsStringClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsStringClass obj) {
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
        minimalJNI.delete_XsStringClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsStringClass(SWIGTYPE_p_XsSize sz, String src) {
    this(minimalJNI.new_XsStringClass__SWIG_0(SWIGTYPE_p_XsSize.getCPtr(sz), src), true);
  }

  public XsStringClass(SWIGTYPE_p_XsSize sz) {
    this(minimalJNI.new_XsStringClass__SWIG_1(SWIGTYPE_p_XsSize.getCPtr(sz)), true);
  }

  public XsStringClass() {
    this(minimalJNI.new_XsStringClass__SWIG_2(), true);
  }

  public XsStringClass(XsStringClass other) {
    this(minimalJNI.new_XsStringClass__SWIG_3(XsStringClass.getCPtr(other), other), true);
  }

  public XsStringClass(String ref, SWIGTYPE_p_XsSize sz, SWIGTYPE_p_XsDataFlags flags) {
    this(minimalJNI.new_XsStringClass__SWIG_4(ref, SWIGTYPE_p_XsSize.getCPtr(sz), SWIGTYPE_p_XsDataFlags.getCPtr(flags)), true);
  }

  public XsStringClass(String src) {
    this(minimalJNI.new_XsStringClass__SWIG_6(src), true);
  }

  public XsStringClass(SWIGTYPE_p_wchar_t src) {
    this(minimalJNI.new_XsStringClass__SWIG_7(SWIGTYPE_p_wchar_t.getCPtr(src)), true);
  }

  public XsStringClass(SWIGTYPE_p_std__string src) {
    this(minimalJNI.new_XsStringClass__SWIG_8(SWIGTYPE_p_std__string.getCPtr(src)), true);
  }

  public XsStringClass(SWIGTYPE_p_std__wstring src) {
    this(minimalJNI.new_XsStringClass__SWIG_9(SWIGTYPE_p_std__wstring.getCPtr(src)), true);
  }

  public String c_str() {
    return minimalJNI.XsStringClass_c_str(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string toStdString() {
    return new SWIGTYPE_p_std__string(minimalJNI.XsStringClass_toStdString(swigCPtr, this), true);
  }

  public XsStringClass opPlus(XsStringClass other) {
    return new XsStringClass(minimalJNI.XsStringClass_opPlus(swigCPtr, this, XsStringClass.getCPtr(other), other), true);
  }

  public SWIGTYPE_p_std__wstring toStdWString() {
    return new SWIGTYPE_p_std__wstring(minimalJNI.XsStringClass_toStdWString(swigCPtr, this), true);
  }

  public boolean opEquals(String str) {
    return minimalJNI.XsStringClass_opEquals__SWIG_1(swigCPtr, this, str);
  }

  public boolean opEquals(XsStringClass str) {
    return minimalJNI.XsStringClass_opEquals__SWIG_2(swigCPtr, this, XsStringClass.getCPtr(str), str);
  }

  public boolean opUnequals(String str) {
    return minimalJNI.XsStringClass_opUnequals__SWIG_1(swigCPtr, this, str);
  }

  public boolean opUnequals(XsStringClass str) {
    return minimalJNI.XsStringClass_opUnequals__SWIG_2(swigCPtr, this, XsStringClass.getCPtr(str), str);
  }

  public XsStringClass opLeftShift(String str) {
    return new XsStringClass(minimalJNI.XsStringClass_opLeftShift__SWIG_1(swigCPtr, this, str), false);
  }

  public XsStringClass opLeftShift(int i) {
    return new XsStringClass(minimalJNI.XsStringClass_opLeftShift__SWIG_2(swigCPtr, this, i), false);
  }

  public XsStringClass opLeftShift(XsStringClass s) {
    return new XsStringClass(minimalJNI.XsStringClass_opLeftShift__SWIG_3(swigCPtr, this, XsStringClass.getCPtr(s), s), false);
  }

  public boolean opLessThen(XsStringClass str) {
    return minimalJNI.XsStringClass_opLessThen(swigCPtr, this, XsStringClass.getCPtr(str), str);
  }

  public boolean opGreaterThen(XsStringClass str) {
    return minimalJNI.XsStringClass_opGreaterThen(swigCPtr, this, XsStringClass.getCPtr(str), str);
  }

  public XsStringClass push_back(char c) {
    return new XsStringClass(minimalJNI.XsStringClass_push_back__SWIG_0(swigCPtr, this, c), false);
  }

  public boolean empty() {
    return minimalJNI.XsStringClass_empty(swigCPtr, this);
  }

  public void append(XsStringClass other) {
    minimalJNI.XsStringClass_append__SWIG_0(swigCPtr, this, XsStringClass.getCPtr(other), other);
  }

  public void append(String other) {
    minimalJNI.XsStringClass_append__SWIG_1(swigCPtr, this, other);
  }

  public void append(SWIGTYPE_p_wchar_t other) {
    minimalJNI.XsStringClass_append__SWIG_2(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(other));
  }

  public SWIGTYPE_p_XsSize utf8Len() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsStringClass_utf8Len(swigCPtr, this), true);
  }

  public boolean endsWith(XsStringClass other, boolean caseSensitive) {
    return minimalJNI.XsStringClass_endsWith__SWIG_0(swigCPtr, this, XsStringClass.getCPtr(other), other, caseSensitive);
  }

  public boolean endsWith(XsStringClass other) {
    return minimalJNI.XsStringClass_endsWith__SWIG_1(swigCPtr, this, XsStringClass.getCPtr(other), other);
  }

  public boolean startsWith(XsStringClass other, boolean caseSensitive) {
    return minimalJNI.XsStringClass_startsWith__SWIG_0(swigCPtr, this, XsStringClass.getCPtr(other), other, caseSensitive);
  }

  public boolean startsWith(XsStringClass other) {
    return minimalJNI.XsStringClass_startsWith__SWIG_1(swigCPtr, this, XsStringClass.getCPtr(other), other);
  }

  public boolean contains(XsStringClass other, boolean caseSensitive, SWIGTYPE_p_XsSize offset) {
    return minimalJNI.XsStringClass_contains__SWIG_0(swigCPtr, this, XsStringClass.getCPtr(other), other, caseSensitive, SWIGTYPE_p_XsSize.getCPtr(offset));
  }

  public boolean contains(XsStringClass other, boolean caseSensitive) {
    return minimalJNI.XsStringClass_contains__SWIG_1(swigCPtr, this, XsStringClass.getCPtr(other), other, caseSensitive);
  }

  public boolean contains(XsStringClass other) {
    return minimalJNI.XsStringClass_contains__SWIG_2(swigCPtr, this, XsStringClass.getCPtr(other), other);
  }

  public SWIGTYPE_p_wchar_t utf8At(SWIGTYPE_p_XsSize index) {
    return new SWIGTYPE_p_wchar_t(minimalJNI.XsStringClass_utf8At(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index)), true);
  }

  public XsStringClass push_back(SWIGTYPE_p_wchar_t c) {
    return new XsStringClass(minimalJNI.XsStringClass_push_back__SWIG_1(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(c)), false);
  }

  public void sort() {
    minimalJNI.XsStringClass_sort(swigCPtr, this);
  }

  public void reverse() {
    minimalJNI.XsStringClass_reverse(swigCPtr, this);
  }

  public SWIGTYPE_p_ptrdiff_t findSubStr(XsStringClass needle) {
    return new SWIGTYPE_p_ptrdiff_t(minimalJNI.XsStringClass_findSubStr(swigCPtr, this, XsStringClass.getCPtr(needle), needle), true);
  }

  public XsStringClass mid(SWIGTYPE_p_XsSize start, SWIGTYPE_p_XsSize count) {
    return new XsStringClass(minimalJNI.XsStringClass_mid(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(start), SWIGTYPE_p_XsSize.getCPtr(count)), true);
  }

  public void replaceAll(XsStringClass src, XsStringClass dst) {
    minimalJNI.XsStringClass_replaceAll(swigCPtr, this, XsStringClass.getCPtr(src), src, XsStringClass.getCPtr(dst), dst);
  }

  public XsStringClass replacedAll(XsStringClass src, XsStringClass dst) {
    return new XsStringClass(minimalJNI.XsStringClass_replacedAll(swigCPtr, this, XsStringClass.getCPtr(src), src, XsStringClass.getCPtr(dst), dst), true);
  }

  public void trim() {
    minimalJNI.XsStringClass_trim(swigCPtr, this);
  }

  public XsStringClass trimmed() {
    return new XsStringClass(minimalJNI.XsStringClass_trimmed(swigCPtr, this), true);
  }

  public char last() {
    return minimalJNI.XsStringClass_last(swigCPtr, this);
  }

}
