package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final Comparator<Comparable> f19223OoooO = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f19224Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Comparator<? super K> f19225Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO<K, V> f19226Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f19227Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public LinkedTreeMap<K, V>.OooO0O0 f19228OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO<K, V> f19229OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public LinkedTreeMap<K, V>.OooO0OO f19230OoooO0O;

    public class OooO00o implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class OooO0O0 extends AbstractSet<Map.Entry<K, V>> {

        public class OooO00o extends LinkedTreeMap<K, V>.OooO0o<Map.Entry<K, V>> {
            public OooO00o(OooO0O0 oooO0O0) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return OooO00o();
            }
        }

        public OooO0O0() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.OooO0O0((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new OooO00o(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            OooO<K, V> oooOOooO0O0;
            if (!(obj instanceof Map.Entry) || (oooOOooO0O0 = LinkedTreeMap.this.OooO0O0((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.OooO0o0(oooOOooO0O0, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.f19227Oooo0oo;
        }
    }

    public final class OooO0OO extends AbstractSet<K> {

        public class OooO00o extends LinkedTreeMap<K, V>.OooO0o<K> {
            public OooO00o(OooO0OO oooO0OO) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return OooO00o().f19236OoooO0;
            }
        }

        public OooO0OO() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new OooO00o(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            OooO<K, V> oooOOooO0OO = linkedTreeMap.OooO0OO(obj);
            if (oooOOooO0OO != null) {
                linkedTreeMap.OooO0o0(oooOOooO0OO, true);
            }
            return oooOOooO0OO != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.f19227Oooo0oo;
        }
    }

    public abstract class OooO0o<T> implements Iterator<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO<K, V> f19242Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public OooO<K, V> f19243Oooo0oO = null;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f19244Oooo0oo;

        public OooO0o() {
            this.f19242Oooo0o = LinkedTreeMap.this.f19229OoooO00.f19231Oooo;
            this.f19244Oooo0oo = LinkedTreeMap.this.f19224Oooo;
        }

        public final OooO<K, V> OooO00o() {
            OooO<K, V> oooO = this.f19242Oooo0o;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (oooO == linkedTreeMap.f19229OoooO00) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f19224Oooo != this.f19244Oooo0oo) {
                throw new ConcurrentModificationException();
            }
            this.f19242Oooo0o = oooO.f19231Oooo;
            this.f19243Oooo0oO = oooO;
            return oooO;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19242Oooo0o != LinkedTreeMap.this.f19229OoooO00;
        }

        @Override // java.util.Iterator
        public final void remove() {
            OooO<K, V> oooO = this.f19243Oooo0oO;
            if (oooO == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.OooO0o0(oooO, true);
            this.f19243Oooo0oO = null;
            this.f19244Oooo0oo = LinkedTreeMap.this.f19224Oooo;
        }
    }

    public LinkedTreeMap() {
        Comparator<Comparable> comparator = f19223OoooO;
        this.f19227Oooo0oo = 0;
        this.f19224Oooo = 0;
        this.f19229OoooO00 = new OooO<>();
        this.f19225Oooo0o = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final void OooO(OooO<K, V> oooO) {
        OooO<K, V> oooO2 = oooO.f19233Oooo0oO;
        OooO<K, V> oooO3 = oooO.f19234Oooo0oo;
        OooO<K, V> oooO4 = oooO2.f19233Oooo0oO;
        OooO<K, V> oooO5 = oooO2.f19234Oooo0oo;
        oooO.f19233Oooo0oO = oooO5;
        if (oooO5 != null) {
            oooO5.f19232Oooo0o = oooO;
        }
        OooO0oO(oooO, oooO2);
        oooO2.f19234Oooo0oo = oooO;
        oooO.f19232Oooo0o = oooO2;
        int iMax = Math.max(oooO3 != null ? oooO3.f19235OoooO : 0, oooO5 != null ? oooO5.f19235OoooO : 0) + 1;
        oooO.f19235OoooO = iMax;
        oooO2.f19235OoooO = Math.max(iMax, oooO4 != null ? oooO4.f19235OoooO : 0) + 1;
    }

    public final OooO<K, V> OooO00o(K k, boolean z) {
        int iCompareTo;
        OooO<K, V> oooO;
        Comparator<? super K> comparator = this.f19225Oooo0o;
        OooO<K, V> oooO2 = this.f19226Oooo0oO;
        if (oooO2 != null) {
            Comparable comparable = comparator == f19223OoooO ? (Comparable) k : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(oooO2.f19236OoooO0) : comparator.compare(k, oooO2.f19236OoooO0);
                if (iCompareTo == 0) {
                    return oooO2;
                }
                OooO<K, V> oooO3 = iCompareTo < 0 ? oooO2.f19233Oooo0oO : oooO2.f19234Oooo0oo;
                if (oooO3 == null) {
                    break;
                }
                oooO2 = oooO3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        OooO<K, V> oooO4 = this.f19229OoooO00;
        if (oooO2 != null) {
            oooO = new OooO<>(oooO2, k, oooO4, oooO4.f19237OoooO00);
            if (iCompareTo < 0) {
                oooO2.f19233Oooo0oO = oooO;
            } else {
                oooO2.f19234Oooo0oo = oooO;
            }
            OooO0Oo(oooO2, true);
        } else {
            if (comparator == f19223OoooO && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            oooO = new OooO<>(oooO2, k, oooO4, oooO4.f19237OoooO00);
            this.f19226Oooo0oO = oooO;
        }
        this.f19227Oooo0oo++;
        this.f19224Oooo++;
        return oooO;
    }

    public final OooO<K, V> OooO0O0(Map.Entry<?, ?> entry) {
        OooO<K, V> oooOOooO0OO = OooO0OO(entry.getKey());
        boolean z = false;
        if (oooOOooO0OO != null) {
            V v = oooOOooO0OO.f19238OoooO0O;
            Object value = entry.getValue();
            if (v == value || (v != null && v.equals(value))) {
                z = true;
            }
        }
        if (z) {
            return oooOOooO0OO;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO<K, V> OooO0OO(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return OooO00o(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void OooO0Oo(OooO<K, V> oooO, boolean z) {
        while (oooO != null) {
            OooO<K, V> oooO2 = oooO.f19233Oooo0oO;
            OooO<K, V> oooO3 = oooO.f19234Oooo0oo;
            int i = oooO2 != null ? oooO2.f19235OoooO : 0;
            int i2 = oooO3 != null ? oooO3.f19235OoooO : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                OooO<K, V> oooO4 = oooO3.f19233Oooo0oO;
                OooO<K, V> oooO5 = oooO3.f19234Oooo0oo;
                int i4 = (oooO4 != null ? oooO4.f19235OoooO : 0) - (oooO5 != null ? oooO5.f19235OoooO : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    OooO0oo(oooO);
                } else {
                    OooO(oooO3);
                    OooO0oo(oooO);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                OooO<K, V> oooO6 = oooO2.f19233Oooo0oO;
                OooO<K, V> oooO7 = oooO2.f19234Oooo0oo;
                int i5 = (oooO6 != null ? oooO6.f19235OoooO : 0) - (oooO7 != null ? oooO7.f19235OoooO : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    OooO(oooO);
                } else {
                    OooO0oo(oooO2);
                    OooO(oooO);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                oooO.f19235OoooO = i + 1;
                if (z) {
                    return;
                }
            } else {
                oooO.f19235OoooO = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            oooO = oooO.f19232Oooo0o;
        }
    }

    public final void OooO0o0(OooO<K, V> oooO, boolean z) {
        int i;
        if (z) {
            OooO<K, V> oooO2 = oooO.f19237OoooO00;
            oooO2.f19231Oooo = oooO.f19231Oooo;
            oooO.f19231Oooo.f19237OoooO00 = oooO2;
        }
        OooO<K, V> oooO3 = oooO.f19233Oooo0oO;
        OooO<K, V> oooO4 = oooO.f19234Oooo0oo;
        OooO<K, V> oooO5 = oooO.f19232Oooo0o;
        int i2 = 0;
        if (oooO3 == null || oooO4 == null) {
            if (oooO3 != null) {
                OooO0oO(oooO, oooO3);
                oooO.f19233Oooo0oO = null;
            } else if (oooO4 != null) {
                OooO0oO(oooO, oooO4);
                oooO.f19234Oooo0oo = null;
            } else {
                OooO0oO(oooO, null);
            }
            OooO0Oo(oooO5, false);
            this.f19227Oooo0oo--;
            this.f19224Oooo++;
            return;
        }
        if (oooO3.f19235OoooO > oooO4.f19235OoooO) {
            OooO<K, V> oooO6 = oooO3.f19234Oooo0oo;
            while (true) {
                OooO<K, V> oooO7 = oooO6;
                oooO4 = oooO3;
                oooO3 = oooO7;
                if (oooO3 == null) {
                    break;
                } else {
                    oooO6 = oooO3.f19234Oooo0oo;
                }
            }
        } else {
            for (OooO<K, V> oooO8 = oooO4.f19233Oooo0oO; oooO8 != null; oooO8 = oooO8.f19233Oooo0oO) {
                oooO4 = oooO8;
            }
        }
        OooO0o0(oooO4, false);
        OooO<K, V> oooO9 = oooO.f19233Oooo0oO;
        if (oooO9 != null) {
            i = oooO9.f19235OoooO;
            oooO4.f19233Oooo0oO = oooO9;
            oooO9.f19232Oooo0o = oooO4;
            oooO.f19233Oooo0oO = null;
        } else {
            i = 0;
        }
        OooO<K, V> oooO10 = oooO.f19234Oooo0oo;
        if (oooO10 != null) {
            i2 = oooO10.f19235OoooO;
            oooO4.f19234Oooo0oo = oooO10;
            oooO10.f19232Oooo0o = oooO4;
            oooO.f19234Oooo0oo = null;
        }
        oooO4.f19235OoooO = Math.max(i, i2) + 1;
        OooO0oO(oooO, oooO4);
    }

    public final void OooO0oO(OooO<K, V> oooO, OooO<K, V> oooO2) {
        OooO<K, V> oooO3 = oooO.f19232Oooo0o;
        oooO.f19232Oooo0o = null;
        if (oooO2 != null) {
            oooO2.f19232Oooo0o = oooO3;
        }
        if (oooO3 == null) {
            this.f19226Oooo0oO = oooO2;
        } else if (oooO3.f19233Oooo0oO == oooO) {
            oooO3.f19233Oooo0oO = oooO2;
        } else {
            oooO3.f19234Oooo0oo = oooO2;
        }
    }

    public final void OooO0oo(OooO<K, V> oooO) {
        OooO<K, V> oooO2 = oooO.f19233Oooo0oO;
        OooO<K, V> oooO3 = oooO.f19234Oooo0oo;
        OooO<K, V> oooO4 = oooO3.f19233Oooo0oO;
        OooO<K, V> oooO5 = oooO3.f19234Oooo0oo;
        oooO.f19234Oooo0oo = oooO4;
        if (oooO4 != null) {
            oooO4.f19232Oooo0o = oooO;
        }
        OooO0oO(oooO, oooO3);
        oooO3.f19233Oooo0oO = oooO;
        oooO.f19232Oooo0o = oooO3;
        int iMax = Math.max(oooO2 != null ? oooO2.f19235OoooO : 0, oooO4 != null ? oooO4.f19235OoooO : 0) + 1;
        oooO.f19235OoooO = iMax;
        oooO3.f19235OoooO = Math.max(iMax, oooO5 != null ? oooO5.f19235OoooO : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f19226Oooo0oO = null;
        this.f19227Oooo0oo = 0;
        this.f19224Oooo++;
        OooO<K, V> oooO = this.f19229OoooO00;
        oooO.f19237OoooO00 = oooO;
        oooO.f19231Oooo = oooO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return OooO0OO(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.OooO0O0 oooO0O0 = this.f19228OoooO0;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        LinkedTreeMap<K, V>.OooO0O0 oooO0O1 = new OooO0O0();
        this.f19228OoooO0 = oooO0O1;
        return oooO0O1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        OooO<K, V> oooOOooO0OO = OooO0OO(obj);
        if (oooOOooO0OO != null) {
            return oooOOooO0OO.f19238OoooO0O;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        LinkedTreeMap<K, V>.OooO0OO oooO0OO = this.f19230OoooO0O;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        LinkedTreeMap<K, V>.OooO0OO oooO0OO2 = new OooO0OO();
        this.f19230OoooO0O = oooO0OO2;
        return oooO0OO2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        OooO<K, V> oooOOooO00o = OooO00o(k, true);
        V v2 = oooOOooO00o.f19238OoooO0O;
        oooOOooO00o.f19238OoooO0O = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        OooO<K, V> oooOOooO0OO = OooO0OO(obj);
        if (oooOOooO0OO != null) {
            OooO0o0(oooOOooO0OO, true);
        }
        if (oooOOooO0OO != null) {
            return oooOOooO0OO.f19238OoooO0O;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19227Oooo0oo;
    }

    public static final class OooO<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public OooO<K, V> f19231Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO<K, V> f19232Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public OooO<K, V> f19233Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public OooO<K, V> f19234Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f19235OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final K f19236OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public OooO<K, V> f19237OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public V f19238OoooO0O;

        public OooO() {
            this.f19236OoooO0 = null;
            this.f19237OoooO00 = this;
            this.f19231Oooo = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f19236OoooO0;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f19238OoooO0O;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f19236OoooO0;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f19238OoooO0O;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f19236OoooO0;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f19238OoooO0O;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.f19238OoooO0O;
            this.f19238OoooO0O = v;
            return v2;
        }

        public final String toString() {
            return this.f19236OoooO0 + "=" + this.f19238OoooO0O;
        }

        public OooO(OooO<K, V> oooO, K k, OooO<K, V> oooO2, OooO<K, V> oooO3) {
            this.f19232Oooo0o = oooO;
            this.f19236OoooO0 = k;
            this.f19235OoooO = 1;
            this.f19231Oooo = oooO2;
            this.f19237OoooO00 = oooO3;
            oooO3.f19231Oooo = this;
            oooO2.f19237OoooO00 = this;
        }
    }
}
