package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends FilterInputStream {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final byte[] f13045OooO0o = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int f13046OooO0oO = 31;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte f13047OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f13048OooO0o0;

    public OooOO0O(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Cannot add invalid orientation: ", i));
        }
        this.f13047OooO0Oo = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f13048OooO0o0;
        if (i3 < 2 || i3 > (i2 = f13046OooO0oO)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f13047OooO0Oo : f13045OooO0o[i3 - 2] & UByte.MAX_VALUE;
        }
        if (i != -1) {
            this.f13048OooO0o0++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f13048OooO0o0 = (int) (((long) this.f13048OooO0o0) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f13048OooO0o0;
        int i5 = f13046OooO0oO;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f13047OooO0Oo;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f13045OooO0o, this.f13048OooO0o0 - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f13048OooO0o0 += i3;
        }
        return i3;
    }
}
