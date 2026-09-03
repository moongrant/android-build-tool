package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Iterator f15368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Iterator f15369OooO0o0;

    public OooO00o(Iterator it, Iterator it2) {
        this.f15368OooO0Oo = it;
        this.f15369OooO0o0 = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15368OooO0Oo.hasNext()) {
            return true;
        }
        return this.f15369OooO0o0.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f15368OooO0Oo;
        if (it.hasNext()) {
            return new zzat(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f15369OooO0o0;
        if (it2.hasNext()) {
            return new zzat((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
