package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbz extends zzce {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicReference f15199OooO0Oo = new AtomicReference();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f15200OooO0o0;

    public static final Object zzf(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    public final Bundle zzb(long j) {
        Bundle bundle;
        synchronized (this.f15199OooO0Oo) {
            if (!this.f15200OooO0o0) {
                try {
                    this.f15199OooO0Oo.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f15199OooO0Oo.get();
        }
        return bundle;
    }

    public final Long zzc(long j) {
        return (Long) zzf(zzb(j), Long.class);
    }

    public final String zzd(long j) {
        return (String) zzf(zzb(j), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zze(Bundle bundle) {
        synchronized (this.f15199OooO0Oo) {
            try {
                this.f15199OooO0Oo.set(bundle);
                this.f15200OooO0o0 = true;
                this.f15199OooO0Oo.notify();
            } catch (Throwable th) {
                this.f15199OooO0Oo.notify();
                throw th;
            }
        }
    }
}
