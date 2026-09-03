package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends zzu {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final OooO00o f16043OoooO00 = new OooO00o(new Object[0], 0);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient int f16044Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final transient Object[] f16045Oooo0oo;

    public OooO00o(Object[] objArr, int i) {
        this.f16045Oooo0oo = objArr;
        this.f16044Oooo = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, com.google.android.gms.internal.play_billing.zzr
    public final int OooO00o(Object[] objArr) {
        System.arraycopy(this.f16045Oooo0oo, 0, objArr, 0, this.f16044Oooo);
        return this.f16044Oooo;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO0O0() {
        return this.f16044Oooo;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final Object[] OooO0o0() {
        return this.f16045Oooo0oo;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzm.zza(i, this.f16044Oooo, "index");
        Object obj = this.f16045Oooo0oo[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16044Oooo;
    }
}
