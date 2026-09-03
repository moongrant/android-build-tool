package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0OO extends zzja {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient int f15493OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f15494OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzja f15495OooO0oo;

    public o00OO0OO(zzja zzjaVar, int i, int i2) {
        this.f15495OooO0oo = zzjaVar;
        this.f15493OooO0o = i;
        this.f15494OooO0oO = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int OooO0O0() {
        return this.f15495OooO0oo.OooO0OO() + this.f15493OooO0o + this.f15494OooO0oO;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int OooO0OO() {
        return this.f15495OooO0oo.OooO0OO() + this.f15493OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    @CheckForNull
    public final Object[] OooO0Oo() {
        return this.f15495OooO0oo.OooO0Oo();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzij.zza(i, this.f15494OooO0oO, "index");
        return this.f15495OooO0oo.get(i + this.f15493OooO0o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15494OooO0oO;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzja subList(int i, int i2) {
        zzij.zzc(i, i2, this.f15494OooO0oO);
        int i3 = this.f15493OooO0o;
        return this.f15495OooO0oo.subList(i + i3, i2 + i3);
    }
}
