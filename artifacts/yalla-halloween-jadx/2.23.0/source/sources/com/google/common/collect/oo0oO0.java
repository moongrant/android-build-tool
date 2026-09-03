package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class oo0oO0<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Iterator<? extends F> f19693OooO0Oo;

    public oo0oO0(Iterator<? extends F> it) {
        it.getClass();
        this.f19693OooO0Oo = it;
    }

    @ParametricNullness
    public abstract T OooO00o(@ParametricNullness F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19693OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        return OooO00o(this.f19693OooO0Oo.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19693OooO0Oo.remove();
    }
}
