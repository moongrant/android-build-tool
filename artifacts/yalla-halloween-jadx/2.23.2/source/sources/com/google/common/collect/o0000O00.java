package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 extends oo00oO.OooO0OO<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000oo f18952OooO0Oo;

    public o0000O00(o0000oo o0000ooVar) {
        this.f18952OooO0Oo = o0000ooVar;
    }

    @Override // com.google.common.collect.oo00oO.OooO0OO
    public final o0oOO<Object> OooO0Oo() {
        return this.f18952OooO0Oo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<o0oOO.OooO00o<Object>> iterator() {
        return ((Oooo000) this.f18952OooO0Oo).f18885OooO0oO.OooO0o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((Oooo000) this.f18952OooO0Oo).f18885OooO0oO.entrySet().size();
    }
}
