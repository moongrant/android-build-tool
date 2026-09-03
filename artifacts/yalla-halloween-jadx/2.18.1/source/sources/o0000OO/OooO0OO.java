package o0000OO;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO implements o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Function1<o00000, Unit>> f27349OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27350OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<o00000, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f27351Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooOOO.OooO0O0 f27353Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f27354Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOO.OooO0O0 oooO0O0, float f, float f2) {
            super(1);
            this.f27353Oooo0oO = oooO0O0;
            this.f27354Oooo0oo = f;
            this.f27351Oooo = f2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00000 o00000Var) {
            o00000 state = o00000Var;
            Intrinsics.checkNotNullParameter(state, "state");
            LayoutDirection layoutDirection = state.f27389OooO0oo;
            if (layoutDirection == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
                throw null;
            }
            int i = OooO0OO.this.f27350OooO0O0;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            if (i < 0) {
                i = layoutDirection == LayoutDirection.Ltr ? i + 2 : (-i) - 1;
            }
            int i2 = this.f27353Oooo0oO.f27373OooO0O0;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            if (i2 < 0) {
                i2 = layoutDirection == LayoutDirection.Ltr ? i2 + 2 : (-i2) - 1;
            }
            oo000o oo000oVar = (oo000o) OooO0OO.this;
            Objects.requireNonNull(oo000oVar);
            Intrinsics.checkNotNullParameter(state, "state");
            androidx.constraintlayout.core.state.OooO00o OooO00o2 = state.OooO00o(oo000oVar.f27421OooO0OO);
            Intrinsics.checkNotNullExpressionValue(OooO00o2, "state.constraints(id)");
            OooOOO.OooO0O0 oooO0O0 = this.f27353Oooo0oO;
            float f = this.f27354Oooo0oo;
            float f2 = this.f27351Oooo;
            Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> function3 = o0000OO.OooO00o.f27333OooO00o[i][i2];
            Object obj = oooO0O0.f27372OooO00o;
            LayoutDirection layoutDirection2 = state.f27389OooO0oo;
            if (layoutDirection2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
                throw null;
            }
            androidx.constraintlayout.core.state.OooO00o oooO00oInvoke = function3.invoke(OooO00o2, obj, layoutDirection2);
            oooO00oInvoke.OooO(new o0000O0O.OooOOO0(f));
            oooO00oInvoke.OooOO0(new o0000O0O.OooOOO0(f2));
            return Unit.INSTANCE;
        }
    }

    public OooO0OO(@NotNull List<Function1<o00000, Unit>> tasks, int i) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f27349OooO00o = tasks;
        this.f27350OooO0O0 = i;
    }

    public final void OooO00o(@NotNull OooOOO.OooO0O0 anchor, float f, float f2) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f27349OooO00o.add(new OooO00o(anchor, f, f2));
    }
}
