package com.common.support.netdiagwrapper;

import android.content.Context;
import com.common.support.netdiagwrapper.NetDiagnosis.Progress;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.common.support.netdiagwrapper.NetDiagnosis$startInner$job$1", f = "NetDiagnosis.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NetDiagnosis$startInner$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NetDiagnosis.Callback $callback;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ NetDiagnosis this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetDiagnosis$startInner$job$1(Context context, NetDiagnosis netDiagnosis, NetDiagnosis.Callback callback, Continuation<? super NetDiagnosis$startInner$job$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.this$0 = netDiagnosis;
        this.$callback = callback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new NetDiagnosis$startInner$job$1(this.$context, this.this$0, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NetDiagnosisResult netDiagnosisResult = new NetDiagnosisResult(this.$context);
        try {
            NetDiagnosis netDiagnosis = this.this$0;
            NetDiagnosis.Progress progress = this.this$0.new Progress(netDiagnosis.calculateTotalProgress(netDiagnosis.items), 0);
            Set setKeySet = this.this$0.items.keySet();
            NetDiagnosis netDiagnosis2 = this.this$0;
            NetDiagnosis.Callback callback = this.$callback;
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                switch (((Number) it.next()).intValue()) {
                    case 1:
                        netDiagnosisResult.setPing(netDiagnosis2.doPing(callback, progress));
                        break;
                    case 2:
                        netDiagnosisResult.setTcpPing(netDiagnosis2.doTcpPing(callback, progress));
                        break;
                    case 3:
                        netDiagnosisResult.setHostResolution(netDiagnosis2.doHostResolution(callback, progress));
                        break;
                    case 4:
                        netDiagnosisResult.setTraceRoute(netDiagnosis2.doTraceRoute(callback, progress));
                        break;
                    case 5:
                        netDiagnosisResult.setPublicIp(netDiagnosis2.requestPublicIp(callback, progress));
                        break;
                    case 6:
                        netDiagnosisResult.setDns(netDiagnosis2.doDns(callback, progress));
                        break;
                    case 7:
                        netDiagnosisResult.setDownStreamSpeed(netDiagnosis2.doDownStreamSpeedTest(callback, progress));
                        break;
                    case 8:
                        netDiagnosisResult.setUpStreamSpeed(netDiagnosis2.doUpStreamSpeedTest(callback, progress));
                        break;
                }
            }
            this.$callback.onResult(netDiagnosisResult);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((NetDiagnosis$startInner$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
