package p445o0OoOoO0;

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
@SourceDebugExtension({"SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yalla/yalla/module/account/ui/screen/AccountScreenKt$AccountScreenContent$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,106:1\n154#2:107\n154#2:108\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yalla/yalla/module/account/ui/screen/AccountScreenKt$AccountScreenContent$3\n*L\n73#1:107\n75#1:108\n*E\n"})
public final class o00O000 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ State<Boolean> f47301OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Boolean> f47302OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(State<Boolean> state, State<Boolean> state2) {
        super(3);
        this.f47301OooO0Oo = state;
        this.f47302OooO0o0 = state2;
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
                ComposerKt.traceEventStart(1564815567, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.AccountScreenContent.<anonymous> (AccountScreen.kt:68)");
            }
            if (!this.f47301OooO0Oo.getValue().booleanValue() && !this.f47302OooO0o0.getValue().booleanValue()) {
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
