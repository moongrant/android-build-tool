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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o000000;
import p089o000o000.o000O000;
import p089o000o000.o000O0Oo;
import p089o000o000.o00OO0O0;
import p089o000o000.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {232, 247}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"})
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super o00oO0o>, Integer, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000O000 f8755Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8756Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ FlowCollector f8757Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f8758Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Mutex f8759OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ LoadType f8760OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f8761OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(Continuation continuation, o000O000 o000o001, LoadType loadType) {
        super(3, continuation);
        this.f8755Oooo = o000o001;
        this.f8760OoooO00 = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super o00oO0o> flowCollector, Integer num, Continuation<? super Unit> continuation) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(continuation, this.f8755Oooo, this.f8760OoooO00);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.f8757Oooo0oO = flowCollector;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.f8758Oooo0oo = num;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        final int iIntValue;
        o000O0Oo.OooO00o oooO00o;
        Mutex mutex;
        Flow<o00oO0o> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8756Oooo0o;
        try {
            if (i != 0) {
                if (i == 1) {
                    iIntValue = this.f8761OoooO0O;
                    mutex = this.f8759OoooO0;
                    oooO00o = (o000O0Oo.OooO00o) this.f8758Oooo0oo;
                    flowCollector = this.f8757Oooo0oO;
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
            flowCollector = this.f8757Oooo0oO;
            iIntValue = ((Number) this.f8758Oooo0oo).intValue();
            oooO00o = this.f8755Oooo.f28795OooOO0O;
            mutex = oooO00o.f28868OooO00o;
            this.f8757Oooo0oO = flowCollector;
            this.f8758Oooo0oo = oooO00o;
            this.f8759OoooO0 = mutex;
            this.f8761OoooO0O = iIntValue;
            this.f8756Oooo0o = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000O0Oo<Key, Value> o000o0oo2 = oooO00o.f28869OooO0O0;
            if (Intrinsics.areEqual(o000o0oo2.f28867OooOO0o.OooO00o(this.f8760OoooO00), o000000.OooO0OO.f28698OooO0O0)) {
                flowFlowOf = FlowKt.flowOf((Object[]) new o00oO0o[0]);
                mutex.unlock(null);
            } else {
                if (!(o000o0oo2.f28867OooOO0o.OooO00o(this.f8760OoooO00) instanceof o000000.OooO00o)) {
                    o000o0oo2.f28867OooOO0o.OooO0O0(this.f8760OoooO00, o000000.OooO0OO.f28699OooO0OO);
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                final Flow flowDrop = FlowKt.drop(this.f8755Oooo.f28793OooO0oo.OooO00o(this.f8760OoooO00), iIntValue == 0 ? 0 : 1);
                flowFlowOf = new Flow<o00oO0o>() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1

                    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector, SuspendFunction {

                        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f8764Oooo0o;

                        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                        public final /* synthetic */ int f8765Oooo0oO;

                        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                            public /* synthetic */ Object f8766Oooo0o;

                            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                            public int f8767Oooo0oO;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.f8766Oooo0o = obj;
                                this.f8767Oooo0oO |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, int i) {
                            this.f8764Oooo0o = flowCollector;
                            this.f8765Oooo0oO = i;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.f8767Oooo0oO;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f8767Oooo0oO = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.f8766Oooo0o;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.f8767Oooo0oO;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.f8764Oooo0o;
                                o00oO0o o00oo0o2 = new o00oO0o(this.f8765Oooo0oO, (o00OO0O0) obj);
                                anonymousClass1.f8767Oooo0oO = 1;
                                if (flowCollector.emit(o00oo0o2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                    public final Object collect(@NotNull FlowCollector<? super o00oO0o> flowCollector2, @NotNull Continuation continuation) {
                        Object objCollect = flowDrop.collect(new AnonymousClass2(flowCollector2, iIntValue), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
            this.f8757Oooo0oO = null;
            this.f8758Oooo0oo = null;
            this.f8759OoooO0 = null;
            this.f8756Oooo0o = 2;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
