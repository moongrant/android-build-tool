package p580o0oOoOoo;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.OooOO0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingScreen.kt\ncom/yalla/yalla/module/main/ui/screen/SettingScreenKt$SettingScreenContent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,242:1\n154#2:243\n154#2:244\n*S KotlinDebug\n*F\n+ 1 SettingScreen.kt\ncom/yalla/yalla/module/main/ui/screen/SettingScreenKt$SettingScreenContent$1\n*L\n121#1:243\n123#1:244\n*E\n"})
public final class oOO0Oo00 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ State<Boolean> f56554OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Boolean> f56555OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0Oo00(State<Boolean> state, State<Boolean> state2) {
        super(3);
        this.f56554OooO0Oo = state;
        this.f56555OooO0o0 = state2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        RowScope SettingItem = rowScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1179071169, iIntValue, -1, "com.yalla.yalla.module.main.ui.screen.SettingScreenContent.<anonymous> (SettingScreen.kt:116)");
            }
            if (!this.f56554OooO0Oo.getValue().booleanValue() && !this.f56555OooO0o0.getValue().booleanValue()) {
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.main_unprotected, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                OooOO0.OooO0Oo(Dp.m3775constructorimpl(4), null, composer2, 6, 2);
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Unprotected, composer2, 0), (Modifier) null, o0OOo000.f48273o000o0oO, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
