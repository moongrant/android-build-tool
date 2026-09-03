package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0O00OO<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0O00OO<Comparable> f19572OooOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @VisibleForTesting
    public final transient ImmutableList<E> f19573OooO;

    static {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        f19572OooOO0 = new o0O00OO<>(o0O00.f19536OooO0oo, o0O0o.f19585OooO0Oo);
    }

    public o0O00OO(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.f19573OooO = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> OooO00o() {
        return this.f19573OooO;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0O0(int i, Object[] objArr) {
        return this.f19573OooO.OooO0O0(i, objArr);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @CheckForNull
    public final Object[] OooO0OO() {
        return this.f19573OooO.OooO0OO();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0Oo() {
        return this.f19573OooO.OooO0Oo();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        return this.f19573OooO.OooO0o();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0o0() {
        return this.f19573OooO.OooO0o0();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO0oo */
    public final o0OO0<E> iterator() {
        return this.f19573OooO.listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOOo */
    public final o0OO0<E> descendingIterator() {
        return this.f19573OooO.OooOOo0().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOOo0() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f19219OooO0oO);
        return isEmpty() ? ImmutableSortedSet.OooOo00(comparatorReverseOrder) : new o0O00OO(this.f19573OooO.OooOOo0(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOo0o(E e, boolean z) {
        return OooOooO(0, OooOooo(e, z));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOoO(E e, boolean z, E e2, boolean z2) {
        o0O00OO o0o00oo2 = (o0O00OO) OooOoo(e, z);
        return o0o00oo2.OooOooO(0, o0o00oo2.OooOooo(e2, z2));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet<E> OooOoo(E e, boolean z) {
        return OooOooO(Oooo000(e, z), size());
    }

    public final o0O00OO<E> OooOooO(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        Comparator<? super E> comparator = this.f19219OooO0oO;
        return i < i2 ? new o0O00OO<>(this.f19573OooO.subList(i, i2), comparator) : ImmutableSortedSet.OooOo00(comparator);
    }

    public final int OooOooo(E e, boolean z) {
        e.getClass();
        int iBinarySearch = Collections.binarySearch(this.f19573OooO, e, this.f19219OooO0oO);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int Oooo000(E e, boolean z) {
        e.getClass();
        int iBinarySearch = Collections.binarySearch(this.f19573OooO, e, this.f19219OooO0oO);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public final E ceiling(E e) {
        int iOooo000 = Oooo000(e, true);
        if (iOooo000 == size()) {
            return null;
        }
        return this.f19573OooO.get(iOooo000);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.f19573OooO, obj, this.f19219OooO0oO) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof o0oOO) {
            collection = ((o0oOO) collection).OooO0oO();
        }
        Comparator<? super E> comparator = this.f19219OooO0oO;
        if (!o0O0OOOo.OooO00o(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        o0OO0<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        OooO0OO oooO0OO = (OooO0OO) it;
        if (!oooO0OO.hasNext()) {
            return false;
        }
        OooO00o.OooO00o.OooO00o.OooO00o.OooOOO.OooO0OO oooO0OO2 = (Object) it2.next();
        OooO00o.OooO00o.OooO00o.OooO00o.OooOOO.OooO0OO oooO0OO3 = (Object) oooO0OO.next();
        while (true) {
            try {
                int iCompare = comparator.compare(oooO0OO3, oooO0OO2);
                if (iCompare < 0) {
                    if (!oooO0OO.hasNext()) {
                        return false;
                    }
                    oooO0OO3 = (Object) oooO0OO.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    oooO0OO2 = (Object) it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        OooO00o.OooO00o.OooO00o.OooO00o.OooOOO.OooO0OO oooO0OO;
        E next;
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
        Comparator<? super E> comparator = this.f19219OooO0oO;
        if (!o0O0OOOo.OooO00o(set, comparator)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            o0OO0<E> it2 = iterator();
            do {
                OooO0OO oooO0OO2 = (OooO0OO) it2;
                if (!oooO0OO2.hasNext()) {
                    return true;
                }
                oooO0OO = (Object) oooO0OO2.next();
                next = it.next();
                if (next == null) {
                    break;
                }
            } while (comparator.compare(oooO0OO, next) == 0);
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
        return this.f19573OooO.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public final E floor(E e) {
        int iOooOooo = OooOooo(e, true) - 1;
        if (iOooOooo == -1) {
            return null;
        }
        return this.f19573OooO.get(iOooOooo);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public final E higher(E e) {
        int iOooo000 = Oooo000(e, false);
        if (iOooo000 == size()) {
            return null;
        }
        return this.f19573OooO.get(iOooo000);
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.f19573OooO, obj, this.f19219OooO0oO);
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f19573OooO.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public final E lower(E e) {
        int iOooOooo = OooOooo(e, false) - 1;
        if (iOooOooo == -1) {
            return null;
        }
        return this.f19573OooO.get(iOooOooo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19573OooO.size();
    }
}
