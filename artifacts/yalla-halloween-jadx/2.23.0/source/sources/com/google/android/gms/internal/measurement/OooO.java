package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15366OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzat f15367OooO0o0;

    public OooO(zzat zzatVar) {
        this.f15367OooO0o0 = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15366OooO0Oo < this.f15367OooO0o0.f15665OooO0Oo.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f15366OooO0Oo;
        zzat zzatVar = this.f15367OooO0o0;
        if (i >= zzatVar.f15665OooO0Oo.length()) {
            throw new NoSuchElementException();
        }
        this.f15366OooO0Oo = i + 1;
        return new zzat(String.valueOf(zzatVar.f15665OooO0Oo.charAt(i)));
    }
}
