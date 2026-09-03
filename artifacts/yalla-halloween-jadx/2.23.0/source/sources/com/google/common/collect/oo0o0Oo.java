package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public class oo0o0Oo<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public transient Object f19684OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    @CheckForNull
    public transient Object[] f19685OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public transient int[] f19686OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public transient int f19687OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public transient int f19688OooO0oo;

    public class OooO00o implements Iterator<E> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19689OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f19690OooO0o = -1;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19691OooO0o0;

        public OooO00o() {
            this.f19689OooO0Oo = oo0o0Oo.this.f19687OooO0oO;
            this.f19691OooO0o0 = oo0o0Oo.this.OooO0o0();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19691OooO0o0 >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public final E next() {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            if (oo0o0oo.f19687OooO0oO != this.f19689OooO0Oo) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f19691OooO0o0;
            this.f19690OooO0o = i;
            E e = (E) oo0o0oo.OooOO0o()[i];
            this.f19691OooO0o0 = oo0o0oo.OooO0o(this.f19691OooO0o0);
            return e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            if (oo0o0oo.f19687OooO0oO != this.f19689OooO0Oo) {
                throw new ConcurrentModificationException();
            }
            oo000o.OooO0Oo(this.f19690OooO0o >= 0);
            this.f19689OooO0Oo += 32;
            oo0o0oo.remove(oo0o0oo.OooOO0o()[this.f19690OooO0o]);
            this.f19691OooO0o0 = oo0o0oo.OooO00o(this.f19691OooO0o0, this.f19690OooO0o);
            this.f19690OooO0o = -1;
        }
    }

    public oo0o0Oo(int i) {
        OooO0oo(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(p166o00Ooo00.o0OOO0o.OooO00o(25, "Invalid size: ", i));
        }
        OooO0oo(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public void OooO(int i, int i2, int i3, @ParametricNullness Object obj) {
        OooOOO0()[i] = (i2 & (~i3)) | (i3 & 0);
        OooOO0o()[i] = obj;
    }

    public int OooO00o(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int OooO0O0() {
        com.google.common.base.o000oOoO.OooOOO(OooOO0O(), "Arrays already allocated");
        int i = this.f19687OooO0oO;
        int iMax = Math.max(4, o000OO0O.OooO00o(1.0d, i + 1));
        this.f19684OooO0Oo = o0O0O00.OooO00o(iMax);
        this.f19687OooO0oO = ((32 - Integer.numberOfLeadingZeros(iMax - 1)) & 31) | (this.f19687OooO0oO & (-32));
        this.f19686OooO0o0 = new int[i];
        this.f19685OooO0o = new Object[i];
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    @CanIgnoreReturnValue
    public LinkedHashSet OooO0OO() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(((1 << (this.f19687OooO0oO & 31)) - 1) + 1, 1.0f);
        int iOooO0o0 = OooO0o0();
        while (iOooO0o0 >= 0) {
            linkedHashSet.add(OooOO0o()[iOooO0o0]);
            iOooO0o0 = OooO0o(iOooO0o0);
        }
        this.f19684OooO0Oo = linkedHashSet;
        this.f19686OooO0o0 = null;
        this.f19685OooO0o = null;
        this.f19687OooO0oO += 32;
        return linkedHashSet;
    }

    @VisibleForTesting
    @CheckForNull
    public final Set<E> OooO0Oo() {
        Object obj = this.f19684OooO0Oo;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int OooO0o(int i) {
        int i2 = i + 1;
        if (i2 < this.f19688OooO0oo) {
            return i2;
        }
        return -1;
    }

    public int OooO0o0() {
        return isEmpty() ? -1 : 0;
    }

    public void OooO0oo(int i) {
        com.google.common.base.o000oOoO.OooO0o0(i >= 0, "Expected size must be >= 0");
        this.f19687OooO0oO = com.google.common.primitives.OooO0o.OooO0O0(i, 1);
    }

    public void OooOO0(int i, int i2) {
        Object obj = this.f19684OooO0Oo;
        Objects.requireNonNull(obj);
        int[] iArrOooOOO0 = OooOOO0();
        Object[] objArrOooOO0o = OooOO0o();
        int size = size() - 1;
        if (i >= size) {
            objArrOooOO0o[i] = null;
            iArrOooOOO0[i] = 0;
            return;
        }
        Object obj2 = objArrOooOO0o[size];
        objArrOooOO0o[i] = obj2;
        objArrOooOO0o[size] = null;
        iArrOooOOO0[i] = iArrOooOOO0[size];
        iArrOooOOO0[size] = 0;
        int iOooO0OO = o000OO0O.OooO0OO(obj2) & i2;
        int iOooO0OO2 = o0O0O00.OooO0OO(iOooO0OO, obj);
        int i3 = size + 1;
        if (iOooO0OO2 == i3) {
            o0O0O00.OooO0Oo(iOooO0OO, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iOooO0OO2 - 1;
            int i5 = iArrOooOOO0[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                iArrOooOOO0[i4] = ((i + 1) & i2) | (i5 & (~i2));
                return;
            }
            iOooO0OO2 = i6;
        }
    }

    @VisibleForTesting
    public final boolean OooOO0O() {
        return this.f19684OooO0Oo == null;
    }

    public final Object[] OooOO0o() {
        Object[] objArr = this.f19685OooO0o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void OooOOO(int i) {
        this.f19686OooO0o0 = Arrays.copyOf(OooOOO0(), i);
        this.f19685OooO0o = Arrays.copyOf(OooOO0o(), i);
    }

    public final int[] OooOOO0() {
        int[] iArr = this.f19686OooO0o0;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @CanIgnoreReturnValue
    public final int OooOOOO(int i, int i2, int i3, int i4) {
        Object objOooO00o = o0O0O00.OooO00o(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            o0O0O00.OooO0Oo(i3 & i5, i4 + 1, objOooO00o);
        }
        Object obj = this.f19684OooO0Oo;
        Objects.requireNonNull(obj);
        int[] iArrOooOOO0 = OooOOO0();
        for (int i6 = 0; i6 <= i; i6++) {
            int iOooO0OO = o0O0O00.OooO0OO(i6, obj);
            while (iOooO0OO != 0) {
                int i7 = iOooO0OO - 1;
                int i8 = iArrOooOOO0[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iOooO0OO2 = o0O0O00.OooO0OO(i10, objOooO00o);
                o0O0O00.OooO0Oo(i10, iOooO0OO, objOooO00o);
                iArrOooOOO0[i7] = ((~i5) & i9) | (iOooO0OO2 & i5);
                iOooO0OO = i8 & i;
            }
        }
        this.f19684OooO0Oo = objOooO00o;
        this.f19687OooO0oO = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f19687OooO0oO & (-32));
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public final boolean add(@ParametricNullness E e) {
        int iMin;
        if (OooOO0O()) {
            OooO0O0();
        }
        Set<E> setOooO0Oo = OooO0Oo();
        if (setOooO0Oo != null) {
            return setOooO0Oo.add(e);
        }
        int[] iArrOooOOO0 = OooOOO0();
        Object[] objArrOooOO0o = OooOO0o();
        int i = this.f19688OooO0oo;
        int i2 = i + 1;
        int iOooO0OO = o000OO0O.OooO0OO(e);
        int iOooOOOO = (1 << (this.f19687OooO0oO & 31)) - 1;
        int i3 = iOooO0OO & iOooOOOO;
        Object obj = this.f19684OooO0Oo;
        Objects.requireNonNull(obj);
        int iOooO0OO2 = o0O0O00.OooO0OO(i3, obj);
        if (iOooO0OO2 != 0) {
            int i4 = ~iOooOOOO;
            int i5 = iOooO0OO & i4;
            boolean z = false;
            int i6 = 0;
            while (true) {
                int i7 = iOooO0OO2 - 1;
                int i8 = iArrOooOOO0[i7];
                int i9 = i8 & i4;
                if (i9 == i5 && com.google.common.base.Oooo000.OooO00o(e, objArrOooOO0o[i7])) {
                    return z;
                }
                int i10 = i8 & iOooOOOO;
                int i11 = i6 + 1;
                if (i10 == 0) {
                    if (i11 < 9) {
                        if (i2 <= iOooOOOO) {
                            iArrOooOOO0[i7] = (i2 & iOooOOOO) | i9;
                            break;
                        }
                        iOooOOOO = OooOOOO(iOooOOOO, (iOooOOOO + 1) * (iOooOOOO < 32 ? 4 : 2), iOooO0OO, i);
                        break;
                    }
                    return OooO0OO().add(e);
                }
                iOooO0OO2 = i10;
                i6 = i11;
                z = false;
            }
        } else if (i2 > iOooOOOO) {
            iOooOOOO = OooOOOO(iOooOOOO, (iOooOOOO + 1) * (iOooOOOO < 32 ? 4 : 2), iOooO0OO, i);
        } else {
            Object obj2 = this.f19684OooO0Oo;
            Objects.requireNonNull(obj2);
            o0O0O00.OooO0Oo(i3, i2, obj2);
        }
        int length = OooOOO0().length;
        if (i2 > length && (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            OooOOO(iMin);
        }
        OooO(i, iOooO0OO, iOooOOOO, e);
        this.f19688OooO0oo = i2;
        this.f19687OooO0oO += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (OooOO0O()) {
            return;
        }
        this.f19687OooO0oO += 32;
        Set<E> setOooO0Oo = OooO0Oo();
        if (setOooO0Oo != null) {
            this.f19687OooO0oO = com.google.common.primitives.OooO0o.OooO0O0(size(), 3);
            setOooO0Oo.clear();
            this.f19684OooO0Oo = null;
            this.f19688OooO0oo = 0;
            return;
        }
        Arrays.fill(OooOO0o(), 0, this.f19688OooO0oo, (Object) null);
        Object obj = this.f19684OooO0Oo;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(OooOOO0(), 0, this.f19688OooO0oo, 0);
        this.f19688OooO0oo = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (OooOO0O()) {
            return false;
        }
        Set<E> setOooO0Oo = OooO0Oo();
        if (setOooO0Oo != null) {
            return setOooO0Oo.contains(obj);
        }
        int iOooO0OO = o000OO0O.OooO0OO(obj);
        int i = (1 << (this.f19687OooO0oO & 31)) - 1;
        Object obj2 = this.f19684OooO0Oo;
        Objects.requireNonNull(obj2);
        int iOooO0OO2 = o0O0O00.OooO0OO(iOooO0OO & i, obj2);
        if (iOooO0OO2 == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iOooO0OO & i2;
        do {
            int i4 = iOooO0OO2 - 1;
            int i5 = OooOOO0()[i4];
            if ((i5 & i2) == i3 && com.google.common.base.Oooo000.OooO00o(obj, OooOO0o()[i4])) {
                return true;
            }
            iOooO0OO2 = i5 & i;
        } while (iOooO0OO2 != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set<E> setOooO0Oo = OooO0Oo();
        return setOooO0Oo != null ? setOooO0Oo.iterator() : new OooO00o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public final boolean remove(@CheckForNull Object obj) {
        if (OooOO0O()) {
            return false;
        }
        Set<E> setOooO0Oo = OooO0Oo();
        if (setOooO0Oo != null) {
            return setOooO0Oo.remove(obj);
        }
        int i = (1 << (this.f19687OooO0oO & 31)) - 1;
        Object obj2 = this.f19684OooO0Oo;
        Objects.requireNonNull(obj2);
        int iOooO0O0 = o0O0O00.OooO0O0(obj, null, i, obj2, OooOOO0(), OooOO0o(), null);
        if (iOooO0O0 == -1) {
            return false;
        }
        OooOO0(iOooO0O0, i);
        this.f19688OooO0oo--;
        this.f19687OooO0oO += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set<E> setOooO0Oo = OooO0Oo();
        return setOooO0Oo != null ? setOooO0Oo.size() : this.f19688OooO0oo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (OooOO0O()) {
            return new Object[0];
        }
        Set<E> setOooO0Oo = OooO0Oo();
        return setOooO0Oo != null ? setOooO0Oo.toArray() : Arrays.copyOf(OooOO0o(), this.f19688OooO0oo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (OooOO0O()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setOooO0Oo = OooO0Oo();
        if (setOooO0Oo != null) {
            return (T[]) setOooO0Oo.toArray(tArr);
        }
        Object[] objArrOooOO0o = OooOO0o();
        int i = this.f19688OooO0oo;
        com.google.common.base.o000oOoO.OooOO0O(0, i + 0, objArrOooOO0o.length);
        if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArrOooOO0o, 0, tArr, 0, i);
        return tArr;
    }
}
