package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class OooO0O0<K, V> extends o0000OO0<K, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<V> f18297Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Map<K, V> f18298Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @RetainedWith
    @MonotonicNonNullDecl
    public transient OooO0O0<V, K> f18299Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<K> f18300Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> f18301OoooO00;

    public class OooO extends o000O00<V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Set<V> f18302Oooo0o;

        public OooO() {
            this.f18302Oooo0o = OooO0O0.this.f18299Oooo0oO.keySet();
        }

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO, com.google.common.collect.o000O0o
        public final Object OooO00o() {
            return this.f18302Oooo0o;
        }

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO
        /* JADX INFO: renamed from: OooO0O0 */
        public final Collection OooO00o() {
            return this.f18302Oooo0o;
        }

        @Override // com.google.common.collect.o000O00
        /* JADX INFO: renamed from: OooO0oo */
        public final Set<V> OooO00o() {
            return this.f18302Oooo0o;
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<V> iterator() {
            return new oo0oOO0(OooO0O0.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o00OOOO0.OooO0o0(this, tArr);
        }

        @Override // com.google.common.collect.o000O0o
        public final String toString() {
            StringBuilder sbOooO00o = o00oO0o.OooO00o(size());
            sbOooO00o.append('[');
            boolean z = true;
            for (V v : this) {
                if (!z) {
                    sbOooO00o.append(", ");
                }
                z = false;
                if (v == this) {
                    sbOooO00o.append("(this Collection)");
                } else {
                    sbOooO00o.append(v);
                }
            }
            sbOooO00o.append(']');
            return sbOooO00o.toString();
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return OooO0oO();
        }
    }

    public class OooO00o extends o000<K, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Map.Entry<K, V> f18304Oooo0o;

        public OooO00o(Map.Entry<K, V> entry) {
            this.f18304Oooo0o = entry;
        }

        @Override // com.google.common.collect.o000O0o
        public final Object OooO00o() {
            return this.f18304Oooo0o;
        }

        @Override // com.google.common.collect.o000
        public final Map.Entry<K, V> OooO0O0() {
            return this.f18304Oooo0o;
        }

        @Override // com.google.common.collect.o000, java.util.Map.Entry
        public final V setValue(V v) {
            OooO0O0.this.OooO0o0(v);
            o0OOOO0o.OooOOOO.OooOOO(OooO0O0.this.entrySet().contains(this), "entry no longer in map");
            if (o0OOOO0o.OooOOO.OooO00o(v, getValue())) {
                return v;
            }
            o0OOOO0o.OooOOOO.OooO0oO(!OooO0O0.this.containsValue(v), "value already present: %s", v);
            V value = this.f18304Oooo0o.setValue(v);
            o0OOOO0o.OooOOOO.OooOOO(o0OOOO0o.OooOOO.OooO00o(v, OooO0O0.this.get(getKey())), "entry no longer in map");
            OooO0O0 oooO0O0 = OooO0O0.this;
            K key = getKey();
            oooO0O0.OooO0oO(value);
            oooO0O0.f18299Oooo0oO.f18298Oooo0o.put(v, key);
            return value;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C0120OooO0O0 extends o000O00<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Set<Map.Entry<K, V>> f18306Oooo0o;

        public C0120OooO0O0() {
            this.f18306Oooo0o = OooO0O0.this.f18298Oooo0o.entrySet();
        }

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO, com.google.common.collect.o000O0o
        public final Object OooO00o() {
            return this.f18306Oooo0o;
        }

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO
        /* JADX INFO: renamed from: OooO0O0 */
        public final Collection OooO00o() {
            return this.f18306Oooo0o;
        }

        @Override // com.google.common.collect.o000O00
        /* JADX INFO: renamed from: OooO0oo */
        public final Set<Map.Entry<K, V>> OooO00o() {
            return this.f18306Oooo0o;
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0O0.this.clear();
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection
        public final boolean contains(Object obj) {
            Set<Map.Entry<K, V>> set = this.f18306Oooo0o;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Objects.requireNonNull(entry);
            return set.contains(new o00OO000(entry));
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return OooO0OO(collection);
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            OooO0O0 oooO0O0 = OooO0O0.this;
            return new com.google.common.collect.OooO00o(oooO0O0, oooO0O0.f18298Oooo0o.entrySet().iterator());
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection
        public final boolean remove(Object obj) {
            if (!this.f18306Oooo0o.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            OooO0O0.this.f18299Oooo0oO.f18298Oooo0o.remove(entry.getValue());
            this.f18306Oooo0o.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            return o0O00O0o.OooO0Oo(this, collection);
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            return OooO0o0(collection);
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o00OOOO0.OooO0o0(this, tArr);
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return OooO0oO();
        }
    }

    public static class OooO0OO<K, V> extends OooO0O0<K, V> {
        public OooO0OO(Map<K, V> map, OooO0O0<V, K> oooO0O0) {
            super(map, oooO0O0, null);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f18299Oooo0oO = (OooO0O0) objectInputStream.readObject();
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f18299Oooo0oO);
        }

        @Override // com.google.common.collect.OooO0O0, com.google.common.collect.o0000OO0, com.google.common.collect.o000O0o
        public final Object OooO00o() {
            return this.f18298Oooo0o;
        }

        @Override // com.google.common.collect.OooO0O0
        public final K OooO0OO(K k) {
            return this.f18299Oooo0oO.OooO0o0(k);
        }

        @Override // com.google.common.collect.OooO0O0
        public final V OooO0o0(V v) {
            return this.f18299Oooo0oO.OooO0OO(v);
        }

        @GwtIncompatible
        public Object readResolve() {
            return this.f18299Oooo0oO.f18299Oooo0oO;
        }

        @Override // com.google.common.collect.OooO0O0, com.google.common.collect.o0000OO0, java.util.Map
        public final Collection values() {
            Set<V> set = this.f18297Oooo;
            if (set != null) {
                return set;
            }
            OooO oooO = new OooO();
            this.f18297Oooo = oooO;
            return oooO;
        }
    }

    public class OooO0o extends o000O00<K> {
        public OooO0o() {
        }

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO
        /* JADX INFO: renamed from: OooO0oo */
        public final Set<K> OooO00o() {
            return OooO0O0.this.f18298Oooo0o.keySet();
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0O0.this.clear();
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new o00O0OOO(OooO0O0.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection
        public final boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            OooO0O0 oooO0O0 = OooO0O0.this;
            oooO0O0.OooO0oO(oooO0O0.f18298Oooo0o.remove(obj));
            return true;
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            return o0O00O0o.OooO0Oo(this, collection);
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            return OooO0o0(collection);
        }
    }

    public OooO0O0(Map map, OooO0O0 oooO0O0, com.google.common.collect.OooO00o oooO00o) {
        this.f18298Oooo0o = map;
        this.f18299Oooo0oO = oooO0O0;
    }

    @Override // com.google.common.collect.o0000OO0, com.google.common.collect.o000O0o
    public Object OooO00o() {
        return this.f18298Oooo0o;
    }

    @Override // com.google.common.collect.o0000OO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final Map<K, V> OooO00o() {
        return this.f18298Oooo0o;
    }

    @CanIgnoreReturnValue
    public K OooO0OO(@NullableDecl K k) {
        return k;
    }

    @CanIgnoreReturnValue
    public V OooO0o0(@NullableDecl V v) {
        return v;
    }

    public final void OooO0oO(V v) {
        this.f18299Oooo0oO.f18298Oooo0o.remove(v);
    }

    public final void OooO0oo(Map<K, V> map, Map<V, K> map2) {
        o0OOOO0o.OooOOOO.OooOOO0(this.f18298Oooo0o == null);
        o0OOOO0o.OooOOOO.OooOOO0(this.f18299Oooo0oO == null);
        o0OOOO0o.OooOOOO.OooO0O0(map.isEmpty());
        o0OOOO0o.OooOOOO.OooO0O0(map2.isEmpty());
        o0OOOO0o.OooOOOO.OooO0O0(map != map2);
        this.f18298Oooo0o = map;
        this.f18299Oooo0oO = new OooO0OO(map2, this);
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    public final void clear() {
        this.f18298Oooo0o.clear();
        this.f18299Oooo0oO.f18298Oooo0o.clear();
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        return this.f18299Oooo0oO.containsKey(obj);
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f18301OoooO00;
        if (set != null) {
            return set;
        }
        C0120OooO0O0 c0120OooO0O0 = new C0120OooO0O0();
        this.f18301OoooO00 = c0120OooO0O0;
        return c0120OooO0O0;
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f18300Oooo0oo;
        if (set != null) {
            return set;
        }
        OooO0o oooO0o = new OooO0o();
        this.f18300Oooo0oo = oooO0o;
        return oooO0o;
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        OooO0OO(k);
        OooO0o0(v);
        boolean zContainsKey = containsKey(k);
        if (zContainsKey && o0OOOO0o.OooOOO.OooO00o(v, get(k))) {
            return v;
        }
        o0OOOO0o.OooOOOO.OooO0oO(!containsValue(v), "value already present: %s", v);
        V vPut = this.f18298Oooo0o.put(k, v);
        if (zContainsKey) {
            OooO0oO(vPut);
        }
        this.f18299Oooo0oO.f18298Oooo0o.put(v, k);
        return vPut;
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    @CanIgnoreReturnValue
    public final V remove(@NullableDecl Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        V vRemove = this.f18298Oooo0o.remove(obj);
        OooO0oO(vRemove);
        return vRemove;
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    public Collection values() {
        Set<V> set = this.f18297Oooo;
        if (set != null) {
            return set;
        }
        OooO oooO = new OooO();
        this.f18297Oooo = oooO;
        return oooO;
    }
}
