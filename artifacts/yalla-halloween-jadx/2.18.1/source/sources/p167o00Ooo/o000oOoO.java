package p167o00Ooo;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f32628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f32629OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f32630OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double f32631OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f32633OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final double f32632OooO0o = 0.0d;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final double f32634OooO0oO = 0.0d;

    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x009a  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b8  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if ((r6 == 0.0d) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o000oOoO(double d, double d2, double d3, double d4, double d5) {
        this.f32628OooO00o = d;
        this.f32629OooO0O0 = d2;
        this.f32630OooO0OO = d3;
        this.f32631OooO0Oo = d4;
        this.f32633OooO0o0 = d5;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(0.0d) || Double.isNaN(0.0d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d) {
            if (!(d2 == 0.0d)) {
            }
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d) {
            if (d4 == 0.0d) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            }
        }
        if (d2 == 0.0d) {
            if (d4 == 0.0d) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            }
        } else {
            if (d == 0.0d) {
                if (d4 == 0.0d) {
                    throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
                }
            }
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.f32628OooO00o), (Object) Double.valueOf(o000oooo2.f32628OooO00o)) && Intrinsics.areEqual((Object) Double.valueOf(this.f32629OooO0O0), (Object) Double.valueOf(o000oooo2.f32629OooO0O0)) && Intrinsics.areEqual((Object) Double.valueOf(this.f32630OooO0OO), (Object) Double.valueOf(o000oooo2.f32630OooO0OO)) && Intrinsics.areEqual((Object) Double.valueOf(this.f32631OooO0Oo), (Object) Double.valueOf(o000oooo2.f32631OooO0Oo)) && Intrinsics.areEqual((Object) Double.valueOf(this.f32633OooO0o0), (Object) Double.valueOf(o000oooo2.f32633OooO0o0)) && Intrinsics.areEqual((Object) Double.valueOf(this.f32632OooO0o), (Object) Double.valueOf(o000oooo2.f32632OooO0o)) && Intrinsics.areEqual((Object) Double.valueOf(this.f32634OooO0oO), (Object) Double.valueOf(o000oooo2.f32634OooO0oO));
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f32628OooO00o);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f32629OooO0O0);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f32630OooO0OO);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f32631OooO0Oo);
        int i3 = (i2 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f32633OooO0o0);
        int i4 = (i3 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f32632OooO0o);
        int i5 = (i4 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f32634OooO0oO);
        return i5 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TransferParameters(gamma=");
        sbOooO0o0.append(this.f32628OooO00o);
        sbOooO0o0.append(", a=");
        sbOooO0o0.append(this.f32629OooO0O0);
        sbOooO0o0.append(", b=");
        sbOooO0o0.append(this.f32630OooO0OO);
        sbOooO0o0.append(", c=");
        sbOooO0o0.append(this.f32631OooO0Oo);
        sbOooO0o0.append(", d=");
        sbOooO0o0.append(this.f32633OooO0o0);
        sbOooO0o0.append(", e=");
        sbOooO0o0.append(this.f32632OooO0o);
        sbOooO0o0.append(", f=");
        sbOooO0o0.append(this.f32634OooO0oO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
