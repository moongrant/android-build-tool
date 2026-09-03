package androidx.compose.animation;

import android.os.Bundle;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements androidx.media3.common.OooO0OO.OooO00o {
    public static boolean OooO00o(Transition.Segment segment, String str, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, str);
        composer.startReplaceableGroup(i);
        return ComposerKt.isTraceInProgress();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        return new androidx.media3.common.OooOOOO(bundle.getFloat(androidx.media3.common.OooOOOO.f6617OooO0oo, 1.0f), bundle.getFloat(androidx.media3.common.OooOOOO.f6615OooO, 1.0f));
    }
}
