package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class OooOOO<K, V> implements o00OO<K, V> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient Collection<Map.Entry<K, V>> f19349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient Collection<V> f19350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient Set<K> f19351OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient Map<K, Collection<V>> f19352OooO0oO;

    public class OooO00o extends o00Oo00<K, V> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return OooOOO.this.OooO();
        }
    }

    public class OooO0O0 extends OooOOO<K, V>.OooO00o implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return o0O0O0Oo.OooO00o(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return o0O0O0Oo.OooO0OO(this);
        }
    }

    public class OooO0OO extends AbstractCollection<V> {
        public OooO0OO() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            OooOOO.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return OooOOO.this.OooO0Oo(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return OooOOO.this.OooOO0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return OooOOO.this.size();
        }
    }

    public abstract Iterator<Map.Entry<K, V>> OooO();

    @Override // com.google.common.collect.o00OO
    public Map<K, Collection<V>> OooO0O0() {
        Map<K, Collection<V>> map = this.f19352OooO0oO;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapOooO0o0 = OooO0o0();
        this.f19352OooO0oO = mapOooO0o0;
        return mapOooO0o0;
    }

    public final boolean OooO0OO(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection = OooO0O0().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean OooO0Oo(@CheckForNull Object obj) {
        Iterator<Collection<V>> it = OooO0O0().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Collection<Map.Entry<K, V>> OooO0o();

    public abstract Map<K, Collection<V>> OooO0o0();

    public abstract Set<K> OooO0oO();

    public Collection<Map.Entry<K, V>> OooO0oo() {
        Collection<Map.Entry<K, V>> collection = this.f19349OooO0Oo;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionOooO0o = OooO0o();
        this.f19349OooO0Oo = collectionOooO0o;
        return collectionOooO0o;
    }

    public Iterator<V> OooOO0() {
        return new o00OO00O(OooO0oo().iterator());
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00OO) {
            return OooO0O0().equals(((o00OO) obj).OooO0O0());
        }
        return false;
    }

    public final int hashCode() {
        return OooO0O0().hashCode();
    }

    @Override // com.google.common.collect.o00OO
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.o00OO
    public Set<K> keySet() {
        Set<K> set = this.f19351OooO0o0;
        if (set != null) {
            return set;
        }
        Set<K> setOooO0oO = OooO0oO();
        this.f19351OooO0o0 = setOooO0oO;
        return setOooO0oO;
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection = OooO0O0().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return OooO0O0().toString();
    }
}
