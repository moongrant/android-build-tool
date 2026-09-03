package p306o0O0oO;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import p308o0O0oO0O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends OutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OutputStream f42448OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O0O f42449OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Timer f42450OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f42451OooO0oO = -1;

    public Oooo0(OutputStream outputStream, o00O0O o00o0o2, Timer timer) {
        this.f42448OooO0Oo = outputStream;
        this.f42449OooO0o = o00o0o2;
        this.f42450OooO0o0 = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.f42451OooO0oO;
        o00O0O o00o0o2 = this.f42449OooO0o;
        if (j != -1) {
            o00o0o2.OooO0o(j);
        }
        Timer timer = this.f42450OooO0o0;
        o00o0o2.f42486OooO0oO.OooOOOo(timer.OooO00o());
        try {
            this.f42448OooO0Oo.close();
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f42448OooO0Oo.flush();
        } catch (IOException e) {
            long jOooO00o = this.f42450OooO0o0.OooO00o();
            o00O0O o00o0o2 = this.f42449OooO0o;
            o00o0o2.OooOO0(jOooO00o);
            o0ooOOo.OooO0OO(o00o0o2);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        o00O0O o00o0o2 = this.f42449OooO0o;
        try {
            this.f42448OooO0Oo.write(i);
            long j = this.f42451OooO0oO + 1;
            this.f42451OooO0oO = j;
            o00o0o2.OooO0o(j);
        } catch (IOException e) {
            OooOo.OooO00o(this.f42450OooO0o0, o00o0o2, o00o0o2);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        o00O0O o00o0o2 = this.f42449OooO0o;
        try {
            this.f42448OooO0Oo.write(bArr);
            long length = this.f42451OooO0oO + ((long) bArr.length);
            this.f42451OooO0oO = length;
            o00o0o2.OooO0o(length);
        } catch (IOException e) {
            OooOo.OooO00o(this.f42450OooO0o0, o00o0o2, o00o0o2);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        o00O0O o00o0o2 = this.f42449OooO0o;
        try {
            this.f42448OooO0Oo.write(bArr, i, i2);
            long j = this.f42451OooO0oO + ((long) i2);
            this.f42451OooO0oO = j;
            o00o0o2.OooO0o(j);
        } catch (IOException e) {
            OooOo.OooO00o(this.f42450OooO0o0, o00o0o2, o00o0o2);
            throw e;
        }
    }
}
