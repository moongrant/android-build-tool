package p174o00OooOo;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O extends FilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38331OooO0Oo;

    public o00O(@NonNull o00O0O0O o00o0o0o2) {
        super(o00o0o0o2);
        this.f38331OooO0Oo = Integer.MIN_VALUE;
    }

    public final long OooO00o(long j) {
        int i = this.f38331OooO0Oo;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void OooO0OO(long j) {
        int i = this.f38331OooO0Oo;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f38331OooO0Oo = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.f38331OooO0Oo;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f38331OooO0Oo = i;
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
        this.f38331OooO0Oo = Integer.MIN_VALUE;
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
