package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00o extends o0OO0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Iterator f19667OooO0Oo;

    public oo00o(Iterator it) {
        this.f19667OooO0Oo = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19667OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final Object next() {
        return this.f19667OooO0Oo.next();
    }
}
