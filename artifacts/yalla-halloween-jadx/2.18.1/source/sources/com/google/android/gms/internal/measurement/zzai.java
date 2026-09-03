package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzai implements zzap, zzal {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f15890Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final HashMap f15891Oooo0oO = new HashMap();

    public zzai(String str) {
        this.f15890Oooo0o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.f15890Oooo0o;
        if (str != null) {
            return str.equals(zzaiVar.f15890Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15890Oooo0o;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract zzap zza(zzg zzgVar, List list);

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        return "toString".equals(str) ? new zzat(this.f15890Oooo0o) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    public final String zzc() {
        return this.f15890Oooo0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public zzap zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        return this.f15891Oooo0oO.containsKey(str) ? (zzap) this.f15891Oooo0oO.get(str) : zzap.zzf;
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
        return this.f15890Oooo0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return zzaj.zzb(this.f15891Oooo0oO);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.f15891Oooo0oO.remove(str);
        } else {
            this.f15891Oooo0oO.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return this.f15891Oooo0oO.containsKey(str);
    }
}
