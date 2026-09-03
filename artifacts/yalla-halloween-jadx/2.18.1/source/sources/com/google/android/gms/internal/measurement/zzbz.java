package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbz extends zzce {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference f15909OooO00o = new AtomicReference();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f15910OooO0O0;

    public static final Object zze(Bundle bundle, Class cls) {
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
        synchronized (this.f15909OooO00o) {
            if (!this.f15910OooO0O0) {
                try {
                    this.f15909OooO00o.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f15909OooO00o.get();
        }
        return bundle;
    }

    public final String zzc(long j) {
        return (String) zze(zzb(j), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zzd(Bundle bundle) {
        synchronized (this.f15909OooO00o) {
            try {
                this.f15909OooO00o.set(bundle);
                this.f15910OooO0O0 = true;
                this.f15909OooO00o.notify();
            } catch (Throwable th) {
                this.f15909OooO00o.notify();
                throw th;
            }
        }
    }
}
