package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ NavigationView f17471Oooo0o;

    public OooO0OO(NavigationView navigationView) {
        this.f17471Oooo0o = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f17471Oooo0o;
        navigationView.getLocationOnScreen(navigationView.f17464o000oOoO);
        NavigationView navigationView2 = this.f17471Oooo0o;
        boolean z = navigationView2.f17464o000oOoO[1] == 0;
        OooOOO0 oooOOO0 = navigationView2.f17454OoooO0O;
        if (oooOOO0.f17299Oooooo != z) {
            oooOOO0.f17299Oooooo = z;
            oooOOO0.OooOO0();
        }
        NavigationView navigationView3 = this.f17471Oooo0o;
        navigationView3.setDrawTopInsetForeground(z && navigationView3.f17458OoooOo0);
        Context context = this.f17471Oooo0o.getContext();
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
            boolean z2 = activity.findViewById(R.id.content).getHeight() == this.f17471Oooo0o.getHeight();
            boolean z3 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
            NavigationView navigationView4 = this.f17471Oooo0o;
            navigationView4.setDrawBottomInsetForeground(z2 && z3 && navigationView4.f17459OoooOoO);
        }
    }
}
