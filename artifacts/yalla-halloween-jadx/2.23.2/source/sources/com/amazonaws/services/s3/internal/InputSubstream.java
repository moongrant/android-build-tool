package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class InputSubstream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f12401OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f12402OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f12403OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f12404OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f12405OooO0oo;

    public InputSubstream(RepeatableFileInputStream repeatableFileInputStream, long j, long j2) {
        super(repeatableFileInputStream);
        this.f12405OooO0oo = 0L;
        this.f12401OooO0Oo = 0L;
        this.f12402OooO0o = j2;
        this.f12403OooO0o0 = j;
        this.f12404OooO0oO = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        long j = this.f12401OooO0Oo;
        long j2 = this.f12403OooO0o0;
        long j3 = this.f12402OooO0o;
        if (j >= j2) {
            j3 = (j3 + j2) - j;
        }
        return (int) Math.min(j3, super.available());
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f12404OooO0oO) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f12405OooO0oo = this.f12401OooO0Oo;
        super.mark(i);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        return i == -1 ? i : bArr[0];
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f12401OooO0Oo = this.f12405OooO0oo;
        super.reset();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j;
        long j2;
        while (true) {
            j = this.f12401OooO0Oo;
            j2 = this.f12403OooO0o0;
            if (j >= j2) {
                break;
            }
            this.f12401OooO0Oo += skip(j2 - j);
        }
        long j3 = (this.f12402OooO0o + j2) - j;
        if (j3 <= 0) {
            return -1;
        }
        int i3 = super.read(bArr, i, (int) Math.min(i2, j3));
        this.f12401OooO0Oo += (long) i3;
        return i3;
    }
}
