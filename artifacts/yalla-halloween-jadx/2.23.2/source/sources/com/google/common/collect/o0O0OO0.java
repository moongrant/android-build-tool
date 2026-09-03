package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class o0O0OO0<R, C, V> extends ImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final R f19106OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C f19107OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final V f19108OooO0oo;

    public o0O0OO0(R r, C c, V v) {
        r.getClass();
        this.f19106OooO0o = r;
        c.getClass();
        this.f19107OooO0oO = c;
        v.getClass();
        this.f19108OooO0oo = v;
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap<C, Map<R, V>> OooOO0() {
        return ImmutableMap.OooO(this.f19107OooO0oO, ImmutableMap.OooO(this.f19106OooO0o, this.f19108OooO0oo));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0OoOo0
    /* JADX INFO: renamed from: OooOO0O */
    public final ImmutableSet<o0O.OooO00o<R, C, V>> OooO0o0() {
        o0OO000o o0oo000oOooO0oO = ImmutableTable.OooO0oO(this.f19106OooO0o, this.f19107OooO0oO, this.f19108OooO0oo);
        int i = ImmutableSet.f18718OooO0o;
        return new o0O0O0o0(o0oo000oOooO0oO);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableTable.OooO00o OooOO0o() {
        return ImmutableTable.OooO00o.OooO00o(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: OooOOO0 */
    public final ImmutableCollection<V> OooOOO() {
        int i = ImmutableSet.f18718OooO0o;
        return new o0O0O0o0(this.f19108OooO0oo);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0O
    /* JADX INFO: renamed from: OooOOOo */
    public final ImmutableMap<R, Map<C, V>> OooO0O0() {
        return ImmutableMap.OooO(this.f19106OooO0o, ImmutableMap.OooO(this.f19107OooO0oO, this.f19108OooO0oo));
    }

    @Override // com.google.common.collect.o0O
    public final int size() {
        return 1;
    }
}
