package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt extends zzai {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzr f15354OooO0o;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.f15354OooO0o = zzrVar;
        this.f15182OooO0o0.put("log", new oO000(this, false, true));
        this.f15182OooO0o0.put("silent", new oO0000Oo());
        ((zzai) this.f15182OooO0o0.get("silent")).zzr("log", new oO000(this, true, true));
        this.f15182OooO0o0.put("unmonitored", new oO0000o0());
        ((zzai) this.f15182OooO0o0.get("unmonitored")).zzr("log", new oO000(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return zzap.zzf;
    }
}
