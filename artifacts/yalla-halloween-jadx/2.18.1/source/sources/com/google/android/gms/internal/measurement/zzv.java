package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv extends zzai {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final zzz f16038Oooo0oo;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.f16038Oooo0oo = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.f15890Oooo0o, 3, list);
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
        this.f16038Oooo0oo.zza(strZzi, zzamVar.zzt("priority") ? zzh.zzb(zzamVar.zzf("priority").zzh().doubleValue()) : 1000, (zzao) zzapVarZzb, zzamVar.zzf("type").zzi());
        return zzap.zzf;
    }
}
