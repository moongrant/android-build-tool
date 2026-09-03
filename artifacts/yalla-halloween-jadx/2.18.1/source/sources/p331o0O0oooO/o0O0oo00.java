package p331o0O0oooO;

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

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo00<T> implements OnCompleteListener<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final GoogleApiManager f37109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ApiKey<?> f37110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f37111OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f37112OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f37113OooO0oo;

    @VisibleForTesting
    public o0O0oo00(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2) {
        this.f37109OooO0Oo = googleApiManager;
        this.f37111OooO0o0 = i;
        this.f37110OooO0o = apiKey;
        this.f37112OooO0oO = j;
        this.f37113OooO0oo = j2;
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
        if (zabqVar.f15393OooOO0o < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return telemetryConfiguration;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    @WorkerThread
    public final void onComplete(@NonNull Task<T> task) {
        int version;
        int i;
        int i2;
        int i3;
        int errorCode;
        int i4;
        long j;
        long jCurrentTimeMillis;
        int iElapsedRealtime;
        if (this.f37109OooO0Oo.OooO00o()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null || config.getMethodInvocationTelemetryEnabled()) {
                zabq zabqVar = (zabq) this.f37109OooO0Oo.f15246o000oOoO.get(this.f37110OooO0o);
                if (zabqVar == null || !(zabqVar.zaf() instanceof BaseGmsClient)) {
                    return;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabqVar.zaf();
                boolean methodTimingTelemetryEnabled = this.f37112OooO0oO > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    version = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationOooO00o = OooO00o(zabqVar, baseGmsClient, this.f37111OooO0o0);
                        if (connectionTelemetryConfigurationOooO00o == null) {
                            return;
                        }
                        boolean z = connectionTelemetryConfigurationOooO00o.getMethodTimingTelemetryEnabled() && this.f37112OooO0oO > 0;
                        maxMethodInvocationsInBatch = connectionTelemetryConfigurationOooO00o.getMaxMethodInvocationsLogged();
                        methodTimingTelemetryEnabled = z;
                    }
                    i = batchPeriodMillis;
                    i2 = maxMethodInvocationsInBatch;
                } else {
                    version = 0;
                    i = 5000;
                    i2 = 100;
                }
                GoogleApiManager googleApiManager = this.f37109OooO0Oo;
                if (task.isSuccessful()) {
                    i4 = 0;
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        i3 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i4 = statusCode;
                        } else {
                            i3 = 101;
                        }
                    }
                    i4 = i3;
                    errorCode = -1;
                }
                if (methodTimingTelemetryEnabled) {
                    long j2 = this.f37112OooO0oO;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    j = j2;
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f37113OooO0oo);
                } else {
                    j = 0;
                    jCurrentTimeMillis = 0;
                    iElapsedRealtime = -1;
                }
                MethodInvocation methodInvocation = new MethodInvocation(this.f37111OooO0o0, i4, errorCode, j, jCurrentTimeMillis, null, null, gCoreServiceId, iElapsedRealtime);
                long j3 = i;
                zaq zaqVar = googleApiManager.f15244OoooOoO;
                zaqVar.sendMessage(zaqVar.obtainMessage(18, new o0O(methodInvocation, version, j3, i2)));
            }
        }
    }
}
