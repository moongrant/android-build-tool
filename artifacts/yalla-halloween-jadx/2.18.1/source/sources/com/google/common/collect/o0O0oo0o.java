package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public class o0O0oo0o<R, C, V> extends o0OoOo0<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @GwtTransient
    public final o0OOOO0o.o0OoOo0<? extends Map<C, V>> f18632Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @GwtTransient
    public final Map<R, Map<C, V>> f18633Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Map<R, Map<C, V>> f18634OoooO00;

    public class OooO00o implements Iterator<o0O0O0o0.OooO00o<R, C, V>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Iterator<Map.Entry<R, Map<C, V>>> f18635Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NullableDecl
        public Map.Entry<R, Map<C, V>> f18636Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Iterator<Map.Entry<C, V>> f18637Oooo0oo = o00O0.OooO0O0.INSTANCE;

        public OooO00o(o0O0oo0o o0o0oo0o) {
            this.f18635Oooo0o = o0o0oo0o.f18633Oooo0oo.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18635Oooo0o.hasNext() || this.f18637Oooo0oo.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f18637Oooo0oo.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f18635Oooo0o.next();
                this.f18636Oooo0oO = next;
                this.f18637Oooo0oo = next.getValue().entrySet().iterator();
            }
            Map.Entry<C, V> next2 = this.f18637Oooo0oo.next();
            return new o0O0OOO0(this.f18636Oooo0oO.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f18637Oooo0oo.remove();
            if (this.f18636Oooo0oO.getValue().isEmpty()) {
                this.f18635Oooo0o.remove();
                this.f18636Oooo0oO = null;
            }
        }
    }

    public class OooO0O0 extends o00OO00O.OooO0OO<C, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final R f18638Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NullableDecl
        public Map<C, V> f18639Oooo0oO;

        public class OooO00o implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Iterator f18641Oooo0o;

            public OooO00o(Iterator it) {
                this.f18641Oooo0o = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f18641Oooo0o.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                Map.Entry entry = (Map.Entry) this.f18641Oooo0o.next();
                Objects.requireNonNull(oooO0O0);
                return new o0O0O0Oo(entry);
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f18641Oooo0o.remove();
                OooO0O0.this.OooO0Oo();
            }
        }

        public OooO0O0(R r) {
            Objects.requireNonNull(r);
            this.f18638Oooo0o = r;
        }

        @Override // com.google.common.collect.o00OO00O.OooO0OO
        public final Iterator<Map.Entry<C, V>> OooO00o() {
            Map<C, V> mapOooO0O0 = OooO0O0();
            return mapOooO0O0 == null ? o00O0.OooO0O0.INSTANCE : new OooO00o(mapOooO0O0.entrySet().iterator());
        }

        public Map<C, V> OooO0O0() {
            Map<C, V> map = this.f18639Oooo0oO;
            if (map != null && (!map.isEmpty() || !o0O0oo0o.this.f18633Oooo0oo.containsKey(this.f18638Oooo0o))) {
                return this.f18639Oooo0oO;
            }
            Map<C, V> mapOooO0OO = OooO0OO();
            this.f18639Oooo0oO = mapOooO0OO;
            return mapOooO0OO;
        }

        public Map<C, V> OooO0OO() {
            return o0O0oo0o.this.f18633Oooo0oo.get(this.f18638Oooo0o);
        }

        public void OooO0Oo() {
            if (OooO0O0() == null || !this.f18639Oooo0oO.isEmpty()) {
                return;
            }
            o0O0oo0o.this.f18633Oooo0oo.remove(this.f18638Oooo0o);
            this.f18639Oooo0oO = null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            Map<C, V> mapOooO0O0 = OooO0O0();
            if (mapOooO0O0 != null) {
                mapOooO0O0.clear();
            }
            OooO0Oo();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            Map<C, V> mapOooO0O0 = OooO0O0();
            if (obj == null || mapOooO0O0 == null) {
                return false;
            }
            try {
                zContainsKey = mapOooO0O0.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                zContainsKey = false;
            }
            return zContainsKey;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V get(Object obj) {
            Map<C, V> mapOooO0O0 = OooO0O0();
            if (obj == null || mapOooO0O0 == null) {
                return null;
            }
            try {
                return mapOooO0O0.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
            Objects.requireNonNull(c);
            Objects.requireNonNull(v);
            Map<C, V> map = this.f18639Oooo0oO;
            if (map != null && !map.isEmpty()) {
                return this.f18639Oooo0oO.put(c, v);
            }
            o0O0oo0o o0o0oo0o = o0O0oo0o.this;
            R r = this.f18638Oooo0o;
            Objects.requireNonNull(o0o0oo0o);
            Objects.requireNonNull(r);
            Map<C, V> map2 = o0o0oo0o.f18633Oooo0oo.get(r);
            if (map2 == null) {
                map2 = o0o0oo0o.f18632Oooo.get();
                o0o0oo0o.f18633Oooo0oo.put(r, map2);
            }
            return map2.put(c, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V remove(Object obj) {
            Map<C, V> mapOooO0O0 = OooO0O0();
            V vRemove = null;
            if (mapOooO0O0 == null) {
                return null;
            }
            try {
                vRemove = mapOooO0O0.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            OooO0Oo();
            return vRemove;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            Map<C, V> mapOooO0O0 = OooO0O0();
            if (mapOooO0O0 == null) {
                return 0;
            }
            return mapOooO0O0.size();
        }
    }

    public class OooO0OO extends o00OO00O.OooOO0O<R, Map<C, V>> {

        public class OooO00o extends o0O0oo0o<R, C, V>.OooO0o<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.o0O0oo0o$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0126OooO00o implements o0OOOO0o.OooO<R, Map<C, V>> {
                public C0126OooO00o() {
                }

                @Override // o0OOOO0o.OooO
                public final Object apply(Object obj) {
                    return o0O0oo0o.this.OooO0oo(obj);
                }
            }

            public OooO00o() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && o00oO0o.OooO0O0(o0O0oo0o.this.f18633Oooo0oo.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                Set<R> setKeySet = o0O0oo0o.this.f18633Oooo0oo.keySet();
                return new o00O(setKeySet.iterator(), new C0126OooO00o());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && o0O0oo0o.this.f18633Oooo0oo.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return o0O0oo0o.this.f18633Oooo0oo.size();
            }
        }

        public OooO0OO() {
        }

        @Override // com.google.common.collect.o00OO00O.OooOO0O
        public final Set<Map.Entry<R, Map<C, V>>> OooO00o() {
            return new OooO00o();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return o0O0oo0o.this.OooO0o(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            if (o0O0oo0o.this.OooO0o(obj)) {
                return o0O0oo0o.this.OooO0oo(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return o0O0oo0o.this.f18633Oooo0oo.remove(obj);
        }
    }

    public abstract class OooO0o<T> extends o0O00O0o.OooO00o<T> {
        public OooO0o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o0O0oo0o.this.f18633Oooo0oo.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return o0O0oo0o.this.f18633Oooo0oo.isEmpty();
        }
    }

    public o0O0oo0o(Map<R, Map<C, V>> map, o0OOOO0o.o0OoOo0<? extends Map<C, V>> o0oooo1) {
        this.f18633Oooo0oo = map;
        this.f18632Oooo = o0oooo1;
    }

    @Override // com.google.common.collect.o0OoOo0, com.google.common.collect.o0O0O0o0
    public final Set<o0O0O0o0.OooO00o<R, C, V>> OooO00o() {
        return super.OooO00o();
    }

    @Override // com.google.common.collect.o0O0O0o0
    public Map<R, Map<C, V>> OooO0O0() {
        Map<R, Map<C, V>> map = this.f18634OoooO00;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapOooO0oO = OooO0oO();
        this.f18634OoooO00 = mapOooO0oO;
        return mapOooO0oO;
    }

    @Override // com.google.common.collect.o0OoOo0
    public final Iterator<o0O0O0o0.OooO00o<R, C, V>> OooO0OO() {
        return new OooO00o(this);
    }

    public boolean OooO0o(@NullableDecl Object obj) {
        return obj != null && o00OO00O.OooO0OO(this.f18633Oooo0oo, obj);
    }

    public Map<R, Map<C, V>> OooO0oO() {
        return new OooO0OO();
    }

    public Map<C, V> OooO0oo(R r) {
        return new OooO0O0(r);
    }

    @Override // com.google.common.collect.o0OoOo0
    public final void clear() {
        this.f18633Oooo0oo.clear();
    }

    @Override // com.google.common.collect.o0O0O0o0
    public final int size() {
        Iterator<Map<C, V>> it = this.f18633Oooo0oo.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }
}
