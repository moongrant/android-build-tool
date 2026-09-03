package p650o0ooo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nOldLoadingDialogCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldLoadingDialogCompose.kt\ncom/yalla/yalla/ui/dialog/OldLoadingDialogComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n36#2:56\n1097#3,6:57\n*S KotlinDebug\n*F\n+ 1 OldLoadingDialogCompose.kt\ncom/yalla/yalla/ui/dialog/OldLoadingDialogComposeKt\n*L\n34#1:56\n34#1:57,6\n*E\n"})
public final class e {
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d A[PHI: r3 r4
      0x009d: PHI (r3v17 int) = (r3v12 int), (r3v11 int), (r3v19 int) binds: [B:52:0x0094, B:47:0x0082, B:48:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r4v8 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:52:0x0094, B:47:0x0082, B:48:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable String str, boolean z, @Nullable Function0 function0, @Nullable Composer composer, int i, int i2) {
        int i3;
        String strStringResource;
        Function0 function1;
        int i4;
        Function0 function2;
        Function0 function3;
        String str2;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1380050966);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                strStringResource = str;
                int i5 = composerStartRestartGroup.changed(strStringResource) ? 32 : 16;
                i3 |= i5;
            } else {
                strStringResource = str;
            }
            i3 |= i5;
        } else {
            strStringResource = str;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                function1 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 2) != 0) {
                        strStringResource = StringResources_androidKt.stringResource(o000000.loading, composerStartRestartGroup, 0);
                        i3 &= -113;
                    }
                    if (i6 != 0) {
                        i4 = i3;
                        function2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1380050966, i4, -1, "com.yalla.yalla.ui.dialog.OldLoadingDialogCompose (OldLoadingDialogCompose.kt:31)");
                    }
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new b(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(true, true, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -434339684, true, new c(strStringResource, i4)), composerStartRestartGroup, 432, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    String str3 = strStringResource;
                    function3 = function2;
                    str2 = str3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                }
                i4 = i3;
                function2 = function1;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1380050966, i4, -1, "com.yalla.yalla.ui.dialog.OldLoadingDialogCompose (OldLoadingDialogCompose.kt:31)");
                }
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new b(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new b(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(true, true, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -434339684, true, new c(strStringResource, i4)), composerStartRestartGroup, 432, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                String str4 = strStringResource;
                function3 = function2;
                str2 = str4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str2 = strStringResource;
                function3 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(i, i2, str2, function3, z));
        }
        i3 |= 384;
        function1 = function0;
        if ((i3 & 731) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(o000000.loading, composerStartRestartGroup, 0);
                    i3 &= -113;
                }
                if (i6 != 0) {
                    i4 = i3;
                    function2 = null;
                } else {
                    i4 = i3;
                    function2 = function1;
                }
            } else {
                if ((i2 & 2) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(o000000.loading, composerStartRestartGroup, 0);
                    i3 &= -113;
                }
                if (i6 != 0) {
                    i4 = i3;
                    function2 = null;
                } else {
                    i4 = i3;
                    function2 = function1;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1380050966, i4, -1, "com.yalla.yalla.ui.dialog.OldLoadingDialogCompose (OldLoadingDialogCompose.kt:31)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new b(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new b(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(true, true, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -434339684, true, new c(strStringResource, i4)), composerStartRestartGroup, 432, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            String str5 = strStringResource;
            function3 = function2;
            str2 = str5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(o000000.loading, composerStartRestartGroup, 0);
                    i3 &= -113;
                }
                if (i6 != 0) {
                    i4 = i3;
                    function2 = null;
                } else {
                    i4 = i3;
                    function2 = function1;
                }
            } else {
                if ((i2 & 2) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(o000000.loading, composerStartRestartGroup, 0);
                    i3 &= -113;
                }
                if (i6 != 0) {
                    i4 = i3;
                    function2 = null;
                } else {
                    i4 = i3;
                    function2 = function1;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1380050966, i4, -1, "com.yalla.yalla.ui.dialog.OldLoadingDialogCompose (OldLoadingDialogCompose.kt:31)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new b(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new b(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(true, true, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -434339684, true, new c(strStringResource, i4)), composerStartRestartGroup, 432, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            String str6 = strStringResource;
            function3 = function2;
            str2 = str6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(i, i2, str2, function3, z));
    }
}
