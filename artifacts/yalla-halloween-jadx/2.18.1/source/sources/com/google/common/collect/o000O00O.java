package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o000O00O<E> extends o000O00<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public final Comparator<? super E> comparator() {
        return ((o0O00O0o.OooO0O0) this).f18606Oooo0oO.comparator();
    }

    @Override // java.util.SortedSet
    public final E first() {
        return ((o0O00O0o.OooO0O0) this).f18606Oooo0oO.first();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(E e) {
        return ((o0O00O0o.OooO0O0) this).f18606Oooo0oO.headSet(e);
    }

    @Override // java.util.SortedSet
    public final E last() {
        return ((o0O00O0o.OooO0O0) this).f18606Oooo0oO.last();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(E e, E e2) {
        return ((o0O00O0o.OooO0O0) this).f18606Oooo0oO.subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(E e) {
        return ((o0O00O0o.OooO0O0) this).f18606Oooo0oO.tailSet(e);
    }
}
