package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends zzai {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final HashMap f16039Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final zzj f16040Oooo0oo;

    public zzw(zzj zzjVar) {
        super("require");
        this.f16039Oooo = new HashMap();
        this.f16040Oooo0oo = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzap zzapVar;
        zzh.zzh("require", 1, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        if (this.f16039Oooo.containsKey(strZzi)) {
            return (zzap) this.f16039Oooo.get(strZzi);
        }
        zzj zzjVar = this.f16040Oooo0oo;
        if (zzjVar.f15968OooO00o.containsKey(strZzi)) {
            try {
                zzapVar = (zzap) ((Callable) zzjVar.f15968OooO00o.get(strZzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzi)));
            }
        } else {
            zzapVar = zzap.zzf;
        }
        if (zzapVar instanceof zzai) {
            this.f16039Oooo.put(strZzi, (zzai) zzapVar);
        }
        return zzapVar;
    }
}
