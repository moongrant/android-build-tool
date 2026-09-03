package Oooo000;

import androidx.compose.animation.EnterExitState;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O extends Lambda implements Function1<EnterExitState, o0000O0O.OooOo> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O00O f1006Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f1007OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(o00O00O o00o00o2, long j) {
        super(1);
        this.f1006Oooo = o00o00o2;
        this.f1007OoooO00 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0000O0O.OooOo invoke(EnterExitState enterExitState) {
        long j;
        long j2;
        Function1<o0000O0O.o000oOoO, o0000O0O.OooOo> function1;
        Function1<o0000O0O.o000oOoO, o0000O0O.OooOo> function2;
        EnterExitState targetState = enterExitState;
        Intrinsics.checkNotNullParameter(targetState, "it");
        o00O00O o00o00o2 = this.f1006Oooo;
        long j3 = this.f1007OoooO00;
        Objects.requireNonNull(o00o00o2);
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        o00O00 value = o00o00o2.f922OoooO00.getValue();
        if (value == null || (function2 = value.f915OooO00o) == null) {
            o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27330OooO0O0;
            j = o0000O0O.OooOo.f27331OooO0OO;
        } else {
            j = function2.invoke(new o0000O0O.o000oOoO(j3)).f27332OooO00o;
        }
        o00O00 value2 = o00o00o2.f921OoooO0.getValue();
        if (value2 == null || (function1 = value2.f915OooO00o) == null) {
            o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27330OooO0O0;
            j2 = o0000O0O.OooOo.f27331OooO0OO;
        } else {
            j2 = function1.invoke(new o0000O0O.o000oOoO(j3)).f27332OooO00o;
        }
        int i = o00O00O.OooO00o.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27330OooO0O0;
            j = o0000O0O.OooOo.f27331OooO0OO;
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = j2;
        }
        return new o0000O0O.OooOo(j);
    }
}
