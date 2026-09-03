package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0 extends o0OO0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f19041OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f19042OooO0o0;

    public o00O0O0(Object obj) {
        this.f19042OooO0o0 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f19041OooO0Oo;
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final Object next() {
        if (this.f19041OooO0Oo) {
            throw new NoSuchElementException();
        }
        this.f19041OooO0Oo = true;
        return this.f19042OooO0o0;
    }
}
