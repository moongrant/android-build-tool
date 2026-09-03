package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbc extends zzaw {
    public zzbc() {
        this.f15666OooO00o.add(zzbl.AND);
        this.f15666OooO00o.add(zzbl.NOT);
        this.f15666OooO00o.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 1) {
            zzap zzapVarZzb = zzgVar.zzb((zzap) OooOO0.OooO00o(zzbl.AND, 2, list, 0));
            return !zzapVarZzb.zzg().booleanValue() ? zzapVarZzb : zzgVar.zzb((zzap) list.get(1));
        }
        if (iOrdinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) OooOO0.OooO00o(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
        }
        if (iOrdinal == 50) {
            zzap zzapVarZzb2 = zzgVar.zzb((zzap) OooOO0.OooO00o(zzbl.OR, 2, list, 0));
            return zzapVarZzb2.zzg().booleanValue() ? zzapVarZzb2 : zzgVar.zzb((zzap) list.get(1));
        }
        OooO00o(str);
        throw null;
    }
}
