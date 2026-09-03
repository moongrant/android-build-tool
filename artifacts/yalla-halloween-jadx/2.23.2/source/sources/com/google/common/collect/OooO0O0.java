package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class OooO0O0<K, V> extends o000<K, V> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public transient Map<K, V> f18813OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    public transient OooO0o f18814OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @RetainedWith
    public transient OooO0O0<V, K> f18815OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @CheckForNull
    public transient OooO f18816OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @CheckForNull
    public transient C0229OooO0O0 f18817OooO0oo;

    public class OooO00o extends o000O000<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Map.Entry<K, V> f18820OooO0Oo;

        public OooO00o(Map.Entry<K, V> entry) {
            this.f18820OooO0Oo = entry;
        }

        @Override // com.google.common.collect.o000Oo0
        public final Object OooO00o() {
            return this.f18820OooO0Oo;
        }

        @Override // com.google.common.collect.o000O000
        public final Map.Entry<K, V> OooO0O0() {
            return this.f18820OooO0Oo;
        }

        @Override // com.google.common.collect.o000O000, java.util.Map.Entry
        public final V setValue(V v) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            oooO0O0.OooO0Oo(v);
            com.google.common.base.o0OoOo0.OooOOO(oooO0O0.entrySet().contains(this), "entry no longer in map");
            if (com.google.common.base.Oooo0.OooO00o(v, getValue())) {
                return v;
            }
            com.google.common.base.o0OoOo0.OooO0o(!oooO0O0.containsValue(v), "value already present: %s", v);
            V value = this.f18820OooO0Oo.setValue(v);
            com.google.common.base.o0OoOo0.OooOOO(com.google.common.base.Oooo0.OooO00o(v, oooO0O0.get(getKey())), "entry no longer in map");
            K key = getKey();
            oooO0O0.f18815OooO0o0.f18813OooO0Oo.remove(value);
            oooO0O0.f18815OooO0o0.f18813OooO0Oo.put(v, key);
            return value;
        }
    }

    public static class OooO0OO<K, V> extends OooO0O0<K, V> {
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f18815OooO0o0 = (OooO0O0) objectInputStream.readObject();
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f18815OooO0o0);
        }

        @Override // com.google.common.collect.OooO0O0, com.google.common.collect.o000, com.google.common.collect.o000Oo0
        public final Object OooO00o() {
            return this.f18813OooO0Oo;
        }

        @Override // com.google.common.collect.OooO0O0
        @ParametricNullness
        public final K OooO0OO(@ParametricNullness K k) {
            return this.f18815OooO0o0.OooO0Oo(k);
        }

        @Override // com.google.common.collect.OooO0O0
        @ParametricNullness
        public final V OooO0Oo(@ParametricNullness V v) {
            return this.f18815OooO0o0.OooO0OO(v);
        }

        @GwtIncompatible
        public Object readResolve() {
            return this.f18815OooO0o0.f18815OooO0o0;
        }

        @Override // com.google.common.collect.OooO0O0, com.google.common.collect.o000, java.util.Map
        public final Collection values() {
            OooO oooO = this.f18816OooO0oO;
            if (oooO != null) {
                return oooO;
            }
            OooO oooO2 = new OooO();
            this.f18816OooO0oO = oooO2;
            return oooO2;
        }
    }

    public class OooO0o extends o000O00O<K> {
        public OooO0o() {
        }

        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O
        /* JADX INFO: renamed from: OooO0Oo */
        public final Set<K> OooO00o() {
            return OooO0O0.this.f18813OooO0Oo.keySet();
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0O0.this.clear();
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new o00OO000(OooO0O0.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return false;
            }
            OooO0O0 oooO0O0 = OooO0O0.this;
            oooO0O0.f18815OooO0o0.f18813OooO0Oo.remove(oooO0O0.f18813OooO0Oo.remove(obj));
            return true;
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            return o0O0O0Oo.OooO0o(this, collection);
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            return OooO0OO(collection);
        }
    }

    public OooO0O0() {
        throw null;
    }

    public OooO0O0(AbstractMap abstractMap, OooO0O0 oooO0O0) {
        this.f18813OooO0Oo = abstractMap;
        this.f18815OooO0o0 = oooO0O0;
    }

    @Override // com.google.common.collect.o000, com.google.common.collect.o000Oo0
    public Object OooO00o() {
        return this.f18813OooO0Oo;
    }

    @Override // com.google.common.collect.o000
    /* JADX INFO: renamed from: OooO0O0 */
    public final Map<K, V> OooO00o() {
        return this.f18813OooO0Oo;
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public K OooO0OO(@ParametricNullness K k) {
        return k;
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public V OooO0Oo(@ParametricNullness V v) {
        return v;
    }

    public final void OooO0o0(EnumMap enumMap, AbstractMap abstractMap) {
        com.google.common.base.o0OoOo0.OooOOO0(this.f18813OooO0Oo == null);
        com.google.common.base.o0OoOo0.OooOOO0(this.f18815OooO0o0 == null);
        com.google.common.base.o0OoOo0.OooO0Oo(enumMap.isEmpty());
        com.google.common.base.o0OoOo0.OooO0Oo(abstractMap.isEmpty());
        com.google.common.base.o0OoOo0.OooO0Oo(enumMap != abstractMap);
        this.f18813OooO0Oo = enumMap;
        this.f18815OooO0o0 = new OooO0OO(abstractMap, this);
    }

    @Override // com.google.common.collect.o000, java.util.Map
    public final void clear() {
        this.f18813OooO0Oo.clear();
        this.f18815OooO0o0.f18813OooO0Oo.clear();
    }

    @Override // com.google.common.collect.o000, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return this.f18815OooO0o0.containsKey(obj);
    }

    @Override // com.google.common.collect.o000, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C0229OooO0O0 c0229OooO0O0 = this.f18817OooO0oo;
        if (c0229OooO0O0 != null) {
            return c0229OooO0O0;
        }
        C0229OooO0O0 c0229OooO0O1 = new C0229OooO0O0();
        this.f18817OooO0oo = c0229OooO0O1;
        return c0229OooO0O1;
    }

    @Override // com.google.common.collect.o000, java.util.Map
    public final Set<K> keySet() {
        OooO0o oooO0o = this.f18814OooO0o;
        if (oooO0o != null) {
            return oooO0o;
        }
        OooO0o oooO0o2 = new OooO0o();
        this.f18814OooO0o = oooO0o2;
        return oooO0o2;
    }

    @Override // com.google.common.collect.o000, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        OooO0OO(k);
        OooO0Oo(v);
        boolean zContainsKey = containsKey(k);
        if (zContainsKey && com.google.common.base.Oooo0.OooO00o(v, get(k))) {
            return v;
        }
        com.google.common.base.o0OoOo0.OooO0o(!containsValue(v), "value already present: %s", v);
        V vPut = this.f18813OooO0Oo.put(k, v);
        if (zContainsKey) {
            this.f18815OooO0o0.f18813OooO0Oo.remove(vPut);
        }
        this.f18815OooO0o0.f18813OooO0Oo.put(v, k);
        return vPut;
    }

    @Override // com.google.common.collect.o000, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.o000, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        V vRemove = this.f18813OooO0Oo.remove(obj);
        this.f18815OooO0o0.f18813OooO0Oo.remove(vRemove);
        return vRemove;
    }

    @Override // com.google.common.collect.o000, java.util.Map
    public Collection values() {
        OooO oooO = this.f18816OooO0oO;
        if (oooO != null) {
            return oooO;
        }
        OooO oooO2 = new OooO();
        this.f18816OooO0oO = oooO2;
        return oooO2;
    }

    public class OooO extends o000O00O<V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Set<V> f18818OooO0Oo;

        public OooO() {
            this.f18818OooO0Oo = OooO0O0.this.f18815OooO0o0.keySet();
        }

        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O, com.google.common.collect.o000Oo0
        public final Object OooO00o() {
            return this.f18818OooO0Oo;
        }

        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O
        /* JADX INFO: renamed from: OooO0O0 */
        public final Collection OooO00o() {
            return this.f18818OooO0Oo;
        }

        @Override // com.google.common.collect.o000O00O
        /* JADX INFO: renamed from: OooO0Oo */
        public final Set<V> OooO00o() {
            return this.f18818OooO0Oo;
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<V> iterator() {
            return new o00OO00O(OooO0O0.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection
        public final Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // com.google.common.collect.o000Oo0
        public final String toString() {
            int size = size();
            oo000o.OooO0O0(size, "size");
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
            sb.append('[');
            Iterator<V> it = iterator();
            boolean z = true;
            while (true) {
                oo0oO0 oo0oo0 = (oo0oO0) it;
                if (!oo0oo0.hasNext()) {
                    sb.append(']');
                    return sb.toString();
                }
                Object next = oo0oo0.next();
                if (!z) {
                    sb.append(", ");
                }
                if (next == this) {
                    sb.append("(this Collection)");
                } else {
                    sb.append(next);
                }
                z = false;
            }
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o0.OooO0O0(this, tArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C0229OooO0O0 extends o000O00O<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Set<Map.Entry<K, V>> f18822OooO0Oo;

        public C0229OooO0O0() {
            this.f18822OooO0Oo = OooO0O0.this.f18813OooO0Oo.entrySet();
        }

        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O, com.google.common.collect.o000Oo0
        public final Object OooO00o() {
            return this.f18822OooO0Oo;
        }

        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O
        /* JADX INFO: renamed from: OooO0O0 */
        public final Collection OooO00o() {
            return this.f18822OooO0Oo;
        }

        @Override // com.google.common.collect.o000O00O
        /* JADX INFO: renamed from: OooO0Oo */
        public final Set<Map.Entry<K, V>> OooO00o() {
            return this.f18822OooO0Oo;
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0O0.this.clear();
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            return this.f18822OooO0Oo.contains(new o00OO0OO(entry));
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return o00oO0o.OooO00o(this, collection);
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            OooO0O0 oooO0O0 = OooO0O0.this;
            return new com.google.common.collect.OooO00o(oooO0O0, oooO0O0.f18813OooO0Oo.entrySet().iterator());
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            Set<Map.Entry<K, V>> set = this.f18822OooO0Oo;
            if (!set.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            OooO0O0.this.f18815OooO0o0.f18813OooO0Oo.remove(entry.getValue());
            set.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            return o0O0O0Oo.OooO0o(this, collection);
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            return OooO0OO(collection);
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection
        public final Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o0.OooO0O0(this, tArr);
        }
    }
}
