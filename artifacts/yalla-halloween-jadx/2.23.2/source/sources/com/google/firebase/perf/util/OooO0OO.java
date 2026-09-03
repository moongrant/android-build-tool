package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
import p039OoooOoo.o00O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public final Handler f19989OooO0Oo = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Runnable f19990OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicReference<View> f19991OooO0o0;

    public OooO0OO(View view, o00O0O0O o00o0o0o2) {
        this.f19991OooO0o0 = new AtomicReference<>(view);
        this.f19990OooO0o = o00o0o0o2;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.f19991OooO0o0.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.OooO00o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                OooO0OO oooO0OO = this.f19986OooO0Oo;
                oooO0OO.getClass();
                andSet.getViewTreeObserver().removeOnDrawListener(oooO0OO);
            }
        });
        this.f19989OooO0Oo.postAtFrontOfQueue(this.f19990OooO0o);
    }
}
