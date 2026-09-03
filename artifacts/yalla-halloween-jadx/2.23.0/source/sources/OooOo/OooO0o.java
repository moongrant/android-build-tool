package OooOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static boolean OooO0O0(Composer composer) {
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return ComposerKt.isTraceInProgress();
    }
}
