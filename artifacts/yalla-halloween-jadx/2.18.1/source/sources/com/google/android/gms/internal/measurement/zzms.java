package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p334o0OO00o.o0OO0;
import p334o0OO00o.o0OO00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzms extends AbstractList implements RandomAccess, zzkt {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final zzkt f15994Oooo0o;

    public zzms(zzkt zzktVar) {
        this.f15994Oooo0o = zzktVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzks) this.f15994Oooo0o).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new o0OO0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new o0OO00o0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15994Oooo0o.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final zzkt zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final Object zzf(int i) {
        return this.f15994Oooo0o.zzf(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final List zzh() {
        return this.f15994Oooo0o.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final void zzi(zzjd zzjdVar) {
        throw new UnsupportedOperationException();
    }
}
