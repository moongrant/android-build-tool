package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzef f15387OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f15388OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(zzef zzefVar, Bundle bundle) {
        super(zzefVar, true);
        this.f15387OooO = zzefVar;
        this.f15388OooO0oo = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15387OooO.f15682OooO)).setConditionalUserProperty(this.f15388OooO0oo, this.f15452OooO0Oo);
    }
}
