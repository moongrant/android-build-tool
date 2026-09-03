package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Serializable f20714OooO0Oo;

    public o00Oo0(Boolean bool) {
        bool.getClass();
        this.f20714OooO0Oo = bool;
    }

    public static boolean OooO0o0(o00Oo0 o00oo1) {
        Serializable serializable = o00oo1.f20714OooO0Oo;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.Oooo0
    public final String OooO0O0() {
        Serializable serializable = this.f20714OooO0Oo;
        if (serializable instanceof Number) {
            return OooO0Oo().toString();
        }
        return serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean OooO0OO() {
        Serializable serializable = this.f20714OooO0Oo;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(OooO0O0());
    }

    public final Number OooO0Oo() {
        Serializable serializable = this.f20714OooO0Oo;
        return serializable instanceof String ? new LazilyParsedNumber((String) serializable) : (Number) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00Oo0.class != obj.getClass()) {
            return false;
        }
        o00Oo0 o00oo1 = (o00Oo0) obj;
        Serializable serializable = this.f20714OooO0Oo;
        Serializable serializable2 = o00oo1.f20714OooO0Oo;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (OooO0o0(this) && OooO0o0(o00oo1)) {
            return OooO0Oo().longValue() == o00oo1.OooO0Oo().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = OooO0Oo().doubleValue();
        double dDoubleValue2 = o00oo1.OooO0Oo().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f20714OooO0Oo;
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

    public o00Oo0(Number number) {
        number.getClass();
        this.f20714OooO0Oo = number;
    }

    public o00Oo0(String str) {
        str.getClass();
        this.f20714OooO0Oo = str;
    }
}
