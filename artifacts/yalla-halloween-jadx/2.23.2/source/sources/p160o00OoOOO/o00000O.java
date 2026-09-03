package p160o00OoOOO;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p156o00OoO00.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O extends FilterInputStream {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0o f38063OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile byte[] f38064OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f38065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38066OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38067OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f38068OooO0oo;

    public static class OooO00o extends IOException {
    }

    public o00000O(@NonNull InputStream inputStream, @NonNull OooO0o oooO0o) {
        super(inputStream);
        this.f38067OooO0oO = -1;
        this.f38063OooO = oooO0o;
        this.f38064OooO0Oo = (byte[]) oooO0o.OooO0OO(65536, byte[].class);
    }

    public static void OooO0OO() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int OooO00o(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f38067OooO0oO;
        if (i != -1) {
            int i2 = this.f38068OooO0oo - i;
            int i3 = this.f38065OooO0o;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f38066OooO0o0 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f38063OooO.OooO0OO(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f38064OooO0Oo = bArr2;
                    this.f38063OooO.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f38068OooO0oo - this.f38067OooO0oO;
                this.f38068OooO0oo = i4;
                this.f38067OooO0oO = 0;
                this.f38066OooO0o0 = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f38068OooO0oo;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f38066OooO0o0 = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f38067OooO0oO = -1;
            this.f38068OooO0oo = 0;
            this.f38066OooO0o0 = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f38064OooO0Oo == null || inputStream == null) {
            OooO0OO();
            throw null;
        }
        return (this.f38066OooO0o0 - this.f38068OooO0oo) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f38064OooO0Oo != null) {
            this.f38063OooO.put(this.f38064OooO0Oo);
            this.f38064OooO0Oo = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f38065OooO0o = Math.max(this.f38065OooO0o, i);
        this.f38067OooO0oO = this.f38068OooO0oo;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.f38064OooO0Oo;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            OooO0OO();
            throw null;
        }
        if (this.f38068OooO0oo >= this.f38066OooO0o0 && OooO00o(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f38064OooO0Oo && (bArr = this.f38064OooO0Oo) == null) {
            OooO0OO();
            throw null;
        }
        int i = this.f38066OooO0o0;
        int i2 = this.f38068OooO0oo;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f38068OooO0oo = i2 + 1;
        return bArr[i2] & UByte.MAX_VALUE;
    }

    public final synchronized void release() {
        if (this.f38064OooO0Oo != null) {
            this.f38063OooO.put(this.f38064OooO0Oo);
            this.f38064OooO0Oo = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.f38064OooO0Oo == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f38067OooO0oO;
        if (-1 == i) {
            throw new OooO00o("Mark has been invalidated, pos: " + this.f38068OooO0oo + " markLimit: " + this.f38065OooO0o);
        }
        this.f38068OooO0oo = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f38064OooO0Oo;
        if (bArr == null) {
            OooO0OO();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            OooO0OO();
            throw null;
        }
        int i = this.f38066OooO0o0;
        int i2 = this.f38068OooO0oo;
        if (i - i2 >= j) {
            this.f38068OooO0oo = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f38068OooO0oo = i;
        if (this.f38067OooO0oO == -1 || j > this.f38065OooO0o) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f38067OooO0oO = -1;
            }
            return j2 + jSkip;
        }
        if (OooO00o(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f38066OooO0o0;
        int i4 = this.f38068OooO0oo;
        if (i3 - i4 >= j - j2) {
            this.f38068OooO0oo = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f38068OooO0oo = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f38064OooO0Oo;
        if (bArr2 == null) {
            OooO0OO();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f38068OooO0oo;
            int i6 = this.f38066OooO0o0;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f38068OooO0oo += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f38067OooO0oO == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (OooO00o(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f38064OooO0Oo && (bArr2 = this.f38064OooO0Oo) == null) {
                        OooO0OO();
                        throw null;
                    }
                    int i8 = this.f38066OooO0o0;
                    int i9 = this.f38068OooO0oo;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f38068OooO0oo += i4;
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
            OooO0OO();
            throw null;
        }
    }
}
