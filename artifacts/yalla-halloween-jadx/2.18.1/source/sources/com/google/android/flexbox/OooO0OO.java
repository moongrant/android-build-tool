package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o000O0O0.OooOO0;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.google.android.flexbox.OooO00o f15009OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean[] f15010OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public int[] f15011OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public long[] f15012OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public long[] f15013OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<com.google.android.flexbox.OooO0O0> f15014OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f15015OooO0O0;

        public final void OooO00o() {
            this.f15014OooO00o = null;
            this.f15015OooO0O0 = 0;
        }
    }

    public static class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f15016Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f15017Oooo0oO;

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull OooO0O0 oooO0O0) {
            OooO0O0 oooO0O1 = oooO0O0;
            int i = this.f15017Oooo0oO;
            int i2 = oooO0O1.f15017Oooo0oO;
            return i != i2 ? i - i2 : this.f15016Oooo0o - oooO0O1.f15016Oooo0o;
        }

        @NonNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Order{order=");
            sbOooO0o0.append(this.f15017Oooo0oO);
            sbOooO0o0.append(", index=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f15016Oooo0o, '}');
        }
    }

    public OooO0OO(com.google.android.flexbox.OooO00o oooO00o) {
        this.f15009OooO00o = oooO00o;
    }

    public final void OooO(int i) {
        int[] iArr = this.f15011OooO0OO;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f15011OooO0OO = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f15011OooO0OO = Arrays.copyOf(iArr, i);
        }
    }

    public final void OooO00o(List<com.google.android.flexbox.OooO0O0> list, com.google.android.flexbox.OooO0O0 oooO0O0, int i, int i2) {
        oooO0O0.f15004OooOOO0 = i2;
        this.f15009OooO00o.OooO0O0(oooO0O0);
        oooO0O0.f15006OooOOOo = i;
        list.add(oooO0O0);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x020b  */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    public final void OooO0O0(OooO00o oooO00o, int i, int i2, int i3, int i4, int i5, @Nullable List<com.google.android.flexbox.OooO0O0> list) {
        int i6;
        int i7;
        int iOooO0oo;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int minimumHeight;
        int i15;
        boolean zOooO = this.f15009OooO00o.OooO();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<com.google.android.flexbox.OooO0O0> arrayList = list == null ? new ArrayList<>() : list;
        oooO00o.f15014OooO00o = arrayList;
        boolean z3 = i5 == -1;
        int paddingStart = zOooO ? this.f15009OooO00o.getPaddingStart() : this.f15009OooO00o.getPaddingTop();
        int paddingEnd = zOooO ? this.f15009OooO00o.getPaddingEnd() : this.f15009OooO00o.getPaddingBottom();
        int paddingTop = zOooO ? this.f15009OooO00o.getPaddingTop() : this.f15009OooO00o.getPaddingStart();
        int paddingBottom = zOooO ? this.f15009OooO00o.getPaddingBottom() : this.f15009OooO00o.getPaddingEnd();
        com.google.android.flexbox.OooO0O0 oooO0O0 = new com.google.android.flexbox.OooO0O0();
        int i16 = i4;
        oooO0O0.f15005OooOOOO = i16;
        int i17 = paddingStart + paddingEnd;
        oooO0O0.f14997OooO0o0 = i17;
        int flexItemCount = this.f15009OooO00o.getFlexItemCount();
        boolean z4 = z3;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = Integer.MIN_VALUE;
        while (i16 < flexItemCount) {
            int i22 = i18;
            View viewOooO0OO = this.f15009OooO00o.OooO0OO(i16);
            if (viewOooO0OO == null) {
                if (OooOOoo(i16, flexItemCount, oooO0O0)) {
                    OooO00o(arrayList, oooO0O0, i16, i19);
                }
                i6 = i20;
            } else {
                i6 = i20;
                if (viewOooO0OO.getVisibility() != 8) {
                    if (viewOooO0OO instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewOooO0OO;
                        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
                        int iOooo0o = flexItem.Oooo0o();
                        int iO000000o = flexItem.o000000o();
                        Drawable drawableOooO00o = androidx.core.widget.OooO0OO.OooO00o(compoundButton);
                        int minimumWidth = drawableOooO00o == null ? 0 : drawableOooO00o.getMinimumWidth();
                        if (drawableOooO00o == null) {
                            i15 = -1;
                            minimumHeight = 0;
                        } else {
                            minimumHeight = drawableOooO00o.getMinimumHeight();
                            i15 = -1;
                        }
                        if (iOooo0o == i15) {
                            iOooo0o = minimumWidth;
                        }
                        flexItem.OoooOO0(iOooo0o);
                        if (iO000000o == i15) {
                            iO000000o = minimumHeight;
                        }
                        flexItem.OoooooO(iO000000o);
                    }
                    FlexItem flexItem2 = (FlexItem) viewOooO0OO.getLayoutParams();
                    if (flexItem2.OooOoo() == 4) {
                        oooO0O0.f15003OooOOO.add(Integer.valueOf(i16));
                    }
                    int width = zOooO ? flexItem2.getWidth() : flexItem2.getHeight();
                    if (flexItem2.o00oO0o() != -1.0f && mode == 1073741824) {
                        width = Math.round(size * flexItem2.o00oO0o());
                    }
                    if (zOooO) {
                        iOooO0oo = this.f15009OooO00o.OooO0Oo(i, OooOOOo(flexItem2, true) + OooOOo(flexItem2, true) + i17, width);
                        i7 = i2;
                        int iOooO0oo2 = this.f15009OooO00o.OooO0oo(i7, OooOOOO(flexItem2, true) + OooOOo0(flexItem2, true) + paddingTop + paddingBottom + i19, flexItem2.getHeight());
                        viewOooO0OO.measure(iOooO0oo, iOooO0oo2);
                        OooOoOO(i16, iOooO0oo, iOooO0oo2, viewOooO0OO);
                    } else {
                        i7 = i2;
                        int iOooO0Oo = this.f15009OooO00o.OooO0Oo(i7, OooOOOO(flexItem2, false) + OooOOo0(flexItem2, false) + paddingTop + paddingBottom + i19, flexItem2.getWidth());
                        iOooO0oo = this.f15009OooO00o.OooO0oo(i, OooOOOo(flexItem2, false) + OooOOo(flexItem2, false) + i17, width);
                        viewOooO0OO.measure(iOooO0Oo, iOooO0oo);
                        OooOoOO(i16, iOooO0Oo, iOooO0oo, viewOooO0OO);
                    }
                    this.f15009OooO00o.OooO0o0(i16, viewOooO0OO);
                    OooO0OO(viewOooO0OO, i16);
                    int iCombineMeasuredStates = View.combineMeasuredStates(i6, viewOooO0OO.getMeasuredState());
                    int i23 = oooO0O0.f14997OooO0o0;
                    int iOooOOOo = OooOOOo(flexItem2, zOooO) + OooOOo(flexItem2, zOooO) + (zOooO ? viewOooO0OO.getMeasuredWidth() : viewOooO0OO.getMeasuredHeight());
                    int size2 = arrayList.size();
                    if (this.f15009OooO00o.getFlexWrap() != 0) {
                        if (flexItem2.o00000()) {
                            i8 = paddingBottom;
                            i9 = iCombineMeasuredStates;
                            i10 = i22;
                            i11 = size;
                        } else {
                            if (mode == 0) {
                                i8 = paddingBottom;
                                i9 = iCombineMeasuredStates;
                            } else {
                                int maxLine = this.f15009OooO00o.getMaxLine();
                                i8 = paddingBottom;
                                i9 = iCombineMeasuredStates;
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    i10 = i22;
                                    int iOooO0oO = this.f15009OooO00o.OooO0oO(viewOooO0OO, i16, i10);
                                    if (iOooO0oO > 0) {
                                        iOooOOOo += iOooO0oO;
                                    }
                                    i11 = size;
                                    if (i11 < i23 + iOooOOOo) {
                                    }
                                }
                                z = false;
                            }
                            i10 = i22;
                            i11 = size;
                            z = false;
                        }
                        z = true;
                    } else {
                        i8 = paddingBottom;
                        i9 = iCombineMeasuredStates;
                        i10 = i22;
                        i11 = size;
                        z = false;
                    }
                    if (z) {
                        if (oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO > 0) {
                            OooO00o(arrayList, oooO0O0, i16 > 0 ? i16 - 1 : 0, i19);
                            i19 += oooO0O0.f14998OooO0oO;
                        } else {
                            arrayList = arrayList;
                        }
                        if (zOooO) {
                            if (flexItem2.getHeight() == -1) {
                                com.google.android.flexbox.OooO00o oooO00o2 = this.f15009OooO00o;
                                viewOooO0OO.measure(iOooO0oo, oooO00o2.OooO0oo(i7, this.f15009OooO00o.getPaddingBottom() + oooO00o2.getPaddingTop() + flexItem2.OooooOO() + flexItem2.o000oOoO() + i19, flexItem2.getHeight()));
                                OooO0OO(viewOooO0OO, i16);
                            }
                        } else if (flexItem2.getWidth() == -1) {
                            com.google.android.flexbox.OooO00o oooO00o3 = this.f15009OooO00o;
                            viewOooO0OO.measure(oooO00o3.OooO0Oo(i7, this.f15009OooO00o.getPaddingRight() + oooO00o3.getPaddingLeft() + flexItem2.OoooOOO() + flexItem2.o000OOo() + i19, flexItem2.getWidth()), iOooO0oo);
                            OooO0OO(viewOooO0OO, i16);
                        }
                        oooO0O0 = new com.google.android.flexbox.OooO0O0();
                        oooO0O0.f14999OooO0oo = 1;
                        oooO0O0.f14997OooO0o0 = i17;
                        oooO0O0.f15005OooOOOO = i16;
                        i12 = 0;
                        i13 = Integer.MIN_VALUE;
                    } else {
                        arrayList = arrayList;
                        oooO0O0.f14999OooO0oo++;
                        i12 = i10 + 1;
                        i13 = i21;
                    }
                    oooO0O0.f15008OooOOo0 |= flexItem2.ooOO() != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    oooO0O0.f15007OooOOo |= flexItem2.Oooo00o() != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    int[] iArr = this.f15011OooO0OO;
                    if (iArr != null) {
                        iArr[i16] = arrayList.size();
                    }
                    oooO0O0.f14997OooO0o0 = OooOOOo(flexItem2, zOooO) + OooOOo(flexItem2, zOooO) + (zOooO ? viewOooO0OO.getMeasuredWidth() : viewOooO0OO.getMeasuredHeight()) + oooO0O0.f14997OooO0o0;
                    oooO0O0.f15000OooOO0 += flexItem2.ooOO();
                    oooO0O0.f15001OooOO0O += flexItem2.Oooo00o();
                    this.f15009OooO00o.OooO00o(viewOooO0OO, i16, i12, oooO0O0);
                    int iMax = Math.max(i13, this.f15009OooO00o.OooOO0(viewOooO0OO) + OooOOOO(flexItem2, zOooO) + OooOOo0(flexItem2, zOooO) + (zOooO ? viewOooO0OO.getMeasuredHeight() : viewOooO0OO.getMeasuredWidth()));
                    oooO0O0.f14998OooO0oO = Math.max(oooO0O0.f14998OooO0oO, iMax);
                    if (zOooO) {
                        if (this.f15009OooO00o.getFlexWrap() != 2) {
                            oooO0O0.f15002OooOO0o = Math.max(oooO0O0.f15002OooOO0o, viewOooO0OO.getBaseline() + flexItem2.OooooOO());
                        } else {
                            oooO0O0.f15002OooOO0o = Math.max(oooO0O0.f15002OooOO0o, (viewOooO0OO.getMeasuredHeight() - viewOooO0OO.getBaseline()) + flexItem2.o000oOoO());
                        }
                    }
                    i14 = flexItemCount;
                    if (OooOOoo(i16, i14, oooO0O0)) {
                        OooO00o(arrayList, oooO0O0, i16, i19);
                        i19 += oooO0O0.f14998OooO0oO;
                    }
                    if (i5 == -1 || arrayList.size() <= 0 || arrayList.get(arrayList.size() - 1).f15006OooOOOo < i5 || i16 < i5 || z4) {
                        z2 = z4;
                    } else {
                        i19 = -oooO0O0.f14998OooO0oO;
                        z2 = true;
                    }
                    if (i19 > i3 && z2) {
                        i20 = i9;
                        break;
                    }
                    i21 = iMax;
                } else {
                    oooO0O0.f14991OooO++;
                    oooO0O0.f14999OooO0oo++;
                    if (OooOOoo(i16, flexItemCount, oooO0O0)) {
                        OooO00o(arrayList, oooO0O0, i16, i19);
                    }
                }
                i16++;
                size = i11;
                z4 = z2;
                mode = mode;
                paddingBottom = i8;
                i20 = i9;
                List<com.google.android.flexbox.OooO0O0> list2 = arrayList;
                flexItemCount = i14;
                i18 = i12;
                arrayList = list2;
            }
            z2 = z4;
            mode = mode;
            i11 = size;
            i8 = paddingBottom;
            i14 = flexItemCount;
            i9 = i6;
            i7 = i2;
            arrayList = arrayList;
            i12 = i22;
            i16++;
            size = i11;
            z4 = z2;
            mode = mode;
            paddingBottom = i8;
            i20 = i9;
            List<com.google.android.flexbox.OooO0O0> list3 = arrayList;
            flexItemCount = i14;
            i18 = i12;
            arrayList = list3;
        }
        oooO00o.f15015OooO0O0 = i20;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void OooO0OO(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.Oooo0o()) {
            if (measuredWidth > flexItem.o0000O()) {
                measuredWidth = flexItem.o0000O();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.o000000o()) {
                measuredHeight = flexItem.o000000o();
            } else if (measuredHeight > flexItem.o00000O()) {
                measuredHeight = flexItem.o00000O();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                OooOoOO(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f15009OooO00o.OooO0o0(i, view);
            }
        }
        measuredWidth = flexItem.Oooo0o();
        z = true;
        if (measuredHeight < flexItem.o000000o()) {
            measuredHeight = flexItem.o000000o();
        } else if (measuredHeight > flexItem.o00000O()) {
            measuredHeight = flexItem.o00000O();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            OooOoOO(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.f15009OooO00o.OooO0o0(i, view);
        }
    }

    public final void OooO0Oo(List<com.google.android.flexbox.OooO0O0> list, int i) {
        int i2 = this.f15011OooO0OO[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.f15011OooO0OO;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f15012OooO0Oo;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    @NonNull
    public final List<OooO0O0> OooO0o(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f15009OooO00o.OooO0o(i2).getLayoutParams();
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f15017Oooo0oO = flexItem.getOrder();
            oooO0O0.f15016Oooo0o = i2;
            arrayList.add(oooO0O0);
        }
        return arrayList;
    }

    public final List<com.google.android.flexbox.OooO0O0> OooO0o0(List<com.google.android.flexbox.OooO0O0> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.OooO0O0 oooO0O0 = new com.google.android.flexbox.OooO0O0();
        oooO0O0.f14998OooO0oO = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(oooO0O0);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(oooO0O0);
            }
        }
        return arrayList;
    }

    public final void OooO0oO(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.f15009OooO00o.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", flexDirection));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<com.google.android.flexbox.OooO0O0> flexLinesInternal = this.f15009OooO00o.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f15009OooO00o.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f14998OooO0oO = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f15009OooO00o.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    com.google.android.flexbox.OooO0O0 oooO0O0 = new com.google.android.flexbox.OooO0O0();
                    oooO0O0.f14998OooO0oO = i5;
                    flexLinesInternal.add(0, oooO0O0);
                    return;
                }
                if (alignContent == 2) {
                    this.f15009OooO00o.setFlexLines(OooO0o0(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    while (i4 < size4) {
                        arrayList.add(flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.OooO0O0 oooO0O1 = new com.google.android.flexbox.OooO0O0();
                            if (i4 == flexLinesInternal.size() - 2) {
                                oooO0O1.f14998OooO0oO = Math.round(f + size3);
                                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            } else {
                                oooO0O1.f14998OooO0oO = Math.round(size3);
                            }
                            int i6 = oooO0O1.f14998OooO0oO;
                            float f2 = (size3 - i6) + f;
                            if (f2 > 1.0f) {
                                oooO0O1.f14998OooO0oO = i6 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                oooO0O1.f14998OooO0oO = i6 - 1;
                                f2 += 1.0f;
                            }
                            arrayList.add(oooO0O1);
                            f = f2;
                        }
                        i4++;
                    }
                    this.f15009OooO00o.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f15009OooO00o.setFlexLines(OooO0o0(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.OooO0O0 oooO0O2 = new com.google.android.flexbox.OooO0O0();
                    oooO0O2.f14998OooO0oO = size5;
                    for (com.google.android.flexbox.OooO0O0 oooO0O3 : flexLinesInternal) {
                        arrayList2.add(oooO0O2);
                        arrayList2.add(oooO0O3);
                        arrayList2.add(oooO0O2);
                    }
                    this.f15009OooO00o.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    while (i4 < size7) {
                        com.google.android.flexbox.OooO0O0 oooO0O4 = flexLinesInternal.get(i4);
                        float f4 = oooO0O4.f14998OooO0oO + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
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
                        oooO0O4.f14998OooO0oO = iRound;
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
        int flexItemCount = this.f15009OooO00o.getFlexItemCount();
        boolean[] zArr = this.f15010OooO0O0;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.f15010OooO0O0 = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.f15010OooO0O0 = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= this.f15009OooO00o.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f15009OooO00o.getFlexDirection();
        int flexDirection2 = this.f15009OooO00o.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.f15009OooO00o.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.f15009OooO00o.getPaddingLeft();
            paddingRight = this.f15009OooO00o.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", flexDirection));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.f15009OooO00o.getLargestMainSize();
            }
            paddingLeft = this.f15009OooO00o.getPaddingTop();
            paddingRight = this.f15009OooO00o.getPaddingBottom();
        }
        int i4 = paddingRight + paddingLeft;
        int[] iArr = this.f15011OooO0OO;
        List<com.google.android.flexbox.OooO0O0> flexLinesInternal = this.f15009OooO00o.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            com.google.android.flexbox.OooO0O0 oooO0O0 = flexLinesInternal.get(i5);
            int i6 = oooO0O0.f14997OooO0o0;
            if (i6 < size && oooO0O0.f15008OooOOo0) {
                OooOO0o(i, i2, oooO0O0, size, i4, false);
            } else if (i6 > size && oooO0O0.f15007OooOOo) {
                OooOo0O(i, i2, oooO0O0, size, i4, false);
            }
        }
    }

    public final void OooOO0(int i) {
        long[] jArr = this.f15012OooO0Oo;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f15012OooO0Oo = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f15012OooO0Oo = Arrays.copyOf(jArr, i);
        }
    }

    public final void OooOO0O(int i) {
        long[] jArr = this.f15013OooO0o0;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f15013OooO0o0 = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f15013OooO0o0 = Arrays.copyOf(jArr, i);
        }
    }

    public final void OooOO0o(int i, int i2, com.google.android.flexbox.OooO0O0 oooO0O0, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        double d;
        int i7;
        double d2;
        float f = oooO0O0.f15000OooOO0;
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || i3 < (i5 = oooO0O0.f14997OooO0o0)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        oooO0O0.f14997OooO0o0 = i4 + oooO0O0.f14996OooO0o;
        if (!z) {
            oooO0O0.f14998OooO0oO = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        while (i8 < oooO0O0.f14999OooO0oo) {
            int i10 = oooO0O0.f15005OooOOOO + i8;
            View viewOooO0OO = this.f15009OooO00o.OooO0OO(i10);
            if (viewOooO0OO == null || viewOooO0OO.getVisibility() == 8) {
                i6 = i5;
            } else {
                FlexItem flexItem = (FlexItem) viewOooO0OO.getLayoutParams();
                int flexDirection = this.f15009OooO00o.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewOooO0OO.getMeasuredWidth();
                    long[] jArr = this.f15013OooO0o0;
                    i6 = i5;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i10];
                    }
                    int measuredHeight = viewOooO0OO.getMeasuredHeight();
                    long[] jArr2 = this.f15013OooO0o0;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i10] >> 32);
                    }
                    if (!this.f15010OooO0O0[i10] && flexItem.ooOO() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        float fOoOO = (flexItem.ooOO() * f3) + measuredWidth;
                        if (i8 == oooO0O0.f14999OooO0oo - 1) {
                            fOoOO += f4;
                            f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                        int iRound = Math.round(fOoOO);
                        if (iRound > flexItem.o0000O()) {
                            iRound = flexItem.o0000O();
                            this.f15010OooO0O0[i10] = true;
                            oooO0O0.f15000OooOO0 -= flexItem.ooOO();
                            z2 = true;
                        } else {
                            float f5 = (fOoOO - iRound) + f4;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                f4 = f5;
                            }
                            f5 = (float) d;
                            f4 = f5;
                        }
                        int iOooOOO0 = OooOOO0(i2, flexItem, oooO0O0.f15004OooOOO0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewOooO0OO.measure(iMakeMeasureSpec, iOooOOO0);
                        int measuredWidth2 = viewOooO0OO.getMeasuredWidth();
                        int measuredHeight2 = viewOooO0OO.getMeasuredHeight();
                        OooOoOO(i10, iMakeMeasureSpec, iOooOOO0, viewOooO0OO);
                        this.f15009OooO00o.OooO0o0(i10, viewOooO0OO);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, this.f15009OooO00o.OooOO0(viewOooO0OO) + measuredHeight + flexItem.OooooOO() + flexItem.o000oOoO());
                    oooO0O0.f14997OooO0o0 = measuredWidth + flexItem.OoooOOO() + flexItem.o000OOo() + oooO0O0.f14997OooO0o0;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewOooO0OO.getMeasuredHeight();
                    long[] jArr3 = this.f15013OooO0o0;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i10] >> 32);
                    }
                    int measuredWidth3 = viewOooO0OO.getMeasuredWidth();
                    long[] jArr4 = this.f15013OooO0o0;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i10];
                    }
                    if (this.f15010OooO0O0[i10] || flexItem.ooOO() <= f2) {
                        i7 = i5;
                    } else {
                        float fOoOO2 = (flexItem.ooOO() * f3) + measuredHeight3;
                        if (i8 == oooO0O0.f14999OooO0oo - 1) {
                            fOoOO2 += f4;
                            f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                        int iRound2 = Math.round(fOoOO2);
                        if (iRound2 > flexItem.o00000O()) {
                            iRound2 = flexItem.o00000O();
                            this.f15010OooO0O0[i10] = true;
                            oooO0O0.f15000OooOO0 -= flexItem.ooOO();
                            i7 = i5;
                            z2 = true;
                        } else {
                            float f6 = (fOoOO2 - iRound2) + f4;
                            i7 = i5;
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
                        int iOooOOO = OooOOO(i, flexItem, oooO0O0.f15004OooOOO0);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewOooO0OO.measure(iOooOOO, iMakeMeasureSpec2);
                        measuredWidth3 = viewOooO0OO.getMeasuredWidth();
                        int measuredHeight4 = viewOooO0OO.getMeasuredHeight();
                        OooOoOO(i10, iOooOOO, iMakeMeasureSpec2, viewOooO0OO);
                        this.f15009OooO00o.OooO0o0(i10, viewOooO0OO);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, this.f15009OooO00o.OooOO0(viewOooO0OO) + measuredWidth3 + flexItem.OoooOOO() + flexItem.o000OOo());
                    oooO0O0.f14997OooO0o0 = measuredHeight3 + flexItem.OooooOO() + flexItem.o000oOoO() + oooO0O0.f14997OooO0o0;
                    i6 = i7;
                }
                oooO0O0.f14998OooO0oO = Math.max(oooO0O0.f14998OooO0oO, iMax);
                i9 = iMax;
            }
            i8++;
            i5 = i6;
            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        int i11 = i5;
        if (!z2 || i11 == oooO0O0.f14997OooO0o0) {
            return;
        }
        OooOO0o(i, i2, oooO0O0, i3, i4, true);
    }

    public final int OooOOO(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.OooO00o oooO00o = this.f15009OooO00o;
        int iOooO0Oo = oooO00o.OooO0Oo(i, this.f15009OooO00o.getPaddingRight() + oooO00o.getPaddingLeft() + flexItem.OoooOOO() + flexItem.o000OOo() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iOooO0Oo);
        if (size > flexItem.o0000O()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.o0000O(), View.MeasureSpec.getMode(iOooO0Oo));
        }
        return size < flexItem.Oooo0o() ? View.MeasureSpec.makeMeasureSpec(flexItem.Oooo0o(), View.MeasureSpec.getMode(iOooO0Oo)) : iOooO0Oo;
    }

    public final int OooOOO0(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.OooO00o oooO00o = this.f15009OooO00o;
        int iOooO0oo = oooO00o.OooO0oo(i, this.f15009OooO00o.getPaddingBottom() + oooO00o.getPaddingTop() + flexItem.OooooOO() + flexItem.o000oOoO() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iOooO0oo);
        if (size > flexItem.o00000O()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.o00000O(), View.MeasureSpec.getMode(iOooO0oo));
        }
        return size < flexItem.o000000o() ? View.MeasureSpec.makeMeasureSpec(flexItem.o000000o(), View.MeasureSpec.getMode(iOooO0oo)) : iOooO0oo;
    }

    public final int OooOOOO(FlexItem flexItem, boolean z) {
        return z ? flexItem.o000oOoO() : flexItem.o000OOo();
    }

    public final int OooOOOo(FlexItem flexItem, boolean z) {
        return z ? flexItem.o000OOo() : flexItem.o000oOoO();
    }

    public final int OooOOo(FlexItem flexItem, boolean z) {
        return z ? flexItem.OoooOOO() : flexItem.OooooOO();
    }

    public final int OooOOo0(FlexItem flexItem, boolean z) {
        return z ? flexItem.OooooOO() : flexItem.OoooOOO();
    }

    public final boolean OooOOoo(int i, int i2, com.google.android.flexbox.OooO0O0 oooO0O0) {
        return i == i2 - 1 && oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO != 0;
    }

    public final void OooOo(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.OoooOOO()) - flexItem.o000OOo()) - this.f15009OooO00o.OooOO0(view), flexItem.Oooo0o()), flexItem.o0000O());
        long[] jArr = this.f15013OooO0o0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        OooOoOO(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.f15009OooO00o.OooO0o0(i2, view);
    }

    public final void OooOo0(View view, com.google.android.flexbox.OooO0O0 oooO0O0, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f15009OooO00o.getAlignItems();
        if (flexItem.OooOoo() != -1) {
            alignItems = flexItem.OooOoo();
        }
        int i5 = oooO0O0.f14998OooO0oO;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.o000OOo(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.o000OOo(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.OoooOOO(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.OoooOOO(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iOooO0OO = ((OooOO0.OooO0OO(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - OooOO0.OooO0O0(marginLayoutParams)) / 2;
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
            view.layout(i - flexItem.o000OOo(), i2, i3 - flexItem.o000OOo(), i4);
        } else {
            view.layout(i + flexItem.OoooOOO(), i2, i3 + flexItem.OoooOOO(), i4);
        }
    }

    public final void OooOo00(View view, com.google.android.flexbox.OooO0O0 oooO0O0, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f15009OooO00o.getAlignItems();
        if (flexItem.OooOoo() != -1) {
            alignItems = flexItem.OooOoo();
        }
        int i5 = oooO0O0.f14998OooO0oO;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f15009OooO00o.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.o000oOoO(), i3, i6 - flexItem.o000oOoO());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.OooooOO(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.OooooOO());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.OooooOO()) - flexItem.o000oOoO()) / 2;
                if (this.f15009OooO00o.getFlexWrap() != 2) {
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
                if (this.f15009OooO00o.getFlexWrap() != 2) {
                    int iMax = Math.max(oooO0O0.f15002OooOO0o - view.getBaseline(), flexItem.OooooOO());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (oooO0O0.f15002OooOO0o - view.getMeasuredHeight()), flexItem.o000oOoO());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f15009OooO00o.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.OooooOO(), i3, i4 + flexItem.OooooOO());
        } else {
            view.layout(i, i2 - flexItem.o000oOoO(), i3, i4 - flexItem.o000oOoO());
        }
    }

    public final void OooOo0O(int i, int i2, com.google.android.flexbox.OooO0O0 oooO0O0, int i3, int i4, boolean z) {
        int iMax;
        int iOooo0o;
        int i5 = oooO0O0.f14997OooO0o0;
        float f = oooO0O0.f15001OooOO0O;
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || i3 > i5) {
            return;
        }
        float f3 = (i5 - i3) / f;
        oooO0O0.f14997OooO0o0 = i4 + oooO0O0.f14996OooO0o;
        if (!z) {
            oooO0O0.f14998OooO0oO = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        while (i6 < oooO0O0.f14999OooO0oo) {
            int i8 = oooO0O0.f15005OooOOOO + i6;
            View viewOooO0OO = this.f15009OooO00o.OooO0OO(i8);
            if (viewOooO0OO == null || viewOooO0OO.getVisibility() == 8) {
                i5 = i5;
                i6 = i6;
            } else {
                FlexItem flexItem = (FlexItem) viewOooO0OO.getLayoutParams();
                int flexDirection = this.f15009OooO00o.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i5;
                    i6 = i6;
                    int measuredWidth = viewOooO0OO.getMeasuredWidth();
                    long[] jArr = this.f15013OooO0o0;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewOooO0OO.getMeasuredHeight();
                    long[] jArr2 = this.f15013OooO0o0;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.f15010OooO0O0[i8] && flexItem.Oooo00o() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        float fOooo00o = measuredWidth - (flexItem.Oooo00o() * f3);
                        if (i6 == oooO0O0.f14999OooO0oo - 1) {
                            fOooo00o += f4;
                            f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                        int iRound = Math.round(fOooo00o);
                        if (iRound < flexItem.Oooo0o()) {
                            iOooo0o = flexItem.Oooo0o();
                            this.f15010OooO0O0[i8] = true;
                            oooO0O0.f15001OooOO0O -= flexItem.Oooo00o();
                            z2 = true;
                        } else {
                            float f5 = (fOooo00o - iRound) + f4;
                            double d = f5;
                            if (d > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                            f4 = f5;
                            iOooo0o = iRound;
                        }
                        int iOooOOO0 = OooOOO0(i2, flexItem, oooO0O0.f15004OooOOO0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iOooo0o, 1073741824);
                        viewOooO0OO.measure(iMakeMeasureSpec, iOooOOO0);
                        int measuredWidth2 = viewOooO0OO.getMeasuredWidth();
                        int measuredHeight2 = viewOooO0OO.getMeasuredHeight();
                        OooOoOO(i8, iMakeMeasureSpec, iOooOOO0, viewOooO0OO);
                        this.f15009OooO00o.OooO0o0(i8, viewOooO0OO);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, this.f15009OooO00o.OooOO0(viewOooO0OO) + measuredHeight + flexItem.OooooOO() + flexItem.o000oOoO());
                    oooO0O0.f14997OooO0o0 = measuredWidth + flexItem.OoooOOO() + flexItem.o000OOo() + oooO0O0.f14997OooO0o0;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewOooO0OO.getMeasuredHeight();
                    long[] jArr3 = this.f15013OooO0o0;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewOooO0OO.getMeasuredWidth();
                    long[] jArr4 = this.f15013OooO0o0;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (this.f15010OooO0O0[i8] || flexItem.Oooo00o() <= f2) {
                        i5 = i5;
                        i6 = i6;
                    } else {
                        float fOooo00o2 = measuredHeight3 - (flexItem.Oooo00o() * f3);
                        if (i6 == oooO0O0.f14999OooO0oo - 1) {
                            fOooo00o2 += f4;
                            f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                        int iRound2 = Math.round(fOooo00o2);
                        if (iRound2 < flexItem.o000000o()) {
                            int iO000000o = flexItem.o000000o();
                            this.f15010OooO0O0[i8] = true;
                            oooO0O0.f15001OooOO0O -= flexItem.Oooo00o();
                            iRound2 = iO000000o;
                            z2 = true;
                        } else {
                            float f6 = (fOooo00o2 - iRound2) + f4;
                            double d2 = f6;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f6 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f6 += 1.0f;
                            }
                            f4 = f6;
                        }
                        int iOooOOO = OooOOO(i, flexItem, oooO0O0.f15004OooOOO0);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewOooO0OO.measure(iOooOOO, iMakeMeasureSpec2);
                        measuredWidth3 = viewOooO0OO.getMeasuredWidth();
                        int measuredHeight4 = viewOooO0OO.getMeasuredHeight();
                        OooOoOO(i8, iOooOOO, iMakeMeasureSpec2, viewOooO0OO);
                        this.f15009OooO00o.OooO0o0(i8, viewOooO0OO);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, this.f15009OooO00o.OooOO0(viewOooO0OO) + measuredWidth3 + flexItem.OoooOOO() + flexItem.o000OOo());
                    oooO0O0.f14997OooO0o0 = measuredHeight3 + flexItem.OooooOO() + flexItem.o000oOoO() + oooO0O0.f14997OooO0o0;
                }
                oooO0O0.f14998OooO0oO = Math.max(oooO0O0.f14998OooO0oO, iMax);
                i7 = iMax;
            }
            i6++;
            i5 = i5;
            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        int i9 = i5;
        if (!z2 || i9 == oooO0O0.f14997OooO0o0) {
            return;
        }
        OooOo0O(i, i2, oooO0O0, i3, i4, true);
    }

    public final int[] OooOo0o(int i, List<OooO0O0> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (OooO0O0 oooO0O0 : list) {
            int i3 = oooO0O0.f15016Oooo0o;
            iArr[i2] = i3;
            sparseIntArray.append(i3, oooO0O0.f15017Oooo0oO);
            i2++;
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    public final void OooOoO(int i) {
        View viewOooO0OO;
        if (i >= this.f15009OooO00o.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f15009OooO00o.getFlexDirection();
        if (this.f15009OooO00o.getAlignItems() != 4) {
            for (com.google.android.flexbox.OooO0O0 oooO0O0 : this.f15009OooO00o.getFlexLinesInternal()) {
                for (Integer num : oooO0O0.f15003OooOOO) {
                    View viewOooO0OO2 = this.f15009OooO00o.OooO0OO(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        OooOoO0(viewOooO0OO2, oooO0O0.f14998OooO0oO, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", flexDirection));
                        }
                        OooOo(viewOooO0OO2, oooO0O0.f14998OooO0oO, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f15011OooO0OO;
        List<com.google.android.flexbox.OooO0O0> flexLinesInternal = this.f15009OooO00o.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            com.google.android.flexbox.OooO0O0 oooO0O1 = flexLinesInternal.get(i2);
            int i3 = oooO0O1.f14999OooO0oo;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = oooO0O1.f15005OooOOOO + i4;
                if (i4 < this.f15009OooO00o.getFlexItemCount() && (viewOooO0OO = this.f15009OooO00o.OooO0OO(i5)) != null && viewOooO0OO.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewOooO0OO.getLayoutParams();
                    if (flexItem.OooOoo() == -1 || flexItem.OooOoo() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            OooOoO0(viewOooO0OO, oooO0O1.f14998OooO0oO, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", flexDirection));
                            }
                            OooOo(viewOooO0OO, oooO0O1.f14998OooO0oO, i5);
                        }
                    }
                }
            }
        }
    }

    public final void OooOoO0(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.OooooOO()) - flexItem.o000oOoO()) - this.f15009OooO00o.OooOO0(view), flexItem.o000000o()), flexItem.o00000O());
        long[] jArr = this.f15013OooO0o0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        OooOoOO(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.f15009OooO00o.OooO0o0(i2, view);
    }

    public final void OooOoOO(int i, int i2, int i3, View view) {
        long[] jArr = this.f15012OooO0Oo;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.f15013OooO0o0;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
