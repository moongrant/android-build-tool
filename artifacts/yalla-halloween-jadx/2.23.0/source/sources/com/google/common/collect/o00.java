package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class o00<K, V> extends ImmutableCollection<V> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ImmutableMap<K, V> f19390OooO0o0;

    public class OooO00o extends o0OO0<V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0OO0<Map.Entry<K, V>> f19391OooO0Oo;

        public OooO00o(o00 o00Var) {
            this.f19391OooO0Oo = o00Var.f19390OooO0o0.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19391OooO0Oo.hasNext();
        }

        @Override // java.util.Iterator
        public final V next() {
            return this.f19391OooO0Oo.next().getValue();
        }
    }

    public class OooO0O0 extends ImmutableList<V> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ImmutableList f19392OooO0o;

        public OooO0O0(ImmutableList immutableList) {
            this.f19392OooO0o = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return true;
        }

        @Override // java.util.List
        public final V get(int i) {
            return (V) ((Map.Entry) this.f19392OooO0o.get(i)).getValue();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f19392OooO0o.size();
        }
    }

    @GwtIncompatible
    public static class OooO0OO<V> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImmutableMap<?, V> f19393OooO0Oo;

        public OooO0OO(ImmutableMap<?, V> immutableMap) {
            this.f19393OooO0Oo = immutableMap;
        }

        public Object readResolve() {
            return this.f19393OooO0Oo.values();
        }
    }

    public o00(ImmutableMap<K, V> immutableMap) {
        this.f19390OooO0o0 = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList<V> OooO00o() {
        return new OooO0O0(this.f19390OooO0o0.entrySet().OooO00o());
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: OooO0oo */
    public final o0OO0<V> iterator() {
        return new OooO00o(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return obj != null && o00O0O0O.OooO0OO(obj, new OooO00o(this));
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new OooO00o(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f19390OooO0o0.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new OooO0OO(this.f19390OooO0o0);
    }
}
