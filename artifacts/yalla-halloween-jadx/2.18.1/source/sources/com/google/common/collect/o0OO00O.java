package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public class o0OO00O<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f18647OoooOOo = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient Object[] f18648Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient int[] f18649Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient long[] f18650Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient Object[] f18651Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public transient int f18652OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient int f18653OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public transient float f18654OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient int f18655OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<K> f18656OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Collection<V> f18657OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> f18658o000oOoO;

    public class OooO extends AbstractCollection<V> {
        public OooO() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            o0OO00O.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Objects.requireNonNull(o0oo00o2);
            return new o0Oo0oo(o0oo00o2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return o0OO00O.this.f18652OoooO;
        }
    }

    public class OooO00o extends AbstractSet<Map.Entry<K, V>> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o0OO00O.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iOooO0oO = o0OO00O.this.OooO0oO(entry.getKey());
            return iOooO0oO != -1 && o0OOOO0o.OooOOO.OooO00o(o0OO00O.this.f18648Oooo[iOooO0oO], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Objects.requireNonNull(o0oo00o2);
            return new o0OOO0o(o0oo00o2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iOooO0oO = o0OO00O.this.OooO0oO(entry.getKey());
            if (iOooO0oO == -1 || !o0OOOO0o.OooOOO.OooO00o(o0OO00O.this.f18648Oooo[iOooO0oO], entry.getValue())) {
                return false;
            }
            o0OO00O.OooO00o(o0OO00O.this, iOooO0oO);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o0OO00O.this.f18652OoooO;
        }
    }

    public abstract class OooO0O0<T> implements Iterator<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f18662Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18663Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f18664Oooo0oo = -1;

        public OooO0O0() {
            this.f18662Oooo0o = o0OO00O.this.f18653OoooO0;
            this.f18663Oooo0oO = o0OO00O.this.OooO0Oo();
        }

        public abstract T OooO00o(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18663Oooo0oO >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (o0OO00O.this.f18653OoooO0 != this.f18662Oooo0o) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f18663Oooo0oO;
            this.f18664Oooo0oo = i;
            T tOooO00o = OooO00o(i);
            this.f18663Oooo0oO = o0OO00O.this.OooO0o0(this.f18663Oooo0oO);
            return tOooO00o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (o0OO00O.this.f18653OoooO0 != this.f18662Oooo0o) {
                throw new ConcurrentModificationException();
            }
            oo000o.OooO0Oo(this.f18664Oooo0oo >= 0);
            this.f18662Oooo0o++;
            o0OO00O.OooO00o(o0OO00O.this, this.f18664Oooo0oo);
            this.f18663Oooo0oO = o0OO00O.this.OooO0OO(this.f18663Oooo0oO, this.f18664Oooo0oo);
            this.f18664Oooo0oo = -1;
        }
    }

    public class OooO0OO extends AbstractSet<K> {
        public OooO0OO() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o0OO00O.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return o0OO00O.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Objects.requireNonNull(o0oo00o2);
            return new o0ooOOo(o0oo00o2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@NullableDecl Object obj) {
            int iOooO0oO = o0OO00O.this.OooO0oO(obj);
            if (iOooO0oO == -1) {
                return false;
            }
            o0OO00O.OooO00o(o0OO00O.this, iOooO0oO);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o0OO00O.this.f18652OoooO;
        }
    }

    public final class OooO0o extends OooOOO0<K, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NullableDecl
        public final K f18666Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18667Oooo0oO;

        public OooO0o(int i) {
            this.f18666Oooo0o = (K) o0OO00O.this.f18651Oooo0oo[i];
            this.f18667Oooo0oO = i;
        }

        public final void OooO0Oo() {
            int i = this.f18667Oooo0oO;
            if (i != -1) {
                o0OO00O o0oo00o2 = o0OO00O.this;
                if (i < o0oo00o2.f18652OoooO && o0OOOO0o.OooOOO.OooO00o(this.f18666Oooo0o, o0oo00o2.f18651Oooo0oo[i])) {
                    return;
                }
            }
            o0OO00O o0oo00o3 = o0OO00O.this;
            K k = this.f18666Oooo0o;
            int i2 = o0OO00O.f18647OoooOOo;
            this.f18667Oooo0oO = o0oo00o3.OooO0oO(k);
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final K getKey() {
            return this.f18666Oooo0o;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final V getValue() {
            OooO0Oo();
            int i = this.f18667Oooo0oO;
            if (i == -1) {
                return null;
            }
            return (V) o0OO00O.this.f18648Oooo[i];
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final V setValue(V v) {
            OooO0Oo();
            int i = this.f18667Oooo0oO;
            if (i == -1) {
                o0OO00O.this.put(this.f18666Oooo0o, v);
                return null;
            }
            Object[] objArr = o0OO00O.this.f18648Oooo;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
    }

    public o0OO00O() {
        OooO0oo(3);
    }

    public static Object OooO00o(o0OO00O o0oo00o2, int i) {
        return o0oo00o2.OooOO0O(o0oo00o2.f18651Oooo0oo[i], (int) (o0oo00o2.f18650Oooo0oO[i] >>> 32));
    }

    public static long OooOOO0(long j, int i) {
        return (j & (-4294967296L)) | (((long) i) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooO0oo(3);
        int i = objectInputStream.readInt();
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f18652OoooO);
        for (int i = 0; i < this.f18652OoooO; i++) {
            objectOutputStream.writeObject(this.f18651Oooo0oo[i]);
            objectOutputStream.writeObject(this.f18648Oooo[i]);
        }
    }

    public void OooO(int i, @NullableDecl K k, @NullableDecl V v, int i2) {
        this.f18650Oooo0oO[i] = (((long) i2) << 32) | 4294967295L;
        this.f18651Oooo0oo[i] = k;
        this.f18648Oooo[i] = v;
    }

    public void OooO0O0(int i) {
    }

    public int OooO0OO(int i, int i2) {
        return i - 1;
    }

    public int OooO0Oo() {
        return isEmpty() ? -1 : 0;
    }

    public int OooO0o0(int i) {
        int i2 = i + 1;
        if (i2 < this.f18652OoooO) {
            return i2;
        }
        return -1;
    }

    public final int OooO0oO(@NullableDecl Object obj) {
        int iOooO0OO = o000O0Oo.OooO0OO(obj);
        int[] iArr = this.f18649Oooo0o;
        int i = iArr[(iArr.length - 1) & iOooO0OO];
        while (i != -1) {
            long j = this.f18650Oooo0oO[i];
            if (((int) (j >>> 32)) == iOooO0OO && o0OOOO0o.OooOOO.OooO00o(obj, this.f18651Oooo0oo[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public void OooO0oo(int i) {
        o0OOOO0o.OooOOOO.OooO0Oo(i >= 0, "Initial capacity must be non-negative");
        int iOooO00o = o000O0Oo.OooO00o(i, 1.0f);
        int[] iArr = new int[iOooO00o];
        Arrays.fill(iArr, -1);
        this.f18649Oooo0o = iArr;
        this.f18654OoooO00 = 1.0f;
        this.f18651Oooo0oo = new Object[i];
        this.f18648Oooo = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f18650Oooo0oO = jArr;
        this.f18655OoooO0O = Math.max(1, (int) (iOooO00o * 1.0f));
    }

    public void OooOO0(int i) {
        int i2 = this.f18652OoooO - 1;
        if (i >= i2) {
            this.f18651Oooo0oo[i] = null;
            this.f18648Oooo[i] = null;
            this.f18650Oooo0oO[i] = -1;
            return;
        }
        Object[] objArr = this.f18651Oooo0oo;
        objArr[i] = objArr[i2];
        Object[] objArr2 = this.f18648Oooo;
        objArr2[i] = objArr2[i2];
        objArr[i2] = null;
        objArr2[i2] = null;
        long[] jArr = this.f18650Oooo0oO;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int[] iArr = this.f18649Oooo0o;
        int length = ((int) (j >>> 32)) & (iArr.length - 1);
        int i3 = iArr[length];
        if (i3 == i2) {
            iArr[length] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f18650Oooo0oO;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = OooOOO0(j2, i);
                return;
            }
            i3 = i4;
        }
    }

    @NullableDecl
    public final V OooOO0O(@NullableDecl Object obj, int i) {
        int[] iArr = this.f18649Oooo0o;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f18650Oooo0oO[i2] >>> 32)) == i && o0OOOO0o.OooOOO.OooO00o(obj, this.f18651Oooo0oo[i2])) {
                V v = (V) this.f18648Oooo[i2];
                if (i3 == -1) {
                    this.f18649Oooo0o[length] = (int) this.f18650Oooo0oO[i2];
                } else {
                    long[] jArr = this.f18650Oooo0oO;
                    jArr[i3] = OooOOO0(jArr[i3], (int) jArr[i2]);
                }
                OooOO0(i2);
                this.f18652OoooO--;
                this.f18653OoooO0++;
                return v;
            }
            int i4 = (int) this.f18650Oooo0oO[i2];
            if (i4 == -1) {
                return null;
            }
            i3 = i2;
            i2 = i4;
        }
    }

    public void OooOO0o(int i) {
        this.f18651Oooo0oo = Arrays.copyOf(this.f18651Oooo0oo, i);
        this.f18648Oooo = Arrays.copyOf(this.f18648Oooo, i);
        long[] jArr = this.f18650Oooo0oO;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f18650Oooo0oO = jArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f18653OoooO0++;
        Arrays.fill(this.f18651Oooo0oo, 0, this.f18652OoooO, (Object) null);
        Arrays.fill(this.f18648Oooo, 0, this.f18652OoooO, (Object) null);
        Arrays.fill(this.f18649Oooo0o, -1);
        Arrays.fill(this.f18650Oooo0oO, -1L);
        this.f18652OoooO = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return OooO0oO(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.f18652OoooO; i++) {
            if (o0OOOO0o.OooOOO.OooO00o(obj, this.f18648Oooo[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f18658o000oOoO;
        if (set != null) {
            return set;
        }
        OooO00o oooO00o = new OooO00o();
        this.f18658o000oOoO = oooO00o;
        return oooO00o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        int iOooO0oO = OooO0oO(obj);
        OooO0O0(iOooO0oO);
        if (iOooO0oO == -1) {
            return null;
        }
        return (V) this.f18648Oooo[iOooO0oO];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.f18652OoooO == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f18656OoooOO0;
        if (set != null) {
            return set;
        }
        OooO0OO oooO0OO = new OooO0OO();
        this.f18656OoooOO0 = oooO0OO;
        return oooO0OO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.f18650Oooo0oO;
        Object[] objArr = this.f18651Oooo0oo;
        Object[] objArr2 = this.f18648Oooo;
        int iOooO0OO = o000O0Oo.OooO0OO(k);
        int[] iArr = this.f18649Oooo0o;
        int length = (iArr.length - 1) & iOooO0OO;
        int i = this.f18652OoooO;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) == iOooO0OO && o0OOOO0o.OooOOO.OooO00o(k, objArr[i2])) {
                    V v2 = (V) objArr2[i2];
                    objArr2[i2] = v;
                    OooO0O0(i2);
                    return v2;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = OooOOO0(j, i);
                    break;
                }
                i2 = i3;
            }
        }
        if (i == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i + 1;
        int length2 = this.f18650Oooo0oO.length;
        if (i4 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length2) {
                OooOO0o(iMax);
            }
        }
        OooO(i, k, v, iOooO0OO);
        this.f18652OoooO = i4;
        if (i >= this.f18655OoooO0O) {
            int[] iArr2 = this.f18649Oooo0o;
            int length3 = iArr2.length * 2;
            if (iArr2.length >= 1073741824) {
                this.f18655OoooO0O = Integer.MAX_VALUE;
            } else {
                int i5 = ((int) (length3 * this.f18654OoooO00)) + 1;
                int[] iArr3 = new int[length3];
                Arrays.fill(iArr3, -1);
                long[] jArr2 = this.f18650Oooo0oO;
                int i6 = length3 - 1;
                for (int i7 = 0; i7 < this.f18652OoooO; i7++) {
                    int i8 = (int) (jArr2[i7] >>> 32);
                    int i9 = i8 & i6;
                    int i10 = iArr3[i9];
                    iArr3[i9] = i7;
                    jArr2[i7] = (((long) i10) & 4294967295L) | (((long) i8) << 32);
                }
                this.f18655OoooO0O = i5;
                this.f18649Oooo0o = iArr3;
            }
        }
        this.f18653OoooO0++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        return OooOO0O(obj, o000O0Oo.OooO0OO(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18652OoooO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f18657OoooOOO;
        if (collection != null) {
            return collection;
        }
        OooO oooO = new OooO();
        this.f18657OoooOOO = oooO;
        return oooO;
    }

    public o0OO00O(int i) {
        OooO0oo(12);
    }

    public o0OO00O(int i, float f) {
        OooO0oo(i);
    }
}
