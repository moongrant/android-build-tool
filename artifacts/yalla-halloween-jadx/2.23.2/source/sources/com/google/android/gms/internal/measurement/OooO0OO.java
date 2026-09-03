package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Iterator f14896OooO0Oo;

    public OooO0OO(Iterator it) {
        this.f14896OooO0Oo = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14896OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.f14896OooO0Oo.next());
    }
}
