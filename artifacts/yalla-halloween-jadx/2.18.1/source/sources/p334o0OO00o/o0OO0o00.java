package p334o0OO00o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0o00 extends o0OO0o {
    public o0OO0o00(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p334o0OO00o.o0OO0o
    public final double OooO00o(Object obj, long j) {
        return Double.longBitsToDouble(OooOO0O(obj, j));
    }

    @Override // p334o0OO00o.o0OO0o
    public final float OooO0O0(Object obj, long j) {
        return Float.intBitsToFloat(OooOO0(obj, j));
    }

    @Override // p334o0OO00o.o0OO0o
    public final void OooO0OO(Object obj, long j, boolean z) {
        if (o0OO0oO0.f37431OooO0oO) {
            o0OO0oO0.OooO0OO(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            o0OO0oO0.OooO0Oo(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p334o0OO00o.o0OO0o
    public final void OooO0Oo(Object obj, long j, byte b) {
        if (o0OO0oO0.f37431OooO0oO) {
            o0OO0oO0.OooO0OO(obj, j, b);
        } else {
            o0OO0oO0.OooO0Oo(obj, j, b);
        }
    }

    @Override // p334o0OO00o.o0OO0o
    public final void OooO0o(Object obj, long j, float f) {
        OooOOO(obj, j, Float.floatToIntBits(f));
    }

    @Override // p334o0OO00o.o0OO0o
    public final void OooO0o0(Object obj, long j, double d) {
        OooOOOO(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p334o0OO00o.o0OO0o
    public final boolean OooO0oO(Object obj, long j) {
        return o0OO0oO0.f37431OooO0oO ? o0OO0oO0.OooOOoo(obj, j) : o0OO0oO0.OooOo00(obj, j);
    }
}
