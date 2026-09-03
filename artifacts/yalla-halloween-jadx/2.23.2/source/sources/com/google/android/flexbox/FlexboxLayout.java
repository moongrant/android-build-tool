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
import androidx.core.view.o000OOo0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayout extends ViewGroup implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f13934OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13935OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f13936OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f13937OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13938OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f13939OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Drawable f13940OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Drawable f13941OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f13942OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f13943OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f13944OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f13945OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int[] f13946OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final OooO0OO f13947OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public SparseIntArray f13948OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public List<OooO0O0> f13949OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final OooO0OO.OooO00o f13950OooOo00;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO(View view, int i, int i2) {
        int i3;
        int i4;
        if (OooOO0()) {
            i3 = OooOOOo(i, i2) ? 0 + this.f13945OooOOOO : 0;
            if ((this.f13944OooOOO0 & 4) <= 0) {
                return i3;
            }
            i4 = this.f13945OooOOOO;
        } else {
            i3 = OooOOOo(i, i2) ? 0 + this.f13943OooOOO : 0;
            if ((this.f13942OooOO0o & 4) <= 0) {
                return i3;
            }
            i4 = this.f13943OooOOO;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO00o(View view, int i, int i2, OooO0O0 oooO0O0) {
        if (OooOOOo(i, i2)) {
            if (OooOO0()) {
                int i3 = oooO0O0.f14021OooO0o0;
                int i4 = this.f13945OooOOOO;
                oooO0O0.f14021OooO0o0 = i3 + i4;
                oooO0O0.f14020OooO0o += i4;
                return;
            }
            int i5 = oooO0O0.f14021OooO0o0;
            int i6 = this.f13943OooOOO;
            oooO0O0.f14021OooO0o0 = i5 + i6;
            oooO0O0.f14020OooO0o += i6;
        }
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0O0(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final View OooO0OO(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0Oo(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO0o(OooO0O0 oooO0O0) {
        if (OooOO0()) {
            if ((this.f13944OooOOO0 & 4) > 0) {
                int i = oooO0O0.f14021OooO0o0;
                int i2 = this.f13945OooOOOO;
                oooO0O0.f14021OooO0o0 = i + i2;
                oooO0O0.f14020OooO0o += i2;
                return;
            }
            return;
        }
        if ((this.f13942OooOO0o & 4) > 0) {
            int i3 = oooO0O0.f14021OooO0o0;
            int i4 = this.f13943OooOOO;
            oooO0O0.f14021OooO0o0 = i3 + i4;
            oooO0O0.f14020OooO0o += i4;
        }
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0o0(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final View OooO0oO(int i) {
        return OooOOOO(i);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO0oo(int i, View view) {
    }

    @Override // com.google.android.flexbox.OooO00o
    public final boolean OooOO0() {
        int i = this.f13935OooO0Oo;
        return i == 0 || i == 1;
    }

    public final void OooOO0O(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f13949OooOOoo.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f13949OooOOoo.get(i);
            for (int i2 = 0; i2 < oooO0O0.f14023OooO0oo; i2++) {
                int i3 = oooO0O0.f14029OooOOOO + i2;
                View viewOooOOOO = OooOOOO(i3);
                if (viewOooOOOO != null && viewOooOOOO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                    if (OooOOOo(i3, i2)) {
                        OooOOO(canvas, z ? viewOooOOOO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewOooOOOO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f13945OooOOOO, oooO0O0.f14017OooO0O0, oooO0O0.f14022OooO0oO);
                    }
                    if (i2 == oooO0O0.f14023OooO0oo - 1 && (this.f13944OooOOO0 & 4) > 0) {
                        OooOOO(canvas, z ? (viewOooOOOO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f13945OooOOOO : viewOooOOOO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, oooO0O0.f14017OooO0O0, oooO0O0.f14022OooO0oO);
                    }
                }
            }
            if (OooOOo0(i)) {
                OooOOO0(canvas, paddingLeft, z2 ? oooO0O0.f14019OooO0Oo : oooO0O0.f14017OooO0O0 - this.f13943OooOOO, iMax);
            }
            if (OooOOo(i) && (this.f13942OooOO0o & 4) > 0) {
                OooOOO0(canvas, paddingLeft, z2 ? oooO0O0.f14017OooO0O0 - this.f13943OooOOO : oooO0O0.f14019OooO0Oo, iMax);
            }
        }
    }

    public final void OooOO0o(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f13949OooOOoo.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f13949OooOOoo.get(i);
            for (int i2 = 0; i2 < oooO0O0.f14023OooO0oo; i2++) {
                int i3 = oooO0O0.f14029OooOOOO + i2;
                View viewOooOOOO = OooOOOO(i3);
                if (viewOooOOOO != null && viewOooOOOO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                    if (OooOOOo(i3, i2)) {
                        OooOOO0(canvas, oooO0O0.f14016OooO00o, z2 ? viewOooOOOO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewOooOOOO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f13943OooOOO, oooO0O0.f14022OooO0oO);
                    }
                    if (i2 == oooO0O0.f14023OooO0oo - 1 && (this.f13942OooOO0o & 4) > 0) {
                        OooOOO0(canvas, oooO0O0.f14016OooO00o, z2 ? (viewOooOOOO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f13943OooOOO : viewOooOOOO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, oooO0O0.f14022OooO0oO);
                    }
                }
            }
            if (OooOOo0(i)) {
                OooOOO(canvas, z ? oooO0O0.f14018OooO0OO : oooO0O0.f14016OooO00o - this.f13945OooOOOO, paddingTop, iMax);
            }
            if (OooOOo(i) && (this.f13944OooOOO0 & 4) > 0) {
                OooOOO(canvas, z ? oooO0O0.f14016OooO00o - this.f13945OooOOOO : oooO0O0.f14018OooO0OO, paddingTop, iMax);
            }
        }
    }

    public final void OooOOO(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f13941OooOO0O;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f13945OooOOOO + i, i3 + i2);
        this.f13941OooOO0O.draw(canvas);
    }

    public final void OooOOO0(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f13940OooOO0;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f13943OooOOO + i2);
        this.f13940OooOO0.draw(canvas);
    }

    public final View OooOOOO(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f13946OooOOOo;
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
            if (OooOO0()) {
                return (this.f13944OooOOO0 & 1) != 0;
            }
            return (this.f13942OooOO0o & 1) != 0;
        }
        if (OooOO0()) {
            return (this.f13944OooOOO0 & 2) != 0;
        }
        return (this.f13942OooOO0o & 2) != 0;
    }

    public final boolean OooOOo(int i) {
        if (i < 0 || i >= this.f13949OooOOoo.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f13949OooOOoo.size(); i2++) {
            OooO0O0 oooO0O0 = this.f13949OooOOoo.get(i2);
            if (oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO > 0) {
                return false;
            }
        }
        if (OooOO0()) {
            return (this.f13942OooOO0o & 4) != 0;
        }
        return (this.f13944OooOOO0 & 4) != 0;
    }

    public final boolean OooOOo0(int i) {
        boolean z;
        if (i < 0 || i >= this.f13949OooOOoo.size()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            OooO0O0 oooO0O0 = this.f13949OooOOoo.get(i2);
            if (oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO > 0) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            if (OooOO0()) {
                return (this.f13942OooOO0o & 1) != 0;
            }
            return (this.f13944OooOOO0 & 1) != 0;
        }
        if (OooOO0()) {
            return (this.f13942OooOO0o & 2) != 0;
        }
        return (this.f13944OooOOO0 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x020c  */
    public final void OooOOoo(int i, int i2, int i3, int i4, boolean z) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewOooOOOO;
        int i7;
        int i8;
        int i9;
        char c;
        LayoutParams layoutParams;
        float f3;
        float f4;
        float f5;
        int i10;
        char c2;
        int i11;
        LayoutParams layoutParams2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i12 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f13949OooOOoo.size();
        int i13 = 0;
        while (i13 < size) {
            OooO0O0 oooO0O0 = this.f13949OooOOoo.get(i13);
            if (OooOOo0(i13)) {
                int i14 = this.f13943OooOOO;
                paddingBottom -= i14;
                paddingTop += i14;
            }
            int i15 = this.f13936OooO0o;
            char c3 = 4;
            int i16 = 1;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i12 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = oooO0O0.f14021OooO0o0;
                    measuredWidth = paddingLeft + ((i12 - i17) / 2.0f);
                    f = (i12 - paddingRight) - ((i12 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int i18 = oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO;
                    f2 = (i12 - oooO0O0.f14021OooO0o0) / (i18 != 1 ? i18 - 1 : 1.0f);
                    f = i12 - paddingRight;
                } else if (i15 == 4) {
                    int i19 = oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO;
                    f2 = i19 != 0 ? (i12 - oooO0O0.f14021OooO0o0) / i19 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredWidth = paddingLeft + f6;
                    f = (i12 - paddingRight) - f6;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f13936OooO0o);
                    }
                    int i20 = oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO;
                    f2 = i20 != 0 ? (i12 - oooO0O0.f14021OooO0o0) / (i20 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i12 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < oooO0O0.f14023OooO0oo) {
                    i6 = oooO0O0.f14029OooOOOO + i5;
                    viewOooOOOO = OooOOOO(i6);
                    if (viewOooOOOO != null) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        c = c3;
                    } else if (viewOooOOOO.getVisibility() == 8) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        c = 4;
                    } else {
                        layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        if (OooOOOo(i6, i5)) {
                            int i21 = this.f13945OooOOOO;
                            float f7 = i21;
                            f3 += f7;
                            i10 = i21;
                            f5 = f4 - f7;
                        } else {
                            f5 = f4;
                            i10 = 0;
                        }
                        if (i5 == oooO0O0.f14023OooO0oo - i16) {
                            c2 = 4;
                            i11 = (this.f13944OooOOO0 & 4) > 0 ? this.f13945OooOOOO : 0;
                            if (this.f13937OooO0o0 == 2) {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c = c2;
                                if (z) {
                                    this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingTop, Math.round(f5), viewOooOOOO.getMeasuredHeight() + paddingTop);
                                } else {
                                    this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f3), paddingTop, viewOooOOOO.getMeasuredWidth() + Math.round(f3), viewOooOOOO.getMeasuredHeight() + paddingTop);
                                }
                            } else if (z) {
                                i8 = i16;
                                i9 = i5;
                                i7 = paddingLeft;
                                layoutParams2 = layoutParams;
                                c = c2;
                                this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingBottom - viewOooOOOO.getMeasuredHeight(), Math.round(f5), paddingBottom);
                            } else {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c = c2;
                                this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f3), paddingBottom - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + Math.round(f3), paddingBottom);
                            }
                            measuredWidth = f3 + viewOooOOOO.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                            float measuredWidth2 = f5 - ((viewOooOOOO.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                            if (z) {
                                oooO0O0.OooO00o(viewOooOOOO, i11, 0, i10, 0);
                            } else {
                                oooO0O0.OooO00o(viewOooOOOO, i10, 0, i11, 0);
                            }
                            f = measuredWidth2;
                        } else {
                            c2 = 4;
                        }
                        if (this.f13937OooO0o0 == 2) {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z) {
                                this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingTop, Math.round(f5), viewOooOOOO.getMeasuredHeight() + paddingTop);
                            } else {
                                this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f3), paddingTop, viewOooOOOO.getMeasuredWidth() + Math.round(f3), viewOooOOOO.getMeasuredHeight() + paddingTop);
                            }
                        } else if (z) {
                            i8 = i16;
                            i9 = i5;
                            i7 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingBottom - viewOooOOOO.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f3), paddingBottom - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + Math.round(f3), paddingBottom);
                        }
                        measuredWidth = f3 + viewOooOOOO.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f5 - ((viewOooOOOO.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            oooO0O0.OooO00o(viewOooOOOO, i11, 0, i10, 0);
                        } else {
                            oooO0O0.OooO00o(viewOooOOOO, i10, 0, i11, 0);
                        }
                        f = measuredWidth3;
                    }
                    i5 = i9 + 1;
                    paddingLeft = i7;
                    i16 = i8;
                    c3 = c;
                }
                int i22 = paddingLeft;
                int i23 = oooO0O0.f14022OooO0oO;
                paddingTop += i23;
                paddingBottom -= i23;
                i13++;
                paddingLeft = i22;
            } else {
                int i24 = oooO0O0.f14021OooO0o0;
                f = i24 - paddingLeft;
                measuredWidth = (i12 - i24) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < oooO0O0.f14023OooO0oo) {
                i6 = oooO0O0.f14029OooOOOO + i5;
                viewOooOOOO = OooOOOO(i6);
                if (viewOooOOOO != null) {
                    i7 = paddingLeft;
                    i8 = i16;
                    i9 = i5;
                    c = c3;
                } else if (viewOooOOOO.getVisibility() == 8) {
                    i7 = paddingLeft;
                    i8 = i16;
                    i9 = i5;
                    c = 4;
                } else {
                    layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                    f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    if (OooOOOo(i6, i5)) {
                        int i25 = this.f13945OooOOOO;
                        float f8 = i25;
                        f3 += f8;
                        i10 = i25;
                        f5 = f4 - f8;
                    } else {
                        f5 = f4;
                        i10 = 0;
                    }
                    if (i5 == oooO0O0.f14023OooO0oo - i16) {
                        c2 = 4;
                        if ((this.f13944OooOOO0 & 4) > 0) {
                        }
                        if (this.f13937OooO0o0 == 2) {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z) {
                                this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingTop, Math.round(f5), viewOooOOOO.getMeasuredHeight() + paddingTop);
                            } else {
                                this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f3), paddingTop, viewOooOOOO.getMeasuredWidth() + Math.round(f3), viewOooOOOO.getMeasuredHeight() + paddingTop);
                            }
                        } else if (z) {
                            i8 = i16;
                            i9 = i5;
                            i7 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingBottom - viewOooOOOO.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f3), paddingBottom - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + Math.round(f3), paddingBottom);
                        }
                        measuredWidth = f3 + viewOooOOOO.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth4 = f5 - ((viewOooOOOO.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            oooO0O0.OooO00o(viewOooOOOO, i11, 0, i10, 0);
                        } else {
                            oooO0O0.OooO00o(viewOooOOOO, i10, 0, i11, 0);
                        }
                        f = measuredWidth4;
                    } else {
                        c2 = 4;
                    }
                    if (this.f13937OooO0o0 == 2) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        layoutParams2 = layoutParams;
                        c = c2;
                        if (z) {
                            this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingTop, Math.round(f5), viewOooOOOO.getMeasuredHeight() + paddingTop);
                        } else {
                            this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f3), paddingTop, viewOooOOOO.getMeasuredWidth() + Math.round(f3), viewOooOOOO.getMeasuredHeight() + paddingTop);
                        }
                    } else if (z) {
                        i8 = i16;
                        i9 = i5;
                        i7 = paddingLeft;
                        layoutParams2 = layoutParams;
                        c = c2;
                        this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f5) - viewOooOOOO.getMeasuredWidth(), paddingBottom - viewOooOOOO.getMeasuredHeight(), Math.round(f5), paddingBottom);
                    } else {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        layoutParams2 = layoutParams;
                        c = c2;
                        this.f13947OooOOo.OooOOOO(viewOooOOOO, oooO0O0, Math.round(f3), paddingBottom - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + Math.round(f3), paddingBottom);
                    }
                    measuredWidth = f3 + viewOooOOOO.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    float measuredWidth5 = f5 - ((viewOooOOOO.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                    if (z) {
                        oooO0O0.OooO00o(viewOooOOOO, i11, 0, i10, 0);
                    } else {
                        oooO0O0.OooO00o(viewOooOOOO, i10, 0, i11, 0);
                    }
                    f = measuredWidth5;
                }
                i5 = i9 + 1;
                paddingLeft = i7;
                i16 = i8;
                c3 = c;
            }
            int i26 = paddingLeft;
            int i27 = oooO0O0.f14022OooO0oO;
            paddingTop += i27;
            paddingBottom -= i27;
            i13++;
            paddingLeft = i26;
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
                i4 = View.combineMeasuredStates(i4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
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
                i4 = View.combineMeasuredStates(i4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0205  */
    public final void OooOo00(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float f;
        int i5;
        float f2;
        float f3;
        float fMax;
        int i6;
        int i7;
        View viewOooOOOO;
        int i8;
        boolean z3;
        char c;
        LayoutParams layoutParams;
        float f4;
        float f5;
        float f6;
        float f7;
        int i9;
        char c2;
        int i10;
        LayoutParams layoutParams2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i11 = i4 - i2;
        int i12 = (i3 - i) - paddingRight;
        int size = this.f13949OooOOoo.size();
        for (int i13 = 0; i13 < size; i13++) {
            OooO0O0 oooO0O0 = this.f13949OooOOoo.get(i13);
            if (OooOOo0(i13)) {
                int i14 = this.f13945OooOOOO;
                paddingLeft += i14;
                i12 -= i14;
            }
            int i15 = this.f13936OooO0o;
            char c3 = 4;
            boolean z4 = true;
            if (i15 != 0) {
                if (i15 == 1) {
                    int i16 = oooO0O0.f14021OooO0o0;
                    f = (i11 - i16) + paddingBottom;
                    i5 = i16 - paddingTop;
                } else if (i15 == 2) {
                    int i17 = oooO0O0.f14021OooO0o0;
                    f2 = (i11 - paddingBottom) - ((i11 - i17) / 2.0f);
                    f = paddingTop + ((i11 - i17) / 2.0f);
                    f3 = 0.0f;
                } else if (i15 == 3) {
                    f = paddingTop;
                    int i18 = oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO;
                    f3 = (i11 - oooO0O0.f14021OooO0o0) / (i18 != 1 ? i18 - 1 : 1.0f);
                    f2 = i11 - paddingBottom;
                } else if (i15 == 4) {
                    int i19 = oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO;
                    f3 = i19 != 0 ? (i11 - oooO0O0.f14021OooO0o0) / i19 : 0.0f;
                    float f8 = f3 / 2.0f;
                    f = paddingTop + f8;
                    f2 = (i11 - paddingBottom) - f8;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f13936OooO0o);
                    }
                    int i20 = oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO;
                    f3 = i20 != 0 ? (i11 - oooO0O0.f14021OooO0o0) / (i20 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i11 - paddingBottom) - f3;
                }
                fMax = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < oooO0O0.f14023OooO0oo) {
                    i7 = oooO0O0.f14029OooOOOO + i6;
                    viewOooOOOO = OooOOOO(i7);
                    if (viewOooOOOO != null) {
                        i8 = i6;
                        z3 = z4;
                        c = c3;
                    } else if (viewOooOOOO.getVisibility() == 8) {
                        i8 = i6;
                        z3 = true;
                        c = 4;
                    } else {
                        layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                        f4 = f + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        f5 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        if (OooOOOo(i7, i6)) {
                            int i21 = this.f13943OooOOO;
                            float f9 = i21;
                            f6 = f4 + f9;
                            i9 = i21;
                            f7 = f5 - f9;
                        } else {
                            f6 = f4;
                            f7 = f5;
                            i9 = 0;
                        }
                        if (i6 == oooO0O0.f14023OooO0oo - 1) {
                            c2 = 4;
                            i10 = (this.f13942OooOO0o & 4) > 0 ? this.f13943OooOOO : 0;
                            if (z) {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                if (z2) {
                                    this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f7) - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + paddingLeft, Math.round(f7));
                                } else {
                                    this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f6), viewOooOOOO.getMeasuredWidth() + paddingLeft, viewOooOOOO.getMeasuredHeight() + Math.round(f6));
                                }
                            } else if (z2) {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, true, i12 - viewOooOOOO.getMeasuredWidth(), Math.round(f7) - viewOooOOOO.getMeasuredHeight(), i12, Math.round(f7));
                            } else {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, true, i12 - viewOooOOOO.getMeasuredWidth(), Math.round(f6), i12, viewOooOOOO.getMeasuredHeight() + Math.round(f6));
                            }
                            LayoutParams layoutParams3 = layoutParams2;
                            float measuredHeight = viewOooOOOO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + f6;
                            float measuredHeight2 = f7 - ((viewOooOOOO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                            if (z2) {
                                oooO0O0.OooO00o(viewOooOOOO, 0, i10, 0, i9);
                            } else {
                                oooO0O0.OooO00o(viewOooOOOO, 0, i9, 0, i10);
                            }
                            f = measuredHeight;
                            f2 = measuredHeight2;
                        } else {
                            c2 = 4;
                        }
                        if (z) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z2) {
                                this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f7) - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + paddingLeft, Math.round(f7));
                            } else {
                                this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f6), viewOooOOOO.getMeasuredWidth() + paddingLeft, viewOooOOOO.getMeasuredHeight() + Math.round(f6));
                            }
                        } else if (z2) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, true, i12 - viewOooOOOO.getMeasuredWidth(), Math.round(f7) - viewOooOOOO.getMeasuredHeight(), i12, Math.round(f7));
                        } else {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, true, i12 - viewOooOOOO.getMeasuredWidth(), Math.round(f6), i12, viewOooOOOO.getMeasuredHeight() + Math.round(f6));
                        }
                        LayoutParams layoutParams4 = layoutParams2;
                        float measuredHeight3 = viewOooOOOO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + f6;
                        float measuredHeight4 = f7 - ((viewOooOOOO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin);
                        if (z2) {
                            oooO0O0.OooO00o(viewOooOOOO, 0, i10, 0, i9);
                        } else {
                            oooO0O0.OooO00o(viewOooOOOO, 0, i9, 0, i10);
                        }
                        f = measuredHeight3;
                        f2 = measuredHeight4;
                    }
                    i6 = i8 + 1;
                    z4 = z3;
                    c3 = c;
                }
                int i22 = oooO0O0.f14022OooO0oO;
                paddingLeft += i22;
                i12 -= i22;
            } else {
                f = paddingTop;
                i5 = i11 - paddingBottom;
            }
            f2 = i5;
            f3 = 0.0f;
            fMax = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < oooO0O0.f14023OooO0oo) {
                i7 = oooO0O0.f14029OooOOOO + i6;
                viewOooOOOO = OooOOOO(i7);
                if (viewOooOOOO != null) {
                    i8 = i6;
                    z3 = z4;
                    c = c3;
                } else if (viewOooOOOO.getVisibility() == 8) {
                    i8 = i6;
                    z3 = true;
                    c = 4;
                } else {
                    layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                    f4 = f + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    f5 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (OooOOOo(i7, i6)) {
                        int i23 = this.f13943OooOOO;
                        float f10 = i23;
                        f6 = f4 + f10;
                        i9 = i23;
                        f7 = f5 - f10;
                    } else {
                        f6 = f4;
                        f7 = f5;
                        i9 = 0;
                    }
                    if (i6 == oooO0O0.f14023OooO0oo - 1) {
                        c2 = 4;
                        if ((this.f13942OooOO0o & 4) > 0) {
                        }
                        if (z) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z2) {
                                this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f7) - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + paddingLeft, Math.round(f7));
                            } else {
                                this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f6), viewOooOOOO.getMeasuredWidth() + paddingLeft, viewOooOOOO.getMeasuredHeight() + Math.round(f6));
                            }
                        } else if (z2) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, true, i12 - viewOooOOOO.getMeasuredWidth(), Math.round(f7) - viewOooOOOO.getMeasuredHeight(), i12, Math.round(f7));
                        } else {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, true, i12 - viewOooOOOO.getMeasuredWidth(), Math.round(f6), i12, viewOooOOOO.getMeasuredHeight() + Math.round(f6));
                        }
                        LayoutParams layoutParams5 = layoutParams2;
                        float measuredHeight5 = viewOooOOOO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin + f6;
                        float measuredHeight6 = f7 - ((viewOooOOOO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin);
                        if (z2) {
                            oooO0O0.OooO00o(viewOooOOOO, 0, i10, 0, i9);
                        } else {
                            oooO0O0.OooO00o(viewOooOOOO, 0, i9, 0, i10);
                        }
                        f = measuredHeight5;
                        f2 = measuredHeight6;
                    } else {
                        c2 = 4;
                    }
                    if (z) {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        if (z2) {
                            this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f7) - viewOooOOOO.getMeasuredHeight(), viewOooOOOO.getMeasuredWidth() + paddingLeft, Math.round(f7));
                        } else {
                            this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, false, paddingLeft, Math.round(f6), viewOooOOOO.getMeasuredWidth() + paddingLeft, viewOooOOOO.getMeasuredHeight() + Math.round(f6));
                        }
                    } else if (z2) {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, true, i12 - viewOooOOOO.getMeasuredWidth(), Math.round(f7) - viewOooOOOO.getMeasuredHeight(), i12, Math.round(f7));
                    } else {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        this.f13947OooOOo.OooOOOo(viewOooOOOO, oooO0O0, true, i12 - viewOooOOOO.getMeasuredWidth(), Math.round(f6), i12, viewOooOOOO.getMeasuredHeight() + Math.round(f6));
                    }
                    LayoutParams layoutParams6 = layoutParams2;
                    float measuredHeight7 = viewOooOOOO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin + f6;
                    float measuredHeight8 = f7 - ((viewOooOOOO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin);
                    if (z2) {
                        oooO0O0.OooO00o(viewOooOOOO, 0, i10, 0, i9);
                    } else {
                        oooO0O0.OooO00o(viewOooOOOO, 0, i9, 0, i10);
                    }
                    f = measuredHeight7;
                    f2 = measuredHeight8;
                }
                i6 = i8 + 1;
                z4 = z3;
                c3 = c;
            }
            int i24 = oooO0O0.f14022OooO0oO;
            paddingLeft += i24;
            i12 -= i24;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f13948OooOOo0 == null) {
            this.f13948OooOOo0 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f13948OooOOo0;
        OooO0OO oooO0OO = this.f13947OooOOo;
        OooO00o oooO00o = oooO0OO.f14033OooO00o;
        int flexItemCount = oooO00o.getFlexItemCount();
        ArrayList arrayListOooO0o = oooO0OO.OooO0o(flexItemCount);
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            oooO0O0.f14041OooO0o0 = 1;
        } else {
            oooO0O0.f14041OooO0o0 = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= oooO00o.getFlexItemCount()) {
            oooO0O0.f14040OooO0Oo = flexItemCount;
        } else {
            oooO0O0.f14040OooO0Oo = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((OooO0OO.OooO0O0) arrayListOooO0o.get(i2)).f14040OooO0Oo++;
            }
        }
        arrayListOooO0o.add(oooO0O0);
        this.f13946OooOOOo = OooO0OO.OooOOo(flexItemCount + 1, arrayListOooO0o, sparseIntArray);
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
        return this.f13939OooO0oo;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getAlignItems() {
        return this.f13938OooO0oO;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.f13940OooOO0;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.f13941OooOO0O;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getFlexDirection() {
        return this.f13935OooO0Oo;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<OooO0O0> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f13949OooOOoo.size());
        for (OooO0O0 oooO0O0 : this.f13949OooOOoo) {
            if (oooO0O0.f14023OooO0oo - oooO0O0.f14015OooO != 0) {
                arrayList.add(oooO0O0);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.OooO00o
    public List<OooO0O0> getFlexLinesInternal() {
        return this.f13949OooOOoo;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getFlexWrap() {
        return this.f13937OooO0o0;
    }

    public int getJustifyContent() {
        return this.f13936OooO0o;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getLargestMainSize() {
        Iterator<OooO0O0> it = this.f13949OooOOoo.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f14021OooO0o0);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getMaxLine() {
        return this.f13934OooO;
    }

    public int getShowDividerHorizontal() {
        return this.f13942OooOO0o;
    }

    public int getShowDividerVertical() {
        return this.f13944OooOOO0;
    }

    @Override // com.google.android.flexbox.OooO00o
    public int getSumOfCrossSize() {
        int size = this.f13949OooOOoo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = this.f13949OooOOoo.get(i2);
            if (OooOOo0(i2)) {
                i += OooOO0() ? this.f13943OooOOO : this.f13945OooOOOO;
            }
            if (OooOOo(i2)) {
                i += OooOO0() ? this.f13943OooOOO : this.f13945OooOOOO;
            }
            i += oooO0O0.f14022OooO0oO;
        }
        return i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f13941OooOO0O == null && this.f13940OooOO0 == null) {
            return;
        }
        if (this.f13942OooOO0o == 0 && this.f13944OooOOO0 == 0) {
            return;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int i = this.f13935OooO0Oo;
        if (i == 0) {
            OooOO0O(canvas, iOooO0Oo == 1, this.f13937OooO0o0 == 2);
            return;
        }
        if (i == 1) {
            OooOO0O(canvas, iOooO0Oo != 1, this.f13937OooO0o0 == 2);
            return;
        }
        if (i == 2) {
            boolean z = iOooO0Oo == 1;
            if (this.f13937OooO0o0 == 2) {
                z = !z;
            }
            OooOO0o(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iOooO0Oo == 1;
        if (this.f13937OooO0o0 == 2) {
            z2 = !z2;
        }
        OooOO0o(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int i5 = this.f13935OooO0Oo;
        if (i5 == 0) {
            OooOOoo(i, i2, i3, i4, iOooO0Oo == 1);
            return;
        }
        if (i5 == 1) {
            OooOOoo(i, i2, i3, i4, iOooO0Oo != 1);
            return;
        }
        if (i5 == 2) {
            z2 = iOooO0Oo == 1;
            OooOo00(i, i2, i3, i4, this.f13937OooO0o0 == 2 ? !z2 : z2, false);
        } else if (i5 == 3) {
            z2 = iOooO0Oo == 1;
            OooOo00(i, i2, i3, i4, this.f13937OooO0o0 == 2 ? !z2 : z2, true);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f13935OooO0Oo);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f13948OooOOo0 == null) {
            this.f13948OooOOo0 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f13948OooOOo0;
        OooO0OO oooO0OO = this.f13947OooOOo;
        OooO00o oooO00o = oooO0OO.f14033OooO00o;
        int flexItemCount = oooO00o.getFlexItemCount();
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
            View viewOooO0OO = oooO00o.OooO0OO(i3);
            if (viewOooO0OO != null && ((FlexItem) viewOooO0OO.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            SparseIntArray sparseIntArray2 = this.f13948OooOOo0;
            int flexItemCount2 = oooO0OO.f14033OooO00o.getFlexItemCount();
            this.f13946OooOOOo = OooO0OO.OooOOo(flexItemCount2, oooO0OO.OooO0o(flexItemCount2), sparseIntArray2);
        }
        int i4 = this.f13935OooO0Oo;
        OooO0OO.OooO00o oooO00o2 = this.f13950OooOo00;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f13935OooO0Oo);
            }
            this.f13949OooOOoo.clear();
            oooO00o2.f14038OooO00o = null;
            oooO00o2.f14039OooO0O0 = 0;
            this.f13947OooOOo.OooO0O0(this.f13950OooOo00, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.f13949OooOOoo = oooO00o2.f14038OooO00o;
            oooO0OO.OooO0oo(i, i2, 0);
            oooO0OO.OooO0oO(i, i2, getPaddingRight() + getPaddingLeft());
            oooO0OO.OooOo0(0);
            OooOo0(this.f13935OooO0Oo, i, i2, oooO00o2.f14039OooO0O0);
            return;
        }
        this.f13949OooOOoo.clear();
        oooO00o2.f14038OooO00o = null;
        oooO00o2.f14039OooO0O0 = 0;
        this.f13947OooOOo.OooO0O0(this.f13950OooOo00, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.f13949OooOOoo = oooO00o2.f14038OooO00o;
        oooO0OO.OooO0oo(i, i2, 0);
        if (this.f13938OooO0oO == 3) {
            for (OooO0O0 oooO0O0 : this.f13949OooOOoo) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < oooO0O0.f14023OooO0oo; i5++) {
                    View viewOooOOOO = OooOOOO(oooO0O0.f14029OooOOOO + i5);
                    if (viewOooOOOO != null && viewOooOOOO.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewOooOOOO.getLayoutParams();
                        iMax = this.f13937OooO0o0 != 2 ? Math.max(iMax, viewOooOOOO.getMeasuredHeight() + Math.max(oooO0O0.f14026OooOO0o - viewOooOOOO.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewOooOOOO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewOooOOOO.getBaseline() + (oooO0O0.f14026OooOO0o - viewOooOOOO.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                oooO0O0.f14022OooO0oO = iMax;
            }
        }
        oooO0OO.OooO0oO(i, i2, getPaddingBottom() + getPaddingTop());
        oooO0OO.OooOo0(0);
        OooOo0(this.f13935OooO0Oo, i, i2, oooO00o2.f14039OooO0O0);
    }

    public void setAlignContent(int i) {
        if (this.f13939OooO0oo != i) {
            this.f13939OooO0oo = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f13938OooO0oO != i) {
            this.f13938OooO0oO = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.f13940OooOO0) {
            return;
        }
        this.f13940OooOO0 = drawable;
        if (drawable != null) {
            this.f13943OooOOO = drawable.getIntrinsicHeight();
        } else {
            this.f13943OooOOO = 0;
        }
        if (this.f13940OooOO0 == null && this.f13941OooOO0O == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.f13941OooOO0O) {
            return;
        }
        this.f13941OooOO0O = drawable;
        if (drawable != null) {
            this.f13945OooOOOO = drawable.getIntrinsicWidth();
        } else {
            this.f13945OooOOOO = 0;
        }
        if (this.f13940OooOO0 == null && this.f13941OooOO0O == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f13935OooO0Oo != i) {
            this.f13935OooO0Oo = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.OooO00o
    public void setFlexLines(List<OooO0O0> list) {
        this.f13949OooOOoo = list;
    }

    public void setFlexWrap(int i) {
        if (this.f13937OooO0o0 != i) {
            this.f13937OooO0o0 = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f13936OooO0o != i) {
            this.f13936OooO0o = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f13934OooO != i) {
            this.f13934OooO = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f13942OooOO0o) {
            this.f13942OooOO0o = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f13944OooOOO0) {
            this.f13944OooOOO0 = i;
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
        this.f13934OooO = -1;
        this.f13947OooOOo = new OooO0OO(this);
        this.f13949OooOOoo = new ArrayList();
        this.f13950OooOo00 = new OooO0OO.OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.FlexboxLayout, i, 0);
        this.f13935OooO0Oo = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_flexDirection, 0);
        this.f13937OooO0o0 = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_flexWrap, 0);
        this.f13936OooO0o = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_justifyContent, 0);
        this.f13938OooO0oO = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_alignItems, 0);
        this.f13939OooO0oo = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_alignContent, 0);
        this.f13934OooO = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_maxLine, -1);
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
            this.f13944OooOOO0 = i2;
            this.f13942OooOO0o = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f13944OooOOO0 = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f13942OooOO0o = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f13951OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13952OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f13953OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f13954OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f13955OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f13956OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f13957OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f13958OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f13959OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final boolean f13960OooOOO0;

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
            this.f13952OooO0Oo = 1;
            this.f13954OooO0o0 = 0.0f;
            this.f13953OooO0o = 1.0f;
            this.f13955OooO0oO = -1;
            this.f13956OooO0oo = -1.0f;
            this.f13951OooO = -1;
            this.f13957OooOO0 = -1;
            this.f13958OooOO0O = 16777215;
            this.f13959OooOO0o = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.FlexboxLayout_Layout);
            this.f13952OooO0Oo = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_Layout_layout_order, 1);
            this.f13954OooO0o0 = typedArrayObtainStyledAttributes.getFloat(OooO0o.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f13953OooO0o = typedArrayObtainStyledAttributes.getFloat(OooO0o.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f13955OooO0oO = typedArrayObtainStyledAttributes.getInt(OooO0o.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f13956OooO0oo = typedArrayObtainStyledAttributes.getFraction(OooO0o.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f13951OooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f13957OooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f13958OooOO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f13959OooOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f13960OooOOO0 = typedArrayObtainStyledAttributes.getBoolean(OooO0o.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooOOo() {
            return this.f13955OooO0oO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooOo() {
            return this.f13951OooO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float OooOo00() {
            return this.f13953OooO0o;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Oooo0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void Oooo0O0(int i) {
            this.f13957OooOO0 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Oooo0o0() {
            return this.f13954OooO0o0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float OoooO0() {
            return this.f13956OooO0oo;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean OoooOO0() {
            return this.f13960OooOOO0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooooO0() {
            return this.f13958OooOO0O;
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
            return this.f13952OooO0Oo;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0000O0() {
            return this.f13957OooOO0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0000O00() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0000O0O() {
            return this.f13959OooOO0o;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o000OOo() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0O0O00() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void oo0o0Oo(int i) {
            this.f13951OooO = i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f13952OooO0Oo);
            parcel.writeFloat(this.f13954OooO0o0);
            parcel.writeFloat(this.f13953OooO0o);
            parcel.writeInt(this.f13955OooO0oO);
            parcel.writeFloat(this.f13956OooO0oo);
            parcel.writeInt(this.f13951OooO);
            parcel.writeInt(this.f13957OooOO0);
            parcel.writeInt(this.f13958OooOO0O);
            parcel.writeInt(this.f13959OooOO0o);
            parcel.writeByte(this.f13960OooOOO0 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f13952OooO0Oo = 1;
            this.f13954OooO0o0 = 0.0f;
            this.f13953OooO0o = 1.0f;
            this.f13955OooO0oO = -1;
            this.f13956OooO0oo = -1.0f;
            this.f13951OooO = -1;
            this.f13957OooOO0 = -1;
            this.f13958OooOO0O = 16777215;
            this.f13959OooOO0o = 16777215;
            this.f13952OooO0Oo = layoutParams.f13952OooO0Oo;
            this.f13954OooO0o0 = layoutParams.f13954OooO0o0;
            this.f13953OooO0o = layoutParams.f13953OooO0o;
            this.f13955OooO0oO = layoutParams.f13955OooO0oO;
            this.f13956OooO0oo = layoutParams.f13956OooO0oo;
            this.f13951OooO = layoutParams.f13951OooO;
            this.f13957OooOO0 = layoutParams.f13957OooOO0;
            this.f13958OooOO0O = layoutParams.f13958OooOO0O;
            this.f13959OooOO0o = layoutParams.f13959OooOO0o;
            this.f13960OooOOO0 = layoutParams.f13960OooOOO0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13952OooO0Oo = 1;
            this.f13954OooO0o0 = 0.0f;
            this.f13953OooO0o = 1.0f;
            this.f13955OooO0oO = -1;
            this.f13956OooO0oo = -1.0f;
            this.f13951OooO = -1;
            this.f13957OooOO0 = -1;
            this.f13958OooOO0O = 16777215;
            this.f13959OooOO0o = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13952OooO0Oo = 1;
            this.f13954OooO0o0 = 0.0f;
            this.f13953OooO0o = 1.0f;
            this.f13955OooO0oO = -1;
            this.f13956OooO0oo = -1.0f;
            this.f13951OooO = -1;
            this.f13957OooOO0 = -1;
            this.f13958OooOO0O = 16777215;
            this.f13959OooOO0o = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f13952OooO0Oo = 1;
            this.f13954OooO0o0 = 0.0f;
            this.f13953OooO0o = 1.0f;
            this.f13955OooO0oO = -1;
            this.f13956OooO0oo = -1.0f;
            this.f13951OooO = -1;
            this.f13957OooOO0 = -1;
            this.f13958OooOO0O = 16777215;
            this.f13959OooOO0o = 16777215;
            this.f13952OooO0Oo = parcel.readInt();
            this.f13954OooO0o0 = parcel.readFloat();
            this.f13953OooO0o = parcel.readFloat();
            this.f13955OooO0oO = parcel.readInt();
            this.f13956OooO0oo = parcel.readFloat();
            this.f13951OooO = parcel.readInt();
            this.f13957OooOO0 = parcel.readInt();
            this.f13958OooOO0O = parcel.readInt();
            this.f13959OooOO0o = parcel.readInt();
            this.f13960OooOOO0 = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
