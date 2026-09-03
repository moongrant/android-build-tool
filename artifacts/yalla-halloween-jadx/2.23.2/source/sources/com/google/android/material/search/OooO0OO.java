package com.google.android.material.search;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchBar f17020OooO0Oo;

    public OooO0OO(SearchBar searchBar) {
        this.f17020OooO0Oo = searchBar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        SearchBar searchBar = this.f17020OooO0Oo;
        o0000O.OooO0OO.OooO00o(searchBar.f17048o0OoOo0, searchBar.f17049ooOO);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        SearchBar searchBar = this.f17020OooO0Oo;
        o0000O.OooO0OO.OooO0O0(searchBar.f17048o0OoOo0, searchBar.f17049ooOO);
    }
}
