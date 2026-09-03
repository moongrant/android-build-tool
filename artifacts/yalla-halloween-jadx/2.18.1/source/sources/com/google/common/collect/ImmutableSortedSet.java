package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableSortedSet<E> extends o00O000<E> implements NavigableSet<E>, o0O00OOO<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient Comparator<? super E> f18227Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @GwtIncompatible
    @LazyInit
    public transient ImmutableSortedSet<E> f18228OoooO00;

    public static final class OooO00o<E> extends ImmutableSet.OooO00o<E> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Comparator<? super E> f18229OooO0Oo;

        public OooO00o(Comparator<? super E> comparator) {
            this.f18229OooO0Oo = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableSet.OooO00o OooO0Oo(Object obj) {
            super.OooO0Oo(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.OooO00o
        public final ImmutableSet OooO0o() {
            ImmutableSortedSet immutableSortedSetOooOOOo = ImmutableSortedSet.OooOOOo(this.f18229OooO0Oo, this.f18167OooO0O0, this.f18166OooO00o);
            this.f18167OooO0O0 = immutableSortedSetOooOOOo.size();
            this.f18168OooO0OO = true;
            return immutableSortedSetOooOOOo;
        }

        @Override // com.google.common.collect.ImmutableSet.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableSet.OooO00o OooO0o0(Iterator it) {
            Objects.requireNonNull(it);
            while (it.hasNext()) {
                OooO0Oo(it.next());
            }
            return this;
        }
    }

    public static class OooO0O0<E> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Comparator<? super E> f18230Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Object[] f18231Oooo0oO;

        public OooO0O0(Comparator<? super E> comparator, Object[] objArr) {
            this.f18230Oooo0o = comparator;
            this.f18231Oooo0oO = objArr;
        }

        public Object readResolve() {
            Comparator<? super E> comparator = this.f18230Oooo0o;
            oo000o.OooO0O0(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            Objects.requireNonNull(comparator);
            Object[] objArr = this.f18231Oooo0oO;
            o00OOOO0.OooO0O0(objArr);
            int length = objArr.length + 0;
            if (objArrCopyOf.length < length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, length));
            }
            System.arraycopy(objArr, 0, objArrCopyOf, 0, objArr.length);
            ImmutableSortedSet immutableSortedSetOooOOOo = ImmutableSortedSet.OooOOOo(comparator, 0 + objArr.length, objArrCopyOf);
            immutableSortedSetOooOOOo.size();
            return immutableSortedSetOooOOOo;
        }
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.f18227Oooo = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ImmutableSortedSet<E> OooOOOo(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return OooOo0(comparator);
        }
        for (int i2 = 0; i2 < i; i2++) {
            o00OOOO0.OooO00o(eArr[i2], i2);
        }
        Arrays.sort(eArr, 0, i, comparator);
        int i3 = 1;
        for (int i4 = 1; i4 < i; i4++) {
            OooO00o.OooO00o.OooO00o.OooO00o.OooOOO.OooO0OO oooO0OO = (Object) eArr[i4];
            if (comparator.compare(oooO0OO, (Object) eArr[i3 - 1]) != 0) {
                eArr[i3] = oooO0OO;
                i3++;
            }
        }
        Arrays.fill(eArr, i3, i, (Object) null);
        if (i3 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i3);
        }
        return new o0O000O(ImmutableList.OooOO0(eArr, i3), comparator);
    }

    public static <E> o0O000O<E> OooOo0(Comparator<? super E> comparator) {
        return o0o0Oo.f18676Oooo0o.equals(comparator) ? (o0O000O<E>) o0O000O.f18599OoooO0O : new o0O000O<>(o0.f18399OoooO00, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @GwtIncompatible
    public abstract ImmutableSortedSet<E> OooOOo0();

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOOoo */
    public abstract o0O0o000<E> descendingIterator();

    public abstract ImmutableSortedSet<E> OooOo(E e, boolean z);

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOo00, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.f18228OoooO00;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> immutableSortedSetOooOOo0 = OooOOo0();
        this.f18228OoooO00 = immutableSortedSetOooOOo0;
        immutableSortedSetOooOOo0.f18228OoooO00 = this;
        return immutableSortedSetOooOOo0;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: OooOo0O, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOo0o, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        Objects.requireNonNull(e);
        return OooOo(e, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: OooOoO0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    public abstract ImmutableSortedSet<E> OooOoo(E e, boolean z, E e2, boolean z2);

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOoo0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        Objects.requireNonNull(e);
        Objects.requireNonNull(e2);
        o0OOOO0o.OooOOOO.OooO0O0(this.f18227Oooo.compare(e, e2) <= 0);
        return OooOoo(e, z, e2, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: OooOooO, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOooo, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        Objects.requireNonNull(e);
        return Oooo000(e, z);
    }

    public abstract ImmutableSortedSet<E> Oooo000(E e, boolean z);

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public E ceiling(E e) {
        return (E) o00O0.OooO0OO(tailSet(e, true).iterator());
    }

    @Override // java.util.SortedSet, com.google.common.collect.o0O00OOO
    public final Comparator<? super E> comparator() {
        return this.f18227Oooo;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public E floor(E e) {
        return (E) o00O0.OooO0OO(headSet(e, true).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public E higher(E e) {
        return (E) o00O0.OooO0OO(tailSet(e, false).iterator());
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public E lower(E e) {
        return (E) o00O0.OooO0OO(headSet(e, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @CanIgnoreReturnValue
    @GwtIncompatible
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @CanIgnoreReturnValue
    @GwtIncompatible
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new OooO0O0(this.f18227Oooo, toArray());
    }
}
