package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0OO<K, V> extends o00OO00O.OooOO0O<K, Collection<V>> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Weak
    public final o00OO0O0<K, V> f18544Oooo;

    public class OooO00o extends o00OO00O.OooO0O0<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.o00OO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0124OooO00o implements o0OOOO0o.OooO<K, Collection<V>> {
            public C0124OooO00o() {
            }

            @Override // o0OOOO0o.OooO
            public final Object apply(Object obj) {
                return o00OO0OO.this.f18544Oooo.get(obj);
            }
        }

        public OooO00o() {
        }

        @Override // com.google.common.collect.o00OO00O.OooO0O0
        public final Map<K, Collection<V>> OooO0o0() {
            return o00OO0OO.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
            Set<K> setKeySet = o00OO0OO.this.f18544Oooo.keySet();
            return new o00O(setKeySet.iterator(), new C0124OooO00o());
        }

        @Override // com.google.common.collect.o00OO00O.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            o00OO0OO o00oo0oo = o00OO0OO.this;
            o00oo0oo.f18544Oooo.keySet().remove(((Map.Entry) obj).getKey());
            return true;
        }
    }

    public o00OO0OO(o00OO0O0<K, V> o00oo0o1) {
        Objects.requireNonNull(o00oo0o1);
        this.f18544Oooo = o00oo0o1;
    }

    @Override // com.google.common.collect.o00OO00O.OooOO0O
    public final Set<Map.Entry<K, Collection<V>>> OooO00o() {
        return new OooO00o();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f18544Oooo.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f18544Oooo.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (containsKey(obj)) {
            return this.f18544Oooo.get(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.f18544Oooo.isEmpty();
    }

    @Override // com.google.common.collect.o00OO00O.OooOO0O, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set<K> keySet() {
        return this.f18544Oooo.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return this.f18544Oooo.OooO00o(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18544Oooo.keySet().size();
    }
}
