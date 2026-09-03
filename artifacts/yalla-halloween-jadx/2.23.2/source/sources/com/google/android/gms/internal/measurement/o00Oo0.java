package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzef f15036OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Boolean f15037OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(zzef zzefVar, Boolean bool) {
        super(zzefVar, true);
        this.f15036OooO = zzefVar;
        this.f15037OooO0oo = bool;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        if (this.f15037OooO0oo != null) {
            ((zzcc) Preconditions.checkNotNull(this.f15036OooO.f15206OooO)).setMeasurementEnabled(this.f15037OooO0oo.booleanValue(), this.f14975OooO0Oo);
        } else {
            ((zzcc) Preconditions.checkNotNull(this.f15036OooO.f15206OooO)).clearMeasurementEnabled(this.f14975OooO0Oo);
        }
    }
}
