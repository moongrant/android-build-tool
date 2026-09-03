package com.common.support.apm.monitor;

import com.common.support.apm.sailfishhttp.BaseServerResponse;
import com.common.support.apm.sailfishhttp.requestbody.ProtoRequestBody;
import com.common.support.okhttpforsdk.BaseApi;
import com.common.support.okhttpforsdk.ResponseDataConvertor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 *2\u00020\u0001:\u0001*B\u001f\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0011\u001a\u00020\u00022\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002JW\u0010\u001e\u001a\u00020\t\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u001e\b\u0002\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00192\u0019\u0010\u001d\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0002\b\u001cJE\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u001e\b\u0002\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fJ\b\u0010\"\u001a\u00020\u000bH&J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006+"}, d2 = {"Lcom/common/support/apm/monitor/BaseMonitorReportApi;", "Lcom/common/support/okhttpforsdk/BaseApi;", "", "metricType", "", "isHttpSuccess", "code", "", "throwable", "", "addHttpCallMetric", "", "url", "getMetricType", "isValidMetricType", "Lcom/common/support/apm/sailfishhttp/BaseServerResponse;", "bizResponse", "bizCode", "isHttpCodeRedirect", "detailErrorCode", "T", "Lo0ooOO0o/o0O00O0o;", "request", "Ljava/lang/reflect/Type;", "respType", "Lkotlin/Function2;", "httpFailAction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "httpSuccessAction", "asyncForMetric", "syncForMetric", "(Lo0ooOO0o/o0O00O0o;Ljava/lang/reflect/Type;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "reportMonitor", "requestPath", "Lo0ooOO0o/o0OoO00O;", "okHttpClient", "defaultBaseUrl", "Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "dataConvertor", "<init>", "(Lo0ooOO0o/o0OoO00O;Ljava/lang/String;Lcom/common/support/okhttpforsdk/ResponseDataConvertor;)V", "Companion", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public abstract class BaseMonitorReportApi extends BaseApi {
    public static final int INVALID_METRIC_TYPE = 0;

    @NotNull
    public static final String REPORT_MONITOR_REQUEST_PATH = "sailfish_pbservice/monitor/v1/uploadmonitor";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMonitorReportApi(@NotNull o0OoO00O okHttpClient, @NotNull String defaultBaseUrl, @NotNull ResponseDataConvertor dataConvertor) {
        super(okHttpClient, defaultBaseUrl, dataConvertor, null, 8, null);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(defaultBaseUrl, "defaultBaseUrl");
        Intrinsics.checkNotNullParameter(dataConvertor, "dataConvertor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addHttpCallMetric(int metricType, boolean isHttpSuccess, int code, Throwable throwable) {
        if (isHttpSuccess) {
            if (code == 0) {
                MonitorManager.updateHttpCallDataMetric$default(MonitorManager.INSTANCE, metricType, true, 0, null, 12, null);
                return;
            } else {
                MonitorManager.updateHttpCallDataMetric$default(MonitorManager.INSTANCE, metricType, false, code, null, 8, null);
                return;
            }
        }
        if (isHttpCodeRedirect(code)) {
            MonitorManager.updateHttpCallDataMetric$default(MonitorManager.INSTANCE, metricType, true, 0, null, 12, null);
        } else {
            MonitorManager.INSTANCE.updateHttpCallDataMetric(metricType, false, detailErrorCode(code, throwable), throwable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void asyncForMetric$default(BaseMonitorReportApi baseMonitorReportApi, o0O00O0o o0o00o0o, Type type, Function2 function2, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncForMetric");
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        baseMonitorReportApi.asyncForMetric(o0o00o0o, type, function2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int bizCode(BaseServerResponse<?> bizResponse) {
        if (bizResponse.getSuccess()) {
            return 0;
        }
        return bizResponse.getCode();
    }

    private final int detailErrorCode(int code, Throwable throwable) {
        return throwable != null ? MonitorErrorCodeKt.errorCode(throwable) : code;
    }

    private final int getMetricType(String url) {
        if (StringsKt__StringsJVMKt.endsWith$default(url, getFileLogUploadRequestPath(), false, 2, null)) {
            return metricType();
        }
        return 0;
    }

    private final boolean isHttpCodeRedirect(int code) {
        return code == 302;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidMetricType(int metricType) {
        return metricType != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object syncForMetric$default(BaseMonitorReportApi baseMonitorReportApi, o0O00O0o o0o00o0o, Type type, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncForMetric");
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        return baseMonitorReportApi.syncForMetric(o0o00o0o, type, function2);
    }

    public final <T> void asyncForMetric(@NotNull o0O00O0o request, @NotNull Type respType, @Nullable final Function2<? super Integer, ? super Throwable, Unit> httpFailAction, @NotNull final Function1<? super T, Unit> httpSuccessAction) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(respType, "respType");
        Intrinsics.checkNotNullParameter(httpSuccessAction, "httpSuccessAction");
        final int metricType = getMetricType(request.f57828OooO00o.f57788OooO);
        super.async(request, respType, new Function2<Integer, Throwable, Unit>() { // from class: com.common.support.apm.monitor.BaseMonitorReportApi.asyncForMetric.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Throwable th) {
                invoke(num.intValue(), th);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, @Nullable Throwable th) {
                if (BaseMonitorReportApi.this.isValidMetricType(metricType)) {
                    BaseMonitorReportApi.this.addHttpCallMetric(metricType, false, i, th);
                }
                Function2<Integer, Throwable, Unit> function2 = httpFailAction;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i), th);
                }
            }
        }, new Function1<T, Unit>() { // from class: com.common.support.apm.monitor.BaseMonitorReportApi.asyncForMetric.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable T t) {
                if (BaseMonitorReportApi.this.isValidMetricType(metricType) && (t instanceof BaseServerResponse)) {
                    BaseMonitorReportApi baseMonitorReportApi = BaseMonitorReportApi.this;
                    baseMonitorReportApi.addHttpCallMetric(metricType, true, baseMonitorReportApi.bizCode((BaseServerResponse) t), null);
                }
                httpSuccessAction.invoke(t);
            }
        });
    }

    public abstract int metricType();

    @Nullable
    public final BaseServerResponse<Unit> reportMonitor() {
        o0O00O0o o0o00o0oPost = post(REPORT_MONITOR_REQUEST_PATH, new ProtoRequestBody(MonitorManager.INSTANCE.createMonitorMessage$sailfish_release()));
        Type respType = new TypeToken<BaseServerResponse<Unit>>() { // from class: com.common.support.apm.monitor.BaseMonitorReportApi$reportMonitor$respType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(respType, "respType");
        return (BaseServerResponse) BaseApi.sync$default(this, o0o00o0oPost, respType, null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: requestPath */
    public abstract String getFileLogUploadRequestPath();

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final <T> T syncForMetric(@NotNull o0O00O0o request, @NotNull Type respType, @Nullable final Function2<? super Integer, ? super Throwable, Unit> httpFailAction) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(respType, "respType");
        final int metricType = getMetricType(request.f57828OooO00o.f57788OooO);
        T t = (T) super.sync(request, respType, new Function2<Integer, Throwable, Unit>() { // from class: com.common.support.apm.monitor.BaseMonitorReportApi$syncForMetric$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Throwable th) {
                invoke(num.intValue(), th);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, @Nullable Throwable th) {
                if (this.this$0.isValidMetricType(metricType)) {
                    this.this$0.addHttpCallMetric(metricType, false, i, th);
                }
                Function2<Integer, Throwable, Unit> function2 = httpFailAction;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i), th);
                }
            }
        });
        if (isValidMetricType(metricType) && (t instanceof BaseServerResponse)) {
            addHttpCallMetric(metricType, true, bizCode((BaseServerResponse) t), null);
        }
        return t;
    }
}
