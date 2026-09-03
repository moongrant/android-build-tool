package Oooo000;

import androidx.compose.animation.EnterExitState;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000o extends Lambda implements Function1<EnterExitState, o0000O0O.OooOo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O000 f931Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f932Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(o00O000 o00o001, long j) {
        super(1);
        this.f931Oooo0o = o00o001;
        this.f932Oooo0oO = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0000O0O.OooOo invoke(EnterExitState enterExitState) {
        long j;
        long j2;
        Function1<o0000O0O.o000oOoO, o0000O0O.OooOo> function1;
        Function1<o0000O0O.o000oOoO, o0000O0O.OooOo> function2;
        EnterExitState targetState = enterExitState;
        Intrinsics.checkNotNullParameter(targetState, "it");
        o00O000 o00o001 = this.f931Oooo0o;
        long j3 = this.f932Oooo0oO;
        Objects.requireNonNull(o00o001);
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        o00oOoo value = o00o001.f925Oooo0oO.getValue();
        if (value == null || (function2 = value.f977OooO00o) == null) {
            o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
            j = o0000O0O.OooOo.f27311OooO0OO;
        } else {
            j = function2.invoke(new o0000O0O.o000oOoO(j3)).f27312OooO00o;
        }
        o00oOoo value2 = o00o001.f926Oooo0oo.getValue();
        if (value2 == null || (function1 = value2.f977OooO00o) == null) {
            o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
            j2 = o0000O0O.OooOo.f27311OooO0OO;
        } else {
            j2 = function1.invoke(new o0000O0O.o000oOoO(j3)).f27312OooO00o;
        }
        int i = o00O000.OooO00o.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27310OooO0O0;
            j = o0000O0O.OooOo.f27311OooO0OO;
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = j2;
        }
        return new o0000O0O.OooOo(j);
    }
}
