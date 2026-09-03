package com.ishumei.l111l11111Il.l111l11111lIl;

import android.support.v4.media.OooO00o;
import android.util.Pair;
import androidx.appcompat.widget.o0000O0;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0O0;
import com.facebook.internal.security.OidcSecurityUtil;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;
import p028Oooo0oO.o00O0000;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes3.dex */
final class l111l11111lIl {
    private static final long l1111l111111Il = 3617552046287187010L;
    private static final int l111l11111I1l = 32;
    private static int l111l11111Il = 257;
    private static final long l111l11111lIl = 2334950737559900225L;
    private static int l111l1111l1Il = 258;
    private static int l111l1111lI1l = 260;
    private static int l111l1111lIl = 513;
    private static int l111l1111llIl = 259;
    private static int l11l1111I11l = 769;
    private static int l11l1111I1l = 1057;
    private static int l11l1111I1ll = 1059;
    private static int l11l1111Il = 1061;
    private static int l11l1111Il1l = 1;
    private static int l11l1111Ill = 2;
    private static int l11l1111lIIl = 514;
    private static int l11l11IlIIll = 3;

    public static int l1111l111111Il(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        if (i == 1057 || i == 1059 || i == 1061) {
            return 3;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
        }
    }

    public static Pair<String, ? extends AlgorithmParameterSpec> l111l11111I1l(int i) {
        if (i != 513) {
            if (i == 514) {
                return Pair.create("SHA512withECDSA", null);
            }
            if (i != 769) {
                if (i != 1057) {
                    if (i != 1059) {
                        if (i != 1061) {
                            switch (i) {
                                case 257:
                                    return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                case 258:
                                    return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                case 259:
                                    break;
                                case 260:
                                    return Pair.create("SHA512withRSA", null);
                                default:
                                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
                            }
                        }
                    }
                }
                return Pair.create(OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256, null);
            }
            return Pair.create("SHA256withDSA", null);
        }
        return Pair.create("SHA256withECDSA", null);
    }

    public static String l111l11111lIl(int i) {
        if (i == 513 || i == 514) {
            return "EC";
        }
        if (i == 769) {
            return "DSA";
        }
        if (i == 1057) {
            return "RSA";
        }
        if (i == 1059) {
            return "EC";
        }
        if (i == 1061) {
            return "DSA";
        }
        switch (i) {
            case 257:
            case 258:
            case 259:
            case 260:
                return "RSA";
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
        }
    }

