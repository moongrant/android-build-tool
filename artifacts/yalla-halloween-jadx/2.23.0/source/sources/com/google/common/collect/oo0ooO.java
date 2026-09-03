package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class oo0ooO<F, T> extends oo0oO0<F, T> implements ListIterator<T> {
    public oo0ooO(LinkedListMultimap.OooO oooO) {
        super(oooO);
    }

    @Override // java.util.ListIterator
    public final void add(@ParametricNullness T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f19693OooO0Oo).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f19693OooO0Oo).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    @ParametricNullness
    public final T previous() {
        return (T) OooO00o(((ListIterator) this.f19693OooO0Oo).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f19693OooO0Oo).previousIndex();
    }
}
