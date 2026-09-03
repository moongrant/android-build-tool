package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class AtomicDoubleArray implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public transient AtomicLongArray f19308OooO0Oo;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        long[] jArrCopyOf = new long[10];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(objectInputStream.readDouble());
            int i4 = i3 + 1;
            if (i4 > jArrCopyOf.length) {
                int length = jArrCopyOf.length;
                if (i4 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i4) {
                    iHighestOneBit = Integer.highestOneBit(i4 - 1) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, iHighestOneBit);
            }
            jArrCopyOf[i3] = jDoubleToRawLongBits;
            i2++;
            i3 = i4;
        }
        ImmutableLongArray immutableLongArray = i3 == 0 ? ImmutableLongArray.f19267OooO0oO : new ImmutableLongArray(jArrCopyOf, i3);
        this.f19308OooO0Oo = new AtomicLongArray(Arrays.copyOfRange(immutableLongArray.f19268OooO0Oo, immutableLongArray.f19270OooO0o0, immutableLongArray.f19269OooO0o));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.f19308OooO0Oo.length();
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeDouble(Double.longBitsToDouble(this.f19308OooO0Oo.get(i)));
        }
    }

    public final String toString() {
        int length = this.f19308OooO0Oo.length() - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((length + 1) * 19);
        sb.append('[');
        int i = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f19308OooO0Oo.get(i)));
            if (i == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }
}
