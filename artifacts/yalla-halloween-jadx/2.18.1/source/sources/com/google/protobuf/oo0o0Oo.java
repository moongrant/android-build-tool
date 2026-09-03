package com.google.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class oo0o0Oo<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ int f19405OoooO0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f19406Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f19407Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<oo0o0Oo<K, V>.OooO0O0> f19408Oooo0oO = Collections.emptyList();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Map<K, V> f19409Oooo0oo = Collections.emptyMap();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public volatile oo0o0Oo<K, V>.OooO0o f19410OoooO00;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Iterator<Object> f19411OooO00o = new C0159OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Iterable<Object> f19412OooO0O0 = new OooO0O0();

        /* JADX INFO: renamed from: com.google.protobuf.oo0o0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0159OooO00o implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class OooO0O0 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return OooO00o.f19411OooO00o;
            }
        }
    }

    public class OooO0OO implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f19417Oooo0o = -1;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f19418Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f19419Oooo0oo;

        public OooO0OO() {
        }

        public final Iterator<Map.Entry<K, V>> OooO00o() {
            if (this.f19419Oooo0oo == null) {
                this.f19419Oooo0oo = oo0o0Oo.this.f19409Oooo0oo.entrySet().iterator();
            }
            return this.f19419Oooo0oo;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19417Oooo0o + 1 < oo0o0Oo.this.f19408Oooo0oO.size() || OooO00o().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f19418Oooo0oO = true;
            int i = this.f19417Oooo0o + 1;
            this.f19417Oooo0o = i;
            return i < oo0o0Oo.this.f19408Oooo0oO.size() ? oo0o0Oo.this.f19408Oooo0oO.get(this.f19417Oooo0o) : OooO00o().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f19418Oooo0oO) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f19418Oooo0oO = false;
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            int i = oo0o0Oo.f19405OoooO0;
            oo0o0oo.OooO0O0();
            if (this.f19417Oooo0o >= oo0o0Oo.this.f19408Oooo0oO.size()) {
                OooO00o().remove();
                return;
            }
            oo0o0Oo oo0o0oo2 = oo0o0Oo.this;
            int i2 = this.f19417Oooo0o;
            this.f19417Oooo0o = i2 - 1;
            oo0o0oo2.OooOO0(i2);
        }
    }

    public class OooO0o extends AbstractSet<Map.Entry<K, V>> {
        public OooO0o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            oo0o0Oo.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            oo0o0Oo.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = oo0o0Oo.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new OooO0OO();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            oo0o0Oo.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return oo0o0Oo.this.size();
        }
    }

    public oo0o0Oo(int i) {
        this.f19407Oooo0o = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        OooO0O0();
        int iOooO00o = OooO00o(k);
        if (iOooO00o >= 0) {
            return this.f19408Oooo0oO.get(iOooO00o).setValue(v);
        }
        OooO0O0();
        if (this.f19408Oooo0oO.isEmpty() && !(this.f19408Oooo0oO instanceof ArrayList)) {
            this.f19408Oooo0oO = new ArrayList(this.f19407Oooo0o);
        }
        int i = -(iOooO00o + 1);
        if (i >= this.f19407Oooo0o) {
            return OooO0oO().put(k, v);
        }
        int size = this.f19408Oooo0oO.size();
        int i2 = this.f19407Oooo0o;
        if (size == i2) {
            oo0o0Oo<K, V>.OooO0O0 oooO0O0Remove = this.f19408Oooo0oO.remove(i2 - 1);
            OooO0oO().put(oooO0O0Remove.f19413Oooo0o, oooO0O0Remove.f19414Oooo0oO);
        }
        this.f19408Oooo0oO.add(i, new OooO0O0(k, v));
        return null;
    }

    public final int OooO00o(K k) {
        int size = this.f19408Oooo0oO.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.f19408Oooo0oO.get(size).f19413Oooo0o);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo(this.f19408Oooo0oO.get(i2).f19413Oooo0o);
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final void OooO0O0() {
        if (this.f19406Oooo) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> OooO0OO(int i) {
        return this.f19408Oooo0oO.get(i);
    }

    public final int OooO0Oo() {
        return this.f19408Oooo0oO.size();
    }

    public final Iterable<Map.Entry<K, V>> OooO0o0() {
        return this.f19409Oooo0oo.isEmpty() ? (Iterable<Map.Entry<K, V>>) OooO00o.f19412OooO0O0 : this.f19409Oooo0oo.entrySet();
    }

    public final SortedMap<K, V> OooO0oO() {
        OooO0O0();
        if (this.f19409Oooo0oo.isEmpty() && !(this.f19409Oooo0oo instanceof TreeMap)) {
            this.f19409Oooo0oo = new TreeMap();
        }
        return (SortedMap) this.f19409Oooo0oo;
    }

    public void OooO0oo() {
        if (this.f19406Oooo) {
            return;
        }
        this.f19409Oooo0oo = this.f19409Oooo0oo.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f19409Oooo0oo);
        this.f19406Oooo = true;
    }

    public final V OooOO0(int i) {
        OooO0O0();
        V v = this.f19408Oooo0oO.remove(i).f19414Oooo0oO;
        if (!this.f19409Oooo0oo.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = OooO0oO().entrySet().iterator();
            this.f19408Oooo0oO.add(new OooO0O0(this, it.next()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0O0();
        if (!this.f19408Oooo0oO.isEmpty()) {
            this.f19408Oooo0oO.clear();
        }
        if (this.f19409Oooo0oo.isEmpty()) {
            return;
        }
        this.f19409Oooo0oo.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return OooO00o(comparable) >= 0 || this.f19409Oooo0oo.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f19410OoooO00 == null) {
            this.f19410OoooO00 = new OooO0o();
        }
        return this.f19410OoooO00;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0o0Oo)) {
            return super.equals(obj);
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        int size = size();
        if (size != oo0o0oo.size()) {
            return false;
        }
        int iOooO0Oo = OooO0Oo();
        if (iOooO0Oo != oo0o0oo.OooO0Oo()) {
            return ((AbstractSet) entrySet()).equals(oo0o0oo.entrySet());
        }
        for (int i = 0; i < iOooO0Oo; i++) {
            if (!OooO0OO(i).equals(oo0o0oo.OooO0OO(i))) {
                return false;
            }
        }
        if (iOooO0Oo != size) {
            return this.f19409Oooo0oo.equals(oo0o0oo.f19409Oooo0oo);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iOooO00o = OooO00o(comparable);
        return iOooO00o >= 0 ? this.f19408Oooo0oO.get(iOooO00o).f19414Oooo0oO : this.f19409Oooo0oo.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iOooO0Oo = OooO0Oo();
        int iHashCode = 0;
        for (int i = 0; i < iOooO0Oo; i++) {
            iHashCode += this.f19408Oooo0oO.get(i).hashCode();
        }
        return this.f19409Oooo0oo.size() > 0 ? iHashCode + this.f19409Oooo0oo.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        OooO0O0();
        Comparable comparable = (Comparable) obj;
        int iOooO00o = OooO00o(comparable);
        if (iOooO00o >= 0) {
            return OooOO0(iOooO00o);
        }
        if (this.f19409Oooo0oo.isEmpty()) {
            return null;
        }
        return this.f19409Oooo0oo.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19409Oooo0oo.size() + this.f19408Oooo0oO.size();
    }

    public class OooO0O0 implements Map.Entry<K, V>, Comparable<oo0o0Oo<K, V>.OooO0O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final K f19413Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public V f19414Oooo0oO;

        public OooO0O0(oo0o0Oo oo0o0oo, Map.Entry<K, V> entry) {
            K key = entry.getKey();
            V value = entry.getValue();
            oo0o0Oo.this = oo0o0oo;
            this.f19413Oooo0o = key;
            this.f19414Oooo0oO = value;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f19413Oooo0o.compareTo(((OooO0O0) obj).f19413Oooo0o);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f19413Oooo0o;
            Object key = entry.getKey();
            if (k == null) {
                zEquals = key == null;
            } else {
                zEquals = k.equals(key);
            }
            if (zEquals) {
                V v = this.f19414Oooo0oO;
                Object value = entry.getValue();
                if (v == null) {
                    zEquals2 = value == null;
                } else {
                    zEquals2 = v.equals(value);
                }
                if (zEquals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f19413Oooo0o;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f19414Oooo0oO;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f19413Oooo0o;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f19414Oooo0oO;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            int i = oo0o0Oo.f19405OoooO0;
            oo0o0oo.OooO0O0();
            V v2 = this.f19414Oooo0oO;
            this.f19414Oooo0oO = v;
            return v2;
        }

        public final String toString() {
            return this.f19413Oooo0o + "=" + this.f19414Oooo0oO;
        }

        public OooO0O0(K k, V v) {
            this.f19413Oooo0o = k;
            this.f19414Oooo0oO = v;
        }
    }
}
