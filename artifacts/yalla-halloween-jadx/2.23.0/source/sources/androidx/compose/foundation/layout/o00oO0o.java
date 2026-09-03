package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00oO0o {
    public static boolean OooO00o(WindowInsets.Companion companion, String str, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(companion, str);
        composer.startReplaceableGroup(i);
        return ComposerKt.isTraceInProgress();
    }
}
