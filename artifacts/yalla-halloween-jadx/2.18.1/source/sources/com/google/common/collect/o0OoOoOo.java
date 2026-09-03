package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o0OoOoOo<R, C, V> extends ImmutableTable<R, C, V> {

    public final class OooO00o extends o00O000o<o0O0O0o0.OooO00o<R, C, V>> {
        public OooO00o() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof o0O0O0o0.OooO00o)) {
                return false;
            }
            o0O0O0o0.OooO00o oooO00o = (o0O0O0o0.OooO00o) obj;
            V vOooO0o0 = o0OoOoOo.this.OooO0o0(oooO00o.OooO0O0(), oooO00o.OooO00o());
            return vOooO0o0 != null && vOooO0o0.equals(oooO00o.getValue());
        }

        @Override // com.google.common.collect.o00O000o
        public final Object get(int i) {
            return o0OoOoOo.this.OooOOOo(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o0OoOoOo.this.size();
        }
    }

    public final class OooO0O0 extends ImmutableList<V> {
        public OooO0O0() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return true;
        }

        @Override // java.util.List
        public final V get(int i) {
            return (V) o0OoOoOo.this.OooOOo0(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return o0OoOoOo.this.size();
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0O0O0o0
    public /* bridge */ /* synthetic */ Map OooO0O0() {
        return OooO0O0();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0OoOo0
    /* JADX INFO: renamed from: OooOO0 */
    public final ImmutableSet<o0O0O0o0.OooO00o<R, C, V>> OooO0Oo() {
        if (!(size() == 0)) {
            return new OooO00o();
        }
        int i = ImmutableSet.f18204Oooo0oo;
        return o0O0000O.f18593OoooOO0;
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: OooOO0o */
    public final ImmutableCollection<V> OooOOO0() {
        if (!(size() == 0)) {
            return new OooO0O0();
        }
        OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        return o0.f18399OoooO00;
    }

    public final void OooOOOO(R r, C c, V v, V v2) {
        if (!(v == null)) {
            throw new IllegalArgumentException(o0OOOO0o.o000oOoO.OooO00o("Duplicate key: (row=%s, column=%s), values: [%s, %s].", r, c, v2, v));
        }
    }

    public abstract o0O0O0o0.OooO00o<R, C, V> OooOOOo(int i);

    public abstract V OooOOo0(int i);
}
