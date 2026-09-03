package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 extends o0O0o000<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0o000 f18451Oooo0o;

    public o000O0O0(o0O0o000 o0o0o000) {
        this.f18451Oooo0o = o0o0o000;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18451Oooo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f18451Oooo0o.next()).getKey();
    }
}
