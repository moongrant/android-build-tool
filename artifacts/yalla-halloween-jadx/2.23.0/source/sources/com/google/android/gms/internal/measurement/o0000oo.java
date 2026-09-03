package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f15431OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzbz f15432OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ zzef f15433OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(zzef zzefVar, zzbz zzbzVar, int i) {
        super(zzefVar, true);
        this.f15433OooOO0 = zzefVar;
        this.f15432OooO0oo = zzbzVar;
        this.f15431OooO = i;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15433OooOO0.f15682OooO)).getTestFlag(this.f15432OooO0oo, this.f15431OooO);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f15432OooO0oo.zze(null);
    }
}
