package p152o00Oo0o0;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InputStream f37788OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public byte[] f37789OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Charset f37790OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f37791OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f37792OooO0oo;

    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, o000000.this.f37790OooO0o0.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public o000000(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(o000000O.f37794OooO00o)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f37788OooO0Oo = fileInputStream;
        this.f37790OooO0o0 = charset;
        this.f37789OooO0o = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    public final String OooO00o() throws IOException {
        int i;
        synchronized (this.f37788OooO0Oo) {
            byte[] bArr = this.f37789OooO0o;
            if (bArr == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f37791OooO0oO >= this.f37792OooO0oo) {
                int i2 = this.f37788OooO0Oo.read(bArr, 0, bArr.length);
                if (i2 == -1) {
                    throw new EOFException();
                }
                this.f37791OooO0oO = 0;
                this.f37792OooO0oo = i2;
            }
            for (int i3 = this.f37791OooO0oO; i3 != this.f37792OooO0oo; i3++) {
                byte[] bArr2 = this.f37789OooO0o;
                if (bArr2[i3] == 10) {
                    int i4 = this.f37791OooO0oO;
                    if (i3 != i4) {
                        i = i3 - 1;
                        if (bArr2[i] != 13) {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                    String str = new String(bArr2, i4, i - i4, this.f37790OooO0o0.name());
                    this.f37791OooO0oO = i3 + 1;
                    return str;
                }
            }
            OooO00o oooO00o = new OooO00o((this.f37792OooO0oo - this.f37791OooO0oO) + 80);
            while (true) {
                byte[] bArr3 = this.f37789OooO0o;
                int i5 = this.f37791OooO0oO;
                oooO00o.write(bArr3, i5, this.f37792OooO0oo - i5);
                this.f37792OooO0oo = -1;
                byte[] bArr4 = this.f37789OooO0o;
                int i6 = this.f37788OooO0Oo.read(bArr4, 0, bArr4.length);
                if (i6 == -1) {
                    throw new EOFException();
                }
                this.f37791OooO0oO = 0;
                this.f37792OooO0oo = i6;
                for (int i7 = 0; i7 != this.f37792OooO0oo; i7++) {
                    byte[] bArr5 = this.f37789OooO0o;
                    if (bArr5[i7] == 10) {
                        int i8 = this.f37791OooO0oO;
                        if (i7 != i8) {
                            oooO00o.write(bArr5, i8, i7 - i8);
                        }
                        this.f37791OooO0oO = i7 + 1;
                        return oooO00o.toString();
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f37788OooO0Oo) {
            if (this.f37789OooO0o != null) {
                this.f37789OooO0o = null;
                this.f37788OooO0Oo.close();
            }
        }
    }
}
