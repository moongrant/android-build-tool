package p578o0oOoOoo;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class O0O0 extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f56395OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f56396OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f56397OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f56398OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56399OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0O0(float f, float f2, Animatable<Float, AnimationVector1D> animatable, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState) {
        super(1);
        this.f56395OooO0Oo = f;
        this.f56397OooO0o0 = f2;
        this.f56396OooO0o = animatable;
        this.f56398OooO0oO = mutableFloatState;
        this.f56399OooO0oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fM1437getYimpl = Offset.m1437getYimpl(Canvas.mo2107getCenterF1C5BW0());
        float f = this.f56395OooO0Oo;
        long jOffset = OffsetKt.Offset(f, fM1437getYimpl);
        long jOffset2 = OffsetKt.Offset(Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) - f, Offset.m1437getYimpl(Canvas.mo2107getCenterF1C5BW0()));
        long jOffset3 = OffsetKt.Offset(((Offset.m1436getXimpl(jOffset2) - Offset.m1436getXimpl(jOffset)) * this.f56397OooO0o0) + Offset.m1436getXimpl(jOffset), Offset.m1437getYimpl(Canvas.mo2107getCenterF1C5BW0()));
        this.f56398OooO0oO.setFloatValue((Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) - f) - Offset.m1436getXimpl(jOffset3));
        MutableState<Boolean> mutableState = this.f56399OooO0oo;
        if (!mutableState.getValue().booleanValue()) {
            mutableState.setValue(Boolean.TRUE);
        }
        OooO0O0.OooOoo(Canvas, o0oO0O0o.f46959OooOOOo, jOffset3, OffsetKt.Offset(Offset.m1436getXimpl(jOffset3) + this.f56396OooO0o.getValue().floatValue(), Offset.m1437getYimpl(Canvas.mo2107getCenterF1C5BW0())), this.f56395OooO0Oo, StrokeCap.INSTANCE.m1996getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        return Unit.INSTANCE;
    }
}
