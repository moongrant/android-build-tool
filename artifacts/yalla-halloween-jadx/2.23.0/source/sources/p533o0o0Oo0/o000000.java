package p533o0o0Oo0;

import android.graphics.drawable.NinePatchDrawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<NinePatchDrawable> f54661OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(MutableState<NinePatchDrawable> mutableState) {
        super(1);
        this.f54661OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope drawBehind = drawScope;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        MutableState<NinePatchDrawable> mutableState = this.f54661OooO0Oo;
        NinePatchDrawable value = mutableState.getValue();
        Intrinsics.checkNotNull(value);
        int iM1505getWidthimpl = (int) Size.m1505getWidthimpl(drawBehind.mo2108getSizeNHjbRc());
        int iM1502getHeightimpl = (int) Size.m1502getHeightimpl(drawBehind.mo2108getSizeNHjbRc());
        Intrinsics.checkNotNullParameter(value, "<this>");
        value.setBounds(0, 0, iM1505getWidthimpl, iM1502getHeightimpl);
        NinePatchDrawable value2 = mutableState.getValue();
        Intrinsics.checkNotNull(value2);
        value2.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
        return Unit.INSTANCE;
    }
}
