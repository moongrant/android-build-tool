package Oooo000;

import androidx.compose.animation.EnterExitState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00O extends o000OOo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final p023Oooo00O.oo00o<EnterExitState>.OooO00o<o0000O0O.OooOo, p023Oooo00O.o0OO00O> f920Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00O00> f921OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00O00> f922OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final Function1<Oooo00O.oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.OooOo>> f923OoooO0O;

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

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f925OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O0O00.o000O000 f926OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O0O00.o000O000 o000o001, long j) {
            super(1);
            this.f926OoooO00 = o000o001;
            this.f925OoooO0 = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
            o0O0O00.o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o00O00O o00o00o2 = o00O00O.this;
            o0O0O00.o000O000.OooO00o.OooOOO0(layout, this.f926OoooO00, ((o0000O0O.OooOo) ((Oooo00O.oo00o.OooO00o.C0010OooO00o) o00o00o2.f920Oooo.OooO00o(o00o00o2.f923OoooO0O, new oOO00O(o00o00o2, this.f925OoooO0))).getValue()).f27332OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Oooo00O.oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.OooOo>> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p023Oooo00O.o0000O0O<o0000O0O.OooOo> invoke(Oooo00O.oo00o.OooO0O0<EnterExitState> oooO0O0) {
            p023Oooo00O.o0000O0O<o0000O0O.OooOo> o0000o0o2;
            p023Oooo00O.o0000O0O<o0000O0O.OooOo> o0000o0o3;
            Oooo00O.oo00o.OooO0O0<EnterExitState> oooO0O1 = oooO0O0;
            Intrinsics.checkNotNullParameter(oooO0O1, "$this$null");
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (oooO0O1.OooO0O0(enterExitState, enterExitState2)) {
                o00O00 value = o00O00O.this.f922OoooO00.getValue();
                return (value == null || (o0000o0o3 = value.f916OooO0O0) == null) ? o000OOo.f890OooO0Oo : o0000o0o3;
            }
            if (!oooO0O1.OooO0O0(enterExitState2, EnterExitState.PostExit)) {
                return o000OOo.f890OooO0Oo;
            }
            o00O00 value2 = o00O00O.this.f921OoooO0.getValue();
            return (value2 == null || (o0000o0o2 = value2.f916OooO0O0) == null) ? o000OOo.f890OooO0Oo : o0000o0o2;
        }
    }

    public o00O00O(@NotNull p023Oooo00O.oo00o<EnterExitState>.OooO00o<o0000O0O.OooOo, p023Oooo00O.o0OO00O> lazyAnimation, @NotNull oO0Oo<o00O00> slideIn, @NotNull oO0Oo<o00O00> slideOut) {
        Intrinsics.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(slideIn, "slideIn");
        Intrinsics.checkNotNullParameter(slideOut, "slideOut");
        this.f920Oooo = lazyAnimation;
        this.f922OoooO00 = slideIn;
        this.f921OoooO0 = slideOut;
        this.f923OoooO0O = new OooO0OO();
    }

    @Override // o0O0O00.o00oO0o
    @NotNull
    public final o0O0O00.o000000O OoooO0(@NotNull o0O0O00.o00000O0 measure, @NotNull o0O0O00.o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
        return measure.OooOooo(o000o000Oooo000.f35285Oooo, o000o000Oooo000.f35287OoooO00, MapsKt.emptyMap(), new OooO0O0(o000o000Oooo000, o0000O0O.o0OoOo0.OooO00o(o000o000Oooo000.f35285Oooo, o000o000Oooo000.f35287OoooO00)));
    }
}
