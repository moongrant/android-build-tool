package p243o00oo00O;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 extends FilterInputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f34161Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f34162Oooo0oO;

    public o0000O00(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f34161Oooo0o = j;
    }

    public final int OooO00o(int i) throws IOException {
        if (i >= 0) {
            this.f34162Oooo0oO += i;
        } else if (this.f34161Oooo0o - ((long) this.f34162Oooo0oO) > 0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to read all expected data, expected: ");
            sbOooO0o0.append(this.f34161Oooo0o);
            sbOooO0o0.append(", but read: ");
            sbOooO0o0.append(this.f34162Oooo0oO);
            throw new IOException(sbOooO0o0.toString());
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f34161Oooo0o - ((long) this.f34162Oooo0oO), ((FilterInputStream) this).in.available());
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
