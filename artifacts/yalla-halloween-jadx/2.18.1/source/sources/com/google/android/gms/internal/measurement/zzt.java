package com.google.android.gms.internal.measurement;

import java.util.List;
import p334o0OO00o.o0OOOO0o;
import p334o0OO00o.o0OOo000;
import p334o0OO00o.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends zzai {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final zzr f16036Oooo0oo;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.f16036Oooo0oo = zzrVar;
        this.f15891Oooo0oO.put("log", new o0o0000(this, false, true));
        this.f15891Oooo0oO.put("silent", new o0OOOO0o());
        ((zzai) this.f15891Oooo0oO.get("silent")).zzr("log", new o0o0000(this, true, true));
        this.f15891Oooo0oO.put("unmonitored", new o0OOo000());
        ((zzai) this.f15891Oooo0oO.get("unmonitored")).zzr("log", new o0o0000(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return zzap.zzf;
    }
}
