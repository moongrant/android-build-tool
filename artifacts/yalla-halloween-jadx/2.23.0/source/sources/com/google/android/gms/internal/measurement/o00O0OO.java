package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO extends zzii {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O0OO f15484OooO0Oo = new o00O0OO();

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean zzb() {
        return false;
    }
}
