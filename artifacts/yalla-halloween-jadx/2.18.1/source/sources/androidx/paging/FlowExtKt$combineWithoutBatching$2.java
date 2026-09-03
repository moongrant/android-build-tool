package androidx.paging;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O0OO0;
import p089o000o000.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lo000o000/o00O0OO0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", f = "FlowExt.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtKt$combineWithoutBatching$2 extends SuspendLambda implements Function2<o00O0OO0<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f8677Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8678Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f8679Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f8680Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function4<Object, Object, CombineSource, Continuation<Object>, Object> f8681OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2(Flow<Object> flow, Flow<Object> flow2, Function4<Object, Object, ? super CombineSource, ? super Continuation<Object>, ? extends Object> function4, Continuation<? super FlowExtKt$combineWithoutBatching$2> continuation) {
        super(2, continuation);
        this.f8680Oooo0oo = flow;
        this.f8677Oooo = flow2;
        this.f8681OoooO00 = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowExtKt$combineWithoutBatching$2 flowExtKt$combineWithoutBatching$2 = new FlowExtKt$combineWithoutBatching$2(this.f8680Oooo0oo, this.f8677Oooo, this.f8681OoooO00, continuation);
        flowExtKt$combineWithoutBatching$2.f8679Oooo0oO = obj;
        return flowExtKt$combineWithoutBatching$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00O0OO0<Object> o00o0oo1, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$combineWithoutBatching$2) create(o00o0oo1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8678Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O0OO0 o00o0oo1 = (o00O0OO0) this.f8679Oooo0oO;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            o00OO00O o00oo00o = new o00OO00O(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(o00o0oo1, this.f8681OoooO00, null));
            final CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            Flow[] flowArr = {this.f8680Oooo0oo, this.f8677Oooo};
            int i2 = 0;
            int i3 = 0;
            while (i3 < 2) {
                BuildersKt__Builders_commonKt.launch$default(o00o0oo1, completableJobJob$default, null, new FlowExtKt$combineWithoutBatching$2$1$1(flowArr[i3], atomicInteger, o00o0oo1, o00oo00o, i2, null), 2, null);
                i3++;
                i2++;
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.paging.FlowExtKt$combineWithoutBatching$2.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    Job.DefaultImpls.cancel$default((Job) completableJobJob$default, (CancellationException) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
            };
            this.f8678Oooo0o = 1;
            if (o00o0oo1.OooO00o(function0, this) == coroutine_suspended) {
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
}
