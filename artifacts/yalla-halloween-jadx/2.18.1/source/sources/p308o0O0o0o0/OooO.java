package p308o0O0o0o0;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.UByte;
import o0O0o0.OooO0OO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends o0O0o0.OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f36252OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO00o f36253OooO00o;

    public interface OooO00o {
        boolean OooO00o(int i, int i2, int i3, int i4, int i5);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36254OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f36255OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f36256OooO0OO;

        public OooO0O0(int i, boolean z, int i2) {
            this.f36254OooO00o = i;
            this.f36255OooO0O0 = z;
            this.f36256OooO0OO = i2;
        }
    }

    public OooO() {
        this.f36253OooO00o = null;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:140:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01df A[Catch: all -> 0x011f, UnsupportedEncodingException -> 0x0122, TryCatch #0 {UnsupportedEncodingException -> 0x0122, blocks: (B:90:0x010d, B:159:0x01f1, B:92:0x0115, B:102:0x0132, B:104:0x013a, B:112:0x0154, B:121:0x016c, B:132:0x0187, B:139:0x0199, B:145:0x01a8, B:150:0x01c0, B:156:0x01da, B:157:0x01df), top: B:172:0x0103 }] */
    @Nullable
    public static Id3Frame OooO(int i, o000 o000Var, boolean z, int i2, @Nullable OooO00o oooO00o) {
        int iOooOo00;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str;
        Id3Frame binaryFrame;
        int iOooOOo0 = o000Var.OooOOo0();
        int iOooOOo1 = o000Var.OooOOo0();
        int iOooOOo2 = o000Var.OooOOo0();
        int iOooOOo3 = i >= 3 ? o000Var.OooOOo0() : 0;
        if (i == 4) {
            iOooOo00 = o000Var.OooOo00();
            if (!z) {
                iOooOo00 = (((iOooOo00 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) << 21) | (iOooOo00 & KotlinVersion.MAX_COMPONENT_VALUE) | (((iOooOo00 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 7) | (((iOooOo00 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) << 14);
            }
        } else {
            iOooOo00 = i == 3 ? o000Var.OooOo00() : o000Var.OooOOoo();
        }
        int iOooOo0o = iOooOo00;
        int iOooOo0O = i >= 3 ? o000Var.OooOo0O() : 0;
        if (iOooOOo0 == 0 && iOooOOo1 == 0 && iOooOOo2 == 0 && iOooOOo3 == 0 && iOooOo0o == 0 && iOooOo0O == 0) {
            o000Var.OooOoOO(o000Var.f36663OooO0OO);
            return null;
        }
        int i4 = o000Var.f36662OooO0O0 + iOooOo0o;
        if (i4 > o000Var.f36663OooO0OO) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            o000Var.OooOoOO(o000Var.f36663OooO0OO);
            return null;
        }
        if (oooO00o != null) {
            i3 = i4;
            if (!oooO00o.OooO00o(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3)) {
                o000Var.OooOoOO(i3);
                return null;
            }
        } else {
            i3 = i4;
        }
        if (i == 3) {
            z2 = (iOooOo0O & 128) != 0;
            boolean z10 = (iOooOo0O & 64) != 0;
            z7 = (iOooOo0O & 32) != 0;
            z6 = false;
            z8 = z10;
            z9 = z2;
        } else {
            if (i == 4) {
                z4 = (iOooOo0O & 64) != 0;
                z2 = (iOooOo0O & 8) != 0;
                z3 = (iOooOo0O & 4) != 0;
                z5 = (iOooOo0O & 2) != 0;
                if ((iOooOo0O & 1) != 0) {
                    z6 = z5;
                    z7 = z4;
                    z8 = z3;
                    z9 = true;
                }
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            z6 = z5;
            z7 = z4;
            z8 = z3;
            z9 = false;
        }
        if (z2 || z8) {
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            o000Var.OooOoOO(i3);
            return null;
        }
        if (z7) {
            iOooOo0o--;
            o000Var.OooOoo0(1);
        }
        if (z9) {
            iOooOo0o -= 4;
            o000Var.OooOoo0(4);
        }
        if (z6) {
            iOooOo0o = OooOo0o(o000Var, iOooOo0o);
        }
        try {
            try {
                if (iOooOOo0 == 84 && iOooOOo1 == 88 && iOooOOo2 == 88 && (i == 2 || iOooOOo3 == 88)) {
                    binaryFrame = OooOOOO(o000Var, iOooOo0o);
                } else if (iOooOOo0 == 84) {
                    binaryFrame = OooOOO(o000Var, iOooOo0o, OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3));
                } else if (iOooOOo0 == 87 && iOooOOo1 == 88 && iOooOOo2 == 88 && (i == 2 || iOooOOo3 == 88)) {
                    binaryFrame = OooOOo0(o000Var, iOooOo0o);
                } else if (iOooOOo0 == 87) {
                    binaryFrame = OooOOOo(o000Var, iOooOo0o, OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3));
                } else if (iOooOOo0 == 80 && iOooOOo1 == 82 && iOooOOo2 == 73 && iOooOOo3 == 86) {
                    binaryFrame = OooOO0o(o000Var, iOooOo0o);
                } else if (iOooOOo0 == 71 && iOooOOo1 == 69 && iOooOOo2 == 79 && (iOooOOo3 == 66 || i == 2)) {
                    binaryFrame = OooOO0(o000Var, iOooOo0o);
                } else if (i == 2) {
                    if (iOooOOo0 == 80 && iOooOOo1 == 73 && iOooOOo2 == 67) {
                        binaryFrame = OooO0o0(o000Var, iOooOo0o, i);
                    } else if (iOooOOo0 != 67 && iOooOOo1 == 79 && iOooOOo2 == 77 && (iOooOOo3 == 77 || i == 2)) {
                        binaryFrame = OooO0oo(o000Var, iOooOo0o);
                    } else if (iOooOOo0 != 67 && iOooOOo1 == 72 && iOooOOo2 == 65 && iOooOOo3 == 80) {
                        binaryFrame = OooO0o(o000Var, iOooOo0o, i, z, i2, oooO00o);
                    } else if (iOooOOo0 != 67 && iOooOOo1 == 84 && iOooOOo2 == 79 && iOooOOo3 == 67) {
                        binaryFrame = OooO0oO(o000Var, iOooOo0o, i, z, i2, oooO00o);
                    } else if (iOooOOo0 != 77 && iOooOOo1 == 76 && iOooOOo2 == 76 && iOooOOo3 == 84) {
                        binaryFrame = OooOO0O(o000Var, iOooOo0o);
                    } else {
                        String strOooOo00 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                        byte[] bArr = new byte[iOooOo0o];
                        o000Var.OooO0OO(bArr, 0, iOooOo0o);
                        binaryFrame = new BinaryFrame(strOooOo00, bArr);
                    }
                } else if (iOooOOo0 == 65 && iOooOOo1 == 80 && iOooOOo2 == 73 && iOooOOo3 == 67) {
                    binaryFrame = OooO0o0(o000Var, iOooOo0o, i);
                } else if (iOooOOo0 != 67) {
                    if (iOooOOo0 != 67) {
                        if (iOooOOo0 != 67) {
                            if (iOooOOo0 != 77) {
                                String strOooOo01 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                                byte[] bArr2 = new byte[iOooOo0o];
                                o000Var.OooO0OO(bArr2, 0, iOooOo0o);
                                binaryFrame = new BinaryFrame(strOooOo01, bArr2);
                            } else {
                                String strOooOo02 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                                byte[] bArr3 = new byte[iOooOo0o];
                                o000Var.OooO0OO(bArr3, 0, iOooOo0o);
                                binaryFrame = new BinaryFrame(strOooOo02, bArr3);
                            }
                        } else if (iOooOOo0 != 77) {
                            String strOooOo03 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                            byte[] bArr4 = new byte[iOooOo0o];
                            o000Var.OooO0OO(bArr4, 0, iOooOo0o);
                            binaryFrame = new BinaryFrame(strOooOo03, bArr4);
                        } else {
                            String strOooOo04 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                            byte[] bArr5 = new byte[iOooOo0o];
                            o000Var.OooO0OO(bArr5, 0, iOooOo0o);
                            binaryFrame = new BinaryFrame(strOooOo04, bArr5);
                        }
                    } else if (iOooOOo0 != 67) {
                        if (iOooOOo0 != 77) {
                            String strOooOo05 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                            byte[] bArr6 = new byte[iOooOo0o];
                            o000Var.OooO0OO(bArr6, 0, iOooOo0o);
                            binaryFrame = new BinaryFrame(strOooOo05, bArr6);
                        } else {
                            String strOooOo06 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                            byte[] bArr7 = new byte[iOooOo0o];
                            o000Var.OooO0OO(bArr7, 0, iOooOo0o);
                            binaryFrame = new BinaryFrame(strOooOo06, bArr7);
                        }
                    } else if (iOooOOo0 != 77) {
                        String strOooOo07 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                        byte[] bArr8 = new byte[iOooOo0o];
                        o000Var.OooO0OO(bArr8, 0, iOooOo0o);
                        binaryFrame = new BinaryFrame(strOooOo07, bArr8);
                    } else {
                        String strOooOo08 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                        byte[] bArr9 = new byte[iOooOo0o];
                        o000Var.OooO0OO(bArr9, 0, iOooOo0o);
                        binaryFrame = new BinaryFrame(strOooOo08, bArr9);
                    }
                } else if (iOooOOo0 != 67) {
                    if (iOooOOo0 != 67) {
                        if (iOooOOo0 != 77) {
                            String strOooOo09 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                            byte[] bArr10 = new byte[iOooOo0o];
                            o000Var.OooO0OO(bArr10, 0, iOooOo0o);
                            binaryFrame = new BinaryFrame(strOooOo09, bArr10);
                        } else {
                            String strOooOo010 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                            byte[] bArr11 = new byte[iOooOo0o];
                            o000Var.OooO0OO(bArr11, 0, iOooOo0o);
                            binaryFrame = new BinaryFrame(strOooOo010, bArr11);
                        }
                    } else if (iOooOOo0 != 77) {
                        String strOooOo011 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                        byte[] bArr12 = new byte[iOooOo0o];
                        o000Var.OooO0OO(bArr12, 0, iOooOo0o);
                        binaryFrame = new BinaryFrame(strOooOo011, bArr12);
                    } else {
                        String strOooOo012 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                        byte[] bArr13 = new byte[iOooOo0o];
                        o000Var.OooO0OO(bArr13, 0, iOooOo0o);
                        binaryFrame = new BinaryFrame(strOooOo012, bArr13);
                    }
                } else if (iOooOOo0 != 67) {
                    if (iOooOOo0 != 77) {
                        String strOooOo013 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                        byte[] bArr14 = new byte[iOooOo0o];
                        o000Var.OooO0OO(bArr14, 0, iOooOo0o);
                        binaryFrame = new BinaryFrame(strOooOo013, bArr14);
                    } else {
                        String strOooOo014 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                        byte[] bArr15 = new byte[iOooOo0o];
                        o000Var.OooO0OO(bArr15, 0, iOooOo0o);
                        binaryFrame = new BinaryFrame(strOooOo014, bArr15);
                    }
                } else if (iOooOOo0 != 77) {
                    String strOooOo015 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                    byte[] bArr16 = new byte[iOooOo0o];
                    o000Var.OooO0OO(bArr16, 0, iOooOo0o);
                    binaryFrame = new BinaryFrame(strOooOo015, bArr16);
                } else {
                    String strOooOo016 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                    byte[] bArr17 = new byte[iOooOo0o];
                    o000Var.OooO0OO(bArr17, 0, iOooOo0o);
                    binaryFrame = new BinaryFrame(strOooOo016, bArr17);
                }
                if (binaryFrame == null) {
                    String strOooOo017 = OooOo00(i, iOooOOo0, iOooOOo1, iOooOOo2, iOooOOo3);
                    StringBuilder sb = new StringBuilder(String.valueOf(strOooOo017).length() + 50);
                    sb.append("Failed to decode frame: id=");
                    sb.append(strOooOo017);
                    sb.append(", frameSize=");
                    sb.append(iOooOo0o);
                    str = r4;
                    try {
                        Log.w(str, sb.toString());
                    } catch (UnsupportedEncodingException unused) {
                        Log.w(str, "Unsupported character encoding");
                        o000Var.OooOoOO(i3);
                        return null;
                    }
                }
                o000Var.OooOoOO(i3);
                return binaryFrame;
            } catch (UnsupportedEncodingException unused2) {
                str = r4;
            }
        } catch (Throwable th) {
            o000Var.OooOoOO(i3);
            throw th;
        }
    }

    public static byte[] OooO0OO(byte[] bArr, int i, int i2) {
        return i2 <= i ? o000OOo0.f36744OooO0o : Arrays.copyOfRange(bArr, i, i2);
    }

    public static ChapterFrame OooO0o(o000 o000Var, int i, int i2, boolean z, int i3, @Nullable OooO00o oooO00o) throws UnsupportedEncodingException {
        int i4 = o000Var.f36662OooO0O0;
        int iOooOo0O = OooOo0O(o000Var.f36661OooO00o, i4);
        String str = new String(o000Var.f36661OooO00o, i4, iOooOo0O - i4, "ISO-8859-1");
        o000Var.OooOoOO(iOooOo0O + 1);
        int iOooO0Oo = o000Var.OooO0Oo();
        int iOooO0Oo2 = o000Var.OooO0Oo();
        long jOooOOo = o000Var.OooOOo();
        long j = jOooOOo == 4294967295L ? -1L : jOooOOo;
        long jOooOOo2 = o000Var.OooOOo();
        long j2 = jOooOOo2 == 4294967295L ? -1L : jOooOOo2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (o000Var.f36662OooO0O0 < i5) {
            Id3Frame id3FrameOooO = OooO(i2, o000Var, z, i3, oooO00o);
            if (id3FrameOooO != null) {
                arrayList.add(id3FrameOooO);
            }
        }
        return new ChapterFrame(str, iOooO0Oo, iOooO0Oo2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ApicFrame OooO0o0(o000 o000Var, int i, int i2) throws UnsupportedEncodingException {
        int iOooOo0O;
        String strConcat;
        int iOooOOo0 = o000Var.OooOOo0();
        String strOooOOoo = OooOOoo(iOooOOo0);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        o000Var.OooO0OO(bArr, 0, i3);
        if (i2 == 2) {
            String strValueOf = String.valueOf(o000OOo0.Oooo0(new String(bArr, 0, 3, "ISO-8859-1")));
            String strConcat2 = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strConcat2)) {
                strConcat2 = "image/jpeg";
            }
            strConcat = strConcat2;
            iOooOo0O = 2;
        } else {
            iOooOo0O = OooOo0O(bArr, 0);
            String strOooo0 = o000OOo0.Oooo0(new String(bArr, 0, iOooOo0O, "ISO-8859-1"));
            if (strOooo0.indexOf(47) == -1) {
                strConcat = strOooo0.length() != 0 ? "image/".concat(strOooo0) : new String("image/");
            } else {
                strConcat = strOooo0;
            }
        }
        int i4 = bArr[iOooOo0O + 1] & UByte.MAX_VALUE;
        int i5 = iOooOo0O + 2;
        int iOooOo0 = OooOo0(bArr, i5, iOooOOo0);
        return new ApicFrame(strConcat, new String(bArr, i5, iOooOo0 - i5, strOooOOoo), i4, OooO0OO(bArr, OooOOo(iOooOOo0) + iOooOo0, i3));
    }

    public static ChapterTocFrame OooO0oO(o000 o000Var, int i, int i2, boolean z, int i3, @Nullable OooO00o oooO00o) throws UnsupportedEncodingException {
        int i4 = o000Var.f36662OooO0O0;
        int iOooOo0O = OooOo0O(o000Var.f36661OooO00o, i4);
        String str = new String(o000Var.f36661OooO00o, i4, iOooOo0O - i4, "ISO-8859-1");
        o000Var.OooOoOO(iOooOo0O + 1);
        int iOooOOo0 = o000Var.OooOOo0();
        boolean z2 = (iOooOOo0 & 2) != 0;
        boolean z3 = (iOooOOo0 & 1) != 0;
        int iOooOOo1 = o000Var.OooOOo0();
        String[] strArr = new String[iOooOOo1];
        for (int i5 = 0; i5 < iOooOOo1; i5++) {
            int i6 = o000Var.f36662OooO0O0;
            int iOooOo0O2 = OooOo0O(o000Var.f36661OooO00o, i6);
            strArr[i5] = new String(o000Var.f36661OooO00o, i6, iOooOo0O2 - i6, "ISO-8859-1");
            o000Var.OooOoOO(iOooOo0O2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (o000Var.f36662OooO0O0 < i7) {
            Id3Frame id3FrameOooO = OooO(i2, o000Var, z, i3, oooO00o);
            if (id3FrameOooO != null) {
                arrayList.add(id3FrameOooO);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    public static CommentFrame OooO0oo(o000 o000Var, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int iOooOOo0 = o000Var.OooOOo0();
        String strOooOOoo = OooOOoo(iOooOOo0);
        byte[] bArr = new byte[3];
        o000Var.OooO0OO(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        o000Var.OooO0OO(bArr2, 0, i2);
        int iOooOo0 = OooOo0(bArr2, 0, iOooOOo0);
        String str2 = new String(bArr2, 0, iOooOo0, strOooOOoo);
        int iOooOOo = OooOOo(iOooOOo0) + iOooOo0;
        return new CommentFrame(str, str2, OooOOO0(bArr2, iOooOOo, OooOo0(bArr2, iOooOOo, iOooOOo0), strOooOOoo));
    }

    public static GeobFrame OooOO0(o000 o000Var, int i) throws UnsupportedEncodingException {
        int iOooOOo0 = o000Var.OooOOo0();
        String strOooOOoo = OooOOoo(iOooOOo0);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        o000Var.OooO0OO(bArr, 0, i2);
        int iOooOo0O = OooOo0O(bArr, 0);
        String str = new String(bArr, 0, iOooOo0O, "ISO-8859-1");
        int i3 = iOooOo0O + 1;
        int iOooOo0 = OooOo0(bArr, i3, iOooOOo0);
        String strOooOOO0 = OooOOO0(bArr, i3, iOooOo0, strOooOOoo);
        int iOooOOo = OooOOo(iOooOOo0) + iOooOo0;
        int iOooOo1 = OooOo0(bArr, iOooOOo, iOooOOo0);
        return new GeobFrame(str, strOooOOO0, OooOOO0(bArr, iOooOOo, iOooOo1, strOooOOoo), OooO0OO(bArr, OooOOo(iOooOOo0) + iOooOo1, i2));
    }

    public static MlltFrame OooOO0O(o000 o000Var, int i) {
        int iOooOo0O = o000Var.OooOo0O();
        int iOooOOoo = o000Var.OooOOoo();
        int iOooOOoo2 = o000Var.OooOOoo();
        int iOooOOo0 = o000Var.OooOOo0();
        int iOooOOo1 = o000Var.OooOOo0();
        o0000OO0 o0000oo1 = new o0000OO0();
        o0000oo1.OooOO0(o000Var.f36661OooO00o, o000Var.f36663OooO0OO);
        o0000oo1.OooOO0O(o000Var.f36662OooO0O0 * 8);
        int i2 = ((i - 10) * 8) / (iOooOOo0 + iOooOOo1);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iOooO0oO = o0000oo1.OooO0oO(iOooOOo0);
            int iOooO0oO2 = o0000oo1.OooO0oO(iOooOOo1);
            iArr[i3] = iOooO0oO;
            iArr2[i3] = iOooO0oO2;
        }
        return new MlltFrame(iOooOo0O, iOooOOoo, iOooOOoo2, iArr, iArr2);
    }

    public static PrivFrame OooOO0o(o000 o000Var, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        o000Var.OooO0OO(bArr, 0, i);
        int iOooOo0O = OooOo0O(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iOooOo0O, "ISO-8859-1"), OooO0OO(bArr, iOooOo0O + 1, i));
    }

    @Nullable
    public static TextInformationFrame OooOOO(o000 o000Var, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iOooOOo0 = o000Var.OooOOo0();
        String strOooOOoo = OooOOoo(iOooOOo0);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        o000Var.OooO0OO(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, OooOo0(bArr, 0, iOooOOo0), strOooOOoo));
    }

    public static String OooOOO0(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    @Nullable
    public static TextInformationFrame OooOOOO(o000 o000Var, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iOooOOo0 = o000Var.OooOOo0();
        String strOooOOoo = OooOOoo(iOooOOo0);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        o000Var.OooO0OO(bArr, 0, i2);
        int iOooOo0 = OooOo0(bArr, 0, iOooOOo0);
        String str = new String(bArr, 0, iOooOo0, strOooOOoo);
        int iOooOOo = OooOOo(iOooOOo0) + iOooOo0;
        return new TextInformationFrame("TXXX", str, OooOOO0(bArr, iOooOOo, OooOo0(bArr, iOooOOo, iOooOOo0), strOooOOoo));
    }

    public static UrlLinkFrame OooOOOo(o000 o000Var, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        o000Var.OooO0OO(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, OooOo0O(bArr, 0), "ISO-8859-1"));
    }

    public static int OooOOo(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    @Nullable
    public static UrlLinkFrame OooOOo0(o000 o000Var, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iOooOOo0 = o000Var.OooOOo0();
        String strOooOOoo = OooOOoo(iOooOOo0);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        o000Var.OooO0OO(bArr, 0, i2);
        int iOooOo0 = OooOo0(bArr, 0, iOooOOo0);
        String str = new String(bArr, 0, iOooOo0, strOooOOoo);
        int iOooOOo = OooOOo(iOooOOo0) + iOooOo0;
        return new UrlLinkFrame("WXXX", str, OooOOO0(bArr, iOooOOo, OooOo0O(bArr, iOooOOo), "ISO-8859-1"));
    }

    public static String OooOOoo(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i != 2) {
            return i != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    public static boolean OooOo(o000 o000Var, int i, int i2, boolean z) {
        int iOooOOoo;
        long jOooOOoo;
        int iOooOo0O;
        int i3;
        int i4 = o000Var.f36662OooO0O0;
        while (true) {
            try {
                boolean z2 = true;
                if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < i2) {
                    o000Var.OooOoOO(i4);
                    return true;
                }
                if (i >= 3) {
                    iOooOOoo = o000Var.OooO0Oo();
                    jOooOOoo = o000Var.OooOOo();
                    iOooOo0O = o000Var.OooOo0O();
                } else {
                    iOooOOoo = o000Var.OooOOoo();
                    jOooOOoo = o000Var.OooOOoo();
                    iOooOo0O = 0;
                }
                if (iOooOOoo == 0 && jOooOOoo == 0 && iOooOo0O == 0) {
                    o000Var.OooOoOO(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jOooOOoo) != 0) {
                        o000Var.OooOoOO(i4);
                        return false;
                    }
                    jOooOOoo = (((jOooOOoo >> 24) & 255) << 21) | (jOooOOoo & 255) | (((jOooOOoo >> 8) & 255) << 7) | (((jOooOOoo >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iOooOo0O & 64) != 0 ? 1 : 0;
                    if ((iOooOo0O & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iOooOo0O & 32) != 0 ? 1 : 0;
                        if ((iOooOo0O & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jOooOOoo < i3) {
                    o000Var.OooOoOO(i4);
                    return false;
                }
                if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < jOooOOoo) {
                    o000Var.OooOoOO(i4);
                    return false;
                }
                o000Var.OooOoo0((int) jOooOOoo);
            } catch (Throwable th) {
                o000Var.OooOoOO(i4);
                throw th;
            }
        }
    }

    public static int OooOo0(byte[] bArr, int i, int i2) {
        int iOooOo0O = OooOo0O(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iOooOo0O;
        }
        while (iOooOo0O < bArr.length - 1) {
            if (iOooOo0O % 2 == 0 && bArr[iOooOo0O + 1] == 0) {
                return iOooOo0O;
            }
            iOooOo0O = OooOo0O(bArr, iOooOo0O + 1);
        }
        return bArr.length;
    }

    public static String OooOo00(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int OooOo0O(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int OooOo0o(o000 o000Var, int i) {
        byte[] bArr = o000Var.f36661OooO00o;
        int i2 = o000Var.f36662OooO0O0;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & UByte.MAX_VALUE) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    @Override // o0O0o0.OooO
    @Nullable
    public final Metadata OooO0O0(OooO0OO oooO0OO, ByteBuffer byteBuffer) {
        return OooO0Oo(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6 A[SYNTHETIC] */
    @Nullable
    public final Metadata OooO0Oo(byte[] bArr, int i) {
        boolean z;
        OooO0O0 oooO0O0;
        int i2;
        int iOooOo0o;
        Id3Frame id3FrameOooO;
        ArrayList arrayList = new ArrayList();
        o000 o000Var = new o000(bArr, i);
        boolean z2 = false;
        if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iOooOOoo = o000Var.OooOOoo();
            if (iOooOOoo == 4801587) {
                int iOooOOo0 = o000Var.OooOOo0();
                o000Var.OooOoo0(1);
                int iOooOOo1 = o000Var.OooOOo0();
                int iOooOOOo = o000Var.OooOOOo();
                if (iOooOOo0 == 2) {
                    if ((iOooOOo1 & 64) != 0) {
                        Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    } else {
                        if (iOooOOo0 < 4 || (iOooOOo1 & 128) == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        oooO0O0 = new OooO0O0(iOooOOo0, z, iOooOOOo);
                    }
                } else {
                    if (iOooOOo0 == 3) {
                        if ((iOooOOo1 & 64) != 0) {
                            int iOooO0Oo = o000Var.OooO0Oo();
                            o000Var.OooOoo0(iOooO0Oo);
                            iOooOOOo -= iOooO0Oo + 4;
                        }
                    } else if (iOooOOo0 == 4) {
                        if ((iOooOOo1 & 64) != 0) {
                            int iOooOOOo2 = o000Var.OooOOOo();
                            o000Var.OooOoo0(iOooOOOo2 - 4);
                            iOooOOOo -= iOooOOOo2;
                        }
                        if ((iOooOOo1 & 16) != 0) {
                            iOooOOOo -= 10;
                        }
                    } else {
                        o00O00O.OooO0OO.OooO0O0(57, "Skipped ID3 tag with unsupported majorVersion=", iOooOOo0, "Id3Decoder");
                    }
                    if (iOooOOo0 < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    oooO0O0 = new OooO0O0(iOooOOo0, z, iOooOOOo);
                }
                if (oooO0O0 == null) {
                    return null;
                }
                int i3 = o000Var.f36662OooO0O0;
                i2 = oooO0O0.f36254OooO00o == 2 ? 6 : 10;
                iOooOo0o = oooO0O0.f36256OooO0OO;
                if (oooO0O0.f36255OooO0O0) {
                    iOooOo0o = OooOo0o(o000Var, iOooOo0o);
                }
                o000Var.OooOoO(i3 + iOooOo0o);
                if (!OooOo(o000Var, oooO0O0.f36254OooO00o, i2, false)) {
                    if (oooO0O0.f36254OooO00o == 4 || !OooOo(o000Var, 4, i2, true)) {
                        o00O00O.OooO0OO.OooO0O0(56, "Failed to validate ID3 tag with majorVersion=", oooO0O0.f36254OooO00o, "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 >= i2) {
                    id3FrameOooO = OooO(oooO0O0.f36254OooO00o, o000Var, z2, i2, this.f36253OooO00o);
                    if (id3FrameOooO != null) {
                        arrayList.add(id3FrameOooO);
                    }
                }
                return new Metadata(arrayList);
            }
            String strValueOf = String.valueOf(String.format("%06X", Integer.valueOf(iOooOOoo)));
            Log.w("Id3Decoder", strValueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(strValueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
        }
        oooO0O0 = null;
        if (oooO0O0 == null) {
            return null;
        }
        int i4 = o000Var.f36662OooO0O0;
        if (oooO0O0.f36254OooO00o == 2) {
        }
        iOooOo0o = oooO0O0.f36256OooO0OO;
        if (oooO0O0.f36255OooO0O0) {
            iOooOo0o = OooOo0o(o000Var, iOooOo0o);
        }
        o000Var.OooOoO(i4 + iOooOo0o);
        if (!OooOo(o000Var, oooO0O0.f36254OooO00o, i2, false)) {
            if (oooO0O0.f36254OooO00o == 4) {
            }
            o00O00O.OooO0OO.OooO0O0(56, "Failed to validate ID3 tag with majorVersion=", oooO0O0.f36254OooO00o, "Id3Decoder");
            return null;
        }
        while (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 >= i2) {
            id3FrameOooO = OooO(oooO0O0.f36254OooO00o, o000Var, z2, i2, this.f36253OooO00o);
            if (id3FrameOooO != null) {
                arrayList.add(id3FrameOooO);
            }
        }
        return new Metadata(arrayList);
    }

    public OooO(@Nullable OooO00o oooO00o) {
        this.f36253OooO00o = oooO00o;
    }
}
