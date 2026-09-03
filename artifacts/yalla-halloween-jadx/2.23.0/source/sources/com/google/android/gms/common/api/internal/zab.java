package com.google.android.gms.common.api.internal;

import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import p254o00ooOO0.o000OOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class zab extends ActivityLifecycleObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<o000OOo0> f14839OooO00o;

    @VisibleForTesting(otherwise = 2)
    public zab(o000OOo0 o000ooo1) {
        this.f14839OooO00o = new WeakReference<>(o000ooo1);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        o000OOo0 o000ooo1 = this.f14839OooO00o.get();
        if (o000ooo1 == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        synchronized (o000ooo1) {
            o000ooo1.f40937OooO0o0.add(runnable);
        }
        return this;
    }
}
