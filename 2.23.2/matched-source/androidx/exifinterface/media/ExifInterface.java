package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o0000O0;
import com.facebook.internal.security.CertificateUtil;
import com.google.logging.type.LogSeverity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class ExifInterface {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final OooO f5706OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final OooO[] f5707OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final HashMap<Integer, OooO>[] f5708OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final HashMap<String, OooO>[] f5709OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final HashSet<String> f5710OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f5711OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final Charset f5712Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final byte[] f5713Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final byte[] f5714OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final Pattern f5715OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final Pattern f5716OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final Pattern f5717Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final OooO[][] f5718o000oOoO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f5719OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f5720OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public FileDescriptor f5721OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AssetManager.AssetInputStream f5722OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f5723OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashSet f5724OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, OooO0o>[] f5725OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ByteOrder f5726OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f5727OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f5728OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f5729OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f5730OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f5731OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte[] f5732OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f5733OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f5734OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f5735OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f5736OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f5737OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final boolean f5681OooOo00 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final List<Integer> f5680OooOo0 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final List<Integer> f5682OooOo0O = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final int[] f5683OooOo0o = {8, 8, 8};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final int[] f5679OooOo = {8};

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final byte[] f5685OooOoO0 = {-1, -40, -1};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final byte[] f5684OooOoO = {102, 116, 121, 112};

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final byte[] f5686OooOoOO = {109, 105, 102, 49};

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final byte[] f5688OooOoo0 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final byte[] f5687OooOoo = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final byte[] f5689OooOooO = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final byte[] f5690OooOooo = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final byte[] f5693Oooo000 = {101, 88, 73, 102};

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final byte[] f5694Oooo00O = {73, 72, 68, 82};

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final byte[] f5695Oooo00o = {73, 69, 78, 68};

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final byte[] f5692Oooo0 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final byte[] f5696Oooo0O0 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final byte[] f5697Oooo0OO = {69, 88, 73, 70};

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final byte[] f5699Oooo0o0 = {-99, 1, 42};

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final byte[] f5698Oooo0o = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final byte[] f5700Oooo0oO = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final byte[] f5701Oooo0oo = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final byte[] f5691Oooo = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final byte[] f5704OoooO00 = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final String[] f5703OoooO0 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final int[] f5705OoooO0O = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final byte[] f5702OoooO = {65, 83, 67, 73, 73, 0, 0, 0};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IfdType {
    }

    public class OooO00o extends MediaDataSource {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f5742OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f5743OooO0o0;

        public OooO00o(OooOO0O oooOO0O) {
            this.f5743OooO0o0 = oooOO0O;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f5742OooO0Oo;
                OooOO0O oooOO0O = this.f5743OooO0o0;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) oooOO0O.available())) {
                        return -1;
                    }
                    oooOO0O.OooO0OO(j);
                    this.f5742OooO0Oo = j;
                }
                if (i2 > oooOO0O.available()) {
                    i2 = oooOO0O.available();
                }
                int i3 = oooOO0O.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f5742OooO0Oo += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f5742OooO0Oo = -1L;
            return -1;
        }
    }

    public static class OooO0O0 extends InputStream implements DataInput {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final DataInputStream f5746OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5747OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ByteOrder f5748OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public byte[] f5749OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final ByteOrder f5745OooO0oo = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final ByteOrder f5744OooO = ByteOrder.BIG_ENDIAN;

        public OooO0O0(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public final void OooO00o(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                DataInputStream dataInputStream = this.f5746OooO0Oo;
                int i3 = i - i2;
                int iSkip = (int) dataInputStream.skip(i3);
                if (iSkip <= 0) {
                    if (this.f5749OooO0oO == null) {
                        this.f5749OooO0oO = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f5749OooO0oO, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException(OooO0OO.OooO00o.OooO00o("Reached EOF while skipping ", i, " bytes."));
                    }
                }
                i2 += iSkip;
            }
            this.f5747OooO0o += i2;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f5746OooO0Oo.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f5747OooO0o++;
            return this.f5746OooO0Oo.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f5747OooO0o++;
            return this.f5746OooO0Oo.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f5747OooO0o++;
            int i = this.f5746OooO0Oo.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f5747OooO0o += 2;
            return this.f5746OooO0Oo.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f5747OooO0o += i2;
            this.f5746OooO0Oo.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f5747OooO0o += 4;
            DataInputStream dataInputStream = this.f5746OooO0Oo;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5748OooO0o0;
            if (byteOrder == f5745OooO0oo) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f5744OooO) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f5748OooO0o0);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.f5747OooO0o += 8;
            DataInputStream dataInputStream = this.f5746OooO0Oo;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5748OooO0o0;
            if (byteOrder == f5745OooO0oo) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == f5744OooO) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            throw new IOException("Invalid byte order: " + this.f5748OooO0o0);
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f5747OooO0o += 2;
            DataInputStream dataInputStream = this.f5746OooO0Oo;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5748OooO0o0;
            if (byteOrder == f5745OooO0oo) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f5744OooO) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f5748OooO0o0);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f5747OooO0o += 2;
            return this.f5746OooO0Oo.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f5747OooO0o++;
            return this.f5746OooO0Oo.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f5747OooO0o += 2;
            DataInputStream dataInputStream = this.f5746OooO0Oo;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5748OooO0o0;
            if (byteOrder == f5745OooO0oo) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f5744OooO) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f5748OooO0o0);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public OooO0O0(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public OooO0O0(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f5748OooO0o0 = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f5746OooO0Oo = dataInputStream;
            dataInputStream.mark(0);
            this.f5747OooO0o = 0;
            this.f5748OooO0o0 = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f5746OooO0Oo.read(bArr, i, i2);
            this.f5747OooO0o += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f5747OooO0o += bArr.length;
            this.f5746OooO0Oo.readFully(bArr);
        }
    }

    public static class OooO0OO extends FilterOutputStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OutputStream f5750OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ByteOrder f5751OooO0o0;

        public OooO0OO(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f5750OooO0Oo = outputStream;
            this.f5751OooO0o0 = byteOrder;
        }

        public final void OooO00o(int i) throws IOException {
            this.f5750OooO0Oo.write(i);
        }

        public final void OooO0OO(int i) throws IOException {
            ByteOrder byteOrder = this.f5751OooO0o0;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f5750OooO0Oo;
            if (byteOrder == byteOrder2) {
                outputStream.write((i >>> 0) & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i >>> 24) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write((i >>> 0) & 255);
            }
        }

        public final void OooO0oO(short s) throws IOException {
            ByteOrder byteOrder = this.f5751OooO0o0;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f5750OooO0Oo;
            if (byteOrder == byteOrder2) {
                outputStream.write((s >>> 0) & 255);
                outputStream.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s >>> 8) & 255);
                outputStream.write((s >>> 0) & 255);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f5750OooO0Oo.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f5750OooO0Oo.write(bArr, i, i2);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5752OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f5753OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f5754OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f5755OooO0Oo;

        public OooO0o(int i, int i2, byte[] bArr) {
            this(-1L, bArr, i, i2);
        }

        public static OooO0o OooO00o(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(ExifInterface.f5712Ooooo00);
            return new OooO0o(2, bytes.length, bytes);
        }

        public static OooO0o OooO0O0(long j, ByteOrder byteOrder) {
            return OooO0OO(new long[]{j}, byteOrder);
        }

        public static OooO0o OooO0OO(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f5705OoooO0O[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new OooO0o(4, jArr.length, byteBufferWrap.array());
        }

        public static OooO0o OooO0Oo(OooOO0[] oooOO0Arr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f5705OoooO0O[5] * oooOO0Arr.length]);
            byteBufferWrap.order(byteOrder);
            for (OooOO0 oooOO1 : oooOO0Arr) {
                byteBufferWrap.putInt((int) oooOO1.f5756OooO00o);
                byteBufferWrap.putInt((int) oooOO1.f5757OooO0O0);
            }
            return new OooO0o(5, oooOO0Arr.length, byteBufferWrap.array());
        }

        public static OooO0o OooO0o(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f5705OoooO0O[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new OooO0o(3, iArr.length, byteBufferWrap.array());
        }

        public static OooO0o OooO0o0(int i, ByteOrder byteOrder) {
            return OooO0o(new int[]{i}, byteOrder);
        }

        public final String OooO(ByteOrder byteOrder) throws Throwable {
            Object objOooOO0 = OooOO0(byteOrder);
            if (objOooOO0 == null) {
                return null;
            }
            if (objOooOO0 instanceof String) {
                return (String) objOooOO0;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objOooOO0 instanceof long[]) {
                long[] jArr = (long[]) objOooOO0;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objOooOO0 instanceof int[]) {
                int[] iArr = (int[]) objOooOO0;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objOooOO0 instanceof double[]) {
                double[] dArr = (double[]) objOooOO0;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objOooOO0 instanceof OooOO0[])) {
                return null;
            }
            OooOO0[] oooOO0Arr = (OooOO0[]) objOooOO0;
            while (i < oooOO0Arr.length) {
                sb.append(oooOO0Arr[i].f5756OooO00o);
                sb.append('/');
                sb.append(oooOO0Arr[i].f5757OooO0O0);
                i++;
                if (i != oooOO0Arr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public final double OooO0oO(ByteOrder byteOrder) {
            Object objOooOO0 = OooOO0(byteOrder);
            if (objOooOO0 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objOooOO0 instanceof String) {
                return Double.parseDouble((String) objOooOO0);
            }
            if (objOooOO0 instanceof long[]) {
                long[] jArr = (long[]) objOooOO0;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objOooOO0 instanceof int[]) {
                int[] iArr = (int[]) objOooOO0;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objOooOO0 instanceof double[]) {
                double[] dArr = (double[]) objOooOO0;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objOooOO0 instanceof OooOO0[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            OooOO0[] oooOO0Arr = (OooOO0[]) objOooOO0;
            if (oooOO0Arr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            OooOO0 oooOO1 = oooOO0Arr[0];
            return oooOO1.f5756OooO00o / oooOO1.f5757OooO0O0;
        }

        public final int OooO0oo(ByteOrder byteOrder) throws Throwable {
            Object objOooOO0 = OooOO0(byteOrder);
            if (objOooOO0 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objOooOO0 instanceof String) {
                return Integer.parseInt((String) objOooOO0);
            }
            if (objOooOO0 instanceof long[]) {
                long[] jArr = (long[]) objOooOO0;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objOooOO0 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objOooOO0;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX WARN: Code duplicated, block: B:174:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0167: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:360), block:B:132:0x0167 */
        /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v25, types: [androidx.exifinterface.media.ExifInterface$OooOO0[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [androidx.exifinterface.media.ExifInterface$OooOO0[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
        public final Serializable OooOO0(ByteOrder byteOrder) throws Throwable {
            OooO0O0 oooO0O0;
            InputStream inputStream;
            byte b;
            byte[] bArr;
            byte[] bArr2 = this.f5755OooO0Oo;
            InputStream inputStream2 = null;
            try {
                try {
                    oooO0O0 = new OooO0O0(bArr2);
                    try {
                        oooO0O0.f5748OooO0o0 = byteOrder;
                        int i = this.f5752OooO00o;
                        boolean z = true;
                        int length = 0;
                        int i2 = this.f5753OooO0O0;
                        switch (i) {
                            case 1:
                            case 6:
                                if (bArr2.length != 1 || (b = bArr2[0]) < 0 || b > 1) {
                                    String str = new String(bArr2, ExifInterface.f5712Ooooo00);
                                    try {
                                        oooO0O0.close();
                                        break;
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (i2 >= ExifInterface.f5702OoooO.length) {
                                    int i3 = 0;
                                    while (true) {
                                        bArr = ExifInterface.f5702OoooO;
                                        if (i3 < bArr.length) {
                                            if (bArr2[i3] != bArr[i3]) {
                                                z = false;
                                            } else {
                                                i3++;
                                            }
                                        }
                                    }
                                    if (z) {
                                        length = bArr.length;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                try {
                                    while (length < i2) {
                                        byte b2 = bArr2[length];
                                        if (b2 == 0) {
                                            String string = sb.toString();
                                            oooO0O0.close();
                                            return string;
                                        }
                                        if (b2 >= 32) {
                                            sb.append((char) b2);
                                        } else {
                                            sb.append('?');
                                        }
                                        length++;
                                    }
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                }
                                String string2 = sb.toString();
                                return string2;
                            case 3:
                                ?? r15 = new int[i2];
                                while (length < i2) {
                                    r15[length] = oooO0O0.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                }
                                return r15;
                            case 4:
                                ?? r16 = new long[i2];
                                while (length < i2) {
                                    r16[length] = ((long) oooO0O0.readInt()) & 4294967295L;
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                }
                                return r16;
                            case 5:
                                ?? r17 = new OooOO0[i2];
                                while (length < i2) {
                                    r17[length] = new OooOO0(((long) oooO0O0.readInt()) & 4294967295L, ((long) oooO0O0.readInt()) & 4294967295L);
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                }
                                return r17;
                            case 8:
                                ?? r18 = new int[i2];
                                while (length < i2) {
                                    r18[length] = oooO0O0.readShort();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                }
                                return r18;
                            case 9:
                                ?? r19 = new int[i2];
                                while (length < i2) {
                                    r19[length] = oooO0O0.readInt();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                }
                                return r19;
                            case 10:
                                ?? r110 = new OooOO0[i2];
                                while (length < i2) {
                                    r110[length] = new OooOO0(oooO0O0.readInt(), oooO0O0.readInt());
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                }
                                return r110;
                            case 11:
                                ?? r111 = new double[i2];
                                while (length < i2) {
                                    r111[length] = oooO0O0.readFloat();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                }
                                return r111;
                            case 12:
                                ?? r112 = new double[i2];
                                while (length < i2) {
                                    r112[length] = oooO0O0.readDouble();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return r112;
                            default:
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                }
                                return null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (oooO0O0 != null) {
                            try {
                                oooO0O0.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                oooO0O0 = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.f5703OoooO0[this.f5752OooO00o]);
            sb.append(", data length:");
            return p022Oooo00O.OooOO0.OooO00o(sb, this.f5755OooO0Oo.length, ")");
        }

        public OooO0o(long j, byte[] bArr, int i, int i2) {
            this.f5752OooO00o = i;
            this.f5753OooO0O0 = i2;
            this.f5754OooO0OO = j;
            this.f5755OooO0Oo = bArr;
        }
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f5756OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f5757OooO0O0;

        public OooOO0(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        public final String toString() {
            return this.f5756OooO00o + "/" + this.f5757OooO0O0;
        }

        public OooOO0(long j, long j2) {
            if (j2 == 0) {
                this.f5756OooO00o = 0L;
                this.f5757OooO0O0 = 1L;
            } else {
                this.f5756OooO00o = j;
                this.f5757OooO0O0 = j2;
            }
        }
    }

    static {
        OooO[] oooOArr = {new OooO("NewSubfileType", 254, 4), new OooO("SubfileType", 255, 4), new OooO("ImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new OooO("ImageLength", 257, 3, 4), new OooO("BitsPerSample", 258, 3), new OooO("Compression", 259, 3), new OooO("PhotometricInterpretation", 262, 3), new OooO("ImageDescription", 270, 2), new OooO("Make", 271, 2), new OooO("Model", 272, 2), new OooO("StripOffsets", 273, 3, 4), new OooO("Orientation", 274, 3), new OooO("SamplesPerPixel", 277, 3), new OooO("RowsPerStrip", 278, 3, 4), new OooO("StripByteCounts", 279, 3, 4), new OooO("XResolution", 282, 5), new OooO("YResolution", 283, 5), new OooO("PlanarConfiguration", 284, 3), new OooO("ResolutionUnit", 296, 3), new OooO("TransferFunction", 301, 3), new OooO("Software", 305, 2), new OooO("DateTime", 306, 2), new OooO("Artist", 315, 2), new OooO("WhitePoint", 318, 5), new OooO("PrimaryChromaticities", 319, 5), new OooO("SubIFDPointer", 330, 4), new OooO("JPEGInterchangeFormat", 513, 4), new OooO("JPEGInterchangeFormatLength", 514, 4), new OooO("YCbCrCoefficients", 529, 5), new OooO("YCbCrSubSampling", 530, 3), new OooO("YCbCrPositioning", 531, 3), new OooO("ReferenceBlackWhite", 532, 5), new OooO("Copyright", 33432, 2), new OooO("ExifIFDPointer", 34665, 4), new OooO("GPSInfoIFDPointer", 34853, 4), new OooO("SensorTopBorder", 4, 4), new OooO("SensorLeftBorder", 5, 4), new OooO("SensorBottomBorder", 6, 4), new OooO("SensorRightBorder", 7, 4), new OooO("ISO", 23, 3), new OooO("JpgFromRaw", 46, 7), new OooO("Xmp", LogSeverity.ALERT_VALUE, 1)};
        OooO[] oooOArr2 = {new OooO("ExposureTime", 33434, 5), new OooO("FNumber", 33437, 5), new OooO("ExposureProgram", 34850, 3), new OooO("SpectralSensitivity", 34852, 2), new OooO("PhotographicSensitivity", 34855, 3), new OooO("OECF", 34856, 7), new OooO("SensitivityType", 34864, 3), new OooO("StandardOutputSensitivity", 34865, 4), new OooO("RecommendedExposureIndex", 34866, 4), new OooO("ISOSpeed", 34867, 4), new OooO("ISOSpeedLatitudeyyy", 34868, 4), new OooO("ISOSpeedLatitudezzz", 34869, 4), new OooO("ExifVersion", 36864, 2), new OooO("DateTimeOriginal", 36867, 2), new OooO("DateTimeDigitized", 36868, 2), new OooO("OffsetTime", 36880, 2), new OooO("OffsetTimeOriginal", 36881, 2), new OooO("OffsetTimeDigitized", 36882, 2), new OooO("ComponentsConfiguration", 37121, 7), new OooO("CompressedBitsPerPixel", 37122, 5), new OooO("ShutterSpeedValue", 37377, 10), new OooO("ApertureValue", 37378, 5), new OooO("BrightnessValue", 37379, 10), new OooO("ExposureBiasValue", 37380, 10), new OooO("MaxApertureValue", 37381, 5), new OooO("SubjectDistance", 37382, 5), new OooO("MeteringMode", 37383, 3), new OooO("LightSource", 37384, 3), new OooO("Flash", 37385, 3), new OooO("FocalLength", 37386, 5), new OooO("SubjectArea", 37396, 3), new OooO("MakerNote", 37500, 7), new OooO("UserComment", 37510, 7), new OooO("SubSecTime", 37520, 2), new OooO("SubSecTimeOriginal", 37521, 2), new OooO("SubSecTimeDigitized", 37522, 2), new OooO("FlashpixVersion", 40960, 7), new OooO("ColorSpace", 40961, 3), new OooO("PixelXDimension", 40962, 3, 4), new OooO("PixelYDimension", 40963, 3, 4), new OooO("RelatedSoundFile", 40964, 2), new OooO("InteroperabilityIFDPointer", 40965, 4), new OooO("FlashEnergy", 41483, 5), new OooO("SpatialFrequencyResponse", 41484, 7), new OooO("FocalPlaneXResolution", 41486, 5), new OooO("FocalPlaneYResolution", 41487, 5), new OooO("FocalPlaneResolutionUnit", 41488, 3), new OooO("SubjectLocation", 41492, 3), new OooO("ExposureIndex", 41493, 5), new OooO("SensingMethod", 41495, 3), new OooO("FileSource", 41728, 7), new OooO("SceneType", 41729, 7), new OooO("CFAPattern", 41730, 7), new OooO("CustomRendered", 41985, 3), new OooO("ExposureMode", 41986, 3), new OooO("WhiteBalance", 41987, 3), new OooO("DigitalZoomRatio", 41988, 5), new OooO("FocalLengthIn35mmFilm", 41989, 3), new OooO("SceneCaptureType", 41990, 3), new OooO("GainControl", 41991, 3), new OooO("Contrast", 41992, 3), new OooO("Saturation", 41993, 3), new OooO("Sharpness", 41994, 3), new OooO("DeviceSettingDescription", 41995, 7), new OooO("SubjectDistanceRange", 41996, 3), new OooO("ImageUniqueID", 42016, 2), new OooO("CameraOwnerName", 42032, 2), new OooO("BodySerialNumber", 42033, 2), new OooO("LensSpecification", 42034, 5), new OooO("LensMake", 42035, 2), new OooO("LensModel", 42036, 2), new OooO("Gamma", 42240, 5), new OooO("DNGVersion", 50706, 1), new OooO("DefaultCropSize", 50720, 3, 4)};
        OooO[] oooOArr3 = {new OooO("GPSVersionID", 0, 1), new OooO("GPSLatitudeRef", 1, 2), new OooO("GPSLatitude", 2, 5, 10), new OooO("GPSLongitudeRef", 3, 2), new OooO("GPSLongitude", 4, 5, 10), new OooO("GPSAltitudeRef", 5, 1), new OooO("GPSAltitude", 6, 5), new OooO("GPSTimeStamp", 7, 5), new OooO("GPSSatellites", 8, 2), new OooO("GPSStatus", 9, 2), new OooO("GPSMeasureMode", 10, 2), new OooO("GPSDOP", 11, 5), new OooO("GPSSpeedRef", 12, 2), new OooO("GPSSpeed", 13, 5), new OooO("GPSTrackRef", 14, 2), new OooO("GPSTrack", 15, 5), new OooO("GPSImgDirectionRef", 16, 2), new OooO("GPSImgDirection", 17, 5), new OooO("GPSMapDatum", 18, 2), new OooO("GPSDestLatitudeRef", 19, 2), new OooO("GPSDestLatitude", 20, 5), new OooO("GPSDestLongitudeRef", 21, 2), new OooO("GPSDestLongitude", 22, 5), new OooO("GPSDestBearingRef", 23, 2), new OooO("GPSDestBearing", 24, 5), new OooO("GPSDestDistanceRef", 25, 2), new OooO("GPSDestDistance", 26, 5), new OooO("GPSProcessingMethod", 27, 7), new OooO("GPSAreaInformation", 28, 7), new OooO("GPSDateStamp", 29, 2), new OooO("GPSDifferential", 30, 3), new OooO("GPSHPositioningError", 31, 5)};
        OooO[] oooOArr4 = {new OooO("InteroperabilityIndex", 1, 2)};
        OooO[] oooOArr5 = {new OooO("NewSubfileType", 254, 4), new OooO("SubfileType", 255, 4), new OooO("ThumbnailImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new OooO("ThumbnailImageLength", 257, 3, 4), new OooO("BitsPerSample", 258, 3), new OooO("Compression", 259, 3), new OooO("PhotometricInterpretation", 262, 3), new OooO("ImageDescription", 270, 2), new OooO("Make", 271, 2), new OooO("Model", 272, 2), new OooO("StripOffsets", 273, 3, 4), new OooO("ThumbnailOrientation", 274, 3), new OooO("SamplesPerPixel", 277, 3), new OooO("RowsPerStrip", 278, 3, 4), new OooO("StripByteCounts", 279, 3, 4), new OooO("XResolution", 282, 5), new OooO("YResolution", 283, 5), new OooO("PlanarConfiguration", 284, 3), new OooO("ResolutionUnit", 296, 3), new OooO("TransferFunction", 301, 3), new OooO("Software", 305, 2), new OooO("DateTime", 306, 2), new OooO("Artist", 315, 2), new OooO("WhitePoint", 318, 5), new OooO("PrimaryChromaticities", 319, 5), new OooO("SubIFDPointer", 330, 4), new OooO("JPEGInterchangeFormat", 513, 4), new OooO("JPEGInterchangeFormatLength", 514, 4), new OooO("YCbCrCoefficients", 529, 5), new OooO("YCbCrSubSampling", 530, 3), new OooO("YCbCrPositioning", 531, 3), new OooO("ReferenceBlackWhite", 532, 5), new OooO("Copyright", 33432, 2), new OooO("ExifIFDPointer", 34665, 4), new OooO("GPSInfoIFDPointer", 34853, 4), new OooO("DNGVersion", 50706, 1), new OooO("DefaultCropSize", 50720, 3, 4)};
        f5706OoooOO0 = new OooO("StripOffsets", 273, 3);
        f5718o000oOoO = new OooO[][]{oooOArr, oooOArr2, oooOArr3, oooOArr4, oooOArr5, oooOArr, new OooO[]{new OooO("ThumbnailImage", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 7), new OooO("CameraSettingsIFDPointer", 8224, 4), new OooO("ImageProcessingIFDPointer", 8256, 4)}, new OooO[]{new OooO("PreviewImageStart", 257, 4), new OooO("PreviewImageLength", 258, 4)}, new OooO[]{new OooO("AspectFrame", 4371, 3)}, new OooO[]{new OooO("ColorSpace", 55, 3)}};
        f5707OoooOOO = new OooO[]{new OooO("SubIFDPointer", 330, 4), new OooO("ExifIFDPointer", 34665, 4), new OooO("GPSInfoIFDPointer", 34853, 4), new OooO("InteroperabilityIFDPointer", 40965, 4), new OooO("CameraSettingsIFDPointer", 8224, 1), new OooO("ImageProcessingIFDPointer", 8256, 1)};
        f5708OoooOOo = new HashMap[10];
        f5709OoooOo0 = new HashMap[10];
        f5710OoooOoO = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f5711OoooOoo = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f5712Ooooo00 = charsetForName;
        f5713Ooooo0o = "Exif\u0000\u0000".getBytes(charsetForName);
        f5714OooooO0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            OooO[][] oooOArr6 = f5718o000oOoO;
            if (i >= oooOArr6.length) {
                HashMap<Integer, Integer> map = f5711OoooOoo;
                OooO[] oooOArr7 = f5707OoooOOO;
                map.put(Integer.valueOf(oooOArr7[0].f5738OooO00o), 5);
                map.put(Integer.valueOf(oooOArr7[1].f5738OooO00o), 1);
                map.put(Integer.valueOf(oooOArr7[2].f5738OooO00o), 2);
                map.put(Integer.valueOf(oooOArr7[3].f5738OooO00o), 3);
                map.put(Integer.valueOf(oooOArr7[4].f5738OooO00o), 7);
                map.put(Integer.valueOf(oooOArr7[5].f5738OooO00o), 8);
                Pattern.compile(".*[1-9].*");
                f5715OooooOO = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f5716OooooOo = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f5717Oooooo0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f5708OoooOOo[i] = new HashMap<>();
            f5709OoooOo0[i] = new HashMap<>();
            for (OooO oooO : oooOArr6[i]) {
                f5708OoooOOo[i].put(Integer.valueOf(oooO.f5738OooO00o), oooO);
                f5709OoooOo0[i].put(oooO.f5739OooO0O0, oooO);
            }
            i++;
        }
    }

    public ExifInterface(@NonNull File file) throws Throwable {
        OooO[][] oooOArr = f5718o000oOoO;
        this.f5725OooO0o0 = new HashMap[oooOArr.length];
        this.f5724OooO0o = new HashSet(oooOArr.length);
        this.f5726OooO0oO = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        OooOo00(file.getAbsolutePath());
    }

    public static double OooO0O0(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void OooO0OO(OooO0O0 oooO0O0, OooO0OO oooO0OO, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (oooO0O0.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f5712Ooooo00;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int i = oooO0O0.readInt();
            oooO0OO.write(bArr3);
            oooO0OO.OooO0OO(i);
            if (i % 2 == 1) {
                i++;
            }
            androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO, i);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair<Integer, Integer> OooOOo(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairOooOOo = OooOOo(strArrSplit[0]);
            if (((Integer) pairOooOOo.first).intValue() == 2) {
                return pairOooOOo;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairOooOOo2 = OooOOo(strArrSplit[i]);
                int iIntValue = (((Integer) pairOooOOo2.first).equals(pairOooOOo.first) || ((Integer) pairOooOOo2.second).equals(pairOooOOo.first)) ? ((Integer) pairOooOOo.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairOooOOo.second).intValue() == -1 || !(((Integer) pairOooOOo2.first).equals(pairOooOOo.second) || ((Integer) pairOooOOo2.second).equals(pairOooOOo.second))) ? -1 : ((Integer) pairOooOOo.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairOooOOo = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairOooOOo = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairOooOOo;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    if (lValueOf.longValue() < 0 || lValueOf.longValue() > 65535) {
                        return lValueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j = (long) Double.parseDouble(strArrSplit2[0]);
                long j2 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j >= 0 && j2 >= 0) {
                    if (j <= 2147483647L && j2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static ByteOrder OooOoO0(OooO0O0 oooO0O0) throws IOException {
        short s = oooO0O0.readShort();
        boolean z = f5681OooOo00;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:120:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x0146  */
    /* JADX WARN: Code duplicated, block: B:125:0x014c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0154 A[LOOP:2: B:123:0x0147->B:128:0x0154, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x015a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x015d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0163  */
    /* JADX WARN: Code duplicated, block: B:139:0x016a A[LOOP:3: B:134:0x015e->B:139:0x016a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0173  */
    /* JADX WARN: Code duplicated, block: B:146:0x017e A[LOOP:4: B:141:0x016e->B:146:0x017e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:151:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x018d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x017c A[EDGE_INSN: B:180:0x017c->B:145:0x017c BREAK  A[LOOP:3: B:134:0x015e->B:139:0x016a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x017c A[EDGE_INSN: B:181:0x017c->B:145:0x017c BREAK  A[LOOP:3: B:134:0x015e->B:139:0x016a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f A[RETURN] */
    public final int OooO(BufferedInputStream bufferedInputStream) throws Throwable {
        boolean z;
        boolean z2;
        OooO0O0 oooO0O0;
        OooO0O0 oooO0O1;
        boolean z3;
        OooO0O0 oooO0O2;
        OooO0O0 oooO0O3;
        boolean z4;
        OooO0O0 oooO0O4;
        OooO0O0 oooO0O5;
        boolean z5;
        int i;
        byte[] bArr;
        boolean z6;
        int i2;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        boolean z7;
        OooO0O0 oooO0O6;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr5 = f5685OooOoO0;
            if (i4 >= bArr5.length) {
                z = true;
                break;
            }
            if (bArr4[i4] != bArr5[i4]) {
                z = false;
                break;
            }
            i4++;
        }
        if (z) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i5 = 0;
        while (true) {
            if (i5 >= bytes.length) {
                z2 = true;
                break;
            }
            if (bArr4[i5] != bytes[i5]) {
                z2 = false;
                break;
            }
            i5++;
        }
        if (z2) {
            return 9;
        }
        try {
            oooO0O1 = new OooO0O0(bArr4);
            try {
                long j2 = oooO0O1.readInt();
                byte[] bArr6 = new byte[4];
                oooO0O1.read(bArr6);
                if (Arrays.equals(bArr6, f5684OooOoO)) {
                    if (j2 == 1) {
                        j2 = oooO0O1.readLong();
                        j = 16;
                        if (j2 < 16) {
                        }
                    } else {
                        j = 8;
                    }
                    long j3 = 5000;
                    if (j2 > j3) {
                        j2 = j3;
                    }
                    long j4 = j2 - j;
                    if (j4 >= 8) {
                        byte[] bArr7 = new byte[4];
                        long j5 = 0;
                        boolean z8 = false;
                        boolean z9 = false;
                        while (true) {
                            if (j5 < j4 / 4 && oooO0O1.read(bArr7) == 4) {
                                if (j5 != 1) {
                                    if (Arrays.equals(bArr7, f5686OooOoOO)) {
                                        z8 = true;
                                    } else if (Arrays.equals(bArr7, f5688OooOoo0)) {
                                        z9 = true;
                                    }
                                    if (z8 && z9) {
                                        oooO0O1.close();
                                        z3 = true;
                                    }
                                }
                                j5++;
                            }
                            if (z3) {
                                return 12;
                            }
                            try {
                                oooO0O3 = new OooO0O0(bArr4);
                                try {
                                    ByteOrder byteOrderOooOoO0 = OooOoO0(oooO0O3);
                                    this.f5726OooO0oO = byteOrderOooOoO0;
                                    oooO0O3.f5748OooO0o0 = byteOrderOooOoO0;
                                    s = oooO0O3.readShort();
                                    if (s != 20306 || s == 21330) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    oooO0O3.close();
                                } catch (Exception unused) {
                                    if (oooO0O3 != null) {
                                        oooO0O3.close();
                                    }
                                    z4 = false;
                                } catch (Throwable th) {
                                    th = th;
                                    oooO0O2 = oooO0O3;
                                    if (oooO0O2 != null) {
                                        oooO0O2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                oooO0O3 = null;
                            } catch (Throwable th2) {
                                th = th2;
                                oooO0O2 = null;
                            }
                            if (z4) {
                                return 7;
                            }
                            try {
                                oooO0O6 = new OooO0O0(bArr4);
                                try {
                                    ByteOrder byteOrderOooOoO1 = OooOoO0(oooO0O6);
                                    this.f5726OooO0oO = byteOrderOooOoO1;
                                    oooO0O6.f5748OooO0o0 = byteOrderOooOoO1;
                                    if (oooO0O6.readShort() == 85) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    oooO0O6.close();
                                } catch (Exception unused3) {
                                    oooO0O5 = oooO0O6;
                                    if (oooO0O5 != null) {
                                        oooO0O5.close();
                                    }
                                    z5 = false;
                                } catch (Throwable th3) {
                                    th = th3;
                                    oooO0O4 = oooO0O6;
                                    if (oooO0O4 != null) {
                                        oooO0O4.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused4) {
                                oooO0O5 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                oooO0O4 = null;
                            }
                            if (z5) {
                                return 10;
                            }
                            i = 0;
                            while (true) {
                                bArr = f5690OooOooo;
                                if (i >= bArr.length) {
                                    z6 = true;
                                    break;
                                }
                                if (bArr4[i] != bArr[i]) {
                                    z6 = false;
                                    break;
                                }
                                i++;
                            }
                            if (z6) {
                                return 13;
                            }
                            i2 = 0;
                            while (true) {
                                bArr2 = f5692Oooo0;
                                if (i2 >= bArr2.length) {
                                    i3 = 0;
                                    while (true) {
                                        bArr3 = f5696Oooo0O0;
                                        if (i3 >= bArr3.length) {
                                            z7 = true;
                                        } else {
                                            if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (z7) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                }
                                if (bArr4[i2] != bArr2[i2]) {
                                    break;
                                }
                                i2++;
                            }
                            z7 = false;
                            if (z7) {
                                return 14;
                            }
                            return 0;
                        }
                    }
                }
            } catch (Exception e) {
                e = e;
                try {
                    if (f5681OooOo00) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (oooO0O1 != null) {
                    }
                    z3 = false;
                    if (z3) {
                        return 12;
                    }
                    oooO0O3 = new OooO0O0(bArr4);
                    ByteOrder byteOrderOooOoO2 = OooOoO0(oooO0O3);
                    this.f5726OooO0oO = byteOrderOooOoO2;
                    oooO0O3.f5748OooO0o0 = byteOrderOooOoO2;
                    s = oooO0O3.readShort();
                    if (s != 20306) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    oooO0O3.close();
                    if (z4) {
                        return 7;
                    }
                    oooO0O6 = new OooO0O0(bArr4);
                    ByteOrder byteOrderOooOoO3 = OooOoO0(oooO0O6);
                    this.f5726OooO0oO = byteOrderOooOoO3;
                    oooO0O6.f5748OooO0o0 = byteOrderOooOoO3;
                    if (oooO0O6.readShort() == 85) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    oooO0O6.close();
                    if (z5) {
                        return 10;
                    }
                    i = 0;
                    while (true) {
                        bArr = f5690OooOooo;
                        if (i >= bArr.length) {
                            z6 = true;
                            break;
                        }
                        if (bArr4[i] != bArr[i]) {
                            z6 = false;
                            break;
                        }
                        i++;
                    }
                    if (z6) {
                        return 13;
                    }
                    i2 = 0;
                    while (true) {
                        bArr2 = f5692Oooo0;
                        if (i2 >= bArr2.length) {
                            i3 = 0;
                            while (true) {
                                bArr3 = f5696Oooo0O0;
                                if (i3 >= bArr3.length) {
                                    z7 = true;
                                } else {
                                    if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                        break;
                                        break;
                                    }
                                    i3++;
                                }
                                if (z7) {
                                    return 14;
                                }
                                return 0;
                            }
                        }
                        if (bArr4[i2] != bArr2[i2]) {
                            break;
                            break;
                        }
                        i2++;
                    }
                    z7 = false;
                    if (z7) {
                        return 14;
                    }
                    return 0;
                } catch (Throwable th5) {
                    th = th5;
                    oooO0O0 = oooO0O1;
                    oooO0O1 = oooO0O0;
                    if (oooO0O1 != null) {
                        oooO0O1.close();
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (oooO0O1 != null) {
                    oooO0O1.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            oooO0O1 = null;
        } catch (Throwable th7) {
            th = th7;
            oooO0O0 = null;
            oooO0O1 = oooO0O0;
            if (oooO0O1 != null) {
                oooO0O1.close();
            }
            throw th;
        }
        oooO0O1.close();
        z3 = false;
        if (z3) {
            return 12;
        }
        oooO0O3 = new OooO0O0(bArr4);
        ByteOrder byteOrderOooOoO4 = OooOoO0(oooO0O3);
        this.f5726OooO0oO = byteOrderOooOoO4;
        oooO0O3.f5748OooO0o0 = byteOrderOooOoO4;
        s = oooO0O3.readShort();
        if (s != 20306) {
            z4 = true;
        } else {
            z4 = true;
        }
        oooO0O3.close();
        if (z4) {
            return 7;
        }
        oooO0O6 = new OooO0O0(bArr4);
        ByteOrder byteOrderOooOoO5 = OooOoO0(oooO0O6);
        this.f5726OooO0oO = byteOrderOooOoO5;
        oooO0O6.f5748OooO0o0 = byteOrderOooOoO5;
        if (oooO0O6.readShort() == 85) {
            z5 = true;
        } else {
            z5 = false;
        }
        oooO0O6.close();
        if (z5) {
            return 10;
        }
        i = 0;
        while (true) {
            bArr = f5690OooOooo;
            if (i >= bArr.length) {
                z6 = true;
                break;
            }
            if (bArr4[i] != bArr[i]) {
                z6 = false;
                break;
            }
            i++;
        }
        if (z6) {
            return 13;
        }
        i2 = 0;
        while (true) {
            bArr2 = f5692Oooo0;
            if (i2 >= bArr2.length) {
                i3 = 0;
                while (true) {
                    bArr3 = f5696Oooo0O0;
                    if (i3 >= bArr3.length) {
                        z7 = true;
                    } else {
                        if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                            break;
                            break;
                        }
                        i3++;
                    }
                    if (z7) {
                        return 14;
                    }
                    return 0;
                }
            }
            if (bArr4[i2] != bArr2[i2]) {
                break;
                break;
            }
            i2++;
        }
        z7 = false;
        if (z7) {
            return 14;
        }
        return 0;
    }

    public final void OooO00o() {
        String strOooO0Oo = OooO0Oo("DateTimeOriginal");
        HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
        if (strOooO0Oo != null && OooO0Oo("DateTime") == null) {
            mapArr[0].put("DateTime", OooO0o.OooO00o(strOooO0Oo));
        }
        if (OooO0Oo("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", OooO0o.OooO0O0(0L, this.f5726OooO0oO));
        }
        if (OooO0Oo("ImageLength") == null) {
            mapArr[0].put("ImageLength", OooO0o.OooO0O0(0L, this.f5726OooO0oO));
        }
        if (OooO0Oo("Orientation") == null) {
            mapArr[0].put("Orientation", OooO0o.OooO0O0(0L, this.f5726OooO0oO));
        }
        if (OooO0Oo("LightSource") == null) {
            mapArr[1].put("LightSource", OooO0o.OooO0O0(0L, this.f5726OooO0oO));
        }
    }

    @Nullable
    public final String OooO0Oo(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        OooO0o OooO0o2 = OooO0o(str);
        if (OooO0o2 != null) {
            if (!f5710OoooOoO.contains(str)) {
                return OooO0o2.OooO(this.f5726OooO0oO);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = OooO0o2.f5752OooO00o;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                OooOO0[] oooOO0Arr = (OooOO0[]) OooO0o2.OooOO0(this.f5726OooO0oO);
                if (oooOO0Arr == null || oooOO0Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(oooOO0Arr));
                    return null;
                }
                OooOO0 oooOO1 = oooOO0Arr[0];
                OooOO0 oooOO2 = oooOO0Arr[1];
                OooOO0 oooOO3 = oooOO0Arr[2];
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (oooOO1.f5756OooO00o / oooOO1.f5757OooO0O0)), Integer.valueOf((int) (oooOO2.f5756OooO00o / oooOO2.f5757OooO0O0)), Integer.valueOf((int) (oooOO3.f5756OooO00o / oooOO3.f5757OooO0O0)));
            }
            try {
                return Double.toString(OooO0o2.OooO0oO(this.f5726OooO0oO));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    public final OooO0o OooO0o(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f5681OooOo00) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f5718o000oOoO.length; i++) {
            OooO0o oooO0o = this.f5725OooO0o0[i].get(str);
            if (oooO0o != null) {
                return oooO0o;
            }
        }
        return null;
    }

    public final int OooO0o0(int i, @NonNull String str) {
        OooO0o OooO0o2 = OooO0o(str);
        if (OooO0o2 == null) {
            return i;
        }
        try {
            return OooO0o2.OooO0oo(this.f5726OooO0oO);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final void OooO0oO(OooOO0O oooOO0O) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                androidx.exifinterface.media.OooO00o.OooO0O0.OooO00o(mediaMetadataRetriever, new OooO00o(oooOO0O));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", OooO0o.OooO0o0(Integer.parseInt(strExtractMetadata), this.f5726OooO0oO));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", OooO0o.OooO0o0(Integer.parseInt(strExtractMetadata2), this.f5726OooO0oO));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", OooO0o.OooO0o0(i, this.f5726OooO0oO));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    oooOO0O.OooO0OO(i3);
                    byte[] bArr = new byte[6];
                    if (oooOO0O.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f5713Ooooo0o)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (oooOO0O.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f5733OooOOOO = i5;
                    OooOoO(0, bArr2);
                }
                if (f5681OooOo00) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:87:0x018f A[LOOP:0: B:10:0x0034->B:87:0x018f, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void OooO0oo(androidx.exifinterface.media.ExifInterface.OooO0O0 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.OooO0oo(androidx.exifinterface.media.ExifInterface$OooO0O0, int, int):void");
    }

    public final void OooOO0(OooOO0O oooOO0O) throws Throwable {
        int i;
        int i2;
        OooOOO0(oooOO0O);
        HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
        OooO0o oooO0o = mapArr[1].get("MakerNote");
        if (oooO0o != null) {
            OooOO0O oooOO0O2 = new OooOO0O(oooO0o.f5755OooO0Oo);
            oooOO0O2.f5748OooO0o0 = this.f5726OooO0oO;
            byte[] bArr = f5687OooOoo;
            byte[] bArr2 = new byte[bArr.length];
            oooOO0O2.readFully(bArr2);
            oooOO0O2.OooO0OO(0L);
            byte[] bArr3 = f5689OooOooO;
            byte[] bArr4 = new byte[bArr3.length];
            oooOO0O2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                oooOO0O2.OooO0OO(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                oooOO0O2.OooO0OO(12L);
            }
            OooOoOO(oooOO0O2, 6);
            OooO0o oooO0o2 = mapArr[7].get("PreviewImageStart");
            OooO0o oooO0o3 = mapArr[7].get("PreviewImageLength");
            if (oooO0o2 != null && oooO0o3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", oooO0o2);
                mapArr[5].put("JPEGInterchangeFormatLength", oooO0o3);
            }
            OooO0o oooO0o4 = mapArr[8].get("AspectFrame");
            if (oooO0o4 != null) {
                int[] iArr = (int[]) oooO0o4.OooOO0(this.f5726OooO0oO);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                OooO0o oooO0oOooO0o0 = OooO0o.OooO0o0(i5, this.f5726OooO0oO);
                OooO0o oooO0oOooO0o1 = OooO0o.OooO0o0(i6, this.f5726OooO0oO);
                mapArr[0].put("ImageWidth", oooO0oOooO0o0);
                mapArr[0].put("ImageLength", oooO0oOooO0o1);
            }
        }
    }

    public final void OooOO0O(OooO0O0 oooO0O0) throws Throwable {
        if (f5681OooOo00) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + oooO0O0);
        }
        oooO0O0.f5748OooO0o0 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f5690OooOooo;
        oooO0O0.OooO00o(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i = oooO0O0.readInt();
                int i2 = length + 4;
                byte[] bArr2 = new byte[4];
                if (oooO0O0.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i3 = i2 + 4;
                if (i3 == 16 && !Arrays.equals(bArr2, f5694Oooo00O)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f5695Oooo00o)) {
                    return;
                }
                if (Arrays.equals(bArr2, f5693Oooo000)) {
                    byte[] bArr3 = new byte[i];
                    if (oooO0O0.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.OooO00o.OooO00o(bArr2));
                    }
                    int i4 = oooO0O0.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i4) {
                        this.f5733OooOOOO = i3;
                        OooOoO(0, bArr3);
                        Oooo0OO();
                        Oooo00o(new OooO0O0(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i4 + ", calculated CRC value: " + crc32.getValue());
                }
                int i5 = i + 4;
                oooO0O0.OooO00o(i5);
                length = i3 + i5;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void OooOO0o(OooO0O0 oooO0O0) throws Throwable {
        boolean z = f5681OooOo00;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + oooO0O0);
        }
        oooO0O0.OooO00o(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        oooO0O0.read(bArr);
        oooO0O0.read(bArr2);
        oooO0O0.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        oooO0O0.OooO00o(i - oooO0O0.f5747OooO0o);
        oooO0O0.read(bArr4);
        OooO0oo(new OooO0O0(bArr4), i, 5);
        oooO0O0.OooO00o(i3 - oooO0O0.f5747OooO0o);
        oooO0O0.f5748OooO0o0 = ByteOrder.BIG_ENDIAN;
        int i4 = oooO0O0.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = oooO0O0.readUnsignedShort();
            int unsignedShort2 = oooO0O0.readUnsignedShort();
            if (unsignedShort == f5706OoooOO0.f5738OooO00o) {
                short s = oooO0O0.readShort();
                short s2 = oooO0O0.readShort();
                OooO0o oooO0oOooO0o0 = OooO0o.OooO0o0(s, this.f5726OooO0oO);
                OooO0o oooO0oOooO0o1 = OooO0o.OooO0o0(s2, this.f5726OooO0oO);
                HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
                mapArr[0].put("ImageLength", oooO0oOooO0o0);
                mapArr[0].put("ImageWidth", oooO0oOooO0o1);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            oooO0O0.OooO00o(unsignedShort2);
        }
    }

    public final int OooOOO() {
        switch (OooO0o0(1, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void OooOOO0(OooOO0O oooOO0O) throws Throwable {
        OooOo0o(oooOO0O);
        OooOoOO(oooOO0O, 0);
        Oooo0O0(oooOO0O, 0);
        Oooo0O0(oooOO0O, 5);
        Oooo0O0(oooOO0O, 4);
        Oooo0OO();
        if (this.f5723OooO0Oo == 8) {
            HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
            OooO0o oooO0o = mapArr[1].get("MakerNote");
            if (oooO0o != null) {
                OooOO0O oooOO0O2 = new OooOO0O(oooO0o.f5755OooO0Oo);
                oooOO0O2.f5748OooO0o0 = this.f5726OooO0oO;
                oooOO0O2.OooO00o(6);
                OooOoOO(oooOO0O2, 9);
                OooO0o oooO0o2 = mapArr[9].get("ColorSpace");
                if (oooO0o2 != null) {
                    mapArr[1].put("ColorSpace", oooO0o2);
                }
            }
        }
    }

    public final void OooOOOO(OooOO0O oooOO0O) throws Throwable {
        if (f5681OooOo00) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + oooOO0O);
        }
        OooOOO0(oooOO0O);
        HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
        OooO0o oooO0o = mapArr[0].get("JpgFromRaw");
        if (oooO0o != null) {
            OooO0oo(new OooO0O0(oooO0o.f5755OooO0Oo), (int) oooO0o.f5754OooO0OO, 5);
        }
        OooO0o oooO0o2 = mapArr[0].get("ISO");
        OooO0o oooO0o3 = mapArr[1].get("PhotographicSensitivity");
        if (oooO0o2 == null || oooO0o3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", oooO0o2);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b6: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:183), block:B:61:0x00b6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Nullable
    public final byte[] OooOOOo() throws Throwable {
        FileDescriptor fileDescriptor;
        FileDescriptor fileDescriptorOooO0O0;
        Exception e;
        FileDescriptor fileDescriptor2;
        ?? fileInputStream;
        ?? r4 = 0;
        r4 = 0;
        FileDescriptor fileDescriptor3 = null;
        if (!this.f5727OooO0oo) {
            return null;
        }
        ?? fileInputStream2 = this.f5732OooOOO0;
        try {
            if (fileInputStream2 != 0) {
                return fileInputStream2;
            }
            try {
                fileInputStream2 = this.f5722OooO0OO;
                if (fileInputStream2 != 0) {
                    try {
                        if (!fileInputStream2.markSupported()) {
                            Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                            androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
                            return null;
                        }
                        fileInputStream2.reset();
                        fileInputStream = fileInputStream2;
                        fileDescriptor2 = null;
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        fileDescriptor2 = null;
                        Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
                        if (fileDescriptor2 != null) {
                            try {
                                androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO00o(fileDescriptor2);
                            } catch (Exception unused) {
                                Log.e("ExifInterfaceUtils", "Error closing fd.");
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        FileDescriptor fileDescriptor4 = fileDescriptor3;
                        r4 = fileInputStream2;
                        fileDescriptorOooO0O0 = fileDescriptor4;
                        androidx.exifinterface.media.OooO00o.OooO0O0(r4);
                        if (fileDescriptorOooO0O0 != null) {
                            try {
                                androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO00o(fileDescriptorOooO0O0);
                            } catch (Exception unused2) {
                                Log.e("ExifInterfaceUtils", "Error closing fd.");
                            }
                        }
                        throw th;
                    }
                } else if (this.f5720OooO00o != null) {
                    fileInputStream = new FileInputStream(this.f5720OooO00o);
                    fileDescriptor2 = null;
                    fileInputStream2 = fileInputStream;
                } else {
                    fileDescriptorOooO0O0 = androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO0O0(this.f5721OooO0O0);
                    try {
                        androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO0OO(fileDescriptorOooO0O0, 0L, OsConstants.SEEK_SET);
                        fileDescriptor2 = fileDescriptorOooO0O0;
                        fileInputStream2 = new FileInputStream(fileDescriptorOooO0O0);
                    } catch (Exception e3) {
                        e = e3;
                        fileDescriptor2 = fileDescriptorOooO0O0;
                        fileInputStream2 = 0;
                        Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
                        if (fileDescriptor2 != null) {
                            androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO00o(fileDescriptor2);
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        androidx.exifinterface.media.OooO00o.OooO0O0(r4);
                        if (fileDescriptorOooO0O0 != null) {
                            androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO00o(fileDescriptorOooO0O0);
                        }
                        throw th;
                    }
                }
                try {
                    if (fileInputStream2.skip(this.f5729OooOO0O + this.f5733OooOOOO) != this.f5729OooOO0O + this.f5733OooOOOO) {
                        throw new IOException("Corrupted image");
                    }
                    byte[] bArr = new byte[this.f5730OooOO0o];
                    if (fileInputStream2.read(bArr) != this.f5730OooOO0o) {
                        throw new IOException("Corrupted image");
                    }
                    this.f5732OooOOO0 = bArr;
                    androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        try {
                            androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO00o(fileDescriptor2);
                        } catch (Exception unused3) {
                            Log.e("ExifInterfaceUtils", "Error closing fd.");
                        }
                    }
                    return bArr;
                } catch (Exception e4) {
                    e = e4;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                    androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO00o(fileDescriptor2);
                    }
                    return null;
                }
            } catch (Exception e5) {
                fileInputStream2 = 0;
                e = e5;
                fileDescriptor2 = null;
            } catch (Throwable th3) {
                th = th3;
                fileDescriptorOooO0O0 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileDescriptor3 = fileDescriptor;
        }
    }

    public final void OooOOo0(OooO0O0 oooO0O0) throws Throwable {
        if (f5681OooOo00) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + oooO0O0);
        }
        oooO0O0.f5748OooO0o0 = ByteOrder.LITTLE_ENDIAN;
        oooO0O0.OooO00o(f5692Oooo0.length);
        int i = oooO0O0.readInt() + 8;
        byte[] bArr = f5696Oooo0O0;
        oooO0O0.OooO00o(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (oooO0O0.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = oooO0O0.readInt();
                int i3 = length + 4 + 4;
                if (Arrays.equals(f5697Oooo0OO, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (oooO0O0.read(bArr3) == i2) {
                        this.f5733OooOOOO = i3;
                        OooOoO(0, bArr3);
                        Oooo00o(new OooO0O0(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.OooO00o.OooO00o(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                oooO0O0.OooO00o(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void OooOOoo(OooO0O0 oooO0O0, HashMap map) throws Throwable {
        OooO0o oooO0o = (OooO0o) map.get("JPEGInterchangeFormat");
        OooO0o oooO0o2 = (OooO0o) map.get("JPEGInterchangeFormatLength");
        if (oooO0o == null || oooO0o2 == null) {
            return;
        }
        int iOooO0oo = oooO0o.OooO0oo(this.f5726OooO0oO);
        int iOooO0oo2 = oooO0o2.OooO0oo(this.f5726OooO0oO);
        if (this.f5723OooO0Oo == 7) {
            iOooO0oo += this.f5734OooOOOo;
        }
        if (iOooO0oo > 0 && iOooO0oo2 > 0) {
            this.f5727OooO0oo = true;
            if (this.f5720OooO00o == null && this.f5722OooO0OO == null && this.f5721OooO0O0 == null) {
                byte[] bArr = new byte[iOooO0oo2];
                oooO0O0.skip(iOooO0oo);
                oooO0O0.read(bArr);
                this.f5732OooOOO0 = bArr;
            }
            this.f5729OooOO0O = iOooO0oo;
            this.f5730OooOO0o = iOooO0oo2;
        }
        if (f5681OooOo00) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iOooO0oo + ", length: " + iOooO0oo2);
        }
    }

    public final void OooOo() {
        int i = 0;
        while (true) {
            HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbOooO0O0 = o0000O0.OooO0O0("The size of tag group[", i, "]: ");
            sbOooO0O0.append(mapArr[i].size());
            Log.d("ExifInterface", sbOooO0O0.toString());
            for (Map.Entry<String, OooO0o> entry : mapArr[i].entrySet()) {
                OooO0o value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.OooO(this.f5726OooO0oO) + "'");
            }
            i++;
        }
    }

    public final boolean OooOo0(HashMap map) throws IOException {
        OooO0o oooO0o = (OooO0o) map.get("ImageLength");
        OooO0o oooO0o2 = (OooO0o) map.get("ImageWidth");
        if (oooO0o == null || oooO0o2 == null) {
            return false;
        }
        return oooO0o.OooO0oo(this.f5726OooO0oO) <= 512 && oooO0o2.OooO0oo(this.f5726OooO0oO) <= 512;
    }

    public final void OooOo00(String str) throws Throwable {
        boolean z;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f5722OooO0OO = null;
        this.f5720OooO00o = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO0OO(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z = true;
                } catch (Exception unused) {
                    if (f5681OooOo00) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z = false;
                }
                if (z) {
                    this.f5721OooO0O0 = fileInputStream2.getFD();
                } else {
                    this.f5721OooO0O0 = null;
                }
                OooOo0O(fileInputStream2);
                androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.OooO00o.OooO0O0(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void OooOo0O(@NonNull InputStream inputStream) {
        boolean z = f5681OooOo00;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < f5718o000oOoO.length; i++) {
            try {
                try {
                    this.f5725OooO0o0[i] = new HashMap<>();
                } catch (Throwable th) {
                    OooO00o();
                    if (z) {
                        OooOo();
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException e) {
                if (z) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                OooO00o();
                if (!z) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iOooO = OooO(bufferedInputStream);
        this.f5723OooO0Oo = iOooO;
        if ((iOooO == 4 || iOooO == 9 || iOooO == 13 || iOooO == 14) ? false : true) {
            OooOO0O oooOO0O = new OooOO0O(bufferedInputStream);
            int i2 = this.f5723OooO0Oo;
            if (i2 == 12) {
                OooO0oO(oooOO0O);
            } else if (i2 == 7) {
                OooOO0(oooOO0O);
            } else if (i2 == 10) {
                OooOOOO(oooOO0O);
            } else {
                OooOOO0(oooOO0O);
            }
            oooOO0O.OooO0OO(this.f5733OooOOOO);
            Oooo00o(oooOO0O);
        } else {
            OooO0O0 oooO0O0 = new OooO0O0(bufferedInputStream);
            int i3 = this.f5723OooO0Oo;
            if (i3 == 4) {
                OooO0oo(oooO0O0, 0, 0);
            } else if (i3 == 13) {
                OooOO0O(oooO0O0);
            } else if (i3 == 9) {
                OooOO0o(oooO0O0);
            } else if (i3 == 14) {
                OooOOo0(oooO0O0);
            }
        }
        OooO00o();
        if (!z) {
            return;
        }
        OooOo();
    }

    public final void OooOo0o(OooO0O0 oooO0O0) throws IOException {
        ByteOrder byteOrderOooOoO0 = OooOoO0(oooO0O0);
        this.f5726OooO0oO = byteOrderOooOoO0;
        oooO0O0.f5748OooO0o0 = byteOrderOooOoO0;
        int unsignedShort = oooO0O0.readUnsignedShort();
        int i = this.f5723OooO0Oo;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = oooO0O0.readInt();
        if (i2 < 8) {
            throw new IOException(android.support.v4.media.OooO00o.OooO00o("Invalid first Ifd offset: ", i2));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            oooO0O0.OooO00o(i3);
        }
    }

    public final void OooOoO(int i, byte[] bArr) throws IOException {
        OooOO0O oooOO0O = new OooOO0O(bArr);
        OooOo0o(oooOO0O);
        OooOoOO(oooOO0O, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:105:0x0227  */
    /* JADX WARN: Code duplicated, block: B:107:0x022b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0237  */
    /* JADX WARN: Code duplicated, block: B:112:0x023c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0248  */
    /* JADX WARN: Code duplicated, block: B:116:0x024f  */
    /* JADX WARN: Code duplicated, block: B:119:0x026f  */
    /* JADX WARN: Code duplicated, block: B:121:0x027c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0309  */
    /* JADX WARN: Code duplicated, block: B:135:0x0311  */
    /* JADX WARN: Code duplicated, block: B:144:0x033b  */
    /* JADX WARN: Code duplicated, block: B:169:0x033e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x012d  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0166  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:87:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    /* JADX WARN: Code duplicated, block: B:99:0x021b  */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0289, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x02ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00ef, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x012d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0174, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x0200, please report this as an issue */
    public final void OooOoOO(OooOO0O oooOO0O, int i) throws IOException {
        HashMap<String, OooO0o>[] mapArr;
        String str;
        short s;
        short s2;
        HashSet hashSet;
        boolean z;
        int i2;
        long j;
        boolean z2;
        int i3;
        Integer num;
        HashSet hashSet2;
        String str2;
        boolean z3;
        String str3;
        int i4;
        int unsignedShort;
        long j2;
        int i5;
        Integer numValueOf = Integer.valueOf(oooOO0O.f5747OooO0o);
        HashSet hashSet3 = this.f5724OooO0o;
        hashSet3.add(numValueOf);
        short s3 = oooOO0O.readShort();
        String str4 = "ExifInterface";
        boolean z4 = f5681OooOo00;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s3));
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            mapArr = this.f5725OooO0o0;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = oooOO0O.readUnsignedShort();
            int unsignedShort3 = oooOO0O.readUnsignedShort();
            int i6 = oooOO0O.readInt();
            long j3 = ((long) oooOO0O.f5747OooO0o) + 4;
            OooO oooO = f5708OoooOOo[i].get(Integer.valueOf(unsignedShort2));
            if (z4) {
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = oooO != null ? oooO.f5739OooO0O0 : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i6);
                Log.d(str4, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (oooO == null) {
                if (z4) {
                    Log.d(str4, "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                }
                s = s3;
                s2 = s4;
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = f5705OoooO0O;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = oooO.f5740OooO0OO;
                        s = s3;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i3 = oooO.f5741OooO0Oo) == unsignedShort3) {
                            s2 = s4;
                        } else {
                            s2 = s4;
                            if (((i7 != 4 && i3 != 4) || unsignedShort3 != 3) && (((i7 != 9 && i3 != 9) || unsignedShort3 != 8) && ((i7 != 12 && i3 != 12) || unsignedShort3 != 11))) {
                                z = false;
                            }
                            if (!z) {
                                hashSet = hashSet3;
                                if (unsignedShort3 == 7) {
                                    unsignedShort3 = i7;
                                }
                                i2 = unsignedShort3;
                                j = ((long) i6) * ((long) iArr[unsignedShort3]);
                                if (j >= 0 || j > 2147483647L) {
                                    if (z4) {
                                        Log.d(str4, "Skip the tag entry since the number of components is invalid: " + i6);
                                    }
                                    unsignedShort3 = i2;
                                    z2 = false;
                                } else {
                                    unsignedShort3 = i2;
                                    z2 = true;
                                }
                            } else if (z4) {
                                Log.d(str4, "Skip the tag entry since data format (" + f5703OoooO0[unsignedShort3] + ") is unexpected for tag: " + oooO.f5739OooO0O0);
                            }
                        }
                        z = true;
                        if (!z) {
                            hashSet = hashSet3;
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            i2 = unsignedShort3;
                            j = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j >= 0) {
                            }
                            if (z4) {
                                Log.d(str4, "Skip the tag entry since the number of components is invalid: " + i6);
                            }
                            unsignedShort3 = i2;
                            z2 = false;
                        } else if (z4) {
                            Log.d(str4, "Skip the tag entry since data format (" + f5703OoooO0[unsignedShort3] + ") is unexpected for tag: " + oooO.f5739OooO0O0);
                        }
                    }
                    if (z2) {
                        if (j > 4) {
                            i5 = oooOO0O.readInt();
                            if (z4) {
                                Log.d(str4, "seek to data offset: " + i5);
                            }
                            if (this.f5723OooO0Oo == 7) {
                                if ("MakerNote".equals(oooO.f5739OooO0O0)) {
                                    this.f5734OooOOOo = i5;
                                } else if (i != 6 && "ThumbnailImage".equals(oooO.f5739OooO0O0)) {
                                    this.f5736OooOOo0 = i5;
                                    this.f5735OooOOo = i6;
                                    OooO0o oooO0oOooO0o0 = OooO0o.OooO0o0(6, this.f5726OooO0oO);
                                    OooO0o oooO0oOooO0O0 = OooO0o.OooO0O0(this.f5736OooOOo0, this.f5726OooO0oO);
                                    OooO0o oooO0oOooO0O1 = OooO0o.OooO0O0(this.f5735OooOOo, this.f5726OooO0oO);
                                    mapArr[4].put("Compression", oooO0oOooO0o0);
                                    mapArr[4].put("JPEGInterchangeFormat", oooO0oOooO0O0);
                                    mapArr[4].put("JPEGInterchangeFormatLength", oooO0oOooO0O1);
                                }
                            }
                            oooOO0O.OooO0OO(i5);
                        } else {
                            oooO = oooO;
                            hashSet = hashSet;
                            unsignedShort3 = unsignedShort3;
                            i6 = i6;
                        }
                        num = f5711OoooOoo.get(Integer.valueOf(unsignedShort2));
                        if (z4) {
                            Log.d(str4, "nextIfdType: " + num + " byteCount: " + j);
                        }
                        if (num != null) {
                            i4 = unsignedShort3;
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    j2 = ((long) oooOO0O.readInt()) & 4294967295L;
                                } else if (i4 == 8) {
                                    unsignedShort = oooOO0O.readShort();
                                } else if (i4 != 9 || i4 == 13) {
                                    unsignedShort = oooOO0O.readInt();
                                } else {
                                    j2 = -1;
                                }
                                if (z4) {
                                    Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j2), oooO.f5739OooO0O0));
                                }
                                if (j2 > 0) {
                                    hashSet2 = hashSet;
                                    if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                                        oooOO0O.OooO0OO(j2);
                                        OooOoOO(oooOO0O, num.intValue());
                                    } else if (z4) {
                                        Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                                    }
                                } else {
                                    hashSet2 = hashSet;
                                    if (z4) {
                                        Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j2);
                                    }
                                }
                                oooOO0O.OooO0OO(j3);
                                str2 = str4;
                                z3 = z4;
                            } else {
                                unsignedShort = oooOO0O.readUnsignedShort();
                            }
                            j2 = unsignedShort;
                            if (z4) {
                                Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j2), oooO.f5739OooO0O0));
                            }
                            if (j2 > 0) {
                                hashSet2 = hashSet;
                                if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                                    oooOO0O.OooO0OO(j2);
                                    OooOoOO(oooOO0O, num.intValue());
                                } else if (z4) {
                                    Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                                }
                            } else {
                                hashSet2 = hashSet;
                                if (z4) {
                                    Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j2);
                                }
                            }
                            oooOO0O.OooO0OO(j3);
                            str2 = str4;
                            z3 = z4;
                        } else {
                            OooO oooO2 = oooO;
                            hashSet2 = hashSet;
                            int i8 = oooOO0O.f5747OooO0o + this.f5733OooOOOO;
                            byte[] bArr = new byte[(int) j];
                            oooOO0O.readFully(bArr);
                            str2 = str4;
                            z3 = z4;
                            OooO0o oooO0o = new OooO0o(i8, bArr, unsignedShort3, i6);
                            mapArr[i].put(oooO2.f5739OooO0O0, oooO0o);
                            str3 = oooO2.f5739OooO0O0;
                            if ("DNGVersion".equals(str3)) {
                                this.f5723OooO0Oo = 3;
                            }
                            if (((!"Make".equals(str3) || "Model".equals(str3)) && oooO0o.OooO(this.f5726OooO0oO).contains("PENTAX")) || ("Compression".equals(str3) && oooO0o.OooO0oo(this.f5726OooO0oO) == 65535)) {
                                this.f5723OooO0Oo = 8;
                            }
                            if (oooOO0O.f5747OooO0o != j3) {
                                oooOO0O.OooO0OO(j3);
                            }
                        }
                    } else {
                        oooOO0O.OooO0OO(j3);
                        str2 = str4;
                        z3 = z4;
                        hashSet2 = hashSet;
                    }
                    s4 = (short) (s2 + 1);
                    hashSet3 = hashSet2;
                    str4 = str2;
                    z4 = z3;
                    s3 = s;
                }
                s = s3;
                s2 = s4;
                hashSet = hashSet3;
                if (z4) {
                    Log.d(str4, "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j = 0;
                z2 = false;
                if (z2) {
                    oooOO0O.OooO0OO(j3);
                    str2 = str4;
                    z3 = z4;
                    hashSet2 = hashSet;
                } else {
                    if (j > 4) {
                        i5 = oooOO0O.readInt();
                        if (z4) {
                            Log.d(str4, "seek to data offset: " + i5);
                        }
                        if (this.f5723OooO0Oo == 7) {
                            if ("MakerNote".equals(oooO.f5739OooO0O0)) {
                                this.f5734OooOOOo = i5;
                            } else if (i != 6) {
                            }
                        }
                        oooOO0O.OooO0OO(i5);
                    } else {
                        oooO = oooO;
                        hashSet = hashSet;
                        unsignedShort3 = unsignedShort3;
                        i6 = i6;
                    }
                    num = f5711OoooOoo.get(Integer.valueOf(unsignedShort2));
                    if (z4) {
                        Log.d(str4, "nextIfdType: " + num + " byteCount: " + j);
                    }
                    if (num != null) {
                        i4 = unsignedShort3;
                        if (i4 != 3) {
                            if (i4 == 4) {
                                j2 = ((long) oooOO0O.readInt()) & 4294967295L;
                            } else if (i4 == 8) {
                                if (i4 != 9) {
                                }
                                unsignedShort = oooOO0O.readInt();
                            } else {
                                unsignedShort = oooOO0O.readShort();
                            }
                            if (z4) {
                                Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j2), oooO.f5739OooO0O0));
                            }
                            if (j2 > 0) {
                                hashSet2 = hashSet;
                                if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                                    oooOO0O.OooO0OO(j2);
                                    OooOoOO(oooOO0O, num.intValue());
                                } else if (z4) {
                                    Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                                }
                            } else {
                                hashSet2 = hashSet;
                                if (z4) {
                                    Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j2);
                                }
                            }
                            oooOO0O.OooO0OO(j3);
                            str2 = str4;
                            z3 = z4;
                        } else {
                            unsignedShort = oooOO0O.readUnsignedShort();
                        }
                        j2 = unsignedShort;
                        if (z4) {
                            Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j2), oooO.f5739OooO0O0));
                        }
                        if (j2 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                                oooOO0O.OooO0OO(j2);
                                OooOoOO(oooOO0O, num.intValue());
                            } else if (z4) {
                                Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                            }
                        } else {
                            hashSet2 = hashSet;
                            if (z4) {
                                Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j2);
                            }
                        }
                        oooOO0O.OooO0OO(j3);
                        str2 = str4;
                        z3 = z4;
                    } else {
                        OooO oooO3 = oooO;
                        hashSet2 = hashSet;
                        int i9 = oooOO0O.f5747OooO0o + this.f5733OooOOOO;
                        byte[] bArr2 = new byte[(int) j];
                        oooOO0O.readFully(bArr2);
                        str2 = str4;
                        z3 = z4;
                        OooO0o oooO0o2 = new OooO0o(i9, bArr2, unsignedShort3, i6);
                        mapArr[i].put(oooO3.f5739OooO0O0, oooO0o2);
                        str3 = oooO3.f5739OooO0O0;
                        if ("DNGVersion".equals(str3)) {
                            this.f5723OooO0Oo = 3;
                        }
                        if (!"Make".equals(str3)) {
                        }
                        this.f5723OooO0Oo = 8;
                        if (oooOO0O.f5747OooO0o != j3) {
                            oooOO0O.OooO0OO(j3);
                        }
                    }
                }
                s4 = (short) (s2 + 1);
                hashSet3 = hashSet2;
                str4 = str2;
                z4 = z3;
                s3 = s;
            }
            hashSet = hashSet3;
            j = 0;
            z2 = false;
            if (z2) {
                oooOO0O.OooO0OO(j3);
                str2 = str4;
                z3 = z4;
                hashSet2 = hashSet;
            } else {
                if (j > 4) {
                    i5 = oooOO0O.readInt();
                    if (z4) {
                        Log.d(str4, "seek to data offset: " + i5);
                    }
                    if (this.f5723OooO0Oo == 7) {
                        if ("MakerNote".equals(oooO.f5739OooO0O0)) {
                            this.f5734OooOOOo = i5;
                        } else if (i != 6) {
                        }
                    }
                    oooOO0O.OooO0OO(i5);
                } else {
                    oooO = oooO;
                    hashSet = hashSet;
                    unsignedShort3 = unsignedShort3;
                    i6 = i6;
                }
                num = f5711OoooOoo.get(Integer.valueOf(unsignedShort2));
                if (z4) {
                    Log.d(str4, "nextIfdType: " + num + " byteCount: " + j);
                }
                if (num != null) {
                    i4 = unsignedShort3;
                    if (i4 != 3) {
                        if (i4 == 4) {
                            j2 = ((long) oooOO0O.readInt()) & 4294967295L;
                        } else if (i4 == 8) {
                            if (i4 != 9) {
                            }
                            unsignedShort = oooOO0O.readInt();
                        } else {
                            unsignedShort = oooOO0O.readShort();
                        }
                        if (z4) {
                            Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j2), oooO.f5739OooO0O0));
                        }
                        if (j2 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                                oooOO0O.OooO0OO(j2);
                                OooOoOO(oooOO0O, num.intValue());
                            } else if (z4) {
                                Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                            }
                        } else {
                            hashSet2 = hashSet;
                            if (z4) {
                                Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j2);
                            }
                        }
                        oooOO0O.OooO0OO(j3);
                        str2 = str4;
                        z3 = z4;
                    } else {
                        unsignedShort = oooOO0O.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z4) {
                        Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j2), oooO.f5739OooO0O0));
                    }
                    if (j2 > 0) {
                        hashSet2 = hashSet;
                        if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                            oooOO0O.OooO0OO(j2);
                            OooOoOO(oooOO0O, num.intValue());
                        } else if (z4) {
                            Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                        }
                    } else {
                        hashSet2 = hashSet;
                        if (z4) {
                            Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j2);
                        }
                    }
                    oooOO0O.OooO0OO(j3);
                    str2 = str4;
                    z3 = z4;
                } else {
                    OooO oooO4 = oooO;
                    hashSet2 = hashSet;
                    int i10 = oooOO0O.f5747OooO0o + this.f5733OooOOOO;
                    byte[] bArr3 = new byte[(int) j];
                    oooOO0O.readFully(bArr3);
                    str2 = str4;
                    z3 = z4;
                    OooO0o oooO0o3 = new OooO0o(i10, bArr3, unsignedShort3, i6);
                    mapArr[i].put(oooO4.f5739OooO0O0, oooO0o3);
                    str3 = oooO4.f5739OooO0O0;
                    if ("DNGVersion".equals(str3)) {
                        this.f5723OooO0Oo = 3;
                    }
                    if (!"Make".equals(str3)) {
                    }
                    this.f5723OooO0Oo = 8;
                    if (oooOO0O.f5747OooO0o != j3) {
                        oooOO0O.OooO0OO(j3);
                    }
                }
            }
            s4 = (short) (s2 + 1);
            hashSet3 = hashSet2;
            str4 = str2;
            z4 = z3;
            s3 = s;
        }
        HashSet hashSet4 = hashSet3;
        String str5 = str4;
        boolean z5 = z4;
        int i11 = oooOO0O.readInt();
        if (z5) {
            str = str5;
            Log.d(str, String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        } else {
            str = str5;
        }
        long j4 = i11;
        if (j4 <= 0) {
            if (z5) {
                Log.d(str, "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(i11))) {
            if (z5) {
                Log.d(str, "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        oooOO0O.OooO0OO(j4);
        if (mapArr[4].isEmpty()) {
            OooOoOO(oooOO0O, 4);
        } else if (mapArr[5].isEmpty()) {
            OooOoOO(oooOO0O, 5);
        }
    }

    public final void OooOoo(int i, String str, String str2) {
        HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap<String, OooO0o> map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void OooOoo0(String str) {
        for (int i = 0; i < f5718o000oOoO.length; i++) {
            this.f5725OooO0o0[i].remove(str);
        }
    }

    public final void OooOooO(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f5681OooOo00) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        OooO0O0 oooO0O0 = new OooO0O0(bufferedInputStream);
        OooO0OO oooO0OO = new OooO0OO(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (oooO0O0.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        oooO0OO.OooO00o(-1);
        if (oooO0O0.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        oooO0OO.OooO00o(-40);
        String strOooO0Oo = OooO0Oo("Xmp");
        HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
        OooO0o oooO0oRemove = (strOooO0Oo == null || !this.f5737OooOOoo) ? null : mapArr[0].remove("Xmp");
        oooO0OO.OooO00o(-1);
        oooO0OO.OooO00o(-31);
        Oooo0o0(oooO0OO);
        if (oooO0oRemove != null) {
            mapArr[0].put("Xmp", oooO0oRemove);
        }
        byte[] bArr = new byte[4096];
        while (oooO0O0.readByte() == -1) {
            byte b = oooO0O0.readByte();
            if (b == -39 || b == -38) {
                oooO0OO.OooO00o(-1);
                oooO0OO.OooO00o(b);
                androidx.exifinterface.media.OooO00o.OooO0o0(oooO0O0, oooO0OO);
                return;
            }
            if (b != -31) {
                oooO0OO.OooO00o(-1);
                oooO0OO.OooO00o(b);
                int unsignedShort = oooO0O0.readUnsignedShort();
                oooO0OO.OooO0oO((short) unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = oooO0O0.read(bArr, 0, Math.min(i, 4096));
                    if (i2 < 0) {
                        break;
                    }
                    oooO0OO.write(bArr, 0, i2);
                    i -= i2;
                }
            } else {
                int unsignedShort2 = oooO0O0.readUnsignedShort() - 2;
                if (unsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (unsignedShort2 >= 6) {
                    if (oooO0O0.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f5713Ooooo0o)) {
                        oooO0O0.OooO00o(unsignedShort2 - 6);
                    }
                }
                oooO0OO.OooO00o(-1);
                oooO0OO.OooO00o(b);
                oooO0OO.OooO0oO((short) (unsignedShort2 + 2));
                if (unsignedShort2 >= 6) {
                    unsignedShort2 -= 6;
                    oooO0OO.write(bArr2);
                }
                while (unsignedShort2 > 0) {
                    int i3 = oooO0O0.read(bArr, 0, Math.min(unsignedShort2, 4096));
                    if (i3 < 0) {
                        break;
                    }
                    oooO0OO.write(bArr, 0, i3);
                    unsignedShort2 -= i3;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void OooOooo(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f5681OooOo00) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        OooO0O0 oooO0O0 = new OooO0O0(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        OooO0OO oooO0OO = new OooO0OO(bufferedOutputStream, byteOrder);
        byte[] bArr = f5690OooOooo;
        androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO, bArr.length);
        int i = this.f5733OooOOOO;
        if (i == 0) {
            int i2 = oooO0O0.readInt();
            oooO0OO.OooO0OO(i2);
            androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO, i2 + 4 + 4);
        } else {
            androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO, ((i - bArr.length) - 4) - 4);
            oooO0O0.OooO00o(oooO0O0.readInt() + 4 + 4);
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                OooO0OO oooO0OO2 = new OooO0OO(byteArrayOutputStream, byteOrder);
                Oooo0o0(oooO0OO2);
                byte[] byteArray = ((ByteArrayOutputStream) oooO0OO2.f5750OooO0Oo).toByteArray();
                oooO0OO.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                oooO0OO.OooO0OO((int) crc32.getValue());
                androidx.exifinterface.media.OooO00o.OooO0O0(byteArrayOutputStream);
                androidx.exifinterface.media.OooO00o.OooO0o0(oooO0O0, oooO0OO);
            } catch (Throwable th) {
                th = th;
                androidx.exifinterface.media.OooO00o.OooO0O0(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public final void Oooo0(int i, int i2) throws Throwable {
        HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f5681OooOo00;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        OooO0o oooO0o = mapArr[i].get("ImageLength");
        OooO0o oooO0o2 = mapArr[i].get("ImageWidth");
        OooO0o oooO0o3 = mapArr[i2].get("ImageLength");
        OooO0o oooO0o4 = mapArr[i2].get("ImageWidth");
        if (oooO0o == null || oooO0o2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (oooO0o3 == null || oooO0o4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iOooO0oo = oooO0o.OooO0oo(this.f5726OooO0oO);
        int iOooO0oo2 = oooO0o2.OooO0oo(this.f5726OooO0oO);
        int iOooO0oo3 = oooO0o3.OooO0oo(this.f5726OooO0oO);
        int iOooO0oo4 = oooO0o4.OooO0oo(this.f5726OooO0oO);
        if (iOooO0oo >= iOooO0oo3 || iOooO0oo2 >= iOooO0oo4) {
            return;
        }
        HashMap<String, OooO0o> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0181 A[Catch: all -> 0x0072, Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, all -> 0x0072, blocks: (B:7:0x004a, B:9:0x0053, B:11:0x0068, B:12:0x006a, B:82:0x01ed, B:15:0x0075, B:17:0x007d, B:20:0x008d, B:22:0x0095, B:24:0x0099, B:27:0x00aa, B:29:0x00b5, B:30:0x00ba, B:32:0x00c8, B:33:0x00cc, B:35:0x00da, B:36:0x00dc, B:37:0x00e0, B:38:0x00e7, B:40:0x00ed, B:44:0x00fa, B:46:0x0102, B:48:0x0106, B:51:0x0111, B:53:0x011e, B:55:0x0124, B:71:0x0175, B:73:0x0181, B:75:0x018e, B:77:0x01cf, B:81:0x01e7, B:78:0x01d9, B:80:0x01df, B:56:0x0133, B:57:0x013a, B:58:0x013b, B:60:0x0143, B:62:0x014b, B:66:0x0164, B:67:0x0167, B:68:0x016e, B:87:0x0209, B:88:0x0210), top: B:100:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:74:0x018c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cf A[Catch: all -> 0x0072, Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, all -> 0x0072, blocks: (B:7:0x004a, B:9:0x0053, B:11:0x0068, B:12:0x006a, B:82:0x01ed, B:15:0x0075, B:17:0x007d, B:20:0x008d, B:22:0x0095, B:24:0x0099, B:27:0x00aa, B:29:0x00b5, B:30:0x00ba, B:32:0x00c8, B:33:0x00cc, B:35:0x00da, B:36:0x00dc, B:37:0x00e0, B:38:0x00e7, B:40:0x00ed, B:44:0x00fa, B:46:0x0102, B:48:0x0106, B:51:0x0111, B:53:0x011e, B:55:0x0124, B:71:0x0175, B:73:0x0181, B:75:0x018e, B:77:0x01cf, B:81:0x01e7, B:78:0x01d9, B:80:0x01df, B:56:0x0133, B:57:0x013a, B:58:0x013b, B:60:0x0143, B:62:0x014b, B:66:0x0164, B:67:0x0167, B:68:0x016e, B:87:0x0209, B:88:0x0210), top: B:100:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9 A[Catch: all -> 0x0072, Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, all -> 0x0072, blocks: (B:7:0x004a, B:9:0x0053, B:11:0x0068, B:12:0x006a, B:82:0x01ed, B:15:0x0075, B:17:0x007d, B:20:0x008d, B:22:0x0095, B:24:0x0099, B:27:0x00aa, B:29:0x00b5, B:30:0x00ba, B:32:0x00c8, B:33:0x00cc, B:35:0x00da, B:36:0x00dc, B:37:0x00e0, B:38:0x00e7, B:40:0x00ed, B:44:0x00fa, B:46:0x0102, B:48:0x0106, B:51:0x0111, B:53:0x011e, B:55:0x0124, B:71:0x0175, B:73:0x0181, B:75:0x018e, B:77:0x01cf, B:81:0x01e7, B:78:0x01d9, B:80:0x01df, B:56:0x0133, B:57:0x013a, B:58:0x013b, B:60:0x0143, B:62:0x014b, B:66:0x0164, B:67:0x0167, B:68:0x016e, B:87:0x0209, B:88:0x0210), top: B:100:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01df A[Catch: all -> 0x0072, Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, all -> 0x0072, blocks: (B:7:0x004a, B:9:0x0053, B:11:0x0068, B:12:0x006a, B:82:0x01ed, B:15:0x0075, B:17:0x007d, B:20:0x008d, B:22:0x0095, B:24:0x0099, B:27:0x00aa, B:29:0x00b5, B:30:0x00ba, B:32:0x00c8, B:33:0x00cc, B:35:0x00da, B:36:0x00dc, B:37:0x00e0, B:38:0x00e7, B:40:0x00ed, B:44:0x00fa, B:46:0x0102, B:48:0x0106, B:51:0x0111, B:53:0x011e, B:55:0x0124, B:71:0x0175, B:73:0x0181, B:75:0x018e, B:77:0x01cf, B:81:0x01e7, B:78:0x01d9, B:80:0x01df, B:56:0x0133, B:57:0x013a, B:58:0x013b, B:60:0x0143, B:62:0x014b, B:66:0x0164, B:67:0x0167, B:68:0x016e, B:87:0x0209, B:88:0x0210), top: B:100:0x004a }] */
    public final void Oooo000(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        OooO0OO oooO0OO;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        byte[] bArr;
        if (f5681OooOo00) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        OooO0O0 oooO0O0 = new OooO0O0(bufferedInputStream, byteOrder);
        OooO0OO oooO0OO2 = new OooO0OO(bufferedOutputStream, byteOrder);
        byte[] bArr2 = f5692Oooo0;
        androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO2, bArr2.length);
        byte[] bArr3 = f5696Oooo0O0;
        oooO0O0.OooO00o(bArr3.length + 4);
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    OooO0OO oooO0OO3 = new OooO0OO(byteArrayOutputStream, byteOrder);
                    int i5 = this.f5733OooOOOO;
                    if (i5 != 0) {
                        androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO3, ((i5 - ((bArr2.length + 4) + bArr3.length)) - 4) - 4);
                        oooO0O0.OooO00o(4);
                        int i6 = oooO0O0.readInt();
                        if (i6 % 2 != 0) {
                            i6++;
                        }
                        oooO0O0.OooO00o(i6);
                        Oooo0o0(oooO0OO3);
                    } else {
                        byte[] bArr4 = new byte[4];
                        if (oooO0O0.read(bArr4) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr5 = f5698Oooo0o;
                        boolean zEquals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = f5701Oooo0oo;
                        byte[] bArr7 = f5700Oooo0oO;
                        if (!zEquals) {
                            if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                int i7 = oooO0O0.readInt();
                                int i8 = i7 % 2 == 1 ? i7 + 1 : i7;
                                byte[] bArr8 = new byte[3];
                                boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                byte[] bArr9 = f5699Oooo0o0;
                                if (zEquals2) {
                                    oooO0O0.read(bArr8);
                                    byte[] bArr10 = new byte[3];
                                    oooO0OO = oooO0OO2;
                                    if (oooO0O0.read(bArr10) != 3 || !Arrays.equals(bArr9, bArr10)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i = oooO0O0.readInt();
                                    i2 = (i << 18) >> 18;
                                    i3 = (i << 2) >> 18;
                                    i8 -= 10;
                                } else {
                                    oooO0OO = oooO0OO2;
                                    if (!Arrays.equals(bArr4, bArr7)) {
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                    } else {
                                        if (oooO0O0.readByte() != 47) {
                                            throw new IOException("Encountered error while checking VP8L signature");
                                        }
                                        i = oooO0O0.readInt();
                                        z = true;
                                        i2 = (i & 16383) + 1;
                                        i4 = ((i & 268419072) >>> 14) + 1;
                                        if ((i & SQLiteDatabase.CREATE_IF_NECESSARY) == 0) {
                                            z = false;
                                        }
                                        i8 -= 5;
                                    }
                                    oooO0OO3.write(bArr5);
                                    oooO0OO3.OooO0OO(10);
                                    bArr = new byte[10];
                                    if (z) {
                                        bArr[0] = (byte) (bArr[0] | 16);
                                    }
                                    bArr[0] = (byte) (bArr[0] | 8);
                                    int i9 = i2 - 1;
                                    int i10 = i4 - 1;
                                    bArr[4] = (byte) i9;
                                    bArr[5] = (byte) (i9 >> 8);
                                    bArr[6] = (byte) (i9 >> 16);
                                    bArr[7] = (byte) i10;
                                    bArr[8] = (byte) (i10 >> 8);
                                    bArr[9] = (byte) (i10 >> 16);
                                    oooO0OO3.write(bArr);
                                    oooO0OO3.write(bArr4);
                                    oooO0OO3.OooO0OO(i7);
                                    if (Arrays.equals(bArr4, bArr6)) {
                                        oooO0OO3.write(bArr8);
                                        oooO0OO3.write(bArr9);
                                        oooO0OO3.OooO0OO(i);
                                    } else if (Arrays.equals(bArr4, bArr7)) {
                                        oooO0OO3.write(47);
                                        oooO0OO3.OooO0OO(i);
                                    }
                                    androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO3, i8);
                                    Oooo0o0(oooO0OO3);
                                }
                                i4 = i3;
                                z = false;
                                oooO0OO3.write(bArr5);
                                oooO0OO3.OooO0OO(10);
                                bArr = new byte[10];
                                if (z) {
                                    bArr[0] = (byte) (bArr[0] | 16);
                                }
                                bArr[0] = (byte) (bArr[0] | 8);
                                int i11 = i2 - 1;
                                int i12 = i4 - 1;
                                bArr[4] = (byte) i11;
                                bArr[5] = (byte) (i11 >> 8);
                                bArr[6] = (byte) (i11 >> 16);
                                bArr[7] = (byte) i12;
                                bArr[8] = (byte) (i12 >> 8);
                                bArr[9] = (byte) (i12 >> 16);
                                oooO0OO3.write(bArr);
                                oooO0OO3.write(bArr4);
                                oooO0OO3.OooO0OO(i7);
                                if (Arrays.equals(bArr4, bArr6)) {
                                    oooO0OO3.write(bArr8);
                                    oooO0OO3.write(bArr9);
                                    oooO0OO3.OooO0OO(i);
                                } else if (Arrays.equals(bArr4, bArr7)) {
                                    oooO0OO3.write(47);
                                    oooO0OO3.OooO0OO(i);
                                }
                                androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO3, i8);
                                Oooo0o0(oooO0OO3);
                            }
                            androidx.exifinterface.media.OooO00o.OooO0o0(oooO0O0, oooO0OO3);
                            byte[] bArr11 = bArr3;
                            OooO0OO oooO0OO4 = oooO0OO;
                            oooO0OO4.OooO0OO(byteArrayOutputStream.size() + bArr11.length);
                            oooO0OO4.write(bArr11);
                            byteArrayOutputStream.writeTo(oooO0OO4);
                            androidx.exifinterface.media.OooO00o.OooO0O0(byteArrayOutputStream);
                        }
                        int i13 = oooO0O0.readInt();
                        byte[] bArr12 = new byte[i13 % 2 == 1 ? i13 + 1 : i13];
                        oooO0O0.read(bArr12);
                        byte b = (byte) (bArr12[0] | 8);
                        bArr12[0] = b;
                        boolean z2 = ((b >> 1) & 1) == 1;
                        oooO0OO3.write(bArr5);
                        oooO0OO3.OooO0OO(i13);
                        oooO0OO3.write(bArr12);
                        if (z2) {
                            OooO0OO(oooO0O0, oooO0OO3, f5691Oooo, null);
                            while (true) {
                                byte[] bArr13 = new byte[4];
                                bufferedInputStream.read(bArr13);
                                if (!Arrays.equals(bArr13, f5704OoooO00)) {
                                    break;
                                }
                                int i14 = oooO0O0.readInt();
                                oooO0OO3.write(bArr13);
                                oooO0OO3.OooO0OO(i14);
                                if (i14 % 2 == 1) {
                                    i14++;
                                }
                                androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0O0, oooO0OO3, i14);
                            }
                            Oooo0o0(oooO0OO3);
                        } else {
                            OooO0OO(oooO0O0, oooO0OO3, bArr6, bArr7);
                            Oooo0o0(oooO0OO3);
                        }
                    }
                    oooO0OO = oooO0OO2;
                    bArr3 = bArr3;
                    androidx.exifinterface.media.OooO00o.OooO0o0(oooO0O0, oooO0OO3);
                    byte[] bArr14 = bArr3;
                    OooO0OO oooO0OO5 = oooO0OO;
                    oooO0OO5.OooO0OO(byteArrayOutputStream.size() + bArr14.length);
                    oooO0OO5.write(bArr14);
                    byteArrayOutputStream.writeTo(oooO0OO5);
                    androidx.exifinterface.media.OooO00o.OooO0O0(byteArrayOutputStream);
                } catch (Exception e) {
                    e = e;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    androidx.exifinterface.media.OooO00o.OooO0O0(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02c4 A[LOOP:5: B:100:0x02c1->B:102:0x02c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x02e4 A[LOOP:6: B:104:0x02e2->B:105:0x02e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:110:0x0309 A[LOOP:7: B:108:0x0306->B:110:0x0309, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0336  */
    /* JADX WARN: Code duplicated, block: B:115:0x0345 A[LOOP:8: B:113:0x0342->B:115:0x0345, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x035c  */
    /* JADX WARN: Code duplicated, block: B:120:0x036b A[LOOP:9: B:118:0x0368->B:120:0x036b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x0382  */
    /* JADX WARN: Code duplicated, block: B:124:0x0396  */
    /* JADX WARN: Code duplicated, block: B:126:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:134:0x03d4 A[PHI: r5 r8 r16 r19
      0x03d4: PHI (r5v28 int) = (r5v6 int), (r5v2 int) binds: [B:133:0x03d1, B:81:0x01f0] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r8v17 int) = (r8v3 int), (r8v2 int) binds: [B:133:0x03d1, B:81:0x01f0] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r16v9 java.lang.String) = (r16v0 java.lang.String), (r16v10 java.lang.String) binds: [B:133:0x03d1, B:81:0x01f0] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r19v10 boolean) = (r19v1 boolean), (r19v11 boolean) binds: [B:133:0x03d1, B:81:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0207  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212 A[LOOP:1: B:84:0x020f->B:86:0x0212, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0232 A[LOOP:2: B:88:0x0230->B:89:0x0232, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0248  */
    /* JADX WARN: Code duplicated, block: B:94:0x0254 A[LOOP:3: B:92:0x0251->B:94:0x0254, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0296 A[LOOP:4: B:96:0x0294->B:97:0x0296, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x02b5  */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01f2, please report this as an issue */
    public final void Oooo00O(@NonNull String str, @Nullable String str2) {
        OooO oooO;
        int[] iArr;
        String str3;
        boolean z;
        OooO0o oooO0o;
        String str4;
        String[] strArrSplit;
        int[] iArr2;
        int i;
        String[] strArrSplit2;
        long[] jArr;
        int i2;
        String[] strArrSplit3;
        OooOO0[] oooOO0Arr;
        int i3;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i4;
        ByteBuffer byteBufferWrap;
        int i5;
        String[] strArrSplit5;
        int length2;
        OooOO0[] oooOO0Arr2;
        int i6;
        int i7;
        ByteBuffer byteBufferWrap2;
        int i8;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i9;
        ByteBuffer byteBufferWrap3;
        int i10;
        String str5 = str;
        String strReplaceAll = str2;
        String str6 = "ExifInterface";
        if (("DateTime".equals(str5) || "DateTimeOriginal".equals(str5) || "DateTimeDigitized".equals(str5)) && strReplaceAll != null) {
            boolean zFind = f5716OooooOo.matcher(strReplaceAll).find();
            boolean zFind2 = f5717Oooooo0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str5 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", CertificateUtil.DELIMITER);
            }
        }
        boolean zEquals = "ISOSpeedRatings".equals(str5);
        boolean z2 = f5681OooOo00;
        if (zEquals) {
            if (z2) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str5 = "PhotographicSensitivity";
        }
        int i11 = 2;
        int i12 = 1;
        if (strReplaceAll != null && f5710OoooOoO.contains(str5)) {
            if (str5.equals("GPSTimeStamp")) {
                Matcher matcher = f5715OooooOO.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str5 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new OooOO0(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str5 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < f5718o000oOoO.length) {
            if ((i13 != 4 || this.f5727OooO0oo) && (oooO = f5709OoooOo0[i13].get(str5)) != null) {
                HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairOooOOo = OooOOo(strReplaceAll);
                    int iIntValue = ((Integer) pairOooOOo.first).intValue();
                    int i15 = -1;
                    int i16 = oooO.f5740OooO0OO;
                    if (i16 != iIntValue && i16 != ((Integer) pairOooOOo.second).intValue()) {
                        int i17 = oooO.f5741OooO0Oo;
                        if (i17 != -1 && (i17 == ((Integer) pairOooOOo.first).intValue() || i17 == ((Integer) pairOooOOo.second).intValue())) {
                            i16 = i17;
                        } else if (i16 != i12 && i16 != 7 && i16 != i11) {
                            if (z2) {
                                StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Given tag (", str5, ") value didn't match with one of expected formats: ");
                                String[] strArr = f5703OoooO0;
                                sbOooO0O0.append(strArr[i16]);
                                sbOooO0O0.append(i17 == -1 ? "" : ", " + strArr[i17]);
                                sbOooO0O0.append(" (guess: ");
                                sbOooO0O0.append(strArr[((Integer) pairOooOOo.first).intValue()]);
                                sbOooO0O0.append(((Integer) pairOooOOo.second).intValue() != -1 ? ", " + strArr[((Integer) pairOooOOo.second).intValue()] : "");
                                sbOooO0O0.append(")");
                                Log.d(str6, sbOooO0O0.toString());
                            }
                        }
                        iArr = f5705OoooO0O;
                        switch (i16) {
                            case 1:
                                str3 = str6;
                                z = z2;
                                HashMap<String, OooO0o> map = mapArr[i13];
                                i12 = 1;
                                if (strReplaceAll.length() == 1) {
                                    i14 = 0;
                                    if (strReplaceAll.charAt(0) < '0') {
                                    }
                                    map.put(str5, oooO0o);
                                    str6 = str3;
                                } else {
                                    i14 = 0;
                                }
                                byte[] bytes = strReplaceAll.getBytes(f5712Ooooo00);
                                oooO0o = new OooO0o(1, bytes.length, bytes);
                                map.put(str5, oooO0o);
                                str6 = str3;
                                break;
                            case 2:
                            case 7:
                                str4 = str6;
                                z = z2;
                                mapArr[i13].put(str5, OooO0o.OooO00o(strReplaceAll));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 3:
                                str4 = str6;
                                z = z2;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i = 0; i < strArrSplit.length; i++) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i13].put(str5, OooO0o.OooO0o(iArr2, this.f5726OooO0oO));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 4:
                                str4 = str6;
                                z = z2;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i2 = 0; i2 < strArrSplit2.length; i2++) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i13].put(str5, OooO0o.OooO0OO(jArr, this.f5726OooO0oO));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 5:
                                str4 = str6;
                                z = z2;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                oooOO0Arr = new OooOO0[strArrSplit3.length];
                                i3 = 0;
                                while (i3 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i3].split("/", i15);
                                    oooOO0Arr[i3] = new OooOO0((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i3++;
                                    i15 = -1;
                                }
                                mapArr[i13].put(str5, OooO0o.OooO0Oo(oooOO0Arr, this.f5726OooO0oO));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                str3 = str6;
                                z = z2;
                                if (z) {
                                    str6 = str3;
                                    Log.d(str6, "Data format isn't one of expected formats: " + i16);
                                } else {
                                    str6 = str3;
                                }
                                break;
                            case 9:
                                str4 = str6;
                                z = z2;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i4 = 0; i4 < strArrSplit4.length; i4++) {
                                    iArr3[i4] = Integer.parseInt(strArrSplit4[i4]);
                                }
                                HashMap<String, OooO0o> map2 = mapArr[i13];
                                ByteOrder byteOrder = this.f5726OooO0oO;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (i5 = 0; i5 < length; i5++) {
                                    byteBufferWrap.putInt(iArr3[i5]);
                                }
                                map2.put(str5, new OooO0o(9, length, byteBufferWrap.array()));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                oooOO0Arr2 = new OooOO0[length2];
                                i6 = -1;
                                i7 = i14;
                                while (i14 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i14].split("/", i6);
                                    oooOO0Arr2[i14] = new OooOO0((long) Double.parseDouble(strArrSplit8[i7]), (long) Double.parseDouble(strArrSplit8[1]));
                                    i14++;
                                    i7 = 0;
                                    i6 = -1;
                                    z2 = z2;
                                    str6 = str6;
                                }
                                str4 = str6;
                                z = z2;
                                HashMap<String, OooO0o> map3 = mapArr[i13];
                                ByteOrder byteOrder2 = this.f5726OooO0oO;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                for (i8 = 0; i8 < length2; i8++) {
                                    OooOO0 oooOO1 = oooOO0Arr2[i8];
                                    byteBufferWrap2.putInt((int) oooOO1.f5756OooO00o);
                                    byteBufferWrap2.putInt((int) oooOO1.f5757OooO0O0);
                                }
                                map3.put(str5, new OooO0o(10, length2, byteBufferWrap2.array()));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i9 = i14; i9 < strArrSplit6.length; i9++) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap<String, OooO0o> map4 = mapArr[i13];
                                ByteOrder byteOrder3 = this.f5726OooO0oO;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                for (i10 = i14; i10 < length3; i10++) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map4.put(str5, new OooO0o(12, length3, byteBufferWrap3.array()));
                                break;
                        }
                    } else {
                        iArr = f5705OoooO0O;
                        switch (i16) {
                            case 1:
                                str3 = str6;
                                z = z2;
                                HashMap<String, OooO0o> map5 = mapArr[i13];
                                i12 = 1;
                                if (strReplaceAll.length() == 1) {
                                    i14 = 0;
                                    if (strReplaceAll.charAt(0) < '0' && strReplaceAll.charAt(0) <= '1') {
                                        oooO0o = new OooO0o(1, 1, new byte[]{(byte) (strReplaceAll.charAt(0) - '0')});
                                    }
                                    map5.put(str5, oooO0o);
                                    str6 = str3;
                                } else {
                                    i14 = 0;
                                }
                                byte[] bytes2 = strReplaceAll.getBytes(f5712Ooooo00);
                                oooO0o = new OooO0o(1, bytes2.length, bytes2);
                                map5.put(str5, oooO0o);
                                str6 = str3;
                                break;
                            case 2:
                            case 7:
                                str4 = str6;
                                z = z2;
                                mapArr[i13].put(str5, OooO0o.OooO00o(strReplaceAll));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 3:
                                str4 = str6;
                                z = z2;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i < strArrSplit.length) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i13].put(str5, OooO0o.OooO0o(iArr2, this.f5726OooO0oO));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 4:
                                str4 = str6;
                                z = z2;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i2 < strArrSplit2.length) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i13].put(str5, OooO0o.OooO0OO(jArr, this.f5726OooO0oO));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 5:
                                str4 = str6;
                                z = z2;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                oooOO0Arr = new OooOO0[strArrSplit3.length];
                                i3 = 0;
                                while (i3 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i3].split("/", i15);
                                    oooOO0Arr[i3] = new OooOO0((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[1]));
                                    i3++;
                                    i15 = -1;
                                }
                                mapArr[i13].put(str5, OooO0o.OooO0Oo(oooOO0Arr, this.f5726OooO0oO));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                str3 = str6;
                                z = z2;
                                if (z) {
                                    str6 = str3;
                                    Log.d(str6, "Data format isn't one of expected formats: " + i16);
                                } else {
                                    str6 = str3;
                                }
                                break;
                            case 9:
                                str4 = str6;
                                z = z2;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i4 < strArrSplit4.length) {
                                    iArr3[i4] = Integer.parseInt(strArrSplit4[i4]);
                                }
                                HashMap<String, OooO0o> map6 = mapArr[i13];
                                ByteOrder byteOrder4 = this.f5726OooO0oO;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder4);
                                while (i5 < length) {
                                    byteBufferWrap.putInt(iArr3[i5]);
                                }
                                map6.put(str5, new OooO0o(9, length, byteBufferWrap.array()));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                oooOO0Arr2 = new OooOO0[length2];
                                i6 = -1;
                                i7 = i14;
                                while (i14 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i14].split("/", i6);
                                    oooOO0Arr2[i14] = new OooOO0((long) Double.parseDouble(strArrSplit10[i7]), (long) Double.parseDouble(strArrSplit10[1]));
                                    i14++;
                                    i7 = 0;
                                    i6 = -1;
                                    z2 = z2;
                                    str6 = str6;
                                }
                                str4 = str6;
                                z = z2;
                                HashMap<String, OooO0o> map7 = mapArr[i13];
                                ByteOrder byteOrder5 = this.f5726OooO0oO;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                while (i8 < length2) {
                                    OooOO0 oooOO2 = oooOO0Arr2[i8];
                                    byteBufferWrap2.putInt((int) oooOO2.f5756OooO00o);
                                    byteBufferWrap2.putInt((int) oooOO2.f5757OooO0O0);
                                }
                                map7.put(str5, new OooO0o(10, length2, byteBufferWrap2.array()));
                                i12 = 1;
                                str6 = str4;
                                i14 = 0;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i9 < strArrSplit6.length) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap<String, OooO0o> map8 = mapArr[i13];
                                ByteOrder byteOrder6 = this.f5726OooO0oO;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                while (i10 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map8.put(str5, new OooO0o(12, length3, byteBufferWrap3.array()));
                                break;
                        }
                    }
                } else {
                    mapArr[i13].remove(str5);
                }
                z = z2;
            } else {
                z = z2;
            }
            i13++;
            i11 = 2;
            z2 = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    public final void Oooo00o(OooO0O0 oooO0O0) throws Throwable {
        boolean z;
        OooO0o oooO0o;
        int iOooO0oo;
        HashMap<String, OooO0o> map = this.f5725OooO0o0[4];
        OooO0o oooO0o2 = map.get("Compression");
        if (oooO0o2 == null) {
            this.f5731OooOOO = 6;
            OooOOoo(oooO0O0, map);
            return;
        }
        int iOooO0oo2 = oooO0o2.OooO0oo(this.f5726OooO0oO);
        this.f5731OooOOO = iOooO0oo2;
        if (iOooO0oo2 != 1) {
            if (iOooO0oo2 == 6) {
                OooOOoo(oooO0O0, map);
                return;
            } else if (iOooO0oo2 != 7) {
                return;
            }
        }
        OooO0o oooO0o3 = map.get("BitsPerSample");
        if (oooO0o3 != null) {
            int[] iArr = (int[]) oooO0o3.OooOO0(this.f5726OooO0oO);
            int[] iArr2 = f5683OooOo0o;
            if (Arrays.equals(iArr2, iArr) || (this.f5723OooO0Oo == 3 && (oooO0o = map.get("PhotometricInterpretation")) != null && (((iOooO0oo = oooO0o.OooO0oo(this.f5726OooO0oO)) == 1 && Arrays.equals(iArr, f5679OooOo)) || (iOooO0oo == 6 && Arrays.equals(iArr, iArr2))))) {
                z = true;
            } else {
                if (f5681OooOo00) {
                    Log.d("ExifInterface", "Unsupported data type value");
                }
                z = false;
            }
        } else {
            if (f5681OooOo00) {
                Log.d("ExifInterface", "Unsupported data type value");
            }
            z = false;
        }
        if (z) {
            OooO0o oooO0o4 = map.get("StripOffsets");
            OooO0o oooO0o5 = map.get("StripByteCounts");
            if (oooO0o4 == null || oooO0o5 == null) {
                return;
            }
            long[] jArrOooO0OO = androidx.exifinterface.media.OooO00o.OooO0OO(oooO0o4.OooOO0(this.f5726OooO0oO));
            long[] jArrOooO0OO2 = androidx.exifinterface.media.OooO00o.OooO0OO(oooO0o5.OooOO0(this.f5726OooO0oO));
            if (jArrOooO0OO == null || jArrOooO0OO.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrOooO0OO2 == null || jArrOooO0OO2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrOooO0OO.length != jArrOooO0OO2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j = 0;
            for (long j2 : jArrOooO0OO2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.f5728OooOO0 = true;
            this.f5719OooO = true;
            this.f5727OooO0oo = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < jArrOooO0OO.length; i4++) {
                int i5 = (int) jArrOooO0OO[i4];
                int i6 = (int) jArrOooO0OO2[i4];
                if (i4 < jArrOooO0OO.length - 1 && i5 + i6 != jArrOooO0OO[i4 + 1]) {
                    this.f5728OooOO0 = false;
                }
                int i7 = i5 - i2;
                if (i7 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                    return;
                }
                long j3 = i7;
                if (oooO0O0.skip(j3) != j3) {
                    Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                    return;
                }
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                if (oooO0O0.read(bArr2) != i6) {
                    Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                    return;
                }
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.f5732OooOOO0 = bArr;
            if (this.f5728OooOO0) {
                this.f5729OooOO0O = (int) jArrOooO0OO[0];
                this.f5730OooOO0o = i;
            }
        }
    }

    public final void Oooo0O0(OooOO0O oooOO0O, int i) throws Throwable {
        OooO0o oooO0oOooO0o0;
        OooO0o oooO0oOooO0o1;
        HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
        OooO0o oooO0o = mapArr[i].get("DefaultCropSize");
        OooO0o oooO0o2 = mapArr[i].get("SensorTopBorder");
        OooO0o oooO0o3 = mapArr[i].get("SensorLeftBorder");
        OooO0o oooO0o4 = mapArr[i].get("SensorBottomBorder");
        OooO0o oooO0o5 = mapArr[i].get("SensorRightBorder");
        if (oooO0o != null) {
            if (oooO0o.f5752OooO00o == 5) {
                OooOO0[] oooOO0Arr = (OooOO0[]) oooO0o.OooOO0(this.f5726OooO0oO);
                if (oooOO0Arr == null || oooOO0Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(oooOO0Arr));
                    return;
                } else {
                    oooO0oOooO0o0 = OooO0o.OooO0Oo(new OooOO0[]{oooOO0Arr[0]}, this.f5726OooO0oO);
                    oooO0oOooO0o1 = OooO0o.OooO0Oo(new OooOO0[]{oooOO0Arr[1]}, this.f5726OooO0oO);
                }
            } else {
                int[] iArr = (int[]) oooO0o.OooOO0(this.f5726OooO0oO);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                oooO0oOooO0o0 = OooO0o.OooO0o0(iArr[0], this.f5726OooO0oO);
                oooO0oOooO0o1 = OooO0o.OooO0o0(iArr[1], this.f5726OooO0oO);
            }
            mapArr[i].put("ImageWidth", oooO0oOooO0o0);
            mapArr[i].put("ImageLength", oooO0oOooO0o1);
            return;
        }
        if (oooO0o2 != null && oooO0o3 != null && oooO0o4 != null && oooO0o5 != null) {
            int iOooO0oo = oooO0o2.OooO0oo(this.f5726OooO0oO);
            int iOooO0oo2 = oooO0o4.OooO0oo(this.f5726OooO0oO);
            int iOooO0oo3 = oooO0o5.OooO0oo(this.f5726OooO0oO);
            int iOooO0oo4 = oooO0o3.OooO0oo(this.f5726OooO0oO);
            if (iOooO0oo2 <= iOooO0oo || iOooO0oo3 <= iOooO0oo4) {
                return;
            }
            OooO0o oooO0oOooO0o2 = OooO0o.OooO0o0(iOooO0oo2 - iOooO0oo, this.f5726OooO0oO);
            OooO0o oooO0oOooO0o3 = OooO0o.OooO0o0(iOooO0oo3 - iOooO0oo4, this.f5726OooO0oO);
            mapArr[i].put("ImageLength", oooO0oOooO0o2);
            mapArr[i].put("ImageWidth", oooO0oOooO0o3);
            return;
        }
        OooO0o oooO0o6 = mapArr[i].get("ImageLength");
        OooO0o oooO0o7 = mapArr[i].get("ImageWidth");
        if (oooO0o6 == null || oooO0o7 == null) {
            OooO0o oooO0o8 = mapArr[i].get("JPEGInterchangeFormat");
            OooO0o oooO0o9 = mapArr[i].get("JPEGInterchangeFormatLength");
            if (oooO0o8 == null || oooO0o9 == null) {
                return;
            }
            int iOooO0oo5 = oooO0o8.OooO0oo(this.f5726OooO0oO);
            int iOooO0oo6 = oooO0o8.OooO0oo(this.f5726OooO0oO);
            oooOO0O.OooO0OO(iOooO0oo5);
            byte[] bArr = new byte[iOooO0oo6];
            oooOO0O.read(bArr);
            OooO0oo(new OooO0O0(bArr), iOooO0oo5, i);
        }
    }

    public final void Oooo0OO() throws Throwable {
        Oooo0(0, 5);
        Oooo0(0, 4);
        Oooo0(5, 4);
        HashMap<String, OooO0o>[] mapArr = this.f5725OooO0o0;
        OooO0o oooO0o = mapArr[1].get("PixelXDimension");
        OooO0o oooO0o2 = mapArr[1].get("PixelYDimension");
        if (oooO0o != null && oooO0o2 != null) {
            mapArr[0].put("ImageWidth", oooO0o);
            mapArr[0].put("ImageLength", oooO0o2);
        }
        if (mapArr[4].isEmpty() && OooOo0(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!OooOo0(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        OooOoo(0, "ThumbnailOrientation", "Orientation");
        OooOoo(0, "ThumbnailImageLength", "ImageLength");
        OooOoo(0, "ThumbnailImageWidth", "ImageWidth");
        OooOoo(5, "ThumbnailOrientation", "Orientation");
        OooOoo(5, "ThumbnailImageLength", "ImageLength");
        OooOoo(5, "ThumbnailImageWidth", "ImageWidth");
        OooOoo(4, "Orientation", "ThumbnailOrientation");
        OooOoo(4, "ImageLength", "ThumbnailImageLength");
        OooOoo(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void Oooo0o0(OooO0OO oooO0OO) throws IOException {
        HashMap<String, OooO0o>[] mapArr;
        int[] iArr;
        OooO[][] oooOArr = f5718o000oOoO;
        int[] iArr2 = new int[oooOArr.length];
        int[] iArr3 = new int[oooOArr.length];
        OooO[] oooOArr2 = f5707OoooOOO;
        for (OooO oooO : oooOArr2) {
            OooOoo0(oooO.f5739OooO0O0);
        }
        if (this.f5727OooO0oo) {
            if (this.f5719OooO) {
                OooOoo0("StripOffsets");
                OooOoo0("StripByteCounts");
            } else {
                OooOoo0("JPEGInterchangeFormat");
                OooOoo0("JPEGInterchangeFormatLength");
            }
        }
        int i = 0;
        while (true) {
            int length = oooOArr.length;
            mapArr = this.f5725OooO0o0;
            if (i >= length) {
                break;
            }
            Object[] array = mapArr[i].entrySet().toArray();
            int length2 = array.length;
            int i2 = 0;
            while (i2 < length2) {
                Map.Entry entry = (Map.Entry) array[i2];
                if (entry.getValue() == null) {
                    mapArr[i].remove(entry.getKey());
                }
                i2++;
                array = array;
            }
            i++;
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(oooOArr2[1].f5739OooO0O0, OooO0o.OooO0O0(0L, this.f5726OooO0oO));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(oooOArr2[2].f5739OooO0O0, OooO0o.OooO0O0(0L, this.f5726OooO0oO));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(oooOArr2[3].f5739OooO0O0, OooO0o.OooO0O0(0L, this.f5726OooO0oO));
        }
        if (this.f5727OooO0oo) {
            if (this.f5719OooO) {
                mapArr[4].put("StripOffsets", OooO0o.OooO0o0(0, this.f5726OooO0oO));
                mapArr[4].put("StripByteCounts", OooO0o.OooO0o0(this.f5730OooOO0o, this.f5726OooO0oO));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", OooO0o.OooO0O0(0L, this.f5726OooO0oO));
                mapArr[4].put("JPEGInterchangeFormatLength", OooO0o.OooO0O0(this.f5730OooOO0o, this.f5726OooO0oO));
            }
        }
        int i3 = 0;
        while (true) {
            int length3 = oooOArr.length;
            iArr = f5705OoooO0O;
            if (i3 >= length3) {
                break;
            }
            Iterator<Map.Entry<String, OooO0o>> it = mapArr[i3].entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                OooO0o value = it.next().getValue();
                value.getClass();
                int i5 = iArr[value.f5752OooO00o] * value.f5753OooO0O0;
                if (i5 > 4) {
                    i4 += i5;
                }
            }
            iArr3[i3] = iArr3[i3] + i4;
            i3++;
        }
        int size = 8;
        for (int i6 = 0; i6 < oooOArr.length; i6++) {
            if (!mapArr[i6].isEmpty()) {
                iArr2[i6] = size;
                size = (mapArr[i6].size() * 12) + 2 + 4 + iArr3[i6] + size;
            }
        }
        if (this.f5727OooO0oo) {
            if (this.f5719OooO) {
                mapArr[4].put("StripOffsets", OooO0o.OooO0o0(size, this.f5726OooO0oO));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", OooO0o.OooO0O0(size, this.f5726OooO0oO));
            }
            this.f5729OooOO0O = size;
            size += this.f5730OooOO0o;
        }
        if (this.f5723OooO0Oo == 4) {
            size += 8;
        }
        if (f5681OooOo00) {
            for (int i7 = 0; i7 < oooOArr.length; i7++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i7), Integer.valueOf(iArr2[i7]), Integer.valueOf(mapArr[i7].size()), Integer.valueOf(iArr3[i7]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(oooOArr2[1].f5739OooO0O0, OooO0o.OooO0O0(iArr2[1], this.f5726OooO0oO));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(oooOArr2[2].f5739OooO0O0, OooO0o.OooO0O0(iArr2[2], this.f5726OooO0oO));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(oooOArr2[3].f5739OooO0O0, OooO0o.OooO0O0(iArr2[3], this.f5726OooO0oO));
        }
        int i8 = this.f5723OooO0Oo;
        if (i8 == 4) {
            oooO0OO.OooO0oO((short) size);
            oooO0OO.write(f5713Ooooo0o);
        } else if (i8 == 13) {
            oooO0OO.OooO0OO(size);
            oooO0OO.write(f5693Oooo000);
        } else if (i8 == 14) {
            oooO0OO.write(f5697Oooo0OO);
            oooO0OO.OooO0OO(size);
        }
        oooO0OO.OooO0oO(this.f5726OooO0oO == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        oooO0OO.f5751OooO0o0 = this.f5726OooO0oO;
        oooO0OO.OooO0oO((short) 42);
        oooO0OO.OooO0OO((int) 8);
        for (int i9 = 0; i9 < oooOArr.length; i9++) {
            if (!mapArr[i9].isEmpty()) {
                oooO0OO.OooO0oO((short) mapArr[i9].size());
                int size2 = (mapArr[i9].size() * 12) + iArr2[i9] + 2 + 4;
                for (Map.Entry<String, OooO0o> entry2 : mapArr[i9].entrySet()) {
                    int i10 = f5709OoooOo0[i9].get(entry2.getKey()).f5738OooO00o;
                    OooO0o value2 = entry2.getValue();
                    value2.getClass();
                    int i11 = iArr[value2.f5752OooO00o] * value2.f5753OooO0O0;
                    oooO0OO.OooO0oO((short) i10);
                    oooO0OO.OooO0oO((short) value2.f5752OooO00o);
                    oooO0OO.OooO0OO(value2.f5753OooO0O0);
                    if (i11 > 4) {
                        oooO0OO.OooO0OO(size2);
                        size2 += i11;
                    } else {
                        oooO0OO.write(value2.f5755OooO0Oo);
                        if (i11 < 4) {
                            while (i11 < 4) {
                                oooO0OO.OooO00o(0);
                                i11++;
                            }
                        }
                    }
                }
                if (i9 != 0 || mapArr[4].isEmpty()) {
                    oooO0OO.OooO0OO((int) 0);
                } else {
                    oooO0OO.OooO0OO(iArr2[4]);
                }
                Iterator<Map.Entry<String, OooO0o>> it2 = mapArr[i9].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f5755OooO0Oo;
                    if (bArr.length > 4) {
                        oooO0OO.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f5727OooO0oo) {
            oooO0OO.write(OooOOOo());
        }
        if (this.f5723OooO0Oo == 14 && size % 2 == 1) {
            oooO0OO.OooO00o(0);
        }
        oooO0OO.f5751OooO0o0 = ByteOrder.BIG_ENDIAN;
    }

    public static class OooOO0O extends OooO0O0 {
        public OooOO0O(byte[] bArr) throws IOException {
            super(bArr);
            this.f5746OooO0Oo.mark(Integer.MAX_VALUE);
        }

        public final void OooO0OO(long j) throws IOException {
            int i = this.f5747OooO0o;
            if (i > j) {
                this.f5747OooO0o = 0;
                this.f5746OooO0Oo.reset();
            } else {
                j -= (long) i;
            }
            OooO00o((int) j);
        }

        public OooOO0O(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f5746OooO0Oo.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5738OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f5739OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f5740OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f5741OooO0Oo;

        public OooO(String str, int i, int i2) {
            this.f5739OooO0O0 = str;
            this.f5738OooO00o = i;
            this.f5740OooO0OO = i2;
            this.f5741OooO0Oo = -1;
        }

        public OooO(String str, int i, int i2, int i3) {
            this.f5739OooO0O0 = str;
            this.f5738OooO00o = i;
            this.f5740OooO0OO = i2;
            this.f5741OooO0Oo = i3;
        }
    }

    public ExifInterface(@NonNull String str) throws Throwable {
        OooO[][] oooOArr = f5718o000oOoO;
        this.f5725OooO0o0 = new HashMap[oooOArr.length];
        this.f5724OooO0o = new HashSet(oooOArr.length);
        this.f5726OooO0oO = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            OooOo00(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        boolean z;
        OooO[][] oooOArr = f5718o000oOoO;
        this.f5725OooO0o0 = new HashMap[oooOArr.length];
        this.f5724OooO0o = new HashSet(oooOArr.length);
        this.f5726OooO0oO = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f5720OooO00o = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f5722OooO0OO = (AssetManager.AssetInputStream) inputStream;
                this.f5721OooO0O0 = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    androidx.exifinterface.media.OooO00o.C0128OooO00o.OooO0OO(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z = true;
                } catch (Exception unused) {
                    if (f5681OooOo00) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z = false;
                }
                if (z) {
                    this.f5722OooO0OO = null;
                    this.f5721OooO0O0 = fileInputStream.getFD();
                } else {
                    this.f5722OooO0OO = null;
                    this.f5721OooO0O0 = null;
                }
            } else {
                this.f5722OooO0OO = null;
                this.f5721OooO0O0 = null;
            }
            OooOo0O(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
