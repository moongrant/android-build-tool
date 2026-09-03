package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o000O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f15452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f15453OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f15454OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzef f15455OooO0oO;

    public o000O0o(zzef zzefVar, boolean z) {
        this.f15455OooO0oO = zzefVar;
        this.f15452OooO0Oo = zzefVar.f15684OooO0O0.currentTimeMillis();
        this.f15454OooO0o0 = zzefVar.f15684OooO0O0.elapsedRealtime();
        this.f15453OooO0o = z;
    }

    public abstract void OooO00o() throws RemoteException;

    public void OooO0O0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzef zzefVar = this.f15455OooO0oO;
        if (zzefVar.f15689OooO0oO) {
            OooO0O0();
            return;
        }
        try {
            OooO00o();
        } catch (Exception e) {
            zzefVar.OooO00o(e, false, this.f15453OooO0o);
            OooO0O0();
        }
    }
}
