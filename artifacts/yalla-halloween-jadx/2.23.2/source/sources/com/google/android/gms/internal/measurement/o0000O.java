package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzef f14941OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o000O00 f14942OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(zzef zzefVar, o000O00 o000o01) {
        super(zzefVar, true);
        this.f14941OooO = zzefVar;
        this.f14942OooO0oo = o000o01;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f14941OooO.f15206OooO)).registerOnMeasurementEventListener(this.f14942OooO0oo);
    }
}
