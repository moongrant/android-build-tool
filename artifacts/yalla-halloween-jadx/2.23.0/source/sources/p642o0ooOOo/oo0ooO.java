package p642o0ooOOo;

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
public abstract class oo0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Function1<oO0000O, Unit>> f59603OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f59604OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<oO0000O, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f59606OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO0o00.OooO0O0 f59607OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f59608OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OO0o00.OooO0O0 oooO0O0, float f, float f2) {
            super(1);
            this.f59607OooO0o0 = oooO0O0;
            this.f59606OooO0o = f;
            this.f59608OooO0oO = f2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oO0000O oo0000o) {
            oO0000O state = oo0000o;
            Intrinsics.checkNotNullParameter(state, "state");
            LayoutDirection layoutDirection = state.f59591OooO0oo;
            if (layoutDirection == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
                throw null;
            }
            oo0ooO oo0ooo = oo0ooO.this;
            int i = oo0ooo.f59604OooO0O0;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            if (i < 0) {
                i = layoutDirection == LayoutDirection.Ltr ? i + 2 : (-i) - 1;
            }
            o0OO0o00.OooO0O0 oooO0O0 = this.f59607OooO0o0;
            int i2 = oooO0O0.f59554OooO0O0;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            if (i2 < 0) {
                i2 = layoutDirection == LayoutDirection.Ltr ? i2 + 2 : (-i2) - 1;
            }
            Intrinsics.checkNotNullParameter(state, "state");
            androidx.constraintlayout.core.state.OooO00o OooO00o2 = state.OooO00o(((o0OOo000) oo0ooo).f59573OooO0OO);
            Intrinsics.checkNotNullExpressionValue(OooO00o2, "state.constraints(id)");
            Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> function3 = o0OO000o.f59525OooO00o[i][i2];
            LayoutDirection layoutDirection2 = state.f59591OooO0oo;
            if (layoutDirection2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
                throw null;
            }
            androidx.constraintlayout.core.state.OooO00o oooO00oInvoke = function3.invoke(OooO00o2, oooO0O0.f59553OooO00o, layoutDirection2);
            oooO00oInvoke.OooO0oO(Dp.m3763boximpl(this.f59606OooO0o));
            oooO00oInvoke.OooO0oo(Dp.m3763boximpl(this.f59608OooO0oO));
            return Unit.INSTANCE;
        }
    }

    public oo0ooO(@NotNull ArrayList tasks, int i) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f59603OooO00o = tasks;
        this.f59604OooO0O0 = i;
    }

    public final void OooO00o(@NotNull o0OO0o00.OooO0O0 anchor, float f, float f2) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f59603OooO00o.add(new OooO00o(anchor, f, f2));
    }
}
