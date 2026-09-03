package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o000O000;
import p089o000o000.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1", f = "PageFetcherSnapshot.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcherSnapshot$startConsumingHints$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8769Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O000<Object, Object> f8770Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LoadType f8771Oooo0oo;

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00OO0O0, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000<Object, Object> f8772Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000<Object, Object> o000o001, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f8772Oooo0o = o000o001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f8772Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0 o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f8772Oooo0o.f28792OooO0oO.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1$1(o000O000<Object, Object> o000o001, LoadType loadType, Continuation<? super PageFetcherSnapshot$startConsumingHints$1$1> continuation) {
        super(2, continuation);
        this.f8770Oooo0oO = o000o001;
        this.f8771Oooo0oo = loadType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PageFetcherSnapshot$startConsumingHints$1$1(this.f8770Oooo0oO, this.f8771Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PageFetcherSnapshot$startConsumingHints$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8769Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow<o00OO0O0> flowOooO00o = this.f8770Oooo0oO.f28793OooO0oo.OooO00o(this.f8771Oooo0oo);
            final o000O000<Object, Object> o000o001 = this.f8770Oooo0oO;
            Flow<o00OO0O0> flow = new Flow<o00OO0O0>() { // from class: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector, SuspendFunction {

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f8775Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public final /* synthetic */ o000O000 f8776Oooo0oO;

                    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                        public /* synthetic */ Object f8777Oooo0o;

                        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                        public int f8778Oooo0oO;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f8777Oooo0o = obj;
                            this.f8778Oooo0oO |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, o000O000 o000o001) {
                        this.f8775Oooo0o = flowCollector;
                        this.f8776Oooo0oO = o000o001;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.f8778Oooo0oO;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f8778Oooo0oO = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f8777Oooo0o;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.f8778Oooo0oO;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.f8775Oooo0o;
                            o00OO0O0 o00oo0o1 = (o00OO0O0) obj;
                            int i3 = o00oo0o1.f29025OooO00o * (-1);
                            int i4 = this.f8776Oooo0oO.f28788OooO0OO.f28929OooO0o;
                            if (i3 > i4 || o00oo0o1.f29026OooO0O0 * (-1) > i4) {
                                anonymousClass1.f8778Oooo0oO = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public final Object collect(@NotNull FlowCollector<? super o00OO0O0> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowOooO00o.collect(new AnonymousClass2(flowCollector, o000o001), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            OooO00o oooO00o = new OooO00o(o000o001, null);
            this.f8769Oooo0o = 1;
            if (FlowKt.collectLatest(flow, oooO00o, this) == coroutine_suspended) {
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
