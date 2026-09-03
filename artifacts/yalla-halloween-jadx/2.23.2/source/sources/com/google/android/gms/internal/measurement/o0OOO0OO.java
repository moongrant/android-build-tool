package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0OO implements ListIterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ListIterator f15121OooO0Oo;

    public o0OOO0OO(zznp zznpVar, int i) {
        this.f15121OooO0Oo = zznpVar.f15291OooO0Oo.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15121OooO0Oo.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15121OooO0Oo.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f15121OooO0Oo.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15121OooO0Oo.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f15121OooO0Oo.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15121OooO0Oo.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
