package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o0OoOo0<R, C, V> implements o0O<R, C, V> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient Set<o0O.OooO00o<R, C, V>> f19640OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient Collection<V> f19641OooO0o0;

    public class OooO00o extends AbstractSet<o0O.OooO00o<R, C, V>> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o0OoOo0.this.OooO0Oo();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            boolean zContains;
            if (!(obj instanceof o0O.OooO00o)) {
                return false;
            }
            o0O.OooO00o oooO00o = (o0O.OooO00o) obj;
            Map map = (Map) oo0O.OooO0OO(oooO00o.OooO00o(), o0OoOo0.this.OooO0O0());
            if (map == null) {
                return false;
            }
            Set setEntrySet = map.entrySet();
            o000O0O0 o000o0o1 = new o000O0O0(oooO00o.OooO0O0(), oooO00o.getValue());
            setEntrySet.getClass();
            try {
                zContains = setEntrySet.contains(o000o0o1);
            } catch (ClassCastException | NullPointerException unused) {
                zContains = false;
            }
            return zContains;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<o0O.OooO00o<R, C, V>> iterator() {
            return o0OoOo0.this.OooO0OO();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            boolean zRemove;
            if (!(obj instanceof o0O.OooO00o)) {
                return false;
            }
            o0O.OooO00o oooO00o = (o0O.OooO00o) obj;
            Map map = (Map) oo0O.OooO0OO(oooO00o.OooO00o(), o0OoOo0.this.OooO0O0());
            if (map == null) {
                return false;
            }
            Set setEntrySet = map.entrySet();
            o000O0O0 o000o0o1 = new o000O0O0(oooO00o.OooO0O0(), oooO00o.getValue());
            Set set = setEntrySet;
            set.getClass();
            try {
                zRemove = set.remove(o000o0o1);
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

    @Override // com.google.common.collect.o0O
    public Set<o0O.OooO00o<R, C, V>> OooO00o() {
        Set<o0O.OooO00o<R, C, V>> set = this.f19640OooO0Oo;
        if (set != null) {
            return set;
        }
        Set<o0O.OooO00o<R, C, V>> setOooO0o0 = OooO0o0();
        this.f19640OooO0Oo = setOooO0o0;
        return setOooO0o0;
    }

    public abstract Iterator<o0O.OooO00o<R, C, V>> OooO0OO();

    public void OooO0Oo() {
        o00O0O0O.OooO0O0(OooO00o().iterator());
    }

    @CheckForNull
    public V OooO0o(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) oo0O.OooO0OO(obj, OooO0O0());
        if (map != null) {
            try {
                return (V) map.get(obj2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return null;
    }

    public Set<o0O.OooO00o<R, C, V>> OooO0o0() {
        return new OooO00o();
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O) {
            return OooO00o().equals(((o0O) obj).OooO00o());
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
