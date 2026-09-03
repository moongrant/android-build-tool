package p224o00oOOOo;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p219o00oO0O0.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00000 extends FilterInputStream {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f33840Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public volatile byte[] f33841Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f33842Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f33843Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o0O00o0 f33844OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f33845OoooO00;

    public static class OooO00o extends IOException {
        public OooO00o(String str) {
            super(str);
        }
    }

    public oOO00000(@NonNull InputStream inputStream, @NonNull o0O00o0 o0o00o1) {
        super(inputStream);
        this.f33840Oooo = -1;
        this.f33844OoooO0 = o0o00o1;
        this.f33841Oooo0o = (byte[]) o0o00o1.OooO0oO(65536, byte[].class);
    }

    public static IOException OooO0O0() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int OooO00o(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f33840Oooo;
        if (i != -1) {
            int i2 = this.f33845OoooO00 - i;
            int i3 = this.f33843Oooo0oo;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f33842Oooo0oO == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f33844OoooO0.OooO0oO(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f33841Oooo0o = bArr2;
                    this.f33844OoooO0.OooO0o(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f33845OoooO00 - this.f33840Oooo;
                this.f33845OoooO00 = i4;
                this.f33840Oooo = 0;
                this.f33842Oooo0oO = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f33845OoooO00;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f33842Oooo0oO = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f33840Oooo = -1;
            this.f33845OoooO00 = 0;
            this.f33842Oooo0oO = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f33841Oooo0o == null || inputStream == null) {
            OooO0O0();
            throw null;
        }
        return (this.f33842Oooo0oO - this.f33845OoooO00) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f33841Oooo0o != null) {
            this.f33844OoooO0.OooO0o(this.f33841Oooo0o);
            this.f33841Oooo0o = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f33843Oooo0oo = Math.max(this.f33843Oooo0oo, i);
        this.f33840Oooo = this.f33845OoooO00;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.f33841Oooo0o;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            OooO0O0();
            throw null;
        }
        if (this.f33845OoooO00 >= this.f33842Oooo0oO && OooO00o(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f33841Oooo0o && (bArr = this.f33841Oooo0o) == null) {
            OooO0O0();
            throw null;
        }
        int i = this.f33842Oooo0oO;
        int i2 = this.f33845OoooO00;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f33845OoooO00 = i2 + 1;
        return bArr[i2] & UByte.MAX_VALUE;
    }

    public final synchronized void release() {
        if (this.f33841Oooo0o != null) {
            this.f33844OoooO0.OooO0o(this.f33841Oooo0o);
            this.f33841Oooo0o = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.f33841Oooo0o == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f33840Oooo;
        if (-1 == i) {
            throw new OooO00o("Mark has been invalidated, pos: " + this.f33845OoooO00 + " markLimit: " + this.f33843Oooo0oo);
        }
        this.f33845OoooO00 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f33841Oooo0o;
        if (bArr == null) {
            OooO0O0();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            OooO0O0();
            throw null;
        }
        int i = this.f33842Oooo0oO;
        int i2 = this.f33845OoooO00;
        if (i - i2 >= j) {
            this.f33845OoooO00 = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f33845OoooO00 = i;
        if (this.f33840Oooo == -1 || j > this.f33843Oooo0oo) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f33840Oooo = -1;
            }
            return j2 + jSkip;
        }
        if (OooO00o(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f33842Oooo0oO;
        int i4 = this.f33845OoooO00;
        if (i3 - i4 >= j - j2) {
            this.f33845OoooO00 = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f33845OoooO00 = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f33841Oooo0o;
        if (bArr2 == null) {
            OooO0O0();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f33845OoooO00;
            int i6 = this.f33842Oooo0oO;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f33845OoooO00 += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f33840Oooo == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (OooO00o(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f33841Oooo0o && (bArr2 = this.f33841Oooo0o) == null) {
                        OooO0O0();
                        throw null;
                    }
                    int i8 = this.f33842Oooo0oO;
                    int i9 = this.f33845OoooO00;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f33845OoooO00 += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            OooO0O0();
            throw null;
        }
    }
}
