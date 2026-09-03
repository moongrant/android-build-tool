package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.UShort;
import o000OO.OooOOO0;
import p031OoooO0.OooOo00;
import p031OoooO0.o00Oo0;
import p031OoooO0.oo000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO0O0 extends FilterOutputStream {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final byte[] f3802OooOO0 = "Exif\u0000\u0000".getBytes(o00Oo0.f1405OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f3803OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExifData f3804OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ByteBuffer f3805OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f3806OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f3807OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f3808OooO0oo;

    public OooO0O0(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull ExifData exifData) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f3806OooO0o0 = new byte[1];
        this.f3805OooO0o = ByteBuffer.allocate(4);
        this.f3807OooO0oO = 0;
        this.f3804OooO0Oo = exifData;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        ExifData exifData;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.f3808OooO0oo;
            if ((i5 <= 0 && this.f3803OooO <= 0 && this.f3807OooO0oO == 2) || i4 <= 0) {
                break;
            }
            if (i5 > 0) {
                int iMin = Math.min(i4, i5);
                i4 -= iMin;
                this.f3808OooO0oo -= iMin;
                i3 += iMin;
            }
            int i6 = this.f3803OooO;
            if (i6 > 0) {
                int iMin2 = Math.min(i4, i6);
                ((FilterOutputStream) this).out.write(bArr, i3, iMin2);
                i4 -= iMin2;
                this.f3803OooO -= iMin2;
                i3 += iMin2;
            }
            if (i4 == 0) {
                return;
            }
            int i7 = this.f3807OooO0oO;
            int i8 = 0;
            int i9 = 4;
            ByteBuffer byteBuffer = this.f3805OooO0o;
            if (i7 == 0) {
                int iMin3 = Math.min(i4, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin3);
                i3 += iMin3;
                i4 -= iMin3;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                this.f3807OooO0oO = 1;
                byteBuffer.rewind();
                OooOo00 oooOo00 = new OooOo00(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                oooOo00.OooO0OO((short) -31);
                int[] iArr = new int[4];
                int[] iArr2 = new int[4];
                oo000o[] oo000oVarArr = ExifData.f3786OooO0OO;
                int i10 = 0;
                while (true) {
                    exifData = this.f3804OooO0Oo;
                    if (i10 >= i9) {
                        break;
                    }
                    oo000o oo000oVar = oo000oVarArr[i10];
                    int i11 = 0;
                    while (true) {
                        oo000o[] oo000oVarArr2 = ExifData.f3786OooO0OO;
                        if (i11 < i9) {
                            exifData.OooO00o(i11).remove(oo000oVar.f1416OooO0O0);
                            i11++;
                            i9 = 4;
                        }
                    }
                    i10++;
                    i9 = 4;
                }
                boolean zIsEmpty = exifData.OooO00o(1).isEmpty();
                ByteOrder byteOrder = exifData.f3790OooO0O0;
                if (!zIsEmpty) {
                    exifData.OooO00o(0).put(ExifData.f3786OooO0OO[1].f1416OooO0O0, o00Oo0.OooO00o(0L, byteOrder));
                }
                if (!exifData.OooO00o(2).isEmpty()) {
                    exifData.OooO00o(0).put(ExifData.f3786OooO0OO[2].f1416OooO0O0, o00Oo0.OooO00o(0L, byteOrder));
                }
                if (!exifData.OooO00o(3).isEmpty()) {
                    exifData.OooO00o(1).put(ExifData.f3786OooO0OO[3].f1416OooO0O0, o00Oo0.OooO00o(0L, byteOrder));
                }
                int i12 = 0;
                while (true) {
                    oo000o[] oo000oVarArr3 = ExifData.f3786OooO0OO;
                    if (i12 >= 4) {
                        break;
                    }
                    Iterator<Map.Entry<String, o00Oo0>> it = exifData.OooO00o(i12).entrySet().iterator();
                    int i13 = i8;
                    while (it.hasNext()) {
                        o00Oo0 value = it.next().getValue();
                        int i14 = o00Oo0.f1406OooO0o[value.f1408OooO00o] * value.f1409OooO0O0;
                        if (i14 > 4) {
                            i13 += i14;
                        }
                    }
                    iArr2[i12] = iArr2[i12] + i13;
                    i12++;
                    i8 = 0;
                }
                int size = 8;
                int i15 = 0;
                while (true) {
                    oo000o[] oo000oVarArr4 = ExifData.f3786OooO0OO;
                    if (i15 >= 4) {
                        break;
                    }
                    if (!exifData.OooO00o(i15).isEmpty()) {
                        iArr[i15] = size;
                        size = (exifData.OooO00o(i15).size() * 12) + 2 + 4 + iArr2[i15] + size;
                    }
                    i15++;
                }
                int i16 = size + 8;
                if (!exifData.OooO00o(1).isEmpty()) {
                    exifData.OooO00o(0).put(ExifData.f3786OooO0OO[1].f1416OooO0O0, o00Oo0.OooO00o(iArr[1], byteOrder));
                }
                if (!exifData.OooO00o(2).isEmpty()) {
                    exifData.OooO00o(0).put(ExifData.f3786OooO0OO[2].f1416OooO0O0, o00Oo0.OooO00o(iArr[2], byteOrder));
                }
                if (!exifData.OooO00o(3).isEmpty()) {
                    exifData.OooO00o(1).put(ExifData.f3786OooO0OO[3].f1416OooO0O0, o00Oo0.OooO00o(iArr[3], byteOrder));
                }
                oooOo00.OooO0OO((short) i16);
                oooOo00.write(f3802OooOO0);
                oooOo00.OooO0OO(byteOrder == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                oooOo00.f1395OooO0o0 = byteOrder;
                oooOo00.OooO0OO((short) 42);
                oooOo00.OooO00o((int) 8);
                int i17 = 0;
                while (true) {
                    oo000o[] oo000oVarArr5 = ExifData.f3786OooO0OO;
                    if (i17 >= 4) {
                        break;
                    }
                    if (!exifData.OooO00o(i17).isEmpty()) {
                        oooOo00.OooO0OO((short) exifData.OooO00o(i17).size());
                        int size2 = (exifData.OooO00o(i17).size() * 12) + iArr[i17] + 2 + 4;
                        for (Map.Entry<String, o00Oo0> entry : exifData.OooO00o(i17).entrySet()) {
                            oo000o oo000oVar2 = (oo000o) ((HashMap) ExifData.OooO0O0.f3795OooO0o.get(i17)).get(entry.getKey());
                            OooOOO0.OooO0o0(oo000oVar2, "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.");
                            o00Oo0 value2 = entry.getValue();
                            int i18 = o00Oo0.f1406OooO0o[value2.f1408OooO00o] * value2.f1409OooO0O0;
                            oooOo00.OooO0OO((short) oo000oVar2.f1415OooO00o);
                            oooOo00.OooO0OO((short) value2.f1408OooO00o);
                            oooOo00.OooO00o(value2.f1409OooO0O0);
                            if (i18 > 4) {
                                oooOo00.OooO00o(size2);
                                size2 += i18;
                            } else {
                                oooOo00.write(value2.f1410OooO0OO);
                                if (i18 < 4) {
                                    for (int i19 = 4; i18 < i19; i19 = 4) {
                                        oooOo00.f1394OooO0Oo.write(0);
                                        i18++;
                                    }
                                }
                            }
                        }
                        oooOo00.OooO00o((int) 0);
                        Iterator<Map.Entry<String, o00Oo0>> it2 = exifData.OooO00o(i17).entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr2 = it2.next().getValue().f1410OooO0OO;
                            if (bArr2.length > 4) {
                                oooOo00.write(bArr2, 0, bArr2.length);
                            }
                        }
                    }
                    i17++;
                }
                oooOo00.f1395OooO0o0 = ByteOrder.BIG_ENDIAN;
            } else if (i7 != 1) {
                continue;
            } else {
                int iMin4 = Math.min(i4, 4 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin4);
                i3 += iMin4;
                i4 -= iMin4;
                if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    byteBuffer.rewind();
                }
                if (byteBuffer.position() < 4) {
                    return;
                }
                byteBuffer.rewind();
                short s = byteBuffer.getShort();
                if (s == -31) {
                    this.f3808OooO0oo = (byteBuffer.getShort() & UShort.MAX_VALUE) - 2;
                    this.f3807OooO0oO = 2;
                } else if ((s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.f3807OooO0oO = 2;
                } else {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.f3803OooO = (byteBuffer.getShort() & UShort.MAX_VALUE) - 2;
                }
                byteBuffer.rewind();
            }
        }
        if (i4 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i3, i4);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f3806OooO0o0;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
