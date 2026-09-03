package p533o0o0OOoO;

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
@SourceDebugExtension({"SMAP\nDarkThemeSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkThemeSettingScreen.kt\ncom/yalla/yalla/ui/screen/main/DarkThemeSettingScreenKt$DarkThemeSettingScreenContent$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,94:1\n50#2:95\n49#2:96\n1097#3,6:97\n*S KotlinDebug\n*F\n+ 1 DarkThemeSettingScreen.kt\ncom/yalla/yalla/ui/screen/main/DarkThemeSettingScreenKt$DarkThemeSettingScreenContent$3\n*L\n56#1:95\n56#1:96\n56#1:97,6\n*E\n"})
public final class o0OOo000 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f53526OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f53527OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOo000(boolean z, boolean z2) {
        super(3);
        this.f53526OooO0Oo = z;
        this.f53527OooO0o0 = z2;
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
                ComposerKt.traceEventStart(1561038346, iIntValue, -1, "com.yalla.yalla.ui.screen.main.DarkThemeSettingScreenContent.<anonymous> (DarkThemeSettingScreen.kt:53)");
            }
            boolean z = this.f53526OooO0Oo;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = this.f53527OooO0o0;
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(boolValueOf2);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o0OOOO0o(this.f53526OooO0Oo, z2);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            o0oO0Ooo.OooO0O0(z, false, (Function1) objRememberedValue, composer2, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
