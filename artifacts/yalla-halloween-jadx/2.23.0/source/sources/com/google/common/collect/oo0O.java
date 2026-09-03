package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class oo0O {

    public static class OooO<K, V> extends OooO0o<K, V> implements SortedSet<K> {
        public OooO(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // com.google.common.collect.oo0O.OooO0o
        public final Map OooO0Oo() {
            return (SortedMap) this.f19677OooO0Oo;
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return ((SortedMap) this.f19677OooO0Oo).comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final K first() {
            return (K) ((SortedMap) this.f19677OooO0Oo).firstKey();
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> headSet(@ParametricNullness K k) {
            return new OooO(((SortedMap) this.f19677OooO0Oo).headMap(k));
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public final K last() {
            return (K) ((SortedMap) this.f19677OooO0Oo).lastKey();
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            return new OooO(((SortedMap) this.f19677OooO0Oo).subMap(k, k2));
        }

        @Override // java.util.SortedSet
        public final SortedSet<K> tailSet(@ParametricNullness K k) {
            return new OooO(((SortedMap) this.f19677OooO0Oo).tailMap(k));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO00o implements com.google.common.base.OooOOO0<Map.Entry<?, ?>, Object> {
        private static final /* synthetic */ OooO00o[] $VALUES;
        public static final OooO00o KEY;
        public static final OooO00o VALUE;

        /* JADX INFO: renamed from: com.google.common.collect.oo0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public final enum C0237OooO00o extends OooO00o {
            public C0237OooO00o() {
                super("KEY", 0);
            }

            @Override // com.google.common.base.OooOOO0
            @CheckForNull
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        public final enum OooO0O0 extends OooO00o {
            public OooO0O0() {
                super("VALUE", 1);
            }

            @Override // com.google.common.base.OooOOO0
            @CheckForNull
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            C0237OooO00o c0237OooO00o = new C0237OooO00o();
            KEY = c0237OooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            VALUE = oooO0O0;
            $VALUES = new OooO00o[]{c0237OooO00o, oooO0O0};
        }

        public OooO00o() {
            throw null;
        }

        public OooO00o(String str, int i) {
            super(str, i);
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) $VALUES.clone();
        }
    }

    public static abstract class OooO0O0<K, V> extends o0O0O0Oo.OooO0OO<Map.Entry<K, V>> {
        public abstract Map<K, V> OooO0Oo();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0Oo().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objOooO0OO = oo0O.OooO0OO(key, OooO0Oo());
            if (com.google.common.base.Oooo000.OooO00o(objOooO0OO, entry.getValue())) {
                return objOooO0OO != null || OooO0Oo().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return OooO0Oo().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return OooO0Oo().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.o0O0O0Oo.OooO0OO, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return o0O0O0Oo.OooO0o(this, collection);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean zRemove = false;
                while (it.hasNext()) {
                    zRemove |= remove(it.next());
                }
                return zRemove;
            }
        }

        @Override // com.google.common.collect.o0O0O0Oo.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetOooO0o0 = o0O0O0Oo.OooO0o0(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetOooO0o0.add(((Map.Entry) obj).getKey());
                    }
                }
                return OooO0Oo().keySet().retainAll(hashSetOooO0o0);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooO0Oo().size();
        }
    }

    public static abstract class OooO0OO<K, V> extends AbstractMap<K, V> {

        public class OooO00o extends OooO0O0<K, V> {
            public OooO00o() {
            }

            @Override // com.google.common.collect.oo0O.OooO0O0
            public final Map<K, V> OooO0Oo() {
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

    public static class OooO0o<K, V> extends o0O0O0Oo.OooO0OO<K> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Weak
        public final Map<K, V> f19677OooO0Oo;

        public OooO0o(Map<K, V> map) {
            map.getClass();
            this.f19677OooO0Oo = map;
        }

        public Map<K, V> OooO0Oo() {
            return this.f19677OooO0Oo;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            OooO0Oo().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return OooO0Oo().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return OooO0Oo().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new o00OO000(OooO0Oo().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return false;
            }
            OooO0Oo().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooO0Oo().size();
        }
    }

    public static class OooOO0<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Weak
        public final Map<K, V> f19678OooO0Oo;

        public OooOO0(Map<K, V> map) {
            map.getClass();
            this.f19678OooO0Oo = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f19678OooO0Oo.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return this.f19678OooO0Oo.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f19678OooO0Oo.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new o00OO00O(this.f19678OooO0Oo.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                Map<K, V> map = this.f19678OooO0Oo;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (com.google.common.base.Oooo000.OooO00o(obj, entry.getValue())) {
                        map.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map<K, V> map = this.f19678OooO0Oo;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map<K, V> map = this.f19678OooO0Oo;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f19678OooO0Oo.size();
        }
    }

    @GwtCompatible
    public static abstract class OooOO0O<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @CheckForNull
        public transient Set<Map.Entry<K, V>> f19679OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public transient OooOO0 f19680OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public transient Set<K> f19681OooO0o0;

        public abstract Set<Map.Entry<K, V>> OooO00o();

        public Set<K> OooO0O0() {
            return new OooO0o(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f19679OooO0Oo;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setOooO00o = OooO00o();
            this.f19679OooO0Oo = setOooO00o;
            return setOooO00o;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f19681OooO0o0;
            if (set != null) {
                return set;
            }
            Set<K> setOooO0O0 = OooO0O0();
            this.f19681OooO0o0 = setOooO0O0;
            return setOooO0O0;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            OooOO0 oooOO1 = this.f19680OooO0o;
            if (oooOO1 != null) {
                return oooOO1;
            }
            OooOO0 oooOO2 = new OooOO0(this);
            this.f19680OooO0o = oooOO2;
            return oooOO2;
        }
    }

    public static o0OoO00O OooO00o(Collection collection) {
        ImmutableMap.OooO00o oooO00o = new ImmutableMap.OooO00o(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            oooO00o.OooO0OO(it.next(), Integer.valueOf(i));
            i++;
        }
        return oooO00o.OooO00o(true);
    }

    public static <K, V> LinkedHashMap<K, V> OooO0O0() {
        return new LinkedHashMap<>();
    }

    @CheckForNull
    public static Object OooO0OO(@CheckForNull Object obj, Map map) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
