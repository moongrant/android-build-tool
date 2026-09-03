package p519o0o0O0oO;

import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f5 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ g5 f52253OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(g5 g5Var) {
        super(0);
        this.f52253OooO0Oo = g5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        g5 g5Var = this.f52253OooO0Oo;
        g5Var.f52294OooOO0O.f58380OooO0OO.OooO0o();
        SVGAView sVGAView = g5Var.f52294OooOO0O.f58380OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "bind.svgaLoading");
        o000OO00.OooO0O0(sVGAView);
        return Unit.INSTANCE;
    }
}
