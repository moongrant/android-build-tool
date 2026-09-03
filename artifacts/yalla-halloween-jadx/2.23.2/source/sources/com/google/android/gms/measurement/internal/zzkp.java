package com.google.android.gms.measurement.internal;

import android.os.Looper;
import androidx.annotation.WorkerThread;
import p271o00ooooo.c0;
import p271o00ooooo.e0;
import p271o00ooooo.f0;
import p271o00ooooo.oOo00o0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkp extends oOo00o0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.zzby f15595OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15596OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final e0 f15597OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final f0 f15598OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final c0 f15599OooO0oO;

    public zzkp(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15596OooO0Oo = true;
        this.f15598OooO0o0 = new f0(this);
        this.f15597OooO0o = new e0(this);
        this.f15599OooO0oO = new c0(this);
    }

    @Override // p271o00ooooo.oOo00o0o
    public final boolean OooO0O0() {
        return false;
    }

    @WorkerThread
    public final void OooO0OO() {
        zzg();
        if (this.f15595OooO0OO == null) {
            this.f15595OooO0OO = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }
}
