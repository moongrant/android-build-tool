package com.google.android.gms.internal.play_billing;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends zzu {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient int f15849OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f15850OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzu f15851OooO0oo;

    public OooOO0(zzu zzuVar, int i, int i2) {
        this.f15851OooO0oo = zzuVar;
        this.f15849OooO0o = i;
        this.f15850OooO0oO = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO0O0() {
        return this.f15851OooO0oo.OooO0OO() + this.f15849OooO0o + this.f15850OooO0oO;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO0OO() {
        return this.f15851OooO0oo.OooO0OO() + this.f15849OooO0o;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    @CheckForNull
    public final Object[] OooO0o0() {
        return this.f15851OooO0oo.OooO0o0();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzm.zza(i, this.f15850OooO0oO, "index");
        return this.f15851OooO0oo.get(i + this.f15849OooO0o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15850OooO0oO;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, java.util.List
    /* JADX INFO: renamed from: zzh */
    public final zzu subList(int i, int i2) {
        zzm.zzd(i, i2, this.f15850OooO0oO);
        int i3 = this.f15849OooO0o;
        return this.f15851OooO0oo.subList(i + i3, i2 + i3);
    }
}
