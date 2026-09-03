package com.google.android.material.tabs;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f17380OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TabLayout.TabView f17381OooO0o0;

    public OooO0OO(TabLayout.TabView tabView, View view) {
        this.f17381OooO0o0 = tabView;
        this.f17380OooO0Oo = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f17380OooO0Oo;
        if (view2.getVisibility() == 0) {
            int i9 = TabLayout.TabView.f17455OooOOOO;
            this.f17381OooO0o0.OooO0OO(view2);
        }
    }
}
