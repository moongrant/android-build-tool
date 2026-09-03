package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzam implements zzap, zzal {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final HashMap f15892Oooo0o = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzam) {
            return this.f15892Oooo0o.equals(((zzam) obj).f15892Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15892Oooo0o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f15892Oooo0o.isEmpty()) {
            for (String str : this.f15892Oooo0o.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f15892Oooo0o.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final List zzb() {
        return new ArrayList(this.f15892Oooo0o.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public zzap zzbN(String str, zzg zzgVar, List list) {
        return "toString".equals(str) ? new zzat(toString()) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzam zzamVar = new zzam();
        for (Map.Entry entry : this.f15892Oooo0o.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzamVar.f15892Oooo0o.put((String) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzamVar.f15892Oooo0o.put((String) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzamVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        return this.f15892Oooo0o.containsKey(str) ? (zzap) this.f15892Oooo0o.get(str) : zzap.zzf;
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
        return zzaj.zzb(this.f15892Oooo0o);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.f15892Oooo0o.remove(str);
        } else {
            this.f15892Oooo0o.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return this.f15892Oooo0o.containsKey(str);
    }
}
