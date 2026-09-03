package p650o0ooo;

import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g5 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ h5 f58249OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(h5 h5Var) {
        super(0);
        this.f58249OooO0Oo = h5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        h5 h5Var = this.f58249OooO0Oo;
        h5Var.f58268OooOO0O.f43718OooO0OO.OooO0o();
        SVGAView svgaLoading = h5Var.f58268OooOO0O.f43718OooO0OO;
        Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
        o000O.OooO0O0(svgaLoading);
        return Unit.INSTANCE;
    }
}
