package o0O0o00O;

import android.util.Log;
import android.util.Pair;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.Objects;
import kotlin.KotlinVersion;
import org.conscrypt.NativeConstants;
import p265o00ooo00.Oooo0;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0OoOo0 f36158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f36159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0O0 f36160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36161OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f36162OooO0o0 = -1;

    /* JADX INFO: renamed from: o0O0o00O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0368OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f36165OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OoOo0 f36166OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TrackOutput f36167OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0O0o00O.OooO0O0 f36168OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f36169OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o000 f36170OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final byte[] f36171OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f36172OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Format f36173OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f36174OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f36175OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f36176OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final int[] f36164OooOOO0 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final int[] f36163OooOOO = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 143, Constants.ERR_MODULE_NOT_FOUND, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, NativeConstants.EVP_PKEY_EC, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        public C0368OooO00o(o0OoOo0 o0oooo1, TrackOutput trackOutput, o0O0o00O.OooO0O0 oooO0O0) throws ParserException {
            this.f36166OooO00o = o0oooo1;
            this.f36167OooO0O0 = trackOutput;
            this.f36168OooO0OO = oooO0O0;
            int iMax = Math.max(1, oooO0O0.f36187OooO0OO / 10);
            this.f36172OooO0oO = iMax;
            byte[] bArr = oooO0O0.f36189OooO0o;
            int length = bArr.length;
            byte b = bArr[0];
            byte b2 = bArr[1];
            int i = ((bArr[3] & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (bArr[2] & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f36169OooO0Oo = i;
            int i2 = oooO0O0.f36186OooO0O0;
            int i3 = oooO0O0.f36188OooO0Oo;
            int i4 = (((i3 - (i2 * 4)) * 8) / (oooO0O0.f36190OooO0o0 * i2)) + 1;
            if (i != i4) {
                StringBuilder sb = new StringBuilder(56);
                sb.append("Expected frames per block: ");
                sb.append(i4);
                sb.append("; got: ");
                sb.append(i);
                throw new ParserException(sb.toString());
            }
            int i5 = o000OOo0.f36740OooO00o;
            int i6 = ((iMax + i) - 1) / i;
            this.f36171OooO0o0 = new byte[i3 * i6];
            this.f36170OooO0o = new o000(i * 2 * i2 * i6);
            int i7 = oooO0O0.f36187OooO0OO;
            int i8 = ((oooO0O0.f36188OooO0Oo * i7) * 8) / i;
            Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
            oooO0O1.f13163OooOO0O = "audio/raw";
            oooO0O1.f13158OooO0o = i8;
            oooO0O1.f13160OooO0oO = i8;
            oooO0O1.f13164OooOO0o = iMax * 2 * i2;
            oooO0O1.f13172OooOo = oooO0O0.f36186OooO0O0;
            oooO0O1.f13178OooOoO0 = i7;
            oooO0O1.f13177OooOoO = 2;
            this.f36173OooO0oo = new Format(oooO0O1);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0044 A[LOOP:0: B:6:0x002a->B:12:0x0044, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:41:0x004a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x0042 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x002c  */
        /* JADX WARN: Code duplicated, block: B:9:0x0030  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0040 -> B:11:0x0042). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // o0O0o00O.OooO00o.OooO0O0
        public final boolean OooO00o(p296o0O0OoO0.o000oOoO r21, long r22) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 353
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0O0o00O.OooO00o.C0368OooO00o.OooO00o(o0O0OoO0.o000oOoO, long):boolean");
        }

        @Override // o0O0o00O.OooO00o.OooO0O0
        public final void OooO0O0(long j) {
            this.f36165OooO = 0;
            this.f36174OooOO0 = j;
            this.f36175OooOO0O = 0;
            this.f36176OooOO0o = 0L;
        }

        @Override // o0O0o00O.OooO00o.OooO0O0
        public final void OooO0OO(int i, long j) {
            this.f36166OooO00o.OooOO0O(new OooO0o(this.f36168OooO0OO, this.f36169OooO0Oo, i, j));
            this.f36167OooO0O0.OooO0o0(this.f36173OooO0oo);
        }

        public final int OooO0Oo(int i) {
            return i / (this.f36168OooO0OO.f36186OooO0O0 * 2);
        }

        public final void OooO0o0(int i) {
            long jOooOooo = this.f36174OooOO0 + o000OOo0.OooOooo(this.f36176OooOO0o, 1000000L, this.f36168OooO0OO.f36187OooO0OO);
            int i2 = i * 2 * this.f36168OooO0OO.f36186OooO0O0;
            this.f36167OooO0O0.OooO0Oo(jOooOooo, 1, i2, this.f36175OooOO0O - i2, null);
            this.f36176OooOO0o += (long) i;
            this.f36175OooOO0O -= i2;
        }
    }

    public interface OooO0O0 {
        boolean OooO00o(o000oOoO o000oooo2, long j) throws IOException;

        void OooO0O0(long j);

        void OooO0OO(int i, long j) throws ParserException;
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OoOo0 f36177OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TrackOutput f36178OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0O0o00O.OooO0O0 f36179OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Format f36180OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f36181OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f36182OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f36183OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f36184OooO0oo;

        public OooO0OO(o0OoOo0 o0oooo1, TrackOutput trackOutput, o0O0o00O.OooO0O0 oooO0O0, String str, int i) throws ParserException {
            this.f36177OooO00o = o0oooo1;
            this.f36178OooO0O0 = trackOutput;
            this.f36179OooO0OO = oooO0O0;
            int i2 = (oooO0O0.f36186OooO0O0 * oooO0O0.f36190OooO0o0) / 8;
            if (oooO0O0.f36188OooO0Oo != i2) {
                int i3 = oooO0O0.f36188OooO0Oo;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Expected block size: ");
                sb.append(i2);
                sb.append("; got: ");
                sb.append(i3);
                throw new ParserException(sb.toString());
            }
            int i4 = oooO0O0.f36187OooO0OO * i2;
            int i5 = i4 * 8;
            int iMax = Math.max(i2, i4 / 10);
            this.f36182OooO0o0 = iMax;
            Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
            oooO0O1.f13163OooOO0O = str;
            oooO0O1.f13158OooO0o = i5;
            oooO0O1.f13160OooO0oO = i5;
            oooO0O1.f13164OooOO0o = iMax;
            oooO0O1.f13172OooOo = oooO0O0.f36186OooO0O0;
            oooO0O1.f13178OooOoO0 = oooO0O0.f36187OooO0OO;
            oooO0O1.f13177OooOoO = i;
            this.f36180OooO0Oo = new Format(oooO0O1);
        }

        @Override // o0O0o00O.OooO00o.OooO0O0
        public final boolean OooO00o(o000oOoO o000oooo2, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.f36183OooO0oO) < (i2 = this.f36182OooO0o0)) {
                int iOooO0O0 = this.f36178OooO0O0.OooO0O0(o000oooo2, (int) Math.min(i2 - i, j2), true);
                if (iOooO0O0 == -1) {
                    j2 = 0;
                } else {
                    this.f36183OooO0oO += iOooO0O0;
                    j2 -= (long) iOooO0O0;
                }
            }
            o0O0o00O.OooO0O0 oooO0O0 = this.f36179OooO0OO;
            int i3 = oooO0O0.f36188OooO0Oo;
            int i4 = this.f36183OooO0oO / i3;
            if (i4 > 0) {
                long jOooOooo = this.f36181OooO0o + o000OOo0.OooOooo(this.f36184OooO0oo, 1000000L, oooO0O0.f36187OooO0OO);
                int i5 = i4 * i3;
                int i6 = this.f36183OooO0oO - i5;
                this.f36178OooO0O0.OooO0Oo(jOooOooo, 1, i5, i6, null);
                this.f36184OooO0oo += (long) i4;
                this.f36183OooO0oO = i6;
            }
            return j2 <= 0;
        }

        @Override // o0O0o00O.OooO00o.OooO0O0
        public final void OooO0O0(long j) {
            this.f36181OooO0o = j;
            this.f36183OooO0oO = 0;
            this.f36184OooO0oo = 0L;
        }

        @Override // o0O0o00O.OooO00o.OooO0O0
        public final void OooO0OO(int i, long j) {
            this.f36177OooO00o.OooOO0O(new OooO0o(this.f36179OooO0OO, 1, i, j));
            this.f36178OooO0O0.OooO0o0(this.f36180OooO0Oo);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        this.f36158OooO00o = o0oooo1;
        this.f36159OooO0O0 = o0oooo1.OooO00o(0);
        o0oooo1.OooOOO0();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        OooO0O0 oooO0O0 = this.f36160OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0O0(j2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        return o0O0o00O.OooO0OO.OooO00o(o000oooo2) != null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        int iOooOOoo;
        int i;
        o00000O0.OooO0o(this.f36159OooO0O0);
        int i2 = o000OOo0.f36740OooO00o;
        if (this.f36160OooO0OO == null) {
            o0O0o00O.OooO0O0 oooO0O0OooO00o = o0O0o00O.OooO0OO.OooO00o(o000oooo2);
            if (oooO0O0OooO00o == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
            int i3 = oooO0O0OooO00o.f36185OooO00o;
            if (i3 == 17) {
                this.f36160OooO0OO = new C0368OooO00o(this.f36158OooO00o, this.f36159OooO0O0, oooO0O0OooO00o);
            } else if (i3 == 6) {
                this.f36160OooO0OO = new OooO0OO(this.f36158OooO00o, this.f36159OooO0O0, oooO0O0OooO00o, "audio/g711-alaw", -1);
            } else if (i3 == 7) {
                this.f36160OooO0OO = new OooO0OO(this.f36158OooO00o, this.f36159OooO0O0, oooO0O0OooO00o, "audio/g711-mlaw", -1);
            } else {
                int i4 = oooO0O0OooO00o.f36190OooO0o0;
                if (i3 == 1) {
                    iOooOOoo = o000OOo0.OooOOoo(i4);
                    i = iOooOOoo;
                } else if (i3 == 3) {
                    iOooOOoo = i4 == 32 ? 4 : 0;
                    i = iOooOOoo;
                } else if (i3 != 65534) {
                    i = 0;
                } else {
                    iOooOOoo = o000OOo0.OooOOoo(i4);
                    i = iOooOOoo;
                }
                if (i == 0) {
                    throw new ParserException(Oooo0.OooO00o(40, "Unsupported WAV format type: ", oooO0O0OooO00o.f36185OooO00o));
                }
                this.f36160OooO0OO = new OooO0OO(this.f36158OooO00o, this.f36159OooO0O0, oooO0O0OooO00o, "audio/raw", i);
            }
        }
        if (this.f36161OooO0Oo == -1) {
            Objects.requireNonNull(o000oooo2);
            o000oooo2.OooO();
            o000 o000Var = new o000(8);
            o0O0o00O.OooO0OO.OooO00o OooO00o2 = o0O0o00O.OooO0OO.OooO00o.OooO00o(o000oooo2, o000Var);
            while (true) {
                int i5 = OooO00o2.f36191OooO00o;
                if (i5 == 1684108385) {
                    o000oooo2.OooOO0(8);
                    long position = o000oooo2.getPosition();
                    long j = OooO00o2.f36192OooO0O0 + position;
                    long jOooO00o = o000oooo2.OooO00o();
                    if (jOooO00o != -1 && j > jOooO00o) {
                        StringBuilder sb = new StringBuilder(69);
                        sb.append("Data exceeds input length: ");
                        sb.append(j);
                        sb.append(", ");
                        sb.append(jOooO00o);
                        Log.w("WavHeaderReader", sb.toString());
                        j = jOooO00o;
                    }
                    Pair pairCreate = Pair.create(Long.valueOf(position), Long.valueOf(j));
                    this.f36161OooO0Oo = ((Long) pairCreate.first).intValue();
                    long jLongValue = ((Long) pairCreate.second).longValue();
                    this.f36162OooO0o0 = jLongValue;
                    this.f36160OooO0OO.OooO0OO(this.f36161OooO0Oo, jLongValue);
                    break;
                }
                if (i5 != 1380533830 && i5 != 1718449184) {
                    o00O00O.OooO0OO.OooO0O0(39, "Ignoring unknown WAV chunk: ", i5, "WavHeaderReader");
                }
                long j2 = OooO00o2.f36192OooO0O0 + 8;
                if (OooO00o2.f36191OooO00o == 1380533830) {
                    j2 = 12;
                }
                if (j2 > 2147483647L) {
                    throw new ParserException(Oooo0.OooO00o(51, "Chunk is too large (~2GB+) to skip; id: ", OooO00o2.f36191OooO00o));
                }
                o000oooo2.OooOO0((int) j2);
                OooO00o2 = o0O0o00O.OooO0OO.OooO00o.OooO00o(o000oooo2, o000Var);
            }
        } else if (o000oooo2.getPosition() == 0) {
            o000oooo2.OooOO0(this.f36161OooO0Oo);
        }
        o00000O0.OooO0Oo(this.f36162OooO0o0 != -1);
        return this.f36160OooO0OO.OooO00o(o000oooo2, this.f36162OooO0o0 - o000oooo2.getPosition()) ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
