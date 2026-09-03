package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p334o0OO00o.o00OO000;

/* JADX INFO: loaded from: classes2.dex */
public final class zzks extends o00OO000 implements RandomAccess, zzkt {
    public static final zzkt zza;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ArrayList f15984Oooo0oO;

    static {
        zzks zzksVar = new zzks(10);
        zzksVar.zzb();
        zza = zzksVar;
    }

    public zzks() {
        this(10);
    }

    public static String OooO0O0(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzjd ? ((zzjd) obj).zzn(zzkm.f15980OooO00o) : zzkm.zzh((byte[]) obj);
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        OooO00o();
        this.f15984Oooo0oO.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        OooO00o();
        if (collection instanceof zzkt) {
            collection = ((zzkt) collection).zzh();
        }
        boolean zAddAll = this.f15984Oooo0oO.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooO00o();
        this.f15984Oooo0oO.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        Object objRemove = this.f15984Oooo0oO.remove(i);
        ((AbstractList) this).modCount++;
        return OooO0O0(objRemove);
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        OooO00o();
        return OooO0O0(this.f15984Oooo0oO.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15984Oooo0oO.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f15984Oooo0oO);
        return new zzks(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final zzkt zze() {
        return zzc() ? new zzms(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final Object zzf(int i) {
        return this.f15984Oooo0oO.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.f15984Oooo0oO.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            zzjd zzjdVar = (zzjd) obj;
            String strZzn = zzjdVar.zzn(zzkm.f15980OooO00o);
            if (zzjdVar.zzi()) {
                this.f15984Oooo0oO.set(i, strZzn);
            }
            return strZzn;
        }
        byte[] bArr = (byte[]) obj;
        String strZzh = zzkm.zzh(bArr);
        if (zzkm.zzi(bArr)) {
            this.f15984Oooo0oO.set(i, strZzh);
        }
        return strZzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final List zzh() {
        return Collections.unmodifiableList(this.f15984Oooo0oO);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final void zzi(zzjd zzjdVar) {
        OooO00o();
        this.f15984Oooo0oO.add(zzjdVar);
        ((AbstractList) this).modCount++;
    }

    public zzks(int i) {
        this.f15984Oooo0oO = new ArrayList(i);
    }

    public zzks(ArrayList arrayList) {
        this.f15984Oooo0oO = arrayList;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
