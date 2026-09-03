package p312o0O0oOO;

import androidx.compose.animation.OooOOO;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import p308o0O0oO.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends InputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InputStream f41849OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Timer f41850OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO f41851OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f41853OooO0oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f41852OooO0oO = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f41848OooO = -1;

    public oo0o0Oo(InputStream inputStream, OooO oooO, Timer timer) {
        this.f41850OooO0o = timer;
        this.f41849OooO0Oo = inputStream;
        this.f41851OooO0o0 = oooO;
        this.f41853OooO0oo = oooO.f41775OooO0oO.OooO0o0();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f41849OooO0Oo.available();
        } catch (IOException e) {
            long jOooO00o = this.f41850OooO0o.OooO00o();
            OooO oooO = this.f41851OooO0o0;
            oooO.OooOO0(jOooO00o);
            o0000Ooo.OooO0OO(oooO);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OooO oooO = this.f41851OooO0o0;
        Timer timer = this.f41850OooO0o;
        long jOooO00o = timer.OooO00o();
        if (this.f41848OooO == -1) {
            this.f41848OooO = jOooO00o;
        }
        try {
            this.f41849OooO0Oo.close();
            long j = this.f41852OooO0oO;
            if (j != -1) {
                oooO.OooO(j);
            }
            long j2 = this.f41853OooO0oo;
            if (j2 != -1) {
                oooO.f41775OooO0oO.OooOOo(j2);
            }
            oooO.OooOO0(this.f41848OooO);
            oooO.OooO0O0();
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f41849OooO0Oo.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f41849OooO0Oo.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.f41850OooO0o;
        OooO oooO = this.f41851OooO0o0;
        try {
            int i = this.f41849OooO0Oo.read();
            long jOooO00o = timer.OooO00o();
            if (this.f41853OooO0oo == -1) {
                this.f41853OooO0oo = jOooO00o;
            }
            if (i == -1 && this.f41848OooO == -1) {
                this.f41848OooO = jOooO00o;
                oooO.OooOO0(jOooO00o);
                oooO.OooO0O0();
            } else {
                long j = this.f41852OooO0oO + 1;
                this.f41852OooO0oO = j;
                oooO.OooO(j);
            }
            return i;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f41849OooO0Oo.reset();
        } catch (IOException e) {
            long jOooO00o = this.f41850OooO0o.OooO00o();
            OooO oooO = this.f41851OooO0o0;
            oooO.OooOO0(jOooO00o);
            o0000Ooo.OooO0OO(oooO);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Timer timer = this.f41850OooO0o;
        OooO oooO = this.f41851OooO0o0;
        try {
            long jSkip = this.f41849OooO0Oo.skip(j);
            long jOooO00o = timer.OooO00o();
            if (this.f41853OooO0oo == -1) {
                this.f41853OooO0oo = jOooO00o;
            }
            if (jSkip == -1 && this.f41848OooO == -1) {
                this.f41848OooO = jOooO00o;
                oooO.OooOO0(jOooO00o);
            } else {
                long j2 = this.f41852OooO0oO + jSkip;
                this.f41852OooO0oO = j2;
                oooO.OooO(j2);
            }
            return jSkip;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Timer timer = this.f41850OooO0o;
        OooO oooO = this.f41851OooO0o0;
        try {
            int i3 = this.f41849OooO0Oo.read(bArr, i, i2);
            long jOooO00o = timer.OooO00o();
            if (this.f41853OooO0oo == -1) {
                this.f41853OooO0oo = jOooO00o;
            }
            if (i3 == -1 && this.f41848OooO == -1) {
                this.f41848OooO = jOooO00o;
                oooO.OooOO0(jOooO00o);
                oooO.OooO0O0();
            } else {
                long j = this.f41852OooO0oO + ((long) i3);
                this.f41852OooO0oO = j;
                oooO.OooO(j);
            }
            return i3;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.f41850OooO0o;
        OooO oooO = this.f41851OooO0o0;
        try {
            int i = this.f41849OooO0Oo.read(bArr);
            long jOooO00o = timer.OooO00o();
            if (this.f41853OooO0oo == -1) {
                this.f41853OooO0oo = jOooO00o;
            }
            if (i == -1 && this.f41848OooO == -1) {
                this.f41848OooO = jOooO00o;
                oooO.OooOO0(jOooO00o);
                oooO.OooO0O0();
            } else {
                long j = this.f41852OooO0oO + ((long) i);
                this.f41852OooO0oO = j;
                oooO.OooO(j);
            }
            return i;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }
}
