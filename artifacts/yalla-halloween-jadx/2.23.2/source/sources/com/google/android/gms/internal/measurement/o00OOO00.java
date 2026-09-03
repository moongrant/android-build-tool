package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO00 extends zzja {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00OOO00 f15027OooO0oo = new o00OOO00(new Object[0], 0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Object[] f15028OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f15029OooO0oO;

    public o00OOO00(Object[] objArr, int i) {
        this.f15028OooO0o = objArr;
        this.f15029OooO0oO = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, com.google.android.gms.internal.measurement.zziw
    public final void OooO00o(Object[] objArr) {
        System.arraycopy(this.f15028OooO0o, 0, objArr, 0, this.f15029OooO0oO);
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int OooO0O0() {
        return this.f15029OooO0oO;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final Object[] OooO0Oo() {
        return this.f15028OooO0o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzij.zza(i, this.f15029OooO0oO, "index");
        Object obj = this.f15028OooO0o[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15029OooO0oO;
    }
}
