package p677o0oooo0o;

import OooO00o.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p698oO0OOoo0.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends l {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final byte[] f52117OoooO00 = new byte[0];

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f52118Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f52119Oooo0oo;

    public g(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f52119Oooo0oo = i;
        this.f52118Oooo = i;
        if (i == 0) {
            OooO0O0();
        }
    }

    @Override // p677o0oooo0o.l
    public final int OooO00o() {
        return this.f52118Oooo;
    }

    public final byte[] OooO0Oo() throws IOException {
        int i = this.f52118Oooo;
        if (i == 0) {
            return f52117OoooO00;
        }
        byte[] bArr = new byte[i];
        int iOooO00o = i - OooO0O0.OooO00o(this.f52127Oooo0o, bArr);
        this.f52118Oooo = iOooO00o;
        if (iOooO00o == 0) {
            OooO0O0();
            return bArr;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DEF length ");
        sbOooO0o0.append(this.f52119Oooo0oo);
        sbOooO0o0.append(" object truncated by ");
        sbOooO0o0.append(this.f52118Oooo);
        throw new EOFException(sbOooO0o0.toString());
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f52118Oooo == 0) {
            return -1;
        }
        int i = this.f52127Oooo0o.read();
        if (i >= 0) {
            int i2 = this.f52118Oooo - 1;
            this.f52118Oooo = i2;
            if (i2 == 0) {
                OooO0O0();
            }
            return i;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DEF length ");
        sbOooO0o0.append(this.f52119Oooo0oo);
        sbOooO0o0.append(" object truncated by ");
        sbOooO0o0.append(this.f52118Oooo);
        throw new EOFException(sbOooO0o0.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f52118Oooo;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f52127Oooo0o.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.f52118Oooo - i4;
            this.f52118Oooo = i5;
            if (i5 == 0) {
                OooO0O0();
            }
            return i4;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DEF length ");
        sbOooO0o0.append(this.f52119Oooo0oo);
        sbOooO0o0.append(" object truncated by ");
        sbOooO0o0.append(this.f52118Oooo);
        throw new EOFException(sbOooO0o0.toString());
    }
}
