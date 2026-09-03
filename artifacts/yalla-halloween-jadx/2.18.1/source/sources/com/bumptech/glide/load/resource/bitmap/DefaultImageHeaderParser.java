package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;
import p042Ooooo0o.o000O0Oo;
import p078o000Oo00.OooO;
import p219o00oO0O0.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f12500OooO00o = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f12501OooO0O0 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class OooO00o implements Reader {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f12502OooO00o;

        public OooO00o(ByteBuffer byteBuffer) {
            this.f12502OooO00o = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int OooO00o() throws Reader.EndOfFileException {
            return (OooO0O0() << 8) | OooO0O0();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short OooO0O0() throws Reader.EndOfFileException {
            if (this.f12502OooO00o.remaining() >= 1) {
                return (short) (this.f12502OooO00o.get() & UByte.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) {
            int iMin = (int) Math.min(this.f12502OooO00o.remaining(), j);
            ByteBuffer byteBuffer = this.f12502OooO00o;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f12503OooO00o;

        public OooO0O0(byte[] bArr, int i) {
            this.f12503OooO00o = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public final short OooO00o(int i) {
            if (this.f12503OooO00o.remaining() - i >= 2) {
                return this.f12503OooO00o.getShort(i);
            }
            return (short) -1;
        }

        public final int OooO0O0(int i) {
            if (this.f12503OooO00o.remaining() - i >= 4) {
                return this.f12503OooO00o.getInt(i);
            }
            return -1;
        }
    }

    public static final class OooO0OO implements Reader {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InputStream f12504OooO00o;

        public OooO0OO(InputStream inputStream) {
            this.f12504OooO00o = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int OooO00o() throws IOException {
            return (OooO0O0() << 8) | OooO0O0();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short OooO0O0() throws IOException {
            int i = this.f12504OooO00o.read();
            if (i != -1) {
                return (short) i;
            }
            throw new Reader.EndOfFileException();
        }

        public final int OooO0OO(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f12504OooO00o.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f12504OooO00o.skip(j2);
                if (jSkip <= 0) {
                    if (this.f12504OooO00o.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
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

        short OooO0O0() throws IOException;

        long skip(long j) throws IOException;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO00o(@NonNull ByteBuffer byteBuffer) throws IOException {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return OooO0Oo(new OooO00o(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO0O0(@NonNull InputStream inputStream, @NonNull o0O00o0 o0o00o1) throws IOException {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        OooO0OO oooO0OO = new OooO0OO(inputStream);
        Objects.requireNonNull(o0o00o1, "Argument must not be null");
        try {
            int iOooO00o = oooO0OO.OooO00o();
            if (!((iOooO00o & 65496) == 65496 || iOooO00o == 19789 || iOooO00o == 18761)) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iOooO00o);
                return -1;
            }
            int iOooO0o0 = OooO0o0(oooO0OO);
            if (iOooO0o0 == -1) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                return -1;
            }
            byte[] bArr = (byte[]) o0o00o1.OooO0oO(iOooO0o0, byte[].class);
            try {
                return OooO0o(oooO0OO, bArr, iOooO0o0);
            } finally {
                o0o00o1.OooO0o(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO0OO(@NonNull InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return OooO0Oo(new OooO0OO(inputStream));
    }

    @NonNull
    public final ImageHeaderParser.ImageType OooO0Oo(Reader reader) throws IOException {
        try {
            int iOooO00o = reader.OooO00o();
            if (iOooO00o == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iOooO0O0 = (iOooO00o << 8) | reader.OooO0O0();
            if (iOooO0O0 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iOooO0O1 = (iOooO0O0 << 8) | reader.OooO0O0();
            if (iOooO0O1 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.OooO0O0() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iOooO0O1 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.OooO00o() << 16) | reader.OooO00o()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iOooO00o2 = (reader.OooO00o() << 16) | reader.OooO00o();
            if ((iOooO00o2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = iOooO00o2 & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i == 88) {
                reader.skip(4L);
                return (reader.OooO0O0() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.OooO0O0() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final int OooO0o(Reader reader, byte[] bArr, int i) throws IOException {
        ByteOrder byteOrder;
        int iOooO0OO = ((OooO0OO) reader).OooO0OO(bArr, i);
        if (iOooO0OO != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iOooO0OO);
            }
            return -1;
        }
        boolean z = bArr != null && i > f12500OooO00o.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f12500OooO00o;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
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
                OooO.OooO00o("Unknown endianness = ", sOooO00o, "DfltImageHeaderParser");
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        oooO0O0.f12503OooO00o.order(byteOrder);
        int iOooO0O0 = oooO0O0.OooO0O0(10) + 6;
        short sOooO00o2 = oooO0O0.OooO00o(iOooO0O0);
        for (int i3 = 0; i3 < sOooO00o2; i3++) {
            int i4 = (i3 * 12) + iOooO0O0 + 2;
            short sOooO00o3 = oooO0O0.OooO00o(i4);
            if (sOooO00o3 == 274) {
                short sOooO00o4 = oooO0O0.OooO00o(i4 + 2);
                if (sOooO00o4 >= 1 && sOooO00o4 <= 12) {
                    int iOooO0O1 = oooO0O0.OooO0O0(i4 + 4);
                    if (iOooO0O1 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Got tagIndex=", i3, " tagType=", sOooO00o3, " formatCode=");
                            sbOooO0O0.append((int) sOooO00o4);
                            sbOooO0O0.append(" componentCount=");
                            sbOooO0O0.append(iOooO0O1);
                            Log.d("DfltImageHeaderParser", sbOooO0O0.toString());
                        }
                        int i5 = iOooO0O1 + f12501OooO0O0[sOooO00o4];
                        if (i5 <= 4) {
                            int i6 = i4 + 8;
                            if (i6 >= 0 && i6 <= oooO0O0.f12503OooO00o.remaining()) {
                                if (i5 >= 0 && i5 + i6 <= oooO0O0.f12503OooO00o.remaining()) {
                                    return oooO0O0.OooO00o(i6);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    OooO.OooO00o("Illegal number of bytes for TI tag data tagType=", sOooO00o3, "DfltImageHeaderParser");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i6 + " tagType=" + ((int) sOooO00o3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            OooO.OooO00o("Got byte count > 4, not orientation, continuing, formatCode=", sOooO00o4, "DfltImageHeaderParser");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    OooO.OooO00o("Got invalid format code = ", sOooO00o4, "DfltImageHeaderParser");
                }
            }
        }
        return -1;
    }

    public final int OooO0o0(Reader reader) throws IOException {
        short sOooO0O0;
        int iOooO00o;
        long j;
        long jSkip;
        do {
            OooO0OO oooO0OO = (OooO0OO) reader;
            short sOooO0O1 = oooO0OO.OooO0O0();
            if (sOooO0O1 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    OooO.OooO00o("Unknown segmentId=", sOooO0O1, "DfltImageHeaderParser");
                }
                return -1;
            }
            sOooO0O0 = oooO0OO.OooO0O0();
            if (sOooO0O0 == 218) {
                return -1;
            }
            if (sOooO0O0 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iOooO00o = oooO0OO.OooO00o() - 2;
            if (sOooO0O0 == 225) {
                return iOooO00o;
            }
            j = iOooO00o;
            jSkip = oooO0OO.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Unable to skip enough data, type: ", sOooO0O0, ", wanted to skip: ", iOooO00o, ", but actually skipped: ");
            sbOooO0O0.append(jSkip);
            Log.d("DfltImageHeaderParser", sbOooO0O0.toString());
        }
        return -1;
    }
}
