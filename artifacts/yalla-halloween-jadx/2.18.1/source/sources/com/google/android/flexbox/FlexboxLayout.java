package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f14910Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f14911Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f14912Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f14913Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public Drawable f14914OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f14915OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f14916OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Drawable f14917OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f14918OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f14919OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f14920OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int[] f14921OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public SparseIntArray f14922OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public OooO0OO f14923OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public List<OooO0O0> f14924Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooO0OO.OooO00o f14925Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f14926o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final boolean OooO() {
        int i = this.f14911Oooo0o;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO00o(View view, int i, int i2, OooO0O0 oooO0O0) {
        if (OooOOOo(i, i2)) {
            if (OooO()) {
                int i3 = oooO0O0.f14997OooO0o0;
                int i4 = this.f14920OoooOOo;
                oooO0O0.f14997OooO0o0 = i3 + i4;
                oooO0O0.f14996OooO0o += i4;
                return;
            }
            int i5 = oooO0O0.f14997OooO0o0;
            int i6 = this.f14919OoooOOO;
            oooO0O0.f14997OooO0o0 = i5 + i6;
            oooO0O0.f14996OooO0o += i6;
        }
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO0O0(OooO0O0 oooO0O0) {
        if (OooO()) {
            if ((this.f14926o000oOoO & 4) > 0) {
                int i = oooO0O0.f14997OooO0o0;
                int i2 = this.f14920OoooOOo;
                oooO0O0.f14997OooO0o0 = i + i2;
                oooO0O0.f14996OooO0o += i2;
                return;
            }
            return;
        }
        if ((this.f14918OoooOO0 & 4) > 0) {
            int i3 = oooO0O0.f14997OooO0o0;
            int i4 = this.f14919OoooOOO;
            oooO0O0.f14997OooO0o0 = i3 + i4;
            oooO0O0.f14996OooO0o += i4;
        }
    }

    @Override // com.google.android.flexbox.OooO00o
    public final View OooO0OO(int i) {
        return OooOOOO(i);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0Oo(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final View OooO0o(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO0o0(int i, View view) {
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0oO(View view, int i, int i2) {
        int i3;
        int i4;
        if (OooO()) {
            i3 = OooOOOo(i, i2) ? 0 + this.f14920OoooOOo : 0;
            if ((this.f14926o000oOoO & 4) <= 0) {
                return i3;
            }
            i4 = this.f14920OoooOOo;
        } else {
            i3 = OooOOOo(i, i2) ? 0 + this.f14919OoooOOO : 0;
            if ((this.f14918OoooOO0 & 4) <= 0) {
                return i3;
            }
            i4 = this.f14919OoooOOO;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0oo(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooOO0(View view) {
        return 0;
    }

    public final void OooOO0O(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f14924Ooooo00.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f14924Ooooo00.get(i);
            for (int i2 = 0; i2 < oooO0O0.f14999OooO0oo; i2++) {
                int i3 = oooO0O0.f15005OooOOOO + i2;
                View viewOooOOOO = OooOOOO(i3);
                if (viewOooOOOO != null && viewOooOOOO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                    if (OooOOOo(i3, i2)) {
                        OooOOO(canvas, z ? viewOooOOOO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewOooOOOO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f14920OoooOOo, oooO0O0.f14993OooO0O0, oooO0O0.f14998OooO0oO);
                    }
                    if (i2 == oooO0O0.f14999OooO0oo - 1 && (this.f14926o000oOoO & 4) > 0) {
                        OooOOO(canvas, z ? (viewOooOOOO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f14920OoooOOo : viewOooOOOO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, oooO0O0.f14993OooO0O0, oooO0O0.f14998OooO0oO);
                    }
                }
            }
            if (OooOOo0(i)) {
                OooOOO0(canvas, paddingLeft, z2 ? oooO0O0.f14995OooO0Oo : oooO0O0.f14993OooO0O0 - this.f14919OoooOOO, iMax);
            }
            if (OooOOo(i) && (this.f14918OoooOO0 & 4) > 0) {
                OooOOO0(canvas, paddingLeft, z2 ? oooO0O0.f14993OooO0O0 - this.f14919OoooOOO : oooO0O0.f14995OooO0Oo, iMax);
            }
        }
    }

    public final void OooOO0o(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f14924Ooooo00.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f14924Ooooo00.get(i);
            for (int i2 = 0; i2 < oooO0O0.f14999OooO0oo; i2++) {
                int i3 = oooO0O0.f15005OooOOOO + i2;
                View viewOooOOOO = OooOOOO(i3);
                if (viewOooOOOO != null && viewOooOOOO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                    if (OooOOOo(i3, i2)) {
                        OooOOO0(canvas, oooO0O0.f14992OooO00o, z2 ? viewOooOOOO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewOooOOOO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f14919OoooOOO, oooO0O0.f14998OooO0oO);
                    }
                    if (i2 == oooO0O0.f14999OooO0oo - 1 && (this.f14918OoooOO0 & 4) > 0) {
                        OooOOO0(canvas, oooO0O0.f14992OooO00o, z2 ? (viewOooOOOO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f14919OoooOOO : viewOooOOOO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, oooO0O0.f14998OooO0oO);
                    }
                }
            }
            if (OooOOo0(i)) {
                OooOOO(canvas, z ? oooO0O0.f14994OooO0OO : oooO0O0.f14992OooO00o - this.f14920OoooOOo, paddingTop, iMax);
            }
            if (OooOOo(i) && (this.f14926o000oOoO & 4) > 0) {
                OooOOO(canvas, z ? oooO0O0.f14992OooO00o - this.f14920OoooOOo : oooO0O0.f14994OooO0OO, paddingTop, iMax);
            }
        }
    }

    public final void OooOOO(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f14914OoooO;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f14920OoooOOo + i, i3 + i2);
        this.f14914OoooO.draw(canvas);
    }

    public final void OooOOO0(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f14917OoooO0O;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f14919OoooOOO + i2);
        this.f14917OoooO0O.draw(canvas);
    }

    public final View OooOOOO(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f14921OoooOo0;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final boolean OooOOOo(int i, int i2) {
        boolean z;
        int i3 = 1;
        while (true) {
            if (i3 > i2) {
                z = true;
                break;
            }
            View viewOooOOOO = OooOOOO(i - i3);
            if (viewOooOOOO != null && viewOooOOOO.getVisibility() != 8) {
                z = false;
                break;
            }
            i3++;
        }
        if (z) {
            if (OooO()) {
                return (this.f14926o000oOoO & 1) != 0;
            }
            return (this.f14918OoooOO0 & 1) != 0;
        }
        if (OooO()) {
            return (this.f14926o000oOoO & 2) != 0;
        }
        return (this.f14918OoooOO0 & 2) != 0;
    }

    public final boolean OooOOo(int i) {
        if (i < 0 || i >= this.f14924Ooooo00.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f14924Ooooo00.size(); i2++) {
            OooO0O0 oooO0O0 = this.f14924Ooooo00.get(i2);
            if (oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO > 0) {
                return false;
            }
        }
        if (OooO()) {
            return (this.f14918OoooOO0 & 4) != 0;
        }
        return (this.f14926o000oOoO & 4) != 0;
    }

    public final boolean OooOOo0(int i) {
        boolean z;
        if (i < 0 || i >= this.f14924Ooooo00.size()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            OooO0O0 oooO0O0 = this.f14924Ooooo00.get(i2);
            if (oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO > 0) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            if (OooO()) {
                return (this.f14918OoooOO0 & 1) != 0;
            }
            return (this.f14926o000oOoO & 1) != 0;
        }
        if (OooO()) {
            return (this.f14918OoooOO0 & 2) != 0;
        }
        return (this.f14926o000oOoO & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f5  */
    public final void OooOOoo(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        View viewOooOOOO;
        int i6;
        int i7;
        float f4;
        float f5;
        int i8;
        LayoutParams layoutParams;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i9 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f14924Ooooo00.size();
        int i10 = 0;
        while (i10 < size) {
            OooO0O0 oooO0O0 = this.f14924Ooooo00.get(i10);
            if (OooOOo0(i10)) {
                int i11 = this.f14919OoooOOO;
                paddingBottom -= i11;
                paddingTop += i11;
            }
            int i12 = this.f14913Oooo0oo;
            int i13 = 1;
            if (i12 == 0) {
                f = paddingLeft;
                f2 = i9 - paddingRight;
            } else if (i12 != 1) {
                if (i12 == 2) {
                    int i14 = oooO0O0.f14997OooO0o0;
                    f2 = (i9 - paddingRight) - ((i9 - i14) / 2.0f);
                    f = ((i9 - i14) / 2.0f) + paddingLeft;
                } else if (i12 == 3) {
                    f = paddingLeft;
                    int i15 = oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO;
                    f3 = (i9 - oooO0O0.f14997OooO0o0) / (i15 != 1 ? i15 - 1 : 1.0f);
                    f2 = i9 - paddingRight;
                } else if (i12 == 4) {
                    int i16 = oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO;
                    f3 = i16 != 0 ? (i9 - oooO0O0.f14997OooO0o0) / i16 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    float f6 = f3 / 2.0f;
                    f = paddingLeft + f6;
                    f2 = (i9 - paddingRight) - f6;
                } else {
                    if (i12 != 5) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid justifyContent is set: ");
                        sbOooO0o0.append(this.f14913Oooo0oo);
                        throw new IllegalStateException(sbOooO0o0.toString());
                    }
                    int i17 = oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO;
                    f3 = i17 != 0 ? (i9 - oooO0O0.f14997OooO0o0) / (i17 + 1) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    f = paddingLeft + f3;
                    f2 = (i9 - paddingRight) - f3;
                }
                float fMax = Math.max(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                i5 = 0;
                while (i5 < oooO0O0.f14999OooO0oo) {
                    int i18 = oooO0O0.f15005OooOOOO + i5;
                    viewOooOOOO = OooOOOO(i18);
                    if (viewOooOOOO != null || viewOooOOOO.getVisibility() == 8) {
                        i6 = paddingLeft;
                        i7 = i5;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewOooOOOO.getLayoutParams();
                        float f7 = f + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        float f8 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (OooOOOo(i18, i5)) {
                            int i19 = this.f14920OoooOOo;
                            float f9 = i19;
                            f4 = f7 + f9;
                            i8 = i19;
                            f5 = f8 - f9;
                        } else {
                            f4 = f7;
                            f5 = f8;
                            i8 = 0;
                        }
                        int i20 = (i5 != oooO0O0.f14999OooO0oo - i13 || (this.f14926o000oOoO & 4) <= 0) ? 0 : this.f14920OoooOOo;
                        if (this.f14912Oooo0oO != 2) {
                            i6 = paddingLeft;
                            layoutParams = layoutParams2;
                            i7 = i5;
                            if (z) {
                                this.f14923OoooOoo.OooOo00(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingTop, Math.round(f5), viewOooOOOO.getMeasuredHeight() + paddingTop);
                            } else {
                                this.f14923OoooOoo.OooOo00(viewOooOOOO, oooO0O0, Math.round(f4), paddingTop, viewOooOOOO.getMeasuredWidth() + Math.round(f4), viewOooOOOO.getMeasuredHeight() + paddingTop);
                            }
                        } else if (z) {
                            i6 = paddingLeft;
                            layoutParams = layoutParams2;
                            i7 = i5;
                            this.f14923OoooOoo.OooOo00(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingBottom - viewOooOOOO.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            i6 = paddingLeft;
                            layoutParams = layoutParams2;
                            i7 = i5;
                            this.f14923OoooOoo.OooOo00(viewOooOOOO, oooO0O0, Math.round(f4), paddingBottom - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + Math.round(f4), paddingBottom);
                        }
                        float measuredWidth = viewOooOOOO.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + f4;
                        float measuredWidth2 = f5 - ((viewOooOOOO.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                        if (z) {
                            oooO0O0.OooO00o(viewOooOOOO, i20, 0, i8, 0);
                        } else {
                            oooO0O0.OooO00o(viewOooOOOO, i8, 0, i20, 0);
                        }
                        f = measuredWidth;
                        f2 = measuredWidth2;
                    }
                    i5 = i7 + 1;
                    i13 = 1;
                    paddingLeft = i6;
                }
                int i21 = paddingLeft;
                int i22 = oooO0O0.f14998OooO0oO;
                paddingTop += i22;
                paddingBottom -= i22;
                i10++;
                paddingLeft = i21;
            } else {
                int i23 = oooO0O0.f14997OooO0o0;
                f2 = i23 - paddingLeft;
                f = (i9 - i23) + paddingRight;
            }
            f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float fMax2 = Math.max(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            i5 = 0;
            while (i5 < oooO0O0.f14999OooO0oo) {
                int i110 = oooO0O0.f15005OooOOOO + i5;
                viewOooOOOO = OooOOOO(i110);
                if (viewOooOOOO != null) {
                    i6 = paddingLeft;
                    i7 = i5;
                } else {
                    i6 = paddingLeft;
                    i7 = i5;
                }
                i5 = i7 + 1;
                i13 = 1;
                paddingLeft = i6;
            }
            int i24 = paddingLeft;
            int i25 = oooO0O0.f14998OooO0oO;
            paddingTop += i25;
            paddingBottom -= i25;
            i10++;
            paddingLeft = i24;
        }
    }

    public final void OooOo0(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flex direction: ", i));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Unknown width mode is set: ", mode));
            }
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Unknown height mode is set: ", mode2));
            }
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f6  */
    public final void OooOo00(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        float f4;
        int i6;
        View viewOooOOOO;
        int i7;
        float f5;
        float f6;
        int i8;
        LayoutParams layoutParams;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int i10 = (i3 - i) - paddingRight;
        int size = this.f14924Ooooo00.size();
        for (int i11 = 0; i11 < size; i11++) {
            OooO0O0 oooO0O0 = this.f14924Ooooo00.get(i11);
            if (OooOOo0(i11)) {
                int i12 = this.f14920OoooOOo;
                paddingLeft += i12;
                i10 -= i12;
            }
            int i13 = this.f14913Oooo0oo;
            if (i13 != 0) {
                if (i13 == 1) {
                    int i14 = oooO0O0.f14997OooO0o0;
                    f = (i9 - i14) + paddingBottom;
                    i5 = i14 - paddingTop;
                } else if (i13 == 2) {
                    int i15 = oooO0O0.f14997OooO0o0;
                    f2 = (i9 - paddingBottom) - ((i9 - i15) / 2.0f);
                    f3 = ((i9 - i15) / 2.0f) + paddingTop;
                    f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else if (i13 == 3) {
                    f3 = paddingTop;
                    int i16 = oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO;
                    f4 = (i9 - oooO0O0.f14997OooO0o0) / (i16 != 1 ? i16 - 1 : 1.0f);
                    f2 = i9 - paddingBottom;
                } else if (i13 == 4) {
                    int i17 = oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO;
                    f4 = i17 != 0 ? (i9 - oooO0O0.f14997OooO0o0) / i17 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    float f7 = f4 / 2.0f;
                    f3 = paddingTop + f7;
                    f2 = (i9 - paddingBottom) - f7;
                } else {
                    if (i13 != 5) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid justifyContent is set: ");
                        sbOooO0o0.append(this.f14913Oooo0oo);
                        throw new IllegalStateException(sbOooO0o0.toString());
                    }
                    int i18 = oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO;
                    f4 = i18 != 0 ? (i9 - oooO0O0.f14997OooO0o0) / (i18 + 1) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    f3 = paddingTop + f4;
                    f2 = (i9 - paddingBottom) - f4;
                }
                float fMax = Math.max(f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                i6 = 0;
                while (i6 < oooO0O0.f14999OooO0oo) {
                    int i19 = oooO0O0.f15005OooOOOO + i6;
                    viewOooOOOO = OooOOOO(i19);
                    if (viewOooOOOO != null || viewOooOOOO.getVisibility() == 8) {
                        i7 = i6;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewOooOOOO.getLayoutParams();
                        float f8 = f3 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        float f9 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (OooOOOo(i19, i6)) {
                            int i20 = this.f14919OoooOOO;
                            float f10 = i20;
                            f5 = f8 + f10;
                            i8 = i20;
                            f6 = f9 - f10;
                        } else {
                            f5 = f8;
                            f6 = f9;
                            i8 = 0;
                        }
                        int i21 = (i6 != oooO0O0.f14999OooO0oo + (-1) || (this.f14918OoooOO0 & 4) <= 0) ? 0 : this.f14919OoooOOO;
                        if (!z) {
                            layoutParams = layoutParams2;
                            i7 = i6;
                            if (z2) {
                                this.f14923OoooOoo.OooOo0(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f6) - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + paddingLeft, Math.round(f6));
                            } else {
                                this.f14923OoooOoo.OooOo0(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f5), viewOooOOOO.getMeasuredWidth() + paddingLeft, viewOooOOOO.getMeasuredHeight() + Math.round(f5));
                            }
                        } else if (z2) {
                            layoutParams = layoutParams2;
                            i7 = i6;
                            this.f14923OoooOoo.OooOo0(viewOooOOOO, oooO0O0, true, i10 - viewOooOOOO.getMeasuredWidth(), Math.round(f6) - viewOooOOOO.getMeasuredHeight(), i10, Math.round(f6));
                        } else {
                            layoutParams = layoutParams2;
                            i7 = i6;
                            this.f14923OoooOoo.OooOo0(viewOooOOOO, oooO0O0, true, i10 - viewOooOOOO.getMeasuredWidth(), Math.round(f5), i10, viewOooOOOO.getMeasuredHeight() + Math.round(f5));
                        }
                        LayoutParams layoutParams3 = layoutParams;
                        float measuredHeight = viewOooOOOO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + f5;
                        float measuredHeight2 = f6 - ((viewOooOOOO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                        if (z2) {
                            oooO0O0.OooO00o(viewOooOOOO, 0, i21, 0, i8);
                        } else {
                            oooO0O0.OooO00o(viewOooOOOO, 0, i8, 0, i21);
                        }
                        f3 = measuredHeight;
                        f2 = measuredHeight2;
                    }
                    i6 = i7 + 1;
                }
                int i22 = oooO0O0.f14998OooO0oO;
                paddingLeft += i22;
                i10 -= i22;
            } else {
                f = paddingTop;
                i5 = i9 - paddingBottom;
            }
            f2 = i5;
            f3 = f;
            f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float fMax2 = Math.max(f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            i6 = 0;
            while (i6 < oooO0O0.f14999OooO0oo) {
                int i110 = oooO0O0.f15005OooOOOO + i6;
                viewOooOOOO = OooOOOO(i110);
                if (viewOooOOOO != null) {
                    i7 = i6;
                } else {
                    i7 = i6;
                }
                i6 = i7 + 1;
            }
            int i23 = oooO0O0.f14998OooO0oO;
            paddingLeft += i23;
            i10 -= i23;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f14922OoooOoO == null) {
            this.f14922OoooOoO = new SparseIntArray(getChildCount());
        }
        OooO0OO oooO0OO = this.f14923OoooOoo;
        SparseIntArray sparseIntArray = this.f14922OoooOoO;
        int flexItemCount = oooO0OO.f15009OooO00o.getFlexItemCount();
        List<OooO0OO.OooO0O0> listOooO0o = oooO0OO.OooO0o(flexItemCount);
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            oooO0O0.f15017Oooo0oO = 1;
        } else {
            oooO0O0.f15017Oooo0oO = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= oooO0OO.f15009OooO00o.getFlexItemCount()) {
            oooO0O0.f15016Oooo0o = flexItemCount;
        } else {
            oooO0O0.f15016Oooo0o = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((OooO0OO.OooO0O0) ((ArrayList) listOooO0o).get(i2)).f15016Oooo0o++;
            }
        }
        ((ArrayList) listOooO0o).add(oooO0O0);
        this.f14921OoooOo0 = oooO0OO.OooOo0o(flexItemCount + 1, listOooO0o, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getAlignContent() {
        return this.f14916OoooO00;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getAlignItems() {
        return this.f14910Oooo;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.f14917OoooO0O;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.f14914OoooO;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getFlexDirection() {
        return this.f14911Oooo0o;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<OooO0O0> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f14924Ooooo00.size());
        for (OooO0O0 oooO0O0 : this.f14924Ooooo00) {
            if (oooO0O0.f14999OooO0oo - oooO0O0.f14991OooO != 0) {
                arrayList.add(oooO0O0);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.OooO00o
    public List<OooO0O0> getFlexLinesInternal() {
        return this.f14924Ooooo00;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getFlexWrap() {
        return this.f14912Oooo0oO;
    }

    public int getJustifyContent() {
        return this.f14913Oooo0oo;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getLargestMainSize() {
        Iterator<OooO0O0> it = this.f14924Ooooo00.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f14997OooO0o0);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getMaxLine() {
        return this.f14915OoooO0;
    }

    public int getShowDividerHorizontal() {
        return this.f14918OoooOO0;
    }

    public int getShowDividerVertical() {
        return this.f14926o000oOoO;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getSumOfCrossSize() {
        int size = this.f14924Ooooo00.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = this.f14924Ooooo00.get(i2);
            if (OooOOo0(i2)) {
                i += OooO() ? this.f14919OoooOOO : this.f14920OoooOOo;
            }
            if (OooOOo(i2)) {
                i += OooO() ? this.f14919OoooOOO : this.f14920OoooOOo;
            }
            i += oooO0O0.f14998OooO0oO;
        }
        return i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f14914OoooO == null && this.f14917OoooO0O == null) {
            return;
        }
        if (this.f14918OoooOO0 == 0 && this.f14926o000oOoO == 0) {
            return;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int i = this.f14911Oooo0o;
        if (i == 0) {
            OooOO0O(canvas, iOooO0Oo == 1, this.f14912Oooo0oO == 2);
            return;
        }
        if (i == 1) {
            OooOO0O(canvas, iOooO0Oo != 1, this.f14912Oooo0oO == 2);
            return;
        }
        if (i == 2) {
            boolean z = iOooO0Oo == 1;
            if (this.f14912Oooo0oO == 2) {
                z = !z;
            }
            OooOO0o(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iOooO0Oo == 1;
        if (this.f14912Oooo0oO == 2) {
            z2 = !z2;
        }
        OooOO0o(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int i5 = this.f14911Oooo0o;
        if (i5 == 0) {
            OooOOoo(iOooO0Oo == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            OooOOoo(iOooO0Oo != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = iOooO0Oo == 1;
            if (this.f14912Oooo0oO == 2) {
                z2 = !z2;
            }
            OooOo00(z2, false, i, i2, i3, i4);
            return;
        }
        if (i5 != 3) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid flex direction is set: ");
            sbOooO0o0.append(this.f14911Oooo0o);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        z2 = iOooO0Oo == 1;
        if (this.f14912Oooo0oO == 2) {
            z2 = !z2;
        }
        OooOo00(z2, true, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f14922OoooOoO == null) {
            this.f14922OoooOoO = new SparseIntArray(getChildCount());
        }
        OooO0OO oooO0OO = this.f14923OoooOoo;
        SparseIntArray sparseIntArray = this.f14922OoooOoO;
        int flexItemCount = oooO0OO.f15009OooO00o.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            z = true;
            break;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= flexItemCount) {
                z = false;
                break;
            }
            View viewOooO0o = oooO0OO.f15009OooO00o.OooO0o(i3);
            if (viewOooO0o != null && ((FlexItem) viewOooO0o.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            OooO0OO oooO0OO2 = this.f14923OoooOoo;
            SparseIntArray sparseIntArray2 = this.f14922OoooOoO;
            int flexItemCount2 = oooO0OO2.f15009OooO00o.getFlexItemCount();
            this.f14921OoooOo0 = oooO0OO2.OooOo0o(flexItemCount2, oooO0OO2.OooO0o(flexItemCount2), sparseIntArray2);
        }
        int i4 = this.f14911Oooo0o;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid value for the flex direction is set: ");
                sbOooO0o0.append(this.f14911Oooo0o);
                throw new IllegalStateException(sbOooO0o0.toString());
            }
            this.f14924Ooooo00.clear();
            this.f14925Ooooo0o.OooO00o();
            this.f14923OoooOoo.OooO0O0(this.f14925Ooooo0o, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.f14924Ooooo00 = this.f14925Ooooo0o.f15014OooO00o;
            this.f14923OoooOoo.OooO0oo(i, i2, 0);
            this.f14923OoooOoo.OooO0oO(i, i2, getPaddingRight() + getPaddingLeft());
            this.f14923OoooOoo.OooOoO(0);
            OooOo0(this.f14911Oooo0o, i, i2, this.f14925Ooooo0o.f15015OooO0O0);
            return;
        }
        this.f14924Ooooo00.clear();
        this.f14925Ooooo0o.OooO00o();
        this.f14923OoooOoo.OooO0O0(this.f14925Ooooo0o, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.f14924Ooooo00 = this.f14925Ooooo0o.f15014OooO00o;
        this.f14923OoooOoo.OooO0oo(i, i2, 0);
        if (this.f14910Oooo == 3) {
            for (OooO0O0 oooO0O0 : this.f14924Ooooo00) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < oooO0O0.f14999OooO0oo; i5++) {
                    View viewOooOOOO = OooOOOO(oooO0O0.f15005OooOOOO + i5);
                    if (viewOooOOOO != null && viewOooOOOO.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                        iMax = this.f14912Oooo0oO != 2 ? Math.max(iMax, viewOooOOOO.getMeasuredHeight() + Math.max(oooO0O0.f15002OooOO0o - viewOooOOOO.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewOooOOOO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewOooOOOO.getBaseline() + (oooO0O0.f15002OooOO0o - viewOooOOOO.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                oooO0O0.f14998OooO0oO = iMax;
            }
        }
        this.f14923OoooOoo.OooO0oO(i, i2, getPaddingBottom() + getPaddingTop());
        this.f14923OoooOoo.OooOoO(0);
        OooOo0(this.f14911Oooo0o, i, i2, this.f14925Ooooo0o.f15015OooO0O0);
    }

    public void setAlignContent(int i) {
        if (this.f14916OoooO00 != i) {
            this.f14916OoooO00 = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f14910Oooo != i) {
            this.f14910Oooo = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.f14917OoooO0O) {
            return;
        }
        this.f14917OoooO0O = drawable;
        if (drawable != null) {
            this.f14919OoooOOO = drawable.getIntrinsicHeight();
        } else {
            this.f14919OoooOOO = 0;
        }
        if (this.f14917OoooO0O == null && this.f14914OoooO == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.f14914OoooO) {
            return;
        }
        this.f14914OoooO = drawable;
        if (drawable != null) {
            this.f14920OoooOOo = drawable.getIntrinsicWidth();
        } else {
            this.f14920OoooOOo = 0;
        }
        if (this.f14917OoooO0O == null && this.f14914OoooO == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f14911Oooo0o != i) {
            this.f14911Oooo0o = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.OooO00o
    public void setFlexLines(List<OooO0O0> list) {
        this.f14924Ooooo00 = list;
    }

    public void setFlexWrap(int i) {
        if (this.f14912Oooo0oO != i) {
            this.f14912Oooo0oO = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f14913Oooo0oo != i) {
            this.f14913Oooo0oo = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f14915OoooO0 != i) {
            this.f14915OoooO0 = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f14918OoooOO0) {
            this.f14918OoooOO0 = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f14926o000oOoO) {
            this.f14926o000oOoO = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14915OoooO0 = -1;
        this.f14923OoooOoo = new OooO0OO(this);
        this.f14924Ooooo00 = new ArrayList();
        this.f14925Ooooo0o = new OooO0OO.OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.FlexboxLayout, i, 0);
        this.f14911Oooo0o = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_flexDirection, 0);
        this.f14912Oooo0oO = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_flexWrap, 0);
        this.f14913Oooo0oo = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_justifyContent, 0);
        this.f14910Oooo = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_alignItems, 0);
        this.f14916OoooO00 = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_alignContent, 0);
        this.f14915OoooO0 = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(OooO0o.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(OooO0o.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(OooO0o.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f14926o000oOoO = i2;
            this.f14918OoooOO0 = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f14926o000oOoO = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f14918OoooOO0 = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f14927Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f14928Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public float f14929Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public float f14930Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f14931OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f14932OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public float f14933OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f14934OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f14935OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public boolean f14936o000oOoO;

        public static class OooO00o implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14928Oooo0o = 1;
            this.f14929Oooo0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f14930Oooo0oo = 1.0f;
            this.f14927Oooo = -1;
            this.f14933OoooO00 = -1.0f;
            this.f14932OoooO0 = -1;
            this.f14934OoooO0O = -1;
            this.f14931OoooO = 16777215;
            this.f14935OoooOO0 = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.FlexboxLayout_Layout);
            this.f14928Oooo0o = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_Layout_layout_order, 1);
            this.f14929Oooo0oO = typedArrayObtainStyledAttributes.getFloat(OooO0o.FlexboxLayout_Layout_layout_flexGrow, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f14930Oooo0oo = typedArrayObtainStyledAttributes.getFloat(OooO0o.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f14927Oooo = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f14933OoooO00 = typedArrayObtainStyledAttributes.getFraction(OooO0o.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f14932OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f14934OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f14931OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f14935OoooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f14936o000oOoO = typedArrayObtainStyledAttributes.getBoolean(OooO0o.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooOoo() {
            return this.f14927Oooo;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Oooo00o() {
            return this.f14930Oooo0oo;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Oooo0o() {
            return this.f14932OoooO0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void OoooOO0(int i) {
            this.f14932OoooO0 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OoooOOO() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooooOO() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void OoooooO(int i) {
            this.f14934OoooO0O = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.f14928Oooo0o;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean o00000() {
            return this.f14936o000oOoO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o000000o() {
            return this.f14934OoooO0O;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o00000O() {
            return this.f14935OoooOO0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0000O() {
            return this.f14931OoooO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o000OOo() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o000oOoO() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float o00oO0o() {
            return this.f14933OoooO00;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float ooOO() {
            return this.f14929Oooo0oO;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14928Oooo0o);
            parcel.writeFloat(this.f14929Oooo0oO);
            parcel.writeFloat(this.f14930Oooo0oo);
            parcel.writeInt(this.f14927Oooo);
            parcel.writeFloat(this.f14933OoooO00);
            parcel.writeInt(this.f14932OoooO0);
            parcel.writeInt(this.f14934OoooO0O);
            parcel.writeInt(this.f14931OoooO);
            parcel.writeInt(this.f14935OoooOO0);
            parcel.writeByte(this.f14936o000oOoO ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f14928Oooo0o = 1;
            this.f14929Oooo0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f14930Oooo0oo = 1.0f;
            this.f14927Oooo = -1;
            this.f14933OoooO00 = -1.0f;
            this.f14932OoooO0 = -1;
            this.f14934OoooO0O = -1;
            this.f14931OoooO = 16777215;
            this.f14935OoooOO0 = 16777215;
            this.f14928Oooo0o = layoutParams.f14928Oooo0o;
            this.f14929Oooo0oO = layoutParams.f14929Oooo0oO;
            this.f14930Oooo0oo = layoutParams.f14930Oooo0oo;
            this.f14927Oooo = layoutParams.f14927Oooo;
            this.f14933OoooO00 = layoutParams.f14933OoooO00;
            this.f14932OoooO0 = layoutParams.f14932OoooO0;
            this.f14934OoooO0O = layoutParams.f14934OoooO0O;
            this.f14931OoooO = layoutParams.f14931OoooO;
            this.f14935OoooOO0 = layoutParams.f14935OoooOO0;
            this.f14936o000oOoO = layoutParams.f14936o000oOoO;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14928Oooo0o = 1;
            this.f14929Oooo0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f14930Oooo0oo = 1.0f;
            this.f14927Oooo = -1;
            this.f14933OoooO00 = -1.0f;
            this.f14932OoooO0 = -1;
            this.f14934OoooO0O = -1;
            this.f14931OoooO = 16777215;
            this.f14935OoooOO0 = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14928Oooo0o = 1;
            this.f14929Oooo0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f14930Oooo0oo = 1.0f;
            this.f14927Oooo = -1;
            this.f14933OoooO00 = -1.0f;
            this.f14932OoooO0 = -1;
            this.f14934OoooO0O = -1;
            this.f14931OoooO = 16777215;
            this.f14935OoooOO0 = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f14928Oooo0o = 1;
            this.f14929Oooo0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f14930Oooo0oo = 1.0f;
            this.f14927Oooo = -1;
            this.f14933OoooO00 = -1.0f;
            this.f14932OoooO0 = -1;
            this.f14934OoooO0O = -1;
            this.f14931OoooO = 16777215;
            this.f14935OoooOO0 = 16777215;
            this.f14928Oooo0o = parcel.readInt();
            this.f14929Oooo0oO = parcel.readFloat();
            this.f14930Oooo0oo = parcel.readFloat();
            this.f14927Oooo = parcel.readInt();
            this.f14933OoooO00 = parcel.readFloat();
            this.f14932OoooO0 = parcel.readInt();
            this.f14934OoooO0O = parcel.readInt();
            this.f14931OoooO = parcel.readInt();
            this.f14935OoooOO0 = parcel.readInt();
            this.f14936o000oOoO = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
