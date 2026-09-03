package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class InputSubstream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f10644Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f10645Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f10646Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final long f10647Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f10648OoooO00;

    public InputSubstream(InputStream inputStream, long j, long j2) {
        super(inputStream);
        this.f10648OoooO00 = 0L;
        this.f10645Oooo0o = 0L;
        this.f10647Oooo0oo = j2;
        this.f10646Oooo0oO = j;
        this.f10644Oooo = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        long j = this.f10645Oooo0o;
        long j2 = this.f10646Oooo0oO;
        return (int) Math.min(j < j2 ? this.f10647Oooo0oo : (this.f10647Oooo0oo + j2) - j, super.available());
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f10644Oooo) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f10648OoooO00 = this.f10645Oooo0o;
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
        this.f10645Oooo0o = this.f10648OoooO00;
        super.reset();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j;
        long j2;
        while (true) {
            j = this.f10645Oooo0o;
            j2 = this.f10646Oooo0oO;
            if (j >= j2) {
                break;
            }
            this.f10645Oooo0o += skip(j2 - j);
        }
        long j3 = (this.f10647Oooo0oo + j2) - j;
        if (j3 <= 0) {
            return -1;
        }
        int i3 = super.read(bArr, i, (int) Math.min(i2, j3));
        this.f10645Oooo0o += (long) i3;
        return i3;
    }
}
