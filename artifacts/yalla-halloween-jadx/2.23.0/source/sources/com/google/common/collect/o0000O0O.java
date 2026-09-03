package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O extends o000OO<Object> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Iterable f19429OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.f19429OooO0o0 = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f19429OooO0o0.iterator();
    }
}
