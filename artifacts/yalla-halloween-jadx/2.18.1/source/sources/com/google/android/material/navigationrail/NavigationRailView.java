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
import androidx.appcompat.widget.o0000O0;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import o0OOO0.OooO0O0;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationRailView extends NavigationBarView {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f17474OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public View f17475OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Boolean f17476OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public Boolean f17477o000oOoO;

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
        return this.f17475OoooOO0;
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
        View view = this.f17475OoooOO0;
        int i5 = 0;
        if ((view == null || view.getVisibility() == 8) ? false : true) {
            int bottom = this.f17475OoooOO0.getBottom() + this.f17474OoooO;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else {
            if ((navigationRailMenuView.f17473oo000o.gravity & 112) == 48) {
                i5 = this.f17474OoooO;
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
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i, i2);
        View view = this.f17475OoooOO0;
        if ((view == null || view.getVisibility() == 8) ? false : true) {
            measureChild(getNavigationRailMenuView(), i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f17475OoooOO0.getMeasuredHeight()) - this.f17474OoooO, Integer.MIN_VALUE));
        }
    }

    public void setItemMinimumHeight(@Px int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.navigationRailStyle);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, Oooo000.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f17477o000oOoO = null;
        this.f17476OoooOOO = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(OooOO0.mtrl_navigation_rail_margin);
        this.f17474OoooO = dimensionPixelSize;
        o0000O0 o0000o0OooO0o0 = o000oOoO.OooO0o0(getContext(), attributeSet, Oooo0.NavigationRailView, i, i2, new int[0]);
        int iOooOOO0 = o0000o0OooO0o0.OooOOO0(Oooo0.NavigationRailView_headerLayout, 0);
        if (iOooOOO0 != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(iOooOOO0, (ViewGroup) this, false);
            View view = this.f17475OoooOO0;
            if (view != null) {
                removeView(view);
                this.f17475OoooOO0 = null;
            }
            this.f17475OoooOO0 = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(viewInflate, 0, layoutParams);
        }
        setMenuGravity(o0000o0OooO0o0.OooOO0(Oooo0.NavigationRailView_menuGravity, 49));
        int i3 = Oooo0.NavigationRailView_itemMinHeight;
        if (o0000o0OooO0o0.OooOOOo(i3)) {
            setItemMinimumHeight(o0000o0OooO0o0.OooO0o(i3, -1));
        }
        int i4 = Oooo0.NavigationRailView_paddingTopSystemWindowInsets;
        if (o0000o0OooO0o0.OooOOOo(i4)) {
            this.f17477o000oOoO = Boolean.valueOf(o0000o0OooO0o0.OooO00o(i4, false));
        }
        int i5 = Oooo0.NavigationRailView_paddingBottomSystemWindowInsets;
        if (o0000o0OooO0o0.OooOOOo(i5)) {
            this.f17476OoooOOO = Boolean.valueOf(o0000o0OooO0o0.OooO00o(i5, false));
        }
        o0000o0OooO0o0.OooOOoo();
        o00Ooo.OooO00o(this, new OooO0O0(this));
    }
}
