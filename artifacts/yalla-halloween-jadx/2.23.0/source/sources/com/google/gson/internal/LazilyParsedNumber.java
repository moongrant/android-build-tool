package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class LazilyParsedNumber extends Number {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f20603OooO0Oo;

    public LazilyParsedNumber(String str) {
        this.f20603OooO0Oo = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f20603OooO0Oo);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f20603OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        Object obj2 = ((LazilyParsedNumber) obj).f20603OooO0Oo;
        String str = this.f20603OooO0Oo;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f20603OooO0Oo);
    }

    public final int hashCode() {
        return this.f20603OooO0Oo.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f20603OooO0Oo;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f20603OooO0Oo;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f20603OooO0Oo;
    }
}
