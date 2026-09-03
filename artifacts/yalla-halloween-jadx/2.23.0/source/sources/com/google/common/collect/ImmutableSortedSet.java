package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends o00O000o<E> implements NavigableSet<E>, o0O0OOO0<E> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient Comparator<? super E> f19219OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @CheckForNull
    @GwtIncompatible
    @LazyInit
    public transient ImmutableSortedSet<E> f19220OooO0oo;

    public static final class OooO00o<E> extends ImmutableSet.OooO00o<E> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Comparator<? super E> f19221OooO0Oo;

        public OooO00o(Comparator<? super E> comparator) {
            this.f19221OooO0Oo = comparator;
        }

        @Override // com.google.common.collect.ImmutableSet.OooO00o
        public final ImmutableSet OooO() {
            Object[] objArr = this.f19154OooO00o;
            o0O00OO o0o00ooOooOOOo = ImmutableSortedSet.OooOOOo(this.f19155OooO0O0, this.f19221OooO0Oo, objArr);
            this.f19155OooO0O0 = o0o00ooOooOOOo.size();
            this.f19156OooO0OO = true;
            return o0o00ooOooOOOo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.OooO00o, com.google.common.collect.ImmutableCollection.OooO0O0
        @CanIgnoreReturnValue
        public final ImmutableCollection.OooO0O0 OooO00o(Object obj) {
            super.OooO00o(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.OooO00o
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: OooO0oo */
        public final ImmutableSet.OooO00o OooO00o(Object obj) {
            super.OooO00o(obj);
            return this;
        }
    }

    public static class OooO0O0<E> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Comparator<? super E> f19222OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Object[] f19223OooO0o0;

        public OooO0O0(Comparator<? super E> comparator, Object[] objArr) {
            this.f19222OooO0Oo = comparator;
            this.f19223OooO0o0 = objArr;
        }

        public Object readResolve() {
            oo000o.OooO0O0(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            Comparator<? super E> comparator = this.f19222OooO0Oo;
            comparator.getClass();
            Object[] objArr = this.f19223OooO0o0;
            int length = objArr.length;
            o0.OooO00o(length, objArr);
            int i = length + 0;
            if (4 < i) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO0O0(4, i));
            }
            System.arraycopy(objArr, 0, objArrCopyOf, 0, length);
            o0O00OO o0o00ooOooOOOo = ImmutableSortedSet.OooOOOo(i, comparator, objArrCopyOf);
            o0o00ooOooOOOo.size();
            return o0o00ooOooOOOo;
        }
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.f19219OooO0oO = comparator;
    }

    public static o0O00OO OooOOOo(int i, Comparator comparator, Object... objArr) {
        if (i == 0) {
            return OooOo00(comparator);
        }
        o0.OooO00o(i, objArr);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new o0O00OO(ImmutableList.OooO(i2, objArr), comparator);
    }

    public static <E> o0O00OO<E> OooOo00(Comparator<? super E> comparator) {
        return o0O0o.f19585OooO0Oo.equals(comparator) ? (o0O00OO<E>) o0O00OO.f19572OooOO0 : new o0O00OO<>(o0O00.f19536OooO0oo, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOOo, reason: merged with bridge method [inline-methods] */
    public abstract o0OO0<E> descendingIterator();

    @GwtIncompatible
    public abstract ImmutableSortedSet<E> OooOOo0();

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOOoo, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.f19220OooO0oo;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> immutableSortedSetOooOOo0 = OooOOo0();
        this.f19220OooO0oo = immutableSortedSetOooOOo0;
        immutableSortedSetOooOOo0.f19220OooO0oo = this;
        return immutableSortedSetOooOOo0;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: OooOo, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: OooOo0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: OooOo0O, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        e.getClass();
        return OooOo0o(e, z);
    }

    public abstract ImmutableSortedSet<E> OooOo0o(E e, boolean z);

    public abstract ImmutableSortedSet<E> OooOoO(E e, boolean z, E e2, boolean z2);

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOoO0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        e.getClass();
        e2.getClass();
        com.google.common.base.o000oOoO.OooO0Oo(this.f19219OooO0oO.compare(e, e2) <= 0);
        return OooOoO(e, z, e2, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: OooOoOO, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    public abstract ImmutableSortedSet<E> OooOoo(E e, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: OooOoo0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        e.getClass();
        return OooOoo(e, z);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E ceiling(E e) {
        return (E) o00O0O0O.OooO0Oo(null, tailSet(e, true).iterator());
    }

    @Override // java.util.SortedSet, com.google.common.collect.o0O0OOO0
    public final Comparator<? super E> comparator() {
        return this.f19219OooO0oO;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E floor(E e) {
        return (E) o00O0O0O.OooO0Oo(null, headSet(e, true).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @GwtIncompatible
    public E higher(E e) {
        return (E) o00O0O0O.OooO0Oo(null, tailSet(e, false).iterator());
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @GwtIncompatible
    public E lower(E e) {
        return (E) o00O0O0O.OooO0Oo(null, headSet(e, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @GwtIncompatible
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @GwtIncompatible
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new OooO0O0(this.f19219OooO0oO, toArray());
    }
}
