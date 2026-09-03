package com.common.support.apm.monitor;

import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.configuration.specific.DomainConfig;
import com.common.support.apm.configuration.specific.MonitorConfig;
import com.common.support.apm.sailfishhttp.BaseServerResponse;
import com.common.support.apm.sailfishhttp.convertor.SysServerConvertor;
import com.facebook.internal.AnalyticsEvents;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/common/support/apm/monitor/MonitorReport;", "", "", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "errorType", "errorCode", "", "errorMsg", "", "writeLog", "", "reportGap", "start", "reportMonitor", "com/common/support/apm/monitor/MonitorReport$monitorReportApi$1", "monitorReportApi", "Lcom/common/support/apm/monitor/MonitorReport$monitorReportApi$1;", "Lkotlinx/coroutines/Job;", "task", "Lkotlinx/coroutines/Job;", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "<init>", "(Lo0ooO0oO/o00OOOO0;)V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class MonitorReport {

    @NotNull
    private final MonitorReport$monitorReportApi$1 monitorReportApi;

    @Nullable
    private Job task;

    /* JADX INFO: renamed from: com.common.support.apm.monitor.MonitorReport$start$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.common.support.apm.monitor.MonitorReport$start$1", f = "MonitorReport.kt", i = {0, 1}, l = {36, 39}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = MonitorReport.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnonymousClass1 anonymousClass1;
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                anonymousClass1 = this;
                while (CoroutineScopeKt.isActive(coroutineScope)) {
                    try {
                        MonitorReport.this.reportMonitor();
                        long jReportGap = MonitorReport.this.reportGap();
                        anonymousClass1.L$0 = coroutineScope;
                        anonymousClass1.label = 2;
                        if (DelayKt.delay(jReportGap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CancellationException unused) {
                        LoggerKt.logE$default(null, null, new Function0<String>() { // from class: com.common.support.apm.monitor.MonitorReport.start.1.1
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "Monitor report task cancelled";
                            }
                        }, 3, null);
                        MonitorReport.this.writeLog(-1, 0, MonitorErrorCodeKt.MONITOR_ERROR_COROUTINE_CANCEL_EXCEPTION, "");
                    }
                }
                MonitorReport.this.writeLog(-1, 0, MonitorErrorCodeKt.MONITOR_ERROR_LOOP_QUIT_ABNORMALLY, "");
            } catch (CancellationException unused2) {
                anonymousClass1 = this;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.common.support.apm.monitor.MonitorReport$monitorReportApi$1] */
    public MonitorReport(@NotNull final o00OOOO0 okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        final String str = DomainConfig.INSTANCE.getDefaultDomains().get(0);
        final SysServerConvertor sysServerConvertor = new SysServerConvertor();
        this.monitorReportApi = new BaseMonitorReportApi(str, sysServerConvertor) { // from class: com.common.support.apm.monitor.MonitorReport$monitorReportApi$1
            {
                super(this.$okHttpClient, str, sysServerConvertor);
            }

            @Override // com.common.support.apm.monitor.BaseMonitorReportApi
            public int metricType() {
                return 0;
            }

            @Override // com.common.support.apm.monitor.BaseMonitorReportApi
            @NotNull
            /* JADX INFO: renamed from: requestPath */
            public String getFileLogUploadRequestPath() {
                return BaseMonitorReportApi.REPORT_MONITOR_REQUEST_PATH;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long reportGap() {
        return MonitorConfig.INSTANCE.monitorReportFrequency() * ((long) 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeLog(int status, int errorType, int errorCode, String errorMsg) {
        Sailfish.INSTANCE.writeMonitorLog(MonitorLogHelper.INSTANCE.create(6, status, errorType, errorCode, errorMsg));
    }

    public final void reportMonitor() {
        Unit unit;
        final BaseServerResponse<Unit> baseServerResponseReportMonitor = reportMonitor();
        if (baseServerResponseReportMonitor == null) {
            unit = null;
        } else {
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.monitor.MonitorReport$reportMonitor$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Monitor report response: success = " + baseServerResponseReportMonitor.getSuccess() + ", code = " + baseServerResponseReportMonitor.getCode() + ", message = " + baseServerResponseReportMonitor.getMessage();
                }
            }, 1, null);
            if (baseServerResponseReportMonitor.getSuccess()) {
                MonitorManager.INSTANCE.resetAllDataMetric();
            } else {
                writeLog(0, 1, baseServerResponseReportMonitor.getCode(), baseServerResponseReportMonitor.getMessage());
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.monitor.MonitorReport$reportMonitor$2$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Monitor report response is null!";
                }
            }, 1, null);
            writeLog(0, 1, 0, "Monitor report response is null!");
        }
    }

    public final void start() {
        this.task = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }
}
