package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final Object[] f18165Oooo0o = new Object[0];

    public static abstract class OooO00o<E> extends OooO0O0<E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object[] f18166OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f18167OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f18168OooO0OO;

        public OooO00o() {
            oo000o.OooO0O0(4, "initialCapacity");
            this.f18166OooO00o = new Object[4];
            this.f18167OooO0O0 = 0;
        }

        @CanIgnoreReturnValue
        public final OooO00o<E> OooO0O0(E e) {
            Objects.requireNonNull(e);
            OooO0OO(this.f18167OooO0O0 + 1);
            Object[] objArr = this.f18166OooO00o;
            int i = this.f18167OooO0O0;
            this.f18167OooO0O0 = i + 1;
            objArr[i] = e;
            return this;
        }

        public final void OooO0OO(int i) {
            Object[] objArr = this.f18166OooO00o;
            if (objArr.length < i) {
                this.f18166OooO00o = Arrays.copyOf(objArr, OooO0O0.OooO00o(objArr.length, i));
                this.f18168OooO0OO = false;
            } else if (this.f18168OooO0OO) {
                this.f18166OooO00o = (Object[]) objArr.clone();
                this.f18168OooO0OO = false;
            }
        }
    }

    public static abstract class OooO0O0<E> {
        public static int OooO00o(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public abstract o0O0o000<E> iterator();

    public ImmutableList<E> OooO00o() {
        if (isEmpty()) {
            OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
            return (ImmutableList<E>) o0.f18399OoooO00;
        }
        Object[] array = toArray();
        OooO0OO oooO0OO2 = ImmutableList.f18169Oooo0oO;
        return ImmutableList.OooOO0(array, array.length);
    }

    @CanIgnoreReturnValue
    public int OooO0O0(Object[] objArr) {
        o0O0o000<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] OooO0OO() {
        return null;
    }

    public int OooO0o0() {
        throw new UnsupportedOperationException();
    }

    public int OooO0oO() {
        throw new UnsupportedOperationException();
    }

    abstract boolean OooO0oo();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@NullableDecl Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f18165Oooo0o);
    }

    Object writeReplace() {
        return new ImmutableList.OooO0o(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrOooO0OO = OooO0OO();
            if (objArrOooO0OO != null) {
                return (T[]) Arrays.copyOfRange(objArrOooO0OO, OooO0oO(), OooO0o0(), tArr.getClass());
            }
            tArr = (T[]) o00OOOO0.OooO0Oo(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        OooO0O0(tArr);
        return tArr;
    }
}
