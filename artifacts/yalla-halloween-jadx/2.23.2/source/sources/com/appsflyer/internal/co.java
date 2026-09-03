package com.appsflyer.internal;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class co {
    private static byte[] AppsFlyer2dXConversionCallback = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    static final byte[] AFInAppEventType = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    static final int[] AFKeystoreWrapper = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    static final int[] values = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    static final int[] AFInAppEventParameterName = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    static final int[] valueOf = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    private static int[] init = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) (((b & ByteCompanionObject.MIN_VALUE) != 0 ? 27 : 0) ^ ((b << 1) ^ b));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & ByteCompanionObject.MIN_VALUE) != 0 ? (byte) 9 : (byte) 0));
            bArr = AppsFlyer2dXConversionCallback;
            i = b & UByte.MAX_VALUE;
            int i2 = b2 & UByte.MAX_VALUE;
            bArr[i] = (byte) (((((b2 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))) ^ ((i2 >> 4) | (i2 << 4)));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = AppsFlyer2dXConversionCallback[i3] & UByte.MAX_VALUE;
            AFInAppEventType[i4] = (byte) i3;
            int i5 = i3 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 ^ i3;
            int i9 = ((i5 ^ (i6 ^ i7)) << 24) | (i8 << 16) | ((i8 ^ i6) << 8) | (i8 ^ i5);
            AFKeystoreWrapper[i4] = i9;
            values[i4] = (i9 >>> 8) | (i9 << 24);
            AFInAppEventParameterName[i4] = (i9 >>> 16) | (i9 << 16);
            valueOf[i4] = (i9 << 8) | (i9 >>> 24);
        }
        init[0] = 16777216;
        int i10 = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            init[i11] = i10 << 24;
        }
    }

    private static int[] AFInAppEventParameterName(byte[] bArr, int[] iArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = 4;
        int[] iArr2 = new int[(i + 1) * 4];
        int i3 = i * 4;
        int i4 = i3 + 1;
        iArr2[0] = iArr[i3];
        int i5 = i4 + 1;
        int i6 = 1;
        iArr2[1] = iArr[i4];
        int i7 = i5 + 1;
        iArr2[2] = iArr[i5];
        iArr2[3] = iArr[i7];
        int i8 = i7 - 7;
        while (i6 < i) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i2 + 1;
            int[] iArr3 = AFKeystoreWrapper;
            byte[] bArr2 = AppsFlyer2dXConversionCallback;
            int i12 = iArr3[bArr2[i10 >>> 24] & UByte.MAX_VALUE];
            int[] iArr4 = values;
            int i13 = i12 ^ iArr4[bArr2[(i10 >>> 16) & 255] & UByte.MAX_VALUE];
            int[] iArr5 = AFInAppEventParameterName;
            int i14 = i13 ^ iArr5[bArr2[(i10 >>> 8) & 255] & UByte.MAX_VALUE];
            int[] iArr6 = valueOf;
            iArr2[i2] = iArr6[bArr2[i10 & 255] & UByte.MAX_VALUE] ^ i14;
            int i15 = i9 + 1;
            int i16 = iArr[i9];
            int i17 = i11 + 1;
            iArr2[i11] = iArr6[bArr2[i16 & 255] & UByte.MAX_VALUE] ^ ((iArr3[bArr2[i16 >>> 24] & UByte.MAX_VALUE] ^ iArr4[bArr2[(i16 >>> 16) & 255] & UByte.MAX_VALUE]) ^ iArr5[bArr2[(i16 >>> 8) & 255] & UByte.MAX_VALUE]);
            int i18 = i15 + 1;
            int i19 = iArr[i15];
            int i20 = i17 + 1;
            iArr2[i17] = iArr6[bArr2[i19 & 255] & UByte.MAX_VALUE] ^ ((iArr3[bArr2[i19 >>> 24] & UByte.MAX_VALUE] ^ iArr4[bArr2[(i19 >>> 16) & 255] & UByte.MAX_VALUE]) ^ iArr5[bArr2[(i19 >>> 8) & 255] & UByte.MAX_VALUE]);
            int i21 = iArr[i18];
            iArr2[i20] = iArr6[bArr2[i21 & 255] & UByte.MAX_VALUE] ^ ((iArr3[bArr2[i21 >>> 24] & UByte.MAX_VALUE] ^ iArr4[bArr2[(i21 >>> 16) & 255] & UByte.MAX_VALUE]) ^ iArr5[bArr2[(i21 >>> 8) & 255] & UByte.MAX_VALUE]);
            i6++;
            i8 = i18 - 7;
            i2 = i20 + 1;
        }
        int i22 = i2 + 1;
        int i23 = i8 + 1;
        iArr2[i2] = iArr[i8];
        int i24 = i22 + 1;
        int i25 = i23 + 1;
        iArr2[i22] = iArr[i23];
        iArr2[i24] = iArr[i25];
        iArr2[i24 + 1] = iArr[i25 + 1];
        return iArr2;
    }

    public static int[] AFKeystoreWrapper(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 1) * 4;
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < 4) {
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = (bArr[i5] << 24) | ((bArr[i6] & UByte.MAX_VALUE) << 16);
            int i9 = i7 + 1;
            iArr[i4] = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 8) | (bArr[i9] & UByte.MAX_VALUE);
            i4++;
            i5 = i9 + 1;
        }
        int i10 = 4;
        int i11 = 0;
        while (i10 < i2) {
            int i12 = iArr[i10 - 1];
            if (i3 == 0) {
                byte[] bArr2 = AppsFlyer2dXConversionCallback;
                i12 = ((bArr2[i12 >>> 24] & UByte.MAX_VALUE) | (((bArr2[(i12 >>> 16) & 255] << 24) | ((bArr2[(i12 >>> 8) & 255] & UByte.MAX_VALUE) << 16)) | ((bArr2[i12 & 255] & UByte.MAX_VALUE) << 8))) ^ init[i11];
                i3 = 4;
                i11++;
            }
            iArr[i10] = i12 ^ iArr[i10 - 4];
            i10++;
            i3--;
        }
        return AFInAppEventParameterName(bArr, iArr, i);
    }

    public static byte[][] AFInAppEventParameterName(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }
}
