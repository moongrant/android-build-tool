package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class o0O000O<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final o0O000O<Comparable> f18599OoooO0O;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @VisibleForTesting
    public final transient ImmutableList<E> f18600OoooO0;

    static {
        OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        f18599OoooO0O = new o0O000O<>(o0.f18399OoooO00, o0o0Oo.f18676Oooo0o);
    }

    public o0O000O(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.f18600OoooO0 = immutableList;
    }

    @Override // com.google.common.collect.o00O000, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO */
    public final o0O0o000<E> iterator() {
        return this.f18600OoooO0.listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> OooO00o() {
        return this.f18600OoooO0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0O0(Object[] objArr) {
        return this.f18600OoooO0.OooO0O0(objArr);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] OooO0OO() {
        return this.f18600OoooO0.OooO0OO();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0o0() {
        return this.f18600OoooO0.OooO0o0();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0oO() {
        return this.f18600OoooO0.OooO0oO();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return this.f18600OoooO0.OooO0oo();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOOo0() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f18227Oooo);
        return isEmpty() ? ImmutableSortedSet.OooOo0(comparatorReverseOrder) : new o0O000O(this.f18600OoooO0.OooOOoo(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOOoo, reason: merged with bridge method [inline-methods] */
    public final o0O0o000<E> descendingIterator() {
        return this.f18600OoooO0.OooOOoo().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOo(E e, boolean z) {
        return Oooo00O(0, Oooo00o(e, z));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOoo(E e, boolean z, E e2, boolean z2) {
        o0O000O<E> o0o000oOooo00O = Oooo00O(Oooo0O0(e, z), size());
        return o0o000oOooo00O.Oooo00O(0, o0o000oOooo00O.Oooo00o(e2, z2));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> Oooo000(E e, boolean z) {
        return Oooo00O(Oooo0O0(e, z), size());
    }

    public final o0O000O<E> Oooo00O(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        return i < i2 ? new o0O000O<>(this.f18600OoooO0.subList(i, i2), this.f18227Oooo) : ImmutableSortedSet.OooOo0(this.f18227Oooo);
    }

    public final int Oooo00o(E e, boolean z) {
        ImmutableList<E> immutableList = this.f18600OoooO0;
        Objects.requireNonNull(e);
        int iBinarySearch = Collections.binarySearch(immutableList, e, this.f18227Oooo);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int Oooo0O0(E e, boolean z) {
        ImmutableList<E> immutableList = this.f18600OoooO0;
        Objects.requireNonNull(e);
        int iBinarySearch = Collections.binarySearch(immutableList, e, this.f18227Oooo);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E ceiling(E e) {
        int iOooo0O0 = Oooo0O0(e, true);
        if (iOooo0O0 == size()) {
            return null;
        }
        return this.f18600OoooO0.get(iOooo0O0);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.f18600OoooO0, obj, this.f18227Oooo) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof o00OO) {
            collection = ((o00OO) collection).OooO0Oo();
        }
        if (!o0oO0Ooo.OooO00o(this.f18227Oooo, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        o0O0o000<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        OooO0OO oooO0OO = (OooO0OO) it;
        if (!oooO0OO.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = oooO0OO.next();
        while (true) {
            try {
                int iCompare = this.f18227Oooo.compare(next2, next);
                if (iCompare < 0) {
                    if (!oooO0OO.hasNext()) {
                        return false;
                    }
                    next2 = oooO0OO.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(@NullableDecl Object obj) {
        Object next;
        E next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!o0oO0Ooo.OooO00o(this.f18227Oooo, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            o0O0o000<E> it2 = iterator();
            do {
                OooO0OO oooO0OO = (OooO0OO) it2;
                if (!oooO0OO.hasNext()) {
                    return true;
                }
                next = oooO0OO.next();
                next2 = it.next();
                if (next2 == null) {
                    break;
                }
            } while (this.f18227Oooo.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f18600OoooO0.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E floor(E e) {
        int iOooo00o = Oooo00o(e, true) - 1;
        if (iOooo00o == -1) {
            return null;
        }
        return this.f18600OoooO0.get(iOooo00o);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E higher(E e) {
        int iOooo0O0 = Oooo0O0(e, false);
        if (iOooo0O0 == size()) {
            return null;
        }
        return this.f18600OoooO0.get(iOooo0O0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f18600OoooO0.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E lower(E e) {
        int iOooo00o = Oooo00o(e, false) - 1;
        if (iOooo00o == -1) {
            return null;
        }
        return this.f18600OoooO0.get(iOooo00o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18600OoooO0.size();
    }
}
