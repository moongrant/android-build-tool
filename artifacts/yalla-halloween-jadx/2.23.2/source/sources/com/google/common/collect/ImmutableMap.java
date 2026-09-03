package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient ImmutableSet<Map.Entry<K, V>> f18688OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient ImmutableCollection<V> f18689OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient ImmutableSet<K> f18690OooO0o0;

    @DoNotMock
    public static class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object[] f18691OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f18692OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C0226OooO00o f18693OooO0OO;

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0226OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Object f18694OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final Object f18695OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final Object f18696OooO0OO;

            public C0226OooO00o(Object obj, Object obj2, Object obj3) {
                this.f18694OooO00o = obj;
                this.f18695OooO0O0 = obj2;
                this.f18696OooO0OO = obj3;
            }

            public final IllegalArgumentException OooO00o() {
                Object obj = this.f18694OooO00o;
                String strValueOf = String.valueOf(obj);
                String strValueOf2 = String.valueOf(this.f18695OooO0O0);
                String strValueOf3 = String.valueOf(obj);
                String strValueOf4 = String.valueOf(this.f18696OooO0OO);
                StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                return new IllegalArgumentException(p031OoooO0.o0OoOo0.OooO0OO(sb, " and ", strValueOf3, "=", strValueOf4));
            }
        }

        public OooO00o(int i) {
            this.f18691OooO00o = new Object[i * 2];
        }

        public final o0OoO00O OooO00o(boolean z) {
            C0226OooO00o c0226OooO00o;
            C0226OooO00o c0226OooO00o2;
            if (z && (c0226OooO00o2 = this.f18693OooO0OO) != null) {
                throw c0226OooO00o2.OooO00o();
            }
            o0OoO00O o0ooo00oOooOO0O = o0OoO00O.OooOO0O(this.f18692OooO0O0, this.f18691OooO00o, this);
            if (!z || (c0226OooO00o = this.f18693OooO0OO) == null) {
                return o0ooo00oOooOO0O;
            }
            throw c0226OooO00o.OooO00o();
        }

        public ImmutableMap<K, V> OooO0O0() {
            return OooO00o(true);
        }

        @CanIgnoreReturnValue
        public OooO00o<K, V> OooO0OO(K k, V v) {
            int i = (this.f18692OooO0O0 + 1) * 2;
            Object[] objArr = this.f18691OooO00o;
            if (i > objArr.length) {
                this.f18691OooO00o = Arrays.copyOf(objArr, ImmutableCollection.OooO0O0.OooO0O0(objArr.length, i));
            }
            oo000o.OooO00o(k, v);
            Object[] objArr2 = this.f18691OooO00o;
            int i2 = this.f18692OooO0O0;
            int i3 = i2 * 2;
            objArr2[i3] = k;
            objArr2[i3 + 1] = v;
            this.f18692OooO0O0 = i2 + 1;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public void OooO0Oo(Map.Entry entry) {
            OooO0OO(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        @Beta
        public OooO00o OooO0o0(Set set) {
            if (set instanceof Collection) {
                int size = (set.size() + this.f18692OooO0O0) * 2;
                Object[] objArr = this.f18691OooO00o;
                if (size > objArr.length) {
                    this.f18691OooO00o = Arrays.copyOf(objArr, ImmutableCollection.OooO0O0.OooO0O0(objArr.length, size));
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                OooO0Oo((Map.Entry) it.next());
            }
            return this;
        }
    }

    public static abstract class OooO0O0<K, V> extends ImmutableMap<K, V> {

        public class OooO00o extends o000OO00<K, V> {
            public OooO00o() {
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            /* JADX INFO: renamed from: OooO0oo */
            public final o0OO0<Map.Entry<K, V>> iterator() {
                return OooO0O0.this.OooOO0O();
            }

            @Override // com.google.common.collect.o000OO00
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
            return new o000OOo0(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableCollection<V> OooO0o0() {
            return new o00(this);
        }

        public abstract o00000OO OooOO0O();

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

    public static class OooO0OO<K, V> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object[] f18698OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Object[] f18699OooO0o0;

        public OooO0OO(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            o0OO0<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.f18698OooO0Oo = objArr;
            this.f18699OooO0o0 = objArr2;
        }

        public OooO00o<K, V> OooO00o(int i) {
            return new OooO00o<>(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f18698OooO0Oo;
            boolean z = objArr instanceof ImmutableSet;
            Object[] objArr2 = this.f18699OooO0o0;
            if (!z) {
                OooO00o<K, V> OooO00o2 = OooO00o(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    OooO00o2.OooO0OO(objArr[i], objArr2[i]);
                }
                return OooO00o2.OooO0O0();
            }
            ImmutableSet immutableSet = (ImmutableSet) objArr;
            OooO00o<K, V> OooO00o3 = OooO00o(immutableSet.size());
            Iterator it = immutableSet.iterator();
            o0OO0 it2 = ((ImmutableCollection) objArr2).iterator();
            while (it.hasNext()) {
                OooO00o3.OooO0OO(it.next(), it2.next());
            }
            return OooO00o3.OooO0O0();
        }
    }

    public static o0OoO00O OooO(Object obj, Object obj2) {
        oo000o.OooO00o(obj, obj2);
        return o0OoO00O.OooOO0O(1, new Object[]{obj, obj2}, null);
    }

    public static <K, V> OooO00o<K, V> OooO00o() {
        return new OooO00o<>(4);
    }

    public static <K, V> ImmutableMap<K, V> OooO0O0(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.OooO0oO()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        OooO00o oooO00o = new OooO00o(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        oooO00o.OooO0o0(setEntrySet);
        return oooO00o.OooO00o(true);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> OooO0OO();

    public abstract ImmutableSet<K> OooO0Oo();

    @Override // java.util.Map
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f18688OooO0Oo;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetOooO0OO = OooO0OO();
        this.f18688OooO0Oo = immutableSetOooO0OO;
        return immutableSetOooO0OO;
    }

    public abstract ImmutableCollection<V> OooO0o0();

    public abstract boolean OooO0oO();

    @Override // java.util.Map
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f18690OooO0o0;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetOooO0Oo = OooO0Oo();
        this.f18690OooO0o0 = immutableSetOooO0Oo;
        return immutableSetOooO0Oo;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f18689OooO0o;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionOooO0o0 = OooO0o0();
        this.f18689OooO0o = immutableCollectionOooO0o0;
        return immutableCollectionOooO0o0;
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return o0O0O0Oo.OooO0OO(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        oo000o.OooO0O0(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    Object writeReplace() {
        return new OooO0OO(this);
    }
}
