package p312o0O0oOO;

import androidx.compose.animation.OooOOO;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import p308o0O0oO.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 extends OutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OutputStream f41844OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO f41845OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Timer f41846OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f41847OooO0oO = -1;

    public o0O0O00(OutputStream outputStream, OooO oooO, Timer timer) {
        this.f41844OooO0Oo = outputStream;
        this.f41845OooO0o = oooO;
        this.f41846OooO0o0 = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.f41847OooO0oO;
        OooO oooO = this.f41845OooO0o;
        if (j != -1) {
            oooO.OooO0o(j);
        }
        Timer timer = this.f41846OooO0o0;
        oooO.f41775OooO0oO.OooOOOo(timer.OooO00o());
        try {
            this.f41844OooO0Oo.close();
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooO, oooO);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f41844OooO0Oo.flush();
        } catch (IOException e) {
            long jOooO00o = this.f41846OooO0o0.OooO00o();
            OooO oooO = this.f41845OooO0o;
            oooO.OooOO0(jOooO00o);
            o0000Ooo.OooO0OO(oooO);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        OooO oooO = this.f41845OooO0o;
        try {
            this.f41844OooO0Oo.write(i);
            long j = this.f41847OooO0oO + 1;
            this.f41847OooO0oO = j;
            oooO.OooO0o(j);
        } catch (IOException e) {
            OooOOO.OooO00o(this.f41846OooO0o0, oooO, oooO);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        OooO oooO = this.f41845OooO0o;
        try {
            this.f41844OooO0Oo.write(bArr);
            long length = this.f41847OooO0oO + ((long) bArr.length);
            this.f41847OooO0oO = length;
            oooO.OooO0o(length);
        } catch (IOException e) {
            OooOOO.OooO00o(this.f41846OooO0o0, oooO, oooO);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        OooO oooO = this.f41845OooO0o;
        try {
            this.f41844OooO0Oo.write(bArr, i, i2);
            long j = this.f41847OooO0oO + ((long) i2);
            this.f41847OooO0oO = j;
            oooO.OooO0o(j);
        } catch (IOException e) {
            OooOOO.OooO00o(this.f41846OooO0o0, oooO, oooO);
            throw e;
        }
    }
}
