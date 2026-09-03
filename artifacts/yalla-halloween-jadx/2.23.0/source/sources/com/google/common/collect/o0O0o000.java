package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class o0O0o000 {

    public static class OooO00o<E> extends oo00oO.OooO0O0<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Weak
        public final oo0OOoo<E> f19587OooO0Oo;

        public OooO00o(oo0OOoo<E> oo0oooo) {
            this.f19587OooO0Oo = oo0oooo;
        }

        @Override // com.google.common.collect.oo00oO.OooO0O0
        public final o0oOO OooO0Oo() {
            return this.f19587OooO0Oo;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return this.f19587OooO0Oo.comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final E first() {
            o0oOO.OooO00o<E> oooO00oFirstEntry = this.f19587OooO0Oo.firstEntry();
            if (oooO00oFirstEntry != null) {
                return oooO00oFirstEntry.getElement();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(@ParametricNullness E e) {
            return this.f19587OooO0Oo.o0O0O00(e, BoundType.OPEN).OooO0oO();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<E> iterator() {
            return new o0O00o0(this.f19587OooO0Oo.entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final E last() {
            o0oOO.OooO00o<E> oooO00oLastEntry = this.f19587OooO0Oo.lastEntry();
            if (oooO00oLastEntry != null) {
                return oooO00oLastEntry.getElement();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return this.f19587OooO0Oo.OoooOoo(e, BoundType.CLOSED, e2, BoundType.OPEN).OooO0oO();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(@ParametricNullness E e) {
            return this.f19587OooO0Oo.o00000O(e, BoundType.CLOSED).OooO0oO();
        }
    }

    @GwtIncompatible
    public static class OooO0O0<E> extends OooO00o<E> implements NavigableSet<E> {
        @Override // java.util.NavigableSet
        @CheckForNull
        public final E ceiling(@ParametricNullness E e) {
            return (E) o0O0o000.OooO00o(this.f19587OooO0Oo.o00000O(e, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            return ((OooO00o) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            return new OooO0O0(this.f19587OooO0Oo.o00O0O());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E floor(@ParametricNullness E e) {
            return (E) o0O0o000.OooO00o(this.f19587OooO0Oo.o0O0O00(e, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return new OooO0O0(this.f19587OooO0Oo.o0O0O00(e, z ? BoundType.CLOSED : BoundType.OPEN));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E higher(@ParametricNullness E e) {
            return (E) o0O0o000.OooO00o(this.f19587OooO0Oo.o00000O(e, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E lower(@ParametricNullness E e) {
            return (E) o0O0o000.OooO00o(this.f19587OooO0Oo.o0O0O00(e, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E pollFirst() {
            return (E) o0O0o000.OooO00o(this.f19587OooO0Oo.pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final E pollLast() {
            return (E) o0O0o000.OooO00o(this.f19587OooO0Oo.pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return new OooO0O0(this.f19587OooO0Oo.OoooOoo(e, z ? BoundType.CLOSED : BoundType.OPEN, e2, z2 ? BoundType.CLOSED : BoundType.OPEN));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return new OooO0O0(this.f19587OooO0Oo.o00000O(e, z ? BoundType.CLOSED : BoundType.OPEN));
        }
    }

    public static Object OooO00o(o0oOO.OooO00o oooO00o) {
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.getElement();
    }
}
