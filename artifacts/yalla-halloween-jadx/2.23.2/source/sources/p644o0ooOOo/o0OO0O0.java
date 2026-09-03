package p644o0ooOOo;

import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Function1<oO0Ooooo, Unit>> f58035OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f58036OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<oO0Ooooo, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f58038OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOO0.OooO00o f58039OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f58040OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OOO0.OooO00o oooO00o, float f, float f2) {
            super(1);
            this.f58039OooO0o0 = oooO00o;
            this.f58038OooO0o = f;
            this.f58040OooO0oO = f2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oO0Ooooo oo0ooooo) {
            oO0Ooooo state = oo0ooooo;
            Intrinsics.checkNotNullParameter(state, "state");
            o0OO0O0 o0oo0o1 = o0OO0O0.this;
            o0OOO00 o0ooo00 = (o0OOO00) o0oo0o1;
            o0ooo00.getClass();
            Intrinsics.checkNotNullParameter(state, "state");
            androidx.constraintlayout.core.state.OooO00o OooO00o2 = state.OooO00o(o0ooo00.f58057OooO0OO);
            Intrinsics.checkNotNullExpressionValue(OooO00o2, "state.constraints(id)");
            Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o>[] function2Arr = o0OO0.f58026OooO0O0[o0oo0o1.f58036OooO0O0];
            o0OOO0.OooO00o oooO00o = this.f58039OooO0o0;
            androidx.constraintlayout.core.state.OooO00o oooO00oInvoke = function2Arr[oooO00o.f58054OooO0O0].invoke(OooO00o2, oooO00o.f58053OooO00o);
            oooO00oInvoke.OooO0oO(Dp.m3773boximpl(this.f58038OooO0o));
            oooO00oInvoke.OooO0oo(Dp.m3773boximpl(this.f58040OooO0oO));
            return Unit.INSTANCE;
        }
    }

    public o0OO0O0(@NotNull ArrayList tasks, int i) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f58035OooO00o = tasks;
        this.f58036OooO0O0 = i;
    }

    public final void OooO00o(@NotNull o0OOO0.OooO00o anchor, float f, float f2) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f58035OooO00o.add(new OooO00o(anchor, f, f2));
    }
}
