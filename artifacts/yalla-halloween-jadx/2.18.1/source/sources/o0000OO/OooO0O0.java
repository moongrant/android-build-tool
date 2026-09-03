package o0000OO;

import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 implements o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Function1<o00000, Unit>> f27343OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27344OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<o00000, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f27345Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooOOO.OooO00o f27347Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f27348Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOO.OooO00o oooO00o, float f, float f2) {
            super(1);
            this.f27347Oooo0oO = oooO00o;
            this.f27348Oooo0oo = f;
            this.f27345Oooo = f2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00000 o00000Var) {
            o00000 state = o00000Var;
            Intrinsics.checkNotNullParameter(state, "state");
            OooOOO0 oooOOO0 = (OooOOO0) OooO0O0.this;
            Objects.requireNonNull(oooOOO0);
            Intrinsics.checkNotNullParameter(state, "state");
            androidx.constraintlayout.core.state.OooO00o OooO00o2 = state.OooO00o(oooOOO0.f27374OooO0OO);
            Intrinsics.checkNotNullExpressionValue(OooO00o2, "state.constraints(id)");
            OooO0O0 oooO0O0 = OooO0O0.this;
            OooOOO.OooO00o oooO00o = this.f27347Oooo0oO;
            float f = this.f27348Oooo0oo;
            float f2 = this.f27345Oooo;
            androidx.constraintlayout.core.state.OooO00o oooO00oInvoke = o0000OO.OooO00o.f27334OooO0O0[oooO0O0.f27344OooO0O0][oooO00o.f27371OooO0O0].invoke(OooO00o2, oooO00o.f27370OooO00o);
            oooO00oInvoke.OooO(new o0000O0O.OooOOO0(f));
            oooO00oInvoke.OooOO0(new o0000O0O.OooOOO0(f2));
            return Unit.INSTANCE;
        }
    }

    public OooO0O0(@NotNull List<Function1<o00000, Unit>> tasks, int i) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f27343OooO00o = tasks;
        this.f27344OooO0O0 = i;
    }

    public final void OooO00o(@NotNull OooOOO.OooO00o anchor, float f, float f2) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f27343OooO00o.add(new OooO00o(anchor, f, f2));
    }
}
