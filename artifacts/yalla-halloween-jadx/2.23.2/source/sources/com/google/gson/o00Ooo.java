package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Serializable f20241OooO0Oo;

    public o00Ooo(Boolean bool) {
        bool.getClass();
        this.f20241OooO0Oo = bool;
    }

    public static boolean OooO0o0(o00Ooo o00ooo2) {
        Serializable serializable = o00ooo2.f20241OooO0Oo;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.o000oOoO
    public final String OooO0O0() {
        Serializable serializable = this.f20241OooO0Oo;
        if (serializable instanceof Number) {
            return OooO0Oo().toString();
        }
        return serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean OooO0OO() {
        Serializable serializable = this.f20241OooO0Oo;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(OooO0O0());
    }

    public final Number OooO0Oo() {
        Serializable serializable = this.f20241OooO0Oo;
        return serializable instanceof String ? new LazilyParsedNumber((String) serializable) : (Number) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00Ooo.class != obj.getClass()) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        Serializable serializable = this.f20241OooO0Oo;
        Serializable serializable2 = o00ooo2.f20241OooO0Oo;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (OooO0o0(this) && OooO0o0(o00ooo2)) {
            return OooO0Oo().longValue() == o00ooo2.OooO0Oo().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = OooO0Oo().doubleValue();
        double dDoubleValue2 = o00ooo2.OooO0Oo().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f20241OooO0Oo;
        if (serializable == null) {
            return 31;
        }
        if (OooO0o0(this)) {
            jDoubleToLongBits = OooO0Oo().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(OooO0Oo().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public o00Ooo(Number number) {
        number.getClass();
        this.f20241OooO0Oo = number;
    }

    public o00Ooo(String str) {
        str.getClass();
        this.f20241OooO0Oo = str;
    }
}
