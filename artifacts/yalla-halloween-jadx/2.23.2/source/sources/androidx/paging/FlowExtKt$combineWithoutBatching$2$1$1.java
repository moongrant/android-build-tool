package androidx.paging;

import io.agora.rtc.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O;
import p101o000oo.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1\n*L\n1#1,224:1\n*E\n"})
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f10162OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10163OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f10164OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f10165OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00O0O0O<Object> f10166OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00O<Object, Object> f10167OooO0oo;

    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1\n*L\n1#1,224:1\n*E\n"})
    public static final class OooO00o<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O<Object, Object> f10168OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f10169OooO0o0;

        /* JADX INFO: renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1", f = "FlowExt.kt", i = {}, l = {149, Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT}, m = "emit", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1\n*L\n1#1,224:1\n*E\n"})
        public static final class C0165OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f10170OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f10171OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f10172OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0165OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C0165OooO00o> continuation) {
                super(continuation);
                this.f10172OooO0o0 = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f10170OooO0Oo = obj;
                this.f10171OooO0o |= Integer.MIN_VALUE;
                return this.f10172OooO0o0.emit(null, this);
            }
        }

        public OooO00o(o00O<Object, Object> o00o2, int i) {
            this.f10168OooO0Oo = o00o2;
            this.f10169OooO0o0 = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            C0165OooO00o c0165OooO00o;
            if (continuation instanceof C0165OooO00o) {
                c0165OooO00o = (C0165OooO00o) continuation;
                int i = c0165OooO00o.f10171OooO0o;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0165OooO00o.f10171OooO0o = i - Integer.MIN_VALUE;
                } else {
                    c0165OooO00o = new C0165OooO00o(this, continuation);
                }
            } else {
                c0165OooO00o = new C0165OooO00o(this, continuation);
            }
            Object obj2 = c0165OooO00o.f10170OooO0Oo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0165OooO00o.f10171OooO0o;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj2);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj2);
            c0165OooO00o.f10171OooO0o = 1;
            if (this.f10168OooO0Oo.OooO00o(this.f10169OooO0o0, obj, c0165OooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c0165OooO00o.f10171OooO0o = 2;
            if (YieldKt.yield(c0165OooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(Flow<? extends Object> flow, AtomicInteger atomicInteger, o00O0O0O<Object> o00o0o0o2, o00O<Object, Object> o00o2, int i, Continuation<? super FlowExtKt$combineWithoutBatching$2$1$1> continuation) {
        super(2, continuation);
        this.f10165OooO0o0 = flow;
        this.f10164OooO0o = atomicInteger;
        this.f10166OooO0oO = o00o0o0o2;
        this.f10167OooO0oo = o00o2;
        this.f10162OooO = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowExtKt$combineWithoutBatching$2$1$1(this.f10165OooO0o0, this.f10164OooO0o, this.f10166OooO0oO, this.f10167OooO0oo, this.f10162OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$combineWithoutBatching$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10163OooO0Oo;
        o00O0O0O<Object> o00o0o0o2 = this.f10166OooO0oO;
        AtomicInteger atomicInteger = this.f10164OooO0o;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Object> flow = this.f10165OooO0o0;
                OooO00o oooO00o = new OooO00o(this.f10167OooO0oo, this.f10162OooO);
                this.f10163OooO0Oo = 1;
                if (flow.collect(oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                SendChannel.DefaultImpls.close$default(o00o0o0o2, null, 1, null);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                SendChannel.DefaultImpls.close$default(o00o0o0o2, null, 1, null);
            }
            throw th;
        }
    }
}
