package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo0o extends zzai {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzo f15097OooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(zzo zzoVar) {
        super("getValue");
        this.f15097OooO0o = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh("getValue", 2, list);
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(1));
        String strZza = this.f15097OooO0o.zza(zzapVarZzb.zzi());
        return strZza != null ? new zzat(strZza) : zzapVarZzb2;
    }
}
