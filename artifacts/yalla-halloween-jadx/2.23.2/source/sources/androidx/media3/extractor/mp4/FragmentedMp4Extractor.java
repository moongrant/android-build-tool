package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o0000O0;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mp4.Track;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.google.common.base.OooOOO;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
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
import o000OOoO.OooO;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000000;
import o000OOoO.o000OOo;
import o000OOoO.o00oO0o;
import org.conscrypt.PSKKeyManager;
import org.jctools.util.Pow2;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;
import p084o000Ooo0.OooOOO0;
import p090o000o00o.o0;
import p090o000o00o.o0O000;
import p090o000o00o.o0O00000;
import p090o000o00o.o0O0000O;
import p090o000o00o.o0oOO;
import p090o000o00o.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class FragmentedMp4Extractor implements Extractor {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final byte[] f8667Oooo000 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooOO0 f8668Oooo00O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOOO0 f8669OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8670OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooOO0> f8671OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseArray<OooO0O0> f8672OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O000 f8673OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O000 f8674OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O000 f8675OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final byte[] f8676OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000O000 f8677OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000O000 f8678OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> f8679OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f8680OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f8681OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f8682OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f8683OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f8684OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f8685OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000O000 f8686OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f8687OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f8688OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f8689OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f8690OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f8691OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public OooO0O0 f8692OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f8693OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f8694OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f8695OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TrackOutput[] f8696OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Oooo0 f8697OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TrackOutput[] f8698OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f8699OooOooo;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f8700OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f8701OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f8702OooO0OO;

        public OooO00o(long j, boolean z, int i) {
            this.f8700OooO00o = j;
            this.f8701OooO0O0 = z;
            this.f8702OooO0OO = i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f8703OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackOutput f8704OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0O000 f8707OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f8708OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0oOO f8709OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f8710OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f8711OooO0oo;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f8714OooOO0o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O0000O f8705OooO0O0 = new o0O0000O();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000O000 f8706OooO0OO = new o000O000();

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final o000O000 f8712OooOO0 = new o000O000(1);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final o000O000 f8713OooOO0O = new o000O000();

        public OooO0O0(TrackOutput trackOutput, o0O000 o0o001, o0oOO o0ooo2) {
            this.f8704OooO00o = trackOutput;
            this.f8707OooO0Oo = o0o001;
            this.f8709OooO0o0 = o0ooo2;
            this.f8707OooO0Oo = o0o001;
            this.f8709OooO0o0 = o0ooo2;
            trackOutput.OooO0O0(o0o001.f35049OooO00o.f8782OooO0o);
            OooO0Oo();
        }

        @Nullable
        public final o0O00000 OooO00o() {
            if (!this.f8714OooOO0o) {
                return null;
            }
            o0O0000O o0o0000o2 = this.f8705OooO0O0;
            o0oOO o0ooo2 = o0o0000o2.f35063OooO00o;
            int i = o00.f34910OooO00o;
            int i2 = o0ooo2.f35087OooO00o;
            o0O00000 o0o00000 = o0o0000o2.f35075OooOOO0;
            if (o0o00000 == null) {
                o0O00000[] o0o00000Arr = this.f8707OooO0Oo.f35049OooO00o.f8787OooOO0O;
                o0o00000 = o0o00000Arr == null ? null : o0o00000Arr[i2];
            }
            if (o0o00000 == null || !o0o00000.f35057OooO00o) {
                return null;
            }
            return o0o00000;
        }

        public final boolean OooO0O0() {
            this.f8708OooO0o++;
            if (!this.f8714OooOO0o) {
                return false;
            }
            int i = this.f8710OooO0oO + 1;
            this.f8710OooO0oO = i;
            int[] iArr = this.f8705OooO0O0.f35069OooO0oO;
            int i2 = this.f8711OooO0oo;
            if (i != iArr[i2]) {
                return true;
            }
            this.f8711OooO0oo = i2 + 1;
            this.f8710OooO0oO = 0;
            return false;
        }

        public final int OooO0OO(int i, int i2) {
            o000O000 o000o001;
            o0O00000 o0o00000OooO00o = OooO00o();
            if (o0o00000OooO00o == null) {
                return 0;
            }
            o0O0000O o0o0000o2 = this.f8705OooO0O0;
            int length = o0o00000OooO00o.f35060OooO0Oo;
            if (length != 0) {
                o000o001 = o0o0000o2.f35074OooOOO;
            } else {
                int i3 = o00.f34910OooO00o;
                byte[] bArr = o0o00000OooO00o.f35061OooO0o0;
                int length2 = bArr.length;
                o000O000 o000o002 = this.f8713OooOO0O;
                o000o002.OooOooo(length2, bArr);
                length = bArr.length;
                o000o001 = o000o002;
            }
            boolean z = o0o0000o2.f35072OooOO0O && o0o0000o2.f35073OooOO0o[this.f8708OooO0o];
            boolean z2 = z || i2 != 0;
            o000O000 o000o003 = this.f8712OooOO0;
            o000o003.f34962OooO00o[0] = (byte) ((z2 ? 128 : 0) | length);
            o000o003.Oooo00O(0);
            TrackOutput trackOutput = this.f8704OooO00o;
            trackOutput.OooO0Oo(1, o000o003);
            trackOutput.OooO0Oo(length, o000o001);
            if (!z2) {
                return length + 1;
            }
            o000O000 o000o004 = this.f8706OooO0OO;
            if (!z) {
                o000o004.OooOooO(8);
                byte[] bArr2 = o000o004.f34962OooO00o;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i2 >> 8) & 255);
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                trackOutput.OooO0Oo(8, o000o004);
                return length + 1 + 8;
            }
            o000O000 o000o005 = o0o0000o2.f35074OooOOO;
            int iOooOoOO = o000o005.OooOoOO();
            o000o005.Oooo00o(-2);
            int i4 = (iOooOoOO * 6) + 2;
            if (i2 != 0) {
                o000o004.OooOooO(i4);
                byte[] bArr3 = o000o004.f34962OooO00o;
                o000o005.OooO0Oo(0, i4, bArr3);
                int i5 = (((bArr3[2] & UByte.MAX_VALUE) << 8) | (bArr3[3] & UByte.MAX_VALUE)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & 255);
                bArr3[3] = (byte) (i5 & 255);
            } else {
                o000o004 = o000o005;
            }
            trackOutput.OooO0Oo(i4, o000o004);
            return length + 1 + i4;
        }

        public final void OooO0Oo() {
            o0O0000O o0o0000o2 = this.f8705OooO0O0;
            o0o0000o2.f35066OooO0Oo = 0;
            o0o0000o2.f35077OooOOOo = 0L;
            o0o0000o2.f35078OooOOo0 = false;
            o0o0000o2.f35072OooOO0O = false;
            o0o0000o2.f35076OooOOOO = false;
            o0o0000o2.f35075OooOOO0 = null;
            this.f8708OooO0o = 0;
            this.f8711OooO0oo = 0;
            this.f8710OooO0oO = 0;
            this.f8703OooO = 0;
            this.f8714OooOO0o = false;
        }
    }

    static {
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
        oooO00o.f6445OooOO0O = "application/x-emsg";
        f8668Oooo00O = oooO00o.OooO00o();
    }

    public FragmentedMp4Extractor() {
        List listEmptyList = Collections.emptyList();
        this.f8670OooO00o = 0;
        this.f8671OooO0O0 = Collections.unmodifiableList(listEmptyList);
        this.f8669OooO = new OooOOO0();
        this.f8678OooOO0 = new o000O000(16);
        this.f8673OooO0Oo = new o000O000(p070o000O0o.Oooo0.f34301OooO00o);
        this.f8675OooO0o0 = new o000O000(5);
        this.f8674OooO0o = new o000O000();
        byte[] bArr = new byte[16];
        this.f8676OooO0oO = bArr;
        this.f8677OooO0oo = new o000O000(bArr);
        this.f8679OooOO0O = new ArrayDeque<>();
        this.f8680OooOO0o = new ArrayDeque<>();
        this.f8672OooO0OO = new SparseArray<>();
        this.f8689OooOo0 = -9223372036854775807L;
        this.f8690OooOo00 = -9223372036854775807L;
        this.f8691OooOo0O = -9223372036854775807L;
        this.f8697OooOoo0 = Oooo0.f34692OooO0OO;
        this.f8696OooOoo = new TrackOutput[0];
        this.f8698OooOooO = new TrackOutput[0];
    }

    @Nullable
    public static DrmInitData OooO0Oo(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0 = (androidx.media3.extractor.mp4.OooO00o.OooO0O0) arrayList.get(i);
            if (oooO0O0.f8744OooO00o == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = oooO0O0.f8748OooO0O0.f34962OooO00o;
                o0oOOo.OooO00o OooO00o2 = o0oOOo.OooO00o(bArr);
                UUID uuid = OooO00o2 == null ? null : OooO00o2.f35091OooO00o;
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

    public static void OooO0o0(o000O000 o000o001, int i, o0O0000O o0o0000o2) throws ParserException {
        o000o001.Oooo00O(i + 8);
        int iOooO0o = o000o001.OooO0o() & 16777215;
        if ((iOooO0o & 1) != 0) {
            throw ParserException.OooO0O0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iOooO0o & 2) != 0;
        int iOooOoO0 = o000o001.OooOoO0();
        if (iOooOoO0 == 0) {
            Arrays.fill(o0o0000o2.f35073OooOO0o, 0, o0o0000o2.f35068OooO0o0, false);
            return;
        }
        if (iOooOoO0 != o0o0000o2.f35068OooO0o0) {
            StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Senc sample count ", iOooOoO0, " is different from fragment sample count");
            sbOooO0O0.append(o0o0000o2.f35068OooO0o0);
            throw ParserException.OooO00o(sbOooO0O0.toString(), null);
        }
        Arrays.fill(o0o0000o2.f35073OooOO0o, 0, iOooOoO0, z);
        int i2 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
        o000O000 o000o002 = o0o0000o2.f35074OooOOO;
        o000o002.OooOooO(i2);
        o0o0000o2.f35072OooOO0O = true;
        o0o0000o2.f35076OooOOOO = true;
        o000o001.OooO0Oo(0, o000o002.f34964OooO0OO, o000o002.f34962OooO00o);
        o000o002.Oooo00O(0);
        o0o0000o2.f35076OooOOOO = false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f9 A[PHI: r17
      0x01f9: PHI (r17v11 o000OoO.o000O000) = (r17v9 o000OoO.o000O000), (r17v12 o000OoO.o000O000) binds: [B:101:0x01f7, B:95:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
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
    /* JADX WARN: Code duplicated, block: B:227:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:228:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:230:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:237:0x060f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0621  */
    /* JADX WARN: Code duplicated, block: B:248:0x064c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0653 A[LOOP:10: B:249:0x0651->B:250:0x0653, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x0669  */
    /* JADX WARN: Code duplicated, block: B:254:0x0677  */
    /* JADX WARN: Code duplicated, block: B:273:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:275:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:277:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:278:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:281:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:337:0x0756  */
    /* JADX WARN: Code duplicated, block: B:340:0x075c  */
    /* JADX WARN: Code duplicated, block: B:342:0x0762  */
    /* JADX WARN: Code duplicated, block: B:344:0x0768  */
    /* JADX WARN: Code duplicated, block: B:349:0x078d  */
    /* JADX WARN: Code duplicated, block: B:351:0x0793  */
    /* JADX WARN: Code duplicated, block: B:363:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x07aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0786 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x077f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x07a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x028b A[EDGE_INSN: B:389:0x028b->B:120:0x028b BREAK  A[LOOP:5: B:117:0x0279->B:119:0x027f], SYNTHETIC] */
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
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        long j;
        OooOO0O oooOO0O;
        long j2;
        long j3;
        int i;
        OooOO0O oooOO0O2;
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
        String strOooOOOo;
        String strOooOOOo2;
        long jOooo;
        long jOooOo0o;
        long jOooo2;
        long jOooOoO;
        long jOooOoO2;
        o0O000 o0o001;
        Track track;
        TrackOutput trackOutput;
        boolean z5;
        o0O0000O o0o0000o2;
        long j6;
        int i5;
        int i6;
        int i7;
        int i8;
        o0O00000 o0o00000OooO00o;
        TrackOutput.OooO00o oooO00o;
        OooO00o oooO00oRemoveFirst;
        boolean z6;
        long j7;
        int i9;
        o000O000 o000o001;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        OooOO0 oooOO1;
        o000O000 o000o002;
        int iOooO00o;
        int iOooO0o;
        String str;
        byte b;
        boolean z7;
        boolean z8;
        boolean z9;
        o0O0000O o0o0000o3;
        int i13;
        int i14;
        o0O00000 o0o00000OooO00o2;
        o000O000 o000o003;
        int i15;
        boolean z10;
        Oooo000 oooo001 = oooo000;
        FragmentedMp4Extractor fragmentedMp4Extractor = this;
        while (true) {
            int i16 = fragmentedMp4Extractor.f8682OooOOO0;
            ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> arrayDeque = fragmentedMp4Extractor.f8679OooOO0O;
            SparseArray<OooO0O0> sparseArray = fragmentedMp4Extractor.f8672OooO0OO;
            if (i16 != 0) {
                ArrayDeque<OooO00o> arrayDeque2 = fragmentedMp4Extractor.f8680OooOO0o;
                if (i16 != 1) {
                    long j8 = LongCompanionObject.MAX_VALUE;
                    if (i16 != 2) {
                        OooO0O0 oooO0O0 = fragmentedMp4Extractor.f8692OooOo0o;
                        if (oooO0O0 == null) {
                            int size2 = sparseArray.size();
                            OooO0O0 oooO0O1 = null;
                            for (int i17 = 0; i17 < size2; i17++) {
                                OooO0O0 oooO0O0ValueAt = sparseArray.valueAt(i17);
                                boolean z11 = oooO0O0ValueAt.f8714OooOO0o;
                                if (z11 || oooO0O0ValueAt.f8708OooO0o != oooO0O0ValueAt.f8707OooO0Oo.f35050OooO0O0) {
                                    o0O0000O o0o0000o4 = oooO0O0ValueAt.f8705OooO0O0;
                                    if (!z11 || oooO0O0ValueAt.f8711OooO0oo != o0o0000o4.f35066OooO0Oo) {
                                        long j9 = !z11 ? oooO0O0ValueAt.f8707OooO0Oo.f35051OooO0OO[oooO0O0ValueAt.f8708OooO0o] : o0o0000o4.f35067OooO0o[oooO0O0ValueAt.f8711OooO0oo];
                                        if (j9 < j8) {
                                            oooO0O1 = oooO0O0ValueAt;
                                            j8 = j9;
                                        }
                                    }
                                }
                            }
                            if (oooO0O1 == null) {
                                int i18 = (int) (fragmentedMp4Extractor.f8685OooOOo - ((OooOO0O) oooo000).f34678OooO0Oo);
                                if (i18 < 0) {
                                    throw ParserException.OooO00o("Offset to end of mdat was negative.", null);
                                }
                                ((OooOO0O) oooo001).OooOO0(i18);
                                fragmentedMp4Extractor.f8682OooOOO0 = 0;
                                fragmentedMp4Extractor.f8684OooOOOo = 0;
                                z8 = false;
                            } else {
                                int i19 = (int) ((!oooO0O1.f8714OooOO0o ? oooO0O1.f8707OooO0Oo.f35051OooO0OO[oooO0O1.f8708OooO0o] : oooO0O1.f8705OooO0O0.f35067OooO0o[oooO0O1.f8711OooO0oo]) - ((OooOO0O) oooo000).f34678OooO0Oo);
                                if (i19 < 0) {
                                    Log.OooO0o("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i19 = 0;
                                }
                                ((OooOO0O) oooo001).OooOO0(i19);
                                fragmentedMp4Extractor.f8692OooOo0o = oooO0O1;
                                oooO0O0 = oooO0O1;
                                if (fragmentedMp4Extractor.f8682OooOOO0 == 3) {
                                    z9 = oooO0O0.f8714OooOO0o;
                                    o0o0000o3 = oooO0O0.f8705OooO0O0;
                                    if (z9) {
                                        i13 = o0o0000o3.f35070OooO0oo[oooO0O0.f8708OooO0o];
                                    } else {
                                        i13 = oooO0O0.f8707OooO0Oo.f35052OooO0Oo[oooO0O0.f8708OooO0o];
                                    }
                                    fragmentedMp4Extractor.f8688OooOo = i13;
                                    if (oooO0O0.f8708OooO0o < oooO0O0.f8703OooO) {
                                        ((OooOO0O) oooo001).OooOO0(i13);
                                        o0o00000OooO00o2 = oooO0O0.OooO00o();
                                        if (o0o00000OooO00o2 != null) {
                                            o000o003 = o0o0000o3.f35074OooOOO;
                                            i15 = o0o00000OooO00o2.f35060OooO0Oo;
                                            if (i15 != 0) {
                                                o000o003.Oooo00o(i15);
                                            }
                                            int i20 = oooO0O0.f8708OooO0o;
                                            if (o0o0000o3.f35072OooOO0O || !o0o0000o3.f35073OooOO0o[i20]) {
                                                z10 = false;
                                            } else {
                                                z10 = true;
                                            }
                                            if (z10) {
                                                o000o003.Oooo00o(o000o003.OooOoOO() * 6);
                                            }
                                        }
                                        if (!oooO0O0.OooO0O0()) {
                                            fragmentedMp4Extractor.f8692OooOo0o = null;
                                        }
                                        fragmentedMp4Extractor.f8682OooOOO0 = 3;
                                    } else {
                                        if (oooO0O0.f8707OooO0Oo.f35049OooO00o.f8784OooO0oO == 1) {
                                            fragmentedMp4Extractor.f8688OooOo = i13 - 8;
                                            ((OooOO0O) oooo001).OooOO0(8);
                                        }
                                        if ("audio/ac4".equals(oooO0O0.f8707OooO0Oo.f35049OooO00o.f8782OooO0o.f6412OooOOOO)) {
                                            fragmentedMp4Extractor.f8694OooOoO0 = oooO0O0.OooO0OO(fragmentedMp4Extractor.f8688OooOo, 7);
                                            int i21 = fragmentedMp4Extractor.f8688OooOo;
                                            o000O000 o000o004 = fragmentedMp4Extractor.f8677OooO0oo;
                                            o000OOoO.OooO0O0.OooO00o(i21, o000o004);
                                            oooO0O0.f8704OooO00o.OooO0OO(7, o000o004);
                                            fragmentedMp4Extractor.f8694OooOoO0 += 7;
                                            i14 = 0;
                                        } else {
                                            i14 = 0;
                                            fragmentedMp4Extractor.f8694OooOoO0 = oooO0O0.OooO0OO(fragmentedMp4Extractor.f8688OooOo, 0);
                                        }
                                        fragmentedMp4Extractor.f8688OooOo += fragmentedMp4Extractor.f8694OooOoO0;
                                        fragmentedMp4Extractor.f8682OooOOO0 = 4;
                                        fragmentedMp4Extractor.f8693OooOoO = i14;
                                        o0o001 = oooO0O0.f8707OooO0Oo;
                                        track = o0o001.f35049OooO00o;
                                        trackOutput = oooO0O0.f8704OooO00o;
                                        z5 = oooO0O0.f8714OooOO0o;
                                        o0o0000o2 = oooO0O0.f8705OooO0O0;
                                        if (z5) {
                                            j6 = o0o0000o2.f35062OooO[oooO0O0.f8708OooO0o];
                                        } else {
                                            j6 = o0o001.f35053OooO0o[oooO0O0.f8708OooO0o];
                                        }
                                        i5 = track.f8786OooOO0;
                                        if (i5 != 0) {
                                            while (true) {
                                                i6 = fragmentedMp4Extractor.f8694OooOoO0;
                                                i7 = fragmentedMp4Extractor.f8688OooOo;
                                                if (i6 < i7) {
                                                    break;
                                                }
                                                fragmentedMp4Extractor.f8694OooOoO0 += trackOutput.OooO00o(oooo001, i7 - i6, false);
                                            }
                                        } else {
                                            o000o001 = fragmentedMp4Extractor.f8675OooO0o0;
                                            bArr = o000o001.f34962OooO00o;
                                            bArr[0] = 0;
                                            bArr[1] = 0;
                                            bArr[2] = 0;
                                            i10 = i5 + 1;
                                            i11 = 4 - i5;
                                            while (fragmentedMp4Extractor.f8694OooOoO0 < fragmentedMp4Extractor.f8688OooOo) {
                                                i12 = fragmentedMp4Extractor.f8693OooOoO;
                                                oooOO1 = track.f8782OooO0o;
                                                if (i12 == 0) {
                                                    ((OooOO0O) oooo001).OooO0o(bArr, i11, i10, false);
                                                    o000o001.Oooo00O(0);
                                                    iOooO0o = o000o001.OooO0o();
                                                    if (iOooO0o >= 1) {
                                                        throw ParserException.OooO00o("Invalid NAL length", null);
                                                    }
                                                    fragmentedMp4Extractor.f8693OooOoO = iOooO0o - 1;
                                                    o000O000 o000o005 = fragmentedMp4Extractor.f8673OooO0Oo;
                                                    o000o005.Oooo00O(0);
                                                    trackOutput.OooO0OO(4, o000o005);
                                                    trackOutput.OooO0OO(1, o000o001);
                                                    if (fragmentedMp4Extractor.f8698OooOooO.length > 0) {
                                                        str = oooOO1.f6412OooOOOO;
                                                        b = bArr[4];
                                                        byte[] bArr2 = p070o000O0o.Oooo0.f34301OooO00o;
                                                        if ("video/avc".equals(str)) {
                                                            o000o002 = o000o001;
                                                            if ((b & 31) != 6) {
                                                                z7 = true;
                                                            }
                                                            boolean z12 = z7;
                                                            fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                            fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                            fragmentedMp4Extractor.f8688OooOo += i11;
                                                            i11 = i11;
                                                            bArr = bArr;
                                                        } else {
                                                            o000o002 = o000o001;
                                                        }
                                                        if ("video/hevc".equals(str) || ((b & 126) >> 1) != 39) {
                                                            z7 = false;
                                                        } else {
                                                            z7 = true;
                                                        }
                                                        if (z7) {
                                                        }
                                                        fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                        fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                        fragmentedMp4Extractor.f8688OooOo += i11;
                                                        i11 = i11;
                                                        bArr = bArr;
                                                    } else {
                                                        o000o002 = o000o001;
                                                    }
                                                    fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                    fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                    fragmentedMp4Extractor.f8688OooOo += i11;
                                                    i11 = i11;
                                                    bArr = bArr;
                                                } else {
                                                    o000o002 = o000o001;
                                                    if (fragmentedMp4Extractor.f8695OooOoOO) {
                                                        o000O000 o000o006 = fragmentedMp4Extractor.f8674OooO0o;
                                                        o000o006.OooOooO(i12);
                                                        ((OooOO0O) oooo001).OooO0o(o000o006.f34962OooO00o, 0, fragmentedMp4Extractor.f8693OooOoO, false);
                                                        trackOutput.OooO0OO(fragmentedMp4Extractor.f8693OooOoO, o000o006);
                                                        iOooO00o = fragmentedMp4Extractor.f8693OooOoO;
                                                        int iOooO0o0 = p070o000O0o.Oooo0.OooO0o0(o000o006.f34964OooO0OO, o000o006.f34962OooO00o);
                                                        o000o006.Oooo00O("video/hevc".equals(oooOO1.f6412OooOOOO) ? 1 : 0);
                                                        o000o006.Oooo000(iOooO0o0);
                                                        androidx.media3.extractor.OooO00o.OooO00o(j6, o000o006, fragmentedMp4Extractor.f8698OooOooO);
                                                    } else {
                                                        iOooO00o = trackOutput.OooO00o(oooo001, i12, false);
                                                    }
                                                    fragmentedMp4Extractor.f8694OooOoO0 += iOooO00o;
                                                    fragmentedMp4Extractor.f8693OooOoO -= iOooO00o;
                                                }
                                                i11 = i11;
                                                track = track;
                                                o000o001 = o000o002;
                                                bArr = bArr;
                                            }
                                        }
                                        if (!oooO0O0.f8714OooOO0o) {
                                            i8 = oooO0O0.f8707OooO0Oo.f35055OooO0oO[oooO0O0.f8708OooO0o];
                                        } else if (o0o0000o2.f35071OooOO0[oooO0O0.f8708OooO0o]) {
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
                                        }
                                        if (oooO0O0.OooO00o() != null) {
                                            i8 |= Pow2.MAX_POW2;
                                        }
                                        int i22 = i8;
                                        o0o00000OooO00o = oooO0O0.OooO00o();
                                        if (o0o00000OooO00o != null) {
                                            oooO00o = o0o00000OooO00o.f35059OooO0OO;
                                        } else {
                                            oooO00o = null;
                                        }
                                        trackOutput.OooO0o0(j6, i22, fragmentedMp4Extractor.f8688OooOo, 0, oooO00o);
                                        while (!arrayDeque2.isEmpty()) {
                                            oooO00oRemoveFirst = arrayDeque2.removeFirst();
                                            fragmentedMp4Extractor.f8687OooOOoo -= oooO00oRemoveFirst.f8702OooO0OO;
                                            z6 = oooO00oRemoveFirst.f8701OooO0O0;
                                            j7 = oooO00oRemoveFirst.f8700OooO00o;
                                            if (z6) {
                                                j7 += j6;
                                            }
                                            for (TrackOutput trackOutput2 : fragmentedMp4Extractor.f8696OooOoo) {
                                                trackOutput2.OooO0o0(j7, 1, oooO00oRemoveFirst.f8702OooO0OO, fragmentedMp4Extractor.f8687OooOOoo, null);
                                            }
                                        }
                                        if (!oooO0O0.OooO0O0()) {
                                            fragmentedMp4Extractor.f8692OooOo0o = null;
                                        }
                                        fragmentedMp4Extractor.f8682OooOOO0 = 3;
                                    }
                                } else {
                                    o0o001 = oooO0O0.f8707OooO0Oo;
                                    track = o0o001.f35049OooO00o;
                                    trackOutput = oooO0O0.f8704OooO00o;
                                    z5 = oooO0O0.f8714OooOO0o;
                                    o0o0000o2 = oooO0O0.f8705OooO0O0;
                                    if (z5) {
                                        j6 = o0o001.f35053OooO0o[oooO0O0.f8708OooO0o];
                                    } else {
                                        j6 = o0o0000o2.f35062OooO[oooO0O0.f8708OooO0o];
                                    }
                                    i5 = track.f8786OooOO0;
                                    if (i5 != 0) {
                                        while (true) {
                                            i6 = fragmentedMp4Extractor.f8694OooOoO0;
                                            i7 = fragmentedMp4Extractor.f8688OooOo;
                                            if (i6 < i7) {
                                                break;
                                                break;
                                            }
                                            fragmentedMp4Extractor.f8694OooOoO0 += trackOutput.OooO00o(oooo001, i7 - i6, false);
                                        }
                                    } else {
                                        o000o001 = fragmentedMp4Extractor.f8675OooO0o0;
                                        bArr = o000o001.f34962OooO00o;
                                        bArr[0] = 0;
                                        bArr[1] = 0;
                                        bArr[2] = 0;
                                        i10 = i5 + 1;
                                        i11 = 4 - i5;
                                        while (fragmentedMp4Extractor.f8694OooOoO0 < fragmentedMp4Extractor.f8688OooOo) {
                                            i12 = fragmentedMp4Extractor.f8693OooOoO;
                                            oooOO1 = track.f8782OooO0o;
                                            if (i12 == 0) {
                                                ((OooOO0O) oooo001).OooO0o(bArr, i11, i10, false);
                                                o000o001.Oooo00O(0);
                                                iOooO0o = o000o001.OooO0o();
                                                if (iOooO0o >= 1) {
                                                    throw ParserException.OooO00o("Invalid NAL length", null);
                                                }
                                                fragmentedMp4Extractor.f8693OooOoO = iOooO0o - 1;
                                                o000O000 o000o007 = fragmentedMp4Extractor.f8673OooO0Oo;
                                                o000o007.Oooo00O(0);
                                                trackOutput.OooO0OO(4, o000o007);
                                                trackOutput.OooO0OO(1, o000o001);
                                                if (fragmentedMp4Extractor.f8698OooOooO.length > 0) {
                                                    str = oooOO1.f6412OooOOOO;
                                                    b = bArr[4];
                                                    byte[] bArr3 = p070o000O0o.Oooo0.f34301OooO00o;
                                                    if ("video/avc".equals(str)) {
                                                        o000o002 = o000o001;
                                                        if ((b & 31) != 6) {
                                                            z7 = true;
                                                        }
                                                        if (z7) {
                                                        }
                                                        fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                        fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                        fragmentedMp4Extractor.f8688OooOo += i11;
                                                        i11 = i11;
                                                        bArr = bArr;
                                                    } else {
                                                        o000o002 = o000o001;
                                                    }
                                                    if ("video/hevc".equals(str)) {
                                                    }
                                                    z7 = false;
                                                    if (z7) {
                                                    }
                                                    fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                    fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                    fragmentedMp4Extractor.f8688OooOo += i11;
                                                    i11 = i11;
                                                    bArr = bArr;
                                                } else {
                                                    o000o002 = o000o001;
                                                }
                                                fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                fragmentedMp4Extractor.f8688OooOo += i11;
                                                i11 = i11;
                                                bArr = bArr;
                                            } else {
                                                o000o002 = o000o001;
                                                if (fragmentedMp4Extractor.f8695OooOoOO) {
                                                    o000O000 o000o008 = fragmentedMp4Extractor.f8674OooO0o;
                                                    o000o008.OooOooO(i12);
                                                    ((OooOO0O) oooo001).OooO0o(o000o008.f34962OooO00o, 0, fragmentedMp4Extractor.f8693OooOoO, false);
                                                    trackOutput.OooO0OO(fragmentedMp4Extractor.f8693OooOoO, o000o008);
                                                    iOooO00o = fragmentedMp4Extractor.f8693OooOoO;
                                                    int iOooO0o1 = p070o000O0o.Oooo0.OooO0o0(o000o008.f34964OooO0OO, o000o008.f34962OooO00o);
                                                    o000o008.Oooo00O("video/hevc".equals(oooOO1.f6412OooOOOO) ? 1 : 0);
                                                    o000o008.Oooo000(iOooO0o1);
                                                    androidx.media3.extractor.OooO00o.OooO00o(j6, o000o008, fragmentedMp4Extractor.f8698OooOooO);
                                                } else {
                                                    iOooO00o = trackOutput.OooO00o(oooo001, i12, false);
                                                }
                                                fragmentedMp4Extractor.f8694OooOoO0 += iOooO00o;
                                                fragmentedMp4Extractor.f8693OooOoO -= iOooO00o;
                                            }
                                            i11 = i11;
                                            track = track;
                                            o000o001 = o000o002;
                                            bArr = bArr;
                                        }
                                    }
                                    if (!oooO0O0.f8714OooOO0o) {
                                        i8 = oooO0O0.f8707OooO0Oo.f35055OooO0oO[oooO0O0.f8708OooO0o];
                                    } else if (o0o0000o2.f35071OooOO0[oooO0O0.f8708OooO0o]) {
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                    }
                                    if (oooO0O0.OooO00o() != null) {
                                        i8 |= Pow2.MAX_POW2;
                                    }
                                    int i23 = i8;
                                    o0o00000OooO00o = oooO0O0.OooO00o();
                                    if (o0o00000OooO00o != null) {
                                        oooO00o = o0o00000OooO00o.f35059OooO0OO;
                                    } else {
                                        oooO00o = null;
                                    }
                                    trackOutput.OooO0o0(j6, i23, fragmentedMp4Extractor.f8688OooOo, 0, oooO00o);
                                    while (!arrayDeque2.isEmpty()) {
                                        oooO00oRemoveFirst = arrayDeque2.removeFirst();
                                        fragmentedMp4Extractor.f8687OooOOoo -= oooO00oRemoveFirst.f8702OooO0OO;
                                        z6 = oooO00oRemoveFirst.f8701OooO0O0;
                                        j7 = oooO00oRemoveFirst.f8700OooO00o;
                                        if (z6) {
                                            j7 += j6;
                                        }
                                        while (i9 < r7) {
                                            trackOutput2.OooO0o0(j7, 1, oooO00oRemoveFirst.f8702OooO0OO, fragmentedMp4Extractor.f8687OooOOoo, null);
                                        }
                                    }
                                    if (!oooO0O0.OooO0O0()) {
                                        fragmentedMp4Extractor.f8692OooOo0o = null;
                                    }
                                    fragmentedMp4Extractor.f8682OooOOO0 = 3;
                                }
                                z8 = true;
                            }
                        } else {
                            if (fragmentedMp4Extractor.f8682OooOOO0 == 3) {
                                z9 = oooO0O0.f8714OooOO0o;
                                o0o0000o3 = oooO0O0.f8705OooO0O0;
                                if (z9) {
                                    i13 = oooO0O0.f8707OooO0Oo.f35052OooO0Oo[oooO0O0.f8708OooO0o];
                                } else {
                                    i13 = o0o0000o3.f35070OooO0oo[oooO0O0.f8708OooO0o];
                                }
                                fragmentedMp4Extractor.f8688OooOo = i13;
                                if (oooO0O0.f8708OooO0o < oooO0O0.f8703OooO) {
                                    ((OooOO0O) oooo001).OooOO0(i13);
                                    o0o00000OooO00o2 = oooO0O0.OooO00o();
                                    if (o0o00000OooO00o2 != null) {
                                        o000o003 = o0o0000o3.f35074OooOOO;
                                        i15 = o0o00000OooO00o2.f35060OooO0Oo;
                                        if (i15 != 0) {
                                            o000o003.Oooo00o(i15);
                                        }
                                        int i24 = oooO0O0.f8708OooO0o;
                                        if (o0o0000o3.f35072OooOO0O) {
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            o000o003.Oooo00o(o000o003.OooOoOO() * 6);
                                        }
                                    }
                                    if (!oooO0O0.OooO0O0()) {
                                        fragmentedMp4Extractor.f8692OooOo0o = null;
                                    }
                                    fragmentedMp4Extractor.f8682OooOOO0 = 3;
                                } else {
                                    if (oooO0O0.f8707OooO0Oo.f35049OooO00o.f8784OooO0oO == 1) {
                                        fragmentedMp4Extractor.f8688OooOo = i13 - 8;
                                        ((OooOO0O) oooo001).OooOO0(8);
                                    }
                                    if ("audio/ac4".equals(oooO0O0.f8707OooO0Oo.f35049OooO00o.f8782OooO0o.f6412OooOOOO)) {
                                        fragmentedMp4Extractor.f8694OooOoO0 = oooO0O0.OooO0OO(fragmentedMp4Extractor.f8688OooOo, 7);
                                        int i25 = fragmentedMp4Extractor.f8688OooOo;
                                        o000O000 o000o009 = fragmentedMp4Extractor.f8677OooO0oo;
                                        o000OOoO.OooO0O0.OooO00o(i25, o000o009);
                                        oooO0O0.f8704OooO00o.OooO0OO(7, o000o009);
                                        fragmentedMp4Extractor.f8694OooOoO0 += 7;
                                        i14 = 0;
                                    } else {
                                        i14 = 0;
                                        fragmentedMp4Extractor.f8694OooOoO0 = oooO0O0.OooO0OO(fragmentedMp4Extractor.f8688OooOo, 0);
                                    }
                                    fragmentedMp4Extractor.f8688OooOo += fragmentedMp4Extractor.f8694OooOoO0;
                                    fragmentedMp4Extractor.f8682OooOOO0 = 4;
                                    fragmentedMp4Extractor.f8693OooOoO = i14;
                                    o0o001 = oooO0O0.f8707OooO0Oo;
                                    track = o0o001.f35049OooO00o;
                                    trackOutput = oooO0O0.f8704OooO00o;
                                    z5 = oooO0O0.f8714OooOO0o;
                                    o0o0000o2 = oooO0O0.f8705OooO0O0;
                                    if (z5) {
                                        j6 = o0o001.f35053OooO0o[oooO0O0.f8708OooO0o];
                                    } else {
                                        j6 = o0o0000o2.f35062OooO[oooO0O0.f8708OooO0o];
                                    }
                                    i5 = track.f8786OooOO0;
                                    if (i5 != 0) {
                                        while (true) {
                                            i6 = fragmentedMp4Extractor.f8694OooOoO0;
                                            i7 = fragmentedMp4Extractor.f8688OooOo;
                                            if (i6 < i7) {
                                                break;
                                                break;
                                            }
                                            fragmentedMp4Extractor.f8694OooOoO0 += trackOutput.OooO00o(oooo001, i7 - i6, false);
                                        }
                                    } else {
                                        o000o001 = fragmentedMp4Extractor.f8675OooO0o0;
                                        bArr = o000o001.f34962OooO00o;
                                        bArr[0] = 0;
                                        bArr[1] = 0;
                                        bArr[2] = 0;
                                        i10 = i5 + 1;
                                        i11 = 4 - i5;
                                        while (fragmentedMp4Extractor.f8694OooOoO0 < fragmentedMp4Extractor.f8688OooOo) {
                                            i12 = fragmentedMp4Extractor.f8693OooOoO;
                                            oooOO1 = track.f8782OooO0o;
                                            if (i12 == 0) {
                                                ((OooOO0O) oooo001).OooO0o(bArr, i11, i10, false);
                                                o000o001.Oooo00O(0);
                                                iOooO0o = o000o001.OooO0o();
                                                if (iOooO0o >= 1) {
                                                    throw ParserException.OooO00o("Invalid NAL length", null);
                                                }
                                                fragmentedMp4Extractor.f8693OooOoO = iOooO0o - 1;
                                                o000O000 o000o0010 = fragmentedMp4Extractor.f8673OooO0Oo;
                                                o000o0010.Oooo00O(0);
                                                trackOutput.OooO0OO(4, o000o0010);
                                                trackOutput.OooO0OO(1, o000o001);
                                                if (fragmentedMp4Extractor.f8698OooOooO.length > 0) {
                                                    str = oooOO1.f6412OooOOOO;
                                                    b = bArr[4];
                                                    byte[] bArr4 = p070o000O0o.Oooo0.f34301OooO00o;
                                                    if ("video/avc".equals(str)) {
                                                        o000o002 = o000o001;
                                                        if ((b & 31) != 6) {
                                                            z7 = true;
                                                        }
                                                        if (z7) {
                                                        }
                                                        fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                        fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                        fragmentedMp4Extractor.f8688OooOo += i11;
                                                        i11 = i11;
                                                        bArr = bArr;
                                                    } else {
                                                        o000o002 = o000o001;
                                                    }
                                                    if ("video/hevc".equals(str)) {
                                                    }
                                                    z7 = false;
                                                    if (z7) {
                                                    }
                                                    fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                    fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                    fragmentedMp4Extractor.f8688OooOo += i11;
                                                    i11 = i11;
                                                    bArr = bArr;
                                                } else {
                                                    o000o002 = o000o001;
                                                }
                                                fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                fragmentedMp4Extractor.f8688OooOo += i11;
                                                i11 = i11;
                                                bArr = bArr;
                                            } else {
                                                o000o002 = o000o001;
                                                if (fragmentedMp4Extractor.f8695OooOoOO) {
                                                    o000O000 o000o0011 = fragmentedMp4Extractor.f8674OooO0o;
                                                    o000o0011.OooOooO(i12);
                                                    ((OooOO0O) oooo001).OooO0o(o000o0011.f34962OooO00o, 0, fragmentedMp4Extractor.f8693OooOoO, false);
                                                    trackOutput.OooO0OO(fragmentedMp4Extractor.f8693OooOoO, o000o0011);
                                                    iOooO00o = fragmentedMp4Extractor.f8693OooOoO;
                                                    int iOooO0o2 = p070o000O0o.Oooo0.OooO0o0(o000o0011.f34964OooO0OO, o000o0011.f34962OooO00o);
                                                    o000o0011.Oooo00O("video/hevc".equals(oooOO1.f6412OooOOOO) ? 1 : 0);
                                                    o000o0011.Oooo000(iOooO0o2);
                                                    androidx.media3.extractor.OooO00o.OooO00o(j6, o000o0011, fragmentedMp4Extractor.f8698OooOooO);
                                                } else {
                                                    iOooO00o = trackOutput.OooO00o(oooo001, i12, false);
                                                }
                                                fragmentedMp4Extractor.f8694OooOoO0 += iOooO00o;
                                                fragmentedMp4Extractor.f8693OooOoO -= iOooO00o;
                                            }
                                            i11 = i11;
                                            track = track;
                                            o000o001 = o000o002;
                                            bArr = bArr;
                                        }
                                    }
                                    if (!oooO0O0.f8714OooOO0o) {
                                        i8 = oooO0O0.f8707OooO0Oo.f35055OooO0oO[oooO0O0.f8708OooO0o];
                                    } else if (o0o0000o2.f35071OooOO0[oooO0O0.f8708OooO0o]) {
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                    }
                                    if (oooO0O0.OooO00o() != null) {
                                        i8 |= Pow2.MAX_POW2;
                                    }
                                    int i26 = i8;
                                    o0o00000OooO00o = oooO0O0.OooO00o();
                                    if (o0o00000OooO00o != null) {
                                        oooO00o = o0o00000OooO00o.f35059OooO0OO;
                                    } else {
                                        oooO00o = null;
                                    }
                                    trackOutput.OooO0o0(j6, i26, fragmentedMp4Extractor.f8688OooOo, 0, oooO00o);
                                    while (!arrayDeque2.isEmpty()) {
                                        oooO00oRemoveFirst = arrayDeque2.removeFirst();
                                        fragmentedMp4Extractor.f8687OooOOoo -= oooO00oRemoveFirst.f8702OooO0OO;
                                        z6 = oooO00oRemoveFirst.f8701OooO0O0;
                                        j7 = oooO00oRemoveFirst.f8700OooO00o;
                                        if (z6) {
                                            j7 += j6;
                                        }
                                        while (i9 < r7) {
                                            trackOutput2.OooO0o0(j7, 1, oooO00oRemoveFirst.f8702OooO0OO, fragmentedMp4Extractor.f8687OooOOoo, null);
                                        }
                                    }
                                    if (!oooO0O0.OooO0O0()) {
                                        fragmentedMp4Extractor.f8692OooOo0o = null;
                                    }
                                    fragmentedMp4Extractor.f8682OooOOO0 = 3;
                                }
                            } else {
                                o0o001 = oooO0O0.f8707OooO0Oo;
                                track = o0o001.f35049OooO00o;
                                trackOutput = oooO0O0.f8704OooO00o;
                                z5 = oooO0O0.f8714OooOO0o;
                                o0o0000o2 = oooO0O0.f8705OooO0O0;
                                if (z5) {
                                    j6 = o0o001.f35053OooO0o[oooO0O0.f8708OooO0o];
                                } else {
                                    j6 = o0o0000o2.f35062OooO[oooO0O0.f8708OooO0o];
                                }
                                i5 = track.f8786OooOO0;
                                if (i5 != 0) {
                                    while (true) {
                                        i6 = fragmentedMp4Extractor.f8694OooOoO0;
                                        i7 = fragmentedMp4Extractor.f8688OooOo;
                                        if (i6 < i7) {
                                            break;
                                            break;
                                        }
                                        fragmentedMp4Extractor.f8694OooOoO0 += trackOutput.OooO00o(oooo001, i7 - i6, false);
                                    }
                                } else {
                                    o000o001 = fragmentedMp4Extractor.f8675OooO0o0;
                                    bArr = o000o001.f34962OooO00o;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    i10 = i5 + 1;
                                    i11 = 4 - i5;
                                    while (fragmentedMp4Extractor.f8694OooOoO0 < fragmentedMp4Extractor.f8688OooOo) {
                                        i12 = fragmentedMp4Extractor.f8693OooOoO;
                                        oooOO1 = track.f8782OooO0o;
                                        if (i12 == 0) {
                                            ((OooOO0O) oooo001).OooO0o(bArr, i11, i10, false);
                                            o000o001.Oooo00O(0);
                                            iOooO0o = o000o001.OooO0o();
                                            if (iOooO0o >= 1) {
                                                throw ParserException.OooO00o("Invalid NAL length", null);
                                            }
                                            fragmentedMp4Extractor.f8693OooOoO = iOooO0o - 1;
                                            o000O000 o000o0012 = fragmentedMp4Extractor.f8673OooO0Oo;
                                            o000o0012.Oooo00O(0);
                                            trackOutput.OooO0OO(4, o000o0012);
                                            trackOutput.OooO0OO(1, o000o001);
                                            if (fragmentedMp4Extractor.f8698OooOooO.length > 0) {
                                                str = oooOO1.f6412OooOOOO;
                                                b = bArr[4];
                                                byte[] bArr5 = p070o000O0o.Oooo0.f34301OooO00o;
                                                if ("video/avc".equals(str)) {
                                                    o000o002 = o000o001;
                                                    if ((b & 31) != 6) {
                                                        z7 = true;
                                                    }
                                                    if (z7) {
                                                    }
                                                    fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                    fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                    fragmentedMp4Extractor.f8688OooOo += i11;
                                                    i11 = i11;
                                                    bArr = bArr;
                                                } else {
                                                    o000o002 = o000o001;
                                                }
                                                if ("video/hevc".equals(str)) {
                                                }
                                                z7 = false;
                                                if (z7) {
                                                }
                                                fragmentedMp4Extractor.f8695OooOoOO = z12;
                                                fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                                fragmentedMp4Extractor.f8688OooOo += i11;
                                                i11 = i11;
                                                bArr = bArr;
                                            } else {
                                                o000o002 = o000o001;
                                            }
                                            fragmentedMp4Extractor.f8695OooOoOO = z12;
                                            fragmentedMp4Extractor.f8694OooOoO0 += 5;
                                            fragmentedMp4Extractor.f8688OooOo += i11;
                                            i11 = i11;
                                            bArr = bArr;
                                        } else {
                                            o000o002 = o000o001;
                                            if (fragmentedMp4Extractor.f8695OooOoOO) {
                                                o000O000 o000o0013 = fragmentedMp4Extractor.f8674OooO0o;
                                                o000o0013.OooOooO(i12);
                                                ((OooOO0O) oooo001).OooO0o(o000o0013.f34962OooO00o, 0, fragmentedMp4Extractor.f8693OooOoO, false);
                                                trackOutput.OooO0OO(fragmentedMp4Extractor.f8693OooOoO, o000o0013);
                                                iOooO00o = fragmentedMp4Extractor.f8693OooOoO;
                                                int iOooO0o3 = p070o000O0o.Oooo0.OooO0o0(o000o0013.f34964OooO0OO, o000o0013.f34962OooO00o);
                                                o000o0013.Oooo00O("video/hevc".equals(oooOO1.f6412OooOOOO) ? 1 : 0);
                                                o000o0013.Oooo000(iOooO0o3);
                                                androidx.media3.extractor.OooO00o.OooO00o(j6, o000o0013, fragmentedMp4Extractor.f8698OooOooO);
                                            } else {
                                                iOooO00o = trackOutput.OooO00o(oooo001, i12, false);
                                            }
                                            fragmentedMp4Extractor.f8694OooOoO0 += iOooO00o;
                                            fragmentedMp4Extractor.f8693OooOoO -= iOooO00o;
                                        }
                                        i11 = i11;
                                        track = track;
                                        o000o001 = o000o002;
                                        bArr = bArr;
                                    }
                                }
                                if (!oooO0O0.f8714OooOO0o) {
                                    i8 = oooO0O0.f8707OooO0Oo.f35055OooO0oO[oooO0O0.f8708OooO0o];
                                } else if (o0o0000o2.f35071OooOO0[oooO0O0.f8708OooO0o]) {
                                    i8 = 1;
                                } else {
                                    i8 = 0;
                                }
                                if (oooO0O0.OooO00o() != null) {
                                    i8 |= Pow2.MAX_POW2;
                                }
                                int i27 = i8;
                                o0o00000OooO00o = oooO0O0.OooO00o();
                                if (o0o00000OooO00o != null) {
                                    oooO00o = o0o00000OooO00o.f35059OooO0OO;
                                } else {
                                    oooO00o = null;
                                }
                                trackOutput.OooO0o0(j6, i27, fragmentedMp4Extractor.f8688OooOo, 0, oooO00o);
                                while (!arrayDeque2.isEmpty()) {
                                    oooO00oRemoveFirst = arrayDeque2.removeFirst();
                                    fragmentedMp4Extractor.f8687OooOOoo -= oooO00oRemoveFirst.f8702OooO0OO;
                                    z6 = oooO00oRemoveFirst.f8701OooO0O0;
                                    j7 = oooO00oRemoveFirst.f8700OooO00o;
                                    if (z6) {
                                        j7 += j6;
                                    }
                                    while (i9 < r7) {
                                        trackOutput2.OooO0o0(j7, 1, oooO00oRemoveFirst.f8702OooO0OO, fragmentedMp4Extractor.f8687OooOOoo, null);
                                    }
                                }
                                if (!oooO0O0.OooO0O0()) {
                                    fragmentedMp4Extractor.f8692OooOo0o = null;
                                }
                                fragmentedMp4Extractor.f8682OooOOO0 = 3;
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
                            o0O0000O o0o0000o5 = sparseArray.valueAt(i28).f8705OooO0O0;
                            if (o0o0000o5.f35076OooOOOO) {
                                long j10 = o0o0000o5.f35065OooO0OO;
                                if (j10 < j8) {
                                    oooO0O0ValueAt2 = sparseArray.valueAt(i28);
                                    j8 = j10;
                                }
                            }
                        }
                        if (oooO0O0ValueAt2 == null) {
                            fragmentedMp4Extractor.f8682OooOOO0 = 3;
                        } else {
                            int i29 = (int) (j8 - ((OooOO0O) oooo000).f34678OooO0Oo);
                            if (i29 < 0) {
                                throw ParserException.OooO00o("Offset to encryption data was negative.", null);
                            }
                            OooOO0O oooOO0O3 = (OooOO0O) oooo001;
                            oooOO0O3.OooOO0(i29);
                            o0O0000O o0o0000o6 = oooO0O0ValueAt2.f8705OooO0O0;
                            o000O000 o000o0014 = o0o0000o6.f35074OooOOO;
                            oooOO0O3.OooO0o(o000o0014.f34962OooO00o, 0, o000o0014.f34964OooO0OO, false);
                            o000o0014.Oooo00O(0);
                            o0o0000o6.f35076OooOOOO = false;
                        }
                    }
                } else {
                    int i30 = ((int) fragmentedMp4Extractor.f8683OooOOOO) - fragmentedMp4Extractor.f8684OooOOOo;
                    o000O000 o000o0015 = fragmentedMp4Extractor.f8686OooOOo0;
                    if (o000o0015 != null) {
                        ((OooOO0O) oooo001).OooO0o(o000o0015.f34962OooO00o, 8, i30, false);
                        int i31 = fragmentedMp4Extractor.f8681OooOOO;
                        androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O2 = new androidx.media3.extractor.mp4.OooO00o.OooO0O0(i31, o000o0015);
                        long j11 = ((OooOO0O) oooo000).f34678OooO0Oo;
                        if (arrayDeque.isEmpty()) {
                            if (i31 == 1936286840) {
                                o000o0015.Oooo00O(8);
                                int iOooO0o4 = (o000o0015.OooO0o() >> 24) & 255;
                                o000o0015.Oooo00o(4);
                                long jOooOo0o2 = o000o0015.OooOo0o();
                                if (iOooO0o4 == 0) {
                                    jOooOoO = o000o0015.OooOo0o();
                                    jOooOoO2 = o000o0015.OooOo0o();
                                } else {
                                    jOooOoO = o000o0015.OooOoO();
                                    jOooOoO2 = o000o0015.OooOoO();
                                }
                                long j12 = j11 + jOooOoO2;
                                long jOooo3 = o00.Oooo(jOooOoO, AnimationKt.MillisToNanos, jOooOo0o2);
                                o000o0015.Oooo00o(2);
                                int iOooOoOO = o000o0015.OooOoOO();
                                int[] iArr = new int[iOooOoOO];
                                long[] jArr = new long[iOooOoOO];
                                long[] jArr2 = new long[iOooOoOO];
                                long[] jArr3 = new long[iOooOoOO];
                                int i32 = 0;
                                long jOooo4 = jOooo3;
                                while (i32 < iOooOoOO) {
                                    int iOooO0o5 = o000o0015.OooO0o();
                                    if ((iOooO0o5 & Integer.MIN_VALUE) != 0) {
                                        throw ParserException.OooO00o("Unhandled indirect reference", null);
                                    }
                                    long jOooOo0o3 = o000o0015.OooOo0o();
                                    iArr[i32] = iOooO0o5 & Integer.MAX_VALUE;
                                    jArr[i32] = j12;
                                    jArr3[i32] = jOooo4;
                                    long j13 = jOooOoO + jOooOo0o3;
                                    int i33 = i32;
                                    int i34 = iOooOoOO;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int[] iArr2 = iArr;
                                    jOooo4 = o00.Oooo(j13, AnimationKt.MillisToNanos, jOooOo0o2);
                                    jArr4[i33] = jOooo4 - jArr5[i33];
                                    o000o0015.Oooo00o(4);
                                    j12 += (long) iArr2[i33];
                                    i32 = i33 + 1;
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    iArr = iArr2;
                                    jOooOoO = j13;
                                    jArr = jArr;
                                    iOooOoOO = i34;
                                }
                                Pair pairCreate = Pair.create(Long.valueOf(jOooo3), new OooO(iArr, jArr, jArr2, jArr3));
                                this.f8691OooOo0O = ((Long) pairCreate.first).longValue();
                                this.f8697OooOoo0.OooO((o000000) pairCreate.second);
                                this.f8699OooOooo = true;
                                fragmentedMp4Extractor = this;
                            } else if (i31 == 1701671783 && fragmentedMp4Extractor.f8696OooOoo.length != 0) {
                                o000o0015.Oooo00O(8);
                                int iOooO0o6 = (o000o0015.OooO0o() >> 24) & 255;
                                long j14 = -9223372036854775807L;
                                if (iOooO0o6 == 0) {
                                    strOooOOOo = o000o0015.OooOOOo();
                                    strOooOOOo.getClass();
                                    strOooOOOo2 = o000o0015.OooOOOo();
                                    strOooOOOo2.getClass();
                                    long jOooOo0o4 = o000o0015.OooOo0o();
                                    long jOooo5 = o00.Oooo(o000o0015.OooOo0o(), AnimationKt.MillisToNanos, jOooOo0o4);
                                    long j15 = fragmentedMp4Extractor.f8691OooOo0O;
                                    j14 = j15 != -9223372036854775807L ? j15 + jOooo5 : -9223372036854775807L;
                                    jOooo = o00.Oooo(o000o0015.OooOo0o(), 1000L, jOooOo0o4);
                                    jOooOo0o = o000o0015.OooOo0o();
                                    long j16 = j14;
                                    j14 = jOooo5;
                                    jOooo2 = j16;
                                } else if (iOooO0o6 != 1) {
                                    p070o000O0o.Oooo000.OooO00o("Skipping unsupported emsg version: ", iOooO0o6, "FragmentedMp4Extractor");
                                } else {
                                    long jOooOo0o5 = o000o0015.OooOo0o();
                                    jOooo2 = o00.Oooo(o000o0015.OooOoO(), AnimationKt.MillisToNanos, jOooOo0o5);
                                    jOooo = o00.Oooo(o000o0015.OooOo0o(), 1000L, jOooOo0o5);
                                    jOooOo0o = o000o0015.OooOo0o();
                                    strOooOOOo = o000o0015.OooOOOo();
                                    strOooOOOo.getClass();
                                    strOooOOOo2 = o000o0015.OooOOOo();
                                    strOooOOOo2.getClass();
                                }
                                int i35 = o000o0015.f34964OooO0OO - o000o0015.f34963OooO0O0;
                                byte[] bArr6 = new byte[i35];
                                o000o0015.OooO0Oo(0, i35, bArr6);
                                OooOOO0 oooOOO0 = fragmentedMp4Extractor.f8669OooO;
                                ByteArrayOutputStream byteArrayOutputStream = oooOOO0.f35003OooO00o;
                                byteArrayOutputStream.reset();
                                DataOutputStream dataOutputStream = oooOOO0.f35004OooO0O0;
                                try {
                                    dataOutputStream.writeBytes(strOooOOOo);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeBytes(strOooOOOo2);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeLong(jOooo);
                                    dataOutputStream.writeLong(jOooOo0o);
                                    dataOutputStream.write(bArr6);
                                    dataOutputStream.flush();
                                    o000O000 o000o0016 = new o000O000(byteArrayOutputStream.toByteArray());
                                    int i36 = o000o0016.f34964OooO0OO - o000o0016.f34963OooO0O0;
                                    for (TrackOutput trackOutput3 : fragmentedMp4Extractor.f8696OooOoo) {
                                        o000o0016.Oooo00O(0);
                                        trackOutput3.OooO0OO(i36, o000o0016);
                                    }
                                    if (jOooo2 == -9223372036854775807L) {
                                        arrayDeque2.addLast(new OooO00o(j14, true, i36));
                                        fragmentedMp4Extractor.f8687OooOOoo += i36;
                                    } else if (arrayDeque2.isEmpty()) {
                                        for (TrackOutput trackOutput4 : fragmentedMp4Extractor.f8696OooOoo) {
                                            trackOutput4.OooO0o0(jOooo2, 1, i36, 0, null);
                                        }
                                    } else {
                                        arrayDeque2.addLast(new OooO00o(jOooo2, false, i36));
                                        fragmentedMp4Extractor.f8687OooOOoo += i36;
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            oooo001 = oooo000;
                        } else {
                            arrayDeque.peek().f8746OooO0OO.add(oooO0O2);
                        }
                    } else {
                        ((OooOO0O) oooo001).OooOO0(i30);
                    }
                    fragmentedMp4Extractor.OooO0oO(((OooOO0O) oooo000).f34678OooO0Oo);
                }
            } else {
                int i37 = fragmentedMp4Extractor.f8684OooOOOo;
                o000O000 o000o0017 = fragmentedMp4Extractor.f8678OooOO0;
                if (i37 == 0) {
                    z4 = false;
                    if (((OooOO0O) oooo001).OooO0o(o000o0017.f34962OooO00o, 0, 8, true)) {
                        fragmentedMp4Extractor.f8684OooOOOo = 8;
                        o000o0017.Oooo00O(0);
                        fragmentedMp4Extractor.f8683OooOOOO = o000o0017.OooOo0o();
                        fragmentedMp4Extractor.f8681OooOOO = o000o0017.OooO0o();
                        j = fragmentedMp4Extractor.f8683OooOOOO;
                        if (j == 1) {
                            ((OooOO0O) oooo001).OooO0o(o000o0017.f34962OooO00o, 8, 8, false);
                            fragmentedMp4Extractor.f8684OooOOOo += 8;
                            fragmentedMp4Extractor.f8683OooOOOO = o000o0017.OooOoO();
                        } else if (j == 0) {
                            oooOO0O = (OooOO0O) oooo000;
                            j2 = oooOO0O.f34677OooO0OO;
                            if (j2 == -1 && !arrayDeque.isEmpty()) {
                                j2 = arrayDeque.peek().f8745OooO0O0;
                            }
                            if (j2 != -1) {
                                fragmentedMp4Extractor.f8683OooOOOO = (j2 - oooOO0O.f34678OooO0Oo) + ((long) fragmentedMp4Extractor.f8684OooOOOo);
                            }
                        }
                        j3 = fragmentedMp4Extractor.f8683OooOOOO;
                        i = fragmentedMp4Extractor.f8684OooOOOo;
                        if (j3 >= i) {
                            throw ParserException.OooO0O0("Atom size less than header length (unsupported).");
                        }
                        oooOO0O2 = (OooOO0O) oooo000;
                        j4 = oooOO0O2.f34678OooO0Oo - ((long) i);
                        i2 = fragmentedMp4Extractor.f8681OooOOO;
                        if ((i2 != 1836019558 || i2 == 1835295092) && !fragmentedMp4Extractor.f8699OooOooo) {
                            fragmentedMp4Extractor.f8697OooOoo0.OooO(new o000000.OooO0O0(fragmentedMp4Extractor.f8689OooOo0, j4));
                            fragmentedMp4Extractor.f8699OooOooo = true;
                        }
                        if (fragmentedMp4Extractor.f8681OooOOO == 1836019558) {
                            size = sparseArray.size();
                            for (i4 = 0; i4 < size; i4++) {
                                o0O0000O o0o0000o7 = sparseArray.valueAt(i4).f8705OooO0O0;
                                o0o0000o7.getClass();
                                o0o0000o7.f35065OooO0OO = j4;
                                o0o0000o7.f35064OooO0O0 = j4;
                            }
                        }
                        i3 = fragmentedMp4Extractor.f8681OooOOO;
                        if (i3 == 1835295092) {
                            fragmentedMp4Extractor.f8692OooOo0o = null;
                            fragmentedMp4Extractor.f8685OooOOo = j4 + fragmentedMp4Extractor.f8683OooOOOO;
                            fragmentedMp4Extractor.f8682OooOOO0 = 2;
                            z4 = true;
                        } else {
                            if (i3 != 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1836019558 || i3 == 1953653094 || i3 == 1836475768 || i3 == 1701082227) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                j5 = (oooOO0O2.f34678OooO0Oo + fragmentedMp4Extractor.f8683OooOOOO) - 8;
                                arrayDeque.push(new androidx.media3.extractor.mp4.OooO00o.C0156OooO00o(i3, j5));
                                if (fragmentedMp4Extractor.f8683OooOOOO == fragmentedMp4Extractor.f8684OooOOOo) {
                                    fragmentedMp4Extractor.OooO0oO(j5);
                                } else {
                                    fragmentedMp4Extractor.f8682OooOOO0 = 0;
                                    fragmentedMp4Extractor.f8684OooOOOo = 0;
                                }
                                z3 = true;
                            } else {
                                if (i3 != 1751411826 || i3 == 1835296868 || i3 == 1836476516 || i3 == 1936286840 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1668576371 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1937011571 || i3 == 1952867444 || i3 == 1952868452 || i3 == 1953196132 || i3 == 1953654136 || i3 == 1953658222 || i3 == 1886614376 || i3 == 1935763834 || i3 == 1935763823 || i3 == 1936027235 || i3 == 1970628964 || i3 == 1935828848 || i3 == 1936158820 || i3 == 1701606260 || i3 == 1835362404 || i3 == 1701671783) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    if (fragmentedMp4Extractor.f8684OooOOOo == 8) {
                                        throw ParserException.OooO0O0("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (fragmentedMp4Extractor.f8683OooOOOO <= 2147483647L) {
                                        throw ParserException.OooO0O0("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    o000O000 o000o0018 = new o000O000((int) fragmentedMp4Extractor.f8683OooOOOO);
                                    System.arraycopy(o000o0017.f34962OooO00o, 0, o000o0018.f34962OooO00o, 0, 8);
                                    fragmentedMp4Extractor.f8686OooOOo0 = o000o0018;
                                    z3 = true;
                                    fragmentedMp4Extractor.f8682OooOOO0 = 1;
                                } else {
                                    if (fragmentedMp4Extractor.f8683OooOOOO <= 2147483647L) {
                                        throw ParserException.OooO0O0("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    fragmentedMp4Extractor.f8686OooOOo0 = null;
                                    z3 = true;
                                    fragmentedMp4Extractor.f8682OooOOO0 = 1;
                                }
                            }
                            z4 = z3;
                        }
                    }
                } else {
                    j = fragmentedMp4Extractor.f8683OooOOOO;
                    if (j == 1) {
                        ((OooOO0O) oooo001).OooO0o(o000o0017.f34962OooO00o, 8, 8, false);
                        fragmentedMp4Extractor.f8684OooOOOo += 8;
                        fragmentedMp4Extractor.f8683OooOOOO = o000o0017.OooOoO();
                    } else if (j == 0) {
                        oooOO0O = (OooOO0O) oooo000;
                        j2 = oooOO0O.f34677OooO0OO;
                        if (j2 == -1) {
                            j2 = arrayDeque.peek().f8745OooO0O0;
                        }
                        if (j2 != -1) {
                            fragmentedMp4Extractor.f8683OooOOOO = (j2 - oooOO0O.f34678OooO0Oo) + ((long) fragmentedMp4Extractor.f8684OooOOOo);
                        }
                    }
                    j3 = fragmentedMp4Extractor.f8683OooOOOO;
                    i = fragmentedMp4Extractor.f8684OooOOOo;
                    if (j3 >= i) {
                        throw ParserException.OooO0O0("Atom size less than header length (unsupported).");
                    }
                    oooOO0O2 = (OooOO0O) oooo000;
                    j4 = oooOO0O2.f34678OooO0Oo - ((long) i);
                    i2 = fragmentedMp4Extractor.f8681OooOOO;
                    if (i2 != 1836019558) {
                        fragmentedMp4Extractor.f8697OooOoo0.OooO(new o000000.OooO0O0(fragmentedMp4Extractor.f8689OooOo0, j4));
                        fragmentedMp4Extractor.f8699OooOooo = true;
                    } else {
                        fragmentedMp4Extractor.f8697OooOoo0.OooO(new o000000.OooO0O0(fragmentedMp4Extractor.f8689OooOo0, j4));
                        fragmentedMp4Extractor.f8699OooOooo = true;
                    }
                    if (fragmentedMp4Extractor.f8681OooOOO == 1836019558) {
                        size = sparseArray.size();
                        while (i4 < size) {
                            o0O0000O o0o0000o8 = sparseArray.valueAt(i4).f8705OooO0O0;
                            o0o0000o8.getClass();
                            o0o0000o8.f35065OooO0OO = j4;
                            o0o0000o8.f35064OooO0O0 = j4;
                        }
                    }
                    i3 = fragmentedMp4Extractor.f8681OooOOO;
                    if (i3 == 1835295092) {
                        fragmentedMp4Extractor.f8692OooOo0o = null;
                        fragmentedMp4Extractor.f8685OooOOo = j4 + fragmentedMp4Extractor.f8683OooOOOO;
                        fragmentedMp4Extractor.f8682OooOOO0 = 2;
                        z4 = true;
                    } else {
                        if (i3 != 1836019574) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (z) {
                            j5 = (oooOO0O2.f34678OooO0Oo + fragmentedMp4Extractor.f8683OooOOOO) - 8;
                            arrayDeque.push(new androidx.media3.extractor.mp4.OooO00o.C0156OooO00o(i3, j5));
                            if (fragmentedMp4Extractor.f8683OooOOOO == fragmentedMp4Extractor.f8684OooOOOo) {
                                fragmentedMp4Extractor.OooO0oO(j5);
                            } else {
                                fragmentedMp4Extractor.f8682OooOOO0 = 0;
                                fragmentedMp4Extractor.f8684OooOOOo = 0;
                            }
                            z3 = true;
                        } else {
                            if (i3 != 1751411826) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (fragmentedMp4Extractor.f8684OooOOOo == 8) {
                                    throw ParserException.OooO0O0("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (fragmentedMp4Extractor.f8683OooOOOO <= 2147483647L) {
                                    throw ParserException.OooO0O0("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                o000O000 o000o0019 = new o000O000((int) fragmentedMp4Extractor.f8683OooOOOO);
                                System.arraycopy(o000o0017.f34962OooO00o, 0, o000o0019.f34962OooO00o, 0, 8);
                                fragmentedMp4Extractor.f8686OooOOo0 = o000o0019;
                                z3 = true;
                                fragmentedMp4Extractor.f8682OooOOO0 = 1;
                            } else {
                                if (fragmentedMp4Extractor.f8683OooOOOO <= 2147483647L) {
                                    throw ParserException.OooO0O0("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                fragmentedMp4Extractor.f8686OooOOo0 = null;
                                z3 = true;
                                fragmentedMp4Extractor.f8682OooOOO0 = 1;
                            }
                        }
                        z4 = z3;
                    }
                }
                if (!z4) {
                    return -1;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        SparseArray<OooO0O0> sparseArray = this.f8672OooO0OO;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).OooO0Oo();
        }
        this.f8680OooOO0o.clear();
        this.f8687OooOOoo = 0;
        this.f8690OooOo00 = j2;
        this.f8679OooOO0O.clear();
        this.f8682OooOOO0 = 0;
        this.f8684OooOOOo = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        int i;
        this.f8697OooOoo0 = oooo0;
        int i2 = 0;
        this.f8682OooOOO0 = 0;
        this.f8684OooOOOo = 0;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.f8696OooOoo = trackOutputArr;
        int i3 = 100;
        if ((this.f8670OooO00o & 4) != 0) {
            trackOutputArr[0] = oooo0.OooOOOO(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) o00.Oooo0o(i, this.f8696OooOoo);
        this.f8696OooOoo = trackOutputArr2;
        for (TrackOutput trackOutput : trackOutputArr2) {
            trackOutput.OooO0O0(f8668Oooo00O);
        }
        List<OooOO0> list = this.f8671OooO0O0;
        this.f8698OooOooO = new TrackOutput[list.size()];
        while (i2 < this.f8698OooOooO.length) {
            TrackOutput trackOutputOooOOOO = this.f8697OooOoo0.OooOOOO(i3, 3);
            trackOutputOooOOOO.OooO0O0(list.get(i2));
            this.f8698OooOooO[i2] = trackOutputOooOOOO;
            i2++;
            i3++;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        return o0.OooO00o(oooo000, true, false);
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
    public final void OooO0oO(long j) throws ParserException {
        o0oOO o0ooo2;
        o0oOO o0ooo3;
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
        androidx.media3.extractor.mp4.OooO00o.C0156OooO00o c0156OooO00o;
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
        long jOooo;
        OooO0O0 oooO0O1;
        boolean z7;
        final FragmentedMp4Extractor fragmentedMp4Extractor = this;
        FragmentedMp4Extractor fragmentedMp4Extractor2 = fragmentedMp4Extractor;
        while (true) {
            ArrayDeque<androidx.media3.extractor.mp4.OooO00o.C0156OooO00o> arrayDeque = fragmentedMp4Extractor.f8679OooOO0O;
            if (arrayDeque.isEmpty() || arrayDeque.peek().f8745OooO0O0 != j) {
                break;
            }
            androidx.media3.extractor.mp4.OooO00o.C0156OooO00o c0156OooO00oPop = arrayDeque.pop();
            int i7 = c0156OooO00oPop.f8744OooO00o;
            SparseArray<OooO0O0> sparseArray2 = fragmentedMp4Extractor.f8672OooO0OO;
            ArrayList arrayList5 = c0156OooO00oPop.f8746OooO0OO;
            int i8 = 12;
            if (i7 == 1836019574) {
                DrmInitData drmInitDataOooO0Oo = OooO0Oo(arrayList5);
                androidx.media3.extractor.mp4.OooO00o.C0156OooO00o c0156OooO00oOooO0O0 = c0156OooO00oPop.OooO0O0(1836475768);
                c0156OooO00oOooO0O0.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList6 = c0156OooO00oOooO0O0.f8746OooO0OO;
                int size = arrayList6.size();
                long jOooOo0o = -9223372036854775807L;
                int i9 = 0;
                while (i9 < size) {
                    androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O2 = (androidx.media3.extractor.mp4.OooO00o.OooO0O0) arrayList6.get(i9);
                    int i10 = oooO0O2.f8744OooO00o;
                    o000O000 o000o001 = oooO0O2.f8748OooO0O0;
                    if (i10 == 1953654136) {
                        o000o001.Oooo00O(i8);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(o000o001.OooO0o()), new o0oOO(o000o001.OooO0o() - 1, o000o001.OooO0o(), o000o001.OooO0o(), o000o001.OooO0o()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (o0oOO) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i10 == 1835362404) {
                            o000o001.Oooo00O(8);
                            jOooOo0o = ((o000o001.OooO0o() >> 24) & 255) == 0 ? o000o001.OooOo0o() : o000o001.OooOoO();
                        }
                    }
                    i9++;
                    i8 = 12;
                    arrayList6 = arrayList;
                }
                ArrayList arrayListOooO0o = androidx.media3.extractor.mp4.OooO0O0.OooO0o(c0156OooO00oPop, new o00oO0o(), jOooOo0o, drmInitDataOooO0Oo, (fragmentedMp4Extractor.f8670OooO00o & 16) != 0, false, new OooOOO() { // from class: o000o00o.o0O00o0
                    @Override // com.google.common.base.OooOOO
                    public final Object apply(Object obj) {
                        Track track = (Track) obj;
                        this.f35079OooO0Oo.getClass();
                        return track;
                    }
                });
                int size2 = arrayListOooO0o.size();
                if (sparseArray2.size() == 0) {
                    for (int i11 = 0; i11 < size2; i11++) {
                        o0O000 o0o001 = (o0O000) arrayListOooO0o.get(i11);
                        Track track = o0o001.f35049OooO00o;
                        TrackOutput trackOutputOooOOOO = fragmentedMp4Extractor.f8697OooOoo0.OooOOOO(i11, track.f8779OooO0O0);
                        int size3 = sparseArray3.size();
                        int i12 = track.f8778OooO00o;
                        if (size3 == 1) {
                            o0ooo3 = (o0oOO) sparseArray3.valueAt(0);
                        } else {
                            o0ooo3 = (o0oOO) sparseArray3.get(i12);
                            o0ooo3.getClass();
                        }
                        sparseArray2.put(i12, new OooO0O0(trackOutputOooOOOO, o0o001, o0ooo3));
                        fragmentedMp4Extractor.f8689OooOo0 = Math.max(fragmentedMp4Extractor.f8689OooOo0, track.f8783OooO0o0);
                    }
                    fragmentedMp4Extractor.f8697OooOoo0.OooOO0O();
                } else {
                    o00Oo0.OooO0Oo(sparseArray2.size() == size2);
                    for (int i13 = 0; i13 < size2; i13++) {
                        o0O000 o0o002 = (o0O000) arrayListOooO0o.get(i13);
                        Track track2 = o0o002.f35049OooO00o;
                        OooO0O0 oooO0O3 = sparseArray2.get(track2.f8778OooO00o);
                        if (sparseArray3.size() == 1) {
                            o0ooo2 = (o0oOO) sparseArray3.valueAt(0);
                        } else {
                            o0ooo2 = (o0oOO) sparseArray3.get(track2.f8778OooO00o);
                            o0ooo2.getClass();
                        }
                        oooO0O3.f8707OooO0Oo = o0o002;
                        oooO0O3.f8709OooO0o0 = o0ooo2;
                        oooO0O3.f8704OooO00o.OooO0O0(o0o002.f35049OooO00o.f8782OooO0o);
                        oooO0O3.OooO0Oo();
                    }
                }
            } else if (i7 == 1836019558) {
                ArrayList arrayList7 = c0156OooO00oPop.f8747OooO0Oo;
                int size4 = arrayList7.size();
                int i14 = 0;
                FragmentedMp4Extractor fragmentedMp4Extractor3 = fragmentedMp4Extractor2;
                FragmentedMp4Extractor fragmentedMp4Extractor4 = fragmentedMp4Extractor;
                while (i14 < size4) {
                    androidx.media3.extractor.mp4.OooO00o.C0156OooO00o c0156OooO00o2 = (androidx.media3.extractor.mp4.OooO00o.C0156OooO00o) arrayList7.get(i14);
                    if (c0156OooO00o2.f8744OooO00o == 1953653094) {
                        androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO = c0156OooO00o2.OooO0OO(1952868452);
                        oooO0O0OooO0OO.getClass();
                        o000O000 o000o002 = oooO0O0OooO0OO.f8748OooO0O0;
                        o000o002.Oooo00O(8);
                        int iOooO0o5 = o000o002.OooO0o() & 16777215;
                        OooO0O0 oooO0O4 = sparseArray2.get(o000o002.OooO0o());
                        if (oooO0O4 == null) {
                            oooO0O4 = null;
                            fragmentedMp4Extractor = fragmentedMp4Extractor;
                        } else {
                            int i15 = iOooO0o5 & 1;
                            o0O0000O o0o0000o2 = oooO0O4.f8705OooO0O0;
                            if (i15 != 0) {
                                long jOooOoO = o000o002.OooOoO();
                                o0o0000o2.f35064OooO0O0 = jOooOoO;
                                o0o0000o2.f35065OooO0OO = jOooOoO;
                            }
                            o0oOO o0ooo4 = oooO0O4.f8709OooO0o0;
                            o0o0000o2.f35063OooO00o = new o0oOO((iOooO0o5 & 2) != 0 ? o000o002.OooO0o() - 1 : o0ooo4.f35087OooO00o, (iOooO0o5 & 8) != 0 ? o000o002.OooO0o() : o0ooo4.f35088OooO0O0, (iOooO0o5 & 16) != 0 ? o000o002.OooO0o() : o0ooo4.f35089OooO0OO, (iOooO0o5 & 32) != 0 ? o000o002.OooO0o() : o0ooo4.f35090OooO0Oo);
                        }
                        if (oooO0O4 != null) {
                            o0O0000O o0o0000o3 = oooO0O4.f8705OooO0O0;
                            long j5 = o0o0000o3.f35077OooOOOo;
                            boolean z8 = o0o0000o3.f35078OooOOo0;
                            oooO0O4.OooO0Oo();
                            oooO0O4.f8714OooOO0o = true;
                            androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO2 = c0156OooO00o2.OooO0OO(1952867444);
                            int i16 = fragmentedMp4Extractor4.f8670OooO00o;
                            if (oooO0O0OooO0OO2 == null || (i16 & 2) != 0) {
                                o0o0000o3.f35077OooOOOo = j5;
                                o0o0000o3.f35078OooOOo0 = z8;
                            } else {
                                o000O000 o000o003 = oooO0O0OooO0OO2.f8748OooO0O0;
                                o000o003.Oooo00O(8);
                                o0o0000o3.f35077OooOOOo = ((o000o003.OooO0o() >> 24) & 255) == 1 ? o000o003.OooOoO() : o000o003.OooOo0o();
                                o0o0000o3.f35078OooOOo0 = true;
                            }
                            ArrayList arrayList8 = c0156OooO00o2.f8746OooO0OO;
                            int size5 = arrayList8.size();
                            int i17 = 0;
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                i3 = 1953658222;
                                if (i17 >= size5) {
                                    break;
                                }
                                androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O5 = (androidx.media3.extractor.mp4.OooO00o.OooO0O0) arrayList8.get(i17);
                                ArrayList arrayList9 = arrayList7;
                                if (oooO0O5.f8744OooO00o == 1953658222) {
                                    o000O000 o000o004 = oooO0O5.f8748OooO0O0;
                                    o000o004.Oooo00O(12);
                                    int iOooOoO0 = o000o004.OooOoO0();
                                    if (iOooOoO0 > 0) {
                                        i19 += iOooOoO0;
                                        i18++;
                                    }
                                }
                                i17++;
                                arrayList7 = arrayList9;
                            }
                            arrayList2 = arrayList7;
                            oooO0O4.f8711OooO0oo = 0;
                            oooO0O4.f8710OooO0oO = 0;
                            oooO0O4.f8708OooO0o = 0;
                            o0o0000o3.f35066OooO0Oo = i18;
                            o0o0000o3.f35068OooO0o0 = i19;
                            if (o0o0000o3.f35069OooO0oO.length < i18) {
                                o0o0000o3.f35067OooO0o = new long[i18];
                                o0o0000o3.f35069OooO0oO = new int[i18];
                            }
                            if (o0o0000o3.f35070OooO0oo.length < i19) {
                                int i20 = (i19 * 125) / 100;
                                o0o0000o3.f35070OooO0oo = new int[i20];
                                o0o0000o3.f35062OooO = new long[i20];
                                o0o0000o3.f35071OooOO0 = new boolean[i20];
                                o0o0000o3.f35073OooOO0o = new boolean[i20];
                            }
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 0;
                            OooO0O0 oooO0O6 = oooO0O4;
                            while (i21 < size5) {
                                androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O7 = (androidx.media3.extractor.mp4.OooO00o.OooO0O0) arrayList8.get(i21);
                                int i24 = size4;
                                if (oooO0O7.f8744OooO00o == i3) {
                                    int i25 = i23 + 1;
                                    o000O000 o000o005 = oooO0O7.f8748OooO0O0;
                                    o000o005.Oooo00O(8);
                                    int iOooO0o6 = o000o005.OooO0o() & 16777215;
                                    Track track3 = oooO0O6.f8707OooO0Oo.f35049OooO00o;
                                    o0oOO o0ooo5 = o0o0000o3.f35063OooO00o;
                                    int i26 = o00.f34910OooO00o;
                                    o0o0000o3.f35069OooO0oO[i23] = o000o005.OooOoO0();
                                    long[] jArr2 = o0o0000o3.f35067OooO0o;
                                    long j6 = o0o0000o3.f35064OooO0O0;
                                    jArr2[i23] = j6;
                                    if ((iOooO0o6 & 1) != 0) {
                                        jArr2[i23] = j6 + ((long) o000o005.OooO0o());
                                    }
                                    boolean z9 = (iOooO0o6 & 4) != 0;
                                    int iOooO0o7 = o0ooo5.f35090OooO0Oo;
                                    if (z9) {
                                        iOooO0o7 = o000o005.OooO0o();
                                    }
                                    boolean z10 = (iOooO0o6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
                                    boolean z11 = (iOooO0o6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0;
                                    boolean z12 = (iOooO0o6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
                                    boolean z13 = (iOooO0o6 & 2048) != 0;
                                    long[] jArr3 = track3.f8785OooO0oo;
                                    int i27 = iOooO0o7;
                                    long[] jArr4 = track3.f8777OooO;
                                    if (jArr3 != null) {
                                        arrayList4 = arrayList8;
                                        c0156OooO00o = c0156OooO00o2;
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
                                                long jOooo2 = o00.Oooo(j7 + jArr4[0], AnimationKt.MillisToNanos, track3.f8781OooO0Oo);
                                                z2 = z11;
                                                z3 = z12;
                                                if (jOooo2 >= track3.f8783OooO0o0) {
                                                }
                                                if (z5) {
                                                    j2 = jArr4[0];
                                                } else {
                                                    j2 = 0;
                                                }
                                                iArr = o0o0000o3.f35070OooO0oo;
                                                jArr = o0o0000o3.f35062OooO;
                                                zArr = o0o0000o3.f35071OooOO0;
                                                if (track3.f8779OooO0O0 == 2 || (i16 & 1) == 0) {
                                                    z6 = false;
                                                } else {
                                                    z6 = true;
                                                }
                                                i5 = o0o0000o3.f35069OooO0oO[i23] + i22;
                                                j3 = track3.f8780OooO0OO;
                                                j4 = o0o0000o3.f35077OooOOOo;
                                                i6 = i22;
                                                while (i6 < i5) {
                                                    if (z10) {
                                                        iOooO0o = o000o005.OooO0o();
                                                    } else {
                                                        iOooO0o = o0ooo5.f35088OooO0O0;
                                                    }
                                                    if (iOooO0o < 0) {
                                                        throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o, null);
                                                    }
                                                    if (z2) {
                                                        iOooO0o2 = o000o005.OooO0o();
                                                    } else {
                                                        iOooO0o2 = o0ooo5.f35089OooO0OO;
                                                    }
                                                    if (iOooO0o2 < 0) {
                                                        throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o2, null);
                                                    }
                                                    if (z3) {
                                                        iOooO0o3 = o000o005.OooO0o();
                                                    } else if (i6 == 0 || !z4) {
                                                        iOooO0o3 = o0ooo5.f35090OooO0Oo;
                                                    } else {
                                                        iOooO0o3 = i27;
                                                    }
                                                    if (z13) {
                                                        iOooO0o4 = o000o005.OooO0o();
                                                    } else {
                                                        iOooO0o4 = 0;
                                                    }
                                                    o0oOO o0ooo6 = o0ooo5;
                                                    boolean z14 = z4;
                                                    int i28 = iOooO0o4;
                                                    int i29 = iOooO0o;
                                                    jOooo = o00.Oooo((((long) i28) + j4) - j2, AnimationKt.MillisToNanos, j3);
                                                    jArr[i6] = jOooo;
                                                    if (o0o0000o3.f35078OooOOo0) {
                                                        oooO0O1 = oooO0O4;
                                                    } else {
                                                        oooO0O1 = oooO0O4;
                                                        jArr[i6] = jOooo + oooO0O1.f8707OooO0Oo.f35056OooO0oo;
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
                                                    o0ooo5 = o0ooo6;
                                                    z4 = z14;
                                                }
                                                oooO0O0 = oooO0O4;
                                                o0o0000o3.f35077OooOOOo = j4;
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
                                            iArr = o0o0000o3.f35070OooO0oo;
                                            jArr = o0o0000o3.f35062OooO;
                                            zArr = o0o0000o3.f35071OooOO0;
                                            if (track3.f8779OooO0O0 == 2) {
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                            }
                                            i5 = o0o0000o3.f35069OooO0oO[i23] + i22;
                                            j3 = track3.f8780OooO0OO;
                                            j4 = o0o0000o3.f35077OooOOOo;
                                            i6 = i22;
                                            while (i6 < i5) {
                                                if (z10) {
                                                    iOooO0o = o000o005.OooO0o();
                                                } else {
                                                    iOooO0o = o0ooo5.f35088OooO0O0;
                                                }
                                                if (iOooO0o < 0) {
                                                    throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o, null);
                                                }
                                                if (z2) {
                                                    iOooO0o2 = o000o005.OooO0o();
                                                } else {
                                                    iOooO0o2 = o0ooo5.f35089OooO0OO;
                                                }
                                                if (iOooO0o2 < 0) {
                                                    throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o2, null);
                                                }
                                                if (z3) {
                                                    iOooO0o3 = o000o005.OooO0o();
                                                } else if (i6 == 0) {
                                                    iOooO0o3 = o0ooo5.f35090OooO0Oo;
                                                } else {
                                                    iOooO0o3 = o0ooo5.f35090OooO0Oo;
                                                }
                                                if (z13) {
                                                    iOooO0o4 = o000o005.OooO0o();
                                                } else {
                                                    iOooO0o4 = 0;
                                                }
                                                o0oOO o0ooo7 = o0ooo5;
                                                boolean z15 = z4;
                                                int i210 = iOooO0o4;
                                                int i211 = iOooO0o;
                                                jOooo = o00.Oooo((((long) i210) + j4) - j2, AnimationKt.MillisToNanos, j3);
                                                jArr[i6] = jOooo;
                                                if (o0o0000o3.f35078OooOOo0) {
                                                    oooO0O1 = oooO0O4;
                                                    jArr[i6] = jOooo + oooO0O1.f8707OooO0Oo.f35056OooO0oo;
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
                                                o0ooo5 = o0ooo7;
                                                z4 = z15;
                                            }
                                            oooO0O0 = oooO0O4;
                                            o0o0000o3.f35077OooOOOo = j4;
                                            oooO0O6 = oooO0O0;
                                            i23 = i25;
                                            i22 = i5;
                                        }
                                    } else {
                                        arrayList4 = arrayList8;
                                        c0156OooO00o = c0156OooO00o2;
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
                                    iArr = o0o0000o3.f35070OooO0oo;
                                    jArr = o0o0000o3.f35062OooO;
                                    zArr = o0o0000o3.f35071OooOO0;
                                    if (track3.f8779OooO0O0 == 2) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    i5 = o0o0000o3.f35069OooO0oO[i23] + i22;
                                    j3 = track3.f8780OooO0OO;
                                    j4 = o0o0000o3.f35077OooOOOo;
                                    i6 = i22;
                                    while (i6 < i5) {
                                        if (z10) {
                                            iOooO0o = o000o005.OooO0o();
                                        } else {
                                            iOooO0o = o0ooo5.f35088OooO0O0;
                                        }
                                        if (iOooO0o < 0) {
                                            throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o, null);
                                        }
                                        if (z2) {
                                            iOooO0o2 = o000o005.OooO0o();
                                        } else {
                                            iOooO0o2 = o0ooo5.f35089OooO0OO;
                                        }
                                        if (iOooO0o2 < 0) {
                                            throw ParserException.OooO00o("Unexpected negative value: " + iOooO0o2, null);
                                        }
                                        if (z3) {
                                            iOooO0o3 = o000o005.OooO0o();
                                        } else if (i6 == 0) {
                                            iOooO0o3 = o0ooo5.f35090OooO0Oo;
                                        } else {
                                            iOooO0o3 = o0ooo5.f35090OooO0Oo;
                                        }
                                        if (z13) {
                                            iOooO0o4 = o000o005.OooO0o();
                                        } else {
                                            iOooO0o4 = 0;
                                        }
                                        o0oOO o0ooo8 = o0ooo5;
                                        boolean z16 = z4;
                                        int i212 = iOooO0o4;
                                        int i213 = iOooO0o;
                                        jOooo = o00.Oooo((((long) i212) + j4) - j2, AnimationKt.MillisToNanos, j3);
                                        jArr[i6] = jOooo;
                                        if (o0o0000o3.f35078OooOOo0) {
                                            oooO0O1 = oooO0O4;
                                            jArr[i6] = jOooo + oooO0O1.f8707OooO0Oo.f35056OooO0oo;
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
                                        o0ooo5 = o0ooo8;
                                        z4 = z16;
                                    }
                                    oooO0O0 = oooO0O4;
                                    o0o0000o3.f35077OooOOOo = j4;
                                    oooO0O6 = oooO0O0;
                                    i23 = i25;
                                    i22 = i5;
                                } else {
                                    arrayList4 = arrayList8;
                                    c0156OooO00o = c0156OooO00o2;
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
                                c0156OooO00o2 = c0156OooO00o;
                                i16 = i16;
                            }
                            i = size4;
                            ArrayList arrayList10 = arrayList8;
                            arrayList3 = arrayList5;
                            i2 = i14;
                            androidx.media3.extractor.mp4.OooO00o.C0156OooO00o c0156OooO00o3 = c0156OooO00o2;
                            sparseArray = sparseArray2;
                            Track track4 = oooO0O4.f8707OooO0Oo.f35049OooO00o;
                            o0oOO o0ooo9 = o0o0000o3.f35063OooO00o;
                            o0ooo9.getClass();
                            o0O00000[] o0o00000Arr = track4.f8787OooOO0O;
                            o0O00000 o0o00000 = o0o00000Arr == null ? null : o0o00000Arr[o0ooo9.f35087OooO00o];
                            androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO3 = c0156OooO00o3.OooO0OO(1935763834);
                            if (oooO0O0OooO0OO3 != null) {
                                o0o00000.getClass();
                                o000O000 o000o006 = oooO0O0OooO0OO3.f8748OooO0O0;
                                o000o006.Oooo00O(8);
                                if ((o000o006.OooO0o() & 16777215 & 1) == 1) {
                                    o000o006.Oooo00o(8);
                                }
                                int iOooOo0O = o000o006.OooOo0O();
                                int iOooOoO1 = o000o006.OooOoO0();
                                if (iOooOoO1 > o0o0000o3.f35068OooO0o0) {
                                    StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Saiz sample count ", iOooOoO1, " is greater than fragment sample count");
                                    sbOooO0O0.append(o0o0000o3.f35068OooO0o0);
                                    throw ParserException.OooO00o(sbOooO0O0.toString(), null);
                                }
                                int i30 = o0o00000.f35060OooO0Oo;
                                if (iOooOo0O == 0) {
                                    boolean[] zArr2 = o0o0000o3.f35073OooOO0o;
                                    i4 = 0;
                                    for (int i31 = 0; i31 < iOooOoO1; i31++) {
                                        int iOooOo0O2 = o000o006.OooOo0O();
                                        i4 += iOooOo0O2;
                                        zArr2[i31] = iOooOo0O2 > i30;
                                    }
                                    z = false;
                                } else {
                                    i4 = (iOooOo0O * iOooOoO1) + 0;
                                    Arrays.fill(o0o0000o3.f35073OooOO0o, 0, iOooOoO1, iOooOo0O > i30);
                                    z = false;
                                }
                                Arrays.fill(o0o0000o3.f35073OooOO0o, iOooOoO1, o0o0000o3.f35068OooO0o0, z);
                                if (i4 > 0) {
                                    o0o0000o3.f35074OooOOO.OooOooO(i4);
                                    o0o0000o3.f35072OooOO0O = true;
                                    o0o0000o3.f35076OooOOOO = true;
                                }
                            }
                            androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO4 = c0156OooO00o3.OooO0OO(1935763823);
                            if (oooO0O0OooO0OO4 != null) {
                                o000O000 o000o007 = oooO0O0OooO0OO4.f8748OooO0O0;
                                o000o007.Oooo00O(8);
                                int iOooO0o8 = o000o007.OooO0o();
                                if ((16777215 & iOooO0o8 & 1) == 1) {
                                    o000o007.Oooo00o(8);
                                }
                                int iOooOoO2 = o000o007.OooOoO0();
                                if (iOooOoO2 != 1) {
                                    throw ParserException.OooO00o("Unexpected saio entry count: " + iOooOoO2, null);
                                }
                                o0o0000o3.f35065OooO0OO += ((iOooO0o8 >> 24) & 255) == 0 ? o000o007.OooOo0o() : o000o007.OooOoO();
                            }
                            androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO5 = c0156OooO00o3.OooO0OO(1936027235);
                            if (oooO0O0OooO0OO5 != null) {
                                OooO0o0(oooO0O0OooO0OO5.f8748OooO0O0, 0, o0o0000o3);
                            }
                            String str = o0o00000 != null ? o0o00000.f35058OooO0O0 : null;
                            int i32 = 0;
                            o000O000 o000o008 = null;
                            o000O000 o000o009 = null;
                            while (i32 < arrayList10.size()) {
                                ArrayList arrayList11 = arrayList10;
                                androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O8 = (androidx.media3.extractor.mp4.OooO00o.OooO0O0) arrayList11.get(i32);
                                o000O000 o000o0010 = oooO0O8.f8748OooO0O0;
                                int i33 = oooO0O8.f8744OooO00o;
                                if (i33 == 1935828848) {
                                    o000o0010.Oooo00O(12);
                                    if (o000o0010.OooO0o() == 1936025959) {
                                        o000o008 = o000o0010;
                                    }
                                } else if (i33 == 1936158820) {
                                    o000o0010.Oooo00O(12);
                                    if (o000o0010.OooO0o() == 1936025959) {
                                        o000o009 = o000o0010;
                                    }
                                }
                                i32++;
                                arrayList10 = arrayList11;
                            }
                            ArrayList arrayList12 = arrayList10;
                            if (o000o008 != null && o000o009 != null) {
                                o000o008.Oooo00O(8);
                                int iOooO0o9 = (o000o008.OooO0o() >> 24) & 255;
                                o000o008.Oooo00o(4);
                                if (iOooO0o9 == 1) {
                                    o000o008.Oooo00o(4);
                                }
                                if (o000o008.OooO0o() != 1) {
                                    throw ParserException.OooO0O0("Entry count in sbgp != 1 (unsupported).");
                                }
                                o000o009.Oooo00O(8);
                                int iOooO0o10 = (o000o009.OooO0o() >> 24) & 255;
                                o000o009.Oooo00o(4);
                                if (iOooO0o10 == 1) {
                                    if (o000o009.OooOo0o() == 0) {
                                        throw ParserException.OooO0O0("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iOooO0o10 >= 2) {
                                    o000o009.Oooo00o(4);
                                }
                                if (o000o009.OooOo0o() != 1) {
                                    throw ParserException.OooO0O0("Entry count in sgpd != 1 (unsupported).");
                                }
                                o000o009.Oooo00o(1);
                                int iOooOo0O3 = o000o009.OooOo0O();
                                int i34 = (iOooOo0O3 & 240) >> 4;
                                int i35 = iOooOo0O3 & 15;
                                boolean z17 = o000o009.OooOo0O() == 1;
                                if (z17) {
                                    int iOooOo0O4 = o000o009.OooOo0O();
                                    byte[] bArr2 = new byte[16];
                                    o000o009.OooO0Oo(0, 16, bArr2);
                                    if (iOooOo0O4 == 0) {
                                        int iOooOo0O5 = o000o009.OooOo0O();
                                        byte[] bArr3 = new byte[iOooOo0O5];
                                        o000o009.OooO0Oo(0, iOooOo0O5, bArr3);
                                        bArr = bArr3;
                                    } else {
                                        bArr = null;
                                    }
                                    o0o0000o3.f35072OooOO0O = true;
                                    o0o0000o3.f35075OooOOO0 = new o0O00000(z17, str, iOooOo0O4, bArr2, i34, i35, bArr);
                                }
                            }
                            int size6 = arrayList12.size();
                            for (int i36 = 0; i36 < size6; i36++) {
                                androidx.media3.extractor.mp4.OooO00o.OooO0O0 oooO0O9 = (androidx.media3.extractor.mp4.OooO00o.OooO0O0) arrayList12.get(i36);
                                if (oooO0O9.f8744OooO00o == 1970628964) {
                                    o000O000 o000o0011 = oooO0O9.f8748OooO0O0;
                                    o000o0011.Oooo00O(8);
                                    byte[] bArr4 = this.f8676OooO0oO;
                                    o000o0011.OooO0Oo(0, 16, bArr4);
                                    if (Arrays.equals(bArr4, f8667Oooo000)) {
                                        OooO0o0(o000o0011, 16, o0o0000o3);
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
                DrmInitData drmInitDataOooO0Oo2 = OooO0Oo(arrayList5);
                if (drmInitDataOooO0Oo2 != null) {
                    int size7 = sparseArray4.size();
                    int i37 = 0;
                    while (i37 < size7) {
                        SparseArray<OooO0O0> sparseArray5 = sparseArray4;
                        OooO0O0 oooO0O0ValueAt = sparseArray5.valueAt(i37);
                        Track track5 = oooO0O0ValueAt.f8707OooO0Oo.f35049OooO00o;
                        o0oOO o0ooo10 = oooO0O0ValueAt.f8705OooO0O0.f35063OooO00o;
                        int i38 = o00.f34910OooO00o;
                        int i39 = o0ooo10.f35087OooO00o;
                        o0O00000[] o0o00000Arr2 = track5.f8787OooOO0O;
                        o0O00000 o0o00001 = o0o00000Arr2 == null ? null : o0o00000Arr2[i39];
                        DrmInitData drmInitDataOooO00o = drmInitDataOooO0Oo2.OooO00o(o0o00001 != null ? o0o00001.f35058OooO0O0 : null);
                        OooOO0 oooOO1 = oooO0O0ValueAt.f8707OooO0Oo.f35049OooO00o.f8782OooO0o;
                        oooOO1.getClass();
                        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(oooOO1);
                        oooO00o.f6447OooOOO = drmInitDataOooO00o;
                        oooO0O0ValueAt.f8704OooO00o.OooO0O0(new OooOO0(oooO00o));
                        i37++;
                        sparseArray4 = sparseArray5;
                    }
                }
                SparseArray<OooO0O0> sparseArray6 = sparseArray4;
                if (fragmentedMp4Extractor4.f8690OooOo00 != -9223372036854775807L) {
                    int size8 = sparseArray6.size();
                    for (int i40 = 0; i40 < size8; i40++) {
                        OooO0O0 oooO0O0ValueAt2 = sparseArray6.valueAt(i40);
                        long j8 = fragmentedMp4Extractor4.f8690OooOo00;
                        int i41 = oooO0O0ValueAt2.f8708OooO0o;
                        while (true) {
                            o0O0000O o0o0000o4 = oooO0O0ValueAt2.f8705OooO0O0;
                            if (i41 >= o0o0000o4.f35068OooO0o0 || o0o0000o4.f35062OooO[i41] > j8) {
                                break;
                            }
                            if (o0o0000o4.f35071OooOO0[i41]) {
                                oooO0O0ValueAt2.f8703OooO = i41;
                            }
                            i41++;
                        }
                    }
                    fragmentedMp4Extractor4.f8690OooOo00 = -9223372036854775807L;
                }
                fragmentedMp4Extractor2 = fragmentedMp4Extractor3;
                fragmentedMp4Extractor = fragmentedMp4Extractor5;
            } else if (!arrayDeque.isEmpty()) {
                arrayDeque.peek().f8747OooO0Oo.add(c0156OooO00oPop);
            }
        }
        fragmentedMp4Extractor2.f8682OooOOO0 = 0;
        fragmentedMp4Extractor2.f8684OooOOOo = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
