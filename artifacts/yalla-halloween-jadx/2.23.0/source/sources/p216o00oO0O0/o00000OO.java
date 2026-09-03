package p216o00oO0O0;

import android.util.Pair;
import androidx.compose.animation.core.AnimationKt;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import io.agora.rtc.Constants;
import java.io.IOException;
import kotlin.UByte;
import o000O00.o000000O;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00000OO implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O0O0 f39704OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f39705OooO0O0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0O0 f39709OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39706OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f39707OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f39708OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f39710OooO0oO = -1;

    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f39713OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O0O0 f39714OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TrackOutput f39715OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0000Ooo f39716OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f39717OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o00Oo00 f39718OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final byte[] f39719OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f39720OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final OooOo f39721OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f39722OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f39723OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f39724OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final int[] f39712OooOOO0 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final int[] f39711OooOOO = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 143, Constants.ERR_MODULE_NOT_FOUND, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        public OooO00o(o00O0O0 o00o0o0, TrackOutput trackOutput, o0000Ooo o0000ooo) throws ParserException {
            this.f39714OooO00o = o00o0o0;
            this.f39715OooO0O0 = trackOutput;
            this.f39716OooO0OO = o0000ooo;
            int i = o0000ooo.f39739OooO0O0;
            int iMax = Math.max(1, i / 10);
            this.f39720OooO0oO = iMax;
            o00Oo00 o00oo00 = new o00Oo00(o0000ooo.f39742OooO0o0);
            o00oo00.OooOOO();
            int iOooOOO = o00oo00.OooOOO();
            this.f39717OooO0Oo = iOooOOO;
            int i2 = o0000ooo.f39738OooO00o;
            int i3 = o0000ooo.f39740OooO0OO;
            int i4 = (((i3 - (i2 * 4)) * 8) / (o0000ooo.f39741OooO0Oo * i2)) + 1;
            if (iOooOOO != i4) {
                throw ParserException.OooO00o("Expected frames per block: " + i4 + "; got: " + iOooOOO, null);
            }
            int i5 = o0O00.f40595OooO00o;
            int i6 = ((iMax + iOooOOO) - 1) / iOooOOO;
            this.f39719OooO0o0 = new byte[i6 * i3];
            this.f39718OooO0o = new o00Oo00(iOooOOO * 2 * i2 * i6);
            int i7 = ((i3 * i) * 8) / iOooOOO;
            OooOo.OooO00o oooO00o = new OooOo.OooO00o();
            oooO00o.f11244OooOO0O = "audio/raw";
            oooO00o.f11239OooO0o = i7;
            oooO00o.f11241OooO0oO = i7;
            oooO00o.f11245OooOO0o = iMax * 2 * i2;
            oooO00o.f11253OooOo = i2;
            oooO00o.f11259OooOoO0 = i;
            oooO00o.f11258OooOoO = 2;
            this.f39721OooO0oo = new OooOo(oooO00o);
        }

        @Override // o00oO0O0.o00000OO.OooO0O0
        public final void OooO00o(int i, long j) {
            this.f39714OooO00o.OooO0O0(new o0000O00(this.f39716OooO0OO, this.f39717OooO0Oo, i, j));
            this.f39715OooO0O0.OooO0OO(this.f39721OooO0oo);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0060  */
        /* JADX WARN: Code duplicated, block: B:19:0x0067  */
        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:37:0x017c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0180  */
        /* JADX WARN: Code duplicated, block: B:44:0x0057 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x0149 A[EDGE_INSN: B:48:0x0149->B:35:0x0149 BREAK  A[LOOP:1: B:17:0x0061->B:34:0x0139], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x00f3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004d -> B:12:0x004f). Please report as a decompilation issue!!! */
        @Override // o00oO0O0.o00000OO.OooO0O0
        public final boolean OooO0O0(o00O00o0 o00o00o1, long j) throws IOException {
            OooO00o oooO00o;
            int i;
            int i2;
            boolean z;
            int i3;
            o0000Ooo o0000ooo;
            int i4;
            o00O00o0 o00o00o2;
            long j2;
            byte[] bArr;
            int i5;
            o0000Ooo o0000ooo2;
            boolean z2;
            int i6;
            int i7;
            int i8;
            o00Oo00 o00oo00;
            int i9;
            int i10;
            int i11;
            byte[] bArr2;
            int i12;
            int i13;
            int iOooO;
            int[] iArr;
            int i14;
            int i15;
            int iOooO2;
            int i16;
            OooO00o oooO00o2;
            int i17;
            int i18;
            int iOooO00o;
            int i19;
            int i20;
            int i21 = this.f39723OooOO0O;
            o0000Ooo o0000ooo3 = this.f39716OooO0OO;
            int i22 = i21 / (o0000ooo3.f39738OooO00o * 2);
            int i23 = this.f39720OooO0oO;
            int i24 = o0O00.f40595OooO00o;
            int i25 = this.f39717OooO0Oo;
            int i26 = ((((i23 - i22) + i25) - 1) / i25) * o0000ooo3.f39740OooO0OO;
            if (j != 0) {
                oooO00o = this;
                i = i25;
                i2 = -1;
                z = false;
                i3 = i26;
                o0000ooo = o0000ooo3;
                i4 = i23;
                o00o00o2 = o00o00o1;
                j2 = j;
                while (true) {
                    bArr = oooO00o.f39719OooO0o0;
                    if (z && (i19 = oooO00o.f39713OooO) < i3) {
                        i20 = o00o00o2.read(bArr, oooO00o.f39713OooO, (int) Math.min(i3 - i19, j2));
                        if (i20 == i2) {
                            break;
                        }
                        oooO00o.f39713OooO += i20;
                        bArr = oooO00o.f39719OooO0o0;
                        if (z) {
                        }
                    }
                    i5 = oooO00o.f39713OooO / o0000ooo.f39740OooO0OO;
                    o0000ooo2 = oooO00o.f39716OooO0OO;
                    if (i5 > 0) {
                        i7 = 0;
                        while (true) {
                            i8 = o0000ooo.f39740OooO0OO;
                            o00oo00 = oooO00o.f39718OooO0o;
                            if (i7 < i5) {
                                break;
                            }
                            i10 = 0;
                            while (true) {
                                i11 = o0000ooo.f39738OooO00o;
                                if (i10 < i11) {
                                    bArr2 = o00oo00.f40591OooO00o;
                                    int i27 = (i10 * 4) + (i7 * i8);
                                    i12 = (i11 * 4) + i27;
                                    i13 = (i8 / i11) - 4;
                                    o0000Ooo o0000ooo4 = o0000ooo;
                                    iOooO = (short) (((bArr[i27 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i27] & UByte.MAX_VALUE));
                                    boolean z3 = z;
                                    int iMin = Math.min(bArr[i27 + 2] & UByte.MAX_VALUE, 88);
                                    iArr = f39711OooOOO;
                                    int i28 = iArr[iMin];
                                    i14 = ((i7 * i * i11) + i10) * 2;
                                    bArr2[i14] = (byte) (iOooO & 255);
                                    int i29 = i4;
                                    bArr2[i14 + 1] = (byte) (iOooO >> 8);
                                    i15 = 0;
                                    iOooO2 = iMin;
                                    int i30 = i8;
                                    i16 = i28;
                                    while (true) {
                                        oooO00o2 = oooO00o;
                                        if (i15 < i13 * 2) {
                                            i17 = bArr[((i15 / 8) * i11 * 4) + i12 + ((i15 / 2) % 4)] & UByte.MAX_VALUE;
                                            if (i15 % 2 == 0) {
                                                i18 = i17 & 15;
                                            } else {
                                                i18 = i17 >> 4;
                                            }
                                            byte[] bArr3 = bArr;
                                            int i31 = i12;
                                            o00Oo00 o00oo01 = o00oo00;
                                            iOooO00o = o000000O.OooO00o(i18 & 7, 2, 1, i16) >> 3;
                                            if ((i18 & 8) != 0) {
                                                iOooO00o = -iOooO00o;
                                            }
                                            iOooO = o0O00.OooO(iOooO + iOooO00o, -32768, 32767);
                                            i14 = (i11 * 2) + i14;
                                            bArr2[i14] = (byte) (iOooO & 255);
                                            bArr2[i14 + 1] = (byte) (iOooO >> 8);
                                            iOooO2 = o0O00.OooO(iOooO2 + f39712OooOOO0[i18], 0, 88);
                                            i16 = iArr[iOooO2];
                                            i15++;
                                            oooO00o = oooO00o2;
                                            bArr = bArr3;
                                            i12 = i31;
                                            o00oo00 = o00oo01;
                                        }
                                    }
                                    i10++;
                                    z = z3;
                                    oooO00o = oooO00o2;
                                    i4 = i29;
                                    i8 = i30;
                                    o0000ooo = o0000ooo4;
                                }
                            }
                            i7++;
                        }
                        z2 = z;
                        int i32 = i * i5 * 2 * o0000ooo2.f39738OooO00o;
                        o00oo00.Oooo00O(0);
                        o00oo00.Oooo000(i32);
                        oooO00o.f39713OooO -= i5 * i8;
                        int i33 = o00oo00.f40593OooO0OO;
                        oooO00o.f39715OooO0O0.OooO0O0(i33, o00oo00);
                        i9 = oooO00o.f39723OooOO0O + i33;
                        oooO00o.f39723OooOO0O = i9;
                        if (i9 / (o0000ooo2.f39738OooO00o * 2) >= i4) {
                            oooO00o.OooO0Oo(i4);
                        }
                    } else {
                        z2 = z;
                    }
                    if (z2 && (i6 = oooO00o.f39723OooOO0O / (o0000ooo2.f39738OooO00o * 2)) > 0) {
                        oooO00o.OooO0Oo(i6);
                    }
                    return z2;
                }
            }
            oooO00o = this;
            i4 = i23;
            i = i25;
            i2 = -1;
            i3 = i26;
            o0000ooo = o0000ooo3;
            o00o00o2 = o00o00o1;
            j2 = j;
            z = true;
            while (true) {
                bArr = oooO00o.f39719OooO0o0;
                if (z) {
                }
                i5 = oooO00o.f39713OooO / o0000ooo.f39740OooO0OO;
                o0000ooo2 = oooO00o.f39716OooO0OO;
                if (i5 > 0) {
                    i7 = 0;
                    while (true) {
                        i8 = o0000ooo.f39740OooO0OO;
                        o00oo00 = oooO00o.f39718OooO0o;
                        if (i7 < i5) {
                            break;
                            break;
                        }
                        i10 = 0;
                        while (true) {
                            i11 = o0000ooo.f39738OooO00o;
                            if (i10 < i11) {
                                bArr2 = o00oo00.f40591OooO00o;
                                int i210 = (i10 * 4) + (i7 * i8);
                                i12 = (i11 * 4) + i210;
                                i13 = (i8 / i11) - 4;
                                o0000Ooo o0000ooo5 = o0000ooo;
                                iOooO = (short) (((bArr[i210 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i210] & UByte.MAX_VALUE));
                                boolean z4 = z;
                                int iMin2 = Math.min(bArr[i210 + 2] & UByte.MAX_VALUE, 88);
                                iArr = f39711OooOOO;
                                int i211 = iArr[iMin2];
                                i14 = ((i7 * i * i11) + i10) * 2;
                                bArr2[i14] = (byte) (iOooO & 255);
                                int i212 = i4;
                                bArr2[i14 + 1] = (byte) (iOooO >> 8);
                                i15 = 0;
                                iOooO2 = iMin2;
                                int i34 = i8;
                                i16 = i211;
                                while (true) {
                                    oooO00o2 = oooO00o;
                                    if (i15 < i13 * 2) {
                                        i17 = bArr[((i15 / 8) * i11 * 4) + i12 + ((i15 / 2) % 4)] & UByte.MAX_VALUE;
                                        if (i15 % 2 == 0) {
                                            i18 = i17 & 15;
                                        } else {
                                            i18 = i17 >> 4;
                                        }
                                        byte[] bArr4 = bArr;
                                        int i35 = i12;
                                        o00Oo00 o00oo02 = o00oo00;
                                        iOooO00o = o000000O.OooO00o(i18 & 7, 2, 1, i16) >> 3;
                                        if ((i18 & 8) != 0) {
                                            iOooO00o = -iOooO00o;
                                        }
                                        iOooO = o0O00.OooO(iOooO + iOooO00o, -32768, 32767);
                                        i14 = (i11 * 2) + i14;
                                        bArr2[i14] = (byte) (iOooO & 255);
                                        bArr2[i14 + 1] = (byte) (iOooO >> 8);
                                        iOooO2 = o0O00.OooO(iOooO2 + f39712OooOOO0[i18], 0, 88);
                                        i16 = iArr[iOooO2];
                                        i15++;
                                        oooO00o = oooO00o2;
                                        bArr = bArr4;
                                        i12 = i35;
                                        o00oo00 = o00oo02;
                                    }
                                }
                                i10++;
                                z = z4;
                                oooO00o = oooO00o2;
                                i4 = i212;
                                i8 = i34;
                                o0000ooo = o0000ooo5;
                            }
                        }
                        i7++;
                    }
                    z2 = z;
                    int i36 = i * i5 * 2 * o0000ooo2.f39738OooO00o;
                    o00oo00.Oooo00O(0);
                    o00oo00.Oooo000(i36);
                    oooO00o.f39713OooO -= i5 * i8;
                    int i37 = o00oo00.f40593OooO0OO;
                    oooO00o.f39715OooO0O0.OooO0O0(i37, o00oo00);
                    i9 = oooO00o.f39723OooOO0O + i37;
                    oooO00o.f39723OooOO0O = i9;
                    if (i9 / (o0000ooo2.f39738OooO00o * 2) >= i4) {
                        oooO00o.OooO0Oo(i4);
                    }
                } else {
                    z2 = z;
                }
                if (z2) {
                    oooO00o.OooO0Oo(i6);
                }
                return z2;
                oooO00o.f39713OooO += i20;
            }
        }

        @Override // o00oO0O0.o00000OO.OooO0O0
        public final void OooO0OO(long j) {
            this.f39713OooO = 0;
            this.f39722OooOO0 = j;
            this.f39723OooOO0O = 0;
            this.f39724OooOO0o = 0L;
        }

        public final void OooO0Oo(int i) {
            long j = this.f39722OooOO0;
            long j2 = this.f39724OooOO0o;
            o0000Ooo o0000ooo = this.f39716OooO0OO;
            long jOooo0oo = j + o0O00.Oooo0oo(j2, AnimationKt.MillisToNanos, o0000ooo.f39739OooO0O0);
            int i2 = i * 2 * o0000ooo.f39738OooO00o;
            this.f39715OooO0O0.OooO0o0(jOooo0oo, 1, i2, this.f39723OooOO0O - i2, null);
            this.f39724OooOO0o += (long) i;
            this.f39723OooOO0O -= i2;
        }
    }

    public interface OooO0O0 {
        void OooO00o(int i, long j) throws ParserException;

        boolean OooO0O0(o00O00o0 o00o00o1, long j) throws IOException;

        void OooO0OO(long j);
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O0O0 f39725OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TrackOutput f39726OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0000Ooo f39727OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOo f39728OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f39729OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f39730OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f39731OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f39732OooO0oo;

        public OooO0OO(o00O0O0 o00o0o0, TrackOutput trackOutput, o0000Ooo o0000ooo, String str, int i) throws ParserException {
            this.f39725OooO00o = o00o0o0;
            this.f39726OooO0O0 = trackOutput;
            this.f39727OooO0OO = o0000ooo;
            int i2 = o0000ooo.f39741OooO0Oo;
            int i3 = o0000ooo.f39738OooO00o;
            int i4 = (i2 * i3) / 8;
            int i5 = o0000ooo.f39740OooO0OO;
            if (i5 != i4) {
                throw ParserException.OooO00o("Expected block size: " + i4 + "; got: " + i5, null);
            }
            int i6 = o0000ooo.f39739OooO0O0;
            int i7 = i6 * i4;
            int i8 = i7 * 8;
            int iMax = Math.max(i4, i7 / 10);
            this.f39730OooO0o0 = iMax;
            OooOo.OooO00o oooO00o = new OooOo.OooO00o();
            oooO00o.f11244OooOO0O = str;
            oooO00o.f11239OooO0o = i8;
            oooO00o.f11241OooO0oO = i8;
            oooO00o.f11245OooOO0o = iMax;
            oooO00o.f11253OooOo = i3;
            oooO00o.f11259OooOoO0 = i6;
            oooO00o.f11258OooOoO = i;
            this.f39728OooO0Oo = new OooOo(oooO00o);
        }

        @Override // o00oO0O0.o00000OO.OooO0O0
        public final void OooO00o(int i, long j) {
            this.f39725OooO00o.OooO0O0(new o0000O00(this.f39727OooO0OO, 1, i, j));
            this.f39726OooO0O0.OooO0OO(this.f39728OooO0Oo);
        }

        @Override // o00oO0O0.o00000OO.OooO0O0
        public final boolean OooO0O0(o00O00o0 o00o00o1, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.f39731OooO0oO) < (i2 = this.f39730OooO0o0)) {
                int iOooO00o = this.f39726OooO0O0.OooO00o(o00o00o1, (int) Math.min(i2 - i, j2), true);
                if (iOooO00o == -1) {
                    j2 = 0;
                } else {
                    this.f39731OooO0oO += iOooO00o;
                    j2 -= (long) iOooO00o;
                }
            }
            o0000Ooo o0000ooo = this.f39727OooO0OO;
            int i3 = o0000ooo.f39740OooO0OO;
            int i4 = this.f39731OooO0oO / i3;
            if (i4 > 0) {
                long jOooo0oo = this.f39729OooO0o + o0O00.Oooo0oo(this.f39732OooO0oo, AnimationKt.MillisToNanos, o0000ooo.f39739OooO0O0);
                int i5 = i4 * i3;
                int i6 = this.f39731OooO0oO - i5;
                this.f39726OooO0O0.OooO0o0(jOooo0oo, 1, i5, i6, null);
                this.f39732OooO0oo += (long) i4;
                this.f39731OooO0oO = i6;
            }
            return j2 <= 0;
        }

        @Override // o00oO0O0.o00000OO.OooO0O0
        public final void OooO0OO(long j) {
            this.f39729OooO0o = j;
            this.f39731OooO0oO = 0;
            this.f39732OooO0oo = 0L;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f39706OooO0OO = j == 0 ? 0 : 4;
        OooO0O0 oooO0O0 = this.f39709OooO0o0;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(j2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        return o0000.OooO00o((o00O00o0) o00o0o01);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0186  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        byte[] bArr;
        int i;
        o00O000o.OooO0o0(this.f39705OooO0O0);
        int i2 = o0O00.f40595OooO00o;
        int i3 = this.f39706OooO0OO;
        int iOooOo00 = 4;
        if (i3 == 0) {
            o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
            o00O000o.OooO0Oo(o00o00o1.f39532OooO0Oo == 0);
            int i4 = this.f39708OooO0o;
            if (i4 != -1) {
                o00o00o1.OooOO0(i4);
                this.f39706OooO0OO = 4;
            } else {
                if (!o0000.OooO00o(o00o00o1)) {
                    throw ParserException.OooO00o("Unsupported or unrecognized wav file type.", null);
                }
                o00o00o1.OooOO0((int) (o00o00o1.OooO0oo() - o00o00o1.f39532OooO0Oo));
                this.f39706OooO0OO = 1;
            }
            return 0;
        }
        long jOooOO0 = -1;
        if (i3 == 1) {
            o00Oo00 o00oo00 = new o00Oo00(8);
            o00O00o0 o00o00o2 = (o00O00o0) o00o0o01;
            o0000.OooO00o OooO00o2 = o0000.OooO00o.OooO00o(o00o00o2, o00oo00);
            if (OooO00o2.f39702OooO00o != 1685272116) {
                o00o00o2.f39533OooO0o = 0;
            } else {
                o00o00o2.OooOO0o(8, false);
                o00oo00.Oooo00O(0);
                o00o00o2.OooO0Oo(o00oo00.f40591OooO00o, 0, 8, false);
                jOooOO0 = o00oo00.OooOO0();
                o00o00o2.OooOO0(((int) OooO00o2.f39703OooO0O0) + 8);
            }
            this.f39707OooO0Oo = jOooOO0;
            this.f39706OooO0OO = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
                o00O000o.OooO0Oo(this.f39710OooO0oO != -1);
                o00O00o0 o00o00o3 = (o00O00o0) o00o0o01;
                long j = this.f39710OooO0oO - o00o00o3.f39532OooO0Oo;
                OooO0O0 oooO0O0 = this.f39709OooO0o0;
                oooO0O0.getClass();
                return oooO0O0.OooO0O0(o00o00o3, j) ? -1 : 0;
            }
            o00O00o0 o00o00o4 = (o00O00o0) o00o0o01;
            o00o00o4.f39533OooO0o = 0;
            o0000.OooO00o oooO00oOooO0O0 = o0000.OooO0O0(1684108385, o00o00o4, new o00Oo00(8));
            o00o00o4.OooOO0(8);
            Pair pairCreate = Pair.create(Long.valueOf(o00o00o4.f39532OooO0Oo), Long.valueOf(oooO00oOooO0O0.f39703OooO0O0));
            this.f39708OooO0o = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j2 = this.f39707OooO0Oo;
            if (j2 != -1 && jLongValue == 4294967295L) {
                jLongValue = j2;
            }
            long j3 = ((long) this.f39708OooO0o) + jLongValue;
            this.f39710OooO0oO = j3;
            long j4 = o00o00o4.f39531OooO0OO;
            if (j4 != -1 && j3 > j4) {
                Log.OooO0o("WavExtractor", "Data exceeds input length: " + this.f39710OooO0oO + ", " + j4);
                this.f39710OooO0oO = j4;
            }
            OooO0O0 oooO0O1 = this.f39709OooO0o0;
            oooO0O1.getClass();
            oooO0O1.OooO00o(this.f39708OooO0o, this.f39710OooO0oO);
            this.f39706OooO0OO = 4;
            return 0;
        }
        o00Oo00 o00oo01 = new o00Oo00(16);
        o00O00o0 o00o00o5 = (o00O00o0) o00o0o01;
        long j5 = o0000.OooO0O0(1718449184, o00o00o5, o00oo01).f39703OooO0O0;
        o00O000o.OooO0Oo(j5 >= 16);
        o00o00o5.OooO0Oo(o00oo01.f40591OooO00o, 0, 16, false);
        o00oo01.Oooo00O(0);
        int iOooOOO = o00oo01.OooOOO();
        int iOooOOO2 = o00oo01.OooOOO();
        int iOooOOO0 = o00oo01.OooOOO0();
        o00oo01.OooOOO0();
        int iOooOOO3 = o00oo01.OooOOO();
        int iOooOOO4 = o00oo01.OooOOO();
        int i5 = ((int) j5) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            o00o00o5.OooO0Oo(bArr, 0, i5, false);
        } else {
            bArr = o0O00.f40599OooO0o;
        }
        o00o00o5.OooOO0((int) (o00o00o5.OooO0oo() - o00o00o5.f39532OooO0Oo));
        o0000Ooo o0000ooo = new o0000Ooo(iOooOOO, iOooOOO2, iOooOOO0, iOooOOO3, iOooOOO4, bArr);
        if (iOooOOO == 17) {
            this.f39709OooO0o0 = new OooO00o(this.f39704OooO00o, this.f39705OooO0O0, o0000ooo);
        } else if (iOooOOO == 6) {
            this.f39709OooO0o0 = new OooO0OO(this.f39704OooO00o, this.f39705OooO0O0, o0000ooo, "audio/g711-alaw", -1);
        } else if (iOooOOO == 7) {
            this.f39709OooO0o0 = new OooO0OO(this.f39704OooO00o, this.f39705OooO0O0, o0000ooo, "audio/g711-mlaw", -1);
        } else {
            if (iOooOOO == 1) {
                iOooOo00 = o0O00.OooOo00(iOooOOO4);
                i = iOooOo00;
            } else {
                if (iOooOOO != 3) {
                    if (iOooOOO == 65534) {
                        iOooOo00 = o0O00.OooOo00(iOooOOO4);
                        i = iOooOo00;
                    }
                } else if (iOooOOO4 == 32) {
                    i = iOooOo00;
                }
                i = 0;
            }
            if (i == 0) {
                throw ParserException.OooO0OO("Unsupported WAV format type: " + iOooOOO);
            }
            this.f39709OooO0o0 = new OooO0OO(this.f39704OooO00o, this.f39705OooO0O0, o0000ooo, "audio/raw", i);
        }
        this.f39706OooO0OO = 3;
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f39704OooO00o = o00o0o0;
        this.f39705OooO0O0 = o00o0o0.OooOOO(0, 1);
        o00o0o0.OooO00o();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
