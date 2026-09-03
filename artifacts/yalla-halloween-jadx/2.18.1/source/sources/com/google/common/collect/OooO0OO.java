package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class OooO0OO<E> extends o0O0o000<Object> implements ListIterator<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f18309Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f18310Oooo0oO;

    public OooO0OO(int i, int i2) {
        o0OOOO0o.OooOOOO.OooOO0O(i2, i);
        this.f18309Oooo0o = i;
        this.f18310Oooo0oO = i2;
    }

    public abstract E OooO00o(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18310Oooo0oO < this.f18309Oooo0o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18310Oooo0oO > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f18310Oooo0oO;
        this.f18310Oooo0oO = i + 1;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18310Oooo0oO;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f18310Oooo0oO - 1;
        this.f18310Oooo0oO = i;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18310Oooo0oO - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
