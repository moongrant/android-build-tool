package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.firebase.components.o00oO0o;
import com.google.firebase.perf.FirebasePerfRegistrar;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements o00000O0.OooO00o, com.google.firebase.components.OooO {
    public /* synthetic */ OooO0OO(AnalyticsListener.OooO00o oooO00o, Player.OooO00o oooO00o2) {
    }

    public static MeasurePolicy OooO0O0(Arrangement arrangement, Alignment.Vertical vertical, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), vertical, composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyRowMeasurePolicy;
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO00o(o00oO0o o00oo0o2) {
        return FirebasePerfRegistrar.providesFirebasePerformance(o00oo0o2);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).o00oO0O();
    }
}
