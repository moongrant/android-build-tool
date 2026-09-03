package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class AtomicDouble extends Number {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient AtomicLong f18759Oooo0o = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18759Oooo0o = new AtomicLong();
        this.f18759Oooo0o.set(Double.doubleToRawLongBits(objectInputStream.readDouble()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(OooO00o());
    }

    public final double OooO00o() {
        return Double.longBitsToDouble(this.f18759Oooo0o.get());
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return OooO00o();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) OooO00o();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) OooO00o();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) OooO00o();
    }

    public final String toString() {
        return Double.toString(OooO00o());
    }
}
