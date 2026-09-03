package p520o0o0O0oo;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000OO00;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0Oo0oo;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class h8 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53289OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(x6 x6Var) {
        super(1);
        this.f53289OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        x6 x6Var = this.f53289OooO0Oo;
        x6Var.getClass();
        o0Oo0oo o0oo0ooOooO0Oo = o00Oo0.OooO0Oo();
        o0oo0ooOooO0Oo.getClass();
        o0oo0ooOooO0Oo.OooO0o("neverShowCustomMadeGiftWarn" + o000000O.OooOOo0().getValue(), true);
        ConstraintLayout constraintLayout = x6Var.OooOOo().f58220OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.customGiftWarnContainer");
        o000OO00.OooO0O0(constraintLayout);
        return Unit.INSTANCE;
    }
}
