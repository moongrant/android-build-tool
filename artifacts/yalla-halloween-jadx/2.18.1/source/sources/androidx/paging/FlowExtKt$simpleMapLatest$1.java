package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleMapLatest$1", f = "FlowExt.kt", i = {}, l = {106, 106}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtKt$simpleMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<Object>, Object, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function2<Object, Continuation<Object>, Object> f8704Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8705Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ FlowCollector f8706Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f8707Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleMapLatest$1(Function2<Object, ? super Continuation<Object>, ? extends Object> function2, Continuation<? super FlowExtKt$simpleMapLatest$1> continuation) {
        super(3, continuation);
        this.f8704Oooo = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<Object> flowCollector, Object obj, Continuation<? super Unit> continuation) {
        FlowExtKt$simpleMapLatest$1 flowExtKt$simpleMapLatest$1 = new FlowExtKt$simpleMapLatest$1(this.f8704Oooo, continuation);
        flowExtKt$simpleMapLatest$1.f8706Oooo0oO = flowCollector;
        flowExtKt$simpleMapLatest$1.f8707Oooo0oo = obj;
        return flowExtKt$simpleMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8705Oooo0o;
        if (i != 0) {
            if (i == 1) {
                flowCollector = this.f8706Oooo0oO;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        flowCollector = this.f8706Oooo0oO;
        Object obj2 = this.f8707Oooo0oo;
        Function2<Object, Continuation<Object>, Object> function2 = this.f8704Oooo;
        this.f8706Oooo0oO = flowCollector;
        this.f8705Oooo0o = 1;
        obj = function2.invoke(obj2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f8706Oooo0oO = null;
        this.f8705Oooo0o = 2;
        if (flowCollector.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
