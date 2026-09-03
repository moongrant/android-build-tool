package p454o0Ooo0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.KotlinVersion;
import p042Ooooo0o.o000O0Oo;
import p078o000Oo00.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f40362OooO0O0 = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f40363OooO0OO = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f40364OooO00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InputStream f40365OooO00o;

        public OooO00o(InputStream inputStream) {
            this.f40365OooO00o = inputStream;
        }

        public final int OooO00o() throws IOException {
            return ((this.f40365OooO00o.read() << 8) & 65280) | (this.f40365OooO00o.read() & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    public OooOOO(InputStream inputStream) {
        this.f40364OooO00o = new OooO00o(inputStream);
    }

    public final int OooO00o() throws IOException {
        int iOooO00o;
        int iOooO00o2 = this.f40364OooO00o.OooO00o();
        if (!((iOooO00o2 & 65496) == 65496 || iOooO00o2 == 19789 || iOooO00o2 == 18761)) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                OooO.OooO00o("Parser doesn't handle magic number: ", iOooO00o2, "ImageHeaderParser");
            }
            return -1;
        }
        while (true) {
            short s = (short) (this.f40364OooO00o.f40365OooO00o.read() & KotlinVersion.MAX_COMPONENT_VALUE);
            if (s == 255) {
                short s2 = (short) (this.f40364OooO00o.f40365OooO00o.read() & KotlinVersion.MAX_COMPONENT_VALUE);
                if (s2 != 218) {
                    if (s2 != 217) {
                        iOooO00o = this.f40364OooO00o.OooO00o() - 2;
                        if (s2 == 225) {
                            break;
                        }
                        OooO00o oooO00o = this.f40364OooO00o;
                        long j = iOooO00o;
                        Objects.requireNonNull(oooO00o);
                        long j2 = 0;
                        if (j >= 0) {
                            long j3 = j;
                            while (j3 > 0) {
                                long jSkip = oooO00o.f40365OooO00o.skip(j3);
                                if (jSkip <= 0) {
                                    if (oooO00o.f40365OooO00o.read() == -1) {
                                        break;
                                    }
                                    jSkip = 1;
                                }
                                j3 -= jSkip;
                            }
                            j2 = j - j3;
                        }
                        if (j2 != j) {
                            if (Log.isLoggable("ImageHeaderParser", 3)) {
                                StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Unable to skip enough data, type: ", s2, ", wanted to skip: ", iOooO00o, ", but actually skipped: ");
                                sbOooO0O0.append(j2);
                                Log.d("ImageHeaderParser", sbOooO0O0.toString());
                            }
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                    }
                }
            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                OooO.OooO00o("Unknown segmentId=", s, "ImageHeaderParser");
            }
            iOooO00o = -1;
            break;
        }
        if (iOooO00o == -1) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = new byte[iOooO00o];
        OooO00o oooO00o2 = this.f40364OooO00o;
        Objects.requireNonNull(oooO00o2);
        int i = iOooO00o;
        while (i > 0) {
            int i2 = oooO00o2.f40365OooO00o.read(bArr, iOooO00o - i, i);
            if (i2 == -1) {
                break;
            }
            i -= i2;
        }
        int i3 = iOooO00o - i;
        if (i3 != iOooO00o) {
            if (!Log.isLoggable("ImageHeaderParser", 3)) {
                return -1;
            }
            Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + iOooO00o + ", actually read: " + i3);
            return -1;
        }
        boolean z = iOooO00o > f40362OooO0O0.length;
        if (z) {
            int i4 = 0;
            while (true) {
                byte[] bArr2 = f40362OooO0O0;
                if (i4 >= bArr2.length) {
                    break;
                }
                if (bArr[i4] != bArr2[i4]) {
                    z = false;
                    break;
                }
                i4++;
            }
        }
        if (!z) {
            if (!Log.isLoggable("ImageHeaderParser", 3)) {
                return -1;
            }
            Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteBuffer byteBuffer = (ByteBuffer) byteBufferWrap.order(byteOrder).limit(iOooO00o);
        short s3 = byteBuffer.getShort(6);
        if (s3 != 19789) {
            if (s3 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                OooO.OooO00o("Unknown endianness = ", s3, "ImageHeaderParser");
            }
        }
        byteBuffer.order(byteOrder);
        int i5 = byteBuffer.getInt(10) + 6;
        short s4 = byteBuffer.getShort(i5);
        for (int i6 = 0; i6 < s4; i6++) {
            int i7 = (i6 * 12) + i5 + 2;
            short s5 = byteBuffer.getShort(i7);
            if (s5 == 274) {
                short s6 = byteBuffer.getShort(i7 + 2);
                if (s6 >= 1 && s6 <= 12) {
                    int i8 = byteBuffer.getInt(i7 + 4);
                    if (i8 >= 0) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            StringBuilder sbOooO0O1 = o000O0Oo.OooO0O0("Got tagIndex=", i6, " tagType=", s5, " formatCode=");
                            sbOooO0O1.append((int) s6);
                            sbOooO0O1.append(" componentCount=");
                            sbOooO0O1.append(i8);
                            Log.d("ImageHeaderParser", sbOooO0O1.toString());
                        }
                        int i9 = i8 + f40363OooO0OO[s6];
                        if (i9 <= 4) {
                            int i10 = i7 + 8;
                            if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                    return byteBuffer.getShort(i10);
                                }
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    OooO.OooO00o("Illegal number of bytes for TI tag data tagType=", s5, "ImageHeaderParser");
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) s5));
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            OooO.OooO00o("Got byte count > 4, not orientation, continuing, formatCode=", s6, "ImageHeaderParser");
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    OooO.OooO00o("Got invalid format code = ", s6, "ImageHeaderParser");
                }
            }
        }
        return -1;
    }
}
