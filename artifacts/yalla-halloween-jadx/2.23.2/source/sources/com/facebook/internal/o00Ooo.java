package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Ooo implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13723OooO0Oo;

    public /* synthetic */ o00Ooo(int i) {
        this.f13723OooO0Oo = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f13723OooO0Oo) {
            case 0:
                return WebDialog.m4144setUpWebView$lambda7(view, motionEvent);
            default:
                int i = SearchView.f17052OooOooO;
                return true;
        }
    }
}
