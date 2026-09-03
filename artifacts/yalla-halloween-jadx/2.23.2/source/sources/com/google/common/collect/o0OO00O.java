package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public class o0OO00O<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Object f19123OooOOO0 = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public transient int f19124OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public transient Object f19125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    @CheckForNull
    public transient Object[] f19126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    @CheckForNull
    public transient int[] f19127OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @VisibleForTesting
    @CheckForNull
    public transient Object[] f19128OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public transient int f19129OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @CheckForNull
    public transient OooO0OO f19130OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @CheckForNull
    public transient OooO00o f19131OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @CheckForNull
    public transient OooO f19132OooOO0o;

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
            Map<K, V> mapOooO0o = o0oo00o2.OooO0o();
            return mapOooO0o != null ? mapOooO0o.values().iterator() : new o0Oo0oo(o0oo00o2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return o0OO00O.this.size();
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
        public final boolean contains(@CheckForNull Object obj) {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Map<K, V> mapOooO0o = o0oo00o2.OooO0o();
            if (mapOooO0o != null) {
                return mapOooO0o.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iOooOO0 = o0oo00o2.OooOO0(entry.getKey());
            return iOooOO0 != -1 && com.google.common.base.Oooo0.OooO00o(o0oo00o2.OooOo0O(iOooOO0), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Map<K, V> mapOooO0o = o0oo00o2.OooO0o();
            return mapOooO0o != null ? mapOooO0o.entrySet().iterator() : new o0OOO0o(o0oo00o2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Map<K, V> mapOooO0o = o0oo00o2.OooO0o();
            if (mapOooO0o != null) {
                return mapOooO0o.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (o0oo00o2.OooOOOO()) {
                return false;
            }
            int i = (1 << (o0oo00o2.f19129OooO0oo & 31)) - 1;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = o0oo00o2.f19125OooO0Oo;
            Objects.requireNonNull(obj2);
            int iOooO0O0 = o0O0O00.OooO0O0(key, value, i, obj2, o0oo00o2.OooOOo0(), o0oo00o2.OooOOo(), o0oo00o2.OooOOoo());
            if (iOooO0O0 == -1) {
                return false;
            }
            o0oo00o2.OooOOO(iOooO0O0, i);
            o0oo00o2.f19124OooO--;
            o0oo00o2.OooO();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o0OO00O.this.size();
        }
    }

    public abstract class OooO0O0<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19135OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f19136OooO0o = -1;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19137OooO0o0;

        public OooO0O0() {
            this.f19135OooO0Oo = o0OO00O.this.f19129OooO0oo;
            this.f19137OooO0o0 = o0OO00O.this.OooO0oO();
        }

        @ParametricNullness
        public abstract T OooO00o(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19137OooO0o0 >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public final T next() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            if (o0oo00o2.f19129OooO0oo != this.f19135OooO0Oo) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f19137OooO0o0;
            this.f19136OooO0o = i;
            T tOooO00o = OooO00o(i);
            this.f19137OooO0o0 = o0oo00o2.OooO0oo(this.f19137OooO0o0);
            return tOooO00o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            if (o0oo00o2.f19129OooO0oo != this.f19135OooO0Oo) {
                throw new ConcurrentModificationException();
            }
            oo000o.OooO0Oo(this.f19136OooO0o >= 0);
            this.f19135OooO0Oo += 32;
            o0oo00o2.remove(o0oo00o2.OooOOO0(this.f19136OooO0o));
            this.f19137OooO0o0 = o0oo00o2.OooO0O0(this.f19137OooO0o0, this.f19136OooO0o);
            this.f19136OooO0o = -1;
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
        public final boolean contains(@CheckForNull Object obj) {
            return o0OO00O.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Map<K, V> mapOooO0o = o0oo00o2.OooO0o();
            return mapOooO0o != null ? mapOooO0o.keySet().iterator() : new o0ooOOo(o0oo00o2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Map<K, V> mapOooO0o = o0oo00o2.OooO0o();
            if (mapOooO0o != null) {
                return mapOooO0o.keySet().remove(obj);
            }
            return o0oo00o2.OooOOOo(obj) != o0OO00O.f19123OooOOO0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o0OO00O.this.size();
        }
    }

    public final class OooO0o extends OooOOO0<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f19140OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19142OooO0o0;

        public OooO0o(int i) {
            Object obj = o0OO00O.f19123OooOOO0;
            this.f19140OooO0Oo = (K) o0OO00O.this.OooOOO0(i);
            this.f19142OooO0o0 = i;
        }

        public final void OooO0Oo() {
            int i = this.f19142OooO0o0;
            K k = this.f19140OooO0Oo;
            o0OO00O o0oo00o2 = o0OO00O.this;
            if (i == -1 || i >= o0oo00o2.size() || !com.google.common.base.Oooo0.OooO00o(k, o0oo00o2.OooOOO0(this.f19142OooO0o0))) {
                Object obj = o0OO00O.f19123OooOOO0;
                this.f19142OooO0o0 = o0oo00o2.OooOO0(k);
            }
        }

        @Override // java.util.Map.Entry
        @ParametricNullness
        public final K getKey() {
            return this.f19140OooO0Oo;
        }

        @Override // java.util.Map.Entry
        @ParametricNullness
        public final V getValue() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Map<K, V> mapOooO0o = o0oo00o2.OooO0o();
            if (mapOooO0o != null) {
                return mapOooO0o.get(this.f19140OooO0Oo);
            }
            OooO0Oo();
            int i = this.f19142OooO0o0;
            if (i == -1) {
                return null;
            }
            return (V) o0oo00o2.OooOo0O(i);
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        @ParametricNullness
        public final V setValue(@ParametricNullness V v) {
            o0OO00O o0oo00o2 = o0OO00O.this;
            Map<K, V> mapOooO0o = o0oo00o2.OooO0o();
            K k = this.f19140OooO0Oo;
            if (mapOooO0o != null) {
                return mapOooO0o.put(k, v);
            }
            OooO0Oo();
            int i = this.f19142OooO0o0;
            if (i == -1) {
                o0oo00o2.put(k, v);
                return null;
            }
            V v2 = (V) o0oo00o2.OooOo0O(i);
            o0oo00o2.OooOOoo()[this.f19142OooO0o0] = v;
            return v2;
        }
    }

    public o0OO00O() {
        OooOO0O(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(android.support.v4.media.session.OooO0OO.OooO00o(25, "Invalid size: ", i));
        }
        OooOO0O(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> mapOooO0o = OooO0o();
        Iterator<Map.Entry<K, V>> it = mapOooO0o != null ? mapOooO0o.entrySet().iterator() : new o0OOO0o(this);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final void OooO() {
        this.f19129OooO0oo += 32;
    }

    public void OooO00o(int i) {
    }

    public int OooO0O0(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int OooO0OO() {
        com.google.common.base.o0OoOo0.OooOOO(OooOOOO(), "Arrays already allocated");
        int i = this.f19129OooO0oo;
        int iMax = Math.max(4, o000OO0O.OooO00o(1.0d, i + 1));
        this.f19125OooO0Oo = o0O0O00.OooO00o(iMax);
        this.f19129OooO0oo = ((32 - Integer.numberOfLeadingZeros(iMax - 1)) & 31) | (this.f19129OooO0oo & (-32));
        this.f19127OooO0o0 = new int[i];
        this.f19126OooO0o = new Object[i];
        this.f19128OooO0oO = new Object[i];
        return i;
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public Map<K, V> OooO0Oo() {
        LinkedHashMap linkedHashMapOooO0o0 = OooO0o0(((1 << (this.f19129OooO0oo & 31)) - 1) + 1);
        int iOooO0oO = OooO0oO();
        while (iOooO0oO >= 0) {
            linkedHashMapOooO0o0.put(OooOOO0(iOooO0oO), OooOo0O(iOooO0oO));
            iOooO0oO = OooO0oo(iOooO0oO);
        }
        this.f19125OooO0Oo = linkedHashMapOooO0o0;
        this.f19127OooO0o0 = null;
        this.f19126OooO0o = null;
        this.f19128OooO0oO = null;
        OooO();
        return linkedHashMapOooO0o0;
    }

    @VisibleForTesting
    @CheckForNull
    public final Map<K, V> OooO0o() {
        Object obj = this.f19125OooO0Oo;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public LinkedHashMap OooO0o0(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public int OooO0oO() {
        return isEmpty() ? -1 : 0;
    }

    public int OooO0oo(int i) {
        int i2 = i + 1;
        if (i2 < this.f19124OooO) {
            return i2;
        }
        return -1;
    }

    public final int OooOO0(@CheckForNull Object obj) {
        if (OooOOOO()) {
            return -1;
        }
        int iOooO0OO = o000OO0O.OooO0OO(obj);
        int i = (1 << (this.f19129OooO0oo & 31)) - 1;
        Object obj2 = this.f19125OooO0Oo;
        Objects.requireNonNull(obj2);
        int iOooO0OO2 = o0O0O00.OooO0OO(iOooO0OO & i, obj2);
        if (iOooO0OO2 == 0) {
            return -1;
        }
        int i2 = ~i;
        int i3 = iOooO0OO & i2;
        do {
            int i4 = iOooO0OO2 - 1;
            int i5 = OooOOo0()[i4];
            if ((i5 & i2) == i3 && com.google.common.base.Oooo0.OooO00o(obj, OooOOO0(i4))) {
                return i4;
            }
            iOooO0OO2 = i5 & i;
        } while (iOooO0OO2 != 0);
        return -1;
    }

    public void OooOO0O(int i) {
        com.google.common.base.o0OoOo0.OooO0o0(i >= 0, "Expected size must be >= 0");
        this.f19129OooO0oo = com.google.common.primitives.OooO0OO.OooO0O0(i, 1);
    }

    public void OooOO0o(int i, int i2, int i3, @ParametricNullness Object obj, @ParametricNullness Object obj2) {
        OooOOo0()[i] = (i2 & (~i3)) | (i3 & 0);
        OooOOo()[i] = obj;
        OooOOoo()[i] = obj2;
    }

    public void OooOOO(int i, int i2) {
        Object obj = this.f19125OooO0Oo;
        Objects.requireNonNull(obj);
        int[] iArrOooOOo0 = OooOOo0();
        Object[] objArrOooOOo = OooOOo();
        Object[] objArrOooOOoo = OooOOoo();
        int size = size() - 1;
        if (i >= size) {
            objArrOooOOo[i] = null;
            objArrOooOOoo[i] = null;
            iArrOooOOo0[i] = 0;
            return;
        }
        Object obj2 = objArrOooOOo[size];
        objArrOooOOo[i] = obj2;
        objArrOooOOoo[i] = objArrOooOOoo[size];
        objArrOooOOo[size] = null;
        objArrOooOOoo[size] = null;
        iArrOooOOo0[i] = iArrOooOOo0[size];
        iArrOooOOo0[size] = 0;
        int iOooO0OO = o000OO0O.OooO0OO(obj2) & i2;
        int iOooO0OO2 = o0O0O00.OooO0OO(iOooO0OO, obj);
        int i3 = size + 1;
        if (iOooO0OO2 == i3) {
            o0O0O00.OooO0Oo(iOooO0OO, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iOooO0OO2 - 1;
            int i5 = iArrOooOOo0[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                iArrOooOOo0[i4] = ((i + 1) & i2) | (i5 & (~i2));
                return;
            }
            iOooO0OO2 = i6;
        }
    }

    public final K OooOOO0(int i) {
        return (K) OooOOo()[i];
    }

    @VisibleForTesting
    public final boolean OooOOOO() {
        return this.f19125OooO0Oo == null;
    }

    public final Object OooOOOo(@CheckForNull Object obj) {
        boolean zOooOOOO = OooOOOO();
        Object obj2 = f19123OooOOO0;
        if (zOooOOOO) {
            return obj2;
        }
        int i = (1 << (this.f19129OooO0oo & 31)) - 1;
        Object obj3 = this.f19125OooO0Oo;
        Objects.requireNonNull(obj3);
        int iOooO0O0 = o0O0O00.OooO0O0(obj, null, i, obj3, OooOOo0(), OooOOo(), null);
        if (iOooO0O0 == -1) {
            return obj2;
        }
        V vOooOo0O = OooOo0O(iOooO0O0);
        OooOOO(iOooO0O0, i);
        this.f19124OooO--;
        OooO();
        return vOooOo0O;
    }

    public final Object[] OooOOo() {
        Object[] objArr = this.f19126OooO0o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] OooOOo0() {
        int[] iArr = this.f19127OooO0o0;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] OooOOoo() {
        Object[] objArr = this.f19128OooO0oO;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @CanIgnoreReturnValue
    public final int OooOo0(int i, int i2, int i3, int i4) {
        Object objOooO00o = o0O0O00.OooO00o(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            o0O0O00.OooO0Oo(i3 & i5, i4 + 1, objOooO00o);
        }
        Object obj = this.f19125OooO0Oo;
        Objects.requireNonNull(obj);
        int[] iArrOooOOo0 = OooOOo0();
        for (int i6 = 0; i6 <= i; i6++) {
            int iOooO0OO = o0O0O00.OooO0OO(i6, obj);
            while (iOooO0OO != 0) {
                int i7 = iOooO0OO - 1;
                int i8 = iArrOooOOo0[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iOooO0OO2 = o0O0O00.OooO0OO(i10, objOooO00o);
                o0O0O00.OooO0Oo(i10, iOooO0OO, objOooO00o);
                iArrOooOOo0[i7] = ((~i5) & i9) | (iOooO0OO2 & i5);
                iOooO0OO = i8 & i;
            }
        }
        this.f19125OooO0Oo = objOooO00o;
        this.f19129OooO0oo = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f19129OooO0oo & (-32));
        return i5;
    }

    public void OooOo00(int i) {
        this.f19127OooO0o0 = Arrays.copyOf(OooOOo0(), i);
        this.f19126OooO0o = Arrays.copyOf(OooOOo(), i);
        this.f19128OooO0oO = Arrays.copyOf(OooOOoo(), i);
    }

    public final V OooOo0O(int i) {
        return (V) OooOOoo()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (OooOOOO()) {
            return;
        }
        OooO();
        Map<K, V> mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            this.f19129OooO0oo = com.google.common.primitives.OooO0OO.OooO0O0(size(), 3);
            mapOooO0o.clear();
            this.f19125OooO0Oo = null;
            this.f19124OooO = 0;
            return;
        }
        Arrays.fill(OooOOo(), 0, this.f19124OooO, (Object) null);
        Arrays.fill(OooOOoo(), 0, this.f19124OooO, (Object) null);
        Object obj = this.f19125OooO0Oo;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(OooOOo0(), 0, this.f19124OooO, 0);
        this.f19124OooO = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.containsKey(obj);
        }
        return OooOO0(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.containsValue(obj);
        }
        for (int i = 0; i < this.f19124OooO; i++) {
            if (com.google.common.base.Oooo0.OooO00o(obj, OooOo0O(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        OooO00o oooO00o = this.f19131OooOO0O;
        if (oooO00o != null) {
            return oooO00o;
        }
        OooO00o oooO00o2 = new OooO00o();
        this.f19131OooOO0O = oooO00o2;
        return oooO00o2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        Map<K, V> mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.get(obj);
        }
        int iOooOO0 = OooOO0(obj);
        if (iOooOO0 == -1) {
            return null;
        }
        OooO00o(iOooOO0);
        return OooOo0O(iOooOO0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        OooO0OO oooO0OO = this.f19130OooOO0;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        OooO0OO oooO0OO2 = new OooO0OO();
        this.f19130OooOO0 = oooO0OO2;
        return oooO0OO2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final V put(@ParametricNullness K k, @ParametricNullness V v) {
        int iOooOo0;
        int iMin;
        if (OooOOOO()) {
            OooO0OO();
        }
        Map<K, V> mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.put(k, v);
        }
        int[] iArrOooOOo0 = OooOOo0();
        Object[] objArrOooOOo = OooOOo();
        Object[] objArrOooOOoo = OooOOoo();
        int i = this.f19124OooO;
        int i2 = i + 1;
        int iOooO0OO = o000OO0O.OooO0OO(k);
        int i3 = (1 << (this.f19129OooO0oo & 31)) - 1;
        int i4 = iOooO0OO & i3;
        Object obj = this.f19125OooO0Oo;
        Objects.requireNonNull(obj);
        int iOooO0OO2 = o0O0O00.OooO0OO(i4, obj);
        if (iOooO0OO2 != 0) {
            int i5 = ~i3;
            int i6 = iOooO0OO & i5;
            int i7 = 0;
            while (true) {
                int i8 = iOooO0OO2 - 1;
                int i9 = iArrOooOOo0[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && com.google.common.base.Oooo0.OooO00o(k, objArrOooOOo[i8])) {
                    V v2 = (V) objArrOooOOoo[i8];
                    objArrOooOOoo[i8] = v;
                    OooO00o(i8);
                    return v2;
                }
                int i11 = i9 & i3;
                Object[] objArr = objArrOooOOo;
                int i12 = i7 + 1;
                if (i11 == 0) {
                    if (i12 < 9) {
                        if (i2 <= i3) {
                            iArrOooOOo0[i8] = (i2 & i3) | i10;
                            break;
                        }
                        iOooOo0 = OooOo0(i3, (i3 + 1) * (i3 < 32 ? 4 : 2), iOooO0OO, i);
                        i3 = iOooOo0;
                        break;
                    }
                    return OooO0Oo().put(k, v);
                }
                i7 = i12;
                iOooO0OO2 = i11;
                objArrOooOOo = objArr;
            }
        } else {
            if (i2 > i3) {
                iOooOo0 = OooOo0(i3, (i3 + 1) * (i3 < 32 ? 4 : 2), iOooO0OO, i);
                i3 = iOooOo0;
                break;
            }
            Object obj2 = this.f19125OooO0Oo;
            Objects.requireNonNull(obj2);
            o0O0O00.OooO0Oo(i4, i2, obj2);
        }
        int length = OooOOo0().length;
        if (i2 > length && (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            OooOo00(iMin);
        }
        OooOO0o(i, iOooO0OO, i3, k, v);
        this.f19124OooO = i2;
        OooO();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        Map<K, V> mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.remove(obj);
        }
        V v = (V) OooOOOo(obj);
        if (v == f19123OooOOO0) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapOooO0o = OooO0o();
        return mapOooO0o != null ? mapOooO0o.size() : this.f19124OooO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        OooO oooO = this.f19132OooOO0o;
        if (oooO != null) {
            return oooO;
        }
        OooO oooO2 = new OooO();
        this.f19132OooOO0o = oooO2;
        return oooO2;
    }

    public o0OO00O(int i) {
        OooOO0O(i);
    }
}
