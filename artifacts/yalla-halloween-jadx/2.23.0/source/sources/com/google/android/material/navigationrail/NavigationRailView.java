package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o000Oo0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import o0O00OOO.OooO0O0;
import org.jctools.util.Pow2;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationRailView extends NavigationBarView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f17458OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public View f17459OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Boolean f17460OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Boolean f17461OooOO0o;

    public NavigationRailView(@NonNull Context context) {
        this(context, null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavigationBarMenuView OooO00o(@NonNull Context context) {
        return new NavigationRailMenuView(context);
    }

    @Nullable
    public View getHeaderView() {
        return this.f17459OooOO0;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        View view = this.f17459OooOO0;
        int i5 = 0;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        int i6 = this.f17458OooO;
        if (z2) {
            int bottom = this.f17459OooOO0.getBottom() + i6;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else {
            if ((navigationRailMenuView.f17457Oooo0O0.gravity & 112) == 48) {
                i5 = i6;
            }
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), Pow2.MAX_POW2);
        }
        super.onMeasure(i, i2);
        View view = this.f17459OooOO0;
        if ((view == null || view.getVisibility() == 8) ? false : true) {
            measureChild(getNavigationRailMenuView(), i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f17459OooOO0.getMeasuredHeight()) - this.f17458OooO, Integer.MIN_VALUE));
        }
    }

    public void setItemMinimumHeight(@Px int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.navigationRailStyle);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, o0000O0O.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f17460OooOO0O = null;
        this.f17461OooOO0o = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(o00000O.mtrl_navigation_rail_margin);
        this.f17458OooO = dimensionPixelSize;
        o000Oo0 o000oo0OooO0o0 = o00oO0o.OooO0o0(getContext(), attributeSet, o000OO.NavigationRailView, i, i2, new int[0]);
        int iOooO = o000oo0OooO0o0.OooO(o000OO.NavigationRailView_headerLayout, 0);
        if (iOooO != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(iOooO, (ViewGroup) this, false);
            View view = this.f17459OooOO0;
            if (view != null) {
                removeView(view);
                this.f17459OooOO0 = null;
            }
            this.f17459OooOO0 = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(viewInflate, 0, layoutParams);
        }
        setMenuGravity(o000oo0OooO0o0.OooO0oo(o000OO.NavigationRailView_menuGravity, 49));
        int i3 = o000OO.NavigationRailView_itemMinHeight;
        if (o000oo0OooO0o0.OooOO0o(i3)) {
            setItemMinimumHeight(o000oo0OooO0o0.OooO0Oo(i3, -1));
        }
        int i4 = o000OO.NavigationRailView_paddingTopSystemWindowInsets;
        if (o000oo0OooO0o0.OooOO0o(i4)) {
            this.f17460OooOO0O = Boolean.valueOf(o000oo0OooO0o0.OooO00o(i4, false));
        }
        int i5 = o000OO.NavigationRailView_paddingBottomSystemWindowInsets;
        if (o000oo0OooO0o0.OooOO0o(i5)) {
            this.f17461OooOO0o = Boolean.valueOf(o000oo0OooO0o0.OooO00o(i5, false));
        }
        o000oo0OooO0o0.OooOOO();
        oo0o0Oo.OooO00o(this, new OooO0O0(this));
    }
}
