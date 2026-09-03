package p461o0Ooo0o0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207o00o0oO0.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, @Nullable Composer composer, @NotNull MutableState showDialog, @NotNull String filePath) {
        int i2;
        Intrinsics.checkNotNullParameter(showDialog, "showDialog");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Composer composerStartRestartGroup = composer.startRestartGroup(530806905);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(showDialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(filePath) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(530806905, i2, -1, "com.yalla.yalla.module.media.test.ShowVideoInfoDialog (ShowVideoInfoDialog.kt:25)");
            }
            o0000O0.OooO00o(showDialog, false, false, null, null, 0, 0, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1936463275, true, new o00Oo0(filePath, i2)), composerStartRestartGroup, (i2 & 14) | 100663296, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(i, showDialog, filePath));
    }
}
