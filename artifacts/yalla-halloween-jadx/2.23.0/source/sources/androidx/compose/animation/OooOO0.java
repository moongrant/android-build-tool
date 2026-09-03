package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 {
    public static void OooO00o(int i, Function3 function3, SkippableUpdater skippableUpdater, Composer composer, int i2) {
        function3.invoke(skippableUpdater, composer, Integer.valueOf(i));
        composer.startReplaceableGroup(i2);
    }
}
