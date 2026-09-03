package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements o00000O0.OooO00o {
    public /* synthetic */ OooOO0O(int i, AnalyticsListener.OooO00o oooO00o, boolean z) {
    }

    public static MeasurePolicy OooO00o(Alignment.Companion companion, Arrangement.Horizontal horizontal, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, companion.getTop(), composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyRowMeasurePolicy;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).o00Ooo();
    }
}
