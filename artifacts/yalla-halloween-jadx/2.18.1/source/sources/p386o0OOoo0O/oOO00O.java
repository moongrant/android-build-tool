package p386o0OOoo0O;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O extends o00O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Serializable f38887OooO00o;

    public oOO00O(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f38887OooO00o = bool;
    }

    public static boolean OooO0oo(oOO00O ooo00o) {
        Serializable serializable = ooo00o.f38887OooO00o;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // p386o0OOoo0O.o00O000o
    public final String OooO0OO() {
        Serializable serializable = this.f38887OooO00o;
        if (serializable instanceof Number) {
            return OooO0oO().toString();
        }
        return serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean OooO0o0() {
        Serializable serializable = this.f38887OooO00o;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(OooO0OO());
    }

    public final Number OooO0oO() {
        Serializable serializable = this.f38887OooO00o;
        return serializable instanceof String ? new LazilyParsedNumber((String) serializable) : (Number) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oOO00O.class != obj.getClass()) {
            return false;
        }
        oOO00O ooo00o = (oOO00O) obj;
        if (this.f38887OooO00o == null) {
            return ooo00o.f38887OooO00o == null;
        }
        if (OooO0oo(this) && OooO0oo(ooo00o)) {
            return OooO0oO().longValue() == ooo00o.OooO0oO().longValue();
        }
        Serializable serializable = this.f38887OooO00o;
        if (!(serializable instanceof Number) || !(ooo00o.f38887OooO00o instanceof Number)) {
            return serializable.equals(ooo00o.f38887OooO00o);
        }
        double dDoubleValue = OooO0oO().doubleValue();
        double dDoubleValue2 = ooo00o.OooO0oO().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.f38887OooO00o == null) {
            return 31;
        }
        if (OooO0oo(this)) {
            jDoubleToLongBits = OooO0oO().longValue();
        } else {
            Serializable serializable = this.f38887OooO00o;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(OooO0oO().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public oOO00O(Number number) {
        Objects.requireNonNull(number);
        this.f38887OooO00o = number;
    }

    public oOO00O(String str) {
        Objects.requireNonNull(str);
        this.f38887OooO00o = str;
    }
}
