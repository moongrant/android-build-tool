package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaq implements zzap {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f15896Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ArrayList f15897Oooo0oO;

    public zzaq(String str, List list) {
        this.f15896Oooo0o = str;
        ArrayList arrayList = new ArrayList();
        this.f15897Oooo0oO = arrayList;
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
        String str = this.f15896Oooo0o;
        if (str == null ? zzaqVar.f15896Oooo0o == null : str.equals(zzaqVar.f15896Oooo0o)) {
            return this.f15897Oooo0oO.equals(zzaqVar.f15897Oooo0oO);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15896Oooo0o;
        return this.f15897Oooo0oO.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final String zzb() {
        return this.f15896Oooo0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final ArrayList zzc() {
        return this.f15897Oooo0oO;
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
