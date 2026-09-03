package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaw {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f15190OooO00o = new ArrayList();

    public final void OooO00o(String str) {
        if (!this.f15190OooO00o.contains(zzh.zze(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }

    public abstract zzap zza(String str, zzg zzgVar, List list);
}
