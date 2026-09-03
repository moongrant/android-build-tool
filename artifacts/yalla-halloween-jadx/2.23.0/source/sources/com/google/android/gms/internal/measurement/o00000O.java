package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzbz f15411OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f15412OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ zzef f15413OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(zzef zzefVar, Bundle bundle, zzbz zzbzVar) {
        super(zzefVar, true);
        this.f15413OooOO0 = zzefVar;
        this.f15412OooO0oo = bundle;
        this.f15411OooO = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15413OooOO0.f15682OooO)).performAction(this.f15412OooO0oo, this.f15411OooO, this.f15452OooO0Oo);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f15411OooO.zze(null);
    }
}
