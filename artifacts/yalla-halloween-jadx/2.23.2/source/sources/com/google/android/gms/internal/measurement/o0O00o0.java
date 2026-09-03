package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o0 implements zzjv {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15064OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzka f15065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f15066OooO0o0;

    public o0O00o0(zzka zzkaVar) {
        this.f15065OooO0o = zzkaVar;
        this.f15066OooO0o0 = zzkaVar.zzd();
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
        return this.f15064OooO0Oo < this.f15066OooO0o0;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        OooO0O0();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final byte zza() {
        int i = this.f15064OooO0Oo;
        if (i >= this.f15066OooO0o0) {
            throw new NoSuchElementException();
        }
        this.f15064OooO0Oo = i + 1;
        return this.f15065OooO0o.OooO00o(i);
    }
}
