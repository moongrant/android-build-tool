package androidx.compose.animation;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements androidx.media3.common.OooO0OO.OooO00o {
    public static void OooO00o(int i, Function3 function3, SkippableUpdater skippableUpdater, Composer composer, int i2) {
        function3.invoke(skippableUpdater, composer, Integer.valueOf(i));
        composer.startReplaceableGroup(i2);
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(androidx.media3.common.OooOOO0.OooO00o.f6515OooO0o0);
        uri.getClass();
        return new androidx.media3.common.OooOOO0.OooO00o(new androidx.media3.common.OooOOO0.OooO00o.C0138OooO00o(uri));
    }
}
