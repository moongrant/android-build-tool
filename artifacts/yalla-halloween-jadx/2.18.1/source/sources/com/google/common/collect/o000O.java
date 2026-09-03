package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class o000O<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @GwtIncompatible
    public static class OooO00o<K, V> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ImmutableMap<K, V> f18443Oooo0o;

        public OooO00o(ImmutableMap<K, V> immutableMap) {
            this.f18443Oooo0o = immutableMap;
        }

        public Object readResolve() {
            return this.f18443Oooo0o.entrySet();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return OooOOOo().OooO0oo();
    }

    @Override // com.google.common.collect.ImmutableSet
    @GwtIncompatible
    public final boolean OooOOOO() {
        Objects.requireNonNull(OooOOOo());
        return false;
    }

    public abstract ImmutableMap<K, V> OooOOOo();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
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

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
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
