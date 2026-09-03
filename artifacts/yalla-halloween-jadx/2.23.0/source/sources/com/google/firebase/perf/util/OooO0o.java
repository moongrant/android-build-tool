package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
import p308o0O0oO0O.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public final Handler f20462OooO0Oo = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Runnable f20463OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicReference<View> f20464OooO0o0;

    public OooO0o(View view, Oooo0 oooo0) {
        this.f20464OooO0o0 = new AtomicReference<>(view);
        this.f20463OooO0o = oooo0;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.f20464OooO0o0.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.OooO0O0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                OooO0o oooO0o = this.f20459OooO0Oo;
                oooO0o.getClass();
                andSet.getViewTreeObserver().removeOnDrawListener(oooO0o);
            }
        });
        this.f20462OooO0Oo.postAtFrontOfQueue(this.f20463OooO0o);
    }
}
