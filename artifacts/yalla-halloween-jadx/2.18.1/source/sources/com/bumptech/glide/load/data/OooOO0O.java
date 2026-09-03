package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends FilterInputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte f12476Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12477Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final byte[] f12475Oooo0oo = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final int f12474Oooo = 31;

    public OooOO0O(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Cannot add invalid orientation: ", i));
        }
        this.f12476Oooo0o = (byte) i;
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
        int i3 = this.f12477Oooo0oO;
        if (i3 < 2 || i3 > (i2 = f12474Oooo)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f12476Oooo0o : f12475Oooo0oo[i3 - 2] & UByte.MAX_VALUE;
        }
        if (i != -1) {
            this.f12477Oooo0oO++;
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
            this.f12477Oooo0oO = (int) (((long) this.f12477Oooo0oO) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f12477Oooo0oO;
        int i5 = f12474Oooo;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f12476Oooo0o;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f12475Oooo0oo, this.f12477Oooo0oO - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f12477Oooo0oO += i3;
        }
        return i3;
    }
}
