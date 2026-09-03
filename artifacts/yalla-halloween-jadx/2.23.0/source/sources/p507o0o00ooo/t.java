package p507o0o00ooo;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.OooO0O0;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f50220OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Stroke f50221OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f50222OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(float f, long j, Stroke stroke) {
        super(1);
        this.f50220OooO0Oo = f;
        this.f50222OooO0o0 = j;
        this.f50221OooO0o = stroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        OooO0O0.Oooo0o(Canvas, this.f50222OooO0o0, 0L, 0L, CornerRadiusKt.CornerRadius$default(this.f50220OooO0Oo, 0.0f, 2, null), this.f50221OooO0o, 0.0f, null, 0, 230, null);
        return Unit.INSTANCE;
    }
}
