package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class OooOOO<K, V> implements o00OO0O0<K, V> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Collection<Map.Entry<K, V>> f18357Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<K> f18358Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Map<K, Collection<V>> f18359Oooo0oo;

    public class OooO00o extends oo0O<K, V> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return OooOOO.this.OooO0o();
        }
    }

    public class OooO0O0 extends OooOOO<K, V>.OooO00o implements Set<Map.Entry<K, V>> {
        public OooO0O0(OooOOO oooOOO) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@NullableDecl Object obj) {
            return o0O00O0o.OooO00o(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return o0O00O0o.OooO0O0(this);
        }
    }

    @Override // com.google.common.collect.o00OO0O0
    public Map<K, Collection<V>> OooO0O0() {
        Map<K, Collection<V>> map = this.f18359Oooo0oo;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapOooO0Oo = OooO0Oo();
        this.f18359Oooo0oo = mapOooO0Oo;
        return mapOooO0Oo;
    }

    public final boolean OooO0OO(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = OooO0O0().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public abstract Map<K, Collection<V>> OooO0Oo();

    public abstract Iterator<Map.Entry<K, V>> OooO0o();

    public abstract Set<K> OooO0o0();

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00OO0O0) {
            return OooO0O0().equals(((o00OO0O0) obj).OooO0O0());
        }
        return false;
    }

    public final int hashCode() {
        return OooO0O0().hashCode();
    }

    @Override // com.google.common.collect.o00OO0O0
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.o00OO0O0
    public Set<K> keySet() {
        Set<K> set = this.f18358Oooo0oO;
        if (set != null) {
            return set;
        }
        Set<K> setOooO0o0 = OooO0o0();
        this.f18358Oooo0oO = setOooO0o0;
        return setOooO0o0;
    }

    @Override // com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = OooO0O0().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return OooO0O0().toString();
    }
}
