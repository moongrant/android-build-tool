package p533o0o0OOoO;

import androidx.compose.foundation.gestures.OooO0OO;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p516o0o0O00o.o0oO0Ooo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDarkThemeSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkThemeSettingScreen.kt\ncom/yalla/yalla/ui/screen/main/DarkThemeSettingScreenKt$DarkThemeSettingScreenContent$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,94:1\n36#2:95\n1097#3,6:96\n*S KotlinDebug\n*F\n+ 1 DarkThemeSettingScreen.kt\ncom/yalla/yalla/ui/screen/main/DarkThemeSettingScreenKt$DarkThemeSettingScreenContent$1\n*L\n41#1:95\n41#1:96,6\n*E\n"})
public final class o0OOO0OO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f53522OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(boolean z) {
        super(3);
        this.f53522OooO0Oo = z;
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
                ComposerKt.traceEventStart(-161426093, iIntValue, -1, "com.yalla.yalla.ui.screen.main.DarkThemeSettingScreenContent.<anonymous> (DarkThemeSettingScreen.kt:38)");
            }
            boolean z = this.f53522OooO0Oo;
            boolean z2 = !z;
            boolean zOooO00o = OooO0OO.OooO00o(z, composer2, 1157296644);
            Object objRememberedValue = composer2.rememberedValue();
            if (zOooO00o || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o0OOO0(z);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            o0oO0Ooo.OooO0O0(z2, false, (Function1) objRememberedValue, composer2, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
