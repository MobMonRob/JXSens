/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsStringOutputTypeArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsStringOutputTypeArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsStringOutputTypeArray obj) {
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
        minimalJNI.delete_XsStringOutputTypeArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsStringOutputTypeArray(SWIGTYPE_p_XsSize count, SWIGTYPE_p_XsStringOutputType src) {
    this(minimalJNI.new_XsStringOutputTypeArray__SWIG_0(SWIGTYPE_p_XsSize.getCPtr(count), SWIGTYPE_p_XsStringOutputType.getCPtr(src)), true);
  }

  public XsStringOutputTypeArray(SWIGTYPE_p_XsSize count) {
    this(minimalJNI.new_XsStringOutputTypeArray__SWIG_1(SWIGTYPE_p_XsSize.getCPtr(count)), true);
  }

  public XsStringOutputTypeArray() {
    this(minimalJNI.new_XsStringOutputTypeArray__SWIG_2(), true);
  }

  public XsStringOutputTypeArray(XsStringOutputTypeArray other) {
    this(minimalJNI.new_XsStringOutputTypeArray__SWIG_3(XsStringOutputTypeArray.getCPtr(other), other), true);
  }

  public XsStringOutputTypeArray(SWIGTYPE_p_XsStringOutputType ref, SWIGTYPE_p_XsSize sz, SWIGTYPE_p_XsDataFlags flags) {
    this(minimalJNI.new_XsStringOutputTypeArray__SWIG_4(SWIGTYPE_p_XsStringOutputType.getCPtr(ref), SWIGTYPE_p_XsSize.getCPtr(sz), SWIGTYPE_p_XsDataFlags.getCPtr(flags)), true);
  }

  public void clear() {
    minimalJNI.XsStringOutputTypeArray_clear(swigCPtr, this);
  }

  public boolean opEquals(XsStringOutputTypeArray other) {
    return minimalJNI.XsStringOutputTypeArray_opEquals(swigCPtr, this, XsStringOutputTypeArray.getCPtr(other), other);
  }

  public boolean opUnequals(XsStringOutputTypeArray other) {
    return minimalJNI.XsStringOutputTypeArray_opUnequals(swigCPtr, this, XsStringOutputTypeArray.getCPtr(other), other);
  }

  public void reserve(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_reserve(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public SWIGTYPE_p_XsSize reserved() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsStringOutputTypeArray_reserved(swigCPtr, this), true);
  }

  public XsArrayDescriptor descriptor() {
    return new XsArrayDescriptor(minimalJNI.XsStringOutputTypeArray_descriptor(swigCPtr, this), false);
  }

  public SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT_1_t begin() {
    return new SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT_1_t(minimalJNI.XsStringOutputTypeArray_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT_1_t end() {
    return new SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT_1_t(minimalJNI.XsStringOutputTypeArray_end(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT__1_t rbegin() {
    return new SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT__1_t(minimalJNI.XsStringOutputTypeArray_rbegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT__1_t rend() {
    return new SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT__1_t(minimalJNI.XsStringOutputTypeArray_rend(swigCPtr, this), true);
  }

  public XsStringOutputType opSquareBracket(int index) {
    return XsStringOutputType.swigToEnum(minimalJNI.XsStringOutputTypeArray_opSquareBracket(swigCPtr, this, index));
  }

  public XsStringOutputType value(SWIGTYPE_p_XsSize index) {
    return XsStringOutputType.swigToEnum(minimalJNI.XsStringOutputTypeArray_value(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index)));
  }

  public XsStringOutputType first() {
    return XsStringOutputType.swigToEnum(minimalJNI.XsStringOutputTypeArray_first(swigCPtr, this));
  }

  public XsStringOutputType last() {
    return XsStringOutputType.swigToEnum(minimalJNI.XsStringOutputTypeArray_last(swigCPtr, this));
  }

  public XsStringOutputType at(SWIGTYPE_p_XsSize index) {
    return XsStringOutputType.swigToEnum(minimalJNI.XsStringOutputTypeArray_at(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index)));
  }

  public void insert(XsStringOutputType item, SWIGTYPE_p_XsSize index) {
    minimalJNI.XsStringOutputTypeArray_insert__SWIG_0(swigCPtr, this, item.swigValue(), SWIGTYPE_p_XsSize.getCPtr(index));
  }

  public void insert(SWIGTYPE_p_XsStringOutputType items, SWIGTYPE_p_XsSize index, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_insert__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsStringOutputType.getCPtr(items), SWIGTYPE_p_XsSize.getCPtr(index), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void insert(XsStringOutputType item, SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT_1_t it) {
    minimalJNI.XsStringOutputTypeArray_insert__SWIG_2(swigCPtr, this, item.swigValue(), SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT_1_t.getCPtr(it));
  }

  public void insert(XsStringOutputType item, SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT__1_t it) {
    minimalJNI.XsStringOutputTypeArray_insert__SWIG_3(swigCPtr, this, item.swigValue(), SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT__1_t.getCPtr(it));
  }

  public void insert(SWIGTYPE_p_XsStringOutputType items, SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT_1_t it, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_insert__SWIG_4(swigCPtr, this, SWIGTYPE_p_XsStringOutputType.getCPtr(items), SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT_1_t.getCPtr(it), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void insert(SWIGTYPE_p_XsStringOutputType items, SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT__1_t it, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_insert__SWIG_5(swigCPtr, this, SWIGTYPE_p_XsStringOutputType.getCPtr(items), SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplConstT__1_t.getCPtr(it), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void push_back(XsStringOutputType item) {
    minimalJNI.XsStringOutputTypeArray_push_back(swigCPtr, this, item.swigValue());
  }

  public void pop_back(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_pop_back__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void pop_back() {
    minimalJNI.XsStringOutputTypeArray_pop_back__SWIG_1(swigCPtr, this);
  }

  public void push_front(XsStringOutputType item) {
    minimalJNI.XsStringOutputTypeArray_push_front(swigCPtr, this, item.swigValue());
  }

  public void pop_front(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_pop_front__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void pop_front() {
    minimalJNI.XsStringOutputTypeArray_pop_front__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_XsSize size() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsStringOutputTypeArray_size(swigCPtr, this), true);
  }

  public void erase(SWIGTYPE_p_XsSize index, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_erase__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void erase(SWIGTYPE_p_XsSize index) {
    minimalJNI.XsStringOutputTypeArray_erase__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index));
  }

  public SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplT_1_t erase(SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplT_1_t it) {
    return new SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplT_1_t(minimalJNI.XsStringOutputTypeArray_erase__SWIG_2(swigCPtr, this, SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplT_1_t.getCPtr(it)), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplT__1_t erase(SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplT__1_t it) {
    return new SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplT__1_t(minimalJNI.XsStringOutputTypeArray_erase__SWIG_3(swigCPtr, this, SWIGTYPE_p_XsArrayImplT_XsStringOutputType_g_xsStringOutputTypeArrayDescriptor_XsStringOutputTypeArray_t__IteratorImplT__1_t.getCPtr(it)), true);
  }

  public void assign(SWIGTYPE_p_XsSize count, SWIGTYPE_p_XsStringOutputType src) {
    minimalJNI.XsStringOutputTypeArray_assign(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count), SWIGTYPE_p_XsStringOutputType.getCPtr(src));
  }

  public void resize(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_resize(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void setSize(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsStringOutputTypeArray_setSize(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void append(XsStringOutputTypeArray other) {
    minimalJNI.XsStringOutputTypeArray_append(swigCPtr, this, XsStringOutputTypeArray.getCPtr(other), other);
  }

  public XsStringOutputTypeArray opSet(XsStringOutputTypeArray other) {
    return new XsStringOutputTypeArray(minimalJNI.XsStringOutputTypeArray_opSet(swigCPtr, this, XsStringOutputTypeArray.getCPtr(other), other), false);
  }

  public boolean empty() {
    return minimalJNI.XsStringOutputTypeArray_empty(swigCPtr, this);
  }

  public SWIGTYPE_p_XsStringOutputTypeArray inherited() {
    return new SWIGTYPE_p_XsStringOutputTypeArray(minimalJNI.XsStringOutputTypeArray_inherited(swigCPtr, this), false);
  }

  public void swap(XsStringOutputTypeArray other) {
    minimalJNI.XsStringOutputTypeArray_swap__SWIG_0(swigCPtr, this, XsStringOutputTypeArray.getCPtr(other), other);
  }

  public void swap(SWIGTYPE_p_XsSize a, SWIGTYPE_p_XsSize b) {
    minimalJNI.XsStringOutputTypeArray_swap__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(a), SWIGTYPE_p_XsSize.getCPtr(b));
  }

  public SWIGTYPE_p_XsStringOutputTypeArray opLeftShift(XsStringOutputType item) {
    return new SWIGTYPE_p_XsStringOutputTypeArray(minimalJNI.XsStringOutputTypeArray_opLeftShift(swigCPtr, this, item.swigValue()), false);
  }

  public SWIGTYPE_p_ptrdiff_t find(XsStringOutputType needle) {
    return new SWIGTYPE_p_ptrdiff_t(minimalJNI.XsStringOutputTypeArray_find(swigCPtr, this, needle.swigValue()), true);
  }

  public void removeDuplicates() {
    minimalJNI.XsStringOutputTypeArray_removeDuplicates(swigCPtr, this);
  }

  public void removeDuplicatesPredicate(SWIGTYPE_p_f_p_q_const__void_p_q_const__void__int predicate) {
    minimalJNI.XsStringOutputTypeArray_removeDuplicatesPredicate(swigCPtr, this, SWIGTYPE_p_f_p_q_const__void_p_q_const__void__int.getCPtr(predicate));
  }

  public void sort() {
    minimalJNI.XsStringOutputTypeArray_sort(swigCPtr, this);
  }

  public void reverse() {
    minimalJNI.XsStringOutputTypeArray_reverse(swigCPtr, this);
  }

}