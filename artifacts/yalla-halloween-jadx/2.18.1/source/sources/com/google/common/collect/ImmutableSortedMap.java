package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class ImmutableSortedMap<K, V> extends o0O0ooO<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final ImmutableSortedMap<Comparable, Object> f18208OoooO0O;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient o0O000O<K> f18209Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient ImmutableSortedMap<K, V> f18210OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final transient ImmutableList<V> f18211OoooO00;

    public class OooO00o extends o000O<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableSortedMap$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0118OooO00o extends ImmutableList<Map.Entry<K, V>> {
            public C0118OooO00o() {
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean OooO0oo() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f18209Oooo.f18600OoooO0.get(i), ImmutableSortedMap.this.f18211OoooO00.get(i));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return ImmutableSortedMap.this.size();
            }
        }

        public OooO00o() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: OooO */
        public final o0O0o000<Map.Entry<K, V>> iterator() {
            return OooO00o().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList<Map.Entry<K, V>> OooOOO0() {
            return new C0118OooO00o();
        }

        @Override // com.google.common.collect.o000O
        public final ImmutableMap<K, V> OooOOOo() {
            return ImmutableSortedMap.this;
        }
    }

    public static class OooO0O0<K, V> extends ImmutableMap.OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public transient Object[] f18214OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public transient Object[] f18215OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Comparator<? super K> f18216OooO0o0;

        public OooO0O0(Comparator<? super K> comparator) {
            super(4);
            Objects.requireNonNull(comparator);
            this.f18216OooO0o0 = comparator;
            this.f18214OooO0OO = new Object[4];
            this.f18215OooO0Oo = new Object[4];
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        public final ImmutableMap OooO00o() {
            int i = this.f18180OooO0O0;
            if (i == 0) {
                return ImmutableSortedMap.OooOO0o(this.f18216OooO0o0);
            }
            if (i == 1) {
                Comparator<? super K> comparator = this.f18216OooO0o0;
                Object obj = this.f18214OooO0OO[0];
                Object obj2 = this.f18215OooO0Oo[0];
                ImmutableList immutableListOooOOOo = ImmutableList.OooOOOo(obj);
                Objects.requireNonNull(comparator);
                return new ImmutableSortedMap(new o0O000O(immutableListOooOOOo, comparator), ImmutableList.OooOOOo(obj2));
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f18214OooO0OO, i);
            Arrays.sort(objArrCopyOf, this.f18216OooO0o0);
            int i2 = this.f18180OooO0O0;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < this.f18180OooO0O0; i3++) {
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    if (this.f18216OooO0o0.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("keys required to be distinct but compared as equal: ");
                        sbOooO0o0.append(objArrCopyOf[i4]);
                        sbOooO0o0.append(" and ");
                        sbOooO0o0.append(objArrCopyOf[i3]);
                        throw new IllegalArgumentException(sbOooO0o0.toString());
                    }
                }
                objArr[Arrays.binarySearch(objArrCopyOf, this.f18214OooO0OO[i3], this.f18216OooO0o0)] = this.f18215OooO0Oo[i3];
            }
            return new ImmutableSortedMap(new o0O000O(ImmutableList.OooOO0(objArrCopyOf, objArrCopyOf.length), this.f18216OooO0o0), ImmutableList.OooOO0(objArr, i2));
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableMap.OooO00o OooO0OO(Object obj, Object obj2) {
            int i = this.f18180OooO0O0 + 1;
            Object[] objArr = this.f18214OooO0OO;
            if (i > objArr.length) {
                int iOooO00o = ImmutableCollection.OooO0O0.OooO00o(objArr.length, i);
                this.f18214OooO0OO = Arrays.copyOf(this.f18214OooO0OO, iOooO00o);
                this.f18215OooO0Oo = Arrays.copyOf(this.f18215OooO0Oo, iOooO00o);
            }
            oo000o.OooO00o(obj, obj2);
            Object[] objArr2 = this.f18214OooO0OO;
            int i2 = this.f18180OooO0O0;
            objArr2[i2] = obj;
            this.f18215OooO0Oo[i2] = obj2;
            this.f18180OooO0O0 = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableMap.OooO00o OooO0Oo(Map.Entry entry) {
            super.OooO0Oo(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableMap.OooO00o OooO0o(Map map) {
            OooO0o0(map.entrySet());
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        @Beta
        public final ImmutableMap.OooO00o OooO0o0(Iterable iterable) {
            super.OooO0o0(iterable);
            return this;
        }
    }

    public static class OooO0OO extends ImmutableMap.OooO0OO {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Comparator<Object> f18217Oooo0oo;

        public OooO0OO(ImmutableSortedMap<?, ?> immutableSortedMap) {
            super(immutableSortedMap);
            this.f18217Oooo0oo = immutableSortedMap.f18209Oooo.f18227Oooo;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO0OO
        public Object readResolve() {
            return OooO00o(new OooO0O0(this.f18217Oooo0oo));
        }
    }

    static {
        o0O000O o0o000oOooOo0 = ImmutableSortedSet.OooOo0(o0o0Oo.f18676Oooo0o);
        com.google.common.collect.OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        f18208OoooO0O = new ImmutableSortedMap<>(o0o000oOooOo0, o0.f18399OoooO00);
    }

    public ImmutableSortedMap(o0O000O<K> o0o000o, ImmutableList<V> immutableList) {
        this.f18209Oooo = o0o000o;
        this.f18211OoooO00 = immutableList;
        this.f18210OoooO0 = null;
    }

    public static <K, V> ImmutableSortedMap<K, V> OooOO0o(Comparator<? super K> comparator) {
        return o0o0Oo.f18676Oooo0o.equals(comparator) ? (ImmutableSortedMap<K, V>) f18208OoooO0O : new ImmutableSortedMap<>(ImmutableSortedSet.OooOo0(comparator), o0.f18399OoooO00);
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: OooO */
    public final ImmutableSet keySet() {
        return this.f18209Oooo;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> OooO0OO() {
        if (!isEmpty()) {
            return new OooO00o();
        }
        int i = ImmutableSet.f18204Oooo0oo;
        return o0O0000O.f18593OoooOO0;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> OooO0Oo() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection<V> OooO0o0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: OooO0oO */
    public final ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean OooO0oo() {
        return this.f18209Oooo.OooO0oo() || this.f18211OoooO00.OooO0oo();
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: OooOO0O */
    public final ImmutableCollection<V> values() {
        return this.f18211OoooO00;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: OooOOO, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        o0O000O<K> o0o000o = this.f18209Oooo;
        Objects.requireNonNull(k);
        return OooOOO0(0, o0o000o.Oooo00o(k, z));
    }

    public final ImmutableSortedMap<K, V> OooOOO0(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        return i == i2 ? OooOO0o(this.f18209Oooo.f18227Oooo) : new ImmutableSortedMap<>(this.f18209Oooo.Oooo00O(i, i2), this.f18211OoooO00.subList(i, i2));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(k2);
        o0OOOO0o.OooOOOO.OooO0oo(this.f18209Oooo.f18227Oooo.compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: OooOOOo, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        o0O000O<K> o0o000o = this.f18209Oooo;
        Objects.requireNonNull(k);
        return OooOOO0(o0o000o.Oooo0O0(k, z), size());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final K ceilingKey(K k) {
        return (K) o00OO00O.OooO0O0(tailMap(k, true).firstEntry());
    }

    @Override // java.util.SortedMap
    public final Comparator<? super K> comparator() {
        return this.f18209Oooo.f18227Oooo;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.f18209Oooo.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.f18210OoooO0;
        if (immutableSortedMap == null) {
            return isEmpty() ? OooOO0o(o0oOO.OooO00o(this.f18209Oooo.f18227Oooo).OooO0O0()) : new ImmutableSortedMap((o0O000O) this.f18209Oooo.descendingSet(), this.f18211OoooO00.OooOOoo(), this);
        }
        return immutableSortedMap;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().OooO00o().get(0);
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        return this.f18209Oooo.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final K floorKey(K k) {
        return (K) o00OO00O.OooO0O0(headMap(k, true).lastEntry());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        int iBinarySearch;
        o0O000O<K> o0o000o = this.f18209Oooo;
        Objects.requireNonNull(o0o000o);
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(o0o000o.f18600OoooO0, obj, o0o000o.f18227Oooo);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f18211OoooO00.get(iBinarySearch);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final K higherKey(K k) {
        return (K) o00OO00O.OooO0O0(tailMap(k, false).firstEntry());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set keySet() {
        return this.f18209Oooo;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().OooO00o().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        return this.f18209Oooo.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final K lowerKey(K k) {
        return (K) o00OO00O.OooO0O0(headMap(k, false).lastEntry());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f18209Oooo;
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18211OoooO00.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return this.f18211OoooO00;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new OooO0OO(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public ImmutableSortedMap(o0O000O<K> o0o000o, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.f18209Oooo = o0o000o;
        this.f18211OoooO00 = immutableList;
        this.f18210OoooO0 = immutableSortedMap;
    }
}
