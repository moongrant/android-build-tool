package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzz {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TreeMap f15359OooO00o = new TreeMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TreeMap f15360OooO0O0 = new TreeMap();

    public final void zza(String str, int i, zzao zzaoVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f15360OooO0O0;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f15359OooO00o;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), zzaoVar);
    }

    public final void zzb(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        TreeMap treeMap = this.f15359OooO00o;
        for (Integer num : treeMap.keySet()) {
            zzaa zzaaVarClone = zzabVar.zzb().clone();
            zzap zzapVarZza = ((zzao) treeMap.get(num)).zza(zzgVar, Collections.singletonList(zzlVar));
            int iZzb = zzapVarZza instanceof zzah ? zzh.zzb(zzapVarZza.zzh().doubleValue()) : -1;
            if (iZzb == 2 || iZzb == -1) {
                zzabVar.zzf(zzaaVarClone);
            }
        }
        TreeMap treeMap2 = this.f15360OooO0O0;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzap zzapVarZza2 = ((zzao) treeMap2.get((Integer) it.next())).zza(zzgVar, Collections.singletonList(zzlVar));
            if (zzapVarZza2 instanceof zzah) {
                zzh.zzb(zzapVarZza2.zzh().doubleValue());
            }
        }
    }
}
