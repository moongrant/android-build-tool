package androidx.compose.ui.graphics;

import com.common.support.apm.monitor.MonitorErrorCodeKt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOOOo implements Continuation {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return Integer.valueOf(MonitorErrorCodeKt.MONITOR_ERROR_SERVER_NETWORK_403);
    }
}
