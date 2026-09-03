package p089o000o000;

import androidx.paging.ActiveFlowTracker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO0 extends SuspendLambda implements Function3<FlowCollector<? super o0O0ooO<Object>>, Throwable, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f28675Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ActiveFlowTracker f28676Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(ActiveFlowTracker activeFlowTracker, Continuation<? super OooOOO0> continuation) {
        super(3, continuation);
        this.f28676Oooo0oO = activeFlowTracker;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super o0O0ooO<Object>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new OooOOO0(this.f28676Oooo0oO, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f28675Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ActiveFlowTracker activeFlowTracker = this.f28676Oooo0oO;
            if (activeFlowTracker != null) {
                this.f28675Oooo0o = 1;
                if (activeFlowTracker.onComplete() == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
