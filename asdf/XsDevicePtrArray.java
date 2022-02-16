/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsDevicePtrArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsDevicePtrArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsDevicePtrArray obj) {
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
        minimalJNI.delete_XsDevicePtrArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsDevicePtrArray(SWIGTYPE_p_XsSize count, SWIGTYPE_p_p_XsDevice src) {
    this(minimalJNI.new_XsDevicePtrArray__SWIG_0(SWIGTYPE_p_XsSize.getCPtr(count), SWIGTYPE_p_p_XsDevice.getCPtr(src)), true);
  }

  public XsDevicePtrArray(SWIGTYPE_p_XsSize count) {
    this(minimalJNI.new_XsDevicePtrArray__SWIG_1(SWIGTYPE_p_XsSize.getCPtr(count)), true);
  }

  public XsDevicePtrArray() {
    this(minimalJNI.new_XsDevicePtrArray__SWIG_2(), true);
  }

  public XsDevicePtrArray(XsDevicePtrArray other) {
    this(minimalJNI.new_XsDevicePtrArray__SWIG_3(XsDevicePtrArray.getCPtr(other), other), true);
  }

  public XsDevicePtrArray(SWIGTYPE_p_p_XsDevice ref, SWIGTYPE_p_XsSize sz, SWIGTYPE_p_XsDataFlags flags) {
    this(minimalJNI.new_XsDevicePtrArray__SWIG_4(SWIGTYPE_p_p_XsDevice.getCPtr(ref), SWIGTYPE_p_XsSize.getCPtr(sz), SWIGTYPE_p_XsDataFlags.getCPtr(flags)), true);
  }

  public void clear() {
    minimalJNI.XsDevicePtrArray_clear(swigCPtr, this);
  }

  public boolean opEquals(XsDevicePtrArray other) {
    return minimalJNI.XsDevicePtrArray_opEquals(swigCPtr, this, XsDevicePtrArray.getCPtr(other), other);
  }

  public boolean opUnequals(XsDevicePtrArray other) {
    return minimalJNI.XsDevicePtrArray_opUnequals(swigCPtr, this, XsDevicePtrArray.getCPtr(other), other);
  }

  public void reserve(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_reserve(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public SWIGTYPE_p_XsSize reserved() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsDevicePtrArray_reserved(swigCPtr, this), true);
  }

  public XsArrayDescriptor descriptor() {
    return new XsArrayDescriptor(minimalJNI.XsDevicePtrArray_descriptor(swigCPtr, this), false);
  }

  public SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT_1_t begin() {
    return new SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT_1_t(minimalJNI.XsDevicePtrArray_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT_1_t end() {
    return new SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT_1_t(minimalJNI.XsDevicePtrArray_end(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT__1_t rbegin() {
    return new SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT__1_t(minimalJNI.XsDevicePtrArray_rbegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT__1_t rend() {
    return new SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT__1_t(minimalJNI.XsDevicePtrArray_rend(swigCPtr, this), true);
  }

  public XsDevice opSquareBracket(int index) {
    long cPtr = minimalJNI.XsDevicePtrArray_opSquareBracket(swigCPtr, this, index);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsDevice value(SWIGTYPE_p_XsSize index) {
    long cPtr = minimalJNI.XsDevicePtrArray_value(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index));
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsDevice first() {
    long cPtr = minimalJNI.XsDevicePtrArray_first(swigCPtr, this);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsDevice last() {
    long cPtr = minimalJNI.XsDevicePtrArray_last(swigCPtr, this);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsDevice at(SWIGTYPE_p_XsSize index) {
    long cPtr = minimalJNI.XsDevicePtrArray_at(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index));
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public void insert(XsDevice item, SWIGTYPE_p_XsSize index) {
    minimalJNI.XsDevicePtrArray_insert__SWIG_0(swigCPtr, this, XsDevice.getCPtr(item), item, SWIGTYPE_p_XsSize.getCPtr(index));
  }

  public void insert(SWIGTYPE_p_p_XsDevice items, SWIGTYPE_p_XsSize index, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_insert__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_XsDevice.getCPtr(items), SWIGTYPE_p_XsSize.getCPtr(index), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void insert(XsDevice item, SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT_1_t it) {
    minimalJNI.XsDevicePtrArray_insert__SWIG_2(swigCPtr, this, XsDevice.getCPtr(item), item, SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT_1_t.getCPtr(it));
  }

  public void insert(XsDevice item, SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT__1_t it) {
    minimalJNI.XsDevicePtrArray_insert__SWIG_3(swigCPtr, this, XsDevice.getCPtr(item), item, SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT__1_t.getCPtr(it));
  }

  public void insert(SWIGTYPE_p_p_XsDevice items, SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT_1_t it, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_insert__SWIG_4(swigCPtr, this, SWIGTYPE_p_p_XsDevice.getCPtr(items), SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT_1_t.getCPtr(it), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void insert(SWIGTYPE_p_p_XsDevice items, SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT__1_t it, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_insert__SWIG_5(swigCPtr, this, SWIGTYPE_p_p_XsDevice.getCPtr(items), SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplConstT__1_t.getCPtr(it), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void push_back(XsDevice item) {
    minimalJNI.XsDevicePtrArray_push_back(swigCPtr, this, XsDevice.getCPtr(item), item);
  }

  public void pop_back(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_pop_back__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void pop_back() {
    minimalJNI.XsDevicePtrArray_pop_back__SWIG_1(swigCPtr, this);
  }

  public void push_front(XsDevice item) {
    minimalJNI.XsDevicePtrArray_push_front(swigCPtr, this, XsDevice.getCPtr(item), item);
  }

  public void pop_front(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_pop_front__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void pop_front() {
    minimalJNI.XsDevicePtrArray_pop_front__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_XsSize size() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsDevicePtrArray_size(swigCPtr, this), true);
  }

  public void erase(SWIGTYPE_p_XsSize index, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_erase__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void erase(SWIGTYPE_p_XsSize index) {
    minimalJNI.XsDevicePtrArray_erase__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index));
  }

  public SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplT_1_t erase(SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplT_1_t it) {
    return new SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplT_1_t(minimalJNI.XsDevicePtrArray_erase__SWIG_2(swigCPtr, this, SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplT_1_t.getCPtr(it)), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplT__1_t erase(SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplT__1_t it) {
    return new SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplT__1_t(minimalJNI.XsDevicePtrArray_erase__SWIG_3(swigCPtr, this, SWIGTYPE_p_XsArrayImplT_XsDevice_p_g_xsDevicePtrArrayDescriptor_XsDevicePtrArray_t__IteratorImplT__1_t.getCPtr(it)), true);
  }

  public void assign(SWIGTYPE_p_XsSize count, SWIGTYPE_p_p_XsDevice src) {
    minimalJNI.XsDevicePtrArray_assign(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count), SWIGTYPE_p_p_XsDevice.getCPtr(src));
  }

  public void resize(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_resize(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void setSize(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsDevicePtrArray_setSize(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void append(XsDevicePtrArray other) {
    minimalJNI.XsDevicePtrArray_append(swigCPtr, this, XsDevicePtrArray.getCPtr(other), other);
  }

  public XsDevicePtrArray opSet(XsDevicePtrArray other) {
    return new XsDevicePtrArray(minimalJNI.XsDevicePtrArray_opSet(swigCPtr, this, XsDevicePtrArray.getCPtr(other), other), false);
  }

  public boolean empty() {
    return minimalJNI.XsDevicePtrArray_empty(swigCPtr, this);
  }

  public SWIGTYPE_p_XsDevicePtrArray inherited() {
    return new SWIGTYPE_p_XsDevicePtrArray(minimalJNI.XsDevicePtrArray_inherited(swigCPtr, this), false);
  }

  public void swap(XsDevicePtrArray other) {
    minimalJNI.XsDevicePtrArray_swap__SWIG_0(swigCPtr, this, XsDevicePtrArray.getCPtr(other), other);
  }

  public void swap(SWIGTYPE_p_XsSize a, SWIGTYPE_p_XsSize b) {
    minimalJNI.XsDevicePtrArray_swap__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(a), SWIGTYPE_p_XsSize.getCPtr(b));
  }

  public SWIGTYPE_p_XsDevicePtrArray opLeftShift(XsDevice item) {
    return new SWIGTYPE_p_XsDevicePtrArray(minimalJNI.XsDevicePtrArray_opLeftShift(swigCPtr, this, XsDevice.getCPtr(item), item), false);
  }

  public SWIGTYPE_p_ptrdiff_t find(XsDevice needle) {
    return new SWIGTYPE_p_ptrdiff_t(minimalJNI.XsDevicePtrArray_find(swigCPtr, this, XsDevice.getCPtr(needle), needle), true);
  }

  public void removeDuplicates() {
    minimalJNI.XsDevicePtrArray_removeDuplicates(swigCPtr, this);
  }

  public void removeDuplicatesPredicate(SWIGTYPE_p_f_p_q_const__void_p_q_const__void__int predicate) {
    minimalJNI.XsDevicePtrArray_removeDuplicatesPredicate(swigCPtr, this, SWIGTYPE_p_f_p_q_const__void_p_q_const__void__int.getCPtr(predicate));
  }

  public void sort() {
    minimalJNI.XsDevicePtrArray_sort(swigCPtr, this);
  }

  public void reverse() {
    minimalJNI.XsDevicePtrArray_reverse(swigCPtr, this);
  }

}
