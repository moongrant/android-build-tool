package com.google.android.material.tabs;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f17749Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TabLayout.TabView f17750Oooo0oO;

    public OooO0O0(TabLayout.TabView tabView, View view) {
        this.f17750Oooo0oO = tabView;
        this.f17749Oooo0o = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f17749Oooo0o.getVisibility() == 0) {
            TabLayout.TabView tabView = this.f17750Oooo0oO;
            View view2 = this.f17749Oooo0o;
            int i9 = TabLayout.TabView.f17826OoooOOo;
            tabView.OooO0o(view2);
        }
    }
}
