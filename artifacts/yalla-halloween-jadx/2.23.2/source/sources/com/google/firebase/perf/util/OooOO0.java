package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public final Handler f19994OooO0Oo = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Runnable f19995OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicReference<View> f19996OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Runnable f19997OooO0oO;

    public OooOO0(View view, androidx.activity.OooOOO0 oooOOO0, androidx.core.widget.OooO0o oooO0o) {
        this.f19996OooO0o0 = new AtomicReference<>(view);
        this.f19995OooO0o = oooOOO0;
        this.f19997OooO0oO = oooO0o;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.f19996OooO0o0.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.f19994OooO0Oo;
        handler.post(this.f19995OooO0o);
        handler.postAtFrontOfQueue(this.f19997OooO0oO);
        return true;
    }
}
