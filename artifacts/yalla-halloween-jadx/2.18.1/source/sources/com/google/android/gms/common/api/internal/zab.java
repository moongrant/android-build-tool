package com.google.android.gms.common.api.internal;

import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import p331o0O0oooO.o0;

/* JADX INFO: loaded from: classes2.dex */
public final class zab extends ActivityLifecycleObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<o0> f15340OooO00o;

    @VisibleForTesting(otherwise = 2)
    public zab(o0 o0Var) {
        this.f15340OooO00o = new WeakReference<>(o0Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.Runnable>] */
    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        o0 o0Var = this.f15340OooO00o.get();
        if (o0Var == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        synchronized (o0Var) {
            o0Var.f37069Oooo0oO.add(runnable);
        }
        return this;
    }
}
