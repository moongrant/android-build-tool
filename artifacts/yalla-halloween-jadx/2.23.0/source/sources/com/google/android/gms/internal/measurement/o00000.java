package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f15402OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f15403OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f15404OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ zzbz f15405OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ zzef f15406OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(zzef zzefVar, String str, String str2, boolean z, zzbz zzbzVar) {
        super(zzefVar, true);
        this.f15406OooOO0o = zzefVar;
        this.f15403OooO0oo = str;
        this.f15402OooO = str2;
        this.f15404OooOO0 = z;
        this.f15405OooOO0O = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15406OooOO0o.f15682OooO)).getUserProperties(this.f15403OooO0oo, this.f15402OooO, this.f15404OooOO0, this.f15405OooOO0O);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f15405OooOO0O.zze(null);
    }
}
