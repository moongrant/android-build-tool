package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o0O00oO0 {

    public static class OooO00o<E> extends o00OOO0.OooO0O0<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Weak
        public final o0O00o00<E> f18611Oooo0o;

        public OooO00o(o0O00o00<E> o0o00o01) {
            this.f18611Oooo0o = o0o00o01;
        }

        @Override // com.google.common.collect.o00OOO0.OooO0O0
        public final o00OO OooO0o0() {
            return this.f18611Oooo0o;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return this.f18611Oooo0o.comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            o00OO.OooO00o<E> oooO00oFirstEntry = this.f18611Oooo0o.firstEntry();
            if (oooO00oFirstEntry != null) {
                return oooO00oFirstEntry.getElement();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e) {
            return this.f18611Oooo0o.OoooOOo(e, BoundType.OPEN).OooO0Oo();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<E> iterator() {
            return new o00OOO00(this.f18611Oooo0o.entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public final E last() {
            o00OO.OooO00o<E> oooO00oLastEntry = this.f18611Oooo0o.lastEntry();
            if (oooO00oLastEntry != null) {
                return oooO00oLastEntry.getElement();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e, E e2) {
            return this.f18611Oooo0o.o0000oO(e, BoundType.CLOSED, e2, BoundType.OPEN).OooO0Oo();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e) {
            return this.f18611Oooo0o.o0OoOo0(e, BoundType.CLOSED).OooO0Oo();
        }
    }

    @GwtIncompatible
    public static class OooO0O0<E> extends OooO00o<E> implements NavigableSet<E> {
        public OooO0O0(o0O00o00<E> o0o00o01) {
            super(o0o00o01);
        }

        @Override // java.util.NavigableSet
        public final E ceiling(E e) {
            return (E) o0O00oO0.OooO00o(this.f18611Oooo0o.o0OoOo0(e, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            return ((OooO00o) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            return new OooO0O0(this.f18611Oooo0o.OooOoOO());
        }

        @Override // java.util.NavigableSet
        public final E floor(E e) {
            return (E) o0O00oO0.OooO00o(this.f18611Oooo0o.OoooOOo(e, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(E e, boolean z) {
            return new OooO0O0(this.f18611Oooo0o.OoooOOo(e, BoundType.OooO00o(z)));
        }

        @Override // java.util.NavigableSet
        public final E higher(E e) {
            return (E) o0O00oO0.OooO00o(this.f18611Oooo0o.o0OoOo0(e, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final E lower(E e) {
            return (E) o0O00oO0.OooO00o(this.f18611Oooo0o.OoooOOo(e, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final E pollFirst() {
            return (E) o0O00oO0.OooO00o(this.f18611Oooo0o.pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public final E pollLast() {
            return (E) o0O00oO0.OooO00o(this.f18611Oooo0o.pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new OooO0O0(this.f18611Oooo0o.o0000oO(e, BoundType.OooO00o(z), e2, BoundType.OooO00o(z2)));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(E e, boolean z) {
            return new OooO0O0(this.f18611Oooo0o.o0OoOo0(e, BoundType.OooO00o(z)));
        }
    }

    public static Object OooO00o(o00OO.OooO00o oooO00o) {
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.getElement();
    }
}
