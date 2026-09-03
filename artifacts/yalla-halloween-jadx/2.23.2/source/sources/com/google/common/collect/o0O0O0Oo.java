package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class o0O0O0Oo {

    public static final class OooO<E> extends o000O0<E> implements NavigableSet<E>, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final NavigableSet<E> f19102OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public transient OooO<E> f19103OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final SortedSet<E> f19104OooO0o0;

        public OooO(NavigableSet<E> navigableSet) {
            navigableSet.getClass();
            this.f19102OooO0Oo = navigableSet;
            this.f19104OooO0o0 = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O, com.google.common.collect.o000Oo0
        public final Object OooO00o() {
            return this.f19104OooO0o0;
        }

        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O
        /* JADX INFO: renamed from: OooO0O0 */
        public final Collection OooO00o() {
            return this.f19104OooO0o0;
        }

        @Override // com.google.common.collect.o000O00O
        /* JADX INFO: renamed from: OooO0Oo */
        public final Set OooO00o() {
            return this.f19104OooO0o0;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E ceiling(@ParametricNullness E e) {
            return this.f19102OooO0Oo.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator = this.f19102OooO0Oo.descendingIterator();
            itDescendingIterator.getClass();
            return itDescendingIterator instanceof o0OO0 ? (o0OO0) itDescendingIterator : new oo00o(itDescendingIterator);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            OooO<E> oooO = this.f19103OooO0o;
            if (oooO != null) {
                return oooO;
            }
            OooO<E> oooO2 = new OooO<>(this.f19102OooO0Oo.descendingSet());
            this.f19103OooO0o = oooO2;
            oooO2.f19103OooO0o = this;
            return oooO2;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E floor(@ParametricNullness E e) {
            return this.f19102OooO0Oo.floor(e);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return o0O0O0Oo.OooO0oO(this.f19102OooO0Oo.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E higher(@ParametricNullness E e) {
            return this.f19102OooO0Oo.higher(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E lower(@ParametricNullness E e) {
            return this.f19102OooO0Oo.lower(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return o0O0O0Oo.OooO0oO(this.f19102OooO0Oo.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return o0O0O0Oo.OooO0oO(this.f19102OooO0Oo.tailSet(e, z));
        }
    }

    public static class OooO00o<E> extends o00oO0o.OooO00o<E> implements Set<E> {
        public OooO00o(Set<E> set, com.google.common.base.o00O0O<? super E> o00o0o2) {
            super(set, o00o0o2);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return o0O0O0Oo.OooO00o(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return o0O0O0Oo.OooO0OO(this);
        }
    }

    public static class OooO0O0<E> extends OooO00o<E> implements SortedSet<E> {
        public OooO0O0(SortedSet<E> sortedSet, com.google.common.base.o00O0O<? super E> o00o0o2) {
            super(sortedSet, o00o0o2);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f19058OooO0Oo).comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final E first() {
            Iterator<E> it = this.f19058OooO0Oo.iterator();
            it.getClass();
            com.google.common.base.o00O0O<? super E> o00o0o2 = this.f19059OooO0o0;
            o00o0o2.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (o00o0o2.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(@ParametricNullness E e) {
            return new OooO0O0(((SortedSet) this.f19058OooO0Oo).headSet(e), this.f19059OooO0o0);
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f19058OooO0Oo;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.f19059OooO0o0.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return new OooO0O0(((SortedSet) this.f19058OooO0Oo).subSet(e, e2), this.f19059OooO0o0);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(@ParametricNullness E e) {
            return new OooO0O0(((SortedSet) this.f19058OooO0Oo).tailSet(e), this.f19059OooO0o0);
        }
    }

    public static abstract class OooO0OO<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return o0O0O0Oo.OooO0o(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static abstract class OooO0o<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(@ParametricNullness E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean OooO00o(Set<?> set, @CheckForNull Object obj) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static OooO00o OooO0O0(Set set, com.google.common.base.o00O0O o00o0o2) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof OooO00o)) {
                set.getClass();
                return new OooO00o(set, o00o0o2);
            }
            OooO00o oooO00o = (OooO00o) set;
            com.google.common.base.o00O0O o00o0o3 = oooO00o.f19059OooO0o0;
            o00o0o3.getClass();
            return new OooO00o((Set) oooO00o.f19058OooO0Oo, new com.google.common.base.o00Oo0(Arrays.asList(o00o0o3, o00o0o2)));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof OooO00o)) {
            sortedSet.getClass();
            return new OooO0O0(sortedSet, o00o0o2);
        }
        OooO00o oooO00o2 = (OooO00o) sortedSet;
        com.google.common.base.o00O0O o00o0o4 = oooO00o2.f19059OooO0o0;
        o00o0o4.getClass();
        return new OooO0O0((SortedSet) oooO00o2.f19058OooO0Oo, new com.google.common.base.o00Oo0(Arrays.asList(o00o0o4, o00o0o2)));
    }

    public static int OooO0OO(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static o0O0oo0o OooO0Oo(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        if (immutableSet == null) {
            throw new NullPointerException("set1");
        }
        if (immutableSet2 != null) {
            return new o0O0oo0o(immutableSet, immutableSet2);
        }
        throw new NullPointerException("set2");
    }

    public static boolean OooO0o(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof o0oOO) {
            collection = ((o0oOO) collection).OooO0oO();
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

    public static <E> HashSet<E> OooO0o0(int i) {
        int i2;
        if (i < 3) {
            oo000o.OooO0O0(i, "expectedSize");
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new HashSet<>(i2);
    }

    public static <E> NavigableSet<E> OooO0oO(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof OooO)) ? navigableSet : new OooO(navigableSet);
    }
}
