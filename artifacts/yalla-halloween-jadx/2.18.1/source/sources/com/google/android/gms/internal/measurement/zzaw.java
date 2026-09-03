package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaw {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f15899OooO00o = new ArrayList();

    public final zzap OooO00o(String str) {
        if (this.f15899OooO00o.contains(zzh.zze(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract zzap zza(String str, zzg zzgVar, List list);
}
