package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o0OoOo0<R, C, V> implements o0O0O0o0<R, C, V> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<o0O0O0o0.OooO00o<R, C, V>> f18671Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Collection<V> f18672Oooo0oO;

    public class OooO00o extends AbstractSet<o0O0O0o0.OooO00o<R, C, V>> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o0OoOo0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof o0O0O0o0.OooO00o)) {
                return false;
            }
            o0O0O0o0.OooO00o oooO00o = (o0O0O0o0.OooO00o) obj;
            Map map = (Map) o00OO00O.OooO0Oo(o0OoOo0.this.OooO0O0(), oooO00o.OooO0O0());
            return map != null && o00oO0o.OooO0O0(map.entrySet(), new o000OO0O(oooO00o.OooO00o(), oooO00o.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<o0O0O0o0.OooO00o<R, C, V>> iterator() {
            return o0OoOo0.this.OooO0OO();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@NullableDecl Object obj) {
            boolean zRemove;
            if (!(obj instanceof o0O0O0o0.OooO00o)) {
                return false;
            }
            o0O0O0o0.OooO00o oooO00o = (o0O0O0o0.OooO00o) obj;
            Map map = (Map) o00OO00O.OooO0Oo(o0OoOo0.this.OooO0O0(), oooO00o.OooO0O0());
            if (map == null) {
                return false;
            }
            Set setEntrySet = map.entrySet();
            o000OO0O o000oo0o2 = new o000OO0O(oooO00o.OooO00o(), oooO00o.getValue());
            Objects.requireNonNull(setEntrySet);
            try {
                zRemove = setEntrySet.remove(o000oo0o2);
            } catch (ClassCastException | NullPointerException unused) {
                zRemove = false;
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o0OoOo0.this.size();
        }
    }

    @Override // com.google.common.collect.o0O0O0o0
    public Set<o0O0O0o0.OooO00o<R, C, V>> OooO00o() {
        Set<o0O0O0o0.OooO00o<R, C, V>> set = this.f18671Oooo0o;
        if (set != null) {
            return set;
        }
        Set<o0O0O0o0.OooO00o<R, C, V>> setOooO0Oo = OooO0Oo();
        this.f18671Oooo0o = setOooO0Oo;
        return setOooO0Oo;
    }

    public abstract Iterator<o0O0O0o0.OooO00o<R, C, V>> OooO0OO();

    public Set<o0O0O0o0.OooO00o<R, C, V>> OooO0Oo() {
        return new OooO00o();
    }

    public V OooO0o0(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map = (Map) o00OO00O.OooO0Oo(OooO0O0(), obj);
        if (map != null) {
            try {
                return (V) map.get(obj2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return null;
    }

    public void clear() {
        o00O0.OooO0O0(OooO00o().iterator());
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O0O0o0) {
            return OooO00o().equals(((o0O0O0o0) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    public final String toString() {
        return OooO0O0().toString();
    }
}
