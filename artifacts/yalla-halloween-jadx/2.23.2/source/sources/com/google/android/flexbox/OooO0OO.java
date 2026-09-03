package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.o00O0O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.google.android.flexbox.OooO00o f14033OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean[] f14034OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public int[] f14035OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public long[] f14036OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public long[] f14037OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<com.google.android.flexbox.OooO0O0> f14038OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f14039OooO0O0;
    }

    public static class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14040OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f14041OooO0o0;

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull OooO0O0 oooO0O0) {
            OooO0O0 oooO0O1 = oooO0O0;
            int i = this.f14041OooO0o0;
            int i2 = oooO0O1.f14041OooO0o0;
            return i != i2 ? i - i2 : this.f14040OooO0Oo - oooO0O1.f14040OooO0Oo;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.f14041OooO0o0);
            sb.append(", index=");
            return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f14040OooO0Oo, '}');
        }
    }

    public OooO0OO(com.google.android.flexbox.OooO00o oooO00o) {
        this.f14033OooO00o = oooO00o;
    }

    public static ArrayList OooO0o0(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.OooO0O0 oooO0O0 = new com.google.android.flexbox.OooO0O0();
        oooO0O0.f14022OooO0oO = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(oooO0O0);
            }
            arrayList.add((com.google.android.flexbox.OooO0O0) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(oooO0O0);
            }
        }
        return arrayList;
    }

    public static int[] OooOOo(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            OooO0O0 oooO0O0 = (OooO0O0) it.next();
            int i3 = oooO0O0.f14040OooO0Oo;
            iArr[i2] = i3;
            sparseIntArray.append(i3, oooO0O0.f14041OooO0o0);
            i2++;
        }
        return iArr;
    }

    public final void OooO(int i) {
        int[] iArr = this.f14035OooO0OO;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f14035OooO0OO = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f14035OooO0OO = Arrays.copyOf(iArr, i);
        }
    }

    public final void OooO00o(List<com.google.android.flexbox.OooO0O0> list, com.google.android.flexbox.OooO0O0 oooO0O0, int i, int i2) {
        oooO0O0.f14028OooOOO0 = i2;
        this.f14033OooO00o.OooO0o(oooO0O0);
        oooO0O0.f14030OooOOOo = i;
        list.add(oooO0O0);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e7  */
    public final void OooO0O0(OooO00o oooO00o, int i, int i2, int i3, int i4, int i5, @Nullable List<com.google.android.flexbox.OooO0O0> list) {
        int i6;
        boolean z;
        int iOooO0Oo;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int minimumHeight;
        int i13;
        boolean z5;
        com.google.android.flexbox.OooO00o oooO00o2 = this.f14033OooO00o;
        boolean zOooOO0 = oooO00o2.OooOO0();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<com.google.android.flexbox.OooO0O0> arrayList = list == null ? new ArrayList<>() : list;
        oooO00o.f14038OooO00o = arrayList;
        boolean z6 = i5 == -1;
        int paddingStart = zOooOO0 ? oooO00o2.getPaddingStart() : oooO00o2.getPaddingTop();
        int paddingEnd = zOooOO0 ? oooO00o2.getPaddingEnd() : oooO00o2.getPaddingBottom();
        int paddingTop = zOooOO0 ? oooO00o2.getPaddingTop() : oooO00o2.getPaddingStart();
        int paddingBottom = zOooOO0 ? oooO00o2.getPaddingBottom() : oooO00o2.getPaddingEnd();
        com.google.android.flexbox.OooO0O0 oooO0O0 = new com.google.android.flexbox.OooO0O0();
        int i14 = i4;
        oooO0O0.f14029OooOOOO = i14;
        int i15 = paddingStart + paddingEnd;
        oooO0O0.f14021OooO0o0 = i15;
        int flexItemCount = oooO00o2.getFlexItemCount();
        int i16 = Integer.MIN_VALUE;
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        int i18 = 0;
        while (i14 < flexItemCount) {
            View viewOooO0oO = oooO00o2.OooO0oO(i14);
            if (viewOooO0oO == null) {
                if (i14 == flexItemCount - 1) {
                    z = z6;
                    z5 = oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO != 0;
                    if (z5) {
                        OooO00o(arrayList, oooO0O0, i14, i17);
                    }
                } else {
                    z = z6;
                }
                if (z5) {
                    OooO00o(arrayList, oooO0O0, i14, i17);
                }
            } else {
                z = z6;
                if (viewOooO0oO.getVisibility() == 8) {
                    int i19 = oooO0O0.f14015OooO + 1;
                    oooO0O0.f14015OooO = i19;
                    int i20 = oooO0O0.f14023OooO0oo + 1;
                    oooO0O0.f14023OooO0oo = i20;
                    if (i14 == flexItemCount + (-1) && i20 - i19 != 0) {
                        OooO00o(arrayList, oooO0O0, i14, i17);
                    }
                } else {
                    if (viewOooO0oO instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewOooO0oO;
                        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
                        int iOooOo = flexItem.OooOo();
                        int iO0000O0 = flexItem.o0000O0();
                        Drawable drawableOooO00o = androidx.core.widget.OooO0OO.OooO00o(compoundButton);
                        int minimumWidth = drawableOooO00o == null ? 0 : drawableOooO00o.getMinimumWidth();
                        if (drawableOooO00o == null) {
                            i13 = -1;
                            minimumHeight = 0;
                        } else {
                            minimumHeight = drawableOooO00o.getMinimumHeight();
                            i13 = -1;
                        }
                        if (iOooOo == i13) {
                            iOooOo = minimumWidth;
                        }
                        flexItem.oo0o0Oo(iOooOo);
                        if (iO0000O0 == i13) {
                            iO0000O0 = minimumHeight;
                        }
                        flexItem.Oooo0O0(iO0000O0);
                    }
                    FlexItem flexItem2 = (FlexItem) viewOooO0oO.getLayoutParams();
                    if (flexItem2.OooOOo() == 4) {
                        oooO0O0.f14027OooOOO.add(Integer.valueOf(i14));
                    }
                    int width = zOooOO0 ? flexItem2.getWidth() : flexItem2.getHeight();
                    if (flexItem2.OoooO0() != -1.0f && mode == 1073741824) {
                        width = Math.round(size * flexItem2.OoooO0());
                    }
                    if (zOooOO0) {
                        iOooO0Oo = oooO00o2.OooO0O0(i, flexItem2.o0000O00() + flexItem2.o000OOo() + i15, width);
                        int iOooO0Oo2 = oooO00o2.OooO0Oo(i2, flexItem2.o0O0O00() + flexItem2.Oooo0() + paddingTop + paddingBottom + i17, flexItem2.getHeight());
                        viewOooO0oO.measure(iOooO0Oo, iOooO0Oo2);
                        OooOo0O(viewOooO0oO, i14, iOooO0Oo, iOooO0Oo2);
                    } else {
                        int iOooO0O0 = oooO00o2.OooO0O0(i2, flexItem2.o0000O00() + flexItem2.o000OOo() + paddingTop + paddingBottom + i17, flexItem2.getWidth());
                        iOooO0Oo = oooO00o2.OooO0Oo(i, flexItem2.o0O0O00() + flexItem2.Oooo0() + i15, width);
                        viewOooO0oO.measure(iOooO0O0, iOooO0Oo);
                        OooOo0O(viewOooO0oO, i14, iOooO0O0, iOooO0Oo);
                    }
                    oooO00o2.OooO0oo(i14, viewOooO0oO);
                    OooO0OO(i14, viewOooO0oO);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewOooO0oO.getMeasuredState());
                    int i21 = oooO0O0.f14021OooO0o0;
                    int iO0000O00 = (zOooOO0 ? flexItem2.o0000O00() : flexItem2.o0O0O00()) + (zOooOO0 ? flexItem2.o000OOo() : flexItem2.Oooo0()) + (zOooOO0 ? viewOooO0oO.getMeasuredWidth() : viewOooO0oO.getMeasuredHeight());
                    int size2 = arrayList.size();
                    if (oooO00o2.getFlexWrap() != 0) {
                        if (flexItem2.OoooOO0()) {
                            i7 = mode;
                            i8 = i15;
                            i9 = i18;
                        } else {
                            if (mode == 0) {
                                i7 = mode;
                                i8 = i15;
                            } else {
                                int maxLine = oooO00o2.getMaxLine();
                                i7 = mode;
                                i8 = i15;
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    i9 = i18;
                                    int iOooO = oooO00o2.OooO(viewOooO0oO, i14, i9);
                                    if (iOooO > 0) {
                                        iO0000O00 += iOooO;
                                    }
                                    if (size < i21 + iO0000O00) {
                                    }
                                }
                                z2 = false;
                            }
                            i9 = i18;
                            z2 = false;
                        }
                        z2 = true;
                    } else {
                        i7 = mode;
                        i8 = i15;
                        i9 = i18;
                        z2 = false;
                    }
                    if (z2) {
                        if (oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO > 0) {
                            OooO00o(arrayList, oooO0O0, i14 > 0 ? i14 - 1 : 0, i17);
                            i17 += oooO0O0.f14022OooO0oO;
                        } else {
                            arrayList = arrayList;
                        }
                        if (zOooOO0) {
                            if (flexItem2.getHeight() == -1) {
                                viewOooO0oO.measure(iOooO0Oo, oooO00o2.OooO0Oo(i2, oooO00o2.getPaddingBottom() + oooO00o2.getPaddingTop() + flexItem2.Oooo0() + flexItem2.o0O0O00() + i17, flexItem2.getHeight()));
                                OooO0OO(i14, viewOooO0oO);
                            }
                        } else if (flexItem2.getWidth() == -1) {
                            viewOooO0oO.measure(oooO00o2.OooO0O0(i2, oooO00o2.getPaddingRight() + oooO00o2.getPaddingLeft() + flexItem2.o000OOo() + flexItem2.o0000O00() + i17, flexItem2.getWidth()), iOooO0Oo);
                            OooO0OO(i14, viewOooO0oO);
                        }
                        oooO0O0 = new com.google.android.flexbox.OooO0O0();
                        z3 = true;
                        oooO0O0.f14023OooO0oo = 1;
                        i15 = i8;
                        oooO0O0.f14021OooO0o0 = i15;
                        oooO0O0.f14029OooOOOO = i14;
                        i11 = Integer.MIN_VALUE;
                        i10 = 0;
                    } else {
                        arrayList = arrayList;
                        i15 = i8;
                        z3 = true;
                        oooO0O0.f14023OooO0oo++;
                        i10 = i9 + 1;
                        i11 = i16;
                    }
                    oooO0O0.f14032OooOOo0 |= flexItem2.Oooo0o0() != 0.0f ? z3 : false;
                    oooO0O0.f14031OooOOo |= flexItem2.OooOo00() != 0.0f ? z3 : false;
                    int[] iArr = this.f14035OooO0OO;
                    if (iArr != null) {
                        iArr[i14] = arrayList.size();
                    }
                    oooO0O0.f14021OooO0o0 = (zOooOO0 ? flexItem2.o0000O00() : flexItem2.o0O0O00()) + (zOooOO0 ? flexItem2.o000OOo() : flexItem2.Oooo0()) + (zOooOO0 ? viewOooO0oO.getMeasuredWidth() : viewOooO0oO.getMeasuredHeight()) + oooO0O0.f14021OooO0o0;
                    oooO0O0.f14024OooOO0 += flexItem2.Oooo0o0();
                    oooO0O0.f14025OooOO0O += flexItem2.OooOo00();
                    oooO00o2.OooO00o(viewOooO0oO, i14, i10, oooO0O0);
                    int iMax = Math.max(i11, oooO00o2.OooO0o0(viewOooO0oO) + (zOooOO0 ? flexItem2.o0O0O00() : flexItem2.o0000O00()) + (zOooOO0 ? flexItem2.Oooo0() : flexItem2.o000OOo()) + (zOooOO0 ? viewOooO0oO.getMeasuredHeight() : viewOooO0oO.getMeasuredWidth()));
                    oooO0O0.f14022OooO0oO = Math.max(oooO0O0.f14022OooO0oO, iMax);
                    if (zOooOO0) {
                        if (oooO00o2.getFlexWrap() != 2) {
                            oooO0O0.f14026OooOO0o = Math.max(oooO0O0.f14026OooOO0o, viewOooO0oO.getBaseline() + flexItem2.Oooo0());
                        } else {
                            oooO0O0.f14026OooOO0o = Math.max(oooO0O0.f14026OooOO0o, (viewOooO0oO.getMeasuredHeight() - viewOooO0oO.getBaseline()) + flexItem2.o0O0O00());
                        }
                    }
                    if (i14 == flexItemCount + (-1) && oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO != 0) {
                        OooO00o(arrayList, oooO0O0, i14, i17);
                        i17 += oooO0O0.f14022OooO0oO;
                    }
                    i12 = i5;
                    if (i12 == -1 || arrayList.size() <= 0 || arrayList.get(arrayList.size() - 1).f14030OooOOOo < i12 || i14 < i12 || z) {
                        z4 = z;
                    } else {
                        i17 = -oooO0O0.f14022OooO0oO;
                        z4 = true;
                    }
                    if (i17 > i3 && z4) {
                        i6 = iCombineMeasuredStates;
                        oooO00o.f14039OooO0O0 = i6;
                    } else {
                        i18 = i10;
                        i16 = iMax;
                        z6 = z4;
                    }
                }
                i14++;
                arrayList = arrayList;
                flexItemCount = flexItemCount;
                mode = i7;
            }
            z6 = z;
            i12 = i5;
            i7 = mode;
            arrayList = arrayList;
            flexItemCount = flexItemCount;
            i14++;
            arrayList = arrayList;
            flexItemCount = flexItemCount;
            mode = i7;
        }
        i6 = iCombineMeasuredStates;
        oooO00o.f14039OooO0O0 = i6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void OooO0OO(int i, View view) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.OooOo()) {
            if (measuredWidth > flexItem.OooooO0()) {
                measuredWidth = flexItem.OooooO0();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.o0000O0()) {
                measuredHeight = flexItem.o0000O0();
            } else if (measuredHeight > flexItem.o0000O0O()) {
                measuredHeight = flexItem.o0000O0O();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Pow2.MAX_POW2);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, Pow2.MAX_POW2);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                OooOo0O(view, i, iMakeMeasureSpec, iMakeMeasureSpec2);
                this.f14033OooO00o.OooO0oo(i, view);
            }
        }
        measuredWidth = flexItem.OooOo();
        z = true;
        if (measuredHeight < flexItem.o0000O0()) {
            measuredHeight = flexItem.o0000O0();
        } else if (measuredHeight > flexItem.o0000O0O()) {
            measuredHeight = flexItem.o0000O0O();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Pow2.MAX_POW2);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, Pow2.MAX_POW2);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            OooOo0O(view, i, iMakeMeasureSpec3, iMakeMeasureSpec4);
            this.f14033OooO00o.OooO0oo(i, view);
        }
    }

    public final void OooO0Oo(int i, List list) {
        int i2 = this.f14035OooO0OO[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.f14035OooO0OO;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f14036OooO0Oo;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    @NonNull
    public final ArrayList OooO0o(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f14033OooO00o.OooO0OO(i2).getLayoutParams();
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f14041OooO0o0 = flexItem.getOrder();
            oooO0O0.f14040OooO0Oo = i2;
            arrayList.add(oooO0O0);
        }
        return arrayList;
    }

    public final void OooO0oO(int i, int i2, int i3) {
        int mode;
        int size;
        com.google.android.flexbox.OooO00o oooO00o = this.f14033OooO00o;
        int flexDirection = oooO00o.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", flexDirection));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<com.google.android.flexbox.OooO0O0> flexLinesInternal = oooO00o.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = oooO00o.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f14022OooO0oO = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = oooO00o.getAlignContent();
                if (alignContent == 1) {
                    com.google.android.flexbox.OooO0O0 oooO0O0 = new com.google.android.flexbox.OooO0O0();
                    oooO0O0.f14022OooO0oO = size - sumOfCrossSize;
                    flexLinesInternal.add(0, oooO0O0);
                    return;
                }
                if (alignContent == 2) {
                    oooO00o.setFlexLines(OooO0o0(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size3) {
                        arrayList.add(flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.OooO0O0 oooO0O1 = new com.google.android.flexbox.OooO0O0();
                            if (i4 == flexLinesInternal.size() - 2) {
                                oooO0O1.f14022OooO0oO = Math.round(f + size2);
                                f = 0.0f;
                            } else {
                                oooO0O1.f14022OooO0oO = Math.round(size2);
                            }
                            int i5 = oooO0O1.f14022OooO0oO;
                            float f2 = (size2 - i5) + f;
                            if (f2 > 1.0f) {
                                oooO0O1.f14022OooO0oO = i5 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                oooO0O1.f14022OooO0oO = i5 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(oooO0O1);
                        }
                        i4++;
                    }
                    oooO00o.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        oooO00o.setFlexLines(OooO0o0(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.OooO0O0 oooO0O2 = new com.google.android.flexbox.OooO0O0();
                    oooO0O2.f14022OooO0oO = size4;
                    for (com.google.android.flexbox.OooO0O0 oooO0O3 : flexLinesInternal) {
                        arrayList2.add(oooO0O2);
                        arrayList2.add(oooO0O3);
                        arrayList2.add(oooO0O2);
                    }
                    oooO00o.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size6) {
                        com.google.android.flexbox.OooO0O0 oooO0O4 = flexLinesInternal.get(i4);
                        float f4 = oooO0O4.f14022OooO0oO + size5;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(f4);
                        float f5 = (f4 - iRound) + f3;
                        if (f5 > 1.0f) {
                            iRound++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        oooO0O4.f14022OooO0oO = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    public final void OooO0oo(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        com.google.android.flexbox.OooO00o oooO00o = this.f14033OooO00o;
        int flexItemCount = oooO00o.getFlexItemCount();
        boolean[] zArr = this.f14034OooO0O0;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.f14034OooO0O0 = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.f14034OooO0O0 = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= oooO00o.getFlexItemCount()) {
            return;
        }
        int flexDirection = oooO00o.getFlexDirection();
        int flexDirection2 = oooO00o.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = oooO00o.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = oooO00o.getPaddingLeft();
            paddingRight = oooO00o.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", flexDirection));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = oooO00o.getLargestMainSize();
            }
            paddingLeft = oooO00o.getPaddingTop();
            paddingRight = oooO00o.getPaddingBottom();
        }
        int i4 = paddingRight + paddingLeft;
        int[] iArr = this.f14035OooO0OO;
        List<com.google.android.flexbox.OooO0O0> flexLinesInternal = oooO00o.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            com.google.android.flexbox.OooO0O0 oooO0O0 = flexLinesInternal.get(i5);
            int i6 = oooO0O0.f14021OooO0o0;
            if (i6 < size && oooO0O0.f14032OooOOo0) {
                OooOO0o(i, i2, oooO0O0, size, i4, false);
            } else if (i6 > size && oooO0O0.f14031OooOOo) {
                OooOOo0(i, i2, oooO0O0, size, i4, false);
            }
        }
    }

    public final void OooOO0(int i) {
        long[] jArr = this.f14036OooO0Oo;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f14036OooO0Oo = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f14036OooO0Oo = Arrays.copyOf(jArr, i);
        }
    }

    public final void OooOO0O(int i) {
        long[] jArr = this.f14037OooO0o0;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f14037OooO0o0 = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f14037OooO0o0 = Arrays.copyOf(jArr, i);
        }
    }

    public final void OooOO0o(int i, int i2, com.google.android.flexbox.OooO0O0 oooO0O0, int i3, int i4, boolean z) {
        int i5;
        int i6;
        float f;
        com.google.android.flexbox.OooO00o oooO00o;
        int iMax;
        double d;
        com.google.android.flexbox.OooO00o oooO00o2;
        View view;
        double d2;
        float f2 = oooO0O0.f14024OooOO0;
        if (f2 <= 0.0f || i3 < (i5 = oooO0O0.f14021OooO0o0)) {
            return;
        }
        float f3 = (i3 - i5) / f2;
        oooO0O0.f14021OooO0o0 = i4 + oooO0O0.f14020OooO0o;
        if (!z) {
            oooO0O0.f14022OooO0oO = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z2 = false;
        int i8 = 0;
        float f4 = 0.0f;
        while (i7 < oooO0O0.f14023OooO0oo) {
            int i9 = oooO0O0.f14029OooOOOO + i7;
            com.google.android.flexbox.OooO00o oooO00o3 = this.f14033OooO00o;
            View viewOooO0oO = oooO00o3.OooO0oO(i9);
            if (viewOooO0oO == null || viewOooO0oO.getVisibility() == 8) {
                i6 = i5;
                f = f3;
            } else {
                FlexItem flexItem = (FlexItem) viewOooO0oO.getLayoutParams();
                int flexDirection = oooO00o3.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewOooO0oO.getMeasuredWidth();
                    long[] jArr = this.f14037OooO0o0;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = viewOooO0oO.getMeasuredHeight();
                    long[] jArr2 = this.f14037OooO0o0;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i9] >> 32);
                    }
                    if (this.f14034OooO0O0[i9] || flexItem.Oooo0o0() <= 0.0f) {
                        i6 = i5;
                        f = f3;
                        oooO00o = r1;
                    } else {
                        float fOooo0o0 = (flexItem.Oooo0o0() * f3) + measuredWidth;
                        if (i7 == oooO0O0.f14023OooO0oo - 1) {
                            fOooo0o0 += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(fOooo0o0);
                        if (iRound > flexItem.OooooO0()) {
                            iRound = flexItem.OooooO0();
                            this.f14034OooO0O0[i9] = true;
                            oooO0O0.f14024OooOO0 -= flexItem.Oooo0o0();
                            i6 = i5;
                            f = f3;
                            z2 = true;
                        } else {
                            float f5 = (fOooo0o0 - iRound) + f4;
                            i6 = i5;
                            f = f3;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            } else {
                                f4 = f5;
                            }
                            f4 = (float) d;
                        }
                        int iOooOOO0 = OooOOO0(i2, flexItem, oooO0O0.f14028OooOOO0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, Pow2.MAX_POW2);
                        viewOooO0oO.measure(iMakeMeasureSpec, iOooOOO0);
                        measuredWidth = viewOooO0oO.getMeasuredWidth();
                        measuredHeight = viewOooO0oO.getMeasuredHeight();
                        OooOo0O(viewOooO0oO, i9, iMakeMeasureSpec, iOooOOO0);
                        oooO00o = oooO00o3;
                        oooO00o.OooO0oo(i9, viewOooO0oO);
                    }
                    iMax = Math.max(i8, oooO00o.OooO0o0(viewOooO0oO) + measuredHeight + flexItem.Oooo0() + flexItem.o0O0O00());
                    oooO0O0.f14021OooO0o0 = measuredWidth + flexItem.o000OOo() + flexItem.o0000O00() + oooO0O0.f14021OooO0o0;
                } else {
                    int measuredHeight2 = viewOooO0oO.getMeasuredHeight();
                    long[] jArr3 = this.f14037OooO0o0;
                    if (jArr3 != null) {
                        measuredHeight2 = (int) (jArr3[i9] >> 32);
                    }
                    int measuredWidth2 = viewOooO0oO.getMeasuredWidth();
                    long[] jArr4 = this.f14037OooO0o0;
                    if (jArr4 != null) {
                        measuredWidth2 = (int) jArr4[i9];
                    }
                    if (this.f14034OooO0O0[i9] || flexItem.Oooo0o0() <= 0.0f) {
                        oooO00o2 = oooO00o3;
                        view = viewOooO0oO;
                    } else {
                        float fOooo0o1 = (flexItem.Oooo0o0() * f3) + measuredHeight2;
                        if (i7 == oooO0O0.f14023OooO0oo - 1) {
                            fOooo0o1 += f4;
                            f4 = 0.0f;
                        }
                        int iRound2 = Math.round(fOooo0o1);
                        if (iRound2 > flexItem.o0000O0O()) {
                            iRound2 = flexItem.o0000O0O();
                            this.f14034OooO0O0[i9] = true;
                            oooO0O0.f14024OooOO0 -= flexItem.Oooo0o0();
                            z2 = true;
                        } else {
                            float f6 = (fOooo0o1 - iRound2) + f4;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            } else {
                                f4 = f6;
                            }
                            f4 = (float) d2;
                        }
                        int iOooOOO = OooOOO(i, flexItem, oooO0O0.f14028OooOOO0);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, Pow2.MAX_POW2);
                        viewOooO0oO.measure(iOooOOO, iMakeMeasureSpec2);
                        measuredWidth2 = viewOooO0oO.getMeasuredWidth();
                        int measuredHeight3 = viewOooO0oO.getMeasuredHeight();
                        OooOo0O(viewOooO0oO, i9, iOooOOO, iMakeMeasureSpec2);
                        oooO00o2 = oooO00o3;
                        oooO00o2.OooO0oo(i9, viewOooO0oO);
                        view = viewOooO0oO;
                        measuredHeight2 = measuredHeight3;
                    }
                    iMax = Math.max(i8, oooO00o2.OooO0o0(view) + measuredWidth2 + flexItem.o000OOo() + flexItem.o0000O00());
                    oooO0O0.f14021OooO0o0 = measuredHeight2 + flexItem.Oooo0() + flexItem.o0O0O00() + oooO0O0.f14021OooO0o0;
                    i6 = i5;
                    f = f3;
                }
                oooO0O0.f14022OooO0oO = Math.max(oooO0O0.f14022OooO0oO, iMax);
                i8 = iMax;
            }
            i7++;
            f3 = f;
            i5 = i6;
        }
        int i10 = i5;
        if (!z2 || i10 == oooO0O0.f14021OooO0o0) {
            return;
        }
        OooOO0o(i, i2, oooO0O0, i3, i4, true);
    }

    public final int OooOOO(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.OooO00o oooO00o = this.f14033OooO00o;
        int iOooO0O0 = oooO00o.OooO0O0(i, oooO00o.getPaddingRight() + oooO00o.getPaddingLeft() + flexItem.o000OOo() + flexItem.o0000O00() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iOooO0O0);
        if (size > flexItem.OooooO0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.OooooO0(), View.MeasureSpec.getMode(iOooO0O0));
        }
        return size < flexItem.OooOo() ? View.MeasureSpec.makeMeasureSpec(flexItem.OooOo(), View.MeasureSpec.getMode(iOooO0O0)) : iOooO0O0;
    }

    public final int OooOOO0(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.OooO00o oooO00o = this.f14033OooO00o;
        int iOooO0Oo = oooO00o.OooO0Oo(i, oooO00o.getPaddingBottom() + oooO00o.getPaddingTop() + flexItem.Oooo0() + flexItem.o0O0O00() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iOooO0Oo);
        if (size > flexItem.o0000O0O()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.o0000O0O(), View.MeasureSpec.getMode(iOooO0Oo));
        }
        return size < flexItem.o0000O0() ? View.MeasureSpec.makeMeasureSpec(flexItem.o0000O0(), View.MeasureSpec.getMode(iOooO0Oo)) : iOooO0Oo;
    }

    public final void OooOOOO(View view, com.google.android.flexbox.OooO0O0 oooO0O0, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        com.google.android.flexbox.OooO00o oooO00o = this.f14033OooO00o;
        int alignItems = oooO00o.getAlignItems();
        if (flexItem.OooOOo() != -1) {
            alignItems = flexItem.OooOOo();
        }
        int i5 = oooO0O0.f14022OooO0oO;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (oooO00o.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.o0O0O00(), i3, i6 - flexItem.o0O0O00());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.Oooo0(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.Oooo0());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.Oooo0()) - flexItem.o0O0O00()) / 2;
                if (oooO00o.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (oooO00o.getFlexWrap() != 2) {
                    int iMax = Math.max(oooO0O0.f14026OooOO0o - view.getBaseline(), flexItem.Oooo0());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (oooO0O0.f14026OooOO0o - view.getMeasuredHeight()), flexItem.o0O0O00());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (oooO00o.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.Oooo0(), i3, i4 + flexItem.Oooo0());
        } else {
            view.layout(i, i2 - flexItem.o0O0O00(), i3, i4 - flexItem.o0O0O00());
        }
    }

    public final void OooOOOo(View view, com.google.android.flexbox.OooO0O0 oooO0O0, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f14033OooO00o.getAlignItems();
        if (flexItem.OooOOo() != -1) {
            alignItems = flexItem.OooOOo();
        }
        int i5 = oooO0O0.f14022OooO0oO;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.o0000O00(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.o0000O00(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.o000OOo(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.o000OOo(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iOooO0OO = ((o00O0O.OooO0OO(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - o00O0O.OooO0O0(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - iOooO0OO, i2, i3 - iOooO0OO, i4);
                    return;
                } else {
                    view.layout(i + iOooO0OO, i2, i3 + iOooO0OO, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.o0000O00(), i2, i3 - flexItem.o0000O00(), i4);
        } else {
            view.layout(i + flexItem.o000OOo(), i2, i3 + flexItem.o000OOo(), i4);
        }
    }

    public final void OooOOo0(int i, int i2, com.google.android.flexbox.OooO0O0 oooO0O0, int i3, int i4, boolean z) {
        int iMax;
        int iOooOo;
        com.google.android.flexbox.OooO00o oooO00o;
        View view;
        int iO0000O0;
        int i5 = oooO0O0.f14021OooO0o0;
        float f = oooO0O0.f14025OooOO0O;
        if (f <= 0.0f || i3 > i5) {
            return;
        }
        float f2 = (i5 - i3) / f;
        oooO0O0.f14021OooO0o0 = i4 + oooO0O0.f14020OooO0o;
        if (!z) {
            oooO0O0.f14022OooO0oO = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f3 = 0.0f;
        while (i6 < oooO0O0.f14023OooO0oo) {
            int i8 = oooO0O0.f14029OooOOOO + i6;
            com.google.android.flexbox.OooO00o oooO00o2 = this.f14033OooO00o;
            View viewOooO0oO = oooO00o2.OooO0oO(i8);
            if (viewOooO0oO == null || viewOooO0oO.getVisibility() == 8) {
                f2 = f2;
                z2 = z2;
            } else {
                FlexItem flexItem = (FlexItem) viewOooO0oO.getLayoutParams();
                int flexDirection = oooO00o2.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewOooO0oO.getMeasuredWidth();
                    long[] jArr = this.f14037OooO0o0;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewOooO0oO.getMeasuredHeight();
                    long[] jArr2 = this.f14037OooO0o0;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (this.f14034OooO0O0[i8] || flexItem.OooOo00() <= 0.0f) {
                        f2 = f2;
                        z2 = z2;
                    } else {
                        float fOooOo00 = measuredWidth - (flexItem.OooOo00() * f2);
                        boolean z3 = true;
                        if (i6 == oooO0O0.f14023OooO0oo - 1) {
                            fOooOo00 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(fOooOo00);
                        if (iRound < flexItem.OooOo()) {
                            iOooOo = flexItem.OooOo();
                            this.f14034OooO0O0[i8] = true;
                            oooO0O0.f14025OooOO0O -= flexItem.OooOo00();
                        } else {
                            float f4 = (fOooOo00 - iRound) + f3;
                            boolean z4 = z2;
                            double d = f4;
                            if (d > 1.0d) {
                                iRound++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f4 += 1.0f;
                            }
                            f3 = f4;
                            iOooOo = iRound;
                            z3 = z4;
                        }
                        int iOooOOO0 = OooOOO0(i2, flexItem, oooO0O0.f14028OooOOO0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iOooOo, Pow2.MAX_POW2);
                        r11.measure(iMakeMeasureSpec, iOooOOO0);
                        measuredWidth = r11.getMeasuredWidth();
                        int measuredHeight2 = r11.getMeasuredHeight();
                        OooOo0O(r11, i8, iMakeMeasureSpec, iOooOOO0);
                        oooO00o2.OooO0oo(i8, viewOooO0oO);
                        z2 = z3;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i7, oooO00o2.OooO0o0(r11) + measuredHeight + flexItem.Oooo0() + flexItem.o0O0O00());
                    oooO0O0.f14021OooO0o0 = measuredWidth + flexItem.o000OOo() + flexItem.o0000O00() + oooO0O0.f14021OooO0o0;
                } else {
                    int measuredHeight3 = viewOooO0oO.getMeasuredHeight();
                    long[] jArr3 = this.f14037OooO0o0;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth2 = viewOooO0oO.getMeasuredWidth();
                    long[] jArr4 = this.f14037OooO0o0;
                    if (jArr4 != null) {
                        measuredWidth2 = (int) jArr4[i8];
                    }
                    if (this.f14034OooO0O0[i8] || flexItem.OooOo00() <= 0.0f) {
                        oooO00o = oooO00o2;
                        view = viewOooO0oO;
                    } else {
                        float fOooOo01 = measuredHeight3 - (flexItem.OooOo00() * f2);
                        if (i6 == oooO0O0.f14023OooO0oo - 1) {
                            fOooOo01 += f3;
                            f3 = 0.0f;
                        }
                        int iRound2 = Math.round(fOooOo01);
                        if (iRound2 < flexItem.o0000O0()) {
                            iO0000O0 = flexItem.o0000O0();
                            this.f14034OooO0O0[i8] = true;
                            oooO0O0.f14025OooOO0O -= flexItem.OooOo00();
                            z2 = true;
                        } else {
                            float f5 = (fOooOo01 - iRound2) + f3;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                            f3 = f5;
                            iO0000O0 = iRound2;
                        }
                        int iOooOOO = OooOOO(i, flexItem, oooO0O0.f14028OooOOO0);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iO0000O0, Pow2.MAX_POW2);
                        viewOooO0oO.measure(iOooOOO, iMakeMeasureSpec2);
                        measuredWidth2 = viewOooO0oO.getMeasuredWidth();
                        int measuredHeight4 = viewOooO0oO.getMeasuredHeight();
                        OooOo0O(viewOooO0oO, i8, iOooOOO, iMakeMeasureSpec2);
                        oooO00o = oooO00o2;
                        oooO00o.OooO0oo(i8, viewOooO0oO);
                        view = viewOooO0oO;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, oooO00o.OooO0o0(view) + measuredWidth2 + flexItem.o000OOo() + flexItem.o0000O00());
                    oooO0O0.f14021OooO0o0 = measuredHeight3 + flexItem.Oooo0() + flexItem.o0O0O00() + oooO0O0.f14021OooO0o0;
                    f2 = f2;
                }
                oooO0O0.f14022OooO0oO = Math.max(oooO0O0.f14022OooO0oO, iMax);
                i7 = iMax;
            }
            i6++;
            f2 = f2;
        }
        if (!z2 || i5 == oooO0O0.f14021OooO0o0) {
            return;
        }
        OooOOo0(i, i2, oooO0O0, i3, i4, true);
    }

    public final void OooOOoo(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iO000OOo = (i - flexItem.o000OOo()) - flexItem.o0000O00();
        com.google.android.flexbox.OooO00o oooO00o = this.f14033OooO00o;
        int iMin = Math.min(Math.max(iO000OOo - oooO00o.OooO0o0(view), flexItem.OooOo()), flexItem.OooooO0());
        long[] jArr = this.f14037OooO0o0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), Pow2.MAX_POW2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, Pow2.MAX_POW2);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        OooOo0O(view, i2, iMakeMeasureSpec2, iMakeMeasureSpec);
        oooO00o.OooO0oo(i2, view);
    }

    public final void OooOo0(int i) {
        View viewOooO0oO;
        com.google.android.flexbox.OooO00o oooO00o = this.f14033OooO00o;
        if (i >= oooO00o.getFlexItemCount()) {
            return;
        }
        int flexDirection = oooO00o.getFlexDirection();
        if (oooO00o.getAlignItems() != 4) {
            for (com.google.android.flexbox.OooO0O0 oooO0O0 : oooO00o.getFlexLinesInternal()) {
                for (Integer num : oooO0O0.f14027OooOOO) {
                    View viewOooO0oO2 = oooO00o.OooO0oO(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        OooOo00(viewOooO0oO2, oooO0O0.f14022OooO0oO, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", flexDirection));
                        }
                        OooOOoo(viewOooO0oO2, oooO0O0.f14022OooO0oO, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f14035OooO0OO;
        List<com.google.android.flexbox.OooO0O0> flexLinesInternal = oooO00o.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            com.google.android.flexbox.OooO0O0 oooO0O1 = flexLinesInternal.get(i2);
            int i3 = oooO0O1.f14023OooO0oo;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = oooO0O1.f14029OooOOOO + i4;
                if (i4 < oooO00o.getFlexItemCount() && (viewOooO0oO = oooO00o.OooO0oO(i5)) != null && viewOooO0oO.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewOooO0oO.getLayoutParams();
                    if (flexItem.OooOOo() == -1 || flexItem.OooOOo() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            OooOo00(viewOooO0oO, oooO0O1.f14022OooO0oO, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", flexDirection));
                            }
                            OooOOoo(viewOooO0oO, oooO0O1.f14022OooO0oO, i5);
                        }
                    }
                }
            }
        }
    }

    public final void OooOo00(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iOooo0 = (i - flexItem.Oooo0()) - flexItem.o0O0O00();
        com.google.android.flexbox.OooO00o oooO00o = this.f14033OooO00o;
        int iMin = Math.min(Math.max(iOooo0 - oooO00o.OooO0o0(view), flexItem.o0000O0()), flexItem.o0000O0O());
        long[] jArr = this.f14037OooO0o0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), Pow2.MAX_POW2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, Pow2.MAX_POW2);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        OooOo0O(view, i2, iMakeMeasureSpec, iMakeMeasureSpec2);
        oooO00o.OooO0oo(i2, view);
    }

    public final void OooOo0O(View view, int i, int i2, int i3) {
        long[] jArr = this.f14036OooO0Oo;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.f14037OooO0o0;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
