package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class o00O00<E> extends ImmutableSet<E> {

    public class OooO00o extends ImmutableList<E> {
        public OooO00o() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return o00O00.this.OooO0o();
        }

        @Override // java.util.List
        public final E get(int i) {
            return (E) o00O00.this.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return o00O00.this.size();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public final int OooO0O0(int i, Object[] objArr) {
        return OooO00o().OooO0O0(i, objArr);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO0oo */
    public o0OO0<E> iterator() {
        return OooO00o().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList<E> OooOOO0() {
        return new OooO00o();
    }

    public abstract E get(int i);
}
