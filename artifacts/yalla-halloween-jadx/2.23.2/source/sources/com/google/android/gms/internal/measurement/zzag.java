package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzag implements zzap {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzap f15178OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f15179OooO0o0;

    public zzag(String str) {
        this.f15178OooO0Oo = zzap.zzf;
        this.f15179OooO0o0 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.f15179OooO0o0.equals(zzagVar.f15179OooO0o0) && this.f15178OooO0Oo.equals(zzagVar.f15178OooO0Oo);
    }

    public final int hashCode() {
        return this.f15178OooO0Oo.hashCode() + (this.f15179OooO0o0.hashCode() * 31);
    }

    public final zzap zzb() {
        return this.f15178OooO0Oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        return this.f15179OooO0o0;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzag(this.f15179OooO0o0, this.f15178OooO0Oo.zzd());
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

    public zzag(String str, zzap zzapVar) {
        this.f15178OooO0Oo = zzapVar;
        this.f15179OooO0o0 = str;
    }

    public zzag() {
        throw null;
    }
}
