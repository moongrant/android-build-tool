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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O0OO0;
import p089o000o000.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O0OO0<Object> f8682Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8683Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f8684Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f8685Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f8686OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00OO00O<Object, Object> f8687OoooO00;

    public static final class OooO00o<T> implements FlowCollector {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO00O<Object, Object> f8688Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f8689Oooo0oO;

        /* JADX INFO: renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1", f = "FlowExt.kt", i = {}, l = {149, Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT}, m = "emit", n = {}, s = {})
        public static final class C0060OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ Object f8690Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f8691Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public int f8692Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0060OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C0060OooO00o> continuation) {
                super(continuation);
                this.f8691Oooo0oO = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f8690Oooo0o = obj;
                this.f8692Oooo0oo |= Integer.MIN_VALUE;
                return this.f8691Oooo0oO.emit(null, this);
            }
        }

        public OooO00o(o00OO00O<Object, Object> o00oo00o, int i) {
            this.f8688Oooo0o = o00oo00o;
            this.f8689Oooo0oO = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            C0060OooO00o c0060OooO00o;
            if (continuation instanceof C0060OooO00o) {
                c0060OooO00o = (C0060OooO00o) continuation;
                int i = c0060OooO00o.f8692Oooo0oo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0060OooO00o.f8692Oooo0oo = i - Integer.MIN_VALUE;
                } else {
                    c0060OooO00o = new C0060OooO00o(this, continuation);
                }
            } else {
                c0060OooO00o = new C0060OooO00o(this, continuation);
            }
            Object obj2 = c0060OooO00o.f8690Oooo0o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0060OooO00o.f8692Oooo0oo;
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
            o00OO00O<Object, Object> o00oo00o = this.f8688Oooo0o;
            int i3 = this.f8689Oooo0oO;
            c0060OooO00o.f8692Oooo0oo = 1;
            if (o00oo00o.OooO00o(i3, obj, c0060OooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c0060OooO00o.f8692Oooo0oo = 2;
            if (YieldKt.yield(c0060OooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(Flow<? extends Object> flow, AtomicInteger atomicInteger, o00O0OO0<Object> o00o0oo1, o00OO00O<Object, Object> o00oo00o, int i, Continuation<? super FlowExtKt$combineWithoutBatching$2$1$1> continuation) {
        super(2, continuation);
        this.f8684Oooo0oO = flow;
        this.f8685Oooo0oo = atomicInteger;
        this.f8682Oooo = o00o0oo1;
        this.f8687OoooO00 = o00oo00o;
        this.f8686OoooO0 = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowExtKt$combineWithoutBatching$2$1$1(this.f8684Oooo0oO, this.f8685Oooo0oo, this.f8682Oooo, this.f8687OoooO00, this.f8686OoooO0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$combineWithoutBatching$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8683Oooo0o;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Object> flow = this.f8684Oooo0oO;
                OooO00o oooO00o = new OooO00o(this.f8687OoooO00, this.f8686OoooO0);
                this.f8683Oooo0o = 1;
                if (flow.collect(oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.f8685Oooo0oo.decrementAndGet() == 0) {
                SendChannel.DefaultImpls.close$default(this.f8682Oooo, null, 1, null);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (this.f8685Oooo0oo.decrementAndGet() == 0) {
                SendChannel.DefaultImpls.close$default(this.f8682Oooo, null, 1, null);
            }
            throw th;
        }
    }
}
