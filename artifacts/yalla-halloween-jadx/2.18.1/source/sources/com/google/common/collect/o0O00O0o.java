package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o0O00O0o {

    public static abstract class OooO00o<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return o0O00O0o.OooO0Oo(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        }
    }

    public static final class OooO0O0<E> extends o000O00O<E> implements NavigableSet<E>, Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final NavigableSet<E> f18605Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final SortedSet<E> f18606Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @MonotonicNonNullDecl
        public transient OooO0O0<E> f18607Oooo0oo;

        public OooO0O0(NavigableSet<E> navigableSet) {
            Objects.requireNonNull(navigableSet);
            this.f18605Oooo0o = navigableSet;
            this.f18606Oooo0oO = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO, com.google.common.collect.o000O0o
        public final Object OooO00o() {
            return this.f18606Oooo0oO;
        }

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO
        /* JADX INFO: renamed from: OooO0O0 */
        public final Collection OooO00o() {
            return this.f18606Oooo0oO;
        }

        @Override // com.google.common.collect.o000O00
        /* JADX INFO: renamed from: OooO0oo */
        public final Set OooO00o() {
            return this.f18606Oooo0oO;
        }

        @Override // java.util.NavigableSet
        public final E ceiling(E e) {
            return this.f18605Oooo0o.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator = this.f18605Oooo0o.descendingIterator();
            Objects.requireNonNull(itDescendingIterator);
            return itDescendingIterator instanceof o0O0o000 ? (o0O0o000) itDescendingIterator : new o00O00OO(itDescendingIterator);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            OooO0O0<E> oooO0O0 = this.f18607Oooo0oo;
            if (oooO0O0 != null) {
                return oooO0O0;
            }
            OooO0O0<E> oooO0O1 = new OooO0O0<>(this.f18605Oooo0o.descendingSet());
            this.f18607Oooo0oo = oooO0O1;
            oooO0O1.f18607Oooo0oo = this;
            return oooO0O1;
        }

        @Override // java.util.NavigableSet
        public final E floor(E e) {
            return this.f18605Oooo0o.floor(e);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(E e, boolean z) {
            return o0O00O0o.OooO0o0(this.f18605Oooo0o.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        public final E higher(E e) {
            return this.f18605Oooo0o.higher(e);
        }

        @Override // java.util.NavigableSet
        public final E lower(E e) {
            return this.f18605Oooo0o.lower(e);
        }

        @Override // java.util.NavigableSet
        public final E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return o0O00O0o.OooO0o0(this.f18605Oooo0o.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(E e, boolean z) {
            return o0O00O0o.OooO0o0(this.f18605Oooo0o.tailSet(e, z));
        }
    }

    public static boolean OooO00o(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static int OooO0O0(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static <E> HashSet<E> OooO0OO(int i) {
        int i2;
        if (i < 3) {
            oo000o.OooO0O0(i, "expectedSize");
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new HashSet<>(i2);
    }

    public static boolean OooO0Oo(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof o00OO) {
            collection = ((o00OO) collection).OooO0Oo();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator<?> it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static <E> NavigableSet<E> OooO0o0(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof OooO0O0)) ? navigableSet : new OooO0O0(navigableSet);
    }
}
