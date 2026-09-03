package p174o00OooOo;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 extends FilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f38338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38339OooO0o0;

    public o00O0O0(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f38338OooO0Oo = j;
    }

    public final void OooO00o(int i) throws IOException {
        if (i >= 0) {
            this.f38339OooO0o0 += i;
            return;
        }
        long j = this.f38339OooO0o0;
        long j2 = this.f38338OooO0Oo;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbOooO00o = o00O0000.OooO00o("Failed to read all expected data, expected: ", j2, ", but read: ");
        sbOooO00o.append(this.f38339OooO0o0);
        throw new IOException(sbOooO00o.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f38338OooO0Oo - ((long) this.f38339OooO0o0), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int i;
        i = super.read();
        OooO00o(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        i3 = super.read(bArr, i, i2);
        OooO00o(i3);
        return i3;
    }
}