    private static long l1111l111111Il(ByteBuffer byteBuffer, long j) throws IOException {
        long jL1111l111111Il = l111l1111llIl.l1111l111111Il(byteBuffer);
        if (jL1111l111111Il <= j) {
            if (l111l1111llIl.l111l11111lIl(byteBuffer) + jL1111l111111Il == j) {
                return jL1111l111111Il;
            }
            throw new IOException("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        StringBuilder sbOooO00o = o00O0000.OooO00o("ZIP Central Directory offset out of range: ", jL1111l111111Il, ". ZIP End of Central Directory offset: ");
        sbOooO00o.append(j);
        throw new IOException(sbOooO00o.toString());
    }

    private static void l111l11111I1l(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer l111l11111lIl(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(OooO00o.OooO00o("size: ", i));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static Pair<ByteBuffer, Long> l1111l111111Il(RandomAccessFile randomAccessFile) throws IOException {
        Pair<ByteBuffer, Long> pairL1111l111111Il = l111l1111llIl.l1111l111111Il(randomAccessFile);
        if (pairL1111l111111Il != null) {
            return pairL1111l111111Il;
        }
        throw new IOException("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static byte[] l111l11111lIl(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbOooO00o = o0000O0.OooO00o("Underflow while reading length-prefixed value. Length: ", i, ", available: ");
        sbOooO00o.append(byteBuffer.remaining());
        throw new IOException(sbOooO00o.toString());
    }

    private static Pair<ByteBuffer, Long> l1111l111111Il(RandomAccessFile randomAccessFile, long j) throws IOException {
        if (j < 32) {
            throw new IOException(androidx.compose.ui.input.key.OooO00o.OooO00o("APK too small for APK Signing Block. ZIP Central Directory offset: ", j));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != l111l11111lIl || byteBufferAllocate.getLong(16) != l1111l111111Il) {
            throw new IOException("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = byteBufferAllocate.getLong(0);
        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
            throw new IOException(androidx.compose.ui.input.key.OooO00o.OooO00o("APK Signing Block size out of range: ", j2));
        }
        int i = (int) (8 + j2);
        long j3 = j - ((long) i);
        if (j3 < 0) {
            throw new IOException(androidx.compose.ui.input.key.OooO00o.OooO00o("APK Signing Block offset out of range: ", j3));
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j3);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j4 = byteBufferAllocate2.getLong(0);
        if (j4 == j2) {
            return Pair.create(byteBufferAllocate2, Long.valueOf(j3));
        }
        StringBuilder sbOooO00o = o00O0000.OooO00o("APK Signing Block sizes in header and footer do not match: ", j4, " vs ");
        sbOooO00o.append(j2);
        throw new IOException(sbOooO00o.toString());
    }

    public static l1111l111111Il l1111l111111Il(RandomAccessFile randomAccessFile, int i) throws IOException {
        Pair<ByteBuffer, Long> pairL1111l111111Il = l1111l111111Il(randomAccessFile);
        ByteBuffer byteBuffer = (ByteBuffer) pairL1111l111111Il.first;
        long jLongValue = ((Long) pairL1111l111111Il.second).longValue();
        if (l111l1111llIl.l1111l111111Il(randomAccessFile, jLongValue)) {
            throw new IOException("ZIP64 APK not supported");
        }
        long jL1111l111111Il = l1111l111111Il(byteBuffer, jLongValue);
        Pair<ByteBuffer, Long> pairL1111l111111Il2 = l1111l111111Il(randomAccessFile, jL1111l111111Il);
        ByteBuffer byteBuffer2 = (ByteBuffer) pairL1111l111111Il2.first;
        return new l1111l111111Il(l1111l111111Il(byteBuffer2, 1896449818), ((Long) pairL1111l111111Il2.second).longValue(), jL1111l111111Il, jLongValue, byteBuffer);
    }

    public static ByteBuffer l1111l111111Il(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return l111l11111lIl(byteBuffer, i);
        }
        StringBuilder sbOooO00o = o0000O0.OooO00o("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ");
        sbOooO00o.append(byteBuffer.remaining());
        throw new IOException(sbOooO00o.toString());
    }

    public static ByteBuffer l1111l111111Il(ByteBuffer byteBuffer, int i) throws IOException {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        ByteBuffer byteBufferL1111l111111Il = l1111l111111Il(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i2 = 0;
        while (byteBufferL1111l111111Il.hasRemaining()) {
            i2++;
            if (byteBufferL1111l111111Il.remaining() < 8) {
                throw new IOException(OooO00o.OooO00o("Insufficient data to read size of APK Signing Block entry #", i2));
            }
            long j = byteBufferL1111l111111Il.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new IOException("APK Signing Block entry #" + i2 + " size out of range: " + j);
            }
            int i3 = (int) j;
            int iPosition = byteBufferL1111l111111Il.position() + i3;
            if (i3 > byteBufferL1111l111111Il.remaining()) {
                StringBuilder sbOooO00o = o00000.OooO00o("APK Signing Block entry #", i2, " size out of range: ", i3, ", available: ");
                sbOooO00o.append(byteBufferL1111l111111Il.remaining());
                throw new IOException(sbOooO00o.toString());
            }
            if (byteBufferL1111l111111Il.getInt() == i) {
                return l111l11111lIl(byteBufferL1111l111111Il, i3 - 4);
            }
            byteBufferL1111l111111Il.position(iPosition);
        }
        throw new IOException(OooO0OO.OooO00o.OooO00o("No block with ID ", i, " in APK Signing Block."));
    }

    private static ByteBuffer l1111l111111Il(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 8) {
            throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("end < start: ", i2, " < 8"));
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            throw new IllegalArgumentException(OooO0O0.OooO00o("end > capacity: ", i2, " > ", iCapacity));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(8);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static byte[] l1111l111111Il(byte[] bArr, long j, l1111l111111Il l1111l111111il) {
        if (bArr.length != 40) {
            throw new SecurityException("Verity digest size is wrong: " + bArr.length);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.position(32);
        if (byteBufferOrder.getLong() == j - (l1111l111111il.l111l11111lIl - l1111l111111il.l1111l111111Il)) {
            return Arrays.copyOfRange(bArr, 0, 32);
        }
        throw new SecurityException("APK content size did not verify");
    }
}
