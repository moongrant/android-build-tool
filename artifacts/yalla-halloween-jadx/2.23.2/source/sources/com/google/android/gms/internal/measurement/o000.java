package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f14916OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f14917OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f14918OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Bundle f14919OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f14920OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ zzef f14921OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f14922OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(zzef zzefVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzefVar, true);
        this.f14921OooOOO = zzefVar;
        this.f14917OooO0oo = l;
        this.f14916OooO = str;
        this.f14918OooOO0 = str2;
        this.f14919OooOO0O = bundle;
        this.f14920OooOO0o = z;
        this.f14922OooOOO0 = z2;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        Long l = this.f14917OooO0oo;
        ((zzcc) Preconditions.checkNotNull(this.f14921OooOOO.f15206OooO)).logEvent(this.f14916OooO, this.f14918OooOO0, this.f14919OooOO0O, this.f14920OooOO0o, this.f14922OooOOO0, l == null ? this.f14975OooO0Oo : l.longValue());
    }
}
