package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO extends zzja {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00OO f15486OooO0oo = new o00OO(new Object[0], 0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Object[] f15487OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f15488OooO0oO;

    public o00OO(Object[] objArr, int i) {
        this.f15487OooO0o = objArr;
        this.f15488OooO0oO = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, com.google.android.gms.internal.measurement.zziw
    public final void OooO00o(Object[] objArr) {
        System.arraycopy(this.f15487OooO0o, 0, objArr, 0, this.f15488OooO0oO);
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int OooO0O0() {
        return this.f15488OooO0oO;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final Object[] OooO0Oo() {
        return this.f15487OooO0o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzij.zza(i, this.f15488OooO0oO, "index");
        Object obj = this.f15487OooO0o[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15488OooO0oO;
    }
}
