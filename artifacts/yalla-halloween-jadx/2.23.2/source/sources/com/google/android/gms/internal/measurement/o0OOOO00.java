package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOOO00 implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Iterator f15127OooO0Oo;

    public o0OOOO00(zznp zznpVar) {
        this.f15127OooO0Oo = zznpVar.f15291OooO0Oo.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15127OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f15127OooO0Oo.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
