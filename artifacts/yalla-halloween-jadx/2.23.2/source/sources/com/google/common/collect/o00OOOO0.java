package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOOO0<K, V> extends oo0O.OooOO0O<K, Collection<V>> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Weak
    public final o00OO<K, V> f19052OooO0oO;

    public class OooO00o extends oo0O.OooO0O0<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.o00OOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0231OooO00o implements com.google.common.base.OooOOO<K, Collection<V>> {
            public C0231OooO00o() {
            }

            @Override // com.google.common.base.OooOOO
            public final Object apply(@ParametricNullness Object obj) {
                return o00OOOO0.this.f19052OooO0oO.get(obj);
            }
        }

        public OooO00o() {
        }

        @Override // com.google.common.collect.oo0O.OooO0O0
        public final Map<K, Collection<V>> OooO0Oo() {
            return o00OOOO0.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
            Set<K> setKeySet = o00OOOO0.this.f19052OooO0oO.keySet();
            return new o00OO0O0(setKeySet.iterator(), new C0231OooO00o());
        }

        @Override // com.google.common.collect.oo0O.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Objects.requireNonNull(entry);
            o00OOOO0.this.f19052OooO0oO.keySet().remove(entry.getKey());
            return true;
        }
    }

    public o00OOOO0(o00OO<K, V> o00oo2) {
        o00oo2.getClass();
        this.f19052OooO0oO = o00oo2;
    }

    @Override // com.google.common.collect.oo0O.OooOO0O
    public final Set<Map.Entry<K, Collection<V>>> OooO00o() {
        return new OooO00o();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f19052OooO0oO.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return this.f19052OooO0oO.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        if (containsKey(obj)) {
            return this.f19052OooO0oO.get(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.f19052OooO0oO.isEmpty();
    }

    @Override // com.google.common.collect.oo0O.OooOO0O, java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return this.f19052OooO0oO.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        if (containsKey(obj)) {
            return this.f19052OooO0oO.OooO0o0(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19052OooO0oO.keySet().size();
    }
}
