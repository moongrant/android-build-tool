package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0O extends zzjh {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15620OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f15621OooO0o0;

    public oo0O(Object obj) {
        this.f15621OooO0o0 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f15620OooO0Oo;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15620OooO0Oo) {
            throw new NoSuchElementException();
        }
        this.f15620OooO0Oo = true;
        return this.f15621OooO0o0;
    }
}
