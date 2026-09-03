package p457o0Ooo0O;

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
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f47724OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f47725OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f47726OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f47727OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f47728OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(float f, float f2, Animatable<Float, AnimationVector1D> animatable, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState) {
        super(1);
        this.f47724OooO0Oo = f;
        this.f47726OooO0o0 = f2;
        this.f47725OooO0o = animatable;
        this.f47727OooO0oO = mutableFloatState;
        this.f47728OooO0oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fM1448getYimpl = Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0());
        float f = this.f47724OooO0Oo;
        long jOffset = OffsetKt.Offset(f, fM1448getYimpl);
        long jOffset2 = OffsetKt.Offset(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) - f, Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0()));
        long jOffset3 = OffsetKt.Offset(((Offset.m1447getXimpl(jOffset2) - Offset.m1447getXimpl(jOffset)) * this.f47726OooO0o0) + Offset.m1447getXimpl(jOffset), Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0()));
        this.f47727OooO0oO.setFloatValue((Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) - f) - Offset.m1447getXimpl(jOffset3));
        MutableState<Boolean> mutableState = this.f47728OooO0oo;
        if (!mutableState.getValue().booleanValue()) {
            mutableState.setValue(Boolean.TRUE);
        }
        OooO0O0.OooOoo(Canvas, o0OOo000.f48148OooOOOo, jOffset3, OffsetKt.Offset(Offset.m1447getXimpl(jOffset3) + this.f47725OooO0o.getValue().floatValue(), Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0())), this.f47724OooO0Oo, StrokeCap.INSTANCE.m2006getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        return Unit.INSTANCE;
    }
}
