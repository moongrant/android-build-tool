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
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f20604OooOO0O = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LinkedTreeMap<K, V>.OooO0O0 f20605OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Comparator<? super K> f20606OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f20607OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO<K, V> f20608OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f20609OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO<K, V> f20610OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinkedTreeMap<K, V>.OooO0OO f20611OooOO0;

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
            LinkedTreeMap linkedTreeMap;
            OooO<K, V> oooOOooO0O0;
            if (!(obj instanceof Map.Entry) || (oooOOooO0O0 = (linkedTreeMap = LinkedTreeMap.this).OooO0O0((Map.Entry) obj)) == null) {
                return false;
            }
            linkedTreeMap.OooO0Oo(oooOOooO0O0, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.f20607OooO0o;
        }
    }

    public final class OooO0OO extends AbstractSet<K> {

        public class OooO00o extends LinkedTreeMap<K, V>.OooO0o<K> {
            public OooO00o(OooO0OO oooO0OO) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return OooO00o().f20612OooO;
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
            OooO<K, V> oooOOooO00o;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.getClass();
            if (obj != null) {
                try {
                    oooOOooO00o = linkedTreeMap.OooO00o(obj, false);
                } catch (ClassCastException unused) {
                    oooOOooO00o = null;
                }
            } else {
                oooOOooO00o = null;
            }
            if (oooOOooO00o != null) {
                linkedTreeMap.OooO0Oo(oooOOooO00o, true);
            }
            return oooOOooO00o != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.f20607OooO0o;
        }
    }

    public abstract class OooO0o<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO<K, V> f20622OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f20623OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO<K, V> f20624OooO0o0 = null;

        public OooO0o() {
            this.f20622OooO0Oo = LinkedTreeMap.this.f20610OooO0oo.f20616OooO0oO;
            this.f20623OooO0o = LinkedTreeMap.this.f20609OooO0oO;
        }

        public final OooO<K, V> OooO00o() {
            OooO<K, V> oooO = this.f20622OooO0Oo;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (oooO == linkedTreeMap.f20610OooO0oo) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f20609OooO0oO != this.f20623OooO0o) {
                throw new ConcurrentModificationException();
            }
            this.f20622OooO0Oo = oooO.f20616OooO0oO;
            this.f20624OooO0o0 = oooO;
            return oooO;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f20622OooO0Oo != LinkedTreeMap.this.f20610OooO0oo;
        }

        @Override // java.util.Iterator
        public final void remove() {
            OooO<K, V> oooO = this.f20624OooO0o0;
            if (oooO == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.OooO0Oo(oooO, true);
            this.f20624OooO0o0 = null;
            this.f20623OooO0o = linkedTreeMap.f20609OooO0oO;
        }
    }

    public LinkedTreeMap() {
        OooO00o oooO00o = f20604OooOO0O;
        this.f20607OooO0o = 0;
        this.f20609OooO0oO = 0;
        this.f20610OooO0oo = new OooO<>();
        this.f20606OooO0Oo = oooO00o;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final OooO<K, V> OooO00o(K k, boolean z) {
        int iCompareTo;
        OooO<K, V> oooO;
        OooO<K, V> oooO2 = this.f20608OooO0o0;
        OooO00o oooO00o = f20604OooOO0O;
        Comparator<? super K> comparator = this.f20606OooO0Oo;
        if (oooO2 != null) {
            Comparable comparable = comparator == oooO00o ? (Comparable) k : null;
            while (true) {
                K k2 = oooO2.f20612OooO;
                iCompareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (iCompareTo == 0) {
                    return oooO2;
                }
                OooO<K, V> oooO3 = iCompareTo < 0 ? oooO2.f20615OooO0o0 : oooO2.f20614OooO0o;
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
        OooO<K, V> oooO4 = this.f20610OooO0oo;
        if (oooO2 != null) {
            oooO = new OooO<>(oooO2, k, oooO4, oooO4.f20617OooO0oo);
            if (iCompareTo < 0) {
                oooO2.f20615OooO0o0 = oooO;
            } else {
                oooO2.f20614OooO0o = oooO;
            }
            OooO0OO(oooO2, true);
        } else {
            if (comparator == oooO00o && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            oooO = new OooO<>(oooO2, k, oooO4, oooO4.f20617OooO0oo);
            this.f20608OooO0o0 = oooO;
        }
        this.f20607OooO0o++;
        this.f20609OooO0oO++;
        return oooO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO<K, V> OooO0O0(Map.Entry<?, ?> entry) {
        OooO<K, V> oooOOooO00o;
        Object key = entry.getKey();
        boolean z = false;
        if (key != null) {
            try {
                oooOOooO00o = OooO00o(key, false);
            } catch (ClassCastException unused) {
                oooOOooO00o = null;
            }
        } else {
            oooOOooO00o = null;
        }
        if (oooOOooO00o != null) {
            V v = oooOOooO00o.f20618OooOO0;
            Object value = entry.getValue();
            if (v == value || (v != null && v.equals(value))) {
                z = true;
            }
        }
        if (z) {
            return oooOOooO00o;
        }
        return null;
    }

    public final void OooO0OO(OooO<K, V> oooO, boolean z) {
        while (oooO != null) {
            OooO<K, V> oooO2 = oooO.f20615OooO0o0;
            OooO<K, V> oooO3 = oooO.f20614OooO0o;
            int i = oooO2 != null ? oooO2.f20619OooOO0O : 0;
            int i2 = oooO3 != null ? oooO3.f20619OooOO0O : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                OooO<K, V> oooO4 = oooO3.f20615OooO0o0;
                OooO<K, V> oooO5 = oooO3.f20614OooO0o;
                int i4 = (oooO4 != null ? oooO4.f20619OooOO0O : 0) - (oooO5 != null ? oooO5.f20619OooOO0O : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    OooO0o(oooO);
                } else {
                    OooO0oO(oooO3);
                    OooO0o(oooO);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                OooO<K, V> oooO6 = oooO2.f20615OooO0o0;
                OooO<K, V> oooO7 = oooO2.f20614OooO0o;
                int i5 = (oooO6 != null ? oooO6.f20619OooOO0O : 0) - (oooO7 != null ? oooO7.f20619OooOO0O : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    OooO0oO(oooO);
                } else {
                    OooO0o(oooO2);
                    OooO0oO(oooO);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                oooO.f20619OooOO0O = i + 1;
                if (z) {
                    return;
                }
            } else {
                oooO.f20619OooOO0O = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            oooO = oooO.f20613OooO0Oo;
        }
    }

    public final void OooO0Oo(OooO<K, V> oooO, boolean z) {
        OooO<K, V> oooO2;
        OooO<K, V> oooO3;
        int i;
        if (z) {
            OooO<K, V> oooO4 = oooO.f20617OooO0oo;
            oooO4.f20616OooO0oO = oooO.f20616OooO0oO;
            oooO.f20616OooO0oO.f20617OooO0oo = oooO4;
        }
        OooO<K, V> oooO5 = oooO.f20615OooO0o0;
        OooO<K, V> oooO6 = oooO.f20614OooO0o;
        OooO<K, V> oooO7 = oooO.f20613OooO0Oo;
        int i2 = 0;
        if (oooO5 == null || oooO6 == null) {
            if (oooO5 != null) {
                OooO0o0(oooO, oooO5);
                oooO.f20615OooO0o0 = null;
            } else if (oooO6 != null) {
                OooO0o0(oooO, oooO6);
                oooO.f20614OooO0o = null;
            } else {
                OooO0o0(oooO, null);
            }
            OooO0OO(oooO7, false);
            this.f20607OooO0o--;
            this.f20609OooO0oO++;
            return;
        }
        if (oooO5.f20619OooOO0O > oooO6.f20619OooOO0O) {
            OooO<K, V> oooO8 = oooO5.f20614OooO0o;
            while (true) {
                OooO<K, V> oooO9 = oooO8;
                oooO3 = oooO5;
                oooO5 = oooO9;
                if (oooO5 == null) {
                    break;
                } else {
                    oooO8 = oooO5.f20614OooO0o;
                }
            }
        } else {
            OooO<K, V> oooO10 = oooO6.f20615OooO0o0;
            while (true) {
                oooO2 = oooO6;
                oooO6 = oooO10;
                if (oooO6 == null) {
                    break;
                } else {
                    oooO10 = oooO6.f20615OooO0o0;
                }
            }
            oooO3 = oooO2;
        }
        OooO0Oo(oooO3, false);
        OooO<K, V> oooO11 = oooO.f20615OooO0o0;
        if (oooO11 != null) {
            i = oooO11.f20619OooOO0O;
            oooO3.f20615OooO0o0 = oooO11;
            oooO11.f20613OooO0Oo = oooO3;
            oooO.f20615OooO0o0 = null;
        } else {
            i = 0;
        }
        OooO<K, V> oooO12 = oooO.f20614OooO0o;
        if (oooO12 != null) {
            i2 = oooO12.f20619OooOO0O;
            oooO3.f20614OooO0o = oooO12;
            oooO12.f20613OooO0Oo = oooO3;
            oooO.f20614OooO0o = null;
        }
        oooO3.f20619OooOO0O = Math.max(i, i2) + 1;
        OooO0o0(oooO, oooO3);
    }

    public final void OooO0o(OooO<K, V> oooO) {
        OooO<K, V> oooO2 = oooO.f20615OooO0o0;
        OooO<K, V> oooO3 = oooO.f20614OooO0o;
        OooO<K, V> oooO4 = oooO3.f20615OooO0o0;
        OooO<K, V> oooO5 = oooO3.f20614OooO0o;
        oooO.f20614OooO0o = oooO4;
        if (oooO4 != null) {
            oooO4.f20613OooO0Oo = oooO;
        }
        OooO0o0(oooO, oooO3);
        oooO3.f20615OooO0o0 = oooO;
        oooO.f20613OooO0Oo = oooO3;
        int iMax = Math.max(oooO2 != null ? oooO2.f20619OooOO0O : 0, oooO4 != null ? oooO4.f20619OooOO0O : 0) + 1;
        oooO.f20619OooOO0O = iMax;
        oooO3.f20619OooOO0O = Math.max(iMax, oooO5 != null ? oooO5.f20619OooOO0O : 0) + 1;
    }

    public final void OooO0o0(OooO<K, V> oooO, OooO<K, V> oooO2) {
        OooO<K, V> oooO3 = oooO.f20613OooO0Oo;
        oooO.f20613OooO0Oo = null;
        if (oooO2 != null) {
            oooO2.f20613OooO0Oo = oooO3;
        }
        if (oooO3 == null) {
            this.f20608OooO0o0 = oooO2;
        } else if (oooO3.f20615OooO0o0 == oooO) {
            oooO3.f20615OooO0o0 = oooO2;
        } else {
            oooO3.f20614OooO0o = oooO2;
        }
    }

    public final void OooO0oO(OooO<K, V> oooO) {
        OooO<K, V> oooO2 = oooO.f20615OooO0o0;
        OooO<K, V> oooO3 = oooO.f20614OooO0o;
        OooO<K, V> oooO4 = oooO2.f20615OooO0o0;
        OooO<K, V> oooO5 = oooO2.f20614OooO0o;
        oooO.f20615OooO0o0 = oooO5;
        if (oooO5 != null) {
            oooO5.f20613OooO0Oo = oooO;
        }
        OooO0o0(oooO, oooO2);
        oooO2.f20614OooO0o = oooO;
        oooO.f20613OooO0Oo = oooO2;
        int iMax = Math.max(oooO3 != null ? oooO3.f20619OooOO0O : 0, oooO5 != null ? oooO5.f20619OooOO0O : 0) + 1;
        oooO.f20619OooOO0O = iMax;
        oooO2.f20619OooOO0O = Math.max(iMax, oooO4 != null ? oooO4.f20619OooOO0O : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20608OooO0o0 = null;
        this.f20607OooO0o = 0;
        this.f20609OooO0oO++;
        OooO<K, V> oooO = this.f20610OooO0oo;
        oooO.f20617OooO0oo = oooO;
        oooO.f20616OooO0oO = oooO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        OooO<K, V> oooOOooO00o;
        if (obj != 0) {
            try {
                oooOOooO00o = OooO00o(obj, false);
            } catch (ClassCastException unused) {
                oooOOooO00o = null;
            }
        } else {
            oooOOooO00o = null;
        }
        return oooOOooO00o != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.OooO0O0 oooO0O0 = this.f20605OooO;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        LinkedTreeMap<K, V>.OooO0O0 oooO0O1 = new OooO0O0();
        this.f20605OooO = oooO0O1;
        return oooO0O1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        OooO<K, V> oooOOooO00o;
        if (obj != 0) {
            try {
                oooOOooO00o = OooO00o(obj, false);
            } catch (ClassCastException unused) {
                oooOOooO00o = null;
            }
        } else {
            oooOOooO00o = null;
        }
        if (oooOOooO00o != null) {
            return oooOOooO00o.f20618OooOO0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        LinkedTreeMap<K, V>.OooO0OO oooO0OO = this.f20611OooOO0;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        LinkedTreeMap<K, V>.OooO0OO oooO0OO2 = new OooO0OO();
        this.f20611OooOO0 = oooO0OO2;
        return oooO0OO2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        OooO<K, V> oooOOooO00o = OooO00o(k, true);
        V v2 = oooOOooO00o.f20618OooOO0;
        oooOOooO00o.f20618OooOO0 = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        OooO<K, V> oooOOooO00o;
        if (obj != 0) {
            try {
                oooOOooO00o = OooO00o(obj, false);
            } catch (ClassCastException unused) {
                oooOOooO00o = null;
            }
        } else {
            oooOOooO00o = null;
        }
        if (oooOOooO00o != null) {
            OooO0Oo(oooOOooO00o, true);
        }
        if (oooOOooO00o != null) {
            return oooOOooO00o.f20618OooOO0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20607OooO0o;
    }

    public static final class OooO<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final K f20612OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO<K, V> f20613OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO<K, V> f20614OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO<K, V> f20615OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public OooO<K, V> f20616OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooO<K, V> f20617OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public V f20618OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f20619OooOO0O;

        public OooO() {
            this.f20612OooO = null;
            this.f20617OooO0oo = this;
            this.f20616OooO0oO = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f20612OooO;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f20618OooOO0;
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
            return this.f20612OooO;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f20618OooOO0;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f20612OooO;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f20618OooOO0;
            return (v != null ? v.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.f20618OooOO0;
            this.f20618OooOO0 = v;
            return v2;
        }

        public final String toString() {
            return this.f20612OooO + "=" + this.f20618OooOO0;
        }

        public OooO(OooO<K, V> oooO, K k, OooO<K, V> oooO2, OooO<K, V> oooO3) {
            this.f20613OooO0Oo = oooO;
            this.f20612OooO = k;
            this.f20619OooOO0O = 1;
            this.f20616OooO0oO = oooO2;
            this.f20617OooO0oo = oooO3;
            oooO3.f20616OooO0oO = this;
            oooO2.f20617OooO0oo = this;
        }
    }
}
