package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class LazilyParsedNumber extends Number {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f19222Oooo0o;

    public LazilyParsedNumber(String str) {
        this.f19222Oooo0o = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f19222Oooo0o);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f19222Oooo0o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        String str = this.f19222Oooo0o;
        String str2 = ((LazilyParsedNumber) obj).f19222Oooo0o;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f19222Oooo0o);
    }

    public final int hashCode() {
        return this.f19222Oooo0o.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f19222Oooo0o);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f19222Oooo0o);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f19222Oooo0o).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f19222Oooo0o);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f19222Oooo0o).longValue();
        }
    }

    public final String toString() {
        return this.f19222Oooo0o;
    }
}
