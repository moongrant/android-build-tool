package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOO implements zzjv {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15598OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzka f15599OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f15600OooO0o0;

    public o0oOO(zzka zzkaVar) {
        this.f15599OooO0o = zzkaVar;
        this.f15600OooO0o0 = zzkaVar.zzd();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    public final void OooO0O0() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15598OooO0Oo < this.f15600OooO0o0;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        OooO0O0();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final byte zza() {
        int i = this.f15598OooO0Oo;
        if (i >= this.f15600OooO0o0) {
            throw new NoSuchElementException();
        }
        this.f15598OooO0Oo = i + 1;
        return this.f15599OooO0o.OooO00o(i);
    }
}
