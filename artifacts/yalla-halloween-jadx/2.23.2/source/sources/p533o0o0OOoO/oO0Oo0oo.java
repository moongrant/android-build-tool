package p533o0o0OOoO;

import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo {
    public static final void OooO00o(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(731605787);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(731605787, i, -1, "com.yalla.yalla.ui.screen.main.NestScrollScreenContent (NestScrollScreen.kt:37)");
            }
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m1172Scaffold27mzLpw(null, ScaffoldKt.rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3), o0OO0o.f53508OooO00o, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, o0OO0o.f53511OooO0Oo, composer2, 384, 12582912, 131065);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0OoOO0(i));
    }
}
