package p519o0o0O0oO;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import p184o00o00o.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f52759OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f52760OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(OooOo00 oooOo00, int i) {
        super(1);
        this.f52759OooO0Oo = oooOo00;
        this.f52760OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayer = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        OooOo00 oooOo00 = this.f52759OooO0Oo;
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        float fLerp = MathHelpersKt.lerp(0.75f, 1.0f, 1.0f - RangesKt.coerceIn(Math.abs(oooOo00.OooO0O0() + (oooOo00.OooO00o() - this.f52760OooO0o0)), 0.0f, 1.0f));
        graphicsLayer.setScaleX(fLerp);
        graphicsLayer.setScaleY(fLerp);
        return Unit.INSTANCE;
    }
}
