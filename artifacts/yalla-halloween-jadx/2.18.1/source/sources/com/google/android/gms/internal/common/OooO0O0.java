package com.google.android.gms.internal.common;

import java.util.Objects;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public final class OooO0O0 extends zzag {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final OooO0O0 f15866OoooO00 = new OooO0O0(new Object[0], 0);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient int f15867Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final transient Object[] f15868Oooo0oo;

    public OooO0O0(Object[] objArr, int i) {
        this.f15868Oooo0oo = objArr;
        this.f15867Oooo = i;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final int OooO00o(Object[] objArr) {
        System.arraycopy(this.f15868Oooo0oo, 0, objArr, 0, this.f15867Oooo);
        return this.f15867Oooo;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int OooO0O0() {
        return this.f15867Oooo;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean OooO0o0() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] OooO0oO() {
        return this.f15868Oooo0oo;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzs.zza(i, this.f15867Oooo, "index");
        Object obj = this.f15868Oooo0oo[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15867Oooo;
    }
}
