package com.ishumei.l111l11111Il.l111l11111lIl;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
final class l111l1111llIl {
    private static final int l1111l111111Il = 22;
    private static final int l111l11111I1l = 12;
    private static final int l111l11111Il = 16;
    private static final int l111l11111lIl = 101010256;
    private static final int l111l1111l1Il = 20;
    private static final int l111l1111lI1l = 1347094023;
    private static final int l111l1111lIl = 65535;
    private static final int l111l1111llIl = 20;

    public static long l1111l111111Il(ByteBuffer byteBuffer) {
        l111l11111Il(byteBuffer);
        return l1111l111111Il(byteBuffer, byteBuffer.position() + 16);
    }

    private static long l1111l111111Il(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    public static Pair<ByteBuffer, Long> l1111l111111Il(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairL1111l111111Il = l1111l111111Il(randomAccessFile, 0);
        return pairL1111l111111Il != null ? pairL1111l111111Il : l1111l111111Il(randomAccessFile, l111l1111lIl);
    }

    private static Pair<ByteBuffer, Long> l1111l111111Il(RandomAccessFile randomAccessFile, int i) throws IOException {
        if (i < 0 || i > l111l1111lIl) {
            throw new IllegalArgumentException("maxCommentSize: " + i);
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, length - 22)) + 22);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        int iL111l11111I1l = l111l11111I1l(byteBufferAllocate);
        if (iL111l11111I1l == -1) {
            return null;
        }
        byteBufferAllocate.position(iL111l11111I1l);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(byteOrder);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) iL111l11111I1l)));
    }

    public static final boolean l1111l111111Il(RandomAccessFile randomAccessFile, long j) throws IOException {
        long j2 = j - 20;
        if (j2 < 0) {
            return false;
        }
        randomAccessFile.seek(j2);
        return randomAccessFile.readInt() == l111l1111lI1l;
    }

    private static int l111l11111I1l(ByteBuffer byteBuffer) {
        l111l11111Il(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i = iCapacity - 22;
        int iMin = Math.min(i, l111l1111lIl);
        for (int i2 = 0; i2 <= iMin; i2++) {
            int i3 = i - i2;
            if (byteBuffer.getInt(i3) == l111l11111lIl && (byteBuffer.getShort(i3 + 20) & l111l1111lIl) == i2) {
                return i3;
            }
        }
        return -1;
    }

    private static void l111l11111Il(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int l111l11111lIl(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getShort(i) & l111l1111lIl;
    }

    public static long l111l11111lIl(ByteBuffer byteBuffer) {
        l111l11111Il(byteBuffer);
        return l1111l111111Il(byteBuffer, byteBuffer.position() + 12);
    }
}
