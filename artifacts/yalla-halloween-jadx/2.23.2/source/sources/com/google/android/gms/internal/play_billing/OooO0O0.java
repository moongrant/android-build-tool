package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends zzu {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f15367OooO0o;

    public OooO0O0(OooO0OO oooO0OO) {
        this.f15367OooO0o = oooO0OO;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0OO oooO0OO = this.f15367OooO0o;
        zzm.zza(i, oooO0OO.f15370OooO0oo, "index");
        int i2 = i + i;
        Object obj = oooO0OO.f15369OooO0oO[i2];
        obj.getClass();
        Object obj2 = oooO0OO.f15369OooO0oO[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15367OooO0o.f15370OooO0oo;
    }
}
