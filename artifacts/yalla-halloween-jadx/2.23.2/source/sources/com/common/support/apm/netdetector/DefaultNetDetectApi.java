package com.common.support.apm.netdetector;

import com.common.support.apm.configuration.specific.DomainConfig;
import com.common.support.apm.configuration.specific.SysVersionConfig;
import com.common.support.apm.monitor.BaseMonitorReportApi;
import com.common.support.apm.sailfishhttp.convertor.SysServerConvertor;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/common/support/apm/netdetector/DefaultNetDetectApi;", "Lcom/common/support/apm/monitor/BaseMonitorReportApi;", "", RemoteConfigConstants$RequestFieldKey.APP_ID, "appNameSpace", "userId", "netDetectLogJson", "Lo0ooOO0o/o0O00O0o;", "createNetDetectRequest", "requestPath", "", "metricType", "netDetectRequestPath", "Ljava/lang/String;", "Lo0ooOO0o/o0OoO00O;", "okHttpClient", "<init>", "(Lo0ooOO0o/o0OoO00O;)V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultNetDetectApi extends BaseMonitorReportApi {

    @NotNull
    private final String netDetectRequestPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultNetDetectApi(@NotNull o0OoO00O okHttpClient) {
        super(okHttpClient, DomainConfig.INSTANCE.getDefaultDomains().get(0), new SysServerConvertor());
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.netDetectRequestPath = "sailfish_sysservice/net/v2/detect";
    }

    public static /* synthetic */ o0O00O0o createNetDetectRequest$default(DefaultNetDetectApi defaultNetDetectApi, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        return defaultNetDetectApi.createNetDetectRequest(str, str2, str3, str4);
    }

    @NotNull
    public final o0O00O0o createNetDetectRequest(@NotNull String appId, @NotNull String appNameSpace, @NotNull String userId, @NotNull String netDetectLogJson) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appNameSpace, "appNameSpace");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(netDetectLogJson, "netDetectLogJson");
        return post(this.netDetectRequestPath, new Pair<>("AppId", appId), new Pair<>("ClientType", "1"), new Pair<>("AppNameSpace", appNameSpace), new Pair<>("UserIden", userId), new Pair<>("NetDetectLogJson", netDetectLogJson), new Pair<>("Version", String.valueOf(SysVersionConfig.INSTANCE.version())));
    }

    @Override // com.common.support.apm.monitor.BaseMonitorReportApi
    public int metricType() {
        return 3;
    }

    @Override // com.common.support.apm.monitor.BaseMonitorReportApi
    @NotNull
    /* JADX INFO: renamed from: requestPath, reason: from getter */
    public String getFileLogUploadRequestPath() {
        return this.netDetectRequestPath;
    }
}
