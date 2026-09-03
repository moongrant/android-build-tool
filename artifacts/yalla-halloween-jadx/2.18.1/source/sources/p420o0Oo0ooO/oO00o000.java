package p420o0Oo0ooO;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00o000 extends InputStream {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f39789Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final InputStream f39790Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f39791Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f39792Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f39793OoooO00 = -1;

    public oO00o000(InputStream inputStream) {
        this.f39790Oooo0o = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
    }

    public final void OooO00o(long j) throws IOException {
        if (this.f39791Oooo0oO > this.f39789Oooo || j < this.f39792Oooo0oo) {
            throw new IOException("Cannot reset");
        }
        this.f39790Oooo0o.reset();
        OooO0Oo(this.f39792Oooo0oo, j);
        this.f39791Oooo0oO = j;
    }

    public final long OooO0O0(int i) {
        long j = this.f39791Oooo0oO;
        long j2 = ((long) i) + j;
        long j3 = this.f39789Oooo;
        if (j3 < j2) {
            try {
                if (this.f39792Oooo0oo >= j || j > j3) {
                    this.f39792Oooo0oo = j;
                    this.f39790Oooo0o.mark((int) (j2 - j));
                } else {
                    this.f39790Oooo0o.reset();
                    this.f39790Oooo0o.mark((int) (j2 - this.f39792Oooo0oo));
                    OooO0Oo(this.f39792Oooo0oo, this.f39791Oooo0oO);
                }
                this.f39789Oooo = j2;
            } catch (IOException e) {
                throw new IllegalStateException("Unable to mark: " + e);
            }
        }
        return this.f39791Oooo0oO;
    }

    public final void OooO0Oo(long j, long j2) throws IOException {
        while (j < j2) {
            long jSkip = this.f39790Oooo0o.skip(j2 - j);
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
        return this.f39790Oooo0o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39790Oooo0o.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f39793OoooO00 = OooO0O0(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f39790Oooo0o.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f39790Oooo0o.read();
        if (i != -1) {
            this.f39791Oooo0oO++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        OooO00o(this.f39793OoooO00);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.f39790Oooo0o.skip(j);
        this.f39791Oooo0oO += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f39790Oooo0o.read(bArr);
        if (i != -1) {
            this.f39791Oooo0oO += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f39790Oooo0o.read(bArr, i, i2);
        if (i3 != -1) {
            this.f39791Oooo0oO += (long) i3;
        }
        return i3;
    }
}
