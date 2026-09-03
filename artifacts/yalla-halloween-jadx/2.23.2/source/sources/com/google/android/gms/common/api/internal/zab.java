package com.google.android.gms.common.api.internal;

import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import p256o00ooOO0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final class zab extends ActivityLifecycleObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<o00O0000> f14363OooO00o;

    @VisibleForTesting(otherwise = 2)
    public zab(o00O0000 o00o0001) {
        this.f14363OooO00o = new WeakReference<>(o00o0001);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        o00O0000 o00o0001 = this.f14363OooO00o.get();
        if (o00o0001 == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        synchronized (o00o0001) {
            o00o0001.f40270OooO0o0.add(runnable);
        }
        return this;
    }
}
