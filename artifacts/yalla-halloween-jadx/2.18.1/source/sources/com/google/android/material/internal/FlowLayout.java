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
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f17179Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f17180Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f17181Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f17182Oooo0oo;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    public boolean OooO00o() {
        return this.f17182Oooo0oo;
    }

    public final void OooO0O0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p337o0OO0o0.Oooo0.FlowLayout, 0, 0);
        this.f17180Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(p337o0OO0o0.Oooo0.FlowLayout_lineSpacing, 0);
        this.f17181Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(p337o0OO0o0.Oooo0.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f17181Oooo0oO;
    }

    public int getLineSpacing() {
        return this.f17180Oooo0o;
    }

    public int getRowCount() {
        return this.f17179Oooo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iOooO0O0;
        int iOooO0OO;
        if (getChildCount() == 0) {
            this.f17179Oooo = 0;
            return;
        }
        this.f17179Oooo = 1;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
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
                childAt.setTag(p337o0OO0o0.OooOOO0.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iOooO0OO = o000O0O0.OooOO0.OooO0OO(marginLayoutParams);
                    iOooO0O0 = o000O0O0.OooOO0.OooO0O0(marginLayoutParams);
                } else {
                    iOooO0O0 = 0;
                    iOooO0OO = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + iOooO0OO;
                if (!this.f17182Oooo0oo && measuredWidth2 > i5) {
                    i6 = this.f17180Oooo0o + paddingTop;
                    this.f17179Oooo++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(p337o0OO0o0.OooOOO0.row_index_key, Integer.valueOf(this.f17179Oooo - 1));
                int i8 = measuredWidth + iOooO0OO;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, i6, (i5 - measuredWidth) - iOooO0OO, measuredHeight);
                } else {
                    childAt.layout(i8, i6, measuredWidth3, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + iOooO0OO + iOooO0O0 + this.f17181Oooo0oO;
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
                    i7 = paddingTop + this.f17180Oooo0o;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i4 + this.f17181Oooo0oO + paddingLeft;
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
            i3 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = 1073741824;
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
        this.f17181Oooo0oO = i;
    }

    public void setLineSpacing(int i) {
        this.f17180Oooo0o = i;
    }

    public void setSingleLine(boolean z) {
        this.f17182Oooo0oo = z;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17182Oooo0oo = false;
        OooO0O0(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f17182Oooo0oo = false;
        OooO0O0(context, attributeSet);
    }
}
