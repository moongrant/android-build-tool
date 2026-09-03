package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oOO0 extends zzii {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f15165OooO0Oo;

    public oo0oOO0(Object obj) {
        this.f15165OooO0Oo = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof oo0oOO0) {
            return this.f15165OooO0Oo.equals(((oo0oOO0) obj).f15165OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15165OooO0Oo.hashCode() + 1502476572;
    }

    public final String toString() {
        return p004OooO0oO.o000oOoO.OooO0O0("Optional.of(", this.f15165OooO0Oo.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        return this.f15165OooO0Oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean zzb() {
        return true;
    }
}
