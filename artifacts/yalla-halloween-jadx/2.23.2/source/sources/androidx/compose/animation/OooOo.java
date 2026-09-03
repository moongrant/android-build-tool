package androidx.compose.animation;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements androidx.media3.common.OooO0OO.OooO00o {
    public static boolean OooO00o(Composer composer) {
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return ComposerKt.isTraceInProgress();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        o00Oo0.OooO00o(bundle.getInt(androidx.media3.common.OooOo00.f6627OooO0Oo, -1) == 1);
        float f = bundle.getFloat(androidx.media3.common.OooOOO.f6472OooO0oO, -1.0f);
        return f == -1.0f ? new androidx.media3.common.OooOOO() : new androidx.media3.common.OooOOO(f);
    }
}
