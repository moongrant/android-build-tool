package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu extends zzai {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Callable f15831OooO0o;

    public zzu(String str, Callable callable) {
        super("internal.appMetadata");
        this.f15831OooO0o = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        try {
            return zzi.zzb(this.f15831OooO0o.call());
        } catch (Exception unused) {
            return zzap.zzf;
        }
    }
}
