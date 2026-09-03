package p644o0ooOOo;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO00O.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class oO000O0O extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f58089OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0O(OooO0O0 oooO0O0) {
        super(1);
        this.f58089OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        GraphicsLayerScope graphicsLayerScope2 = graphicsLayerScope;
        Intrinsics.checkNotNullParameter(graphicsLayerScope2, "$this$null");
        OooO0O0 oooO0O0 = this.f58089OooO0Oo;
        if (!Float.isNaN(oooO0O0.f42272OooO0o) || !Float.isNaN(oooO0O0.f42274OooO0oO)) {
            graphicsLayerScope2.mo1850setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(oooO0O0.f42272OooO0o) ? 0.5f : oooO0O0.f42272OooO0o, Float.isNaN(oooO0O0.f42274OooO0oO) ? 0.5f : oooO0O0.f42274OooO0oO));
        }
        if (!Float.isNaN(oooO0O0.f42275OooO0oo)) {
            graphicsLayerScope2.setRotationX(oooO0O0.f42275OooO0oo);
        }
        if (!Float.isNaN(oooO0O0.f42267OooO)) {
            graphicsLayerScope2.setRotationY(oooO0O0.f42267OooO);
        }
        if (!Float.isNaN(oooO0O0.f42276OooOO0)) {
            graphicsLayerScope2.setRotationZ(oooO0O0.f42276OooOO0);
        }
        if (!Float.isNaN(oooO0O0.f42277OooOO0O)) {
            graphicsLayerScope2.setTranslationX(oooO0O0.f42277OooOO0O);
        }
        if (!Float.isNaN(oooO0O0.f42278OooOO0o)) {
            graphicsLayerScope2.setTranslationY(oooO0O0.f42278OooOO0o);
        }
        if (!Float.isNaN(oooO0O0.f42280OooOOO0)) {
            graphicsLayerScope2.setShadowElevation(oooO0O0.f42280OooOOO0);
        }
        if (!Float.isNaN(oooO0O0.f42279OooOOO) || !Float.isNaN(oooO0O0.f42281OooOOOO)) {
            graphicsLayerScope2.setScaleX(Float.isNaN(oooO0O0.f42279OooOOO) ? 1.0f : oooO0O0.f42279OooOOO);
            graphicsLayerScope2.setScaleY(Float.isNaN(oooO0O0.f42281OooOOOO) ? 1.0f : oooO0O0.f42281OooOOOO);
        }
        if (!Float.isNaN(oooO0O0.f42282OooOOOo)) {
            graphicsLayerScope2.setAlpha(oooO0O0.f42282OooOOOo);
        }
        return Unit.INSTANCE;
    }
}
