package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends InputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InputStream f21272OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f21273OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f21274OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f21275OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f21276OooO0oo = -1;

    public Oooo000(InputStream inputStream) {
        this.f21272OooO0Oo = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
    }

    public final void OooO00o(long j) throws IOException {
        if (this.f21274OooO0o0 > this.f21275OooO0oO || j < this.f21273OooO0o) {
            throw new IOException("Cannot reset");
        }
        this.f21272OooO0Oo.reset();
        OooO0oO(this.f21273OooO0o, j);
        this.f21274OooO0o0 = j;
    }

    public final long OooO0OO(int i) {
        long j = this.f21274OooO0o0;
        long j2 = ((long) i) + j;
        long j3 = this.f21275OooO0oO;
        if (j3 < j2) {
            try {
                long j4 = this.f21273OooO0o;
                InputStream inputStream = this.f21272OooO0Oo;
                if (j4 >= j || j > j3) {
                    this.f21273OooO0o = j;
                    inputStream.mark((int) (j2 - j));
                } else {
                    inputStream.reset();
                    inputStream.mark((int) (j2 - this.f21273OooO0o));
                    OooO0oO(this.f21273OooO0o, this.f21274OooO0o0);
                }
                this.f21275OooO0oO = j2;
            } catch (IOException e) {
                throw new IllegalStateException("Unable to mark: " + e);
            }
        }
        return this.f21274OooO0o0;
    }

    public final void OooO0oO(long j, long j2) throws IOException {
        while (j < j2) {
            long jSkip = this.f21272OooO0Oo.skip(j2 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f21272OooO0Oo.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21272OooO0Oo.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f21276OooO0oo = OooO0OO(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f21272OooO0Oo.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f21272OooO0Oo.read();
        if (i != -1) {
            this.f21274OooO0o0++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        OooO00o(this.f21276OooO0oo);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.f21272OooO0Oo.skip(j);
        this.f21274OooO0o0 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f21272OooO0Oo.read(bArr);
        if (i != -1) {
            this.f21274OooO0o0 += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f21272OooO0Oo.read(bArr, i, i2);
        if (i3 != -1) {
            this.f21274OooO0o0 += (long) i3;
        }
        return i3;
    }
}
