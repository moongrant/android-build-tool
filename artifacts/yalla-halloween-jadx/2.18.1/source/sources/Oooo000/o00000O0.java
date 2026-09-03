package Oooo000;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p023Oooo00O.oo00o;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 extends Lambda implements Function3<oo00o.OooO0O0<EnterExitState>, p100o000oOoO.oOO00O, Integer, p023Oooo00O.o0000O0O<Float>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000OO0 f847Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O000 f848Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(o0000OO0 o0000oo1, o000O000 o000o001) {
        super(3);
        this.f847Oooo0o = o0000oo1;
        this.f848Oooo0oO = o000o001;
    }

    @Override // kotlin.jvm.functions.Function3
    public final p023Oooo00O.o0000O0O<Float> invoke(oo00o.OooO0O0<EnterExitState> oooO0O0, p100o000oOoO.oOO00O ooo00o, Integer num) {
        p023Oooo00O.o0000O0O<Float> o0000o0o2;
        o000O00 o000o01;
        oo00o.OooO0O0<EnterExitState> animateFloat = oooO0O0;
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        ooo00o2.OooO0o0(-57153604);
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (animateFloat.OooO0O0(enterExitState, enterExitState2)) {
            o000O00 o000o02 = this.f847Oooo0o.OooO00o().f934OooO00o;
            if (o000o02 == null || (o0000o0o2 = o000o02.f868OooO0O0) == null) {
                o0000o0o2 = o000000.f835OooO0OO;
            }
        } else if (!animateFloat.OooO0O0(enterExitState2, EnterExitState.PostExit) || (o000o01 = this.f848Oooo0oO.OooO00o().f934OooO00o) == null || (o0000o0o2 = o000o01.f868OooO0O0) == null) {
            o0000o0o2 = o000000.f835OooO0OO;
        }
        ooo00o2.Oooo0o0();
        return o0000o0o2;
    }
}
