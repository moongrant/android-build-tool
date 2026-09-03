package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0000 extends oO0Oo {
    @Override // com.google.android.gms.internal.measurement.oO0Oo
    public final double OooO00o(long j, Object obj) {
        return Double.longBitsToDouble(this.f15615OooO00o.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.oO0Oo
    public final float OooO0O0(long j, Object obj) {
        return Float.intBitsToFloat(this.f15615OooO00o.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.oO0Oo
    public final void OooO0OO(Object obj, long j, boolean z) {
        if (o0oo0000.f15608OooO0oO) {
            o0oo0000.OooO0OO(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            o0oo0000.OooO0Oo(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.oO0Oo
    public final void OooO0Oo(Object obj, long j, byte b) {
        if (o0oo0000.f15608OooO0oO) {
            o0oo0000.OooO0OO(obj, j, b);
        } else {
            o0oo0000.OooO0Oo(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.oO0Oo
    public final void OooO0o(Object obj, long j, float f) {
        this.f15615OooO00o.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.oO0Oo
    public final void OooO0o0(Object obj, long j, double d) {
        this.f15615OooO00o.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.oO0Oo
    public final boolean OooO0oO(long j, Object obj) {
        return o0oo0000.f15608OooO0oO ? o0oo0000.OooOOoo(j, obj) : o0oo0000.OooOo00(j, obj);
    }
}
