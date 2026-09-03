package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o0O0OOOo<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Iterator<? extends F> f18625Oooo0o;

    public o0O0OOOo(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f18625Oooo0o = it;
    }

    public abstract T OooO00o(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18625Oooo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return OooO00o(this.f18625Oooo0o.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18625Oooo0o.remove();
    }
}
