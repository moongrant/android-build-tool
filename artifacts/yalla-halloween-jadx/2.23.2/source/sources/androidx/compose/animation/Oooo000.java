package androidx.compose.animation;

import android.os.Bundle;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements androidx.media3.common.OooO0OO.OooO00o {
    public static MeasurePolicy OooO00o(Alignment.Companion companion, boolean z, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), z, composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyRememberBoxMeasurePolicy;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        return new PlaybackException(bundle);
    }
}
