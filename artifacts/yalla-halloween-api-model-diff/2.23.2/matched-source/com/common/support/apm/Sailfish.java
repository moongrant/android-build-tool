package com.common.support.apm;

import android.content.Context;
import com.common.support.apm.base.Env;
import com.common.support.apm.configuration.ConfigurationManager;
import com.common.support.apm.configuration.specific.BlockConfig;
import com.common.support.apm.configuration.specific.DomainConfig;
import com.common.support.apm.configuration.specific.StartUpConfig;
import com.common.support.apm.logger.Logger;
import com.common.support.apm.logger.LoggerImpl;
import com.common.support.apm.monitor.MonitorLogHelper;
import com.common.support.apm.monitor.MonitorManager;
import com.common.support.apm.monitor.entity.StatusMetricModel;
import com.common.support.apm.netdetector.NetDetectorManager;
import com.common.support.apm.netdiag.NetService;
import com.common.support.apm.netdiag.NetSpeedServiceImpl;
import com.common.support.apm.otlp.YallaOtlpSdk;
import com.common.support.apm.otlp.biz.BlockMetric;
import com.common.support.apm.otlp.biz.HttpTracer;
import com.common.support.apm.otlp.biz.OtlpHeaderInterceptor;
import com.common.support.apm.otlp.biz.StartUpOtlpTracer;
import com.common.support.apm.otlp.metric.StartUpMetric;
import com.common.support.apm.sailfishhttp.HostSwitchInterceptorKt;
import com.common.support.apm.sailfishhttp.HttpClient;
import com.common.support.apm.uploader.UploadService;
import com.common.support.apm.utils.AppUtil;
import com.common.support.apm.utils.FileUtilKt;
import com.common.support.apm.utils.NetUtilKt;
import com.common.support.apm.xlog.FileLogConfig;
import com.common.support.apm.xlog.XlogWriter;
import com.common.support.applifecycle.AppLifecycleManager;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.common.support.sailfish_commons.logmodels.NetModel;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.common.support.sailfish_commons.logmodels.TrackModel;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import io.opentelemetry.api.metrics.MeterBuilder;
import io.opentelemetry.api.trace.TracerBuilder;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bs\u0010tJ`\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u000f\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u0004J\u0016\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u0018\u0010!\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u0004\u0018\u00010\"J\u0006\u0010&\u001a\u00020%J\b\u0010'\u001a\u0004\u0018\u00010%J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00102\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016J\u0018\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016J\u0010\u00105\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0004H\u0016J\u0010\u00106\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0004H\u0016J\u0010\u00107\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0004H\u0016J\u0010\u00108\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0004H\u0016J\u0010\u00109\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0004H\u0016J\u0010\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020.H\u0016J\u000e\u0010@\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010B\u001a\u00020AJ\u0006\u0010C\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010E\u001a\u00020\u000eJ\u0014\u0010H\u001a\u00020\u00102\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00100FJ\u0006\u0010I\u001a\u00020\u000eJ\u0006\u0010K\u001a\u00020JJ\u0006\u0010L\u001a\u00020\u000eJ\u0006\u0010M\u001a\u00020\u000eJ\u000f\u0010P\u001a\u00020\u0004H\u0000¢\u0006\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010VR\u0016\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010VR\u0016\u0010\u0007\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0016\u0010W\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0016\u0010\b\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\b\u0010VR\u0016\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010VR\u0016\u0010\f\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010VR\u0016\u0010\r\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\r\u0010VR\u0016\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010RR\"\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\n\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010VR\u001a\u0010_\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR(\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lcom/common/support/apm/Sailfish;", "Lcom/common/support/apm/logger/Logger;", "Landroid/content/Context;", "context", "", RemoteConfigConstants$RequestFieldKey.APP_ID, "appKey", "appSecret", "appChannel", "Lcom/common/support/apm/SailfishConfiguration;", "config", "deviceId", "uniqueId", "appNameSpace", "", "sdkLoggable", "", "init", "isNetAvailable$sailfish_release", "()Z", "isNetAvailable", "setUniqueId", "name", "Lio/opentelemetry/api/metrics/MeterBuilder;", "meterBuilder", "meterBuilderOrNull", "Lio/opentelemetry/api/trace/TracerBuilder;", "tracerBuilder", "tracerBuilderOrNull", "requestUrl", "requestMethod", "Lcom/common/support/apm/otlp/biz/HttpTracer;", "httpTracer", "httpTracerOrNull", "Lcom/common/support/apm/otlp/metric/StartUpMetric;", "createStartUpMetric", "createStartUpMetricOrNull", "Lcom/common/support/apm/otlp/biz/StartUpOtlpTracer;", "createStartUpTracer", "createStartUpTracerOrNull", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "secModel", "writeSecLog", "Lcom/common/support/sailfish_commons/logmodels/NetModel;", "netModel", "writeNetLog", "Lcom/common/support/sailfish_commons/logmodels/CustomLogModel;", "logModel", "", "level", "writeCustomLog", "log", "customLog", "logD", "logV", "logI", "logW", "logE", "Lcom/common/support/sailfish_commons/logmodels/TrackModel;", "trackModel", "writeTrackLog", "customLogModel", "writeMonitorLog", "Lcom/common/support/apm/netdiag/NetService;", "netDiagService", "Lcom/common/support/apm/otlp/biz/BlockMetric;", "blockMetric", "flush", "cleanCache", "isAppForeground", "Lkotlin/Function0;", NativeProtocol.WEB_DIALOG_ACTION, "addOnConfigChangeAction", "isSampleBlock", "", "minDropCostTimeMs", "isTrackEnable", "isStartUpAnalysisEnable", "getSessionId$sailfish_release", "()Ljava/lang/String;", "getSessionId", "isInitialized", "Z", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "initFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Ljava/lang/String;", RemoteConfigConstants$RequestFieldKey.APP_VERSION, "Lcom/common/support/apm/SailfishConfiguration;", "getConfig$sailfish_release", "()Lcom/common/support/apm/SailfishConfiguration;", "setConfig$sailfish_release", "(Lcom/common/support/apm/SailfishConfiguration;)V", "sessionId", "Lkotlinx/coroutines/CoroutineScope;", "sailfishScope", "Lkotlinx/coroutines/CoroutineScope;", "getSailfishScope$sailfish_release", "()Lkotlinx/coroutines/CoroutineScope;", "Ljava/lang/ref/WeakReference;", "contextRef", "Ljava/lang/ref/WeakReference;", "getContextRef$sailfish_release", "()Ljava/lang/ref/WeakReference;", "setContextRef$sailfish_release", "(Ljava/lang/ref/WeakReference;)V", "Lo0ooOO0o/o0OoO00O;", "okHttpClient", "Lo0ooOO0o/o0OoO00O;", "Lcom/common/support/apm/logger/LoggerImpl;", "loggerImpl", "Lcom/common/support/apm/logger/LoggerImpl;", "Lcom/common/support/apm/monitor/MonitorLogHelper;", "monitorCache", "Lcom/common/support/apm/monitor/MonitorLogHelper;", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class Sailfish implements Logger {
    public static SailfishConfiguration config;

    @NotNull
    private static WeakReference<Context> contextRef;
    private static boolean isInitialized;
    private static LoggerImpl loggerImpl;

    @NotNull
    private static MonitorLogHelper monitorCache;
    private static o0OoO00O okHttpClient;

    @NotNull
    private static final CoroutineScope sailfishScope;

    @JvmField
    public static boolean sdkLoggable;

    @NotNull
    private static final String sessionId;

    @NotNull
    public static final Sailfish INSTANCE = new Sailfish();

    @NotNull
    private static final MutableSharedFlow<Boolean> initFlow = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);

    @JvmField
    @NotNull
    public static String appId = "";

    @JvmField
    @NotNull
    public static String appKey = "";

    @JvmField
    @NotNull
    public static String appSecret = "";

    @JvmField
    @NotNull
    public static String appVersion = "";

    @JvmField
    @NotNull
    public static String appChannel = "";

    @JvmField
    @NotNull
    public static String deviceId = "";

    @JvmField
    @NotNull
    public static String uniqueId = "";

    @JvmField
    @NotNull
    public static String appNameSpace = "";

    /* JADX INFO: renamed from: com.common.support.apm.Sailfish$cleanCache$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.common.support.apm.Sailfish$cleanCache$1", f = "Sailfish.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FileUtilKt.deleteOnlyFiles(new File(XlogWriter.INSTANCE.getLogCacheDir$sailfish_release()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.apm.Sailfish$init$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.common.support.apm.Sailfish$init$2", f = "Sailfish.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = Sailfish.initFlow;
                Boolean boolBoxBoolean = Boxing.boxBoolean(Sailfish.isInitialized);
                this.label = 1;
                if (mutableSharedFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.apm.Sailfish$setUniqueId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.common.support.apm.Sailfish$setUniqueId$1", f = "Sailfish.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.common.support.apm.Sailfish$setUniqueId$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.common.support.apm.Sailfish$setUniqueId$1$1", f = "Sailfish.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02041 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int label;

            public C02041(Continuation<? super C02041> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C02041(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ConfigurationManager.INSTANCE.reloadConfig();
                YallaOtlpSdk.INSTANCE.reInit();
                return Unit.INSTANCE;
            }

            @Nullable
            public final Object invoke(boolean z, @Nullable Continuation<? super Unit> continuation) {
                return ((C02041) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C08411(Continuation<? super C08411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C08411(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = Sailfish.initFlow;
                C02041 c02041 = new C02041(null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableSharedFlow, c02041, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append('-');
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        sb.append(StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null));
        sessionId = sb.toString();
        sailfishScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        contextRef = new WeakReference<>(null);
        monitorCache = new MonitorLogHelper();
    }

    private Sailfish() {
    }

    public final void addOnConfigChangeAction(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ConfigurationManager.INSTANCE.addOnConfigChangeListener(action);
    }

    @NotNull
    public final BlockMetric blockMetric() {
        return new BlockMetric();
    }

    public final void cleanCache() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    @NotNull
    public final StartUpMetric createStartUpMetric() {
        return new StartUpMetric();
    }

    @Nullable
    public final StartUpMetric createStartUpMetricOrNull() {
        if (YallaOtlpSdk.INSTANCE.isInited()) {
            return new StartUpMetric();
        }
        return null;
    }

    @NotNull
    public final StartUpOtlpTracer createStartUpTracer() {
        return new StartUpOtlpTracer(appId, getConfig$sailfish_release().getEnv().name());
    }

    @Nullable
    public final StartUpOtlpTracer createStartUpTracerOrNull() {
        if (YallaOtlpSdk.INSTANCE.isInited()) {
            return new StartUpOtlpTracer(appId, getConfig$sailfish_release().getEnv().name());
        }
        return null;
    }

    @Override // com.common.support.apm.logger.Logger
    public void customLog(@NotNull String log, int level) {
        Intrinsics.checkNotNullParameter(log, "log");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.customLog(log, level);
        }
    }

    public final void flush() {
        if (isInitialized) {
            XlogWriter.INSTANCE.flush();
        }
    }

    @NotNull
    public final SailfishConfiguration getConfig$sailfish_release() {
        SailfishConfiguration sailfishConfiguration = config;
        if (sailfishConfiguration != null) {
            return sailfishConfiguration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("config");
        return null;
    }

    @NotNull
    public final WeakReference<Context> getContextRef$sailfish_release() {
        return contextRef;
    }

    @NotNull
    public final CoroutineScope getSailfishScope$sailfish_release() {
        return sailfishScope;
    }

    @NotNull
    public final String getSessionId$sailfish_release() {
        return sessionId;
    }

    @NotNull
    public final HttpTracer httpTracer(@NotNull String requestUrl, @NotNull String requestMethod) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        return new HttpTracer(requestUrl, requestMethod);
    }

    @Nullable
    public final HttpTracer httpTracerOrNull(@NotNull String requestUrl, @NotNull String requestMethod) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        if (YallaOtlpSdk.INSTANCE.isInited()) {
            return new HttpTracer(requestUrl, requestMethod);
        }
        return null;
    }

    public final synchronized void init(@NotNull Context context, @NotNull String appId2, @NotNull String appKey2, @NotNull String appSecret2, @NotNull String appChannel2, @NotNull SailfishConfiguration config2, @NotNull String deviceId2, @NotNull String uniqueId2, @NotNull String appNameSpace2, boolean sdkLoggable2) {
        String deviceId3 = deviceId2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId2, "appId");
            Intrinsics.checkNotNullParameter(appKey2, "appKey");
            Intrinsics.checkNotNullParameter(appSecret2, "appSecret");
            Intrinsics.checkNotNullParameter(appChannel2, "appChannel");
            Intrinsics.checkNotNullParameter(config2, "config");
            Intrinsics.checkNotNullParameter(deviceId3, "deviceId");
            Intrinsics.checkNotNullParameter(uniqueId2, "uniqueId");
            Intrinsics.checkNotNullParameter(appNameSpace2, "appNameSpace");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Context appContext = context.getApplicationContext();
            sdkLoggable = sdkLoggable2;
            contextRef = new WeakReference<>(appContext);
            appId = appId2;
            appKey = appKey2;
            appSecret = appSecret2;
            AppUtil appUtil = AppUtil.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            appVersion = appUtil.getVersionName(appContext);
            appChannel = appChannel2;
            INSTANCE.setConfig$sailfish_release(config2);
            if (deviceId2.length() == 0) {
                deviceId3 = DeviceIDManager.INSTANCE.get(appContext);
            } else {
                DeviceIDManager.INSTANCE.save(appContext, deviceId3);
            }
            deviceId = deviceId3;
            if (uniqueId2.length() > 0) {
                uniqueId = uniqueId2;
            }
            appNameSpace = appNameSpace2;
            AppLifecycleManager.INSTANCE.init();
            HttpClient httpClient = HttpClient.INSTANCE;
            httpClient.init(appContext, appId, appSecret, deviceId, config2.getExecutorService(), config2.getSslSocketFactory(), config2.getTrustManager());
            DomainConfig domainConfig = DomainConfig.INSTANCE;
            Object[] array = domainConfig.getDefaultDomains().toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            o0OoO00O.OooO00o oooO00oCreateOkHttpClientBuilder = httpClient.createOkHttpClientBuilder((String[]) array, new OtlpHeaderInterceptor());
            oooO00oCreateOkHttpClientBuilder.getClass();
            okHttpClient = new o0OoO00O(oooO00oCreateOkHttpClientBuilder);
            MonitorManager monitorManager = MonitorManager.INSTANCE;
            o0OoO00O o0ooo00o2 = okHttpClient;
            if (o0ooo00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("okHttpClient");
                o0ooo00o2 = null;
            }
            monitorManager.init$sailfish_release(o0ooo00o2);
            ConfigurationManager configurationManager = ConfigurationManager.INSTANCE;
            o0OoO00O o0ooo00o3 = okHttpClient;
            if (o0ooo00o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("okHttpClient");
                o0ooo00o3 = null;
            }
            configurationManager.init(appContext, o0ooo00o3);
            o0OoO00O o0ooo00o4 = okHttpClient;
            if (o0ooo00o4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("okHttpClient");
                o0ooo00o4 = null;
            }
            new NetDetectorManager(o0ooo00o4).startDetect();
            UploadService uploadService = UploadService.INSTANCE;
            o0OoO00O o0ooo00o5 = okHttpClient;
            if (o0ooo00o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("okHttpClient");
                o0ooo00o5 = null;
            }
            uploadService.init(o0ooo00o5, domainConfig.getDefaultDomains().get(0), appId2, appNameSpace);
            XlogWriter xlogWriter = XlogWriter.INSTANCE;
            WeakReference<Context> weakReference = contextRef;
            FileLogConfig fileLogConfig = config2.getFileLogConfig();
            CoroutineScope coroutineScope = sailfishScope;
            xlogWriter.init(weakReference, fileLogConfig, coroutineScope);
            loggerImpl = new LoggerImpl(contextRef, xlogWriter, config2.getFileLogConfig().getLogLevel());
            YallaOtlpSdk yallaOtlpSdk = YallaOtlpSdk.INSTANCE;
            Env env = config2.getEnv();
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            yallaOtlpSdk.init(env, loggerImpl2);
            configurationManager.addOnConfigChangeListener(new Function0<Unit>() { // from class: com.common.support.apm.Sailfish.init.1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    o0OoO00O o0ooo00o6 = Sailfish.okHttpClient;
                    if (o0ooo00o6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("okHttpClient");
                        o0ooo00o6 = null;
                    }
                    Object[] array2 = DomainConfig.INSTANCE.getDomains().toArray(new String[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    String[] strArr = (String[]) array2;
                    HostSwitchInterceptorKt.updateHosts(o0ooo00o6, (String[]) Arrays.copyOf(strArr, strArr.length));
                }
            });
            isInitialized = true;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
            monitorManager.writeMonitorLogForInit$sailfish_release(new StatusMetricModel(1, 0), System.currentTimeMillis() - jCurrentTimeMillis);
        }
    }

    public final boolean isAppForeground() {
        return AppLifecycleManager.INSTANCE.isAppForeground();
    }

    public final boolean isNetAvailable$sailfish_release() {
        Context context = contextRef.get();
        if (context != null) {
            return NetUtilKt.isNetAvailable(context);
        }
        return false;
    }

    public final boolean isSampleBlock() {
        return BlockConfig.INSTANCE.isSampleBlock();
    }

    public final boolean isStartUpAnalysisEnable() {
        return StartUpConfig.INSTANCE.isStartUpAnalysisEnable();
    }

    public final boolean isTrackEnable() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getBuriedTag() == 1;
    }

    @Override // com.common.support.apm.logger.Logger
    public void logD(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.logD(log);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void logE(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.logE(log);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void logI(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.logI(log);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void logV(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.logV(log);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void logW(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.logW(log);
        }
    }

    @NotNull
    public final MeterBuilder meterBuilder(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MeterBuilder meterBuilderOooO0OO = YallaOtlpSdk.INSTANCE.getMeterProvider().OooO0OO(name);
        Intrinsics.checkNotNullExpressionValue(meterBuilderOooO0OO, "YallaOtlpSdk.getMeterProvider().meterBuilder(name)");
        return meterBuilderOooO0OO;
    }

    @Nullable
    public final MeterBuilder meterBuilderOrNull(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        YallaOtlpSdk yallaOtlpSdk = YallaOtlpSdk.INSTANCE;
        if (yallaOtlpSdk.isInited()) {
            return yallaOtlpSdk.getMeterProvider().OooO0OO(name);
        }
        return null;
    }

    public final long minDropCostTimeMs() {
        return BlockConfig.INSTANCE.lagThresholdTimeConsumeMs();
    }

    @NotNull
    public final NetService netDiagService(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        o0OoO00O o0ooo00o2 = okHttpClient;
        if (o0ooo00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("okHttpClient");
            o0ooo00o2 = null;
        }
        return new NetSpeedServiceImpl(context, o0ooo00o2, DomainConfig.INSTANCE.getDefaultDomains().get(0));
    }

    public final void setConfig$sailfish_release(@NotNull SailfishConfiguration sailfishConfiguration) {
        Intrinsics.checkNotNullParameter(sailfishConfiguration, "<set-?>");
        config = sailfishConfiguration;
    }

    public final void setContextRef$sailfish_release(@NotNull WeakReference<Context> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        contextRef = weakReference;
    }

    public final void setUniqueId(@NotNull String uniqueId2) {
        Intrinsics.checkNotNullParameter(uniqueId2, "uniqueId");
        if (Intrinsics.areEqual(uniqueId, uniqueId2)) {
            return;
        }
        uniqueId = uniqueId2;
        BuildersKt__Builders_commonKt.launch$default(sailfishScope, null, null, new C08411(null), 3, null);
    }

    @NotNull
    public final TracerBuilder tracerBuilder(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TracerBuilder tracerBuilderOooO0O0 = YallaOtlpSdk.INSTANCE.getOpenTelemetrySdk().OooO0O0(name);
        Intrinsics.checkNotNullExpressionValue(tracerBuilderOooO0O0, "YallaOtlpSdk.getOpenTele…Sdk().tracerBuilder(name)");
        return tracerBuilderOooO0O0;
    }

    @Nullable
    public final TracerBuilder tracerBuilderOrNull(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        YallaOtlpSdk yallaOtlpSdk = YallaOtlpSdk.INSTANCE;
        if (yallaOtlpSdk.isInited()) {
            return yallaOtlpSdk.getOpenTelemetrySdk().OooO0O0(name);
        }
        return null;
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeCustomLog(@NotNull CustomLogModel logModel, int level) {
        Intrinsics.checkNotNullParameter(logModel, "logModel");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.writeCustomLog(logModel, level);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeMonitorLog(@NotNull CustomLogModel customLogModel) {
        Intrinsics.checkNotNullParameter(customLogModel, "customLogModel");
        if (!isInitialized) {
            monitorCache.add(customLogModel);
            return;
        }
        LoggerImpl loggerImpl2 = loggerImpl;
        if (loggerImpl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
            loggerImpl2 = null;
        }
        loggerImpl2.writeMonitorLog(customLogModel);
        if (monitorCache.isEmpty()) {
            return;
        }
        for (CustomLogModel customLogModel2 : monitorCache.getAllAndClear()) {
            LoggerImpl loggerImpl3 = loggerImpl;
            if (loggerImpl3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl3 = null;
            }
            loggerImpl3.writeMonitorLog(customLogModel2);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeNetLog(@NotNull NetModel netModel) {
        Intrinsics.checkNotNullParameter(netModel, "netModel");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.writeNetLog(netModel);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeSecLog(@NotNull SecModel secModel) {
        Intrinsics.checkNotNullParameter(secModel, "secModel");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.writeSecLog(secModel);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeTrackLog(@NotNull TrackModel trackModel) {
        Intrinsics.checkNotNullParameter(trackModel, "trackModel");
        if (isInitialized) {
            LoggerImpl loggerImpl2 = loggerImpl;
            if (loggerImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loggerImpl");
                loggerImpl2 = null;
            }
            loggerImpl2.writeTrackLog(trackModel);
        }
    }
}
