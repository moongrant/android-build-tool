package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf implements zzap {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f15653OooO0Oo;

    public zzaf(Boolean bool) {
        this.f15653OooO0Oo = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaf) && this.f15653OooO0Oo == ((zzaf) obj).f15653OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f15653OooO0Oo).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f15653OooO0Oo);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f15653OooO0Oo;
        if (zEquals) {
            return new zzat(Boolean.toString(z));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(z), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzaf(Boolean.valueOf(this.f15653OooO0Oo));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(this.f15653OooO0Oo);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return Double.valueOf(true != this.f15653OooO0Oo ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return Boolean.toString(this.f15653OooO0Oo);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
