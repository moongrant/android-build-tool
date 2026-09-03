package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends zzy {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient zzu f16049Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final transient zzx f16050Oooo0oo;

    public OooO0OO(zzx zzxVar, zzu zzuVar) {
        this.f16050Oooo0oo = zzxVar;
        this.f16049Oooo = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO00o(Object[] objArr) {
        return this.f16049Oooo.OooO00o(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f16050Oooo0oo.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f16049Oooo.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16050Oooo0oo.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: zzd */
    public final zzah iterator() {
        return this.f16049Oooo.listIterator(0);
    }
}
