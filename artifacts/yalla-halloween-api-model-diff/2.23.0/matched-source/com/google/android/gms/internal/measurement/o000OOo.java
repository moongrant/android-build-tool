package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzef f15462OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzbz f15463OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(zzef zzefVar, zzbz zzbzVar) {
        super(zzefVar, true);
        this.f15462OooO = zzefVar;
        this.f15463OooO0oo = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15462OooO.f15682OooO)).generateEventId(this.f15463OooO0oo);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f15463OooO0oo.zze(null);
    }
}
