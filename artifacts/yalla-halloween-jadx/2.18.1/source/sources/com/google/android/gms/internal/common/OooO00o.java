package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends zzag {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient int f15863Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final transient int f15864Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzag f15865OoooO00;

    public OooO00o(zzag zzagVar, int i, int i2) {
        this.f15865OoooO00 = zzagVar;
        this.f15864Oooo0oo = i;
        this.f15863Oooo = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int OooO0O0() {
        return this.f15865OoooO00.OooO0OO() + this.f15864Oooo0oo + this.f15863Oooo;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int OooO0OO() {
        return this.f15865OoooO00.OooO0OO() + this.f15864Oooo0oo;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean OooO0o0() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @CheckForNull
    public final Object[] OooO0oO() {
        return this.f15865OoooO00.OooO0oO();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzs.zza(i, this.f15863Oooo, "index");
        return this.f15865OoooO00.get(i + this.f15864Oooo0oo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15863Oooo;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzag subList(int i, int i2) {
        zzs.zzc(i, i2, this.f15863Oooo);
        zzag zzagVar = this.f15865OoooO00;
        int i3 = this.f15864Oooo0oo;
        return zzagVar.subList(i + i3, i2 + i3);
    }
}
