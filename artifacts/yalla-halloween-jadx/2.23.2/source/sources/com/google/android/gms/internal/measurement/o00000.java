package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f14925OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f14926OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f14927OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ zzbz f14928OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ zzef f14929OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(zzef zzefVar, String str, String str2, boolean z, zzbz zzbzVar) {
        super(zzefVar, true);
        this.f14929OooOO0o = zzefVar;
        this.f14926OooO0oo = str;
        this.f14925OooO = str2;
        this.f14927OooOO0 = z;
        this.f14928OooOO0O = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f14929OooOO0o.f15206OooO)).getUserProperties(this.f14926OooO0oo, this.f14925OooO, this.f14927OooOO0, this.f14928OooOO0O);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f14928OooOO0O.zze(null);
    }
}
