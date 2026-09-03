package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f14954OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzbz f14955OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ zzef f14956OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(zzef zzefVar, zzbz zzbzVar, int i) {
        super(zzefVar, true);
        this.f14956OooOO0 = zzefVar;
        this.f14955OooO0oo = zzbzVar;
        this.f14954OooO = i;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f14956OooOO0.f15206OooO)).getTestFlag(this.f14955OooO0oo, this.f14954OooO);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f14955OooO0oo.zze(null);
    }
}
