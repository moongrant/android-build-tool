package Oooo000;

import androidx.compose.animation.EnterExitState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.oo00o;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 extends o000O0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Function1<oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.OooOo>> f923Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final oo00o<EnterExitState>.OooO00o<o0000O0O.OooOo, p023Oooo00O.o0OO00O> f924Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00oOoo> f925Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00oOoo> f926Oooo0oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O00.o000O000 f928Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f929Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O0O00.o000O000 o000o001, long j) {
            super(1);
            this.f928Oooo0oO = o000o001;
            this.f929Oooo0oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
            o0O0O00.o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o00O000 o00o001 = o00O000.this;
            o0O0O00.o000O000.OooO00o.OooOOO0(layout, this.f928Oooo0oO, ((o0000O0O.OooOo) ((oo00o.OooO00o.C0010OooO00o) o00o001.f924Oooo0o.OooO00o(o00o001.f923Oooo, new o00O000o(o00o001, this.f929Oooo0oo))).getValue()).f27312OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.OooOo>> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p023Oooo00O.o0000O0O<o0000O0O.OooOo> invoke(oo00o.OooO0O0<EnterExitState> oooO0O0) {
            p023Oooo00O.o0000O0O<o0000O0O.OooOo> o0000o0o2;
            p023Oooo00O.o0000O0O<o0000O0O.OooOo> o0000o0o3;
            oo00o.OooO0O0<EnterExitState> oooO0O1 = oooO0O0;
            Intrinsics.checkNotNullParameter(oooO0O1, "$this$null");
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (oooO0O1.OooO0O0(enterExitState, enterExitState2)) {
                o00oOoo value = o00O000.this.f925Oooo0oO.getValue();
                return (value == null || (o0000o0o3 = value.f978OooO0O0) == null) ? o000000.f836OooO0Oo : o0000o0o3;
            }
            if (!oooO0O1.OooO0O0(enterExitState2, EnterExitState.PostExit)) {
                return o000000.f836OooO0Oo;
            }
            o00oOoo value2 = o00O000.this.f926Oooo0oo.getValue();
            return (value2 == null || (o0000o0o2 = value2.f978OooO0O0) == null) ? o000000.f836OooO0Oo : o0000o0o2;
        }
    }

    public o00O000(@NotNull oo00o<EnterExitState>.OooO00o<o0000O0O.OooOo, p023Oooo00O.o0OO00O> lazyAnimation, @NotNull oO0Oo<o00oOoo> slideIn, @NotNull oO0Oo<o00oOoo> slideOut) {
        Intrinsics.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(slideIn, "slideIn");
        Intrinsics.checkNotNullParameter(slideOut, "slideOut");
        this.f924Oooo0o = lazyAnimation;
        this.f925Oooo0oO = slideIn;
        this.f926Oooo0oo = slideOut;
        this.f923Oooo = new OooO0OO();
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o0O0O00.o000000O OoooO0(@NotNull o0O0O00.o00000O0 measure, @NotNull o0O0O00.o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO0O0(o000o000Oooo000, o0000O0O.o0OoOo0.OooO00o(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO)));
    }
}
