package p102o000oo0;

import android.util.Pair;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import com.facebook.internal.FacebookRequestErrorClassification;
import io.agora.rtc.Constants;
import java.io.IOException;
import kotlin.UByte;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000OOo;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class oo000o implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Oooo0 f35635OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f35636OooO0O0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0O0 f35640OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f35637OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f35638OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f35639OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f35641OooO0oO = -1;

    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f35644OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Oooo0 f35645OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TrackOutput f35646OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00oO0o f35647OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f35648OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o000O000 f35649OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final byte[] f35650OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f35651OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final OooOO0 f35652OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f35653OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f35654OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f35655OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final int[] f35643OooOOO0 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final int[] f35642OooOOO = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 143, Constants.ERR_MODULE_NOT_FOUND, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        public OooO00o(Oooo0 oooo0, TrackOutput trackOutput, o00oO0o o00oo0o2) throws ParserException {
            this.f35645OooO00o = oooo0;
            this.f35646OooO0O0 = trackOutput;
            this.f35647OooO0OO = o00oo0o2;
            int i = o00oo0o2.f35624OooO0O0;
            int iMax = Math.max(1, i / 10);
            this.f35651OooO0oO = iMax;
            o000O000 o000o001 = new o000O000(o00oo0o2.f35627OooO0o0);
            o000o001.OooOOO();
            int iOooOOO = o000o001.OooOOO();
            this.f35648OooO0Oo = iOooOOO;
            int i2 = o00oo0o2.f35623OooO00o;
            int i3 = o00oo0o2.f35625OooO0OO;
            int i4 = (((i3 - (i2 * 4)) * 8) / (o00oo0o2.f35626OooO0Oo * i2)) + 1;
            if (iOooOOO != i4) {
                throw ParserException.OooO00o("Expected frames per block: " + i4 + "; got: " + iOooOOO, null);
            }
            int i5 = o00.f34910OooO00o;
            int i6 = ((iMax + iOooOOO) - 1) / iOooOOO;
            this.f35650OooO0o0 = new byte[i6 * i3];
            this.f35649OooO0o = new o000O000(iOooOOO * 2 * i2 * i6);
            int i7 = ((i3 * i) * 8) / iOooOOO;
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
            oooO00o.f6445OooOO0O = "audio/raw";
            oooO00o.f6440OooO0o = i7;
            oooO00o.f6442OooO0oO = i7;
            oooO00o.f6446OooOO0o = iMax * 2 * i2;
            oooO00o.f6454OooOo = i2;
            oooO00o.f6460OooOoO0 = i;
            oooO00o.f6459OooOoO = 2;
            this.f35652OooO0oo = new OooOO0(oooO00o);
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
        @Override // o000oo0.oo000o.OooO0O0
        public final boolean OooO00o(OooOO0O oooOO0O, long j) throws IOException {
            OooO00o oooO00o;
            int i;
            int i2;
            boolean z;
            int i3;
            o00oO0o o00oo0o2;
            int i4;
            OooOO0O oooOO0O2;
            long j2;
            byte[] bArr;
            int i5;
            o00oO0o o00oo0o3;
            boolean z2;
            int i6;
            int i7;
            int i8;
            o000O000 o000o001;
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
            int i21 = this.f35654OooOO0O;
            o00oO0o o00oo0o4 = this.f35647OooO0OO;
            int i22 = i21 / (o00oo0o4.f35623OooO00o * 2);
            int i23 = this.f35651OooO0oO;
            int i24 = o00.f34910OooO00o;
            int i25 = this.f35648OooO0Oo;
            int i26 = ((((i23 - i22) + i25) - 1) / i25) * o00oo0o4.f35625OooO0OO;
            if (j != 0) {
                oooO00o = this;
                i = i25;
                i2 = -1;
                z = false;
                i3 = i26;
                o00oo0o2 = o00oo0o4;
                i4 = i23;
                oooOO0O2 = oooOO0O;
                j2 = j;
                while (true) {
                    bArr = oooO00o.f35650OooO0o0;
                    if (z && (i19 = oooO00o.f35644OooO) < i3) {
                        i20 = oooOO0O2.read(bArr, oooO00o.f35644OooO, (int) Math.min(i3 - i19, j2));
                        if (i20 == i2) {
                            break;
                        }
                        oooO00o.f35644OooO += i20;
                        bArr = oooO00o.f35650OooO0o0;
                        if (z) {
                        }
                    }
                    i5 = oooO00o.f35644OooO / o00oo0o2.f35625OooO0OO;
                    o00oo0o3 = oooO00o.f35647OooO0OO;
                    if (i5 > 0) {
                        i7 = 0;
                        while (true) {
                            i8 = o00oo0o2.f35625OooO0OO;
                            o000o001 = oooO00o.f35649OooO0o;
                            if (i7 < i5) {
                                break;
                            }
                            i10 = 0;
                            while (true) {
                                i11 = o00oo0o2.f35623OooO00o;
                                if (i10 < i11) {
                                    bArr2 = o000o001.f34962OooO00o;
                                    int i27 = (i10 * 4) + (i7 * i8);
                                    i12 = (i11 * 4) + i27;
                                    i13 = (i8 / i11) - 4;
                                    o00oO0o o00oo0o5 = o00oo0o2;
                                    iOooO = (short) (((bArr[i27 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i27] & UByte.MAX_VALUE));
                                    boolean z3 = z;
                                    int iMin = Math.min(bArr[i27 + 2] & UByte.MAX_VALUE, 88);
                                    iArr = f35642OooOOO;
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
                                            o000O000 o000o002 = o000o001;
                                            iOooO00o = o00Ooo.OooO00o(i18 & 7, 2, 1, i16) >> 3;
                                            if ((i18 & 8) != 0) {
                                                iOooO00o = -iOooO00o;
                                            }
                                            iOooO = o00.OooO(iOooO + iOooO00o, -32768, 32767);
                                            i14 = (i11 * 2) + i14;
                                            bArr2[i14] = (byte) (iOooO & 255);
                                            bArr2[i14 + 1] = (byte) (iOooO >> 8);
                                            iOooO2 = o00.OooO(iOooO2 + f35643OooOOO0[i18], 0, 88);
                                            i16 = iArr[iOooO2];
                                            i15++;
                                            oooO00o = oooO00o2;
                                            bArr = bArr3;
                                            i12 = i31;
                                            o000o001 = o000o002;
                                        }
                                    }
                                    i10++;
                                    z = z3;
                                    oooO00o = oooO00o2;
                                    i4 = i29;
                                    i8 = i30;
                                    o00oo0o2 = o00oo0o5;
                                }
                            }
                            i7++;
                        }
                        z2 = z;
                        int i32 = i * i5 * 2 * o00oo0o3.f35623OooO00o;
                        o000o001.Oooo00O(0);
                        o000o001.Oooo000(i32);
                        oooO00o.f35644OooO -= i5 * i8;
                        int i33 = o000o001.f34964OooO0OO;
                        oooO00o.f35646OooO0O0.OooO0OO(i33, o000o001);
                        i9 = oooO00o.f35654OooOO0O + i33;
                        oooO00o.f35654OooOO0O = i9;
                        if (i9 / (o00oo0o3.f35623OooO00o * 2) >= i4) {
                            oooO00o.OooO0Oo(i4);
                        }
                    } else {
                        z2 = z;
                    }
                    if (z2 && (i6 = oooO00o.f35654OooOO0O / (o00oo0o3.f35623OooO00o * 2)) > 0) {
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
            o00oo0o2 = o00oo0o4;
            oooOO0O2 = oooOO0O;
            j2 = j;
            z = true;
            while (true) {
                bArr = oooO00o.f35650OooO0o0;
                if (z) {
                }
                i5 = oooO00o.f35644OooO / o00oo0o2.f35625OooO0OO;
                o00oo0o3 = oooO00o.f35647OooO0OO;
                if (i5 > 0) {
                    i7 = 0;
                    while (true) {
                        i8 = o00oo0o2.f35625OooO0OO;
                        o000o001 = oooO00o.f35649OooO0o;
                        if (i7 < i5) {
                            break;
                            break;
                        }
                        i10 = 0;
                        while (true) {
                            i11 = o00oo0o2.f35623OooO00o;
                            if (i10 < i11) {
                                bArr2 = o000o001.f34962OooO00o;
                                int i210 = (i10 * 4) + (i7 * i8);
                                i12 = (i11 * 4) + i210;
                                i13 = (i8 / i11) - 4;
                                o00oO0o o00oo0o6 = o00oo0o2;
                                iOooO = (short) (((bArr[i210 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i210] & UByte.MAX_VALUE));
                                boolean z4 = z;
                                int iMin2 = Math.min(bArr[i210 + 2] & UByte.MAX_VALUE, 88);
                                iArr = f35642OooOOO;
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
                                        o000O000 o000o003 = o000o001;
                                        iOooO00o = o00Ooo.OooO00o(i18 & 7, 2, 1, i16) >> 3;
                                        if ((i18 & 8) != 0) {
                                            iOooO00o = -iOooO00o;
                                        }
                                        iOooO = o00.OooO(iOooO + iOooO00o, -32768, 32767);
                                        i14 = (i11 * 2) + i14;
                                        bArr2[i14] = (byte) (iOooO & 255);
                                        bArr2[i14 + 1] = (byte) (iOooO >> 8);
                                        iOooO2 = o00.OooO(iOooO2 + f35643OooOOO0[i18], 0, 88);
                                        i16 = iArr[iOooO2];
                                        i15++;
                                        oooO00o = oooO00o2;
                                        bArr = bArr4;
                                        i12 = i35;
                                        o000o001 = o000o003;
                                    }
                                }
                                i10++;
                                z = z4;
                                oooO00o = oooO00o2;
                                i4 = i212;
                                i8 = i34;
                                o00oo0o2 = o00oo0o6;
                            }
                        }
                        i7++;
                    }
                    z2 = z;
                    int i36 = i * i5 * 2 * o00oo0o3.f35623OooO00o;
                    o000o001.Oooo00O(0);
                    o000o001.Oooo000(i36);
                    oooO00o.f35644OooO -= i5 * i8;
                    int i37 = o000o001.f34964OooO0OO;
                    oooO00o.f35646OooO0O0.OooO0OO(i37, o000o001);
                    i9 = oooO00o.f35654OooOO0O + i37;
                    oooO00o.f35654OooOO0O = i9;
                    if (i9 / (o00oo0o3.f35623OooO00o * 2) >= i4) {
                        oooO00o.OooO0Oo(i4);
                    }
                } else {
                    z2 = z;
                }
                if (z2) {
                    oooO00o.OooO0Oo(i6);
                }
                return z2;
                oooO00o.f35644OooO += i20;
            }
        }

        @Override // o000oo0.oo000o.OooO0O0
        public final void OooO0O0(int i, long j) {
            this.f35645OooO00o.OooO(new o0OOO0o(this.f35647OooO0OO, this.f35648OooO0Oo, i, j));
            this.f35646OooO0O0.OooO0O0(this.f35652OooO0oo);
        }

        @Override // o000oo0.oo000o.OooO0O0
        public final void OooO0OO(long j) {
            this.f35644OooO = 0;
            this.f35653OooOO0 = j;
            this.f35654OooOO0O = 0;
            this.f35655OooOO0o = 0L;
        }

        public final void OooO0Oo(int i) {
            long j = this.f35653OooOO0;
            long j2 = this.f35655OooOO0o;
            o00oO0o o00oo0o2 = this.f35647OooO0OO;
            long jOooo = j + o00.Oooo(j2, AnimationKt.MillisToNanos, o00oo0o2.f35624OooO0O0);
            int i2 = i * 2 * o00oo0o2.f35623OooO00o;
            this.f35646OooO0O0.OooO0o0(jOooo, 1, i2, this.f35654OooOO0O - i2, null);
            this.f35655OooOO0o += (long) i;
            this.f35654OooOO0O -= i2;
        }
    }

    public interface OooO0O0 {
        boolean OooO00o(OooOO0O oooOO0O, long j) throws IOException;

        void OooO0O0(int i, long j) throws ParserException;

        void OooO0OO(long j);
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Oooo0 f35656OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TrackOutput f35657OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00oO0o f35658OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOO0 f35659OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f35660OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f35661OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f35662OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f35663OooO0oo;

        public OooO0OO(Oooo0 oooo0, TrackOutput trackOutput, o00oO0o o00oo0o2, String str, int i) throws ParserException {
            this.f35656OooO00o = oooo0;
            this.f35657OooO0O0 = trackOutput;
            this.f35658OooO0OO = o00oo0o2;
            int i2 = o00oo0o2.f35626OooO0Oo;
            int i3 = o00oo0o2.f35623OooO00o;
            int i4 = (i2 * i3) / 8;
            int i5 = o00oo0o2.f35625OooO0OO;
            if (i5 != i4) {
                throw ParserException.OooO00o("Expected block size: " + i4 + "; got: " + i5, null);
            }
            int i6 = o00oo0o2.f35624OooO0O0;
            int i7 = i6 * i4;
            int i8 = i7 * 8;
            int iMax = Math.max(i4, i7 / 10);
            this.f35661OooO0o0 = iMax;
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
            oooO00o.f6445OooOO0O = str;
            oooO00o.f6440OooO0o = i8;
            oooO00o.f6442OooO0oO = i8;
            oooO00o.f6446OooOO0o = iMax;
            oooO00o.f6454OooOo = i3;
            oooO00o.f6460OooOoO0 = i6;
            oooO00o.f6459OooOoO = i;
            this.f35659OooO0Oo = new OooOO0(oooO00o);
        }

        @Override // o000oo0.oo000o.OooO0O0
        public final boolean OooO00o(OooOO0O oooOO0O, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.f35662OooO0oO) < (i2 = this.f35661OooO0o0)) {
                int iOooO00o = this.f35657OooO0O0.OooO00o(oooOO0O, (int) Math.min(i2 - i, j2), true);
                if (iOooO00o == -1) {
                    j2 = 0;
                } else {
                    this.f35662OooO0oO += iOooO00o;
                    j2 -= (long) iOooO00o;
                }
            }
            o00oO0o o00oo0o2 = this.f35658OooO0OO;
            int i3 = o00oo0o2.f35625OooO0OO;
            int i4 = this.f35662OooO0oO / i3;
            if (i4 > 0) {
                long jOooo = this.f35660OooO0o + o00.Oooo(this.f35663OooO0oo, AnimationKt.MillisToNanos, o00oo0o2.f35624OooO0O0);
                int i5 = i4 * i3;
                int i6 = this.f35662OooO0oO - i5;
                this.f35657OooO0O0.OooO0o0(jOooo, 1, i5, i6, null);
                this.f35663OooO0oo += (long) i4;
                this.f35662OooO0oO = i6;
            }
            return j2 <= 0;
        }

        @Override // o000oo0.oo000o.OooO0O0
        public final void OooO0O0(int i, long j) {
            this.f35656OooO00o.OooO(new o0OOO0o(this.f35658OooO0OO, 1, i, j));
            this.f35657OooO0O0.OooO0O0(this.f35659OooO0Oo);
        }

        @Override // o000oo0.oo000o.OooO0O0
        public final void OooO0OO(long j) {
            this.f35660OooO0o = j;
            this.f35662OooO0oO = 0;
            this.f35663OooO0oo = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0186  */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        byte[] bArr;
        int i;
        o00Oo0.OooO0o(this.f35636OooO0O0);
        int i2 = o00.f34910OooO00o;
        int i3 = this.f35637OooO0OO;
        int iOooOo0 = 4;
        if (i3 == 0) {
            OooOO0O oooOO0O = (OooOO0O) oooo000;
            o00Oo0.OooO0Oo(oooOO0O.f34678OooO0Oo == 0);
            int i4 = this.f35639OooO0o;
            if (i4 != -1) {
                oooOO0O.OooOO0(i4);
                this.f35637OooO0OO = 4;
            } else {
                if (!o0ooOOo.OooO00o(oooOO0O)) {
                    throw ParserException.OooO00o("Unsupported or unrecognized wav file type.", null);
                }
                oooOO0O.OooOO0((int) (oooOO0O.OooO0oo() - oooOO0O.f34678OooO0Oo));
                this.f35637OooO0OO = 1;
            }
            return 0;
        }
        long jOooOO0 = -1;
        if (i3 == 1) {
            o000O000 o000o001 = new o000O000(8);
            OooOO0O oooOO0O2 = (OooOO0O) oooo000;
            o0ooOOo.OooO00o OooO00o2 = o0ooOOo.OooO00o.OooO00o(oooOO0O2, o000o001);
            if (OooO00o2.f35633OooO00o != 1685272116) {
                oooOO0O2.f34679OooO0o = 0;
            } else {
                oooOO0O2.OooOO0o(8, false);
                o000o001.Oooo00O(0);
                oooOO0O2.OooO0OO(o000o001.f34962OooO00o, 0, 8, false);
                jOooOO0 = o000o001.OooOO0();
                oooOO0O2.OooOO0(((int) OooO00o2.f35634OooO0O0) + 8);
            }
            this.f35638OooO0Oo = jOooOO0;
            this.f35637OooO0OO = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
                o00Oo0.OooO0Oo(this.f35641OooO0oO != -1);
                OooOO0O oooOO0O3 = (OooOO0O) oooo000;
                long j = this.f35641OooO0oO - oooOO0O3.f34678OooO0Oo;
                OooO0O0 oooO0O0 = this.f35640OooO0o0;
                oooO0O0.getClass();
                return oooO0O0.OooO00o(oooOO0O3, j) ? -1 : 0;
            }
            OooOO0O oooOO0O4 = (OooOO0O) oooo000;
            oooOO0O4.f34679OooO0o = 0;
            o0ooOOo.OooO00o oooO00oOooO0O0 = o0ooOOo.OooO0O0(1684108385, oooOO0O4, new o000O000(8));
            oooOO0O4.OooOO0(8);
            Pair pairCreate = Pair.create(Long.valueOf(oooOO0O4.f34678OooO0Oo), Long.valueOf(oooO00oOooO0O0.f35634OooO0O0));
            this.f35639OooO0o = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j2 = this.f35638OooO0Oo;
            if (j2 != -1 && jLongValue == 4294967295L) {
                jLongValue = j2;
            }
            long j3 = ((long) this.f35639OooO0o) + jLongValue;
            this.f35641OooO0oO = j3;
            long j4 = oooOO0O4.f34677OooO0OO;
            if (j4 != -1 && j3 > j4) {
                Log.OooO0o("WavExtractor", "Data exceeds input length: " + this.f35641OooO0oO + ", " + j4);
                this.f35641OooO0oO = j4;
            }
            OooO0O0 oooO0O1 = this.f35640OooO0o0;
            oooO0O1.getClass();
            oooO0O1.OooO0O0(this.f35639OooO0o, this.f35641OooO0oO);
            this.f35637OooO0OO = 4;
            return 0;
        }
        o000O000 o000o002 = new o000O000(16);
        OooOO0O oooOO0O5 = (OooOO0O) oooo000;
        long j5 = o0ooOOo.OooO0O0(1718449184, oooOO0O5, o000o002).f35634OooO0O0;
        o00Oo0.OooO0Oo(j5 >= 16);
        oooOO0O5.OooO0OO(o000o002.f34962OooO00o, 0, 16, false);
        o000o002.Oooo00O(0);
        int iOooOOO = o000o002.OooOOO();
        int iOooOOO2 = o000o002.OooOOO();
        int iOooOOO0 = o000o002.OooOOO0();
        o000o002.OooOOO0();
        int iOooOOO3 = o000o002.OooOOO();
        int iOooOOO4 = o000o002.OooOOO();
        int i5 = ((int) j5) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            oooOO0O5.OooO0OO(bArr, 0, i5, false);
        } else {
            bArr = o00.f34914OooO0o;
        }
        oooOO0O5.OooOO0((int) (oooOO0O5.OooO0oo() - oooOO0O5.f34678OooO0Oo));
        o00oO0o o00oo0o2 = new o00oO0o(iOooOOO, iOooOOO2, iOooOOO0, iOooOOO3, iOooOOO4, bArr);
        if (iOooOOO == 17) {
            this.f35640OooO0o0 = new OooO00o(this.f35635OooO00o, this.f35636OooO0O0, o00oo0o2);
        } else if (iOooOOO == 6) {
            this.f35640OooO0o0 = new OooO0OO(this.f35635OooO00o, this.f35636OooO0O0, o00oo0o2, "audio/g711-alaw", -1);
        } else if (iOooOOO == 7) {
            this.f35640OooO0o0 = new OooO0OO(this.f35635OooO00o, this.f35636OooO0O0, o00oo0o2, "audio/g711-mlaw", -1);
        } else {
            if (iOooOOO == 1) {
                iOooOo0 = o00.OooOo0(iOooOOO4);
                i = iOooOo0;
            } else {
                if (iOooOOO != 3) {
                    if (iOooOOO == 65534) {
                        iOooOo0 = o00.OooOo0(iOooOOO4);
                        i = iOooOo0;
                    }
                } else if (iOooOOO4 == 32) {
                    i = iOooOo0;
                }
                i = 0;
            }
            if (i == 0) {
                throw ParserException.OooO0O0("Unsupported WAV format type: " + iOooOOO);
            }
            this.f35640OooO0o0 = new OooO0OO(this.f35635OooO00o, this.f35636OooO0O0, o00oo0o2, "audio/raw", i);
        }
        this.f35637OooO0OO = 3;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f35637OooO0OO = j == 0 ? 0 : 4;
        OooO0O0 oooO0O0 = this.f35640OooO0o0;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(j2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f35635OooO00o = oooo0;
        this.f35636OooO0O0 = oooo0.OooOOOO(0, 1);
        oooo0.OooOO0O();
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        return o0ooOOo.OooO00o((OooOO0O) oooo000);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
