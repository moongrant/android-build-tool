package com.common.support.apm.netdetector;

import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.configuration.ConfigurationManager;
import com.common.support.apm.configuration.specific.NetDetectorConfig;
import com.common.support.apm.monitor.MonitorErrorCodeKt;
import com.common.support.apm.monitor.MonitorManager;
import com.common.support.apm.sailfishhttp.BaseServerResponse;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/common/support/apm/netdetector/BaseNetDetector;", "Lcom/common/support/apm/netdetector/NetDetector;", "()V", "task", "Lkotlinx/coroutines/Job;", "buildCheckResult", "Lcom/common/support/apm/netdetector/NetDetectLog;", "timeSpent", "", "domain", "", "checkGap", "isWorking", "", "reloadConfigIfNeeded", "", "response", "Lcom/common/support/apm/sailfishhttp/BaseServerResponse;", "Lcom/common/support/apm/netdetector/NetDetectResponse;", "start", "stop", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseNetDetector implements NetDetector {

    @Nullable
    private Job task;

    /* JADX INFO: renamed from: com.common.support.apm.netdetector.BaseNetDetector$start$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.common.support.apm.netdetector.BaseNetDetector$start$1", f = "BaseNetDetector.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = BaseNetDetector.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused) {
                    LoggerKt.logE$default(null, null, new Function0<String>() { // from class: com.common.support.apm.netdetector.BaseNetDetector.start.1.1
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "upload task cancelled";
                        }
                    }, 3, null);
                    MonitorManager.INSTANCE.updateNetDetectStatusMetric$sailfish_release(-1, MonitorErrorCodeKt.MONITOR_ERROR_COROUTINE_CANCEL_EXCEPTION, true);
                }
            }
            while (CoroutineScopeKt.isActive(coroutineScope)) {
                BaseNetDetector.this.report();
                long jCheckGap = BaseNetDetector.this.checkGap();
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(jCheckGap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MonitorManager.INSTANCE.updateNetDetectStatusMetric$sailfish_release(-1, MonitorErrorCodeKt.MONITOR_ERROR_LOOP_QUIT_ABNORMALLY, true);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public final NetDetectLog buildCheckResult(long timeSpent, @NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        NetDetectLog netDetectLog = new NetDetectLog(Sailfish.deviceId);
        netDetectLog.getData().setIden(Sailfish.uniqueId);
        netDetectLog.getData().setSpendTimeMs(timeSpent);
        netDetectLog.getData().setDomain(domain);
        return netDetectLog;
    }

    @Override // com.common.support.apm.netdetector.NetDetector
    public long checkGap() {
        return NetDetectorConfig.INSTANCE.checkNetFrequency() * ((long) 1000);
    }

    @Override // com.common.support.apm.netdetector.NetDetector
    public boolean isWorking() {
        Job job = this.task;
        return job != null && job.isActive();
    }

    public final void reloadConfigIfNeeded(@Nullable BaseServerResponse<NetDetectResponse> response) {
        if (response == null || !response.getSuccess()) {
            return;
        }
        NetDetectResponse data = response.getData();
        boolean z = false;
        if (data != null && data.getIsSysConfigChange()) {
            z = true;
        }
        if (z) {
            ConfigurationManager.INSTANCE.reloadConfig();
        }
    }

    @Override // com.common.support.apm.netdetector.NetDetector
    public void start() {
        this.task = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    @Override // com.common.support.apm.netdetector.NetDetector
    public void stop() {
        Job job = this.task;
        if (job == null || !job.isActive()) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }
}
