package androidx.paging;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O;
import p101o000oo.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¨\u0006\u0005"}, d2 = {"T1", "T2", "R", "Lo000oo/o00O0O0O;", "", "androidx/paging/FlowExtKt$combineWithoutBatching$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n13644#2,3:225\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n*L\n145#1:225,3\n*E\n"})
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 extends SuspendLambda implements Function2<o00O0O0O<Oooo000<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10318OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Flow f10319OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f10320OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Flow f10321OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooOo f10322OooO0oo;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¨\u0006\b"}, d2 = {"T1", "T2", "R", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "", "androidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1\n+ 2 PageFetcher.kt\nandroidx/paging/PageFetcher$injectRemoteEvents$1\n*L\n1#1,224:1\n162#2,38:225\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function4<OooOOO, Oooo000<Object>, CombineSource, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ OooOo f10323OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f10324OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f10325OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f10326OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ CombineSource f10327OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O0O<Oooo000<Object>> f10328OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o00O0O0O o00o0o0o2, Continuation continuation, OooOo oooOo) {
            super(4, continuation);
            this.f10323OooO = oooOo;
            this.f10328OooO0oo = o00o0o0o2;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(OooOOO oooOOO, Oooo000<Object> oooo000, CombineSource combineSource, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10328OooO0oo, continuation, this.f10323OooO);
            anonymousClass1.f10326OooO0o0 = oooOOO;
            anonymousClass1.f10325OooO0o = oooo000;
            anonymousClass1.f10327OooO0oO = combineSource;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10324OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f10326OooO0o0;
                Object obj3 = this.f10325OooO0o;
                CombineSource combineSource = this.f10327OooO0oO;
                Object oooO0OO = (Oooo000) obj3;
                OooOOO oooOOO = (OooOOO) obj2;
                CombineSource combineSource2 = CombineSource.RECEIVER;
                OooOo oooOo = this.f10323OooO;
                if (combineSource == combineSource2) {
                    oooO0OO = new Oooo000.OooO0OO(oooOo.OooO0Oo(), oooOOO);
                } else if (oooO0OO instanceof Oooo000.OooO0O0) {
                    Oooo000.OooO0O0 oooO0O0 = (Oooo000.OooO0O0) oooO0OO;
                    oooOo.OooO0O0(oooO0O0.f10291OooO0o0);
                    OooOOO sourceLoadStates = oooO0O0.f10291OooO0o0;
                    LoadType loadType = oooO0O0.f10286OooO00o;
                    List<o000000O<T>> pages = oooO0O0.f10287OooO0O0;
                    int i2 = oooO0O0.f10288OooO0OO;
                    int i3 = oooO0O0.f10289OooO0Oo;
                    Intrinsics.checkNotNullParameter(loadType, "loadType");
                    Intrinsics.checkNotNullParameter(pages, "pages");
                    Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                    oooO0OO = new Oooo000.OooO0O0(loadType, pages, i2, i3, sourceLoadStates, oooOOO);
                } else if (oooO0OO instanceof Oooo000.OooO00o) {
                    oooOo.OooO0OO(((Oooo000.OooO00o) oooO0OO).f10281OooO00o, OooOOO0.OooO0OO.f10261OooO0OO);
                } else {
                    if (!(oooO0OO instanceof Oooo000.OooO0OO)) {
                        if (oooO0OO instanceof Oooo000.OooO0o) {
                            throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Oooo000.OooO0OO oooO0OO2 = (Oooo000.OooO0OO) oooO0OO;
                    oooOo.OooO0O0(oooO0OO2.f10292OooO00o);
                    oooO0OO = new Oooo000.OooO0OO(oooO0OO2.f10292OooO00o, oooOOO);
                }
                this.f10324OooO0Oo = 1;
                if (this.f10328OooO0oo.send(oooO0OO, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¨\u0006\u0005"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "androidx/paging/FlowExtKt$combineWithoutBatching$2$1$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1\n*L\n1#1,224:1\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f10329OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f10330OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Flow f10331OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00O0O0O<Oooo000<Object>> f10332OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f10333OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o00O f10334OooO0oo;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$OooO00o */
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1\n*L\n1#1,224:1\n*E\n"})
        public static final class OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00O f10335OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ int f10336OooO0o0;

            /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$OooO00o$OooO00o, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1\n*L\n1#1,224:1\n*E\n"})
            public static final class C0173OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public /* synthetic */ Object f10337OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public int f10339OooO0o0;

                public C0173OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f10337OooO0Oo = obj;
                    this.f10339OooO0o0 |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(o00O o00o2, int i) {
                this.f10335OooO0Oo = o00o2;
                this.f10336OooO0o0 = i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
                C0173OooO00o c0173OooO00o;
                if (continuation instanceof C0173OooO00o) {
                    c0173OooO00o = (C0173OooO00o) continuation;
                    int i = c0173OooO00o.f10339OooO0o0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0173OooO00o.f10339OooO0o0 = i - Integer.MIN_VALUE;
                    } else {
                        c0173OooO00o = new C0173OooO00o(continuation);
                    }
                } else {
                    c0173OooO00o = new C0173OooO00o(continuation);
                }
                Object obj2 = c0173OooO00o.f10337OooO0Oo;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0173OooO00o.f10339OooO0o0;
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
                c0173OooO00o.f10339OooO0o0 = 1;
                if (this.f10335OooO0Oo.OooO00o(this.f10336OooO0o0, obj, c0173OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c0173OooO00o.f10339OooO0o0 = 2;
                if (YieldKt.yield(c0173OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow flow, AtomicInteger atomicInteger, o00O0O0O o00o0o0o2, o00O o00o2, int i, Continuation continuation) {
            super(2, continuation);
            this.f10331OooO0o = flow;
            this.f10333OooO0oO = atomicInteger;
            this.f10334OooO0oo = o00o2;
            this.f10329OooO = i;
            this.f10332OooO0o0 = o00o0o0o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.f10331OooO0o, this.f10333OooO0oO, this.f10332OooO0o0, this.f10334OooO0oo, this.f10329OooO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10330OooO0Oo;
            o00O0O0O<Oooo000<Object>> o00o0o0o2 = this.f10332OooO0o0;
            AtomicInteger atomicInteger = this.f10333OooO0oO;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flow = this.f10331OooO0o;
                    OooO00o oooO00o = new OooO00o(this.f10334OooO0oo, this.f10329OooO);
                    this.f10330OooO0Oo = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(Flow flow, Flow flow2, Continuation continuation, OooOo oooOo) {
        super(2, continuation);
        this.f10319OooO0o = flow;
        this.f10321OooO0oO = flow2;
        this.f10322OooO0oo = oooOo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 = new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.f10319OooO0o, this.f10321OooO0oO, continuation, this.f10322OooO0oo);
        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.f10320OooO0o0 = obj;
        return pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00O0O0O<Oooo000<Object>> o00o0o0o2, Continuation<? super Unit> continuation) {
        return ((PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1) create(o00o0o0o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10318OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O0O0O o00o0o0o2 = (o00O0O0O) this.f10320OooO0o0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            o00O o00o2 = new o00O(new AnonymousClass1(o00o0o0o2, null, this.f10322OooO0oo));
            final CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            Flow[] flowArr = {this.f10319OooO0o, this.f10321OooO0oO};
            int i2 = 0;
            int i3 = 0;
            while (i3 < 2) {
                BuildersKt__Builders_commonKt.launch$default(o00o0o0o2, completableJobJob$default, null, new AnonymousClass2(flowArr[i3], atomicInteger, o00o0o0o2, o00o2, i2, null), 2, null);
                i3++;
                i2++;
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    Job.DefaultImpls.cancel$default((Job) completableJobJob$default, (CancellationException) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
            };
            this.f10318OooO0Oo = 1;
            if (o00o0o0o2.OooO0OO(function0, this) == coroutine_suspended) {
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
