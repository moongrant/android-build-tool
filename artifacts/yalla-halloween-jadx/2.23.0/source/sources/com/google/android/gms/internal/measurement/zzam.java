package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zzam implements zzap, zzal {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f15659OooO0Oo = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzam) {
            return this.f15659OooO0Oo.equals(((zzam) obj).f15659OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15659OooO0Oo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f15659OooO0Oo;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final List zzb() {
        return new ArrayList(this.f15659OooO0Oo.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public zzap zzbU(String str, zzg zzgVar, List list) {
        return "toString".equals(str) ? new zzat(toString()) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzam zzamVar = new zzam();
        for (Map.Entry entry : this.f15659OooO0Oo.entrySet()) {
            boolean z = entry.getValue() instanceof zzal;
            HashMap map = zzamVar.f15659OooO0Oo;
            if (z) {
                map.put((String) entry.getKey(), (zzap) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzamVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        HashMap map = this.f15659OooO0Oo;
        return map.containsKey(str) ? (zzap) map.get(str) : zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return zzaj.zzb(this.f15659OooO0Oo);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        HashMap map = this.f15659OooO0Oo;
        if (zzapVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return this.f15659OooO0Oo.containsKey(str);
    }
}
