/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsFilterProfileArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsFilterProfileArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsFilterProfileArray obj) {
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
        minimalJNI.delete_XsFilterProfileArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsFilterProfileArray(SWIGTYPE_p_XsSize count, XsFilterProfile src) {
    this(minimalJNI.new_XsFilterProfileArray__SWIG_0(SWIGTYPE_p_XsSize.getCPtr(count), XsFilterProfile.getCPtr(src), src), true);
  }

  public XsFilterProfileArray(SWIGTYPE_p_XsSize count) {
    this(minimalJNI.new_XsFilterProfileArray__SWIG_1(SWIGTYPE_p_XsSize.getCPtr(count)), true);
  }

  public XsFilterProfileArray() {
    this(minimalJNI.new_XsFilterProfileArray__SWIG_2(), true);
  }

  public XsFilterProfileArray(XsFilterProfileArray other) {
    this(minimalJNI.new_XsFilterProfileArray__SWIG_3(XsFilterProfileArray.getCPtr(other), other), true);
  }

  public XsFilterProfileArray(XsFilterProfile ref, SWIGTYPE_p_XsSize sz, SWIGTYPE_p_XsDataFlags flags) {
    this(minimalJNI.new_XsFilterProfileArray__SWIG_4(XsFilterProfile.getCPtr(ref), ref, SWIGTYPE_p_XsSize.getCPtr(sz), SWIGTYPE_p_XsDataFlags.getCPtr(flags)), true);
  }

  public void clear() {
    minimalJNI.XsFilterProfileArray_clear(swigCPtr, this);
  }

  public boolean opEquals(XsFilterProfileArray other) {
    return minimalJNI.XsFilterProfileArray_opEquals(swigCPtr, this, XsFilterProfileArray.getCPtr(other), other);
  }

  public boolean opUnequals(XsFilterProfileArray other) {
    return minimalJNI.XsFilterProfileArray_opUnequals(swigCPtr, this, XsFilterProfileArray.getCPtr(other), other);
  }

  public void reserve(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_reserve(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public SWIGTYPE_p_XsSize reserved() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsFilterProfileArray_reserved(swigCPtr, this), true);
  }

  public XsArrayDescriptor descriptor() {
    return new XsArrayDescriptor(minimalJNI.XsFilterProfileArray_descriptor(swigCPtr, this), false);
  }

  public SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT_1_t begin() {
    return new SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT_1_t(minimalJNI.XsFilterProfileArray_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT_1_t end() {
    return new SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT_1_t(minimalJNI.XsFilterProfileArray_end(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT__1_t rbegin() {
    return new SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT__1_t(minimalJNI.XsFilterProfileArray_rbegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT__1_t rend() {
    return new SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT__1_t(minimalJNI.XsFilterProfileArray_rend(swigCPtr, this), true);
  }

  public XsFilterProfile opSquareBracket(int index) {
    return new XsFilterProfile(minimalJNI.XsFilterProfileArray_opSquareBracket(swigCPtr, this, index), false);
  }

  public XsFilterProfile value(SWIGTYPE_p_XsSize index) {
    return new XsFilterProfile(minimalJNI.XsFilterProfileArray_value(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index)), true);
  }

  public XsFilterProfile first() {
    return new XsFilterProfile(minimalJNI.XsFilterProfileArray_first(swigCPtr, this), true);
  }

  public XsFilterProfile last() {
    return new XsFilterProfile(minimalJNI.XsFilterProfileArray_last(swigCPtr, this), true);
  }

  public XsFilterProfile at(SWIGTYPE_p_XsSize index) {
    return new XsFilterProfile(minimalJNI.XsFilterProfileArray_at(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index)), false);
  }

  public void insert(XsFilterProfile item, SWIGTYPE_p_XsSize index) {
    minimalJNI.XsFilterProfileArray_insert__SWIG_0(swigCPtr, this, XsFilterProfile.getCPtr(item), item, SWIGTYPE_p_XsSize.getCPtr(index));
  }

  public void insert(XsFilterProfile items, SWIGTYPE_p_XsSize index, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_insert__SWIG_1(swigCPtr, this, XsFilterProfile.getCPtr(items), items, SWIGTYPE_p_XsSize.getCPtr(index), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void insert(XsFilterProfile item, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT_1_t it) {
    minimalJNI.XsFilterProfileArray_insert__SWIG_2(swigCPtr, this, XsFilterProfile.getCPtr(item), item, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT_1_t.getCPtr(it));
  }

  public void insert(XsFilterProfile item, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT__1_t it) {
    minimalJNI.XsFilterProfileArray_insert__SWIG_3(swigCPtr, this, XsFilterProfile.getCPtr(item), item, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT__1_t.getCPtr(it));
  }

  public void insert(XsFilterProfile items, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT_1_t it, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_insert__SWIG_4(swigCPtr, this, XsFilterProfile.getCPtr(items), items, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT_1_t.getCPtr(it), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void insert(XsFilterProfile items, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT__1_t it, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_insert__SWIG_5(swigCPtr, this, XsFilterProfile.getCPtr(items), items, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplConstT__1_t.getCPtr(it), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void push_back(XsFilterProfile item) {
    minimalJNI.XsFilterProfileArray_push_back(swigCPtr, this, XsFilterProfile.getCPtr(item), item);
  }

  public void pop_back(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_pop_back__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void pop_back() {
    minimalJNI.XsFilterProfileArray_pop_back__SWIG_1(swigCPtr, this);
  }

  public void push_front(XsFilterProfile item) {
    minimalJNI.XsFilterProfileArray_push_front(swigCPtr, this, XsFilterProfile.getCPtr(item), item);
  }

  public void pop_front(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_pop_front__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void pop_front() {
    minimalJNI.XsFilterProfileArray_pop_front__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_XsSize size() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsFilterProfileArray_size(swigCPtr, this), true);
  }

  public void erase(SWIGTYPE_p_XsSize index, SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_erase__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index), SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void erase(SWIGTYPE_p_XsSize index) {
    minimalJNI.XsFilterProfileArray_erase__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index));
  }

  public SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplT_1_t erase(SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplT_1_t it) {
    return new SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplT_1_t(minimalJNI.XsFilterProfileArray_erase__SWIG_2(swigCPtr, this, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplT_1_t.getCPtr(it)), true);
  }

  public SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplT__1_t erase(SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplT__1_t it) {
    return new SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplT__1_t(minimalJNI.XsFilterProfileArray_erase__SWIG_3(swigCPtr, this, SWIGTYPE_p_XsArrayImplT_XsFilterProfile_g_xsFilterProfileArrayDescriptor_XsFilterProfileArray_t__IteratorImplT__1_t.getCPtr(it)), true);
  }

  public void assign(SWIGTYPE_p_XsSize count, XsFilterProfile src) {
    minimalJNI.XsFilterProfileArray_assign(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count), XsFilterProfile.getCPtr(src), src);
  }

  public void resize(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_resize(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void setSize(SWIGTYPE_p_XsSize count) {
    minimalJNI.XsFilterProfileArray_setSize(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(count));
  }

  public void append(XsFilterProfileArray other) {
    minimalJNI.XsFilterProfileArray_append(swigCPtr, this, XsFilterProfileArray.getCPtr(other), other);
  }

  public XsFilterProfileArray opSet(XsFilterProfileArray other) {
    return new XsFilterProfileArray(minimalJNI.XsFilterProfileArray_opSet(swigCPtr, this, XsFilterProfileArray.getCPtr(other), other), false);
  }

  public boolean empty() {
    return minimalJNI.XsFilterProfileArray_empty(swigCPtr, this);
  }

  public SWIGTYPE_p_XsFilterProfileArray inherited() {
    return new SWIGTYPE_p_XsFilterProfileArray(minimalJNI.XsFilterProfileArray_inherited(swigCPtr, this), false);
  }

  public void swap(XsFilterProfileArray other) {
    minimalJNI.XsFilterProfileArray_swap__SWIG_0(swigCPtr, this, XsFilterProfileArray.getCPtr(other), other);
  }

  public void swap(SWIGTYPE_p_XsSize a, SWIGTYPE_p_XsSize b) {
    minimalJNI.XsFilterProfileArray_swap__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(a), SWIGTYPE_p_XsSize.getCPtr(b));
  }

  public SWIGTYPE_p_XsFilterProfileArray opLeftShift(XsFilterProfile item) {
    return new SWIGTYPE_p_XsFilterProfileArray(minimalJNI.XsFilterProfileArray_opLeftShift(swigCPtr, this, XsFilterProfile.getCPtr(item), item), false);
  }

  public SWIGTYPE_p_ptrdiff_t find(XsFilterProfile needle) {
    return new SWIGTYPE_p_ptrdiff_t(minimalJNI.XsFilterProfileArray_find(swigCPtr, this, XsFilterProfile.getCPtr(needle), needle), true);
  }

  public void removeDuplicates() {
    minimalJNI.XsFilterProfileArray_removeDuplicates(swigCPtr, this);
  }

  public void removeDuplicatesPredicate(SWIGTYPE_p_f_p_q_const__void_p_q_const__void__int predicate) {
    minimalJNI.XsFilterProfileArray_removeDuplicatesPredicate(swigCPtr, this, SWIGTYPE_p_f_p_q_const__void_p_q_const__void__int.getCPtr(predicate));
  }

  public void sort() {
    minimalJNI.XsFilterProfileArray_sort(swigCPtr, this);
  }

  public void reverse() {
    minimalJNI.XsFilterProfileArray_reverse(swigCPtr, this);
  }

}
