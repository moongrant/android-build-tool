package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0O extends zzib {
    public o00O0O0O(zzhy zzhyVar, Double d) {
        super(zzhyVar, "measurement.test.double_flag", d);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object OooO00o(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.f15730OooO0O0 + ": " + ((String) obj));
            return null;
        }
    }
}
