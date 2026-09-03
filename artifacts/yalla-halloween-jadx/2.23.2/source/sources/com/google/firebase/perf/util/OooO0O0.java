package com.google.firebase.perf.util;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f19988OooO0Oo;

    public OooO0O0(OooO0OO oooO0OO) {
        this.f19988OooO0Oo = oooO0OO;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnDrawListener(this.f19988OooO0Oo);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }
}
