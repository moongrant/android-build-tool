package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu extends zzai {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Callable f16037Oooo0oo;

    public zzu(String str, Callable callable) {
        super("internal.appMetadata");
        this.f16037Oooo0oo = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        try {
            return zzi.zzb(this.f16037Oooo0oo.call());
        } catch (Exception unused) {
            return zzap.zzf;
        }
    }
}
