package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @LazyInit
    public transient ImmutableSet<Map.Entry<K, V>> f18176Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @RetainedWith
    @LazyInit
    public transient ImmutableSet<K> f18177Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @RetainedWith
    @LazyInit
    public transient ImmutableCollection<V> f18178Oooo0oo;

    public static class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object[] f18179OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f18180OooO0O0 = 0;

        public OooO00o(int i) {
            this.f18179OooO00o = new Object[i * 2];
        }

        public ImmutableMap<K, V> OooO00o() {
            return o0O00000.OooOO0o(this.f18180OooO0O0, this.f18179OooO00o);
        }

        public final void OooO0O0(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f18179OooO00o;
            if (i2 > objArr.length) {
                this.f18179OooO00o = Arrays.copyOf(objArr, ImmutableCollection.OooO0O0.OooO00o(objArr.length, i2));
            }
        }

        @CanIgnoreReturnValue
        public OooO00o<K, V> OooO0OO(K k, V v) {
            OooO0O0(this.f18180OooO0O0 + 1);
            oo000o.OooO00o(k, v);
            Object[] objArr = this.f18179OooO00o;
            int i = this.f18180OooO0O0;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f18180OooO0O0 = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public OooO00o<K, V> OooO0Oo(Map.Entry<? extends K, ? extends V> entry) {
            return OooO0OO(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public OooO00o<K, V> OooO0o(Map<? extends K, ? extends V> map) {
            OooO0o0(map.entrySet());
            return this;
        }

        @CanIgnoreReturnValue
        @Beta
        public OooO00o<K, V> OooO0o0(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                OooO0O0(((Collection) iterable).size() + this.f18180OooO0O0);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                OooO0Oo(it.next());
            }
            return this;
        }
    }

    public static abstract class OooO0O0<K, V> extends ImmutableMap<K, V> {

        public class OooO00o extends o000O<K, V> {
            public OooO00o() {
            }

            @Override // com.google.common.collect.ImmutableCollection
            /* JADX INFO: renamed from: OooO */
            public final o0O0o000<Map.Entry<K, V>> iterator() {
                return OooO0O0.this.OooOO0o();
            }

            @Override // com.google.common.collect.o000O
            public final ImmutableMap<K, V> OooOOOo() {
                return OooO0O0.this;
            }
        }

        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableSet<Map.Entry<K, V>> OooO0OO() {
            return new OooO00o();
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> OooO0Oo() {
            return new o000OO00(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableCollection<V> OooO0o0() {
            return new o000OOo0(this);
        }

        public abstract o0O0o000<Map.Entry<K, V>> OooOO0o();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set keySet() {
            return keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    public static class OooO0OO implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Object[] f18182Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Object[] f18183Oooo0oO;

        public OooO0OO(ImmutableMap<?, ?> immutableMap) {
            this.f18182Oooo0o = new Object[immutableMap.size()];
            this.f18183Oooo0oO = new Object[immutableMap.size()];
            o0O0o000<Map.Entry<?, ?>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                this.f18182Oooo0o[i] = next.getKey();
                this.f18183Oooo0oO[i] = next.getValue();
                i++;
            }
        }

        public final Object OooO00o(OooO00o<Object, Object> oooO00o) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f18182Oooo0o;
                if (i >= objArr.length) {
                    return oooO00o.OooO00o();
                }
                oooO00o.OooO0OO(objArr[i], this.f18183Oooo0oO[i]);
                i++;
            }
        }

        public Object readResolve() {
            return OooO00o(new OooO00o<>(this.f18182Oooo0o.length));
        }
    }

    public static <K, V> OooO00o<K, V> OooO00o() {
        return new OooO00o<>(4);
    }

    public static <K, V> ImmutableMap<K, V> OooO0O0(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.OooO0oo()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        OooO00o oooO00o = new OooO00o(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        oooO00o.OooO0o0(setEntrySet);
        return oooO00o.OooO00o();
    }

    public static <K, V> ImmutableMap<K, V> OooOO0(K k, V v) {
        oo000o.OooO00o(k, v);
        return o0O00000.OooOO0o(1, new Object[]{k, v});
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f18177Oooo0oO;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetOooO0Oo = OooO0Oo();
        this.f18177Oooo0oO = immutableSetOooO0Oo;
        return immutableSetOooO0Oo;
    }

    public abstract ImmutableSet<Map.Entry<K, V>> OooO0OO();

    public abstract ImmutableSet<K> OooO0Oo();

    public abstract ImmutableCollection<V> OooO0o0();

    @Override // java.util.Map
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f18176Oooo0o;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetOooO0OO = OooO0OO();
        this.f18176Oooo0o = immutableSetOooO0OO;
        return immutableSetOooO0OO;
    }

    public abstract boolean OooO0oo();

    @Override // java.util.Map
    /* JADX INFO: renamed from: OooOO0O, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f18178Oooo0oo;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionOooO0o0 = OooO0o0();
        this.f18178Oooo0oo = immutableCollectionOooO0o0;
        return immutableCollectionOooO0o0;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return o0O00O0o.OooO0O0(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sbOooO00o = o00oO0o.OooO00o(size());
        sbOooO00o.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sbOooO00o.append(", ");
            }
            z = false;
            sbOooO00o.append(entry.getKey());
            sbOooO00o.append('=');
            sbOooO00o.append(entry.getValue());
        }
        sbOooO00o.append('}');
        return sbOooO00o.toString();
    }

    Object writeReplace() {
        return new OooO0OO(this);
    }
}
