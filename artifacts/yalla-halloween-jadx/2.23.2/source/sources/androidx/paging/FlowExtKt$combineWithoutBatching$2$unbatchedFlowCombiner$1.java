package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"T1", "T2", "R", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", f = "FlowExt.kt", i = {}, l = {142, 142}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1\n*L\n1#1,224:1\n*E\n"})
public final class FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 extends SuspendLambda implements Function4<Object, Object, CombineSource, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function4<Object, Object, CombineSource, Continuation<Object>, Object> f10174OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10175OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f10176OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f10177OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public /* synthetic */ CombineSource f10178OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O0O<Object> f10179OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(o00O0O0O<Object> o00o0o0o2, Function4<Object, Object, ? super CombineSource, ? super Continuation<Object>, ? extends Object> function4, Continuation<? super FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1> continuation) {
        super(4, continuation);
        this.f10179OooO0oo = o00o0o0o2;
        this.f10174OooO = function4;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, CombineSource combineSource, Continuation<? super Unit> continuation) {
        FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 = new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(this.f10179OooO0oo, this.f10174OooO, continuation);
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.f10177OooO0o0 = obj;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.f10176OooO0o = obj2;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.f10178OooO0oO = combineSource;
        return flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00O0O0O<Object> o00o0o0o2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10175OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                o00o0o0o2 = (o00O0O0O) this.f10177OooO0o0;
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
        Object obj2 = this.f10177OooO0o0;
        Object obj3 = this.f10176OooO0o;
        CombineSource combineSource = this.f10178OooO0oO;
        o00O0O0O<Object> o00o0o0o3 = this.f10179OooO0oo;
        this.f10177OooO0o0 = o00o0o0o3;
        this.f10176OooO0o = null;
        this.f10175OooO0Oo = 1;
        obj = this.f10174OooO.invoke(obj2, obj3, combineSource, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00o0o0o2 = o00o0o0o3;
        this.f10177OooO0o0 = null;
        this.f10175OooO0Oo = 2;
        if (o00o0o0o2.send(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
