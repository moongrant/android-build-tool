package p242o00oo000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f34151Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final InputStream f34152Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Charset f34153Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public byte[] f34154Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f34155OoooO00;

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
                return new String(((ByteArrayOutputStream) this).buf, 0, i, OooOOO0.this.f34153Oooo0oO.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public OooOOO0(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(OooOOO.f34150OooO00o)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f34152Oooo0o = inputStream;
        this.f34153Oooo0oO = charset;
        this.f34154Oooo0oo = new byte[8192];
    }

    public final void OooO00o() throws IOException {
        InputStream inputStream = this.f34152Oooo0o;
        byte[] bArr = this.f34154Oooo0oo;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f34151Oooo = 0;
        this.f34155OoooO00 = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public final String OooO0O0() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f34152Oooo0o) {
            if (this.f34154Oooo0oo == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f34151Oooo >= this.f34155OoooO00) {
                OooO00o();
            }
            for (int i3 = this.f34151Oooo; i3 != this.f34155OoooO00; i3++) {
                byte[] bArr2 = this.f34154Oooo0oo;
                if (bArr2[i3] == 10) {
                    int i4 = this.f34151Oooo;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    String str = new String(bArr2, i4, i2 - i4, this.f34153Oooo0oO.name());
                    this.f34151Oooo = i3 + 1;
                    return str;
                }
            }
            OooO00o oooO00o = new OooO00o((this.f34155OoooO00 - this.f34151Oooo) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f34154Oooo0oo;
                int i5 = this.f34151Oooo;
                oooO00o.write(bArr3, i5, this.f34155OoooO00 - i5);
                this.f34155OoooO00 = -1;
                OooO00o();
                i = this.f34151Oooo;
                while (i != this.f34155OoooO00) {
                    bArr = this.f34154Oooo0oo;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f34151Oooo;
            if (i != i6) {
                oooO00o.write(bArr, i6, i - i6);
            }
            this.f34151Oooo = i + 1;
            return oooO00o.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f34152Oooo0o) {
            if (this.f34154Oooo0oo != null) {
                this.f34154Oooo0oo = null;
                this.f34152Oooo0o.close();
            }
        }
    }
}
