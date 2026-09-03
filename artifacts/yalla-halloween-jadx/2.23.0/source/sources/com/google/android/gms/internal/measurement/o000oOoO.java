package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f15466OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f15467OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ zzbz f15468OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ zzef f15469OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(zzef zzefVar, String str, String str2, zzbz zzbzVar) {
        super(zzefVar, true);
        this.f15469OooOO0O = zzefVar;
        this.f15467OooO0oo = str;
        this.f15466OooO = str2;
        this.f15468OooOO0 = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15469OooOO0O.f15682OooO)).getConditionalUserProperties(this.f15467OooO0oo, this.f15466OooO, this.f15468OooOO0);
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO0O0() {
        this.f15468OooOO0.zze(null);
    }
}
