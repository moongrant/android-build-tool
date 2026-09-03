package com.common.support.apm.configuration;

import com.common.support.apm.monitor.BaseMonitorReportApi;
import com.common.support.okhttpforsdk.ResponseDataConvertor;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/common/support/apm/configuration/ConfigApi;", "Lcom/common/support/apm/monitor/BaseMonitorReportApi;", "", RemoteConfigConstants$RequestFieldKey.APP_ID, "userId", "", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "Lo0ooO0oO/o00OOOOo;", "createConfigRequest", "requestPath", "metricType", "getConfigRequestPath", "Ljava/lang/String;", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "defaultBaseUrl", "Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "dataConvertor", "<init>", "(Lo0ooO0oO/o00OOOO0;Ljava/lang/String;Lcom/common/support/okhttpforsdk/ResponseDataConvertor;)V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class ConfigApi extends BaseMonitorReportApi {

    @NotNull
    private final String getConfigRequestPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigApi(@NotNull o00OOOO0 okHttpClient, @NotNull String defaultBaseUrl, @NotNull ResponseDataConvertor dataConvertor) {
        super(okHttpClient, defaultBaseUrl, dataConvertor);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(defaultBaseUrl, "defaultBaseUrl");
        Intrinsics.checkNotNullParameter(dataConvertor, "dataConvertor");
        this.getConfigRequestPath = "sailfish_sysservice/sysconfig/v2/getconfig";
    }

    @NotNull
    public final o00OOOOo createConfigRequest(@NotNull String appId, @NotNull String userId, int version) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return post(this.getConfigRequestPath, new Pair<>("AppId", appId), new Pair<>("UserIden", userId), new Pair<>("ClientType", "1"), new Pair<>("Version", String.valueOf(version)));
    }

    @Override // com.common.support.apm.monitor.BaseMonitorReportApi
    public int metricType() {
        return 2;
    }

    @Override // com.common.support.apm.monitor.BaseMonitorReportApi
    @NotNull
    /* JADX INFO: renamed from: requestPath, reason: from getter */
    public String getFileLogUploadRequestPath() {
        return this.getConfigRequestPath;
    }
}
