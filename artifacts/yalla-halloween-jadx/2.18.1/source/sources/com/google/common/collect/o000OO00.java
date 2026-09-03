package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o000OO00<K, V> extends o00O000o<K> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ImmutableMap<K, V> f18452Oooo;

    @GwtIncompatible
    public static class OooO00o<K> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ImmutableMap<K, ?> f18453Oooo0o;

        public OooO00o(ImmutableMap<K, ?> immutableMap) {
            this.f18453Oooo0o = immutableMap;
        }

        public Object readResolve() {
            return this.f18453Oooo0o.keySet();
        }
    }

    public o000OO00(ImmutableMap<K, V> immutableMap) {
        this.f18452Oooo = immutableMap;
    }

    @Override // com.google.common.collect.o00O000o, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO */
    public final o0O0o000<K> iterator() {
        return new o000O0O0(this.f18452Oooo.entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.f18452Oooo.containsKey(obj);
    }

    @Override // com.google.common.collect.o00O000o
    public final K get(int i) {
        return this.f18452Oooo.entrySet().OooO00o().get(i).getKey();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18452Oooo.size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new OooO00o(this.f18452Oooo);
    }
}
