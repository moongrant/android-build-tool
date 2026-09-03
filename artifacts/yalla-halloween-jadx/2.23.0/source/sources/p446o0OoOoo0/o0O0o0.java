package p446o0OoOoo0;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f46375OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(float f) {
        super(1);
        this.f46375OooO0Oo = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Path Path = AndroidPath_androidKt.Path();
        float fM1505getWidthimpl = Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc());
        float f = 2;
        float f2 = this.f46375OooO0Oo;
        Path.moveTo((fM1505getWidthimpl / f) - f2, Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc()) - f2);
        Path.lineTo(Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) / f, Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc()) - (f * f2));
        Path.lineTo((Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) / f) + f2, Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc()) - f2);
        Path.lineTo(Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()) / f, Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc()));
        Path.close();
        OooO0O0.Oooo00O(Canvas, Path, o0oO0O0o.f46946OooO0O0, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}
