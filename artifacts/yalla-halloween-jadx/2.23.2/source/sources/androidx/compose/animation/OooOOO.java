package androidx.compose.animation;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.google.firebase.perf.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import p312o0O0oOO.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements androidx.media3.common.OooO0OO.OooO00o {
    public static void OooO00o(Timer timer, p308o0O0oO.OooO oooO, p308o0O0oO.OooO oooO2) {
        oooO.OooOO0(timer.OooO00o());
        o0000Ooo.OooO0OO(oooO2);
    }

    public static boolean OooO0O0(Modifier modifier, String str, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, str);
        composer.startReplaceableGroup(i);
        return ComposerKt.isTraceInProgress();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        return new androidx.media3.common.OooOOO0.OooOO0(bundle.getLong(androidx.media3.common.OooOOO0.OooOO0.f6550OooOO0, -9223372036854775807L), bundle.getLong(androidx.media3.common.OooOOO0.OooOO0.f6551OooOO0O, -9223372036854775807L), bundle.getLong(androidx.media3.common.OooOOO0.OooOO0.f6552OooOO0o, -9223372036854775807L), bundle.getFloat(androidx.media3.common.OooOOO0.OooOO0.f6554OooOOO0, -3.4028235E38f), bundle.getFloat(androidx.media3.common.OooOOO0.OooOO0.f6553OooOOO, -3.4028235E38f));
    }
}
