package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f15393OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f15394OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f15395OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Bundle f15396OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15397OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ zzef f15398OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f15399OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(zzef zzefVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzefVar, true);
        this.f15398OooOOO = zzefVar;
        this.f15394OooO0oo = l;
        this.f15393OooO = str;
        this.f15395OooOO0 = str2;
        this.f15396OooOO0O = bundle;
        this.f15397OooOO0o = z;
        this.f15399OooOOO0 = z2;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        Long l = this.f15394OooO0oo;
        ((zzcc) Preconditions.checkNotNull(this.f15398OooOOO.f15682OooO)).logEvent(this.f15393OooO, this.f15395OooOO0, this.f15396OooOO0O, this.f15397OooOO0o, this.f15399OooOOO0, l == null ? this.f15452OooO0Oo : l.longValue());
    }
}
