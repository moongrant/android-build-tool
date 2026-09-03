package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzai implements zzap, zzal {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f15181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f15182OooO0o0 = new HashMap();

    public zzai(String str) {
        this.f15181OooO0Oo = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.f15181OooO0Oo;
        if (str != null) {
            return str.equals(zzaiVar.f15181OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15181OooO0Oo;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract zzap zza(zzg zzgVar, List list);

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        return "toString".equals(str) ? new zzat(this.f15181OooO0Oo) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    public final String zzc() {
        return this.f15181OooO0Oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public zzap zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        HashMap map = this.f15182OooO0o0;
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
        return this.f15181OooO0Oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return zzaj.zzb(this.f15182OooO0o0);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        HashMap map = this.f15182OooO0o0;
        if (zzapVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return this.f15182OooO0o0.containsKey(str);
    }
}
