package p124o00O0o00;

import java.io.IOException;
import java.io.InputStream;
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends InputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final InputStream f36537OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36538OooO0o0 = Pow2.MAX_POW2;

    public OooOo(@NotNull InputStream inputStream) {
        this.f36537OooO0Oo = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f36538OooO0o0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36537OooO0Oo.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f36537OooO0Oo.read();
        if (i == -1) {
            this.f36538OooO0o0 = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f36537OooO0Oo.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(@NotNull byte[] bArr) throws IOException {
        int i = this.f36537OooO0Oo.read(bArr);
        if (i == -1) {
            this.f36538OooO0o0 = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(@NotNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f36537OooO0Oo.read(bArr, i, i2);
        if (i3 == -1) {
            this.f36538OooO0o0 = 0;
        }
        return i3;
    }
}
