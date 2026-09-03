package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00 extends zzch {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.zzhg f15439OooO0Oo;

    public o000O00(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        this.f15439OooO0Oo = zzhgVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.f15439OooO0Oo);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.f15439OooO0Oo.onEvent(str, str2, bundle, j);
    }
}
