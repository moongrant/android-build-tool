package p516o0o0O00o;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCoinImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinImage.kt\ncom/yalla/yalla/ui/composable/common/CoinImageKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,23:1\n154#2:24\n*S KotlinDebug\n*F\n+ 1 CoinImage.kt\ncom/yalla/yalla/ui/composable/common/CoinImageKt\n*L\n21#1:24\n*E\n"})
public final class o000O {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, int i2, @Nullable Composer composer, @Nullable Modifier modifier) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(637709374);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(637709374, i3, -1, "com.yalla.yalla.ui.composable.common.CoinImage (CoinImage.kt:14)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icv_coin, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(Modifier.INSTANCE.then(modifier), Dp.m3775constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000O0O0(modifier, i, i2));
    }
}
