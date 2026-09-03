package p650o0ooo;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import p230o00oOo0o.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f58640OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f58641OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(o0O0O00 o0o0o00, int i) {
        super(1);
        this.f58640OooO0Oo = o0o0o00;
        this.f58641OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayer = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        o0O0O00 o0o0o00 = this.f58640OooO0Oo;
        Intrinsics.checkNotNullParameter(o0o0o00, "<this>");
        float fLerp = MathHelpersKt.lerp(0.75f, 1.0f, 1.0f - RangesKt.coerceIn(Math.abs(o0o0o00.OooO0O0() + (o0o0o00.OooO00o() - this.f58641OooO0o0)), 0.0f, 1.0f));
        graphicsLayer.setScaleX(fLerp);
        graphicsLayer.setScaleY(fLerp);
        return Unit.INSTANCE;
    }
}
