package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.o000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NavigationView f16982OooO0Oo;

    public OooO0o(NavigationView navigationView) {
        this.f16982OooO0Oo = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f16982OooO0Oo;
        navigationView.getLocationOnScreen(navigationView.f16966OooOOO);
        int[] iArr = navigationView.f16966OooOOO;
        boolean z = true;
        boolean z2 = iArr[1] == 0;
        NavigationMenuPresenter navigationMenuPresenter = navigationView.f16965OooOO0o;
        if (navigationMenuPresenter.f16708OooOoO != z2) {
            navigationMenuPresenter.f16708OooOoO = z2;
            int i = (navigationMenuPresenter.f16690OooO0o0.getChildCount() == 0 && navigationMenuPresenter.f16708OooOoO) ? navigationMenuPresenter.f16712OooOoo0 : 0;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.f16688OooO0Oo;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        navigationView.setDrawTopInsetForeground(z2 && navigationView.f16971OooOOo0);
        int i2 = iArr[0];
        navigationView.setDrawLeftInsetForeground(i2 == 0 || navigationView.getWidth() + i2 == 0);
        Context context = navigationView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            Rect rectOooO00o = o000OOo.OooO00o(activity);
            navigationView.setDrawBottomInsetForeground((rectOooO00o.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f16970OooOOo);
            if (rectOooO00o.width() != iArr[0] && rectOooO00o.width() - navigationView.getWidth() != iArr[0]) {
                z = false;
            }
            navigationView.setDrawRightInsetForeground(z);
        }
    }
}
