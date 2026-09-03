package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends zzy {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient zzx f15844OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient Object[] f15845OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final transient int f15846OooO0oo;

    public OooO0OO(zzx zzxVar, Object[] objArr, int i) {
        this.f15844OooO0o = zzxVar;
        this.f15845OooO0oO = objArr;
        this.f15846OooO0oo = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO00o(Object[] objArr) {
        return zzd().OooO00o(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzy
    public final zzu OooO0o() {
        return new OooO0O0(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f15844OooO0o.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15846OooO0oo;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: zze */
    public final zzah iterator() {
        return zzd().listIterator(0);
    }
}
