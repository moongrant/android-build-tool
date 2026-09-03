package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o0000O0;
import androidx.compose.animation.core.AnimationKt;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.OooOOO0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jctools.util.Pow2;
import p101o000oo.Oooo000;
import p205o00o0oO0.o00000O0;
import p209o00o0oo0.o00O;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oOO00O;
import p214o00oO00o.o000;
import p214o00oO00o.o0000O0O;
import p214o00oO00o.o000O00;
import p214o00oO00o.o000O00O;
import p214o00oO00o.o000O0o;
import p214o00oO00o.o000Oo0;
import p219o00oOOO0.o0000Ooo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class FragmentedMp4Extractor implements Extractor {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final byte[] f11974Oooo00O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooOo f11975Oooo00o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000Ooo f11976OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f11977OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooOo> f11978OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseArray<OooO0O0> f11979OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo00 f11980OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00Oo00 f11981OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo00 f11982OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final byte[] f11983OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00Oo00 f11984OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00Oo00 f11985OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> f11986OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f11987OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f11988OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final TrackOutput f11989OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f11990OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f11991OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public o00Oo00 f11992OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f11993OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f11994OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public OooO0O0 f11995OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f11996OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f11997OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f11998OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f11999OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f12000OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f12001OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f12002OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o00O0O0 f12003OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f12004OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TrackOutput[] f12005OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TrackOutput[] f12006OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f12007Oooo000;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f12008OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f12009OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f12010OooO0OO;

        public OooO00o(long j, boolean z, int i) {
            this.f12008OooO00o = j;
            this.f12009OooO0O0 = z;
            this.f12010OooO0OO = i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f12011OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackOutput f12012OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000O00O f12015OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f12016OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0000O0O f12017OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f12018OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f12019OooO0oo;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f12022OooOO0o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O00 f12013OooO0O0 = new o000O00();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00Oo00 f12014OooO0OO = new o00Oo00();

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final o00Oo00 f12020OooOO0 = new o00Oo00(1);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final o00Oo00 f12021OooOO0O = new o00Oo00();

        public OooO0O0(TrackOutput trackOutput, o000O00O o000o00o2, o0000O0O o0000o0o2) {
            this.f12012OooO00o = trackOutput;
            this.f12015OooO0Oo = o000o00o2;
            this.f12017OooO0o0 = o0000o0o2;
            this.f12015OooO0Oo = o000o00o2;
            this.f12017OooO0o0 = o0000o0o2;
            trackOutput.OooO0OO(o000o00o2.f39687OooO00o.f12090OooO0o);
            OooO0Oo();
        }

        @Nullable
        public final o000Oo0 OooO00o() {
            if (!this.f12022OooOO0o) {
                return null;
            }
            o000O00 o000o01 = this.f12013OooO0O0;
            o0000O0O o0000o0o2 = o000o01.f39664OooO00o;
            int i = o0O00.f40595OooO00o;
            int i2 = o0000o0o2.f39659OooO00o;
            o000Oo0 o000oo1 = o000o01.f39676OooOOO0;
            if (o000oo1 == null) {
                o000Oo0[] o000oo0Arr = this.f12015OooO0Oo.f39687OooO00o.f12095OooOO0O;
                o000oo1 = o000oo0Arr == null ? null : o000oo0Arr[i2];
            }
            if (o000oo1 == null || !o000oo1.f39697OooO00o) {
                return null;
            }
            return o000oo1;
        }

        public final boolean OooO0O0() {
            this.f12016OooO0o++;
            if (!this.f12022OooOO0o) {
                return false;
            }
            int i = this.f12018OooO0oO + 1;
            this.f12018OooO0oO = i;
            int[] iArr = this.f12013OooO0O0.f39670OooO0oO;
            int i2 = this.f12019OooO0oo;
            if (i != iArr[i2]) {
                return true;
            }
            this.f12019OooO0oo = i2 + 1;
            this.f12018OooO0oO = 0;
            return false;
        }

        public final int OooO0OO(int i, int i2) {
            o00Oo00 o00oo00;
            o000Oo0 o000oo0OooO00o = OooO00o();
            if (o000oo0OooO00o == null) {
                return 0;
            }
            o000O00 o000o01 = this.f12013OooO0O0;
            int length = o000oo0OooO00o.f39700OooO0Oo;
            if (length != 0) {
                o00oo00 = o000o01.f39675OooOOO;
            } else {
                int i3 = o0O00.f40595OooO00o;
                byte[] bArr = o000oo0OooO00o.f39701OooO0o0;
                int length2 = bArr.length;
                o00Oo00 o00oo01 = this.f12021OooOO0O;
                o00oo01.OooOooo(length2, bArr);
                length = bArr.length;
                o00oo00 = o00oo01;
            }
            boolean z = o000o01.f39673OooOO0O && o000o01.f39674OooOO0o[this.f12016OooO0o];
            boolean z2 = z || i2 != 0;
            o00Oo00 o00oo02 = this.f12020OooOO0;
            o00oo02.f40591OooO00o[0] = (byte) ((z2 ? 128 : 0) | length);
            o00oo02.Oooo00O(0);
            TrackOutput trackOutput = this.f12012OooO00o;
            trackOutput.OooO0Oo(1, o00oo02);
            trackOutput.OooO0Oo(length, o00oo00);
            if (!z2) {
                return length + 1;
            }
            o00Oo00 o00oo03 = this.f12014OooO0OO;
            if (!z) {
                o00oo03.OooOooO(8);
                byte[] bArr2 = o00oo03.f40591OooO00o;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i2 >> 8) & 255);
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                trackOutput.OooO0Oo(8, o00oo03);
                return length + 1 + 8;
            }
            o00Oo00 o00oo04 = o000o01.f39675OooOOO;
            int iOooOoOO = o00oo04.OooOoOO();
            o00oo04.Oooo00o(-2);
            int i4 = (iOooOoOO * 6) + 2;
            if (i2 != 0) {
                o00oo03.OooOooO(i4);
                byte[] bArr3 = o00oo03.f40591OooO00o;
                o00oo04.OooO0Oo(0, i4, bArr3);
                int i5 = (((bArr3[2] & UByte.MAX_VALUE) << 8) | (bArr3[3] & UByte.MAX_VALUE)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & 255);
                bArr3[3] = (byte) (i5 & 255);
            } else {
                o00oo03 = o00oo04;
            }
            trackOutput.OooO0Oo(i4, o00oo03);
            return length + 1 + i4;
        }

        public final void OooO0Oo() {
            o000O00 o000o01 = this.f12013OooO0O0;
            o000o01.f39667OooO0Oo = 0;
            o000o01.f39678OooOOOo = 0L;
            o000o01.f39679OooOOo0 = false;
            o000o01.f39673OooOO0O = false;
            o000o01.f39677OooOOOO = false;
            o000o01.f39676OooOOO0 = null;
            this.f12016OooO0o = 0;
            this.f12019OooO0oo = 0;
            this.f12018OooO0oO = 0;
            this.f12011OooO = 0;
            this.f12022OooOO0o = false;
        }
    }

    static {
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        oooO00o.f11244OooOO0O = "application/x-emsg";
        f11975Oooo00o = oooO00o.OooO00o();
    }

    public FragmentedMp4Extractor() {
        this(0, Collections.emptyList(), null);
    }

    @Nullable
    public static DrmInitData OooO00o(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) arrayList.get(i);
            if (oooO0O0.f12052OooO00o == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = oooO0O0.f12056OooO0O0.f40591OooO00o;
                o000.OooO00o oooO00oOooO0O0 = o000.OooO0O0(bArr);
                UUID uuid = oooO00oOooO0O0 == null ? null : oooO00oOooO0O0.f39655OooO00o;
                if (uuid == null) {
                    Log.OooO0o("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, MediaUtils.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void OooO0OO(o00Oo00 o00oo00, int i, o000O00 o000o01) throws ParserException {
        o00oo00.Oooo00O(i + 8);
        int iOooO0o = o00oo00.OooO0o() & 16777215;
        if ((iOooO0o & 1) != 0) {
            throw ParserException.OooO0OO("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iOooO0o & 2) != 0;
        int iOooOoO0 = o00oo00.OooOoO0();
        if (iOooOoO0 == 0) {
            Arrays.fill(o000o01.f39674OooOO0o, 0, o000o01.f39669OooO0o0, false);
            return;
        }
        if (iOooOoO0 != o000o01.f39669OooO0o0) {
            StringBuilder sbOooO00o = o0000O0.OooO00o("Senc sample count ", iOooOoO0, " is different from fragment sample count");
            sbOooO00o.append(o000o01.f39669OooO0o0);
            throw ParserException.OooO00o(sbOooO00o.toString(), null);
        }
        Arrays.fill(o000o01.f39674OooOO0o, 0, iOooOoO0, z);
        int i2 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
        o00Oo00 o00oo01 = o000o01.f39675OooOOO;
        o00oo01.OooOooO(i2);
        o000o01.f39673OooOO0O = true;
        o000o01.f39677OooOOOO = true;
        o00oo00.OooO0Oo(0, o00oo01.f40593OooO0OO, o00oo01.f40591OooO00o);
        o00oo01.Oooo00O(0);
        o000o01.f39677OooOOOO = false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        SparseArray<OooO0O0> sparseArray = this.f11979OooO0OO;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).OooO0Oo();
        }
        this.f11987OooOO0o.clear();
        this.f11997OooOo00 = 0;
        this.f11996OooOo0 = j2;
        this.f11986OooOO0O.clear();
        this.f11988OooOOO = 0;
        this.f11993OooOOo0 = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        return o000O0o.OooO00o(o00o0o01, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0384  */
    /* JADX WARN: Code duplicated, block: B:151:0x038a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0397  */
    /* JADX WARN: Code duplicated, block: B:157:0x039d  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:169:0x03db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:172:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:180:0x040f  */
    /* JADX WARN: Code duplicated, block: B:181:0x041b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x042d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0458 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0446 A[SYNTHETIC] */
    public final void OooO0o0(long j) throws ParserException {
        o0000O0O o0000o0o2;
        o0000O0O o0000o0o3;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        ArrayList arrayList3;
        int i2;
        SparseArray<OooO0O0> sparseArray;
        int i3;
        byte[] bArr;
        int i4;
        boolean z;
        ArrayList arrayList4;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o c0203OooO00o;
        OooO0O0 oooO0O0;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z6;
        int i5;
        long j3;
        long j4;
        int i6;
        int iOooO0o;
        int iOooO0o2;
        int iOooO0o3;
        int iOooO0o4;
        long jOooo0oo;
        OooO0O0 oooO0O1;
        boolean z7;
        final FragmentedMp4Extractor fragmentedMp4Extractor = this;
        FragmentedMp4Extractor fragmentedMp4Extractor2 = fragmentedMp4Extractor;
        while (true) {
            ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> arrayDeque = fragmentedMp4Extractor.f11986OooOO0O;
            if (arrayDeque.isEmpty() || arrayDeque.peek().f12053OooO0O0 != j) {
                break;
            }
            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o c0203OooO00oPop = arrayDeque.pop();
            int i7 = c0203OooO00oPop.f12052OooO00o;
            SparseArray<OooO0O0> sparseArray2 = fragmentedMp4Extractor.f11979OooO0OO;
            ArrayList arrayList5 = c0203OooO00oPop.f12054OooO0OO;
            int i8 = 12;
            if (i7 == 1836019574) {
                DrmInitData drmInitDataOooO00o = OooO00o(arrayList5);
                com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o c0203OooO00oOooO0O0 = c0203OooO00oPop.OooO0O0(1836475768);
                c0203OooO00oOooO0O0.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList6 = c0203OooO00oOooO0O0.f12054OooO0OO;
                int size = arrayList6.size();
                long jOooOo0o = -9223372036854775807L;
                int i9 = 0;
                while (i9 < size) {
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O2 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) arrayList6.get(i9);
                    int i10 = oooO0O2.f12052OooO00o;
                    o00Oo00 o00oo00 = oooO0O2.f12056OooO0O0;
                    if (i10 == 1953654136) {
                        o00oo00.Oooo00O(i8);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(o00oo00.OooO0o()), new o0000O0O(o00oo00.OooO0o() - 1, o00oo00.OooO0o(), o00oo00.OooO0o(), o00oo00.OooO0o()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (o0000O0O) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i10 == 1835362404) {
                            o00oo00.Oooo00O(8);
                            jOooOo0o = ((o00oo00.OooO0o() >> 24) & 255) == 0 ? o00oo00.OooOo0o() : o00oo00.OooOoO();
                        }
                    }
                    i9++;
                    i8 = 12;
                    arrayList6 = arrayList;
                }
                ArrayList arrayListOooO0o = com.google.android.exoplayer2.extractor.mp4.OooO0O0.OooO0o(c0203OooO00oPop, new o00O(), jOooOo0o, drmInitDataOooO00o, (fragmentedMp4Extractor.f11977OooO00o & 16) != 0, false, new OooOOO0() { // from class: o00oO00o.o000OO
                    @Override // com.google.common.base.OooOOO0
                    public final Object apply(Object obj) {
                        Track track = (Track) obj;
                        this.f39696OooO0Oo.getClass();
                        return track;
                    }
                });
                int size2 = arrayListOooO0o.size();
                if (sparseArray2.size() == 0) {
                    for (int i11 = 0; i11 < size2; i11++) {
                        o000O00O o000o00o2 = (o000O00O) arrayListOooO0o.get(i11);
                        Track track = o000o00o2.f39687OooO00o;
                        TrackOutput trackOutputOooOOO = fragmentedMp4Extractor.f12003OooOoo.OooOOO(i11, track.f12087OooO0O0);
                        int size3 = sparseArray3.size();
                        int i12 = track.f12086OooO00o;
                        if (size3 == 1) {
                            o0000o0o3 = (o0000O0O) sparseArray3.valueAt(0);
                        } else {
                            o0000o0o3 = (o0000O0O) sparseArray3.get(i12);
                            o0000o0o3.getClass();
                        }
                        sparseArray2.put(i12, new OooO0O0(trackOutputOooOOO, o000o00o2, o0000o0o3));
                        fragmentedMp4Extractor.f11998OooOo0O = Math.max(fragmentedMp4Extractor.f11998OooOo0O, track.f12091OooO0o0);
                    }
                    fragmentedMp4Extractor.f12003OooOoo.OooO00o();
                } else {
                    o00O000o.OooO0Oo(sparseArray2.size() == size2);
                    for (int i13 = 0; i13 < size2; i13++) {
                        o000O00O o000o00o3 = (o000O00O) arrayListOooO0o.get(i13);
                        Track track2 = o000o00o3.f39687OooO00o;
                        OooO0O0 oooO0O3 = sparseArray2.get(track2.f12086OooO00o);
                        if (sparseArray3.size() == 1) {
                            o0000o0o2 = (o0000O0O) sparseArray3.valueAt(0);
                        } else {
                            o0000o0o2 = (o0000O0O) sparseArray3.get(track2.f12086OooO00o);
                            o0000o0o2.getClass();
                        }
                        oooO0O3.f12015OooO0Oo = o000o00o3;
                        oooO0O3.f12017OooO0o0 = o0000o0o2;
                        oooO0O3.f12012OooO00o.OooO0OO(o000o00o3.f39687OooO00o.f12090OooO0o);
                        oooO0O3.OooO0Oo();
                    }
                }
            } else if (i7 == 1836019558) {
                ArrayList arrayList7 = c0203OooO00oPop.f12055OooO0Oo;
                int size4 = arrayList7.size();
                int i14 = 0;
                FragmentedMp4Extractor fragmentedMp4Extractor3 = fragmentedMp4Extractor2;
                FragmentedMp4Extractor fragmentedMp4Extractor4 = fragmentedMp4Extractor;
                while (i14 < size4) {
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o c0203OooO00o2 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o) arrayList7.get(i14);
                    if (c0203OooO00o2.f12052OooO00o == 1953653094) {
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO = c0203OooO00o2.OooO0OO(1952868452);
                        oooO0O0OooO0OO.getClass();
                        o00Oo00 o00oo01 = oooO0O0OooO0OO.f12056OooO0O0;
                        o00oo01.Oooo00O(8);
                        int iOooO0o5 = o00oo01.OooO0o() & 16777215;
                        OooO0O0 oooO0O4 = sparseArray2.get(o00oo01.OooO0o());
                        if (oooO0O4 == null) {
                            oooO0O4 = null;
                            fragmentedMp4Extractor = fragmentedMp4Extractor;
                        } else {
                            int i15 = iOooO0o5 & 1;
                            o000O00 o000o01 = oooO0O4.f12013OooO0O0;
                            if (i15 != 0) {
                                long jOooOoO = o00oo01.OooOoO();
                                o000o01.f39665OooO0O0 = jOooOoO;
                                o000o01.f39666OooO0OO = jOooOoO;
                            }
                            o0000O0O o0000o0o4 = oooO0O4.f12017OooO0o0;
                            o000o01.f39664OooO00o = new o0000O0O((iOooO0o5 & 2) != 0 ? o00oo01.OooO0o() - 1 : o0000o0o4.f39659OooO00o, (iOooO0o5 & 8) != 0 ? o00oo01.OooO0o() : o0000o0o4.f39660OooO0O0, (iOooO0o5 & 16) != 0 ? o00oo01.OooO0o() : o0000o0o4.f39661OooO0OO, (iOooO0o5 & 32) != 0 ? o00oo01.OooO0o() : o0000o0o4.f39662OooO0Oo);
                        }
                        if (oooO0O4 != null) {
                            o000O00 o000o02 = oooO0O4.f12013OooO0O0;
                            long j5 = o000o02.f39678OooOOOo;
                            boolean z8 = o000o02.f39679OooOOo0;
                            oooO0O4.OooO0Oo();
                            oooO0O4.f12022OooOO0o = true;
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO2 = c0203OooO00o2.OooO0OO(1952867444);
                            int i16 = fragmentedMp4Extractor4.f11977OooO00o;
                            if (oooO0O0OooO0OO2 == null || (i16 & 2) != 0) {
                                o000o02.f39678OooOOOo = j5;
                                o000o02.f39679OooOOo0 = z8;
                            } else {
                                o00Oo00 o00oo02 = oooO0O0OooO0OO2.f12056OooO0O0;
                                o00oo02.Oooo00O(8);
                                o000o02.f39678OooOOOo = ((o00oo02.OooO0o() >> 24) & 255) == 1 ? o00oo02.OooOoO() : o00oo02.OooOo0o();
                                o000o02.f39679OooOOo0 = true;
                            }
                            ArrayList arrayList8 = c0203OooO00o2.f12054OooO0OO;
                            int size5 = arrayList8.size();
                            int i17 = 0;
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                i3 = 1953658222;
                                if (i17 >= size5) {
                                    break;
                                }
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O5 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) arrayList8.get(i17);
                                ArrayList arrayList9 = arrayList7;
                                if (oooO0O5.f12052OooO00o == 1953658222) {
                                    o00Oo00 o00oo03 = oooO0O5.f12056OooO0O0;
                                    o00oo03.Oooo00O(12);
                                    int iOooOoO0 = o00oo03.OooOoO0();
                                    if (iOooOoO0 > 0) {
                                        i19 += iOooOoO0;
                                        i18++;
                                    }
                                }
                                i17++;
                                arrayList7 = arrayList9;
                            }
                            arrayList2 = arrayList7;
                            oooO0O4.f12019OooO0oo = 0;
                            oooO0O4.f12018OooO0oO = 0;
                            oooO0O4.f12016OooO0o = 0;
                            o000o02.f39667OooO0Oo = i18;
                            o000o02.f39669OooO0o0 = i19;
                            if (o000o02.f39670OooO0oO.length < i18) {
                                o000o02.f39668OooO0o = new long[i18];
                                o000o02.f39670OooO0oO = new int[i18];
                            }
                            if (o000o02.f39671OooO0oo.length < i19) {
                                int i20 = (i19 * 125) / 100;
                                o000o02.f39671OooO0oo = new int[i20];
                                o000o02.f39663OooO = new long[i20];
                                o000o02.f39672OooOO0 = new boolean[i20];
                                o000o02.f39674OooOO0o = new boolean[i20];
                            }
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 0;
                            OooO0O0 oooO0O6 = oooO0O4;
                            while (i21 < size5) {
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O7 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) arrayList8.get(i21);
                                int i24 = size4;
                                if (oooO0O7.f12052OooO00o == i3) {
                                    int i25 = i23 + 1;
                                    o00Oo00 o00oo04 = oooO0O7.f12056OooO0O0;
                                    o00oo04.Oooo00O(8);
                                    int iOooO0o6 = o00oo04.OooO0o() & 16777215;
                                    Track track3 = oooO0O6.f12015OooO0Oo.f39687OooO00o;
                                    o0000O0O o0000o0o5 = o000o02.f39664OooO00o;
                                    int i26 = o0O00.f40595OooO00o;
                                    o000o02.f39670OooO0oO[i23] = o00oo04.OooOoO0();
                                    long[] jArr2 = o000o02.f39668OooO0o;
                                    long j6 = o000o02.f39665OooO0O0;
                                    jArr2[i23] = j6;
                                    if ((iOooO0o6 & 1) != 0) {
                                        jArr2[i23] = j6 + ((long) o00oo04.OooO0o());
                                    }
                                    boolean z9 = (iOooO0o6 & 4) != 0;
                                    int iOooO0o7 = o0000o0o5.f39662OooO0Oo;
                                    if (z9) {
                                        iOooO0o7 = o00oo04.OooO0o();
                                    }
                                    boolean z10 = (iOooO0o6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
                                    boolean z11 = (iOooO0o6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0;
                                    boolean z12 = (iOooO0o6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
                                    boolean z13 = (iOooO0o6 & 2048) != 0;
                                    long[] jArr3 = track3.f12093OooO0oo;
                                    int i27 = iOooO0o7;
                                    long[] jArr4 = track3.f12085OooO;
                                    if (jArr3 != null) {
                                        arrayList4 = arrayList8;
                                        c0203OooO00o = c0203OooO00o2;
                                        if (jArr3.length != 1 || jArr4 == null) {
                                            z4 = z9;
                                            z2 = z11;
                                            z3 = z12;
                                        } else {
                                            long j7 = jArr3[0];
                                            if (j7 == 0) {
                                                z4 = z9;
                                                z2 = z11;
                                                z3 = z12;
                                            } else {
                                                z4 = z9;
                                                long jOooo0oo2 = o0O00.Oooo0oo(j7 + jArr4[0], AnimationKt.MillisToNanos, track3.f12089OooO0Oo);
                                                z2 = z11;
                                                z3 = z12;
                                                if (jOooo0oo2 >= track3.f12091OooO0o0) {
                                                }
                                                if (z5) {
                                                    j2 = jArr4[0];
                                                } else {
                                                    j2 = 0;
                                                }
                                                iArr = o000o02.f39671OooO0oo;
                                                jArr = o000o02.f39663OooO;
                                                zArr = o000o02.f39672OooOO0;
                                                if (track3.f12087OooO0O0 == 2 || (i16 & 1) == 0) {
                                                    z6 = false;
                                                } else {
                                                    z6 = true;
                                                }
                                                i5 = o000o02.f39670OooO0oO[i23] + i22;
                                                j3 = track3.f12088OooO0OO;
                                                j4 = o000o02.f39678OooOOOo;
                                                i6 = i22;
                                                while (i6 < i5) {
                                                    if (z10) {
                                                        iOooO0o = o00oo04.OooO0o();
                                                    } else {
                                                        iOooO0o = o0000o0o5.f39660OooO0O0;
                                                    }
                                                    if (iOooO0o < 0) {
                                                        throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o, null);
                                                    }
                                                    if (z2) {
                                                        iOooO0o2 = o00oo04.OooO0o();
                                                    } else {
                                                        iOooO0o2 = o0000o0o5.f39661OooO0OO;
                                                    }
                                                    if (iOooO0o2 < 0) {
                                                        throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o2, null);
                                                    }
                                                    if (z3) {
                                                        iOooO0o3 = o00oo04.OooO0o();
                                                    } else if (i6 == 0 || !z4) {
                                                        iOooO0o3 = o0000o0o5.f39662OooO0Oo;
                                                    } else {
                                                        iOooO0o3 = i27;
                                                    }
                                                    if (z13) {
                                                        iOooO0o4 = o00oo04.OooO0o();
                                                    } else {
                                                        iOooO0o4 = 0;
                                                    }
                                                    o0000O0O o0000o0o6 = o0000o0o5;
                                                    boolean z14 = z4;
                                                    int i28 = iOooO0o4;
                                                    int i29 = iOooO0o;
                                                    jOooo0oo = o0O00.Oooo0oo((((long) i28) + j4) - j2, AnimationKt.MillisToNanos, j3);
                                                    jArr[i6] = jOooo0oo;
                                                    if (o000o02.f39679OooOOo0) {
                                                        oooO0O1 = oooO0O4;
                                                    } else {
                                                        oooO0O1 = oooO0O4;
                                                        jArr[i6] = jOooo0oo + oooO0O1.f12015OooO0Oo.f39694OooO0oo;
                                                    }
                                                    iArr[i6] = iOooO0o2;
                                                    if (((iOooO0o3 >> 16) & 1) == 0 || (z6 && i6 != 0)) {
                                                        z7 = false;
                                                    } else {
                                                        z7 = true;
                                                    }
                                                    zArr[i6] = z7;
                                                    j4 += (long) i29;
                                                    i6++;
                                                    oooO0O4 = oooO0O1;
                                                    j3 = j3;
                                                    z10 = z10;
                                                    i5 = i5;
                                                    z2 = z2;
                                                    o0000o0o5 = o0000o0o6;
                                                    z4 = z14;
                                                }
                                                oooO0O0 = oooO0O4;
                                                o000o02.f39678OooOOOo = j4;
                                                oooO0O6 = oooO0O0;
                                                i23 = i25;
                                                i22 = i5;
                                            }
                                            z5 = true;
                                            if (z5) {
                                                j2 = jArr4[0];
                                            } else {
                                                j2 = 0;
                                            }
                                            iArr = o000o02.f39671OooO0oo;
                                            jArr = o000o02.f39663OooO;
                                            zArr = o000o02.f39672OooOO0;
                                            if (track3.f12087OooO0O0 == 2) {
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                            }
                                            i5 = o000o02.f39670OooO0oO[i23] + i22;
                                            j3 = track3.f12088OooO0OO;
                                            j4 = o000o02.f39678OooOOOo;
                                            i6 = i22;
                                            while (i6 < i5) {
                                                if (z10) {
                                                    iOooO0o = o00oo04.OooO0o();
                                                } else {
                                                    iOooO0o = o0000o0o5.f39660OooO0O0;
                                                }
                                                if (iOooO0o < 0) {
                                                    throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o, null);
                                                }
                                                if (z2) {
                                                    iOooO0o2 = o00oo04.OooO0o();
                                                } else {
                                                    iOooO0o2 = o0000o0o5.f39661OooO0OO;
                                                }
                                                if (iOooO0o2 < 0) {
                                                    throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o2, null);
                                                }
                                                if (z3) {
                                                    iOooO0o3 = o00oo04.OooO0o();
                                                } else if (i6 == 0) {
                                                    iOooO0o3 = o0000o0o5.f39662OooO0Oo;
                                                } else {
                                                    iOooO0o3 = o0000o0o5.f39662OooO0Oo;
                                                }
                                                if (z13) {
                                                    iOooO0o4 = o00oo04.OooO0o();
                                                } else {
                                                    iOooO0o4 = 0;
                                                }
                                                o0000O0O o0000o0o7 = o0000o0o5;
                                                boolean z15 = z4;
                                                int i210 = iOooO0o4;
                                                int i211 = iOooO0o;
                                                jOooo0oo = o0O00.Oooo0oo((((long) i210) + j4) - j2, AnimationKt.MillisToNanos, j3);
                                                jArr[i6] = jOooo0oo;
                                                if (o000o02.f39679OooOOo0) {
                                                    oooO0O1 = oooO0O4;
                                                    jArr[i6] = jOooo0oo + oooO0O1.f12015OooO0Oo.f39694OooO0oo;
                                                } else {
                                                    oooO0O1 = oooO0O4;
                                                }
                                                iArr[i6] = iOooO0o2;
                                                if (((iOooO0o3 >> 16) & 1) == 0) {
                                                    z7 = false;
                                                } else {
                                                    z7 = false;
                                                }
                                                zArr[i6] = z7;
                                                j4 += (long) i211;
                                                i6++;
                                                oooO0O4 = oooO0O1;
                                                j3 = j3;
                                                z10 = z10;
                                                i5 = i5;
                                                z2 = z2;
                                                o0000o0o5 = o0000o0o7;
                                                z4 = z15;
                                            }
                                            oooO0O0 = oooO0O4;
                                            o000o02.f39678OooOOOo = j4;
                                            oooO0O6 = oooO0O0;
                                            i23 = i25;
                                            i22 = i5;
                                        }
                                    } else {
                                        arrayList4 = arrayList8;
                                        c0203OooO00o = c0203OooO00o2;
                                        z2 = z11;
                                        z3 = z12;
                                        z4 = z9;
                                    }
                                    z5 = false;
                                    if (z5) {
                                        j2 = jArr4[0];
                                    } else {
                                        j2 = 0;
                                    }
                                    iArr = o000o02.f39671OooO0oo;
                                    jArr = o000o02.f39663OooO;
                                    zArr = o000o02.f39672OooOO0;
                                    if (track3.f12087OooO0O0 == 2) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    i5 = o000o02.f39670OooO0oO[i23] + i22;
                                    j3 = track3.f12088OooO0OO;
                                    j4 = o000o02.f39678OooOOOo;
                                    i6 = i22;
                                    while (i6 < i5) {
                                        if (z10) {
                                            iOooO0o = o00oo04.OooO0o();
                                        } else {
                                            iOooO0o = o0000o0o5.f39660OooO0O0;
                                        }
                                        if (iOooO0o < 0) {
                                            throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o, null);
                                        }
                                        if (z2) {
                                            iOooO0o2 = o00oo04.OooO0o();
                                        } else {
                                            iOooO0o2 = o0000o0o5.f39661OooO0OO;
                                        }
                                        if (iOooO0o2 < 0) {
                                            throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o2, null);
                                        }
                                        if (z3) {
                                            iOooO0o3 = o00oo04.OooO0o();
                                        } else if (i6 == 0) {
                                            iOooO0o3 = o0000o0o5.f39662OooO0Oo;
                                        } else {
                                            iOooO0o3 = o0000o0o5.f39662OooO0Oo;
                                        }
                                        if (z13) {
                                            iOooO0o4 = o00oo04.OooO0o();
                                        } else {
                                            iOooO0o4 = 0;
                                        }
                                        o0000O0O o0000o0o8 = o0000o0o5;
                                        boolean z16 = z4;
                                        int i212 = iOooO0o4;
                                        int i213 = iOooO0o;
                                        jOooo0oo = o0O00.Oooo0oo((((long) i212) + j4) - j2, AnimationKt.MillisToNanos, j3);
                                        jArr[i6] = jOooo0oo;
                                        if (o000o02.f39679OooOOo0) {
                                            oooO0O1 = oooO0O4;
                                            jArr[i6] = jOooo0oo + oooO0O1.f12015OooO0Oo.f39694OooO0oo;
                                        } else {
                                            oooO0O1 = oooO0O4;
                                        }
                                        iArr[i6] = iOooO0o2;
                                        if (((iOooO0o3 >> 16) & 1) == 0) {
                                            z7 = false;
                                        } else {
                                            z7 = false;
                                        }
                                        zArr[i6] = z7;
                                        j4 += (long) i213;
                                        i6++;
                                        oooO0O4 = oooO0O1;
                                        j3 = j3;
                                        z10 = z10;
                                        i5 = i5;
                                        z2 = z2;
                                        o0000o0o5 = o0000o0o8;
                                        z4 = z16;
                                    }
                                    oooO0O0 = oooO0O4;
                                    o000o02.f39678OooOOOo = j4;
                                    oooO0O6 = oooO0O0;
                                    i23 = i25;
                                    i22 = i5;
                                } else {
                                    arrayList4 = arrayList8;
                                    c0203OooO00o = c0203OooO00o2;
                                    oooO0O0 = oooO0O4;
                                    sparseArray2 = sparseArray2;
                                }
                                i21++;
                                i3 = 1953658222;
                                oooO0O4 = oooO0O0;
                                size4 = i24;
                                size5 = size5;
                                arrayList5 = arrayList5;
                                i14 = i14;
                                sparseArray2 = sparseArray2;
                                arrayList8 = arrayList4;
                                c0203OooO00o2 = c0203OooO00o;
                                i16 = i16;
                            }
                            i = size4;
                            ArrayList arrayList10 = arrayList8;
                            arrayList3 = arrayList5;
                            i2 = i14;
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o c0203OooO00o3 = c0203OooO00o2;
                            sparseArray = sparseArray2;
                            Track track4 = oooO0O4.f12015OooO0Oo.f39687OooO00o;
                            o0000O0O o0000o0o9 = o000o02.f39664OooO00o;
                            o0000o0o9.getClass();
                            o000Oo0[] o000oo0Arr = track4.f12095OooOO0O;
                            o000Oo0 o000oo1 = o000oo0Arr == null ? null : o000oo0Arr[o0000o0o9.f39659OooO00o];
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO3 = c0203OooO00o3.OooO0OO(1935763834);
                            if (oooO0O0OooO0OO3 != null) {
                                o000oo1.getClass();
                                o00Oo00 o00oo05 = oooO0O0OooO0OO3.f12056OooO0O0;
                                o00oo05.Oooo00O(8);
                                if ((o00oo05.OooO0o() & 16777215 & 1) == 1) {
                                    o00oo05.Oooo00o(8);
                                }
                                int iOooOo0O = o00oo05.OooOo0O();
                                int iOooOoO1 = o00oo05.OooOoO0();
                                if (iOooOoO1 > o000o02.f39669OooO0o0) {
                                    StringBuilder sbOooO00o = o0000O0.OooO00o("Saiz sample count ", iOooOoO1, " is greater than fragment sample count");
                                    sbOooO00o.append(o000o02.f39669OooO0o0);
                                    throw ParserException.OooO00o(sbOooO00o.toString(), null);
                                }
                                int i30 = o000oo1.f39700OooO0Oo;
                                if (iOooOo0O == 0) {
                                    boolean[] zArr2 = o000o02.f39674OooOO0o;
                                    i4 = 0;
                                    for (int i31 = 0; i31 < iOooOoO1; i31++) {
                                        int iOooOo0O2 = o00oo05.OooOo0O();
                                        i4 += iOooOo0O2;
                                        zArr2[i31] = iOooOo0O2 > i30;
                                    }
                                    z = false;
                                } else {
                                    i4 = (iOooOo0O * iOooOoO1) + 0;
                                    Arrays.fill(o000o02.f39674OooOO0o, 0, iOooOoO1, iOooOo0O > i30);
                                    z = false;
                                }
                                Arrays.fill(o000o02.f39674OooOO0o, iOooOoO1, o000o02.f39669OooO0o0, z);
                                if (i4 > 0) {
                                    o000o02.f39675OooOOO.OooOooO(i4);
                                    o000o02.f39673OooOO0O = true;
                                    o000o02.f39677OooOOOO = true;
                                }
                            }
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO4 = c0203OooO00o3.OooO0OO(1935763823);
                            if (oooO0O0OooO0OO4 != null) {
                                o00Oo00 o00oo06 = oooO0O0OooO0OO4.f12056OooO0O0;
                                o00oo06.Oooo00O(8);
                                int iOooO0o8 = o00oo06.OooO0o();
                                if ((16777215 & iOooO0o8 & 1) == 1) {
                                    o00oo06.Oooo00o(8);
                                }
                                int iOooOoO2 = o00oo06.OooOoO0();
                                if (iOooOoO2 != 1) {
                                    throw ParserException.OooO00o("Unexpected saio entry count: " + iOooOoO2, null);
                                }
                                o000o02.f39666OooO0OO += ((iOooO0o8 >> 24) & 255) == 0 ? o00oo06.OooOo0o() : o00oo06.OooOoO();
                            }
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO5 = c0203OooO00o3.OooO0OO(1936027235);
                            if (oooO0O0OooO0OO5 != null) {
                                OooO0OO(oooO0O0OooO0OO5.f12056OooO0O0, 0, o000o02);
                            }
                            String str = o000oo1 != null ? o000oo1.f39698OooO0O0 : null;
                            int i32 = 0;
                            o00Oo00 o00oo07 = null;
                            o00Oo00 o00oo08 = null;
                            while (i32 < arrayList10.size()) {
                                ArrayList arrayList11 = arrayList10;
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O8 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) arrayList11.get(i32);
                                o00Oo00 o00oo09 = oooO0O8.f12056OooO0O0;
                                int i33 = oooO0O8.f12052OooO00o;
                                if (i33 == 1935828848) {
                                    o00oo09.Oooo00O(12);
                                    if (o00oo09.OooO0o() == 1936025959) {
                                        o00oo07 = o00oo09;
                                    }
                                } else if (i33 == 1936158820) {
                                    o00oo09.Oooo00O(12);
                                    if (o00oo09.OooO0o() == 1936025959) {
                                        o00oo08 = o00oo09;
                                    }
                                }
                                i32++;
                                arrayList10 = arrayList11;
                            }
                            ArrayList arrayList12 = arrayList10;
                            if (o00oo07 != null && o00oo08 != null) {
                                o00oo07.Oooo00O(8);
                                int iOooO0o9 = (o00oo07.OooO0o() >> 24) & 255;
                                o00oo07.Oooo00o(4);
                                if (iOooO0o9 == 1) {
                                    o00oo07.Oooo00o(4);
                                }
                                if (o00oo07.OooO0o() != 1) {
                                    throw ParserException.OooO0OO("Entry count in sbgp != 1 (unsupported).");
                                }
                                o00oo08.Oooo00O(8);
                                int iOooO0o10 = (o00oo08.OooO0o() >> 24) & 255;
                                o00oo08.Oooo00o(4);
                                if (iOooO0o10 == 1) {
                                    if (o00oo08.OooOo0o() == 0) {
                                        throw ParserException.OooO0OO("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iOooO0o10 >= 2) {
                                    o00oo08.Oooo00o(4);
                                }
                                if (o00oo08.OooOo0o() != 1) {
                                    throw ParserException.OooO0OO("Entry count in sgpd != 1 (unsupported).");
                                }
                                o00oo08.Oooo00o(1);
                                int iOooOo0O3 = o00oo08.OooOo0O();
                                int i34 = (iOooOo0O3 & 240) >> 4;
                                int i35 = iOooOo0O3 & 15;
                                boolean z17 = o00oo08.OooOo0O() == 1;
                                if (z17) {
                                    int iOooOo0O4 = o00oo08.OooOo0O();
                                    byte[] bArr2 = new byte[16];
                                    o00oo08.OooO0Oo(0, 16, bArr2);
                                    if (iOooOo0O4 == 0) {
                                        int iOooOo0O5 = o00oo08.OooOo0O();
                                        byte[] bArr3 = new byte[iOooOo0O5];
                                        o00oo08.OooO0Oo(0, iOooOo0O5, bArr3);
                                        bArr = bArr3;
                                    } else {
                                        bArr = null;
                                    }
                                    o000o02.f39673OooOO0O = true;
                                    o000o02.f39676OooOOO0 = new o000Oo0(z17, str, iOooOo0O4, bArr2, i34, i35, bArr);
                                }
                            }
                            int size6 = arrayList12.size();
                            for (int i36 = 0; i36 < size6; i36++) {
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O9 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) arrayList12.get(i36);
                                if (oooO0O9.f12052OooO00o == 1970628964) {
                                    o00Oo00 o00oo010 = oooO0O9.f12056OooO0O0;
                                    o00oo010.Oooo00O(8);
                                    byte[] bArr4 = this.f11983OooO0oO;
                                    o00oo010.OooO0Oo(0, 16, bArr4);
                                    if (Arrays.equals(bArr4, f11974Oooo00O)) {
                                        OooO0OO(o00oo010, 16, o000o02);
                                    }
                                }
                            }
                            fragmentedMp4Extractor = this;
                            fragmentedMp4Extractor4 = fragmentedMp4Extractor;
                            fragmentedMp4Extractor3 = fragmentedMp4Extractor4;
                        }
                        i14 = i2 + 1;
                        arrayList7 = arrayList2;
                        size4 = i;
                        arrayList5 = arrayList3;
                        sparseArray2 = sparseArray;
                    } else {
                        fragmentedMp4Extractor = fragmentedMp4Extractor;
                    }
                    arrayList2 = arrayList7;
                    i = size4;
                    arrayList3 = arrayList5;
                    i2 = i14;
                    sparseArray = sparseArray2;
                    fragmentedMp4Extractor = fragmentedMp4Extractor;
                    i14 = i2 + 1;
                    arrayList7 = arrayList2;
                    size4 = i;
                    arrayList5 = arrayList3;
                    sparseArray2 = sparseArray;
                }
                FragmentedMp4Extractor fragmentedMp4Extractor5 = fragmentedMp4Extractor;
                SparseArray<OooO0O0> sparseArray4 = sparseArray2;
                DrmInitData drmInitDataOooO00o2 = OooO00o(arrayList5);
                if (drmInitDataOooO00o2 != null) {
                    int size7 = sparseArray4.size();
                    int i37 = 0;
                    while (i37 < size7) {
                        SparseArray<OooO0O0> sparseArray5 = sparseArray4;
                        OooO0O0 oooO0O0ValueAt = sparseArray5.valueAt(i37);
                        Track track5 = oooO0O0ValueAt.f12015OooO0Oo.f39687OooO00o;
                        o0000O0O o0000o0o10 = oooO0O0ValueAt.f12013OooO0O0.f39664OooO00o;
                        int i38 = o0O00.f40595OooO00o;
                        int i39 = o0000o0o10.f39659OooO00o;
                        o000Oo0[] o000oo0Arr2 = track5.f12095OooOO0O;
                        o000Oo0 o000oo2 = o000oo0Arr2 == null ? null : o000oo0Arr2[i39];
                        DrmInitData drmInitDataOooO00o3 = drmInitDataOooO00o2.OooO00o(o000oo2 != null ? o000oo2.f39698OooO0O0 : null);
                        OooOo oooOo = oooO0O0ValueAt.f12015OooO0Oo.f39687OooO00o.f12090OooO0o;
                        oooOo.getClass();
                        OooOo.OooO00o oooO00o = new OooOo.OooO00o(oooOo);
                        oooO00o.f11246OooOOO = drmInitDataOooO00o3;
                        oooO0O0ValueAt.f12012OooO00o.OooO0OO(new OooOo(oooO00o));
                        i37++;
                        sparseArray4 = sparseArray5;
                    }
                }
                SparseArray<OooO0O0> sparseArray6 = sparseArray4;
                if (fragmentedMp4Extractor4.f11996OooOo0 != -9223372036854775807L) {
                    int size8 = sparseArray6.size();
                    for (int i40 = 0; i40 < size8; i40++) {
                        OooO0O0 oooO0O0ValueAt2 = sparseArray6.valueAt(i40);
                        long j8 = fragmentedMp4Extractor4.f11996OooOo0;
                        int i41 = oooO0O0ValueAt2.f12016OooO0o;
                        while (true) {
                            o000O00 o000o03 = oooO0O0ValueAt2.f12013OooO0O0;
                            if (i41 >= o000o03.f39669OooO0o0 || o000o03.f39663OooO[i41] > j8) {
                                break;
                            }
                            if (o000o03.f39672OooOO0[i41]) {
                                oooO0O0ValueAt2.f12011OooO = i41;
                            }
                            i41++;
                        }
                    }
                    fragmentedMp4Extractor4.f11996OooOo0 = -9223372036854775807L;
                }
                fragmentedMp4Extractor2 = fragmentedMp4Extractor3;
                fragmentedMp4Extractor = fragmentedMp4Extractor5;
            } else if (!arrayDeque.isEmpty()) {
                arrayDeque.peek().f12055OooO0Oo.add(c0203OooO00oPop);
            }
        }
        fragmentedMp4Extractor2.f11988OooOOO = 0;
        fragmentedMp4Extractor2.f11993OooOOo0 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f9 A[PHI: r17
      0x01f9: PHI (r17v13 o00oo0o.o00Oo00) = (r17v11 o00oo0o.o00Oo00), (r17v14 o00oo0o.o00Oo00) binds: [B:101:0x01f7, B:95:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:111:0x021d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0225  */
    /* JADX WARN: Code duplicated, block: B:114:0x025a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0279 A[LOOP:5: B:117:0x0279->B:119:0x027f, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:119:0x027f A[LOOP:5: B:117:0x0279->B:119:0x027f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x028f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0298  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0302  */
    /* JADX WARN: Code duplicated, block: B:224:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:225:0x05df  */
    /* JADX WARN: Code duplicated, block: B:227:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:234:0x0603  */
    /* JADX WARN: Code duplicated, block: B:237:0x0615  */
    /* JADX WARN: Code duplicated, block: B:245:0x0640  */
    /* JADX WARN: Code duplicated, block: B:247:0x0647 A[LOOP:10: B:246:0x0645->B:247:0x0647, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x065d  */
    /* JADX WARN: Code duplicated, block: B:251:0x066b  */
    /* JADX WARN: Code duplicated, block: B:270:0x0698  */
    /* JADX WARN: Code duplicated, block: B:272:0x069b  */
    /* JADX WARN: Code duplicated, block: B:274:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:275:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:278:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:336:0x0750  */
    /* JADX WARN: Code duplicated, block: B:339:0x0756  */
    /* JADX WARN: Code duplicated, block: B:341:0x075c  */
    /* JADX WARN: Code duplicated, block: B:343:0x0762  */
    /* JADX WARN: Code duplicated, block: B:348:0x0787  */
    /* JADX WARN: Code duplicated, block: B:350:0x078d  */
    /* JADX WARN: Code duplicated, block: B:360:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x07a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0780 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x0779 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x079c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x028b A[EDGE_INSN: B:384:0x028b->B:120:0x028b BREAK  A[LOOP:5: B:117:0x0279->B:119:0x027f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x018a  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        FragmentedMp4Extractor fragmentedMp4Extractor;
        long j;
        o00O00o0 o00o00o1;
        long j2;
        long j3;
        int i;
        o00O00o0 o00o00o2;
        long j4;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j5;
        int size;
        int i4;
        String str;
        String str2;
        long jOooo0oo;
        long j6;
        long jOooOo0o;
        long jOooo0oo2;
        long jOooOoO;
        long jOooOoO2;
        o000O00O o000o00o2;
        Track track;
        TrackOutput trackOutput;
        boolean z5;
        o000O00 o000o01;
        long j7;
        int i5;
        int i6;
        int i7;
        int i8;
        o000Oo0 o000oo0OooO00o;
        TrackOutput.OooO00o oooO00o;
        OooO00o oooO00oRemoveFirst;
        boolean z6;
        long j8;
        int i9;
        o00Oo00 o00oo00;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        OooOo oooOo;
        o00Oo00 o00oo01;
        int iOooO00o;
        int iOooO0o;
        String str3;
        byte b;
        boolean z7;
        boolean z8;
        boolean z9;
        o000O00 o000o02;
        int i13;
        int i14;
        o000Oo0 o000oo0OooO00o2;
        o00Oo00 o00oo02;
        int i15;
        boolean z10;
        FragmentedMp4Extractor fragmentedMp4Extractor2 = this;
        o00O0O00 o00o0o02 = o00o0o01;
        FragmentedMp4Extractor fragmentedMp4Extractor3 = fragmentedMp4Extractor2;
        while (true) {
            int i16 = fragmentedMp4Extractor3.f11988OooOOO;
            ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o> arrayDeque = fragmentedMp4Extractor3.f11986OooOO0O;
            SparseArray<OooO0O0> sparseArray = fragmentedMp4Extractor3.f11979OooO0OO;
            if (i16 != 0) {
                ArrayDeque<OooO00o> arrayDeque2 = fragmentedMp4Extractor3.f11987OooOO0o;
                if (i16 != 1) {
                    long j9 = LongCompanionObject.MAX_VALUE;
                    if (i16 != 2) {
                        OooO0O0 oooO0O0 = fragmentedMp4Extractor3.f11995OooOo;
                        if (oooO0O0 == null) {
                            int size2 = sparseArray.size();
                            OooO0O0 oooO0O1 = null;
                            for (int i17 = 0; i17 < size2; i17++) {
                                OooO0O0 oooO0O0ValueAt = sparseArray.valueAt(i17);
                                boolean z11 = oooO0O0ValueAt.f12022OooOO0o;
                                if (z11 || oooO0O0ValueAt.f12016OooO0o != oooO0O0ValueAt.f12015OooO0Oo.f39688OooO0O0) {
                                    o000O00 o000o03 = oooO0O0ValueAt.f12013OooO0O0;
                                    if (!z11 || oooO0O0ValueAt.f12019OooO0oo != o000o03.f39667OooO0Oo) {
                                        long j10 = !z11 ? oooO0O0ValueAt.f12015OooO0Oo.f39689OooO0OO[oooO0O0ValueAt.f12016OooO0o] : o000o03.f39668OooO0o[oooO0O0ValueAt.f12019OooO0oo];
                                        if (j10 < j9) {
                                            oooO0O1 = oooO0O0ValueAt;
                                            j9 = j10;
                                        }
                                    }
                                }
                            }
                            if (oooO0O1 == null) {
                                int i18 = (int) (fragmentedMp4Extractor3.f11994OooOOoo - ((o00O00o0) o00o0o01).f39532OooO0Oo);
                                if (i18 < 0) {
                                    throw ParserException.OooO00o("Offset to end of mdat was negative.", null);
                                }
                                ((o00O00o0) o00o0o02).OooOO0(i18);
                                fragmentedMp4Extractor3.f11988OooOOO = 0;
                                fragmentedMp4Extractor3.f11993OooOOo0 = 0;
                                z8 = false;
                            } else {
                                int i19 = (int) ((!oooO0O1.f12022OooOO0o ? oooO0O1.f12015OooO0Oo.f39689OooO0OO[oooO0O1.f12016OooO0o] : oooO0O1.f12013OooO0O0.f39668OooO0o[oooO0O1.f12019OooO0oo]) - ((o00O00o0) o00o0o01).f39532OooO0Oo);
                                if (i19 < 0) {
                                    Log.OooO0o("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i19 = 0;
                                }
                                ((o00O00o0) o00o0o02).OooOO0(i19);
                                fragmentedMp4Extractor3.f11995OooOo = oooO0O1;
                                oooO0O0 = oooO0O1;
                                if (fragmentedMp4Extractor3.f11988OooOOO == 3) {
                                    z9 = oooO0O0.f12022OooOO0o;
                                    o000o02 = oooO0O0.f12013OooO0O0;
                                    if (z9) {
                                        i13 = o000o02.f39671OooO0oo[oooO0O0.f12016OooO0o];
                                    } else {
                                        i13 = oooO0O0.f12015OooO0Oo.f39690OooO0Oo[oooO0O0.f12016OooO0o];
                                    }
                                    fragmentedMp4Extractor3.f12001OooOoO0 = i13;
                                    if (oooO0O0.f12016OooO0o < oooO0O0.f12011OooO) {
                                        ((o00O00o0) o00o0o02).OooOO0(i13);
                                        o000oo0OooO00o2 = oooO0O0.OooO00o();
                                        if (o000oo0OooO00o2 != null) {
                                            o00oo02 = o000o02.f39675OooOOO;
                                            i15 = o000oo0OooO00o2.f39700OooO0Oo;
                                            if (i15 != 0) {
                                                o00oo02.Oooo00o(i15);
                                            }
                                            int i20 = oooO0O0.f12016OooO0o;
                                            if (o000o02.f39673OooOO0O || !o000o02.f39674OooOO0o[i20]) {
                                                z10 = false;
                                            } else {
                                                z10 = true;
                                            }
                                            if (z10) {
                                                o00oo02.Oooo00o(o00oo02.OooOoOO() * 6);
                                            }
                                        }
                                        if (!oooO0O0.OooO0O0()) {
                                            fragmentedMp4Extractor3.f11995OooOo = null;
                                        }
                                        fragmentedMp4Extractor3.f11988OooOOO = 3;
                                    } else {
                                        if (oooO0O0.f12015OooO0Oo.f39687OooO00o.f12092OooO0oO == 1) {
                                            fragmentedMp4Extractor3.f12001OooOoO0 = i13 - 8;
                                            ((o00O00o0) o00o0o02).OooOO0(8);
                                        }
                                        if ("audio/ac4".equals(oooO0O0.f12015OooO0Oo.f39687OooO00o.f12090OooO0o.f11211OooOOOO)) {
                                            fragmentedMp4Extractor3.f12000OooOoO = oooO0O0.OooO0OO(fragmentedMp4Extractor3.f12001OooOoO0, 7);
                                            int i21 = fragmentedMp4Extractor3.f12001OooOoO0;
                                            o00Oo00 o00oo03 = fragmentedMp4Extractor3.f11984OooO0oo;
                                            o00000O0.OooO00o(i21, o00oo03);
                                            oooO0O0.f12012OooO00o.OooO0O0(7, o00oo03);
                                            fragmentedMp4Extractor3.f12000OooOoO += 7;
                                            i14 = 0;
                                        } else {
                                            i14 = 0;
                                            fragmentedMp4Extractor3.f12000OooOoO = oooO0O0.OooO0OO(fragmentedMp4Extractor3.f12001OooOoO0, 0);
                                        }
                                        fragmentedMp4Extractor3.f12001OooOoO0 += fragmentedMp4Extractor3.f12000OooOoO;
                                        fragmentedMp4Extractor3.f11988OooOOO = 4;
                                        fragmentedMp4Extractor3.f12002OooOoOO = i14;
                                        o000o00o2 = oooO0O0.f12015OooO0Oo;
                                        track = o000o00o2.f39687OooO00o;
                                        trackOutput = oooO0O0.f12012OooO00o;
                                        z5 = oooO0O0.f12022OooOO0o;
                                        o000o01 = oooO0O0.f12013OooO0O0;
                                        if (z5) {
                                            j7 = o000o01.f39663OooO[oooO0O0.f12016OooO0o];
                                        } else {
                                            j7 = o000o00o2.f39691OooO0o[oooO0O0.f12016OooO0o];
                                        }
                                        i5 = track.f12094OooOO0;
                                        if (i5 != 0) {
                                            while (true) {
                                                i6 = fragmentedMp4Extractor3.f12000OooOoO;
                                                i7 = fragmentedMp4Extractor3.f12001OooOoO0;
                                                if (i6 < i7) {
                                                    break;
                                                }
                                                fragmentedMp4Extractor3.f12000OooOoO += trackOutput.OooO00o(o00o0o02, i7 - i6, false);
                                            }
                                        } else {
                                            o00oo00 = fragmentedMp4Extractor3.f11982OooO0o0;
                                            bArr = o00oo00.f40591OooO00o;
                                            bArr[0] = 0;
                                            bArr[1] = 0;
                                            bArr[2] = 0;
                                            i10 = i5 + 1;
                                            i11 = 4 - i5;
                                            while (fragmentedMp4Extractor3.f12000OooOoO < fragmentedMp4Extractor3.f12001OooOoO0) {
                                                i12 = fragmentedMp4Extractor3.f12002OooOoOO;
                                                oooOo = track.f12090OooO0o;
                                                if (i12 == 0) {
                                                    ((o00O00o0) o00o0o02).OooO0oO(bArr, i11, i10, false);
                                                    o00oo00.Oooo00O(0);
                                                    iOooO0o = o00oo00.OooO0o();
                                                    if (iOooO0o >= 1) {
                                                        throw ParserException.OooO00o("Invalid NAL length", null);
                                                    }
                                                    fragmentedMp4Extractor3.f12002OooOoOO = iOooO0o - 1;
                                                    o00Oo00 o00oo04 = fragmentedMp4Extractor3.f11980OooO0Oo;
                                                    o00oo04.Oooo00O(0);
                                                    trackOutput.OooO0O0(4, o00oo04);
                                                    trackOutput.OooO0O0(1, o00oo00);
                                                    if (fragmentedMp4Extractor3.f12006OooOooo.length > 0) {
                                                        str3 = oooOo.f11211OooOOOO;
                                                        b = bArr[4];
                                                        byte[] bArr2 = oo0O.f40640OooO00o;
                                                        if ("video/avc".equals(str3)) {
                                                            o00oo01 = o00oo00;
                                                            if ((b & 31) != 6) {
                                                                z7 = true;
                                                            }
                                                            boolean z12 = z7;
                                                            fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                            fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                            fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                            i11 = i11;
                                                            bArr = bArr;
                                                        } else {
                                                            o00oo01 = o00oo00;
                                                        }
                                                        if ("video/hevc".equals(str3) || ((b & 126) >> 1) != 39) {
                                                            z7 = false;
                                                        } else {
                                                            z7 = true;
                                                        }
                                                        if (z7) {
                                                        }
                                                        fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                        fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                        fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                        i11 = i11;
                                                        bArr = bArr;
                                                    } else {
                                                        o00oo01 = o00oo00;
                                                    }
                                                    fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                    fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                    fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                    i11 = i11;
                                                    bArr = bArr;
                                                } else {
                                                    o00oo01 = o00oo00;
                                                    if (fragmentedMp4Extractor3.f12004OooOoo0) {
                                                        o00Oo00 o00oo05 = fragmentedMp4Extractor3.f11981OooO0o;
                                                        o00oo05.OooOooO(i12);
                                                        ((o00O00o0) o00o0o02).OooO0oO(o00oo05.f40591OooO00o, 0, fragmentedMp4Extractor3.f12002OooOoOO, false);
                                                        trackOutput.OooO0O0(fragmentedMp4Extractor3.f12002OooOoOO, o00oo05);
                                                        iOooO00o = fragmentedMp4Extractor3.f12002OooOoOO;
                                                        int iOooO0o0 = oo0O.OooO0o0(o00oo05.f40593OooO0OO, o00oo05.f40591OooO00o);
                                                        o00oo05.Oooo00O("video/hevc".equals(oooOo.f11211OooOOOO) ? 1 : 0);
                                                        o00oo05.Oooo000(iOooO0o0);
                                                        com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j7, o00oo05, fragmentedMp4Extractor3.f12006OooOooo);
                                                    } else {
                                                        iOooO00o = trackOutput.OooO00o(o00o0o02, i12, false);
                                                    }
                                                    fragmentedMp4Extractor3.f12000OooOoO += iOooO00o;
                                                    fragmentedMp4Extractor3.f12002OooOoOO -= iOooO00o;
                                                }
                                                i11 = i11;
                                                track = track;
                                                o00oo00 = o00oo01;
                                                bArr = bArr;
                                            }
                                        }
                                        if (!oooO0O0.f12022OooOO0o) {
                                            i8 = oooO0O0.f12015OooO0Oo.f39693OooO0oO[oooO0O0.f12016OooO0o];
                                        } else if (o000o01.f39672OooOO0[oooO0O0.f12016OooO0o]) {
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
                                        }
                                        if (oooO0O0.OooO00o() != null) {
                                            i8 |= Pow2.MAX_POW2;
                                        }
                                        int i22 = i8;
                                        o000oo0OooO00o = oooO0O0.OooO00o();
                                        if (o000oo0OooO00o != null) {
                                            oooO00o = o000oo0OooO00o.f39699OooO0OO;
                                        } else {
                                            oooO00o = null;
                                        }
                                        trackOutput.OooO0o0(j7, i22, fragmentedMp4Extractor3.f12001OooOoO0, 0, oooO00o);
                                        while (!arrayDeque2.isEmpty()) {
                                            oooO00oRemoveFirst = arrayDeque2.removeFirst();
                                            fragmentedMp4Extractor3.f11997OooOo00 -= oooO00oRemoveFirst.f12010OooO0OO;
                                            z6 = oooO00oRemoveFirst.f12009OooO0O0;
                                            j8 = oooO00oRemoveFirst.f12008OooO00o;
                                            if (z6) {
                                                j8 += j7;
                                            }
                                            for (TrackOutput trackOutput2 : fragmentedMp4Extractor3.f12005OooOooO) {
                                                trackOutput2.OooO0o0(j8, 1, oooO00oRemoveFirst.f12010OooO0OO, fragmentedMp4Extractor3.f11997OooOo00, null);
                                            }
                                        }
                                        if (!oooO0O0.OooO0O0()) {
                                            fragmentedMp4Extractor3.f11995OooOo = null;
                                        }
                                        fragmentedMp4Extractor3.f11988OooOOO = 3;
                                    }
                                } else {
                                    o000o00o2 = oooO0O0.f12015OooO0Oo;
                                    track = o000o00o2.f39687OooO00o;
                                    trackOutput = oooO0O0.f12012OooO00o;
                                    z5 = oooO0O0.f12022OooOO0o;
                                    o000o01 = oooO0O0.f12013OooO0O0;
                                    if (z5) {
                                        j7 = o000o00o2.f39691OooO0o[oooO0O0.f12016OooO0o];
                                    } else {
                                        j7 = o000o01.f39663OooO[oooO0O0.f12016OooO0o];
                                    }
                                    i5 = track.f12094OooOO0;
                                    if (i5 != 0) {
                                        while (true) {
                                            i6 = fragmentedMp4Extractor3.f12000OooOoO;
                                            i7 = fragmentedMp4Extractor3.f12001OooOoO0;
                                            if (i6 < i7) {
                                                break;
                                                break;
                                            }
                                            fragmentedMp4Extractor3.f12000OooOoO += trackOutput.OooO00o(o00o0o02, i7 - i6, false);
                                        }
                                    } else {
                                        o00oo00 = fragmentedMp4Extractor3.f11982OooO0o0;
                                        bArr = o00oo00.f40591OooO00o;
                                        bArr[0] = 0;
                                        bArr[1] = 0;
                                        bArr[2] = 0;
                                        i10 = i5 + 1;
                                        i11 = 4 - i5;
                                        while (fragmentedMp4Extractor3.f12000OooOoO < fragmentedMp4Extractor3.f12001OooOoO0) {
                                            i12 = fragmentedMp4Extractor3.f12002OooOoOO;
                                            oooOo = track.f12090OooO0o;
                                            if (i12 == 0) {
                                                ((o00O00o0) o00o0o02).OooO0oO(bArr, i11, i10, false);
                                                o00oo00.Oooo00O(0);
                                                iOooO0o = o00oo00.OooO0o();
                                                if (iOooO0o >= 1) {
                                                    throw ParserException.OooO00o("Invalid NAL length", null);
                                                }
                                                fragmentedMp4Extractor3.f12002OooOoOO = iOooO0o - 1;
                                                o00Oo00 o00oo06 = fragmentedMp4Extractor3.f11980OooO0Oo;
                                                o00oo06.Oooo00O(0);
                                                trackOutput.OooO0O0(4, o00oo06);
                                                trackOutput.OooO0O0(1, o00oo00);
                                                if (fragmentedMp4Extractor3.f12006OooOooo.length > 0) {
                                                    str3 = oooOo.f11211OooOOOO;
                                                    b = bArr[4];
                                                    byte[] bArr3 = oo0O.f40640OooO00o;
                                                    if ("video/avc".equals(str3)) {
                                                        o00oo01 = o00oo00;
                                                        if ((b & 31) != 6) {
                                                            z7 = true;
                                                        }
                                                        if (z7) {
                                                        }
                                                        fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                        fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                        fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                        i11 = i11;
                                                        bArr = bArr;
                                                    } else {
                                                        o00oo01 = o00oo00;
                                                    }
                                                    if ("video/hevc".equals(str3)) {
                                                    }
                                                    z7 = false;
                                                    if (z7) {
                                                    }
                                                    fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                    fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                    fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                    i11 = i11;
                                                    bArr = bArr;
                                                } else {
                                                    o00oo01 = o00oo00;
                                                }
                                                fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                i11 = i11;
                                                bArr = bArr;
                                            } else {
                                                o00oo01 = o00oo00;
                                                if (fragmentedMp4Extractor3.f12004OooOoo0) {
                                                    o00Oo00 o00oo07 = fragmentedMp4Extractor3.f11981OooO0o;
                                                    o00oo07.OooOooO(i12);
                                                    ((o00O00o0) o00o0o02).OooO0oO(o00oo07.f40591OooO00o, 0, fragmentedMp4Extractor3.f12002OooOoOO, false);
                                                    trackOutput.OooO0O0(fragmentedMp4Extractor3.f12002OooOoOO, o00oo07);
                                                    iOooO00o = fragmentedMp4Extractor3.f12002OooOoOO;
                                                    int iOooO0o1 = oo0O.OooO0o0(o00oo07.f40593OooO0OO, o00oo07.f40591OooO00o);
                                                    o00oo07.Oooo00O("video/hevc".equals(oooOo.f11211OooOOOO) ? 1 : 0);
                                                    o00oo07.Oooo000(iOooO0o1);
                                                    com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j7, o00oo07, fragmentedMp4Extractor3.f12006OooOooo);
                                                } else {
                                                    iOooO00o = trackOutput.OooO00o(o00o0o02, i12, false);
                                                }
                                                fragmentedMp4Extractor3.f12000OooOoO += iOooO00o;
                                                fragmentedMp4Extractor3.f12002OooOoOO -= iOooO00o;
                                            }
                                            i11 = i11;
                                            track = track;
                                            o00oo00 = o00oo01;
                                            bArr = bArr;
                                        }
                                    }
                                    if (!oooO0O0.f12022OooOO0o) {
                                        i8 = oooO0O0.f12015OooO0Oo.f39693OooO0oO[oooO0O0.f12016OooO0o];
                                    } else if (o000o01.f39672OooOO0[oooO0O0.f12016OooO0o]) {
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                    }
                                    if (oooO0O0.OooO00o() != null) {
                                        i8 |= Pow2.MAX_POW2;
                                    }
                                    int i23 = i8;
                                    o000oo0OooO00o = oooO0O0.OooO00o();
                                    if (o000oo0OooO00o != null) {
                                        oooO00o = o000oo0OooO00o.f39699OooO0OO;
                                    } else {
                                        oooO00o = null;
                                    }
                                    trackOutput.OooO0o0(j7, i23, fragmentedMp4Extractor3.f12001OooOoO0, 0, oooO00o);
                                    while (!arrayDeque2.isEmpty()) {
                                        oooO00oRemoveFirst = arrayDeque2.removeFirst();
                                        fragmentedMp4Extractor3.f11997OooOo00 -= oooO00oRemoveFirst.f12010OooO0OO;
                                        z6 = oooO00oRemoveFirst.f12009OooO0O0;
                                        j8 = oooO00oRemoveFirst.f12008OooO00o;
                                        if (z6) {
                                            j8 += j7;
                                        }
                                        while (i9 < r7) {
                                            trackOutput2.OooO0o0(j8, 1, oooO00oRemoveFirst.f12010OooO0OO, fragmentedMp4Extractor3.f11997OooOo00, null);
                                        }
                                    }
                                    if (!oooO0O0.OooO0O0()) {
                                        fragmentedMp4Extractor3.f11995OooOo = null;
                                    }
                                    fragmentedMp4Extractor3.f11988OooOOO = 3;
                                }
                                z8 = true;
                            }
                        } else {
                            if (fragmentedMp4Extractor3.f11988OooOOO == 3) {
                                z9 = oooO0O0.f12022OooOO0o;
                                o000o02 = oooO0O0.f12013OooO0O0;
                                if (z9) {
                                    i13 = oooO0O0.f12015OooO0Oo.f39690OooO0Oo[oooO0O0.f12016OooO0o];
                                } else {
                                    i13 = o000o02.f39671OooO0oo[oooO0O0.f12016OooO0o];
                                }
                                fragmentedMp4Extractor3.f12001OooOoO0 = i13;
                                if (oooO0O0.f12016OooO0o < oooO0O0.f12011OooO) {
                                    ((o00O00o0) o00o0o02).OooOO0(i13);
                                    o000oo0OooO00o2 = oooO0O0.OooO00o();
                                    if (o000oo0OooO00o2 != null) {
                                        o00oo02 = o000o02.f39675OooOOO;
                                        i15 = o000oo0OooO00o2.f39700OooO0Oo;
                                        if (i15 != 0) {
                                            o00oo02.Oooo00o(i15);
                                        }
                                        int i24 = oooO0O0.f12016OooO0o;
                                        if (o000o02.f39673OooOO0O) {
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            o00oo02.Oooo00o(o00oo02.OooOoOO() * 6);
                                        }
                                    }
                                    if (!oooO0O0.OooO0O0()) {
                                        fragmentedMp4Extractor3.f11995OooOo = null;
                                    }
                                    fragmentedMp4Extractor3.f11988OooOOO = 3;
                                } else {
                                    if (oooO0O0.f12015OooO0Oo.f39687OooO00o.f12092OooO0oO == 1) {
                                        fragmentedMp4Extractor3.f12001OooOoO0 = i13 - 8;
                                        ((o00O00o0) o00o0o02).OooOO0(8);
                                    }
                                    if ("audio/ac4".equals(oooO0O0.f12015OooO0Oo.f39687OooO00o.f12090OooO0o.f11211OooOOOO)) {
                                        fragmentedMp4Extractor3.f12000OooOoO = oooO0O0.OooO0OO(fragmentedMp4Extractor3.f12001OooOoO0, 7);
                                        int i25 = fragmentedMp4Extractor3.f12001OooOoO0;
                                        o00Oo00 o00oo08 = fragmentedMp4Extractor3.f11984OooO0oo;
                                        o00000O0.OooO00o(i25, o00oo08);
                                        oooO0O0.f12012OooO00o.OooO0O0(7, o00oo08);
                                        fragmentedMp4Extractor3.f12000OooOoO += 7;
                                        i14 = 0;
                                    } else {
                                        i14 = 0;
                                        fragmentedMp4Extractor3.f12000OooOoO = oooO0O0.OooO0OO(fragmentedMp4Extractor3.f12001OooOoO0, 0);
                                    }
                                    fragmentedMp4Extractor3.f12001OooOoO0 += fragmentedMp4Extractor3.f12000OooOoO;
                                    fragmentedMp4Extractor3.f11988OooOOO = 4;
                                    fragmentedMp4Extractor3.f12002OooOoOO = i14;
                                    o000o00o2 = oooO0O0.f12015OooO0Oo;
                                    track = o000o00o2.f39687OooO00o;
                                    trackOutput = oooO0O0.f12012OooO00o;
                                    z5 = oooO0O0.f12022OooOO0o;
                                    o000o01 = oooO0O0.f12013OooO0O0;
                                    if (z5) {
                                        j7 = o000o00o2.f39691OooO0o[oooO0O0.f12016OooO0o];
                                    } else {
                                        j7 = o000o01.f39663OooO[oooO0O0.f12016OooO0o];
                                    }
                                    i5 = track.f12094OooOO0;
                                    if (i5 != 0) {
                                        while (true) {
                                            i6 = fragmentedMp4Extractor3.f12000OooOoO;
                                            i7 = fragmentedMp4Extractor3.f12001OooOoO0;
                                            if (i6 < i7) {
                                                break;
                                                break;
                                            }
                                            fragmentedMp4Extractor3.f12000OooOoO += trackOutput.OooO00o(o00o0o02, i7 - i6, false);
                                        }
                                    } else {
                                        o00oo00 = fragmentedMp4Extractor3.f11982OooO0o0;
                                        bArr = o00oo00.f40591OooO00o;
                                        bArr[0] = 0;
                                        bArr[1] = 0;
                                        bArr[2] = 0;
                                        i10 = i5 + 1;
                                        i11 = 4 - i5;
                                        while (fragmentedMp4Extractor3.f12000OooOoO < fragmentedMp4Extractor3.f12001OooOoO0) {
                                            i12 = fragmentedMp4Extractor3.f12002OooOoOO;
                                            oooOo = track.f12090OooO0o;
                                            if (i12 == 0) {
                                                ((o00O00o0) o00o0o02).OooO0oO(bArr, i11, i10, false);
                                                o00oo00.Oooo00O(0);
                                                iOooO0o = o00oo00.OooO0o();
                                                if (iOooO0o >= 1) {
                                                    throw ParserException.OooO00o("Invalid NAL length", null);
                                                }
                                                fragmentedMp4Extractor3.f12002OooOoOO = iOooO0o - 1;
                                                o00Oo00 o00oo09 = fragmentedMp4Extractor3.f11980OooO0Oo;
                                                o00oo09.Oooo00O(0);
                                                trackOutput.OooO0O0(4, o00oo09);
                                                trackOutput.OooO0O0(1, o00oo00);
                                                if (fragmentedMp4Extractor3.f12006OooOooo.length > 0) {
                                                    str3 = oooOo.f11211OooOOOO;
                                                    b = bArr[4];
                                                    byte[] bArr4 = oo0O.f40640OooO00o;
                                                    if ("video/avc".equals(str3)) {
                                                        o00oo01 = o00oo00;
                                                        if ((b & 31) != 6) {
                                                            z7 = true;
                                                        }
                                                        if (z7) {
                                                        }
                                                        fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                        fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                        fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                        i11 = i11;
                                                        bArr = bArr;
                                                    } else {
                                                        o00oo01 = o00oo00;
                                                    }
                                                    if ("video/hevc".equals(str3)) {
                                                    }
                                                    z7 = false;
                                                    if (z7) {
                                                    }
                                                    fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                    fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                    fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                    i11 = i11;
                                                    bArr = bArr;
                                                } else {
                                                    o00oo01 = o00oo00;
                                                }
                                                fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                i11 = i11;
                                                bArr = bArr;
                                            } else {
                                                o00oo01 = o00oo00;
                                                if (fragmentedMp4Extractor3.f12004OooOoo0) {
                                                    o00Oo00 o00oo010 = fragmentedMp4Extractor3.f11981OooO0o;
                                                    o00oo010.OooOooO(i12);
                                                    ((o00O00o0) o00o0o02).OooO0oO(o00oo010.f40591OooO00o, 0, fragmentedMp4Extractor3.f12002OooOoOO, false);
                                                    trackOutput.OooO0O0(fragmentedMp4Extractor3.f12002OooOoOO, o00oo010);
                                                    iOooO00o = fragmentedMp4Extractor3.f12002OooOoOO;
                                                    int iOooO0o2 = oo0O.OooO0o0(o00oo010.f40593OooO0OO, o00oo010.f40591OooO00o);
                                                    o00oo010.Oooo00O("video/hevc".equals(oooOo.f11211OooOOOO) ? 1 : 0);
                                                    o00oo010.Oooo000(iOooO0o2);
                                                    com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j7, o00oo010, fragmentedMp4Extractor3.f12006OooOooo);
                                                } else {
                                                    iOooO00o = trackOutput.OooO00o(o00o0o02, i12, false);
                                                }
                                                fragmentedMp4Extractor3.f12000OooOoO += iOooO00o;
                                                fragmentedMp4Extractor3.f12002OooOoOO -= iOooO00o;
                                            }
                                            i11 = i11;
                                            track = track;
                                            o00oo00 = o00oo01;
                                            bArr = bArr;
                                        }
                                    }
                                    if (!oooO0O0.f12022OooOO0o) {
                                        i8 = oooO0O0.f12015OooO0Oo.f39693OooO0oO[oooO0O0.f12016OooO0o];
                                    } else if (o000o01.f39672OooOO0[oooO0O0.f12016OooO0o]) {
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                    }
                                    if (oooO0O0.OooO00o() != null) {
                                        i8 |= Pow2.MAX_POW2;
                                    }
                                    int i26 = i8;
                                    o000oo0OooO00o = oooO0O0.OooO00o();
                                    if (o000oo0OooO00o != null) {
                                        oooO00o = o000oo0OooO00o.f39699OooO0OO;
                                    } else {
                                        oooO00o = null;
                                    }
                                    trackOutput.OooO0o0(j7, i26, fragmentedMp4Extractor3.f12001OooOoO0, 0, oooO00o);
                                    while (!arrayDeque2.isEmpty()) {
                                        oooO00oRemoveFirst = arrayDeque2.removeFirst();
                                        fragmentedMp4Extractor3.f11997OooOo00 -= oooO00oRemoveFirst.f12010OooO0OO;
                                        z6 = oooO00oRemoveFirst.f12009OooO0O0;
                                        j8 = oooO00oRemoveFirst.f12008OooO00o;
                                        if (z6) {
                                            j8 += j7;
                                        }
                                        while (i9 < r7) {
                                            trackOutput2.OooO0o0(j8, 1, oooO00oRemoveFirst.f12010OooO0OO, fragmentedMp4Extractor3.f11997OooOo00, null);
                                        }
                                    }
                                    if (!oooO0O0.OooO0O0()) {
                                        fragmentedMp4Extractor3.f11995OooOo = null;
                                    }
                                    fragmentedMp4Extractor3.f11988OooOOO = 3;
                                }
                            } else {
                                o000o00o2 = oooO0O0.f12015OooO0Oo;
                                track = o000o00o2.f39687OooO00o;
                                trackOutput = oooO0O0.f12012OooO00o;
                                z5 = oooO0O0.f12022OooOO0o;
                                o000o01 = oooO0O0.f12013OooO0O0;
                                if (z5) {
                                    j7 = o000o00o2.f39691OooO0o[oooO0O0.f12016OooO0o];
                                } else {
                                    j7 = o000o01.f39663OooO[oooO0O0.f12016OooO0o];
                                }
                                i5 = track.f12094OooOO0;
                                if (i5 != 0) {
                                    while (true) {
                                        i6 = fragmentedMp4Extractor3.f12000OooOoO;
                                        i7 = fragmentedMp4Extractor3.f12001OooOoO0;
                                        if (i6 < i7) {
                                            break;
                                            break;
                                        }
                                        fragmentedMp4Extractor3.f12000OooOoO += trackOutput.OooO00o(o00o0o02, i7 - i6, false);
                                    }
                                } else {
                                    o00oo00 = fragmentedMp4Extractor3.f11982OooO0o0;
                                    bArr = o00oo00.f40591OooO00o;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    i10 = i5 + 1;
                                    i11 = 4 - i5;
                                    while (fragmentedMp4Extractor3.f12000OooOoO < fragmentedMp4Extractor3.f12001OooOoO0) {
                                        i12 = fragmentedMp4Extractor3.f12002OooOoOO;
                                        oooOo = track.f12090OooO0o;
                                        if (i12 == 0) {
                                            ((o00O00o0) o00o0o02).OooO0oO(bArr, i11, i10, false);
                                            o00oo00.Oooo00O(0);
                                            iOooO0o = o00oo00.OooO0o();
                                            if (iOooO0o >= 1) {
                                                throw ParserException.OooO00o("Invalid NAL length", null);
                                            }
                                            fragmentedMp4Extractor3.f12002OooOoOO = iOooO0o - 1;
                                            o00Oo00 o00oo011 = fragmentedMp4Extractor3.f11980OooO0Oo;
                                            o00oo011.Oooo00O(0);
                                            trackOutput.OooO0O0(4, o00oo011);
                                            trackOutput.OooO0O0(1, o00oo00);
                                            if (fragmentedMp4Extractor3.f12006OooOooo.length > 0) {
                                                str3 = oooOo.f11211OooOOOO;
                                                b = bArr[4];
                                                byte[] bArr5 = oo0O.f40640OooO00o;
                                                if ("video/avc".equals(str3)) {
                                                    o00oo01 = o00oo00;
                                                    if ((b & 31) != 6) {
                                                        z7 = true;
                                                    }
                                                    if (z7) {
                                                    }
                                                    fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                    fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                    fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                    i11 = i11;
                                                    bArr = bArr;
                                                } else {
                                                    o00oo01 = o00oo00;
                                                }
                                                if ("video/hevc".equals(str3)) {
                                                }
                                                z7 = false;
                                                if (z7) {
                                                }
                                                fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                                fragmentedMp4Extractor3.f12000OooOoO += 5;
                                                fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                                i11 = i11;
                                                bArr = bArr;
                                            } else {
                                                o00oo01 = o00oo00;
                                            }
                                            fragmentedMp4Extractor3.f12004OooOoo0 = z12;
                                            fragmentedMp4Extractor3.f12000OooOoO += 5;
                                            fragmentedMp4Extractor3.f12001OooOoO0 += i11;
                                            i11 = i11;
                                            bArr = bArr;
                                        } else {
                                            o00oo01 = o00oo00;
                                            if (fragmentedMp4Extractor3.f12004OooOoo0) {
                                                o00Oo00 o00oo012 = fragmentedMp4Extractor3.f11981OooO0o;
                                                o00oo012.OooOooO(i12);
                                                ((o00O00o0) o00o0o02).OooO0oO(o00oo012.f40591OooO00o, 0, fragmentedMp4Extractor3.f12002OooOoOO, false);
                                                trackOutput.OooO0O0(fragmentedMp4Extractor3.f12002OooOoOO, o00oo012);
                                                iOooO00o = fragmentedMp4Extractor3.f12002OooOoOO;
                                                int iOooO0o3 = oo0O.OooO0o0(o00oo012.f40593OooO0OO, o00oo012.f40591OooO00o);
                                                o00oo012.Oooo00O("video/hevc".equals(oooOo.f11211OooOOOO) ? 1 : 0);
                                                o00oo012.Oooo000(iOooO0o3);
                                                com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j7, o00oo012, fragmentedMp4Extractor3.f12006OooOooo);
                                            } else {
                                                iOooO00o = trackOutput.OooO00o(o00o0o02, i12, false);
                                            }
                                            fragmentedMp4Extractor3.f12000OooOoO += iOooO00o;
                                            fragmentedMp4Extractor3.f12002OooOoOO -= iOooO00o;
                                        }
                                        i11 = i11;
                                        track = track;
                                        o00oo00 = o00oo01;
                                        bArr = bArr;
                                    }
                                }
                                if (!oooO0O0.f12022OooOO0o) {
                                    i8 = oooO0O0.f12015OooO0Oo.f39693OooO0oO[oooO0O0.f12016OooO0o];
                                } else if (o000o01.f39672OooOO0[oooO0O0.f12016OooO0o]) {
                                    i8 = 1;
                                } else {
                                    i8 = 0;
                                }
                                if (oooO0O0.OooO00o() != null) {
                                    i8 |= Pow2.MAX_POW2;
                                }
                                int i27 = i8;
                                o000oo0OooO00o = oooO0O0.OooO00o();
                                if (o000oo0OooO00o != null) {
                                    oooO00o = o000oo0OooO00o.f39699OooO0OO;
                                } else {
                                    oooO00o = null;
                                }
                                trackOutput.OooO0o0(j7, i27, fragmentedMp4Extractor3.f12001OooOoO0, 0, oooO00o);
                                while (!arrayDeque2.isEmpty()) {
                                    oooO00oRemoveFirst = arrayDeque2.removeFirst();
                                    fragmentedMp4Extractor3.f11997OooOo00 -= oooO00oRemoveFirst.f12010OooO0OO;
                                    z6 = oooO00oRemoveFirst.f12009OooO0O0;
                                    j8 = oooO00oRemoveFirst.f12008OooO00o;
                                    if (z6) {
                                        j8 += j7;
                                    }
                                    while (i9 < r7) {
                                        trackOutput2.OooO0o0(j8, 1, oooO00oRemoveFirst.f12010OooO0OO, fragmentedMp4Extractor3.f11997OooOo00, null);
                                    }
                                }
                                if (!oooO0O0.OooO0O0()) {
                                    fragmentedMp4Extractor3.f11995OooOo = null;
                                }
                                fragmentedMp4Extractor3.f11988OooOOO = 3;
                            }
                            z8 = true;
                        }
                        if (z8) {
                            return 0;
                        }
                    } else {
                        int size3 = sparseArray.size();
                        OooO0O0 oooO0O0ValueAt2 = null;
                        for (int i28 = 0; i28 < size3; i28++) {
                            o000O00 o000o04 = sparseArray.valueAt(i28).f12013OooO0O0;
                            if (o000o04.f39677OooOOOO) {
                                long j11 = o000o04.f39666OooO0OO;
                                if (j11 < j9) {
                                    oooO0O0ValueAt2 = sparseArray.valueAt(i28);
                                    j9 = j11;
                                }
                            }
                        }
                        if (oooO0O0ValueAt2 == null) {
                            fragmentedMp4Extractor3.f11988OooOOO = 3;
                        } else {
                            int i29 = (int) (j9 - ((o00O00o0) o00o0o01).f39532OooO0Oo);
                            if (i29 < 0) {
                                throw ParserException.OooO00o("Offset to encryption data was negative.", null);
                            }
                            o00O00o0 o00o00o3 = (o00O00o0) o00o0o02;
                            o00o00o3.OooOO0(i29);
                            o000O00 o000o05 = oooO0O0ValueAt2.f12013OooO0O0;
                            o00Oo00 o00oo013 = o000o05.f39675OooOOO;
                            o00o00o3.OooO0oO(o00oo013.f40591OooO00o, 0, o00oo013.f40593OooO0OO, false);
                            o00oo013.Oooo00O(0);
                            o000o05.f39677OooOOOO = false;
                        }
                    }
                    fragmentedMp4Extractor = this;
                } else {
                    int i30 = ((int) fragmentedMp4Extractor3.f11991OooOOOo) - fragmentedMp4Extractor3.f11993OooOOo0;
                    o00Oo00 o00oo014 = fragmentedMp4Extractor3.f11992OooOOo;
                    if (o00oo014 != null) {
                        ((o00O00o0) o00o0o02).OooO0oO(o00oo014.f40591OooO00o, 8, i30, false);
                        int i31 = fragmentedMp4Extractor3.f11990OooOOOO;
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O2 = new com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0(i31, o00oo014);
                        long j12 = ((o00O00o0) o00o0o01).f39532OooO0Oo;
                        if (arrayDeque.isEmpty()) {
                            if (i31 == 1936286840) {
                                o00oo014.Oooo00O(8);
                                int iOooO0o4 = (o00oo014.OooO0o() >> 24) & 255;
                                o00oo014.Oooo00o(4);
                                long jOooOo0o2 = o00oo014.OooOo0o();
                                if (iOooO0o4 == 0) {
                                    jOooOoO = o00oo014.OooOo0o();
                                    jOooOoO2 = o00oo014.OooOo0o();
                                } else {
                                    jOooOoO = o00oo014.OooOoO();
                                    jOooOoO2 = o00oo014.OooOoO();
                                }
                                long j13 = j12 + jOooOoO2;
                                long jOooo0oo3 = o0O00.Oooo0oo(jOooOoO, AnimationKt.MillisToNanos, jOooOo0o2);
                                o00oo014.Oooo00o(2);
                                int iOooOoOO = o00oo014.OooOoOO();
                                int[] iArr = new int[iOooOoOO];
                                long[] jArr = new long[iOooOoOO];
                                long[] jArr2 = new long[iOooOoOO];
                                long[] jArr3 = new long[iOooOoOO];
                                int i32 = 0;
                                long jOooo0oo4 = jOooo0oo3;
                                while (i32 < iOooOoOO) {
                                    int iOooO0o5 = o00oo014.OooO0o();
                                    if ((iOooO0o5 & Integer.MIN_VALUE) != 0) {
                                        throw ParserException.OooO00o("Unhandled indirect reference", null);
                                    }
                                    long jOooOo0o3 = o00oo014.OooOo0o();
                                    iArr[i32] = iOooO0o5 & Integer.MAX_VALUE;
                                    jArr[i32] = j13;
                                    jArr3[i32] = jOooo0oo4;
                                    long j14 = jOooOoO + jOooOo0o3;
                                    int i33 = i32;
                                    int i34 = iOooOoOO;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int[] iArr2 = iArr;
                                    jOooo0oo4 = o0O00.Oooo0oo(j14, AnimationKt.MillisToNanos, jOooOo0o2);
                                    jArr4[i33] = jOooo0oo4 - jArr5[i33];
                                    o00oo014.Oooo00o(4);
                                    j13 += (long) iArr2[i33];
                                    i32 = i33 + 1;
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    iArr = iArr2;
                                    jOooOoO = j14;
                                    jArr = jArr;
                                    iOooOoOO = i34;
                                }
                                Pair pairCreate = Pair.create(Long.valueOf(jOooo0oo3), new oOO00O(iArr, jArr, jArr2, jArr3));
                                fragmentedMp4Extractor = this;
                                fragmentedMp4Extractor.f11999OooOo0o = ((Long) pairCreate.first).longValue();
                                fragmentedMp4Extractor.f12003OooOoo.OooO0O0((o00OO0OO) pairCreate.second);
                                fragmentedMp4Extractor.f12007Oooo000 = true;
                                fragmentedMp4Extractor3 = fragmentedMp4Extractor;
                            } else {
                                fragmentedMp4Extractor = this;
                                if (i31 == 1701671783 && fragmentedMp4Extractor3.f12005OooOooO.length != 0) {
                                    o00oo014.Oooo00O(8);
                                    int iOooO0o6 = (o00oo014.OooO0o() >> 24) & 255;
                                    if (iOooO0o6 == 0) {
                                        String strOooOOOo = o00oo014.OooOOOo();
                                        strOooOOOo.getClass();
                                        String strOooOOOo2 = o00oo014.OooOOOo();
                                        strOooOOOo2.getClass();
                                        long jOooOo0o4 = o00oo014.OooOo0o();
                                        long jOooo0oo5 = o0O00.Oooo0oo(o00oo014.OooOo0o(), AnimationKt.MillisToNanos, jOooOo0o4);
                                        long j15 = fragmentedMp4Extractor3.f11999OooOo0o;
                                        long j16 = j15 != -9223372036854775807L ? j15 + jOooo0oo5 : -9223372036854775807L;
                                        str = strOooOOOo;
                                        str2 = strOooOOOo2;
                                        jOooo0oo = o0O00.Oooo0oo(o00oo014.OooOo0o(), 1000L, jOooOo0o4);
                                        j6 = jOooo0oo5;
                                        jOooOo0o = o00oo014.OooOo0o();
                                        jOooo0oo2 = j16;
                                    } else if (iOooO0o6 != 1) {
                                        Oooo000.OooO0O0("Skipping unsupported emsg version: ", iOooO0o6, "FragmentedMp4Extractor");
                                    } else {
                                        long jOooOo0o5 = o00oo014.OooOo0o();
                                        jOooo0oo2 = o0O00.Oooo0oo(o00oo014.OooOoO(), AnimationKt.MillisToNanos, jOooOo0o5);
                                        long jOooo0oo6 = o0O00.Oooo0oo(o00oo014.OooOo0o(), 1000L, jOooOo0o5);
                                        long jOooOo0o6 = o00oo014.OooOo0o();
                                        String strOooOOOo3 = o00oo014.OooOOOo();
                                        strOooOOOo3.getClass();
                                        String strOooOOOo4 = o00oo014.OooOOOo();
                                        strOooOOOo4.getClass();
                                        str = strOooOOOo3;
                                        str2 = strOooOOOo4;
                                        jOooo0oo = jOooo0oo6;
                                        jOooOo0o = jOooOo0o6;
                                        j6 = -9223372036854775807L;
                                    }
                                    int i35 = o00oo014.f40593OooO0OO - o00oo014.f40592OooO0O0;
                                    byte[] bArr6 = new byte[i35];
                                    o00oo014.OooO0Oo(0, i35, bArr6);
                                    o00Oo00 o00oo015 = new o00Oo00(fragmentedMp4Extractor3.f11976OooO.OooO00o(new EventMessage(str, str2, jOooo0oo, jOooOo0o, bArr6)));
                                    int i36 = o00oo015.f40593OooO0OO - o00oo015.f40592OooO0O0;
                                    for (TrackOutput trackOutput3 : fragmentedMp4Extractor3.f12005OooOooO) {
                                        o00oo015.Oooo00O(0);
                                        trackOutput3.OooO0O0(i36, o00oo015);
                                    }
                                    if (jOooo0oo2 == -9223372036854775807L) {
                                        arrayDeque2.addLast(new OooO00o(j6, true, i36));
                                        fragmentedMp4Extractor3.f11997OooOo00 += i36;
                                    } else if (arrayDeque2.isEmpty()) {
                                        for (TrackOutput trackOutput4 : fragmentedMp4Extractor3.f12005OooOooO) {
                                            trackOutput4.OooO0o0(jOooo0oo2, 1, i36, 0, null);
                                        }
                                    } else {
                                        arrayDeque2.addLast(new OooO00o(jOooo0oo2, false, i36));
                                        fragmentedMp4Extractor3.f11997OooOo00 += i36;
                                    }
                                }
                            }
                            o00o0o02 = o00o0o01;
                        } else {
                            arrayDeque.peek().f12054OooO0OO.add(oooO0O2);
                            fragmentedMp4Extractor = this;
                        }
                    } else {
                        fragmentedMp4Extractor = this;
                        ((o00O00o0) o00o0o02).OooOO0(i30);
                    }
                    fragmentedMp4Extractor3.OooO0o0(((o00O00o0) o00o0o01).f39532OooO0Oo);
                }
            } else {
                fragmentedMp4Extractor = fragmentedMp4Extractor2;
                int i37 = fragmentedMp4Extractor3.f11993OooOOo0;
                o00Oo00 o00oo016 = fragmentedMp4Extractor3.f11985OooOO0;
                if (i37 == 0) {
                    z4 = false;
                    if (((o00O00o0) o00o0o02).OooO0oO(o00oo016.f40591OooO00o, 0, 8, true)) {
                        fragmentedMp4Extractor3.f11993OooOOo0 = 8;
                        o00oo016.Oooo00O(0);
                        fragmentedMp4Extractor3.f11991OooOOOo = o00oo016.OooOo0o();
                        fragmentedMp4Extractor3.f11990OooOOOO = o00oo016.OooO0o();
                        j = fragmentedMp4Extractor3.f11991OooOOOo;
                        if (j == 1) {
                            ((o00O00o0) o00o0o02).OooO0oO(o00oo016.f40591OooO00o, 8, 8, false);
                            fragmentedMp4Extractor3.f11993OooOOo0 += 8;
                            fragmentedMp4Extractor3.f11991OooOOOo = o00oo016.OooOoO();
                        } else if (j == 0) {
                            o00o00o1 = (o00O00o0) o00o0o01;
                            j2 = o00o00o1.f39531OooO0OO;
                            if (j2 == -1 && !arrayDeque.isEmpty()) {
                                j2 = arrayDeque.peek().f12053OooO0O0;
                            }
                            if (j2 != -1) {
                                fragmentedMp4Extractor3.f11991OooOOOo = (j2 - o00o00o1.f39532OooO0Oo) + ((long) fragmentedMp4Extractor3.f11993OooOOo0);
                            }
                        }
                        j3 = fragmentedMp4Extractor3.f11991OooOOOo;
                        i = fragmentedMp4Extractor3.f11993OooOOo0;
                        if (j3 >= i) {
                            throw ParserException.OooO0OO("Atom size less than header length (unsupported).");
                        }
                        o00o00o2 = (o00O00o0) o00o0o01;
                        j4 = o00o00o2.f39532OooO0Oo - ((long) i);
                        i2 = fragmentedMp4Extractor3.f11990OooOOOO;
                        if ((i2 != 1836019558 || i2 == 1835295092) && !fragmentedMp4Extractor3.f12007Oooo000) {
                            fragmentedMp4Extractor3.f12003OooOoo.OooO0O0(new o00OO0OO.OooO0O0(fragmentedMp4Extractor3.f11998OooOo0O, j4));
                            fragmentedMp4Extractor3.f12007Oooo000 = true;
                        }
                        if (fragmentedMp4Extractor3.f11990OooOOOO == 1836019558) {
                            size = sparseArray.size();
                            for (i4 = 0; i4 < size; i4++) {
                                o000O00 o000o06 = sparseArray.valueAt(i4).f12013OooO0O0;
                                o000o06.getClass();
                                o000o06.f39666OooO0OO = j4;
                                o000o06.f39665OooO0O0 = j4;
                            }
                        }
                        i3 = fragmentedMp4Extractor3.f11990OooOOOO;
                        if (i3 == 1835295092) {
                            fragmentedMp4Extractor3.f11995OooOo = null;
                            fragmentedMp4Extractor3.f11994OooOOoo = j4 + fragmentedMp4Extractor3.f11991OooOOOo;
                            fragmentedMp4Extractor3.f11988OooOOO = 2;
                            z4 = true;
                        } else {
                            if (i3 != 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1836019558 || i3 == 1953653094 || i3 == 1836475768 || i3 == 1701082227) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                j5 = (o00o00o2.f39532OooO0Oo + fragmentedMp4Extractor3.f11991OooOOOo) - 8;
                                arrayDeque.push(new com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o(i3, j5));
                                if (fragmentedMp4Extractor3.f11991OooOOOo == fragmentedMp4Extractor3.f11993OooOOo0) {
                                    fragmentedMp4Extractor3.OooO0o0(j5);
                                } else {
                                    fragmentedMp4Extractor3.f11988OooOOO = 0;
                                    fragmentedMp4Extractor3.f11993OooOOo0 = 0;
                                }
                                z3 = true;
                            } else {
                                if (i3 != 1751411826 || i3 == 1835296868 || i3 == 1836476516 || i3 == 1936286840 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1668576371 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1937011571 || i3 == 1952867444 || i3 == 1952868452 || i3 == 1953196132 || i3 == 1953654136 || i3 == 1953658222 || i3 == 1886614376 || i3 == 1935763834 || i3 == 1935763823 || i3 == 1936027235 || i3 == 1970628964 || i3 == 1935828848 || i3 == 1936158820 || i3 == 1701606260 || i3 == 1835362404 || i3 == 1701671783) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    if (fragmentedMp4Extractor3.f11993OooOOo0 == 8) {
                                        throw ParserException.OooO0OO("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (fragmentedMp4Extractor3.f11991OooOOOo <= 2147483647L) {
                                        throw ParserException.OooO0OO("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    o00Oo00 o00oo017 = new o00Oo00((int) fragmentedMp4Extractor3.f11991OooOOOo);
                                    System.arraycopy(o00oo016.f40591OooO00o, 0, o00oo017.f40591OooO00o, 0, 8);
                                    fragmentedMp4Extractor3.f11992OooOOo = o00oo017;
                                    z3 = true;
                                    fragmentedMp4Extractor3.f11988OooOOO = 1;
                                } else {
                                    if (fragmentedMp4Extractor3.f11991OooOOOo <= 2147483647L) {
                                        throw ParserException.OooO0OO("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    fragmentedMp4Extractor3.f11992OooOOo = null;
                                    z3 = true;
                                    fragmentedMp4Extractor3.f11988OooOOO = 1;
                                }
                            }
                            z4 = z3;
                        }
                    }
                } else {
                    j = fragmentedMp4Extractor3.f11991OooOOOo;
                    if (j == 1) {
                        ((o00O00o0) o00o0o02).OooO0oO(o00oo016.f40591OooO00o, 8, 8, false);
                        fragmentedMp4Extractor3.f11993OooOOo0 += 8;
                        fragmentedMp4Extractor3.f11991OooOOOo = o00oo016.OooOoO();
                    } else if (j == 0) {
                        o00o00o1 = (o00O00o0) o00o0o01;
                        j2 = o00o00o1.f39531OooO0OO;
                        if (j2 == -1) {
                            j2 = arrayDeque.peek().f12053OooO0O0;
                        }
                        if (j2 != -1) {
                            fragmentedMp4Extractor3.f11991OooOOOo = (j2 - o00o00o1.f39532OooO0Oo) + ((long) fragmentedMp4Extractor3.f11993OooOOo0);
                        }
                    }
                    j3 = fragmentedMp4Extractor3.f11991OooOOOo;
                    i = fragmentedMp4Extractor3.f11993OooOOo0;
                    if (j3 >= i) {
                        throw ParserException.OooO0OO("Atom size less than header length (unsupported).");
                    }
                    o00o00o2 = (o00O00o0) o00o0o01;
                    j4 = o00o00o2.f39532OooO0Oo - ((long) i);
                    i2 = fragmentedMp4Extractor3.f11990OooOOOO;
                    if (i2 != 1836019558) {
                        fragmentedMp4Extractor3.f12003OooOoo.OooO0O0(new o00OO0OO.OooO0O0(fragmentedMp4Extractor3.f11998OooOo0O, j4));
                        fragmentedMp4Extractor3.f12007Oooo000 = true;
                    } else {
                        fragmentedMp4Extractor3.f12003OooOoo.OooO0O0(new o00OO0OO.OooO0O0(fragmentedMp4Extractor3.f11998OooOo0O, j4));
                        fragmentedMp4Extractor3.f12007Oooo000 = true;
                    }
                    if (fragmentedMp4Extractor3.f11990OooOOOO == 1836019558) {
                        size = sparseArray.size();
                        while (i4 < size) {
                            o000O00 o000o07 = sparseArray.valueAt(i4).f12013OooO0O0;
                            o000o07.getClass();
                            o000o07.f39666OooO0OO = j4;
                            o000o07.f39665OooO0O0 = j4;
                        }
                    }
                    i3 = fragmentedMp4Extractor3.f11990OooOOOO;
                    if (i3 == 1835295092) {
                        fragmentedMp4Extractor3.f11995OooOo = null;
                        fragmentedMp4Extractor3.f11994OooOOoo = j4 + fragmentedMp4Extractor3.f11991OooOOOo;
                        fragmentedMp4Extractor3.f11988OooOOO = 2;
                        z4 = true;
                    } else {
                        if (i3 != 1836019574) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (z) {
                            j5 = (o00o00o2.f39532OooO0Oo + fragmentedMp4Extractor3.f11991OooOOOo) - 8;
                            arrayDeque.push(new com.google.android.exoplayer2.extractor.mp4.OooO00o.C0203OooO00o(i3, j5));
                            if (fragmentedMp4Extractor3.f11991OooOOOo == fragmentedMp4Extractor3.f11993OooOOo0) {
                                fragmentedMp4Extractor3.OooO0o0(j5);
                            } else {
                                fragmentedMp4Extractor3.f11988OooOOO = 0;
                                fragmentedMp4Extractor3.f11993OooOOo0 = 0;
                            }
                            z3 = true;
                        } else {
                            if (i3 != 1751411826) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (fragmentedMp4Extractor3.f11993OooOOo0 == 8) {
                                    throw ParserException.OooO0OO("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (fragmentedMp4Extractor3.f11991OooOOOo <= 2147483647L) {
                                    throw ParserException.OooO0OO("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                o00Oo00 o00oo018 = new o00Oo00((int) fragmentedMp4Extractor3.f11991OooOOOo);
                                System.arraycopy(o00oo016.f40591OooO00o, 0, o00oo018.f40591OooO00o, 0, 8);
                                fragmentedMp4Extractor3.f11992OooOOo = o00oo018;
                                z3 = true;
                                fragmentedMp4Extractor3.f11988OooOOO = 1;
                            } else {
                                if (fragmentedMp4Extractor3.f11991OooOOOo <= 2147483647L) {
                                    throw ParserException.OooO0OO("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                fragmentedMp4Extractor3.f11992OooOOo = null;
                                z3 = true;
                                fragmentedMp4Extractor3.f11988OooOOO = 1;
                            }
                        }
                        z4 = z3;
                    }
                }
                if (!z4) {
                    return -1;
                }
            }
            fragmentedMp4Extractor2 = fragmentedMp4Extractor;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        int i;
        this.f12003OooOoo = o00o0o0;
        int i2 = 0;
        this.f11988OooOOO = 0;
        this.f11993OooOOo0 = 0;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.f12005OooOooO = trackOutputArr;
        TrackOutput trackOutput = this.f11989OooOOO0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f11977OooO00o & 4) != 0) {
            trackOutputArr[i] = o00o0o0.OooOOO(100, 5);
            i3 = 101;
            i++;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) o0O00.Oooo0o0(i, this.f12005OooOooO);
        this.f12005OooOooO = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.OooO0OO(f11975Oooo00o);
        }
        List<OooOo> list = this.f11978OooO0O0;
        this.f12006OooOooo = new TrackOutput[list.size()];
        while (i2 < this.f12006OooOooo.length) {
            TrackOutput trackOutputOooOOO = this.f12003OooOoo.OooOOO(i3, 3);
            trackOutputOooOOO.OooO0OO(list.get(i2));
            this.f12006OooOooo[i2] = trackOutputOooOOO;
            i2++;
            i3++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    public FragmentedMp4Extractor(int i, List list, @Nullable TrackOutput trackOutput) {
        this.f11977OooO00o = i;
        this.f11978OooO0O0 = Collections.unmodifiableList(list);
        this.f11989OooOOO0 = trackOutput;
        this.f11976OooO = new o0000Ooo();
        this.f11985OooOO0 = new o00Oo00(16);
        this.f11980OooO0Oo = new o00Oo00(oo0O.f40640OooO00o);
        this.f11982OooO0o0 = new o00Oo00(5);
        this.f11981OooO0o = new o00Oo00();
        byte[] bArr = new byte[16];
        this.f11983OooO0oO = bArr;
        this.f11984OooO0oo = new o00Oo00(bArr);
        this.f11986OooOO0O = new ArrayDeque<>();
        this.f11987OooOO0o = new ArrayDeque<>();
        this.f11979OooO0OO = new SparseArray<>();
        this.f11998OooOo0O = -9223372036854775807L;
        this.f11996OooOo0 = -9223372036854775807L;
        this.f11999OooOo0o = -9223372036854775807L;
        this.f12003OooOoo = o00O0O0.f39536OooO0OO;
        this.f12005OooOooO = new TrackOutput[0];
        this.f12006OooOooo = new TrackOutput[0];
    }
}
