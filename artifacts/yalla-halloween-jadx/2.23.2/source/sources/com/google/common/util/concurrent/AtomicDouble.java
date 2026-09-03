package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class AtomicDouble extends Number implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public transient AtomicLong f19307OooO0Oo = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f19307OooO0Oo = new AtomicLong();
        this.f19307OooO0Oo.set(Double.doubleToRawLongBits(objectInputStream.readDouble()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(OooO00o());
    }

    public final double OooO00o() {
        return Double.longBitsToDouble(this.f19307OooO0Oo.get());
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
