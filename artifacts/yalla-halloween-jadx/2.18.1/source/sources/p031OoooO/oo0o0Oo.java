package p031OoooO;

import Oooo0.o000oOoO;
import Oooo0.o00OOO0;
import Oooo0.o00OOO00;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00000O0;
import p023Oooo00O.o0000O0;
import p023Oooo00O.o000O0O0;
import p023Oooo00O.o000OO0O;
import p023Oooo00O.o000Oo0;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.o00oO0o;
import p023Oooo00O.oo0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p191o00o0O.o000000;
import p191o00o0O.o0OOO0o;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f2904OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float f2905OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final float f2906OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final o00000O0 f2907OooO0Oo;

    public static final class OooO extends Lambda implements Function1<o0Oo0oo, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f2908Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ float f2909Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f2910Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, float f, long j2) {
            super(1);
            this.f2908Oooo0o = j;
            this.f2909Oooo0oO = f;
            this.f2910Oooo0oo = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0Oo0oo o0oo0oo2) {
            o0Oo0oo Canvas = o0oo0oo2;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fOooO0O0 = OooOo00.OooO0O0(Canvas.OooO0OO());
            oo0o0Oo.OooO0OO(Canvas, 1.0f, this.f2908Oooo0o, fOooO0O0);
            oo0o0Oo.OooO0OO(Canvas, this.f2909Oooo0oO, this.f2910Oooo0oo, fOooO0O0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o0Oo0oo, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Integer> f2911Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f2912Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f2913Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f2914Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Float> f2915OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Float> f2916OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Float> f2917OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, long j, o000000 o000000Var, oO0Oo<Integer> oo0oo, oO0Oo<Float> oo0oo2, oO0Oo<Float> oo0oo3, oO0Oo<Float> oo0oo4) {
            super(1);
            this.f2912Oooo0o = f;
            this.f2913Oooo0oO = j;
            this.f2914Oooo0oo = o000000Var;
            this.f2911Oooo = oo0oo;
            this.f2916OoooO00 = oo0oo2;
            this.f2915OoooO0 = oo0oo3;
            this.f2917OoooO0O = oo0oo4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0Oo0oo o0oo0oo2) {
            o0Oo0oo Canvas = o0oo0oo2;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fIntValue = (this.f2911Oooo.getValue().intValue() * 216.0f) % 360.0f;
            float fAbs = Math.abs(this.f2916OoooO00.getValue().floatValue() - this.f2915OoooO0.getValue().floatValue());
            float fFloatValue = this.f2915OoooO0.getValue().floatValue() + this.f2917OoooO0O.getValue().floatValue() + (fIntValue - 90.0f);
            float f = this.f2912Oooo0o;
            long j = this.f2913Oooo0oO;
            o000000 o000000Var = this.f2914Oooo0oo;
            float f2 = 2;
            float f3 = (((f / (oo0o0Oo.f2906OooO0OO / f2)) * 57.29578f) / 2.0f) + fFloatValue;
            float fMax = Math.max(fAbs, 0.1f);
            float f4 = o000000Var.f33060OooO00o / f2;
            float fOooO0Oo = OooOo00.OooO0Oo(Canvas.OooO0OO()) - (f2 * f4);
            o0OOO0o.OooO0O0(Canvas, j, f3, fMax, false, o00O0O.OooOO0.OooO00o(f4, f4), OooOo.OooO00o(fOooO0Oo, fOooO0Oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o000000Var, null, 0, 832, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f2918Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f2919Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f2920Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f2921Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f2922OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OOOO0 o00oooo1, long j, float f, int i, int i2) {
            super(2);
            this.f2919Oooo0o = o00oooo1;
            this.f2920Oooo0oO = j;
            this.f2921Oooo0oo = f;
            this.f2918Oooo = i;
            this.f2922OoooO00 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oo0o0Oo.OooO00o(this.f2919Oooo0o, this.f2920Oooo0oO, this.f2921Oooo0oo, ooo00o, this.f2918Oooo | 1, this.f2922OoooO00);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o000O0O0.OooO0O0<Float>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f2923Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O0O0.OooO0O0<Float> oooO0O0) {
            o000O0O0.OooO0O0<Float> keyframes = oooO0O0;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.f1070OooO00o = 1332;
            keyframes.OooO0O0(keyframes.OooO00o(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), 0), oo0o0Oo.f2907OooO0Oo);
            keyframes.OooO00o(Float.valueOf(290.0f), 666);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o000O0O0.OooO0O0<Float>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f2924Oooo0o = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O0O0.OooO0O0<Float> oooO0O0) {
            o000O0O0.OooO0O0<Float> keyframes = oooO0O0;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.f1070OooO00o = 1332;
            keyframes.OooO0O0(keyframes.OooO00o(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), 666), oo0o0Oo.f2907OooO0Oo);
            keyframes.OooO00o(Float.valueOf(290.0f), keyframes.f1070OooO00o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f2925Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f2926Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f2927Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f2928Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f2929OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f2930OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(float f, o00OOOO0 o00oooo1, long j, long j2, int i, int i2) {
            super(2);
            this.f2926Oooo0o = f;
            this.f2927Oooo0oO = o00oooo1;
            this.f2928Oooo0oo = j;
            this.f2925Oooo = j2;
            this.f2930OoooO00 = i;
            this.f2929OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oo0o0Oo.OooO0O0(this.f2926Oooo0o, this.f2927Oooo0oO, this.f2928Oooo0oo, this.f2925Oooo, ooo00o, this.f2930OoooO00 | 1, this.f2929OoooO0);
            return Unit.INSTANCE;
        }
    }

    static {
        o0OO00O o0oo00o2 = o0OO00O.f2888OooO00o;
        f2904OooO00o = o0OO00O.f2889OooO0O0;
        f2905OooO0O0 = 240;
        f2906OooO0OO = 40;
        f2907OooO0Oo = new o00000O0(0.2f);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa A[PHI: r1 r3
      0x00aa: PHI (r1v8 OoooooO.o00OOOO0) = (r1v3 OoooooO.o00OOOO0), (r1v9 OoooooO.o00OOOO0) binds: [B:54:0x00a2, B:46:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r3v13 long) = (r3v6 long), (r3v14 long) binds: [B:54:0x00a2, B:46:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable o00OOOO0 o00oooo1, long j, float f, @Nullable oOO00O ooo00o, int i, int i2) {
        o00OOOO0 o00oooo2;
        int i3;
        long j2;
        float f2;
        o00OOOO0 o00oooo3;
        long jOooO0Oo;
        float f3;
        o00OOOO0 o00oooo4;
        long j3;
        float f4;
        oo0ooO oo0oooOooOo;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-392089979);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            o00oooo2 = o00oooo1;
        } else if ((i & 14) == 0) {
            o00oooo2 = o00oooo1;
            i3 = (ooo00oOooOOo.Oooo0oo(o00oooo2) ? 4 : 2) | i;
        } else {
            o00oooo2 = o00oooo1;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i5 = ooo00oOooOOo.OooOO0(j2) ? 32 : 16;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= ooo00oOooOOo.OooO0oO(f2) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !ooo00oOooOOo.OooOo0()) {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                    if (i4 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                    } else {
                        jOooO0Oo = j2;
                    }
                    if (i6 != 0) {
                        o0OO00O o0oo00o2 = o0OO00O.f2888OooO00o;
                        f3 = o0OO00O.f2889OooO0O0;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    o000000 o000000Var = new o000000(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).OoooOoo(f3), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2, 0, null, 26);
                    o000Oo0 o000oo0OooO0OO = o000OO0O.OooO0OO(ooo00oOooOOo);
                    IntCompanionObject intCompanionObject = IntCompanionObject.INSTANCE;
                    o00OO0O0<Float, p023Oooo00O.o0Oo0oo> o00oo0o1 = oo0O.f1293OooO00o;
                    Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
                    o00OO0O0<Integer, p023Oooo00O.o0Oo0oo> o00oo0o2 = oo0O.f1294OooO0O0;
                    o0000O0.OooO00o oooO00o = o0000O0.OooO00o.f1052OooO00o;
                    oO0Oo oo0ooOooO0O0 = o000OO0O.OooO0O0(o000oo0OooO0OO, 0, 5, o00oo0o2, o00oO0o.OooO00o(o00oO0o.OooO0Oo(6660, 0, oooO00o, 2), null, 6), ooo00oOooOOo);
                    oO0Oo oo0ooOooO00o = o000OO0O.OooO00o(o000oo0OooO0OO, 286.0f, o00oO0o.OooO00o(o00oO0o.OooO0Oo(1332, 0, oooO00o, 2), null, 6), ooo00oOooOOo);
                    oO0Oo oo0ooOooO00o2 = o000OO0O.OooO00o(o000oo0OooO0OO, 290.0f, o00oO0o.OooO00o(o00oO0o.OooO0O0(OooO0OO.f2923Oooo0o), null, 6), ooo00oOooOOo);
                    oO0Oo oo0ooOooO00o3 = o000OO0O.OooO00o(o000oo0OooO0OO, 290.0f, o00oO0o.OooO00o(o00oO0o.OooO0O0(OooO0o.f2924Oooo0o), null, 6), ooo00oOooOOo);
                    Intrinsics.checkNotNullParameter(o00oooo3, "<this>");
                    o000oOoO.OooO00o(SizeKt.OooOO0(SemanticsModifierKt.OooO00o(o00oooo3, true, o00OOO00.f688Oooo0o), f2906OooO0OO), new OooO00o(f3, jOooO0Oo, o000000Var, oo0ooOooO0O0, oo0ooOooO00o2, oo0ooOooO00o3, oo0ooOooO00o), ooo00oOooOOo, 0);
                    o00oooo4 = o00oooo3;
                    j3 = jOooO0Oo;
                    f4 = f3;
                } else {
                    ooo00oOooOOo.OooOoo0();
                    o00oooo3 = o00oooo2;
                    jOooO0Oo = j2;
                }
                f3 = f2;
                ooo00oOooOOo.Oooo0oO();
                o000000 o000000Var2 = new o000000(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).OoooOoo(f3), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2, 0, null, 26);
                o000Oo0 o000oo0OooO0OO2 = o000OO0O.OooO0OO(ooo00oOooOOo);
                IntCompanionObject intCompanionObject2 = IntCompanionObject.INSTANCE;
                o00OO0O0<Float, p023Oooo00O.o0Oo0oo> o00oo0o3 = oo0O.f1293OooO00o;
                Intrinsics.checkNotNullParameter(intCompanionObject2, "<this>");
                o00OO0O0<Integer, p023Oooo00O.o0Oo0oo> o00oo0o4 = oo0O.f1294OooO0O0;
                o0000O0.OooO00o oooO00o2 = o0000O0.OooO00o.f1052OooO00o;
                oO0Oo oo0ooOooO0O1 = o000OO0O.OooO0O0(o000oo0OooO0OO2, 0, 5, o00oo0o4, o00oO0o.OooO00o(o00oO0o.OooO0Oo(6660, 0, oooO00o2, 2), null, 6), ooo00oOooOOo);
                oO0Oo oo0ooOooO00o4 = o000OO0O.OooO00o(o000oo0OooO0OO2, 286.0f, o00oO0o.OooO00o(o00oO0o.OooO0Oo(1332, 0, oooO00o2, 2), null, 6), ooo00oOooOOo);
                oO0Oo oo0ooOooO00o5 = o000OO0O.OooO00o(o000oo0OooO0OO2, 290.0f, o00oO0o.OooO00o(o00oO0o.OooO0O0(OooO0OO.f2923Oooo0o), null, 6), ooo00oOooOOo);
                oO0Oo oo0ooOooO00o6 = o000OO0O.OooO00o(o000oo0OooO0OO2, 290.0f, o00oO0o.OooO00o(o00oO0o.OooO0O0(OooO0o.f2924Oooo0o), null, 6), ooo00oOooOOo);
                Intrinsics.checkNotNullParameter(o00oooo3, "<this>");
                o000oOoO.OooO00o(SizeKt.OooOO0(SemanticsModifierKt.OooO00o(o00oooo3, true, o00OOO00.f688Oooo0o), f2906OooO0OO), new OooO00o(f3, jOooO0Oo, o000000Var2, oo0ooOooO0O1, oo0ooOooO00o5, oo0ooOooO00o6, oo0ooOooO00o4), ooo00oOooOOo, 0);
                o00oooo4 = o00oooo3;
                j3 = jOooO0Oo;
                f4 = f3;
            } else {
                ooo00oOooOOo.OooOoo0();
                o00oooo4 = o00oooo2;
                j3 = j2;
                f4 = f2;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(o00oooo4, j3, f4, i, i2));
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 731) == 146) {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if ((i2 & 2) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j2;
                }
                if (i6 != 0) {
                    o0OO00O o0oo00o3 = o0OO00O.f2888OooO00o;
                    f3 = o0OO00O.f2889OooO0O0;
                } else {
                    f3 = f2;
                }
            } else {
                if (i4 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if ((i2 & 2) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j2;
                }
                if (i6 != 0) {
                    o0OO00O o0oo00o4 = o0OO00O.f2888OooO00o;
                    f3 = o0OO00O.f2889OooO0O0;
                } else {
                    f3 = f2;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            o000000 o000000Var3 = new o000000(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).OoooOoo(f3), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2, 0, null, 26);
            o000Oo0 o000oo0OooO0OO3 = o000OO0O.OooO0OO(ooo00oOooOOo);
            IntCompanionObject intCompanionObject3 = IntCompanionObject.INSTANCE;
            o00OO0O0<Float, p023Oooo00O.o0Oo0oo> o00oo0o5 = oo0O.f1293OooO00o;
            Intrinsics.checkNotNullParameter(intCompanionObject3, "<this>");
            o00OO0O0<Integer, p023Oooo00O.o0Oo0oo> o00oo0o6 = oo0O.f1294OooO0O0;
            o0000O0.OooO00o oooO00o3 = o0000O0.OooO00o.f1052OooO00o;
            oO0Oo oo0ooOooO0O2 = o000OO0O.OooO0O0(o000oo0OooO0OO3, 0, 5, o00oo0o6, o00oO0o.OooO00o(o00oO0o.OooO0Oo(6660, 0, oooO00o3, 2), null, 6), ooo00oOooOOo);
            oO0Oo oo0ooOooO00o7 = o000OO0O.OooO00o(o000oo0OooO0OO3, 286.0f, o00oO0o.OooO00o(o00oO0o.OooO0Oo(1332, 0, oooO00o3, 2), null, 6), ooo00oOooOOo);
            oO0Oo oo0ooOooO00o8 = o000OO0O.OooO00o(o000oo0OooO0OO3, 290.0f, o00oO0o.OooO00o(o00oO0o.OooO0O0(OooO0OO.f2923Oooo0o), null, 6), ooo00oOooOOo);
            oO0Oo oo0ooOooO00o9 = o000OO0O.OooO00o(o000oo0OooO0OO3, 290.0f, o00oO0o.OooO00o(o00oO0o.OooO0O0(OooO0o.f2924Oooo0o), null, 6), ooo00oOooOOo);
            Intrinsics.checkNotNullParameter(o00oooo3, "<this>");
            o000oOoO.OooO00o(SizeKt.OooOO0(SemanticsModifierKt.OooO00o(o00oooo3, true, o00OOO00.f688Oooo0o), f2906OooO0OO), new OooO00o(f3, jOooO0Oo, o000000Var3, oo0ooOooO0O2, oo0ooOooO00o8, oo0ooOooO00o9, oo0ooOooO00o7), ooo00oOooOOo, 0);
            o00oooo4 = o00oooo3;
            j3 = jOooO0Oo;
            f4 = f3;
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if ((i2 & 2) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j2;
                }
                if (i6 != 0) {
                    o0OO00O o0oo00o5 = o0OO00O.f2888OooO00o;
                    f3 = o0OO00O.f2889OooO0O0;
                } else {
                    f3 = f2;
                }
            } else {
                if (i4 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if ((i2 & 2) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j2;
                }
                if (i6 != 0) {
                    o0OO00O o0oo00o6 = o0OO00O.f2888OooO00o;
                    f3 = o0OO00O.f2889OooO0O0;
                } else {
                    f3 = f2;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            o000000 o000000Var4 = new o000000(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).OoooOoo(f3), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2, 0, null, 26);
            o000Oo0 o000oo0OooO0OO4 = o000OO0O.OooO0OO(ooo00oOooOOo);
            IntCompanionObject intCompanionObject4 = IntCompanionObject.INSTANCE;
            o00OO0O0<Float, p023Oooo00O.o0Oo0oo> o00oo0o7 = oo0O.f1293OooO00o;
            Intrinsics.checkNotNullParameter(intCompanionObject4, "<this>");
            o00OO0O0<Integer, p023Oooo00O.o0Oo0oo> o00oo0o8 = oo0O.f1294OooO0O0;
            o0000O0.OooO00o oooO00o4 = o0000O0.OooO00o.f1052OooO00o;
            oO0Oo oo0ooOooO0O3 = o000OO0O.OooO0O0(o000oo0OooO0OO4, 0, 5, o00oo0o8, o00oO0o.OooO00o(o00oO0o.OooO0Oo(6660, 0, oooO00o4, 2), null, 6), ooo00oOooOOo);
            oO0Oo oo0ooOooO00o10 = o000OO0O.OooO00o(o000oo0OooO0OO4, 286.0f, o00oO0o.OooO00o(o00oO0o.OooO0Oo(1332, 0, oooO00o4, 2), null, 6), ooo00oOooOOo);
            oO0Oo oo0ooOooO00o11 = o000OO0O.OooO00o(o000oo0OooO0OO4, 290.0f, o00oO0o.OooO00o(o00oO0o.OooO0O0(OooO0OO.f2923Oooo0o), null, 6), ooo00oOooOOo);
            oO0Oo oo0ooOooO00o12 = o000OO0O.OooO00o(o000oo0OooO0OO4, 290.0f, o00oO0o.OooO00o(o00oO0o.OooO0O0(OooO0o.f2924Oooo0o), null, 6), ooo00oOooOOo);
            Intrinsics.checkNotNullParameter(o00oooo3, "<this>");
            o000oOoO.OooO00o(SizeKt.OooOO0(SemanticsModifierKt.OooO00o(o00oooo3, true, o00OOO00.f688Oooo0o), f2906OooO0OO), new OooO00o(f3, jOooO0Oo, o000000Var4, oo0ooOooO0O3, oo0ooOooO00o11, oo0ooOooO00o12, oo0ooOooO00o10), ooo00oOooOOo, 0);
            o00oooo4 = o00oooo3;
            j3 = jOooO0Oo;
            f4 = f3;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00oooo4, j3, f4, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0059  */
    /* JADX WARN: Code duplicated, block: B:39:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x006e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(float f, @Nullable o00OOOO0 o00oooo1, long j, long j2, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        long j3;
        long jOooO0OO;
        o00OOOO0 o00oooo2;
        long jOooO0Oo;
        boolean zOooo0oo;
        Object objOooO0o;
        long j4;
        oo0ooO oo0oooOooOo;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-850309746);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.OooO0oO(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                i3 |= ooo00oOooOOo.Oooo0oo(o00oooo1) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    int i5 = ooo00oOooOOo.OooOO0(j3) ? 256 : 128;
                    i3 |= i5;
                } else {
                    j3 = j;
                }
                i3 |= i5;
            } else {
                j3 = j;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    jOooO0OO = j2;
                    int i6 = ooo00oOooOOo.OooOO0(jOooO0OO) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
                    i3 |= i6;
                } else {
                    jOooO0OO = j2;
                }
                i3 |= i6;
            } else {
                jOooO0OO = j2;
            }
            if ((i3 & 5851) == 1170 || !ooo00oOooOOo.OooOo0()) {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                    if (i4 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 4) != 0) {
                        jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                    } else {
                        jOooO0Oo = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = p145o00Oo0.o00000O0.OooO0OO(jOooO0Oo, 0.24f);
                    }
                } else {
                    ooo00oOooOOo.OooOoo0();
                    o00oooo2 = o00oooo1;
                    jOooO0Oo = j3;
                }
                ooo00oOooOOo.Oooo0oO();
                o00OOOO0 o00oooo0OooOO0O = SizeKt.OooOO0O(o00OOO0.OooO00o(o00oooo2, f), f2905OooO0O0, f2904OooO00o);
                p145o00Oo0.o00000O0 o00000o1 = new p145o00Oo0.o00000O0(jOooO0OO);
                Float fValueOf = Float.valueOf(f);
                p145o00Oo0.o00000O0 o00000o2 = new p145o00Oo0.o00000O0(jOooO0Oo);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(o00000o1) | ooo00oOooOOo.Oooo0oo(fValueOf) | ooo00oOooOOo.Oooo0oo(o00000o2);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = new OooO(jOooO0OO, f, jOooO0Oo);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o000oOoO.OooO00o(o00oooo0OooOO0O, (Function1) objOooO0o, ooo00oOooOOo, 0);
            } else {
                ooo00oOooOOo.OooOoo0();
                o00oooo2 = o00oooo1;
                jOooO0Oo = j3;
            }
            j4 = jOooO0OO;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0(f, o00oooo2, jOooO0Oo, j4, i, i2));
        }
        i3 |= 48;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (ooo00oOooOOo.OooOO0(j3)) {
                }
                i3 |= i5;
            } else {
                j3 = j;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                jOooO0OO = j2;
                if (ooo00oOooOOo.OooOO0(jOooO0OO)) {
                }
                i3 |= i6;
            } else {
                jOooO0OO = j2;
            }
            i3 |= i6;
        } else {
            jOooO0OO = j2;
        }
        if ((i3 & 5851) == 1170) {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i2 & 4) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j3;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = p145o00Oo0.o00000O0.OooO0OO(jOooO0Oo, 0.24f);
                }
            } else {
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i2 & 4) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j3;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = p145o00Oo0.o00000O0.OooO0OO(jOooO0Oo, 0.24f);
                }
            }
            ooo00oOooOOo.Oooo0oO();
            o00OOOO0 o00oooo0OooOO0O2 = SizeKt.OooOO0O(o00OOO0.OooO00o(o00oooo2, f), f2905OooO0O0, f2904OooO00o);
            p145o00Oo0.o00000O0 o00000o3 = new p145o00Oo0.o00000O0(jOooO0OO);
            Float fValueOf2 = Float.valueOf(f);
            p145o00Oo0.o00000O0 o00000o4 = new p145o00Oo0.o00000O0(jOooO0Oo);
            ooo00oOooOOo.OooO0o0(1618982084);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(o00000o3) | ooo00oOooOOo.Oooo0oo(fValueOf2) | ooo00oOooOOo.Oooo0oo(o00000o4);
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO(jOooO0OO, f, jOooO0Oo);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO(jOooO0OO, f, jOooO0Oo);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o000oOoO.OooO00o(o00oooo0OooOO0O2, (Function1) objOooO0o, ooo00oOooOOo, 0);
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i2 & 4) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j3;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = p145o00Oo0.o00000O0.OooO0OO(jOooO0Oo, 0.24f);
                }
            } else {
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i2 & 4) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j3;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = p145o00Oo0.o00000O0.OooO0OO(jOooO0Oo, 0.24f);
                }
            }
            ooo00oOooOOo.Oooo0oO();
            o00OOOO0 o00oooo0OooOO0O3 = SizeKt.OooOO0O(o00OOO0.OooO00o(o00oooo2, f), f2905OooO0O0, f2904OooO00o);
            p145o00Oo0.o00000O0 o00000o5 = new p145o00Oo0.o00000O0(jOooO0OO);
            Float fValueOf3 = Float.valueOf(f);
            p145o00Oo0.o00000O0 o00000o6 = new p145o00Oo0.o00000O0(jOooO0Oo);
            ooo00oOooOOo.OooO0o0(1618982084);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(o00000o5) | ooo00oOooOOo.Oooo0oo(fValueOf3) | ooo00oOooOOo.Oooo0oo(o00000o6);
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO(jOooO0OO, f, jOooO0Oo);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO(jOooO0OO, f, jOooO0Oo);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o000oOoO.OooO00o(o00oooo0OooOO0O3, (Function1) objOooO0o, ooo00oOooOOo, 0);
        }
        j4 = jOooO0OO;
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0(f, o00oooo2, jOooO0Oo, j4, i, i2));
    }

    public static final void OooO0OO(o0Oo0oo o0oo0oo2, float f, long j, float f2) {
        float fOooO0Oo = OooOo00.OooO0Oo(o0oo0oo2.OooO0OO());
        float fOooO0O0 = OooOo00.OooO0O0(o0oo0oo2.OooO0OO()) / 2;
        boolean z = o0oo0oo2.getLayoutDirection() == LayoutDirection.Ltr;
        o0oo0oo2.OooOo(j, o00O0O.OooOO0.OooO00o((z ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f - f) * fOooO0Oo, fOooO0O0), o00O0O.OooOO0.OooO00o((z ? f : 1.0f) * fOooO0Oo, fOooO0O0), (384 & 8) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f2, (384 & 16) != 0 ? 0 : 0, (384 & 32) != 0 ? null : null, (384 & 64) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, (384 & 256) != 0 ? 3 : 0);
    }
}
