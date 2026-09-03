package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO;
import androidx.camera.core.impl.o00O;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.jctools.util.Pow2;
import p272o0O0000o.o00000O;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int f15951Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int f15952Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final int f15953Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f15954Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final int f15955Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ArrayList f15956Oooo0oO;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.f15956Oooo0oO = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f15951Oooo0 = resources.getDimensionPixelSize(o00000O.design_bottom_navigation_item_max_width);
        this.f15952Oooo0O0 = resources.getDimensionPixelSize(o00000O.design_bottom_navigation_item_min_width);
        this.f15953Oooo0OO = resources.getDimensionPixelSize(o00000O.design_bottom_navigation_active_item_max_width);
        this.f15955Oooo0o0 = resources.getDimensionPixelSize(o00000O.design_bottom_navigation_active_item_min_width);
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
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
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
        int i3;
        int i4;
        OooO menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.OooOO0o().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f15956Oooo0oO;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, Pow2.MAX_POW2);
        boolean zOooO0o = NavigationBarMenuView.OooO0o(getLabelVisibilityMode(), size2);
        int i5 = this.f15953Oooo0OO;
        if (zOooO0o && this.f15954Oooo0o) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.f15955Oooo0o0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f15952Oooo0O0 * i6), Math.min(iMax, i5));
            int i7 = size - iMin;
            int iMin2 = Math.min(i7 / (i6 != 0 ? i6 : 1), this.f15951Oooo0);
            int i8 = i7 - (i6 * iMin2);
            int iOooO00o = 0;
            while (iOooO00o < childCount) {
                if (getChildAt(iOooO00o).getVisibility() != 8) {
                    i4 = iOooO00o == getSelectedItemPosition() ? iMin : iMin2;
                    if (i8 > 0) {
                        i4++;
                        i8--;
                    }
                } else {
                    i4 = 0;
                }
                iOooO00o = o00O.OooO00o(i4, arrayList, iOooO00o, 1);
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), i5);
            int i9 = size - (size2 * iMin3);
            int iOooO00o2 = 0;
            while (iOooO00o2 < childCount) {
                if (getChildAt(iOooO00o2).getVisibility() == 8) {
                    i3 = 0;
                } else if (i9 > 0) {
                    i3 = iMin3 + 1;
                    i9--;
                } else {
                    i3 = iMin3;
                }
                iOooO00o2 = o00O.OooO00o(i3, arrayList, iOooO00o2, 1);
            }
        }
        int measuredWidth = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i10)).intValue(), Pow2.MAX_POW2), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth = childAt2.getMeasuredWidth() + measuredWidth;
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f15954Oooo0o = z;
    }
}
