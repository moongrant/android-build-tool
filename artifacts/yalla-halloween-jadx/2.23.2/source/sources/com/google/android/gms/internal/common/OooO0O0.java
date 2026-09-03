package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes3.dex */
@NullMarked
public final class OooO0O0 extends zzag {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO0O0 f14879OooO0oo = new OooO0O0(new Object[0], 0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Object[] f14880OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f14881OooO0oO;

    public OooO0O0(Object[] objArr, int i) {
        this.f14880OooO0o = objArr;
        this.f14881OooO0oO = i;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final void OooO00o(Object[] objArr) {
        System.arraycopy(this.f14880OooO0o, 0, objArr, 0, this.f14881OooO0oO);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int OooO0O0() {
        return this.f14881OooO0oO;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] OooO0o0() {
        return this.f14880OooO0o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzs.zza(i, this.f14881OooO0oO, "index");
        Object obj = this.f14880OooO0o[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14881OooO0oO;
    }
}
