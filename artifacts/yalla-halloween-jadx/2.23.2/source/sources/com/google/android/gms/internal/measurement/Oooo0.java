package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f14907OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f14908OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Bundle f14909OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ zzef f14910OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(zzef zzefVar, String str, String str2, Bundle bundle) {
        super(zzefVar, true);
        this.f14910OooOO0O = zzefVar;
        this.f14908OooO0oo = str;
        this.f14907OooO = str2;
        this.f14909OooOO0 = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f14910OooOO0O.f15206OooO)).clearConditionalUserProperty(this.f14908OooO0oo, this.f14907OooO, this.f14909OooOO0);
    }
}
