package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends zzu {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Object[] f15837OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f15838OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final transient int f15839OooO0oo;

    public OooO(Object[] objArr, int i, int i2) {
        this.f15837OooO0o = objArr;
        this.f15838OooO0oO = i;
        this.f15839OooO0oo = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzm.zza(i, this.f15839OooO0oo, "index");
        Object obj = this.f15837OooO0o[i + i + this.f15838OooO0oO];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15839OooO0oo;
    }
}
