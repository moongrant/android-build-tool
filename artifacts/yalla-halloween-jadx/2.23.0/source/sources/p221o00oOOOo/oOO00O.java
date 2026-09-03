package p221o00oOOOo;

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
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.OooO;
import com.google.common.base.OooO0OO;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
import p101o000oo.Oooo000;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p636o0ooOO.O0000000;
import p636o0ooOO.O0OO00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oOO00O extends O0OO00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O00O f39748OooO0O0 = new o00O00O();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO00o f39749OooO00o;

    public interface OooO00o {
        boolean OooO00o(int i, int i2, int i3, int i4, int i5);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f39750OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f39751OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f39752OooO0OO;

        public OooO0O0(int i, boolean z, int i2) {
            this.f39750OooO00o = i;
            this.f39751OooO0O0 = z;
            this.f39752OooO0OO = i2;
        }
    }

    public oOO00O(@Nullable OooO00o oooO00o) {
        this.f39749OooO00o = oooO00o;
    }

    public static GeobFrame OooO(int i, o00Oo00 o00oo00) {
        int iOooOo0O = o00oo00.OooOo0O();
        Charset charsetOooOOO = OooOOO(iOooOo0O);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        o00oo00.OooO0Oo(0, i2, bArr);
        int iOooOOo0 = OooOOo0(0, bArr);
        String str = new String(bArr, 0, iOooOOo0, OooO.f19058OooO0O0);
        int i3 = iOooOOo0 + 1;
        int iOooOOOo = OooOOOo(i3, iOooOo0O, bArr);
        String strOooOO0O = OooOO0O(bArr, i3, iOooOOOo, charsetOooOOO);
        int iOooOOO0 = OooOOO0(iOooOo0O) + iOooOOOo;
        int iOooOOOo2 = OooOOOo(iOooOOO0, iOooOo0O, bArr);
        String strOooOO0O2 = OooOO0O(bArr, iOooOOO0, iOooOOOo2, charsetOooOOO);
        int iOooOOO1 = OooOOO0(iOooOo0O) + iOooOOOo2;
        return new GeobFrame(str, strOooOO0O, i2 <= iOooOOO1 ? o0O00.f40599OooO0o : Arrays.copyOfRange(bArr, iOooOOO1, i2), strOooOO0O2);
    }

    public static ApicFrame OooO0Oo(int i, int i2, o00Oo00 o00oo00) {
        int iOooOOo0;
        String strConcat;
        int iOooOo0O = o00oo00.OooOo0O();
        Charset charsetOooOOO = OooOOO(iOooOo0O);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        o00oo00.OooO0Oo(0, i3, bArr);
        if (i2 == 2) {
            String str = "image/" + OooO0OO.OooO0O0(new String(bArr, 0, 3, OooO.f19058OooO0O0));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strConcat = str;
            iOooOOo0 = 2;
        } else {
            iOooOOo0 = OooOOo0(0, bArr);
            String strOooO0O0 = OooO0OO.OooO0O0(new String(bArr, 0, iOooOOo0, OooO.f19058OooO0O0));
            strConcat = strOooO0O0.indexOf(47) == -1 ? "image/".concat(strOooO0O0) : strOooO0O0;
        }
        int i4 = bArr[iOooOOo0 + 1] & UByte.MAX_VALUE;
        int i5 = iOooOOo0 + 2;
        int iOooOOOo = OooOOOo(i5, iOooOo0O, bArr);
        String str2 = new String(bArr, i5, iOooOOOo - i5, charsetOooOOO);
        int iOooOOO0 = OooOOO0(iOooOo0O) + iOooOOOo;
        return new ApicFrame(strConcat, str2, i4, i3 <= iOooOOO0 ? o0O00.f40599OooO0o : Arrays.copyOfRange(bArr, iOooOOO0, i3));
    }

    public static ChapterTocFrame OooO0o(o00Oo00 o00oo00, int i, int i2, boolean z, int i3, @Nullable OooO00o oooO00o) {
        int i4 = o00oo00.f40592OooO0O0;
        int iOooOOo0 = OooOOo0(i4, o00oo00.f40591OooO00o);
        String str = new String(o00oo00.f40591OooO00o, i4, iOooOOo0 - i4, OooO.f19058OooO0O0);
        o00oo00.Oooo00O(iOooOOo0 + 1);
        int iOooOo0O = o00oo00.OooOo0O();
        boolean z2 = (iOooOo0O & 2) != 0;
        boolean z3 = (iOooOo0O & 1) != 0;
        int iOooOo0O2 = o00oo00.OooOo0O();
        String[] strArr = new String[iOooOo0O2];
        for (int i5 = 0; i5 < iOooOo0O2; i5++) {
            int i6 = o00oo00.f40592OooO0O0;
            int iOooOOo1 = OooOOo0(i6, o00oo00.f40591OooO00o);
            strArr[i5] = new String(o00oo00.f40591OooO00o, i6, iOooOOo1 - i6, OooO.f19058OooO0O0);
            o00oo00.Oooo00O(iOooOOo1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (o00oo00.f40592OooO0O0 < i7) {
            Id3Frame id3FrameOooO0oo = OooO0oo(i2, o00oo00, z, i3, oooO00o);
            if (id3FrameOooO0oo != null) {
                arrayList.add(id3FrameOooO0oo);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterFrame OooO0o0(o00Oo00 o00oo00, int i, int i2, boolean z, int i3, @Nullable OooO00o oooO00o) {
        int i4 = o00oo00.f40592OooO0O0;
        int iOooOOo0 = OooOOo0(i4, o00oo00.f40591OooO00o);
        String str = new String(o00oo00.f40591OooO00o, i4, iOooOOo0 - i4, OooO.f19058OooO0O0);
        o00oo00.Oooo00O(iOooOOo0 + 1);
        int iOooO0o = o00oo00.OooO0o();
        int iOooO0o2 = o00oo00.OooO0o();
        long jOooOo0o = o00oo00.OooOo0o();
        long j = jOooOo0o == 4294967295L ? -1L : jOooOo0o;
        long jOooOo0o2 = o00oo00.OooOo0o();
        long j2 = jOooOo0o2 == 4294967295L ? -1L : jOooOo0o2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (o00oo00.f40592OooO0O0 < i5) {
            Id3Frame id3FrameOooO0oo = OooO0oo(i2, o00oo00, z, i3, oooO00o);
            if (id3FrameOooO0oo != null) {
                arrayList.add(id3FrameOooO0oo);
            }
        }
        return new ChapterFrame(str, iOooO0o, iOooO0o2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    public static CommentFrame OooO0oO(int i, o00Oo00 o00oo00) {
        if (i < 4) {
            return null;
        }
        int iOooOo0O = o00oo00.OooOo0O();
        Charset charsetOooOOO = OooOOO(iOooOo0O);
        byte[] bArr = new byte[3];
        o00oo00.OooO0Oo(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        o00oo00.OooO0Oo(0, i2, bArr2);
        int iOooOOOo = OooOOOo(0, iOooOo0O, bArr2);
        String str2 = new String(bArr2, 0, iOooOOOo, charsetOooOOO);
        int iOooOOO0 = OooOOO0(iOooOo0O) + iOooOOOo;
        return new CommentFrame(str, str2, OooOO0O(bArr2, iOooOOO0, OooOOOo(iOooOOO0, iOooOo0O, bArr2), charsetOooOOO));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0178  */
    /* JADX WARN: Code duplicated, block: B:146:0x022e  */
    /* JADX WARN: Code duplicated, block: B:153:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0241  */
    /* JADX WARN: Code duplicated, block: B:159:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0273  */
    /* JADX WARN: Code duplicated, block: B:170:0x0280 A[Catch: all -> 0x0147, TryCatch #0 {all -> 0x0147, blocks: (B:94:0x011c, B:172:0x0291, B:98:0x014c, B:101:0x0153, B:110:0x017b, B:112:0x01ad, B:121:0x01da, B:123:0x01ee, B:125:0x01f5, B:124:0x01f1, B:134:0x020d, B:145:0x0228, B:152:0x023a, B:158:0x0249, B:163:0x0261, B:169:0x027b, B:170:0x0280), top: B:179:0x010f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    @Nullable
    public static Id3Frame OooO0oo(int i, o00Oo00 o00oo00, boolean z, int i2, @Nullable OooO00o oooO00o) {
        int iOooOoO0;
        int i3;
        ?? r15;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        MlltFrame mlltFrameOooOO0;
        ChapterTocFrame chapterTocFrameOooO0o;
        ChapterFrame chapterFrameOooO0o0;
        Id3Frame privFrame;
        TextInformationFrame textInformationFrame;
        ?? binaryFrame;
        int iOooOo0O = o00oo00.OooOo0O();
        int iOooOo0O2 = o00oo00.OooOo0O();
        int iOooOo0O3 = o00oo00.OooOo0O();
        int iOooOo0O4 = i >= 3 ? o00oo00.OooOo0O() : 0;
        if (i == 4) {
            iOooOoO0 = o00oo00.OooOoO0();
            if (!z) {
                iOooOoO0 = (((iOooOoO0 >> 24) & 255) << 21) | (iOooOoO0 & 255) | (((iOooOoO0 >> 8) & 255) << 7) | (((iOooOoO0 >> 16) & 255) << 14);
            }
        } else {
            iOooOoO0 = i == 3 ? o00oo00.OooOoO0() : o00oo00.OooOo();
        }
        int i4 = iOooOoO0;
        int iOooOoOO = i >= 3 ? o00oo00.OooOoOO() : 0;
        if (iOooOo0O == 0 && iOooOo0O2 == 0 && iOooOo0O3 == 0 && iOooOo0O4 == 0 && i4 == 0 && iOooOoOO == 0) {
            o00oo00.Oooo00O(o00oo00.f40593OooO0OO);
            return null;
        }
        int i5 = o00oo00.f40592OooO0O0 + i4;
        if (i5 > o00oo00.f40593OooO0OO) {
            Log.OooO0o("Id3Decoder", "Frame size exceeds remaining tag data");
            o00oo00.Oooo00O(o00oo00.f40593OooO0OO);
            return null;
        }
        if (oooO00o != null) {
            i3 = i5;
            r15 = 0;
            if (!oooO00o.OooO00o(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4)) {
                o00oo00.Oooo00O(i3);
                return null;
            }
        } else {
            i3 = i5;
            r15 = 0;
        }
        if (i != 3) {
            int i6 = iOooOoOO;
            if (i == 4) {
                z6 = (i6 & 64) != 0;
                z7 = (i6 & 8) != 0;
                z8 = (i6 & 4) != 0;
                z9 = (i6 & 2) != 0;
                z10 = (i6 & 1) != 0;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (!z7 || z8) {
                Log.OooO0o("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                o00oo00.Oooo00O(i3);
                return r15;
            }
            if (z6) {
                i4--;
                o00oo00.Oooo00o(1);
            }
            if (z10) {
                i4 -= 4;
                o00oo00.Oooo00o(4);
            }
            int iOooOOo = i4;
            if (z9) {
                iOooOOo = OooOOo(iOooOOo, o00oo00);
            }
            int i7 = iOooOOo;
            try {
                if (iOooOo0O == 84 && iOooOo0O2 == 88 && iOooOo0O3 == 88 && (i == 2 || iOooOo0O4 == 88)) {
                    if (i7 < 1) {
                        binaryFrame = r15;
                    } else {
                        int iOooOo0O5 = o00oo00.OooOo0O();
                        int i8 = i7 - 1;
                        byte[] bArr = new byte[i8];
                        o00oo00.OooO0Oo(0, i8, bArr);
                        int iOooOOOo = OooOOOo(0, iOooOo0O5, bArr);
                        privFrame = new TextInformationFrame("TXXX", new String(bArr, 0, iOooOOOo, OooOOO(iOooOo0O5)), OooOO0o(iOooOo0O5, OooOOO0(iOooOo0O5) + iOooOOOo, bArr));
                        binaryFrame = privFrame;
                    }
                } else if (iOooOo0O == 84) {
                    String strOooOOOO = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                    if (i7 < 1) {
                        binaryFrame = r15;
                    } else {
                        int iOooOo0O6 = o00oo00.OooOo0O();
                        int i9 = i7 - 1;
                        byte[] bArr2 = new byte[i9];
                        o00oo00.OooO0Oo(0, i9, bArr2);
                        textInformationFrame = new TextInformationFrame(strOooOOOO, r15, OooOO0o(iOooOo0O6, 0, bArr2));
                    }
                } else {
                    if (iOooOo0O == 87 && iOooOo0O2 == 88 && iOooOo0O3 == 88 && (i == 2 || iOooOo0O4 == 88)) {
                        if (i7 < 1) {
                            binaryFrame = r15;
                        } else {
                            int iOooOo0O7 = o00oo00.OooOo0O();
                            int i10 = i7 - 1;
                            byte[] bArr3 = new byte[i10];
                            o00oo00.OooO0Oo(0, i10, bArr3);
                            int iOooOOOo2 = OooOOOo(0, iOooOo0O7, bArr3);
                            String str = new String(bArr3, 0, iOooOOOo2, OooOOO(iOooOo0O7));
                            int iOooOOO0 = OooOOO0(iOooOo0O7) + iOooOOOo2;
                            privFrame = new UrlLinkFrame("WXXX", str, OooOO0O(bArr3, iOooOOO0, OooOOo0(iOooOOO0, bArr3), OooO.f19058OooO0O0));
                        }
                    } else if (iOooOo0O == 87) {
                        String strOooOOOO2 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                        byte[] bArr4 = new byte[i7];
                        o00oo00.OooO0Oo(0, i7, bArr4);
                        privFrame = new UrlLinkFrame(strOooOOOO2, r15, new String(bArr4, 0, OooOOo0(0, bArr4), OooO.f19058OooO0O0));
                    } else if (iOooOo0O == 80 && iOooOo0O2 == 82 && iOooOo0O3 == 73 && iOooOo0O4 == 86) {
                        byte[] bArr5 = new byte[i7];
                        o00oo00.OooO0Oo(0, i7, bArr5);
                        int iOooOOo0 = OooOOo0(0, bArr5);
                        String str2 = new String(bArr5, 0, iOooOOo0, OooO.f19058OooO0O0);
                        int i11 = iOooOOo0 + 1;
                        privFrame = new PrivFrame(str2, i7 <= i11 ? o0O00.f40599OooO0o : Arrays.copyOfRange(bArr5, i11, i7));
                    } else if (iOooOo0O == 71 && iOooOo0O2 == 69 && iOooOo0O3 == 79 && (iOooOo0O4 == 66 || i == 2)) {
                        binaryFrame = OooO(i7, o00oo00);
                    } else if (i == 2) {
                        if (iOooOo0O == 80 && iOooOo0O2 == 73 && iOooOo0O3 == 67) {
                            binaryFrame = OooO0Oo(i7, i, o00oo00);
                        } else if (iOooOo0O != 67 && iOooOo0O2 == 79 && iOooOo0O3 == 77 && (iOooOo0O4 == 77 || i == 2)) {
                            binaryFrame = OooO0oO(i7, o00oo00);
                        } else if (iOooOo0O != 67 && iOooOo0O2 == 72 && iOooOo0O3 == 65 && iOooOo0O4 == 80) {
                            chapterFrameOooO0o0 = OooO0o0(o00oo00, i7, i, z, i2, oooO00o);
                        } else if (iOooOo0O != 67 && iOooOo0O2 == 84 && iOooOo0O3 == 79 && iOooOo0O4 == 67) {
                            chapterTocFrameOooO0o = OooO0o(o00oo00, i7, i, z, i2, oooO00o);
                        } else if (iOooOo0O != 77 && iOooOo0O2 == 76 && iOooOo0O3 == 76 && iOooOo0O4 == 84) {
                            mlltFrameOooOO0 = OooOO0(i7, o00oo00);
                        } else {
                            String strOooOOOO3 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                            byte[] bArr6 = new byte[i7];
                            o00oo00.OooO0Oo(0, i7, bArr6);
                            binaryFrame = new BinaryFrame(strOooOOOO3, bArr6);
                        }
                    } else if (iOooOo0O == 65 && iOooOo0O2 == 80 && iOooOo0O3 == 73 && iOooOo0O4 == 67) {
                        binaryFrame = OooO0Oo(i7, i, o00oo00);
                    } else if (iOooOo0O != 67) {
                        if (iOooOo0O != 67) {
                            if (iOooOo0O != 67) {
                                if (iOooOo0O != 77) {
                                    String strOooOOOO4 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                                    byte[] bArr7 = new byte[i7];
                                    o00oo00.OooO0Oo(0, i7, bArr7);
                                    binaryFrame = new BinaryFrame(strOooOOOO4, bArr7);
                                } else {
                                    String strOooOOOO5 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                                    byte[] bArr8 = new byte[i7];
                                    o00oo00.OooO0Oo(0, i7, bArr8);
                                    binaryFrame = new BinaryFrame(strOooOOOO5, bArr8);
                                }
                            } else if (iOooOo0O != 77) {
                                String strOooOOOO6 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                                byte[] bArr9 = new byte[i7];
                                o00oo00.OooO0Oo(0, i7, bArr9);
                                binaryFrame = new BinaryFrame(strOooOOOO6, bArr9);
                            } else {
                                String strOooOOOO7 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                                byte[] bArr10 = new byte[i7];
                                o00oo00.OooO0Oo(0, i7, bArr10);
                                binaryFrame = new BinaryFrame(strOooOOOO7, bArr10);
                            }
                        } else if (iOooOo0O != 67) {
                            if (iOooOo0O != 77) {
                                String strOooOOOO8 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                                byte[] bArr11 = new byte[i7];
                                o00oo00.OooO0Oo(0, i7, bArr11);
                                binaryFrame = new BinaryFrame(strOooOOOO8, bArr11);
                            } else {
                                String strOooOOOO9 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                                byte[] bArr12 = new byte[i7];
                                o00oo00.OooO0Oo(0, i7, bArr12);
                                binaryFrame = new BinaryFrame(strOooOOOO9, bArr12);
                            }
                        } else if (iOooOo0O != 77) {
                            String strOooOOOO10 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                            byte[] bArr13 = new byte[i7];
                            o00oo00.OooO0Oo(0, i7, bArr13);
                            binaryFrame = new BinaryFrame(strOooOOOO10, bArr13);
                        } else {
                            String strOooOOOO11 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                            byte[] bArr14 = new byte[i7];
                            o00oo00.OooO0Oo(0, i7, bArr14);
                            binaryFrame = new BinaryFrame(strOooOOOO11, bArr14);
                        }
                    } else if (iOooOo0O != 67) {
                        if (iOooOo0O != 67) {
                            if (iOooOo0O != 77) {
                                String strOooOOOO12 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                                byte[] bArr15 = new byte[i7];
                                o00oo00.OooO0Oo(0, i7, bArr15);
                                binaryFrame = new BinaryFrame(strOooOOOO12, bArr15);
                            } else {
                                String strOooOOOO13 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                                byte[] bArr16 = new byte[i7];
                                o00oo00.OooO0Oo(0, i7, bArr16);
                                binaryFrame = new BinaryFrame(strOooOOOO13, bArr16);
                            }
                        } else if (iOooOo0O != 77) {
                            String strOooOOOO14 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                            byte[] bArr17 = new byte[i7];
                            o00oo00.OooO0Oo(0, i7, bArr17);
                            binaryFrame = new BinaryFrame(strOooOOOO14, bArr17);
                        } else {
                            String strOooOOOO15 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                            byte[] bArr18 = new byte[i7];
                            o00oo00.OooO0Oo(0, i7, bArr18);
                            binaryFrame = new BinaryFrame(strOooOOOO15, bArr18);
                        }
                    } else if (iOooOo0O != 67) {
                        if (iOooOo0O != 77) {
                            String strOooOOOO16 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                            byte[] bArr19 = new byte[i7];
                            o00oo00.OooO0Oo(0, i7, bArr19);
                            binaryFrame = new BinaryFrame(strOooOOOO16, bArr19);
                        } else {
                            String strOooOOOO17 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                            byte[] bArr110 = new byte[i7];
                            o00oo00.OooO0Oo(0, i7, bArr110);
                            binaryFrame = new BinaryFrame(strOooOOOO17, bArr110);
                        }
                    } else if (iOooOo0O != 77) {
                        String strOooOOOO18 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                        byte[] bArr111 = new byte[i7];
                        o00oo00.OooO0Oo(0, i7, bArr111);
                        binaryFrame = new BinaryFrame(strOooOOOO18, bArr111);
                    } else {
                        String strOooOOOO19 = OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4);
                        byte[] bArr112 = new byte[i7];
                        o00oo00.OooO0Oo(0, i7, bArr112);
                        binaryFrame = new BinaryFrame(strOooOOOO19, bArr112);
                    }
                    binaryFrame = privFrame;
                }
                if (binaryFrame == 0) {
                    binaryFrame = mlltFrameOooOO0;
                    binaryFrame = chapterTocFrameOooO0o;
                    binaryFrame = chapterFrameOooO0o0;
                    binaryFrame = textInformationFrame;
                    Log.OooO0o("Id3Decoder", "Failed to decode frame: id=" + OooOOOO(i, iOooOo0O, iOooOo0O2, iOooOo0O3, iOooOo0O4) + ", frameSize=" + i7);
                }
                binaryFrame = mlltFrameOooOO0;
                binaryFrame = chapterTocFrameOooO0o;
                binaryFrame = chapterFrameOooO0o0;
                binaryFrame = textInformationFrame;
                o00oo00.Oooo00O(i3);
                return binaryFrame;
            } catch (Throwable th) {
                o00oo00.Oooo00O(i3);
                throw th;
            }
        }
        int i12 = iOooOoOO;
        z3 = (i12 & 128) != 0;
        z4 = (i12 & 64) != 0;
        z2 = (i12 & 32) != 0;
        z5 = z3;
        z9 = false;
        boolean z11 = z3;
        z6 = z2;
        z10 = z5;
        z8 = z4;
        z7 = z11;
        if (z7) {
        }
        Log.OooO0o("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
        o00oo00.Oooo00O(i3);
        return r15;
    }

    public static MlltFrame OooOO0(int i, o00Oo00 o00oo00) {
        int iOooOoOO = o00oo00.OooOoOO();
        int iOooOo = o00oo00.OooOo();
        int iOooOo2 = o00oo00.OooOo();
        int iOooOo0O = o00oo00.OooOo0O();
        int iOooOo0O2 = o00oo00.OooOo0O();
        o00OOOOo o00ooooo2 = new o00OOOOo();
        o00ooooo2.OooOO0(o00oo00.f40593OooO0OO, o00oo00.f40591OooO00o);
        o00ooooo2.OooOO0O(o00oo00.f40592OooO0O0 * 8);
        int i2 = ((i - 10) * 8) / (iOooOo0O + iOooOo0O2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iOooO0oO = o00ooooo2.OooO0oO(iOooOo0O);
            int iOooO0oO2 = o00ooooo2.OooO0oO(iOooOo0O2);
            iArr[i3] = iOooO0oO;
            iArr2[i3] = iOooO0oO2;
        }
        return new MlltFrame(iOooOoOO, iOooOo, iArr, iArr2, iOooOo2);
    }

    public static String OooOO0O(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static com.google.common.collect.o0O00 OooOO0o(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return ImmutableList.OooOOOo("");
        }
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        int iOooOOOo = OooOOOo(i2, i, bArr);
        while (i2 < iOooOOOo) {
            oooO00o.OooO0OO(new String(bArr, i2, iOooOOOo - i2, OooOOO(i)));
            i2 = OooOOO0(i) + iOooOOOo;
            iOooOOOo = OooOOOo(i2, i, bArr);
        }
        com.google.common.collect.o0O00 o0o00OooO0oo = oooO00o.OooO0oo();
        return o0o00OooO0oo.isEmpty() ? ImmutableList.OooOOOo("") : o0o00OooO0oo;
    }

    public static Charset OooOOO(int i) {
        if (i == 1) {
            return OooO.f19061OooO0o;
        }
        if (i != 2) {
            return i != 3 ? OooO.f19058OooO0O0 : OooO.f19059OooO0OO;
        }
        return OooO.f19060OooO0Oo;
    }

    public static int OooOOO0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String OooOOOO(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int OooOOOo(int i, int i2, byte[] bArr) {
        int iOooOOo0 = OooOOo0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iOooOOo0;
        }
        while (iOooOOo0 < bArr.length - 1) {
            if ((iOooOOo0 - i) % 2 == 0 && bArr[iOooOOo0 + 1] == 0) {
                return iOooOOo0;
            }
            iOooOOo0 = OooOOo0(iOooOOo0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int OooOOo(int i, o00Oo00 o00oo00) {
        byte[] bArr = o00oo00.f40591OooO00o;
        int i2 = o00oo00.f40592OooO0O0;
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

    public static int OooOOo0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[PHI: r3
      0x0086: PHI (r3v18 int) = (r3v6 int), (r3v21 int) binds: [B:39:0x0083, B:31:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean OooOOoo(o00Oo00 o00oo00, int i, int i2, boolean z) {
        int iOooOo;
        long jOooOo;
        int iOooOoOO;
        int i3;
        int i4 = o00oo00.f40592OooO0O0;
        while (true) {
            try {
                boolean z2 = true;
                if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < i2) {
                    o00oo00.Oooo00O(i4);
                    return true;
                }
                if (i >= 3) {
                    iOooOo = o00oo00.OooO0o();
                    jOooOo = o00oo00.OooOo0o();
                    iOooOoOO = o00oo00.OooOoOO();
                } else {
                    iOooOo = o00oo00.OooOo();
                    jOooOo = o00oo00.OooOo();
                    iOooOoOO = 0;
                }
                if (iOooOo == 0 && jOooOo == 0 && iOooOoOO == 0) {
                    o00oo00.Oooo00O(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jOooOo) != 0) {
                        o00oo00.Oooo00O(i4);
                        return false;
                    }
                    jOooOo = (((jOooOo >> 24) & 255) << 21) | (jOooOo & 255) | (((jOooOo >> 8) & 255) << 7) | (((jOooOo >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iOooOoOO & 64) != 0 ? 1 : 0;
                    if ((iOooOoOO & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iOooOoOO & 32) != 0 ? 1 : 0;
                    if ((iOooOoOO & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jOooOo < i3) {
                    o00oo00.Oooo00O(i4);
                    return false;
                }
                if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < jOooOo) {
                    o00oo00.Oooo00O(i4);
                    return false;
                }
                o00oo00.Oooo00o((int) jOooOo);
            } catch (Throwable th) {
                o00oo00.Oooo00O(i4);
                throw th;
            }
        }
    }

    @Override // p636o0ooOO.O0OO00
    @Nullable
    public final Metadata OooO0O0(O0000000 o0000000, ByteBuffer byteBuffer) {
        return OooO0OO(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4 A[SYNTHETIC] */
    @Nullable
    public final Metadata OooO0OO(int i, byte[] bArr) {
        boolean z;
        OooO0O0 oooO0O0;
        int i2;
        int i3;
        int iOooOOo;
        Id3Frame id3FrameOooO0oo;
        ArrayList arrayList = new ArrayList();
        o00Oo00 o00oo00 = new o00Oo00(bArr, i);
        boolean z2 = true;
        if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 10) {
            Log.OooO0o("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iOooOo = o00oo00.OooOo();
            if (iOooOo == 4801587) {
                int iOooOo0O = o00oo00.OooOo0O();
                o00oo00.Oooo00o(1);
                int iOooOo0O2 = o00oo00.OooOo0O();
                int iOooOo0 = o00oo00.OooOo0();
                if (iOooOo0O == 2) {
                    if ((iOooOo0O2 & 64) != 0) {
                        Log.OooO0o("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    } else {
                        if (iOooOo0O < 4 || (iOooOo0O2 & 128) == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        oooO0O0 = new OooO0O0(iOooOo0O, z, iOooOo0);
                    }
                } else {
                    if (iOooOo0O == 3) {
                        if ((iOooOo0O2 & 64) != 0) {
                            int iOooO0o = o00oo00.OooO0o();
                            o00oo00.Oooo00o(iOooO0o);
                            iOooOo0 -= iOooO0o + 4;
                        }
                    } else if (iOooOo0O == 4) {
                        if ((iOooOo0O2 & 64) != 0) {
                            int iOooOo1 = o00oo00.OooOo0();
                            o00oo00.Oooo00o(iOooOo1 - 4);
                            iOooOo0 -= iOooOo1;
                        }
                        if ((iOooOo0O2 & 16) != 0) {
                            iOooOo0 -= 10;
                        }
                    } else {
                        Oooo000.OooO0O0("Skipped ID3 tag with unsupported majorVersion=", iOooOo0O, "Id3Decoder");
                    }
                    if (iOooOo0O < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    oooO0O0 = new OooO0O0(iOooOo0O, z, iOooOo0);
                }
                if (oooO0O0 == null) {
                    return null;
                }
                int i4 = o00oo00.f40592OooO0O0;
                i2 = oooO0O0.f39750OooO00o;
                i3 = i2 == 2 ? 6 : 10;
                iOooOOo = oooO0O0.f39752OooO0OO;
                if (oooO0O0.f39751OooO0O0) {
                    iOooOOo = OooOOo(iOooOOo, o00oo00);
                }
                o00oo00.Oooo000(i4 + iOooOOo);
                if (OooOOoo(o00oo00, i2, i3, false)) {
                    z2 = false;
                } else if (i2 == 4 || !OooOOoo(o00oo00, 4, i3, true)) {
                    Oooo000.OooO0O0("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
                    return null;
                }
                while (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 >= i3) {
                    id3FrameOooO0oo = OooO0oo(i2, o00oo00, z2, i3, this.f39749OooO00o);
                    if (id3FrameOooO0oo != null) {
                        arrayList.add(id3FrameOooO0oo);
                    }
                }
                return new Metadata(arrayList);
            }
            Log.OooO0o("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iOooOo)));
        }
        oooO0O0 = null;
        if (oooO0O0 == null) {
            return null;
        }
        int i5 = o00oo00.f40592OooO0O0;
        i2 = oooO0O0.f39750OooO00o;
        if (i2 == 2) {
        }
        iOooOOo = oooO0O0.f39752OooO0OO;
        if (oooO0O0.f39751OooO0O0) {
            iOooOOo = OooOOo(iOooOOo, o00oo00);
        }
        o00oo00.Oooo000(i5 + iOooOOo);
        if (OooOOoo(o00oo00, i2, i3, false)) {
            if (i2 == 4) {
            }
            Oooo000.OooO0O0("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
            return null;
        }
        z2 = false;
        while (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 >= i3) {
            id3FrameOooO0oo = OooO0oo(i2, o00oo00, z2, i3, this.f39749OooO00o);
            if (id3FrameOooO0oo != null) {
                arrayList.add(id3FrameOooO0oo);
            }
        }
        return new Metadata(arrayList);
    }
}
