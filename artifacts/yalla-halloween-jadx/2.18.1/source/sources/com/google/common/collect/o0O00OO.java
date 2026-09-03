package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class o0O00OO<R, C, V> extends ImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C f18608Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final R f18609Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final V f18610OoooO00;

    public o0O00OO(R r, C c, V v) {
        Objects.requireNonNull(r);
        this.f18609Oooo0oo = r;
        Objects.requireNonNull(c);
        this.f18608Oooo = c;
        Objects.requireNonNull(v);
        this.f18610OoooO00 = v;
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap<C, Map<R, V>> OooO() {
        return ImmutableMap.OooOO0(this.f18608Oooo, ImmutableMap.OooOO0(this.f18609Oooo0oo, this.f18610OoooO00));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0OoOo0
    public final Set OooO0Oo() {
        o0O0O0o0.OooO00o oooO00oOooO0o = ImmutableTable.OooO0o(this.f18609Oooo0oo, this.f18608Oooo, this.f18610OoooO00);
        int i = ImmutableSet.f18204Oooo0oo;
        return new o0O00O(oooO00oOooO0o);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: OooOO0 */
    public final ImmutableSet<o0O0O0o0.OooO00o<R, C, V>> OooO0Oo() {
        o0O0O0o0.OooO00o oooO00oOooO0o = ImmutableTable.OooO0o(this.f18609Oooo0oo, this.f18608Oooo, this.f18610OoooO00);
        int i = ImmutableSet.f18204Oooo0oo;
        return new o0O00O(oooO00oOooO0o);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableTable.OooO00o OooOO0O() {
        return ImmutableTable.OooO00o.OooO00o(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: OooOO0o */
    public final ImmutableCollection<V> OooOOO0() {
        V v = this.f18610OoooO00;
        int i = ImmutableSet.f18204Oooo0oo;
        return new o0O00O(v);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o0O0O0o0
    /* JADX INFO: renamed from: OooOOO, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap<R, Map<C, V>> OooO0O0() {
        return ImmutableMap.OooOO0(this.f18609Oooo0oo, ImmutableMap.OooOO0(this.f18608Oooo, this.f18610OoooO00));
    }

    @Override // com.google.common.collect.ImmutableTable
    public final Collection OooOOO0() {
        V v = this.f18610OoooO00;
        int i = ImmutableSet.f18204Oooo0oo;
        return new o0O00O(v);
    }

    @Override // com.google.common.collect.o0O0O0o0
    public final int size() {
        return 1;
    }
}
