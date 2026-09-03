package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO000 implements Serializable, zzim {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f15489OooO0Oo;

    public o00OO000(Object obj) {
        this.f15489OooO0Oo = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o00OO000) {
            return zzih.zza(this.f15489OooO0Oo, ((o00OO000) obj).f15489OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15489OooO0Oo});
    }

    public final String toString() {
        return p004OooO0oO.o000oOoO.OooO00o("Suppliers.ofInstance(", this.f15489OooO0Oo.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        return this.f15489OooO0Oo;
    }
}
