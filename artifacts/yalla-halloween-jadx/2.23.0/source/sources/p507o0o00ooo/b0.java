package p507o0o00ooo;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEditComposable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditComposable.kt\ncom/yalla/yalla/ui/composable/common/EditComposable$customTextFieldOutline$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,82:1\n154#2:83\n154#2:84\n*S KotlinDebug\n*F\n+ 1 EditComposable.kt\ncom/yalla/yalla/ui/composable/common/EditComposable$customTextFieldOutline$1\n*L\n77#1:83\n79#1:84\n*E\n"})
public final class b0 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f49780OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j) {
        super(3);
        this.f49780OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-171806014);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-171806014, iIntValue, -1, "com.yalla.yalla.ui.composable.common.EditComposable.customTextFieldOutline.<anonymous> (EditComposable.kt:74)");
        }
        Modifier modifierM182borderziNgDLE = BorderKt.m182borderziNgDLE(composed, Dp.m3765constructorimpl(1), new SolidColor(this.f49780OooO0Oo, null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(4)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierM182borderziNgDLE;
    }
}
