package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzax f15215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zzg f15216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final zzg f15217OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzj f15218OooO0Oo;

    public zzf() {
        zzax zzaxVar = new zzax();
        this.f15215OooO00o = zzaxVar;
        zzg zzgVar = new zzg(null, zzaxVar);
        this.f15217OooO0OO = zzgVar;
        this.f15216OooO0O0 = zzgVar.zza();
        zzj zzjVar = new zzj();
        this.f15218OooO0Oo = zzjVar;
        zzgVar.zzg("require", new zzw(zzjVar));
        zzjVar.zza("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzgVar.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzap zza(zzg zzgVar, zzgy... zzgyVarArr) {
        zzap zzapVarZza = zzap.zzf;
        for (zzgy zzgyVar : zzgyVarArr) {
            zzapVarZza = zzi.zza(zzgyVar);
            zzh.zzc(this.f15217OooO0OO);
            if ((zzapVarZza instanceof zzaq) || (zzapVarZza instanceof zzao)) {
                zzapVarZza = this.f15215OooO00o.zza(zzgVar, zzapVarZza);
            }
        }
        return zzapVarZza;
    }
}
