package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class OooOO0<K, V> extends com.google.common.collect.OooOOO<K, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient Map<K, Collection<V>> f18314Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public transient int f18315OoooO00;

    public class OooO extends OooOO0<K, V>.OooOOO0 implements NavigableMap<K, Collection<V>> {
        public OooO(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final Map.Entry<K, Collection<V>> OooO(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionOooO = OooOO0.this.OooO();
            collectionOooO.addAll(next.getValue());
            it.remove();
            return new o000OO0O(next.getKey(), OooOO0.this.OooOOO(collectionOooO));
        }

        @Override // com.google.common.collect.OooOO0.OooOOO0, com.google.common.collect.o00OO00O.OooOO0O
        public final Set OooO0O0() {
            return new C0122OooOO0(OooO0oO());
        }

        @Override // com.google.common.collect.OooOO0.OooOOO0
        /* JADX INFO: renamed from: OooO0Oo */
        public final SortedSet OooO0O0() {
            return new C0122OooOO0(OooO0oO());
        }

        @Override // com.google.common.collect.OooOO0.OooOOO0, com.google.common.collect.OooOO0.OooO0O0, com.google.common.collect.o00OO00O.OooOO0O, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final NavigableSet<K> keySet() {
            SortedSet<K> sortedSetOooO0O0 = this.f18334OoooO0;
            if (sortedSetOooO0O0 == null) {
                sortedSetOooO0O0 = OooO0O0();
                this.f18334OoooO0 = sortedSetOooO0O0;
            }
            return (NavigableSet) sortedSetOooO0O0;
        }

        @Override // com.google.common.collect.OooOO0.OooOOO0
        /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> OooO0oO() {
            return (NavigableMap) ((SortedMap) this.f18317Oooo);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = OooO0oO().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return OooO0OO(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return OooO0oO().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((OooO) descendingMap()).OooO0o0();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new OooO(OooO0oO().descendingMap());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = OooO0oO().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return OooO0OO(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = OooO0oO().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return OooO0OO(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return OooO0oO().floorKey(k);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO0, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = OooO0oO().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return OooO0OO(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return OooO0oO().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = OooO0oO().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return OooO0OO(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = OooO0oO().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return OooO0OO(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return OooO0oO().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return OooO0o0();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return OooO(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return OooO(((o00OO00O.OooOO0O) descendingMap()).entrySet().iterator());
        }

        @Override // com.google.common.collect.OooOO0.OooOOO0, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO0, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new OooO(OooO0oO().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new OooO(OooO0oO().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new OooO(OooO0oO().tailMap(k, z));
        }
    }

    public class OooO00o extends OooOO0<K, V>.OooO0OO<Map.Entry<K, V>> {
        public OooO00o(OooOO0 oooOO1) {
            super();
        }
    }

    public class OooO0O0 extends o00OO00O.OooOO0O<K, Collection<V>> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f18317Oooo;

        public class OooO00o extends o00OO00O.OooO0O0<K, Collection<V>> {
            public OooO00o() {
            }

            @Override // com.google.common.collect.o00OO00O.OooO0O0
            public final Map<K, Collection<V>> OooO0o0() {
                return OooO0O0.this;
            }

            @Override // com.google.common.collect.o00OO00O.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return o00oO0o.OooO0O0(OooO0O0.this.f18317Oooo.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return OooO0O0.this.new C0121OooO0O0();
            }

            @Override // com.google.common.collect.o00OO00O.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collectionRemove;
                if (!contains(obj)) {
                    return false;
                }
                OooOO0 oooOO1 = OooOO0.this;
                Object key = ((Map.Entry) obj).getKey();
                Map<K, Collection<V>> map = oooOO1.f18314Oooo;
                Objects.requireNonNull(map);
                try {
                    collectionRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collectionRemove = null;
                }
                Collection<V> collection = collectionRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                oooOO1.f18315OoooO00 -= size;
                return true;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.OooOO0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public class C0121OooO0O0 implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f18320Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            @NullableDecl
            public Collection<V> f18321Oooo0oO;

            public C0121OooO0O0() {
                this.f18320Oooo0o = OooO0O0.this.f18317Oooo.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f18320Oooo0o.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f18320Oooo0o.next();
                this.f18321Oooo0oO = next.getValue();
                return OooO0O0.this.OooO0OO(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                oo000o.OooO0Oo(this.f18321Oooo0oO != null);
                this.f18320Oooo0o.remove();
                OooOO0.this.f18315OoooO00 -= this.f18321Oooo0oO.size();
                this.f18321Oooo0oO.clear();
                this.f18321Oooo0oO = null;
            }
        }

        public OooO0O0(Map<K, Collection<V>> map) {
            this.f18317Oooo = map;
        }

        @Override // com.google.common.collect.o00OO00O.OooOO0O
        public final Set<Map.Entry<K, Collection<V>>> OooO00o() {
            return new OooO00o();
        }

        public final Map.Entry<K, Collection<V>> OooO0OO(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return new o000OO0O(key, OooOO0.this.OooOOOO(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            Map<K, Collection<V>> map = this.f18317Oooo;
            OooOO0 oooOO1 = OooOO0.this;
            if (map == oooOO1.f18314Oooo) {
                oooOO1.clear();
            } else {
                o00O0.OooO0O0(new C0121OooO0O0());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return o00OO00O.OooO0OO(this.f18317Oooo, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f18317Oooo.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection = (Collection) o00OO00O.OooO0Oo(this.f18317Oooo, obj);
            if (collection == null) {
                return null;
            }
            return OooOO0.this.OooOOOO(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f18317Oooo.hashCode();
        }

        @Override // com.google.common.collect.o00OO00O.OooOO0O, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return OooOO0.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> collectionRemove = this.f18317Oooo.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionOooO = OooOO0.this.OooO();
            collectionOooO.addAll(collectionRemove);
            OooOO0.this.f18315OoooO00 -= collectionRemove.size();
            collectionRemove.clear();
            return collectionOooO;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f18317Oooo.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f18317Oooo.toString();
        }
    }

    public abstract class OooO0OO<T> implements Iterator<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f18324Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NullableDecl
        public K f18325Oooo0oO = null;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Collection<V> f18326Oooo0oo = null;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Iterator<V> f18323Oooo = o00O0.OooO0O0.INSTANCE;

        public OooO0OO() {
            this.f18324Oooo0o = OooOO0.this.f18314Oooo.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18324Oooo0o.hasNext() || this.f18323Oooo.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f18323Oooo.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f18324Oooo0o.next();
                this.f18325Oooo0oO = next.getKey();
                Collection<V> value = next.getValue();
                this.f18326Oooo0oo = value;
                this.f18323Oooo = value.iterator();
            }
            return (T) new o000OO0O(this.f18325Oooo0oO, this.f18323Oooo.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f18323Oooo.remove();
            if (this.f18326Oooo0oo.isEmpty()) {
                this.f18324Oooo0o.remove();
            }
            OooOO0.OooO0oo(OooOO0.this);
        }
    }

    public class OooO0o extends o00OO00O.OooO0o<K, Collection<V>> {

        public class OooO00o implements Iterator<K> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            @NullableDecl
            public Map.Entry<K, Collection<V>> f18329Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ Iterator f18330Oooo0oO;

            public OooO00o(Iterator it) {
                this.f18330Oooo0oO = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f18330Oooo0oO.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f18330Oooo0oO.next();
                this.f18329Oooo0o = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                oo000o.OooO0Oo(this.f18329Oooo0o != null);
                Collection<V> value = this.f18329Oooo0o.getValue();
                this.f18330Oooo0oO.remove();
                OooOO0.this.f18315OoooO00 -= value.size();
                value.clear();
                this.f18329Oooo0o = null;
            }
        }

        public OooO0o(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.o00OO00O.OooO0o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o00O0.OooO0O0(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f18539Oooo0o.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f18539Oooo0o.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f18539Oooo0o.keySet().hashCode();
        }

        @Override // com.google.common.collect.o00OO00O.OooO0o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new OooO00o(this.f18539Oooo0o.entrySet().iterator());
        }

        @Override // com.google.common.collect.o00OO00O.OooO0o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.f18539Oooo0o.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                OooOO0.this.f18315OoooO00 -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.OooOO0$OooOO0, reason: collision with other inner class name */
    public class C0122OooOO0 extends OooOO0<K, V>.OooOOO implements NavigableSet<K> {
        public C0122OooOO0(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO
        /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> OooO0oO() {
            return (NavigableMap) ((SortedMap) this.f18539Oooo0o);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return OooO0oO().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((OooO0o) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C0122OooOO0(OooO0oO().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return OooO0oO().floorKey(k);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return OooO0oO().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return OooO0oO().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            return (K) o00O0.OooO0Oo(iterator());
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            return (K) o00O0.OooO0Oo(descendingIterator());
        }

        @Override // com.google.common.collect.OooOO0.OooOOO, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new C0122OooOO0(OooO0oO().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C0122OooOO0(OooO0oO().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new C0122OooOO0(OooO0oO().tailMap(k, z));
        }
    }

    public class OooOO0O extends OooOO0<K, V>.OooOo00 implements RandomAccess {
        public OooOO0O(@NullableDecl OooOO0 oooOO1, K k, @NullableDecl List<V> list, OooOO0<K, V>.OooOOOO oooOOOO) {
            super(k, list, oooOOOO);
        }
    }

    public class OooOOO extends OooOO0<K, V>.OooO0o implements SortedSet<K> {
        public OooOOO(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> OooO0oO() {
            return (SortedMap) this.f18539Oooo0o;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return OooO0oO().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return OooO0oO().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new OooOOO(OooO0oO().headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return OooO0oO().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new OooOOO(OooO0oO().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new OooOOO(OooO0oO().tailMap(k));
        }
    }

    public class OooOOO0 extends OooOO0<K, V>.OooO0O0 implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @MonotonicNonNullDecl
        public SortedSet<K> f18334OoooO0;

        public OooOOO0(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // com.google.common.collect.o00OO00O.OooOO0O
        /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> OooO0O0() {
            return new OooOOO(OooO0oO());
        }

        @Override // com.google.common.collect.OooOO0.OooO0O0, com.google.common.collect.o00OO00O.OooOO0O, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: OooO0o0 */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f18334OoooO0;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetOooO0O0 = OooO0O0();
            this.f18334OoooO0 = sortedSetOooO0O0;
            return sortedSetOooO0O0;
        }

        public SortedMap<K, Collection<V>> OooO0oO() {
            return (SortedMap) this.f18317Oooo;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return OooO0oO().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return OooO0oO().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new OooOOO0(OooO0oO().headMap(k));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return OooO0oO().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new OooOOO0(OooO0oO().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new OooOOO0(OooO0oO().tailMap(k));
        }
    }

    public class OooOo extends OooOO0<K, V>.Oooo0 implements NavigableSet<V> {
        public OooOo(K k, @NullableDecl NavigableSet<V> navigableSet, OooOO0<K, V>.OooOOOO oooOOOO) {
            super(k, navigableSet, oooOOOO);
        }

        @Override // com.google.common.collect.OooOO0.Oooo0
        /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
        public final NavigableSet<V> OooO0o0() {
            return (NavigableSet) ((SortedSet) this.f18338Oooo0oO);
        }

        public final NavigableSet<V> OooO0oo(NavigableSet<V> navigableSet) {
            OooOO0 oooOO1 = OooOO0.this;
            K k = this.f18337Oooo0o;
            OooOO0<K, V>.OooOOOO oooOOOO = this.f18339Oooo0oo;
            if (oooOOOO == null) {
                oooOOOO = this;
            }
            return new OooOo(k, navigableSet, oooOOOO);
        }

        @Override // java.util.NavigableSet
        public final V ceiling(V v) {
            return OooO0o0().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public final Iterator<V> descendingIterator() {
            return new OooOOOO.OooO00o(OooO0o0().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> descendingSet() {
            return OooO0oo(OooO0o0().descendingSet());
        }

        @Override // java.util.NavigableSet
        public final V floor(V v) {
            return OooO0o0().floor(v);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> headSet(V v, boolean z) {
            return OooO0oo(OooO0o0().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        public final V higher(V v) {
            return OooO0o0().higher(v);
        }

        @Override // java.util.NavigableSet
        public final V lower(V v) {
            return OooO0o0().lower(v);
        }

        @Override // java.util.NavigableSet
        public final V pollFirst() {
            return (V) o00O0.OooO0Oo(iterator());
        }

        @Override // java.util.NavigableSet
        public final V pollLast() {
            return (V) o00O0.OooO0Oo(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return OooO0oo(OooO0o0().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> tailSet(V v, boolean z) {
            return OooO0oo(OooO0o0().tailSet(v, z));
        }
    }

    public class Oooo0 extends OooOO0<K, V>.OooOOOO implements SortedSet<V> {
        public Oooo0(K k, @NullableDecl SortedSet<V> sortedSet, OooOO0<K, V>.OooOOOO oooOOOO) {
            super(k, sortedSet, oooOOOO);
        }

        public SortedSet<V> OooO0o0() {
            return (SortedSet) this.f18338Oooo0oO;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super V> comparator() {
            return OooO0o0().comparator();
        }

        @Override // java.util.SortedSet
        public final V first() {
            OooO0O0();
            return OooO0o0().first();
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> headSet(V v) {
            OooO0O0();
            OooOO0 oooOO1 = OooOO0.this;
            K k = this.f18337Oooo0o;
            SortedSet<V> sortedSetHeadSet = OooO0o0().headSet(v);
            OooOO0<K, V>.OooOOOO oooOOOO = this.f18339Oooo0oo;
            if (oooOOOO == null) {
                oooOOOO = this;
            }
            return new Oooo0(k, sortedSetHeadSet, oooOOOO);
        }

        @Override // java.util.SortedSet
        public final V last() {
            OooO0O0();
            return OooO0o0().last();
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> subSet(V v, V v2) {
            OooO0O0();
            OooOO0 oooOO1 = OooOO0.this;
            K k = this.f18337Oooo0o;
            SortedSet<V> sortedSetSubSet = OooO0o0().subSet(v, v2);
            OooOO0<K, V>.OooOOOO oooOOOO = this.f18339Oooo0oo;
            if (oooOOOO == null) {
                oooOOOO = this;
            }
            return new Oooo0(k, sortedSetSubSet, oooOOOO);
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> tailSet(V v) {
            OooO0O0();
            OooOO0 oooOO1 = OooOO0.this;
            K k = this.f18337Oooo0o;
            SortedSet<V> sortedSetTailSet = OooO0o0().tailSet(v);
            OooOO0<K, V>.OooOOOO oooOOOO = this.f18339Oooo0oo;
            if (oooOOOO == null) {
                oooOOOO = this;
            }
            return new Oooo0(k, sortedSetTailSet, oooOOOO);
        }
    }

    public class Oooo000 extends OooOO0<K, V>.OooOOOO implements Set<V> {
        public Oooo000(K k, Set<V> set) {
            super(k, set, null);
        }

        @Override // com.google.common.collect.OooOO0.OooOOOO, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zOooO0Oo = o0O00O0o.OooO0Oo((Set) this.f18338Oooo0oO, collection);
            if (zOooO0Oo) {
                int size2 = this.f18338Oooo0oO.size();
                OooOO0 oooOO1 = OooOO0.this;
                oooOO1.f18315OoooO00 = (size2 - size) + oooOO1.f18315OoooO00;
                OooO0OO();
            }
            return zOooO0Oo;
        }
    }

    public OooOO0(Map<K, Collection<V>> map) {
        o0OOOO0o.OooOOOO.OooO0O0(map.isEmpty());
        this.f18314Oooo = map;
    }

    public static /* synthetic */ int OooO0oO(OooOO0 oooOO1) {
        int i = oooOO1.f18315OoooO00;
        oooOO1.f18315OoooO00 = i + 1;
        return i;
    }

    public static /* synthetic */ int OooO0oo(OooOO0 oooOO1) {
        int i = oooOO1.f18315OoooO00;
        oooOO1.f18315OoooO00 = i - 1;
        return i;
    }

    public abstract Collection<V> OooO();

    @Override // com.google.common.collect.o00OO0O0
    public Collection<V> OooO00o(@NullableDecl Object obj) {
        Collection<V> collectionRemove = this.f18314Oooo.remove(obj);
        if (collectionRemove == null) {
            return OooOO0o();
        }
        Collection collectionOooO = OooO();
        collectionOooO.addAll(collectionRemove);
        this.f18315OoooO00 -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) OooOOO(collectionOooO);
    }

    @Override // com.google.common.collect.OooOOO
    public Map<K, Collection<V>> OooO0Oo() {
        return new OooO0O0(this.f18314Oooo);
    }

    @Override // com.google.common.collect.OooOOO
    public Iterator<Map.Entry<K, V>> OooO0o() {
        return new OooO00o(this);
    }

    @Override // com.google.common.collect.OooOOO
    public Set<K> OooO0o0() {
        return new OooO0o(this.f18314Oooo);
    }

    public Collection<V> OooOO0(@NullableDecl K k) {
        return OooO();
    }

    public final Collection<Map.Entry<K, V>> OooOO0O() {
        return this instanceof o0OoO00O ? new com.google.common.collect.OooOOO.OooO0O0(this) : new com.google.common.collect.OooOOO.OooO00o();
    }

    public abstract Collection<V> OooOO0o();

    public abstract <E> Collection<E> OooOOO(Collection<E> collection);

    public final void OooOOO0(Map<K, Collection<V>> map) {
        this.f18314Oooo = map;
        this.f18315OoooO00 = 0;
        for (Collection<V> collection : map.values()) {
            o0OOOO0o.OooOOOO.OooO0O0(!collection.isEmpty());
            this.f18315OoooO00 = collection.size() + this.f18315OoooO00;
        }
    }

    public abstract Collection<V> OooOOOO(@NullableDecl K k, Collection<V> collection);

    @Override // com.google.common.collect.o00OO0O0
    public void clear() {
        Iterator<Collection<V>> it = this.f18314Oooo.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f18314Oooo.clear();
        this.f18315OoooO00 = 0;
    }

    @Override // com.google.common.collect.o00OO0O0
    public final boolean containsKey(@NullableDecl Object obj) {
        return this.f18314Oooo.containsKey(obj);
    }

    @Override // com.google.common.collect.o00OO0O0
    public final int size() {
        return this.f18315OoooO00;
    }

    public class OooOo00 extends OooOO0<K, V>.OooOOOO implements List<V> {

        public class OooO00o extends OooOO0<K, V>.OooOOOO.OooO00o implements ListIterator<V> {
            public OooO00o() {
                super();
            }

            public final ListIterator<V> OooO0O0() {
                OooO00o();
                return (ListIterator) this.f18341Oooo0o;
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                boolean zIsEmpty = OooOo00.this.isEmpty();
                OooO0O0().add(v);
                OooOO0.OooO0oO(OooOO0.this);
                if (zIsEmpty) {
                    OooOo00.this.OooO00o();
                }
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return OooO0O0().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return OooO0O0().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return OooO0O0().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return OooO0O0().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                OooO0O0().set(v);
            }

            public OooO00o(int i) {
                super(((List) OooOo00.this.f18338Oooo0oO).listIterator(i));
            }
        }

        public OooOo00(K k, @NullableDecl List<V> list, OooOO0<K, V>.OooOOOO oooOOOO) {
            super(k, list, oooOOOO);
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            OooO0O0();
            boolean zIsEmpty = this.f18338Oooo0oO.isEmpty();
            ((List) this.f18338Oooo0oO).add(i, v);
            OooOO0.OooO0oO(OooOO0.this);
            if (zIsEmpty) {
                OooO00o();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.f18338Oooo0oO).addAll(i, collection);
            if (zAddAll) {
                int size2 = this.f18338Oooo0oO.size();
                OooOO0 oooOO1 = OooOO0.this;
                oooOO1.f18315OoooO00 = (size2 - size) + oooOO1.f18315OoooO00;
                if (size == 0) {
                    OooO00o();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final V get(int i) {
            OooO0O0();
            return (V) ((List) this.f18338Oooo0oO).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            OooO0O0();
            return ((List) this.f18338Oooo0oO).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            OooO0O0();
            return ((List) this.f18338Oooo0oO).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            OooO0O0();
            return new OooO00o();
        }

        @Override // java.util.List
        public final V remove(int i) {
            OooO0O0();
            V v = (V) ((List) this.f18338Oooo0oO).remove(i);
            OooOO0.OooO0oo(OooOO0.this);
            OooO0OO();
            return v;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            OooO0O0();
            return (V) ((List) this.f18338Oooo0oO).set(i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            OooO0O0();
            OooOO0 oooOO1 = OooOO0.this;
            K k = this.f18337Oooo0o;
            List listSubList = ((List) this.f18338Oooo0oO).subList(i, i2);
            OooOO0<K, V>.OooOOOO oooOOOO = this.f18339Oooo0oo;
            if (oooOOOO == null) {
                oooOOOO = this;
            }
            Objects.requireNonNull(oooOO1);
            return listSubList instanceof RandomAccess ? new OooOO0O(oooOO1, k, listSubList, oooOOOO) : new OooOo00(k, listSubList, oooOOOO);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            OooO0O0();
            return new OooO00o(i);
        }
    }

    public class OooOOOO extends AbstractCollection<V> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NullableDecl
        public final Collection<V> f18336Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NullableDecl
        public final K f18337Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Collection<V> f18338Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NullableDecl
        public final OooOO0<K, V>.OooOOOO f18339Oooo0oo;

        public OooOOOO(K k, @NullableDecl Collection<V> collection, OooOO0<K, V>.OooOOOO oooOOOO) {
            this.f18337Oooo0o = k;
            this.f18338Oooo0oO = collection;
            this.f18339Oooo0oo = oooOOOO;
            this.f18336Oooo = oooOOOO == null ? null : oooOOOO.f18338Oooo0oO;
        }

        public final void OooO00o() {
            OooOO0<K, V>.OooOOOO oooOOOO = this.f18339Oooo0oo;
            if (oooOOOO != null) {
                oooOOOO.OooO00o();
            } else {
                OooOO0.this.f18314Oooo.put(this.f18337Oooo0o, this.f18338Oooo0oO);
            }
        }

        public final void OooO0O0() {
            Collection<V> collection;
            OooOO0<K, V>.OooOOOO oooOOOO = this.f18339Oooo0oo;
            if (oooOOOO != null) {
                oooOOOO.OooO0O0();
                if (this.f18339Oooo0oo.f18338Oooo0oO != this.f18336Oooo) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f18338Oooo0oO.isEmpty() || (collection = OooOO0.this.f18314Oooo.get(this.f18337Oooo0o)) == null) {
                    return;
                }
                this.f18338Oooo0oO = collection;
            }
        }

        public final void OooO0OO() {
            OooOO0<K, V>.OooOOOO oooOOOO = this.f18339Oooo0oo;
            if (oooOOOO != null) {
                oooOOOO.OooO0OO();
            } else if (this.f18338Oooo0oO.isEmpty()) {
                OooOO0.this.f18314Oooo.remove(this.f18337Oooo0o);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            OooO0O0();
            boolean zIsEmpty = this.f18338Oooo0oO.isEmpty();
            boolean zAdd = this.f18338Oooo0oO.add(v);
            if (zAdd) {
                OooOO0.OooO0oO(OooOO0.this);
                if (zIsEmpty) {
                    OooO00o();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f18338Oooo0oO.addAll(collection);
            if (zAddAll) {
                int size2 = this.f18338Oooo0oO.size();
                OooOO0 oooOO1 = OooOO0.this;
                oooOO1.f18315OoooO00 = (size2 - size) + oooOO1.f18315OoooO00;
                if (size == 0) {
                    OooO00o();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f18338Oooo0oO.clear();
            OooOO0.this.f18315OoooO00 -= size;
            OooO0OO();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            OooO0O0();
            return this.f18338Oooo0oO.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            OooO0O0();
            return this.f18338Oooo0oO.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            OooO0O0();
            return this.f18338Oooo0oO.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            OooO0O0();
            return this.f18338Oooo0oO.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            OooO0O0();
            return new OooO00o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            OooO0O0();
            boolean zRemove = this.f18338Oooo0oO.remove(obj);
            if (zRemove) {
                OooOO0.OooO0oo(OooOO0.this);
                OooO0OO();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f18338Oooo0oO.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.f18338Oooo0oO.size();
                OooOO0 oooOO1 = OooOO0.this;
                oooOO1.f18315OoooO00 = (size2 - size) + oooOO1.f18315OoooO00;
                OooO0OO();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            int size = size();
            boolean zRetainAll = this.f18338Oooo0oO.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.f18338Oooo0oO.size();
                OooOO0 oooOO1 = OooOO0.this;
                oooOO1.f18315OoooO00 = (size2 - size) + oooOO1.f18315OoooO00;
                OooO0OO();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            OooO0O0();
            return this.f18338Oooo0oO.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            OooO0O0();
            return this.f18338Oooo0oO.toString();
        }

        public class OooO00o implements Iterator<V> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final Iterator<V> f18341Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final Collection<V> f18342Oooo0oO;

            public OooO00o() {
                Collection<V> collection = OooOOOO.this.f18338Oooo0oO;
                this.f18342Oooo0oO = collection;
                this.f18341Oooo0o = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void OooO00o() {
                OooOOOO.this.OooO0O0();
                if (OooOOOO.this.f18338Oooo0oO != this.f18342Oooo0oO) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                OooO00o();
                return this.f18341Oooo0o.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                OooO00o();
                return this.f18341Oooo0o.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f18341Oooo0o.remove();
                OooOO0.OooO0oo(OooOO0.this);
                OooOOOO.this.OooO0OO();
            }

            public OooO00o(Iterator<V> it) {
                this.f18342Oooo0oO = OooOOOO.this.f18338Oooo0oO;
                this.f18341Oooo0o = it;
            }
        }
    }
}
