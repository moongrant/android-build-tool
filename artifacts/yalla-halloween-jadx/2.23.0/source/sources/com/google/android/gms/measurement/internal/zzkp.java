package com.google.android.gms.measurement.internal;

import android.os.Looper;
import androidx.annotation.WorkerThread;
import p269o00ooooo.o0OO0oO0;
import p269o00ooooo.oOO;
import p269o00ooooo.oOO0OoO0;
import p269o00ooooo.oOOO000o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkp extends o0OO0oO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.zzby f16071OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16072OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oOO f16073OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oOOO000o f16074OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oOO0OoO0 f16075OooO0oO;

    public zzkp(zzgd zzgdVar) {
        super(zzgdVar);
        this.f16072OooO0Oo = true;
        this.f16074OooO0o0 = new oOOO000o(this);
        this.f16073OooO0o = new oOO(this);
        this.f16075OooO0oO = new oOO0OoO0(this);
    }

    @Override // p269o00ooooo.o0OO0oO0
    public final boolean OooO0O0() {
        return false;
    }

    @WorkerThread
    public final void OooO0OO() {
        zzg();
        if (this.f16071OooO0OO == null) {
            this.f16071OooO0OO = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }
}
