package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class o000OOo0<K, V> extends o00O00<K> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ImmutableMap<K, V> f19450OooO0oO;

    @GwtIncompatible
    public static class OooO00o<K> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImmutableMap<K, ?> f19451OooO0Oo;

        public OooO00o(ImmutableMap<K, ?> immutableMap) {
            this.f19451OooO0Oo = immutableMap;
        }

        public Object readResolve() {
            return this.f19451OooO0Oo.keySet();
        }
    }

    public o000OOo0(ImmutableMap<K, V> immutableMap) {
        this.f19450OooO0oO = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        return true;
    }

    @Override // com.google.common.collect.o00O00, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO0oo */
    public final o0OO0<K> iterator() {
        return new o000O(this.f19450OooO0oO.entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f19450OooO0oO.containsKey(obj);
    }

    @Override // com.google.common.collect.o00O00
    public final K get(int i) {
        return this.f19450OooO0oO.entrySet().OooO00o().get(i).getKey();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19450OooO0oO.size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new OooO00o(this.f19450OooO0oO);
    }
}
