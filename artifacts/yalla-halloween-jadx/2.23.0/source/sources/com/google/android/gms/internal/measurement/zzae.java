package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzae implements Iterable, zzap, zzal {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TreeMap f15651OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TreeMap f15652OooO0o0;

    public zzae() {
        this.f15651OooO0Oo = new TreeMap();
        this.f15652OooO0o0 = new TreeMap();
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
        TreeMap treeMap = this.f15651OooO0Oo;
        if (treeMap.isEmpty()) {
            return zzaeVar.f15651OooO0Oo.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!zze(iIntValue).equals(zzaeVar.zze(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f15651OooO0Oo.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new OooO0O0(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.f15651OooO0Oo.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzbb.zza(str, this, zzgVar, list) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    public final int zzc() {
        TreeMap treeMap = this.f15651OooO0Oo;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.f15651OooO0Oo.entrySet()) {
            boolean z = entry.getValue() instanceof zzal;
            TreeMap treeMap = zzaeVar.f15651OooO0Oo;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzaeVar;
    }

    public final zzap zze(int i) {
        zzap zzapVar;
        if (i < zzc()) {
            return (!zzs(i) || (zzapVar = (zzap) this.f15651OooO0Oo.get(Integer.valueOf(i))) == null) ? zzap.zzf : zzapVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf(zzc()));
        }
        return (!zzt(str) || (zzapVar = (zzap) this.f15652OooO0o0.get(str)) == null) ? zzap.zzf : zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        TreeMap treeMap = this.f15651OooO0Oo;
        if (treeMap.size() == 1) {
            return zze(0).zzh();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f15651OooO0Oo.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= zzc()) {
                    break;
                }
                zzap zzapVarZze = zze(i);
                sb.append(str2);
                if (!(zzapVarZze instanceof zzau) && !(zzapVarZze instanceof zzan)) {
                    sb.append(zzapVarZze.zzi());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.f15651OooO0Oo.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new OooO00o(this.f15651OooO0Oo.keySet().iterator(), this.f15652OooO0o0.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i = 0; i < zzc(); i++) {
            arrayList.add(zze(i));
        }
        return arrayList;
    }

    public final void zzn() {
        this.f15651OooO0Oo.clear();
    }

    public final void zzo(int i, zzap zzapVar) {
        if (i < 0) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid value index: ", i));
        }
        if (i >= zzc()) {
            zzq(i, zzapVar);
            return;
        }
        TreeMap treeMap = this.f15651OooO0Oo;
        for (int iIntValue = ((Integer) treeMap.lastKey()).intValue(); iIntValue >= i; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            zzap zzapVar2 = (zzap) treeMap.get(numValueOf);
            if (zzapVar2 != null) {
                zzq(iIntValue + 1, zzapVar2);
                treeMap.remove(numValueOf);
            }
        }
        zzq(i, zzapVar);
    }

    public final void zzp(int i) {
        TreeMap treeMap = this.f15651OooO0Oo;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, zzap.zzf);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            zzap zzapVar = (zzap) treeMap.get(numValueOf2);
            if (zzapVar != null) {
                treeMap.put(Integer.valueOf(i - 1), zzapVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void zzq(int i, zzap zzapVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(android.support.v4.media.OooO00o.OooO00o("Out of bounds index: ", i));
        }
        TreeMap treeMap = this.f15651OooO0Oo;
        if (zzapVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        TreeMap treeMap = this.f15652OooO0o0;
        if (zzapVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f15651OooO0Oo;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.OooO00o.OooO00o("Out of bounds index: ", i));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return "length".equals(str) || this.f15652OooO0o0.containsKey(str);
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
