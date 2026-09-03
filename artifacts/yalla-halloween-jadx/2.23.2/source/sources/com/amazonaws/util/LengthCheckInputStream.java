package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f12674OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f12675OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f12676OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f12677OooO0oO;

    public LengthCheckInputStream(long j, InputStream inputStream, boolean z) {
        super(inputStream);
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        this.f12674OooO0Oo = j;
        this.f12676OooO0o0 = z;
    }

    public final void OooO0oO(boolean z) {
        long j = this.f12674OooO0Oo;
        if (z) {
            if (this.f12675OooO0o == j) {
                return;
            }
            throw new AmazonClientException("Data read (" + this.f12675OooO0o + ") has a different length than the expected (" + j + ")");
        }
        if (this.f12675OooO0o <= j) {
            return;
        }
        throw new AmazonClientException("More data read (" + this.f12675OooO0o + ") than expected (" + j + ")");
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        super.mark(i);
        this.f12677OooO0oO = this.f12675OooO0o;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i >= 0) {
            this.f12675OooO0o++;
        }
        OooO0oO(i == -1);
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        if (super.markSupported()) {
            this.f12675OooO0o = this.f12677OooO0oO;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (this.f12676OooO0o0 && jSkip > 0) {
            this.f12675OooO0o += jSkip;
            OooO0oO(false);
        }
        return jSkip;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        this.f12675OooO0o += i3 >= 0 ? i3 : 0L;
        OooO0oO(i3 == -1);
        return i3;
    }
}
