package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import org.jctools.util.Pow2;
import p272o0O0000o.o0000Ooo;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16665OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f16666OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16667OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16668OooO0oO;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    public boolean OooO00o() {
        return this.f16666OooO0o;
    }

    public final void OooO0O0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o000OO.FlowLayout, 0, 0);
        this.f16665OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.FlowLayout_lineSpacing, 0);
        this.f16667OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f16667OooO0o0;
    }

    public int getLineSpacing() {
        return this.f16665OooO0Oo;
    }

    public int getRowCount() {
        return this.f16668OooO0oO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iOooO0O0;
        int iOooO0OO;
        if (getChildCount() == 0) {
            this.f16668OooO0oO = 0;
            return;
        }
        this.f16668OooO0oO = 1;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z2 = ViewCompat.OooO.OooO0Oo(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(o0000Ooo.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iOooO0OO = androidx.core.view.o00O0O.OooO0OO(marginLayoutParams);
                    iOooO0O0 = androidx.core.view.o00O0O.OooO0O0(marginLayoutParams);
                } else {
                    iOooO0O0 = 0;
                    iOooO0OO = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + iOooO0OO;
                if (!this.f16666OooO0o && measuredWidth2 > i5) {
                    i6 = this.f16665OooO0Oo + paddingTop;
                    this.f16668OooO0oO++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(o0000Ooo.row_index_key, Integer.valueOf(this.f16668OooO0oO - 1));
                int i8 = measuredWidth + iOooO0OO;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, i6, (i5 - measuredWidth) - iOooO0OO, measuredHeight);
                } else {
                    childAt.layout(i8, i6, measuredWidth3, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + iOooO0OO + iOooO0O0 + this.f16667OooO0o0;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !OooO00o()) {
                    paddingLeft = getPaddingLeft();
                    i7 = this.f16665OooO0Oo + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i4 + this.f16667OooO0o0 + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i3 = Pow2.MAX_POW2;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = Pow2.MAX_POW2;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i3) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f16667OooO0o0 = i;
    }

    public void setLineSpacing(int i) {
        this.f16665OooO0Oo = i;
    }

    public void setSingleLine(boolean z) {
        this.f16666OooO0o = z;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16666OooO0o = false;
        OooO0O0(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f16666OooO0o = false;
        OooO0O0(context, attributeSet);
    }
}
