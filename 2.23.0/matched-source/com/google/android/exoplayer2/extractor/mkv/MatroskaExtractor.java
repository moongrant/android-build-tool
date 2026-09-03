package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.OooO0OO;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import net.sqlcipher.database.SQLiteDatabase;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jctools.util.Pow2;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oOO00O;
import p212o00oO000.OooOO0;
import p212o00oO000.OooOO0O;
import p212o00oO000.OooOOO;
import p212o00oO000.OooOOO0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO000;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.oo0O;
import p247o00oo0oO.o00O;
import p247o00oo0oO.o00O0OO;
import p247o00oo0oO.o00O0OOO;
import p247o00oo0oO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class MatroskaExtractor implements Extractor {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final Map<String, Integer> f11845Oooooo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00Oo00 f11847OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f11848OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f11849OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseArray<OooO0O0> f11850OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f11851OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00Oo00 f11852OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo00 f11853OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00Oo00 f11854OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00Oo00 f11855OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00Oo00 f11856OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00Oo00 f11857OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00Oo00 f11858OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00Oo00 f11859OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00Oo00 f11860OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ByteBuffer f11861OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f11862OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f11863OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f11864OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f11865OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f11866OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f11867OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f11868OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f11869OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f11870OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f11871OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f11872OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f11873OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public o00OO000 f11874OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f11875OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public o00OO000 f11876OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f11877OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f11878Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f11879Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f11880Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f11881Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f11882Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f11883Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f11884Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f11885Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int[] f11886Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f11887Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f11888Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f11889OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f11890OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f11891OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f11892OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f11893OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f11894OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f11895OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f11896OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public byte f11897OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f11898OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public o00O0O0 f11899Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f11900o000oOoO;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final byte[] f11841Ooooo0o = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final byte[] f11842OooooO0 = o0O00.OooOoo0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final byte[] f11843OooooOO = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final byte[] f11844OooooOo = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final UUID f11846Oooooo0 = new UUID(72057594037932032L, -9223371306706625679L);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class OooO00o implements EbmlProcessor {
        public OooO00o() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:217:0x037f A[PHI: r6 r25 r26
          0x037f: PHI (r6v48 java.lang.Object) = 
          (r6v5 java.lang.Object)
          (r6v6 java.lang.Object)
          (r6v8 java.lang.Object)
          (r6v10 java.lang.Object)
          (r6v12 java.lang.Object)
          (r6v14 java.lang.Object)
          (r6v18 java.lang.Object)
          (r6v49 java.lang.Object)
         binds: [B:214:0x037a, B:210:0x036f, B:206:0x0364, B:202:0x0357, B:198:0x034a, B:194:0x033d, B:180:0x0309, B:82:0x01ce] A[DONT_GENERATE, DONT_INLINE]
          0x037f: PHI (r25v6 java.lang.Object) = 
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v7 java.lang.Object)
         binds: [B:214:0x037a, B:210:0x036f, B:206:0x0364, B:202:0x0357, B:198:0x034a, B:194:0x033d, B:180:0x0309, B:82:0x01ce] A[DONT_GENERATE, DONT_INLINE]
          0x037f: PHI (r26v4 java.lang.Object) = 
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v5 java.lang.Object)
         binds: [B:214:0x037a, B:210:0x036f, B:206:0x0364, B:202:0x0357, B:198:0x034a, B:194:0x033d, B:180:0x0309, B:82:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:357:0x0543  */
        /* JADX WARN: Code duplicated, block: B:491:0x088f  */
        /* JADX WARN: Code duplicated, block: B:493:0x0897  */
        /* JADX WARN: Code duplicated, block: B:496:0x08b6  */
        /* JADX WARN: Code duplicated, block: B:511:0x08e5  */
        /* JADX WARN: Code duplicated, block: B:516:0x08fe  */
        /* JADX WARN: Code duplicated, block: B:517:0x0900  */
        /* JADX WARN: Code duplicated, block: B:520:0x090d  */
        /* JADX WARN: Code duplicated, block: B:521:0x0919  */
        /* JADX WARN: Code duplicated, block: B:523:0x091f  */
        /* JADX WARN: Code duplicated, block: B:525:0x0923  */
        /* JADX WARN: Code duplicated, block: B:527:0x0928  */
        /* JADX WARN: Code duplicated, block: B:530:0x0930  */
        /* JADX WARN: Code duplicated, block: B:532:0x0935  */
        /* JADX WARN: Code duplicated, block: B:535:0x093a  */
        /* JADX WARN: Code duplicated, block: B:538:0x0948  */
        /* JADX WARN: Code duplicated, block: B:541:0x094e  */
        /* JADX WARN: Code duplicated, block: B:543:0x0956  */
        /* JADX WARN: Code duplicated, block: B:563:0x0a0a  */
        /* JADX WARN: Code duplicated, block: B:565:0x0a17  */
        /* JADX WARN: Code duplicated, block: B:568:0x0a1c  */
        /* JADX WARN: Code duplicated, block: B:570:0x0a24  */
        /* JADX WARN: Code duplicated, block: B:571:0x0a31  */
        /* JADX WARN: Code duplicated, block: B:574:0x0a36  */
        /* JADX WARN: Code duplicated, block: B:593:0x0a83  */
        /* JADX WARN: Code duplicated, block: B:595:0x0a9c  */
        /* JADX WARN: Code duplicated, block: B:597:0x0aa4  */
        /* JADX WARN: Code duplicated, block: B:613:0x0ada  */
        /* JADX WARN: Code duplicated, block: B:82:0x01ce A[PHI: r25 r26
          0x01ce: PHI (r25v7 java.lang.Object) = 
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v2 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
          (r25v0 java.lang.Object)
         binds: [B:81:0x01cb, B:190:0x032b, B:185:0x0319, B:176:0x02fa, B:172:0x02ef, B:168:0x02e4, B:164:0x02d9, B:160:0x02ce, B:156:0x02c3, B:152:0x02b5, B:148:0x02a9, B:144:0x029d, B:140:0x0291, B:136:0x0285, B:132:0x0279, B:128:0x026d, B:124:0x025f, B:120:0x0251, B:116:0x0242, B:112:0x0233, B:108:0x0226, B:104:0x0219, B:100:0x020c, B:96:0x01ff, B:92:0x01f2, B:88:0x01e5, B:84:0x01d6] A[DONT_GENERATE, DONT_INLINE]
          0x01ce: PHI (r26v5 java.lang.Object) = 
          (r26v0 java.lang.Object)
          (r26v1 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
          (r26v0 java.lang.Object)
         binds: [B:81:0x01cb, B:190:0x032b, B:185:0x0319, B:176:0x02fa, B:172:0x02ef, B:168:0x02e4, B:164:0x02d9, B:160:0x02ce, B:156:0x02c3, B:152:0x02b5, B:148:0x02a9, B:144:0x029d, B:140:0x0291, B:136:0x0285, B:132:0x0279, B:128:0x026d, B:124:0x025f, B:120:0x0251, B:116:0x0242, B:112:0x0233, B:108:0x0226, B:104:0x0219, B:100:0x020c, B:96:0x01ff, B:92:0x01f2, B:88:0x01e5, B:84:0x01d6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Instruction removed from duplicated block: B:493:0x0897, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v113 */
        /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v48 */
        /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r2v50, types: [int] */
        /* JADX WARN: Type inference failed for: r2v51 */
        /* JADX WARN: Type inference failed for: r2v66 */
        /* JADX WARN: Type inference failed for: r2v68 */
        /* JADX WARN: Type inference failed for: r2v69 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r6v41 */
        public final void OooO00o(int i) throws ParserException {
            Object obj;
            byte b;
            Object obj2;
            boolean z;
            OooO0O0 oooO0O0;
            MatroskaExtractor matroskaExtractor;
            byte b2;
            int i2;
            int i3;
            List<byte[]> listSingletonList;
            boolean z2;
            int iOooOo00;
            ArrayList arrayList;
            String str;
            int i4;
            String str2;
            int i5;
            List<byte[]> list;
            ?? r2;
            Pair pair;
            List<byte[]> list2;
            List<byte[]> listOooOOOo;
            String str3;
            List<byte[]> list3;
            String str4;
            String str5;
            String str6;
            String str7;
            List<byte[]> list4;
            int i6;
            String str8;
            int i7;
            OooOo.OooO00o oooO00o;
            int i8;
            int i9;
            float f;
            o00O0OO o00o0oo2;
            String str9;
            int iIntValue;
            int i10;
            Map<String, Integer> map;
            byte[] bArr;
            int i11;
            int i12;
            int i13;
            String str10;
            o00O0OOO o00o0oooOooO00o;
            o00OO0OO oooO0O1;
            int i14;
            int i15;
            MatroskaExtractor matroskaExtractor2 = MatroskaExtractor.this;
            o00O000o.OooO0o0(matroskaExtractor2.f11899Ooooo00);
            SparseArray<OooO0O0> sparseArray = matroskaExtractor2.f11850OooO0OO;
            if (i == 160) {
                if (matroskaExtractor2.f11881Oooo00O != 2) {
                    return;
                }
                OooO0O0 oooO0O2 = sparseArray.get(matroskaExtractor2.f11885Oooo0o);
                oooO0O2.f11950OoooOOo.getClass();
                if (matroskaExtractor2.f11890OoooO0 > 0 && "A_OPUS".equals(oooO0O2.f11904OooO0O0)) {
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(matroskaExtractor2.f11890OoooO0).array();
                    o00Oo00 o00oo00 = matroskaExtractor2.f11859OooOOO;
                    o00oo00.getClass();
                    o00oo00.OooOooo(bArrArray.length, bArrArray);
                }
                int i16 = 0;
                for (int i17 = 0; i17 < matroskaExtractor2.f11884Oooo0OO; i17++) {
                    i16 += matroskaExtractor2.f11886Oooo0o0[i17];
                }
                int i18 = 0;
                while (i18 < matroskaExtractor2.f11884Oooo0OO) {
                    long j = matroskaExtractor2.f11882Oooo00o + ((long) ((oooO0O2.f11908OooO0o0 * i18) / 1000));
                    int i19 = matroskaExtractor2.f11888Oooo0oo;
                    if (i18 == 0 && !matroskaExtractor2.f11891OoooO00) {
                        i19 |= 1;
                    }
                    int i20 = matroskaExtractor2.f11886Oooo0o0[i18];
                    int i21 = i16 - i20;
                    matroskaExtractor2.OooO0o0(oooO0O2, j, i19, i20, i21);
                    i18++;
                    i16 = i21;
                }
                matroskaExtractor2.f11881Oooo00O = 0;
                return;
            }
            if (i != 174) {
                if (i == 19899) {
                    int i22 = matroskaExtractor2.f11870OooOo0o;
                    if (i22 != -1) {
                        long j2 = matroskaExtractor2.f11866OooOo;
                        if (j2 != -1) {
                            if (i22 == 475249515) {
                                matroskaExtractor2.f11871OooOoO = j2;
                                return;
                            }
                            return;
                        }
                    }
                    throw ParserException.OooO00o("Mandatory element SeekID or SeekPosition not found", null);
                }
                if (i == 25152) {
                    matroskaExtractor2.OooO0OO(i);
                    OooO0O0 oooO0O3 = matroskaExtractor2.f11867OooOo0;
                    if (oooO0O3.f11910OooO0oo) {
                        TrackOutput.OooO00o oooO00o2 = oooO0O3.f11911OooOO0;
                        if (oooO00o2 == null) {
                            throw ParserException.OooO00o("Encrypted Track found but ContentEncKeyID was not found", null);
                        }
                        oooO0O3.f11913OooOO0o = new DrmInitData(null, true, new DrmInitData.SchemeData(C.f10896OooO00o, null, "video/webm", oooO00o2.f11793OooO0O0));
                        return;
                    }
                    return;
                }
                if (i == 28032) {
                    matroskaExtractor2.OooO0OO(i);
                    OooO0O0 oooO0O4 = matroskaExtractor2.f11867OooOo0;
                    if (oooO0O4.f11910OooO0oo && oooO0O4.f11902OooO != null) {
                        throw ParserException.OooO00o("Combining encryption and compression is not supported", null);
                    }
                    return;
                }
                if (i == 357149030) {
                    if (matroskaExtractor2.f11863OooOOo == -9223372036854775807L) {
                        matroskaExtractor2.f11863OooOOo = AnimationKt.MillisToNanos;
                    }
                    long j3 = matroskaExtractor2.f11865OooOOoo;
                    if (j3 != -9223372036854775807L) {
                        matroskaExtractor2.f11868OooOo00 = matroskaExtractor2.OooOO0O(j3);
                        return;
                    }
                    return;
                }
                if (i == 374648427) {
                    if (sparseArray.size() == 0) {
                        throw ParserException.OooO00o("No valid tracks were found", null);
                    }
                    matroskaExtractor2.f11899Ooooo00.OooO00o();
                    return;
                }
                if (i != 475249515) {
                    return;
                }
                if (!matroskaExtractor2.f11869OooOo0O) {
                    o00O0O0 o00o0o0 = matroskaExtractor2.f11899Ooooo00;
                    o00OO000 o00oo001 = matroskaExtractor2.f11874OooOoo;
                    o00OO000 o00oo002 = matroskaExtractor2.f11876OooOooO;
                    if (matroskaExtractor2.f11864OooOOo0 == -1 || matroskaExtractor2.f11868OooOo00 == -9223372036854775807L || o00oo001 == null || (i14 = o00oo001.f40572OooO00o) == 0 || o00oo002 == null || o00oo002.f40572OooO00o != i14) {
                        oooO0O1 = new o00OO0OO.OooO0O0(matroskaExtractor2.f11868OooOo00);
                    } else {
                        int[] iArrCopyOf = new int[i14];
                        long[] jArrCopyOf = new long[i14];
                        long[] jArrCopyOf2 = new long[i14];
                        long[] jArrCopyOf3 = new long[i14];
                        for (int i23 = 0; i23 < i14; i23++) {
                            jArrCopyOf3[i23] = o00oo001.OooO0O0(i23);
                            jArrCopyOf[i23] = o00oo002.OooO0O0(i23) + matroskaExtractor2.f11864OooOOo0;
                        }
                        int i24 = 0;
                        while (true) {
                            i15 = i14 - 1;
                            if (i24 >= i15) {
                                break;
                            }
                            int i25 = i24 + 1;
                            iArrCopyOf[i24] = (int) (jArrCopyOf[i25] - jArrCopyOf[i24]);
                            jArrCopyOf2[i24] = jArrCopyOf3[i25] - jArrCopyOf3[i24];
                            i24 = i25;
                        }
                        iArrCopyOf[i15] = (int) ((matroskaExtractor2.f11864OooOOo0 + matroskaExtractor2.f11862OooOOOo) - jArrCopyOf[i15]);
                        long j4 = matroskaExtractor2.f11868OooOo00 - jArrCopyOf3[i15];
                        jArrCopyOf2[i15] = j4;
                        if (j4 <= 0) {
                            Log.OooO0o("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
                        }
                        oooO0O1 = new oOO00O(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                    }
                    o00o0o0.OooO0O0(oooO0O1);
                    matroskaExtractor2.f11869OooOo0O = true;
                }
                matroskaExtractor2.f11874OooOoo = null;
                matroskaExtractor2.f11876OooOooO = null;
                return;
            }
            OooO0O0 oooO0O5 = matroskaExtractor2.f11867OooOo0;
            o00O000o.OooO0o0(oooO0O5);
            String str11 = oooO0O5.f11904OooO0O0;
            if (str11 == null) {
                throw ParserException.OooO00o("CodecId is missing in TrackEntry element", null);
            }
            Object obj3 = "V_MS/VFW/FOURCC";
            Object obj4 = "A_MPEG/L3";
            switch (str11.hashCode()) {
                case -2095576542:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("V_MPEG4/ISO/AP")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -2095575984:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals(obj)) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                case -1985379776:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("A_MS/ACM")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1784763192:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("A_TRUEHD")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case -1730367663:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("A_VORBIS")) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case -1482641358:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("A_MPEG/L2")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    break;
                case -1482641357:
                    obj2 = obj4;
                    if (str11.equals(obj2)) {
                        b = 6;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    } else {
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                        b = -1;
                    }
                    break;
                case -1373388978:
                    if (str11.equals(obj3)) {
                        b = 7;
                        obj3 = obj3;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    } else {
                        obj3 = obj3;
                        obj = "V_MPEG4/ISO/SP";
                        b = -1;
                    }
                    break;
                case -933872740:
                    obj = "V_MPEG4/ISO/SP";
                    if (str11.equals("S_DVBSUB")) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                case -538363189:
                    if (str11.equals("V_MPEG4/ISO/ASP")) {
                        b = 9;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case -538363109:
                    if (str11.equals("V_MPEG4/ISO/AVC")) {
                        b = 10;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case -425012669:
                    if (str11.equals("S_VOBSUB")) {
                        b = 11;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case -356037306:
                    if (str11.equals("A_DTS/LOSSLESS")) {
                        b = 12;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 62923557:
                    if (str11.equals("A_AAC")) {
                        b = 13;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 62923603:
                    if (str11.equals("A_AC3")) {
                        b = 14;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 62927045:
                    if (str11.equals("A_DTS")) {
                        obj = "V_MPEG4/ISO/SP";
                        b = 15;
                    } else {
                        obj = "V_MPEG4/ISO/SP";
                        b = -1;
                    }
                    break;
                case 82318131:
                    if (str11.equals("V_AV1")) {
                        b = 16;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 82338133:
                    if (str11.equals("V_VP8")) {
                        b = 17;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 82338134:
                    if (str11.equals("V_VP9")) {
                        b = 18;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 99146302:
                    if (str11.equals("S_HDMV/PGS")) {
                        b = 19;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 444813526:
                    if (str11.equals("V_THEORA")) {
                        b = 20;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 542569478:
                    if (str11.equals("A_DTS/EXPRESS")) {
                        b = 21;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 635596514:
                    if (str11.equals("A_PCM/FLOAT/IEEE")) {
                        b = 22;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 725948237:
                    if (str11.equals("A_PCM/INT/BIG")) {
                        b = 23;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 725957860:
                    if (str11.equals("A_PCM/INT/LIT")) {
                        obj = "V_MPEG4/ISO/SP";
                        b = 24;
                    } else {
                        obj = "V_MPEG4/ISO/SP";
                        b = -1;
                    }
                    break;
                case 738597099:
                    if (str11.equals("S_TEXT/ASS")) {
                        obj = "V_MPEG4/ISO/SP";
                        b = 25;
                    } else {
                        obj = "V_MPEG4/ISO/SP";
                        b = -1;
                    }
                    break;
                case 855502857:
                    if (str11.equals("V_MPEGH/ISO/HEVC")) {
                        b = 26;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 1045209816:
                    if (str11.equals("S_TEXT/WEBVTT")) {
                        b = 27;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 1422270023:
                    if (str11.equals("S_TEXT/UTF8")) {
                        b = 28;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 1809237540:
                    if (str11.equals("V_MPEG2")) {
                        b = 29;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 1950749482:
                    if (str11.equals("A_EAC3")) {
                        b = 30;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 1950789798:
                    if (str11.equals("A_FLAC")) {
                        b = 31;
                        obj2 = obj4;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                case 1951062397:
                    if (str11.equals("A_OPUS")) {
                        obj2 = obj4;
                        b = 32;
                        obj4 = obj2;
                        obj = "V_MPEG4/ISO/SP";
                    }
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
                default:
                    obj = "V_MPEG4/ISO/SP";
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                o00O0O0 o00o0o1 = matroskaExtractor2.f11899Ooooo00;
                int i26 = oooO0O5.f11905OooO0OO;
                String str12 = oooO0O5.f11904OooO0O0;
                str12.getClass();
                OooO0O0 oooO0O6 = oooO0O5;
                switch (str12.hashCode()) {
                    case -2095576542:
                        if (str12.equals("V_MPEG4/ISO/AP")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -2095575984:
                        if (str12.equals(obj)) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1985379776:
                        if (str12.equals("A_MS/ACM")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1784763192:
                        if (str12.equals("A_TRUEHD")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1730367663:
                        if (str12.equals("A_VORBIS")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1482641358:
                        if (str12.equals("A_MPEG/L2")) {
                            b2 = 5;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1482641357:
                        if (str12.equals(obj4)) {
                            b2 = 6;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1373388978:
                        if (str12.equals(obj3)) {
                            b2 = 7;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -933872740:
                        if (str12.equals("S_DVBSUB")) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -538363189:
                        if (str12.equals("V_MPEG4/ISO/ASP")) {
                            b2 = 9;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -538363109:
                        if (str12.equals("V_MPEG4/ISO/AVC")) {
                            b2 = 10;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -425012669:
                        if (str12.equals("S_VOBSUB")) {
                            b2 = 11;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -356037306:
                        if (str12.equals("A_DTS/LOSSLESS")) {
                            b2 = 12;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62923557:
                        if (str12.equals("A_AAC")) {
                            b2 = 13;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62923603:
                        if (str12.equals("A_AC3")) {
                            b2 = 14;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 62927045:
                        if (str12.equals("A_DTS")) {
                            b2 = 15;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82318131:
                        if (str12.equals("V_AV1")) {
                            b2 = 16;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82338133:
                        if (str12.equals("V_VP8")) {
                            b2 = 17;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 82338134:
                        if (str12.equals("V_VP9")) {
                            b2 = 18;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 99146302:
                        if (str12.equals("S_HDMV/PGS")) {
                            b2 = 19;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 444813526:
                        if (str12.equals("V_THEORA")) {
                            b2 = 20;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 542569478:
                        if (str12.equals("A_DTS/EXPRESS")) {
                            b2 = 21;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 635596514:
                        if (str12.equals("A_PCM/FLOAT/IEEE")) {
                            b2 = 22;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 725948237:
                        if (str12.equals("A_PCM/INT/BIG")) {
                            b2 = 23;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 725957860:
                        if (str12.equals("A_PCM/INT/LIT")) {
                            b2 = 24;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 738597099:
                        if (str12.equals("S_TEXT/ASS")) {
                            b2 = 25;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 855502857:
                        if (str12.equals("V_MPEGH/ISO/HEVC")) {
                            b2 = 26;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1045209816:
                        if (str12.equals("S_TEXT/WEBVTT")) {
                            b2 = 27;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1422270023:
                        if (str12.equals("S_TEXT/UTF8")) {
                            b2 = 28;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1809237540:
                        if (str12.equals("V_MPEG2")) {
                            b2 = 29;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1950749482:
                        if (str12.equals("A_EAC3")) {
                            b2 = 30;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1950789798:
                        if (str12.equals("A_FLAC")) {
                            b2 = 31;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1951062397:
                        if (str12.equals("A_OPUS")) {
                            b2 = 32;
                        } else {
                            b2 = -1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                String str13 = "video/x-unknown";
                switch (b2) {
                    case 0:
                    case 1:
                    case 9:
                        oooO0O6 = oooO0O6;
                        i2 = 1;
                        i3 = 3;
                        byte[] bArr2 = oooO0O6.f11912OooOO0O;
                        listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                        str13 = "video/mp4v-es";
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null && (o00o0oooOooO00o = o00O0OOO.OooO00o(new o00Oo00(oooO0O6.f11942Oooo0oO))) != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i27 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i28 = i27 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8 || (i11 = oooO0O6.f11917OooOOOo) == i8) {
                                f = -1.0f;
                            } else {
                                f = (oooO0O6.f11914OooOOO * i9) / (oooO0O6.f11915OooOOO0 * i11);
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f || oooO0O6.f11932OooOooo == -1.0f || oooO0O6.f11935Oooo000 == -1.0f || oooO0O6.f11936Oooo00O == -1.0f || oooO0O6.f11937Oooo00o == -1.0f || oooO0O6.f11934Oooo0 == -1.0f || oooO0O6.f11938Oooo0O0 == -1.0f || oooO0O6.f11939Oooo0OO == -1.0f || oooO0O6.f11941Oooo0o0 == -1.0f || oooO0O6.f11940Oooo0o == -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder.put((byte) 0);
                                    byteBufferOrder.putShort((short) ((oooO0O6.f11931OooOooO * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((oooO0O6.f11932OooOooo * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((oooO0O6.f11935Oooo000 * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((oooO0O6.f11936Oooo00O * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((oooO0O6.f11937Oooo00o * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((oooO0O6.f11934Oooo0 * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((oooO0O6.f11938Oooo0O0 * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((oooO0O6.f11939Oooo0OO * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) (oooO0O6.f11941Oooo0o0 + 0.5f));
                                    byteBufferOrder.putShort((short) (oooO0O6.f11940Oooo0o + 0.5f));
                                    byteBufferOrder.putShort((short) oooO0O6.f11930OooOoo0);
                                    byteBufferOrder.putShort((short) oooO0O6.f11929OooOoo);
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0 || Float.compare(oooO0O6.f11920OooOOoo, 0.0f) != 0 || Float.compare(oooO0O6.f11923OooOo00, 0.0f) != 0) {
                                i10 = iIntValue;
                            } else if (Float.compare(oooO0O6.f11922OooOo0, 0.0f) == 0) {
                                i10 = 0;
                            } else if (Float.compare(oooO0O6.f11923OooOo00, 90.0f) == 0) {
                                i10 = 90;
                            } else if (Float.compare(oooO0O6.f11923OooOo00, -180.0f) == 0 || Float.compare(oooO0O6.f11923OooOo00, 180.0f) == 0) {
                                i10 = 180;
                            } else if (Float.compare(oooO0O6.f11923OooOo00, -90.0f) == 0) {
                                i10 = 270;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                                throw ParserException.OooO00o("Unexpected MIME type.", null);
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null && !MatroskaExtractor.f11845Oooooo.containsKey(str10)) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i28;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO;
                        trackOutputOooOOO.OooO0OO(oooOoOooO00o);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 2:
                        oooO0O6 = oooO0O6;
                        i3 = 3;
                        o00Oo00 o00oo01 = new o00Oo00(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0));
                        try {
                            int iOooOOO = o00oo01.OooOOO();
                            i2 = 1;
                            if (iOooOOO != 1) {
                                if (iOooOOO == 65534) {
                                    o00oo01.Oooo00O(24);
                                    long jOooOOOO = o00oo01.OooOOOO();
                                    UUID uuid = MatroskaExtractor.f11846Oooooo0;
                                    if (jOooOOOO != uuid.getMostSignificantBits() || o00oo01.OooOOOO() != uuid.getLeastSignificantBits()) {
                                    }
                                    if (z2) {
                                        iOooOo00 = o0O00.OooOo00(oooO0O6.f11933Oooo);
                                        if (iOooOo00 == 0) {
                                            Log.OooO0o("MatroskaExtractor", "Unsupported PCM bit depth: " + oooO0O6.f11933Oooo + ". Setting mimeType to audio/x-unknown");
                                        }
                                        str3 = "audio/raw";
                                        list3 = null;
                                        str6 = null;
                                        str7 = str6;
                                        list4 = list3;
                                        i6 = -1;
                                        if (oooO0O6.f11942Oooo0oO != null) {
                                            str7 = o00o0oooOooO00o.f40751OooO00o;
                                            str3 = "video/dolby-vision";
                                        }
                                        int i29 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                                        if (oooO0O6.f11948OoooOO0) {
                                            i7 = 2;
                                        } else {
                                            i7 = 0;
                                        }
                                        int i210 = i29 | i7;
                                        oooO00o = new OooOo.OooO00o();
                                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                            oooO00o.f11258OooOoO = iOooOo00;
                                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                            if (oooO0O6.f11919OooOOo0 == 0) {
                                                i12 = oooO0O6.f11916OooOOOO;
                                                i8 = -1;
                                                if (i12 == -1) {
                                                    i12 = oooO0O6.f11915OooOOO0;
                                                }
                                                oooO0O6.f11916OooOOOO = i12;
                                                i13 = oooO0O6.f11917OooOOOo;
                                                if (i13 == -1) {
                                                    i13 = oooO0O6.f11914OooOOO;
                                                }
                                                oooO0O6.f11917OooOOOo = i13;
                                            } else {
                                                i8 = -1;
                                            }
                                            i9 = oooO0O6.f11916OooOOOO;
                                            if (i9 != i8) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (oooO0O6.f11921OooOo) {
                                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                            } else {
                                                o00o0oo2 = null;
                                            }
                                            str9 = oooO0O6.f11903OooO00o;
                                            if (str9 != null) {
                                                map = MatroskaExtractor.f11845Oooooo;
                                                if (map.containsKey(str9)) {
                                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                                } else {
                                                    iIntValue = i8;
                                                }
                                            } else {
                                                iIntValue = i8;
                                            }
                                            if (oooO0O6.f11918OooOOo == 0) {
                                                i10 = iIntValue;
                                            } else {
                                                i10 = iIntValue;
                                            }
                                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                            oooO00o.f11255OooOo00 = f;
                                            oooO00o.f11252OooOOoo = i10;
                                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                            oooO00o.f11257OooOo0o = o00o0oo2;
                                            i2 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str3)) {
                                            }
                                            i2 = i3;
                                        }
                                        str10 = oooO0O6.f11903OooO00o;
                                        if (str10 != null) {
                                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                                        }
                                        oooO00o.OooO0O0(i26);
                                        oooO00o.f11244OooOO0O = str3;
                                        oooO00o.f11245OooOO0o = i6;
                                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                                        oooO00o.f11238OooO0Oo = i210;
                                        oooO00o.f11247OooOOO0 = list4;
                                        oooO00o.f11242OooO0oo = str7;
                                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                                        OooOo oooOoOooO00o2 = oooO00o.OooO00o();
                                        TrackOutput trackOutputOooOOO2 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                                        oooO0O6.f11950OoooOOo = trackOutputOooOOO2;
                                        trackOutputOooOOO2.OooO0OO(oooOoOooO00o2);
                                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                                        matroskaExtractor = matroskaExtractor2;
                                        oooO0O0 = null;
                                    } else {
                                        Log.OooO0o("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                    }
                                    str13 = "audio/x-unknown";
                                    listSingletonList = null;
                                    str5 = null;
                                    str8 = str5;
                                    list = listSingletonList;
                                    str2 = str13;
                                    i5 = -1;
                                    str7 = str8;
                                    list4 = list;
                                    i6 = i5;
                                    str3 = str2;
                                    iOooOo00 = -1;
                                    if (oooO0O6.f11942Oooo0oO != null) {
                                        str7 = o00o0oooOooO00o.f40751OooO00o;
                                        str3 = "video/dolby-vision";
                                    }
                                    int i211 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O6.f11948OoooOO0) {
                                        i7 = 2;
                                    } else {
                                        i7 = 0;
                                    }
                                    int i212 = i211 | i7;
                                    oooO00o = new OooOo.OooO00o();
                                    if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                        oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                        oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                        oooO00o.f11258OooOoO = iOooOo00;
                                    } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                        if (oooO0O6.f11919OooOOo0 == 0) {
                                            i12 = oooO0O6.f11916OooOOOO;
                                            i8 = -1;
                                            if (i12 == -1) {
                                                i12 = oooO0O6.f11915OooOOO0;
                                            }
                                            oooO0O6.f11916OooOOOO = i12;
                                            i13 = oooO0O6.f11917OooOOOo;
                                            if (i13 == -1) {
                                                i13 = oooO0O6.f11914OooOOO;
                                            }
                                            oooO0O6.f11917OooOOOo = i13;
                                        } else {
                                            i8 = -1;
                                        }
                                        i9 = oooO0O6.f11916OooOOOO;
                                        if (i9 != i8) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (oooO0O6.f11921OooOo) {
                                            if (oooO0O6.f11931OooOooO != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                        } else {
                                            o00o0oo2 = null;
                                        }
                                        str9 = oooO0O6.f11903OooO00o;
                                        if (str9 != null) {
                                            map = MatroskaExtractor.f11845Oooooo;
                                            if (map.containsKey(str9)) {
                                                iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                            } else {
                                                iIntValue = i8;
                                            }
                                        } else {
                                            iIntValue = i8;
                                        }
                                        if (oooO0O6.f11918OooOOo == 0) {
                                            i10 = iIntValue;
                                        } else {
                                            i10 = iIntValue;
                                        }
                                        oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                        oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                        oooO00o.f11255OooOo00 = f;
                                        oooO00o.f11252OooOOoo = i10;
                                        oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                        oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                        oooO00o.f11257OooOo0o = o00o0oo2;
                                        i2 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i2 = i3;
                                    }
                                    str10 = oooO0O6.f11903OooO00o;
                                    if (str10 != null) {
                                        oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                                    }
                                    oooO00o.OooO0O0(i26);
                                    oooO00o.f11244OooOO0O = str3;
                                    oooO00o.f11245OooOO0o = i6;
                                    oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                                    oooO00o.f11238OooO0Oo = i212;
                                    oooO00o.f11247OooOOO0 = list4;
                                    oooO00o.f11242OooO0oo = str7;
                                    oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                                    OooOo oooOoOooO00o3 = oooO00o.OooO00o();
                                    TrackOutput trackOutputOooOOO3 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                                    oooO0O6.f11950OoooOOo = trackOutputOooOOO3;
                                    trackOutputOooOOO3.OooO0OO(oooOoOooO00o3);
                                    sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                                    matroskaExtractor = matroskaExtractor2;
                                    oooO0O0 = null;
                                }
                                z2 = false;
                                if (z2) {
                                    iOooOo00 = o0O00.OooOo00(oooO0O6.f11933Oooo);
                                    if (iOooOo00 == 0) {
                                        Log.OooO0o("MatroskaExtractor", "Unsupported PCM bit depth: " + oooO0O6.f11933Oooo + ". Setting mimeType to audio/x-unknown");
                                    }
                                    str3 = "audio/raw";
                                    list3 = null;
                                    str6 = null;
                                    str7 = str6;
                                    list4 = list3;
                                    i6 = -1;
                                    if (oooO0O6.f11942Oooo0oO != null) {
                                        str7 = o00o0oooOooO00o.f40751OooO00o;
                                        str3 = "video/dolby-vision";
                                    }
                                    int i213 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O6.f11948OoooOO0) {
                                        i7 = 2;
                                    } else {
                                        i7 = 0;
                                    }
                                    int i214 = i213 | i7;
                                    oooO00o = new OooOo.OooO00o();
                                    if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                        oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                        oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                        oooO00o.f11258OooOoO = iOooOo00;
                                    } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                        if (oooO0O6.f11919OooOOo0 == 0) {
                                            i12 = oooO0O6.f11916OooOOOO;
                                            i8 = -1;
                                            if (i12 == -1) {
                                                i12 = oooO0O6.f11915OooOOO0;
                                            }
                                            oooO0O6.f11916OooOOOO = i12;
                                            i13 = oooO0O6.f11917OooOOOo;
                                            if (i13 == -1) {
                                                i13 = oooO0O6.f11914OooOOO;
                                            }
                                            oooO0O6.f11917OooOOOo = i13;
                                        } else {
                                            i8 = -1;
                                        }
                                        i9 = oooO0O6.f11916OooOOOO;
                                        if (i9 != i8) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (oooO0O6.f11921OooOo) {
                                            if (oooO0O6.f11931OooOooO != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                        } else {
                                            o00o0oo2 = null;
                                        }
                                        str9 = oooO0O6.f11903OooO00o;
                                        if (str9 != null) {
                                            map = MatroskaExtractor.f11845Oooooo;
                                            if (map.containsKey(str9)) {
                                                iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                            } else {
                                                iIntValue = i8;
                                            }
                                        } else {
                                            iIntValue = i8;
                                        }
                                        if (oooO0O6.f11918OooOOo == 0) {
                                            i10 = iIntValue;
                                        } else {
                                            i10 = iIntValue;
                                        }
                                        oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                        oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                        oooO00o.f11255OooOo00 = f;
                                        oooO00o.f11252OooOOoo = i10;
                                        oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                        oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                        oooO00o.f11257OooOo0o = o00o0oo2;
                                        i2 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i2 = i3;
                                    }
                                    str10 = oooO0O6.f11903OooO00o;
                                    if (str10 != null) {
                                        oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                                    }
                                    oooO00o.OooO0O0(i26);
                                    oooO00o.f11244OooOO0O = str3;
                                    oooO00o.f11245OooOO0o = i6;
                                    oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                                    oooO00o.f11238OooO0Oo = i214;
                                    oooO00o.f11247OooOOO0 = list4;
                                    oooO00o.f11242OooO0oo = str7;
                                    oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                                    OooOo oooOoOooO00o4 = oooO00o.OooO00o();
                                    TrackOutput trackOutputOooOOO4 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                                    oooO0O6.f11950OoooOOo = trackOutputOooOOO4;
                                    trackOutputOooOOO4.OooO0OO(oooOoOooO00o4);
                                    sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                                    matroskaExtractor = matroskaExtractor2;
                                    oooO0O0 = null;
                                } else {
                                    Log.OooO0o("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                }
                                str13 = "audio/x-unknown";
                                listSingletonList = null;
                                str5 = null;
                                str8 = str5;
                                list = listSingletonList;
                                str2 = str13;
                                i5 = -1;
                                str7 = str8;
                                list4 = list;
                                i6 = i5;
                                str3 = str2;
                                iOooOo00 = -1;
                                if (oooO0O6.f11942Oooo0oO != null) {
                                    str7 = o00o0oooOooO00o.f40751OooO00o;
                                    str3 = "video/dolby-vision";
                                }
                                int i215 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                                if (oooO0O6.f11948OoooOO0) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i216 = i215 | i7;
                                oooO00o = new OooOo.OooO00o();
                                if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                    oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                    oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                    oooO00o.f11258OooOoO = iOooOo00;
                                } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                    if (oooO0O6.f11919OooOOo0 == 0) {
                                        i12 = oooO0O6.f11916OooOOOO;
                                        i8 = -1;
                                        if (i12 == -1) {
                                            i12 = oooO0O6.f11915OooOOO0;
                                        }
                                        oooO0O6.f11916OooOOOO = i12;
                                        i13 = oooO0O6.f11917OooOOOo;
                                        if (i13 == -1) {
                                            i13 = oooO0O6.f11914OooOOO;
                                        }
                                        oooO0O6.f11917OooOOOo = i13;
                                    } else {
                                        i8 = -1;
                                    }
                                    i9 = oooO0O6.f11916OooOOOO;
                                    if (i9 != i8) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (oooO0O6.f11921OooOo) {
                                        if (oooO0O6.f11931OooOooO != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                    } else {
                                        o00o0oo2 = null;
                                    }
                                    str9 = oooO0O6.f11903OooO00o;
                                    if (str9 != null) {
                                        map = MatroskaExtractor.f11845Oooooo;
                                        if (map.containsKey(str9)) {
                                            iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                        } else {
                                            iIntValue = i8;
                                        }
                                    } else {
                                        iIntValue = i8;
                                    }
                                    if (oooO0O6.f11918OooOOo == 0) {
                                        i10 = iIntValue;
                                    } else {
                                        i10 = iIntValue;
                                    }
                                    oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                    oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                    oooO00o.f11255OooOo00 = f;
                                    oooO00o.f11252OooOOoo = i10;
                                    oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                    oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                    oooO00o.f11257OooOo0o = o00o0oo2;
                                    i2 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i2 = i3;
                                }
                                str10 = oooO0O6.f11903OooO00o;
                                if (str10 != null) {
                                    oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                                }
                                oooO00o.OooO0O0(i26);
                                oooO00o.f11244OooOO0O = str3;
                                oooO00o.f11245OooOO0o = i6;
                                oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                                oooO00o.f11238OooO0Oo = i216;
                                oooO00o.f11247OooOOO0 = list4;
                                oooO00o.f11242OooO0oo = str7;
                                oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                                OooOo oooOoOooO00o5 = oooO00o.OooO00o();
                                TrackOutput trackOutputOooOOO5 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                                oooO0O6.f11950OoooOOo = trackOutputOooOOO5;
                                trackOutputOooOOO5.OooO0OO(oooOoOooO00o5);
                                sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                                matroskaExtractor = matroskaExtractor2;
                                oooO0O0 = null;
                                break;
                            }
                            z2 = true;
                            if (z2) {
                                iOooOo00 = o0O00.OooOo00(oooO0O6.f11933Oooo);
                                if (iOooOo00 == 0) {
                                    Log.OooO0o("MatroskaExtractor", "Unsupported PCM bit depth: " + oooO0O6.f11933Oooo + ". Setting mimeType to audio/x-unknown");
                                }
                                str3 = "audio/raw";
                                list3 = null;
                                str6 = null;
                                str7 = str6;
                                list4 = list3;
                                i6 = -1;
                                if (oooO0O6.f11942Oooo0oO != null) {
                                    str7 = o00o0oooOooO00o.f40751OooO00o;
                                    str3 = "video/dolby-vision";
                                }
                                int i217 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                                if (oooO0O6.f11948OoooOO0) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i218 = i217 | i7;
                                oooO00o = new OooOo.OooO00o();
                                if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                    oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                    oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                    oooO00o.f11258OooOoO = iOooOo00;
                                } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                    if (oooO0O6.f11919OooOOo0 == 0) {
                                        i12 = oooO0O6.f11916OooOOOO;
                                        i8 = -1;
                                        if (i12 == -1) {
                                            i12 = oooO0O6.f11915OooOOO0;
                                        }
                                        oooO0O6.f11916OooOOOO = i12;
                                        i13 = oooO0O6.f11917OooOOOo;
                                        if (i13 == -1) {
                                            i13 = oooO0O6.f11914OooOOO;
                                        }
                                        oooO0O6.f11917OooOOOo = i13;
                                    } else {
                                        i8 = -1;
                                    }
                                    i9 = oooO0O6.f11916OooOOOO;
                                    if (i9 != i8) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (oooO0O6.f11921OooOo) {
                                        if (oooO0O6.f11931OooOooO != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                    } else {
                                        o00o0oo2 = null;
                                    }
                                    str9 = oooO0O6.f11903OooO00o;
                                    if (str9 != null) {
                                        map = MatroskaExtractor.f11845Oooooo;
                                        if (map.containsKey(str9)) {
                                            iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                        } else {
                                            iIntValue = i8;
                                        }
                                    } else {
                                        iIntValue = i8;
                                    }
                                    if (oooO0O6.f11918OooOOo == 0) {
                                        i10 = iIntValue;
                                    } else {
                                        i10 = iIntValue;
                                    }
                                    oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                    oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                    oooO00o.f11255OooOo00 = f;
                                    oooO00o.f11252OooOOoo = i10;
                                    oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                    oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                    oooO00o.f11257OooOo0o = o00o0oo2;
                                    i2 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i2 = i3;
                                }
                                str10 = oooO0O6.f11903OooO00o;
                                if (str10 != null) {
                                    oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                                }
                                oooO00o.OooO0O0(i26);
                                oooO00o.f11244OooOO0O = str3;
                                oooO00o.f11245OooOO0o = i6;
                                oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                                oooO00o.f11238OooO0Oo = i218;
                                oooO00o.f11247OooOOO0 = list4;
                                oooO00o.f11242OooO0oo = str7;
                                oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                                OooOo oooOoOooO00o6 = oooO00o.OooO00o();
                                TrackOutput trackOutputOooOOO6 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                                oooO0O6.f11950OoooOOo = trackOutputOooOOO6;
                                trackOutputOooOOO6.OooO0OO(oooOoOooO00o6);
                                sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                                matroskaExtractor = matroskaExtractor2;
                                oooO0O0 = null;
                            } else {
                                Log.OooO0o("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                            }
                            str13 = "audio/x-unknown";
                            listSingletonList = null;
                            str5 = null;
                            str8 = str5;
                            list = listSingletonList;
                            str2 = str13;
                            i5 = -1;
                            str7 = str8;
                            list4 = list;
                            i6 = i5;
                            str3 = str2;
                            iOooOo00 = -1;
                            if (oooO0O6.f11942Oooo0oO != null) {
                                str7 = o00o0oooOooO00o.f40751OooO00o;
                                str3 = "video/dolby-vision";
                            }
                            int i219 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                            if (oooO0O6.f11948OoooOO0) {
                                i7 = 2;
                            } else {
                                i7 = 0;
                            }
                            int i2110 = i219 | i7;
                            oooO00o = new OooOo.OooO00o();
                            if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                oooO00o.f11258OooOoO = iOooOo00;
                            } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                if (oooO0O6.f11919OooOOo0 == 0) {
                                    i12 = oooO0O6.f11916OooOOOO;
                                    i8 = -1;
                                    if (i12 == -1) {
                                        i12 = oooO0O6.f11915OooOOO0;
                                    }
                                    oooO0O6.f11916OooOOOO = i12;
                                    i13 = oooO0O6.f11917OooOOOo;
                                    if (i13 == -1) {
                                        i13 = oooO0O6.f11914OooOOO;
                                    }
                                    oooO0O6.f11917OooOOOo = i13;
                                } else {
                                    i8 = -1;
                                }
                                i9 = oooO0O6.f11916OooOOOO;
                                if (i9 != i8) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (oooO0O6.f11921OooOo) {
                                    if (oooO0O6.f11931OooOooO != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                } else {
                                    o00o0oo2 = null;
                                }
                                str9 = oooO0O6.f11903OooO00o;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f11845Oooooo;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                    } else {
                                        iIntValue = i8;
                                    }
                                } else {
                                    iIntValue = i8;
                                }
                                if (oooO0O6.f11918OooOOo == 0) {
                                    i10 = iIntValue;
                                } else {
                                    i10 = iIntValue;
                                }
                                oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                oooO00o.f11255OooOo00 = f;
                                oooO00o.f11252OooOOoo = i10;
                                oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                oooO00o.f11257OooOo0o = o00o0oo2;
                                i2 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i2 = i3;
                            }
                            str10 = oooO0O6.f11903OooO00o;
                            if (str10 != null) {
                                oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                            }
                            oooO00o.OooO0O0(i26);
                            oooO00o.f11244OooOO0O = str3;
                            oooO00o.f11245OooOO0o = i6;
                            oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                            oooO00o.f11238OooO0Oo = i2110;
                            oooO00o.f11247OooOOO0 = list4;
                            oooO00o.f11242OooO0oo = str7;
                            oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                            OooOo oooOoOooO00o7 = oooO00o.OooO00o();
                            TrackOutput trackOutputOooOOO7 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                            oooO0O6.f11950OoooOOo = trackOutputOooOOO7;
                            trackOutputOooOOO7.OooO0OO(oooOoOooO00o7);
                            sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                            matroskaExtractor = matroskaExtractor2;
                            oooO0O0 = null;
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw ParserException.OooO00o("Error parsing MS/ACM codec private", null);
                        }
                        break;
                    case 3:
                        oooO0O6 = oooO0O6;
                        i3 = 3;
                        oooO0O6.f11944OoooO = new OooO0OO();
                        str13 = "audio/true-hd";
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i2111 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2112 = i2111 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2112;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o8 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO8 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO8;
                        trackOutputOooOOO8.OooO0OO(oooOoOooO00o8);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 4:
                        oooO0O6 = oooO0O6;
                        byte[] bArrOooO00o = oooO0O6.OooO00o(oooO0O6.f11904OooO0O0);
                        try {
                            try {
                                if (bArrOooO00o[0] != 2) {
                                    throw ParserException.OooO00o("Error parsing vorbis codec private", null);
                                }
                                int i30 = 0;
                                int i31 = 1;
                                while (true) {
                                    int i32 = bArrOooO00o[i31] & 255;
                                    if (i32 != 255) {
                                        int i33 = i31 + 1;
                                        int i34 = i30 + i32;
                                        int i35 = 0;
                                        while (true) {
                                            int i36 = bArrOooO00o[i33] & 255;
                                            if (i36 != 255) {
                                                int i37 = i33 + 1;
                                                int i38 = i35 + i36;
                                                if (bArrOooO00o[i37] != 1) {
                                                    throw ParserException.OooO00o("Error parsing vorbis codec private", null);
                                                }
                                                byte[] bArr3 = new byte[i34];
                                                System.arraycopy(bArrOooO00o, i37, bArr3, 0, i34);
                                                int i39 = i37 + i34;
                                                i3 = 3;
                                                if (bArrOooO00o[i39] != 3) {
                                                    throw ParserException.OooO00o("Error parsing vorbis codec private", null);
                                                }
                                                int i40 = i39 + i38;
                                                if (bArrOooO00o[i40] != 5) {
                                                    throw ParserException.OooO00o("Error parsing vorbis codec private", null);
                                                }
                                                byte[] bArr4 = new byte[bArrOooO00o.length - i40];
                                                System.arraycopy(bArrOooO00o, i40, bArr4, 0, bArrOooO00o.length - i40);
                                                arrayList = new ArrayList(2);
                                                arrayList.add(bArr3);
                                                arrayList.add(bArr4);
                                                str = "audio/vorbis";
                                                i4 = 8192;
                                                int i41 = i4;
                                                list = arrayList;
                                                str2 = str;
                                                i5 = i41;
                                                str8 = null;
                                                i2 = 1;
                                                str7 = str8;
                                                list4 = list;
                                                i6 = i5;
                                                str3 = str2;
                                                iOooOo00 = -1;
                                                if (oooO0O6.f11942Oooo0oO != null) {
                                                    str7 = o00o0oooOooO00o.f40751OooO00o;
                                                    str3 = "video/dolby-vision";
                                                }
                                                int i2113 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                                                if (oooO0O6.f11948OoooOO0) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i2114 = i2113 | i7;
                                                oooO00o = new OooOo.OooO00o();
                                                if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                                    oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                                    oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                                    oooO00o.f11258OooOoO = iOooOo00;
                                                } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                                    if (oooO0O6.f11919OooOOo0 == 0) {
                                                        i12 = oooO0O6.f11916OooOOOO;
                                                        i8 = -1;
                                                        if (i12 == -1) {
                                                            i12 = oooO0O6.f11915OooOOO0;
                                                        }
                                                        oooO0O6.f11916OooOOOO = i12;
                                                        i13 = oooO0O6.f11917OooOOOo;
                                                        if (i13 == -1) {
                                                            i13 = oooO0O6.f11914OooOOO;
                                                        }
                                                        oooO0O6.f11917OooOOOo = i13;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = oooO0O6.f11916OooOOOO;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (oooO0O6.f11921OooOo) {
                                                        if (oooO0O6.f11931OooOooO != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                                    } else {
                                                        o00o0oo2 = null;
                                                    }
                                                    str9 = oooO0O6.f11903OooO00o;
                                                    if (str9 != null) {
                                                        map = MatroskaExtractor.f11845Oooooo;
                                                        if (map.containsKey(str9)) {
                                                            iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                                        } else {
                                                            iIntValue = i8;
                                                        }
                                                    } else {
                                                        iIntValue = i8;
                                                    }
                                                    if (oooO0O6.f11918OooOOo == 0) {
                                                        i10 = iIntValue;
                                                    } else {
                                                        i10 = iIntValue;
                                                    }
                                                    oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                                    oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                                    oooO00o.f11255OooOo00 = f;
                                                    oooO00o.f11252OooOOoo = i10;
                                                    oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                                    oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                                    oooO00o.f11257OooOo0o = o00o0oo2;
                                                    i2 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str3)) {
                                                    }
                                                    i2 = i3;
                                                }
                                                str10 = oooO0O6.f11903OooO00o;
                                                if (str10 != null) {
                                                    oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                                                }
                                                oooO00o.OooO0O0(i26);
                                                oooO00o.f11244OooOO0O = str3;
                                                oooO00o.f11245OooOO0o = i6;
                                                oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                                                oooO00o.f11238OooO0Oo = i2114;
                                                oooO00o.f11247OooOOO0 = list4;
                                                oooO00o.f11242OooO0oo = str7;
                                                oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                                                OooOo oooOoOooO00o9 = oooO00o.OooO00o();
                                                TrackOutput trackOutputOooOOO9 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                                                oooO0O6.f11950OoooOOo = trackOutputOooOOO9;
                                                trackOutputOooOOO9.OooO0OO(oooOoOooO00o9);
                                                sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                                                matroskaExtractor = matroskaExtractor2;
                                                oooO0O0 = null;
                                            } else {
                                                i35 += 255;
                                                i33++;
                                            }
                                        }
                                    } else {
                                        i30 += 255;
                                        i31++;
                                    }
                                }
                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                throw ParserException.OooO00o("Error parsing vorbis codec private", bArrOooO00o);
                            }
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                            bArrOooO00o = 0;
                        }
                        break;
                    case 5:
                        str2 = "audio/mpeg-L2";
                        i5 = 4096;
                        list = null;
                        i3 = 3;
                        str8 = null;
                        i2 = 1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i2115 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2116 = i2115 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2116;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o10 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO10 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO10;
                        trackOutputOooOOO10.OooO0OO(oooOoOooO00o10);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 6:
                        str2 = "audio/mpeg";
                        i5 = 4096;
                        list = null;
                        i3 = 3;
                        str8 = null;
                        i2 = 1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i2117 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2118 = i2117 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2118;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o11 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO11 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO11;
                        trackOutputOooOOO11.OooO0OO(oooOoOooO00o11);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 7:
                        oooO0O6 = oooO0O6;
                        o00Oo00 o00oo02 = new o00Oo00(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0));
                        try {
                            o00oo02.Oooo00o(16);
                            long jOooOO0o = o00oo02.OooOO0o();
                            r2 = (jOooOO0o > 1482049860L ? 1 : (jOooOO0o == 1482049860L ? 0 : -1));
                            try {
                                if (r2 != 0) {
                                    if (jOooOO0o == 859189832) {
                                        r2 = 0;
                                        pair = new Pair("video/3gpp", null);
                                    } else if (jOooOO0o == 826496599) {
                                        int i42 = o00oo02.f40592OooO0O0 + 20;
                                        byte[] bArr5 = o00oo02.f40591OooO00o;
                                        while (true) {
                                            if (i42 >= bArr5.length - 4) {
                                                throw ParserException.OooO00o("Failed to find FourCC VC1 initialization data", null);
                                            }
                                            if (bArr5[i42] == 0 && bArr5[i42 + 1] == 0 && bArr5[i42 + 2] == 1) {
                                                if (bArr5[i42 + 3] == 15) {
                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr5, i42, bArr5.length)));
                                                }
                                            }
                                            i42++;
                                        }
                                    } else {
                                        Log.OooO0o("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                        pair = new Pair("video/x-unknown", null);
                                    }
                                    str13 = (String) pair.first;
                                    list2 = (List) pair.second;
                                    listSingletonList = list2;
                                    i2 = 1;
                                    i3 = 3;
                                    str5 = null;
                                    str8 = str5;
                                    list = listSingletonList;
                                    str2 = str13;
                                    i5 = -1;
                                    str7 = str8;
                                    list4 = list;
                                    i6 = i5;
                                    str3 = str2;
                                    iOooOo00 = -1;
                                    if (oooO0O6.f11942Oooo0oO != null) {
                                        str7 = o00o0oooOooO00o.f40751OooO00o;
                                        str3 = "video/dolby-vision";
                                    }
                                    int i2119 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O6.f11948OoooOO0) {
                                        i7 = 2;
                                    } else {
                                        i7 = 0;
                                    }
                                    int i21110 = i2119 | i7;
                                    oooO00o = new OooOo.OooO00o();
                                    if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                        oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                        oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                        oooO00o.f11258OooOoO = iOooOo00;
                                    } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                        if (oooO0O6.f11919OooOOo0 == 0) {
                                            i12 = oooO0O6.f11916OooOOOO;
                                            i8 = -1;
                                            if (i12 == -1) {
                                                i12 = oooO0O6.f11915OooOOO0;
                                            }
                                            oooO0O6.f11916OooOOOO = i12;
                                            i13 = oooO0O6.f11917OooOOOo;
                                            if (i13 == -1) {
                                                i13 = oooO0O6.f11914OooOOO;
                                            }
                                            oooO0O6.f11917OooOOOo = i13;
                                        } else {
                                            i8 = -1;
                                        }
                                        i9 = oooO0O6.f11916OooOOOO;
                                        if (i9 != i8) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (oooO0O6.f11921OooOo) {
                                            if (oooO0O6.f11931OooOooO != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                        } else {
                                            o00o0oo2 = null;
                                        }
                                        str9 = oooO0O6.f11903OooO00o;
                                        if (str9 != null) {
                                            map = MatroskaExtractor.f11845Oooooo;
                                            if (map.containsKey(str9)) {
                                                iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                            } else {
                                                iIntValue = i8;
                                            }
                                        } else {
                                            iIntValue = i8;
                                        }
                                        if (oooO0O6.f11918OooOOo == 0) {
                                            i10 = iIntValue;
                                        } else {
                                            i10 = iIntValue;
                                        }
                                        oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                        oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                        oooO00o.f11255OooOo00 = f;
                                        oooO00o.f11252OooOOoo = i10;
                                        oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                        oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                        oooO00o.f11257OooOo0o = o00o0oo2;
                                        i2 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i2 = i3;
                                    }
                                    str10 = oooO0O6.f11903OooO00o;
                                    if (str10 != null) {
                                        oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                                    }
                                    oooO00o.OooO0O0(i26);
                                    oooO00o.f11244OooOO0O = str3;
                                    oooO00o.f11245OooOO0o = i6;
                                    oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                                    oooO00o.f11238OooO0Oo = i21110;
                                    oooO00o.f11247OooOOO0 = list4;
                                    oooO00o.f11242OooO0oo = str7;
                                    oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                                    OooOo oooOoOooO00o12 = oooO00o.OooO00o();
                                    TrackOutput trackOutputOooOOO12 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                                    oooO0O6.f11950OoooOOo = trackOutputOooOOO12;
                                    trackOutputOooOOO12.OooO0OO(oooOoOooO00o12);
                                    sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                                    matroskaExtractor = matroskaExtractor2;
                                    oooO0O0 = null;
                                } else {
                                    r2 = 0;
                                    pair = new Pair("video/divx", null);
                                }
                                str13 = (String) pair.first;
                                list2 = (List) pair.second;
                                listSingletonList = list2;
                                i2 = 1;
                                i3 = 3;
                                str5 = null;
                                str8 = str5;
                                list = listSingletonList;
                                str2 = str13;
                                i5 = -1;
                                str7 = str8;
                                list4 = list;
                                i6 = i5;
                                str3 = str2;
                                iOooOo00 = -1;
                                if (oooO0O6.f11942Oooo0oO != null) {
                                    str7 = o00o0oooOooO00o.f40751OooO00o;
                                    str3 = "video/dolby-vision";
                                }
                                int i21111 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                                if (oooO0O6.f11948OoooOO0) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                int i21112 = i21111 | i7;
                                oooO00o = new OooOo.OooO00o();
                                if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                    oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                    oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                    oooO00o.f11258OooOoO = iOooOo00;
                                } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                    if (oooO0O6.f11919OooOOo0 == 0) {
                                        i12 = oooO0O6.f11916OooOOOO;
                                        i8 = -1;
                                        if (i12 == -1) {
                                            i12 = oooO0O6.f11915OooOOO0;
                                        }
                                        oooO0O6.f11916OooOOOO = i12;
                                        i13 = oooO0O6.f11917OooOOOo;
                                        if (i13 == -1) {
                                            i13 = oooO0O6.f11914OooOOO;
                                        }
                                        oooO0O6.f11917OooOOOo = i13;
                                    } else {
                                        i8 = -1;
                                    }
                                    i9 = oooO0O6.f11916OooOOOO;
                                    if (i9 != i8) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (oooO0O6.f11921OooOo) {
                                        if (oooO0O6.f11931OooOooO != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                    } else {
                                        o00o0oo2 = null;
                                    }
                                    str9 = oooO0O6.f11903OooO00o;
                                    if (str9 != null) {
                                        map = MatroskaExtractor.f11845Oooooo;
                                        if (map.containsKey(str9)) {
                                            iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                        } else {
                                            iIntValue = i8;
                                        }
                                    } else {
                                        iIntValue = i8;
                                    }
                                    if (oooO0O6.f11918OooOOo == 0) {
                                        i10 = iIntValue;
                                    } else {
                                        i10 = iIntValue;
                                    }
                                    oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                    oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                    oooO00o.f11255OooOo00 = f;
                                    oooO00o.f11252OooOOoo = i10;
                                    oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                    oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                    oooO00o.f11257OooOo0o = o00o0oo2;
                                    i2 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i2 = i3;
                                }
                                str10 = oooO0O6.f11903OooO00o;
                                if (str10 != null) {
                                    oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                                }
                                oooO00o.OooO0O0(i26);
                                oooO00o.f11244OooOO0O = str3;
                                oooO00o.f11245OooOO0o = i6;
                                oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                                oooO00o.f11238OooO0Oo = i21112;
                                oooO00o.f11247OooOOO0 = list4;
                                oooO00o.f11242OooO0oo = str7;
                                oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                                OooOo oooOoOooO00o13 = oooO00o.OooO00o();
                                TrackOutput trackOutputOooOOO13 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                                oooO0O6.f11950OoooOOo = trackOutputOooOOO13;
                                trackOutputOooOOO13.OooO0OO(oooOoOooO00o13);
                                sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                                matroskaExtractor = matroskaExtractor2;
                                oooO0O0 = null;
                            } catch (ArrayIndexOutOfBoundsException unused4) {
                                throw ParserException.OooO00o("Error parsing FourCC private data", r2);
                            }
                        } catch (ArrayIndexOutOfBoundsException unused5) {
                            r2 = 0;
                        }
                        break;
                    case 8:
                        oooO0O6 = oooO0O6;
                        byte[] bArr6 = new byte[4];
                        System.arraycopy(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0), 0, bArr6, 0, 4);
                        listOooOOOo = ImmutableList.OooOOOo(bArr6);
                        str13 = "application/dvbsubs";
                        list2 = listOooOOOo;
                        listSingletonList = list2;
                        i2 = 1;
                        i3 = 3;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i21113 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i21114 = i21113 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i21114;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o14 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO14 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO14;
                        trackOutputOooOOO14.OooO0OO(oooOoOooO00o14);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 10:
                        oooO0O6 = oooO0O6;
                        oo0o0O0 oo0o0o0OooO00o = oo0o0O0.OooO00o(new o00Oo00(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0)));
                        oooO0O6.f11951OoooOo0 = oo0o0o0OooO00o.f40872OooO0O0;
                        str3 = "video/avc";
                        list3 = oo0o0o0OooO00o.f40871OooO00o;
                        str4 = oo0o0o0OooO00o.f40870OooO;
                        str6 = str4;
                        iOooOo00 = -1;
                        i2 = 1;
                        i3 = 3;
                        str7 = str6;
                        list4 = list3;
                        i6 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i21115 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i21116 = i21115 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i21116;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o15 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO15 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO15;
                        trackOutputOooOOO15.OooO0OO(oooOoOooO00o15);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 11:
                        oooO0O6 = oooO0O6;
                        listOooOOOo = ImmutableList.OooOOOo(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0));
                        str13 = "application/vobsub";
                        list2 = listOooOOOo;
                        listSingletonList = list2;
                        i2 = 1;
                        i3 = 3;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i21117 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i21118 = i21117 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i21118;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o16 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO16 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO16;
                        trackOutputOooOOO16.OooO0OO(oooOoOooO00o16);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 12:
                        str13 = "audio/vnd.dts.hd";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i21119 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211110 = i21119 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211110;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o17 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO17 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO17;
                        trackOutputOooOOO17.OooO0OO(oooOoOooO00o17);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 13:
                        oooO0O6 = oooO0O6;
                        listSingletonList = Collections.singletonList(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0));
                        byte[] bArr7 = oooO0O6.f11912OooOO0O;
                        AacUtil.OooO00o oooO00oOooO0O0 = AacUtil.OooO0O0(new o00OOOOo(bArr7, bArr7.length), false);
                        oooO0O6.f11946OoooO00 = oooO00oOooO0O0.f11439OooO00o;
                        oooO0O6.f11943Oooo0oo = oooO00oOooO0O0.f11440OooO0O0;
                        str13 = "audio/mp4a-latm";
                        str5 = oooO00oOooO0O0.f11441OooO0OO;
                        i2 = 1;
                        i3 = 3;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211111 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211112 = i211111 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211112;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o18 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO18 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO18;
                        trackOutputOooOOO18.OooO0OO(oooOoOooO00o18);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 14:
                        str13 = "audio/ac3";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211113 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211114 = i211113 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211114;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o19 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO19 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO19;
                        trackOutputOooOOO19.OooO0OO(oooOoOooO00o19);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 15:
                    case 21:
                        str13 = "audio/vnd.dts";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211115 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211116 = i211115 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211116;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o110 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO110 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO110;
                        trackOutputOooOOO110.OooO0OO(oooOoOooO00o110);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 16:
                        str13 = "video/av01";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211117 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211118 = i211117 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211118;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o111 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO111 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO111;
                        trackOutputOooOOO111.OooO0OO(oooOoOooO00o111);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 17:
                        str13 = "video/x-vnd.on2.vp8";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211119 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2111110 = i211119 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2111110;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o112 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO112 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO112;
                        trackOutputOooOOO112.OooO0OO(oooOoOooO00o112);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 18:
                        str13 = "video/x-vnd.on2.vp9";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i2111111 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2111112 = i2111111 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2111112;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o113 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO113 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO113;
                        trackOutputOooOOO113.OooO0OO(oooOoOooO00o113);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 19:
                        str13 = "application/pgs";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i2111113 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2111114 = i2111113 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2111114;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o114 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO114 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO114;
                        trackOutputOooOOO114.OooO0OO(oooOoOooO00o114);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 20:
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i2111115 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2111116 = i2111115 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2111116;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o115 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO115 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO115;
                        trackOutputOooOOO115.OooO0OO(oooOoOooO00o115);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 22:
                        oooO0O6 = oooO0O6;
                        if (oooO0O6.f11933Oooo == 32) {
                            iOooOo00 = 4;
                            i2 = 1;
                            i3 = 3;
                            str3 = "audio/raw";
                            list3 = null;
                            str6 = null;
                            str7 = str6;
                            list4 = list3;
                            i6 = -1;
                            if (oooO0O6.f11942Oooo0oO != null) {
                                str7 = o00o0oooOooO00o.f40751OooO00o;
                                str3 = "video/dolby-vision";
                            }
                            int i2111117 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                            if (oooO0O6.f11948OoooOO0) {
                                i7 = 2;
                            } else {
                                i7 = 0;
                            }
                            int i2111118 = i2111117 | i7;
                            oooO00o = new OooOo.OooO00o();
                            if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                oooO00o.f11258OooOoO = iOooOo00;
                            } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                if (oooO0O6.f11919OooOOo0 == 0) {
                                    i12 = oooO0O6.f11916OooOOOO;
                                    i8 = -1;
                                    if (i12 == -1) {
                                        i12 = oooO0O6.f11915OooOOO0;
                                    }
                                    oooO0O6.f11916OooOOOO = i12;
                                    i13 = oooO0O6.f11917OooOOOo;
                                    if (i13 == -1) {
                                        i13 = oooO0O6.f11914OooOOO;
                                    }
                                    oooO0O6.f11917OooOOOo = i13;
                                } else {
                                    i8 = -1;
                                }
                                i9 = oooO0O6.f11916OooOOOO;
                                if (i9 != i8) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (oooO0O6.f11921OooOo) {
                                    if (oooO0O6.f11931OooOooO != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                } else {
                                    o00o0oo2 = null;
                                }
                                str9 = oooO0O6.f11903OooO00o;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f11845Oooooo;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                    } else {
                                        iIntValue = i8;
                                    }
                                } else {
                                    iIntValue = i8;
                                }
                                if (oooO0O6.f11918OooOOo == 0) {
                                    i10 = iIntValue;
                                } else {
                                    i10 = iIntValue;
                                }
                                oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                oooO00o.f11255OooOo00 = f;
                                oooO00o.f11252OooOOoo = i10;
                                oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                oooO00o.f11257OooOo0o = o00o0oo2;
                                i2 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i2 = i3;
                            }
                            str10 = oooO0O6.f11903OooO00o;
                            if (str10 != null) {
                                oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                            }
                            oooO00o.OooO0O0(i26);
                            oooO00o.f11244OooOO0O = str3;
                            oooO00o.f11245OooOO0o = i6;
                            oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                            oooO00o.f11238OooO0Oo = i2111118;
                            oooO00o.f11247OooOOO0 = list4;
                            oooO00o.f11242OooO0oo = str7;
                            oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                            OooOo oooOoOooO00o116 = oooO00o.OooO00o();
                            TrackOutput trackOutputOooOOO116 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                            oooO0O6.f11950OoooOOo = trackOutputOooOOO116;
                            trackOutputOooOOO116.OooO0OO(oooOoOooO00o116);
                            sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                            matroskaExtractor = matroskaExtractor2;
                            oooO0O0 = null;
                        } else {
                            Log.OooO0o("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + oooO0O6.f11933Oooo + ". Setting mimeType to audio/x-unknown");
                            i2 = 1;
                            i3 = 3;
                            str13 = "audio/x-unknown";
                            listSingletonList = null;
                            str5 = null;
                            str8 = str5;
                            list = listSingletonList;
                            str2 = str13;
                            i5 = -1;
                            str7 = str8;
                            list4 = list;
                            i6 = i5;
                            str3 = str2;
                            iOooOo00 = -1;
                            if (oooO0O6.f11942Oooo0oO != null) {
                                str7 = o00o0oooOooO00o.f40751OooO00o;
                                str3 = "video/dolby-vision";
                            }
                            int i2111119 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                            if (oooO0O6.f11948OoooOO0) {
                                i7 = 2;
                            } else {
                                i7 = 0;
                            }
                            int i21111110 = i2111119 | i7;
                            oooO00o = new OooOo.OooO00o();
                            if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                oooO00o.f11258OooOoO = iOooOo00;
                            } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                if (oooO0O6.f11919OooOOo0 == 0) {
                                    i12 = oooO0O6.f11916OooOOOO;
                                    i8 = -1;
                                    if (i12 == -1) {
                                        i12 = oooO0O6.f11915OooOOO0;
                                    }
                                    oooO0O6.f11916OooOOOO = i12;
                                    i13 = oooO0O6.f11917OooOOOo;
                                    if (i13 == -1) {
                                        i13 = oooO0O6.f11914OooOOO;
                                    }
                                    oooO0O6.f11917OooOOOo = i13;
                                } else {
                                    i8 = -1;
                                }
                                i9 = oooO0O6.f11916OooOOOO;
                                if (i9 != i8) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (oooO0O6.f11921OooOo) {
                                    if (oooO0O6.f11931OooOooO != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                } else {
                                    o00o0oo2 = null;
                                }
                                str9 = oooO0O6.f11903OooO00o;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f11845Oooooo;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                    } else {
                                        iIntValue = i8;
                                    }
                                } else {
                                    iIntValue = i8;
                                }
                                if (oooO0O6.f11918OooOOo == 0) {
                                    i10 = iIntValue;
                                } else {
                                    i10 = iIntValue;
                                }
                                oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                oooO00o.f11255OooOo00 = f;
                                oooO00o.f11252OooOOoo = i10;
                                oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                oooO00o.f11257OooOo0o = o00o0oo2;
                                i2 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i2 = i3;
                            }
                            str10 = oooO0O6.f11903OooO00o;
                            if (str10 != null) {
                                oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                            }
                            oooO00o.OooO0O0(i26);
                            oooO00o.f11244OooOO0O = str3;
                            oooO00o.f11245OooOO0o = i6;
                            oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                            oooO00o.f11238OooO0Oo = i21111110;
                            oooO00o.f11247OooOOO0 = list4;
                            oooO00o.f11242OooO0oo = str7;
                            oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                            OooOo oooOoOooO00o117 = oooO00o.OooO00o();
                            TrackOutput trackOutputOooOOO117 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                            oooO0O6.f11950OoooOOo = trackOutputOooOOO117;
                            trackOutputOooOOO117.OooO0OO(oooOoOooO00o117);
                            sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                            matroskaExtractor = matroskaExtractor2;
                            oooO0O0 = null;
                        }
                        break;
                    case 23:
                        oooO0O6 = oooO0O6;
                        int i43 = oooO0O6.f11933Oooo;
                        if (i43 == 8) {
                            iOooOo00 = 3;
                        } else if (i43 != 16) {
                            Log.OooO0o("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + oooO0O6.f11933Oooo + ". Setting mimeType to audio/x-unknown");
                            i2 = 1;
                            i3 = 3;
                            str13 = "audio/x-unknown";
                            listSingletonList = null;
                            str5 = null;
                            str8 = str5;
                            list = listSingletonList;
                            str2 = str13;
                            i5 = -1;
                            str7 = str8;
                            list4 = list;
                            i6 = i5;
                            str3 = str2;
                            iOooOo00 = -1;
                            if (oooO0O6.f11942Oooo0oO != null) {
                                str7 = o00o0oooOooO00o.f40751OooO00o;
                                str3 = "video/dolby-vision";
                            }
                            int i21111111 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                            if (oooO0O6.f11948OoooOO0) {
                                i7 = 2;
                            } else {
                                i7 = 0;
                            }
                            int i21111112 = i21111111 | i7;
                            oooO00o = new OooOo.OooO00o();
                            if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                oooO00o.f11258OooOoO = iOooOo00;
                            } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                if (oooO0O6.f11919OooOOo0 == 0) {
                                    i12 = oooO0O6.f11916OooOOOO;
                                    i8 = -1;
                                    if (i12 == -1) {
                                        i12 = oooO0O6.f11915OooOOO0;
                                    }
                                    oooO0O6.f11916OooOOOO = i12;
                                    i13 = oooO0O6.f11917OooOOOo;
                                    if (i13 == -1) {
                                        i13 = oooO0O6.f11914OooOOO;
                                    }
                                    oooO0O6.f11917OooOOOo = i13;
                                } else {
                                    i8 = -1;
                                }
                                i9 = oooO0O6.f11916OooOOOO;
                                if (i9 != i8) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (oooO0O6.f11921OooOo) {
                                    if (oooO0O6.f11931OooOooO != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                } else {
                                    o00o0oo2 = null;
                                }
                                str9 = oooO0O6.f11903OooO00o;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f11845Oooooo;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                    } else {
                                        iIntValue = i8;
                                    }
                                } else {
                                    iIntValue = i8;
                                }
                                if (oooO0O6.f11918OooOOo == 0) {
                                    i10 = iIntValue;
                                } else {
                                    i10 = iIntValue;
                                }
                                oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                oooO00o.f11255OooOo00 = f;
                                oooO00o.f11252OooOOoo = i10;
                                oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                oooO00o.f11257OooOo0o = o00o0oo2;
                                i2 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i2 = i3;
                            }
                            str10 = oooO0O6.f11903OooO00o;
                            if (str10 != null) {
                                oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                            }
                            oooO00o.OooO0O0(i26);
                            oooO00o.f11244OooOO0O = str3;
                            oooO00o.f11245OooOO0o = i6;
                            oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                            oooO00o.f11238OooO0Oo = i21111112;
                            oooO00o.f11247OooOOO0 = list4;
                            oooO00o.f11242OooO0oo = str7;
                            oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                            OooOo oooOoOooO00o118 = oooO00o.OooO00o();
                            TrackOutput trackOutputOooOOO118 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                            oooO0O6.f11950OoooOOo = trackOutputOooOOO118;
                            trackOutputOooOOO118.OooO0OO(oooOoOooO00o118);
                            sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                            matroskaExtractor = matroskaExtractor2;
                            oooO0O0 = null;
                        } else {
                            iOooOo00 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                        i2 = 1;
                        i3 = 3;
                        str3 = "audio/raw";
                        list3 = null;
                        str6 = null;
                        str7 = str6;
                        list4 = list3;
                        i6 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i21111113 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i21111114 = i21111113 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i21111114;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o119 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO119 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO119;
                        trackOutputOooOOO119.OooO0OO(oooOoOooO00o119);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 24:
                        oooO0O6 = oooO0O6;
                        iOooOo00 = o0O00.OooOo00(oooO0O6.f11933Oooo);
                        if (iOooOo00 == 0) {
                            Log.OooO0o("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + oooO0O6.f11933Oooo + ". Setting mimeType to audio/x-unknown");
                            i2 = 1;
                            i3 = 3;
                            str13 = "audio/x-unknown";
                            listSingletonList = null;
                            str5 = null;
                            str8 = str5;
                            list = listSingletonList;
                            str2 = str13;
                            i5 = -1;
                            str7 = str8;
                            list4 = list;
                            i6 = i5;
                            str3 = str2;
                            iOooOo00 = -1;
                            if (oooO0O6.f11942Oooo0oO != null) {
                                str7 = o00o0oooOooO00o.f40751OooO00o;
                                str3 = "video/dolby-vision";
                            }
                            int i21111115 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                            if (oooO0O6.f11948OoooOO0) {
                                i7 = 2;
                            } else {
                                i7 = 0;
                            }
                            int i21111116 = i21111115 | i7;
                            oooO00o = new OooOo.OooO00o();
                            if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                                oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                                oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                                oooO00o.f11258OooOoO = iOooOo00;
                            } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                                if (oooO0O6.f11919OooOOo0 == 0) {
                                    i12 = oooO0O6.f11916OooOOOO;
                                    i8 = -1;
                                    if (i12 == -1) {
                                        i12 = oooO0O6.f11915OooOOO0;
                                    }
                                    oooO0O6.f11916OooOOOO = i12;
                                    i13 = oooO0O6.f11917OooOOOo;
                                    if (i13 == -1) {
                                        i13 = oooO0O6.f11914OooOOO;
                                    }
                                    oooO0O6.f11917OooOOOo = i13;
                                } else {
                                    i8 = -1;
                                }
                                i9 = oooO0O6.f11916OooOOOO;
                                if (i9 != i8) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (oooO0O6.f11921OooOo) {
                                    if (oooO0O6.f11931OooOooO != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                                } else {
                                    o00o0oo2 = null;
                                }
                                str9 = oooO0O6.f11903OooO00o;
                                if (str9 != null) {
                                    map = MatroskaExtractor.f11845Oooooo;
                                    if (map.containsKey(str9)) {
                                        iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                    } else {
                                        iIntValue = i8;
                                    }
                                } else {
                                    iIntValue = i8;
                                }
                                if (oooO0O6.f11918OooOOo == 0) {
                                    i10 = iIntValue;
                                } else {
                                    i10 = iIntValue;
                                }
                                oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                                oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                                oooO00o.f11255OooOo00 = f;
                                oooO00o.f11252OooOOoo = i10;
                                oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                                oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                                oooO00o.f11257OooOo0o = o00o0oo2;
                                i2 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i2 = i3;
                            }
                            str10 = oooO0O6.f11903OooO00o;
                            if (str10 != null) {
                                oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                            }
                            oooO00o.OooO0O0(i26);
                            oooO00o.f11244OooOO0O = str3;
                            oooO00o.f11245OooOO0o = i6;
                            oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                            oooO00o.f11238OooO0Oo = i21111116;
                            oooO00o.f11247OooOOO0 = list4;
                            oooO00o.f11242OooO0oo = str7;
                            oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                            OooOo oooOoOooO00o1110 = oooO00o.OooO00o();
                            TrackOutput trackOutputOooOOO1110 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                            oooO0O6.f11950OoooOOo = trackOutputOooOOO1110;
                            trackOutputOooOOO1110.OooO0OO(oooOoOooO00o1110);
                            sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                            matroskaExtractor = matroskaExtractor2;
                            oooO0O0 = null;
                        }
                        i2 = 1;
                        i3 = 3;
                        str3 = "audio/raw";
                        list3 = null;
                        str6 = null;
                        str7 = str6;
                        list4 = list3;
                        i6 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i21111117 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i21111118 = i21111117 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i21111118;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1111 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1111 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1111;
                        trackOutputOooOOO1111.OooO0OO(oooOoOooO00o1111);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 25:
                        oooO0O6 = oooO0O6;
                        byte[] bArrOooO00o2 = oooO0O6.OooO00o(oooO0O6.f11904OooO0O0);
                        byte[] bArr8 = MatroskaExtractor.f11842OooooO0;
                        ImmutableList.OooO0O0 oooO0O7 = ImmutableList.f19157OooO0o0;
                        Object[] objArr = {bArr8, bArrOooO00o2};
                        o0.OooO00o(2, objArr);
                        listOooOOOo = ImmutableList.OooO(2, objArr);
                        str13 = "text/x-ssa";
                        list2 = listOooOOOo;
                        listSingletonList = list2;
                        i2 = 1;
                        i3 = 3;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i21111119 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211111110 = i21111119 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211111110;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1112 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1112 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1112;
                        trackOutputOooOOO1112.OooO0OO(oooOoOooO00o1112);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 26:
                        oooO0O6 = oooO0O6;
                        o00O o00oOooO00o = o00O.OooO00o(new o00Oo00(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0)));
                        oooO0O6.f11951OoooOo0 = o00oOooO00o.f40734OooO0O0;
                        str3 = "video/hevc";
                        list3 = o00oOooO00o.f40733OooO00o;
                        str4 = o00oOooO00o.f40739OooO0oO;
                        str6 = str4;
                        iOooOo00 = -1;
                        i2 = 1;
                        i3 = 3;
                        str7 = str6;
                        list4 = list3;
                        i6 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211111111 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211111112 = i211111111 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211111112;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1113 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1113 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1113;
                        trackOutputOooOOO1113.OooO0OO(oooOoOooO00o1113);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 27:
                        str13 = "text/vtt";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211111113 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211111114 = i211111113 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211111114;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1114 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1114 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1114;
                        trackOutputOooOOO1114.OooO0OO(oooOoOooO00o1114);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 28:
                        str13 = "application/x-subrip";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211111115 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211111116 = i211111115 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211111116;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1115 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1115 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1115;
                        trackOutputOooOOO1115.OooO0OO(oooOoOooO00o1115);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 29:
                        str13 = "video/mpeg2";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211111117 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i211111118 = i211111117 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i211111118;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1116 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1116 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1116;
                        trackOutputOooOOO1116.OooO0OO(oooOoOooO00o1116);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 30:
                        str13 = "audio/eac3";
                        i3 = 3;
                        i2 = 1;
                        listSingletonList = null;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i211111119 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2111111110 = i211111119 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2111111110;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1117 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1117 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1117;
                        trackOutputOooOOO1117.OooO0OO(oooOoOooO00o1117);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 31:
                        oooO0O6 = oooO0O6;
                        listOooOOOo = Collections.singletonList(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0));
                        str13 = "audio/flac";
                        list2 = listOooOOOo;
                        listSingletonList = list2;
                        i2 = 1;
                        i3 = 3;
                        str5 = null;
                        str8 = str5;
                        list = listSingletonList;
                        str2 = str13;
                        i5 = -1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i2111111111 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2111111112 = i2111111111 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2111111112;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1118 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1118 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1118;
                        trackOutputOooOOO1118.OooO0OO(oooOoOooO00o1118);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    case 32:
                        arrayList = new ArrayList(3);
                        oooO0O6 = oooO0O6;
                        arrayList.add(oooO0O6.OooO00o(oooO0O6.f11904OooO0O0));
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        arrayList.add(byteBufferAllocate.order(byteOrder).putLong(oooO0O6.f11945OoooO0).array());
                        arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(oooO0O6.f11947OoooO0O).array());
                        str = "audio/opus";
                        i4 = 5760;
                        i3 = 3;
                        int i44 = i4;
                        list = arrayList;
                        str2 = str;
                        i5 = i44;
                        str8 = null;
                        i2 = 1;
                        str7 = str8;
                        list4 = list;
                        i6 = i5;
                        str3 = str2;
                        iOooOo00 = -1;
                        if (oooO0O6.f11942Oooo0oO != null) {
                            str7 = o00o0oooOooO00o.f40751OooO00o;
                            str3 = "video/dolby-vision";
                        }
                        int i2111111113 = (oooO0O6.f11952o000oOoO ? 1 : 0) | 0;
                        if (oooO0O6.f11948OoooOO0) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        int i2111111114 = i2111111113 | i7;
                        oooO00o = new OooOo.OooO00o();
                        if (p245o00oo0o.o00OO0OO.OooOO0(str3)) {
                            oooO00o.f11253OooOo = oooO0O6.f11943Oooo0oo;
                            oooO00o.f11259OooOoO0 = oooO0O6.f11946OoooO00;
                            oooO00o.f11258OooOoO = iOooOo00;
                        } else if (p245o00oo0o.o00OO0OO.OooOO0o(str3)) {
                            if (oooO0O6.f11919OooOOo0 == 0) {
                                i12 = oooO0O6.f11916OooOOOO;
                                i8 = -1;
                                if (i12 == -1) {
                                    i12 = oooO0O6.f11915OooOOO0;
                                }
                                oooO0O6.f11916OooOOOO = i12;
                                i13 = oooO0O6.f11917OooOOOo;
                                if (i13 == -1) {
                                    i13 = oooO0O6.f11914OooOOO;
                                }
                                oooO0O6.f11917OooOOOo = i13;
                            } else {
                                i8 = -1;
                            }
                            i9 = oooO0O6.f11916OooOOOO;
                            if (i9 != i8) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (oooO0O6.f11921OooOo) {
                                if (oooO0O6.f11931OooOooO != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                o00o0oo2 = new o00O0OO(oooO0O6.f11927OooOoO0, bArr, oooO0O6.f11928OooOoOO, oooO0O6.f11926OooOoO);
                            } else {
                                o00o0oo2 = null;
                            }
                            str9 = oooO0O6.f11903OooO00o;
                            if (str9 != null) {
                                map = MatroskaExtractor.f11845Oooooo;
                                if (map.containsKey(str9)) {
                                    iIntValue = map.get(oooO0O6.f11903OooO00o).intValue();
                                } else {
                                    iIntValue = i8;
                                }
                            } else {
                                iIntValue = i8;
                            }
                            if (oooO0O6.f11918OooOOo == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            oooO00o.f11249OooOOOo = oooO0O6.f11915OooOOO0;
                            oooO00o.f11251OooOOo0 = oooO0O6.f11914OooOOO;
                            oooO00o.f11255OooOo00 = f;
                            oooO00o.f11252OooOOoo = i10;
                            oooO00o.f11254OooOo0 = oooO0O6.f11924OooOo0O;
                            oooO00o.f11256OooOo0O = oooO0O6.f11925OooOo0o;
                            oooO00o.f11257OooOo0o = o00o0oo2;
                            i2 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i2 = i3;
                        }
                        str10 = oooO0O6.f11903OooO00o;
                        if (str10 != null) {
                            oooO00o.f11236OooO0O0 = oooO0O6.f11903OooO00o;
                        }
                        oooO00o.OooO0O0(i26);
                        oooO00o.f11244OooOO0O = str3;
                        oooO00o.f11245OooOO0o = i6;
                        oooO00o.f11237OooO0OO = oooO0O6.f11949OoooOOO;
                        oooO00o.f11238OooO0Oo = i2111111114;
                        oooO00o.f11247OooOOO0 = list4;
                        oooO00o.f11242OooO0oo = str7;
                        oooO00o.f11246OooOOO = oooO0O6.f11913OooOO0o;
                        OooOo oooOoOooO00o1119 = oooO00o.OooO00o();
                        TrackOutput trackOutputOooOOO1119 = o00o0o1.OooOOO(oooO0O6.f11905OooO0OO, i2);
                        oooO0O6.f11950OoooOOo = trackOutputOooOOO1119;
                        trackOutputOooOOO1119.OooO0OO(oooOoOooO00o1119);
                        sparseArray.put(oooO0O6.f11905OooO0OO, oooO0O6);
                        matroskaExtractor = matroskaExtractor2;
                        oooO0O0 = null;
                        break;
                    default:
                        throw ParserException.OooO00o("Unrecognized codec identifier.", null);
                }
            } else {
                oooO0O0 = null;
                matroskaExtractor = matroskaExtractor2;
            }
            matroskaExtractor.f11867OooOo0 = oooO0O0;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte[] f11902OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f11903OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f11904OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f11905OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f11906OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f11907OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f11908OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f11909OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f11910OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public TrackOutput.OooO00o f11911OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public byte[] f11912OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public DrmInitData f11913OooOO0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public byte[] f11942Oooo0oO;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public OooO0OO f11944OoooO;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public boolean f11948OoooOO0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public TrackOutput f11950OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public int f11951OoooOo0;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f11915OooOOO0 = -1;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f11914OooOOO = -1;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f11916OooOOOO = -1;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f11917OooOOOo = -1;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f11919OooOOo0 = 0;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f11918OooOOo = -1;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public float f11920OooOOoo = 0.0f;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public float f11923OooOo00 = 0.0f;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public float f11922OooOo0 = 0.0f;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public byte[] f11924OooOo0O = null;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f11925OooOo0o = -1;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f11921OooOo = false;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f11927OooOoO0 = -1;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f11926OooOoO = -1;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f11928OooOoOO = -1;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f11930OooOoo0 = 1000;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f11929OooOoo = 200;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public float f11931OooOooO = -1.0f;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public float f11932OooOooo = -1.0f;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public float f11935Oooo000 = -1.0f;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public float f11936Oooo00O = -1.0f;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public float f11937Oooo00o = -1.0f;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public float f11934Oooo0 = -1.0f;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public float f11938Oooo0O0 = -1.0f;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public float f11939Oooo0OO = -1.0f;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public float f11941Oooo0o0 = -1.0f;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public float f11940Oooo0o = -1.0f;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f11943Oooo0oo = 1;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f11933Oooo = -1;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f11946OoooO00 = 8000;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public long f11945OoooO0 = 0;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public long f11947OoooO0O = 0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public boolean f11952o000oOoO = true;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public String f11949OoooOOO = "eng";

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] OooO00o(String str) throws ParserException {
            byte[] bArr = this.f11912OooOO0O;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.OooO00o("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        HashMap map = new HashMap();
        com.app.base.protobuf.OooO0OO.OooO0OO(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f11845Oooooo = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor(int i) {
        OooOO0 oooOO1 = new OooOO0();
        this.f11864OooOOo0 = -1L;
        this.f11863OooOOo = -9223372036854775807L;
        this.f11865OooOOoo = -9223372036854775807L;
        this.f11868OooOo00 = -9223372036854775807L;
        this.f11871OooOoO = -1L;
        this.f11873OooOoOO = -1L;
        this.f11875OooOoo0 = -9223372036854775807L;
        this.f11848OooO00o = oooOO1;
        oooOO1.f39626OooO0Oo = new OooO00o();
        this.f11851OooO0Oo = (i & 1) == 0;
        this.f11849OooO0O0 = new OooOOO();
        this.f11850OooO0OO = new SparseArray<>();
        this.f11854OooO0oO = new o00Oo00(4);
        this.f11855OooO0oo = new o00Oo00(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11847OooO = new o00Oo00(4);
        this.f11853OooO0o0 = new o00Oo00(oo0O.f40640OooO00o);
        this.f11852OooO0o = new o00Oo00(4);
        this.f11856OooOO0 = new o00Oo00();
        this.f11857OooOO0O = new o00Oo00();
        this.f11858OooOO0o = new o00Oo00(8);
        this.f11860OooOOO0 = new o00Oo00();
        this.f11859OooOOO = new o00Oo00();
        this.f11886Oooo0o0 = new int[1];
    }

    public static byte[] OooO0o(long j, long j2, String str) {
        o00O000o.OooO00o(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((((long) i) * 3600) * AnimationKt.MillisToNanos);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((((long) i2) * 60) * AnimationKt.MillisToNanos);
        int i3 = (int) (j4 / AnimationKt.MillisToNanos);
        return o0O00.OooOoo0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * AnimationKt.MillisToNanos)) / j2))));
    }

    public final void OooO(o00O00o0 o00o00o1, int i) throws IOException {
        o00Oo00 o00oo00 = this.f11854OooO0oO;
        if (o00oo00.f40593OooO0OO >= i) {
            return;
        }
        byte[] bArr = o00oo00.f40591OooO00o;
        if (bArr.length < i) {
            o00oo00.OooO00o(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = o00oo00.f40591OooO00o;
        int i2 = o00oo00.f40593OooO0OO;
        o00o00o1.OooO0oO(bArr2, i2, i - i2, false);
        o00oo00.Oooo000(i);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void OooO00o(int i) throws ParserException {
        if (this.f11874OooOoo == null || this.f11876OooOooO == null) {
            throw ParserException.OooO00o("Element " + i + " must be in a Cues", null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @CallSuper
    public final void OooO0O0(long j, long j2) {
        this.f11875OooOoo0 = -9223372036854775807L;
        this.f11881Oooo00O = 0;
        OooOO0 oooOO1 = (OooOO0) this.f11848OooO00o;
        oooOO1.f39628OooO0o0 = 0;
        oooOO1.f39624OooO0O0.clear();
        OooOOO oooOOO = oooOO1.f39625OooO0OO;
        oooOOO.f39634OooO0O0 = 0;
        oooOOO.f39635OooO0OO = 0;
        OooOOO oooOOO2 = this.f11849OooO0O0;
        oooOOO2.f39634OooO0O0 = 0;
        oooOOO2.f39635OooO0OO = 0;
        OooOO0();
        int i = 0;
        while (true) {
            SparseArray<OooO0O0> sparseArray = this.f11850OooO0OO;
            if (i >= sparseArray.size()) {
                return;
            }
            OooO0OO oooO0OO = sparseArray.valueAt(i).f11944OoooO;
            if (oooO0OO != null) {
                oooO0OO.f11786OooO0O0 = false;
                oooO0OO.f11787OooO0OO = 0;
            }
            i++;
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void OooO0OO(int i) throws ParserException {
        if (this.f11867OooOo0 != null) {
            return;
        }
        throw ParserException.OooO00o("Element " + i + " must be in a TrackEntry", null);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        OooOOO0 oooOOO0 = new OooOOO0();
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        long j = o00o00o1.f39531OooO0OO;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        o00Oo00 o00oo00 = oooOOO0.f39636OooO00o;
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 4, false);
        oooOOO0.f39637OooO0O0 = 4;
        for (long jOooOo0o = o00oo00.OooOo0o(); jOooOo0o != 440786851; jOooOo0o = ((jOooOo0o << 8) & (-256)) | ((long) (o00oo00.f40591OooO00o[0] & UByte.MAX_VALUE))) {
            int i2 = oooOOO0.f39637OooO0O0 + 1;
            oooOOO0.f39637OooO0O0 = i2;
            if (i2 == i) {
                return false;
            }
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 1, false);
        }
        long jOooO00o = oooOOO0.OooO00o(o00o00o1);
        long j3 = oooOOO0.f39637OooO0O0;
        if (jOooO00o == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jOooO00o >= j) {
            return false;
        }
        while (true) {
            long j4 = oooOOO0.f39637OooO0O0;
            long j5 = j3 + jOooO00o;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (oooOOO0.OooO00o(o00o00o1) == Long.MIN_VALUE) {
                return false;
            }
            long jOooO00o2 = oooOOO0.OooO00o(o00o00o1);
            if (jOooO00o2 < 0 || jOooO00o2 > 2147483647L) {
                return false;
            }
            if (jOooO00o2 != 0) {
                int i3 = (int) jOooO00o2;
                o00o00o1.OooOO0o(i3, false);
                oooOOO0.f39637OooO0O0 += i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    @RequiresNonNull({"#1.output"})
    public final void OooO0o0(OooO0O0 oooO0O0, long j, int i, int i2, int i3) {
        byte b;
        byte[] bArrOooO0o;
        int i4;
        int i5;
        OooO0OO oooO0OO = oooO0O0.f11944OoooO;
        if (oooO0OO != null) {
            oooO0OO.OooO0O0(oooO0O0.f11950OoooOOo, j, i, i2, i3, oooO0O0.f11911OooOO0);
        } else {
            if ("S_TEXT/UTF8".equals(oooO0O0.f11904OooO0O0) || "S_TEXT/ASS".equals(oooO0O0.f11904OooO0O0) || "S_TEXT/WEBVTT".equals(oooO0O0.f11904OooO0O0)) {
                if (this.f11884Oooo0OO > 1) {
                    Log.OooO0o("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f11879Oooo0;
                    if (j2 == -9223372036854775807L) {
                        Log.OooO0o("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = oooO0O0.f11904OooO0O0;
                        o00Oo00 o00oo00 = this.f11857OooOO0O;
                        byte[] bArr = o00oo00.f40591OooO00o;
                        str.getClass();
                        int iHashCode = str.hashCode();
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            bArrOooO0o = OooO0o(j2, 10000L, "%01d:%02d:%02d:%02d");
                            i4 = 21;
                        } else if (b == 1) {
                            bArrOooO0o = OooO0o(j2, 1000L, "%02d:%02d:%02d.%03d");
                            i4 = 25;
                        } else {
                            if (b != 2) {
                                throw new IllegalArgumentException();
                            }
                            bArrOooO0o = OooO0o(j2, 1000L, "%02d:%02d:%02d,%03d");
                            i4 = 19;
                        }
                        System.arraycopy(bArrOooO0o, 0, bArr, i4, bArrOooO0o.length);
                        for (int i6 = o00oo00.f40592OooO0O0; i6 < o00oo00.f40593OooO0OO; i6++) {
                            if (o00oo00.f40591OooO00o[i6] == 0) {
                                o00oo00.Oooo000(i6);
                                break;
                            }
                        }
                        oooO0O0.f11950OoooOOo.OooO0O0(o00oo00.f40593OooO0OO, o00oo00);
                        i5 = i2 + o00oo00.f40593OooO0OO;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & SQLiteDatabase.CREATE_IF_NECESSARY) != 0) {
                int i7 = this.f11884Oooo0OO;
                o00Oo00 o00oo01 = this.f11859OooOOO;
                if (i7 > 1) {
                    o00oo01.OooOooO(0);
                } else {
                    int i8 = o00oo01.f40593OooO0OO;
                    oooO0O0.f11950OoooOOo.OooO0Oo(i8, o00oo01);
                    i5 += i8;
                }
            }
            oooO0O0.f11950OoooOOo.OooO0o0(j, i, i5, i3, oooO0O0.f11911OooOO0);
        }
        this.f11880Oooo000 = true;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x03be  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:187:0x03f7 A[LOOP:6: B:184:0x03dc->B:187:0x03f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x0403  */
    /* JADX WARN: Code duplicated, block: B:191:0x0406  */
    /* JADX WARN: Code duplicated, block: B:194:0x040e  */
    /* JADX WARN: Code duplicated, block: B:196:0x041f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0424  */
    /* JADX WARN: Code duplicated, block: B:202:0x0446 A[LOOP:9: B:201:0x0444->B:202:0x0446, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0466  */
    /* JADX WARN: Code duplicated, block: B:207:0x0475 A[LOOP:8: B:197:0x0422->B:207:0x0475, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:483:0x04f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x04af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x09c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x09c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x04b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x047f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [int] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v129, types: [int] */
    /* JADX WARN: Type inference failed for: r2v152, types: [int] */
    /* JADX WARN: Type inference failed for: r2v196 */
    /* JADX WARN: Type inference failed for: r2v197 */
    /* JADX WARN: Type inference failed for: r2v198 */
    /* JADX WARN: Type inference failed for: r2v199 */
    /* JADX WARN: Type inference failed for: r2v200 */
    /* JADX WARN: Type inference failed for: r2v201 */
    /* JADX WARN: Type inference failed for: r2v202 */
    /* JADX WARN: Type inference failed for: r2v203 */
    /* JADX WARN: Type inference failed for: r2v204 */
    /* JADX WARN: Type inference failed for: r2v205 */
    /* JADX WARN: Type inference failed for: r2v206 */
    /* JADX WARN: Type inference failed for: r2v207 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        int i;
        int i2;
        String str;
        ?? r2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ?? r3;
        int i8;
        o00Oo00 o00oo00;
        int i9;
        ?? r13;
        char c;
        o00O00o0 o00o00o1;
        o00Oo00 o00oo01;
        long j;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j2;
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.f11880Oooo000 = false;
        boolean z4 = true;
        boolean z5 = true;
        while (true) {
            byte b = -1;
            if (z5 && !this.f11880Oooo000) {
                OooOO0 oooOO1 = (OooOO0) this.f11848OooO00o;
                o00O000o.OooO0o0(oooOO1.f39626OooO0Oo);
                boolean z6 = z3;
                while (true) {
                    ArrayDeque<OooOO0.OooO00o> arrayDeque = oooOO1.f39624OooO0O0;
                    OooOO0.OooO00o oooO00oPeek = arrayDeque.peek();
                    if (oooO00oPeek == null || ((o00O00o0) o00o0o01).f39532OooO0Oo < oooO00oPeek.f39631OooO0O0) {
                        int i19 = oooOO1.f39628OooO0o0;
                        char c2 = '\b';
                        int i20 = 4;
                        byte[] bArr = oooOO1.f39623OooO00o;
                        OooOOO oooOOO = oooOO1.f39625OooO0OO;
                        if (i19 == 0) {
                            o00O00o0 o00o00o2 = (o00O00o0) o00o0o01;
                            long jOooO0O0 = oooOOO.OooO0O0(o00o00o2, z4, z6, 4);
                            if (jOooO0O0 == -2) {
                                o00o00o2.f39533OooO0o = z6 ? 1 : 0;
                                while (true) {
                                    o00o00o2.OooO0Oo(bArr, z6 ? 1 : 0, i20, z6);
                                    byte b2 = bArr[z6 ? 1 : 0];
                                    int i21 = z6 ? 1 : 0;
                                    while (true) {
                                        if (i21 < c2) {
                                            long j3 = OooOOO.f39632OooO0Oo[i21] & ((long) b2);
                                            i21++;
                                            if (j3 == 0) {
                                                c2 = '\b';
                                            }
                                        } else {
                                            i21 = b;
                                        }
                                    }
                                    if (i21 != b && i21 <= 4) {
                                        int iOooO00o = (int) OooOOO.OooO00o(bArr, i21, z6);
                                        MatroskaExtractor.this.getClass();
                                        if ((iOooO00o == 357149030 || iOooO00o == 524531317 || iOooO00o == 475249515 || iOooO00o == 374648427) ? true : z6 ? 1 : 0) {
                                            o00o00o2.OooOO0(i21);
                                            j2 = iOooO00o;
                                            z4 = true;
                                        }
                                    }
                                    o00o00o2.OooOO0(1);
                                    c2 = '\b';
                                    i20 = 4;
                                }
                            } else {
                                j2 = jOooO0O0;
                            }
                            if (j2 == -1) {
                                z = z6 ? 1 : 0;
                            } else {
                                oooOO1.f39627OooO0o = (int) j2;
                                oooOO1.f39628OooO0o0 = z4 ? 1 : 0;
                            }
                        }
                        if (oooOO1.f39628OooO0o0 == z4) {
                            oooOO1.f39629OooO0oO = oooOOO.OooO0O0((o00O00o0) o00o0o01, z6, z4, 8);
                            oooOO1.f39628OooO0o0 = 2;
                        }
                        EbmlProcessor ebmlProcessor = oooOO1.f39626OooO0Oo;
                        int i22 = oooOO1.f39627OooO0o;
                        MatroskaExtractor.this.getClass();
                        switch (i22) {
                            case 131:
                            case 136:
                            case Constants.ERR_PUBLISH_STREAM_NOT_FOUND /* 155 */:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i = 3;
                                break;
                            case Constants.ERR_ALREADY_IN_RECORDING /* 160 */:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i = 5;
                                break;
                            default:
                                i = z6 ? 1 : 0;
                                break;
                        }
                        if (i == 0) {
                            ((o00O00o0) o00o0o01).OooOO0((int) oooOO1.f39629OooO0oO);
                            oooOO1.f39628OooO0o0 = 0;
                            b = -1;
                            z4 = true;
                            z6 = false;
                        } else if (i == 1) {
                            long j4 = ((o00O00o0) o00o0o01).f39532OooO0Oo;
                            arrayDeque.push(new OooOO0.OooO00o(oooOO1.f39627OooO0o, oooOO1.f39629OooO0oO + j4));
                            EbmlProcessor ebmlProcessor2 = oooOO1.f39626OooO0Oo;
                            int i23 = oooOO1.f39627OooO0o;
                            long j5 = oooOO1.f39629OooO0oO;
                            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
                            o00O000o.OooO0o0(matroskaExtractor.f11899Ooooo00);
                            if (i23 == 160) {
                                i2 = 0;
                                matroskaExtractor.f11891OoooO00 = false;
                                matroskaExtractor.f11890OoooO0 = 0L;
                            } else if (i23 == 174) {
                                i2 = 0;
                                matroskaExtractor.f11867OooOo0 = new OooO0O0();
                            } else if (i23 != 187) {
                                if (i23 == 19899) {
                                    matroskaExtractor.f11870OooOo0o = -1;
                                    matroskaExtractor.f11866OooOo = -1L;
                                } else if (i23 == 20533) {
                                    matroskaExtractor.OooO0OO(i23);
                                    matroskaExtractor.f11867OooOo0.f11910OooO0oo = true;
                                } else if (i23 == 21968) {
                                    matroskaExtractor.OooO0OO(i23);
                                    matroskaExtractor.f11867OooOo0.f11921OooOo = true;
                                } else if (i23 == 408125543) {
                                    long j6 = matroskaExtractor.f11864OooOOo0;
                                    if (j6 != -1 && j6 != j4) {
                                        throw ParserException.OooO00o("Multiple Segment elements not supported", null);
                                    }
                                    matroskaExtractor.f11864OooOOo0 = j4;
                                    matroskaExtractor.f11862OooOOOo = j5;
                                } else if (i23 == 475249515) {
                                    matroskaExtractor.f11874OooOoo = new o00OO000();
                                    matroskaExtractor.f11876OooOooO = new o00OO000();
                                } else if (i23 == 524531317 && !matroskaExtractor.f11869OooOo0O) {
                                    if (!matroskaExtractor.f11851OooO0Oo || matroskaExtractor.f11871OooOoO == -1) {
                                        matroskaExtractor.f11899Ooooo00.OooO0O0(new o00OO0OO.OooO0O0(matroskaExtractor.f11868OooOo00));
                                        matroskaExtractor.f11869OooOo0O = true;
                                    } else {
                                        matroskaExtractor.f11872OooOoO0 = true;
                                    }
                                }
                                i2 = 0;
                            } else {
                                i2 = 0;
                                matroskaExtractor.f11877OooOooo = false;
                            }
                            oooOO1.f39628OooO0o0 = i2;
                        } else if (i == 2) {
                            long j7 = oooOO1.f39629OooO0oO;
                            if (j7 > 8) {
                                throw ParserException.OooO00o("Invalid integer size: " + oooOO1.f39629OooO0oO, null);
                            }
                            EbmlProcessor ebmlProcessor3 = oooOO1.f39626OooO0Oo;
                            int i24 = oooOO1.f39627OooO0o;
                            int i25 = (int) j7;
                            ((o00O00o0) o00o0o01).OooO0oO(bArr, 0, i25, false);
                            long j8 = 0;
                            for (int i26 = 0; i26 < i25; i26++) {
                                j8 = (j8 << 8) | ((long) (bArr[i26] & UByte.MAX_VALUE));
                            }
                            MatroskaExtractor matroskaExtractor2 = MatroskaExtractor.this;
                            matroskaExtractor2.getClass();
                            if (i24 != 20529) {
                                if (i24 != 20530) {
                                    switch (i24) {
                                        case 131:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11906OooO0Oo = (int) j8;
                                            break;
                                        case 136:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11952o000oOoO = j8 == 1;
                                            break;
                                        case Constants.ERR_PUBLISH_STREAM_NOT_FOUND /* 155 */:
                                            matroskaExtractor2.f11879Oooo0 = matroskaExtractor2.OooOO0O(j8);
                                            break;
                                        case 159:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11943Oooo0oo = (int) j8;
                                            break;
                                        case 176:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11915OooOOO0 = (int) j8;
                                            break;
                                        case 179:
                                            matroskaExtractor2.OooO00o(i24);
                                            matroskaExtractor2.f11874OooOoo.OooO00o(matroskaExtractor2.OooOO0O(j8));
                                            break;
                                        case 186:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11914OooOOO = (int) j8;
                                            break;
                                        case 215:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11905OooO0OO = (int) j8;
                                            break;
                                        case 231:
                                            matroskaExtractor2.f11875OooOoo0 = matroskaExtractor2.OooOO0O(j8);
                                            break;
                                        case 238:
                                            matroskaExtractor2.f11878Oooo = (int) j8;
                                            break;
                                        case 241:
                                            if (!matroskaExtractor2.f11877OooOooo) {
                                                matroskaExtractor2.OooO00o(i24);
                                                matroskaExtractor2.f11876OooOooO.OooO00o(j8);
                                                matroskaExtractor2.f11877OooOooo = true;
                                            }
                                            break;
                                        case 251:
                                            matroskaExtractor2.f11891OoooO00 = true;
                                            break;
                                        case 16871:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11909OooO0oO = (int) j8;
                                            break;
                                        case 16980:
                                            if (j8 != 3) {
                                                throw ParserException.OooO00o("ContentCompAlgo " + j8 + " not supported", null);
                                            }
                                            break;
                                        case 17029:
                                            if (j8 < 1 || j8 > 2) {
                                                throw ParserException.OooO00o("DocTypeReadVersion " + j8 + " not supported", null);
                                            }
                                            break;
                                        case 17143:
                                            if (j8 != 1) {
                                                throw ParserException.OooO00o("EBMLReadVersion " + j8 + " not supported", null);
                                            }
                                            break;
                                        case 18401:
                                            if (j8 != 5) {
                                                throw ParserException.OooO00o("ContentEncAlgo " + j8 + " not supported", null);
                                            }
                                            break;
                                        case 18408:
                                            if (j8 != 1) {
                                                throw ParserException.OooO00o("AESSettingsCipherMode " + j8 + " not supported", null);
                                            }
                                            break;
                                        case 21420:
                                            matroskaExtractor2.f11866OooOo = j8 + matroskaExtractor2.f11864OooOOo0;
                                            break;
                                        case 21432:
                                            int i27 = (int) j8;
                                            matroskaExtractor2.OooO0OO(i24);
                                            if (i27 == 0) {
                                                matroskaExtractor2.f11867OooOo0.f11925OooOo0o = 0;
                                            } else if (i27 == 1) {
                                                matroskaExtractor2.f11867OooOo0.f11925OooOo0o = 2;
                                            } else if (i27 == 3) {
                                                matroskaExtractor2.f11867OooOo0.f11925OooOo0o = 1;
                                            } else if (i27 == 15) {
                                                matroskaExtractor2.f11867OooOo0.f11925OooOo0o = 3;
                                            }
                                            break;
                                        case 21680:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11916OooOOOO = (int) j8;
                                            break;
                                        case 21682:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11919OooOOo0 = (int) j8;
                                            break;
                                        case 21690:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11917OooOOOo = (int) j8;
                                            break;
                                        case 21930:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11948OoooOO0 = j8 == 1;
                                            break;
                                        case 21998:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11907OooO0o = (int) j8;
                                            break;
                                        case 22186:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11945OoooO0 = j8;
                                            break;
                                        case 22203:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11947OoooO0O = j8;
                                            break;
                                        case 25188:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11933Oooo = (int) j8;
                                            break;
                                        case 30114:
                                            matroskaExtractor2.f11890OoooO0 = j8;
                                            break;
                                        case 30321:
                                            matroskaExtractor2.OooO0OO(i24);
                                            int i28 = (int) j8;
                                            if (i28 == 0) {
                                                matroskaExtractor2.f11867OooOo0.f11918OooOOo = 0;
                                            } else if (i28 == 1) {
                                                matroskaExtractor2.f11867OooOo0.f11918OooOOo = 1;
                                            } else if (i28 == 2) {
                                                matroskaExtractor2.f11867OooOo0.f11918OooOOo = 2;
                                            } else if (i28 == 3) {
                                                matroskaExtractor2.f11867OooOo0.f11918OooOOo = 3;
                                            }
                                            break;
                                        case 2352003:
                                            matroskaExtractor2.OooO0OO(i24);
                                            matroskaExtractor2.f11867OooOo0.f11908OooO0o0 = (int) j8;
                                            break;
                                        case 2807729:
                                            matroskaExtractor2.f11863OooOOo = j8;
                                            break;
                                        default:
                                            switch (i24) {
                                                case 21945:
                                                    matroskaExtractor2.OooO0OO(i24);
                                                    int i29 = (int) j8;
                                                    if (i29 == 1) {
                                                        matroskaExtractor2.f11867OooOo0.f11928OooOoOO = 2;
                                                    } else if (i29 == 2) {
                                                        matroskaExtractor2.f11867OooOo0.f11928OooOoOO = 1;
                                                    }
                                                    break;
                                                case 21946:
                                                    matroskaExtractor2.OooO0OO(i24);
                                                    int iOooO0OO = o00O0OO.OooO0OO((int) j8);
                                                    if (iOooO0OO != -1) {
                                                        matroskaExtractor2.f11867OooOo0.f11926OooOoO = iOooO0OO;
                                                    }
                                                    break;
                                                case 21947:
                                                    matroskaExtractor2.OooO0OO(i24);
                                                    matroskaExtractor2.f11867OooOo0.f11921OooOo = true;
                                                    int iOooO0O0 = o00O0OO.OooO0O0((int) j8);
                                                    if (iOooO0O0 != -1) {
                                                        matroskaExtractor2.f11867OooOo0.f11927OooOoO0 = iOooO0O0;
                                                    }
                                                    break;
                                                case 21948:
                                                    matroskaExtractor2.OooO0OO(i24);
                                                    matroskaExtractor2.f11867OooOo0.f11930OooOoo0 = (int) j8;
                                                    break;
                                                case 21949:
                                                    matroskaExtractor2.OooO0OO(i24);
                                                    matroskaExtractor2.f11867OooOo0.f11929OooOoo = (int) j8;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (j8 != 1) {
                                    throw ParserException.OooO00o("ContentEncodingScope " + j8 + " not supported", null);
                                }
                            } else if (j8 != 0) {
                                throw ParserException.OooO00o("ContentEncodingOrder " + j8 + " not supported", null);
                            }
                            oooOO1.f39628OooO0o0 = 0;
                        } else if (i == 3) {
                            long j9 = oooOO1.f39629OooO0oO;
                            if (j9 > 2147483647L) {
                                throw ParserException.OooO00o("String element size: " + oooOO1.f39629OooO0oO, null);
                            }
                            EbmlProcessor ebmlProcessor4 = oooOO1.f39626OooO0Oo;
                            int i30 = oooOO1.f39627OooO0o;
                            int i31 = (int) j9;
                            if (i31 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i31];
                                ((o00O00o0) o00o0o01).OooO0oO(bArr2, 0, i31, false);
                                while (i31 > 0) {
                                    int i32 = i31 - 1;
                                    if (bArr2[i32] == 0) {
                                        i31 = i32;
                                    } else {
                                        str = new String(bArr2, 0, i31);
                                    }
                                }
                                str = new String(bArr2, 0, i31);
                            }
                            MatroskaExtractor matroskaExtractor3 = MatroskaExtractor.this;
                            matroskaExtractor3.getClass();
                            if (i30 == 134) {
                                matroskaExtractor3.OooO0OO(i30);
                                matroskaExtractor3.f11867OooOo0.f11904OooO0O0 = str;
                            } else if (i30 != 17026) {
                                if (i30 == 21358) {
                                    matroskaExtractor3.OooO0OO(i30);
                                    matroskaExtractor3.f11867OooOo0.f11903OooO00o = str;
                                } else if (i30 == 2274716) {
                                    matroskaExtractor3.OooO0OO(i30);
                                    matroskaExtractor3.f11867OooOo0.f11949OoooOOO = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw ParserException.OooO00o("DocType " + str + " not supported", null);
                            }
                            oooOO1.f39628OooO0o0 = 0;
                        } else if (i == 4) {
                            EbmlProcessor ebmlProcessor5 = oooOO1.f39626OooO0Oo;
                            int i33 = oooOO1.f39627OooO0o;
                            int i34 = (int) oooOO1.f39629OooO0oO;
                            MatroskaExtractor matroskaExtractor4 = MatroskaExtractor.this;
                            SparseArray<OooO0O0> sparseArray = matroskaExtractor4.f11850OooO0OO;
                            if (i33 == 161 || i33 == 163) {
                                int i35 = matroskaExtractor4.f11881Oooo00O;
                                o00Oo00 o00oo02 = matroskaExtractor4.f11854OooO0oO;
                                if (i35 == 0) {
                                    OooOOO oooOOO2 = matroskaExtractor4.f11849OooO0O0;
                                    matroskaExtractor4.f11885Oooo0o = (int) oooOOO2.OooO0O0((o00O00o0) o00o0o01, z6, true, 8);
                                    matroskaExtractor4.f11887Oooo0oO = oooOOO2.f39635OooO0OO;
                                    matroskaExtractor4.f11879Oooo0 = -9223372036854775807L;
                                    matroskaExtractor4.f11881Oooo00O = 1;
                                    o00oo02.OooOooO(z6 ? 1 : 0);
                                }
                                OooO0O0 oooO0O0 = sparseArray.get(matroskaExtractor4.f11885Oooo0o);
                                if (oooO0O0 == null) {
                                    ((o00O00o0) o00o0o01).OooOO0(i34 - matroskaExtractor4.f11887Oooo0oO);
                                    matroskaExtractor4.f11881Oooo00O = z6 ? 1 : 0;
                                    r2 = z6;
                                } else {
                                    oooO0O0.f11950OoooOOo.getClass();
                                    if (matroskaExtractor4.f11881Oooo00O == 1) {
                                        o00O00o0 o00o00o3 = (o00O00o0) o00o0o01;
                                        matroskaExtractor4.OooO(o00o00o3, 3);
                                        int i36 = (o00oo02.f40591OooO00o[2] & 6) >> 1;
                                        if (i36 == 0) {
                                            matroskaExtractor4.f11884Oooo0OO = 1;
                                            int[] iArr = matroskaExtractor4.f11886Oooo0o0;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else if (iArr.length < 1) {
                                                iArr = new int[Math.max(iArr.length * 2, 1)];
                                            }
                                            matroskaExtractor4.f11886Oooo0o0 = iArr;
                                            iArr[z6 ? 1 : 0] = (i34 - matroskaExtractor4.f11887Oooo0oO) - 3;
                                        } else {
                                            matroskaExtractor4.OooO(o00o00o3, 4);
                                            int i37 = (o00oo02.f40591OooO00o[3] & 255) + 1;
                                            matroskaExtractor4.f11884Oooo0OO = i37;
                                            int[] iArr2 = matroskaExtractor4.f11886Oooo0o0;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i37];
                                            } else {
                                                if (iArr2.length < i37) {
                                                    i3 = 2;
                                                    iArr2 = new int[Math.max(iArr2.length * 2, i37)];
                                                }
                                                matroskaExtractor4.f11886Oooo0o0 = iArr2;
                                                if (i36 == i3) {
                                                    int i38 = (i34 - matroskaExtractor4.f11887Oooo0oO) - 4;
                                                    int i39 = matroskaExtractor4.f11884Oooo0OO;
                                                    Arrays.fill(iArr2, z6 ? 1 : 0, i39, i38 / i39);
                                                } else {
                                                    i4 = 4;
                                                    i5 = 1;
                                                    if (i36 == 1) {
                                                        i13 = z6 ? 1 : 0;
                                                        i14 = i13;
                                                        while (true) {
                                                            i15 = matroskaExtractor4.f11884Oooo0OO - 1;
                                                            if (i13 < i15) {
                                                                matroskaExtractor4.f11886Oooo0o0[i13] = z6 ? 1 : 0;
                                                                while (true) {
                                                                    i4 += i5;
                                                                    matroskaExtractor4.OooO(o00o00o3, i4);
                                                                    i16 = o00oo02.f40591OooO00o[i4 - 1] & UByte.MAX_VALUE;
                                                                    int[] iArr3 = matroskaExtractor4.f11886Oooo0o0;
                                                                    i17 = iArr3[i13] + i16;
                                                                    iArr3[i13] = i17;
                                                                    if (i16 != 255) {
                                                                        break;
                                                                    }
                                                                    i5 = 1;
                                                                }
                                                                i14 += i17;
                                                                i13++;
                                                                i5 = 1;
                                                            } else {
                                                                matroskaExtractor4.f11886Oooo0o0[i15] = ((i34 - matroskaExtractor4.f11887Oooo0oO) - i4) - i14;
                                                            }
                                                        }
                                                    } else {
                                                        if (i36 == 3) {
                                                            throw ParserException.OooO00o("Unexpected lacing value: " + i36, null);
                                                        }
                                                        i6 = z6 ? 1 : 0;
                                                        i7 = i6;
                                                        r3 = z6;
                                                        while (true) {
                                                            i8 = matroskaExtractor4.f11884Oooo0OO - 1;
                                                            if (i6 < i8) {
                                                                matroskaExtractor4.f11886Oooo0o0[i6] = r3;
                                                                i4++;
                                                                matroskaExtractor4.OooO(o00o00o3, i4);
                                                                i9 = i4 - 1;
                                                                if (o00oo02.f40591OooO00o[i9] != 0) {
                                                                    throw ParserException.OooO00o("No valid varint length mask found", null);
                                                                }
                                                                r13 = r3;
                                                                c = '\b';
                                                                while (true) {
                                                                    if (r13 < c) {
                                                                        i10 = 1 << (7 - r13);
                                                                        if ((o00oo02.f40591OooO00o[i9] & i10) != 0) {
                                                                            i11 = i4 + r13;
                                                                            matroskaExtractor4.OooO(o00o00o3, i11);
                                                                            int i40 = i9 + 1;
                                                                            o00oo01 = o00oo02;
                                                                            j = (~i10) & o00oo02.f40591OooO00o[i9] & UByte.MAX_VALUE;
                                                                            i12 = i40;
                                                                            while (i12 < i11) {
                                                                                j = (j << 8) | ((long) (o00oo01.f40591OooO00o[i12] & UByte.MAX_VALUE));
                                                                                o00o00o3 = o00o00o3;
                                                                                i12++;
                                                                                i11 = i11;
                                                                            }
                                                                            o00o00o1 = o00o00o3;
                                                                            int i41 = i11;
                                                                            if (i6 > 0) {
                                                                                j -= (1 << ((r13 * 7) + 6)) - 1;
                                                                            }
                                                                            i4 = i41;
                                                                        } else {
                                                                            c = '\b';
                                                                            r13++;
                                                                        }
                                                                    } else {
                                                                        o00o00o1 = o00o00o3;
                                                                        o00oo01 = o00oo02;
                                                                        j = 0;
                                                                    }
                                                                }
                                                                if (j >= -2147483648L || j > 2147483647L) {
                                                                    throw ParserException.OooO00o("EBML lacing sample size out of range.", null);
                                                                }
                                                                int i42 = (int) j;
                                                                int[] iArr4 = matroskaExtractor4.f11886Oooo0o0;
                                                                if (i6 != 0) {
                                                                    i42 += iArr4[i6 - 1];
                                                                }
                                                                iArr4[i6] = i42;
                                                                i7 += i42;
                                                                i6++;
                                                                o00oo02 = o00oo01;
                                                                o00o00o3 = o00o00o1;
                                                                r3 = 0;
                                                            } else {
                                                                o00oo00 = o00oo02;
                                                                matroskaExtractor4.f11886Oooo0o0[i8] = ((i34 - matroskaExtractor4.f11887Oooo0oO) - i4) - i7;
                                                            }
                                                        }
                                                    }
                                                    byte[] bArr3 = o00oo00.f40591OooO00o;
                                                    matroskaExtractor4.f11882Oooo00o = matroskaExtractor4.OooOO0O((bArr3[1] & UByte.MAX_VALUE) | (bArr3[0] << 8)) + matroskaExtractor4.f11875OooOoo0;
                                                    if (oooO0O0.f11906OooO0Oo != 2 || (i33 == 163 && (o00oo00.f40591OooO00o[2] & ByteCompanionObject.MIN_VALUE) == 128)) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = 0;
                                                    }
                                                    matroskaExtractor4.f11888Oooo0oo = i18;
                                                    matroskaExtractor4.f11881Oooo00O = 2;
                                                    matroskaExtractor4.f11883Oooo0O0 = 0;
                                                }
                                            }
                                            i3 = 2;
                                            matroskaExtractor4.f11886Oooo0o0 = iArr2;
                                            if (i36 == i3) {
                                                int i310 = (i34 - matroskaExtractor4.f11887Oooo0oO) - 4;
                                                int i311 = matroskaExtractor4.f11884Oooo0OO;
                                                Arrays.fill(iArr2, z6 ? 1 : 0, i311, i310 / i311);
                                            } else {
                                                i4 = 4;
                                                i5 = 1;
                                                if (i36 == 1) {
                                                    i13 = z6 ? 1 : 0;
                                                    i14 = i13;
                                                    while (true) {
                                                        i15 = matroskaExtractor4.f11884Oooo0OO - 1;
                                                        if (i13 < i15) {
                                                            matroskaExtractor4.f11886Oooo0o0[i13] = z6 ? 1 : 0;
                                                            while (true) {
                                                                i4 += i5;
                                                                matroskaExtractor4.OooO(o00o00o3, i4);
                                                                i16 = o00oo02.f40591OooO00o[i4 - 1] & UByte.MAX_VALUE;
                                                                int[] iArr5 = matroskaExtractor4.f11886Oooo0o0;
                                                                i17 = iArr5[i13] + i16;
                                                                iArr5[i13] = i17;
                                                                if (i16 != 255) {
                                                                    break;
                                                                }
                                                                i5 = 1;
                                                            }
                                                            i14 += i17;
                                                            i13++;
                                                            i5 = 1;
                                                        } else {
                                                            matroskaExtractor4.f11886Oooo0o0[i15] = ((i34 - matroskaExtractor4.f11887Oooo0oO) - i4) - i14;
                                                        }
                                                    }
                                                } else {
                                                    if (i36 == 3) {
                                                        throw ParserException.OooO00o("Unexpected lacing value: " + i36, null);
                                                    }
                                                    i6 = z6 ? 1 : 0;
                                                    i7 = i6;
                                                    r3 = z6;
                                                    while (true) {
                                                        i8 = matroskaExtractor4.f11884Oooo0OO - 1;
                                                        if (i6 < i8) {
                                                            matroskaExtractor4.f11886Oooo0o0[i6] = r3;
                                                            i4++;
                                                            matroskaExtractor4.OooO(o00o00o3, i4);
                                                            i9 = i4 - 1;
                                                            if (o00oo02.f40591OooO00o[i9] != 0) {
                                                                throw ParserException.OooO00o("No valid varint length mask found", null);
                                                            }
                                                            r13 = r3;
                                                            c = '\b';
                                                            while (true) {
                                                                if (r13 < c) {
                                                                    i10 = 1 << (7 - r13);
                                                                    if ((o00oo02.f40591OooO00o[i9] & i10) != 0) {
                                                                        i11 = i4 + r13;
                                                                        matroskaExtractor4.OooO(o00o00o3, i11);
                                                                        int i43 = i9 + 1;
                                                                        o00oo01 = o00oo02;
                                                                        j = (~i10) & o00oo02.f40591OooO00o[i9] & UByte.MAX_VALUE;
                                                                        i12 = i43;
                                                                        while (i12 < i11) {
                                                                            j = (j << 8) | ((long) (o00oo01.f40591OooO00o[i12] & UByte.MAX_VALUE));
                                                                            o00o00o3 = o00o00o3;
                                                                            i12++;
                                                                            i11 = i11;
                                                                        }
                                                                        o00o00o1 = o00o00o3;
                                                                        int i44 = i11;
                                                                        if (i6 > 0) {
                                                                            j -= (1 << ((r13 * 7) + 6)) - 1;
                                                                        }
                                                                        i4 = i44;
                                                                    } else {
                                                                        c = '\b';
                                                                        r13++;
                                                                    }
                                                                } else {
                                                                    o00o00o1 = o00o00o3;
                                                                    o00oo01 = o00oo02;
                                                                    j = 0;
                                                                }
                                                            }
                                                            if (j >= -2147483648L) {
                                                            }
                                                            throw ParserException.OooO00o("EBML lacing sample size out of range.", null);
                                                        }
                                                        o00oo00 = o00oo02;
                                                        matroskaExtractor4.f11886Oooo0o0[i8] = ((i34 - matroskaExtractor4.f11887Oooo0oO) - i4) - i7;
                                                        iArr4[i6] = i42;
                                                        i7 += i42;
                                                        i6++;
                                                        o00oo02 = o00oo01;
                                                        o00o00o3 = o00o00o1;
                                                        r3 = 0;
                                                    }
                                                }
                                                byte[] bArr4 = o00oo00.f40591OooO00o;
                                                matroskaExtractor4.f11882Oooo00o = matroskaExtractor4.OooOO0O((bArr4[1] & UByte.MAX_VALUE) | (bArr4[0] << 8)) + matroskaExtractor4.f11875OooOoo0;
                                                if (oooO0O0.f11906OooO0Oo != 2) {
                                                    i18 = 1;
                                                } else {
                                                    i18 = 1;
                                                }
                                                matroskaExtractor4.f11888Oooo0oo = i18;
                                                matroskaExtractor4.f11881Oooo00O = 2;
                                                matroskaExtractor4.f11883Oooo0O0 = 0;
                                            }
                                        }
                                        o00oo00 = o00oo02;
                                        byte[] bArr5 = o00oo00.f40591OooO00o;
                                        matroskaExtractor4.f11882Oooo00o = matroskaExtractor4.OooOO0O((bArr5[1] & UByte.MAX_VALUE) | (bArr5[0] << 8)) + matroskaExtractor4.f11875OooOoo0;
                                        if (oooO0O0.f11906OooO0Oo != 2) {
                                            i18 = 1;
                                        } else {
                                            i18 = 1;
                                        }
                                        matroskaExtractor4.f11888Oooo0oo = i18;
                                        matroskaExtractor4.f11881Oooo00O = 2;
                                        matroskaExtractor4.f11883Oooo0O0 = 0;
                                    }
                                    if (i33 == 163) {
                                        while (true) {
                                            int i45 = matroskaExtractor4.f11883Oooo0O0;
                                            if (i45 < matroskaExtractor4.f11884Oooo0OO) {
                                                matroskaExtractor4.OooO0o0(oooO0O0, ((long) ((matroskaExtractor4.f11883Oooo0O0 * oooO0O0.f11908OooO0o0) / 1000)) + matroskaExtractor4.f11882Oooo00o, matroskaExtractor4.f11888Oooo0oo, matroskaExtractor4.OooOO0o((o00O00o0) o00o0o01, oooO0O0, matroskaExtractor4.f11886Oooo0o0[i45], false), 0);
                                                matroskaExtractor4.f11883Oooo0O0++;
                                            } else {
                                                r2 = 0;
                                                matroskaExtractor4.f11881Oooo00O = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            int i46 = matroskaExtractor4.f11883Oooo0O0;
                                            if (i46 < matroskaExtractor4.f11884Oooo0OO) {
                                                int[] iArr6 = matroskaExtractor4.f11886Oooo0o0;
                                                iArr6[i46] = matroskaExtractor4.OooOO0o((o00O00o0) o00o0o01, oooO0O0, iArr6[i46], true);
                                                matroskaExtractor4.f11883Oooo0O0++;
                                            } else {
                                                r2 = 0;
                                            }
                                        }
                                    }
                                }
                            } else if (i33 != 165) {
                                if (i33 == 16877) {
                                    matroskaExtractor4.OooO0OO(i33);
                                    OooO0O0 oooO0O1 = matroskaExtractor4.f11867OooOo0;
                                    int i47 = oooO0O1.f11909OooO0oO;
                                    if (i47 == 1685485123 || i47 == 1685480259) {
                                        byte[] bArr6 = new byte[i34];
                                        oooO0O1.f11942Oooo0oO = bArr6;
                                        ((o00O00o0) o00o0o01).OooO0oO(bArr6, z6 ? 1 : 0, i34, z6);
                                        r2 = z6;
                                    } else {
                                        ((o00O00o0) o00o0o01).OooOO0(i34);
                                        r2 = z6;
                                    }
                                } else if (i33 == 16981) {
                                    matroskaExtractor4.OooO0OO(i33);
                                    byte[] bArr7 = new byte[i34];
                                    matroskaExtractor4.f11867OooOo0.f11902OooO = bArr7;
                                    ((o00O00o0) o00o0o01).OooO0oO(bArr7, z6 ? 1 : 0, i34, z6);
                                    r2 = z6;
                                } else if (i33 == 18402) {
                                    byte[] bArr8 = new byte[i34];
                                    ((o00O00o0) o00o0o01).OooO0oO(bArr8, z6 ? 1 : 0, i34, z6);
                                    matroskaExtractor4.OooO0OO(i33);
                                    matroskaExtractor4.f11867OooOo0.f11911OooOO0 = new TrackOutput.OooO00o(1, bArr8, z6 ? 1 : 0, z6 ? 1 : 0);
                                    r2 = z6;
                                } else if (i33 == 21419) {
                                    o00Oo00 o00oo03 = matroskaExtractor4.f11847OooO;
                                    Arrays.fill(o00oo03.f40591OooO00o, z6 ? (byte) 1 : (byte) 0);
                                    ((o00O00o0) o00o0o01).OooO0oO(o00oo03.f40591OooO00o, 4 - i34, i34, z6);
                                    o00oo03.Oooo00O(z6 ? 1 : 0);
                                    matroskaExtractor4.f11870OooOo0o = (int) o00oo03.OooOo0o();
                                    r2 = z6;
                                } else if (i33 == 25506) {
                                    matroskaExtractor4.OooO0OO(i33);
                                    byte[] bArr9 = new byte[i34];
                                    matroskaExtractor4.f11867OooOo0.f11912OooOO0O = bArr9;
                                    ((o00O00o0) o00o0o01).OooO0oO(bArr9, z6 ? 1 : 0, i34, z6);
                                    r2 = z6;
                                } else {
                                    if (i33 != 30322) {
                                        throw ParserException.OooO00o("Unexpected id: " + i33, null);
                                    }
                                    matroskaExtractor4.OooO0OO(i33);
                                    byte[] bArr10 = new byte[i34];
                                    matroskaExtractor4.f11867OooOo0.f11924OooOo0O = bArr10;
                                    ((o00O00o0) o00o0o01).OooO0oO(bArr10, z6 ? 1 : 0, i34, z6);
                                    r2 = z6;
                                }
                            } else if (matroskaExtractor4.f11881Oooo00O == 2) {
                                OooO0O0 oooO0O2 = sparseArray.get(matroskaExtractor4.f11885Oooo0o);
                                if (matroskaExtractor4.f11878Oooo == 4 && "V_VP9".equals(oooO0O2.f11904OooO0O0)) {
                                    r2 = z6;
                                    o00Oo00 o00oo04 = matroskaExtractor4.f11859OooOOO;
                                    o00oo04.OooOooO(i34);
                                    ((o00O00o0) o00o0o01).OooO0oO(o00oo04.f40591OooO00o, z6 ? 1 : 0, i34, z6);
                                    r2 = z6;
                                } else {
                                    r2 = z6;
                                    r2 = z6;
                                    ((o00O00o0) o00o0o01).OooOO0(i34);
                                    r2 = z6;
                                }
                            }
                            r2 = z6;
                            oooOO1.f39628OooO0o0 = r2;
                        } else {
                            if (i != 5) {
                                throw ParserException.OooO00o("Invalid element type " + i, null);
                            }
                            long j10 = oooOO1.f39629OooO0oO;
                            if (j10 != 4 && j10 != 8) {
                                throw ParserException.OooO00o("Invalid float size: " + oooOO1.f39629OooO0oO, null);
                            }
                            EbmlProcessor ebmlProcessor6 = oooOO1.f39626OooO0Oo;
                            int i48 = oooOO1.f39627OooO0o;
                            int i49 = (int) j10;
                            ((o00O00o0) o00o0o01).OooO0oO(bArr, z6 ? 1 : 0, i49, z6);
                            long j11 = 0;
                            for (int i50 = z6 ? 1 : 0; i50 < i49; i50++) {
                                j11 = (j11 << 8) | ((long) (bArr[i50] & UByte.MAX_VALUE));
                            }
                            double dIntBitsToFloat = i49 == 4 ? Float.intBitsToFloat((int) j11) : Double.longBitsToDouble(j11);
                            MatroskaExtractor matroskaExtractor5 = MatroskaExtractor.this;
                            if (i48 == 181) {
                                matroskaExtractor5.OooO0OO(i48);
                                matroskaExtractor5.f11867OooOo0.f11946OoooO00 = (int) dIntBitsToFloat;
                            } else if (i48 != 17545) {
                                switch (i48) {
                                    case 21969:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11931OooOooO = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11932OooOooo = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11935Oooo000 = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11936Oooo00O = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11937Oooo00o = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11934Oooo0 = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11938Oooo0O0 = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11939Oooo0OO = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11941Oooo0o0 = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        matroskaExtractor5.OooO0OO(i48);
                                        matroskaExtractor5.f11867OooOo0.f11940Oooo0o = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i48) {
                                            case 30323:
                                                matroskaExtractor5.OooO0OO(i48);
                                                matroskaExtractor5.f11867OooOo0.f11920OooOOoo = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                matroskaExtractor5.OooO0OO(i48);
                                                matroskaExtractor5.f11867OooOo0.f11923OooOo00 = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                matroskaExtractor5.OooO0OO(i48);
                                                matroskaExtractor5.f11867OooOo0.f11922OooOo0 = (float) dIntBitsToFloat;
                                                break;
                                            default:
                                                matroskaExtractor5.getClass();
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                matroskaExtractor5.f11865OooOOoo = (long) dIntBitsToFloat;
                            }
                            oooOO1.f39628OooO0o0 = z6 ? 1 : 0;
                        }
                    } else {
                        ((OooO00o) oooOO1.f39626OooO0Oo).OooO00o(arrayDeque.pop().f39630OooO00o);
                    }
                    z = true;
                }
                if (z) {
                    long j12 = ((o00O00o0) o00o0o01).f39532OooO0Oo;
                    if (this.f11872OooOoO0) {
                        this.f11873OooOoOO = j12;
                        o00oo0o1.f39548OooO00o = this.f11871OooOoO;
                        this.f11872OooOoO0 = false;
                    } else {
                        if (this.f11869OooOo0O) {
                            long j13 = this.f11873OooOoOO;
                            if (j13 != -1) {
                                o00oo0o1.f39548OooO00o = j13;
                                this.f11873OooOoOO = -1L;
                            }
                            if (z2) {
                                return 1;
                            }
                        }
                        z2 = false;
                        if (z2) {
                            return 1;
                        }
                    }
                    z2 = true;
                    if (z2) {
                        return 1;
                    }
                }
                z4 = true;
                z3 = false;
                z5 = z;
            }
        }
        if (z5) {
            return 0;
        }
        int i51 = 0;
        while (true) {
            SparseArray<OooO0O0> sparseArray2 = this.f11850OooO0OO;
            if (i51 >= sparseArray2.size()) {
                return -1;
            }
            OooO0O0 oooO0O0ValueAt = sparseArray2.valueAt(i51);
            oooO0O0ValueAt.f11950OoooOOo.getClass();
            OooO0OO oooO0OO = oooO0O0ValueAt.f11944OoooO;
            if (oooO0OO != null) {
                oooO0OO.OooO00o(oooO0O0ValueAt.f11950OoooOOo, oooO0O0ValueAt.f11911OooOO0);
            }
            i51++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f11899Ooooo00 = o00o0o0;
    }

    public final void OooOO0() {
        this.f11892OoooO0O = 0;
        this.f11889OoooO = 0;
        this.f11893OoooOO0 = 0;
        this.f11900o000oOoO = false;
        this.f11894OoooOOO = false;
        this.f11895OoooOOo = false;
        this.f11896OoooOo0 = 0;
        this.f11897OoooOoO = (byte) 0;
        this.f11898OoooOoo = false;
        this.f11856OooOO0.OooOooO(0);
    }

    public final long OooOO0O(long j) throws ParserException {
        long j2 = this.f11863OooOOo;
        if (j2 != -9223372036854775807L) {
            return o0O00.Oooo0oo(j, j2, 1000L);
        }
        throw ParserException.OooO00o("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @RequiresNonNull({"#2.output"})
    public final int OooOO0o(o00O00o0 o00o00o1, OooO0O0 oooO0O0, int i, boolean z) throws IOException {
        int iOooO00o;
        int iOooO00o2;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(oooO0O0.f11904OooO0O0)) {
            OooOOO0(o00o00o1, f11841Ooooo0o, i);
            int i3 = this.f11889OoooO;
            OooOO0();
            return i3;
        }
        if ("S_TEXT/ASS".equals(oooO0O0.f11904OooO0O0)) {
            OooOOO0(o00o00o1, f11843OooooOO, i);
            int i4 = this.f11889OoooO;
            OooOO0();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(oooO0O0.f11904OooO0O0)) {
            OooOOO0(o00o00o1, f11844OooooOo, i);
            int i5 = this.f11889OoooO;
            OooOO0();
            return i5;
        }
        TrackOutput trackOutput = oooO0O0.f11950OoooOOo;
        boolean z3 = this.f11900o000oOoO;
        o00Oo00 o00oo00 = this.f11856OooOO0;
        if (!z3) {
            boolean z4 = oooO0O0.f11910OooO0oo;
            o00Oo00 o00oo01 = this.f11854OooO0oO;
            if (z4) {
                this.f11888Oooo0oo &= -1073741825;
                if (!this.f11894OoooOOO) {
                    o00o00o1.OooO0oO(o00oo01.f40591OooO00o, 0, 1, false);
                    this.f11892OoooO0O++;
                    byte b = o00oo01.f40591OooO00o[0];
                    if ((b & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw ParserException.OooO00o("Extension bit is set in signal byte", null);
                    }
                    this.f11897OoooOoO = b;
                    this.f11894OoooOOO = true;
                }
                byte b2 = this.f11897OoooOoO;
                if ((b2 & 1) == 1) {
                    boolean z5 = (b2 & 2) == 2;
                    this.f11888Oooo0oo |= Pow2.MAX_POW2;
                    if (!this.f11898OoooOoo) {
                        o00Oo00 o00oo02 = this.f11858OooOO0o;
                        o00o00o1.OooO0oO(o00oo02.f40591OooO00o, 0, 8, false);
                        this.f11892OoooO0O += 8;
                        this.f11898OoooOoo = true;
                        o00oo01.f40591OooO00o[0] = (byte) ((z5 ? 128 : 0) | 8);
                        o00oo01.Oooo00O(0);
                        trackOutput.OooO0Oo(1, o00oo01);
                        this.f11889OoooO++;
                        o00oo02.Oooo00O(0);
                        trackOutput.OooO0Oo(8, o00oo02);
                        this.f11889OoooO += 8;
                    }
                    if (z5) {
                        if (!this.f11895OoooOOo) {
                            o00o00o1.OooO0oO(o00oo01.f40591OooO00o, 0, 1, false);
                            this.f11892OoooO0O++;
                            o00oo01.Oooo00O(0);
                            this.f11896OoooOo0 = o00oo01.OooOo0O();
                            this.f11895OoooOOo = true;
                        }
                        int i6 = this.f11896OoooOo0 * 4;
                        o00oo01.OooOooO(i6);
                        o00o00o1.OooO0oO(o00oo01.f40591OooO00o, 0, i6, false);
                        this.f11892OoooO0O += i6;
                        short s = (short) ((this.f11896OoooOo0 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f11861OooOOOO;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f11861OooOOOO = ByteBuffer.allocate(i7);
                        }
                        this.f11861OooOOOO.position(0);
                        this.f11861OooOOOO.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f11896OoooOo0;
                            if (i8 >= i2) {
                                break;
                            }
                            int iOooOoO0 = o00oo01.OooOoO0();
                            if (i8 % 2 == 0) {
                                this.f11861OooOOOO.putShort((short) (iOooOoO0 - i9));
                            } else {
                                this.f11861OooOOOO.putInt(iOooOoO0 - i9);
                            }
                            i8++;
                            i9 = iOooOoO0;
                        }
                        int i10 = (i - this.f11892OoooO0O) - i9;
                        if (i2 % 2 == 1) {
                            this.f11861OooOOOO.putInt(i10);
                        } else {
                            this.f11861OooOOOO.putShort((short) i10);
                            this.f11861OooOOOO.putInt(0);
                        }
                        byte[] bArrArray = this.f11861OooOOOO.array();
                        o00Oo00 o00oo03 = this.f11860OooOOO0;
                        o00oo03.OooOooo(i7, bArrArray);
                        trackOutput.OooO0Oo(i7, o00oo03);
                        this.f11889OoooO += i7;
                    }
                }
            } else {
                byte[] bArr = oooO0O0.f11902OooO;
                if (bArr != null) {
                    o00oo00.OooOooo(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(oooO0O0.f11904OooO0O0)) {
                z2 = z;
            } else {
                z2 = oooO0O0.f11907OooO0o > 0;
            }
            if (z2) {
                this.f11888Oooo0oo |= SQLiteDatabase.CREATE_IF_NECESSARY;
                this.f11859OooOOO.OooOooO(0);
                int i11 = (o00oo00.f40593OooO0OO + i) - this.f11892OoooO0O;
                o00oo01.OooOooO(4);
                byte[] bArr2 = o00oo01.f40591OooO00o;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                trackOutput.OooO0Oo(4, o00oo01);
                this.f11889OoooO += 4;
            }
            this.f11900o000oOoO = true;
        }
        int i12 = i + o00oo00.f40593OooO0OO;
        if (!"V_MPEG4/ISO/AVC".equals(oooO0O0.f11904OooO0O0) && !"V_MPEGH/ISO/HEVC".equals(oooO0O0.f11904OooO0O0)) {
            if (oooO0O0.f11944OoooO != null) {
                o00O000o.OooO0Oo(o00oo00.f40593OooO0OO == 0);
                oooO0O0.f11944OoooO.OooO0OO(o00o00o1);
            }
            while (true) {
                int i13 = this.f11892OoooO0O;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int i15 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
                if (i15 > 0) {
                    iOooO00o2 = Math.min(i14, i15);
                    trackOutput.OooO0O0(iOooO00o2, o00oo00);
                } else {
                    iOooO00o2 = trackOutput.OooO00o(o00o00o1, i14, false);
                }
                this.f11892OoooO0O += iOooO00o2;
                this.f11889OoooO += iOooO00o2;
            }
        } else {
            o00Oo00 o00oo04 = this.f11852OooO0o;
            byte[] bArr3 = o00oo04.f40591OooO00o;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i16 = oooO0O0.f11951OoooOo0;
            int i17 = 4 - i16;
            while (this.f11892OoooO0O < i12) {
                int i18 = this.f11893OoooOO0;
                if (i18 == 0) {
                    int iMin = Math.min(i16, o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0);
                    o00o00o1.OooO0oO(bArr3, i17 + iMin, i16 - iMin, false);
                    if (iMin > 0) {
                        o00oo00.OooO0Oo(i17, iMin, bArr3);
                    }
                    this.f11892OoooO0O += i16;
                    o00oo04.Oooo00O(0);
                    this.f11893OoooOO0 = o00oo04.OooOoO0();
                    o00Oo00 o00oo05 = this.f11853OooO0o0;
                    o00oo05.Oooo00O(0);
                    trackOutput.OooO0O0(4, o00oo05);
                    this.f11889OoooO += 4;
                } else {
                    int i19 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
                    if (i19 > 0) {
                        iOooO00o = Math.min(i18, i19);
                        trackOutput.OooO0O0(iOooO00o, o00oo00);
                    } else {
                        iOooO00o = trackOutput.OooO00o(o00o00o1, i18, false);
                    }
                    this.f11892OoooO0O += iOooO00o;
                    this.f11889OoooO += iOooO00o;
                    this.f11893OoooOO0 -= iOooO00o;
                }
            }
        }
        if ("A_VORBIS".equals(oooO0O0.f11904OooO0O0)) {
            o00Oo00 o00oo06 = this.f11855OooO0oo;
            o00oo06.Oooo00O(0);
            trackOutput.OooO0O0(4, o00oo06);
            this.f11889OoooO += 4;
        }
        int i20 = this.f11889OoooO;
        OooOO0();
        return i20;
    }

    public final void OooOOO0(o00O00o0 o00o00o1, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        o00Oo00 o00oo00 = this.f11857OooOO0O;
        byte[] bArr2 = o00oo00.f40591OooO00o;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            o00oo00.OooOooo(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        o00o00o1.OooO0oO(o00oo00.f40591OooO00o, bArr.length, i, false);
        o00oo00.Oooo00O(0);
        o00oo00.Oooo000(length);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
