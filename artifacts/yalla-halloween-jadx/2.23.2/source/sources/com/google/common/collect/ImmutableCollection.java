package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@DoNotMock("Use ImmutableList.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Object[] f18677OooO0Oo = new Object[0];

    public static abstract class OooO00o<E> extends OooO0O0<E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object[] f18678OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f18679OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f18680OooO0OO;

        public OooO00o() {
            oo000o.OooO0O0(4, "initialCapacity");
            this.f18678OooO00o = new Object[4];
            this.f18679OooO0O0 = 0;
        }

        @CanIgnoreReturnValue
        public final void OooO0OO(Object obj) {
            obj.getClass();
            OooO0oO(this.f18679OooO0O0 + 1);
            Object[] objArr = this.f18678OooO00o;
            int i = this.f18679OooO0O0;
            this.f18679OooO0O0 = i + 1;
            objArr[i] = obj;
        }

        @CanIgnoreReturnValue
        public final void OooO0Oo(Object... objArr) {
            int length = objArr.length;
            o0.OooO00o(length, objArr);
            OooO0oO(this.f18679OooO0O0 + length);
            System.arraycopy(objArr, 0, this.f18678OooO00o, this.f18679OooO0O0, length);
            this.f18679OooO0O0 += length;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public final OooO00o OooO0o(List list) {
            if (list instanceof Collection) {
                OooO0oO(list.size() + this.f18679OooO0O0);
                if (list instanceof ImmutableCollection) {
                    this.f18679OooO0O0 = ((ImmutableCollection) list).OooO0O0(this.f18679OooO0O0, this.f18678OooO00o);
                    return this;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OooO00o(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public void OooO0o0(Object obj) {
            OooO0OO(obj);
        }

        public final void OooO0oO(int i) {
            Object[] objArr = this.f18678OooO00o;
            if (objArr.length < i) {
                this.f18678OooO00o = Arrays.copyOf(objArr, OooO0O0.OooO0O0(objArr.length, i));
                this.f18680OooO0OO = false;
            } else if (this.f18680OooO0OO) {
                this.f18678OooO00o = (Object[]) objArr.clone();
                this.f18680OooO0OO = false;
            }
        }
    }

    @DoNotMock
    public static abstract class OooO0O0<E> {
        public static int OooO0O0(int i, int i2) {
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

        @CanIgnoreReturnValue
        public abstract OooO0O0<E> OooO00o(E e);
    }

    public ImmutableList<E> OooO00o() {
        if (isEmpty()) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
            return o0O00.f19060OooO0oo;
        }
        Object[] array = toArray();
        ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f18681OooO0o0;
        return ImmutableList.OooO(array.length, array);
    }

    @CanIgnoreReturnValue
    public int OooO0O0(int i, Object[] objArr) {
        o0OO0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @CheckForNull
    public Object[] OooO0OO() {
        return null;
    }

    public int OooO0Oo() {
        throw new UnsupportedOperationException();
    }

    abstract boolean OooO0o();

    public int OooO0o0() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public abstract o0OO0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@CheckForNull Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f18677OooO0Oo);
    }

    Object writeReplace() {
        return new ImmutableList.OooO0o(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] objArrOooO0OO = OooO0OO();
            if (objArrOooO0OO != null) {
                return (T[]) Arrays.copyOfRange(objArrOooO0OO, OooO0o0(), OooO0Oo(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        OooO0O0(0, tArr);
        return tArr;
    }
}
