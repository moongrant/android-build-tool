package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class o000OO00<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @GwtIncompatible
    public static class OooO00o<K, V> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImmutableMap<K, V> f19445OooO0Oo;

        public OooO00o(ImmutableMap<K, V> immutableMap) {
            this.f19445OooO0Oo = immutableMap;
        }

        public Object readResolve() {
            return this.f19445OooO0Oo.entrySet();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        return OooOOOo().OooO0oO();
    }

    @Override // com.google.common.collect.ImmutableSet
    @GwtIncompatible
    public final boolean OooOOO() {
        OooOOOo().getClass();
        return false;
    }

    public abstract ImmutableMap<K, V> OooOOOo();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v = OooOOOo().get(entry.getKey());
        return v != null && v.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return OooOOOo().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return OooOOOo().size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new OooO00o(OooOOOo());
    }
}
