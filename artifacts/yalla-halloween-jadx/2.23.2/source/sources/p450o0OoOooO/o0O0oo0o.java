package p450o0OoOooO;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo0o extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f47554OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(float f) {
        super(1);
        this.f47554OooO0Oo = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Path Path = AndroidPath_androidKt.Path();
        float fM1516getWidthimpl = Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc());
        float f = 2;
        float f2 = this.f47554OooO0Oo;
        Path.moveTo((fM1516getWidthimpl / f) - f2, Size.m1513getHeightimpl(Canvas.mo2118getSizeNHjbRc()) - f2);
        Path.lineTo(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f, Size.m1513getHeightimpl(Canvas.mo2118getSizeNHjbRc()) - (f * f2));
        Path.lineTo((Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f) + f2, Size.m1513getHeightimpl(Canvas.mo2118getSizeNHjbRc()) - f2);
        Path.lineTo(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f, Size.m1513getHeightimpl(Canvas.mo2118getSizeNHjbRc()));
        Path.close();
        OooO0O0.Oooo00O(Canvas, Path, o0OOo000.f48135OooO0O0, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}
