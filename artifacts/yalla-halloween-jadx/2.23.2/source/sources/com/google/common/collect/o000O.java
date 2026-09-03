package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O extends o0OO0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO0 f18958OooO0Oo;

    public o000O(o0OO0 o0oo1) {
        this.f18958OooO0Oo = o0oo1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18958OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f18958OooO0Oo.next()).getKey();
    }
}
