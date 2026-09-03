package p461o0OooO0;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO implements Closeable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Logger f46630OooOO0 = Logger.getLogger(o00000OO.class.getName());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final byte[] f46631OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RandomAccessFile f46632OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f46633OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46634OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO00o f46635OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f46636OooO0oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f46637OooO0OO = new OooO00o(0, 0);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f46638OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f46639OooO0O0;

        public OooO00o(int i, int i2) {
            this.f46638OooO00o = i;
            this.f46639OooO0O0 = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(OooO00o.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f46638OooO00o);
            sb.append(", length = ");
            return OooOO0.OooO0O0(sb, this.f46639OooO0O0, "]");
        }
    }

    public o00000OO(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f46631OooO = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                int i2 = 0;
                for (int i3 = 4; i < i3; i3 = 4) {
                    int i4 = iArr[i];
                    bArr2[i2] = (byte) (i4 >> 24);
                    bArr2[i2 + 1] = (byte) (i4 >> 16);
                    bArr2[i2 + 2] = (byte) (i4 >> 8);
                    bArr2[i2 + 3] = (byte) i4;
                    i2 += 4;
                    i++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f46632OooO0Oo = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iOooOo00 = OooOo00(0, bArr);
        this.f46634OooO0o0 = iOooOo00;
        if (iOooOo00 > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f46634OooO0o0 + ", Actual length: " + randomAccessFile2.length());
        }
        this.f46633OooO0o = OooOo00(4, bArr);
        int iOooOo01 = OooOo00(8, bArr);
        int iOooOo02 = OooOo00(12, bArr);
        this.f46635OooO0oO = OooOOo(iOooOo01);
        this.f46636OooO0oo = OooOOo(iOooOo02);
    }

    public static int OooOo00(int i, byte[] bArr) {
        return ((bArr[i] & UByte.MAX_VALUE) << 24) + ((bArr[i + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i + 2] & UByte.MAX_VALUE) << 8) + (bArr[i + 3] & UByte.MAX_VALUE);
    }

    public final void OooO00o(byte[] bArr) throws IOException {
        int iOooo0;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    OooO0oO(length);
                    boolean zOooOOo0 = OooOOo0();
                    if (zOooOOo0) {
                        iOooo0 = 16;
                    } else {
                        OooO00o oooO00o = this.f46636OooO0oo;
                        iOooo0 = Oooo0(oooO00o.f46638OooO00o + 4 + oooO00o.f46639OooO0O0);
                    }
                    OooO00o oooO00o2 = new OooO00o(iOooo0, length);
                    byte[] bArr2 = this.f46631OooO;
                    bArr2[0] = (byte) (length >> 24);
                    bArr2[1] = (byte) (length >> 16);
                    bArr2[2] = (byte) (length >> 8);
                    bArr2[3] = (byte) length;
                    OooOooO(iOooo0, bArr2, 4);
                    OooOooO(iOooo0 + 4, bArr, length);
                    Oooo0O0(this.f46634OooO0o0, this.f46633OooO0o + 1, zOooOOo0 ? iOooo0 : this.f46635OooO0oO.f46638OooO00o, iOooo0);
                    this.f46636OooO0oo = oooO00o2;
                    this.f46633OooO0o++;
                    if (zOooOOo0) {
                        this.f46635OooO0oO = oooO00o2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void OooO0OO() throws IOException {
        Oooo0O0(4096, 0, 0, 0);
        this.f46633OooO0o = 0;
        OooO00o oooO00o = OooO00o.f46637OooO0OO;
        this.f46635OooO0oO = oooO00o;
        this.f46636OooO0oo = oooO00o;
        if (this.f46634OooO0o0 > 4096) {
            RandomAccessFile randomAccessFile = this.f46632OooO0Oo;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f46634OooO0o0 = 4096;
    }

    public final void OooO0oO(int i) throws IOException {
        int i2 = i + 4;
        int iOooo00o = this.f46634OooO0o0 - Oooo00o();
        if (iOooo00o >= i2) {
            return;
        }
        int i3 = this.f46634OooO0o0;
        do {
            iOooo00o += i3;
            i3 <<= 1;
        } while (iOooo00o < i2);
        RandomAccessFile randomAccessFile = this.f46632OooO0Oo;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        OooO00o oooO00o = this.f46636OooO0oo;
        int iOooo0 = Oooo0(oooO00o.f46638OooO00o + 4 + oooO00o.f46639OooO0O0);
        if (iOooo0 < this.f46635OooO0oO.f46638OooO00o) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f46634OooO0o0);
            long j = iOooo0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f46636OooO0oo.f46638OooO00o;
        int i5 = this.f46635OooO0oO.f46638OooO00o;
        if (i4 < i5) {
            int i6 = (this.f46634OooO0o0 + i4) - 16;
            Oooo0O0(i3, this.f46633OooO0o, i5, i6);
            this.f46636OooO0oo = new OooO00o(i6, this.f46636OooO0oo.f46639OooO0O0);
        } else {
            Oooo0O0(i3, this.f46633OooO0o, i5, i4);
        }
        this.f46634OooO0o0 = i3;
    }

    public final OooO00o OooOOo(int i) throws IOException {
        if (i == 0) {
            return OooO00o.f46637OooO0OO;
        }
        RandomAccessFile randomAccessFile = this.f46632OooO0Oo;
        randomAccessFile.seek(i);
        return new OooO00o(i, randomAccessFile.readInt());
    }

    public final synchronized boolean OooOOo0() {
        return this.f46633OooO0o == 0;
    }

    public final void OooOo(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iOooo0 = Oooo0(i);
        int i4 = iOooo0 + i3;
        int i5 = this.f46634OooO0o0;
        RandomAccessFile randomAccessFile = this.f46632OooO0Oo;
        if (i4 <= i5) {
            randomAccessFile.seek(iOooo0);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iOooo0;
        randomAccessFile.seek(iOooo0);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final synchronized void OooOo0() throws IOException {
        if (OooOOo0()) {
            throw new NoSuchElementException();
        }
        if (this.f46633OooO0o == 1) {
            OooO0OO();
        } else {
            OooO00o oooO00o = this.f46635OooO0oO;
            int iOooo0 = Oooo0(oooO00o.f46638OooO00o + 4 + oooO00o.f46639OooO0O0);
            OooOo(iOooo0, this.f46631OooO, 0, 4);
            int iOooOo00 = OooOo00(0, this.f46631OooO);
            Oooo0O0(this.f46634OooO0o0, this.f46633OooO0o - 1, iOooo0, this.f46636OooO0oo.f46638OooO00o);
            this.f46633OooO0o--;
            this.f46635OooO0oO = new OooO00o(iOooo0, iOooOo00);
        }
    }

    public final void OooOooO(int i, byte[] bArr, int i2) throws IOException {
        int iOooo0 = Oooo0(i);
        int i3 = iOooo0 + i2;
        int i4 = this.f46634OooO0o0;
        RandomAccessFile randomAccessFile = this.f46632OooO0Oo;
        if (i3 <= i4) {
            randomAccessFile.seek(iOooo0);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iOooo0;
        randomAccessFile.seek(iOooo0);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, 0 + i5, i2 - i5);
    }

    public final int Oooo0(int i) {
        int i2 = this.f46634OooO0o0;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final int Oooo00o() {
        if (this.f46633OooO0o == 0) {
            return 16;
        }
        OooO00o oooO00o = this.f46636OooO0oo;
        int i = oooO00o.f46638OooO00o;
        int i2 = this.f46635OooO0oO.f46638OooO00o;
        return i >= i2 ? (i - i2) + 4 + oooO00o.f46639OooO0O0 + 16 : (((i + 4) + oooO00o.f46639OooO0O0) + this.f46634OooO0o0) - i2;
    }

    public final void Oooo0O0(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f46631OooO;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.f46632OooO0Oo;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                int i7 = iArr[i5];
                bArr[i6] = (byte) (i7 >> 24);
                bArr[i6 + 1] = (byte) (i7 >> 16);
                bArr[i6 + 2] = (byte) (i7 >> 8);
                bArr[i6 + 3] = (byte) i7;
                i6 += 4;
                i5++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f46632OooO0Oo.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(o00000OO.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f46634OooO0o0);
        sb.append(", size=");
        sb.append(this.f46633OooO0o);
        sb.append(", first=");
        sb.append(this.f46635OooO0oO);
        sb.append(", last=");
        sb.append(this.f46636OooO0oo);
        sb.append(", element lengths=[");
        try {
            synchronized (this) {
                int iOooo0 = this.f46635OooO0oO.f46638OooO00o;
                boolean z = true;
                for (int i = 0; i < this.f46633OooO0o; i++) {
                    OooO00o oooO00oOooOOo = OooOOo(iOooo0);
                    new OooO0O0(oooO00oOooOOo);
                    int i2 = oooO00oOooOOo.f46639OooO0O0;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i2);
                    iOooo0 = Oooo0(oooO00oOooOOo.f46638OooO00o + 4 + oooO00oOooOOo.f46639OooO0O0);
                }
            }
        } catch (IOException e) {
            f46630OooOO0.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final class OooO0O0 extends InputStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46640OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f46642OooO0o0;

        public OooO0O0(OooO00o oooO00o) {
            this.f46640OooO0Oo = o00000OO.this.Oooo0(oooO00o.f46638OooO00o + 4);
            this.f46642OooO0o0 = oooO00o.f46639OooO0O0;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f46642OooO0o0;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.f46640OooO0Oo;
            o00000OO o00000oo2 = o00000OO.this;
            o00000oo2.OooOo(i4, bArr, i, i2);
            this.f46640OooO0Oo = o00000oo2.Oooo0(this.f46640OooO0Oo + i2);
            this.f46642OooO0o0 -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f46642OooO0o0 == 0) {
                return -1;
            }
            o00000OO o00000oo2 = o00000OO.this;
            o00000oo2.f46632OooO0Oo.seek(this.f46640OooO0Oo);
            int i = o00000oo2.f46632OooO0Oo.read();
            this.f46640OooO0Oo = o00000oo2.Oooo0(this.f46640OooO0Oo + 1);
            this.f46642OooO0o0--;
            return i;
        }
    }
}
