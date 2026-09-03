package p642o0ooOOo;

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
public abstract class oo0oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Function1<oO0000O, Unit>> f59597OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f59598OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<oO0000O, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f59600OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO0o00.OooO00o f59601OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f59602OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OO0o00.OooO00o oooO00o, float f, float f2) {
            super(1);
            this.f59601OooO0o0 = oooO00o;
            this.f59600OooO0o = f;
            this.f59602OooO0oO = f2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oO0000O oo0000o) {
            oO0000O state = oo0000o;
            Intrinsics.checkNotNullParameter(state, "state");
            oo0oO0 oo0oo0 = oo0oO0.this;
            o0OOooO0 o0ooooo0 = (o0OOooO0) oo0oo0;
            o0ooooo0.getClass();
            Intrinsics.checkNotNullParameter(state, "state");
            androidx.constraintlayout.core.state.OooO00o OooO00o2 = state.OooO00o(o0ooooo0.f59574OooO0OO);
            Intrinsics.checkNotNullExpressionValue(OooO00o2, "state.constraints(id)");
            Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o>[] function2Arr = o0OO000o.f59526OooO0O0[oo0oo0.f59598OooO0O0];
            o0OO0o00.OooO00o oooO00o = this.f59601OooO0o0;
            androidx.constraintlayout.core.state.OooO00o oooO00oInvoke = function2Arr[oooO00o.f59552OooO0O0].invoke(OooO00o2, oooO00o.f59551OooO00o);
            oooO00oInvoke.OooO0oO(Dp.m3763boximpl(this.f59600OooO0o));
            oooO00oInvoke.OooO0oo(Dp.m3763boximpl(this.f59602OooO0oO));
            return Unit.INSTANCE;
        }
    }

    public oo0oO0(@NotNull ArrayList tasks, int i) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f59597OooO00o = tasks;
        this.f59598OooO0O0 = i;
    }

    public final void OooO00o(@NotNull o0OO0o00.OooO00o anchor, float f, float f2) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f59597OooO00o.add(new OooO00o(anchor, f, f2));
    }
}
