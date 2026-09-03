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
import p089o000o000.o000000;
import p089o000o000.o000000O;
import p089o000o000.o0000O0O;
import p089o000o000.o0000Ooo;
import p089o000o000.o00O;
import p089o000o000.o00O0OO0;
import p089o000o000.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¨\u0006\u0005"}, d2 = {"T1", "T2", "R", "Lo000o000/o00O0OO0;", "", "androidx/paging/FlowExtKt$combineWithoutBatching$2", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 extends SuspendLambda implements Function2<o00O0OO0<o0000O0O<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Flow f8732Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8733Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f8734Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Flow f8735Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f8736OoooO00;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¨\u0006\b"}, d2 = {"T1", "T2", "R", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "", "androidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function4<o000000O, o0000O0O<Object>, CombineSource, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ CombineSource f8737Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f8738Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f8739Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f8740Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0000Ooo f8741OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0OO0<o0000O0O<Object>> f8742OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o00O0OO0 o00o0oo1, Continuation continuation, o0000Ooo o0000ooo) {
            super(4, continuation);
            this.f8741OoooO0 = o0000ooo;
            this.f8742OoooO00 = o00o0oo1;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(o000000O o000000o2, o0000O0O<Object> o0000o0o2, CombineSource combineSource, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8742OoooO00, continuation, this.f8741OoooO0);
            anonymousClass1.f8739Oooo0oO = o000000o2;
            anonymousClass1.f8740Oooo0oo = o0000o0o2;
            anonymousClass1.f8737Oooo = combineSource;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8738Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f8739Oooo0oO;
                Object obj3 = this.f8740Oooo0oo;
                CombineSource combineSource = this.f8737Oooo;
                o00O0OO0<o0000O0O<Object>> o00o0oo1 = this.f8742OoooO00;
                Object oooO0OO = (o0000O0O) obj3;
                o000000O o000000o2 = (o000000O) obj2;
                if (combineSource == CombineSource.RECEIVER) {
                    oooO0OO = new o0000O0O.OooO0OO(this.f8741OoooO0.OooO0Oo(), o000000o2);
                } else if (oooO0OO instanceof o0000O0O.OooO0O0) {
                    o0000O0O.OooO0O0 oooO0O0 = (o0000O0O.OooO0O0) oooO0OO;
                    this.f8741OoooO0.OooO0OO(oooO0O0.f28744OooO0o0);
                    o000000O sourceLoadStates = oooO0O0.f28744OooO0o0;
                    LoadType loadType = oooO0O0.f28739OooO00o;
                    List<o00O<T>> pages = oooO0O0.f28740OooO0O0;
                    int i2 = oooO0O0.f28741OooO0OO;
                    int i3 = oooO0O0.f28742OooO0Oo;
                    Intrinsics.checkNotNullParameter(loadType, "loadType");
                    Intrinsics.checkNotNullParameter(pages, "pages");
                    Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                    oooO0OO = new o0000O0O.OooO0O0(loadType, pages, i2, i3, sourceLoadStates, o000000o2);
                } else if (oooO0OO instanceof o0000O0O.OooO00o) {
                    this.f8741OoooO0.OooO0O0(((o0000O0O.OooO00o) oooO0OO).f28733OooO00o, o000000.OooO0OO.f28699OooO0OO);
                } else {
                    if (!(oooO0OO instanceof o0000O0O.OooO0OO)) {
                        if (oooO0OO instanceof o0000O0O.OooO0o) {
                            throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    o0000O0O.OooO0OO oooO0OO2 = (o0000O0O.OooO0OO) oooO0OO;
                    this.f8741OoooO0.OooO0OO(oooO0OO2.f28745OooO00o);
                    oooO0OO = new o0000O0O.OooO0OO(oooO0OO2.f28745OooO00o, o000000o2);
                }
                this.f8738Oooo0o = 1;
                if (o00o0oo1.send(oooO0OO, this) == coroutine_suspended) {
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
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¨\u0006\u0005"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "androidx/paging/FlowExtKt$combineWithoutBatching$2$1$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f8743Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f8744Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0OO0<o0000O0O<Object>> f8745Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Flow f8746Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f8747OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00OO00O f8748OoooO00;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$OooO00o */
        public static final class OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o00OO00O f8749Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ int f8750Oooo0oO;

            /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0061OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public /* synthetic */ Object f8751Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public int f8752Oooo0oO;

                public C0061OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f8751Oooo0o = obj;
                    this.f8752Oooo0oO |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(o00OO00O o00oo00o, int i) {
                this.f8749Oooo0o = o00oo00o;
                this.f8750Oooo0oO = i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
                C0061OooO00o c0061OooO00o;
                if (continuation instanceof C0061OooO00o) {
                    c0061OooO00o = (C0061OooO00o) continuation;
                    int i = c0061OooO00o.f8752Oooo0oO;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0061OooO00o.f8752Oooo0oO = i - Integer.MIN_VALUE;
                    } else {
                        c0061OooO00o = new C0061OooO00o(continuation);
                    }
                } else {
                    c0061OooO00o = new C0061OooO00o(continuation);
                }
                Object obj2 = c0061OooO00o.f8751Oooo0o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0061OooO00o.f8752Oooo0oO;
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
                o00OO00O o00oo00o = this.f8749Oooo0o;
                int i3 = this.f8750Oooo0oO;
                c0061OooO00o.f8752Oooo0oO = 1;
                if (o00oo00o.OooO00o(i3, obj, c0061OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c0061OooO00o.f8752Oooo0oO = 2;
                if (YieldKt.yield(c0061OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow flow, AtomicInteger atomicInteger, o00O0OO0 o00o0oo1, o00OO00O o00oo00o, int i, Continuation continuation) {
            super(2, continuation);
            this.f8746Oooo0oo = flow;
            this.f8743Oooo = atomicInteger;
            this.f8748OoooO00 = o00oo00o;
            this.f8747OoooO0 = i;
            this.f8745Oooo0oO = o00o0oo1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.f8746Oooo0oo, this.f8743Oooo, this.f8745Oooo0oO, this.f8748OoooO00, this.f8747OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8744Oooo0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flow = this.f8746Oooo0oo;
                    OooO00o oooO00o = new OooO00o(this.f8748OoooO00, this.f8747OoooO0);
                    this.f8744Oooo0o = 1;
                    if (flow.collect(oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (this.f8743Oooo.decrementAndGet() == 0) {
                    SendChannel.DefaultImpls.close$default(this.f8745Oooo0oO, null, 1, null);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                if (this.f8743Oooo.decrementAndGet() == 0) {
                    SendChannel.DefaultImpls.close$default(this.f8745Oooo0oO, null, 1, null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(Flow flow, Flow flow2, Continuation continuation, o0000Ooo o0000ooo) {
        super(2, continuation);
        this.f8735Oooo0oo = flow;
        this.f8732Oooo = flow2;
        this.f8736OoooO00 = o0000ooo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 = new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.f8735Oooo0oo, this.f8732Oooo, continuation, this.f8736OoooO00);
        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.f8734Oooo0oO = obj;
        return pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00O0OO0<o0000O0O<Object>> o00o0oo1, Continuation<? super Unit> continuation) {
        return ((PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1) create(o00o0oo1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8733Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O0OO0 o00o0oo1 = (o00O0OO0) this.f8734Oooo0oO;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            o00OO00O o00oo00o = new o00OO00O(new AnonymousClass1(o00o0oo1, null, this.f8736OoooO00));
            final CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            Flow[] flowArr = {this.f8735Oooo0oo, this.f8732Oooo};
            int i2 = 0;
            int i3 = 0;
            while (i3 < 2) {
                BuildersKt__Builders_commonKt.launch$default(o00o0oo1, completableJobJob$default, null, new AnonymousClass2(flowArr[i3], atomicInteger, o00o0oo1, o00oo00o, i2, null), 2, null);
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
            this.f8733Oooo0o = 1;
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
