package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OOO0<R, C, V> extends o0O0OO0<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NullableDecl
    public final R f18622Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NullableDecl
    public final C f18623Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NullableDecl
    public final V f18624Oooo0oo;

    public o0O0OOO0(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
        this.f18622Oooo0o = r;
        this.f18623Oooo0oO = c;
        this.f18624Oooo0oo = v;
    }

    @Override // com.google.common.collect.o0O0O0o0.OooO00o
    public final C OooO00o() {
        return this.f18623Oooo0oO;
    }

    @Override // com.google.common.collect.o0O0O0o0.OooO00o
    public final R OooO0O0() {
        return this.f18622Oooo0o;
    }

    @Override // com.google.common.collect.o0O0O0o0.OooO00o
    public final V getValue() {
        return this.f18624Oooo0oo;
    }
}
