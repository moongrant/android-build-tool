package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzef f14992OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzbz f14993OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(zzef zzefVar, zzbz zzbzVar) {
        super(zzefVar, true);
        this.f14992OooO = zzefVar;
        this.f14993OooO0oo = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f14992OooO.f15213OooO)).generateEventId(this.f14993OooO0oo);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f14993OooO0oo.zze(null);
    }
}
