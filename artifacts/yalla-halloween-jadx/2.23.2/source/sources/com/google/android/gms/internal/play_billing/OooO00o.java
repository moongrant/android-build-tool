package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends zzu {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f15364OooO0oo = new OooO00o(new Object[0], 0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Object[] f15365OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f15366OooO0oO;

    public OooO00o(Object[] objArr, int i) {
        this.f15365OooO0o = objArr;
        this.f15366OooO0oO = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, com.google.android.gms.internal.play_billing.zzr
    public final int OooO00o(Object[] objArr) {
        Object[] objArr2 = this.f15365OooO0o;
        int i = this.f15366OooO0oO;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO0O0() {
        return this.f15366OooO0oO;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final Object[] OooO0o0() {
        return this.f15365OooO0o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzm.zza(i, this.f15366OooO0oO, "index");
        Object obj = this.f15365OooO0o[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15366OooO0oO;
    }
}
