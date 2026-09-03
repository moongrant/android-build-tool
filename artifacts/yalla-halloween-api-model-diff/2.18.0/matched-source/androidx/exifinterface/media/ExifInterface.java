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
import androidx.appcompat.widget.o00000O0;
import com.facebook.internal.security.CertificateUtil;
import com.umeng.analytics.pro.bz;
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
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import org.conscrypt.NativeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class ExifInterface {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final OooO f8193OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final OooO[] f8194OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final HashMap<Integer, OooO>[] f8195OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final HashMap<String, OooO>[] f8196OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final HashSet<String> f8197OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f8198OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final Charset f8199Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final byte[] f8200Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final byte[] f8201OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final Pattern f8202OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final Pattern f8203OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final Pattern f8204Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final OooO[][] f8205o000oOoO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f8206OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f8207OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public FileDescriptor f8208OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AssetManager.AssetInputStream f8209OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Set<Integer> f8211OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, OooO0o>[] f8212OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ByteOrder f8213OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f8214OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f8215OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f8216OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f8217OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f8218OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte[] f8219OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f8220OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f8221OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f8222OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f8223OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f8224OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final boolean f8168OooOo00 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final List<Integer> f8167OooOo0 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final List<Integer> f8169OooOo0O = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final int[] f8170OooOo0o = {8, 8, 8};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final int[] f8166OooOo = {8};

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final byte[] f8172OooOoO0 = {-1, -40, -1};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final byte[] f8171OooOoO = {102, 116, 121, 112};

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final byte[] f8173OooOoOO = {109, 105, 102, 49};

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final byte[] f8175OooOoo0 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final byte[] f8174OooOoo = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final byte[] f8176OooOooO = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final byte[] f8177OooOooo = {-119, 80, 78, 71, bz.k, 10, 26, 10};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final byte[] f8180Oooo000 = {101, 88, 73, 102};

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final byte[] f8181Oooo00O = {73, 72, 68, 82};

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final byte[] f8182Oooo00o = {73, 69, 78, 68};

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final byte[] f8179Oooo0 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final byte[] f8183Oooo0O0 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final byte[] f8184Oooo0OO = {69, 88, 73, 70};

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final byte[] f8186Oooo0o0 = {-99, 1, 42};

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final byte[] f8185Oooo0o = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final byte[] f8187Oooo0oO = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final byte[] f8188Oooo0oo = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final byte[] f8178Oooo = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final byte[] f8191OoooO00 = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final String[] f8190OoooO0 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final int[] f8192OoooO0O = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final byte[] f8189OoooO = {65, 83, 67, 73, 73, 0, 0, 0};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IfdType {
    }

    public class OooO00o extends MediaDataSource {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public long f8229Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f8230OoooO00;

        public OooO00o(OooOO0O oooOO0O) {
            this.f8230OoooO00 = oooOO0O;
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
                long j2 = this.f8229Oooo;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f8230OoooO00.available())) {
                        return -1;
                    }
                    this.f8230OoooO00.OooO0Oo(j);
                    this.f8229Oooo = j;
                }
                if (i2 > this.f8230OoooO00.available()) {
                    i2 = this.f8230OoooO00.available();
                }
                int i3 = this.f8230OoooO00.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f8229Oooo += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f8229Oooo = -1L;
            return -1;
        }
    }

    public static class OooO0O0 extends InputStream implements DataInput {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public static final ByteOrder f8231OoooO = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public static final ByteOrder f8232OoooOO0 = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final DataInputStream f8233Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f8234OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public ByteOrder f8235OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public byte[] f8236OoooO0O;

        public OooO0O0(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public final long OooO00o() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public final void OooO0O0(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int iSkip = (int) this.f8233Oooo.skip(i3);
                if (iSkip <= 0) {
                    if (this.f8236OoooO0O == null) {
                        this.f8236OoooO0O = new byte[8192];
                    }
                    iSkip = this.f8233Oooo.read(this.f8236OoooO0O, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException(OooO0O0.OooO00o.OooO00o("Reached EOF while skipping ", i, " bytes."));
                    }
                }
                i2 += iSkip;
            }
            this.f8234OoooO0 += i2;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f8233Oooo.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f8234OoooO0++;
            return this.f8233Oooo.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f8234OoooO0++;
            return this.f8233Oooo.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f8234OoooO0++;
            int i = this.f8233Oooo.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f8234OoooO0 += 2;
            return this.f8233Oooo.readChar();
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
            this.f8234OoooO0 += i2;
            this.f8233Oooo.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f8234OoooO0 += 4;
            int i = this.f8233Oooo.read();
            int i2 = this.f8233Oooo.read();
            int i3 = this.f8233Oooo.read();
            int i4 = this.f8233Oooo.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f8235OoooO00;
            if (byteOrder == f8231OoooO) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f8232OoooOO0) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Invalid byte order: ");
            sbOooO0O0.append(this.f8235OoooO00);
            throw new IOException(sbOooO0O0.toString());
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.f8234OoooO0 += 8;
            int i = this.f8233Oooo.read();
            int i2 = this.f8233Oooo.read();
            int i3 = this.f8233Oooo.read();
            int i4 = this.f8233Oooo.read();
            int i5 = this.f8233Oooo.read();
            int i6 = this.f8233Oooo.read();
            int i7 = this.f8233Oooo.read();
            int i8 = this.f8233Oooo.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f8235OoooO00;
            if (byteOrder == f8231OoooO) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == f8232OoooOO0) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Invalid byte order: ");
            sbOooO0O0.append(this.f8235OoooO00);
            throw new IOException(sbOooO0O0.toString());
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f8234OoooO0 += 2;
            int i = this.f8233Oooo.read();
            int i2 = this.f8233Oooo.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f8235OoooO00;
            if (byteOrder == f8231OoooO) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f8232OoooOO0) {
                return (short) ((i << 8) + i2);
            }
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Invalid byte order: ");
            sbOooO0O0.append(this.f8235OoooO00);
            throw new IOException(sbOooO0O0.toString());
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f8234OoooO0 += 2;
            return this.f8233Oooo.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f8234OoooO0++;
            return this.f8233Oooo.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f8234OoooO0 += 2;
            int i = this.f8233Oooo.read();
            int i2 = this.f8233Oooo.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f8235OoooO00;
            if (byteOrder == f8231OoooO) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f8232OoooOO0) {
                return (i << 8) + i2;
            }
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Invalid byte order: ");
            sbOooO0O0.append(this.f8235OoooO00);
            throw new IOException(sbOooO0O0.toString());
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
            this.f8235OoooO00 = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f8233Oooo = dataInputStream;
            dataInputStream.mark(0);
            this.f8234OoooO0 = 0;
            this.f8235OoooO00 = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f8233Oooo.read(bArr, i, i2);
            this.f8234OoooO0 += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f8234OoooO0 += bArr.length;
            this.f8233Oooo.readFully(bArr);
        }
    }

    public static class OooO0OO extends FilterOutputStream {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final OutputStream f8237Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public ByteOrder f8238OoooO00;

        public OooO0OO(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f8237Oooo = outputStream;
            this.f8238OoooO00 = byteOrder;
        }

        public final void OooO00o(int i) throws IOException {
            this.f8237Oooo.write(i);
        }

        public final void OooO0O0(int i) throws IOException {
            ByteOrder byteOrder = this.f8238OoooO00;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f8237Oooo.write((i >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f8237Oooo.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f8237Oooo.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f8237Oooo.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f8237Oooo.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f8237Oooo.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f8237Oooo.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f8237Oooo.write((i >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }

        public final void OooO0Oo(short s) throws IOException {
            ByteOrder byteOrder = this.f8238OoooO00;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f8237Oooo.write((s >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f8237Oooo.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f8237Oooo.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f8237Oooo.write((s >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f8237Oooo.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f8237Oooo.write(bArr, i, i2);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8239OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f8240OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f8241OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f8242OooO0Oo;

        public OooO0o(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static OooO0o OooO00o(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.f8199Ooooo00);
            return new OooO0o(2, bytes.length, bytes);
        }

        public static OooO0o OooO0O0(long j, ByteOrder byteOrder) {
            return OooO0OO(new long[]{j}, byteOrder);
        }

        public static OooO0o OooO0OO(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f8192OoooO0O[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new OooO0o(4, jArr.length, byteBufferWrap.array());
        }

        public static OooO0o OooO0Oo(OooOO0[] oooOO0Arr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f8192OoooO0O[5] * oooOO0Arr.length]);
            byteBufferWrap.order(byteOrder);
            for (OooOO0 oooOO1 : oooOO0Arr) {
                byteBufferWrap.putInt((int) oooOO1.f8243OooO00o);
                byteBufferWrap.putInt((int) oooOO1.f8244OooO0O0);
            }
            return new OooO0o(5, oooOO0Arr.length, byteBufferWrap.array());
        }

        public static OooO0o OooO0o(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f8192OoooO0O[3] * iArr.length]);
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
                sb.append(oooOO0Arr[i].f8243OooO00o);
                sb.append('/');
                sb.append(oooOO0Arr[i].f8244OooO0O0);
                i++;
                if (i != oooOO0Arr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public final double OooO0oO(ByteOrder byteOrder) throws Throwable {
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
            return oooOO1.f8243OooO00o / oooOO1.f8244OooO0O0;
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

        /* JADX WARN: Code duplicated, block: B:178:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019b */
        public final Object OooOO0(ByteOrder byteOrder) throws Throwable {
            OooO0O0 oooO0O0;
            InputStream inputStream;
            byte b;
            byte[] bArr;
            InputStream inputStream2 = null;
            try {
                try {
                    oooO0O0 = new OooO0O0(this.f8242OooO0Oo);
                    try {
                        oooO0O0.f8235OoooO00 = byteOrder;
                        boolean z = true;
                        int length = 0;
                        switch (this.f8239OooO00o) {
                            case 1:
                            case 6:
                                byte[] bArr2 = this.f8242OooO0Oo;
                                if (bArr2.length != 1 || bArr2[0] < 0 || bArr2[0] > 1) {
                                    String str = new String(bArr2, ExifInterface.f8199Ooooo00);
                                    try {
                                        oooO0O0.close();
                                        break;
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (bArr2[0] + 48)});
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.f8240OooO0O0 >= ExifInterface.f8189OoooO.length) {
                                    int i = 0;
                                    while (true) {
                                        bArr = ExifInterface.f8189OoooO;
                                        if (i < bArr.length) {
                                            if (this.f8242OooO0Oo[i] != bArr[i]) {
                                                z = false;
                                            } else {
                                                i++;
                                            }
                                        }
                                    }
                                    if (z) {
                                        length = bArr.length;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.f8240OooO0O0 && (b = this.f8242OooO0Oo[length]) != 0) {
                                    if (b >= 32) {
                                        sb.append((char) b);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                String string = sb.toString();
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                }
                                return string;
                            case 3:
                                int[] iArr = new int[this.f8240OooO0O0];
                                while (length < this.f8240OooO0O0) {
                                    iArr[length] = oooO0O0.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f8240OooO0O0];
                                while (length < this.f8240OooO0O0) {
                                    jArr[length] = oooO0O0.OooO00o();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                }
                                return jArr;
                            case 5:
                                OooOO0[] oooOO0Arr = new OooOO0[this.f8240OooO0O0];
                                while (length < this.f8240OooO0O0) {
                                    oooOO0Arr[length] = new OooOO0(oooO0O0.OooO00o(), oooO0O0.OooO00o());
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                }
                                return oooOO0Arr;
                            case 8:
                                int[] iArr2 = new int[this.f8240OooO0O0];
                                while (length < this.f8240OooO0O0) {
                                    iArr2[length] = oooO0O0.readShort();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f8240OooO0O0];
                                while (length < this.f8240OooO0O0) {
                                    iArr3[length] = oooO0O0.readInt();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                }
                                return iArr3;
                            case 10:
                                OooOO0[] oooOO0Arr2 = new OooOO0[this.f8240OooO0O0];
                                while (length < this.f8240OooO0O0) {
                                    oooOO0Arr2[length] = new OooOO0(oooO0O0.readInt(), oooO0O0.readInt());
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                }
                                return oooOO0Arr2;
                            case 11:
                                double[] dArr = new double[this.f8240OooO0O0];
                                while (length < this.f8240OooO0O0) {
                                    dArr[length] = oooO0O0.readFloat();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f8240OooO0O0];
                                while (length < this.f8240OooO0O0) {
                                    dArr2[length] = oooO0O0.readDouble();
                                    length++;
                                }
                                try {
                                    oooO0O0.close();
                                    break;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return dArr2;
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
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("(");
            sbOooO0O0.append(ExifInterface.f8190OoooO0[this.f8239OooO00o]);
            sbOooO0O0.append(", data length:");
            return OooO0o.OooO0OO.OooO0O0(sbOooO0O0, this.f8242OooO0Oo.length, ")");
        }

        public OooO0o(int i, int i2, long j, byte[] bArr) {
            this.f8239OooO00o = i;
            this.f8240OooO0O0 = i2;
            this.f8241OooO0OO = j;
            this.f8242OooO0Oo = bArr;
        }
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f8243OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f8244OooO0O0;

        public OooOO0(long j, long j2) {
            if (j2 == 0) {
                this.f8243OooO00o = 0L;
                this.f8244OooO0O0 = 1L;
            } else {
                this.f8243OooO00o = j;
                this.f8244OooO0O0 = j2;
            }
        }

        public final String toString() {
            return this.f8243OooO00o + "/" + this.f8244OooO0O0;
        }
    }

    static {
        OooO[] oooOArr = {new OooO("NewSubfileType", 254, 4), new OooO("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new OooO("ImageWidth", 256, 3, 4), new OooO("ImageLength", 257, 3, 4), new OooO("BitsPerSample", 258, 3), new OooO("Compression", 259, 3), new OooO("PhotometricInterpretation", 262, 3), new OooO("ImageDescription", 270, 2), new OooO("Make", 271, 2), new OooO("Model", 272, 2), new OooO("StripOffsets", 273, 3, 4), new OooO("Orientation", 274, 3), new OooO("SamplesPerPixel", 277, 3), new OooO("RowsPerStrip", 278, 3, 4), new OooO("StripByteCounts", 279, 3, 4), new OooO("XResolution", 282, 5), new OooO("YResolution", 283, 5), new OooO("PlanarConfiguration", 284, 3), new OooO("ResolutionUnit", 296, 3), new OooO("TransferFunction", 301, 3), new OooO("Software", 305, 2), new OooO("DateTime", 306, 2), new OooO("Artist", 315, 2), new OooO("WhitePoint", 318, 5), new OooO("PrimaryChromaticities", 319, 5), new OooO("SubIFDPointer", 330, 4), new OooO("JPEGInterchangeFormat", NativeConstants.SSL_SIGN_RSA_PKCS1_SHA1, 4), new OooO("JPEGInterchangeFormatLength", 514, 4), new OooO("YCbCrCoefficients", 529, 5), new OooO("YCbCrSubSampling", 530, 3), new OooO("YCbCrPositioning", 531, 3), new OooO("ReferenceBlackWhite", 532, 5), new OooO("Copyright", 33432, 2), new OooO("ExifIFDPointer", 34665, 4), new OooO("GPSInfoIFDPointer", 34853, 4), new OooO("SensorTopBorder", 4, 4), new OooO("SensorLeftBorder", 5, 4), new OooO("SensorBottomBorder", 6, 4), new OooO("SensorRightBorder", 7, 4), new OooO("ISO", 23, 3), new OooO("JpgFromRaw", 46, 7), new OooO("Xmp", 700, 1)};
        OooO[] oooOArr2 = {new OooO("ExposureTime", 33434, 5), new OooO("FNumber", 33437, 5), new OooO("ExposureProgram", 34850, 3), new OooO("SpectralSensitivity", 34852, 2), new OooO("PhotographicSensitivity", 34855, 3), new OooO("OECF", 34856, 7), new OooO("SensitivityType", 34864, 3), new OooO("StandardOutputSensitivity", 34865, 4), new OooO("RecommendedExposureIndex", 34866, 4), new OooO("ISOSpeed", 34867, 4), new OooO("ISOSpeedLatitudeyyy", 34868, 4), new OooO("ISOSpeedLatitudezzz", 34869, 4), new OooO("ExifVersion", 36864, 2), new OooO("DateTimeOriginal", 36867, 2), new OooO("DateTimeDigitized", 36868, 2), new OooO("OffsetTime", 36880, 2), new OooO("OffsetTimeOriginal", 36881, 2), new OooO("OffsetTimeDigitized", 36882, 2), new OooO("ComponentsConfiguration", 37121, 7), new OooO("CompressedBitsPerPixel", 37122, 5), new OooO("ShutterSpeedValue", 37377, 10), new OooO("ApertureValue", 37378, 5), new OooO("BrightnessValue", 37379, 10), new OooO("ExposureBiasValue", 37380, 10), new OooO("MaxApertureValue", 37381, 5), new OooO("SubjectDistance", 37382, 5), new OooO("MeteringMode", 37383, 3), new OooO("LightSource", 37384, 3), new OooO("Flash", 37385, 3), new OooO("FocalLength", 37386, 5), new OooO("SubjectArea", 37396, 3), new OooO("MakerNote", 37500, 7), new OooO("UserComment", 37510, 7), new OooO("SubSecTime", 37520, 2), new OooO("SubSecTimeOriginal", 37521, 2), new OooO("SubSecTimeDigitized", 37522, 2), new OooO("FlashpixVersion", 40960, 7), new OooO("ColorSpace", 40961, 3), new OooO("PixelXDimension", 40962, 3, 4), new OooO("PixelYDimension", 40963, 3, 4), new OooO("RelatedSoundFile", 40964, 2), new OooO("InteroperabilityIFDPointer", 40965, 4), new OooO("FlashEnergy", 41483, 5), new OooO("SpatialFrequencyResponse", 41484, 7), new OooO("FocalPlaneXResolution", 41486, 5), new OooO("FocalPlaneYResolution", 41487, 5), new OooO("FocalPlaneResolutionUnit", 41488, 3), new OooO("SubjectLocation", 41492, 3), new OooO("ExposureIndex", 41493, 5), new OooO("SensingMethod", 41495, 3), new OooO("FileSource", 41728, 7), new OooO("SceneType", 41729, 7), new OooO("CFAPattern", 41730, 7), new OooO("CustomRendered", 41985, 3), new OooO("ExposureMode", 41986, 3), new OooO("WhiteBalance", 41987, 3), new OooO("DigitalZoomRatio", 41988, 5), new OooO("FocalLengthIn35mmFilm", 41989, 3), new OooO("SceneCaptureType", 41990, 3), new OooO("GainControl", 41991, 3), new OooO("Contrast", 41992, 3), new OooO("Saturation", 41993, 3), new OooO("Sharpness", 41994, 3), new OooO("DeviceSettingDescription", 41995, 7), new OooO("SubjectDistanceRange", 41996, 3), new OooO("ImageUniqueID", 42016, 2), new OooO("CameraOwnerName", 42032, 2), new OooO("BodySerialNumber", 42033, 2), new OooO("LensSpecification", 42034, 5), new OooO("LensMake", 42035, 2), new OooO("LensModel", 42036, 2), new OooO("Gamma", 42240, 5), new OooO("DNGVersion", 50706, 1), new OooO("DefaultCropSize", 50720, 3, 4)};
        OooO[] oooOArr3 = {new OooO("GPSVersionID", 0, 1), new OooO("GPSLatitudeRef", 1, 2), new OooO("GPSLatitude", 2, 5, 10), new OooO("GPSLongitudeRef", 3, 2), new OooO("GPSLongitude", 4, 5, 10), new OooO("GPSAltitudeRef", 5, 1), new OooO("GPSAltitude", 6, 5), new OooO("GPSTimeStamp", 7, 5), new OooO("GPSSatellites", 8, 2), new OooO("GPSStatus", 9, 2), new OooO("GPSMeasureMode", 10, 2), new OooO("GPSDOP", 11, 5), new OooO("GPSSpeedRef", 12, 2), new OooO("GPSSpeed", 13, 5), new OooO("GPSTrackRef", 14, 2), new OooO("GPSTrack", 15, 5), new OooO("GPSImgDirectionRef", 16, 2), new OooO("GPSImgDirection", 17, 5), new OooO("GPSMapDatum", 18, 2), new OooO("GPSDestLatitudeRef", 19, 2), new OooO("GPSDestLatitude", 20, 5), new OooO("GPSDestLongitudeRef", 21, 2), new OooO("GPSDestLongitude", 22, 5), new OooO("GPSDestBearingRef", 23, 2), new OooO("GPSDestBearing", 24, 5), new OooO("GPSDestDistanceRef", 25, 2), new OooO("GPSDestDistance", 26, 5), new OooO("GPSProcessingMethod", 27, 7), new OooO("GPSAreaInformation", 28, 7), new OooO("GPSDateStamp", 29, 2), new OooO("GPSDifferential", 30, 3), new OooO("GPSHPositioningError", 31, 5)};
        OooO[] oooOArr4 = {new OooO("InteroperabilityIndex", 1, 2)};
        OooO[] oooOArr5 = {new OooO("NewSubfileType", 254, 4), new OooO("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new OooO("ThumbnailImageWidth", 256, 3, 4), new OooO("ThumbnailImageLength", 257, 3, 4), new OooO("BitsPerSample", 258, 3), new OooO("Compression", 259, 3), new OooO("PhotometricInterpretation", 262, 3), new OooO("ImageDescription", 270, 2), new OooO("Make", 271, 2), new OooO("Model", 272, 2), new OooO("StripOffsets", 273, 3, 4), new OooO("ThumbnailOrientation", 274, 3), new OooO("SamplesPerPixel", 277, 3), new OooO("RowsPerStrip", 278, 3, 4), new OooO("StripByteCounts", 279, 3, 4), new OooO("XResolution", 282, 5), new OooO("YResolution", 283, 5), new OooO("PlanarConfiguration", 284, 3), new OooO("ResolutionUnit", 296, 3), new OooO("TransferFunction", 301, 3), new OooO("Software", 305, 2), new OooO("DateTime", 306, 2), new OooO("Artist", 315, 2), new OooO("WhitePoint", 318, 5), new OooO("PrimaryChromaticities", 319, 5), new OooO("SubIFDPointer", 330, 4), new OooO("JPEGInterchangeFormat", NativeConstants.SSL_SIGN_RSA_PKCS1_SHA1, 4), new OooO("JPEGInterchangeFormatLength", 514, 4), new OooO("YCbCrCoefficients", 529, 5), new OooO("YCbCrSubSampling", 530, 3), new OooO("YCbCrPositioning", 531, 3), new OooO("ReferenceBlackWhite", 532, 5), new OooO("Xmp", 700, 1), new OooO("Copyright", 33432, 2), new OooO("ExifIFDPointer", 34665, 4), new OooO("GPSInfoIFDPointer", 34853, 4), new OooO("DNGVersion", 50706, 1), new OooO("DefaultCropSize", 50720, 3, 4)};
        f8193OoooOO0 = new OooO("StripOffsets", 273, 3);
        f8205o000oOoO = new OooO[][]{oooOArr, oooOArr2, oooOArr3, oooOArr4, oooOArr5, oooOArr, new OooO[]{new OooO("ThumbnailImage", 256, 7), new OooO("CameraSettingsIFDPointer", 8224, 4), new OooO("ImageProcessingIFDPointer", 8256, 4)}, new OooO[]{new OooO("PreviewImageStart", 257, 4), new OooO("PreviewImageLength", 258, 4)}, new OooO[]{new OooO("AspectFrame", 4371, 3)}, new OooO[]{new OooO("ColorSpace", 55, 3)}};
        f8194OoooOOO = new OooO[]{new OooO("SubIFDPointer", 330, 4), new OooO("ExifIFDPointer", 34665, 4), new OooO("GPSInfoIFDPointer", 34853, 4), new OooO("InteroperabilityIFDPointer", 40965, 4), new OooO("CameraSettingsIFDPointer", 8224, 1), new OooO("ImageProcessingIFDPointer", 8256, 1)};
        f8195OoooOOo = new HashMap[10];
        f8196OoooOo0 = new HashMap[10];
        f8197OoooOoO = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f8198OoooOoo = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f8199Ooooo00 = charsetForName;
        f8200Ooooo0o = "Exif\u0000\u0000".getBytes(charsetForName);
        f8201OooooO0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            OooO[][] oooOArr6 = f8205o000oOoO;
            if (i >= oooOArr6.length) {
                HashMap<Integer, Integer> map = f8198OoooOoo;
                OooO[] oooOArr7 = f8194OoooOOO;
                map.put(Integer.valueOf(oooOArr7[0].f8225OooO00o), 5);
                map.put(Integer.valueOf(oooOArr7[1].f8225OooO00o), 1);
                map.put(Integer.valueOf(oooOArr7[2].f8225OooO00o), 2);
                map.put(Integer.valueOf(oooOArr7[3].f8225OooO00o), 3);
                map.put(Integer.valueOf(oooOArr7[4].f8225OooO00o), 7);
                map.put(Integer.valueOf(oooOArr7[5].f8225OooO00o), 8);
                Pattern.compile(".*[1-9].*");
                f8202OooooOO = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f8203OooooOo = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f8204Oooooo0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f8195OoooOOo[i] = new HashMap<>();
            f8196OoooOo0[i] = new HashMap<>();
            for (OooO oooO : oooOArr6[i]) {
                f8195OoooOOo[i].put(Integer.valueOf(oooO.f8225OooO00o), oooO);
                f8196OoooOo0[i].put(oooO.f8226OooO0O0, oooO);
            }
            i++;
        }
    }

    public ExifInterface(@NonNull String str) throws Throwable {
        OooO[][] oooOArr = f8205o000oOoO;
        this.f8212OooO0o0 = new HashMap[oooOArr.length];
        this.f8211OooO0o = new HashSet(oooOArr.length);
        this.f8213OooO0oO = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.f8209OooO0OO = null;
        this.f8207OooO00o = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (OooOOoo(fileInputStream2.getFD())) {
                    this.f8208OooO0O0 = fileInputStream2.getFD();
                } else {
                    this.f8208OooO0O0 = null;
                }
                OooOo0(fileInputStream2);
                androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Pair<Integer, Integer> OooOOo0(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairOooOOo0 = OooOOo0(strArrSplit[0]);
            if (((Integer) pairOooOOo0.first).intValue() == 2) {
                return pairOooOOo0;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairOooOOo1 = OooOOo0(strArrSplit[i]);
                int iIntValue = (((Integer) pairOooOOo1.first).equals(pairOooOOo0.first) || ((Integer) pairOooOOo1.second).equals(pairOooOOo0.first)) ? ((Integer) pairOooOOo0.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairOooOOo0.second).intValue() == -1 || !(((Integer) pairOooOOo1.first).equals(pairOooOOo0.second) || ((Integer) pairOooOOo1.second).equals(pairOooOOo0.second))) ? -1 : ((Integer) pairOooOOo0.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairOooOOo0 = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairOooOOo0 = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairOooOOo0;
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

    public static boolean OooOOoo(FileDescriptor fileDescriptor) {
        try {
            androidx.exifinterface.media.OooO00o.C0052OooO00o.OooO0OO(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f8168OooOo00) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:121:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x0147  */
    /* JADX WARN: Code duplicated, block: B:126:0x014d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0155 A[LOOP:2: B:124:0x0148->B:129:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x015b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x015e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0164  */
    /* JADX WARN: Code duplicated, block: B:140:0x016b A[LOOP:3: B:135:0x015f->B:140:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0174  */
    /* JADX WARN: Code duplicated, block: B:147:0x0181 A[LOOP:4: B:142:0x016f->B:147:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:152:0x018a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:157:0x0190  */
    /* JADX WARN: Code duplicated, block: B:163:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x017f A[EDGE_INSN: B:180:0x017f->B:146:0x017f BREAK  A[LOOP:3: B:135:0x015f->B:140:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x017f A[EDGE_INSN: B:181:0x017f->B:146:0x017f BREAK  A[LOOP:3: B:135:0x015f->B:140:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0110 A[RETURN] */
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
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr5 = f8172OooOoO0;
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
                long j = oooO0O1.readInt();
                byte[] bArr6 = new byte[4];
                oooO0O1.read(bArr6);
                if (Arrays.equals(bArr6, f8171OooOoO)) {
                    long j2 = 16;
                    if (j == 1) {
                        j = oooO0O1.readLong();
                        if (j < 16) {
                        }
                    } else {
                        j2 = 8;
                    }
                    long j3 = 5000;
                    if (j > j3) {
                        j = j3;
                    }
                    long j4 = j - j2;
                    if (j4 >= 8) {
                        byte[] bArr7 = new byte[4];
                        long j5 = 0;
                        boolean z8 = false;
                        boolean z9 = false;
                        while (true) {
                            if (j5 < j4 / 4 && oooO0O1.read(bArr7) == 4) {
                                if (j5 != 1) {
                                    if (Arrays.equals(bArr7, f8173OooOoOO)) {
                                        z8 = true;
                                    } else if (Arrays.equals(bArr7, f8175OooOoo0)) {
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
                                    ByteOrder byteOrderOooOo = OooOo(oooO0O3);
                                    this.f8213OooO0oO = byteOrderOooOo;
                                    oooO0O3.f8235OoooO00 = byteOrderOooOo;
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
                                    ByteOrder byteOrderOooOo2 = OooOo(oooO0O6);
                                    this.f8213OooO0oO = byteOrderOooOo2;
                                    oooO0O6.f8235OoooO00 = byteOrderOooOo2;
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
                                bArr = f8177OooOooo;
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
                                bArr2 = f8179Oooo0;
                                if (i2 >= bArr2.length) {
                                    i3 = 0;
                                    while (true) {
                                        bArr3 = f8183Oooo0O0;
                                        if (i3 >= bArr3.length) {
                                            z7 = true;
                                        } else {
                                            if (bArr4[f8179Oooo0.length + i3 + 4] != bArr3[i3]) {
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
                    if (f8168OooOo00) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (oooO0O1 != null) {
                    }
                    z3 = false;
                    if (z3) {
                        return 12;
                    }
                    oooO0O3 = new OooO0O0(bArr4);
                    ByteOrder byteOrderOooOo3 = OooOo(oooO0O3);
                    this.f8213OooO0oO = byteOrderOooOo3;
                    oooO0O3.f8235OoooO00 = byteOrderOooOo3;
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
                    ByteOrder byteOrderOooOo4 = OooOo(oooO0O6);
                    this.f8213OooO0oO = byteOrderOooOo4;
                    oooO0O6.f8235OoooO00 = byteOrderOooOo4;
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
                        bArr = f8177OooOooo;
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
                        bArr2 = f8179Oooo0;
                        if (i2 >= bArr2.length) {
                            i3 = 0;
                            while (true) {
                                bArr3 = f8183Oooo0O0;
                                if (i3 >= bArr3.length) {
                                    z7 = true;
                                } else {
                                    if (bArr4[f8179Oooo0.length + i3 + 4] != bArr3[i3]) {
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
        ByteOrder byteOrderOooOo5 = OooOo(oooO0O3);
        this.f8213OooO0oO = byteOrderOooOo5;
        oooO0O3.f8235OoooO00 = byteOrderOooOo5;
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
        ByteOrder byteOrderOooOo6 = OooOo(oooO0O6);
        this.f8213OooO0oO = byteOrderOooOo6;
        oooO0O6.f8235OoooO00 = byteOrderOooOo6;
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
            bArr = f8177OooOooo;
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
            bArr2 = f8179Oooo0;
            if (i2 >= bArr2.length) {
                i3 = 0;
                while (true) {
                    bArr3 = f8183Oooo0O0;
                    if (i3 >= bArr3.length) {
                        z7 = true;
                    } else {
                        if (bArr4[f8179Oooo0.length + i3 + 4] != bArr3[i3]) {
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
        if (strOooO0Oo != null && OooO0Oo("DateTime") == null) {
            this.f8212OooO0o0[0].put("DateTime", OooO0o.OooO00o(strOooO0Oo));
        }
        if (OooO0Oo("ImageWidth") == null) {
            this.f8212OooO0o0[0].put("ImageWidth", OooO0o.OooO0O0(0L, this.f8213OooO0oO));
        }
        if (OooO0Oo("ImageLength") == null) {
            this.f8212OooO0o0[0].put("ImageLength", OooO0o.OooO0O0(0L, this.f8213OooO0oO));
        }
        if (OooO0Oo("Orientation") == null) {
            this.f8212OooO0o0[0].put("Orientation", OooO0o.OooO0O0(0L, this.f8213OooO0oO));
        }
        if (OooO0Oo("LightSource") == null) {
            this.f8212OooO0o0[1].put("LightSource", OooO0o.OooO0O0(0L, this.f8213OooO0oO));
        }
    }

    public final void OooO0O0(OooO0O0 oooO0O0, OooO0OO oooO0OO, byte[] bArr, byte[] bArr2) throws IOException {
        String string;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (oooO0O0.read(bArr3) != 4) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f8199Ooooo00;
                sbOooO0O0.append(new String(bArr, charset));
                if (bArr2 == null) {
                    string = "";
                } else {
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0(" or ");
                    sbOooO0O1.append(new String(bArr2, charset));
                    string = sbOooO0O1.toString();
                }
                sbOooO0O0.append(string);
                throw new IOException(sbOooO0O0.toString());
            }
            OooO0OO(oooO0O0, oooO0OO, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public final void OooO0OO(OooO0O0 oooO0O0, OooO0OO oooO0OO, byte[] bArr) throws IOException {
        int i = oooO0O0.readInt();
        oooO0OO.write(bArr);
        oooO0OO.OooO0O0(i);
        if (i % 2 == 1) {
            i++;
        }
        androidx.exifinterface.media.OooO00o.OooO0o(oooO0O0, oooO0OO, i);
    }

    @Nullable
    public final String OooO0Oo(@NonNull String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        OooO0o OooO0o2 = OooO0o(str);
        if (OooO0o2 != null) {
            if (!f8197OoooOoO.contains(str)) {
                return OooO0o2.OooO(this.f8213OooO0oO);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = OooO0o2.f8239OooO00o;
                if (i != 5 && i != 10) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("GPS Timestamp format is not rational. format=");
                    sbOooO0O0.append(OooO0o2.f8239OooO00o);
                    Log.w("ExifInterface", sbOooO0O0.toString());
                    return null;
                }
                OooOO0[] oooOO0Arr = (OooOO0[]) OooO0o2.OooOO0(this.f8213OooO0oO);
                if (oooOO0Arr != null && oooOO0Arr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (oooOO0Arr[0].f8243OooO00o / oooOO0Arr[0].f8244OooO0O0)), Integer.valueOf((int) (oooOO0Arr[1].f8243OooO00o / oooOO0Arr[1].f8244OooO0O0)), Integer.valueOf((int) (oooOO0Arr[2].f8243OooO00o / oooOO0Arr[2].f8244OooO0O0)));
                }
                StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Invalid GPS Timestamp array. array=");
                sbOooO0O1.append(Arrays.toString(oooOO0Arr));
                Log.w("ExifInterface", sbOooO0O1.toString());
                return null;
            }
            try {
                return Double.toString(OooO0o2.OooO0oO(this.f8213OooO0oO));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    public final OooO0o OooO0o(@NonNull String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f8168OooOo00) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f8205o000oOoO.length; i++) {
            OooO0o oooO0o = this.f8212OooO0o0[i].get(str);
            if (oooO0o != null) {
                return oooO0o;
            }
        }
        return null;
    }

    public final int OooO0o0() {
        OooO0o OooO0o2 = OooO0o("Orientation");
        if (OooO0o2 == null) {
            return 1;
        }
        try {
            return OooO0o2.OooO0oo(this.f8213OooO0oO);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final void OooO0oO(OooOO0O oooOO0O) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                androidx.exifinterface.media.OooO00o.OooO0O0.OooO00o(mediaMetadataRetriever, new OooO00o(oooOO0O));
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(17);
                String strExtractMetadata7 = null;
                if ("yes".equals(strExtractMetadata5)) {
                    strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                }
                if (strExtractMetadata7 != null) {
                    this.f8212OooO0o0[0].put("ImageWidth", OooO0o.OooO0o0(Integer.parseInt(strExtractMetadata7), this.f8213OooO0oO));
                }
                if (strExtractMetadata != null) {
                    this.f8212OooO0o0[0].put("ImageLength", OooO0o.OooO0o0(Integer.parseInt(strExtractMetadata), this.f8213OooO0oO));
                }
                if (strExtractMetadata2 != null) {
                    int i = 1;
                    int i2 = Integer.parseInt(strExtractMetadata2);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 == 180) {
                        i = 3;
                    } else if (i2 == 270) {
                        i = 8;
                    }
                    this.f8212OooO0o0[0].put("Orientation", OooO0o.OooO0o0(i, this.f8213OooO0oO));
                }
                if (strExtractMetadata3 != null && strExtractMetadata4 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata3);
                    int i4 = Integer.parseInt(strExtractMetadata4);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    oooOO0O.OooO0Oo(i3);
                    byte[] bArr = new byte[6];
                    if (oooOO0O.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f8200Ooooo0o)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (oooOO0O.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f8220OooOOOO = i5;
                    OooOoO0(bArr2, 0);
                }
                if (f8168OooOo00) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata7 + "x" + strExtractMetadata + ", rotation " + strExtractMetadata2);
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

    /* JADX WARN: Code duplicated, block: B:34:0x00ae A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
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
    public final void OooO0oo(androidx.exifinterface.media.ExifInterface.OooO0O0 r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.OooO0oo(androidx.exifinterface.media.ExifInterface$OooO0O0, int, int):void");
    }

    public final void OooOO0(OooOO0O oooOO0O) throws Throwable {
        OooOOO0(oooOO0O);
        OooO0o oooO0o = this.f8212OooO0o0[1].get("MakerNote");
        if (oooO0o != null) {
            OooOO0O oooOO0O2 = new OooOO0O(oooO0o.f8242OooO0Oo);
            oooOO0O2.f8235OoooO00 = this.f8213OooO0oO;
            byte[] bArr = f8174OooOoo;
            byte[] bArr2 = new byte[bArr.length];
            oooOO0O2.readFully(bArr2);
            oooOO0O2.OooO0Oo(0L);
            byte[] bArr3 = f8176OooOooO;
            byte[] bArr4 = new byte[bArr3.length];
            oooOO0O2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                oooOO0O2.OooO0Oo(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                oooOO0O2.OooO0Oo(12L);
            }
            OooOoO(oooOO0O2, 6);
            OooO0o oooO0o2 = this.f8212OooO0o0[7].get("PreviewImageStart");
            OooO0o oooO0o3 = this.f8212OooO0o0[7].get("PreviewImageLength");
            if (oooO0o2 != null && oooO0o3 != null) {
                this.f8212OooO0o0[5].put("JPEGInterchangeFormat", oooO0o2);
                this.f8212OooO0o0[5].put("JPEGInterchangeFormatLength", oooO0o3);
            }
            OooO0o oooO0o4 = this.f8212OooO0o0[8].get("AspectFrame");
            if (oooO0o4 != null) {
                int[] iArr = (int[]) oooO0o4.OooOO0(this.f8213OooO0oO);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Invalid aspect frame values. frame=");
                    sbOooO0O0.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sbOooO0O0.toString());
                } else {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    OooO0o oooO0oOooO0o0 = OooO0o.OooO0o0(i, this.f8213OooO0oO);
                    OooO0o oooO0oOooO0o1 = OooO0o.OooO0o0(i2, this.f8213OooO0oO);
                    this.f8212OooO0o0[0].put("ImageWidth", oooO0oOooO0o0);
                    this.f8212OooO0o0[0].put("ImageLength", oooO0oOooO0o1);
                }
            }
        }
    }

    public final void OooOO0O(OooO0O0 oooO0O0) throws Throwable {
        if (f8168OooOo00) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + oooO0O0);
        }
        oooO0O0.f8235OoooO00 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f8177OooOooo;
        oooO0O0.OooO0O0(bArr.length);
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
                if (i3 == 16 && !Arrays.equals(bArr2, f8181Oooo00O)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f8182Oooo00o)) {
                    return;
                }
                if (Arrays.equals(bArr2, f8180Oooo000)) {
                    byte[] bArr3 = new byte[i];
                    if (oooO0O0.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.OooO00o.OooO00o(bArr2));
                    }
                    int i4 = oooO0O0.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i4) {
                        this.f8220OooOOOO = i3;
                        OooOoO0(bArr3, 0);
                        Oooo0OO();
                        Oooo00o(new OooO0O0(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i4 + ", calculated CRC value: " + crc32.getValue());
                }
                int i5 = i + 4;
                oooO0O0.OooO0O0(i5);
                length = i3 + i5;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void OooOO0o(OooO0O0 oooO0O0) throws Throwable {
        boolean z = f8168OooOo00;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + oooO0O0);
        }
        oooO0O0.OooO0O0(84);
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
        oooO0O0.OooO0O0(i - oooO0O0.f8234OoooO0);
        oooO0O0.read(bArr4);
        OooO0oo(new OooO0O0(bArr4), i, 5);
        oooO0O0.OooO0O0(i3 - oooO0O0.f8234OoooO0);
        oooO0O0.f8235OoooO00 = ByteOrder.BIG_ENDIAN;
        int i4 = oooO0O0.readInt();
        if (z) {
            p078o000Oo00.OooO.OooO00o("numberOfDirectoryEntry: ", i4, "ExifInterface");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = oooO0O0.readUnsignedShort();
            int unsignedShort2 = oooO0O0.readUnsignedShort();
            if (unsignedShort == f8193OoooOO0.f8225OooO00o) {
                short s = oooO0O0.readShort();
                short s2 = oooO0O0.readShort();
                OooO0o oooO0oOooO0o0 = OooO0o.OooO0o0(s, this.f8213OooO0oO);
                OooO0o oooO0oOooO0o1 = OooO0o.OooO0o0(s2, this.f8213OooO0oO);
                this.f8212OooO0o0[0].put("ImageLength", oooO0oOooO0o0);
                this.f8212OooO0o0[0].put("ImageWidth", oooO0oOooO0o1);
                if (f8168OooOo00) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            oooO0O0.OooO0O0(unsignedShort2);
        }
    }

    public final void OooOOO(OooOO0O oooOO0O) throws Throwable {
        if (f8168OooOo00) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + oooOO0O);
        }
        OooOOO0(oooOO0O);
        OooO0o oooO0o = this.f8212OooO0o0[0].get("JpgFromRaw");
        if (oooO0o != null) {
            OooO0oo(new OooO0O0(oooO0o.f8242OooO0Oo), (int) oooO0o.f8241OooO0OO, 5);
        }
        OooO0o oooO0o2 = this.f8212OooO0o0[0].get("ISO");
        OooO0o oooO0o3 = this.f8212OooO0o0[1].get("PhotographicSensitivity");
        if (oooO0o2 == null || oooO0o3 != null) {
            return;
        }
        this.f8212OooO0o0[1].put("PhotographicSensitivity", oooO0o2);
    }

    public final void OooOOO0(OooOO0O oooOO0O) throws Throwable {
        OooO0o oooO0o;
        OooOo0O(oooOO0O);
        OooOoO(oooOO0O, 0);
        Oooo0O0(oooOO0O, 0);
        Oooo0O0(oooOO0O, 5);
        Oooo0O0(oooOO0O, 4);
        Oooo0OO();
        if (this.f8210OooO0Oo != 8 || (oooO0o = this.f8212OooO0o0[1].get("MakerNote")) == null) {
            return;
        }
        OooOO0O oooOO0O2 = new OooOO0O(oooO0o.f8242OooO0Oo);
        oooOO0O2.f8235OoooO00 = this.f8213OooO0oO;
        oooOO0O2.OooO0O0(6);
        OooOoO(oooOO0O2, 9);
        OooO0o oooO0o2 = this.f8212OooO0o0[9].get("ColorSpace");
        if (oooO0o2 != null) {
            this.f8212OooO0o0[1].put("ColorSpace", oooO0o2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Nullable
    public final byte[] OooOOOO() throws Throwable {
        FileDescriptor fileDescriptor;
        Exception e;
        FileDescriptor fileDescriptor2;
        ?? fileInputStream;
        ?? r2 = 0;
        r2 = 0;
        if (!this.f8214OooO0oo) {
            return null;
        }
        ?? fileInputStream2 = this.f8219OooOOO0;
        try {
            if (fileInputStream2 != 0) {
                return fileInputStream2;
            }
            try {
                fileInputStream2 = this.f8209OooO0OO;
                if (fileInputStream2 != 0) {
                    try {
                        if (!fileInputStream2.markSupported()) {
                            Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                            androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream2);
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
                        androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream2);
                        if (fileDescriptor2 != null) {
                            androidx.exifinterface.media.OooO00o.OooO0O0(fileDescriptor2);
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileDescriptor = null;
                        r2 = fileInputStream2;
                        androidx.exifinterface.media.OooO00o.OooO0OO(r2);
                        if (fileDescriptor != null) {
                            androidx.exifinterface.media.OooO00o.OooO0O0(fileDescriptor);
                        }
                        throw th;
                    }
                } else if (this.f8207OooO00o != null) {
                    fileInputStream = new FileInputStream(this.f8207OooO00o);
                    fileDescriptor2 = null;
                    fileInputStream2 = fileInputStream;
                } else {
                    FileDescriptor fileDescriptorOooO0O0 = androidx.exifinterface.media.OooO00o.C0052OooO00o.OooO0O0(this.f8208OooO0O0);
                    try {
                        androidx.exifinterface.media.OooO00o.C0052OooO00o.OooO0OO(fileDescriptorOooO0O0, 0L, OsConstants.SEEK_SET);
                        fileDescriptor2 = fileDescriptorOooO0O0;
                        fileInputStream2 = new FileInputStream(fileDescriptorOooO0O0);
                    } catch (Exception e3) {
                        e = e3;
                        fileDescriptor2 = fileDescriptorOooO0O0;
                        fileInputStream2 = 0;
                        Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                        androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream2);
                        if (fileDescriptor2 != null) {
                            androidx.exifinterface.media.OooO00o.OooO0O0(fileDescriptor2);
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileDescriptor = fileDescriptorOooO0O0;
                        androidx.exifinterface.media.OooO00o.OooO0OO(r2);
                        if (fileDescriptor != null) {
                            androidx.exifinterface.media.OooO00o.OooO0O0(fileDescriptor);
                        }
                        throw th;
                    }
                }
                try {
                    if (fileInputStream2.skip(this.f8216OooOO0O + this.f8220OooOOOO) != this.f8216OooOO0O + this.f8220OooOOOO) {
                        throw new IOException("Corrupted image");
                    }
                    byte[] bArr = new byte[this.f8217OooOO0o];
                    if (fileInputStream2.read(bArr) != this.f8217OooOO0o) {
                        throw new IOException("Corrupted image");
                    }
                    this.f8219OooOOO0 = bArr;
                    androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileDescriptor2);
                    }
                    return bArr;
                } catch (Exception e4) {
                    e = e4;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                    androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        androidx.exifinterface.media.OooO00o.OooO0O0(fileDescriptor2);
                    }
                    return null;
                }
            } catch (Exception e5) {
                fileInputStream2 = 0;
                e = e5;
                fileDescriptor2 = null;
            } catch (Throwable th3) {
                th = th3;
                fileDescriptor = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void OooOOOo(OooO0O0 oooO0O0) throws Throwable {
        if (f8168OooOo00) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + oooO0O0);
        }
        oooO0O0.f8235OoooO00 = ByteOrder.LITTLE_ENDIAN;
        oooO0O0.OooO0O0(f8179Oooo0.length);
        int i = oooO0O0.readInt() + 8;
        byte[] bArr = f8183Oooo0O0;
        oooO0O0.OooO0O0(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (oooO0O0.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = oooO0O0.readInt();
                int i3 = length + 4 + 4;
                if (Arrays.equals(f8184Oooo0OO, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (oooO0O0.read(bArr3) == i2) {
                        this.f8220OooOOOO = i3;
                        OooOoO0(bArr3, 0);
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
                oooO0O0.OooO0O0(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void OooOOo(OooO0O0 oooO0O0, HashMap map) throws Throwable {
        OooO0o oooO0o = (OooO0o) map.get("JPEGInterchangeFormat");
        OooO0o oooO0o2 = (OooO0o) map.get("JPEGInterchangeFormatLength");
        if (oooO0o == null || oooO0o2 == null) {
            return;
        }
        int iOooO0oo = oooO0o.OooO0oo(this.f8213OooO0oO);
        int iOooO0oo2 = oooO0o2.OooO0oo(this.f8213OooO0oO);
        if (this.f8210OooO0Oo == 7) {
            iOooO0oo += this.f8221OooOOOo;
        }
        if (iOooO0oo > 0 && iOooO0oo2 > 0) {
            this.f8214OooO0oo = true;
            if (this.f8207OooO00o == null && this.f8209OooO0OO == null && this.f8208OooO0O0 == null) {
                byte[] bArr = new byte[iOooO0oo2];
                oooO0O0.skip(iOooO0oo);
                oooO0O0.read(bArr);
                this.f8219OooOOO0 = bArr;
            }
            this.f8216OooOO0O = iOooO0oo;
            this.f8217OooOO0o = iOooO0oo2;
        }
        if (f8168OooOo00) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iOooO0oo + ", length: " + iOooO0oo2);
        }
    }

    public final ByteOrder OooOo(OooO0O0 oooO0O0) throws IOException {
        short s = oooO0O0.readShort();
        if (s == 18761) {
            if (f8168OooOo00) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (f8168OooOo00) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Invalid byte order: ");
        sbOooO0O0.append(Integer.toHexString(s));
        throw new IOException(sbOooO0O0.toString());
    }

    public final void OooOo0(@NonNull InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i = 0; i < f8205o000oOoO.length; i++) {
            try {
                try {
                    this.f8212OooO0o0[i] = new HashMap<>();
                } catch (Throwable th) {
                    OooO00o();
                    if (f8168OooOo00) {
                        OooOo0o();
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException e) {
                boolean z = f8168OooOo00;
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
        this.f8210OooO0Oo = iOooO;
        if ((iOooO == 4 || iOooO == 9 || iOooO == 13 || iOooO == 14) ? false : true) {
            OooOO0O oooOO0O = new OooOO0O(bufferedInputStream);
            int i2 = this.f8210OooO0Oo;
            if (i2 == 12) {
                OooO0oO(oooOO0O);
            } else if (i2 == 7) {
                OooOO0(oooOO0O);
            } else if (i2 == 10) {
                OooOOO(oooOO0O);
            } else {
                OooOOO0(oooOO0O);
            }
            oooOO0O.OooO0Oo(this.f8220OooOOOO);
            Oooo00o(oooOO0O);
        } else {
            OooO0O0 oooO0O0 = new OooO0O0(bufferedInputStream);
            int i3 = this.f8210OooO0Oo;
            if (i3 == 4) {
                OooO0oo(oooO0O0, 0, 0);
            } else if (i3 == 13) {
                OooOO0O(oooO0O0);
            } else if (i3 == 9) {
                OooOO0o(oooO0O0);
            } else if (i3 == 14) {
                OooOOOo(oooO0O0);
            }
        }
        OooO00o();
        if (!f8168OooOo00) {
            return;
        }
        OooOo0o();
    }

    public final boolean OooOo00(HashMap map) throws IOException {
        OooO0o oooO0o = (OooO0o) map.get("ImageLength");
        OooO0o oooO0o2 = (OooO0o) map.get("ImageWidth");
        if (oooO0o == null || oooO0o2 == null) {
            return false;
        }
        return oooO0o.OooO0oo(this.f8213OooO0oO) <= 512 && oooO0o2.OooO0oo(this.f8213OooO0oO) <= 512;
    }

    public final void OooOo0O(OooO0O0 oooO0O0) throws IOException {
        ByteOrder byteOrderOooOo = OooOo(oooO0O0);
        this.f8213OooO0oO = byteOrderOooOo;
        oooO0O0.f8235OoooO00 = byteOrderOooOo;
        int unsignedShort = oooO0O0.readUnsignedShort();
        int i = this.f8210OooO0Oo;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Invalid start code: ");
            sbOooO0O0.append(Integer.toHexString(unsignedShort));
            throw new IOException(sbOooO0O0.toString());
        }
        int i2 = oooO0O0.readInt();
        if (i2 < 8) {
            throw new IOException(android.support.v4.media.OooO00o.OooO00o("Invalid first Ifd offset: ", i2));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            oooO0O0.OooO0O0(i3);
        }
    }

    public final void OooOo0o() {
        for (int i = 0; i < this.f8212OooO0o0.length; i++) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("The size of tag group[", i, "]: ");
            sbOooO00o.append(this.f8212OooO0o0[i].size());
            Log.d("ExifInterface", sbOooO00o.toString());
            for (Map.Entry<String, OooO0o> entry : this.f8212OooO0o0[i].entrySet()) {
                OooO0o value = entry.getValue();
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("tagName: ");
                sbOooO0O0.append(entry.getKey());
                sbOooO0O0.append(", tagType: ");
                sbOooO0O0.append(value.toString());
                sbOooO0O0.append(", tagValue: '");
                sbOooO0O0.append(value.OooO(this.f8213OooO0oO));
                sbOooO0O0.append("'");
                Log.d("ExifInterface", sbOooO0O0.toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x0216  */
    /* JADX WARN: Code duplicated, block: B:121:0x0223  */
    /* JADX WARN: Code duplicated, block: B:122:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0230  */
    /* JADX WARN: Code duplicated, block: B:124:0x0252 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0254  */
    /* JADX WARN: Code duplicated, block: B:127:0x026f  */
    /* JADX WARN: Code duplicated, block: B:129:0x029c  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x02df  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    /* JADX WARN: Code duplicated, block: B:81:0x0136  */
    /* JADX WARN: Code duplicated, block: B:84:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    /* JADX WARN: Code duplicated, block: B:92:0x0196  */
    /* JADX WARN: Code duplicated, block: B:94:0x019d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01af  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cd  */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0230, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x0254, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01af, please report this as an issue */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final void OooOoO(OooOO0O oooOO0O, int i) throws IOException {
        short s;
        short s2;
        boolean z;
        long j;
        boolean z2;
        int i2;
        int i3;
        Integer num;
        long jOooO00o;
        int unsignedShort;
        int i4;
        this.f8211OooO0o.add(Integer.valueOf(oooOO0O.f8234OoooO0));
        short s3 = oooOO0O.readShort();
        if (f8168OooOo00) {
            p078o000Oo00.OooO.OooO00o("numberOfDirectoryEntry: ", s3, "ExifInterface");
        }
        if (s3 <= 0) {
            return;
        }
        char c = 0;
        short s4 = 0;
        while (s4 < s3) {
            int unsignedShort2 = oooOO0O.readUnsignedShort();
            int unsignedShort3 = oooOO0O.readUnsignedShort();
            int i5 = oooOO0O.readInt();
            long j2 = ((long) oooOO0O.f8234OoooO0) + 4;
            OooO oooO = f8195OoooOOo[i].get(Integer.valueOf(unsignedShort2));
            boolean z3 = f8168OooOo00;
            if (z3) {
                Object[] objArr = new Object[5];
                objArr[c] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = oooO != null ? oooO.f8226OooO0O0 : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i5);
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (oooO == null) {
                if (z3) {
                    p078o000Oo00.OooO.OooO00o("Skip the tag entry since tag number is not defined: ", unsignedShort2, "ExifInterface");
                }
                s = s3;
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = f8192OoooO0O;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = oooO.f8227OooO0OO;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = oooO.f8228OooO0Oo) == unsignedShort3) {
                            s = s3;
                        } else {
                            s = s3;
                            if (((i6 != 4 && i2 != 4) || unsignedShort3 != 3) && (((i6 != 9 && i2 != 9) || unsignedShort3 != 8) && ((i6 != 12 && i2 != 12) || unsignedShort3 != 11))) {
                                z = false;
                            }
                            if (!z) {
                                if (unsignedShort3 == 7) {
                                    unsignedShort3 = i6;
                                }
                                s2 = s4;
                                j = ((long) iArr[unsignedShort3]) * ((long) i5);
                                if (j >= 0 || j > 2147483647L) {
                                    if (z3) {
                                        p078o000Oo00.OooO.OooO00o("Skip the tag entry since the number of components is invalid: ", i5, "ExifInterface");
                                    }
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                            } else if (z3) {
                                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Skip the tag entry since data format (");
                                sbOooO0O0.append(f8190OoooO0[unsignedShort3]);
                                sbOooO0O0.append(") is unexpected for tag: ");
                                sbOooO0O0.append(oooO.f8226OooO0O0);
                                Log.d("ExifInterface", sbOooO0O0.toString());
                            }
                        }
                        z = true;
                        if (!z) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            s2 = s4;
                            j = ((long) iArr[unsignedShort3]) * ((long) i5);
                            if (j >= 0) {
                            }
                            if (z3) {
                                p078o000Oo00.OooO.OooO00o("Skip the tag entry since the number of components is invalid: ", i5, "ExifInterface");
                            }
                            z2 = false;
                        } else if (z3) {
                            StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Skip the tag entry since data format (");
                            sbOooO0O1.append(f8190OoooO0[unsignedShort3]);
                            sbOooO0O1.append(") is unexpected for tag: ");
                            sbOooO0O1.append(oooO.f8226OooO0O0);
                            Log.d("ExifInterface", sbOooO0O1.toString());
                        }
                    }
                    if (z2) {
                        if (j > 4) {
                            i4 = oooOO0O.readInt();
                            if (z3) {
                                p078o000Oo00.OooO.OooO00o("seek to data offset: ", i4, "ExifInterface");
                            }
                            if (this.f8210OooO0Oo != 7) {
                                i3 = i5;
                            } else {
                                if ("MakerNote".equals(oooO.f8226OooO0O0)) {
                                    this.f8221OooOOOo = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(oooO.f8226OooO0O0)) {
                                    this.f8223OooOOo0 = i4;
                                    this.f8222OooOOo = i5;
                                    OooO0o oooO0oOooO0o0 = OooO0o.OooO0o0(6, this.f8213OooO0oO);
                                    OooO0o oooO0oOooO0O0 = OooO0o.OooO0O0(this.f8223OooOOo0, this.f8213OooO0oO);
                                    i3 = i5;
                                    OooO0o oooO0oOooO0O1 = OooO0o.OooO0O0(this.f8222OooOOo, this.f8213OooO0oO);
                                    this.f8212OooO0o0[4].put("Compression", oooO0oOooO0o0);
                                    this.f8212OooO0o0[4].put("JPEGInterchangeFormat", oooO0oOooO0O0);
                                    this.f8212OooO0o0[4].put("JPEGInterchangeFormatLength", oooO0oOooO0O1);
                                }
                                i3 = i5;
                            }
                            oooOO0O.OooO0Oo(i4);
                        } else {
                            i3 = i5;
                        }
                        num = f8198OoooOoo.get(Integer.valueOf(unsignedShort2));
                        if (z3) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                        }
                        if (num != null) {
                            jOooO00o = -1;
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    jOooO00o = oooOO0O.OooO00o();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = oooOO0O.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = oooOO0O.readInt();
                                }
                                if (z3) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jOooO00o), oooO.f8226OooO0O0));
                                }
                                if (jOooO00o > 0) {
                                    if (!this.f8211OooO0o.contains(Integer.valueOf((int) jOooO00o))) {
                                        oooOO0O.OooO0Oo(jOooO00o);
                                        OooOoO(oooOO0O, num.intValue());
                                    } else if (z3) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jOooO00o + ")");
                                    }
                                } else if (z3) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jOooO00o);
                                }
                                oooOO0O.OooO0Oo(j2);
                            } else {
                                unsignedShort = oooOO0O.readUnsignedShort();
                            }
                            jOooO00o = unsignedShort;
                            if (z3) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jOooO00o), oooO.f8226OooO0O0));
                            }
                            if (jOooO00o > 0) {
                                if (!this.f8211OooO0o.contains(Integer.valueOf((int) jOooO00o))) {
                                    oooOO0O.OooO0Oo(jOooO00o);
                                    OooOoO(oooOO0O, num.intValue());
                                } else if (z3) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jOooO00o + ")");
                                }
                            } else if (z3) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jOooO00o);
                            }
                            oooOO0O.OooO0Oo(j2);
                        } else {
                            int i7 = oooOO0O.f8234OoooO0 + this.f8220OooOOOO;
                            byte[] bArr = new byte[(int) j];
                            oooOO0O.readFully(bArr);
                            OooO0o oooO0o = new OooO0o(unsignedShort3, i3, i7, bArr);
                            this.f8212OooO0o0[i].put(oooO.f8226OooO0O0, oooO0o);
                            if ("DNGVersion".equals(oooO.f8226OooO0O0)) {
                                this.f8210OooO0Oo = 3;
                            }
                            if (((!"Make".equals(oooO.f8226OooO0O0) || "Model".equals(oooO.f8226OooO0O0)) && oooO0o.OooO(this.f8213OooO0oO).contains("PENTAX")) || ("Compression".equals(oooO.f8226OooO0O0) && oooO0o.OooO0oo(this.f8213OooO0oO) == 65535)) {
                                this.f8210OooO0Oo = 8;
                            }
                            if (oooOO0O.f8234OoooO0 != j2) {
                                oooOO0O.OooO0Oo(j2);
                            }
                        }
                    } else {
                        oooOO0O.OooO0Oo(j2);
                    }
                    s4 = (short) (s2 + 1);
                    c = 0;
                    s3 = s;
                }
                s = s3;
                s2 = s4;
                if (z3) {
                    p078o000Oo00.OooO.OooO00o("Skip the tag entry since data format is invalid: ", unsignedShort3, "ExifInterface");
                }
                j = 0;
                z2 = false;
                if (z2) {
                    oooOO0O.OooO0Oo(j2);
                } else {
                    if (j > 4) {
                        i4 = oooOO0O.readInt();
                        if (z3) {
                            p078o000Oo00.OooO.OooO00o("seek to data offset: ", i4, "ExifInterface");
                        }
                        if (this.f8210OooO0Oo != 7) {
                            i3 = i5;
                        } else {
                            if ("MakerNote".equals(oooO.f8226OooO0O0)) {
                                this.f8221OooOOOo = i4;
                            } else if (i != 6) {
                            }
                            i3 = i5;
                        }
                        oooOO0O.OooO0Oo(i4);
                    } else {
                        i3 = i5;
                    }
                    num = f8198OoooOoo.get(Integer.valueOf(unsignedShort2));
                    if (z3) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                    }
                    if (num != null) {
                        jOooO00o = -1;
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                jOooO00o = oooOO0O.OooO00o();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = oooOO0O.readInt();
                            } else {
                                unsignedShort = oooOO0O.readShort();
                            }
                            if (z3) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jOooO00o), oooO.f8226OooO0O0));
                            }
                            if (jOooO00o > 0) {
                                if (!this.f8211OooO0o.contains(Integer.valueOf((int) jOooO00o))) {
                                    oooOO0O.OooO0Oo(jOooO00o);
                                    OooOoO(oooOO0O, num.intValue());
                                } else if (z3) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jOooO00o + ")");
                                }
                            } else if (z3) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jOooO00o);
                            }
                            oooOO0O.OooO0Oo(j2);
                        } else {
                            unsignedShort = oooOO0O.readUnsignedShort();
                        }
                        jOooO00o = unsignedShort;
                        if (z3) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jOooO00o), oooO.f8226OooO0O0));
                        }
                        if (jOooO00o > 0) {
                            if (!this.f8211OooO0o.contains(Integer.valueOf((int) jOooO00o))) {
                                oooOO0O.OooO0Oo(jOooO00o);
                                OooOoO(oooOO0O, num.intValue());
                            } else if (z3) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jOooO00o + ")");
                            }
                        } else if (z3) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jOooO00o);
                        }
                        oooOO0O.OooO0Oo(j2);
                    } else {
                        int i8 = oooOO0O.f8234OoooO0 + this.f8220OooOOOO;
                        byte[] bArr2 = new byte[(int) j];
                        oooOO0O.readFully(bArr2);
                        OooO0o oooO0o2 = new OooO0o(unsignedShort3, i3, i8, bArr2);
                        this.f8212OooO0o0[i].put(oooO.f8226OooO0O0, oooO0o2);
                        if ("DNGVersion".equals(oooO.f8226OooO0O0)) {
                            this.f8210OooO0Oo = 3;
                        }
                        if (!"Make".equals(oooO.f8226OooO0O0)) {
                        }
                        this.f8210OooO0Oo = 8;
                        if (oooOO0O.f8234OoooO0 != j2) {
                            oooOO0O.OooO0Oo(j2);
                        }
                    }
                }
                s4 = (short) (s2 + 1);
                c = 0;
                s3 = s;
            }
            s2 = s4;
            j = 0;
            z2 = false;
            if (z2) {
                oooOO0O.OooO0Oo(j2);
            } else {
                if (j > 4) {
                    i4 = oooOO0O.readInt();
                    if (z3) {
                        p078o000Oo00.OooO.OooO00o("seek to data offset: ", i4, "ExifInterface");
                    }
                    if (this.f8210OooO0Oo != 7) {
                        i3 = i5;
                    } else {
                        if ("MakerNote".equals(oooO.f8226OooO0O0)) {
                            this.f8221OooOOOo = i4;
                        } else if (i != 6) {
                        }
                        i3 = i5;
                    }
                    oooOO0O.OooO0Oo(i4);
                } else {
                    i3 = i5;
                }
                num = f8198OoooOoo.get(Integer.valueOf(unsignedShort2));
                if (z3) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                }
                if (num != null) {
                    jOooO00o = -1;
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            jOooO00o = oooOO0O.OooO00o();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = oooOO0O.readInt();
                        } else {
                            unsignedShort = oooOO0O.readShort();
                        }
                        if (z3) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jOooO00o), oooO.f8226OooO0O0));
                        }
                        if (jOooO00o > 0) {
                            if (!this.f8211OooO0o.contains(Integer.valueOf((int) jOooO00o))) {
                                oooOO0O.OooO0Oo(jOooO00o);
                                OooOoO(oooOO0O, num.intValue());
                            } else if (z3) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jOooO00o + ")");
                            }
                        } else if (z3) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jOooO00o);
                        }
                        oooOO0O.OooO0Oo(j2);
                    } else {
                        unsignedShort = oooOO0O.readUnsignedShort();
                    }
                    jOooO00o = unsignedShort;
                    if (z3) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jOooO00o), oooO.f8226OooO0O0));
                    }
                    if (jOooO00o > 0) {
                        if (!this.f8211OooO0o.contains(Integer.valueOf((int) jOooO00o))) {
                            oooOO0O.OooO0Oo(jOooO00o);
                            OooOoO(oooOO0O, num.intValue());
                        } else if (z3) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jOooO00o + ")");
                        }
                    } else if (z3) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jOooO00o);
                    }
                    oooOO0O.OooO0Oo(j2);
                } else {
                    int i9 = oooOO0O.f8234OoooO0 + this.f8220OooOOOO;
                    byte[] bArr3 = new byte[(int) j];
                    oooOO0O.readFully(bArr3);
                    OooO0o oooO0o3 = new OooO0o(unsignedShort3, i3, i9, bArr3);
                    this.f8212OooO0o0[i].put(oooO.f8226OooO0O0, oooO0o3);
                    if ("DNGVersion".equals(oooO.f8226OooO0O0)) {
                        this.f8210OooO0Oo = 3;
                    }
                    if (!"Make".equals(oooO.f8226OooO0O0)) {
                    }
                    this.f8210OooO0Oo = 8;
                    if (oooOO0O.f8234OoooO0 != j2) {
                        oooOO0O.OooO0Oo(j2);
                    }
                }
            }
            s4 = (short) (s2 + 1);
            c = 0;
            s3 = s;
        }
        int i10 = oooOO0O.readInt();
        boolean z4 = f8168OooOo00;
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j3 = i10;
        if (j3 <= 0) {
            if (z4) {
                p078o000Oo00.OooO.OooO00o("Stop reading file since a wrong offset may cause an infinite loop: ", i10, "ExifInterface");
            }
        } else {
            if (this.f8211OooO0o.contains(Integer.valueOf(i10))) {
                if (z4) {
                    p078o000Oo00.OooO.OooO00o("Stop reading file since re-reading an IFD may cause an infinite loop: ", i10, "ExifInterface");
                    return;
                }
                return;
            }
            oooOO0O.OooO0Oo(j3);
            if (this.f8212OooO0o0[4].isEmpty()) {
                OooOoO(oooOO0O, 4);
            } else if (this.f8212OooO0o0[5].isEmpty()) {
                OooOoO(oooOO0O, 5);
            }
        }
    }

    public final void OooOoO0(byte[] bArr, int i) throws IOException {
        OooOO0O oooOO0O = new OooOO0O(bArr);
        OooOo0O(oooOO0O);
        OooOoO(oooOO0O, i);
    }

    public final void OooOoOO(String str) {
        for (int i = 0; i < f8205o000oOoO.length; i++) {
            this.f8212OooO0o0[i].remove(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015c  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd A[Catch: all -> 0x0125, Exception -> 0x0128, TryCatch #16 {Exception -> 0x0128, all -> 0x0125, blocks: (B:79:0x00f9, B:81:0x00fd, B:83:0x0113, B:82:0x010c), top: B:144:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x010c A[Catch: all -> 0x0125, Exception -> 0x0128, TryCatch #16 {Exception -> 0x0128, all -> 0x0125, blocks: (B:79:0x00f9, B:81:0x00fd, B:83:0x0113, B:82:0x010c), top: B:144:0x00f9 }] */
    public final void OooOoo() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        Object obj;
        int i = this.f8210OooO0Oo;
        if (!(i == 4 || i == 13 || i == 14 || i == 3 || i == 0)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats.");
        }
        if (this.f8208OooO0O0 == null && this.f8207OooO00o == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f8214OooO0oo && this.f8206OooO && !this.f8215OooOO0) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i2 = this.f8218OooOOO;
        InputStream inputStream = null;
        this.f8219OooOOO0 = (i2 == 6 || i2 == 7) ? OooOOOO() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f8207OooO00o != null) {
                fileInputStream = new FileInputStream(this.f8207OooO00o);
            } else {
                androidx.exifinterface.media.OooO00o.C0052OooO00o.OooO0OO(this.f8208OooO0O0, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f8208OooO0O0);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    androidx.exifinterface.media.OooO00o.OooO0o0(fileInputStream, fileOutputStream);
                    androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream);
                    androidx.exifinterface.media.OooO00o.OooO0OO(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f8207OooO00o != null) {
                                        fileOutputStream2 = new FileOutputStream(this.f8207OooO00o);
                                    } else {
                                        androidx.exifinterface.media.OooO00o.C0052OooO00o.OooO0OO(this.f8208OooO0O0, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(this.f8208OooO0O0);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i3 = this.f8210OooO0Oo;
                                                if (i3 == 4) {
                                                    OooOooO(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 13) {
                                                    OooOooo(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 14) {
                                                    Oooo000(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 3 || i3 == 0) {
                                                    Oooo0o0(new OooO0OO(bufferedOutputStream, ByteOrder.BIG_ENDIAN));
                                                }
                                                androidx.exifinterface.media.OooO00o.OooO0OO(bufferedInputStream);
                                                androidx.exifinterface.media.OooO00o.OooO0OO(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f8219OooOOO0 = null;
                                            } catch (Exception e) {
                                                e = e;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f8207OooO00o == null) {
                                                            androidx.exifinterface.media.OooO00o.C0052OooO00o.OooO0OO(this.f8208OooO0O0, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream3 = new FileOutputStream(this.f8208OooO0O0);
                                                        } else {
                                                            fileOutputStream3 = new FileOutputStream(this.f8207OooO00o);
                                                        }
                                                        fileOutputStream2 = fileOutputStream3;
                                                        androidx.exifinterface.media.OooO00o.OooO0o0(fileInputStream2, fileOutputStream2);
                                                        androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream2);
                                                        androidx.exifinterface.media.OooO00o.OooO0OO(fileOutputStream2);
                                                        throw new IOException("Failed to save new file", e);
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        inputStream = fileInputStream2;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            androidx.exifinterface.media.OooO00o.OooO0OO(inputStream);
                                                            androidx.exifinterface.media.OooO00o.OooO0OO(fileOutputStream2);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        inputStream = fileInputStream2;
                                                        androidx.exifinterface.media.OooO00o.OooO0OO(inputStream);
                                                        androidx.exifinterface.media.OooO00o.OooO0OO(fileOutputStream2);
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = bufferedInputStream;
                                            androidx.exifinterface.media.OooO00o.OooO0OO(inputStream);
                                            androidx.exifinterface.media.OooO00o.OooO0OO(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        obj = null;
                                        inputStream = fileInputStream3;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (this.f8207OooO00o == null) {
                                            androidx.exifinterface.media.OooO00o.C0052OooO00o.OooO0OO(this.f8208OooO0O0, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream3 = new FileOutputStream(this.f8208OooO0O0);
                                        } else {
                                            fileOutputStream3 = new FileOutputStream(this.f8207OooO00o);
                                        }
                                        fileOutputStream2 = fileOutputStream3;
                                        androidx.exifinterface.media.OooO00o.OooO0o0(fileInputStream2, fileOutputStream2);
                                        androidx.exifinterface.media.OooO00o.OooO0OO(fileInputStream2);
                                        androidx.exifinterface.media.OooO00o.OooO0OO(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    fileOutputStream2 = null;
                                    obj = null;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                fileOutputStream2 = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            androidx.exifinterface.media.OooO00o.OooO0OO(inputStream);
                            androidx.exifinterface.media.OooO00o.OooO0OO(0);
                            if (0 == 0) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e8) {
                    e = e8;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th7) {
                        th = th7;
                        androidx.exifinterface.media.OooO00o.OooO0OO(inputStream);
                        androidx.exifinterface.media.OooO00o.OooO0OO(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    inputStream = fileInputStream;
                    androidx.exifinterface.media.OooO00o.OooO0OO(inputStream);
                    androidx.exifinterface.media.OooO00o.OooO0OO(fileOutputStream);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                fileOutputStream = null;
            } catch (Throwable th9) {
                th = th9;
                fileOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
            fileOutputStream = null;
        } catch (Throwable th10) {
            th = th10;
            fileOutputStream = null;
        }
    }

    public final void OooOoo0(int i, String str, String str2) {
        if (this.f8212OooO0o0[i].isEmpty() || this.f8212OooO0o0[i].get(str) == null) {
            return;
        }
        HashMap[] mapArr = this.f8212OooO0o0;
        mapArr[i].put(str2, mapArr[i].get(str));
        this.f8212OooO0o0[i].remove(str);
    }

    public final void OooOooO(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f8168OooOo00) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        OooO0O0 oooO0O0 = new OooO0O0(inputStream);
        OooO0OO oooO0OO = new OooO0OO(outputStream, ByteOrder.BIG_ENDIAN);
        if (oooO0O0.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        oooO0OO.OooO00o(-1);
        if (oooO0O0.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        oooO0OO.OooO00o(-40);
        OooO0o oooO0oRemove = null;
        if (OooO0Oo("Xmp") != null && this.f8224OooOOoo) {
            oooO0oRemove = this.f8212OooO0o0[0].remove("Xmp");
        }
        oooO0OO.OooO00o(-1);
        oooO0OO.OooO00o(-31);
        Oooo0o0(oooO0OO);
        if (oooO0oRemove != null) {
            this.f8212OooO0o0[0].put("Xmp", oooO0oRemove);
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
                oooO0OO.OooO0Oo((short) unsignedShort);
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
                    if (Arrays.equals(bArr2, f8200Ooooo0o)) {
                        oooO0O0.OooO0O0(unsignedShort2 - 6);
                    }
                }
                oooO0OO.OooO00o(-1);
                oooO0OO.OooO00o(b);
                oooO0OO.OooO0Oo((short) (unsignedShort2 + 2));
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

    public final void OooOooo(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (f8168OooOo00) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        OooO0O0 oooO0O0 = new OooO0O0(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        OooO0OO oooO0OO = new OooO0OO(outputStream, byteOrder);
        byte[] bArr = f8177OooOooo;
        androidx.exifinterface.media.OooO00o.OooO0o(oooO0O0, oooO0OO, bArr.length);
        int i = this.f8220OooOOOO;
        if (i == 0) {
            int i2 = oooO0O0.readInt();
            oooO0OO.OooO0O0(i2);
            androidx.exifinterface.media.OooO00o.OooO0o(oooO0O0, oooO0OO, i2 + 4 + 4);
        } else {
            androidx.exifinterface.media.OooO00o.OooO0o(oooO0O0, oooO0OO, ((i - bArr.length) - 4) - 4);
            oooO0O0.OooO0O0(oooO0O0.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                OooO0OO oooO0OO2 = new OooO0OO(byteArrayOutputStream2, byteOrder);
                Oooo0o0(oooO0OO2);
                byte[] byteArray = ((ByteArrayOutputStream) oooO0OO2.f8237Oooo).toByteArray();
                oooO0OO.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                oooO0OO.OooO0O0((int) crc32.getValue());
                androidx.exifinterface.media.OooO00o.OooO0OO(byteArrayOutputStream2);
                androidx.exifinterface.media.OooO00o.OooO0o0(oooO0O0, oooO0OO);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.OooO00o.OooO0OO(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void Oooo0(int i, int i2) throws Throwable {
        if (this.f8212OooO0o0[i].isEmpty() || this.f8212OooO0o0[i2].isEmpty()) {
            if (f8168OooOo00) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        OooO0o oooO0o = this.f8212OooO0o0[i].get("ImageLength");
        OooO0o oooO0o2 = this.f8212OooO0o0[i].get("ImageWidth");
        OooO0o oooO0o3 = this.f8212OooO0o0[i2].get("ImageLength");
        OooO0o oooO0o4 = this.f8212OooO0o0[i2].get("ImageWidth");
        if (oooO0o == null || oooO0o2 == null) {
            if (f8168OooOo00) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (oooO0o3 == null || oooO0o4 == null) {
            if (f8168OooOo00) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iOooO0oo = oooO0o.OooO0oo(this.f8213OooO0oO);
        int iOooO0oo2 = oooO0o2.OooO0oo(this.f8213OooO0oO);
        int iOooO0oo3 = oooO0o3.OooO0oo(this.f8213OooO0oO);
        int iOooO0oo4 = oooO0o4.OooO0oo(this.f8213OooO0oO);
        if (iOooO0oo >= iOooO0oo3 || iOooO0oo2 >= iOooO0oo4) {
            return;
        }
        HashMap<String, OooO0o>[] mapArr = this.f8212OooO0o0;
        HashMap<String, OooO0o> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01a8 A[Catch: all -> 0x01ea, Exception -> 0x01ec, TryCatch #4 {Exception -> 0x01ec, all -> 0x01ea, blocks: (B:7:0x004d, B:9:0x0056, B:63:0x01ca, B:10:0x006f, B:12:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x008f, B:22:0x00a2, B:24:0x00ad, B:25:0x00b2, B:27:0x00bf, B:28:0x00c4, B:29:0x00c8, B:30:0x00d4, B:32:0x00dc, B:34:0x00e4, B:36:0x00ec, B:38:0x00f0, B:40:0x00fb, B:42:0x0106, B:44:0x010e, B:56:0x0157, B:58:0x01a8, B:62:0x01c4, B:59:0x01b4, B:61:0x01bc, B:45:0x011d, B:46:0x0124, B:47:0x0125, B:49:0x012d, B:51:0x0133, B:52:0x0147, B:53:0x014e, B:66:0x01e2, B:67:0x01e9), top: B:83:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b4 A[Catch: all -> 0x01ea, Exception -> 0x01ec, TryCatch #4 {Exception -> 0x01ec, all -> 0x01ea, blocks: (B:7:0x004d, B:9:0x0056, B:63:0x01ca, B:10:0x006f, B:12:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x008f, B:22:0x00a2, B:24:0x00ad, B:25:0x00b2, B:27:0x00bf, B:28:0x00c4, B:29:0x00c8, B:30:0x00d4, B:32:0x00dc, B:34:0x00e4, B:36:0x00ec, B:38:0x00f0, B:40:0x00fb, B:42:0x0106, B:44:0x010e, B:56:0x0157, B:58:0x01a8, B:62:0x01c4, B:59:0x01b4, B:61:0x01bc, B:45:0x011d, B:46:0x0124, B:47:0x0125, B:49:0x012d, B:51:0x0133, B:52:0x0147, B:53:0x014e, B:66:0x01e2, B:67:0x01e9), top: B:83:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc A[Catch: all -> 0x01ea, Exception -> 0x01ec, TryCatch #4 {Exception -> 0x01ec, all -> 0x01ea, blocks: (B:7:0x004d, B:9:0x0056, B:63:0x01ca, B:10:0x006f, B:12:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x008f, B:22:0x00a2, B:24:0x00ad, B:25:0x00b2, B:27:0x00bf, B:28:0x00c4, B:29:0x00c8, B:30:0x00d4, B:32:0x00dc, B:34:0x00e4, B:36:0x00ec, B:38:0x00f0, B:40:0x00fb, B:42:0x0106, B:44:0x010e, B:56:0x0157, B:58:0x01a8, B:62:0x01c4, B:59:0x01b4, B:61:0x01bc, B:45:0x011d, B:46:0x0124, B:47:0x0125, B:49:0x012d, B:51:0x0133, B:52:0x0147, B:53:0x014e, B:66:0x01e2, B:67:0x01e9), top: B:83:0x004d }] */
    public final void Oooo000(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (f8168OooOo00) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        OooO0O0 oooO0O0 = new OooO0O0(inputStream, byteOrder);
        OooO0OO oooO0OO = new OooO0OO(outputStream, byteOrder);
        byte[] bArr = f8179Oooo0;
        androidx.exifinterface.media.OooO00o.OooO0o(oooO0O0, oooO0OO, bArr.length);
        byte[] bArr2 = f8183Oooo0O0;
        oooO0O0.OooO0O0(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    OooO0OO oooO0OO2 = new OooO0OO(byteArrayOutputStream, byteOrder);
                    int i8 = this.f8220OooOOOO;
                    if (i8 != 0) {
                        androidx.exifinterface.media.OooO00o.OooO0o(oooO0O0, oooO0OO2, ((i8 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        oooO0O0.OooO0O0(4);
                        oooO0O0.OooO0O0(oooO0O0.readInt());
                        Oooo0o0(oooO0OO2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (oooO0O0.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = f8185Oooo0o;
                        boolean z = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i9 = oooO0O0.readInt();
                            byte[] bArr5 = new byte[i9 % 2 == 1 ? i9 + 1 : i9];
                            oooO0O0.read(bArr5);
                            bArr5[0] = (byte) (8 | bArr5[0]);
                            if (((bArr5[0] >> 1) & 1) != 1) {
                                z = false;
                            }
                            oooO0OO2.write(bArr4);
                            oooO0OO2.OooO0O0(i9);
                            oooO0OO2.write(bArr5);
                            if (z) {
                                OooO0O0(oooO0O0, oooO0OO2, f8178Oooo, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, f8191OoooO00)) {
                                        break;
                                    } else {
                                        OooO0OO(oooO0O0, oooO0OO2, bArr6);
                                    }
                                }
                                Oooo0o0(oooO0OO2);
                            } else {
                                OooO0O0(oooO0O0, oooO0OO2, f8188Oooo0oo, f8187Oooo0oO);
                                Oooo0o0(oooO0OO2);
                            }
                        } else {
                            byte[] bArr7 = f8188Oooo0oo;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f8187Oooo0oO)) {
                                int i10 = oooO0O0.readInt();
                                int i11 = i10 % 2 == 1 ? i10 + 1 : i10;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    oooO0O0.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    if (oooO0O0.read(bArr9) != 3 || !Arrays.equals(f8186Oooo0o0, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i = oooO0O0.readInt();
                                    i2 = (i << 18) >> 18;
                                    i3 = (i << 2) >> 18;
                                    i11 -= 10;
                                } else {
                                    if (!Arrays.equals(bArr3, f8187Oooo0oO)) {
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                    } else {
                                        if (oooO0O0.readByte() != 47) {
                                            throw new IOException("Encountered error while checking VP8L signature");
                                        }
                                        i4 = oooO0O0.readInt();
                                        i5 = ((i4 << 18) >> 18) + 1;
                                        i6 = ((i4 << 4) >> 18) + 1;
                                        i7 = i4 & 8;
                                        i11 -= 5;
                                    }
                                    oooO0OO2.write(bArr4);
                                    oooO0OO2.OooO0O0(10);
                                    byte[] bArr10 = new byte[10];
                                    bArr10[0] = (byte) (bArr10[0] | 8);
                                    bArr10[0] = (byte) (bArr10[0] | (i7 << 4));
                                    int i12 = i5 - 1;
                                    int i13 = i6 - 1;
                                    bArr10[4] = (byte) i12;
                                    bArr10[5] = (byte) (i12 >> 8);
                                    bArr10[6] = (byte) (i12 >> 16);
                                    bArr10[7] = (byte) i13;
                                    bArr10[8] = (byte) (i13 >> 8);
                                    bArr10[9] = (byte) (i13 >> 16);
                                    oooO0OO2.write(bArr10);
                                    oooO0OO2.write(bArr3);
                                    oooO0OO2.OooO0O0(i10);
                                    if (Arrays.equals(bArr3, bArr7)) {
                                        oooO0OO2.write(bArr8);
                                        oooO0OO2.write(f8186Oooo0o0);
                                        oooO0OO2.OooO0O0(i4);
                                    } else if (Arrays.equals(bArr3, f8187Oooo0oO)) {
                                        oooO0OO2.write(47);
                                        oooO0OO2.OooO0O0(i4);
                                    }
                                    androidx.exifinterface.media.OooO00o.OooO0o(oooO0O0, oooO0OO2, i11);
                                    Oooo0o0(oooO0OO2);
                                }
                                i6 = i3;
                                i5 = i2;
                                i4 = i;
                                i7 = 0;
                                oooO0OO2.write(bArr4);
                                oooO0OO2.OooO0O0(10);
                                byte[] bArr11 = new byte[10];
                                bArr11[0] = (byte) (bArr11[0] | 8);
                                bArr11[0] = (byte) (bArr11[0] | (i7 << 4));
                                int i14 = i5 - 1;
                                int i15 = i6 - 1;
                                bArr11[4] = (byte) i14;
                                bArr11[5] = (byte) (i14 >> 8);
                                bArr11[6] = (byte) (i14 >> 16);
                                bArr11[7] = (byte) i15;
                                bArr11[8] = (byte) (i15 >> 8);
                                bArr11[9] = (byte) (i15 >> 16);
                                oooO0OO2.write(bArr11);
                                oooO0OO2.write(bArr3);
                                oooO0OO2.OooO0O0(i10);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    oooO0OO2.write(bArr8);
                                    oooO0OO2.write(f8186Oooo0o0);
                                    oooO0OO2.OooO0O0(i4);
                                } else if (Arrays.equals(bArr3, f8187Oooo0oO)) {
                                    oooO0OO2.write(47);
                                    oooO0OO2.OooO0O0(i4);
                                }
                                androidx.exifinterface.media.OooO00o.OooO0o(oooO0O0, oooO0OO2, i11);
                                Oooo0o0(oooO0OO2);
                            }
                        }
                    }
                    androidx.exifinterface.media.OooO00o.OooO0o0(oooO0O0, oooO0OO2);
                    int size = byteArrayOutputStream.size();
                    byte[] bArr12 = f8183Oooo0O0;
                    oooO0OO.OooO0O0(size + bArr12.length);
                    oooO0OO.write(bArr12);
                    byteArrayOutputStream.writeTo(oooO0OO);
                    androidx.exifinterface.media.OooO00o.OooO0OO(byteArrayOutputStream);
                } catch (Exception e) {
                    e = e;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    androidx.exifinterface.media.OooO00o.OooO0OO(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
    }

    public final void Oooo00O(@NonNull String str, @Nullable String str2) {
        OooO oooO;
        int i;
        OooO0o oooO0o;
        String string;
        String str3 = str;
        String strReplaceAll = str2;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = f8203OooooOo.matcher(strReplaceAll).find();
            boolean zFind2 = f8204Oooooo0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", CertificateUtil.DELIMITER);
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f8168OooOo00) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i2 = 2;
        int i3 = 1;
        if (strReplaceAll != null && f8197OoooOoO.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f8202OooooOO.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        char c = 0;
        int i4 = 0;
        while (i4 < f8205o000oOoO.length) {
            if ((i4 != 4 || this.f8214OooO0oo) && (oooO = f8196OoooOo0[i4].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairOooOOo0 = OooOOo0(strReplaceAll);
                    int i5 = -1;
                    if (oooO.f8227OooO0OO == ((Integer) pairOooOOo0.first).intValue() || oooO.f8227OooO0OO == ((Integer) pairOooOOo0.second).intValue()) {
                        i = oooO.f8227OooO0OO;
                    } else {
                        int i6 = oooO.f8228OooO0Oo;
                        if (i6 == -1 || !(i6 == ((Integer) pairOooOOo0.first).intValue() || oooO.f8228OooO0Oo == ((Integer) pairOooOOo0.second).intValue())) {
                            int i7 = oooO.f8227OooO0OO;
                            if (i7 == i3 || i7 == 7 || i7 == i2) {
                                i = i7;
                            } else if (f8168OooOo00) {
                                StringBuilder sbOooO00o = OooO0o.OooO0o.OooO00o("Given tag (", str3, ") value didn't match with one of expected formats: ");
                                String[] strArr = f8190OoooO0;
                                sbOooO00o.append(strArr[oooO.f8227OooO0OO]);
                                String string2 = "";
                                if (oooO.f8228OooO0Oo == -1) {
                                    string = "";
                                } else {
                                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0(", ");
                                    sbOooO0O0.append(strArr[oooO.f8228OooO0Oo]);
                                    string = sbOooO0O0.toString();
                                }
                                sbOooO00o.append(string);
                                sbOooO00o.append(" (guess: ");
                                sbOooO00o.append(strArr[((Integer) pairOooOOo0.first).intValue()]);
                                if (((Integer) pairOooOOo0.second).intValue() != -1) {
                                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0(", ");
                                    sbOooO0O1.append(strArr[((Integer) pairOooOOo0.second).intValue()]);
                                    string2 = sbOooO0O1.toString();
                                }
                                sbOooO00o.append(string2);
                                sbOooO00o.append(")");
                                Log.d("ExifInterface", sbOooO00o.toString());
                            }
                        } else {
                            i = oooO.f8228OooO0Oo;
                        }
                    }
                    switch (i) {
                        case 1:
                            HashMap<String, OooO0o> map = this.f8212OooO0o0[i4];
                            if (strReplaceAll.length() != 1 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
                                byte[] bytes = strReplaceAll.getBytes(f8199Ooooo00);
                                oooO0o = new OooO0o(1, bytes.length, bytes);
                            } else {
                                oooO0o = new OooO0o(1, 1, new byte[]{(byte) (strReplaceAll.charAt(0) - '0')});
                            }
                            map.put(str3, oooO0o);
                            break;
                        case 2:
                        case 7:
                            this.f8212OooO0o0[i4].put(str3, OooO0o.OooO00o(strReplaceAll));
                            break;
                        case 3:
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i8 = 0; i8 < strArrSplit.length; i8++) {
                                iArr[i8] = Integer.parseInt(strArrSplit[i8]);
                            }
                            this.f8212OooO0o0[i4].put(str3, OooO0o.OooO0o(iArr, this.f8213OooO0oO));
                            break;
                        case 4:
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i9 = 0; i9 < strArrSplit2.length; i9++) {
                                jArr[i9] = Long.parseLong(strArrSplit2[i9]);
                            }
                            this.f8212OooO0o0[i4].put(str3, OooO0o.OooO0OO(jArr, this.f8213OooO0oO));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            OooOO0[] oooOO0Arr = new OooOO0[strArrSplit3.length];
                            for (int i10 = 0; i10 < strArrSplit3.length; i10++) {
                                String[] strArrSplit4 = strArrSplit3[i10].split("/", -1);
                                oooOO0Arr[i10] = new OooOO0((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]));
                            }
                            this.f8212OooO0o0[i4].put(str3, OooO0o.OooO0Oo(oooOO0Arr, this.f8213OooO0oO));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f8168OooOo00) {
                                p078o000Oo00.OooO.OooO00o("Data format isn't one of expected formats: ", i, "ExifInterface");
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int length = strArrSplit5.length;
                            int[] iArr2 = new int[length];
                            for (int i11 = 0; i11 < strArrSplit5.length; i11++) {
                                iArr2[i11] = Integer.parseInt(strArrSplit5[i11]);
                            }
                            HashMap<String, OooO0o> map2 = this.f8212OooO0o0[i4];
                            ByteOrder byteOrder = this.f8213OooO0oO;
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f8192OoooO0O[9] * length]);
                            byteBufferWrap.order(byteOrder);
                            for (int i12 = 0; i12 < length; i12++) {
                                byteBufferWrap.putInt(iArr2[i12]);
                            }
                            map2.put(str3, new OooO0o(9, length, byteBufferWrap.array()));
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            int length2 = strArrSplit6.length;
                            OooOO0[] oooOO0Arr2 = new OooOO0[length2];
                            int i13 = 0;
                            while (i13 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i13].split("/", i5);
                                oooOO0Arr2[i13] = new OooOO0((long) Double.parseDouble(strArrSplit7[c]), (long) Double.parseDouble(strArrSplit7[i3]));
                                i13++;
                                c = 0;
                                i3 = 1;
                                strArrSplit6 = strArrSplit6;
                                i5 = -1;
                            }
                            HashMap<String, OooO0o> map3 = this.f8212OooO0o0[i4];
                            ByteOrder byteOrder2 = this.f8213OooO0oO;
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[f8192OoooO0O[10] * length2]);
                            byteBufferWrap2.order(byteOrder2);
                            for (int i14 = 0; i14 < length2; i14++) {
                                OooOO0 oooOO1 = oooOO0Arr2[i14];
                                byteBufferWrap2.putInt((int) oooOO1.f8243OooO00o);
                                byteBufferWrap2.putInt((int) oooOO1.f8244OooO0O0);
                            }
                            map3.put(str3, new OooO0o(10, length2, byteBufferWrap2.array()));
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            int length3 = strArrSplit8.length;
                            double[] dArr = new double[length3];
                            for (int i15 = 0; i15 < strArrSplit8.length; i15++) {
                                dArr[i15] = Double.parseDouble(strArrSplit8[i15]);
                            }
                            HashMap<String, OooO0o> map4 = this.f8212OooO0o0[i4];
                            ByteOrder byteOrder3 = this.f8213OooO0oO;
                            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[f8192OoooO0O[12] * length3]);
                            byteBufferWrap3.order(byteOrder3);
                            for (int i16 = 0; i16 < length3; i16++) {
                                byteBufferWrap3.putDouble(dArr[i16]);
                            }
                            map4.put(str3, new OooO0o(12, length3, byteBufferWrap3.array()));
                            break;
                    }
                } else {
                    this.f8212OooO0o0[i4].remove(str3);
                }
            }
            i4++;
            c = 0;
            i2 = 2;
            i3 = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    public final void Oooo00o(OooO0O0 oooO0O0) throws Throwable {
        boolean z;
        OooO0o oooO0o;
        int iOooO0oo;
        HashMap<String, OooO0o> map = this.f8212OooO0o0[4];
        OooO0o oooO0o2 = map.get("Compression");
        if (oooO0o2 == null) {
            this.f8218OooOOO = 6;
            OooOOo(oooO0O0, map);
            return;
        }
        int iOooO0oo2 = oooO0o2.OooO0oo(this.f8213OooO0oO);
        this.f8218OooOOO = iOooO0oo2;
        int i = 1;
        if (iOooO0oo2 != 1) {
            if (iOooO0oo2 == 6) {
                OooOOo(oooO0O0, map);
                return;
            } else if (iOooO0oo2 != 7) {
                return;
            }
        }
        OooO0o oooO0o3 = map.get("BitsPerSample");
        if (oooO0o3 != null) {
            int[] iArr = (int[]) oooO0o3.OooOO0(this.f8213OooO0oO);
            int[] iArr2 = f8170OooOo0o;
            if (Arrays.equals(iArr2, iArr) || (this.f8210OooO0Oo == 3 && (oooO0o = map.get("PhotometricInterpretation")) != null && (((iOooO0oo = oooO0o.OooO0oo(this.f8213OooO0oO)) == 1 && Arrays.equals(iArr, f8166OooOo)) || (iOooO0oo == 6 && Arrays.equals(iArr, iArr2))))) {
                z = true;
            } else {
                if (f8168OooOo00) {
                    Log.d("ExifInterface", "Unsupported data type value");
                }
                z = false;
            }
        } else {
            if (f8168OooOo00) {
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
            long[] jArrOooO0Oo = androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0o4.OooOO0(this.f8213OooO0oO));
            long[] jArrOooO0Oo2 = androidx.exifinterface.media.OooO00o.OooO0Oo(oooO0o5.OooOO0(this.f8213OooO0oO));
            if (jArrOooO0Oo == null || jArrOooO0Oo.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrOooO0Oo2 == null || jArrOooO0Oo2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrOooO0Oo.length != jArrOooO0Oo2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j = 0;
            for (long j2 : jArrOooO0Oo2) {
                j += j2;
            }
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            this.f8215OooOO0 = true;
            this.f8206OooO = true;
            this.f8214OooO0oo = true;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < jArrOooO0Oo.length) {
                int i6 = (int) jArrOooO0Oo[i3];
                int i7 = (int) jArrOooO0Oo2[i3];
                if (i3 < jArrOooO0Oo.length - i && i6 + i7 != jArrOooO0Oo[i3 + 1]) {
                    this.f8215OooOO0 = false;
                }
                int i8 = i6 - i4;
                if (i8 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                    return;
                }
                long j3 = i8;
                if (oooO0O0.skip(j3) != j3) {
                    Log.d("ExifInterface", "Failed to skip " + i8 + " bytes.");
                    return;
                }
                int i9 = i4 + i8;
                byte[] bArr2 = new byte[i7];
                if (oooO0O0.read(bArr2) != i7) {
                    Log.d("ExifInterface", "Failed to read " + i7 + " bytes.");
                    return;
                }
                i4 = i9 + i7;
                System.arraycopy(bArr2, 0, bArr, i5, i7);
                i5 += i7;
                i3++;
                i = 1;
            }
            this.f8219OooOOO0 = bArr;
            if (this.f8215OooOO0) {
                this.f8216OooOO0O = (int) jArrOooO0Oo[0];
                this.f8217OooOO0o = i2;
            }
        }
    }

    public final void Oooo0O0(OooOO0O oooOO0O, int i) throws Throwable {
        OooO0o oooO0oOooO0o0;
        OooO0o oooO0oOooO0o1;
        OooO0o oooO0o = this.f8212OooO0o0[i].get("DefaultCropSize");
        OooO0o oooO0o2 = this.f8212OooO0o0[i].get("SensorTopBorder");
        OooO0o oooO0o3 = this.f8212OooO0o0[i].get("SensorLeftBorder");
        OooO0o oooO0o4 = this.f8212OooO0o0[i].get("SensorBottomBorder");
        OooO0o oooO0o5 = this.f8212OooO0o0[i].get("SensorRightBorder");
        if (oooO0o != null) {
            if (oooO0o.f8239OooO00o == 5) {
                OooOO0[] oooOO0Arr = (OooOO0[]) oooO0o.OooOO0(this.f8213OooO0oO);
                if (oooOO0Arr == null || oooOO0Arr.length != 2) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Invalid crop size values. cropSize=");
                    sbOooO0O0.append(Arrays.toString(oooOO0Arr));
                    Log.w("ExifInterface", sbOooO0O0.toString());
                    return;
                } else {
                    oooO0oOooO0o0 = OooO0o.OooO0Oo(new OooOO0[]{oooOO0Arr[0]}, this.f8213OooO0oO);
                    oooO0oOooO0o1 = OooO0o.OooO0Oo(new OooOO0[]{oooOO0Arr[1]}, this.f8213OooO0oO);
                }
            } else {
                int[] iArr = (int[]) oooO0o.OooOO0(this.f8213OooO0oO);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Invalid crop size values. cropSize=");
                    sbOooO0O1.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sbOooO0O1.toString());
                    return;
                }
                oooO0oOooO0o0 = OooO0o.OooO0o0(iArr[0], this.f8213OooO0oO);
                oooO0oOooO0o1 = OooO0o.OooO0o0(iArr[1], this.f8213OooO0oO);
            }
            this.f8212OooO0o0[i].put("ImageWidth", oooO0oOooO0o0);
            this.f8212OooO0o0[i].put("ImageLength", oooO0oOooO0o1);
            return;
        }
        if (oooO0o2 != null && oooO0o3 != null && oooO0o4 != null && oooO0o5 != null) {
            int iOooO0oo = oooO0o2.OooO0oo(this.f8213OooO0oO);
            int iOooO0oo2 = oooO0o4.OooO0oo(this.f8213OooO0oO);
            int iOooO0oo3 = oooO0o5.OooO0oo(this.f8213OooO0oO);
            int iOooO0oo4 = oooO0o3.OooO0oo(this.f8213OooO0oO);
            if (iOooO0oo2 <= iOooO0oo || iOooO0oo3 <= iOooO0oo4) {
                return;
            }
            OooO0o oooO0oOooO0o2 = OooO0o.OooO0o0(iOooO0oo2 - iOooO0oo, this.f8213OooO0oO);
            OooO0o oooO0oOooO0o3 = OooO0o.OooO0o0(iOooO0oo3 - iOooO0oo4, this.f8213OooO0oO);
            this.f8212OooO0o0[i].put("ImageLength", oooO0oOooO0o2);
            this.f8212OooO0o0[i].put("ImageWidth", oooO0oOooO0o3);
            return;
        }
        OooO0o oooO0o6 = this.f8212OooO0o0[i].get("ImageLength");
        OooO0o oooO0o7 = this.f8212OooO0o0[i].get("ImageWidth");
        if (oooO0o6 == null || oooO0o7 == null) {
            OooO0o oooO0o8 = this.f8212OooO0o0[i].get("JPEGInterchangeFormat");
            OooO0o oooO0o9 = this.f8212OooO0o0[i].get("JPEGInterchangeFormatLength");
            if (oooO0o8 == null || oooO0o9 == null) {
                return;
            }
            int iOooO0oo5 = oooO0o8.OooO0oo(this.f8213OooO0oO);
            int iOooO0oo6 = oooO0o8.OooO0oo(this.f8213OooO0oO);
            oooOO0O.OooO0Oo(iOooO0oo5);
            byte[] bArr = new byte[iOooO0oo6];
            oooOO0O.read(bArr);
            OooO0oo(new OooO0O0(bArr), iOooO0oo5, i);
        }
    }

    public final void Oooo0OO() throws Throwable {
        Oooo0(0, 5);
        Oooo0(0, 4);
        Oooo0(5, 4);
        OooO0o oooO0o = this.f8212OooO0o0[1].get("PixelXDimension");
        OooO0o oooO0o2 = this.f8212OooO0o0[1].get("PixelYDimension");
        if (oooO0o != null && oooO0o2 != null) {
            this.f8212OooO0o0[0].put("ImageWidth", oooO0o);
            this.f8212OooO0o0[0].put("ImageLength", oooO0o2);
        }
        if (this.f8212OooO0o0[4].isEmpty() && OooOo00(this.f8212OooO0o0[5])) {
            HashMap<String, OooO0o>[] mapArr = this.f8212OooO0o0;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!OooOo00(this.f8212OooO0o0[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        OooOoo0(0, "ThumbnailOrientation", "Orientation");
        OooOoo0(0, "ThumbnailImageLength", "ImageLength");
        OooOoo0(0, "ThumbnailImageWidth", "ImageWidth");
        OooOoo0(5, "ThumbnailOrientation", "Orientation");
        OooOoo0(5, "ThumbnailImageLength", "ImageLength");
        OooOoo0(5, "ThumbnailImageWidth", "ImageWidth");
        OooOoo0(4, "Orientation", "ThumbnailOrientation");
        OooOoo0(4, "ImageLength", "ThumbnailImageLength");
        OooOoo0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int Oooo0o0(OooO0OO oooO0OO) throws IOException {
        OooO[][] oooOArr = f8205o000oOoO;
        int[] iArr = new int[oooOArr.length];
        int[] iArr2 = new int[oooOArr.length];
        for (OooO oooO : f8194OoooOOO) {
            OooOoOO(oooO.f8226OooO0O0);
        }
        if (this.f8214OooO0oo) {
            if (this.f8206OooO) {
                OooOoOO("StripOffsets");
                OooOoOO("StripByteCounts");
            } else {
                OooOoOO("JPEGInterchangeFormat");
                OooOoOO("JPEGInterchangeFormatLength");
            }
        }
        for (int i = 0; i < f8205o000oOoO.length; i++) {
            for (Object obj : this.f8212OooO0o0[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f8212OooO0o0[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f8212OooO0o0[1].isEmpty()) {
            this.f8212OooO0o0[0].put(f8194OoooOOO[1].f8226OooO0O0, OooO0o.OooO0O0(0L, this.f8213OooO0oO));
        }
        if (!this.f8212OooO0o0[2].isEmpty()) {
            this.f8212OooO0o0[0].put(f8194OoooOOO[2].f8226OooO0O0, OooO0o.OooO0O0(0L, this.f8213OooO0oO));
        }
        if (!this.f8212OooO0o0[3].isEmpty()) {
            this.f8212OooO0o0[1].put(f8194OoooOOO[3].f8226OooO0O0, OooO0o.OooO0O0(0L, this.f8213OooO0oO));
        }
        if (this.f8214OooO0oo) {
            if (this.f8206OooO) {
                this.f8212OooO0o0[4].put("StripOffsets", OooO0o.OooO0o0(0, this.f8213OooO0oO));
                this.f8212OooO0o0[4].put("StripByteCounts", OooO0o.OooO0o0(this.f8217OooOO0o, this.f8213OooO0oO));
            } else {
                this.f8212OooO0o0[4].put("JPEGInterchangeFormat", OooO0o.OooO0O0(0L, this.f8213OooO0oO));
                this.f8212OooO0o0[4].put("JPEGInterchangeFormatLength", OooO0o.OooO0O0(this.f8217OooOO0o, this.f8213OooO0oO));
            }
        }
        for (int i2 = 0; i2 < f8205o000oOoO.length; i2++) {
            Iterator<Map.Entry<String, OooO0o>> it = this.f8212OooO0o0[i2].entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                OooO0o value = it.next().getValue();
                Objects.requireNonNull(value);
                int i4 = f8192OoooO0O[value.f8239OooO00o] * value.f8240OooO0O0;
                if (i4 > 4) {
                    i3 += i4;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size = 8;
        for (int i5 = 0; i5 < f8205o000oOoO.length; i5++) {
            if (!this.f8212OooO0o0[i5].isEmpty()) {
                iArr[i5] = size;
                size = (this.f8212OooO0o0[i5].size() * 12) + 2 + 4 + iArr2[i5] + size;
            }
        }
        if (this.f8214OooO0oo) {
            if (this.f8206OooO) {
                this.f8212OooO0o0[4].put("StripOffsets", OooO0o.OooO0o0(size, this.f8213OooO0oO));
            } else {
                this.f8212OooO0o0[4].put("JPEGInterchangeFormat", OooO0o.OooO0O0(size, this.f8213OooO0oO));
            }
            this.f8216OooOO0O = size;
            size += this.f8217OooOO0o;
        }
        if (this.f8210OooO0Oo == 4) {
            size += 8;
        }
        if (f8168OooOo00) {
            for (int i6 = 0; i6 < f8205o000oOoO.length; i6++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f8212OooO0o0[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(size)));
            }
        }
        if (!this.f8212OooO0o0[1].isEmpty()) {
            this.f8212OooO0o0[0].put(f8194OoooOOO[1].f8226OooO0O0, OooO0o.OooO0O0(iArr[1], this.f8213OooO0oO));
        }
        if (!this.f8212OooO0o0[2].isEmpty()) {
            this.f8212OooO0o0[0].put(f8194OoooOOO[2].f8226OooO0O0, OooO0o.OooO0O0(iArr[2], this.f8213OooO0oO));
        }
        if (!this.f8212OooO0o0[3].isEmpty()) {
            this.f8212OooO0o0[1].put(f8194OoooOOO[3].f8226OooO0O0, OooO0o.OooO0O0(iArr[3], this.f8213OooO0oO));
        }
        int i7 = this.f8210OooO0Oo;
        if (i7 == 4) {
            oooO0OO.OooO0Oo((short) size);
            oooO0OO.write(f8200Ooooo0o);
        } else if (i7 == 13) {
            oooO0OO.OooO0O0(size);
            oooO0OO.write(f8180Oooo000);
        } else if (i7 == 14) {
            oooO0OO.write(f8184Oooo0OO);
            oooO0OO.OooO0O0(size);
        }
        oooO0OO.OooO0Oo(this.f8213OooO0oO == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        oooO0OO.f8238OoooO00 = this.f8213OooO0oO;
        oooO0OO.OooO0Oo((short) 42);
        oooO0OO.OooO0O0((int) 8);
        for (int i8 = 0; i8 < f8205o000oOoO.length; i8++) {
            if (!this.f8212OooO0o0[i8].isEmpty()) {
                oooO0OO.OooO0Oo((short) this.f8212OooO0o0[i8].size());
                int size2 = (this.f8212OooO0o0[i8].size() * 12) + iArr[i8] + 2 + 4;
                for (Map.Entry<String, OooO0o> entry2 : this.f8212OooO0o0[i8].entrySet()) {
                    int i9 = f8196OoooOo0[i8].get(entry2.getKey()).f8225OooO00o;
                    OooO0o value2 = entry2.getValue();
                    Objects.requireNonNull(value2);
                    int i10 = f8192OoooO0O[value2.f8239OooO00o] * value2.f8240OooO0O0;
                    oooO0OO.OooO0Oo((short) i9);
                    oooO0OO.OooO0Oo((short) value2.f8239OooO00o);
                    oooO0OO.OooO0O0(value2.f8240OooO0O0);
                    if (i10 > 4) {
                        oooO0OO.OooO0O0(size2);
                        size2 += i10;
                    } else {
                        oooO0OO.write(value2.f8242OooO0Oo);
                        if (i10 < 4) {
                            while (i10 < 4) {
                                oooO0OO.OooO00o(0);
                                i10++;
                            }
                        }
                    }
                }
                if (i8 != 0 || this.f8212OooO0o0[4].isEmpty()) {
                    oooO0OO.OooO0O0((int) 0);
                } else {
                    oooO0OO.OooO0O0(iArr[4]);
                }
                Iterator<Map.Entry<String, OooO0o>> it2 = this.f8212OooO0o0[i8].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f8242OooO0Oo;
                    if (bArr.length > 4) {
                        oooO0OO.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f8214OooO0oo) {
            oooO0OO.write(OooOOOO());
        }
        if (this.f8210OooO0Oo == 14 && size % 2 == 1) {
            oooO0OO.OooO00o(0);
        }
        oooO0OO.f8238OoooO00 = ByteOrder.BIG_ENDIAN;
        return size;
    }

    public static class OooOO0O extends OooO0O0 {
        public OooOO0O(byte[] bArr) throws IOException {
            super(bArr);
            this.f8233Oooo.mark(Integer.MAX_VALUE);
        }

        public final void OooO0Oo(long j) throws IOException {
            int i = this.f8234OoooO0;
            if (i > j) {
                this.f8234OoooO0 = 0;
                this.f8233Oooo.reset();
            } else {
                j -= (long) i;
            }
            OooO0O0((int) j);
        }

        public OooOO0O(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f8233Oooo.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8225OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f8226OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f8227OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8228OooO0Oo;

        public OooO(String str, int i, int i2) {
            this.f8226OooO0O0 = str;
            this.f8225OooO00o = i;
            this.f8227OooO0OO = i2;
            this.f8228OooO0Oo = -1;
        }

        public OooO(String str, int i, int i2, int i3) {
            this.f8226OooO0O0 = str;
            this.f8225OooO00o = i;
            this.f8227OooO0OO = i2;
            this.f8228OooO0Oo = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        OooO[][] oooOArr = f8205o000oOoO;
        this.f8212OooO0o0 = new HashMap[oooOArr.length];
        this.f8211OooO0o = new HashSet(oooOArr.length);
        this.f8213OooO0oO = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f8207OooO00o = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f8209OooO0OO = (AssetManager.AssetInputStream) inputStream;
            this.f8208OooO0O0 = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            if (OooOOoo(fileInputStream.getFD())) {
                this.f8209OooO0OO = null;
                this.f8208OooO0O0 = fileInputStream.getFD();
            } else {
                this.f8209OooO0OO = null;
                this.f8208OooO0O0 = null;
            }
        } else {
            this.f8209OooO0OO = null;
            this.f8208OooO0O0 = null;
        }
        OooOo0(inputStream);
    }
}
