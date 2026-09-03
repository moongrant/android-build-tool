package com.google.android.gms.internal.measurement;

import android.support.v4.media.OooO00o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p334o0OO00o.OooO;
import p334o0OO00o.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class zzae implements Iterable, zzap, zzal {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final TreeMap f15884Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final TreeMap f15885Oooo0oO;

    public zzae() {
        this.f15884Oooo0o = new TreeMap();
        this.f15885Oooo0oO = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzc() != zzaeVar.zzc()) {
            return false;
        }
        if (this.f15884Oooo0o.isEmpty()) {
            return zzaeVar.f15884Oooo0o.isEmpty();
        }
        for (int iIntValue = ((Integer) this.f15884Oooo0o.firstKey()).intValue(); iIntValue <= ((Integer) this.f15884Oooo0o.lastKey()).intValue(); iIntValue++) {
            if (!zze(iIntValue).equals(zzaeVar.zze(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f15884Oooo0o.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new OooO(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.f15884Oooo0o.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzbb.zza(str, this, zzgVar, list) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    public final int zzc() {
        if (this.f15884Oooo0o.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f15884Oooo0o.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.f15884Oooo0o.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzaeVar.f15884Oooo0o.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzaeVar.f15884Oooo0o.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzaeVar;
    }

    public final zzap zze(int i) {
        zzap zzapVar;
        if (i < zzc()) {
            return (!zzs(i) || (zzapVar = (zzap) this.f15884Oooo0o.get(Integer.valueOf(i))) == null) ? zzap.zzf : zzapVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf(zzc()));
        }
        return (!zzt(str) || (zzapVar = (zzap) this.f15885Oooo0oO.get(str)) == null) ? zzap.zzf : zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.f15884Oooo0o.size() == 1) {
            return zze(0).zzh();
        }
        return this.f15884Oooo0o.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f15884Oooo0o.isEmpty()) {
            for (int i = 0; i < zzc(); i++) {
                zzap zzapVarZze = zze(i);
                sb.append(str);
                if (!(zzapVarZze instanceof zzau) && !(zzapVarZze instanceof zzan)) {
                    sb.append(zzapVarZze.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.f15884Oooo0o.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new OooO0o(this.f15884Oooo0o.keySet().iterator(), this.f15885Oooo0oO.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i = 0; i < zzc(); i++) {
            arrayList.add(zze(i));
        }
        return arrayList;
    }

    public final void zzn() {
        this.f15884Oooo0o.clear();
    }

    public final void zzo(int i, zzap zzapVar) {
        if (i < 0) {
            throw new IllegalArgumentException(OooO00o.OooO00o("Invalid value index: ", i));
        }
        if (i >= zzc()) {
            zzq(i, zzapVar);
            return;
        }
        for (int iIntValue = ((Integer) this.f15884Oooo0o.lastKey()).intValue(); iIntValue >= i; iIntValue--) {
            TreeMap treeMap = this.f15884Oooo0o;
            Integer numValueOf = Integer.valueOf(iIntValue);
            zzap zzapVar2 = (zzap) treeMap.get(numValueOf);
            if (zzapVar2 != null) {
                zzq(iIntValue + 1, zzapVar2);
                this.f15884Oooo0o.remove(numValueOf);
            }
        }
        zzq(i, zzapVar);
    }

    public final void zzp(int i) {
        int iIntValue = ((Integer) this.f15884Oooo0o.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        this.f15884Oooo0o.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            TreeMap treeMap = this.f15884Oooo0o;
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            this.f15884Oooo0o.put(numValueOf, zzap.zzf);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.f15884Oooo0o.lastKey()).intValue()) {
                return;
            }
            TreeMap treeMap2 = this.f15884Oooo0o;
            Integer numValueOf2 = Integer.valueOf(i);
            zzap zzapVar = (zzap) treeMap2.get(numValueOf2);
            if (zzapVar != null) {
                this.f15884Oooo0o.put(Integer.valueOf(i - 1), zzapVar);
                this.f15884Oooo0o.remove(numValueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void zzq(int i, zzap zzapVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(OooO00o.OooO00o("Out of bounds index: ", i));
        }
        if (zzapVar == null) {
            this.f15884Oooo0o.remove(Integer.valueOf(i));
        } else {
            this.f15884Oooo0o.put(Integer.valueOf(i), zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.f15885Oooo0oO.remove(str);
        } else {
            this.f15885Oooo0oO.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i) {
        if (i < 0 || i > ((Integer) this.f15884Oooo0o.lastKey()).intValue()) {
            throw new IndexOutOfBoundsException(OooO00o.OooO00o("Out of bounds index: ", i));
        }
        return this.f15884Oooo0o.containsKey(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return "length".equals(str) || this.f15885Oooo0oO.containsKey(str);
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzq(i, (zzap) list.get(i));
            }
        }
    }
}
