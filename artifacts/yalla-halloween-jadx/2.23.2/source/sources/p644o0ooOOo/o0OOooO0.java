package p644o0ooOOo;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OOooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Function1<oO0Ooooo, Unit>> f58066OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f58067OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<oO0Ooooo, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f58069OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOO0.OooO0O0 f58070OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f58071OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OOO0.OooO0O0 oooO0O0, float f, float f2) {
            super(1);
            this.f58070OooO0o0 = oooO0O0;
            this.f58069OooO0o = f;
            this.f58071OooO0oO = f2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oO0Ooooo oo0ooooo) {
            oO0Ooooo state = oo0ooooo;
            Intrinsics.checkNotNullParameter(state, "state");
            LayoutDirection layoutDirection = state.f58093OooO0oo;
            if (layoutDirection == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
                throw null;
            }
            o0OOooO0 o0ooooo0 = o0OOooO0.this;
            int i = o0ooooo0.f58067OooO0O0;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            if (i < 0) {
                i = layoutDirection == LayoutDirection.Ltr ? i + 2 : (-i) - 1;
            }
            o0OOO0.OooO0O0 oooO0O0 = this.f58070OooO0o0;
            int i2 = oooO0O0.f58056OooO0O0;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            if (i2 < 0) {
                i2 = layoutDirection == LayoutDirection.Ltr ? i2 + 2 : (-i2) - 1;
            }
            Intrinsics.checkNotNullParameter(state, "state");
            androidx.constraintlayout.core.state.OooO00o OooO00o2 = state.OooO00o(((o) o0ooooo0).f58019OooO0OO);
            Intrinsics.checkNotNullExpressionValue(OooO00o2, "state.constraints(id)");
            Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> function3 = o0OO0.f58025OooO00o[i][i2];
            LayoutDirection layoutDirection2 = state.f58093OooO0oo;
            if (layoutDirection2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
                throw null;
            }
            androidx.constraintlayout.core.state.OooO00o oooO00oInvoke = function3.invoke(OooO00o2, oooO0O0.f58055OooO00o, layoutDirection2);
            oooO00oInvoke.OooO0oO(Dp.m3773boximpl(this.f58069OooO0o));
            oooO00oInvoke.OooO0oo(Dp.m3773boximpl(this.f58071OooO0oO));
            return Unit.INSTANCE;
        }
    }

    public o0OOooO0(@NotNull ArrayList tasks, int i) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f58066OooO00o = tasks;
        this.f58067OooO0O0 = i;
    }

    public final void OooO00o(@NotNull o0OOO0.OooO0O0 anchor, float f, float f2) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f58066OooO00o.add(new OooO00o(anchor, f, f2));
    }
}
