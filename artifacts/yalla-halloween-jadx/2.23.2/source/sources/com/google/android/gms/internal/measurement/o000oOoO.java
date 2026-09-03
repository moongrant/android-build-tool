package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f14989OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f14990OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ zzbz f14991OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ zzef f14992OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(zzef zzefVar, String str, String str2, zzbz zzbzVar) {
        super(zzefVar, true);
        this.f14992OooOO0O = zzefVar;
        this.f14990OooO0oo = str;
        this.f14989OooO = str2;
        this.f14991OooOO0 = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f14992OooOO0O.f15206OooO)).getConditionalUserProperties(this.f14990OooO0oo, this.f14989OooO, this.f14991OooOO0);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f14991OooOO0.zze(null);
    }
}
