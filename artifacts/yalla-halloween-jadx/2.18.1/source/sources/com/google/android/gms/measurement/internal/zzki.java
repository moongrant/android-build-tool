package com.google.android.gms.measurement.internal;

import android.os.Looper;
import androidx.annotation.WorkerThread;
import o0OO0OoO.o0O0O0Oo;
import o0OO0OoO.o0O0O0o0;
import o0OO0OoO.o0oO0O0o;
import o0OO0OoO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzki extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.zzby f16275OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0O0o0 f16276OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0oO0O0o f16277OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O0O0Oo f16278OooO0o0;

    public zzki(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16276OooO0Oo = new o0O0O0o0(this);
        this.f16278OooO0o0 = new o0O0O0Oo(this);
        this.f16277OooO0o = new o0oO0O0o(this);
    }

    @Override // o0OO0OoO.oo0o0Oo
    public final boolean OooO0O0() {
        return false;
    }

    @WorkerThread
    public final void OooO0OO() {
        zzg();
        if (this.f16275OooO0OO == null) {
            this.f16275OooO0OO = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }
}
