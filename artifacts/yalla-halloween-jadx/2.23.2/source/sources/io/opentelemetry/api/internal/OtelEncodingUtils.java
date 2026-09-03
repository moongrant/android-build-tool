package io.opentelemetry.api.internal;

import java.util.Arrays;
import javax.annotation.concurrent.Immutable;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public final class OtelEncodingUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f32509OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f32510OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean[] f32511OooO0OO;

    static {
        char[] cArr = new char[ConstantsKt.MINIMUM_BLOCK_SIZE];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | PSKKeyManager.MAX_KEY_LENGTH_BYTES] = "0123456789abcdef".charAt(i & 15);
        }
        f32509OooO00o = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr["0123456789abcdef".charAt(i2)] = (byte) i2;
        }
        f32510OooO0O0 = bArr;
        boolean[] zArr = new boolean[65535];
        int i3 = 0;
        while (i3 < 65535) {
            zArr[i3] = (48 <= i3 && i3 <= 57) || (97 <= i3 && i3 <= 102);
            i3++;
        }
        f32511OooO0OO = zArr;
    }

    private OtelEncodingUtils() {
    }

    public static byte OooO00o(char c, char c2) {
        byte[] bArr;
        byte b;
        byte b2;
        if (c >= 128 || (b = (bArr = f32510OooO0O0)[c]) == -1) {
            throw new IllegalArgumentException("invalid character " + c);
        }
        if (c2 < 128 && (b2 = bArr[c2]) != -1) {
            return (byte) (b2 | (b << 4));
        }
        throw new IllegalArgumentException("invalid character " + c2);
    }

    public static void OooO0O0(byte b, char[] cArr, int i) {
        int i2 = b & UByte.MAX_VALUE;
        char[] cArr2 = f32509OooO00o;
        cArr[i] = cArr2[i2];
        cArr[i + 1] = cArr2[i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    }

    public static byte[] OooO0OO(int i, String str) {
        byte[] bArr = new byte[i / 2];
        for (int i2 = 0; i2 < i; i2 += 2) {
            bArr[i2 / 2] = OooO00o(str.charAt(i2), str.charAt(i2 + 1));
        }
        return bArr;
    }

    public static void OooO0Oo(long j, char[] cArr, int i) {
        OooO0O0((byte) ((j >> 56) & 255), cArr, i);
        OooO0O0((byte) ((j >> 48) & 255), cArr, i + 2);
        OooO0O0((byte) ((j >> 40) & 255), cArr, i + 4);
        OooO0O0((byte) ((j >> 32) & 255), cArr, i + 6);
        OooO0O0((byte) ((j >> 24) & 255), cArr, i + 8);
        OooO0O0((byte) ((j >> 16) & 255), cArr, i + 10);
        OooO0O0((byte) ((j >> 8) & 255), cArr, i + 12);
        OooO0O0((byte) (j & 255), cArr, i + 14);
    }
}
