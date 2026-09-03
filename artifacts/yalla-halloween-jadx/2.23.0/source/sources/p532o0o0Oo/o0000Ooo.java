package p532o0o0Oo;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends FilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f54570OooO0Oo;

    public o0000Ooo(@NonNull o000000 o000000Var) {
        super(o000000Var);
        this.f54570OooO0Oo = Integer.MIN_VALUE;
    }

    public final long OooO00o(long j) {
        int i = this.f54570OooO0Oo;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void OooO0OO(long j) {
        int i = this.f54570OooO0Oo;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f54570OooO0Oo = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.f54570OooO0Oo;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f54570OooO0Oo = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (OooO00o(1L) == -1) {
            return -1;
        }
        int i = super.read();
        OooO0OO(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.f54570OooO0Oo = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jOooO00o = OooO00o(j);
        if (jOooO00o == -1) {
            return 0L;
        }
        long jSkip = super.skip(jOooO00o);
        OooO0OO(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int iOooO00o = (int) OooO00o(i2);
        if (iOooO00o == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iOooO00o);
        OooO0OO(i3);
        return i3;
    }
}
