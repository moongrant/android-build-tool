package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements Map, Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public transient int[] f19123OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public transient K[] f19124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public transient int f19125OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public transient V[] f19126OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public transient int f19127OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public transient int[] f19128OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient int[] f19129OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public transient int[] f19130OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public transient int f19131OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public transient int[] f19132OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public transient int f19133OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public transient int[] f19134OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public transient OooO0OO f19135OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public transient OooO0O0 f19136OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public transient OooO0o f19137OooOOo0;

    public static abstract class OooO<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final HashBiMap<K, V> f19138OooO0Oo;

        public class OooO00o implements Iterator<T> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f19139OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f19140OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f19141OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int f19142OooO0oO;

            public OooO00o() {
                HashBiMap<K, V> hashBiMap = OooO.this.f19138OooO0Oo;
                this.f19139OooO0Oo = hashBiMap.f19131OooOO0o;
                this.f19141OooO0o0 = -1;
                this.f19140OooO0o = hashBiMap.f19127OooO0oO;
                this.f19142OooO0oO = hashBiMap.f19125OooO0o;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (OooO.this.f19138OooO0Oo.f19127OooO0oO == this.f19140OooO0o) {
                    return this.f19139OooO0Oo != -2 && this.f19142OooO0oO > 0;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f19139OooO0Oo;
                OooO oooO = OooO.this;
                T t = (T) oooO.OooO00o(i);
                int i2 = this.f19139OooO0Oo;
                this.f19141OooO0o0 = i2;
                this.f19139OooO0Oo = oooO.f19138OooO0Oo.f19134OooOOOO[i2];
                this.f19142OooO0oO--;
                return t;
            }

            @Override // java.util.Iterator
            public final void remove() {
                OooO oooO = OooO.this;
                if (oooO.f19138OooO0Oo.f19127OooO0oO != this.f19140OooO0o) {
                    throw new ConcurrentModificationException();
                }
                oo000o.OooO0Oo(this.f19141OooO0o0 != -1);
                HashBiMap<K, V> hashBiMap = oooO.f19138OooO0Oo;
                int i = this.f19141OooO0o0;
                hashBiMap.OooOO0O(i, o000OO0O.OooO0OO(hashBiMap.f19124OooO0Oo[i]));
                int i2 = this.f19139OooO0Oo;
                HashBiMap<K, V> hashBiMap2 = oooO.f19138OooO0Oo;
                if (i2 == hashBiMap2.f19125OooO0o) {
                    this.f19139OooO0Oo = this.f19141OooO0o0;
                }
                this.f19141OooO0o0 = -1;
                this.f19140OooO0o = hashBiMap2.f19127OooO0oO;
            }
        }

        public OooO(HashBiMap<K, V> hashBiMap) {
            this.f19138OooO0Oo = hashBiMap;
        }

        @ParametricNullness
        public abstract T OooO00o(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.f19138OooO0Oo.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<T> iterator() {
            return new OooO00o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f19138OooO0Oo.f19125OooO0o;
        }
    }

    public final class OooO00o extends OooOOO0<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f19144OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19146OooO0o0;

        public OooO00o(int i) {
            this.f19144OooO0Oo = HashBiMap.this.f19124OooO0Oo[i];
            this.f19146OooO0o0 = i;
        }

        public final void OooO0Oo() {
            int i = this.f19146OooO0o0;
            K k = this.f19144OooO0Oo;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i == -1 || i > hashBiMap.f19125OooO0o || !com.google.common.base.Oooo000.OooO00o(hashBiMap.f19124OooO0Oo[i], k)) {
                hashBiMap.getClass();
                this.f19146OooO0o0 = hashBiMap.OooO0o(o000OO0O.OooO0OO(k), k);
            }
        }

        @Override // java.util.Map.Entry
        @ParametricNullness
        public final K getKey() {
            return this.f19144OooO0Oo;
        }

        @Override // java.util.Map.Entry
        @ParametricNullness
        public final V getValue() {
            OooO0Oo();
            int i = this.f19146OooO0o0;
            if (i == -1) {
                return null;
            }
            return HashBiMap.this.f19126OooO0o0[i];
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        @ParametricNullness
        public final V setValue(@ParametricNullness V v) {
            OooO0Oo();
            int i = this.f19146OooO0o0;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i == -1) {
                hashBiMap.put(this.f19144OooO0Oo, v);
                return null;
            }
            V v2 = hashBiMap.f19126OooO0o0[i];
            if (com.google.common.base.Oooo000.OooO00o(v2, v)) {
                return v;
            }
            hashBiMap.OooOO0o(this.f19146OooO0o0, v);
            return v2;
        }
    }

    public final class OooO0O0 extends OooO<K, V, Map.Entry<K, V>> {
        public OooO0O0() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.OooO
        public final Object OooO00o(int i) {
            return new OooO00o(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                HashBiMap hashBiMap = HashBiMap.this;
                hashBiMap.getClass();
                int iOooO0o = hashBiMap.OooO0o(o000OO0O.OooO0OO(key), key);
                if (iOooO0o != -1 && com.google.common.base.Oooo000.OooO00o(value, hashBiMap.f19126OooO0o0[iOooO0o])) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public final boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iOooO0OO = o000OO0O.OooO0OO(key);
            HashBiMap hashBiMap = HashBiMap.this;
            int iOooO0o = hashBiMap.OooO0o(iOooO0OO, key);
            if (iOooO0o == -1 || !com.google.common.base.Oooo000.OooO00o(value, hashBiMap.f19126OooO0o0[iOooO0o])) {
                return false;
            }
            hashBiMap.OooOO0O(iOooO0o, iOooO0OO);
            return true;
        }
    }

    public final class OooO0OO extends OooO<K, V, K> {
        public OooO0OO() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.OooO
        @ParametricNullness
        public final K OooO00o(int i) {
            return HashBiMap.this.f19124OooO0Oo[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            int iOooO0OO = o000OO0O.OooO0OO(obj);
            HashBiMap hashBiMap = HashBiMap.this;
            int iOooO0o = hashBiMap.OooO0o(iOooO0OO, obj);
            if (iOooO0o == -1) {
                return false;
            }
            hashBiMap.OooOO0O(iOooO0o, iOooO0OO);
            return true;
        }
    }

    public final class OooO0o extends OooO<K, V, V> {
        public OooO0o() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.OooO
        @ParametricNullness
        public final V OooO00o(int i) {
            return HashBiMap.this.f19126OooO0o0[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            int iOooO0OO = o000OO0O.OooO0OO(obj);
            HashBiMap hashBiMap = HashBiMap.this;
            int iOooO0oO = hashBiMap.OooO0oO(iOooO0OO, obj);
            if (iOooO0oO == -1) {
                return false;
            }
            hashBiMap.OooOO0(iOooO0oO, o000OO0O.OooO0OO(hashBiMap.f19124OooO0Oo[iOooO0oO]), iOooO0OO);
            return true;
        }
    }

    public static int[] OooO0O0(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        oo000o.OooO0O0(16, "expectedSize");
        int iOooO00o = o000OO0O.OooO00o(1.0d, 16);
        this.f19125OooO0o = 0;
        this.f19124OooO0Oo = (K[]) new Object[16];
        this.f19126OooO0o0 = (V[]) new Object[16];
        this.f19128OooO0oo = OooO0O0(iOooO00o);
        this.f19123OooO = OooO0O0(iOooO00o);
        this.f19129OooOO0 = OooO0O0(16);
        this.f19130OooOO0O = OooO0O0(16);
        this.f19131OooOO0o = -2;
        this.f19133OooOOO0 = -2;
        this.f19132OooOOO = OooO0O0(16);
        this.f19134OooOOOO = OooO0O0(16);
        o0O00oO0.OooO0O0(this, objectInputStream, i);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o0O00oO0.OooO0o0(this, objectOutputStream);
    }

    public final void OooO(int i, int i2) {
        com.google.common.base.o000oOoO.OooO0Oo(i != -1);
        int iOooO00o = OooO00o(i2);
        int[] iArr = this.f19130OooOO0O;
        int[] iArr2 = this.f19123OooO;
        iArr[i] = iArr2[iOooO00o];
        iArr2[iOooO00o] = i;
    }

    public final int OooO00o(int i) {
        return i & (this.f19128OooO0oo.length - 1);
    }

    public final void OooO0OO(int i, int i2) {
        com.google.common.base.o000oOoO.OooO0Oo(i != -1);
        int iOooO00o = OooO00o(i2);
        int[] iArr = this.f19128OooO0oo;
        int i3 = iArr[iOooO00o];
        if (i3 == i) {
            int[] iArr2 = this.f19129OooOO0;
            iArr[iOooO00o] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f19129OooOO0[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String strValueOf = String.valueOf(this.f19124OooO0Oo[i]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i3 == i) {
                int[] iArr3 = this.f19129OooOO0;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.f19129OooOO0[i3];
        }
    }

    public final void OooO0Oo(int i, int i2) {
        com.google.common.base.o000oOoO.OooO0Oo(i != -1);
        int iOooO00o = OooO00o(i2);
        int[] iArr = this.f19123OooO;
        int i3 = iArr[iOooO00o];
        if (i3 == i) {
            int[] iArr2 = this.f19130OooOO0O;
            iArr[iOooO00o] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f19130OooOO0O[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String strValueOf = String.valueOf(this.f19126OooO0o0[i]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i3 == i) {
                int[] iArr3 = this.f19130OooOO0O;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.f19130OooOO0O[i3];
        }
    }

    public final int OooO0o(int i, @CheckForNull Object obj) {
        int[] iArr = this.f19128OooO0oo;
        int[] iArr2 = this.f19129OooOO0;
        K[] kArr = this.f19124OooO0Oo;
        for (int i2 = iArr[OooO00o(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (com.google.common.base.Oooo000.OooO00o(kArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final void OooO0o0(int i) {
        int[] iArr = this.f19129OooOO0;
        if (iArr.length < i) {
            int iOooO0O0 = ImmutableCollection.OooO0O0.OooO0O0(iArr.length, i);
            this.f19124OooO0Oo = (K[]) Arrays.copyOf(this.f19124OooO0Oo, iOooO0O0);
            this.f19126OooO0o0 = (V[]) Arrays.copyOf(this.f19126OooO0o0, iOooO0O0);
            int[] iArr2 = this.f19129OooOO0;
            int length = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr2, iOooO0O0);
            Arrays.fill(iArrCopyOf, length, iOooO0O0, -1);
            this.f19129OooOO0 = iArrCopyOf;
            int[] iArr3 = this.f19130OooOO0O;
            int length2 = iArr3.length;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, iOooO0O0);
            Arrays.fill(iArrCopyOf2, length2, iOooO0O0, -1);
            this.f19130OooOO0O = iArrCopyOf2;
            int[] iArr4 = this.f19132OooOOO;
            int length3 = iArr4.length;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr4, iOooO0O0);
            Arrays.fill(iArrCopyOf3, length3, iOooO0O0, -1);
            this.f19132OooOOO = iArrCopyOf3;
            int[] iArr5 = this.f19134OooOOOO;
            int length4 = iArr5.length;
            int[] iArrCopyOf4 = Arrays.copyOf(iArr5, iOooO0O0);
            Arrays.fill(iArrCopyOf4, length4, iOooO0O0, -1);
            this.f19134OooOOOO = iArrCopyOf4;
        }
        if (this.f19128OooO0oo.length < i) {
            int iOooO00o = o000OO0O.OooO00o(1.0d, i);
            this.f19128OooO0oo = OooO0O0(iOooO00o);
            this.f19123OooO = OooO0O0(iOooO00o);
            for (int i2 = 0; i2 < this.f19125OooO0o; i2++) {
                int iOooO00o2 = OooO00o(o000OO0O.OooO0OO(this.f19124OooO0Oo[i2]));
                int[] iArr6 = this.f19129OooOO0;
                int[] iArr7 = this.f19128OooO0oo;
                iArr6[i2] = iArr7[iOooO00o2];
                iArr7[iOooO00o2] = i2;
                int iOooO00o3 = OooO00o(o000OO0O.OooO0OO(this.f19126OooO0o0[i2]));
                int[] iArr8 = this.f19130OooOO0O;
                int[] iArr9 = this.f19123OooO;
                iArr8[i2] = iArr9[iOooO00o3];
                iArr9[iOooO00o3] = i2;
            }
        }
    }

    public final int OooO0oO(int i, @CheckForNull Object obj) {
        int[] iArr = this.f19123OooO;
        int[] iArr2 = this.f19130OooOO0O;
        V[] vArr = this.f19126OooO0o0;
        for (int i2 = iArr[OooO00o(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (com.google.common.base.Oooo000.OooO00o(vArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final void OooO0oo(int i, int i2) {
        com.google.common.base.o000oOoO.OooO0Oo(i != -1);
        int iOooO00o = OooO00o(i2);
        int[] iArr = this.f19129OooOO0;
        int[] iArr2 = this.f19128OooO0oo;
        iArr[i] = iArr2[iOooO00o];
        iArr2[iOooO00o] = i;
    }

    public final void OooOO0(int i, int i2, int i3) {
        com.google.common.base.o000oOoO.OooO0Oo(i != -1);
        OooO0OO(i, i2);
        OooO0Oo(i, i3);
        OooOOO0(this.f19132OooOOO[i], this.f19134OooOOOO[i]);
        int i4 = this.f19125OooO0o - 1;
        if (i4 != i) {
            int i5 = this.f19132OooOOO[i4];
            int i6 = this.f19134OooOOOO[i4];
            OooOOO0(i5, i);
            OooOOO0(i, i6);
            K[] kArr = this.f19124OooO0Oo;
            K k = kArr[i4];
            V[] vArr = this.f19126OooO0o0;
            V v = vArr[i4];
            kArr[i] = k;
            vArr[i] = v;
            int iOooO00o = OooO00o(o000OO0O.OooO0OO(k));
            int[] iArr = this.f19128OooO0oo;
            int i7 = iArr[iOooO00o];
            if (i7 == i4) {
                iArr[iOooO00o] = i;
            } else {
                int i8 = this.f19129OooOO0[i7];
                while (i8 != i4) {
                    i7 = i8;
                    i8 = this.f19129OooOO0[i8];
                }
                this.f19129OooOO0[i7] = i;
            }
            int[] iArr2 = this.f19129OooOO0;
            iArr2[i] = iArr2[i4];
            iArr2[i4] = -1;
            int iOooO00o2 = OooO00o(o000OO0O.OooO0OO(v));
            int[] iArr3 = this.f19123OooO;
            int i9 = iArr3[iOooO00o2];
            if (i9 == i4) {
                iArr3[iOooO00o2] = i;
            } else {
                int i10 = this.f19130OooOO0O[i9];
                while (i10 != i4) {
                    i9 = i10;
                    i10 = this.f19130OooOO0O[i10];
                }
                this.f19130OooOO0O[i9] = i;
            }
            int[] iArr4 = this.f19130OooOO0O;
            iArr4[i] = iArr4[i4];
            iArr4[i4] = -1;
        }
        K[] kArr2 = this.f19124OooO0Oo;
        int i11 = this.f19125OooO0o;
        kArr2[i11 - 1] = null;
        this.f19126OooO0o0[i11 - 1] = null;
        this.f19125OooO0o = i11 - 1;
        this.f19127OooO0oO++;
    }

    public final void OooOO0O(int i, int i2) {
        OooOO0(i, i2, o000OO0O.OooO0OO(this.f19126OooO0o0[i]));
    }

    public final void OooOO0o(int i, @ParametricNullness Object obj) {
        com.google.common.base.o000oOoO.OooO0Oo(i != -1);
        int iOooO0OO = o000OO0O.OooO0OO(obj);
        if (OooO0oO(iOooO0OO, obj) == -1) {
            OooO0Oo(i, o000OO0O.OooO0OO(this.f19126OooO0o0[i]));
            ((V[]) this.f19126OooO0o0)[i] = obj;
            OooO(i, iOooO0OO);
        } else {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
            sb.append("Value already present in map: ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void OooOOO0(int i, int i2) {
        if (i == -2) {
            this.f19131OooOO0o = i2;
        } else {
            this.f19134OooOOOO[i] = i2;
        }
        if (i2 == -2) {
            this.f19133OooOOO0 = i;
        } else {
            this.f19132OooOOO[i2] = i;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f19124OooO0Oo, 0, this.f19125OooO0o, (Object) null);
        Arrays.fill(this.f19126OooO0o0, 0, this.f19125OooO0o, (Object) null);
        Arrays.fill(this.f19128OooO0oo, -1);
        Arrays.fill(this.f19123OooO, -1);
        Arrays.fill(this.f19129OooOO0, 0, this.f19125OooO0o, -1);
        Arrays.fill(this.f19130OooOO0O, 0, this.f19125OooO0o, -1);
        Arrays.fill(this.f19132OooOOO, 0, this.f19125OooO0o, -1);
        Arrays.fill(this.f19134OooOOOO, 0, this.f19125OooO0o, -1);
        this.f19125OooO0o = 0;
        this.f19131OooOO0o = -2;
        this.f19133OooOOO0 = -2;
        this.f19127OooO0oO++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return OooO0o(o000OO0O.OooO0OO(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return OooO0oO(o000OO0O.OooO0OO(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        OooO0O0 oooO0O0 = this.f19136OooOOo;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        OooO0O0 oooO0O1 = new OooO0O0();
        this.f19136OooOOo = oooO0O1;
        return oooO0O1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        int iOooO0o = OooO0o(o000OO0O.OooO0OO(obj), obj);
        if (iOooO0o == -1) {
            return null;
        }
        return this.f19126OooO0o0[iOooO0o];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        OooO0OO oooO0OO = this.f19135OooOOOo;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        OooO0OO oooO0OO2 = new OooO0OO();
        this.f19135OooOOOo = oooO0OO2;
        return oooO0OO2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final V put(@ParametricNullness K k, @ParametricNullness V v) {
        int iOooO0OO = o000OO0O.OooO0OO(k);
        int iOooO0o = OooO0o(iOooO0OO, k);
        if (iOooO0o != -1) {
            V v2 = this.f19126OooO0o0[iOooO0o];
            if (com.google.common.base.Oooo000.OooO00o(v2, v)) {
                return v;
            }
            OooOO0o(iOooO0o, v);
            return v2;
        }
        int iOooO0OO2 = o000OO0O.OooO0OO(v);
        com.google.common.base.o000oOoO.OooO0o(OooO0oO(iOooO0OO2, v) == -1, "Value already present: %s", v);
        OooO0o0(this.f19125OooO0o + 1);
        K[] kArr = this.f19124OooO0Oo;
        int i = this.f19125OooO0o;
        kArr[i] = k;
        this.f19126OooO0o0[i] = v;
        OooO0oo(i, iOooO0OO);
        OooO(this.f19125OooO0o, iOooO0OO2);
        OooOOO0(this.f19133OooOOO0, this.f19125OooO0o);
        OooOOO0(this.f19125OooO0o, -2);
        this.f19125OooO0o++;
        this.f19127OooO0oO++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        int iOooO0OO = o000OO0O.OooO0OO(obj);
        int iOooO0o = OooO0o(iOooO0OO, obj);
        if (iOooO0o == -1) {
            return null;
        }
        V v = this.f19126OooO0o0[iOooO0o];
        OooOO0O(iOooO0o, iOooO0OO);
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19125OooO0o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        OooO0o oooO0o = this.f19137OooOOo0;
        if (oooO0o != null) {
            return oooO0o;
        }
        OooO0o oooO0o2 = new OooO0o();
        this.f19137OooOOo0 = oooO0o2;
        return oooO0o2;
    }
}
