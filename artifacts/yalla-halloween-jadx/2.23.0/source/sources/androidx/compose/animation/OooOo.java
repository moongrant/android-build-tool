package androidx.compose.animation;

import android.content.Context;
import android.os.Build;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import p314o0O0oOo0.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements o000O0Oo.OooO00o {
    public static boolean OooO00o(Transition.Segment segment, String str, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, str);
        composer.startReplaceableGroup(i);
        return ComposerKt.isTraceInProgress();
    }

    @Override // o0O0oOo0.o000O0Oo.OooO00o
    public String OooO0O0(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }
}
