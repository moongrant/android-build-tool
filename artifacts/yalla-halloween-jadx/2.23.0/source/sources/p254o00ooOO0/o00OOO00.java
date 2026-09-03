package p254o00ooOO0;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO00<T> implements OnCompleteListener<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final GoogleApiManager f40980OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40981OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ApiKey<?> f40982OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f40983OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40984OooO0o0;

    @VisibleForTesting
    public o00OOO00(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2) {
        this.f40980OooO00o = googleApiManager;
        this.f40981OooO0O0 = i;
        this.f40982OooO0OO = apiKey;
        this.f40983OooO0Oo = j;
        this.f40984OooO0o0 = j2;
    }

    @Nullable
    public static ConnectionTelemetryConfiguration OooO00o(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i) {
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled()) {
            return null;
        }
        int[] methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist();
        if (methodInvocationMethodKeyAllowlist == null) {
            int[] methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist();
            if (methodInvocationMethodKeyDisallowlist != null && ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i)) {
                return null;
            }
        } else if (!ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i)) {
            return null;
        }
        if (zabqVar.f14891OooOOOO < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @WorkerThread
    public final void onComplete(@NonNull Task<T> task) {
        zabq zabqVar;
        int version;
        int i;
        int i2;
        int statusCode;
        int errorCode;
        int i3;
        long j;
        long jCurrentTimeMillis;
        int iElapsedRealtime;
        GoogleApiManager googleApiManager = this.f40980OooO00o;
        if (googleApiManager.OooO00o()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zabqVar = (zabq) googleApiManager.f14741OooOOO0.get(this.f40982OooO0OO)) != null && (zabqVar.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabqVar.zaf();
                long j2 = this.f40983OooO0Oo;
                boolean methodTimingTelemetryEnabled = j2 > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    version = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationOooO00o = OooO00o(zabqVar, baseGmsClient, this.f40981OooO0O0);
                        if (connectionTelemetryConfigurationOooO00o == null) {
                            return;
                        }
                        boolean z = connectionTelemetryConfigurationOooO00o.getMethodTimingTelemetryEnabled() && j2 > 0;
                        maxMethodInvocationsInBatch = connectionTelemetryConfigurationOooO00o.getMaxMethodInvocationsLogged();
                        methodTimingTelemetryEnabled = z;
                    }
                    i2 = batchPeriodMillis;
                    i = maxMethodInvocationsInBatch;
                } else {
                    version = 0;
                    i = 100;
                    i2 = 5000;
                }
                if (task.isSuccessful()) {
                    i3 = 0;
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        statusCode = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                        } else {
                            statusCode = 101;
                        }
                        i3 = statusCode;
                    }
                    errorCode = -1;
                    i3 = statusCode;
                }
                if (methodTimingTelemetryEnabled) {
                    j = j2;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f40984OooO0o0);
                } else {
                    j = 0;
                    jCurrentTimeMillis = 0;
                    iElapsedRealtime = -1;
                }
                zaq zaqVar = googleApiManager.f14745OooOOo0;
                zaqVar.sendMessage(zaqVar.obtainMessage(18, new o00OOO0(new MethodInvocation(this.f40981OooO0O0, i3, errorCode, j, jCurrentTimeMillis, null, null, gCoreServiceId, iElapsedRealtime), version, i2, i)));
            }
        }
    }
}
