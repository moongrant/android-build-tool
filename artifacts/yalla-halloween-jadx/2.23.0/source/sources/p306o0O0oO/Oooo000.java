package p306o0O0oO;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import p308o0O0oO0O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends InputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InputStream f42453OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Timer f42454OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0O f42455OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f42457OooO0oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f42456OooO0oO = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f42452OooO = -1;

    public Oooo000(InputStream inputStream, o00O0O o00o0o2, Timer timer) {
        this.f42454OooO0o = timer;
        this.f42453OooO0Oo = inputStream;
        this.f42455OooO0o0 = o00o0o2;
        this.f42457OooO0oo = o00o0o2.f42486OooO0oO.OooO0o0();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f42453OooO0Oo.available();
        } catch (IOException e) {
            long jOooO00o = this.f42454OooO0o.OooO00o();
            o00O0O o00o0o2 = this.f42455OooO0o0;
            o00o0o2.OooOO0(jOooO00o);
            o0ooOOo.OooO0OO(o00o0o2);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o00O0O o00o0o2 = this.f42455OooO0o0;
        Timer timer = this.f42454OooO0o;
        long jOooO00o = timer.OooO00o();
        if (this.f42452OooO == -1) {
            this.f42452OooO = jOooO00o;
        }
        try {
            this.f42453OooO0Oo.close();
            long j = this.f42456OooO0oO;
            if (j != -1) {
                o00o0o2.OooO(j);
            }
            long j2 = this.f42457OooO0oo;
            if (j2 != -1) {
                o00o0o2.f42486OooO0oO.OooOOoo(j2);
            }
            o00o0o2.OooOO0(this.f42452OooO);
            o00o0o2.OooO0O0();
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f42453OooO0Oo.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f42453OooO0Oo.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.f42454OooO0o;
        o00O0O o00o0o2 = this.f42455OooO0o0;
        try {
            int i = this.f42453OooO0Oo.read();
            long jOooO00o = timer.OooO00o();
            if (this.f42457OooO0oo == -1) {
                this.f42457OooO0oo = jOooO00o;
            }
            if (i == -1 && this.f42452OooO == -1) {
                this.f42452OooO = jOooO00o;
                o00o0o2.OooOO0(jOooO00o);
                o00o0o2.OooO0O0();
            } else {
                long j = this.f42456OooO0oO + 1;
                this.f42456OooO0oO = j;
                o00o0o2.OooO(j);
            }
            return i;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f42453OooO0Oo.reset();
        } catch (IOException e) {
            long jOooO00o = this.f42454OooO0o.OooO00o();
            o00O0O o00o0o2 = this.f42455OooO0o0;
            o00o0o2.OooOO0(jOooO00o);
            o0ooOOo.OooO0OO(o00o0o2);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Timer timer = this.f42454OooO0o;
        o00O0O o00o0o2 = this.f42455OooO0o0;
        try {
            long jSkip = this.f42453OooO0Oo.skip(j);
            long jOooO00o = timer.OooO00o();
            if (this.f42457OooO0oo == -1) {
                this.f42457OooO0oo = jOooO00o;
            }
            if (jSkip == -1 && this.f42452OooO == -1) {
                this.f42452OooO = jOooO00o;
                o00o0o2.OooOO0(jOooO00o);
            } else {
                long j2 = this.f42456OooO0oO + jSkip;
                this.f42456OooO0oO = j2;
                o00o0o2.OooO(j2);
            }
            return jSkip;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Timer timer = this.f42454OooO0o;
        o00O0O o00o0o2 = this.f42455OooO0o0;
        try {
            int i3 = this.f42453OooO0Oo.read(bArr, i, i2);
            long jOooO00o = timer.OooO00o();
            if (this.f42457OooO0oo == -1) {
                this.f42457OooO0oo = jOooO00o;
            }
            if (i3 == -1 && this.f42452OooO == -1) {
                this.f42452OooO = jOooO00o;
                o00o0o2.OooOO0(jOooO00o);
                o00o0o2.OooO0O0();
            } else {
                long j = this.f42456OooO0oO + ((long) i3);
                this.f42456OooO0oO = j;
                o00o0o2.OooO(j);
            }
            return i3;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.f42454OooO0o;
        o00O0O o00o0o2 = this.f42455OooO0o0;
        try {
            int i = this.f42453OooO0Oo.read(bArr);
            long jOooO00o = timer.OooO00o();
            if (this.f42457OooO0oo == -1) {
                this.f42457OooO0oo = jOooO00o;
            }
            if (i == -1 && this.f42452OooO == -1) {
                this.f42452OooO = jOooO00o;
                o00o0o2.OooOO0(jOooO00o);
                o00o0o2.OooO0O0();
            } else {
                long j = this.f42456OooO0oO + ((long) i);
                this.f42456OooO0oO = j;
                o00o0o2.OooO(j);
            }
            return i;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0o2, o00o0o2);
            throw e;
        }
    }
}
