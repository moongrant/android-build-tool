package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 extends zzch {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.zzhf f15465OooO0Oo;

    public o000Oo0(com.google.android.gms.measurement.internal.zzhf zzhfVar) {
        this.f15465OooO0Oo = zzhfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.f15465OooO0Oo);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.f15465OooO0Oo.interceptEvent(str, str2, bundle, j);
    }
}
