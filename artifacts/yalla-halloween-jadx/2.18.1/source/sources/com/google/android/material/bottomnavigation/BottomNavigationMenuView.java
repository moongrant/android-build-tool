package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO0o;
import androidx.core.view.ViewCompat;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p337o0OO0o0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final int f16587o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final int f16588o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final int f16589o00ooo;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f16590o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int[] f16591o0ooOOo;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final int f16592oo000o;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f16589o00ooo = resources.getDimensionPixelSize(OooOO0.design_bottom_navigation_item_max_width);
        this.f16592oo000o = resources.getDimensionPixelSize(OooOO0.design_bottom_navigation_item_min_width);
        this.f16588o00oO0o = resources.getDimensionPixelSize(OooOO0.design_bottom_navigation_active_item_max_width);
        this.f16587o00oO0O = resources.getDimensionPixelSize(OooOO0.design_bottom_navigation_active_item_min_width);
        this.f16591o0ooOOo = new int[5];
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public final NavigationBarItemView OooO0o0(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (ViewCompat.OooO.OooO0Oo(this) == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0o menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.OooOOO0().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (OooO0o(getLabelVisibilityMode(), size2) && this.f16590o0ooOO0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.f16587o00oO0O;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f16588o00oO0o, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i3 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f16592oo000o * i3), Math.min(iMax, this.f16588o00oO0o));
            int i4 = size - iMin;
            int iMin2 = Math.min(i4 / (i3 == 0 ? 1 : i3), this.f16589o00ooo);
            int i5 = i4 - (i3 * iMin2);
            int i6 = 0;
            while (i6 < childCount) {
                if (getChildAt(i6).getVisibility() != 8) {
                    this.f16591o0ooOOo[i6] = i6 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i5 > 0) {
                        int[] iArr = this.f16591o0ooOOo;
                        iArr[i6] = iArr[i6] + 1;
                        i5--;
                    }
                } else {
                    this.f16591o0ooOOo[i6] = 0;
                }
                i6++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f16588o00oO0o);
            int i7 = size - (size2 * iMin3);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr2 = this.f16591o0ooOOo;
                    iArr2[i8] = iMin3;
                    if (i7 > 0) {
                        iArr2[i8] = iArr2[i8] + 1;
                        i7--;
                    }
                } else {
                    this.f16591o0ooOOo[i8] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f16591o0ooOOo[i9], 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f16590o0ooOO0 = z;
    }
}
