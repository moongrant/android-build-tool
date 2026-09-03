package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000o<R, C, V> extends o0OO000<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ParametricNullness
    public final R f19120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ParametricNullness
    public final V f19121OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @ParametricNullness
    public final C f19122OooO0o0;

    public o0OO000o(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v) {
        this.f19120OooO0Oo = r;
        this.f19122OooO0o0 = c;
        this.f19121OooO0o = v;
    }

    @Override // com.google.common.collect.o0O.OooO00o
    @ParametricNullness
    public final R OooO00o() {
        return this.f19120OooO0Oo;
    }

    @Override // com.google.common.collect.o0O.OooO00o
    @ParametricNullness
    public final C OooO0O0() {
        return this.f19122OooO0o0;
    }

    @Override // com.google.common.collect.o0O.OooO00o
    @ParametricNullness
    public final V getValue() {
        return this.f19121OooO0o;
    }
}
