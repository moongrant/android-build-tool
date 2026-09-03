package p510o0o0O00;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f51374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f51375OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000(Function1<? super String, Unit> function1, int i) {
        super(4);
        this.f51374OooO0Oo = function1;
        this.f51375OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        PagerScope HorizontalPager = pagerScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(519604330, iIntValue2, -1, "com.yalla.yalla.ui.composable.face_panel.FacePanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FacePanel.kt:172)");
        }
        if (iIntValue == 0) {
            o00000OO.OooO0OO(this.f51374OooO0Oo, composer2, (this.f51375OooO0o0 >> 3) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
