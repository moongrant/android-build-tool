package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotCall;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class OooO0OO<E> extends o0OO0<Object> implements ListIterator<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f18825OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f18826OooO0o0;

    public OooO0OO(int i, int i2) {
        com.google.common.base.o0OoOo0.OooOO0(i2, i);
        this.f18825OooO0Oo = i;
        this.f18826OooO0o0 = i2;
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void OooO00o(@ParametricNullness Object obj) {
        throw new UnsupportedOperationException();
    }

    @ParametricNullness
    public abstract E OooO0O0(int i);

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void OooO0OO(@ParametricNullness Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        OooO00o(obj);
        throw null;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18826OooO0o0 < this.f18825OooO0Oo;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18826OooO0o0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @ParametricNullness
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f18826OooO0o0;
        this.f18826OooO0o0 = i + 1;
        return OooO0O0(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18826OooO0o0;
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f18826OooO0o0 - 1;
        this.f18826OooO0o0 = i;
        return OooO0O0(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18826OooO0o0 - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        OooO0OO(obj);
        throw null;
    }
}
