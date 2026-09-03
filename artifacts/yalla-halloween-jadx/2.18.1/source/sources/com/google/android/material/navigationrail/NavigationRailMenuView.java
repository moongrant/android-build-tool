package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import o0OOO0.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @Px
    public int f17472o00ooo;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final FrameLayout.LayoutParams f17473oo000o;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.f17472o00ooo = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f17473oo000o = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public final NavigationBarItemView OooO0o0(@NonNull Context context) {
        return new OooO00o(context);
    }

    public final int OooO0oO(int i, int i2, int i3) {
        int iMax = i2 / Math.max(1, i3);
        int size = this.f17472o00ooo;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    public final int OooO0oo(int i, int i2, int i3, View view) {
        int measuredHeight;
        OooO0oO(i, i2, i3);
        int iOooO0oO = view == null ? OooO0oO(i, i2, i3) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i, iOooO0oO);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                i4 += measuredHeight;
            }
        }
        return i4;
    }

    @Px
    public int getItemMinimumHeight() {
        return this.f17472o00ooo;
    }

    public int getMenuGravity() {
        return this.f17473oo000o.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iOooO0oo;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().OooOOO0().size();
        if (size2 <= 1 || !OooO0o(getLabelVisibilityMode(), size2)) {
            iOooO0oo = OooO0oo(i, size, size2, null);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int iOooO0oO = OooO0oO(i, size, size2);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i, iOooO0oO);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                size -= measuredHeight;
                size2--;
            } else {
                measuredHeight = 0;
            }
            iOooO0oo = OooO0oo(i, size, size2, childAt) + measuredHeight;
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(iOooO0oo, i2, 0));
    }

    public void setItemMinimumHeight(@Px int i) {
        if (this.f17472o00ooo != i) {
            this.f17472o00ooo = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.f17473oo000o;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
