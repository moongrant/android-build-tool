package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.NavigableSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class o00000OO<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final ImmutableSortedSet<E> f18436OoooO0;

    public o00000OO(ImmutableSortedSet<E> immutableSortedSet) {
        super(o0oOO.OooO00o(immutableSortedSet.comparator()).OooO0O0());
        this.f18436OoooO0 = immutableSortedSet;
    }

    @Override // com.google.common.collect.o00O000, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO */
    public final o0O0o000<E> iterator() {
        return this.f18436OoooO0.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return this.f18436OoooO0.OooO0oo();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible("NavigableSet")
    public final ImmutableSortedSet<E> OooOOo0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible("NavigableSet")
    /* JADX INFO: renamed from: OooOOoo */
    public final o0O0o000<E> descendingIterator() {
        return this.f18436OoooO0.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOo(E e, boolean z) {
        return this.f18436OoooO0.tailSet(e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible("NavigableSet")
    /* JADX INFO: renamed from: OooOo00 */
    public final ImmutableSortedSet<E> descendingSet() {
        return this.f18436OoooO0;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOoo(E e, boolean z, E e2, boolean z2) {
        return this.f18436OoooO0.subSet(e2, z2, e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> Oooo000(E e, boolean z) {
        return this.f18436OoooO0.headSet(e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E ceiling(E e) {
        return this.f18436OoooO0.floor(e);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.f18436OoooO0.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible("NavigableSet")
    public final NavigableSet descendingSet() {
        return this.f18436OoooO0;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E floor(E e) {
        return this.f18436OoooO0.ceiling(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E higher(E e) {
        return this.f18436OoooO0.lower(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E lower(E e) {
        return this.f18436OoooO0.higher(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18436OoooO0.size();
    }
}
