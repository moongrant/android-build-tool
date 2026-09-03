package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o000O0<E> extends o000O00O<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator<? super E> comparator() {
        return ((o0O0O0Oo.OooO) this).f19104OooO0o0.comparator();
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public final E first() {
        return ((o0O0O0Oo.OooO) this).f19104OooO0o0.first();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(@ParametricNullness E e) {
        return ((o0O0O0Oo.OooO) this).f19104OooO0o0.headSet(e);
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public final E last() {
        return ((o0O0O0Oo.OooO) this).f19104OooO0o0.last();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
        return ((o0O0O0Oo.OooO) this).f19104OooO0o0.subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(@ParametricNullness E e) {
        return ((o0O0O0Oo.OooO) this).f19104OooO0o0.tailSet(e);
    }
}
