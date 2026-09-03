package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TreeMap f16041OooO00o = new TreeMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TreeMap f16042OooO0O0 = new TreeMap();

    public static final int OooO00o(zzg zzgVar, zzao zzaoVar, zzap zzapVar) {
        zzap zzapVarZza = zzaoVar.zza(zzgVar, Collections.singletonList(zzapVar));
        if (zzapVarZza instanceof zzah) {
            return zzh.zzb(zzapVarZza.zzh().doubleValue());
        }
        return -1;
    }

    public final void zza(String str, int i, zzao zzaoVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f16042OooO0O0;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f16041OooO00o;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), zzaoVar);
    }

    public final void zzb(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        for (Integer num : this.f16041OooO00o.keySet()) {
            zzaa zzaaVarClone = zzabVar.zzb().clone();
            int iOooO00o = OooO00o(zzgVar, (zzao) this.f16041OooO00o.get(num), zzlVar);
            if (iOooO00o == 2 || iOooO00o == -1) {
                zzabVar.zzf(zzaaVarClone);
            }
        }
        Iterator it = this.f16042OooO0O0.keySet().iterator();
        while (it.hasNext()) {
            OooO00o(zzgVar, (zzao) this.f16042OooO0O0.get((Integer) it.next()), zzlVar);
        }
    }
}
