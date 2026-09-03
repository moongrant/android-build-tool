package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements Iterator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14894OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzae f14895OooO0o0;

    public OooO0O0(zzae zzaeVar) {
        this.f14895OooO0o0 = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14894OooO0Oo < this.f14895OooO0o0.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f14894OooO0Oo;
        zzae zzaeVar = this.f14895OooO0o0;
        if (i >= zzaeVar.zzc()) {
            throw new NoSuchElementException(android.support.v4.media.OooO00o.OooO00o("Out of bounds index: ", this.f14894OooO0Oo));
        }
        int i2 = this.f14894OooO0Oo;
        this.f14894OooO0Oo = i2 + 1;
        return zzaeVar.zze(i2);
    }
}
