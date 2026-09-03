package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends zzai {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzj f15357OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f15358OooO0oO;

    public zzw(zzj zzjVar) {
        super("require");
        this.f15358OooO0oO = new HashMap();
        this.f15357OooO0o = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzap zzapVar;
        zzh.zzh("require", 1, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        HashMap map = this.f15358OooO0oO;
        if (map.containsKey(strZzi)) {
            return (zzap) map.get(strZzi);
        }
        zzj zzjVar = this.f15357OooO0o;
        if (zzjVar.f15263OooO00o.containsKey(strZzi)) {
            try {
                zzapVar = (zzap) ((Callable) zzjVar.f15263OooO00o.get(strZzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzi)));
            }
        } else {
            zzapVar = zzap.zzf;
        }
        if (zzapVar instanceof zzai) {
            map.put(strZzi, (zzai) zzapVar);
        }
        return zzapVar;
    }
}
