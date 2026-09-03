package p533o0o0OOoO;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.gestures.OooO0OO;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import p193o00o0O0O.o0000oo;
import p386o0OOooO.o0OOO0o;
import p516o0o0O00o.o00O00o0;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.o0oO0Ooo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDarkThemeSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkThemeSettingScreen.kt\ncom/yalla/yalla/ui/screen/main/DarkThemeSettingScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,94:1\n76#2:95\n36#3:96\n50#3:103\n49#3:104\n1097#4,6:97\n1097#4,6:105\n81#5:111\n*S KotlinDebug\n*F\n+ 1 DarkThemeSettingScreen.kt\ncom/yalla/yalla/ui/screen/main/DarkThemeSettingScreenKt\n*L\n34#1:95\n44#1:96\n59#1:103\n59#1:104\n44#1:97,6\n59#1:105,6\n47#1:111\n*E\n"})
public final class o0oo0000 {
    public static final void OooO00o(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(587705515);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(587705515, i, -1, "com.yalla.yalla.ui.screen.main.DarkThemeSettingScreenContent (DarkThemeSettingScreen.kt:31)");
            }
            o0O0oo0o.OooO00o("Dark Theme", 0.0f, 0L, null, null, null, null, null, null, composerStartRestartGroup, 6, 510);
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o0000oo.f38633OooO00o)).booleanValue();
            float f = o00O00o0.f51373OooO00o;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -161426093, true, new o0OOO0OO(zBooleanValue));
            boolean zOooO00o = OooO0OO.OooO00o(zBooleanValue, composerStartRestartGroup, 1157296644);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zOooO00o || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o0OOOO00(zBooleanValue);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o0oO0Ooo.OooO00o("Dark Theme", 0L, 0.0f, null, null, false, false, null, composableLambda, false, f, null, (Function0) objRememberedValue, composerStartRestartGroup, 100663302, 6, 2814);
            Integer num = (Integer) LiveDataAdapterKt.observeAsState(o0OOO0o.f43502OooO0Oo, composerStartRestartGroup, 8).getValue();
            boolean z = num != null && num.intValue() == 0;
            boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1561038346, true, new o0OOo000(z, zIsSystemInDarkTheme));
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(zIsSystemInDarkTheme);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(boolValueOf2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new o0o0000(z, zIsSystemInDarkTheme);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            o0oO0Ooo.OooO00o("Dark Theme Follow System", 0L, 0.0f, null, null, false, false, null, composableLambda2, false, f, null, (Function0) objRememberedValue2, composer2, 100663302, 6, 2814);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0Oo(i));
    }
}
