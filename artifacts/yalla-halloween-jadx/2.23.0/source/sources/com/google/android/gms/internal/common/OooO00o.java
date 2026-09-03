package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends zzag {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient int f15352OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f15353OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzag f15354OooO0oo;

    public OooO00o(zzag zzagVar, int i, int i2) {
        this.f15354OooO0oo = zzagVar;
        this.f15352OooO0o = i;
        this.f15353OooO0oO = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int OooO0O0() {
        return this.f15354OooO0oo.OooO0OO() + this.f15352OooO0o + this.f15353OooO0oO;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int OooO0OO() {
        return this.f15354OooO0oo.OooO0OO() + this.f15352OooO0o;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @CheckForNull
    public final Object[] OooO0o0() {
        return this.f15354OooO0oo.OooO0o0();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzs.zza(i, this.f15353OooO0oO, "index");
        return this.f15354OooO0oo.get(i + this.f15352OooO0o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15353OooO0oO;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzag subList(int i, int i2) {
        zzs.zzc(i, i2, this.f15353OooO0oO);
        int i3 = this.f15352OooO0o;
        return this.f15354OooO0oo.subList(i + i3, i2 + i3);
    }
}
