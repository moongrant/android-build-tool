package p543o0o0Ooo0;

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
import p230o00oOo0o.o0O0O00;
import p231o00oOoO.o0000O0O;
import p423o0OoO0OO.o00O00OO;
import p516o0o0O00o.o00000O0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStoreScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreScreen.kt\ncom/yalla/yalla/ui/screen/user/StoreScreenKt$StoreScreenContent$1$2$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,229:1\n154#2:230\n*S KotlinDebug\n*F\n+ 1 StoreScreen.kt\ncom/yalla/yalla/ui/screen/user/StoreScreenKt$StoreScreenContent$1$2$3\n*L\n154#1:230\n*E\n"})
public final class u0 extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f55687OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f55688OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(o0000O0O o0000o0o2, MutableState<String> mutableState) {
        super(4);
        this.f55687OooO0Oo = o0000o0o2;
        this.f55688OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
        o0O0O00 HorizontalPager = o0o0o00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2067792008, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.StoreScreenContent.<anonymous>.<anonymous>.<anonymous> (StoreScreen.kt:142)");
            }
            o0000O00.OooO0O0("crystalStoreUrl HorizontalPager  " + iIntValue);
            if (iIntValue == 1) {
                composer2.startReplaceableGroup(-495953828);
                MutableState<String> mutableState = this.f55688OooO0o0;
                o0000O00.OooO0O0("crystalStoreUrl is " + mutableState.getValue());
                if (o00O00OO.OooO0Oo(mutableState.getValue())) {
                    o0000O00.OooO0O0("crystalStoreUrl is22222 " + mutableState.getValue());
                    o0000O0O o0000o0o2 = this.f55687OooO0Oo;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Color.Companion companion = Color.INSTANCE;
                    float f = 8;
                    o00000O0.OooO00o(o0000o0o2, null, BackgroundKt.m170backgroundbw27NRU(modifierFillMaxSize$default, companion.m1719getYellow0d7_KjU(), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null)), companion.m1716getTransparent0d7_KjU(), null, t0.f55682OooO0Oo, composer2, 199680, 18);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                composer2.startReplaceableGroup(-495953180);
                m0.OooO0O0(composer2, 0);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
