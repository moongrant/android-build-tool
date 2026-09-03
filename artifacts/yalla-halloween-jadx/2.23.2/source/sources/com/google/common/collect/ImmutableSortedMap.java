package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends o00oOoo<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final ImmutableSortedMap<Comparable, Object> f18724OooOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @CheckForNull
    public final transient ImmutableSortedMap<K, V> f18725OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient o0O00OO<K> f18726OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final transient ImmutableList<V> f18727OooO0oo;

    public class OooO00o extends o000OO00<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableSortedMap$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0227OooO00o extends ImmutableList<Map.Entry<K, V>> {
            public C0227OooO00o() {
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean OooO0o() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                OooO00o oooO00o = OooO00o.this;
                return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f18726OooO0oO.OooO00o().get(i), ImmutableSortedMap.this.f18727OooO0oo.get(i));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return ImmutableSortedMap.this.size();
            }
        }

        public OooO00o() {
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: OooO0oo */
        public final o0OO0<Map.Entry<K, V>> iterator() {
            return OooO00o().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList<Map.Entry<K, V>> OooOOO0() {
            return new C0227OooO00o();
        }

        @Override // com.google.common.collect.o000OO00
        public final ImmutableMap<K, V> OooOOOo() {
            return ImmutableSortedMap.this;
        }
    }

    public static class OooO0O0<K, V> extends ImmutableMap.OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public transient Object[] f18730OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Comparator<? super K> f18731OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public transient Object[] f18732OooO0o0;

        public OooO0O0(Comparator<? super K> comparator) {
            super(4);
            comparator.getClass();
            this.f18731OooO0o = comparator;
            this.f18730OooO0Oo = new Object[4];
            this.f18732OooO0o0 = new Object[4];
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        public final ImmutableMap.OooO00o OooO0OO(Object obj, Object obj2) {
            int i = this.f18692OooO0O0 + 1;
            Object[] objArr = this.f18730OooO0Oo;
            if (i > objArr.length) {
                int iOooO0O0 = ImmutableCollection.OooO0O0.OooO0O0(objArr.length, i);
                this.f18730OooO0Oo = Arrays.copyOf(this.f18730OooO0Oo, iOooO0O0);
                this.f18732OooO0o0 = Arrays.copyOf(this.f18732OooO0o0, iOooO0O0);
            }
            oo000o.OooO00o(obj, obj2);
            Object[] objArr2 = this.f18730OooO0Oo;
            int i2 = this.f18692OooO0O0;
            objArr2[i2] = obj;
            this.f18732OooO0o0[i2] = obj2;
            this.f18692OooO0O0 = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        public final void OooO0Oo(Map.Entry entry) {
            super.OooO0Oo(entry);
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public final ImmutableSortedMap<K, V> OooO0O0() {
            int i = this.f18692OooO0O0;
            Comparator<? super K> comparator = this.f18731OooO0o;
            if (i == 0) {
                return ImmutableSortedMap.OooOOO0(comparator);
            }
            if (i == 1) {
                Object obj = this.f18730OooO0Oo[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f18732OooO0o0[0];
                Objects.requireNonNull(obj2);
                o0O00 o0o00OooOOOo = ImmutableList.OooOOOo(obj);
                comparator.getClass();
                return new ImmutableSortedMap<>(new o0O00OO(o0o00OooOOOo, comparator), ImmutableList.OooOOOo(obj2), null);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f18730OooO0Oo, i);
            Arrays.sort(objArrCopyOf, comparator);
            int i2 = this.f18692OooO0O0;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < this.f18692OooO0O0; i3++) {
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    if (comparator.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                        String strValueOf = String.valueOf(objArrCopyOf[i4]);
                        String strValueOf2 = String.valueOf(objArrCopyOf[i3]);
                        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 57);
                        sb.append("keys required to be distinct but compared as equal: ");
                        sb.append(strValueOf);
                        sb.append(" and ");
                        sb.append(strValueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                Object obj3 = this.f18730OooO0Oo[i3];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
                Object obj4 = this.f18732OooO0o0[i3];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap<>(new o0O00OO(ImmutableList.OooO(objArrCopyOf.length, objArrCopyOf), comparator), ImmutableList.OooO(i2, objArr), null);
        }

        @Override // com.google.common.collect.ImmutableMap.OooO00o
        @CanIgnoreReturnValue
        @Beta
        public final ImmutableMap.OooO00o OooO0o0(Set set) {
            super.OooO0o0(set);
            return this;
        }
    }

    public static class OooO0OO<K, V> extends ImmutableMap.OooO0OO<K, V> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Comparator<? super K> f18733OooO0o;

        public OooO0OO(ImmutableSortedMap<K, V> immutableSortedMap) {
            super(immutableSortedMap);
            this.f18733OooO0o = immutableSortedMap.f18726OooO0oO.f18743OooO0oO;
        }

        @Override // com.google.common.collect.ImmutableMap.OooO0OO
        public final ImmutableMap.OooO00o OooO00o(int i) {
            return new OooO0O0(this.f18733OooO0o);
        }
    }

    static {
        o0O00OO o0o00ooOooOo00 = ImmutableSortedSet.OooOo00(o0O0o.f19109OooO0Oo);
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        f18724OooOO0 = new ImmutableSortedMap<>(o0o00ooOooOo00, o0O00.f19060OooO0oo, null);
    }

    public ImmutableSortedMap() {
        throw null;
    }

    public ImmutableSortedMap(o0O00OO<K> o0o00oo2, ImmutableList<V> immutableList, @CheckForNull ImmutableSortedMap<K, V> immutableSortedMap) {
        this.f18726OooO0oO = o0o00oo2;
        this.f18727OooO0oo = immutableList;
        this.f18725OooO = immutableSortedMap;
    }

    public static <K, V> ImmutableSortedMap<K, V> OooOOO0(Comparator<? super K> comparator) {
        return o0O0o.f19109OooO0Oo.equals(comparator) ? (ImmutableSortedMap<K, V>) f18724OooOO0 : new ImmutableSortedMap<>(ImmutableSortedSet.OooOo00(comparator), o0O00.f19060OooO0oo, null);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> OooO0OO() {
        if (!isEmpty()) {
            return new OooO00o();
        }
        int i = ImmutableSet.f18718OooO0o;
        return o0O00O0o.f19090OooOOO0;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> OooO0Oo() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: OooO0o */
    public final ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection<V> OooO0o0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean OooO0oO() {
        return this.f18726OooO0oO.OooO0o() || this.f18727OooO0oo.OooO0o();
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: OooO0oo */
    public final ImmutableSet keySet() {
        return this.f18726OooO0oO;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: OooOO0 */
    public final ImmutableCollection<V> values() {
        return this.f18727OooO0oo;
    }

    public final ImmutableSortedMap<K, V> OooOOO(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        o0O00OO<K> o0o00oo2 = this.f18726OooO0oO;
        return i == i2 ? OooOOO0(o0o00oo2.f18743OooO0oO) : new ImmutableSortedMap<>(o0o00oo2.OooOooO(i, i2), this.f18727OooO0oo.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        k.getClass();
        return OooOOO(0, this.f18726OooO0oO.OooOooo(k, z));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: OooOOOo, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        k.getClass();
        k2.getClass();
        com.google.common.base.o0OoOo0.OooO0oO(this.f18726OooO0oO.f18743OooO0oO.compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        k.getClass();
        return OooOOO(this.f18726OooO0oO.Oooo000(k, z), size());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final K ceilingKey(K k) {
        Map.Entry<K, V> entryFirstEntry = tailMap(k, true).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return entryFirstEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator<? super K> comparator() {
        return this.f18726OooO0oO.f18743OooO0oO;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.f18726OooO0oO.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.f18725OooO;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        boolean zIsEmpty = isEmpty();
        o0O00OO<K> o0o00oo2 = this.f18726OooO0oO;
        return zIsEmpty ? OooOOO0(o0O000.OooO00o(o0o00oo2.f18743OooO0oO).OooO0O0()) : new ImmutableSortedMap((o0O00OO) o0o00oo2.descendingSet(), this.f18727OooO0oo.OooOOo0(), this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().OooO00o().get(0);
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        return this.f18726OooO0oO.first();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final K floorKey(K k) {
        Map.Entry<K, V> entryLastEntry = headMap(k, true).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return entryLastEntry.getKey();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        int iIndexOf = this.f18726OooO0oO.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f18727OooO0oo.get(iIndexOf);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final K higherKey(K k) {
        Map.Entry<K, V> entryFirstEntry = tailMap(k, false).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return entryFirstEntry.getKey();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set keySet() {
        return this.f18726OooO0oO;
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().OooO00o().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        return this.f18726OooO0oO.last();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final K lowerKey(K k) {
        Map.Entry<K, V> entryLastEntry = headMap(k, false).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return entryLastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f18726OooO0oO;
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18727OooO0oo.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return this.f18727OooO0oo;
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
}
