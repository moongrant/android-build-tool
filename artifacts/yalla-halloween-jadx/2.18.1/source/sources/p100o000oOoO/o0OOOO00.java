package p100o000oOoO;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", i = {}, l = {65, 66}, m = "invokeSuspend", n = {}, s = {})
public final class o0OOOO00 extends SuspendLambda implements Function2<o0O0oo0o<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f29642Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f29643Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f29644Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f29645Oooo0oo;

    public static final class OooO00o implements FlowCollector<Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0oo0o<Object> f29646Oooo0o;

        public OooO00o(o0O0oo0o<Object> o0o0oo0o) {
            this.f29646Oooo0o = o0o0oo0o;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.f29646Oooo0o.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f29647Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Flow<Object> f29648Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0oo0o<Object> f29649Oooo0oo;

        public static final class OooO00o implements FlowCollector<Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o0O0oo0o<Object> f29650Oooo0o;

            public OooO00o(o0O0oo0o<Object> o0o0oo0o) {
                this.f29650Oooo0o = o0o0oo0o;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(Object obj, @NotNull Continuation<? super Unit> continuation) {
                this.f29650Oooo0o.setValue(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Flow<Object> flow, o0O0oo0o<Object> o0o0oo0o, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f29648Oooo0oO = flow;
            this.f29649Oooo0oo = o0o0oo0o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f29648Oooo0oO, this.f29649Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29647Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Object> flow = this.f29648Oooo0oO;
                OooO00o oooO00o = new OooO00o(this.f29649Oooo0oo);
                this.f29647Oooo0o = 1;
                if (flow.collect(oooO00o, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(CoroutineContext coroutineContext, Flow<Object> flow, Continuation<? super o0OOOO00> continuation) {
        super(2, continuation);
        this.f29645Oooo0oo = coroutineContext;
        this.f29642Oooo = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OOOO00 o0oooo01 = new o0OOOO00(this.f29645Oooo0oo, this.f29642Oooo, continuation);
        o0oooo01.f29644Oooo0oO = obj;
        return o0oooo01;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0O0oo0o<Object> o0o0oo0o, Continuation<? super Unit> continuation) {
        return ((o0OOOO00) create(o0o0oo0o, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f29643Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O0oo0o o0o0oo0o = (o0O0oo0o) this.f29644Oooo0oO;
            if (Intrinsics.areEqual(this.f29645Oooo0oo, EmptyCoroutineContext.INSTANCE)) {
                Flow<Object> flow = this.f29642Oooo;
                OooO00o oooO00o = new OooO00o(o0o0oo0o);
                this.f29643Oooo0o = 1;
                if (flow.collect(oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                CoroutineContext coroutineContext = this.f29645Oooo0oo;
                OooO0O0 oooO0O0 = new OooO0O0(this.f29642Oooo, o0o0oo0o, null);
                this.f29643Oooo0o = 2;
                if (BuildersKt.withContext(coroutineContext, oooO0O0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
