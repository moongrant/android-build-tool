package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class cn extends FilterInputStream {
    private final int[] AFLogger$LogLevel;
    private final int[] AFVersionDeclaration;
    private final int AppsFlyer2dXConversionCallback;
    private final byte[][] getLevel;
    private final byte[] init;
    private int onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private int onDeepLinkingNative;
    private final byte[] onInstallConversionDataLoadedNative;
    private static final byte[] AFKeystoreWrapper = co.AFInAppEventType;
    private static final int[] valueOf = co.AFKeystoreWrapper;
    private static final int[] AFInAppEventParameterName = co.values;
    private static final int[] values = co.AFInAppEventParameterName;
    private static final int[] AFInAppEventType = co.valueOf;

    public cn(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.AFVersionDeclaration = new int[4];
        this.init = new byte[16];
        this.onInstallConversionDataLoadedNative = new byte[16];
        this.onAppOpenAttributionNative = Integer.MAX_VALUE;
        this.onAttributionFailureNative = 16;
        this.onDeepLinkingNative = 16;
        this.AppsFlyer2dXConversionCallback = i;
        this.AFLogger$LogLevel = co.AFKeystoreWrapper(bArr, i);
        this.getLevel = AFInAppEventType(bArr2);
    }

    private static byte[][] AFInAppEventType(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            for (int i2 = 0; i2 < bArr[i].length; i2++) {
                bArr2[i][bArr[i][i2]] = (byte) i2;
            }
        }
        return bArr2;
    }

    private void valueOf(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.AFVersionDeclaration;
        char c = 1;
        int i = (bArr[0] << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        int[] iArr2 = this.AFLogger$LogLevel;
        iArr[0] = i ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & UByte.MAX_VALUE) << 16)) | ((bArr[6] & UByte.MAX_VALUE) << 8)) | (bArr[7] & UByte.MAX_VALUE)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & UByte.MAX_VALUE) << 16)) | ((bArr[10] & UByte.MAX_VALUE) << 8)) | (bArr[11] & UByte.MAX_VALUE)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & UByte.MAX_VALUE) << 16) | (bArr[12] << 24)) | ((bArr[14] & UByte.MAX_VALUE) << 8)) | (bArr[15] & UByte.MAX_VALUE));
        int i2 = 1;
        int i3 = 4;
        while (i2 < this.AppsFlyer2dXConversionCallback) {
            int[] iArr3 = valueOf;
            int[] iArr4 = this.AFVersionDeclaration;
            byte[][] bArr3 = this.getLevel;
            int i4 = iArr3[iArr4[bArr3[0][0]] >>> 24];
            int[] iArr5 = AFInAppEventParameterName;
            int i5 = i4 ^ iArr5[(iArr4[bArr3[c][0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE];
            int[] iArr6 = values;
            int i6 = iArr6[(iArr4[bArr3[2][0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ i5;
            int[] iArr7 = AFInAppEventType;
            int i7 = iArr7[iArr4[bArr3[3][0]] & KotlinVersion.MAX_COMPONENT_VALUE] ^ i6;
            int[] iArr8 = this.AFLogger$LogLevel;
            int i8 = i7 ^ iArr8[i3];
            int i9 = ((iArr6[(iArr4[bArr3[2][c]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (iArr3[iArr4[bArr3[0][c]] >>> 24] ^ iArr5[(iArr4[bArr3[c][c]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE])) ^ iArr7[iArr4[bArr3[3][c]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i3 + 1];
            int i10 = (((iArr5[(iArr4[bArr3[c][2]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ iArr3[iArr4[bArr3[0][2]] >>> 24]) ^ iArr6[(iArr4[bArr3[2][2]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr7[iArr4[bArr3[3][2]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i3 + 2];
            int i11 = (((iArr3[iArr4[bArr3[0][3]] >>> 24] ^ iArr5[(iArr4[bArr3[1][3]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr6[(iArr4[bArr3[2][3]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr7[iArr4[bArr3[3][3]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i3 + 3];
            iArr4[0] = i8;
            iArr4[1] = i9;
            iArr4[2] = i10;
            iArr4[3] = i11;
            i2++;
            i3 += 4;
            c = 1;
        }
        int[] iArr9 = this.AFLogger$LogLevel;
        int i12 = iArr9[i3];
        byte[] bArr4 = AFKeystoreWrapper;
        int[] iArr10 = this.AFVersionDeclaration;
        byte[][] bArr5 = this.getLevel;
        bArr2[0] = (byte) (bArr4[iArr10[bArr5[0][0]] >>> 24] ^ (i12 >>> 24));
        bArr2[1] = (byte) (bArr4[(iArr10[bArr5[1][0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i12 >>> 16));
        bArr2[2] = (byte) (bArr4[(iArr10[bArr5[2][0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i12 >>> 8));
        bArr2[3] = (byte) (i12 ^ bArr4[iArr10[bArr5[3][0]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i13 = iArr9[i3 + 1];
        bArr2[4] = (byte) (bArr4[iArr10[bArr5[0][1]] >>> 24] ^ (i13 >>> 24));
        bArr2[5] = (byte) (bArr4[(iArr10[bArr5[1][1]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i13 >>> 16));
        bArr2[6] = (byte) (bArr4[(iArr10[bArr5[2][1]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i13 >>> 8));
        bArr2[7] = (byte) (i13 ^ bArr4[iArr10[bArr5[3][1]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i14 = iArr9[i3 + 2];
        bArr2[8] = (byte) (bArr4[iArr10[bArr5[0][2]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr4[(iArr10[bArr5[1][2]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr4[(iArr10[bArr5[2][2]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i14 >>> 8));
        bArr2[11] = (byte) (i14 ^ bArr4[iArr10[bArr5[3][2]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i15 = iArr9[i3 + 3];
        bArr2[12] = (byte) (bArr4[iArr10[bArr5[0][3]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr4[(iArr10[bArr5[1][3]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i15 >>> 16));
        bArr2[14] = (byte) (bArr4[(iArr10[bArr5[2][3]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i15 >>> 8));
        bArr2[15] = (byte) (i15 ^ bArr4[iArr10[bArr5[3][3]] & KotlinVersion.MAX_COMPONENT_VALUE]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.onDeepLinkingNative - this.onAttributionFailureNative;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.onAttributionFailureNative;
        if (i >= this.onDeepLinkingNative) {
            return -1;
        }
        byte[] bArr = this.onInstallConversionDataLoadedNative;
        this.onAttributionFailureNative = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventType();
            int i5 = this.onAttributionFailureNative;
            if (i5 >= this.onDeepLinkingNative) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.onInstallConversionDataLoadedNative;
            this.onAttributionFailureNative = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    private int AFInAppEventType() throws IOException {
        if (this.onAppOpenAttributionNative == Integer.MAX_VALUE) {
            this.onAppOpenAttributionNative = ((FilterInputStream) this).in.read();
        }
        if (this.onAttributionFailureNative == 16) {
            byte[] bArr = this.init;
            int i = this.onAppOpenAttributionNative;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.init, i2, 16 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 16);
            if (i2 >= 16) {
                valueOf(this.init, this.onInstallConversionDataLoadedNative);
                int i4 = ((FilterInputStream) this).in.read();
                this.onAppOpenAttributionNative = i4;
                this.onAttributionFailureNative = 0;
                this.onDeepLinkingNative = i4 < 0 ? 16 - (this.onInstallConversionDataLoadedNative[15] & UByte.MAX_VALUE) : 16;
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.onDeepLinkingNative;
    }
}
