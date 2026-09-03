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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class OooOO0<K, V> extends com.google.common.collect.OooOOO<K, V> implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public transient int f19306OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public transient Map<K, Collection<V>> f19307OooO0oo;

    public class OooO extends oo0O.OooO0o<K, Collection<V>> {

        public class OooO00o implements Iterator<K> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            @CheckForNull
            public Map.Entry<K, Collection<V>> f19309OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Iterator f19311OooO0o0;

            public OooO00o(Iterator it) {
                this.f19311OooO0o0 = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f19311OooO0o0.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f19311OooO0o0.next();
                this.f19309OooO0Oo = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.google.common.base.o000oOoO.OooOOO(this.f19309OooO0Oo != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f19309OooO0Oo.getValue();
                this.f19311OooO0o0.remove();
                OooOO0.this.f19306OooO -= value.size();
                value.clear();
                this.f19309OooO0Oo = null;
            }
        }

        public OooO(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.oo0O.OooO0o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o00O0O0O.OooO0O0(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f19677OooO0Oo.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f19677OooO0Oo.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f19677OooO0Oo.keySet().hashCode();
        }

        @Override // com.google.common.collect.oo0O.OooO0o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new OooO00o(this.f19677OooO0Oo.entrySet().iterator());
        }

        @Override // com.google.common.collect.oo0O.OooO0o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            int size;
            Collection collection = (Collection) this.f19677OooO0Oo.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                OooOO0.this.f19306OooO -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public class OooO00o extends OooOO0<K, V>.OooO0o<V> {
        @Override // com.google.common.collect.OooOO0.OooO0o
        @ParametricNullness
        public final V OooO00o(@ParametricNullness K k, @ParametricNullness V v) {
            return v;
        }
    }

    public class OooO0O0 extends OooOO0<K, V>.OooO0o<Map.Entry<K, V>> {
        @Override // com.google.common.collect.OooOO0.OooO0o
        public final Object OooO00o(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
            return new o000O0O0(obj, obj2);
        }
    }

    public class OooO0OO extends oo0O.OooOO0O<K, Collection<V>> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f19312OooO0oO;

        public class OooO00o extends oo0O.OooO0O0<K, Collection<V>> {
            public OooO00o() {
            }

            @Override // com.google.common.collect.oo0O.OooO0O0
            public final Map<K, Collection<V>> OooO0Oo() {
                return OooO0OO.this;
            }

            @Override // com.google.common.collect.oo0O.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = OooO0OO.this.f19312OooO0oO.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return OooO0OO.this.new OooO0O0();
            }

            @Override // com.google.common.collect.oo0O.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@CheckForNull Object obj) {
                Collection<V> collectionRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                OooOO0 oooOO1 = OooOO0.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = oooOO1.f19307OooO0oo;
                map.getClass();
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
                oooOO1.f19306OooO -= size;
                return true;
            }
        }

        public class OooO0O0 implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f19315OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            @CheckForNull
            public Collection<V> f19317OooO0o0;

            public OooO0O0() {
                this.f19315OooO0Oo = OooO0OO.this.f19312OooO0oO.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f19315OooO0Oo.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f19315OooO0Oo.next();
                this.f19317OooO0o0 = next.getValue();
                return OooO0OO.this.OooO0OO(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.google.common.base.o000oOoO.OooOOO(this.f19317OooO0o0 != null, "no calls to next() since the last call to remove()");
                this.f19315OooO0Oo.remove();
                OooOO0.this.f19306OooO -= this.f19317OooO0o0.size();
                this.f19317OooO0o0.clear();
                this.f19317OooO0o0 = null;
            }
        }

        public OooO0OO(Map<K, Collection<V>> map) {
            this.f19312OooO0oO = map;
        }

        @Override // com.google.common.collect.oo0O.OooOO0O
        public final Set<Map.Entry<K, Collection<V>>> OooO00o() {
            return new OooO00o();
        }

        public final o000O0O0 OooO0OO(Map.Entry entry) {
            Object key = entry.getKey();
            return new o000O0O0(key, OooOO0.this.OooOo0((Collection) entry.getValue(), key));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            OooOO0 oooOO1 = OooOO0.this;
            if (this.f19312OooO0oO == oooOO1.f19307OooO0oo) {
                oooOO1.clear();
            } else {
                o00O0O0O.OooO0O0(new OooO0O0());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            Map<K, Collection<V>> map = this.f19312OooO0oO;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f19312OooO0oO.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object get(@CheckForNull Object obj) {
            Collection collection = (Collection) oo0O.OooO0OO(obj, this.f19312OooO0oO);
            if (collection == null) {
                return null;
            }
            return OooOO0.this.OooOo0(collection, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f19312OooO0oO.hashCode();
        }

        @Override // com.google.common.collect.oo0O.OooOO0O, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return OooOO0.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object remove(@CheckForNull Object obj) {
            Collection<V> collectionRemove = this.f19312OooO0oO.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            OooOO0 oooOO1 = OooOO0.this;
            Collection<V> collectionOooOO0O = oooOO1.OooOO0O();
            collectionOooOO0O.addAll(collectionRemove);
            oooOO1.f19306OooO -= collectionRemove.size();
            collectionRemove.clear();
            return collectionOooOO0O;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f19312OooO0oO.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f19312OooO0oO.toString();
        }
    }

    public abstract class OooO0o<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f19318OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public K f19320OooO0o0 = null;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public Collection<V> f19319OooO0o = null;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Iterator<V> f19321OooO0oO = o00O0O0O.OooO00o.INSTANCE;

        public OooO0o() {
            this.f19318OooO0Oo = OooOO0.this.f19307OooO0oo.entrySet().iterator();
        }

        public abstract T OooO00o(@ParametricNullness K k, @ParametricNullness V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19318OooO0Oo.hasNext() || this.f19321OooO0oO.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f19321OooO0oO.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f19318OooO0Oo.next();
                this.f19320OooO0o0 = next.getKey();
                Collection<V> value = next.getValue();
                this.f19319OooO0o = value;
                this.f19321OooO0oO = value.iterator();
            }
            return OooO00o(this.f19320OooO0o0, this.f19321OooO0oO.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f19321OooO0oO.remove();
            Collection<V> collection = this.f19319OooO0o;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f19318OooO0Oo.remove();
            }
            OooOO0.this.f19306OooO--;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.OooOO0$OooOO0, reason: collision with other inner class name */
    public class C0233OooOO0 extends OooOO0<K, V>.OooOOO implements NavigableMap<K, Collection<V>> {
        public C0233OooOO0(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO, com.google.common.collect.oo0O.OooOO0O
        public final Set OooO0O0() {
            return new OooOO0O(OooO0o());
        }

        @Override // com.google.common.collect.OooOO0.OooOOO
        /* JADX INFO: renamed from: OooO0Oo */
        public final SortedSet OooO0O0() {
            return new OooOO0O(OooO0o());
        }

        @Override // com.google.common.collect.OooOO0.OooOOO
        /* JADX INFO: renamed from: OooO0o0 */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @CheckForNull
        public final o000O0O0 OooO0oO(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            OooOO0 oooOO1 = OooOO0.this;
            Collection<V> collectionOooOO0O = oooOO1.OooOO0O();
            collectionOooOO0O.addAll((Collection) entry.getValue());
            it.remove();
            return new o000O0O0(entry.getKey(), oooOO1.OooOOoo(collectionOooOO0O));
        }

        @Override // com.google.common.collect.OooOO0.OooOOO
        /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> OooO0o() {
            return (NavigableMap) ((SortedMap) this.f19312OooO0oO);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> ceilingEntry(@ParametricNullness K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = OooO0o().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return OooO0OO(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K ceilingKey(@ParametricNullness K k) {
            return OooO0o().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((C0233OooOO0) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C0233OooOO0(OooO0o().descendingMap());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = OooO0o().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return OooO0OO(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> floorEntry(@ParametricNullness K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = OooO0o().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return OooO0OO(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K floorKey(@ParametricNullness K k) {
            return OooO0o().floorKey(k);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(@ParametricNullness Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> higherEntry(@ParametricNullness K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = OooO0o().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return OooO0OO(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K higherKey(@ParametricNullness K k) {
            return OooO0o().higherKey(k);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO, com.google.common.collect.OooOO0.OooO0OO, com.google.common.collect.oo0O.OooOO0O, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = OooO0o().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return OooO0OO(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lowerEntry(@ParametricNullness K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = OooO0o().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return OooO0OO(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K lowerKey(@ParametricNullness K k) {
            return OooO0o().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return OooO0oO(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return OooO0oO(((oo0O.OooOO0O) descendingMap()).entrySet().iterator());
        }

        @Override // com.google.common.collect.OooOO0.OooOOO, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.OooOO0.OooOOO, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(@ParametricNullness Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k, boolean z) {
            return new C0233OooOO0(OooO0o().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return new C0233OooOO0(OooO0o().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k, boolean z) {
            return new C0233OooOO0(OooO0o().tailMap(k, z));
        }
    }

    public class OooOO0O extends OooOO0<K, V>.OooOOOO implements NavigableSet<K> {
        public OooOO0O(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.OooOO0.OooOOOO
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> OooO0o0() {
            return (NavigableMap) ((SortedMap) this.f19677OooO0Oo);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K ceiling(@ParametricNullness K k) {
            return OooO0o0().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((OooO) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new OooOO0O(OooO0o0().descendingMap());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K floor(@ParametricNullness K k) {
            return OooO0o0().floorKey(k);
        }

        @Override // com.google.common.collect.OooOO0.OooOOOO, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(@ParametricNullness Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K higher(@ParametricNullness K k) {
            return OooO0o0().higherKey(k);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K lower(@ParametricNullness K k) {
            return OooO0o0().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K pollFirst() {
            return (K) o00O0O0O.OooO0o0(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K pollLast() {
            return (K) o00O0O0O.OooO0o0(descendingIterator());
        }

        @Override // com.google.common.collect.OooOO0.OooOOOO, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.OooOO0.OooOOOO, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(@ParametricNullness Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(@ParametricNullness K k, boolean z) {
            return new OooOO0O(OooO0o0().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
            return new OooOO0O(OooO0o0().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(@ParametricNullness K k, boolean z) {
            return new OooOO0O(OooO0o0().tailMap(k, z));
        }
    }

    public class OooOOO extends OooOO0<K, V>.OooO0OO implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @CheckForNull
        public SortedSet<K> f19325OooO;

        public OooOOO(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // com.google.common.collect.oo0O.OooOO0O
        /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> OooO0O0() {
            return new OooOOOO(OooO0o());
        }

        public SortedMap<K, Collection<V>> OooO0o() {
            return (SortedMap) this.f19312OooO0oO;
        }

        @Override // com.google.common.collect.OooOO0.OooO0OO, com.google.common.collect.oo0O.OooOO0O, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f19325OooO;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetOooO0O0 = OooO0O0();
            this.f19325OooO = sortedSetOooO0O0;
            return sortedSetOooO0O0;
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return OooO0o().comparator();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public final K firstKey() {
            return OooO0o().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(@ParametricNullness K k) {
            return new OooOOO(OooO0o().headMap(k));
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public final K lastKey() {
            return OooO0o().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
            return new OooOOO(OooO0o().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(@ParametricNullness K k) {
            return new OooOOO(OooO0o().tailMap(k));
        }
    }

    public class OooOOO0 extends OooOO0<K, V>.OooOo implements RandomAccess {
    }

    public class OooOOOO extends OooOO0<K, V>.OooO implements SortedSet<K> {
        public OooOOOO(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> OooO0o0() {
            return (SortedMap) this.f19677OooO0Oo;
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return OooO0o0().comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final K first() {
            return OooO0o0().firstKey();
        }

        public SortedSet<K> headSet(@ParametricNullness K k) {
            return new OooOOOO(OooO0o0().headMap(k));
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final K last() {
            return OooO0o0().lastKey();
        }

        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return new OooOOOO(OooO0o0().subMap(k, k2));
        }

        public SortedSet<K> tailSet(@ParametricNullness K k) {
            return new OooOOOO(OooO0o0().tailMap(k));
        }
    }

    public class Oooo0 extends OooOO0<K, V>.OooOo00 implements Set<V> {
        public Oooo0(K k, Set<V> set) {
            super(k, set, null);
        }

        @Override // com.google.common.collect.OooOO0.OooOo00, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zOooO0o = o0O0O0Oo.OooO0o((Set) this.f19332OooO0o0, collection);
            if (zOooO0o) {
                OooOO0.this.f19306OooO += this.f19332OooO0o0.size() - size;
                OooO0OO();
            }
            return zOooO0o;
        }
    }

    public class Oooo000 extends OooOO0<K, V>.o000oOoO implements NavigableSet<V> {
        public Oooo000(K k, @CheckForNull NavigableSet<V> navigableSet, OooOO0<K, V>.OooOo00 oooOo00) {
            super(k, navigableSet, oooOo00);
        }

        public final Oooo000 OooO0o(NavigableSet navigableSet) {
            OooOO0<K, V>.OooOo00 oooOo00 = this.f19331OooO0o;
            if (oooOo00 == null) {
                oooOo00 = this;
            }
            return new Oooo000(this.f19330OooO0Oo, navigableSet, oooOo00);
        }

        @Override // com.google.common.collect.OooOO0.o000oOoO
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final NavigableSet<V> OooO0Oo() {
            return (NavigableSet) ((SortedSet) this.f19332OooO0o0);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V ceiling(@ParametricNullness V v) {
            return OooO0Oo().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public final Iterator<V> descendingIterator() {
            return new OooOo00.OooO00o(OooO0Oo().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> descendingSet() {
            return OooO0o(OooO0Oo().descendingSet());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V floor(@ParametricNullness V v) {
            return OooO0Oo().floor(v);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> headSet(@ParametricNullness V v, boolean z) {
            return OooO0o(OooO0Oo().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V higher(@ParametricNullness V v) {
            return OooO0Oo().higher(v);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V lower(@ParametricNullness V v) {
            return OooO0Oo().lower(v);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V pollFirst() {
            return (V) o00O0O0O.OooO0o0(iterator());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final V pollLast() {
            return (V) o00O0O0O.OooO0o0(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> subSet(@ParametricNullness V v, boolean z, @ParametricNullness V v2, boolean z2) {
            return OooO0o(OooO0Oo().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> tailSet(@ParametricNullness V v, boolean z) {
            return OooO0o(OooO0Oo().tailSet(v, z));
        }
    }

    public class o000oOoO extends OooOO0<K, V>.OooOo00 implements SortedSet<V> {
        public o000oOoO(K k, @CheckForNull SortedSet<V> sortedSet, OooOO0<K, V>.OooOo00 oooOo00) {
            super(k, sortedSet, oooOo00);
        }

        public SortedSet<V> OooO0Oo() {
            return (SortedSet) this.f19332OooO0o0;
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super V> comparator() {
            return OooO0Oo().comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final V first() {
            OooO0O0();
            return OooO0Oo().first();
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> headSet(@ParametricNullness V v) {
            OooO0O0();
            SortedSet<V> sortedSetHeadSet = OooO0Oo().headSet(v);
            OooOO0<K, V>.OooOo00 oooOo00 = this.f19331OooO0o;
            if (oooOo00 == null) {
                oooOo00 = this;
            }
            return new o000oOoO(this.f19330OooO0Oo, sortedSetHeadSet, oooOo00);
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final V last() {
            OooO0O0();
            return OooO0Oo().last();
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> subSet(@ParametricNullness V v, @ParametricNullness V v2) {
            OooO0O0();
            SortedSet<V> sortedSetSubSet = OooO0Oo().subSet(v, v2);
            OooOO0<K, V>.OooOo00 oooOo00 = this.f19331OooO0o;
            if (oooOo00 == null) {
                oooOo00 = this;
            }
            return new o000oOoO(this.f19330OooO0Oo, sortedSetSubSet, oooOo00);
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> tailSet(@ParametricNullness V v) {
            OooO0O0();
            SortedSet<V> sortedSetTailSet = OooO0Oo().tailSet(v);
            OooOO0<K, V>.OooOo00 oooOo00 = this.f19331OooO0o;
            if (oooOo00 == null) {
                oooOo00 = this;
            }
            return new o000oOoO(this.f19330OooO0Oo, sortedSetTailSet, oooOo00);
        }
    }

    public OooOO0(Map<K, Collection<V>> map) {
        com.google.common.base.o000oOoO.OooO0Oo(map.isEmpty());
        this.f19307OooO0oo = map;
    }

    @Override // com.google.common.collect.OooOOO
    public Iterator<Map.Entry<K, V>> OooO() {
        return new OooO0O0();
    }

    @Override // com.google.common.collect.o00OO
    public Collection<V> OooO00o(@CheckForNull Object obj) {
        Collection<V> collectionRemove = this.f19307OooO0oo.remove(obj);
        if (collectionRemove == null) {
            return OooOOOO();
        }
        Collection collectionOooOO0O = OooOO0O();
        collectionOooOO0O.addAll(collectionRemove);
        this.f19306OooO -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) OooOOoo(collectionOooOO0O);
    }

    @Override // com.google.common.collect.OooOOO
    public final Collection<Map.Entry<K, V>> OooO0o() {
        return this instanceof o0O0O0O ? new com.google.common.collect.OooOOO.OooO0O0() : new com.google.common.collect.OooOOO.OooO00o();
    }

    @Override // com.google.common.collect.OooOOO
    public Map<K, Collection<V>> OooO0o0() {
        return new OooO0OO(this.f19307OooO0oo);
    }

    @Override // com.google.common.collect.OooOOO
    public Set<K> OooO0oO() {
        return new OooO(this.f19307OooO0oo);
    }

    @Override // com.google.common.collect.OooOOO
    public Collection<Map.Entry<K, V>> OooO0oo() {
        return super.OooO0oo();
    }

    @Override // com.google.common.collect.OooOOO
    public Iterator<V> OooOO0() {
        return new OooO00o();
    }

    public abstract Collection<V> OooOO0O();

    public Collection<V> OooOO0o(@ParametricNullness K k) {
        return OooOO0O();
    }

    public final OooO OooOOO() {
        Map<K, Collection<V>> map = this.f19307OooO0oo;
        if (map instanceof NavigableMap) {
            return new OooOO0O((NavigableMap) this.f19307OooO0oo);
        }
        return map instanceof SortedMap ? new OooOOOO((SortedMap) this.f19307OooO0oo) : new OooO(this.f19307OooO0oo);
    }

    public final OooO0OO OooOOO0() {
        Map<K, Collection<V>> map = this.f19307OooO0oo;
        if (map instanceof NavigableMap) {
            return new C0233OooOO0((NavigableMap) this.f19307OooO0oo);
        }
        return map instanceof SortedMap ? new OooOOO((SortedMap) this.f19307OooO0oo) : new OooO0OO(this.f19307OooO0oo);
    }

    public abstract Collection<V> OooOOOO();

    public final Collection<V> OooOOOo() {
        return new com.google.common.collect.OooOOO.OooO0OO();
    }

    public final void OooOOo(Map<K, Collection<V>> map) {
        this.f19307OooO0oo = map;
        this.f19306OooO = 0;
        for (Collection<V> collection : map.values()) {
            com.google.common.base.o000oOoO.OooO0Oo(!collection.isEmpty());
            this.f19306OooO = collection.size() + this.f19306OooO;
        }
    }

    public boolean OooOOo0(@ParametricNullness K k, @ParametricNullness V v) {
        Collection<V> collection = this.f19307OooO0oo.get(k);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.f19306OooO++;
            return true;
        }
        Collection<V> collectionOooOO0o = OooOO0o(k);
        if (!collectionOooOO0o.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f19306OooO++;
        this.f19307OooO0oo.put(k, collectionOooOO0o);
        return true;
    }

    public abstract <E> Collection<E> OooOOoo(Collection<E> collection);

    public abstract Collection OooOo0(Collection collection, @ParametricNullness Object obj);

    public Collection<V> OooOo00() {
        Collection<V> collection = this.f19350OooO0o;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionOooOOOo = OooOOOo();
        this.f19350OooO0o = collectionOooOOOo;
        return collectionOooOOOo;
    }

    @Override // com.google.common.collect.o00OO
    public void clear() {
        Iterator<Collection<V>> it = this.f19307OooO0oo.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f19307OooO0oo.clear();
        this.f19306OooO = 0;
    }

    @Override // com.google.common.collect.o00OO
    public final boolean containsKey(@CheckForNull Object obj) {
        return this.f19307OooO0oo.containsKey(obj);
    }

    @Override // com.google.common.collect.o00OO
    public final int size() {
        return this.f19306OooO;
    }

    public class OooOo extends OooOO0<K, V>.OooOo00 implements List<V> {

        public class OooO00o extends OooOO0<K, V>.OooOo00.OooO00o implements ListIterator<V> {
            public OooO00o() {
                super();
            }

            public final ListIterator<V> OooO0O0() {
                OooO00o();
                return (ListIterator) this.f19335OooO0Oo;
            }

            @Override // java.util.ListIterator
            public final void add(@ParametricNullness V v) {
                OooOo oooOo = OooOo.this;
                boolean zIsEmpty = oooOo.isEmpty();
                OooO0O0().add(v);
                OooOO0.this.f19306OooO++;
                if (zIsEmpty) {
                    oooOo.OooO00o();
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
            @ParametricNullness
            public final V previous() {
                return OooO0O0().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return OooO0O0().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(@ParametricNullness V v) {
                OooO0O0().set(v);
            }

            public OooO00o(int i) {
                super(((List) OooOo.this.f19332OooO0o0).listIterator(i));
            }
        }

        public OooOo(K k, @CheckForNull List<V> list, OooOO0<K, V>.OooOo00 oooOo00) {
            super(k, list, oooOo00);
        }

        @Override // java.util.List
        public final void add(int i, @ParametricNullness V v) {
            OooO0O0();
            boolean zIsEmpty = this.f19332OooO0o0.isEmpty();
            ((List) this.f19332OooO0o0).add(i, v);
            OooOO0.this.f19306OooO++;
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
            boolean zAddAll = ((List) this.f19332OooO0o0).addAll(i, collection);
            if (zAddAll) {
                OooOO0.this.f19306OooO += this.f19332OooO0o0.size() - size;
                if (size == 0) {
                    OooO00o();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        @ParametricNullness
        public final V get(int i) {
            OooO0O0();
            return (V) ((List) this.f19332OooO0o0).get(i);
        }

        @Override // java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            OooO0O0();
            return ((List) this.f19332OooO0o0).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            OooO0O0();
            return ((List) this.f19332OooO0o0).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            OooO0O0();
            return new OooO00o();
        }

        @Override // java.util.List
        @ParametricNullness
        public final V remove(int i) {
            OooO0O0();
            V v = (V) ((List) this.f19332OooO0o0).remove(i);
            OooOO0.this.f19306OooO--;
            OooO0OO();
            return v;
        }

        @Override // java.util.List
        @ParametricNullness
        public final V set(int i, @ParametricNullness V v) {
            OooO0O0();
            return (V) ((List) this.f19332OooO0o0).set(i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            OooO0O0();
            List listSubList = ((List) this.f19332OooO0o0).subList(i, i2);
            OooOO0<K, V>.OooOo00 oooOo00 = this.f19331OooO0o;
            if (oooOo00 == null) {
                oooOo00 = this;
            }
            OooOO0 oooOO1 = OooOO0.this;
            oooOO1.getClass();
            boolean z = listSubList instanceof RandomAccess;
            K k = this.f19330OooO0Oo;
            return z ? new OooOOO0(k, listSubList, oooOo00) : new OooOo(k, listSubList, oooOo00);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            OooO0O0();
            return new OooO00o(i);
        }
    }

    public class OooOo00 extends AbstractCollection<V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f19330OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public final OooOO0<K, V>.OooOo00 f19331OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Collection<V> f19332OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public final Collection<V> f19333OooO0oO;

        public OooOo00(K k, @CheckForNull Collection<V> collection, OooOO0<K, V>.OooOo00 oooOo00) {
            this.f19330OooO0Oo = k;
            this.f19332OooO0o0 = collection;
            this.f19331OooO0o = oooOo00;
            this.f19333OooO0oO = oooOo00 == null ? null : oooOo00.f19332OooO0o0;
        }

        public final void OooO00o() {
            OooOO0<K, V>.OooOo00 oooOo00 = this.f19331OooO0o;
            if (oooOo00 != null) {
                oooOo00.OooO00o();
            } else {
                OooOO0.this.f19307OooO0oo.put(this.f19330OooO0Oo, this.f19332OooO0o0);
            }
        }

        public final void OooO0O0() {
            Collection<V> collection;
            OooOO0<K, V>.OooOo00 oooOo00 = this.f19331OooO0o;
            if (oooOo00 != null) {
                oooOo00.OooO0O0();
                if (oooOo00.f19332OooO0o0 != this.f19333OooO0oO) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f19332OooO0o0.isEmpty() || (collection = OooOO0.this.f19307OooO0oo.get(this.f19330OooO0Oo)) == null) {
                    return;
                }
                this.f19332OooO0o0 = collection;
            }
        }

        public final void OooO0OO() {
            OooOO0<K, V>.OooOo00 oooOo00 = this.f19331OooO0o;
            if (oooOo00 != null) {
                oooOo00.OooO0OO();
            } else if (this.f19332OooO0o0.isEmpty()) {
                OooOO0.this.f19307OooO0oo.remove(this.f19330OooO0Oo);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(@ParametricNullness V v) {
            OooO0O0();
            boolean zIsEmpty = this.f19332OooO0o0.isEmpty();
            boolean zAdd = this.f19332OooO0o0.add(v);
            if (zAdd) {
                OooOO0.this.f19306OooO++;
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
            boolean zAddAll = this.f19332OooO0o0.addAll(collection);
            if (zAddAll) {
                OooOO0.this.f19306OooO += this.f19332OooO0o0.size() - size;
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
            this.f19332OooO0o0.clear();
            OooOO0.this.f19306OooO -= size;
            OooO0OO();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            OooO0O0();
            return this.f19332OooO0o0.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            OooO0O0();
            return this.f19332OooO0o0.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            OooO0O0();
            return this.f19332OooO0o0.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            OooO0O0();
            return this.f19332OooO0o0.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            OooO0O0();
            return new OooO00o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            OooO0O0();
            boolean zRemove = this.f19332OooO0o0.remove(obj);
            if (zRemove) {
                OooOO0.this.f19306OooO--;
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
            boolean zRemoveAll = this.f19332OooO0o0.removeAll(collection);
            if (zRemoveAll) {
                OooOO0.this.f19306OooO += this.f19332OooO0o0.size() - size;
                OooO0OO();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.f19332OooO0o0.retainAll(collection);
            if (zRetainAll) {
                OooOO0.this.f19306OooO += this.f19332OooO0o0.size() - size;
                OooO0OO();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            OooO0O0();
            return this.f19332OooO0o0.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            OooO0O0();
            return this.f19332OooO0o0.toString();
        }

        public class OooO00o implements Iterator<V> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Iterator<V> f19335OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final Collection<V> f19337OooO0o0;

            public OooO00o() {
                Collection<V> collection = OooOo00.this.f19332OooO0o0;
                this.f19337OooO0o0 = collection;
                this.f19335OooO0Oo = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void OooO00o() {
                OooOo00 oooOo00 = OooOo00.this;
                oooOo00.OooO0O0();
                if (oooOo00.f19332OooO0o0 != this.f19337OooO0o0) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                OooO00o();
                return this.f19335OooO0Oo.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public final V next() {
                OooO00o();
                return this.f19335OooO0Oo.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f19335OooO0Oo.remove();
                OooOo00 oooOo00 = OooOo00.this;
                OooOO0.this.f19306OooO--;
                oooOo00.OooO0OO();
            }

            public OooO00o(Iterator<V> it) {
                this.f19337OooO0o0 = OooOo00.this.f19332OooO0o0;
                this.f19335OooO0Oo = it;
            }
        }
    }
}
