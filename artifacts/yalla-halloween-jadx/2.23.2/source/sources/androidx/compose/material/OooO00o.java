package androidx.compose.material;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.session.LibraryResult;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import kotlin.jvm.functions.Function2;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements androidx.media3.common.OooO0OO.OooO00o, FeatureManager.Callback, o00000O0.OooO00o {
    public /* synthetic */ OooO00o(AnalyticsListener.OooO00o oooO00o, Exception exc) {
    }

    public static void OooO00o(int i, Function2 function2, Composer composer) {
        function2.invoke(composer, Integer.valueOf(i));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        return LibraryResult.OooO0OO(bundle, 3);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OoooooO();
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        InstrumentManager.m4150start$lambda1(z);
    }
}
