package com.google.firebase.perf.util;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f20461OooO0Oo;

    public OooO0OO(OooO0o oooO0o) {
        this.f20461OooO0Oo = oooO0o;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnDrawListener(this.f20461OooO0Oo);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }
}
