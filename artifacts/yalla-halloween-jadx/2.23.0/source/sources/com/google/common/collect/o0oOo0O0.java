package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class o0oOo0O0<R, C, V> extends o0OoOo0<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GwtTransient
    public final Map<R, Map<C, V>> f19649OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GwtTransient
    public final com.google.common.base.o0O0O00<? extends Map<C, V>> f19650OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @CheckForNull
    public transient Map<R, Map<C, V>> f19651OooO0oo;

    public class OooO00o implements Iterator<o0O.OooO00o<R, C, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Iterator<Map.Entry<R, Map<C, V>>> f19652OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Iterator<Map.Entry<C, V>> f19653OooO0o = o00O0O0O.OooO00o.INSTANCE;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public Map.Entry<R, Map<C, V>> f19654OooO0o0;

        public OooO00o(o0oOo0O0 o0ooo0o1) {
            this.f19652OooO0Oo = o0ooo0o1.f19649OooO0o.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19652OooO0Oo.hasNext() || this.f19653OooO0o.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f19653OooO0o.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f19652OooO0Oo.next();
                this.f19654OooO0o0 = next;
                this.f19653OooO0o = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f19654OooO0o0);
            Map.Entry<C, V> next2 = this.f19653OooO0o.next();
            return new o0OO000o(this.f19654OooO0o0.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f19653OooO0o.remove();
            Map.Entry<R, Map<C, V>> entry = this.f19654OooO0o0;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f19652OooO0Oo.remove();
                this.f19654OooO0o0 = null;
            }
        }
    }

    public class OooO0O0 extends oo0O.OooO0OO<C, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final R f19655OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public Map<C, V> f19657OooO0o0;

        public class OooO00o implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Iterator f19658OooO0Oo;

            public OooO00o(Iterator it) {
                this.f19658OooO0Oo = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f19658OooO0Oo.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry entry = (Map.Entry) this.f19658OooO0Oo.next();
                OooO0O0.this.getClass();
                return new o0O0oo00(entry);
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f19658OooO0Oo.remove();
                OooO0O0.this.OooO0OO();
            }
        }

        public OooO0O0(R r) {
            r.getClass();
            this.f19655OooO0Oo = r;
        }

        @Override // com.google.common.collect.oo0O.OooO0OO
        public final Iterator<Map.Entry<C, V>> OooO00o() {
            OooO0Oo();
            Map<C, V> map = this.f19657OooO0o0;
            return map == null ? o00O0O0O.OooO00o.INSTANCE : new OooO00o(map.entrySet().iterator());
        }

        @CheckForNull
        public Map<C, V> OooO0O0() {
            return o0oOo0O0.this.f19649OooO0o.get(this.f19655OooO0Oo);
        }

        public void OooO0OO() {
            OooO0Oo();
            Map<C, V> map = this.f19657OooO0o0;
            if (map == null || !map.isEmpty()) {
                return;
            }
            o0oOo0O0.this.f19649OooO0o.remove(this.f19655OooO0Oo);
            this.f19657OooO0o0 = null;
        }

        public final void OooO0Oo() {
            Map<C, V> map = this.f19657OooO0o0;
            if (map == null || (map.isEmpty() && o0oOo0O0.this.f19649OooO0o.containsKey(this.f19655OooO0Oo))) {
                this.f19657OooO0o0 = OooO0O0();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            OooO0Oo();
            Map<C, V> map = this.f19657OooO0o0;
            if (map != null) {
                map.clear();
            }
            OooO0OO();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            Map<C, V> map;
            boolean zContainsKey;
            OooO0Oo();
            if (obj == null || (map = this.f19657OooO0o0) == null) {
                return false;
            }
            try {
                zContainsKey = map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                zContainsKey = false;
            }
            return zContainsKey;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final V get(@CheckForNull Object obj) {
            Map<C, V> map;
            OooO0Oo();
            if (obj == null || (map = this.f19657OooO0o0) == null) {
                return null;
            }
            return (V) oo0O.OooO0OO(obj, map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(C c, V v) {
            c.getClass();
            v.getClass();
            Map<C, V> map = this.f19657OooO0o0;
            if (map != null && !map.isEmpty()) {
                return this.f19657OooO0o0.put(c, v);
            }
            o0oOo0O0 o0ooo0o1 = o0oOo0O0.this;
            o0ooo0o1.getClass();
            R r = this.f19655OooO0Oo;
            r.getClass();
            Map<R, Map<C, V>> map2 = o0ooo0o1.f19649OooO0o;
            Map<C, V> map3 = map2.get(r);
            if (map3 == null) {
                map3 = o0ooo0o1.f19650OooO0oO.get();
                map2.put(r, map3);
            }
            return map3.put(c, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final V remove(@CheckForNull Object obj) {
            OooO0Oo();
            Map<C, V> map = this.f19657OooO0o0;
            V vRemove = null;
            if (map == null) {
                return null;
            }
            try {
                vRemove = map.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            OooO0OO();
            return vRemove;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            OooO0Oo();
            Map<C, V> map = this.f19657OooO0o0;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    public class OooO0OO extends oo0O.OooOO0O<R, Map<C, V>> {

        public class OooO00o extends o0oOo0O0<R, C, V>.OooO0o<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.o0oOo0O0$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0236OooO00o implements com.google.common.base.OooOOO0<R, Map<C, V>> {
                public C0236OooO00o() {
                }

                @Override // com.google.common.base.OooOOO0
                public final Object apply(Object obj) {
                    return o0oOo0O0.this.OooO0oo(obj);
                }
            }

            public OooO00o() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object obj) {
                boolean zContains;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map)) {
                    return false;
                }
                Set<Map.Entry<R, Map<C, V>>> setEntrySet = o0oOo0O0.this.f19649OooO0o.entrySet();
                setEntrySet.getClass();
                try {
                    zContains = setEntrySet.contains(entry);
                } catch (ClassCastException | NullPointerException unused) {
                    zContains = false;
                }
                return zContains;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                Set<R> setKeySet = o0oOo0O0.this.f19649OooO0o.keySet();
                return new o00OO0O0(setKeySet.iterator(), new C0236OooO00o());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && o0oOo0O0.this.f19649OooO0o.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return o0oOo0O0.this.f19649OooO0o.size();
            }
        }

        public OooO0OO() {
        }

        @Override // com.google.common.collect.oo0O.OooOO0O
        public final Set<Map.Entry<R, Map<C, V>>> OooO00o() {
            return new OooO00o();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            boolean zContainsKey;
            o0oOo0O0 o0ooo0o1 = o0oOo0O0.this;
            if (obj == null) {
                o0ooo0o1.getClass();
                return false;
            }
            Map<R, Map<C, V>> map = o0ooo0o1.f19649OooO0o;
            map.getClass();
            try {
                zContainsKey = map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                zContainsKey = false;
            }
            return zContainsKey;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object get(@CheckForNull Object obj) {
            boolean zContainsKey;
            o0oOo0O0 o0ooo0o1 = o0oOo0O0.this;
            boolean z = false;
            if (obj != null) {
                Map<R, Map<C, V>> map = o0ooo0o1.f19649OooO0o;
                map.getClass();
                try {
                    zContainsKey = map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    zContainsKey = false;
                }
                if (zContainsKey) {
                    z = true;
                }
            } else {
                o0ooo0o1.getClass();
            }
            if (!z) {
                return null;
            }
            Objects.requireNonNull(obj);
            return o0ooo0o1.OooO0oo(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object remove(@CheckForNull Object obj) {
            if (obj == null) {
                return null;
            }
            return o0oOo0O0.this.f19649OooO0o.remove(obj);
        }
    }

    public abstract class OooO0o<T> extends o0O0O0Oo.OooO0OO<T> {
        public OooO0o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o0oOo0O0.this.f19649OooO0o.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return o0oOo0O0.this.f19649OooO0o.isEmpty();
        }
    }

    public o0oOo0O0(Map<R, Map<C, V>> map, com.google.common.base.o0O0O00<? extends Map<C, V>> o0o0o00) {
        this.f19649OooO0o = map;
        this.f19650OooO0oO = o0o0o00;
    }

    @Override // com.google.common.collect.o0OoOo0, com.google.common.collect.o0O
    public final Set<o0O.OooO00o<R, C, V>> OooO00o() {
        return super.OooO00o();
    }

    @Override // com.google.common.collect.o0O
    public Map<R, Map<C, V>> OooO0O0() {
        Map<R, Map<C, V>> map = this.f19651OooO0oo;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapOooO0oO = OooO0oO();
        this.f19651OooO0oo = mapOooO0oO;
        return mapOooO0oO;
    }

    @Override // com.google.common.collect.o0OoOo0
    public final Iterator<o0O.OooO00o<R, C, V>> OooO0OO() {
        return new OooO00o(this);
    }

    @Override // com.google.common.collect.o0OoOo0
    public final void OooO0Oo() {
        this.f19649OooO0o.clear();
    }

    public Map<R, Map<C, V>> OooO0oO() {
        return new OooO0OO();
    }

    public Map<C, V> OooO0oo(R r) {
        return new OooO0O0(r);
    }

    @Override // com.google.common.collect.o0O
    public final int size() {
        Iterator<Map<C, V>> it = this.f19649OooO0o.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }
}
