package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
import p037OoooOo0.o0000O0;
import p037OoooOo0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public final Handler f20466OooO0Oo = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Runnable f20467OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicReference<View> f20468OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Runnable f20469OooO0oO;

    public OooOO0O(View view, o0000oo o0000ooVar, o0000O0 o0000o1) {
        this.f20468OooO0o0 = new AtomicReference<>(view);
        this.f20467OooO0o = o0000ooVar;
        this.f20469OooO0oO = o0000o1;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.f20468OooO0o0.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.f20466OooO0Oo;
        handler.post(this.f20467OooO0o);
        handler.postAtFrontOfQueue(this.f20469OooO0oO);
        return true;
    }
}
