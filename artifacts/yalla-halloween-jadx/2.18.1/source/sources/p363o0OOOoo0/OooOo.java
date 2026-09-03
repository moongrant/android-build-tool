package p363o0OOOoo0;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import o0O0O00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements Closeable {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final Logger f38550OoooO0O = Logger.getLogger(OooOo.class.getName());

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO00o f38551Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final RandomAccessFile f38552Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f38553Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f38554Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final byte[] f38555OoooO0 = new byte[16];

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO00o f38556OoooO00;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f38557OooO0OO = new OooO00o(0, 0);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f38558OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f38559OooO0O0;

        public OooO00o(int i, int i2) {
            this.f38558OooO00o = i;
            this.f38559OooO0O0 = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(OooO00o.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f38558OooO00o);
            sb.append(", length = ");
            return o0ooOOo.OooO00o(sb, this.f38559OooO0O0, "]");
        }
    }

    public interface OooO0OO {
    }

    public OooOo(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    Oooo0(bArr, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr);
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
        this.f38552Oooo0o = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(this.f38555OoooO0);
        int iOooOOo = OooOOo(this.f38555OoooO0, 0);
        this.f38553Oooo0oO = iOooOOo;
        if (iOooOOo > randomAccessFile2.length()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("File is truncated. Expected length: ");
            sbOooO0o0.append(this.f38553Oooo0oO);
            sbOooO0o0.append(", Actual length: ");
            sbOooO0o0.append(randomAccessFile2.length());
            throw new IOException(sbOooO0o0.toString());
        }
        this.f38554Oooo0oo = OooOOo(this.f38555OoooO0, 4);
        int iOooOOo2 = OooOOo(this.f38555OoooO0, 8);
        int iOooOOo3 = OooOOo(this.f38555OoooO0, 12);
        this.f38551Oooo = OooOOO(iOooOOo2);
        this.f38556OoooO00 = OooOOO(iOooOOo3);
    }

    public static int OooOOo(byte[] bArr, int i) {
        return ((bArr[i] & UByte.MAX_VALUE) << 24) + ((bArr[i + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i + 2] & UByte.MAX_VALUE) << 8) + (bArr[i + 3] & UByte.MAX_VALUE);
    }

    public static void Oooo0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void OooO00o(byte[] bArr) throws IOException {
        int iOooOoo;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    OooO0Oo(length);
                    boolean zOooO0oo = OooO0oo();
                    if (zOooO0oo) {
                        iOooOoo = 16;
                    } else {
                        OooO00o oooO00o = this.f38556OoooO00;
                        iOooOoo = OooOoo(oooO00o.f38558OooO00o + 4 + oooO00o.f38559OooO0O0);
                    }
                    OooO00o oooO00o2 = new OooO00o(iOooOoo, length);
                    Oooo0(this.f38555OoooO0, 0, length);
                    OooOoO(iOooOoo, this.f38555OoooO0, 4);
                    OooOoO(iOooOoo + 4, bArr, length);
                    Oooo00o(this.f38553Oooo0oO, this.f38554Oooo0oo + 1, zOooO0oo ? iOooOoo : this.f38551Oooo.f38558OooO00o, iOooOoo);
                    this.f38556OoooO00 = oooO00o2;
                    this.f38554Oooo0oo++;
                    if (zOooO0oo) {
                        this.f38551Oooo = oooO00o2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void OooO0O0() throws IOException {
        Oooo00o(4096, 0, 0, 0);
        this.f38554Oooo0oo = 0;
        OooO00o oooO00o = OooO00o.f38557OooO0OO;
        this.f38551Oooo = oooO00o;
        this.f38556OoooO00 = oooO00o;
        if (this.f38553Oooo0oO > 4096) {
            this.f38552Oooo0o.setLength(4096);
            this.f38552Oooo0o.getChannel().force(true);
        }
        this.f38553Oooo0oO = 4096;
    }

    public final void OooO0Oo(int i) throws IOException {
        int i2 = i + 4;
        int iOooOoOO = this.f38553Oooo0oO - OooOoOO();
        if (iOooOoOO >= i2) {
            return;
        }
        int i3 = this.f38553Oooo0oO;
        do {
            iOooOoOO += i3;
            i3 <<= 1;
        } while (iOooOoOO < i2);
        this.f38552Oooo0o.setLength(i3);
        this.f38552Oooo0o.getChannel().force(true);
        OooO00o oooO00o = this.f38556OoooO00;
        int iOooOoo = OooOoo(oooO00o.f38558OooO00o + 4 + oooO00o.f38559OooO0O0);
        if (iOooOoo < this.f38551Oooo.f38558OooO00o) {
            FileChannel channel = this.f38552Oooo0o.getChannel();
            channel.position(this.f38553Oooo0oO);
            long j = iOooOoo - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f38556OoooO00.f38558OooO00o;
        int i5 = this.f38551Oooo.f38558OooO00o;
        if (i4 < i5) {
            int i6 = (this.f38553Oooo0oO + i4) - 16;
            Oooo00o(i3, this.f38554Oooo0oo, i5, i6);
            this.f38556OoooO00 = new OooO00o(i6, this.f38556OoooO00.f38559OooO0O0);
        } else {
            Oooo00o(i3, this.f38554Oooo0oo, i5, i4);
        }
        this.f38553Oooo0oO = i3;
    }

    public final synchronized void OooO0o(OooO0OO oooO0OO) throws IOException {
        int iOooOoo = this.f38551Oooo.f38558OooO00o;
        for (int i = 0; i < this.f38554Oooo0oo; i++) {
            OooO00o oooO00oOooOOO = OooOOO(iOooOoo);
            ((Oooo000) oooO0OO).OooO00o(new OooO0O0(oooO00oOooOOO), oooO00oOooOOO.f38559OooO0O0);
            iOooOoo = OooOoo(oooO00oOooOOO.f38558OooO00o + 4 + oooO00oOooOOO.f38559OooO0O0);
        }
    }

    public final synchronized boolean OooO0oo() {
        return this.f38554Oooo0oo == 0;
    }

    public final OooO00o OooOOO(int i) throws IOException {
        if (i == 0) {
            return OooO00o.f38557OooO0OO;
        }
        this.f38552Oooo0o.seek(i);
        return new OooO00o(i, this.f38552Oooo0o.readInt());
    }

    public final synchronized void OooOOoo() throws IOException {
        if (OooO0oo()) {
            throw new NoSuchElementException();
        }
        if (this.f38554Oooo0oo == 1) {
            OooO0O0();
        } else {
            OooO00o oooO00o = this.f38551Oooo;
            int iOooOoo = OooOoo(oooO00o.f38558OooO00o + 4 + oooO00o.f38559OooO0O0);
            OooOo0O(iOooOoo, this.f38555OoooO0, 0, 4);
            int iOooOOo = OooOOo(this.f38555OoooO0, 0);
            Oooo00o(this.f38553Oooo0oO, this.f38554Oooo0oo - 1, iOooOoo, this.f38556OoooO00.f38558OooO00o);
            this.f38554Oooo0oo--;
            this.f38551Oooo = new OooO00o(iOooOoo, iOooOOo);
        }
    }

    public final void OooOo0O(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iOooOoo = OooOoo(i);
        int i4 = iOooOoo + i3;
        int i5 = this.f38553Oooo0oO;
        if (i4 <= i5) {
            this.f38552Oooo0o.seek(iOooOoo);
            this.f38552Oooo0o.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iOooOoo;
        this.f38552Oooo0o.seek(iOooOoo);
        this.f38552Oooo0o.readFully(bArr, i2, i6);
        this.f38552Oooo0o.seek(16L);
        this.f38552Oooo0o.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void OooOoO(int i, byte[] bArr, int i2) throws IOException {
        int iOooOoo = OooOoo(i);
        int i3 = iOooOoo + i2;
        int i4 = this.f38553Oooo0oO;
        if (i3 <= i4) {
            this.f38552Oooo0o.seek(iOooOoo);
            this.f38552Oooo0o.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iOooOoo;
        this.f38552Oooo0o.seek(iOooOoo);
        this.f38552Oooo0o.write(bArr, 0, i5);
        this.f38552Oooo0o.seek(16L);
        this.f38552Oooo0o.write(bArr, i5 + 0, i2 - i5);
    }

    public final int OooOoOO() {
        if (this.f38554Oooo0oo == 0) {
            return 16;
        }
        OooO00o oooO00o = this.f38556OoooO00;
        int i = oooO00o.f38558OooO00o;
        int i2 = this.f38551Oooo.f38558OooO00o;
        return i >= i2 ? (i - i2) + 4 + oooO00o.f38559OooO0O0 + 16 : (((i + 4) + oooO00o.f38559OooO0O0) + this.f38553Oooo0oO) - i2;
    }

    public final int OooOoo(int i) {
        int i2 = this.f38553Oooo0oO;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void Oooo00o(int i, int i2, int i3, int i4) throws IOException {
        byte[] bArr = this.f38555OoooO0;
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            Oooo0(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        this.f38552Oooo0o.seek(0L);
        this.f38552Oooo0o.write(this.f38555OoooO0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f38552Oooo0o.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OooOo.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f38553Oooo0oO);
        sb.append(", size=");
        sb.append(this.f38554Oooo0oo);
        sb.append(", first=");
        sb.append(this.f38551Oooo);
        sb.append(", last=");
        sb.append(this.f38556OoooO00);
        sb.append(", element lengths=[");
        try {
            synchronized (this) {
                int iOooOoo = this.f38551Oooo.f38558OooO00o;
                boolean z = true;
                for (int i = 0; i < this.f38554Oooo0oo; i++) {
                    OooO00o oooO00oOooOOO = OooOOO(iOooOoo);
                    new OooO0O0(oooO00oOooOOO);
                    int i2 = oooO00oOooOOO.f38559OooO0O0;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i2);
                    iOooOoo = OooOoo(oooO00oOooOOO.f38558OooO00o + 4 + oooO00oOooOOO.f38559OooO0O0);
                }
            }
        } catch (IOException e) {
            f38550OoooO0O.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final class OooO0O0 extends InputStream {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f38560Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f38561Oooo0oO;

        public OooO0O0(OooO00o oooO00o) {
            this.f38560Oooo0o = OooOo.this.OooOoo(oooO00o.f38558OooO00o + 4);
            this.f38561Oooo0oO = oooO00o.f38559OooO0O0;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            Objects.requireNonNull(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f38561Oooo0oO;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            OooOo.this.OooOo0O(this.f38560Oooo0o, bArr, i, i2);
            this.f38560Oooo0o = OooOo.this.OooOoo(this.f38560Oooo0o + i2);
            this.f38561Oooo0oO -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f38561Oooo0oO == 0) {
                return -1;
            }
            OooOo.this.f38552Oooo0o.seek(this.f38560Oooo0o);
            int i = OooOo.this.f38552Oooo0o.read();
            this.f38560Oooo0o = OooOo.this.OooOoo(this.f38560Oooo0o + 1);
            this.f38561Oooo0oO--;
            return i;
        }
    }
}
