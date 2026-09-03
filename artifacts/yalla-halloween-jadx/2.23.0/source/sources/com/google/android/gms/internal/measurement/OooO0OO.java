package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Iterator f15372OooO0Oo;

    public OooO0OO(Iterator it) {
        this.f15372OooO0Oo = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15372OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.f15372OooO0Oo.next());
    }
}
