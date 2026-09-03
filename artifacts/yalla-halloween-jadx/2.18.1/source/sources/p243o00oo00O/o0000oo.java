package p243o00oo00O;

import androidx.annotation.GuardedBy;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo extends InputStream {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @GuardedBy("POOL")
    public static final Queue<o0000oo> f34174Oooo0oo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public InputStream f34175Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public IOException f34176Oooo0oO;

    static {
        char[] cArr = o000O000.f34177OooO00o;
        f34174Oooo0oo = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f34175Oooo0o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34175Oooo0o.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f34175Oooo0o.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f34175Oooo0o.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f34175Oooo0o.read();
        } catch (IOException e) {
            this.f34176Oooo0oO = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f34175Oooo0o.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f34175Oooo0o.skip(j);
        } catch (IOException e) {
            this.f34176Oooo0oO = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f34175Oooo0o.read(bArr);
        } catch (IOException e) {
            this.f34176Oooo0oO = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f34175Oooo0o.read(bArr, i, i2);
        } catch (IOException e) {
            this.f34176Oooo0oO = e;
            throw e;
        }
    }
}
