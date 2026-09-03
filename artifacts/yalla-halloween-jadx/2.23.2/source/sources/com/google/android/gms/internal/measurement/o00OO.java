package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO extends zzjh {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15011OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f15012OooO0o0;

    public o00OO(Object obj) {
        this.f15012OooO0o0 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f15011OooO0Oo;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15011OooO0Oo) {
            throw new NoSuchElementException();
        }
        this.f15011OooO0Oo = true;
        return this.f15012OooO0o0;
    }
}
