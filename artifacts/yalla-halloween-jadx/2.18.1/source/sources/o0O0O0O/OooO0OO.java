package o0O0O0O;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.google.accompanist.pager.ExperimentalPagerApi;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import net.sqlcipher.database.SQLiteDatabase;
import o0000O0O.OooOo;
import o0000O0O.Oooo000;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p031OoooO.OooOo00;
import p031OoooO.o000Oo0;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    public static final class OooO00o extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f35333Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0000O0O.OooO, OooOo> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f35334Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f35335Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f35336Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f35337Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f35338OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super Integer, Integer> function1, OooOO0 oooOO1, int i, int i2, int i3) {
            super(1);
            this.f35335Oooo0o = function1;
            this.f35336Oooo0oO = oooOO1;
            this.f35337Oooo0oo = i;
            this.f35334Oooo = i2;
            this.f35338OoooO00 = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final OooOo invoke(o0000O0O.OooO oooO) {
            o0000O0O.OooO offset = oooO;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            int iIntValue = this.f35335Oooo0o.invoke(Integer.valueOf(this.f35336Oooo0oO.OooO0o0())).intValue();
            float fOooO0oO = this.f35336Oooo0oO.OooO0oO();
            return new OooOo(Oooo000.OooO00o((int) ((this.f35334Oooo + this.f35338OoooO00) * RangesKt.coerceIn((Math.abs(fOooO0oO) * (this.f35335Oooo0o.invoke(Integer.valueOf(this.f35336Oooo0oO.OooO0o0() + ((int) Math.signum(fOooO0oO)))).intValue() - iIntValue)) + iIntValue, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, RangesKt.coerceAtLeast(this.f35337Oooo0oo - 1, 0))), 0));
        }
    }

    /* JADX INFO: renamed from: o0O0O0O.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0364OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f35339Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f35340Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f35341Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f35342Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ float f35343OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f35344OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f35345OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ float f35346OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ float f35347OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ int f35348OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ int f35349OoooOOo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ o000OOo0 f35350o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0364OooO0OO(OooOO0 oooOO1, o00OOOO0 o00oooo1, int i, Function1<? super Integer, Integer> function1, long j, long j2, float f, float f2, float f3, o000OOo0 o000ooo1, int i2, int i3) {
            super(2);
            this.f35340Oooo0o = oooOO1;
            this.f35341Oooo0oO = o00oooo1;
            this.f35342Oooo0oo = i;
            this.f35339Oooo = function1;
            this.f35345OoooO00 = j;
            this.f35344OoooO0 = j2;
            this.f35346OoooO0O = f;
            this.f35343OoooO = f2;
            this.f35347OoooOO0 = f3;
            this.f35350o000oOoO = o000ooo1;
            this.f35348OoooOOO = i2;
            this.f35349OoooOOo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooO0OO.OooO00o(this.f35340Oooo0o, this.f35341Oooo0oO, this.f35342Oooo0oo, this.f35339Oooo, this.f35345OoooO00, this.f35344OoooO0, this.f35346OoooO0O, this.f35343OoooO, this.f35347OoooOO0, this.f35350o000oOoO, ooo00o, this.f35348OoooOOO | 1, this.f35349OoooOOo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0110  */
    /* JADX WARN: Code duplicated, block: B:103:0x0118  */
    /* JADX WARN: Code duplicated, block: B:105:0x011c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x012e  */
    /* JADX WARN: Code duplicated, block: B:114:0x013a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01be  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:168:0x0206  */
    /* JADX WARN: Code duplicated, block: B:169:0x020d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0214  */
    /* JADX WARN: Code duplicated, block: B:173:0x021e A[PHI: r2 r3 r4 r5 r6 r8 r9 r10 r12
      0x021e: PHI (r2v39 float) = (r2v26 float), (r2v46 float) binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r3v21 OoooooO.o00OOOO0) = (r3v2 OoooooO.o00OOOO0), (r3v28 OoooooO.o00OOOO0) binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r4v22 int) = (r4v9 int), (r4v24 int) binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r5v33 kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer>) = 
      (r5v9 kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer>)
      (r5v34 kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer>)
     binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r6v29 long) = (r6v3 long), (r6v30 long) binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r8v18 float) = (r8v10 float), (r8v19 float) binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r9v11 float) = (r9v5 float), (r9v12 float) binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r10v12 long) = (r10v4 long), (r10v3 long) binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r12v13 int) = (r12v3 int), (r12v15 int) binds: [B:171:0x0212, B:141:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:176:0x029e  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:182:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:186:0x0308  */
    /* JADX WARN: Code duplicated, block: B:188:0x0314  */
    /* JADX WARN: Code duplicated, block: B:195:0x0368  */
    /* JADX WARN: Code duplicated, block: B:197:0x0371  */
    /* JADX WARN: Code duplicated, block: B:198:0x0375  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c1 A[LOOP:0: B:200:0x03bf->B:201:0x03c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0405 A[LOOP:1: B:203:0x0403->B:204:0x0405, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x0415  */
    /* JADX WARN: Code duplicated, block: B:209:0x0419  */
    /* JADX WARN: Code duplicated, block: B:215:0x045c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0470  */
    /* JADX WARN: Code duplicated, block: B:219:0x0474  */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r12v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r29v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r6v16, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalPagerApi
    public static final void OooO00o(@NotNull OooOO0 pagerState, @Nullable o00OOOO0 o00oooo1, int i, @Nullable Function1<? super Integer, Integer> function1, long j, long j2, float f, float f2, float f3, @Nullable o000OOo0 o000ooo1, @Nullable oOO00O ooo00o, int i2, int i3) {
        int i4;
        int i5;
        Function1<? super Integer, Integer> function2;
        int i6;
        long j3;
        long jOooO0OO;
        int i7;
        float f4;
        int i8;
        o00OOOO0 o00oooo2;
        int iOooO;
        Function1<? super Integer, Integer> function3;
        long jOooO0OO2;
        float f5;
        int i9;
        float f6;
        int i10;
        float f7;
        int i11;
        o000OOo0 o000ooo2;
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0;
        int iOoooooO;
        long j4;
        int iOoooooO2;
        int i12;
        o000000 o000000VarOooO0Oo;
        o0000O0O.OooO oooO;
        o0O0O0o0<LayoutDirection> o0o0o0o1;
        Function1<? super Integer, Integer> function4;
        LayoutDirection layoutDirection;
        int i13;
        o0O0O0o0<o00OOOOo> o0o0o0o2;
        o00OOOOo o00ooooo2;
        long j5;
        Function0<o000000.OooO00o> function0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0;
        int i14;
        o00OOOO0 o00oooo3;
        o000OOo0 o000ooo3;
        ?? r12;
        ?? r7;
        ?? r6;
        ?? r29;
        float f8;
        o00OOOO0.OooO00o oooO00o;
        o000000 o000000VarOooO00o;
        o0000O0O.OooO oooO2;
        LayoutDirection layoutDirection2;
        o00OOOOo o00ooooo3;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1;
        float f9;
        long j6;
        o000OOo0 o000ooo4;
        o00OOOO0 o00oooo0OooO0O0;
        int i15;
        int i16;
        Object[] objArr;
        int i17;
        boolean zOooo0oo;
        Object objOooO0o;
        long j7;
        int i18;
        long j8;
        o000OOo0 o000ooo5;
        Function1<? super Integer, Integer> function5;
        float f10;
        float f11;
        o00OOOO0 o00oooo4;
        float f12;
        long j9;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        oOO00O composer = ooo00o.OooOOo(1678773673);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composer.Oooo0oo(pagerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i19 = i3 & 2;
        if (i19 == 0) {
            if ((i2 & 112) == 0) {
                i4 |= composer.Oooo0oo(o00oooo1) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                i4 |= ((i3 & 4) == 0 || !composer.OooO(i)) ? 128 : 256;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    function2 = function1;
                    if (composer.Oooo0oo(function2)) {
                        i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        j3 = j;
                        int i20 = composer.OooOO0(j3) ? 16384 : 8192;
                        i4 |= i20;
                    } else {
                        j3 = j;
                    }
                    i4 |= i20;
                } else {
                    j3 = j;
                }
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        jOooO0OO = j2;
                        int i21 = composer.OooOO0(jOooO0OO) ? 131072 : 65536;
                        i4 |= i21;
                    } else {
                        jOooO0OO = j2;
                    }
                    i4 |= i21;
                } else {
                    jOooO0OO = j2;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    if ((3670016 & i2) == 0) {
                        f4 = f;
                        if (composer.OooO0oO(f4)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    if ((i2 & 29360128) != 0) {
                        i4 |= ((i3 & 128) == 0 || !composer.OooO0oO(f2)) ? 4194304 : 8388608;
                    }
                    if ((i2 & 234881024) != 0) {
                        i4 |= ((i3 & 256) == 0 || !composer.OooO0oO(f3)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 1879048192) != 0) {
                        i4 |= ((i3 & 512) == 0 || !composer.Oooo0oo(o000ooo1)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                    }
                    if ((i4 & 1533916891) == 306783378 || !composer.OooOo0()) {
                        composer.OooOOo0();
                        if ((i2 & 1) != 0 || composer.Oooo000()) {
                            if (i19 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                iOooO = pagerState.OooO();
                                i4 &= -897;
                            } else {
                                iOooO = i;
                            }
                            if (i5 != 0) {
                                function3 = OooO00o.f35333Oooo0o;
                            } else {
                                function3 = function2;
                            }
                            if ((i3 & 16) != 0) {
                                jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                                i4 &= -57345;
                            } else {
                                jOooO0OO2 = j3;
                            }
                            if ((i3 & 32) != 0) {
                                jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                                i4 &= -458753;
                            }
                            if (i7 != 0) {
                                f5 = 8;
                            } else {
                                f5 = f4;
                            }
                            if ((i3 & 128) != 0) {
                                i9 = i4 & (-29360129);
                                f6 = f5;
                            } else {
                                i9 = i4;
                                f6 = f2;
                            }
                            if ((i3 & 256) != 0) {
                                i10 = i9 & (-234881025);
                                f7 = f5;
                            } else {
                                i10 = i9;
                                f7 = f3;
                            }
                            if ((i3 & 512) != 0) {
                                i11 = i10 & (-1879048193);
                                o000ooo2 = o00O0O.f3431OooO00o;
                            }
                            composer.Oooo0oO();
                            o0o0o0o0 = o000.f6356OooO0o0;
                            iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                            j4 = jOooO0OO2;
                            iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                            o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4176OooO0o0;
                            i12 = ((i11 >> 3) & 14) | 48;
                            composer.OooO0o0(733328855);
                            o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
                            composer.OooO0o0(-1323940314);
                            oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                            o0o0o0o1 = o000.f6360OooOO0O;
                            function4 = function3;
                            layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                            i13 = iOooO;
                            o0o0o0o2 = o000.f6364OooOOOO;
                            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                            j5 = jOooO0OO;
                            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                            i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                            o00oooo3 = o00oooo2;
                            if (composer.OooOo0o() instanceof o00O000) {
                                o00O00O.OooO00o();
                                throw null;
                            }
                            composer.OooOo00();
                            if (composer.OooOOO0()) {
                                composer.OooOoO0(function0);
                            } else {
                                composer.Oooo00O();
                            }
                            composer.OooOo0O();
                            Intrinsics.checkNotNullParameter(composer, "composer");
                            o000ooo3 = o000ooo2;
                            r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                            r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                            oO00000o.OooO0O0(composer, oooO, r7);
                            r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                            oO00000o.OooO0O0(composer, layoutDirection, r6);
                            r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                            f8 = f6;
                            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                            composer.OooO0o0(2058660585);
                            composer.OooO0o0(-2137368960);
                            if (((i14 >> 9) & 14 & 11) == 2 || !composer.OooOo0()) {
                                if (((((i12 >> 6) & 112) | 6) & 81) == 16 || !composer.OooOo0()) {
                                    Oooo0o0.o00O000.OooO oooOOooO0oo = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                                    o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
                                    composer.OooO0o0(693286680);
                                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo, oooO0O0, composer);
                                    composer.OooO0o0(-1323940314);
                                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                                    if (!(composer.OooOo0o() instanceof o00O000)) {
                                        o00O00O.OooO00o();
                                        throw null;
                                    }
                                    composer.OooOo00();
                                    if (composer.OooOOO0()) {
                                        composer.OooOoO0(function0);
                                    } else {
                                        composer.Oooo00O();
                                    }
                                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                                    composer.OooO0o0(2058660585);
                                    composer.OooO0o0(-678309503);
                                    f9 = f8;
                                    j6 = j5;
                                    o000ooo4 = o000ooo3;
                                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                                    composer.OooO0o0(-29724645);
                                    i16 = i13;
                                    for (i15 = 0; i15 < i16; i15++) {
                                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer.Oooo0o0();
                                    composer.Oooo0o0();
                                    composer.Oooo0o0();
                                    composer.Oooo0o();
                                    composer.Oooo0o0();
                                    composer.Oooo0o0();
                                    o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
                                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                                    composer.OooO0o0(-568225417);
                                    zOooo0oo = false;
                                    for (i17 = 0; i17 < 5; i17++) {
                                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                                    }
                                    objOooO0o = composer.OooO0o();
                                    if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                                        composer.Oooo00o(objOooO0o);
                                    }
                                    composer.Oooo0o0();
                                    j7 = j4;
                                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o2, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                                } else {
                                    composer.OooOoo0();
                                }
                                o0O0OO0.OooO00o(composer);
                                i18 = i16;
                                j8 = j7;
                                o000ooo5 = o000ooo4;
                                function5 = function4;
                                long j10 = j6;
                                f10 = f9;
                                f11 = f7;
                                o00oooo4 = o00oooo3;
                                f12 = f5;
                                j9 = j10;
                            } else {
                                composer.OooOoo0();
                            }
                            j7 = j4;
                            i16 = i13;
                            j6 = j5;
                            o000ooo4 = o000ooo3;
                            f9 = f8;
                            o0O0OO0.OooO00o(composer);
                            i18 = i16;
                            j8 = j7;
                            o000ooo5 = o000ooo4;
                            function5 = function4;
                            long j11 = j6;
                            f10 = f9;
                            f11 = f7;
                            o00oooo4 = o00oooo3;
                            f12 = f5;
                            j9 = j11;
                        } else {
                            composer.OooOoo0();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            o00oooo2 = o00oooo1;
                            iOooO = i;
                            i10 = i4;
                            function3 = function2;
                            jOooO0OO2 = j3;
                            f5 = f4;
                            f6 = f2;
                            f7 = f3;
                        }
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                        composer.Oooo0oO();
                        o0o0o0o0 = o000.f6356OooO0o0;
                        iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                        j4 = jOooO0OO2;
                        iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                        o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4176OooO0o0;
                        i12 = ((i11 >> 3) & 14) | 48;
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo2, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        function4 = function3;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        i13 = iOooO;
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        j5 = jOooO0OO;
                        function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                        i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                        o00oooo3 = o00oooo2;
                        if (composer.OooOo0o() instanceof o00O000) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        o000ooo3 = o000ooo2;
                        r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                        r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r7);
                        r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r6);
                        r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        f8 = f6;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (((i14 >> 9) & 14 & 11) == 2) {
                            if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                            }
                            Oooo0o0.o00O000.OooO oooOOooO0oo2 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                            o00OO0OO.OooO0O0 oooO0O1 = o00OO0O0.OooO00o.f4181OooOO0o;
                            composer.OooO0o0(693286680);
                            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                            o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo2, oooO0O1, composer);
                            composer.OooO0o0(-1323940314);
                            oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                            layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                            o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                            function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                            if (!(composer.OooOo0o() instanceof o00O000)) {
                                o00O00O.OooO00o();
                                throw null;
                            }
                            composer.OooOo00();
                            if (composer.OooOOO0()) {
                                composer.OooOoO0(function0);
                            } else {
                                composer.Oooo00O();
                            }
                            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                            composer.OooO0o0(2058660585);
                            composer.OooO0o0(-678309503);
                            f9 = f8;
                            j6 = j5;
                            o000ooo4 = o000ooo3;
                            o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                            composer.OooO0o0(-29724645);
                            i16 = i13;
                            while (i15 < i16) {
                                p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            composer.Oooo0o();
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            o00OOOO0.OooO00o oooO00o3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                            composer.OooO0o0(-568225417);
                            zOooo0oo = false;
                            while (i17 < 5) {
                                zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                            }
                            objOooO0o = composer.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                                composer.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                                composer.Oooo00o(objOooO0o);
                            }
                            composer.Oooo0o0();
                            j7 = j4;
                            p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o3, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                        } else {
                            if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                            }
                            Oooo0o0.o00O000.OooO oooOOooO0oo3 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                            o00OO0OO.OooO0O0 oooO0O2 = o00OO0O0.OooO00o.f4181OooOO0o;
                            composer.OooO0o0(693286680);
                            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                            o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo3, oooO0O2, composer);
                            composer.OooO0o0(-1323940314);
                            oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                            layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                            o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                            function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                            if (!(composer.OooOo0o() instanceof o00O000)) {
                                o00O00O.OooO00o();
                                throw null;
                            }
                            composer.OooOo00();
                            if (composer.OooOOO0()) {
                                composer.OooOoO0(function0);
                            } else {
                                composer.Oooo00O();
                            }
                            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                            composer.OooO0o0(2058660585);
                            composer.OooO0o0(-678309503);
                            f9 = f8;
                            j6 = j5;
                            o000ooo4 = o000ooo3;
                            o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                            composer.OooO0o0(-29724645);
                            i16 = i13;
                            while (i15 < i16) {
                                p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            composer.Oooo0o();
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            o00OOOO0.OooO00o oooO00o4 = o00OOOO0.OooO00o.f4198Oooo0o;
                            objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                            composer.OooO0o0(-568225417);
                            zOooo0oo = false;
                            while (i17 < 5) {
                                zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                            }
                            objOooO0o = composer.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                                composer.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                                composer.Oooo00o(objOooO0o);
                            }
                            composer.Oooo0o0();
                            j7 = j4;
                            p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o4, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                        }
                        o0O0OO0.OooO00o(composer);
                        i18 = i16;
                        j8 = j7;
                        o000ooo5 = o000ooo4;
                        function5 = function4;
                        long j12 = j6;
                        f10 = f9;
                        f11 = f7;
                        o00oooo4 = o00oooo3;
                        f12 = f5;
                        j9 = j12;
                    } else {
                        composer.OooOoo0();
                        o00oooo4 = o00oooo1;
                        i18 = i;
                        o000ooo5 = o000ooo1;
                        function5 = function2;
                        j8 = j3;
                        j9 = jOooO0OO;
                        f12 = f4;
                        f10 = f2;
                        f11 = f3;
                    }
                    oo0oooOooOo = composer.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new C0364OooO0OO(pagerState, o00oooo4, i18, function5, j8, j9, f12, f10, f11, o000ooo5, i2, i3));
                }
                i4 |= 1572864;
                f4 = f;
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composer.OooO0oO(f2)) ? 4194304 : 8388608;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !composer.OooO0oO(f3)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & 512) == 0 || !composer.Oooo0oo(o000ooo1)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composer.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    } else {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    }
                    composer.Oooo0oO();
                    o0o0o0o0 = o000.f6356OooO0o0;
                    iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                    j4 = jOooO0OO2;
                    iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                    o00OO0OO o00oo0oo3 = o00OO0O0.OooO00o.f4176OooO0o0;
                    i12 = ((i11 >> 3) & 14) | 48;
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo3, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    function4 = function3;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    i13 = iOooO;
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    j5 = jOooO0OO;
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                    i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                    o00oooo3 = o00oooo2;
                    if (composer.OooOo0o() instanceof o00O000) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    o000ooo3 = o000ooo2;
                    r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                    r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r7);
                    r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r6);
                    r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    f8 = f6;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (((i14 >> 9) & 14 & 11) == 2) {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo4 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O3 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo4, oooO0O3, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o5 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o5, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    } else {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo5 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O4 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo5, oooO0O4, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit5 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o6 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o6, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    }
                    o0O0OO0.OooO00o(composer);
                    i18 = i16;
                    j8 = j7;
                    o000ooo5 = o000ooo4;
                    function5 = function4;
                    long j13 = j6;
                    f10 = f9;
                    f11 = f7;
                    o00oooo4 = o00oooo3;
                    f12 = f5;
                    j9 = j13;
                } else {
                    composer.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    } else {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    }
                    composer.Oooo0oO();
                    o0o0o0o0 = o000.f6356OooO0o0;
                    iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                    j4 = jOooO0OO2;
                    iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                    o00OO0OO o00oo0oo4 = o00OO0O0.OooO00o.f4176OooO0o0;
                    i12 = ((i11 >> 3) & 14) | 48;
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo4, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    function4 = function3;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    i13 = iOooO;
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    j5 = jOooO0OO;
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                    i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                    o00oooo3 = o00oooo2;
                    if (composer.OooOo0o() instanceof o00O000) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    o000ooo3 = o000ooo2;
                    r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                    r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r7);
                    r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r6);
                    r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    f8 = f6;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (((i14 >> 9) & 14 & 11) == 2) {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo6 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O5 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo6, oooO0O5, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit6 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o7 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o7, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    } else {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo7 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O6 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo7, oooO0O6, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit7 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o8 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o8, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    }
                    o0O0OO0.OooO00o(composer);
                    i18 = i16;
                    j8 = j7;
                    o000ooo5 = o000ooo4;
                    function5 = function4;
                    long j14 = j6;
                    f10 = f9;
                    f11 = f7;
                    o00oooo4 = o00oooo3;
                    f12 = f5;
                    j9 = j14;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new C0364OooO0OO(pagerState, o00oooo4, i18, function5, j8, j9, f12, f10, f11, o000ooo5, i2, i3));
            }
            i4 |= 3072;
            function2 = function1;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    j3 = j;
                    if (composer.OooOO0(j3)) {
                    }
                    i4 |= i20;
                } else {
                    j3 = j;
                }
                i4 |= i20;
            } else {
                j3 = j;
            }
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    jOooO0OO = j2;
                    if (composer.OooOO0(jOooO0OO)) {
                    }
                    i4 |= i21;
                } else {
                    jOooO0OO = j2;
                }
                i4 |= i21;
            } else {
                jOooO0OO = j2;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((3670016 & i2) == 0) {
                    f4 = f;
                    if (composer.OooO0oO(f4)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composer.OooO0oO(f2)) ? 4194304 : 8388608;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !composer.OooO0oO(f3)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & 512) == 0 || !composer.Oooo0oo(o000ooo1)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composer.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    } else {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    }
                    composer.Oooo0oO();
                    o0o0o0o0 = o000.f6356OooO0o0;
                    iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                    j4 = jOooO0OO2;
                    iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                    o00OO0OO o00oo0oo5 = o00OO0O0.OooO00o.f4176OooO0o0;
                    i12 = ((i11 >> 3) & 14) | 48;
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo5, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    function4 = function3;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    i13 = iOooO;
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    j5 = jOooO0OO;
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                    i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                    o00oooo3 = o00oooo2;
                    if (composer.OooOo0o() instanceof o00O000) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    o000ooo3 = o000ooo2;
                    r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                    r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r7);
                    r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r6);
                    r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    f8 = f6;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (((i14 >> 9) & 14 & 11) == 2) {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo8 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O7 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo8, oooO0O7, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit8 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o9 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o9, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    } else {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo9 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O8 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo9, oooO0O8, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit9 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o10 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o10, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    }
                    o0O0OO0.OooO00o(composer);
                    i18 = i16;
                    j8 = j7;
                    o000ooo5 = o000ooo4;
                    function5 = function4;
                    long j15 = j6;
                    f10 = f9;
                    f11 = f7;
                    o00oooo4 = o00oooo3;
                    f12 = f5;
                    j9 = j15;
                } else {
                    composer.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    } else {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    }
                    composer.Oooo0oO();
                    o0o0o0o0 = o000.f6356OooO0o0;
                    iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                    j4 = jOooO0OO2;
                    iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                    o00OO0OO o00oo0oo6 = o00OO0O0.OooO00o.f4176OooO0o0;
                    i12 = ((i11 >> 3) & 14) | 48;
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo6, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    function4 = function3;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    i13 = iOooO;
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    j5 = jOooO0OO;
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                    i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                    o00oooo3 = o00oooo2;
                    if (composer.OooOo0o() instanceof o00O000) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    o000ooo3 = o000ooo2;
                    r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                    r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r7);
                    r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r6);
                    r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    f8 = f6;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (((i14 >> 9) & 14 & 11) == 2) {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo10 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O9 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo10, oooO0O9, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit10 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o11 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o11, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    } else {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo11 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O10 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo11, oooO0O10, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit11 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o12 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o12, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    }
                    o0O0OO0.OooO00o(composer);
                    i18 = i16;
                    j8 = j7;
                    o000ooo5 = o000ooo4;
                    function5 = function4;
                    long j16 = j6;
                    f10 = f9;
                    f11 = f7;
                    o00oooo4 = o00oooo3;
                    f12 = f5;
                    j9 = j16;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new C0364OooO0OO(pagerState, o00oooo4, i18, function5, j8, j9, f12, f10, f11, o000ooo5, i2, i3));
            }
            i4 |= 1572864;
            f4 = f;
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composer.OooO0oO(f2)) ? 4194304 : 8388608;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & 256) == 0 || !composer.OooO0oO(f3)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & 512) == 0 || !composer.Oooo0oo(o000ooo1)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composer.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                } else {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                }
                composer.Oooo0oO();
                o0o0o0o0 = o000.f6356OooO0o0;
                iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                j4 = jOooO0OO2;
                iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                o00OO0OO o00oo0oo7 = o00OO0O0.OooO00o.f4176OooO0o0;
                i12 = ((i11 >> 3) & 14) | 48;
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo7, false, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                function4 = function3;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                i13 = iOooO;
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                j5 = jOooO0OO;
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                o00oooo3 = o00oooo2;
                if (composer.OooOo0o() instanceof o00O000) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                o000ooo3 = o000ooo2;
                r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r7);
                r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r6);
                r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                f8 = f6;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (((i14 >> 9) & 14 & 11) == 2) {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo12 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O11 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo12, oooO0O11, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit12 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o13 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o13, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                } else {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo13 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O12 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo13, oooO0O12, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit13 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o14 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o14, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                }
                o0O0OO0.OooO00o(composer);
                i18 = i16;
                j8 = j7;
                o000ooo5 = o000ooo4;
                function5 = function4;
                long j17 = j6;
                f10 = f9;
                f11 = f7;
                o00oooo4 = o00oooo3;
                f12 = f5;
                j9 = j17;
            } else {
                composer.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                } else {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                }
                composer.Oooo0oO();
                o0o0o0o0 = o000.f6356OooO0o0;
                iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                j4 = jOooO0OO2;
                iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                o00OO0OO o00oo0oo8 = o00OO0O0.OooO00o.f4176OooO0o0;
                i12 = ((i11 >> 3) & 14) | 48;
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo8, false, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                function4 = function3;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                i13 = iOooO;
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                j5 = jOooO0OO;
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                o00oooo3 = o00oooo2;
                if (composer.OooOo0o() instanceof o00O000) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                o000ooo3 = o000ooo2;
                r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r7);
                r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r6);
                r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                f8 = f6;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (((i14 >> 9) & 14 & 11) == 2) {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo14 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O13 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo14, oooO0O13, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit14 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o15 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o15, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                } else {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo15 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O14 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo15, oooO0O14, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit15 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o16 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o16, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                }
                o0O0OO0.OooO00o(composer);
                i18 = i16;
                j8 = j7;
                o000ooo5 = o000ooo4;
                function5 = function4;
                long j18 = j6;
                f10 = f9;
                f11 = f7;
                o00oooo4 = o00oooo3;
                f12 = f5;
                j9 = j18;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new C0364OooO0OO(pagerState, o00oooo4, i18, function5, j8, j9, f12, f10, f11, o000ooo5, i2, i3));
        }
        i4 |= 48;
        if ((i2 & 896) != 0) {
            i4 |= ((i3 & 4) == 0 || !composer.OooO(i)) ? 128 : 256;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                function2 = function1;
                if (composer.Oooo0oo(function2)) {
                    i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    j3 = j;
                    if (composer.OooOO0(j3)) {
                    }
                    i4 |= i20;
                } else {
                    j3 = j;
                }
                i4 |= i20;
            } else {
                j3 = j;
            }
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    jOooO0OO = j2;
                    if (composer.OooOO0(jOooO0OO)) {
                    }
                    i4 |= i21;
                } else {
                    jOooO0OO = j2;
                }
                i4 |= i21;
            } else {
                jOooO0OO = j2;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((3670016 & i2) == 0) {
                    f4 = f;
                    if (composer.OooO0oO(f4)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composer.OooO0oO(f2)) ? 4194304 : 8388608;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !composer.OooO0oO(f3)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & 512) == 0 || !composer.Oooo0oo(o000ooo1)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composer.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    } else {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    }
                    composer.Oooo0oO();
                    o0o0o0o0 = o000.f6356OooO0o0;
                    iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                    j4 = jOooO0OO2;
                    iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                    o00OO0OO o00oo0oo9 = o00OO0O0.OooO00o.f4176OooO0o0;
                    i12 = ((i11 >> 3) & 14) | 48;
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo9, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    function4 = function3;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    i13 = iOooO;
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    j5 = jOooO0OO;
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                    i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                    o00oooo3 = o00oooo2;
                    if (composer.OooOo0o() instanceof o00O000) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    o000ooo3 = o000ooo2;
                    r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                    r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r7);
                    r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r6);
                    r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    f8 = f6;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (((i14 >> 9) & 14 & 11) == 2) {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo16 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O15 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo16, oooO0O15, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit16 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o17 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o17, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    } else {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo17 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O16 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo17, oooO0O16, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit17 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o18 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o18, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    }
                    o0O0OO0.OooO00o(composer);
                    i18 = i16;
                    j8 = j7;
                    o000ooo5 = o000ooo4;
                    function5 = function4;
                    long j19 = j6;
                    f10 = f9;
                    f11 = f7;
                    o00oooo4 = o00oooo3;
                    f12 = f5;
                    j9 = j19;
                } else {
                    composer.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    } else {
                        if (i19 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO = pagerState.OooO();
                            i4 &= -897;
                        } else {
                            iOooO = i;
                        }
                        if (i5 != 0) {
                            function3 = OooO00o.f35333Oooo0o;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                            i4 &= -57345;
                        } else {
                            jOooO0OO2 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                            i4 &= -458753;
                        }
                        if (i7 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f6 = f5;
                        } else {
                            i9 = i4;
                            f6 = f2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 = i9 & (-234881025);
                            f7 = f5;
                        } else {
                            i10 = i9;
                            f7 = f3;
                        }
                        if ((i3 & 512) != 0) {
                            i11 = i10 & (-1879048193);
                            o000ooo2 = o00O0O.f3431OooO00o;
                        } else {
                            i11 = i10;
                            o000ooo2 = o000ooo1;
                        }
                    }
                    composer.Oooo0oO();
                    o0o0o0o0 = o000.f6356OooO0o0;
                    iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                    j4 = jOooO0OO2;
                    iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                    o00OO0OO o00oo0oo10 = o00OO0O0.OooO00o.f4176OooO0o0;
                    i12 = ((i11 >> 3) & 14) | 48;
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo10, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    function4 = function3;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    i13 = iOooO;
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    j5 = jOooO0OO;
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                    i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                    o00oooo3 = o00oooo2;
                    if (composer.OooOo0o() instanceof o00O000) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    o000ooo3 = o000ooo2;
                    r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                    r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r7);
                    r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r6);
                    r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    f8 = f6;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (((i14 >> 9) & 14 & 11) == 2) {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo18 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O17 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo18, oooO0O17, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit18 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o19 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o19, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    } else {
                        if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                        }
                        Oooo0o0.o00O000.OooO oooOOooO0oo19 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                        o00OO0OO.OooO0O0 oooO0O18 = o00OO0O0.OooO00o.f4181OooOO0o;
                        composer.OooO0o0(693286680);
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo19, oooO0O18, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function0);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        f9 = f8;
                        j6 = j5;
                        o000ooo4 = o000ooo3;
                        o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                        composer.OooO0o0(-29724645);
                        i16 = i13;
                        while (i15 < i16) {
                            p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                            Unit unit19 = Unit.INSTANCE;
                        }
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        o00OOOO0.OooO00o oooO00o110 = o00OOOO0.OooO00o.f4198Oooo0o;
                        objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                        composer.OooO0o0(-568225417);
                        zOooo0oo = false;
                        while (i17 < 5) {
                            zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                        }
                        objOooO0o = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        j7 = j4;
                        p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o110, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                    }
                    o0O0OO0.OooO00o(composer);
                    i18 = i16;
                    j8 = j7;
                    o000ooo5 = o000ooo4;
                    function5 = function4;
                    long j110 = j6;
                    f10 = f9;
                    f11 = f7;
                    o00oooo4 = o00oooo3;
                    f12 = f5;
                    j9 = j110;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new C0364OooO0OO(pagerState, o00oooo4, i18, function5, j8, j9, f12, f10, f11, o000ooo5, i2, i3));
            }
            i4 |= 1572864;
            f4 = f;
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composer.OooO0oO(f2)) ? 4194304 : 8388608;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & 256) == 0 || !composer.OooO0oO(f3)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & 512) == 0 || !composer.Oooo0oo(o000ooo1)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composer.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                } else {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                }
                composer.Oooo0oO();
                o0o0o0o0 = o000.f6356OooO0o0;
                iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                j4 = jOooO0OO2;
                iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                o00OO0OO o00oo0oo11 = o00OO0O0.OooO00o.f4176OooO0o0;
                i12 = ((i11 >> 3) & 14) | 48;
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo11, false, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                function4 = function3;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                i13 = iOooO;
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                j5 = jOooO0OO;
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                o00oooo3 = o00oooo2;
                if (composer.OooOo0o() instanceof o00O000) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                o000ooo3 = o000ooo2;
                r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r7);
                r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r6);
                r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                f8 = f6;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (((i14 >> 9) & 14 & 11) == 2) {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo110 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O19 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo110, oooO0O19, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit110 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o111 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o111, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                } else {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo111 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O110 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo111, oooO0O110, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit111 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o112 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o112, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                }
                o0O0OO0.OooO00o(composer);
                i18 = i16;
                j8 = j7;
                o000ooo5 = o000ooo4;
                function5 = function4;
                long j111 = j6;
                f10 = f9;
                f11 = f7;
                o00oooo4 = o00oooo3;
                f12 = f5;
                j9 = j111;
            } else {
                composer.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                } else {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                }
                composer.Oooo0oO();
                o0o0o0o0 = o000.f6356OooO0o0;
                iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                j4 = jOooO0OO2;
                iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                o00OO0OO o00oo0oo12 = o00OO0O0.OooO00o.f4176OooO0o0;
                i12 = ((i11 >> 3) & 14) | 48;
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo12, false, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                function4 = function3;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                i13 = iOooO;
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                j5 = jOooO0OO;
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                o00oooo3 = o00oooo2;
                if (composer.OooOo0o() instanceof o00O000) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                o000ooo3 = o000ooo2;
                r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r7);
                r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r6);
                r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                f8 = f6;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (((i14 >> 9) & 14 & 11) == 2) {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo112 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O111 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo112, oooO0O111, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit112 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o113 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o113, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                } else {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo113 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O112 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo113, oooO0O112, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit113 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o114 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o114, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                }
                o0O0OO0.OooO00o(composer);
                i18 = i16;
                j8 = j7;
                o000ooo5 = o000ooo4;
                function5 = function4;
                long j112 = j6;
                f10 = f9;
                f11 = f7;
                o00oooo4 = o00oooo3;
                f12 = f5;
                j9 = j112;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new C0364OooO0OO(pagerState, o00oooo4, i18, function5, j8, j9, f12, f10, f11, o000ooo5, i2, i3));
        }
        i4 |= 3072;
        function2 = function1;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                j3 = j;
                if (composer.OooOO0(j3)) {
                }
                i4 |= i20;
            } else {
                j3 = j;
            }
            i4 |= i20;
        } else {
            j3 = j;
        }
        if ((458752 & i2) == 0) {
            if ((i3 & 32) == 0) {
                jOooO0OO = j2;
                if (composer.OooOO0(jOooO0OO)) {
                }
                i4 |= i21;
            } else {
                jOooO0OO = j2;
            }
            i4 |= i21;
        } else {
            jOooO0OO = j2;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            if ((3670016 & i2) == 0) {
                f4 = f;
                if (composer.OooO0oO(f4)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composer.OooO0oO(f2)) ? 4194304 : 8388608;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & 256) == 0 || !composer.OooO0oO(f3)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & 512) == 0 || !composer.Oooo0oo(o000ooo1)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composer.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                } else {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                }
                composer.Oooo0oO();
                o0o0o0o0 = o000.f6356OooO0o0;
                iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                j4 = jOooO0OO2;
                iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                o00OO0OO o00oo0oo13 = o00OO0O0.OooO00o.f4176OooO0o0;
                i12 = ((i11 >> 3) & 14) | 48;
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo13, false, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                function4 = function3;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                i13 = iOooO;
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                j5 = jOooO0OO;
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                o00oooo3 = o00oooo2;
                if (composer.OooOo0o() instanceof o00O000) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                o000ooo3 = o000ooo2;
                r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r7);
                r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r6);
                r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                f8 = f6;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (((i14 >> 9) & 14 & 11) == 2) {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo114 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O113 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo114, oooO0O113, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit114 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o115 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o115, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                } else {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo115 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O114 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo115, oooO0O114, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit115 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o116 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o116, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                }
                o0O0OO0.OooO00o(composer);
                i18 = i16;
                j8 = j7;
                o000ooo5 = o000ooo4;
                function5 = function4;
                long j113 = j6;
                f10 = f9;
                f11 = f7;
                o00oooo4 = o00oooo3;
                f12 = f5;
                j9 = j113;
            } else {
                composer.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                } else {
                    if (i19 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO = pagerState.OooO();
                        i4 &= -897;
                    } else {
                        iOooO = i;
                    }
                    if (i5 != 0) {
                        function3 = OooO00o.f35333Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                        i4 &= -57345;
                    } else {
                        jOooO0OO2 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                        i4 &= -458753;
                    }
                    if (i7 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f6 = f5;
                    } else {
                        i9 = i4;
                        f6 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 = i9 & (-234881025);
                        f7 = f5;
                    } else {
                        i10 = i9;
                        f7 = f3;
                    }
                    if ((i3 & 512) != 0) {
                        i11 = i10 & (-1879048193);
                        o000ooo2 = o00O0O.f3431OooO00o;
                    } else {
                        i11 = i10;
                        o000ooo2 = o000ooo1;
                    }
                }
                composer.Oooo0oO();
                o0o0o0o0 = o000.f6356OooO0o0;
                iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
                j4 = jOooO0OO2;
                iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
                o00OO0OO o00oo0oo14 = o00OO0O0.OooO00o.f4176OooO0o0;
                i12 = ((i11 >> 3) & 14) | 48;
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo14, false, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                function4 = function3;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                i13 = iOooO;
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                j5 = jOooO0OO;
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
                i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                o00oooo3 = o00oooo2;
                if (composer.OooOo0o() instanceof o00O000) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                o000ooo3 = o000ooo2;
                r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
                r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r7);
                r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r6);
                r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                f8 = f6;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (((i14 >> 9) & 14 & 11) == 2) {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo116 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O115 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo116, oooO0O115, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit116 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o117 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o117, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                } else {
                    if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                    }
                    Oooo0o0.o00O000.OooO oooOOooO0oo117 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                    o00OO0OO.OooO0O0 oooO0O116 = o00OO0O0.OooO00o.f4181OooOO0o;
                    composer.OooO0o0(693286680);
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo117, oooO0O116, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    f9 = f8;
                    j6 = j5;
                    o000ooo4 = o000ooo3;
                    o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                    composer.OooO0o0(-29724645);
                    i16 = i13;
                    while (i15 < i16) {
                        p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                        Unit unit117 = Unit.INSTANCE;
                    }
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    o00OOOO0.OooO00o oooO00o118 = o00OOOO0.OooO00o.f4198Oooo0o;
                    objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                    composer.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i17 < 5) {
                        zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                    }
                    objOooO0o = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    j7 = j4;
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o118, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
                }
                o0O0OO0.OooO00o(composer);
                i18 = i16;
                j8 = j7;
                o000ooo5 = o000ooo4;
                function5 = function4;
                long j114 = j6;
                f10 = f9;
                f11 = f7;
                o00oooo4 = o00oooo3;
                f12 = f5;
                j9 = j114;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new C0364OooO0OO(pagerState, o00oooo4, i18, function5, j8, j9, f12, f10, f11, o000ooo5, i2, i3));
        }
        i4 |= 1572864;
        f4 = f;
        if ((i2 & 29360128) != 0) {
            i4 |= ((i3 & 128) == 0 || !composer.OooO0oO(f2)) ? 4194304 : 8388608;
        }
        if ((i2 & 234881024) != 0) {
            i4 |= ((i3 & 256) == 0 || !composer.OooO0oO(f3)) ? 33554432 : 67108864;
        }
        if ((i2 & 1879048192) != 0) {
            i4 |= ((i3 & 512) == 0 || !composer.Oooo0oo(o000ooo1)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
        }
        if ((i4 & 1533916891) == 306783378) {
            composer.OooOOo0();
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i3 & 4) != 0) {
                    iOooO = pagerState.OooO();
                    i4 &= -897;
                } else {
                    iOooO = i;
                }
                if (i5 != 0) {
                    function3 = OooO00o.f35333Oooo0o;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                    i4 &= -57345;
                } else {
                    jOooO0OO2 = j3;
                }
                if ((i3 & 32) != 0) {
                    jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                    i4 &= -458753;
                }
                if (i7 != 0) {
                    f5 = 8;
                } else {
                    f5 = f4;
                }
                if ((i3 & 128) != 0) {
                    i9 = i4 & (-29360129);
                    f6 = f5;
                } else {
                    i9 = i4;
                    f6 = f2;
                }
                if ((i3 & 256) != 0) {
                    i10 = i9 & (-234881025);
                    f7 = f5;
                } else {
                    i10 = i9;
                    f7 = f3;
                }
                if ((i3 & 512) != 0) {
                    i11 = i10 & (-1879048193);
                    o000ooo2 = o00O0O.f3431OooO00o;
                } else {
                    i11 = i10;
                    o000ooo2 = o000ooo1;
                }
            } else {
                if (i19 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i3 & 4) != 0) {
                    iOooO = pagerState.OooO();
                    i4 &= -897;
                } else {
                    iOooO = i;
                }
                if (i5 != 0) {
                    function3 = OooO00o.f35333Oooo0o;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                    i4 &= -57345;
                } else {
                    jOooO0OO2 = j3;
                }
                if ((i3 & 32) != 0) {
                    jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                    i4 &= -458753;
                }
                if (i7 != 0) {
                    f5 = 8;
                } else {
                    f5 = f4;
                }
                if ((i3 & 128) != 0) {
                    i9 = i4 & (-29360129);
                    f6 = f5;
                } else {
                    i9 = i4;
                    f6 = f2;
                }
                if ((i3 & 256) != 0) {
                    i10 = i9 & (-234881025);
                    f7 = f5;
                } else {
                    i10 = i9;
                    f7 = f3;
                }
                if ((i3 & 512) != 0) {
                    i11 = i10 & (-1879048193);
                    o000ooo2 = o00O0O.f3431OooO00o;
                } else {
                    i11 = i10;
                    o000ooo2 = o000ooo1;
                }
            }
            composer.Oooo0oO();
            o0o0o0o0 = o000.f6356OooO0o0;
            iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
            j4 = jOooO0OO2;
            iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
            o00OO0OO o00oo0oo15 = o00OO0O0.OooO00o.f4176OooO0o0;
            i12 = ((i11 >> 3) & 14) | 48;
            composer.OooO0o0(733328855);
            o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo15, false, composer);
            composer.OooO0o0(-1323940314);
            oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0o0o0o1 = o000.f6360OooOO0O;
            function4 = function3;
            layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            i13 = iOooO;
            o0o0o0o2 = o000.f6364OooOOOO;
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            j5 = jOooO0OO;
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
            i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
            o00oooo3 = o00oooo2;
            if (composer.OooOo0o() instanceof o00O000) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            o000ooo3 = o000ooo2;
            r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
            r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r7);
            r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r6);
            r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            f8 = f6;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (((i14 >> 9) & 14 & 11) == 2) {
                if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                }
                Oooo0o0.o00O000.OooO oooOOooO0oo118 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                o00OO0OO.OooO0O0 oooO0O117 = o00OO0O0.OooO00o.f4181OooOO0o;
                composer.OooO0o0(693286680);
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo118, oooO0O117, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                f9 = f8;
                j6 = j5;
                o000ooo4 = o000ooo3;
                o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                composer.OooO0o0(-29724645);
                i16 = i13;
                while (i15 < i16) {
                    p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                    Unit unit118 = Unit.INSTANCE;
                }
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o00OOOO0.OooO00o oooO00o119 = o00OOOO0.OooO00o.f4198Oooo0o;
                objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                composer.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i17 < 5) {
                    zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                }
                objOooO0o = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                    composer.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                j7 = j4;
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o119, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
            } else {
                if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                }
                Oooo0o0.o00O000.OooO oooOOooO0oo119 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                o00OO0OO.OooO0O0 oooO0O118 = o00OO0O0.OooO00o.f4181OooOO0o;
                composer.OooO0o0(693286680);
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo119, oooO0O118, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                f9 = f8;
                j6 = j5;
                o000ooo4 = o000ooo3;
                o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                composer.OooO0o0(-29724645);
                i16 = i13;
                while (i15 < i16) {
                    p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                    Unit unit119 = Unit.INSTANCE;
                }
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o00OOOO0.OooO00o oooO00o1110 = o00OOOO0.OooO00o.f4198Oooo0o;
                objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                composer.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i17 < 5) {
                    zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                }
                objOooO0o = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                    composer.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                j7 = j4;
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o1110, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
            }
            o0O0OO0.OooO00o(composer);
            i18 = i16;
            j8 = j7;
            o000ooo5 = o000ooo4;
            function5 = function4;
            long j115 = j6;
            f10 = f9;
            f11 = f7;
            o00oooo4 = o00oooo3;
            f12 = f5;
            j9 = j115;
        } else {
            composer.OooOOo0();
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i3 & 4) != 0) {
                    iOooO = pagerState.OooO();
                    i4 &= -897;
                } else {
                    iOooO = i;
                }
                if (i5 != 0) {
                    function3 = OooO00o.f35333Oooo0o;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                    i4 &= -57345;
                } else {
                    jOooO0OO2 = j3;
                }
                if ((i3 & 32) != 0) {
                    jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                    i4 &= -458753;
                }
                if (i7 != 0) {
                    f5 = 8;
                } else {
                    f5 = f4;
                }
                if ((i3 & 128) != 0) {
                    i9 = i4 & (-29360129);
                    f6 = f5;
                } else {
                    i9 = i4;
                    f6 = f2;
                }
                if ((i3 & 256) != 0) {
                    i10 = i9 & (-234881025);
                    f7 = f5;
                } else {
                    i10 = i9;
                    f7 = f3;
                }
                if ((i3 & 512) != 0) {
                    i11 = i10 & (-1879048193);
                    o000ooo2 = o00O0O.f3431OooO00o;
                } else {
                    i11 = i10;
                    o000ooo2 = o000ooo1;
                }
            } else {
                if (i19 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i3 & 4) != 0) {
                    iOooO = pagerState.OooO();
                    i4 &= -897;
                } else {
                    iOooO = i;
                }
                if (i5 != 0) {
                    function3 = OooO00o.f35333Oooo0o;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jOooO0OO2 = o00000O0.OooO0OO(((o00000O0) composer.OooOO0o(p031OoooO.Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) composer.OooOO0o(p031OoooO.OooOo.f2588OooO00o)).floatValue());
                    i4 &= -57345;
                } else {
                    jOooO0OO2 = j3;
                }
                if ((i3 & 32) != 0) {
                    jOooO0OO = o00000O0.OooO0OO(jOooO0OO2, OooOo00.OooO0O0(composer, 8));
                    i4 &= -458753;
                }
                if (i7 != 0) {
                    f5 = 8;
                } else {
                    f5 = f4;
                }
                if ((i3 & 128) != 0) {
                    i9 = i4 & (-29360129);
                    f6 = f5;
                } else {
                    i9 = i4;
                    f6 = f2;
                }
                if ((i3 & 256) != 0) {
                    i10 = i9 & (-234881025);
                    f7 = f5;
                } else {
                    i10 = i9;
                    f7 = f3;
                }
                if ((i3 & 512) != 0) {
                    i11 = i10 & (-1879048193);
                    o000ooo2 = o00O0O.f3431OooO00o;
                } else {
                    i11 = i10;
                    o000ooo2 = o000ooo1;
                }
            }
            composer.Oooo0oO();
            o0o0o0o0 = o000.f6356OooO0o0;
            iOoooooO = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f5);
            j4 = jOooO0OO2;
            iOoooooO2 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooooO(f7);
            o00OO0OO o00oo0oo16 = o00OO0O0.OooO00o.f4176OooO0o0;
            i12 = ((i11 >> 3) & 14) | 48;
            composer.OooO0o0(733328855);
            o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo16, false, composer);
            composer.OooO0o0(-1323940314);
            oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0o0o0o1 = o000.f6360OooOO0O;
            function4 = function3;
            layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            i13 = iOooO;
            o0o0o0o2 = o000.f6364OooOOOO;
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            j5 = jOooO0OO;
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo2);
            i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
            o00oooo3 = o00oooo2;
            if (composer.OooOo0o() instanceof o00O000) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            o000ooo3 = o000ooo2;
            r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
            r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r7);
            r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r6);
            r29 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            f8 = f6;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r29, composer, "composer", composer), composer, Integer.valueOf((i14 >> 3) & 112));
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (((i14 >> 9) & 14 & 11) == 2) {
                if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                }
                Oooo0o0.o00O000.OooO oooOOooO0oo1110 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                o00OO0OO.OooO0O0 oooO0O119 = o00OO0O0.OooO00o.f4181OooOO0o;
                composer.OooO0o0(693286680);
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo1110, oooO0O119, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                f9 = f8;
                j6 = j5;
                o000ooo4 = o000ooo3;
                o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                composer.OooO0o0(-29724645);
                i16 = i13;
                while (i15 < i16) {
                    p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                    Unit unit1110 = Unit.INSTANCE;
                }
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o00OOOO0.OooO00o oooO00o1111 = o00OOOO0.OooO00o.f4198Oooo0o;
                objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                composer.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i17 < 5) {
                    zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                }
                objOooO0o = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                    composer.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                j7 = j4;
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o1111, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
            } else {
                if (((((i12 >> 6) & 112) | 6) & 81) == 16) {
                }
                Oooo0o0.o00O000.OooO oooOOooO0oo1111 = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f7);
                o00OO0OO.OooO0O0 oooO0O1110 = o00OO0O0.OooO00o.f4181OooOO0o;
                composer.OooO0o0(693286680);
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo1111, oooO0O1110, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r7, composer, layoutDirection2, r6, composer, o00ooooo3, r29, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                f9 = f8;
                j6 = j5;
                o000ooo4 = o000ooo3;
                o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooOO0O(oooO00o, f5, f9), j6, o000ooo4);
                composer.OooO0o0(-29724645);
                i16 = i13;
                while (i15 < i16) {
                    p028Oooo0o0.oOO00O.OooO00o(o00oooo0OooO0O0, composer, 0);
                    Unit unit1111 = Unit.INSTANCE;
                }
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o00OOOO0.OooO00o oooO00o1112 = o00OOOO0.OooO00o.f4198Oooo0o;
                objArr = new Object[]{function4, pagerState, Integer.valueOf(i16), Integer.valueOf(iOoooooO2), Integer.valueOf(iOoooooO)};
                composer.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i17 < 5) {
                    zOooo0oo |= composer.Oooo0oo(objArr[i17]);
                }
                objOooO0o = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                    composer.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO0O0(function4, pagerState, i16, iOoooooO2, iOoooooO);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                j7 = j4;
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooOO0O(OffsetKt.OooO00o(oooO00o1112, (Function1) objOooO0o), f5, f9), j7, o000ooo4), composer, 0);
            }
            o0O0OO0.OooO00o(composer);
            i18 = i16;
            j8 = j7;
            o000ooo5 = o000ooo4;
            function5 = function4;
            long j116 = j6;
            f10 = f9;
            f11 = f7;
            o00oooo4 = o00oooo3;
            f12 = f5;
            j9 = j116;
        }
        oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new C0364OooO0OO(pagerState, o00oooo4, i18, function5, j8, j9, f12, f10, f11, o000ooo5, i2, i3));
    }
}
