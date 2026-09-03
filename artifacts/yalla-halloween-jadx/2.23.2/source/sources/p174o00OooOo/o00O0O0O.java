package p174o00OooOo;

import androidx.annotation.GuardedBy;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O extends InputStream {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("POOL")
    public static final ArrayDeque f38341OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public InputStream f38342OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public IOException f38343OooO0o0;

    static {
        char[] cArr = o00OO0O0.f38351OooO00o;
        f38341OooO0o = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f38342OooO0Oo.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38342OooO0Oo.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f38342OooO0Oo.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f38342OooO0Oo.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f38342OooO0Oo.read();
        } catch (IOException e) {
            this.f38343OooO0o0 = e;
            throw e;
        }
    }

    public final void release() {
        this.f38343OooO0o0 = null;
        this.f38342OooO0Oo = null;
        ArrayDeque arrayDeque = f38341OooO0o;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f38342OooO0Oo.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f38342OooO0Oo.skip(j);
        } catch (IOException e) {
            this.f38343OooO0o0 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f38342OooO0Oo.read(bArr);
        } catch (IOException e) {
            this.f38343OooO0o0 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f38342OooO0Oo.read(bArr, i, i2);
        } catch (IOException e) {
            this.f38343OooO0o0 = e;
            throw e;
        }
    }
}
