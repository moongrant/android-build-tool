package p023Oooo00O;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f1037OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f1038OooO0O0;

    public o000000O(double d, double d2) {
        this.f1037OooO00o = d;
        this.f1038OooO0O0 = d2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000000O)) {
            return false;
        }
        o000000O o000000o2 = (o000000O) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.f1037OooO00o), (Object) Double.valueOf(o000000o2.f1037OooO00o)) && Intrinsics.areEqual((Object) Double.valueOf(this.f1038OooO0O0), (Object) Double.valueOf(o000000o2.f1038OooO0O0));
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f1037OooO00o);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f1038OooO0O0);
        return i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ComplexDouble(_real=");
        sbOooO0o0.append(this.f1037OooO00o);
        sbOooO0o0.append(", _imaginary=");
        sbOooO0o0.append(this.f1038OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
