package com.common.support.apm.uploader;

import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.monitor.BaseMonitorReportApi;
import com.common.support.apm.sailfishhttp.BaseServerResponse;
import com.common.support.apm.sailfishhttp.convertor.SysServerConvertor;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.lang.reflect.Type;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO0O;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o00Oo00;
import p634o0ooO0oO.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/common/support/apm/uploader/UploadApi;", "Lcom/common/support/apm/monitor/BaseMonitorReportApi;", "Ljava/io/File;", ShareInternalUtility.STAGING_PARAM, "", "filedMD5", "Lcom/common/support/apm/sailfishhttp/BaseServerResponse;", "", "uploadFileLog", "requestPath", "", "metricType", RemoteConfigConstants$RequestFieldKey.APP_ID, "Ljava/lang/String;", "appNameSpace", "fileLogUploadRequestPath", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "defaultDomain", "<init>", "(Lo0ooO0oO/o00OOOO0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class UploadApi extends BaseMonitorReportApi {

    @NotNull
    private final String appId;

    @NotNull
    private final String appNameSpace;

    @NotNull
    private final String fileLogUploadRequestPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadApi(@NotNull o00OOOO0 okHttpClient, @NotNull String defaultDomain, @NotNull String appId, @NotNull String appNameSpace) {
        super(okHttpClient, defaultDomain, new SysServerConvertor());
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(defaultDomain, "defaultDomain");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appNameSpace, "appNameSpace");
        this.appId = appId;
        this.appNameSpace = appNameSpace;
        this.fileLogUploadRequestPath = "sailfish_sysservice/logfile/v2/xlogbupload";
    }

    @Override // com.common.support.apm.monitor.BaseMonitorReportApi
    public int metricType() {
        return 4;
    }

    @Override // com.common.support.apm.monitor.BaseMonitorReportApi
    @NotNull
    /* JADX INFO: renamed from: requestPath, reason: from getter */
    public String getFileLogUploadRequestPath() {
        return this.fileLogUploadRequestPath;
    }

    @Nullable
    public final BaseServerResponse<Unit> uploadFileLog(@NotNull final File file, @NotNull final String filedMD5) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(filedMD5, "filedMD5");
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.uploader.UploadApi.uploadFileLog.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Upload filename: " + ((Object) file.getName()) + ", fileMD5: " + filedMD5;
            }
        }, 1, null);
        Pattern pattern = o00OOO0.f57234OooO0o0;
        o00OOO0 o00ooo0OooO00o = o00OOO0.OooO00o.OooO00o("text/plain");
        oo00oO.OooO00o oooO00o = oo00oO.Companion;
        o00OOO0 o00ooo0OooO0O0 = o00OOO0.OooO00o.OooO0O0("application/json");
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        o00Oo00 o00oo00 = new o00Oo00(file, o00ooo0OooO0O0);
        o00OOO0O.OooO00o oooO00o2 = new o00OOO0O.OooO00o(0);
        oooO00o2.OooO0OO(o00OOO0.OooO00o.OooO00o("multipart/form-data"));
        oooO00o2.OooO00o("AppId", null, oo00oO.OooO00o.OooO00o(this.appId, o00ooo0OooO00o));
        oooO00o2.OooO00o("ClientType", null, oo00oO.OooO00o.OooO00o("1", o00ooo0OooO00o));
        oooO00o2.OooO00o("AppNameSpace", null, oo00oO.OooO00o.OooO00o(this.appNameSpace, o00ooo0OooO00o));
        oooO00o2.OooO00o("FileMd5", null, oo00oO.OooO00o.OooO00o(filedMD5, o00ooo0OooO00o));
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        oooO00o2.OooO00o(ShareInternalUtility.STAGING_PARAM, StringsKt__StringsKt.removeSuffix(name, (CharSequence) "_"), o00oo00);
        o00OOOOo o00oooooPost = post(this.fileLogUploadRequestPath, oooO00o2.OooO0O0());
        Type respType = new TypeToken<BaseServerResponse<Unit>>() { // from class: com.common.support.apm.uploader.UploadApi$uploadFileLog$respType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(respType, "respType");
        return (BaseServerResponse) BaseMonitorReportApi.syncForMetric$default(this, o00oooooPost, respType, null, 4, null);
    }
}
