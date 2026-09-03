package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0 extends zzib {
    public o00O0O0(zzhy zzhyVar, String str, Long l) {
        super(zzhyVar, str, l);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object OooO00o(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.f15254OooO0O0 + ": " + ((String) obj));
            return null;
        }
    }
}
