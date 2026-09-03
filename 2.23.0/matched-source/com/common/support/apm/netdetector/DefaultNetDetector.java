package com.common.support.apm.netdetector;

import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.monitor.BaseMonitorReportApi;
import com.common.support.apm.sailfishhttp.BaseServerResponse;
import com.common.support.apm.sailfishhttp.HostSwitchInterceptorKt;
import com.common.support.apm.sailfishhttp.HttpEventListener;
import com.common.support.apm.utils.JsonUtilKt;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/common/support/apm/netdetector/DefaultNetDetector;", "Lcom/common/support/apm/netdetector/BaseNetDetector;", "", "report", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "Lo0ooO0oO/o00OOOO0;", "Lcom/common/support/apm/netdetector/DefaultNetDetectApi;", "reportApi", "Lcom/common/support/apm/netdetector/DefaultNetDetectApi;", "", "checkResultAsJson", "Ljava/lang/String;", "<init>", "(Lo0ooO0oO/o00OOOO0;)V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultNetDetector extends BaseNetDetector {

    @NotNull
    private String checkResultAsJson;

    @NotNull
    private final o00OOOO0 okHttpClient;

    @NotNull
    private final DefaultNetDetectApi reportApi;

    public DefaultNetDetector(@NotNull o00OOOO0 okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.reportApi = new DefaultNetDetectApi(okHttpClient);
        this.checkResultAsJson = "";
    }

    @Override // com.common.support.apm.netdetector.NetDetector
    public void report() {
        Unit unit;
        HttpEventListener.Companion companion = HttpEventListener.INSTANCE;
        long j = companion.getConnectedSpendTimeMs$sailfish_release().get();
        long j2 = companion.getReuseConnectedSpendTimeMs$sailfish_release().get();
        String strOooO0oo = "";
        if (j >= 0) {
            if (j <= 0) {
                j = j2;
            }
            String strCurrentHost = HostSwitchInterceptorKt.currentHost(this.okHttpClient);
            strOooO0oo = JsonUtilKt.getGson().OooO0oo(buildCheckResult(j, strCurrentHost != null ? strCurrentHost : ""));
            Intrinsics.checkNotNullExpressionValue(strOooO0oo, "{\n      val spendTimeMs …son(detectLogModel)\n    }");
        }
        this.checkResultAsJson = strOooO0oo;
        o00OOOOo o00oooooCreateNetDetectRequest = this.reportApi.createNetDetectRequest(Sailfish.appId, Sailfish.appNameSpace, Sailfish.uniqueId, strOooO0oo);
        Type respType = new TypeToken<BaseServerResponse<NetDetectResponse>>() { // from class: com.common.support.apm.netdetector.DefaultNetDetector$report$respType$1
        }.getType();
        DefaultNetDetectApi defaultNetDetectApi = this.reportApi;
        Intrinsics.checkNotNullExpressionValue(respType, "respType");
        final BaseServerResponse<NetDetectResponse> baseServerResponse = (BaseServerResponse) BaseMonitorReportApi.syncForMetric$default(defaultNetDetectApi, o00oooooCreateNetDetectRequest, respType, null, 4, null);
        if (baseServerResponse == null) {
            unit = null;
        } else {
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.netdetector.DefaultNetDetector$report$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    StringBuilder sb = new StringBuilder("Net check response is response: success = ");
                    sb.append(baseServerResponse.getSuccess());
                    sb.append(", code =");
                    sb.append(baseServerResponse.getCode());
                    sb.append(", message = ");
                    sb.append(baseServerResponse.getMessage());
                    sb.append(", data.isSysConfigChange = ");
                    NetDetectResponse data = baseServerResponse.getData();
                    sb.append(data == null ? null : Boolean.valueOf(data.getIsSysConfigChange()));
                    sb.append('!');
                    return sb.toString();
                }
            }, 1, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.netdetector.DefaultNetDetector$report$2$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Net check response is response null!";
                }
            }, 1, null);
        }
        reloadConfigIfNeeded(baseServerResponse);
        if (!(baseServerResponse != null && baseServerResponse.getSuccess()) || j <= 0) {
            return;
        }
        companion.getConnectedSpendTimeMs$sailfish_release().set(0L);
    }
}
