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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient int f18135Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient K[] f18136Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public transient V[] f18137Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient int f18138Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public transient int[] f18139OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient int[] f18140OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public transient int[] f18141OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient int[] f18142OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NullableDecl
    public transient int f18143OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public transient int[] f18144OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public transient int[] f18145OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public transient Set<K> f18146OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public transient Set<V> f18147OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f18148OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NullableDecl
    public transient int f18149o000oOoO;

    public static abstract class OooO<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final HashBiMap<K, V> f18150Oooo0o;

        public class OooO00o implements Iterator<T> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public int f18151Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f18152Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public int f18153Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public int f18154Oooo0oo;

            public OooO00o() {
                HashBiMap<K, V> hashBiMap = OooO.this.f18150Oooo0o;
                this.f18152Oooo0o = hashBiMap.f18143OoooOO0;
                this.f18153Oooo0oO = -1;
                this.f18154Oooo0oo = hashBiMap.f18135Oooo;
                this.f18151Oooo = hashBiMap.f18138Oooo0oo;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (OooO.this.f18150Oooo0o.f18135Oooo == this.f18154Oooo0oo) {
                    return this.f18152Oooo0o != -2 && this.f18151Oooo > 0;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t = (T) OooO.this.OooO00o(this.f18152Oooo0o);
                int i = this.f18152Oooo0o;
                this.f18153Oooo0oO = i;
                this.f18152Oooo0o = OooO.this.f18150Oooo0o.f18145OoooOOo[i];
                this.f18151Oooo--;
                return t;
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (OooO.this.f18150Oooo0o.f18135Oooo != this.f18154Oooo0oo) {
                    throw new ConcurrentModificationException();
                }
                oo000o.OooO0Oo(this.f18153Oooo0oO != -1);
                HashBiMap<K, V> hashBiMap = OooO.this.f18150Oooo0o;
                int i = this.f18153Oooo0oO;
                hashBiMap.OooOOOo(i, o000O0Oo.OooO0OO(hashBiMap.f18136Oooo0o[i]));
                int i2 = this.f18152Oooo0o;
                HashBiMap<K, V> hashBiMap2 = OooO.this.f18150Oooo0o;
                if (i2 == hashBiMap2.f18138Oooo0oo) {
                    this.f18152Oooo0o = this.f18153Oooo0oO;
                }
                this.f18153Oooo0oO = -1;
                this.f18154Oooo0oo = hashBiMap2.f18135Oooo;
            }
        }

        public OooO(HashBiMap<K, V> hashBiMap) {
            this.f18150Oooo0o = hashBiMap;
        }

        public abstract T OooO00o(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.f18150Oooo0o.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<T> iterator() {
            return new OooO00o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18150Oooo0o.f18138Oooo0oo;
        }
    }

    public final class OooO00o extends OooOOO0<K, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NullableDecl
        public final K f18156Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18157Oooo0oO;

        public OooO00o(int i) {
            this.f18156Oooo0o = HashBiMap.this.f18136Oooo0o[i];
            this.f18157Oooo0oO = i;
        }

        public final void OooO0Oo() {
            int i = this.f18157Oooo0oO;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.f18138Oooo0oo && o0OOOO0o.OooOOO.OooO00o(hashBiMap.f18136Oooo0o[i], this.f18156Oooo0o)) {
                    return;
                }
            }
            this.f18157Oooo0oO = HashBiMap.this.OooO(this.f18156Oooo0o);
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final K getKey() {
            return this.f18156Oooo0o;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        @NullableDecl
        public final V getValue() {
            OooO0Oo();
            int i = this.f18157Oooo0oO;
            if (i == -1) {
                return null;
            }
            return HashBiMap.this.f18137Oooo0oO[i];
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final V setValue(V v) {
            OooO0Oo();
            int i = this.f18157Oooo0oO;
            if (i == -1) {
                return (V) HashBiMap.this.put(this.f18156Oooo0o, v);
            }
            V v2 = HashBiMap.this.f18137Oooo0oO[i];
            if (o0OOOO0o.OooOOO.OooO00o(v2, v)) {
                return v;
            }
            HashBiMap.this.OooOOo(this.f18157Oooo0oO, v);
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
        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iOooO = HashBiMap.this.OooO(key);
            return iOooO != -1 && o0OOOO0o.OooOOO.OooO00o(value, HashBiMap.this.f18137Oooo0oO[iOooO]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public final boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iOooO0OO = o000O0Oo.OooO0OO(key);
            int iOooOO0 = HashBiMap.this.OooOO0(key, iOooO0OO);
            if (iOooOO0 == -1 || !o0OOOO0o.OooOOO.OooO00o(value, HashBiMap.this.f18137Oooo0oO[iOooOO0])) {
                return false;
            }
            HashBiMap.this.OooOOOo(iOooOO0, iOooO0OO);
            return true;
        }
    }

    public final class OooO0OO extends OooO<K, V, K> {
        public OooO0OO() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.OooO
        public final K OooO00o(int i) {
            return HashBiMap.this.f18136Oooo0o[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@NullableDecl Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@NullableDecl Object obj) {
            int iOooO0OO = o000O0Oo.OooO0OO(obj);
            int iOooOO0 = HashBiMap.this.OooOO0(obj, iOooO0OO);
            if (iOooOO0 == -1) {
                return false;
            }
            HashBiMap.this.OooOOOo(iOooOO0, iOooO0OO);
            return true;
        }
    }

    public final class OooO0o extends OooO<K, V, V> {
        public OooO0o() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.OooO
        public final V OooO00o(int i) {
            return HashBiMap.this.f18137Oooo0oO[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@NullableDecl Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@NullableDecl Object obj) {
            int iOooO0OO = o000O0Oo.OooO0OO(obj);
            int iOooOO0o = HashBiMap.this.OooOO0o(obj, iOooO0OO);
            if (iOooOO0o == -1) {
                return false;
            }
            HashBiMap.this.OooOOo0(iOooOO0o, iOooO0OO);
            return true;
        }
    }

    public static int[] OooO0O0(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static int[] OooO0oO(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        oo000o.OooO0O0(16, "expectedSize");
        int iOooO00o = o000O0Oo.OooO00o(16, 1.0d);
        this.f18138Oooo0oo = 0;
        this.f18136Oooo0o = (K[]) new Object[16];
        this.f18137Oooo0oO = (V[]) new Object[16];
        this.f18141OoooO00 = OooO0O0(iOooO00o);
        this.f18140OoooO0 = OooO0O0(iOooO00o);
        this.f18142OoooO0O = OooO0O0(16);
        this.f18139OoooO = OooO0O0(16);
        this.f18143OoooOO0 = -2;
        this.f18149o000oOoO = -2;
        this.f18144OoooOOO = OooO0O0(16);
        this.f18145OoooOOo = OooO0O0(16);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o0O00.OooO0o0(this, objectOutputStream);
    }

    public final int OooO(@NullableDecl Object obj) {
        return OooOO0(obj, o000O0Oo.OooO0OO(obj));
    }

    public final int OooO00o(int i) {
        return i & (this.f18141OoooO00.length - 1);
    }

    public final void OooO0OO(int i, int i2) {
        o0OOOO0o.OooOOOO.OooO0O0(i != -1);
        int iOooO00o = OooO00o(i2);
        int[] iArr = this.f18141OoooO00;
        if (iArr[iOooO00o] == i) {
            int[] iArr2 = this.f18142OoooO0O;
            iArr[iOooO00o] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[iOooO00o];
        int i4 = this.f18142OoooO0O[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected to find entry with key ");
                sbOooO0o0.append(this.f18136Oooo0o[i]);
                throw new AssertionError(sbOooO0o0.toString());
            }
            if (i3 == i) {
                int[] iArr3 = this.f18142OoooO0O;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.f18142OoooO0O[i3];
        }
    }

    public final void OooO0Oo(int i, int i2) {
        o0OOOO0o.OooOOOO.OooO0O0(i != -1);
        int iOooO00o = OooO00o(i2);
        int[] iArr = this.f18140OoooO0;
        if (iArr[iOooO00o] == i) {
            int[] iArr2 = this.f18139OoooO;
            iArr[iOooO00o] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[iOooO00o];
        int i4 = this.f18139OoooO[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected to find entry with value ");
                sbOooO0o0.append(this.f18137Oooo0oO[i]);
                throw new AssertionError(sbOooO0o0.toString());
            }
            if (i3 == i) {
                int[] iArr3 = this.f18139OoooO;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.f18139OoooO[i3];
        }
    }

    public final void OooO0o0(int i) {
        int[] iArr = this.f18142OoooO0O;
        if (iArr.length < i) {
            int iOooO00o = ImmutableCollection.OooO0O0.OooO00o(iArr.length, i);
            this.f18136Oooo0o = (K[]) Arrays.copyOf(this.f18136Oooo0o, iOooO00o);
            this.f18137Oooo0oO = (V[]) Arrays.copyOf(this.f18137Oooo0oO, iOooO00o);
            this.f18142OoooO0O = OooO0oO(this.f18142OoooO0O, iOooO00o);
            this.f18139OoooO = OooO0oO(this.f18139OoooO, iOooO00o);
            this.f18144OoooOOO = OooO0oO(this.f18144OoooOOO, iOooO00o);
            this.f18145OoooOOo = OooO0oO(this.f18145OoooOOo, iOooO00o);
        }
        if (this.f18141OoooO00.length < i) {
            int iOooO00o2 = o000O0Oo.OooO00o(i, 1.0d);
            this.f18141OoooO00 = OooO0O0(iOooO00o2);
            this.f18140OoooO0 = OooO0O0(iOooO00o2);
            for (int i2 = 0; i2 < this.f18138Oooo0oo; i2++) {
                int iOooO00o3 = OooO00o(o000O0Oo.OooO0OO(this.f18136Oooo0o[i2]));
                int[] iArr2 = this.f18142OoooO0O;
                int[] iArr3 = this.f18141OoooO00;
                iArr2[i2] = iArr3[iOooO00o3];
                iArr3[iOooO00o3] = i2;
                int iOooO00o4 = OooO00o(o000O0Oo.OooO0OO(this.f18137Oooo0oO[i2]));
                int[] iArr4 = this.f18139OoooO;
                int[] iArr5 = this.f18140OoooO0;
                iArr4[i2] = iArr5[iOooO00o4];
                iArr5[iOooO00o4] = i2;
            }
        }
    }

    public final int OooO0oo(@NullableDecl Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[OooO00o(i)];
        while (i2 != -1) {
            if (o0OOOO0o.OooOOO.OooO00o(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    public final int OooOO0(@NullableDecl Object obj, int i) {
        return OooO0oo(obj, i, this.f18141OoooO00, this.f18142OoooO0O, this.f18136Oooo0o);
    }

    public final int OooOO0O(@NullableDecl Object obj) {
        return OooOO0o(obj, o000O0Oo.OooO0OO(obj));
    }

    public final int OooOO0o(@NullableDecl Object obj, int i) {
        return OooO0oo(obj, i, this.f18140OoooO0, this.f18139OoooO, this.f18137Oooo0oO);
    }

    public final void OooOOO(int i, int i2) {
        o0OOOO0o.OooOOOO.OooO0O0(i != -1);
        int iOooO00o = OooO00o(i2);
        int[] iArr = this.f18139OoooO;
        int[] iArr2 = this.f18140OoooO0;
        iArr[i] = iArr2[iOooO00o];
        iArr2[iOooO00o] = i;
    }

    public final void OooOOO0(int i, int i2) {
        o0OOOO0o.OooOOOO.OooO0O0(i != -1);
        int iOooO00o = OooO00o(i2);
        int[] iArr = this.f18142OoooO0O;
        int[] iArr2 = this.f18141OoooO00;
        iArr[i] = iArr2[iOooO00o];
        iArr2[iOooO00o] = i;
    }

    public final void OooOOOO(int i, int i2, int i3) {
        int i4;
        int i5;
        o0OOOO0o.OooOOOO.OooO0O0(i != -1);
        OooO0OO(i, i2);
        OooO0Oo(i, i3);
        OooOOoo(this.f18144OoooOOO[i], this.f18145OoooOOo[i]);
        int i6 = this.f18138Oooo0oo - 1;
        if (i6 != i) {
            int i7 = this.f18144OoooOOO[i6];
            int i8 = this.f18145OoooOOo[i6];
            OooOOoo(i7, i);
            OooOOoo(i, i8);
            K[] kArr = this.f18136Oooo0o;
            K k = kArr[i6];
            V[] vArr = this.f18137Oooo0oO;
            V v = vArr[i6];
            kArr[i] = k;
            vArr[i] = v;
            int iOooO00o = OooO00o(o000O0Oo.OooO0OO(k));
            int[] iArr = this.f18141OoooO00;
            if (iArr[iOooO00o] == i6) {
                iArr[iOooO00o] = i;
            } else {
                int i9 = iArr[iOooO00o];
                int i10 = this.f18142OoooO0O[i9];
                while (true) {
                    int i11 = i10;
                    i4 = i9;
                    i9 = i11;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.f18142OoooO0O[i9];
                    }
                }
                this.f18142OoooO0O[i4] = i;
            }
            int[] iArr2 = this.f18142OoooO0O;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int iOooO00o2 = OooO00o(o000O0Oo.OooO0OO(v));
            int[] iArr3 = this.f18140OoooO0;
            if (iArr3[iOooO00o2] == i6) {
                iArr3[iOooO00o2] = i;
            } else {
                int i12 = iArr3[iOooO00o2];
                int i13 = this.f18139OoooO[i12];
                while (true) {
                    int i14 = i13;
                    i5 = i12;
                    i12 = i14;
                    if (i12 == i6) {
                        break;
                    } else {
                        i13 = this.f18139OoooO[i12];
                    }
                }
                this.f18139OoooO[i5] = i;
            }
            int[] iArr4 = this.f18139OoooO;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        K[] kArr2 = this.f18136Oooo0o;
        int i15 = this.f18138Oooo0oo;
        kArr2[i15 - 1] = null;
        this.f18137Oooo0oO[i15 - 1] = null;
        this.f18138Oooo0oo = i15 - 1;
        this.f18135Oooo++;
    }

    public final void OooOOOo(int i, int i2) {
        OooOOOO(i, i2, o000O0Oo.OooO0OO(this.f18137Oooo0oO[i]));
    }

    public final void OooOOo(int i, @NullableDecl Object obj) {
        o0OOOO0o.OooOOOO.OooO0O0(i != -1);
        int iOooO0OO = o000O0Oo.OooO0OO(obj);
        if (OooOO0o(obj, iOooO0OO) == -1) {
            OooO0Oo(i, o000O0Oo.OooO0OO(this.f18137Oooo0oO[i]));
            ((V[]) this.f18137Oooo0oO)[i] = obj;
            OooOOO(i, iOooO0OO);
        } else {
            throw new IllegalArgumentException("Value already present in map: " + obj);
        }
    }

    public final void OooOOo0(int i, int i2) {
        OooOOOO(i, o000O0Oo.OooO0OO(this.f18136Oooo0o[i]), i2);
    }

    public final void OooOOoo(int i, int i2) {
        if (i == -2) {
            this.f18143OoooOO0 = i2;
        } else {
            this.f18145OoooOOo[i] = i2;
        }
        if (i2 == -2) {
            this.f18149o000oOoO = i;
        } else {
            this.f18144OoooOOO[i2] = i;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f18136Oooo0o, 0, this.f18138Oooo0oo, (Object) null);
        Arrays.fill(this.f18137Oooo0oO, 0, this.f18138Oooo0oo, (Object) null);
        Arrays.fill(this.f18141OoooO00, -1);
        Arrays.fill(this.f18140OoooO0, -1);
        Arrays.fill(this.f18142OoooO0O, 0, this.f18138Oooo0oo, -1);
        Arrays.fill(this.f18139OoooO, 0, this.f18138Oooo0oo, -1);
        Arrays.fill(this.f18144OoooOOO, 0, this.f18138Oooo0oo, -1);
        Arrays.fill(this.f18145OoooOOo, 0, this.f18138Oooo0oo, -1);
        this.f18138Oooo0oo = 0;
        this.f18143OoooOO0 = -2;
        this.f18149o000oOoO = -2;
        this.f18135Oooo++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return OooO(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        return OooOO0O(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f18148OoooOoo;
        if (set != null) {
            return set;
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f18148OoooOoo = oooO0O0;
        return oooO0O0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        int iOooO = OooO(obj);
        if (iOooO == -1) {
            return null;
        }
        return this.f18137Oooo0oO[iOooO];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f18146OoooOo0;
        if (set != null) {
            return set;
        }
        OooO0OO oooO0OO = new OooO0OO();
        this.f18146OoooOo0 = oooO0OO;
        return oooO0OO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int iOooO0OO = o000O0Oo.OooO0OO(k);
        int iOooOO0 = OooOO0(k, iOooO0OO);
        if (iOooOO0 != -1) {
            V v2 = this.f18137Oooo0oO[iOooOO0];
            if (o0OOOO0o.OooOOO.OooO00o(v2, v)) {
                return v;
            }
            OooOOo(iOooOO0, v);
            return v2;
        }
        int iOooO0OO2 = o000O0Oo.OooO0OO(v);
        o0OOOO0o.OooOOOO.OooO0oO(OooOO0o(v, iOooO0OO2) == -1, "Value already present: %s", v);
        OooO0o0(this.f18138Oooo0oo + 1);
        K[] kArr = this.f18136Oooo0o;
        int i = this.f18138Oooo0oo;
        kArr[i] = k;
        this.f18137Oooo0oO[i] = v;
        OooOOO0(i, iOooO0OO);
        OooOOO(this.f18138Oooo0oo, iOooO0OO2);
        OooOOoo(this.f18149o000oOoO, this.f18138Oooo0oo);
        OooOOoo(this.f18138Oooo0oo, -2);
        this.f18138Oooo0oo++;
        this.f18135Oooo++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        int iOooO0OO = o000O0Oo.OooO0OO(obj);
        int iOooOO0 = OooOO0(obj, iOooO0OO);
        if (iOooOO0 == -1) {
            return null;
        }
        V v = this.f18137Oooo0oO[iOooOO0];
        OooOOOo(iOooOO0, iOooO0OO);
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18138Oooo0oo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Set<V> set = this.f18147OoooOoO;
        if (set != null) {
            return set;
        }
        OooO0o oooO0o = new OooO0o();
        this.f18147OoooOoO = oooO0o;
        return oooO0o;
    }
}
