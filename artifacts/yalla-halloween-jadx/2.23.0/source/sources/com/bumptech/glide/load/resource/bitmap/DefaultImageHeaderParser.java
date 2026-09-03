package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.UByte;
import p041Ooooo0o.o00000;
import p129o00O0ooo.o0000;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f9979OooO00o = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f9980OooO0O0 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class OooO00o implements Reader {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f9981OooO00o;

        public OooO00o(ByteBuffer byteBuffer) {
            this.f9981OooO00o = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int OooO00o() throws Reader.EndOfFileException {
            return (OooO0OO() << 8) | OooO0OO();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int OooO0O0(int i, byte[] bArr) {
            ByteBuffer byteBuffer = this.f9981OooO00o;
            int iMin = Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short OooO0OO() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.f9981OooO00o;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & UByte.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.f9981OooO00o;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f9982OooO00o;

        public OooO0O0(byte[] bArr, int i) {
            this.f9982OooO00o = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public final short OooO00o(int i) {
            ByteBuffer byteBuffer = this.f9982OooO00o;
            if (byteBuffer.remaining() - i >= 2) {
                return byteBuffer.getShort(i);
            }
            return (short) -1;
        }
    }

    public static final class OooO0OO implements Reader {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InputStream f9983OooO00o;

        public OooO0OO(InputStream inputStream) {
            this.f9983OooO00o = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int OooO00o() throws IOException {
            return (OooO0OO() << 8) | OooO0OO();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int OooO0O0(int i, byte[] bArr) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f9983OooO00o.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short OooO0OO() throws IOException {
            int i = this.f9983OooO00o.read();
            if (i != -1) {
                return (short) i;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.f9983OooO00o;
                long jSkip = inputStream.skip(j2);
                if (jSkip > 0) {
                    j2 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int OooO00o() throws IOException;

        int OooO0O0(int i, byte[] bArr) throws IOException;

        short OooO0OO() throws IOException;

        long skip(long j) throws IOException;
    }

    @NonNull
    public static ImageHeaderParser.ImageType OooO0o(Reader reader) throws IOException {
        try {
            int iOooO00o = reader.OooO00o();
            if (iOooO00o == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iOooO0OO = (iOooO00o << 8) | reader.OooO0OO();
            if (iOooO0OO == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iOooO0OO2 = (iOooO0OO << 8) | reader.OooO0OO();
            if (iOooO0OO2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.OooO0OO() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iOooO0OO2 == 1380533830) {
                reader.skip(4L);
                if (((reader.OooO00o() << 16) | reader.OooO00o()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iOooO00o2 = (reader.OooO00o() << 16) | reader.OooO00o();
                if ((iOooO00o2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iOooO00o2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    reader.skip(4L);
                    return (reader.OooO0OO() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                short sOooO0OO = reader.OooO0OO();
                if ((sOooO0OO & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (sOooO0OO & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.OooO00o() << 16) | reader.OooO00o()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iOooO00o3 = (reader.OooO00o() << 16) | reader.OooO00o();
            if (iOooO00o3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iOooO00o3 == 1635150182;
            reader.skip(4L);
            int i3 = iOooO0OO2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iOooO00o4 = (reader.OooO00o() << 16) | reader.OooO00o();
                    if (iOooO00o4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iOooO00o4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int OooO0o0(Reader reader, o0000 o0000Var) throws IOException {
        try {
            int iOooO00o = reader.OooO00o();
            if (!((iOooO00o & 65496) == 65496 || iOooO00o == 19789 || iOooO00o == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iOooO00o);
                }
                return -1;
            }
            int iOooO0oO = OooO0oO(reader);
            if (iOooO0oO == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) o0000Var.OooO0OO(iOooO0oO, byte[].class);
            try {
                return OooO0oo(reader, bArr, iOooO0oO);
            } finally {
                o0000Var.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    public static int OooO0oO(Reader reader) throws IOException {
        short sOooO0OO;
        int iOooO00o;
        long j;
        long jSkip;
        do {
            short sOooO0OO2 = reader.OooO0OO();
            if (sOooO0OO2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sOooO0OO2));
                }
                return -1;
            }
            sOooO0OO = reader.OooO0OO();
            if (sOooO0OO == 218) {
                return -1;
            }
            if (sOooO0OO == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iOooO00o = reader.OooO00o() - 2;
            if (sOooO0OO == 225) {
                return iOooO00o;
            }
            j = iOooO00o;
            jSkip = reader.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbOooO00o = o00000.OooO00o("Unable to skip enough data, type: ", sOooO0OO, ", wanted to skip: ", iOooO00o, ", but actually skipped: ");
            sbOooO00o.append(jSkip);
            Log.d("DfltImageHeaderParser", sbOooO00o.toString());
        }
        return -1;
    }

    public static int OooO0oo(Reader reader, byte[] bArr, int i) throws IOException {
        ByteOrder byteOrder;
        int iOooO0O0 = reader.OooO0O0(i, bArr);
        if (iOooO0O0 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iOooO0O0);
            }
            return -1;
        }
        short s = 1;
        byte[] bArr2 = f9979OooO00o;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        OooO0O0 oooO0O0 = new OooO0O0(bArr, i);
        short sOooO00o = oooO0O0.OooO00o(6);
        if (sOooO00o != 18761) {
            if (sOooO00o != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sOooO00o));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        ByteBuffer byteBuffer = oooO0O0.f9982OooO00o;
        byteBuffer.order(byteOrder);
        int i3 = (byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1) + 6;
        short sOooO00o2 = oooO0O0.OooO00o(i3);
        int i4 = 0;
        while (i4 < sOooO00o2) {
            int i5 = (i4 * 12) + i3 + 2;
            short sOooO00o3 = oooO0O0.OooO00o(i5);
            if (sOooO00o3 == 274) {
                short sOooO00o4 = oooO0O0.OooO00o(i5 + 2);
                if (sOooO00o4 >= s && sOooO00o4 <= 12) {
                    int i6 = i5 + 4;
                    if (byteBuffer.remaining() - i6 < 4) {
                        s = 0;
                    }
                    int i7 = s != 0 ? byteBuffer.getInt(i6) : -1;
                    if (i7 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbOooO00o = o00000.OooO00o("Got tagIndex=", i4, " tagType=", sOooO00o3, " formatCode=");
                            sbOooO00o.append((int) sOooO00o4);
                            sbOooO00o.append(" componentCount=");
                            sbOooO00o.append(i7);
                            Log.d("DfltImageHeaderParser", sbOooO00o.toString());
                        }
                        int i8 = i7 + f9980OooO0O0[sOooO00o4];
                        if (i8 <= 4) {
                            int i9 = i5 + 8;
                            if (i9 >= 0 && i9 <= byteBuffer.remaining()) {
                                if (i8 >= 0 && i8 + i9 <= byteBuffer.remaining()) {
                                    return oooO0O0.OooO00o(i9);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sOooO00o3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i9 + " tagType=" + ((int) sOooO00o3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sOooO00o4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sOooO00o4));
                }
            }
            i4++;
            s = 1;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO00o(@NonNull InputStream inputStream, @NonNull o0000 o0000Var) throws IOException {
        o0000O00.OooO0O0(inputStream);
        OooO0OO oooO0OO = new OooO0OO(inputStream);
        o0000O00.OooO0O0(o0000Var);
        return OooO0o0(oooO0OO, o0000Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO0O0(@NonNull ByteBuffer byteBuffer) throws IOException {
        o0000O00.OooO0O0(byteBuffer);
        return OooO0o(new OooO00o(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO0OO(@NonNull InputStream inputStream) throws IOException {
        o0000O00.OooO0O0(inputStream);
        return OooO0o(new OooO0OO(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO0Oo(@NonNull ByteBuffer byteBuffer, @NonNull o0000 o0000Var) throws IOException {
        o0000O00.OooO0O0(byteBuffer);
        OooO00o oooO00o = new OooO00o(byteBuffer);
        o0000O00.OooO0O0(o0000Var);
        return OooO0o0(oooO00o, o0000Var);
    }
}
