package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"T1", "T2", "R", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", f = "FlowExt.kt", i = {}, l = {142, 142}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 extends SuspendLambda implements Function4<Object, Object, CombineSource, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public /* synthetic */ CombineSource f8694Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8695Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f8696Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f8697Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function4<Object, Object, CombineSource, Continuation<Object>, Object> f8698OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O0OO0<Object> f8699OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(o00O0OO0<Object> o00o0oo1, Function4<Object, Object, ? super CombineSource, ? super Continuation<Object>, ? extends Object> function4, Continuation<? super FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1> continuation) {
        super(4, continuation);
        this.f8699OoooO00 = o00o0oo1;
        this.f8698OoooO0 = function4;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, CombineSource combineSource, Continuation<? super Unit> continuation) {
        FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 = new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(this.f8699OoooO00, this.f8698OoooO0, continuation);
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.f8696Oooo0oO = obj;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.f8697Oooo0oo = obj2;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.f8694Oooo = combineSource;
        return flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00O0OO0<Object> o00o0oo1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8695Oooo0o;
        if (i != 0) {
            if (i == 1) {
                o00o0oo1 = (o00O0OO0) this.f8696Oooo0oO;
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
        Object obj2 = this.f8696Oooo0oO;
        Object obj3 = this.f8697Oooo0oo;
        CombineSource combineSource = this.f8694Oooo;
        o00O0OO0<Object> o00o0oo2 = this.f8699OoooO00;
        Function4<Object, Object, CombineSource, Continuation<Object>, Object> function4 = this.f8698OoooO0;
        this.f8696Oooo0oO = o00o0oo2;
        this.f8697Oooo0oo = null;
        this.f8695Oooo0o = 1;
        obj = function4.invoke(obj2, obj3, combineSource, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00o0oo1 = o00o0oo2;
        this.f8696Oooo0oO = null;
        this.f8695Oooo0o = 2;
        if (o00o0oo1.send(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
