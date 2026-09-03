package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag implements zzap {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final zzap f15887Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f15888Oooo0oO;

    public zzag() {
        throw null;
    }

    public zzag(String str) {
        this.f15887Oooo0o = zzap.zzf;
        this.f15888Oooo0oO = str;
    }

    public zzag(String str, zzap zzapVar) {
        this.f15887Oooo0o = zzapVar;
        this.f15888Oooo0oO = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.f15888Oooo0oO.equals(zzagVar.f15888Oooo0oO) && this.f15887Oooo0o.equals(zzagVar.f15887Oooo0o);
    }

    public final int hashCode() {
        return this.f15887Oooo0o.hashCode() + (this.f15888Oooo0oO.hashCode() * 31);
    }

    public final zzap zzb() {
        return this.f15887Oooo0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        return this.f15888Oooo0oO;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzag(this.f15888Oooo0oO, this.f15887Oooo0o.zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
