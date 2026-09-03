package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o00OO00O {

    public static class OooO<K, V> extends OooO0o<K, V> implements SortedSet<K> {
        public OooO(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // com.google.common.collect.o00OO00O.OooO0o
        public final Map OooO0o0() {
            return (SortedMap) this.f18539Oooo0o;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return ((SortedMap) this.f18539Oooo0o).comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return (K) ((SortedMap) this.f18539Oooo0o).firstKey();
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> headSet(K k) {
            return new OooO(((SortedMap) this.f18539Oooo0o).headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return (K) ((SortedMap) this.f18539Oooo0o).lastKey();
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> subSet(K k, K k2) {
            return new OooO(((SortedMap) this.f18539Oooo0o).subMap(k, k2));
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> tailSet(K k) {
            return new OooO(((SortedMap) this.f18539Oooo0o).tailMap(k));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO00o implements o0OOOO0o.OooO<Map.Entry<?, ?>, Object> {
        private static final /* synthetic */ OooO00o[] $VALUES;
        public static final OooO00o KEY;
        public static final OooO00o VALUE;

        /* JADX INFO: renamed from: com.google.common.collect.o00OO00O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static enum C0123OooO00o extends OooO00o {
            public C0123OooO00o() {
                super("KEY", 0, null);
            }

            @Override // o0OOOO0o.OooO
            @NullableDecl
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        public static enum OooO0O0 extends OooO00o {
            public OooO0O0() {
                super("VALUE", 1, null);
            }

            @Override // o0OOOO0o.OooO
            @NullableDecl
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            C0123OooO00o c0123OooO00o = new C0123OooO00o();
            KEY = c0123OooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            VALUE = oooO0O0;
            $VALUES = new OooO00o[]{c0123OooO00o, oooO0O0};
        }

        public OooO00o(String str, int i, o00O0OOO o00o0ooo2) {
            super(str, i);
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) $VALUES.clone();
        }
    }

    public static abstract class OooO0O0<K, V> extends o0O00O0o.OooO00o<Map.Entry<K, V>> {
        public abstract Map<K, V> OooO0o0();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0o0().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objOooO0Oo = o00OO00O.OooO0Oo(OooO0o0(), key);
            if (o0OOOO0o.OooOOO.OooO00o(objOooO0Oo, entry.getValue())) {
                return objOooO0Oo != null || OooO0o0().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return OooO0o0().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return OooO0o0().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.o0O00O0o.OooO00o, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return o0O00O0o.OooO0Oo(this, collection);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean zRemove = false;
                while (it.hasNext()) {
                    zRemove |= remove(it.next());
                }
                return zRemove;
            }
        }

        @Override // com.google.common.collect.o0O00O0o.OooO00o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetOooO0OO = o0O00O0o.OooO0OO(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSetOooO0OO.add(((Map.Entry) obj).getKey());
                    }
                }
                return OooO0o0().keySet().retainAll(hashSetOooO0OO);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooO0o0().size();
        }
    }

    public static abstract class OooO0OO<K, V> extends AbstractMap<K, V> {

        public class OooO00o extends OooO0O0<K, V> {
            public OooO00o() {
            }

            @Override // com.google.common.collect.o00OO00O.OooO0O0
            public final Map<K, V> OooO0o0() {
                return OooO0OO.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return OooO0OO.this.OooO00o();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> OooO00o();

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            return new OooO00o();
        }
    }

    public static class OooO0o<K, V> extends o0O00O0o.OooO00o<K> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Weak
        public final Map<K, V> f18539Oooo0o;

        public OooO0o(Map<K, V> map) {
            Objects.requireNonNull(map);
            this.f18539Oooo0o = map;
        }

        public Map<K, V> OooO0o0() {
            return this.f18539Oooo0o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            OooO0o0().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return OooO0o0().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return OooO0o0().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new o00O0OOO(OooO0o0().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            OooO0o0().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooO0o0().size();
        }
    }

    public static class OooOO0<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Weak
        public final Map<K, V> f18540Oooo0o;

        public OooOO0(Map<K, V> map) {
            Objects.requireNonNull(map);
            this.f18540Oooo0o = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f18540Oooo0o.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@NullableDecl Object obj) {
            return this.f18540Oooo0o.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f18540Oooo0o.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new oo0oOO0(this.f18540Oooo0o.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f18540Oooo0o.entrySet()) {
                    if (o0OOOO0o.OooOOO.OooO00o(obj, entry.getValue())) {
                        this.f18540Oooo0o.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f18540Oooo0o.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f18540Oooo0o.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f18540Oooo0o.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f18540Oooo0o.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f18540Oooo0o.size();
        }
    }

    @GwtCompatible
    public static abstract class OooOO0O<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> f18541Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @MonotonicNonNullDecl
        public transient Set<K> f18542Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @MonotonicNonNullDecl
        public transient Collection<V> f18543Oooo0oo;

        public abstract Set<Map.Entry<K, V>> OooO00o();

        public Set<K> OooO0O0() {
            return new OooO0o(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f18541Oooo0o;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setOooO00o = OooO00o();
            this.f18541Oooo0o = setOooO00o;
            return setOooO00o;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            Set<K> set = this.f18542Oooo0oO;
            if (set != null) {
                return set;
            }
            Set<K> setOooO0O0 = OooO0O0();
            this.f18542Oooo0oO = setOooO0O0;
            return setOooO0O0;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            Collection<V> collection = this.f18543Oooo0oo;
            if (collection != null) {
                return collection;
            }
            OooOO0 oooOO1 = new OooOO0(this);
            this.f18543Oooo0oo = oooOO1;
            return oooOO1;
        }
    }

    public static <E> ImmutableMap<E, Integer> OooO00o(Collection<E> collection) {
        Object[] objArrCopyOf = new Object[collection.size() * 2];
        int i = 0;
        int i2 = 0;
        for (E e : collection) {
            int i3 = i + 1;
            Integer numValueOf = Integer.valueOf(i);
            int i4 = (i2 + 1) * 2;
            if (i4 > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i4));
            }
            oo000o.OooO00o(e, numValueOf);
            objArrCopyOf[i2 * 2] = e;
            objArrCopyOf[(i2 * 2) + 1] = numValueOf;
            i2++;
            i = i3;
        }
        return o0O00000.OooOO0o(i2, objArrCopyOf);
    }

    @NullableDecl
    public static <K> K OooO0O0(@NullableDecl Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static boolean OooO0OO(Map<?, ?> map, Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V OooO0Oo(Map<?, V> map, @NullableDecl Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
