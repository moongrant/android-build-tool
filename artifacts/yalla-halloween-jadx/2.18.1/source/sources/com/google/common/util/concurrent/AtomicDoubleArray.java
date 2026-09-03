package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public class AtomicDoubleArray implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient AtomicLongArray f18760Oooo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        ImmutableLongArray immutableLongArray;
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        ImmutableLongArray immutableLongArray2 = ImmutableLongArray.f18727Oooo;
        long[] jArr = new long[10];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(objectInputStream.readDouble());
            int i4 = i3 + 1;
            if (i4 > jArr.length) {
                int length = jArr.length;
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
                long[] jArr2 = new long[iHighestOneBit];
                System.arraycopy(jArr, 0, jArr2, 0, i3);
                jArr = jArr2;
            }
            jArr[i3] = jDoubleToRawLongBits;
            i2++;
            i3 = i4;
        }
        if (i3 == 0) {
            ImmutableLongArray immutableLongArray3 = ImmutableLongArray.f18727Oooo;
            immutableLongArray = ImmutableLongArray.f18727Oooo;
        } else {
            immutableLongArray = new ImmutableLongArray(jArr, i3);
        }
        this.f18760Oooo0o = new AtomicLongArray(Arrays.copyOfRange(immutableLongArray.f18728Oooo0o, immutableLongArray.f18729Oooo0oO, immutableLongArray.f18730Oooo0oo));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.f18760Oooo0o.length();
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeDouble(Double.longBitsToDouble(this.f18760Oooo0o.get(i)));
        }
    }

    public final String toString() {
        int length = this.f18760Oooo0o.length() - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((length + 1) * 19);
        sb.append('[');
        int i = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f18760Oooo0o.get(i)));
            if (i == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i++;
        }
    }
}
