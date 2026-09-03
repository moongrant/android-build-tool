package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class o00O000o<E> extends ImmutableSet<E> {

    public class OooO00o extends ImmutableList<E> {
        public OooO00o() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return o00O000o.this.OooO0oo();
        }

        @Override // java.util.List
        public final E get(int i) {
            return (E) o00O000o.this.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return o00O000o.this.size();
        }
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO */
    public o0O0o000<E> iterator() {
        return OooO00o().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public final int OooO0O0(Object[] objArr) {
        return OooO00o().OooO0O0(objArr);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList<E> OooOOO0() {
        return new OooO00o();
    }

    public abstract E get(int i);
}
