package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o000OOo0<K, V> extends ImmutableCollection<V> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ImmutableMap<K, V> f18460Oooo0oO;

    public class OooO00o extends o0O0o000<V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0O0o000<Map.Entry<K, V>> f18461Oooo0o;

        public OooO00o(o000OOo0 o000ooo1) {
            this.f18461Oooo0o = o000ooo1.f18460Oooo0oO.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18461Oooo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final V next() {
            return this.f18461Oooo0o.next().getValue();
        }
    }

    public class OooO0O0 extends ImmutableList<V> {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ ImmutableList f18462Oooo0oo;

        public OooO0O0(ImmutableList immutableList) {
            this.f18462Oooo0oo = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return true;
        }

        @Override // java.util.List
        public final V get(int i) {
            return (V) ((Map.Entry) this.f18462Oooo0oo.get(i)).getValue();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18462Oooo0oo.size();
        }
    }

    @GwtIncompatible
    public static class OooO0OO<V> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ImmutableMap<?, V> f18463Oooo0o;

        public OooO0OO(ImmutableMap<?, V> immutableMap) {
            this.f18463Oooo0o = immutableMap;
        }

        public Object readResolve() {
            return this.f18463Oooo0o.values();
        }
    }

    public o000OOo0(ImmutableMap<K, V> immutableMap) {
        this.f18460Oooo0oO = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: OooO */
    public final o0O0o000<V> iterator() {
        return new OooO00o(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList<V> OooO00o() {
        return new OooO0O0(this.f18460Oooo0oO.entrySet().OooO00o());
    }

    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        boolean z;
        if (obj != null) {
            o0O0o000<Map.Entry<K, V>> it = this.f18460Oooo0oO.entrySet().iterator();
            while (it.hasNext()) {
                if (obj.equals(it.next().getValue())) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new OooO00o(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18460Oooo0oO.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new OooO0OO(this.f18460Oooo0oO);
    }
}
