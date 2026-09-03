package p536o0o0Oo0o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p184o00o00o.OooOo00;
import p187o00o00oo.o00OO0O0;
import p417o0OoO0.o0000O0O;
import p507o0o00ooo.oOOO0O0o;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStoreScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreScreen.kt\ncom/yalla/yalla/ui/screen/user/StoreScreenKt$StoreScreenContent$1$2$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,229:1\n154#2:230\n*S KotlinDebug\n*F\n+ 1 StoreScreen.kt\ncom/yalla/yalla/ui/screen/user/StoreScreenKt$StoreScreenContent$1$2$3\n*L\n154#1:230\n*E\n"})
public final class ooOOO00O extends Lambda implements Function4<OooOo00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f55271OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f55272OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(o00OO0O0 o00oo0o1, MutableState<String> mutableState) {
        super(4);
        this.f55271OooO0Oo = o00oo0o1;
        this.f55272OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
        int i;
        OooOo00 HorizontalPager = oooOo00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2067792008, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.StoreScreenContent.<anonymous>.<anonymous>.<anonymous> (StoreScreen.kt:140)");
            }
            OooOOO0.OooO0O0("crystalStoreUrl HorizontalPager  " + iIntValue);
            if (iIntValue == 1) {
                composer2.startReplaceableGroup(-495953828);
                MutableState<String> mutableState = this.f55272OooO0o0;
                OooOOO0.OooO0O0("crystalStoreUrl is " + mutableState.getValue());
                if (o0000O0O.OooO0Oo(mutableState.getValue())) {
                    OooOOO0.OooO0O0("crystalStoreUrl is22222 " + mutableState.getValue());
                    o00OO0O0 o00oo0o1 = this.f55271OooO0Oo;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Color.Companion companion = Color.INSTANCE;
                    float f = 8;
                    oOOO0O0o.OooO00o(o00oo0o1, null, BackgroundKt.m168backgroundbw27NRU(modifierFillMaxSize$default, companion.m1708getYellow0d7_KjU(), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null)), companion.m1705getTransparent0d7_KjU(), null, ooOOO0Oo.f55273OooO0Oo, composer2, 199680, 18);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                composer2.startReplaceableGroup(-495953180);
                oO0O0.OooO0O0(composer2, 0);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
