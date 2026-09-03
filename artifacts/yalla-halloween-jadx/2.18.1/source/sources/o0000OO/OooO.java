package o0000OO;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function1<o00000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f27331Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f27332Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooOO0 oooOO1, o0OO00O o0oo00o2) {
        super(1);
        this.f27331Oooo0o = oooOO1;
        this.f27332Oooo0oO = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000 o00000Var) {
        o00000 state = o00000Var;
        Intrinsics.checkNotNullParameter(state, "state");
        androidx.constraintlayout.core.state.OooO00o OooO00o2 = state.OooO00o(this.f27331Oooo0o.f27357OooO00o);
        oo0o0Oo oo0o0oo = (oo0o0Oo) this.f27332Oooo0oO;
        Objects.requireNonNull(oo0o0oo);
        Intrinsics.checkNotNullParameter(state, "state");
        OooO00o2.f6879Oooo00o = oo0o0oo.f27422OooO00o.invoke(state);
        return Unit.INSTANCE;
    }
}
