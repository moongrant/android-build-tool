package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlp extends o0o0Oo implements RandomAccess, zzlq {

    @Deprecated
    public static final zzlq zza = new zzlp((Object) null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List f15281OooO0o0;

    public zzlp() {
        this(10);
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        OooO00o();
        this.f15281OooO0o0.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        OooO00o();
        if (collection instanceof zzlq) {
            collection = ((zzlq) collection).zzh();
        }
        boolean zAddAll = this.f15281OooO0o0.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooO00o();
        this.f15281OooO0o0.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO00o();
        Object objRemove = this.f15281OooO0o0.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof zzka ? ((zzka) objRemove).zzm(zzlj.f15277OooO00o) : zzlj.zzd((byte[]) objRemove);
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO00o();
        Object obj2 = this.f15281OooO0o0.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof zzka ? ((zzka) obj2).zzm(zzlj.f15277OooO00o) : zzlj.zzd((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15281OooO0o0.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f15281OooO0o0);
        return new zzlp(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final zzlq zze() {
        return zzc() ? new zznp(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final Object zzf(int i) {
        return this.f15281OooO0o0.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        List list = this.f15281OooO0o0;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzka) {
            zzka zzkaVar = (zzka) obj;
            String strZzm = zzkaVar.zzm(zzlj.f15277OooO00o);
            if (zzkaVar.zzi()) {
                list.set(i, strZzm);
            }
            return strZzm;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzlj.zzd(bArr);
        o oVar = oO00000o.f15154OooO00o;
        int length = bArr.length;
        oVar.getClass();
        if (ooo0Oo0.OooO00o(0, length, bArr)) {
            list.set(i, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final List zzh() {
        return Collections.unmodifiableList(this.f15281OooO0o0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final void zzi(zzka zzkaVar) {
        OooO00o();
        this.f15281OooO0o0.add(zzkaVar);
        ((AbstractList) this).modCount++;
    }

    public zzlp(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.f15281OooO0o0 = arrayList;
    }

    public zzlp(ArrayList arrayList) {
        super(true);
        this.f15281OooO0o0 = arrayList;
    }

    public zzlp(Object obj) {
        super(false);
        this.f15281OooO0o0 = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
