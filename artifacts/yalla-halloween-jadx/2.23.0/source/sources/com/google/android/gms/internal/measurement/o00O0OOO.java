package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OOO extends zzii {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f15485OooO0Oo;

    public o00O0OOO(Object obj) {
        this.f15485OooO0Oo = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o00O0OOO) {
            return this.f15485OooO0Oo.equals(((o00O0OOO) obj).f15485OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15485OooO0Oo.hashCode() + 1502476572;
    }

    public final String toString() {
        return p004OooO0oO.o000oOoO.OooO00o("Optional.of(", this.f15485OooO0Oo.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        return this.f15485OooO0Oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean zzb() {
        return true;
    }
}
