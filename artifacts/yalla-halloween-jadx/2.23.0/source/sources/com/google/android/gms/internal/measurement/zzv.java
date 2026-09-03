package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzv extends zzai {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzz f15832OooO0o;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.f15832OooO0o = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.f15657OooO0Oo, 3, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(1));
        if (!(zzapVarZzb instanceof zzao)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(2));
        if (!(zzapVarZzb2 instanceof zzam)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzam zzamVar = (zzam) zzapVarZzb2;
        if (!zzamVar.zzt("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f15832OooO0o.zza(strZzi, zzamVar.zzt("priority") ? zzh.zzb(zzamVar.zzf("priority").zzh().doubleValue()) : 1000, (zzao) zzapVarZzb, zzamVar.zzf("type").zzi());
        return zzap.zzf;
    }
}
