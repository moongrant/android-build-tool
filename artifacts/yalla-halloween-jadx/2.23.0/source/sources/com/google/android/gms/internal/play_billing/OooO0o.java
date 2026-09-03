package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends zzy {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient zzx f15847OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient zzu f15848OooO0oO;

    public OooO0o(zzx zzxVar, OooO oooO) {
        this.f15847OooO0o = zzxVar;
        this.f15848OooO0oO = oooO;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO00o(Object[] objArr) {
        return this.f15848OooO0oO.OooO00o(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f15847OooO0o.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f15848OooO0oO.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15847OooO0o.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    public final zzu zzd() {
        return this.f15848OooO0oO;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: zze */
    public final zzah iterator() {
        return this.f15848OooO0oO.listIterator(0);
    }
}
