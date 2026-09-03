package p100o000oOoo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O {
    @Composable
    @NotNull
    public static final o0000O0 OooO00o(@Nullable Object obj, @Nullable Composer composer) {
        composer.startReplaceableGroup(-1494234083);
        o0000O0.OooO00o oooO00o = o0000O0.f35466OooOOoo;
        ContentScale fit = ContentScale.INSTANCE.getFit();
        int iM2139getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2139getDefaultFilterQualityfv9h1I();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1494234083, 8, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:91)");
        }
        o0000O0 o0000o0OooO00o = o0000O.OooO00o(obj, o000O0o.OooO00o(o000Oo0.f35516OooO00o, composer), oooO00o, null, fit, iM2139getDefaultFilterQualityfv9h1I, composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000o0OooO00o;
    }
}
