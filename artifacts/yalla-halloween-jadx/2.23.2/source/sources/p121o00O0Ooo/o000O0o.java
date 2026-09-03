package p121o00O0Ooo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o {
    @Composable
    @NotNull
    public static final o0000 OooO00o(@Nullable Object obj, @Nullable Composer composer) {
        composer.startReplaceableGroup(-1494234083);
        o0000.OooO00o oooO00o = o0000.f36419OooOOoo;
        ContentScale fit = ContentScale.INSTANCE.getFit();
        int iM2149getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2149getDefaultFilterQualityfv9h1I();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1494234083, 8, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:91)");
        }
        o0000 o0000VarOooO00o = o0000O0.OooO00o(obj, o0000OO0.OooO00o(o000.f36418OooO00o, composer), oooO00o, null, fit, iM2149getDefaultFilterQualityfv9h1I, composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000VarOooO00o;
    }
}
