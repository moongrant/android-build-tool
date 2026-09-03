package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO {
    public static boolean OooO00o(Modifier modifier, String str, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, str);
        composer.startReplaceableGroup(i);
        return ComposerKt.isTraceInProgress();
    }
}
