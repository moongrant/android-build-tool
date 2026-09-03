package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {232, 99}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleFlatMapLatest$1\n+ 2 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n+ 3 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,224:1\n254#2:225\n258#2,2:236\n260#2,4:239\n265#2,4:244\n391#3:226\n392#3:235\n107#4,8:227\n116#4:238\n115#4:243\n47#5:248\n49#5:252\n50#6:249\n55#6:251\n106#7:250\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n254#1:226\n254#1:235\n254#1:227,8\n254#1:238\n254#1:243\n268#1:248\n268#1:252\n268#1:249\n268#1:251\n268#1:250\n*E\n"})
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super o000O00O.oo000o>, Integer, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Mutex f7247OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f7248OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f7249OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ FlowCollector f7250OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f7251OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LoadType f7252OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f7253OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(Continuation continuation, o000oOoO o000oooo2, LoadType loadType) {
        super(3, continuation);
        this.f7251OooO0oO = o000oooo2;
        this.f7252OooO0oo = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super o000O00O.oo000o> flowCollector, Integer num, Continuation<? super Unit> continuation) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(continuation, this.f7251OooO0oO, this.f7252OooO0oo);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.f7250OooO0o0 = flowCollector;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.f7249OooO0o = num;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        final int iIntValue;
        o00oO0o.OooO00o oooO00o;
        Mutex mutex;
        Flow<o000O00O.oo000o> flowFlowOf;
        LoadType loadType = this.f7252OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7248OooO0Oo;
        o000oOoO o000oooo2 = this.f7251OooO0oO;
        try {
            if (i != 0) {
                if (i == 1) {
                    iIntValue = this.f7253OooOO0;
                    mutex = this.f7247OooO;
                    oooO00o = (o00oO0o.OooO00o) this.f7249OooO0o;
                    flowCollector = this.f7250OooO0o0;
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
            flowCollector = this.f7250OooO0o0;
            iIntValue = ((Number) this.f7249OooO0o).intValue();
            oooO00o = o000oooo2.f7297OooOO0O;
            mutex = oooO00o.f7346OooO00o;
            this.f7250OooO0o0 = flowCollector;
            this.f7249OooO0o = oooO00o;
            this.f7247OooO = mutex;
            this.f7253OooOO0 = iIntValue;
            this.f7248OooO0Oo = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooOo oooOo = oooO00o.f7347OooO0O0.f7345OooOO0o;
            if (Intrinsics.areEqual(oooOo.OooO00o(loadType), OooOOO0.OooO0OO.f7166OooO0O0)) {
                flowFlowOf = FlowKt.flowOf((Object[]) new o000O00O.oo000o[0]);
                mutex.unlock(null);
            } else {
                if (!(oooOo.OooO00o(loadType) instanceof OooOOO0.OooO00o)) {
                    oooOo.OooO0OO(loadType, OooOOO0.OooO0OO.f7167OooO0OO);
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                final Flow flowDrop = FlowKt.drop(o000oooo2.f7295OooO0oo.OooO00o(loadType), iIntValue == 0 ? 0 : 1);
                flowFlowOf = new Flow<o000O00O.oo000o>() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1

                    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n1#1,222:1\n48#2:223\n268#3:224\n*E\n"})
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f7256OooO0Oo;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public final /* synthetic */ int f7257OooO0o0;

                        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                            public /* synthetic */ Object f7258OooO0Oo;

                            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                            public int f7260OooO0o0;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.f7258OooO0Oo = obj;
                                this.f7260OooO0o0 |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, int i) {
                            this.f7256OooO0Oo = flowCollector;
                            this.f7257OooO0o0 = i;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.f7260OooO0o0;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f7260OooO0o0 = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.f7258OooO0Oo;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.f7260OooO0o0;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                o000O00O.oo000o oo000oVar = new o000O00O.oo000o(this.f7257OooO0o0, (o00000) obj);
                                anonymousClass1.f7260OooO0o0 = 1;
                                if (this.f7256OooO0Oo.emit(oo000oVar, anonymousClass1) == coroutine_suspended) {
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
                    public final Object collect(@NotNull FlowCollector<? super o000O00O.oo000o> flowCollector2, @NotNull Continuation continuation) {
                        Object objCollect = flowDrop.collect(new AnonymousClass2(flowCollector2, iIntValue), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
            this.f7250OooO0o0 = null;
            this.f7249OooO0o = null;
            this.f7247OooO = null;
            this.f7248OooO0Oo = 2;
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
