package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaq implements zzap {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f15187OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f15188OooO0o0;

    public zzaq(String str, List list) {
        this.f15187OooO0Oo = str;
        ArrayList arrayList = new ArrayList();
        this.f15188OooO0o0 = arrayList;
        arrayList.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaq)) {
            return false;
        }
        zzaq zzaqVar = (zzaq) obj;
        String str = this.f15187OooO0Oo;
        if (str == null ? zzaqVar.f15187OooO0Oo == null : str.equals(zzaqVar.f15187OooO0Oo)) {
            return this.f15188OooO0o0.equals(zzaqVar.f15188OooO0o0);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15187OooO0Oo;
        return this.f15188OooO0o0.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final String zzb() {
        return this.f15187OooO0Oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final ArrayList zzc() {
        return this.f15188OooO0o0;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
