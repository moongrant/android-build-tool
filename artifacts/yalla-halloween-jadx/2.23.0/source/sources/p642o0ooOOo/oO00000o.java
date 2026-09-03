package p642o0ooOOo;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO00O.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class oO00000o extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f59587OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000o(OooO0O0 oooO0O0) {
        super(1);
        this.f59587OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayerScope2 = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayerScope2, "$this$null");
        OooO0O0 oooO0O0 = this.f59587OooO0Oo;
        if (!Float.isNaN(oooO0O0.f43005OooO0o) || !Float.isNaN(oooO0O0.f43007OooO0oO)) {
            graphicsLayerScope2.mo1840setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(oooO0O0.f43005OooO0o) ? 0.5f : oooO0O0.f43005OooO0o, Float.isNaN(oooO0O0.f43007OooO0oO) ? 0.5f : oooO0O0.f43007OooO0oO));
        }
        if (!Float.isNaN(oooO0O0.f43008OooO0oo)) {
            graphicsLayerScope2.setRotationX(oooO0O0.f43008OooO0oo);
        }
        if (!Float.isNaN(oooO0O0.f43000OooO)) {
            graphicsLayerScope2.setRotationY(oooO0O0.f43000OooO);
        }
        if (!Float.isNaN(oooO0O0.f43009OooOO0)) {
            graphicsLayerScope2.setRotationZ(oooO0O0.f43009OooOO0);
        }
        if (!Float.isNaN(oooO0O0.f43010OooOO0O)) {
            graphicsLayerScope2.setTranslationX(oooO0O0.f43010OooOO0O);
        }
        if (!Float.isNaN(oooO0O0.f43011OooOO0o)) {
            graphicsLayerScope2.setTranslationY(oooO0O0.f43011OooOO0o);
        }
        if (!Float.isNaN(oooO0O0.f43013OooOOO0)) {
            graphicsLayerScope2.setShadowElevation(oooO0O0.f43013OooOOO0);
        }
        if (!Float.isNaN(oooO0O0.f43012OooOOO) || !Float.isNaN(oooO0O0.f43014OooOOOO)) {
            graphicsLayerScope2.setScaleX(Float.isNaN(oooO0O0.f43012OooOOO) ? 1.0f : oooO0O0.f43012OooOOO);
            graphicsLayerScope2.setScaleY(Float.isNaN(oooO0O0.f43014OooOOOO) ? 1.0f : oooO0O0.f43014OooOOOO);
        }
        if (!Float.isNaN(oooO0O0.f43015OooOOOo)) {
            graphicsLayerScope2.setAlpha(oooO0O0.f43015OooOOOo);
        }
        return Unit.INSTANCE;
    }
}
