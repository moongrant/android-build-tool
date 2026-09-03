package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import com.common.support.apm.monitor.MonitorErrorCodeKt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements Continuation {
    public static MeasurePolicy OooO00o(Alignment.Companion companion, Arrangement.Horizontal horizontal, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, companion.getTop(), composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyRowMeasurePolicy;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return Integer.valueOf(MonitorErrorCodeKt.MONITOR_ERROR_SERVER_NETWORK_403);
    }
}
