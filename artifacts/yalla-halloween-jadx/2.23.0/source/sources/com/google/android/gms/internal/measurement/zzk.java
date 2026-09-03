package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzk extends zzai {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzab f15742OooO0o;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.f15742OooO0o = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.f15657OooO0Oo, 3, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        long jZza = (long) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(2));
        this.f15742OooO0o.zze(strZzi, jZza, zzapVarZzb instanceof zzam ? zzh.zzg((zzam) zzapVarZzb) : new HashMap());
        return zzap.zzf;
    }
}
