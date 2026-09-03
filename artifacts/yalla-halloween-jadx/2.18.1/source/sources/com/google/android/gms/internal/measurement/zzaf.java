package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf implements zzap {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f15886Oooo0o;

    public zzaf(Boolean bool) {
        this.f15886Oooo0o = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaf) && this.f15886Oooo0o == ((zzaf) obj).f15886Oooo0o;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f15886Oooo0o).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f15886Oooo0o);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        if ("toString".equals(str)) {
            return new zzat(Boolean.toString(this.f15886Oooo0o));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f15886Oooo0o), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzaf(Boolean.valueOf(this.f15886Oooo0o));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(this.f15886Oooo0o);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return Double.valueOf(true != this.f15886Oooo0o ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return Boolean.toString(this.f15886Oooo0o);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
