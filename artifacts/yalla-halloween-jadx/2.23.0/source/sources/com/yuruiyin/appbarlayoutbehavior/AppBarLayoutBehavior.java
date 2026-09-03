package com.yuruiyin.appbarlayoutbehavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public class AppBarLayoutBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f32944OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f32945OooOOOo;

    public AppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        appBarLayout.getTotalScrollRange();
        this.f32945OooOOOo = false;
        if (this.f32944OooOOOO) {
            this.f32945OooOOOo = true;
        }
        if (motionEvent.getActionMasked() == 0) {
            Oooo0oo(appBarLayout);
        }
        return super.OooO0oO(coordinatorLayout, appBarLayout, motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOO0o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        view2.getClass().toString();
        appBarLayout.getTotalScrollRange();
        if (this.f32945OooOOOo) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, appBarLayout, view2, i, i2, i3, i4, i5);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: Oooo000 */
    public final void OooOO0O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        appBarLayout.getTotalScrollRange();
        if (i3 == 1) {
            this.f32944OooOOOO = true;
        }
        if (this.f32945OooOOOo) {
            return;
        }
        super.OooOO0O(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: Oooo00O */
    public final boolean OooOOo0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        Oooo0oo(appBarLayout);
        return super.OooOOo0(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: Oooo00o */
    public final void OooOOo(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        super.OooOOo(coordinatorLayout, appBarLayout, view, i);
        this.f32944OooOOOO = false;
        this.f32945OooOOOo = false;
    }

    public final Field Oooo0o() throws NoSuchFieldException {
        try {
            return getClass().getSuperclass().getSuperclass().getDeclaredField("mFlingRunnable");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("flingRunnable");
        }
    }

    public final Field Oooo0oO() throws NoSuchFieldException {
        try {
            return getClass().getSuperclass().getSuperclass().getDeclaredField("mScroller");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("scroller");
        }
    }

    public final void Oooo0oo(AppBarLayout appBarLayout) {
        try {
            getClass().getSuperclass().getSuperclass().getSuperclass();
            Field fieldOooo0o = Oooo0o();
            Field fieldOooo0oO = Oooo0oO();
            fieldOooo0o.setAccessible(true);
            fieldOooo0oO.setAccessible(true);
            Runnable runnable = (Runnable) fieldOooo0o.get(this);
            OverScroller overScroller = (OverScroller) fieldOooo0oO.get(this);
            if (runnable != null) {
                appBarLayout.removeCallbacks(runnable);
                fieldOooo0o.set(this, null);
            }
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            overScroller.abortAnimation();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }
}
