package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zznp extends AbstractList implements RandomAccess, zzlq {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzlq f15767OooO0Oo;

    public zznp(zzlq zzlqVar) {
        this.f15767OooO0Oo = zzlqVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzlp) this.f15767OooO0Oo).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new o0OOOO00(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new o0OOO0OO(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15767OooO0Oo.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final zzlq zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final Object zzf(int i) {
        return this.f15767OooO0Oo.zzf(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final List zzh() {
        return this.f15767OooO0Oo.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final void zzi(zzka zzkaVar) {
        throw new UnsupportedOperationException();
    }
}
