package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 extends o0000O0O<Object> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Iterable f18437Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.f18437Oooo0oO = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f18437Oooo0oO.iterator();
    }
}
