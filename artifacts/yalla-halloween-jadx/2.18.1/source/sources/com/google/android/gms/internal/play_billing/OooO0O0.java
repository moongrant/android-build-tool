package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends zzy {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient Object[] f16046Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final transient zzx f16047Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final transient int f16048OoooO00;

    public OooO0O0(zzx zzxVar, Object[] objArr, int i) {
        this.f16047Oooo0oo = zzxVar;
        this.f16046Oooo = objArr;
        this.f16048OoooO00 = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO00o(Object[] objArr) {
        return zzf().OooO00o(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzy
    public final zzu OooO0oO() {
        return new o0OO0.OooO0O0(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f16047Oooo0oo.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16048OoooO00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: zzd */
    public final zzah iterator() {
        return zzf().listIterator(0);
    }
}
