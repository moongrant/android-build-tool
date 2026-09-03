package p519o0o0O0oO;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ooooO0O0 f52901OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(ooooO0O0 ooooo0o0) {
        super(0);
        this.f52901OooO0Oo = ooooo0o0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ooooO0O0 ooooo0o0 = this.f52901OooO0Oo;
        LinearLayout linearLayout = ooooo0o0.OooOO0().f59482OooOOo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llUserSelect");
        ooooo0o0.OooOOO0(linearLayout);
        return Unit.INSTANCE;
    }
}
