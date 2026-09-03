package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class o0000<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ImmutableSortedSet<E> f19394OooO;

    public o0000(ImmutableSortedSet<E> immutableSortedSet) {
        super(o0O000.OooO00o(immutableSortedSet.comparator()).OooO0O0());
        this.f19394OooO = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        return this.f19394OooO.OooO0o();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO0oo */
    public final o0OO0<E> iterator() {
        return this.f19394OooO.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible("NavigableSet")
    /* JADX INFO: renamed from: OooOOo */
    public final o0OO0<E> descendingIterator() {
        return this.f19394OooO.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible("NavigableSet")
    public final ImmutableSortedSet<E> OooOOo0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible("NavigableSet")
    /* JADX INFO: renamed from: OooOOoo */
    public final ImmutableSortedSet<E> descendingSet() {
        return this.f19394OooO;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOo0o(E e, boolean z) {
        return this.f19394OooO.tailSet(e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOoO(E e, boolean z, E e2, boolean z2) {
        return this.f19394OooO.subSet(e2, z2, e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOoo(E e, boolean z) {
        return this.f19394OooO.headSet(e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public final E ceiling(E e) {
        return this.f19394OooO.floor(e);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f19394OooO.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible("NavigableSet")
    public final NavigableSet descendingSet() {
        return this.f19394OooO;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public final E floor(E e) {
        return this.f19394OooO.ceiling(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public final E higher(E e) {
        return this.f19394OooO.lower(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public final E lower(E e) {
        return this.f19394OooO.higher(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19394OooO.size();
    }
}
