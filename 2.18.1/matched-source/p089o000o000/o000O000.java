package p089o000o000;

import androidx.paging.LoadType;
import androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;
import androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1;
import com.qiniu.android.collect.ReportItem;
import io.agora.rtc.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000<Key, Value> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f28785OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Key f28786OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O00o0<Key, Value> f28787OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O0000 f28788OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Flow<Unit> f28789OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o00O0<Key, Value> f28790OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00O0O0<Key, Value> f28791OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f28792OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f28793OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Channel<o0000O0O<Value>> f28794OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o000O0Oo.OooO00o<Key, Value> f28795OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final CompletableJob f28796OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Flow<o0000O0O<Value>> f28797OooOOO0;

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {614, 180}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
    public static final class OooO extends SuspendLambda implements Function2<FlowCollector<? super o0000O0O<Value>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f28798Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Mutex f28799Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public FlowCollector f28800Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f28801Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O000<Key, Value> f28802OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o000O000<Key, Value> o000o001, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f28802OoooO00 = o000o001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f28802OoooO00, continuation);
            oooO.f28798Oooo = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            o000O0Oo.OooO00o<Key, Value> oooO00o;
            Mutex mutex;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28801Oooo0oo;
            try {
                if (i != 0) {
                    if (i == 1) {
                        flowCollector = this.f28800Oooo0oO;
                        mutex = this.f28799Oooo0o;
                        oooO00o = (o000O0Oo.OooO00o) this.f28798Oooo;
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
                flowCollector = (FlowCollector) this.f28798Oooo;
                oooO00o = this.f28802OoooO00.f28795OooOO0O;
                Mutex mutex2 = oooO00o.f28868OooO00o;
                this.f28798Oooo = oooO00o;
                this.f28799Oooo0o = mutex2;
                this.f28800Oooo0oO = flowCollector;
                this.f28801Oooo0oo = 1;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                o000000O o000000oOooO0Oo = oooO00o.f28869OooO0O0.f28867OooOO0o.OooO0Oo();
                mutex.unlock(null);
                o0000O0O.OooO0OO oooO0OO = new o0000O0O.OooO0OO(o000000oOooO0Oo, null);
                this.f28798Oooo = null;
                this.f28799Oooo0o = null;
                this.f28800Oooo0oO = null;
                this.f28801Oooo0oo = 2;
                if (flowCollector.emit(oooO0OO, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.APPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {614}, m = "currentPagingState", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f28803Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o000O000 f28804Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public o000O0Oo.OooO00o f28805Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Mutex f28806Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f28807OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O000<Key, Value> f28808OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000O000<Key, Value> o000o001, Continuation<? super OooO0O0> continuation) {
            super(continuation);
            this.f28808OoooO00 = o000o001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28803Oooo = obj;
            this.f28807OoooO0 |= Integer.MIN_VALUE;
            return this.f28808OoooO00.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8}, l = {614, 286, 289, 626, 638, 323, 650, 662, 347}, m = "doInitialLoad", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "$this$withLock_u24default$iv$iv", "this", "this", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "this", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "this", ReportItem.QualityKeyResult, "$this$withLock_u24default$iv$iv", "this", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "this", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Mutex f28809Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f28810Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object f28811Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Object f28812Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000O000<Key, Value> f28813OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f28814OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f28815OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000O000<Key, Value> o000o001, Continuation<? super OooO0OO> continuation) {
            super(continuation);
            this.f28813OoooO0 = o000o001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28814OoooO00 = obj;
            this.f28815OoooO0O |= Integer.MIN_VALUE;
            return this.f28813OoooO0.OooO0o(this);
        }
    }

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {614, 169, 626}, m = "invokeSuspend", n = {"$this$cancelableChannelFlow", "it", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
    public static final class OooO0o extends SuspendLambda implements Function2<o00O0OO0<o0000O0O<Value>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f28816Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f28817Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object f28818Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Mutex f28819Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000O000<Key, Value> f28820OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f28821OoooO00;

        @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f28822Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o000O000<Key, Value> f28823Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o00O0OO0<o0000O0O<Value>> f28824Oooo0oo;

            /* JADX INFO: renamed from: o000o000.o000O000$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0308OooO00o<T> implements FlowCollector {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ o00O0OO0<o0000O0O<Value>> f28825Oooo0o;

                /* JADX INFO: renamed from: o000o000.o000O000$OooO0o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", i = {}, l = {96}, m = "emit", n = {}, s = {})
                public static final class C0309OooO00o extends ContinuationImpl {

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public /* synthetic */ Object f28826Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public final /* synthetic */ C0308OooO00o<T> f28827Oooo0oO;

                    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                    public int f28828Oooo0oo;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0309OooO00o(C0308OooO00o<? super T> c0308OooO00o, Continuation<? super C0309OooO00o> continuation) {
                        super(continuation);
                        this.f28827Oooo0oO = c0308OooO00o;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f28826Oooo0o = obj;
                        this.f28828Oooo0oo |= Integer.MIN_VALUE;
                        return this.f28827Oooo0oO.emit(null, this);
                    }
                }

                public C0308OooO00o(o00O0OO0<o0000O0O<Value>> o00o0oo1) {
                    this.f28825Oooo0o = o00o0oo1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
                public final Object emit(@NotNull o0000O0O<Value> o0000o0o2, @NotNull Continuation<? super Unit> continuation) {
                    C0309OooO00o c0309OooO00o;
                    if (continuation instanceof C0309OooO00o) {
                        c0309OooO00o = (C0309OooO00o) continuation;
                        int i = c0309OooO00o.f28828Oooo0oo;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0309OooO00o.f28828Oooo0oo = i - Integer.MIN_VALUE;
                        } else {
                            c0309OooO00o = new C0309OooO00o(this, continuation);
                        }
                    } else {
                        c0309OooO00o = new C0309OooO00o(this, continuation);
                    }
                    Object obj = c0309OooO00o.f28826Oooo0o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = c0309OooO00o.f28828Oooo0oo;
                    try {
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            o00O0OO0<o0000O0O<Value>> o00o0oo1 = this.f28825Oooo0o;
                            c0309OooO00o.f28828Oooo0oo = 1;
                            if (o00o0oo1.send(o0000o0o2, c0309OooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                    } catch (ClosedSendChannelException unused) {
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o000O000<Key, Value> o000o001, o00O0OO0<o0000O0O<Value>> o00o0oo1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f28823Oooo0oO = o000o001;
                this.f28824Oooo0oo = o00o0oo1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f28823Oooo0oO, this.f28824Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f28822Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.f28823Oooo0oO.f28794OooOO0);
                    C0308OooO00o c0308OooO00o = new C0308OooO00o(this.f28824Oooo0oo);
                    this.f28822Oooo0o = 1;
                    if (flowConsumeAsFlow.collect(c0308OooO00o, this) == coroutine_suspended) {
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

        @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f28829Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o000O000<Key, Value> f28830Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Channel<Unit> f28831Oooo0oo;

            public static final class OooO00o<T> implements FlowCollector {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ Channel<Unit> f28832Oooo0o;

                public OooO00o(Channel<Unit> channel) {
                    this.f28832Oooo0o = channel;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    Object objMo2017trySendJP2dKIU = this.f28832Oooo0o.mo2017trySendJP2dKIU((Unit) obj);
                    return objMo2017trySendJP2dKIU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo2017trySendJP2dKIU : Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o000O000<Key, Value> o000o001, Channel<Unit> channel, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f28830Oooo0oO = o000o001;
                this.f28831Oooo0oo = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f28830Oooo0oO, this.f28831Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f28829Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Unit> flow = this.f28830Oooo0oO.f28789OooO0Oo;
                    OooO00o oooO00o = new OooO00o(this.f28831Oooo0oo);
                    this.f28829Oooo0o = 1;
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

        @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o000O000<Key, Value> f28833Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f28834Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f28835Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Channel<Unit> f28836Oooo0oo;

            public static final class OooO00o<T> implements FlowCollector {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ o000O000<Key, Value> f28837Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f28838Oooo0oO;

                /* JADX INFO: renamed from: o000o000.o000O000$OooO0o$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
                public /* synthetic */ class C0310OooO00o {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[LoadType.values().length];
                        iArr[LoadType.REFRESH.ordinal()] = 1;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 13, 14, 15, 15}, l = {614, 627, 126, 639, Constants.ERR_WATERMARK_READ, 651, 664, 126, 676, Constants.ERR_WATERMARK_READ, 688, 701, 126, 713, Constants.ERR_WATERMARK_READ, 725}, m = "emit", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$0", "L$3", "L$4", "L$2", "L$3", "L$4", "L$2", "L$3", "L$2", "L$3", "L$4", "L$2", "L$2", "L$3"})
                public static final class OooO0O0 extends ContinuationImpl {

                    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                    public Object f28839Oooo;

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public Object f28840Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public Object f28841Oooo0oO;

                    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                    public Object f28842Oooo0oo;

                    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
                    public o000O000 f28843OoooO;

                    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
                    public Object f28844OoooO0;

                    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                    public Object f28845OoooO00;

                    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
                    public Object f28846OoooO0O;

                    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
                    public /* synthetic */ Object f28847OoooOO0;

                    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
                    public int f28848OoooOOO;

                    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
                    public final /* synthetic */ OooO00o<T> f28849o000oOoO;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public OooO0O0(OooO00o<? super T> oooO00o, Continuation<? super OooO0O0> continuation) {
                        super(continuation);
                        this.f28849o000oOoO = oooO00o;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f28847OoooOO0 = obj;
                        this.f28848OoooOOO |= Integer.MIN_VALUE;
                        return this.f28849o000oOoO.emit(null, this);
                    }
                }

                public OooO00o(o000O000<Key, Value> o000o001, CoroutineScope coroutineScope) {
                    this.f28837Oooo0o = o000o001;
                    this.f28838Oooo0oO = coroutineScope;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0345  */
                /* JADX WARN: Code duplicated, block: B:103:0x0353  */
                /* JADX WARN: Code duplicated, block: B:104:0x0357  */
                /* JADX WARN: Code duplicated, block: B:106:0x0375 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:107:0x0376  */
                /* JADX WARN: Code duplicated, block: B:112:0x03a3 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:113:0x03a4  */
                /* JADX WARN: Code duplicated, block: B:116:0x03ac  */
                /* JADX WARN: Code duplicated, block: B:118:0x03c4 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:122:0x03d6  */
                /* JADX WARN: Code duplicated, block: B:130:0x03e8 A[PHI: r1 r4 r15
                  0x03e8: PHI (r1v51 o000o000.o000000O) = (r1v27 o000o000.o000000O), (r1v58 o000o000.o000000O) binds: [B:84:0x02f5, B:126:0x03df] A[DONT_GENERATE, DONT_INLINE]
                  0x03e8: PHI (r4v53 kotlinx.coroutines.CoroutineScope) = (r4v27 kotlinx.coroutines.CoroutineScope), (r4v56 kotlinx.coroutines.CoroutineScope) binds: [B:84:0x02f5, B:126:0x03df] A[DONT_GENERATE, DONT_INLINE]
                  0x03e8: PHI (r15v50 o000o000.o000O000<Key, Value>) = (r15v27 o000o000.o000O000<Key, Value>), (r15v51 o000o000.o000O000<Key, Value>) binds: [B:84:0x02f5, B:126:0x03df] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:132:0x03f0  */
                /* JADX WARN: Code duplicated, block: B:134:0x03f4  */
                /* JADX WARN: Code duplicated, block: B:136:0x040c A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:137:0x040d  */
                /* JADX WARN: Code duplicated, block: B:140:0x0427 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:141:0x0428  */
                /* JADX WARN: Code duplicated, block: B:147:0x0438  */
                /* JADX WARN: Code duplicated, block: B:150:0x0445  */
                /* JADX WARN: Code duplicated, block: B:151:0x0449  */
                /* JADX WARN: Code duplicated, block: B:153:0x0465 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:154:0x0466  */
                /* JADX WARN: Code duplicated, block: B:159:0x0493 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:160:0x0494  */
                /* JADX WARN: Code duplicated, block: B:163:0x0499  */
                /* JADX WARN: Code duplicated, block: B:165:0x04af A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:166:0x04b0  */
                /* JADX WARN: Code duplicated, block: B:170:0x04c4  */
                /* JADX WARN: Code duplicated, block: B:50:0x023e  */
                /* JADX WARN: Code duplicated, block: B:53:0x024f  */
                /* JADX WARN: Code duplicated, block: B:56:0x025d  */
                /* JADX WARN: Code duplicated, block: B:57:0x0261  */
                /* JADX WARN: Code duplicated, block: B:59:0x027e A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:60:0x027f  */
                /* JADX WARN: Code duplicated, block: B:65:0x02ab A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:66:0x02ac  */
                /* JADX WARN: Code duplicated, block: B:69:0x02b4  */
                /* JADX WARN: Code duplicated, block: B:71:0x02cb A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:75:0x02dd  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code duplicated, block: B:83:0x02ef A[PHI: r1 r4 r15
                  0x02ef: PHI (r1v27 o000o000.o000000O) = (r1v7 o000o000.o000000O), (r1v30 o000o000.o000000O) binds: [B:52:0x024d, B:79:0x02e6] A[DONT_GENERATE, DONT_INLINE]
                  0x02ef: PHI (r4v27 kotlinx.coroutines.CoroutineScope) = (r4v7 kotlinx.coroutines.CoroutineScope), (r4v30 kotlinx.coroutines.CoroutineScope) binds: [B:52:0x024d, B:79:0x02e6] A[DONT_GENERATE, DONT_INLINE]
                  0x02ef: PHI (r15v27 o000o000.o000O000<Key, Value>) = (r15v8 o000o000.o000O000<Key, Value>), (r15v28 o000o000.o000O000<Key, Value>) binds: [B:52:0x024d, B:79:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:85:0x02f7  */
                /* JADX WARN: Code duplicated, block: B:87:0x02fb  */
                /* JADX WARN: Code duplicated, block: B:89:0x0314 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:90:0x0315  */
                /* JADX WARN: Code duplicated, block: B:93:0x0333 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:94:0x0334  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v21, types: [java.util.LinkedHashMap, java.util.Map<androidx.paging.LoadType, o000o000.o00OO0O0>] */
                /* JADX WARN: Type inference failed for: r15v44, types: [java.util.LinkedHashMap, java.util.Map<androidx.paging.LoadType, o000o000.o00OO0O0>] */
                /* JADX WARN: Type inference failed for: r15v66, types: [java.util.LinkedHashMap, java.util.Map<androidx.paging.LoadType, o000o000.o00OO0O0>] */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
                /* JADX WARN: Type inference failed for: r1v14, types: [kotlinx.coroutines.sync.Mutex] */
                /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
                /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.sync.Mutex] */
                /* JADX WARN: Type inference failed for: r1v38, types: [kotlinx.coroutines.sync.Mutex] */
                /* JADX WARN: Type inference failed for: r1v66, types: [kotlinx.coroutines.sync.Mutex] */
                /* JADX WARN: Type inference failed for: r1v84 */
                /* JADX WARN: Type inference failed for: r1v85 */
                /* JADX WARN: Type inference failed for: r1v87 */
                /* JADX WARN: Type inference failed for: r1v88 */
                /* JADX WARN: Type inference failed for: r1v90 */
                /* JADX WARN: Type inference failed for: r1v91 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
                public final Object emit(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
                    OooO0O0 oooO0O0;
                    o000O000<Key, Value> o000o001;
                    o000O0Oo.OooO00o<Key, Value> oooO00o;
                    Mutex mutex;
                    OooO00o<T> oooO00o2;
                    o000000O o000000o2;
                    o00O0<Key, Value> o00o1;
                    o00O0O0<Key, Value> o00o0o0;
                    o000O000<Key, Value> o000o002;
                    CoroutineScope coroutineScope;
                    LoadType loadType;
                    o000000O o000000o3;
                    CoroutineScope coroutineScope2;
                    LoadType loadType2;
                    o000O000<Key, Value> o000o003;
                    CoroutineScope coroutineScope3;
                    o000O000<Key, Value> o000o004;
                    o000000O o000000o4;
                    o000O0Oo.OooO00o<Key, Value> oooO00o3;
                    Mutex mutex2;
                    o000O000<Key, Value> o000o005;
                    LoadType loadType3;
                    o000O000<Key, Value> o000o006;
                    o00OO0O0 o00oo0o1;
                    LoadType loadType4;
                    o000O000<Key, Value> o000o007;
                    LoadType loadType5;
                    CoroutineScope coroutineScope4;
                    o000000O o000000o5;
                    o000O0Oo.OooO00o<Key, Value> oooO00o4;
                    Mutex mutex3;
                    LoadType loadType6;
                    o000000O o000000o6;
                    CoroutineScope coroutineScope5;
                    LoadType loadType7;
                    o000O000<Key, Value> o000o008;
                    o000O0Oo.OooO00o<Key, Value> oooO00o5;
                    Mutex mutex4;
                    o000000O o000000o7;
                    Mutex mutex5;
                    CoroutineScope coroutineScope6;
                    o000O0Oo.OooO00o<Key, Value> oooO00o6;
                    o000000 o000000VarOooO00o;
                    o000O0Oo<Key, Value> o000o0oo2;
                    CoroutineScope coroutineScope7;
                    o000O000<Key, Value> o000o009;
                    o000O0Oo.OooO00o<Key, Value> oooO00o7;
                    Mutex mutex6;
                    o000O000<Key, Value> o000o0010;
                    LoadType loadType8;
                    o000O000<Key, Value> o000o0011;
                    o00OO0O0 o00oo0o2;
                    LoadType loadType9;
                    o000O000<Key, Value> o000o0012;
                    LoadType loadType10;
                    CoroutineScope coroutineScope8;
                    o000000O o000000o8;
                    o000O0Oo.OooO00o<Key, Value> oooO00o8;
                    Mutex mutex7;
                    LoadType loadType11;
                    o000O000<Key, Value> o000o0013;
                    CoroutineScope coroutineScope9;
                    LoadType loadType12;
                    o000O0Oo.OooO00o<Key, Value> oooO00o9;
                    Mutex mutex8;
                    o000O0Oo.OooO00o<Key, Value> oooO00o10;
                    Mutex mutex9;
                    CoroutineScope coroutineScope10;
                    o000000 o000000VarOooO00o2;
                    o000O0Oo<Key, Value> o000o0oo3;
                    CoroutineScope coroutineScope11;
                    o000O000<Key, Value> o000o0014;
                    o000O0Oo.OooO00o<Key, Value> oooO00o11;
                    Mutex mutex10;
                    o000O000<Key, Value> o000o0015;
                    LoadType loadType13;
                    LoadType loadType14;
                    Mutex mutex11;
                    o000O000<Key, Value> o000o0016;
                    o00OO0O0 o00oo0o3;
                    LoadType loadType15;
                    CoroutineScope coroutineScope12;
                    o000O0Oo.OooO00o<Key, Value> oooO00o12;
                    Mutex mutex12;
                    o000O000<Key, Value> o000o0017;
                    Mutex mutex13;
                    o000O0Oo.OooO00o<Key, Value> oooO00o13;
                    o000000 o000000VarOooO00o3;
                    if (continuation instanceof OooO0O0) {
                        oooO0O0 = (OooO0O0) continuation;
                        int i = oooO0O0.f28848OoooOOO;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            oooO0O0.f28848OoooOOO = i - Integer.MIN_VALUE;
                        } else {
                            oooO0O0 = new OooO0O0(this, continuation);
                        }
                    } else {
                        oooO0O0 = new OooO0O0(this, continuation);
                    }
                    Object obj = oooO0O0.f28847OoooOO0;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ?? r1 = oooO0O0.f28848OoooOOO;
                    try {
                        try {
                            try {
                                switch (r1) {
                                    case 0:
                                        ResultKt.throwOnFailure(obj);
                                        o000o001 = this.f28837Oooo0o;
                                        oooO00o = o000o001.f28795OooOO0O;
                                        mutex = oooO00o.f28868OooO00o;
                                        oooO0O0.f28840Oooo0o = this;
                                        oooO0O0.f28841Oooo0oO = oooO00o;
                                        oooO0O0.f28842Oooo0oo = o000o001;
                                        oooO0O0.f28839Oooo = mutex;
                                        oooO0O0.f28848OoooOOO = 1;
                                        if (mutex.lock(null, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooO00o2 = this;
                                        try {
                                            o000O0Oo<Key, Value> o000o0oo4 = oooO00o.f28869OooO0O0;
                                            Pair pair = TuplesKt.to(o000o0oo4.f28867OooOO0o.OooO0Oo(), o000o0oo4.OooO00o(o000o001.f28793OooO0oo.f29070OooO00o.f29075OooO0OO));
                                            mutex.unlock(null);
                                            o000000o2 = (o000000O) pair.component1();
                                            o00o1 = (o00O0) pair.component2();
                                            o00o0o0 = oooO00o2.f28837Oooo0o.f28791OooO0o0;
                                            if (o00o0o0 != null) {
                                                o00o0o0.OooO00o(o00o1);
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            o000o002 = oooO00o2.f28837Oooo0o;
                                            coroutineScope = oooO00o2.f28838Oooo0oO;
                                            loadType = LoadType.REFRESH;
                                            if (o000000o2.f28702OooO00o instanceof o000000.OooO00o) {
                                                loadType6 = LoadType.PREPEND;
                                                if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                                    if (loadType6 != LoadType.REFRESH) {
                                                        oooO00o5 = o000o002.f28795OooOO0O;
                                                        mutex4 = oooO00o5.f28868OooO00o;
                                                        oooO0O0.f28840Oooo0o = o000000o2;
                                                        oooO0O0.f28841Oooo0oO = o000o002;
                                                        oooO0O0.f28842Oooo0oo = coroutineScope;
                                                        oooO0O0.f28839Oooo = loadType6;
                                                        oooO0O0.f28845OoooO00 = oooO00o5;
                                                        oooO0O0.f28844OoooO0 = mutex4;
                                                        oooO0O0.f28848OoooOOO = 7;
                                                        if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        o000000o7 = o000000o2;
                                                        mutex5 = mutex4;
                                                        coroutineScope6 = coroutineScope;
                                                        oooO00o6 = oooO00o5;
                                                        o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                        oooO0O0.f28840Oooo0o = o000000o7;
                                                        oooO0O0.f28841Oooo0oO = o000o002;
                                                        oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                        oooO0O0.f28839Oooo = loadType6;
                                                        oooO0O0.f28845OoooO00 = mutex5;
                                                        oooO0O0.f28844OoooO0 = null;
                                                        oooO0O0.f28848OoooOOO = 8;
                                                        if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        loadType7 = loadType6;
                                                        coroutineScope7 = coroutineScope6;
                                                        o000o009 = o000o002;
                                                        r1 = mutex5;
                                                        Unit unit3 = Unit.INSTANCE;
                                                        r1.unlock(null);
                                                        coroutineScope5 = coroutineScope7;
                                                        o000o008 = o000o009;
                                                        o000000o6 = o000000o7;
                                                    } else {
                                                        o000000o6 = o000000o2;
                                                        coroutineScope5 = coroutineScope;
                                                        loadType7 = loadType6;
                                                        o000o008 = o000o002;
                                                    }
                                                    if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                        o000o0011 = o000o008;
                                                        o00oo0o2 = null;
                                                        loadType9 = loadType7;
                                                    } else {
                                                        oooO00o7 = o000o008.f28795OooOO0O;
                                                        mutex6 = oooO00o7.f28868OooO00o;
                                                        oooO0O0.f28840Oooo0o = o000000o6;
                                                        oooO0O0.f28841Oooo0oO = o000o008;
                                                        oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                        oooO0O0.f28839Oooo = loadType7;
                                                        oooO0O0.f28845OoooO00 = oooO00o7;
                                                        oooO0O0.f28844OoooO0 = mutex6;
                                                        oooO0O0.f28846OoooO0O = loadType7;
                                                        oooO0O0.f28843OoooO = o000o008;
                                                        oooO0O0.f28848OoooOOO = 9;
                                                        if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        o000o0010 = o000o008;
                                                        loadType8 = loadType7;
                                                        o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                        mutex6.unlock(null);
                                                        o000o0011 = o000o008;
                                                        loadType9 = loadType7;
                                                        loadType7 = loadType8;
                                                        o000o008 = o000o0010;
                                                    }
                                                    oooO0O0.f28840Oooo0o = o000000o6;
                                                    oooO0O0.f28841Oooo0oO = o000o008;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                    oooO0O0.f28839Oooo = loadType7;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28844OoooO0 = null;
                                                    oooO0O0.f28846OoooO0O = null;
                                                    oooO0O0.f28843OoooO = null;
                                                    oooO0O0.f28848OoooOOO = 10;
                                                    if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0012 = o000o008;
                                                    loadType10 = loadType7;
                                                    coroutineScope8 = coroutineScope5;
                                                    o000000o8 = o000000o6;
                                                    if (loadType10 == LoadType.REFRESH) {
                                                        oooO00o8 = o000o0012.f28795OooOO0O;
                                                        mutex7 = oooO00o8.f28868OooO00o;
                                                        oooO0O0.f28840Oooo0o = o000000o8;
                                                        oooO0O0.f28841Oooo0oO = o000o0012;
                                                        oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                        oooO0O0.f28839Oooo = oooO00o8;
                                                        oooO0O0.f28845OoooO00 = mutex7;
                                                        oooO0O0.f28848OoooOOO = 11;
                                                        if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                        mutex7.unlock(null);
                                                        if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                            o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                        }
                                                    }
                                                    coroutineScope = coroutineScope8;
                                                    o000o002 = o000o0012;
                                                    o000000o2 = o000000o8;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            o000000o3 = o000000o2;
                                            coroutineScope2 = coroutineScope;
                                            loadType2 = loadType;
                                            o000o003 = o000o002;
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                                o000o006 = o000o003;
                                                o00oo0o1 = null;
                                                loadType4 = loadType2;
                                            } else {
                                                oooO00o3 = o000o003.f28795OooOO0O;
                                                mutex2 = oooO00o3.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o3;
                                                oooO0O0.f28841Oooo0oO = o000o003;
                                                oooO0O0.f28842Oooo0oo = coroutineScope2;
                                                oooO0O0.f28839Oooo = loadType2;
                                                oooO0O0.f28845OoooO00 = oooO00o3;
                                                oooO0O0.f28844OoooO0 = mutex2;
                                                oooO0O0.f28846OoooO0O = loadType2;
                                                oooO0O0.f28843OoooO = o000o003;
                                                oooO0O0.f28848OoooOOO = 4;
                                                if (mutex2.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o005 = o000o003;
                                                loadType3 = loadType2;
                                                try {
                                                    o00oo0o1 = (o00OO0O0) oooO00o3.f28869OooO0O0.f28866OooOO0O.get(loadType3);
                                                    mutex2.unlock(null);
                                                    o000o006 = o000o003;
                                                    loadType4 = loadType2;
                                                    loadType2 = loadType3;
                                                    o000o003 = o000o005;
                                                } catch (Throwable th) {
                                                    mutex2.unlock(null);
                                                    throw th;
                                                }
                                            }
                                            oooO0O0.f28840Oooo0o = o000000o3;
                                            oooO0O0.f28841Oooo0oO = o000o003;
                                            oooO0O0.f28842Oooo0oo = coroutineScope2;
                                            oooO0O0.f28839Oooo = loadType2;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28843OoooO = null;
                                            oooO0O0.f28848OoooOOO = 5;
                                            if (o000O000.OooO0OO(o000o006, loadType4, o00oo0o1, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o007 = o000o003;
                                            loadType5 = loadType2;
                                            coroutineScope4 = coroutineScope2;
                                            o000000o5 = o000000o3;
                                            if (loadType5 == LoadType.REFRESH) {
                                                oooO00o4 = o000o007.f28795OooOO0O;
                                                mutex3 = oooO00o4.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o5;
                                                oooO0O0.f28841Oooo0oO = o000o007;
                                                oooO0O0.f28842Oooo0oo = coroutineScope4;
                                                oooO0O0.f28839Oooo = oooO00o4;
                                                oooO0O0.f28845OoooO00 = mutex3;
                                                oooO0O0.f28848OoooOOO = 6;
                                                if (mutex3.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                try {
                                                    o000000VarOooO00o = oooO00o4.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex3.unlock(null);
                                                    if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o007, coroutineScope4);
                                                    }
                                                } catch (Throwable th2) {
                                                    mutex3.unlock(null);
                                                    throw th2;
                                                }
                                            }
                                            coroutineScope = coroutineScope4;
                                            o000o002 = o000o007;
                                            o000000o2 = o000000o5;
                                            loadType6 = LoadType.PREPEND;
                                            if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                                if (loadType6 != LoadType.REFRESH) {
                                                    oooO00o5 = o000o002.f28795OooOO0O;
                                                    mutex4 = oooO00o5.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000000o2;
                                                    oooO0O0.f28841Oooo0oO = o000o002;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope;
                                                    oooO0O0.f28839Oooo = loadType6;
                                                    oooO0O0.f28845OoooO00 = oooO00o5;
                                                    oooO0O0.f28844OoooO0 = mutex4;
                                                    oooO0O0.f28848OoooOOO = 7;
                                                    if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000000o7 = o000000o2;
                                                    mutex5 = mutex4;
                                                    coroutineScope6 = coroutineScope;
                                                    oooO00o6 = oooO00o5;
                                                    o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000000o7;
                                                    oooO0O0.f28841Oooo0oO = o000o002;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                    oooO0O0.f28839Oooo = loadType6;
                                                    oooO0O0.f28845OoooO00 = mutex5;
                                                    oooO0O0.f28844OoooO0 = null;
                                                    oooO0O0.f28848OoooOOO = 8;
                                                    if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType7 = loadType6;
                                                    coroutineScope7 = coroutineScope6;
                                                    o000o009 = o000o002;
                                                    r1 = mutex5;
                                                    Unit unit4 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope5 = coroutineScope7;
                                                    o000o008 = o000o009;
                                                    o000000o6 = o000000o7;
                                                } else {
                                                    o000000o6 = o000000o2;
                                                    coroutineScope5 = coroutineScope;
                                                    loadType7 = loadType6;
                                                    o000o008 = o000o002;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                    o000o0011 = o000o008;
                                                    o00oo0o2 = null;
                                                    loadType9 = loadType7;
                                                } else {
                                                    oooO00o7 = o000o008.f28795OooOO0O;
                                                    mutex6 = oooO00o7.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000000o6;
                                                    oooO0O0.f28841Oooo0oO = o000o008;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                    oooO0O0.f28839Oooo = loadType7;
                                                    oooO0O0.f28845OoooO00 = oooO00o7;
                                                    oooO0O0.f28844OoooO0 = mutex6;
                                                    oooO0O0.f28846OoooO0O = loadType7;
                                                    oooO0O0.f28843OoooO = o000o008;
                                                    oooO0O0.f28848OoooOOO = 9;
                                                    if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0010 = o000o008;
                                                    loadType8 = loadType7;
                                                    try {
                                                        o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                        mutex6.unlock(null);
                                                        o000o0011 = o000o008;
                                                        loadType9 = loadType7;
                                                        loadType7 = loadType8;
                                                        o000o008 = o000o0010;
                                                    } catch (Throwable th3) {
                                                        mutex6.unlock(null);
                                                        throw th3;
                                                    }
                                                }
                                                oooO0O0.f28840Oooo0o = o000000o6;
                                                oooO0O0.f28841Oooo0oO = o000o008;
                                                oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                oooO0O0.f28839Oooo = loadType7;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28843OoooO = null;
                                                oooO0O0.f28848OoooOOO = 10;
                                                if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0012 = o000o008;
                                                loadType10 = loadType7;
                                                coroutineScope8 = coroutineScope5;
                                                o000000o8 = o000000o6;
                                                if (loadType10 == LoadType.REFRESH) {
                                                    oooO00o8 = o000o0012.f28795OooOO0O;
                                                    mutex7 = oooO00o8.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000000o8;
                                                    oooO0O0.f28841Oooo0oO = o000o0012;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                    oooO0O0.f28839Oooo = oooO00o8;
                                                    oooO0O0.f28845OoooO00 = mutex7;
                                                    oooO0O0.f28848OoooOOO = 11;
                                                    if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    try {
                                                        o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                        mutex7.unlock(null);
                                                        if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                            o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                        }
                                                    } catch (Throwable th4) {
                                                        mutex7.unlock(null);
                                                        throw th4;
                                                    }
                                                }
                                                coroutineScope = coroutineScope8;
                                                o000o002 = o000o0012;
                                                o000000o2 = o000000o8;
                                            }
                                            return Unit.INSTANCE;
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope13 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope13;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit5 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    try {
                                                        o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                        mutex11.unlock(null);
                                                        loadType15 = loadType13;
                                                        loadType12 = loadType14;
                                                        o000o0016 = o000o0013;
                                                        o000o0013 = o000o0015;
                                                    } catch (Throwable th5) {
                                                        mutex11.unlock(null);
                                                        throw th5;
                                                    }
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    try {
                                                        o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                        mutex13.unlock(null);
                                                        if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                            o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                        }
                                                    } catch (Throwable th6) {
                                                        mutex13.unlock(null);
                                                        throw th6;
                                                    }
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th7) {
                                            mutex.unlock(null);
                                            throw th7;
                                        }
                                    case 1:
                                        mutex = (Mutex) oooO0O0.f28839Oooo;
                                        o000o001 = (o000O000) oooO0O0.f28842Oooo0oo;
                                        oooO00o = (o000O0Oo.OooO00o) oooO0O0.f28841Oooo0oO;
                                        oooO00o2 = (OooO00o) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000O0Oo<Key, Value> o000o0oo5 = oooO00o.f28869OooO0O0;
                                        Pair pair2 = TuplesKt.to(o000o0oo5.f28867OooOO0o.OooO0Oo(), o000o0oo5.OooO00o(o000o001.f28793OooO0oo.f29070OooO00o.f29075OooO0OO));
                                        mutex.unlock(null);
                                        o000000o2 = (o000000O) pair2.component1();
                                        o00o1 = (o00O0) pair2.component2();
                                        o00o0o0 = oooO00o2.f28837Oooo0o.f28791OooO0o0;
                                        if (o00o0o0 != null) {
                                            o00o0o0.OooO00o(o00o1);
                                            Unit unit6 = Unit.INSTANCE;
                                        }
                                        o000o002 = oooO00o2.f28837Oooo0o;
                                        coroutineScope = oooO00o2.f28838Oooo0oO;
                                        loadType = LoadType.REFRESH;
                                        if (o000000o2.f28702OooO00o instanceof o000000.OooO00o) {
                                            loadType6 = LoadType.PREPEND;
                                            if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                                if (loadType6 != LoadType.REFRESH) {
                                                    oooO00o5 = o000o002.f28795OooOO0O;
                                                    mutex4 = oooO00o5.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000000o2;
                                                    oooO0O0.f28841Oooo0oO = o000o002;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope;
                                                    oooO0O0.f28839Oooo = loadType6;
                                                    oooO0O0.f28845OoooO00 = oooO00o5;
                                                    oooO0O0.f28844OoooO0 = mutex4;
                                                    oooO0O0.f28848OoooOOO = 7;
                                                    if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000000o7 = o000000o2;
                                                    mutex5 = mutex4;
                                                    coroutineScope6 = coroutineScope;
                                                    oooO00o6 = oooO00o5;
                                                    o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000000o7;
                                                    oooO0O0.f28841Oooo0oO = o000o002;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                    oooO0O0.f28839Oooo = loadType6;
                                                    oooO0O0.f28845OoooO00 = mutex5;
                                                    oooO0O0.f28844OoooO0 = null;
                                                    oooO0O0.f28848OoooOOO = 8;
                                                    if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType7 = loadType6;
                                                    coroutineScope7 = coroutineScope6;
                                                    o000o009 = o000o002;
                                                    r1 = mutex5;
                                                    Unit unit7 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope5 = coroutineScope7;
                                                    o000o008 = o000o009;
                                                    o000000o6 = o000000o7;
                                                } else {
                                                    o000000o6 = o000000o2;
                                                    coroutineScope5 = coroutineScope;
                                                    loadType7 = loadType6;
                                                    o000o008 = o000o002;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                    o000o0011 = o000o008;
                                                    o00oo0o2 = null;
                                                    loadType9 = loadType7;
                                                } else {
                                                    oooO00o7 = o000o008.f28795OooOO0O;
                                                    mutex6 = oooO00o7.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000000o6;
                                                    oooO0O0.f28841Oooo0oO = o000o008;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                    oooO0O0.f28839Oooo = loadType7;
                                                    oooO0O0.f28845OoooO00 = oooO00o7;
                                                    oooO0O0.f28844OoooO0 = mutex6;
                                                    oooO0O0.f28846OoooO0O = loadType7;
                                                    oooO0O0.f28843OoooO = o000o008;
                                                    oooO0O0.f28848OoooOOO = 9;
                                                    if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0010 = o000o008;
                                                    loadType8 = loadType7;
                                                    o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                    mutex6.unlock(null);
                                                    o000o0011 = o000o008;
                                                    loadType9 = loadType7;
                                                    loadType7 = loadType8;
                                                    o000o008 = o000o0010;
                                                }
                                                oooO0O0.f28840Oooo0o = o000000o6;
                                                oooO0O0.f28841Oooo0oO = o000o008;
                                                oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                oooO0O0.f28839Oooo = loadType7;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28843OoooO = null;
                                                oooO0O0.f28848OoooOOO = 10;
                                                if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0012 = o000o008;
                                                loadType10 = loadType7;
                                                coroutineScope8 = coroutineScope5;
                                                o000000o8 = o000000o6;
                                                if (loadType10 == LoadType.REFRESH) {
                                                    oooO00o8 = o000o0012.f28795OooOO0O;
                                                    mutex7 = oooO00o8.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000000o8;
                                                    oooO0O0.f28841Oooo0oO = o000o0012;
                                                    oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                    oooO0O0.f28839Oooo = oooO00o8;
                                                    oooO0O0.f28845OoooO00 = mutex7;
                                                    oooO0O0.f28848OoooOOO = 11;
                                                    if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex7.unlock(null);
                                                    if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                    }
                                                }
                                                coroutineScope = coroutineScope8;
                                                o000o002 = o000o0012;
                                                o000000o2 = o000000o8;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        o000000o3 = o000000o2;
                                        coroutineScope2 = coroutineScope;
                                        loadType2 = loadType;
                                        o000o003 = o000o002;
                                        if (C0310OooO00o.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                            o000o006 = o000o003;
                                            o00oo0o1 = null;
                                            loadType4 = loadType2;
                                        } else {
                                            oooO00o3 = o000o003.f28795OooOO0O;
                                            mutex2 = oooO00o3.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o3;
                                            oooO0O0.f28841Oooo0oO = o000o003;
                                            oooO0O0.f28842Oooo0oo = coroutineScope2;
                                            oooO0O0.f28839Oooo = loadType2;
                                            oooO0O0.f28845OoooO00 = oooO00o3;
                                            oooO0O0.f28844OoooO0 = mutex2;
                                            oooO0O0.f28846OoooO0O = loadType2;
                                            oooO0O0.f28843OoooO = o000o003;
                                            oooO0O0.f28848OoooOOO = 4;
                                            if (mutex2.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o005 = o000o003;
                                            loadType3 = loadType2;
                                            o00oo0o1 = (o00OO0O0) oooO00o3.f28869OooO0O0.f28866OooOO0O.get(loadType3);
                                            mutex2.unlock(null);
                                            o000o006 = o000o003;
                                            loadType4 = loadType2;
                                            loadType2 = loadType3;
                                            o000o003 = o000o005;
                                        }
                                        oooO0O0.f28840Oooo0o = o000000o3;
                                        oooO0O0.f28841Oooo0oO = o000o003;
                                        oooO0O0.f28842Oooo0oo = coroutineScope2;
                                        oooO0O0.f28839Oooo = loadType2;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28843OoooO = null;
                                        oooO0O0.f28848OoooOOO = 5;
                                        if (o000O000.OooO0OO(o000o006, loadType4, o00oo0o1, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000o007 = o000o003;
                                        loadType5 = loadType2;
                                        coroutineScope4 = coroutineScope2;
                                        o000000o5 = o000000o3;
                                        if (loadType5 == LoadType.REFRESH) {
                                            oooO00o4 = o000o007.f28795OooOO0O;
                                            mutex3 = oooO00o4.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o5;
                                            oooO0O0.f28841Oooo0oO = o000o007;
                                            oooO0O0.f28842Oooo0oo = coroutineScope4;
                                            oooO0O0.f28839Oooo = oooO00o4;
                                            oooO0O0.f28845OoooO00 = mutex3;
                                            oooO0O0.f28848OoooOOO = 6;
                                            if (mutex3.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o = oooO00o4.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex3.unlock(null);
                                            if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o007, coroutineScope4);
                                            }
                                        }
                                        coroutineScope = coroutineScope4;
                                        o000o002 = o000o007;
                                        o000000o2 = o000000o5;
                                        loadType6 = LoadType.PREPEND;
                                        if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                            if (loadType6 != LoadType.REFRESH) {
                                                oooO00o5 = o000o002.f28795OooOO0O;
                                                mutex4 = oooO00o5.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o2;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = oooO00o5;
                                                oooO0O0.f28844OoooO0 = mutex4;
                                                oooO0O0.f28848OoooOOO = 7;
                                                if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000o7 = o000000o2;
                                                mutex5 = mutex4;
                                                coroutineScope6 = coroutineScope;
                                                oooO00o6 = oooO00o5;
                                                o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000000o7;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = mutex5;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28848OoooOOO = 8;
                                                if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType7 = loadType6;
                                                coroutineScope7 = coroutineScope6;
                                                o000o009 = o000o002;
                                                r1 = mutex5;
                                                Unit unit8 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope5 = coroutineScope7;
                                                o000o008 = o000o009;
                                                o000000o6 = o000000o7;
                                            } else {
                                                o000000o6 = o000000o2;
                                                coroutineScope5 = coroutineScope;
                                                loadType7 = loadType6;
                                                o000o008 = o000o002;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                o000o0011 = o000o008;
                                                o00oo0o2 = null;
                                                loadType9 = loadType7;
                                            } else {
                                                oooO00o7 = o000o008.f28795OooOO0O;
                                                mutex6 = oooO00o7.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o6;
                                                oooO0O0.f28841Oooo0oO = o000o008;
                                                oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                oooO0O0.f28839Oooo = loadType7;
                                                oooO0O0.f28845OoooO00 = oooO00o7;
                                                oooO0O0.f28844OoooO0 = mutex6;
                                                oooO0O0.f28846OoooO0O = loadType7;
                                                oooO0O0.f28843OoooO = o000o008;
                                                oooO0O0.f28848OoooOOO = 9;
                                                if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0010 = o000o008;
                                                loadType8 = loadType7;
                                                o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                mutex6.unlock(null);
                                                o000o0011 = o000o008;
                                                loadType9 = loadType7;
                                                loadType7 = loadType8;
                                                o000o008 = o000o0010;
                                            }
                                            oooO0O0.f28840Oooo0o = o000000o6;
                                            oooO0O0.f28841Oooo0oO = o000o008;
                                            oooO0O0.f28842Oooo0oo = coroutineScope5;
                                            oooO0O0.f28839Oooo = loadType7;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28843OoooO = null;
                                            oooO0O0.f28848OoooOOO = 10;
                                            if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0012 = o000o008;
                                            loadType10 = loadType7;
                                            coroutineScope8 = coroutineScope5;
                                            o000000o8 = o000000o6;
                                            if (loadType10 == LoadType.REFRESH) {
                                                oooO00o8 = o000o0012.f28795OooOO0O;
                                                mutex7 = oooO00o8.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o8;
                                                oooO0O0.f28841Oooo0oO = o000o0012;
                                                oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                oooO0O0.f28839Oooo = oooO00o8;
                                                oooO0O0.f28845OoooO00 = mutex7;
                                                oooO0O0.f28848OoooOOO = 11;
                                                if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                }
                                            }
                                            coroutineScope = coroutineScope8;
                                            o000o002 = o000o0012;
                                            o000000o2 = o000000o8;
                                        }
                                        return Unit.INSTANCE;
                                        loadType11 = LoadType.APPEND;
                                        if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o9 = o000o002.f28795OooOO0O;
                                                mutex8 = oooO00o9.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = oooO00o9;
                                                oooO0O0.f28845OoooO00 = mutex8;
                                                oooO0O0.f28848OoooOOO = 12;
                                                if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope14 = coroutineScope;
                                                oooO00o10 = oooO00o9;
                                                mutex9 = mutex8;
                                                coroutineScope10 = coroutineScope14;
                                                o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = mutex9;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28848OoooOOO = 13;
                                                if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                coroutineScope11 = coroutineScope10;
                                                o000o0014 = o000o002;
                                                r1 = mutex9;
                                                Unit unit9 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope9 = coroutineScope11;
                                                o000o0013 = o000o0014;
                                            } else {
                                                o000o0013 = o000o002;
                                                coroutineScope9 = coroutineScope;
                                                loadType12 = loadType11;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                o000o0016 = o000o0013;
                                                o00oo0o3 = null;
                                                loadType15 = loadType12;
                                            } else {
                                                oooO00o11 = o000o0013.f28795OooOO0O;
                                                mutex10 = oooO00o11.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = oooO00o11;
                                                oooO0O0.f28845OoooO00 = mutex10;
                                                oooO0O0.f28844OoooO0 = loadType12;
                                                oooO0O0.f28846OoooO0O = o000o0013;
                                                oooO0O0.f28848OoooOOO = 14;
                                                if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0015 = o000o0013;
                                                loadType13 = loadType12;
                                                loadType14 = loadType13;
                                                mutex11 = mutex10;
                                                o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                mutex11.unlock(null);
                                                loadType15 = loadType13;
                                                loadType12 = loadType14;
                                                o000o0016 = o000o0013;
                                                o000o0013 = o000o0015;
                                            }
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope9;
                                            oooO0O0.f28842Oooo0oo = loadType12;
                                            oooO0O0.f28839Oooo = null;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28848OoooOOO = 15;
                                            if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            coroutineScope12 = coroutineScope9;
                                            if (loadType12 == LoadType.REFRESH) {
                                                oooO00o12 = o000o0013.f28795OooOO0O;
                                                mutex12 = oooO00o12.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                oooO0O0.f28842Oooo0oo = oooO00o12;
                                                oooO0O0.f28839Oooo = mutex12;
                                                oooO0O0.f28848OoooOOO = 16;
                                                if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0017 = o000o0013;
                                                mutex13 = mutex12;
                                                oooO00o13 = oooO00o12;
                                                o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex13.unlock(null);
                                                if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 2:
                                        Mutex mutex14 = (Mutex) oooO0O0.f28844OoooO0;
                                        o000O0Oo.OooO00o oooO00o14 = (o000O0Oo.OooO00o) oooO0O0.f28845OoooO00;
                                        LoadType loadType16 = (LoadType) oooO0O0.f28839Oooo;
                                        CoroutineScope coroutineScope15 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000O000<Key, Value> o000o0018 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000O o000000o9 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000O0Oo<Key, Value> o000o0oo6 = oooO00o14.f28869OooO0O0;
                                        oooO0O0.f28840Oooo0o = o000000o9;
                                        oooO0O0.f28841Oooo0oO = o000o0018;
                                        oooO0O0.f28842Oooo0oo = coroutineScope15;
                                        oooO0O0.f28839Oooo = loadType16;
                                        oooO0O0.f28845OoooO00 = mutex14;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28848OoooOOO = 3;
                                        if (o000o0018.OooOO0(o000o0oo6, loadType16, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType2 = loadType16;
                                        coroutineScope3 = coroutineScope15;
                                        o000o004 = o000o0018;
                                        o000000o4 = o000000o9;
                                        r1 = mutex14;
                                        Unit unit10 = Unit.INSTANCE;
                                        r1.unlock(null);
                                        coroutineScope2 = coroutineScope3;
                                        o000o003 = o000o004;
                                        o000000o3 = o000000o4;
                                        if (C0310OooO00o.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                            o000o006 = o000o003;
                                            o00oo0o1 = null;
                                            loadType4 = loadType2;
                                        } else {
                                            oooO00o3 = o000o003.f28795OooOO0O;
                                            mutex2 = oooO00o3.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o3;
                                            oooO0O0.f28841Oooo0oO = o000o003;
                                            oooO0O0.f28842Oooo0oo = coroutineScope2;
                                            oooO0O0.f28839Oooo = loadType2;
                                            oooO0O0.f28845OoooO00 = oooO00o3;
                                            oooO0O0.f28844OoooO0 = mutex2;
                                            oooO0O0.f28846OoooO0O = loadType2;
                                            oooO0O0.f28843OoooO = o000o003;
                                            oooO0O0.f28848OoooOOO = 4;
                                            if (mutex2.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o005 = o000o003;
                                            loadType3 = loadType2;
                                            o00oo0o1 = (o00OO0O0) oooO00o3.f28869OooO0O0.f28866OooOO0O.get(loadType3);
                                            mutex2.unlock(null);
                                            o000o006 = o000o003;
                                            loadType4 = loadType2;
                                            loadType2 = loadType3;
                                            o000o003 = o000o005;
                                        }
                                        oooO0O0.f28840Oooo0o = o000000o3;
                                        oooO0O0.f28841Oooo0oO = o000o003;
                                        oooO0O0.f28842Oooo0oo = coroutineScope2;
                                        oooO0O0.f28839Oooo = loadType2;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28843OoooO = null;
                                        oooO0O0.f28848OoooOOO = 5;
                                        if (o000O000.OooO0OO(o000o006, loadType4, o00oo0o1, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000o007 = o000o003;
                                        loadType5 = loadType2;
                                        coroutineScope4 = coroutineScope2;
                                        o000000o5 = o000000o3;
                                        if (loadType5 == LoadType.REFRESH) {
                                            oooO00o4 = o000o007.f28795OooOO0O;
                                            mutex3 = oooO00o4.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o5;
                                            oooO0O0.f28841Oooo0oO = o000o007;
                                            oooO0O0.f28842Oooo0oo = coroutineScope4;
                                            oooO0O0.f28839Oooo = oooO00o4;
                                            oooO0O0.f28845OoooO00 = mutex3;
                                            oooO0O0.f28848OoooOOO = 6;
                                            if (mutex3.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o = oooO00o4.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex3.unlock(null);
                                            if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o007, coroutineScope4);
                                            }
                                        }
                                        coroutineScope = coroutineScope4;
                                        o000o002 = o000o007;
                                        o000000o2 = o000000o5;
                                        loadType6 = LoadType.PREPEND;
                                        if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                            if (loadType6 != LoadType.REFRESH) {
                                                oooO00o5 = o000o002.f28795OooOO0O;
                                                mutex4 = oooO00o5.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o2;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = oooO00o5;
                                                oooO0O0.f28844OoooO0 = mutex4;
                                                oooO0O0.f28848OoooOOO = 7;
                                                if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000o7 = o000000o2;
                                                mutex5 = mutex4;
                                                coroutineScope6 = coroutineScope;
                                                oooO00o6 = oooO00o5;
                                                o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000000o7;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = mutex5;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28848OoooOOO = 8;
                                                if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType7 = loadType6;
                                                coroutineScope7 = coroutineScope6;
                                                o000o009 = o000o002;
                                                r1 = mutex5;
                                                Unit unit11 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope5 = coroutineScope7;
                                                o000o008 = o000o009;
                                                o000000o6 = o000000o7;
                                            } else {
                                                o000000o6 = o000000o2;
                                                coroutineScope5 = coroutineScope;
                                                loadType7 = loadType6;
                                                o000o008 = o000o002;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                o000o0011 = o000o008;
                                                o00oo0o2 = null;
                                                loadType9 = loadType7;
                                            } else {
                                                oooO00o7 = o000o008.f28795OooOO0O;
                                                mutex6 = oooO00o7.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o6;
                                                oooO0O0.f28841Oooo0oO = o000o008;
                                                oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                oooO0O0.f28839Oooo = loadType7;
                                                oooO0O0.f28845OoooO00 = oooO00o7;
                                                oooO0O0.f28844OoooO0 = mutex6;
                                                oooO0O0.f28846OoooO0O = loadType7;
                                                oooO0O0.f28843OoooO = o000o008;
                                                oooO0O0.f28848OoooOOO = 9;
                                                if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0010 = o000o008;
                                                loadType8 = loadType7;
                                                o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                mutex6.unlock(null);
                                                o000o0011 = o000o008;
                                                loadType9 = loadType7;
                                                loadType7 = loadType8;
                                                o000o008 = o000o0010;
                                            }
                                            oooO0O0.f28840Oooo0o = o000000o6;
                                            oooO0O0.f28841Oooo0oO = o000o008;
                                            oooO0O0.f28842Oooo0oo = coroutineScope5;
                                            oooO0O0.f28839Oooo = loadType7;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28843OoooO = null;
                                            oooO0O0.f28848OoooOOO = 10;
                                            if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0012 = o000o008;
                                            loadType10 = loadType7;
                                            coroutineScope8 = coroutineScope5;
                                            o000000o8 = o000000o6;
                                            if (loadType10 == LoadType.REFRESH) {
                                                oooO00o8 = o000o0012.f28795OooOO0O;
                                                mutex7 = oooO00o8.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o8;
                                                oooO0O0.f28841Oooo0oO = o000o0012;
                                                oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                oooO0O0.f28839Oooo = oooO00o8;
                                                oooO0O0.f28845OoooO00 = mutex7;
                                                oooO0O0.f28848OoooOOO = 11;
                                                if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                }
                                            }
                                            coroutineScope = coroutineScope8;
                                            o000o002 = o000o0012;
                                            o000000o2 = o000000o8;
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope16 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope16;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit12 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        } else {
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope17 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope17;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit13 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 3:
                                        Mutex mutex15 = (Mutex) oooO0O0.f28845OoooO00;
                                        loadType2 = (LoadType) oooO0O0.f28839Oooo;
                                        coroutineScope3 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000o004 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000o4 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        r1 = mutex15;
                                        Unit unit14 = Unit.INSTANCE;
                                        r1.unlock(null);
                                        coroutineScope2 = coroutineScope3;
                                        o000o003 = o000o004;
                                        o000000o3 = o000000o4;
                                        if (C0310OooO00o.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                            o000o006 = o000o003;
                                            o00oo0o1 = null;
                                            loadType4 = loadType2;
                                        } else {
                                            oooO00o3 = o000o003.f28795OooOO0O;
                                            mutex2 = oooO00o3.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o3;
                                            oooO0O0.f28841Oooo0oO = o000o003;
                                            oooO0O0.f28842Oooo0oo = coroutineScope2;
                                            oooO0O0.f28839Oooo = loadType2;
                                            oooO0O0.f28845OoooO00 = oooO00o3;
                                            oooO0O0.f28844OoooO0 = mutex2;
                                            oooO0O0.f28846OoooO0O = loadType2;
                                            oooO0O0.f28843OoooO = o000o003;
                                            oooO0O0.f28848OoooOOO = 4;
                                            if (mutex2.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o005 = o000o003;
                                            loadType3 = loadType2;
                                            o00oo0o1 = (o00OO0O0) oooO00o3.f28869OooO0O0.f28866OooOO0O.get(loadType3);
                                            mutex2.unlock(null);
                                            o000o006 = o000o003;
                                            loadType4 = loadType2;
                                            loadType2 = loadType3;
                                            o000o003 = o000o005;
                                        }
                                        oooO0O0.f28840Oooo0o = o000000o3;
                                        oooO0O0.f28841Oooo0oO = o000o003;
                                        oooO0O0.f28842Oooo0oo = coroutineScope2;
                                        oooO0O0.f28839Oooo = loadType2;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28843OoooO = null;
                                        oooO0O0.f28848OoooOOO = 5;
                                        if (o000O000.OooO0OO(o000o006, loadType4, o00oo0o1, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000o007 = o000o003;
                                        loadType5 = loadType2;
                                        coroutineScope4 = coroutineScope2;
                                        o000000o5 = o000000o3;
                                        if (loadType5 == LoadType.REFRESH) {
                                            oooO00o4 = o000o007.f28795OooOO0O;
                                            mutex3 = oooO00o4.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o5;
                                            oooO0O0.f28841Oooo0oO = o000o007;
                                            oooO0O0.f28842Oooo0oo = coroutineScope4;
                                            oooO0O0.f28839Oooo = oooO00o4;
                                            oooO0O0.f28845OoooO00 = mutex3;
                                            oooO0O0.f28848OoooOOO = 6;
                                            if (mutex3.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o = oooO00o4.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex3.unlock(null);
                                            if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o007, coroutineScope4);
                                            }
                                        }
                                        coroutineScope = coroutineScope4;
                                        o000o002 = o000o007;
                                        o000000o2 = o000000o5;
                                        loadType6 = LoadType.PREPEND;
                                        if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope18 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope18;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit15 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (loadType6 != LoadType.REFRESH) {
                                                oooO00o5 = o000o002.f28795OooOO0O;
                                                mutex4 = oooO00o5.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o2;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = oooO00o5;
                                                oooO0O0.f28844OoooO0 = mutex4;
                                                oooO0O0.f28848OoooOOO = 7;
                                                if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000o7 = o000000o2;
                                                mutex5 = mutex4;
                                                coroutineScope6 = coroutineScope;
                                                oooO00o6 = oooO00o5;
                                                o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000000o7;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = mutex5;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28848OoooOOO = 8;
                                                if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType7 = loadType6;
                                                coroutineScope7 = coroutineScope6;
                                                o000o009 = o000o002;
                                                r1 = mutex5;
                                                Unit unit16 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope5 = coroutineScope7;
                                                o000o008 = o000o009;
                                                o000000o6 = o000000o7;
                                            } else {
                                                o000000o6 = o000000o2;
                                                coroutineScope5 = coroutineScope;
                                                loadType7 = loadType6;
                                                o000o008 = o000o002;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                o000o0011 = o000o008;
                                                o00oo0o2 = null;
                                                loadType9 = loadType7;
                                            } else {
                                                oooO00o7 = o000o008.f28795OooOO0O;
                                                mutex6 = oooO00o7.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o6;
                                                oooO0O0.f28841Oooo0oO = o000o008;
                                                oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                oooO0O0.f28839Oooo = loadType7;
                                                oooO0O0.f28845OoooO00 = oooO00o7;
                                                oooO0O0.f28844OoooO0 = mutex6;
                                                oooO0O0.f28846OoooO0O = loadType7;
                                                oooO0O0.f28843OoooO = o000o008;
                                                oooO0O0.f28848OoooOOO = 9;
                                                if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0010 = o000o008;
                                                loadType8 = loadType7;
                                                o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                mutex6.unlock(null);
                                                o000o0011 = o000o008;
                                                loadType9 = loadType7;
                                                loadType7 = loadType8;
                                                o000o008 = o000o0010;
                                            }
                                            oooO0O0.f28840Oooo0o = o000000o6;
                                            oooO0O0.f28841Oooo0oO = o000o008;
                                            oooO0O0.f28842Oooo0oo = coroutineScope5;
                                            oooO0O0.f28839Oooo = loadType7;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28843OoooO = null;
                                            oooO0O0.f28848OoooOOO = 10;
                                            if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0012 = o000o008;
                                            loadType10 = loadType7;
                                            coroutineScope8 = coroutineScope5;
                                            o000000o8 = o000000o6;
                                            if (loadType10 == LoadType.REFRESH) {
                                                oooO00o8 = o000o0012.f28795OooOO0O;
                                                mutex7 = oooO00o8.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o8;
                                                oooO0O0.f28841Oooo0oO = o000o0012;
                                                oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                oooO0O0.f28839Oooo = oooO00o8;
                                                oooO0O0.f28845OoooO00 = mutex7;
                                                oooO0O0.f28848OoooOOO = 11;
                                                if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                }
                                            }
                                            coroutineScope = coroutineScope8;
                                            o000o002 = o000o0012;
                                            o000000o2 = o000000o8;
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope19 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope19;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit17 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 4:
                                        o000o003 = oooO0O0.f28843OoooO;
                                        loadType2 = (LoadType) oooO0O0.f28846OoooO0O;
                                        mutex2 = (Mutex) oooO0O0.f28844OoooO0;
                                        oooO00o3 = (o000O0Oo.OooO00o) oooO0O0.f28845OoooO00;
                                        loadType3 = (LoadType) oooO0O0.f28839Oooo;
                                        coroutineScope2 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000o005 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000o3 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o00oo0o1 = (o00OO0O0) oooO00o3.f28869OooO0O0.f28866OooOO0O.get(loadType3);
                                        mutex2.unlock(null);
                                        o000o006 = o000o003;
                                        loadType4 = loadType2;
                                        loadType2 = loadType3;
                                        o000o003 = o000o005;
                                        oooO0O0.f28840Oooo0o = o000000o3;
                                        oooO0O0.f28841Oooo0oO = o000o003;
                                        oooO0O0.f28842Oooo0oo = coroutineScope2;
                                        oooO0O0.f28839Oooo = loadType2;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28843OoooO = null;
                                        oooO0O0.f28848OoooOOO = 5;
                                        if (o000O000.OooO0OO(o000o006, loadType4, o00oo0o1, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000o007 = o000o003;
                                        loadType5 = loadType2;
                                        coroutineScope4 = coroutineScope2;
                                        o000000o5 = o000000o3;
                                        if (loadType5 == LoadType.REFRESH) {
                                            oooO00o4 = o000o007.f28795OooOO0O;
                                            mutex3 = oooO00o4.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o5;
                                            oooO0O0.f28841Oooo0oO = o000o007;
                                            oooO0O0.f28842Oooo0oo = coroutineScope4;
                                            oooO0O0.f28839Oooo = oooO00o4;
                                            oooO0O0.f28845OoooO00 = mutex3;
                                            oooO0O0.f28848OoooOOO = 6;
                                            if (mutex3.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o = oooO00o4.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex3.unlock(null);
                                            if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o007, coroutineScope4);
                                            }
                                        }
                                        coroutineScope = coroutineScope4;
                                        o000o002 = o000o007;
                                        o000000o2 = o000000o5;
                                        loadType6 = LoadType.PREPEND;
                                        if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope110 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope110;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit18 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (loadType6 != LoadType.REFRESH) {
                                                oooO00o5 = o000o002.f28795OooOO0O;
                                                mutex4 = oooO00o5.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o2;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = oooO00o5;
                                                oooO0O0.f28844OoooO0 = mutex4;
                                                oooO0O0.f28848OoooOOO = 7;
                                                if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000o7 = o000000o2;
                                                mutex5 = mutex4;
                                                coroutineScope6 = coroutineScope;
                                                oooO00o6 = oooO00o5;
                                                o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000000o7;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = mutex5;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28848OoooOOO = 8;
                                                if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType7 = loadType6;
                                                coroutineScope7 = coroutineScope6;
                                                o000o009 = o000o002;
                                                r1 = mutex5;
                                                Unit unit19 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope5 = coroutineScope7;
                                                o000o008 = o000o009;
                                                o000000o6 = o000000o7;
                                            } else {
                                                o000000o6 = o000000o2;
                                                coroutineScope5 = coroutineScope;
                                                loadType7 = loadType6;
                                                o000o008 = o000o002;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                o000o0011 = o000o008;
                                                o00oo0o2 = null;
                                                loadType9 = loadType7;
                                            } else {
                                                oooO00o7 = o000o008.f28795OooOO0O;
                                                mutex6 = oooO00o7.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o6;
                                                oooO0O0.f28841Oooo0oO = o000o008;
                                                oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                oooO0O0.f28839Oooo = loadType7;
                                                oooO0O0.f28845OoooO00 = oooO00o7;
                                                oooO0O0.f28844OoooO0 = mutex6;
                                                oooO0O0.f28846OoooO0O = loadType7;
                                                oooO0O0.f28843OoooO = o000o008;
                                                oooO0O0.f28848OoooOOO = 9;
                                                if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0010 = o000o008;
                                                loadType8 = loadType7;
                                                o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                mutex6.unlock(null);
                                                o000o0011 = o000o008;
                                                loadType9 = loadType7;
                                                loadType7 = loadType8;
                                                o000o008 = o000o0010;
                                            }
                                            oooO0O0.f28840Oooo0o = o000000o6;
                                            oooO0O0.f28841Oooo0oO = o000o008;
                                            oooO0O0.f28842Oooo0oo = coroutineScope5;
                                            oooO0O0.f28839Oooo = loadType7;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28843OoooO = null;
                                            oooO0O0.f28848OoooOOO = 10;
                                            if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0012 = o000o008;
                                            loadType10 = loadType7;
                                            coroutineScope8 = coroutineScope5;
                                            o000000o8 = o000000o6;
                                            if (loadType10 == LoadType.REFRESH) {
                                                oooO00o8 = o000o0012.f28795OooOO0O;
                                                mutex7 = oooO00o8.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o8;
                                                oooO0O0.f28841Oooo0oO = o000o0012;
                                                oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                oooO0O0.f28839Oooo = oooO00o8;
                                                oooO0O0.f28845OoooO00 = mutex7;
                                                oooO0O0.f28848OoooOOO = 11;
                                                if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                }
                                            }
                                            coroutineScope = coroutineScope8;
                                            o000o002 = o000o0012;
                                            o000000o2 = o000000o8;
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope111 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope111;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit110 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 5:
                                        loadType5 = (LoadType) oooO0O0.f28839Oooo;
                                        CoroutineScope coroutineScope20 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000O000<Key, Value> o000o0019 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000O o000000o10 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000000o5 = o000000o10;
                                        o000o007 = o000o0019;
                                        coroutineScope4 = coroutineScope20;
                                        if (loadType5 == LoadType.REFRESH) {
                                            oooO00o4 = o000o007.f28795OooOO0O;
                                            mutex3 = oooO00o4.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o5;
                                            oooO0O0.f28841Oooo0oO = o000o007;
                                            oooO0O0.f28842Oooo0oo = coroutineScope4;
                                            oooO0O0.f28839Oooo = oooO00o4;
                                            oooO0O0.f28845OoooO00 = mutex3;
                                            oooO0O0.f28848OoooOOO = 6;
                                            if (mutex3.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o = oooO00o4.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex3.unlock(null);
                                            if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o007, coroutineScope4);
                                            }
                                        }
                                        coroutineScope = coroutineScope4;
                                        o000o002 = o000o007;
                                        o000000o2 = o000000o5;
                                        loadType6 = LoadType.PREPEND;
                                        if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope112 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope112;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit111 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (loadType6 != LoadType.REFRESH) {
                                                oooO00o5 = o000o002.f28795OooOO0O;
                                                mutex4 = oooO00o5.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o2;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = oooO00o5;
                                                oooO0O0.f28844OoooO0 = mutex4;
                                                oooO0O0.f28848OoooOOO = 7;
                                                if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000o7 = o000000o2;
                                                mutex5 = mutex4;
                                                coroutineScope6 = coroutineScope;
                                                oooO00o6 = oooO00o5;
                                                o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000000o7;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = mutex5;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28848OoooOOO = 8;
                                                if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType7 = loadType6;
                                                coroutineScope7 = coroutineScope6;
                                                o000o009 = o000o002;
                                                r1 = mutex5;
                                                Unit unit112 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope5 = coroutineScope7;
                                                o000o008 = o000o009;
                                                o000000o6 = o000000o7;
                                            } else {
                                                o000000o6 = o000000o2;
                                                coroutineScope5 = coroutineScope;
                                                loadType7 = loadType6;
                                                o000o008 = o000o002;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                o000o0011 = o000o008;
                                                o00oo0o2 = null;
                                                loadType9 = loadType7;
                                            } else {
                                                oooO00o7 = o000o008.f28795OooOO0O;
                                                mutex6 = oooO00o7.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o6;
                                                oooO0O0.f28841Oooo0oO = o000o008;
                                                oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                oooO0O0.f28839Oooo = loadType7;
                                                oooO0O0.f28845OoooO00 = oooO00o7;
                                                oooO0O0.f28844OoooO0 = mutex6;
                                                oooO0O0.f28846OoooO0O = loadType7;
                                                oooO0O0.f28843OoooO = o000o008;
                                                oooO0O0.f28848OoooOOO = 9;
                                                if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0010 = o000o008;
                                                loadType8 = loadType7;
                                                o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                mutex6.unlock(null);
                                                o000o0011 = o000o008;
                                                loadType9 = loadType7;
                                                loadType7 = loadType8;
                                                o000o008 = o000o0010;
                                            }
                                            oooO0O0.f28840Oooo0o = o000000o6;
                                            oooO0O0.f28841Oooo0oO = o000o008;
                                            oooO0O0.f28842Oooo0oo = coroutineScope5;
                                            oooO0O0.f28839Oooo = loadType7;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28843OoooO = null;
                                            oooO0O0.f28848OoooOOO = 10;
                                            if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0012 = o000o008;
                                            loadType10 = loadType7;
                                            coroutineScope8 = coroutineScope5;
                                            o000000o8 = o000000o6;
                                            if (loadType10 == LoadType.REFRESH) {
                                                oooO00o8 = o000o0012.f28795OooOO0O;
                                                mutex7 = oooO00o8.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o8;
                                                oooO0O0.f28841Oooo0oO = o000o0012;
                                                oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                oooO0O0.f28839Oooo = oooO00o8;
                                                oooO0O0.f28845OoooO00 = mutex7;
                                                oooO0O0.f28848OoooOOO = 11;
                                                if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                }
                                            }
                                            coroutineScope = coroutineScope8;
                                            o000o002 = o000o0012;
                                            o000000o2 = o000000o8;
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope113 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope113;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit113 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 6:
                                        mutex3 = (Mutex) oooO0O0.f28845OoooO00;
                                        oooO00o4 = (o000O0Oo.OooO00o) oooO0O0.f28839Oooo;
                                        coroutineScope4 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000o007 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000o5 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000000VarOooO00o = oooO00o4.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex3.unlock(null);
                                        if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                                            o000O000.OooO0Oo(o000o007, coroutineScope4);
                                        }
                                        coroutineScope = coroutineScope4;
                                        o000o002 = o000o007;
                                        o000000o2 = o000000o5;
                                        loadType6 = LoadType.PREPEND;
                                        if (o000000o2.f28703OooO0O0 instanceof o000000.OooO00o) {
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope114 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope114;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit114 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (loadType6 != LoadType.REFRESH) {
                                                oooO00o5 = o000o002.f28795OooOO0O;
                                                mutex4 = oooO00o5.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o2;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = oooO00o5;
                                                oooO0O0.f28844OoooO0 = mutex4;
                                                oooO0O0.f28848OoooOOO = 7;
                                                if (mutex4.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000o7 = o000000o2;
                                                mutex5 = mutex4;
                                                coroutineScope6 = coroutineScope;
                                                oooO00o6 = oooO00o5;
                                                o000o0oo2 = oooO00o6.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000000o7;
                                                oooO0O0.f28841Oooo0oO = o000o002;
                                                oooO0O0.f28842Oooo0oo = coroutineScope6;
                                                oooO0O0.f28839Oooo = loadType6;
                                                oooO0O0.f28845OoooO00 = mutex5;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28848OoooOOO = 8;
                                                if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType7 = loadType6;
                                                coroutineScope7 = coroutineScope6;
                                                o000o009 = o000o002;
                                                r1 = mutex5;
                                                Unit unit115 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope5 = coroutineScope7;
                                                o000o008 = o000o009;
                                                o000000o6 = o000000o7;
                                            } else {
                                                o000000o6 = o000000o2;
                                                coroutineScope5 = coroutineScope;
                                                loadType7 = loadType6;
                                                o000o008 = o000o002;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                o000o0011 = o000o008;
                                                o00oo0o2 = null;
                                                loadType9 = loadType7;
                                            } else {
                                                oooO00o7 = o000o008.f28795OooOO0O;
                                                mutex6 = oooO00o7.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o6;
                                                oooO0O0.f28841Oooo0oO = o000o008;
                                                oooO0O0.f28842Oooo0oo = coroutineScope5;
                                                oooO0O0.f28839Oooo = loadType7;
                                                oooO0O0.f28845OoooO00 = oooO00o7;
                                                oooO0O0.f28844OoooO0 = mutex6;
                                                oooO0O0.f28846OoooO0O = loadType7;
                                                oooO0O0.f28843OoooO = o000o008;
                                                oooO0O0.f28848OoooOOO = 9;
                                                if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0010 = o000o008;
                                                loadType8 = loadType7;
                                                o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                                mutex6.unlock(null);
                                                o000o0011 = o000o008;
                                                loadType9 = loadType7;
                                                loadType7 = loadType8;
                                                o000o008 = o000o0010;
                                            }
                                            oooO0O0.f28840Oooo0o = o000000o6;
                                            oooO0O0.f28841Oooo0oO = o000o008;
                                            oooO0O0.f28842Oooo0oo = coroutineScope5;
                                            oooO0O0.f28839Oooo = loadType7;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28843OoooO = null;
                                            oooO0O0.f28848OoooOOO = 10;
                                            if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0012 = o000o008;
                                            loadType10 = loadType7;
                                            coroutineScope8 = coroutineScope5;
                                            o000000o8 = o000000o6;
                                            if (loadType10 == LoadType.REFRESH) {
                                                oooO00o8 = o000o0012.f28795OooOO0O;
                                                mutex7 = oooO00o8.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000000o8;
                                                oooO0O0.f28841Oooo0oO = o000o0012;
                                                oooO0O0.f28842Oooo0oo = coroutineScope8;
                                                oooO0O0.f28839Oooo = oooO00o8;
                                                oooO0O0.f28845OoooO00 = mutex7;
                                                oooO0O0.f28848OoooOOO = 11;
                                                if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                                }
                                            }
                                            coroutineScope = coroutineScope8;
                                            o000o002 = o000o0012;
                                            o000000o2 = o000000o8;
                                            loadType11 = LoadType.APPEND;
                                            if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                                if (loadType11 != LoadType.REFRESH) {
                                                    oooO00o9 = o000o002.f28795OooOO0O;
                                                    mutex8 = oooO00o9.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = oooO00o9;
                                                    oooO0O0.f28845OoooO00 = mutex8;
                                                    oooO0O0.f28848OoooOOO = 12;
                                                    if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    CoroutineScope coroutineScope115 = coroutineScope;
                                                    oooO00o10 = oooO00o9;
                                                    mutex9 = mutex8;
                                                    coroutineScope10 = coroutineScope115;
                                                    o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                    oooO0O0.f28840Oooo0o = o000o002;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                    oooO0O0.f28842Oooo0oo = loadType11;
                                                    oooO0O0.f28839Oooo = mutex9;
                                                    oooO0O0.f28845OoooO00 = null;
                                                    oooO0O0.f28848OoooOOO = 13;
                                                    if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType12 = loadType11;
                                                    coroutineScope11 = coroutineScope10;
                                                    o000o0014 = o000o002;
                                                    r1 = mutex9;
                                                    Unit unit116 = Unit.INSTANCE;
                                                    r1.unlock(null);
                                                    coroutineScope9 = coroutineScope11;
                                                    o000o0013 = o000o0014;
                                                } else {
                                                    o000o0013 = o000o002;
                                                    coroutineScope9 = coroutineScope;
                                                    loadType12 = loadType11;
                                                }
                                                if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    o000o0016 = o000o0013;
                                                    o00oo0o3 = null;
                                                    loadType15 = loadType12;
                                                } else {
                                                    oooO00o11 = o000o0013.f28795OooOO0O;
                                                    mutex10 = oooO00o11.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                    oooO0O0.f28842Oooo0oo = loadType12;
                                                    oooO0O0.f28839Oooo = oooO00o11;
                                                    oooO0O0.f28845OoooO00 = mutex10;
                                                    oooO0O0.f28844OoooO0 = loadType12;
                                                    oooO0O0.f28846OoooO0O = o000o0013;
                                                    oooO0O0.f28848OoooOOO = 14;
                                                    if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0015 = o000o0013;
                                                    loadType13 = loadType12;
                                                    loadType14 = loadType13;
                                                    mutex11 = mutex10;
                                                    o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                    mutex11.unlock(null);
                                                    loadType15 = loadType13;
                                                    loadType12 = loadType14;
                                                    o000o0016 = o000o0013;
                                                    o000o0013 = o000o0015;
                                                }
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = null;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28844OoooO0 = null;
                                                oooO0O0.f28846OoooO0O = null;
                                                oooO0O0.f28848OoooOOO = 15;
                                                if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                coroutineScope12 = coroutineScope9;
                                                if (loadType12 == LoadType.REFRESH) {
                                                    oooO00o12 = o000o0013.f28795OooOO0O;
                                                    mutex12 = oooO00o12.f28868OooO00o;
                                                    oooO0O0.f28840Oooo0o = o000o0013;
                                                    oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                    oooO0O0.f28842Oooo0oo = oooO00o12;
                                                    oooO0O0.f28839Oooo = mutex12;
                                                    oooO0O0.f28848OoooOOO = 16;
                                                    if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000o0017 = o000o0013;
                                                    mutex13 = mutex12;
                                                    oooO00o13 = oooO00o12;
                                                    o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex13.unlock(null);
                                                    if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                        o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                    }
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 7:
                                        Mutex mutex16 = (Mutex) oooO0O0.f28844OoooO0;
                                        oooO00o6 = (o000O0Oo.OooO00o) oooO0O0.f28845OoooO00;
                                        loadType6 = (LoadType) oooO0O0.f28839Oooo;
                                        coroutineScope6 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000O000<Key, Value> o000o0020 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000O o000000o11 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000o002 = o000o0020;
                                        o000000o7 = o000000o11;
                                        mutex5 = mutex16;
                                        o000o0oo2 = oooO00o6.f28869OooO0O0;
                                        oooO0O0.f28840Oooo0o = o000000o7;
                                        oooO0O0.f28841Oooo0oO = o000o002;
                                        oooO0O0.f28842Oooo0oo = coroutineScope6;
                                        oooO0O0.f28839Oooo = loadType6;
                                        oooO0O0.f28845OoooO00 = mutex5;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28848OoooOOO = 8;
                                        if (o000o002.OooOO0(o000o0oo2, loadType6, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType7 = loadType6;
                                        coroutineScope7 = coroutineScope6;
                                        o000o009 = o000o002;
                                        r1 = mutex5;
                                        Unit unit117 = Unit.INSTANCE;
                                        r1.unlock(null);
                                        coroutineScope5 = coroutineScope7;
                                        o000o008 = o000o009;
                                        o000000o6 = o000000o7;
                                        if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            o000o0011 = o000o008;
                                            o00oo0o2 = null;
                                            loadType9 = loadType7;
                                        } else {
                                            oooO00o7 = o000o008.f28795OooOO0O;
                                            mutex6 = oooO00o7.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o6;
                                            oooO0O0.f28841Oooo0oO = o000o008;
                                            oooO0O0.f28842Oooo0oo = coroutineScope5;
                                            oooO0O0.f28839Oooo = loadType7;
                                            oooO0O0.f28845OoooO00 = oooO00o7;
                                            oooO0O0.f28844OoooO0 = mutex6;
                                            oooO0O0.f28846OoooO0O = loadType7;
                                            oooO0O0.f28843OoooO = o000o008;
                                            oooO0O0.f28848OoooOOO = 9;
                                            if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0010 = o000o008;
                                            loadType8 = loadType7;
                                            o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                            mutex6.unlock(null);
                                            o000o0011 = o000o008;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            o000o008 = o000o0010;
                                        }
                                        oooO0O0.f28840Oooo0o = o000000o6;
                                        oooO0O0.f28841Oooo0oO = o000o008;
                                        oooO0O0.f28842Oooo0oo = coroutineScope5;
                                        oooO0O0.f28839Oooo = loadType7;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28843OoooO = null;
                                        oooO0O0.f28848OoooOOO = 10;
                                        if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000o0012 = o000o008;
                                        loadType10 = loadType7;
                                        coroutineScope8 = coroutineScope5;
                                        o000000o8 = o000000o6;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o8 = o000o0012.f28795OooOO0O;
                                            mutex7 = oooO00o8.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o8;
                                            oooO0O0.f28841Oooo0oO = o000o0012;
                                            oooO0O0.f28842Oooo0oo = coroutineScope8;
                                            oooO0O0.f28839Oooo = oooO00o8;
                                            oooO0O0.f28845OoooO00 = mutex7;
                                            oooO0O0.f28848OoooOOO = 11;
                                            if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                            }
                                        }
                                        coroutineScope = coroutineScope8;
                                        o000o002 = o000o0012;
                                        o000000o2 = o000000o8;
                                        loadType11 = LoadType.APPEND;
                                        if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o9 = o000o002.f28795OooOO0O;
                                                mutex8 = oooO00o9.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = oooO00o9;
                                                oooO0O0.f28845OoooO00 = mutex8;
                                                oooO0O0.f28848OoooOOO = 12;
                                                if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope116 = coroutineScope;
                                                oooO00o10 = oooO00o9;
                                                mutex9 = mutex8;
                                                coroutineScope10 = coroutineScope116;
                                                o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = mutex9;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28848OoooOOO = 13;
                                                if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                coroutineScope11 = coroutineScope10;
                                                o000o0014 = o000o002;
                                                r1 = mutex9;
                                                Unit unit118 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope9 = coroutineScope11;
                                                o000o0013 = o000o0014;
                                            } else {
                                                o000o0013 = o000o002;
                                                coroutineScope9 = coroutineScope;
                                                loadType12 = loadType11;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                o000o0016 = o000o0013;
                                                o00oo0o3 = null;
                                                loadType15 = loadType12;
                                            } else {
                                                oooO00o11 = o000o0013.f28795OooOO0O;
                                                mutex10 = oooO00o11.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = oooO00o11;
                                                oooO0O0.f28845OoooO00 = mutex10;
                                                oooO0O0.f28844OoooO0 = loadType12;
                                                oooO0O0.f28846OoooO0O = o000o0013;
                                                oooO0O0.f28848OoooOOO = 14;
                                                if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0015 = o000o0013;
                                                loadType13 = loadType12;
                                                loadType14 = loadType13;
                                                mutex11 = mutex10;
                                                o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                mutex11.unlock(null);
                                                loadType15 = loadType13;
                                                loadType12 = loadType14;
                                                o000o0016 = o000o0013;
                                                o000o0013 = o000o0015;
                                            }
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope9;
                                            oooO0O0.f28842Oooo0oo = loadType12;
                                            oooO0O0.f28839Oooo = null;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28848OoooOOO = 15;
                                            if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            coroutineScope12 = coroutineScope9;
                                            if (loadType12 == LoadType.REFRESH) {
                                                oooO00o12 = o000o0013.f28795OooOO0O;
                                                mutex12 = oooO00o12.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                oooO0O0.f28842Oooo0oo = oooO00o12;
                                                oooO0O0.f28839Oooo = mutex12;
                                                oooO0O0.f28848OoooOOO = 16;
                                                if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0017 = o000o0013;
                                                mutex13 = mutex12;
                                                oooO00o13 = oooO00o12;
                                                o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex13.unlock(null);
                                                if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 8:
                                        Mutex mutex17 = (Mutex) oooO0O0.f28845OoooO00;
                                        loadType7 = (LoadType) oooO0O0.f28839Oooo;
                                        coroutineScope7 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000o009 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000o7 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        r1 = mutex17;
                                        Unit unit119 = Unit.INSTANCE;
                                        r1.unlock(null);
                                        coroutineScope5 = coroutineScope7;
                                        o000o008 = o000o009;
                                        o000000o6 = o000000o7;
                                        if (C0310OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            o000o0011 = o000o008;
                                            o00oo0o2 = null;
                                            loadType9 = loadType7;
                                        } else {
                                            oooO00o7 = o000o008.f28795OooOO0O;
                                            mutex6 = oooO00o7.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o6;
                                            oooO0O0.f28841Oooo0oO = o000o008;
                                            oooO0O0.f28842Oooo0oo = coroutineScope5;
                                            oooO0O0.f28839Oooo = loadType7;
                                            oooO0O0.f28845OoooO00 = oooO00o7;
                                            oooO0O0.f28844OoooO0 = mutex6;
                                            oooO0O0.f28846OoooO0O = loadType7;
                                            oooO0O0.f28843OoooO = o000o008;
                                            oooO0O0.f28848OoooOOO = 9;
                                            if (mutex6.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0010 = o000o008;
                                            loadType8 = loadType7;
                                            o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                            mutex6.unlock(null);
                                            o000o0011 = o000o008;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            o000o008 = o000o0010;
                                        }
                                        oooO0O0.f28840Oooo0o = o000000o6;
                                        oooO0O0.f28841Oooo0oO = o000o008;
                                        oooO0O0.f28842Oooo0oo = coroutineScope5;
                                        oooO0O0.f28839Oooo = loadType7;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28843OoooO = null;
                                        oooO0O0.f28848OoooOOO = 10;
                                        if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000o0012 = o000o008;
                                        loadType10 = loadType7;
                                        coroutineScope8 = coroutineScope5;
                                        o000000o8 = o000000o6;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o8 = o000o0012.f28795OooOO0O;
                                            mutex7 = oooO00o8.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o8;
                                            oooO0O0.f28841Oooo0oO = o000o0012;
                                            oooO0O0.f28842Oooo0oo = coroutineScope8;
                                            oooO0O0.f28839Oooo = oooO00o8;
                                            oooO0O0.f28845OoooO00 = mutex7;
                                            oooO0O0.f28848OoooOOO = 11;
                                            if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                            }
                                        }
                                        coroutineScope = coroutineScope8;
                                        o000o002 = o000o0012;
                                        o000000o2 = o000000o8;
                                        loadType11 = LoadType.APPEND;
                                        if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o9 = o000o002.f28795OooOO0O;
                                                mutex8 = oooO00o9.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = oooO00o9;
                                                oooO0O0.f28845OoooO00 = mutex8;
                                                oooO0O0.f28848OoooOOO = 12;
                                                if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope117 = coroutineScope;
                                                oooO00o10 = oooO00o9;
                                                mutex9 = mutex8;
                                                coroutineScope10 = coroutineScope117;
                                                o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = mutex9;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28848OoooOOO = 13;
                                                if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                coroutineScope11 = coroutineScope10;
                                                o000o0014 = o000o002;
                                                r1 = mutex9;
                                                Unit unit1110 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope9 = coroutineScope11;
                                                o000o0013 = o000o0014;
                                            } else {
                                                o000o0013 = o000o002;
                                                coroutineScope9 = coroutineScope;
                                                loadType12 = loadType11;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                o000o0016 = o000o0013;
                                                o00oo0o3 = null;
                                                loadType15 = loadType12;
                                            } else {
                                                oooO00o11 = o000o0013.f28795OooOO0O;
                                                mutex10 = oooO00o11.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = oooO00o11;
                                                oooO0O0.f28845OoooO00 = mutex10;
                                                oooO0O0.f28844OoooO0 = loadType12;
                                                oooO0O0.f28846OoooO0O = o000o0013;
                                                oooO0O0.f28848OoooOOO = 14;
                                                if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0015 = o000o0013;
                                                loadType13 = loadType12;
                                                loadType14 = loadType13;
                                                mutex11 = mutex10;
                                                o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                mutex11.unlock(null);
                                                loadType15 = loadType13;
                                                loadType12 = loadType14;
                                                o000o0016 = o000o0013;
                                                o000o0013 = o000o0015;
                                            }
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope9;
                                            oooO0O0.f28842Oooo0oo = loadType12;
                                            oooO0O0.f28839Oooo = null;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28848OoooOOO = 15;
                                            if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            coroutineScope12 = coroutineScope9;
                                            if (loadType12 == LoadType.REFRESH) {
                                                oooO00o12 = o000o0013.f28795OooOO0O;
                                                mutex12 = oooO00o12.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                oooO0O0.f28842Oooo0oo = oooO00o12;
                                                oooO0O0.f28839Oooo = mutex12;
                                                oooO0O0.f28848OoooOOO = 16;
                                                if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0017 = o000o0013;
                                                mutex13 = mutex12;
                                                oooO00o13 = oooO00o12;
                                                o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex13.unlock(null);
                                                if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 9:
                                        o000o008 = oooO0O0.f28843OoooO;
                                        loadType7 = (LoadType) oooO0O0.f28846OoooO0O;
                                        mutex6 = (Mutex) oooO0O0.f28844OoooO0;
                                        oooO00o7 = (o000O0Oo.OooO00o) oooO0O0.f28845OoooO00;
                                        loadType8 = (LoadType) oooO0O0.f28839Oooo;
                                        coroutineScope5 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000o0010 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000o6 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o00oo0o2 = (o00OO0O0) oooO00o7.f28869OooO0O0.f28866OooOO0O.get(loadType8);
                                        mutex6.unlock(null);
                                        o000o0011 = o000o008;
                                        loadType9 = loadType7;
                                        loadType7 = loadType8;
                                        o000o008 = o000o0010;
                                        oooO0O0.f28840Oooo0o = o000000o6;
                                        oooO0O0.f28841Oooo0oO = o000o008;
                                        oooO0O0.f28842Oooo0oo = coroutineScope5;
                                        oooO0O0.f28839Oooo = loadType7;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28843OoooO = null;
                                        oooO0O0.f28848OoooOOO = 10;
                                        if (o000O000.OooO0OO(o000o0011, loadType9, o00oo0o2, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000o0012 = o000o008;
                                        loadType10 = loadType7;
                                        coroutineScope8 = coroutineScope5;
                                        o000000o8 = o000000o6;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o8 = o000o0012.f28795OooOO0O;
                                            mutex7 = oooO00o8.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o8;
                                            oooO0O0.f28841Oooo0oO = o000o0012;
                                            oooO0O0.f28842Oooo0oo = coroutineScope8;
                                            oooO0O0.f28839Oooo = oooO00o8;
                                            oooO0O0.f28845OoooO00 = mutex7;
                                            oooO0O0.f28848OoooOOO = 11;
                                            if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                            }
                                        }
                                        coroutineScope = coroutineScope8;
                                        o000o002 = o000o0012;
                                        o000000o2 = o000000o8;
                                        loadType11 = LoadType.APPEND;
                                        if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o9 = o000o002.f28795OooOO0O;
                                                mutex8 = oooO00o9.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = oooO00o9;
                                                oooO0O0.f28845OoooO00 = mutex8;
                                                oooO0O0.f28848OoooOOO = 12;
                                                if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope118 = coroutineScope;
                                                oooO00o10 = oooO00o9;
                                                mutex9 = mutex8;
                                                coroutineScope10 = coroutineScope118;
                                                o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = mutex9;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28848OoooOOO = 13;
                                                if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                coroutineScope11 = coroutineScope10;
                                                o000o0014 = o000o002;
                                                r1 = mutex9;
                                                Unit unit1111 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope9 = coroutineScope11;
                                                o000o0013 = o000o0014;
                                            } else {
                                                o000o0013 = o000o002;
                                                coroutineScope9 = coroutineScope;
                                                loadType12 = loadType11;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                o000o0016 = o000o0013;
                                                o00oo0o3 = null;
                                                loadType15 = loadType12;
                                            } else {
                                                oooO00o11 = o000o0013.f28795OooOO0O;
                                                mutex10 = oooO00o11.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = oooO00o11;
                                                oooO0O0.f28845OoooO00 = mutex10;
                                                oooO0O0.f28844OoooO0 = loadType12;
                                                oooO0O0.f28846OoooO0O = o000o0013;
                                                oooO0O0.f28848OoooOOO = 14;
                                                if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0015 = o000o0013;
                                                loadType13 = loadType12;
                                                loadType14 = loadType13;
                                                mutex11 = mutex10;
                                                o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                mutex11.unlock(null);
                                                loadType15 = loadType13;
                                                loadType12 = loadType14;
                                                o000o0016 = o000o0013;
                                                o000o0013 = o000o0015;
                                            }
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope9;
                                            oooO0O0.f28842Oooo0oo = loadType12;
                                            oooO0O0.f28839Oooo = null;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28848OoooOOO = 15;
                                            if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            coroutineScope12 = coroutineScope9;
                                            if (loadType12 == LoadType.REFRESH) {
                                                oooO00o12 = o000o0013.f28795OooOO0O;
                                                mutex12 = oooO00o12.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                oooO0O0.f28842Oooo0oo = oooO00o12;
                                                oooO0O0.f28839Oooo = mutex12;
                                                oooO0O0.f28848OoooOOO = 16;
                                                if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0017 = o000o0013;
                                                mutex13 = mutex12;
                                                oooO00o13 = oooO00o12;
                                                o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex13.unlock(null);
                                                if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 10:
                                        loadType10 = (LoadType) oooO0O0.f28839Oooo;
                                        CoroutineScope coroutineScope21 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000O000<Key, Value> o000o0021 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000O o000000o12 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000000o8 = o000000o12;
                                        o000o0012 = o000o0021;
                                        coroutineScope8 = coroutineScope21;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o8 = o000o0012.f28795OooOO0O;
                                            mutex7 = oooO00o8.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000000o8;
                                            oooO0O0.f28841Oooo0oO = o000o0012;
                                            oooO0O0.f28842Oooo0oo = coroutineScope8;
                                            oooO0O0.f28839Oooo = oooO00o8;
                                            oooO0O0.f28845OoooO00 = mutex7;
                                            oooO0O0.f28848OoooOOO = 11;
                                            if (mutex7.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                            }
                                        }
                                        coroutineScope = coroutineScope8;
                                        o000o002 = o000o0012;
                                        o000000o2 = o000000o8;
                                        loadType11 = LoadType.APPEND;
                                        if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o9 = o000o002.f28795OooOO0O;
                                                mutex8 = oooO00o9.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = oooO00o9;
                                                oooO0O0.f28845OoooO00 = mutex8;
                                                oooO0O0.f28848OoooOOO = 12;
                                                if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope119 = coroutineScope;
                                                oooO00o10 = oooO00o9;
                                                mutex9 = mutex8;
                                                coroutineScope10 = coroutineScope119;
                                                o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = mutex9;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28848OoooOOO = 13;
                                                if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                coroutineScope11 = coroutineScope10;
                                                o000o0014 = o000o002;
                                                r1 = mutex9;
                                                Unit unit1112 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope9 = coroutineScope11;
                                                o000o0013 = o000o0014;
                                            } else {
                                                o000o0013 = o000o002;
                                                coroutineScope9 = coroutineScope;
                                                loadType12 = loadType11;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                o000o0016 = o000o0013;
                                                o00oo0o3 = null;
                                                loadType15 = loadType12;
                                            } else {
                                                oooO00o11 = o000o0013.f28795OooOO0O;
                                                mutex10 = oooO00o11.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = oooO00o11;
                                                oooO0O0.f28845OoooO00 = mutex10;
                                                oooO0O0.f28844OoooO0 = loadType12;
                                                oooO0O0.f28846OoooO0O = o000o0013;
                                                oooO0O0.f28848OoooOOO = 14;
                                                if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0015 = o000o0013;
                                                loadType13 = loadType12;
                                                loadType14 = loadType13;
                                                mutex11 = mutex10;
                                                o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                mutex11.unlock(null);
                                                loadType15 = loadType13;
                                                loadType12 = loadType14;
                                                o000o0016 = o000o0013;
                                                o000o0013 = o000o0015;
                                            }
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope9;
                                            oooO0O0.f28842Oooo0oo = loadType12;
                                            oooO0O0.f28839Oooo = null;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28848OoooOOO = 15;
                                            if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            coroutineScope12 = coroutineScope9;
                                            if (loadType12 == LoadType.REFRESH) {
                                                oooO00o12 = o000o0013.f28795OooOO0O;
                                                mutex12 = oooO00o12.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                oooO0O0.f28842Oooo0oo = oooO00o12;
                                                oooO0O0.f28839Oooo = mutex12;
                                                oooO0O0.f28848OoooOOO = 16;
                                                if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0017 = o000o0013;
                                                mutex13 = mutex12;
                                                oooO00o13 = oooO00o12;
                                                o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex13.unlock(null);
                                                if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 11:
                                        mutex7 = (Mutex) oooO0O0.f28845OoooO00;
                                        oooO00o8 = (o000O0Oo.OooO00o) oooO0O0.f28839Oooo;
                                        coroutineScope8 = (CoroutineScope) oooO0O0.f28842Oooo0oo;
                                        o000o0012 = (o000O000) oooO0O0.f28841Oooo0oO;
                                        o000000o8 = (o000000O) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000000VarOooO00o2 = oooO00o8.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex7.unlock(null);
                                        if (!(o000000VarOooO00o2 instanceof o000000.OooO00o)) {
                                            o000O000.OooO0Oo(o000o0012, coroutineScope8);
                                        }
                                        coroutineScope = coroutineScope8;
                                        o000o002 = o000o0012;
                                        o000000o2 = o000000o8;
                                        loadType11 = LoadType.APPEND;
                                        if (o000000o2.f28704OooO0OO instanceof o000000.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o9 = o000o002.f28795OooOO0O;
                                                mutex8 = oooO00o9.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = oooO00o9;
                                                oooO0O0.f28845OoooO00 = mutex8;
                                                oooO0O0.f28848OoooOOO = 12;
                                                if (mutex8.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope1110 = coroutineScope;
                                                oooO00o10 = oooO00o9;
                                                mutex9 = mutex8;
                                                coroutineScope10 = coroutineScope1110;
                                                o000o0oo3 = oooO00o10.f28869OooO0O0;
                                                oooO0O0.f28840Oooo0o = o000o002;
                                                oooO0O0.f28841Oooo0oO = coroutineScope10;
                                                oooO0O0.f28842Oooo0oo = loadType11;
                                                oooO0O0.f28839Oooo = mutex9;
                                                oooO0O0.f28845OoooO00 = null;
                                                oooO0O0.f28848OoooOOO = 13;
                                                if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                coroutineScope11 = coroutineScope10;
                                                o000o0014 = o000o002;
                                                r1 = mutex9;
                                                Unit unit1113 = Unit.INSTANCE;
                                                r1.unlock(null);
                                                coroutineScope9 = coroutineScope11;
                                                o000o0013 = o000o0014;
                                            } else {
                                                o000o0013 = o000o002;
                                                coroutineScope9 = coroutineScope;
                                                loadType12 = loadType11;
                                            }
                                            if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                o000o0016 = o000o0013;
                                                o00oo0o3 = null;
                                                loadType15 = loadType12;
                                            } else {
                                                oooO00o11 = o000o0013.f28795OooOO0O;
                                                mutex10 = oooO00o11.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope9;
                                                oooO0O0.f28842Oooo0oo = loadType12;
                                                oooO0O0.f28839Oooo = oooO00o11;
                                                oooO0O0.f28845OoooO00 = mutex10;
                                                oooO0O0.f28844OoooO0 = loadType12;
                                                oooO0O0.f28846OoooO0O = o000o0013;
                                                oooO0O0.f28848OoooOOO = 14;
                                                if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0015 = o000o0013;
                                                loadType13 = loadType12;
                                                loadType14 = loadType13;
                                                mutex11 = mutex10;
                                                o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                                mutex11.unlock(null);
                                                loadType15 = loadType13;
                                                loadType12 = loadType14;
                                                o000o0016 = o000o0013;
                                                o000o0013 = o000o0015;
                                            }
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope9;
                                            oooO0O0.f28842Oooo0oo = loadType12;
                                            oooO0O0.f28839Oooo = null;
                                            oooO0O0.f28845OoooO00 = null;
                                            oooO0O0.f28844OoooO0 = null;
                                            oooO0O0.f28846OoooO0O = null;
                                            oooO0O0.f28848OoooOOO = 15;
                                            if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            coroutineScope12 = coroutineScope9;
                                            if (loadType12 == LoadType.REFRESH) {
                                                oooO00o12 = o000o0013.f28795OooOO0O;
                                                mutex12 = oooO00o12.f28868OooO00o;
                                                oooO0O0.f28840Oooo0o = o000o0013;
                                                oooO0O0.f28841Oooo0oO = coroutineScope12;
                                                oooO0O0.f28842Oooo0oo = oooO00o12;
                                                oooO0O0.f28839Oooo = mutex12;
                                                oooO0O0.f28848OoooOOO = 16;
                                                if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000o0017 = o000o0013;
                                                mutex13 = mutex12;
                                                oooO00o13 = oooO00o12;
                                                o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex13.unlock(null);
                                                if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                    o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 12:
                                        Mutex mutex18 = (Mutex) oooO0O0.f28845OoooO00;
                                        oooO00o10 = (o000O0Oo.OooO00o) oooO0O0.f28839Oooo;
                                        loadType11 = (LoadType) oooO0O0.f28842Oooo0oo;
                                        coroutineScope10 = (CoroutineScope) oooO0O0.f28841Oooo0oO;
                                        o000O000<Key, Value> o000o0022 = (o000O000) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000o002 = o000o0022;
                                        mutex9 = mutex18;
                                        o000o0oo3 = oooO00o10.f28869OooO0O0;
                                        oooO0O0.f28840Oooo0o = o000o002;
                                        oooO0O0.f28841Oooo0oO = coroutineScope10;
                                        oooO0O0.f28842Oooo0oo = loadType11;
                                        oooO0O0.f28839Oooo = mutex9;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28848OoooOOO = 13;
                                        if (o000o002.OooOO0(o000o0oo3, loadType11, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        coroutineScope11 = coroutineScope10;
                                        o000o0014 = o000o002;
                                        r1 = mutex9;
                                        Unit unit1114 = Unit.INSTANCE;
                                        r1.unlock(null);
                                        coroutineScope9 = coroutineScope11;
                                        o000o0013 = o000o0014;
                                        if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                            o000o0016 = o000o0013;
                                            o00oo0o3 = null;
                                            loadType15 = loadType12;
                                        } else {
                                            oooO00o11 = o000o0013.f28795OooOO0O;
                                            mutex10 = oooO00o11.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope9;
                                            oooO0O0.f28842Oooo0oo = loadType12;
                                            oooO0O0.f28839Oooo = oooO00o11;
                                            oooO0O0.f28845OoooO00 = mutex10;
                                            oooO0O0.f28844OoooO0 = loadType12;
                                            oooO0O0.f28846OoooO0O = o000o0013;
                                            oooO0O0.f28848OoooOOO = 14;
                                            if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0015 = o000o0013;
                                            loadType13 = loadType12;
                                            loadType14 = loadType13;
                                            mutex11 = mutex10;
                                            o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                            mutex11.unlock(null);
                                            loadType15 = loadType13;
                                            loadType12 = loadType14;
                                            o000o0016 = o000o0013;
                                            o000o0013 = o000o0015;
                                        }
                                        oooO0O0.f28840Oooo0o = o000o0013;
                                        oooO0O0.f28841Oooo0oO = coroutineScope9;
                                        oooO0O0.f28842Oooo0oo = loadType12;
                                        oooO0O0.f28839Oooo = null;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28848OoooOOO = 15;
                                        if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        coroutineScope12 = coroutineScope9;
                                        if (loadType12 == LoadType.REFRESH) {
                                            oooO00o12 = o000o0013.f28795OooOO0O;
                                            mutex12 = oooO00o12.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope12;
                                            oooO0O0.f28842Oooo0oo = oooO00o12;
                                            oooO0O0.f28839Oooo = mutex12;
                                            oooO0O0.f28848OoooOOO = 16;
                                            if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0017 = o000o0013;
                                            mutex13 = mutex12;
                                            oooO00o13 = oooO00o12;
                                            o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex13.unlock(null);
                                            if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 13:
                                        Mutex mutex19 = (Mutex) oooO0O0.f28839Oooo;
                                        loadType12 = (LoadType) oooO0O0.f28842Oooo0oo;
                                        coroutineScope11 = (CoroutineScope) oooO0O0.f28841Oooo0oO;
                                        o000o0014 = (o000O000) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        r1 = mutex19;
                                        Unit unit1115 = Unit.INSTANCE;
                                        r1.unlock(null);
                                        coroutineScope9 = coroutineScope11;
                                        o000o0013 = o000o0014;
                                        if (C0310OooO00o.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                            o000o0016 = o000o0013;
                                            o00oo0o3 = null;
                                            loadType15 = loadType12;
                                        } else {
                                            oooO00o11 = o000o0013.f28795OooOO0O;
                                            mutex10 = oooO00o11.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope9;
                                            oooO0O0.f28842Oooo0oo = loadType12;
                                            oooO0O0.f28839Oooo = oooO00o11;
                                            oooO0O0.f28845OoooO00 = mutex10;
                                            oooO0O0.f28844OoooO0 = loadType12;
                                            oooO0O0.f28846OoooO0O = o000o0013;
                                            oooO0O0.f28848OoooOOO = 14;
                                            if (mutex10.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0015 = o000o0013;
                                            loadType13 = loadType12;
                                            loadType14 = loadType13;
                                            mutex11 = mutex10;
                                            o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                            mutex11.unlock(null);
                                            loadType15 = loadType13;
                                            loadType12 = loadType14;
                                            o000o0016 = o000o0013;
                                            o000o0013 = o000o0015;
                                        }
                                        oooO0O0.f28840Oooo0o = o000o0013;
                                        oooO0O0.f28841Oooo0oO = coroutineScope9;
                                        oooO0O0.f28842Oooo0oo = loadType12;
                                        oooO0O0.f28839Oooo = null;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28848OoooOOO = 15;
                                        if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        coroutineScope12 = coroutineScope9;
                                        if (loadType12 == LoadType.REFRESH) {
                                            oooO00o12 = o000o0013.f28795OooOO0O;
                                            mutex12 = oooO00o12.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope12;
                                            oooO0O0.f28842Oooo0oo = oooO00o12;
                                            oooO0O0.f28839Oooo = mutex12;
                                            oooO0O0.f28848OoooOOO = 16;
                                            if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0017 = o000o0013;
                                            mutex13 = mutex12;
                                            oooO00o13 = oooO00o12;
                                            o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex13.unlock(null);
                                            if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 14:
                                        o000o0013 = (o000O000) oooO0O0.f28846OoooO0O;
                                        loadType13 = (LoadType) oooO0O0.f28844OoooO0;
                                        mutex11 = (Mutex) oooO0O0.f28845OoooO00;
                                        oooO00o11 = (o000O0Oo.OooO00o) oooO0O0.f28839Oooo;
                                        loadType14 = (LoadType) oooO0O0.f28842Oooo0oo;
                                        coroutineScope9 = (CoroutineScope) oooO0O0.f28841Oooo0oO;
                                        o000o0015 = (o000O000) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o00oo0o3 = (o00OO0O0) oooO00o11.f28869OooO0O0.f28866OooOO0O.get(loadType14);
                                        mutex11.unlock(null);
                                        loadType15 = loadType13;
                                        loadType12 = loadType14;
                                        o000o0016 = o000o0013;
                                        o000o0013 = o000o0015;
                                        oooO0O0.f28840Oooo0o = o000o0013;
                                        oooO0O0.f28841Oooo0oO = coroutineScope9;
                                        oooO0O0.f28842Oooo0oo = loadType12;
                                        oooO0O0.f28839Oooo = null;
                                        oooO0O0.f28845OoooO00 = null;
                                        oooO0O0.f28844OoooO0 = null;
                                        oooO0O0.f28846OoooO0O = null;
                                        oooO0O0.f28848OoooOOO = 15;
                                        if (o000O000.OooO0OO(o000o0016, loadType15, o00oo0o3, oooO0O0) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        coroutineScope12 = coroutineScope9;
                                        if (loadType12 == LoadType.REFRESH) {
                                            oooO00o12 = o000o0013.f28795OooOO0O;
                                            mutex12 = oooO00o12.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope12;
                                            oooO0O0.f28842Oooo0oo = oooO00o12;
                                            oooO0O0.f28839Oooo = mutex12;
                                            oooO0O0.f28848OoooOOO = 16;
                                            if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0017 = o000o0013;
                                            mutex13 = mutex12;
                                            oooO00o13 = oooO00o12;
                                            o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex13.unlock(null);
                                            if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 15:
                                        LoadType loadType17 = (LoadType) oooO0O0.f28842Oooo0oo;
                                        coroutineScope12 = (CoroutineScope) oooO0O0.f28841Oooo0oO;
                                        o000O000<Key, Value> o000o0023 = (o000O000) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        loadType12 = loadType17;
                                        o000o0013 = o000o0023;
                                        if (loadType12 == LoadType.REFRESH) {
                                            oooO00o12 = o000o0013.f28795OooOO0O;
                                            mutex12 = oooO00o12.f28868OooO00o;
                                            oooO0O0.f28840Oooo0o = o000o0013;
                                            oooO0O0.f28841Oooo0oO = coroutineScope12;
                                            oooO0O0.f28842Oooo0oo = oooO00o12;
                                            oooO0O0.f28839Oooo = mutex12;
                                            oooO0O0.f28848OoooOOO = 16;
                                            if (mutex12.lock(null, oooO0O0) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000o0017 = o000o0013;
                                            mutex13 = mutex12;
                                            oooO00o13 = oooO00o12;
                                            o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex13.unlock(null);
                                            if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                                o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    case 16:
                                        mutex13 = (Mutex) oooO0O0.f28839Oooo;
                                        oooO00o13 = (o000O0Oo.OooO00o) oooO0O0.f28842Oooo0oo;
                                        coroutineScope12 = (CoroutineScope) oooO0O0.f28841Oooo0oO;
                                        o000o0017 = (o000O000) oooO0O0.f28840Oooo0o;
                                        ResultKt.throwOnFailure(obj);
                                        o000000VarOooO00o3 = oooO00o13.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex13.unlock(null);
                                        if (!(o000000VarOooO00o3 instanceof o000000.OooO00o)) {
                                            o000O000.OooO0Oo(o000o0017, coroutineScope12);
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } catch (Throwable th8) {
                                r1.unlock(null);
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            r1.unlock(null);
                            throw th9;
                        }
                    } catch (Throwable th10) {
                        r1.unlock(null);
                        throw th10;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(Channel<Unit> channel, o000O000<Key, Value> o000o001, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f28836Oooo0oo = channel;
                this.f28833Oooo = o000o001;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f28836Oooo0oo, this.f28833Oooo, continuation);
                oooO0OO.f28835Oooo0oO = obj;
                return oooO0OO;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f28834Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f28835Oooo0oO;
                    Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.f28836Oooo0oo);
                    OooO00o oooO00o = new OooO00o(this.f28833Oooo, coroutineScope);
                    this.f28834Oooo0o = 1;
                    if (flowConsumeAsFlow.collect(oooO00o, this) == coroutine_suspended) {
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
        public OooO0o(o000O000<Key, Value> o000o001, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f28820OoooO0 = o000o001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f28820OoooO0, continuation);
            oooO0o.f28821OoooO00 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO0o) create((o00O0OO0) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00db A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00f0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:38:0x0104  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00O0OO0 o00o0oo1;
            o00O0O0<Key, Value> o00o0o0;
            o00O0<Key, Value> o00o0OooO00o;
            o000O0Oo.OooO00o<Key, Value> oooO00o;
            o00O0O0<Key, Value> o00o0o1;
            o00O0OO0 o00o0oo2;
            Mutex mutex;
            o000O000<Key, Value> o000o001;
            o000O0Oo.OooO00o<Key, Value> oooO00o2;
            Mutex mutex2;
            o00O0OO0 o00o0oo3;
            o000O0Oo.OooO00o<Key, Value> oooO00o3;
            o000000 o000000VarOooO00o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28816Oooo;
            try {
                if (i != 0) {
                    if (i == 1) {
                        mutex = this.f28819Oooo0oo;
                        oooO00o = (o000O0Oo.OooO00o) this.f28818Oooo0oO;
                        o00o0o1 = (o00O0O0) this.f28817Oooo0o;
                        o00o0oo2 = (o00O0OO0) this.f28821OoooO00;
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        o00o0oo1 = (o00O0OO0) this.f28821OoooO00;
                        ResultKt.throwOnFailure(obj);
                        oooO00o2 = this.f28820OoooO0.f28795OooOO0O;
                        mutex2 = oooO00o2.f28868OooO00o;
                        this.f28821OoooO00 = o00o0oo1;
                        this.f28817Oooo0o = oooO00o2;
                        this.f28818Oooo0oO = mutex2;
                        this.f28816Oooo = 3;
                        if (mutex2.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o00o0oo3 = o00o0oo1;
                        oooO00o3 = oooO00o2;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex3 = (Mutex) this.f28818Oooo0oO;
                        oooO00o3 = (o000O0Oo.OooO00o) this.f28817Oooo0o;
                        o00o0oo3 = (o00O0OO0) this.f28821OoooO00;
                        ResultKt.throwOnFailure(obj);
                        mutex2 = mutex3;
                    }
                    try {
                        o000000VarOooO00o = oooO00o3.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                        mutex2.unlock(null);
                        if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                            o000O000.OooO0Oo(this.f28820OoooO0, o00o0oo3);
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                ResultKt.throwOnFailure(obj);
                o00o0oo1 = (o00O0OO0) this.f28821OoooO00;
                if (!this.f28820OoooO0.f28785OooO.compareAndSet(false, true)) {
                    throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?".toString());
                }
                BuildersKt__Builders_commonKt.launch$default(o00o0oo1, null, null, new OooO00o(this.f28820OoooO0, o00o0oo1, null), 3, null);
                Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 6, null);
                BuildersKt__Builders_commonKt.launch$default(o00o0oo1, null, null, new OooO0O0(this.f28820OoooO0, channelChannel$default, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(o00o0oo1, null, null, new OooO0OO(channelChannel$default, this.f28820OoooO0, null), 3, null);
                o000O000<Key, Value> o000o002 = this.f28820OoooO0;
                o00o0o0 = o000o002.f28791OooO0o0;
                if (o00o0o0 != null) {
                    o00o0OooO00o = o000o002.f28790OooO0o;
                    if (o00o0OooO00o == null) {
                        o000O0Oo.OooO00o<Key, Value> oooO00o4 = o000o002.f28795OooOO0O;
                        Mutex mutex4 = oooO00o4.f28868OooO00o;
                        this.f28821OoooO00 = o00o0oo1;
                        this.f28817Oooo0o = o00o0o0;
                        this.f28818Oooo0oO = oooO00o4;
                        this.f28819Oooo0oo = mutex4;
                        this.f28816Oooo = 1;
                        if (mutex4.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oooO00o = oooO00o4;
                        o00o0o1 = o00o0o0;
                        o00o0oo2 = o00o0oo1;
                        mutex = mutex4;
                    }
                    o00o0o0.OooO0Oo(o00o0OooO00o);
                }
                o000o001 = this.f28820OoooO0;
                this.f28821OoooO00 = o00o0oo1;
                this.f28817Oooo0o = null;
                this.f28818Oooo0oO = null;
                this.f28819Oooo0oo = null;
                this.f28816Oooo = 2;
                if (o000o001.OooO0o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO00o2 = this.f28820OoooO0.f28795OooOO0O;
                mutex2 = oooO00o2.f28868OooO00o;
                this.f28821OoooO00 = o00o0oo1;
                this.f28817Oooo0o = oooO00o2;
                this.f28818Oooo0oO = mutex2;
                this.f28816Oooo = 3;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00o0oo3 = o00o0oo1;
                oooO00o3 = oooO00o2;
                o000000VarOooO00o = oooO00o3.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                mutex2.unlock(null);
                if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                    o000O000.OooO0Oo(this.f28820OoooO0, o00o0oo3);
                }
                return Unit.INSTANCE;
                o00o0OooO00o = oooO00o.f28869OooO0O0.OooO00o(null);
                mutex.unlock(null);
                o00o0oo1 = o00o0oo2;
                o00o0o0 = o00o0o1;
                o00o0o0.OooO0Oo(o00o0OooO00o);
                o000o001 = this.f28820OoooO0;
                this.f28821OoooO00 = o00o0oo1;
                this.f28817Oooo0o = null;
                this.f28818Oooo0oO = null;
                this.f28819Oooo0oo = null;
                this.f28816Oooo = 2;
                if (o000o001.OooO0o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO00o2 = this.f28820OoooO0.f28795OooOO0O;
                mutex2 = oooO00o2.f28868OooO00o;
                this.f28821OoooO00 = o00o0oo1;
                this.f28817Oooo0o = oooO00o2;
                this.f28818Oooo0oO = mutex2;
                this.f28816Oooo = 3;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00o0oo3 = o00o0oo1;
                oooO00o3 = oooO00o2;
                o000000VarOooO00o = oooO00o3.f28869OooO0O0.f28867OooOO0o.OooO00o(LoadType.REFRESH);
                mutex2.unlock(null);
                if (!(o000000VarOooO00o instanceof o000000.OooO00o)) {
                    o000O000.OooO0Oo(this.f28820OoooO0, o00o0oo3);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                mutex.unlock(null);
                throw th2;
            }
        }
    }

    public o000O000(@Nullable Key key, @NotNull o00O00o0<Key, Value> pagingSource, @NotNull o00O0000 config, @NotNull Flow<Unit> retryFlow, @Nullable o00O0O0<Key, Value> o00o0o0, @Nullable o00O0<Key, Value> o00o1, @NotNull Function0<Unit> invalidate) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(retryFlow, "retryFlow");
        Intrinsics.checkNotNullParameter(invalidate, "invalidate");
        this.f28786OooO00o = key;
        this.f28787OooO0O0 = pagingSource;
        this.f28788OooO0OO = config;
        this.f28789OooO0Oo = retryFlow;
        this.f28791OooO0o0 = o00o0o0;
        this.f28790OooO0o = o00o1;
        this.f28792OooO0oO = invalidate;
        if (!(config.f28929OooO0o == Integer.MIN_VALUE || pagingSource.OooO00o())) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.f28793OooO0oo = new o0ooOOo();
        this.f28785OooO = new AtomicBoolean(false);
        this.f28794OooOO0 = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.f28795OooOO0O = new o000O0Oo.OooO00o<>(config);
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f28796OooOO0o = completableJobJob$default;
        this.f28797OooOOO0 = FlowKt.onStart(OooOOOO.OooO00o(completableJobJob$default, new OooO0o(this, null)), new OooO(this, null));
    }

    public static final Object OooO00o(o000O000 o000o001, Flow flow, LoadType loadType, Continuation continuation) {
        Objects.requireNonNull(o000o001);
        Object objCollect = FlowKt.conflate(o00Ooo.OooO00o(o00Ooo.OooO0O0(flow, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, o000o001, loadType)), new o000O0o(loadType, null))).collect(new o000Oo0(o000o001, loadType), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x038f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0393  */
    /* JADX WARN: Code duplicated, block: B:105:0x0396  */
    /* JADX WARN: Code duplicated, block: B:108:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:111:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:117:0x040b  */
    /* JADX WARN: Code duplicated, block: B:119:0x040f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0423  */
    /* JADX WARN: Code duplicated, block: B:130:0x0427  */
    /* JADX WARN: Code duplicated, block: B:133:0x0445  */
    /* JADX WARN: Code duplicated, block: B:136:0x0469  */
    /* JADX WARN: Code duplicated, block: B:137:0x046c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0485  */
    /* JADX WARN: Code duplicated, block: B:146:0x048a  */
    /* JADX WARN: Code duplicated, block: B:149:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:157:0x04de A[Catch: all -> 0x0603, TRY_LEAVE, TryCatch #1 {all -> 0x0603, blocks: (B:155:0x04d4, B:157:0x04de, B:161:0x04fc, B:170:0x0524, B:172:0x0537, B:174:0x0541, B:176:0x0547, B:178:0x054c, B:177:0x054a, B:179:0x054f, B:183:0x0571), top: B:238:0x04d4 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0506  */
    /* JADX WARN: Code duplicated, block: B:169:0x0523  */
    /* JADX WARN: Code duplicated, block: B:172:0x0537 A[Catch: all -> 0x0603, TryCatch #1 {all -> 0x0603, blocks: (B:155:0x04d4, B:157:0x04de, B:161:0x04fc, B:170:0x0524, B:172:0x0537, B:174:0x0541, B:176:0x0547, B:178:0x054c, B:177:0x054a, B:179:0x054f, B:183:0x0571), top: B:238:0x04d4 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0547 A[Catch: all -> 0x0603, TryCatch #1 {all -> 0x0603, blocks: (B:155:0x04d4, B:157:0x04de, B:161:0x04fc, B:170:0x0524, B:172:0x0537, B:174:0x0541, B:176:0x0547, B:178:0x054c, B:177:0x054a, B:179:0x054f, B:183:0x0571), top: B:238:0x04d4 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x054a A[Catch: all -> 0x0603, TryCatch #1 {all -> 0x0603, blocks: (B:155:0x04d4, B:157:0x04de, B:161:0x04fc, B:170:0x0524, B:172:0x0537, B:174:0x0541, B:176:0x0547, B:178:0x054c, B:177:0x054a, B:179:0x054f, B:183:0x0571), top: B:238:0x04d4 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x057b  */
    /* JADX WARN: Code duplicated, block: B:190:0x058c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0595  */
    /* JADX WARN: Code duplicated, block: B:196:0x059a  */
    /* JADX WARN: Code duplicated, block: B:199:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:202:0x05a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:212:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:86:0x032d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0351  */
    /* JADX WARN: Code duplicated, block: B:92:0x0362  */
    /* JADX WARN: Code duplicated, block: B:94:0x036d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0370  */
    /* JADX WARN: Code duplicated, block: B:97:0x0376  */
    /* JADX WARN: Code duplicated, block: B:99:0x037c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v20, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v49, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.Object, o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r13v12, types: [o000o000.o00OO0O0] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.lang.Object, o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r13v27, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v34, types: [androidx.paging.LoadType] */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38, types: [o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v41, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [T] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v28, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [o000o000.o0000Ooo] */
    /* JADX WARN: Type inference failed for: r2v35, types: [o000o000.o0000Ooo] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v27, types: [o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r8v29, types: [o000o000.o00OO0O0] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, o000o000.o000O000] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x05a5 -> B:213:0x05f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x05a9 -> B:213:0x05f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x05ce -> B:244:0x05d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object OooO0O0(p089o000o000.o000O000 r17, androidx.paging.LoadType r18, p089o000o000.o00oO0o r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p089o000o000.o000O000.OooO0O0(o000o000.o000O000, androidx.paging.LoadType, o000o000.o00oO0o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object OooO0OO(o000O000 o000o001, LoadType loadType, o00OO0O0 viewportHint, Continuation continuation) throws Throwable {
        Objects.requireNonNull(o000o001);
        boolean z = true;
        if (OooO00o.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object objOooO0o = o000o001.OooO0o(continuation);
            return objOooO0o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0o : Unit.INSTANCE;
        }
        if (!(viewportHint != null)) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
        }
        o0ooOOo o0ooooo2 = o000o001.f28793OooO0oo;
        Objects.requireNonNull(o0ooooo2);
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        if (loadType != LoadType.PREPEND && loadType != LoadType.APPEND) {
            z = false;
        }
        if (z) {
            o0ooooo2.f29070OooO00o.OooO00o(null, new o0OOO0o(loadType, viewportHint));
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public static final void OooO0Oo(o000O000 o000o001, CoroutineScope coroutineScope) {
        if (o000o001.f28788OooO0OO.f28929OooO0o != Integer.MIN_VALUE) {
            Iterator it = CollectionsKt.listOf((Object[]) new LoadType[]{LoadType.APPEND, LoadType.PREPEND}).iterator();
            while (it.hasNext()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$1$1(o000o001, (LoadType) it.next(), null), 3, null);
            }
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o000O00O(o000o001, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o000O0(o000o001, null), 3, null);
    }

    public final Object OooO(o000O0Oo<Key, Value> o000o0oo2, LoadType loadType, o000000.OooO00o oooO00o, Continuation<? super Unit> continuation) {
        if (Intrinsics.areEqual(o000o0oo2.f28867OooOO0o.OooO00o(loadType), oooO00o)) {
            return Unit.INSTANCE;
        }
        o000o0oo2.f28867OooOO0o.OooO0O0(loadType, oooO00o);
        Object objSend = this.f28794OooOO0.send(new o0000O0O.OooO0OO(o000o0oo2.f28867OooOO0o.OooO0Oo(), null), continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0234  */
    /* JADX WARN: Code duplicated, block: B:108:0x0242  */
    /* JADX WARN: Code duplicated, block: B:110:0x0246  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x013d A[Catch: all -> 0x01f4, TryCatch #1 {all -> 0x01f4, blocks: (B:47:0x0123, B:49:0x013d, B:50:0x0146, B:52:0x014d), top: B:118:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x014d A[Catch: all -> 0x01f4, TRY_LEAVE, TryCatch #1 {all -> 0x01f4, blocks: (B:47:0x0123, B:49:0x013d, B:50:0x0146, B:52:0x014d), top: B:118:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x015b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:61:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0213 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0233 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v26, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlinx.coroutines.sync.Mutex] */
    public final Object OooO0o(Continuation<? super Unit> continuation) throws Throwable {
        OooO0OO oooO0OO;
        o000O0Oo.OooO00o<Key, Value> oooO00o;
        o000O000 o000o001;
        Mutex mutex;
        o000O0Oo<Key, Value> o000o0oo2;
        LoadType loadType;
        o000O000 o000o002;
        o000O000 o000o003;
        o00O00o0.OooO0O0 oooO0O0;
        o000O0Oo.OooO00o<Key, Value> oooO00o2;
        Mutex mutex2;
        o000O0Oo.OooO00o<Key, Value> oooO00o3;
        Mutex mutex3;
        o000O0Oo<Key, Value> o000o0oo3;
        boolean zOooO0oO;
        o00O00o0.OooO0O0 oooO0O1;
        o000O000 o000o004;
        o000O0Oo.OooO00o<Key, Value> oooO00o4;
        Mutex mutex4;
        Mutex mutex5;
        Channel<o0000O0O<Value>> channel;
        o0000O0O<Value> o0000o0oOooOO0;
        o00O00o0.OooO0O0.OooO0OO oooO0OO2;
        o000O0Oo.OooO00o<Key, Value> oooO00o5;
        Mutex mutex6;
        Mutex mutex7;
        o000O000 o000o005;
        o00O0<Key, Value> o00o0OooO00o;
        o00O00o0.OooO0O0.OooO0OO oooO0OO3;
        o000O0Oo<Key, Value> o000o0oo4;
        o000000.OooO00o oooO00o6;
        LoadType loadType2;
        Mutex mutex8;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f28815OoooO0O;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f28815OoooO0O = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, continuation);
            }
        } else {
            oooO0OO = new OooO0OO(this, continuation);
        }
        Object objOooO0Oo = oooO0OO.f28814OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = oooO0OO.f28815OoooO0O;
        try {
            try {
                switch (r2) {
                    case 0:
                        ResultKt.throwOnFailure(objOooO0Oo);
                        oooO00o = this.f28795OooOO0O;
                        Mutex mutex9 = oooO00o.f28868OooO00o;
                        oooO0OO.f28810Oooo0o = this;
                        oooO0OO.f28811Oooo0oO = oooO00o;
                        oooO0OO.f28812Oooo0oo = mutex9;
                        oooO0OO.f28815OoooO0O = 1;
                        if (mutex9.lock(null, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o001 = this;
                        mutex = mutex9;
                        o000o0oo2 = oooO00o.f28869OooO0O0;
                        loadType = LoadType.REFRESH;
                        oooO0OO.f28810Oooo0o = o000o001;
                        oooO0OO.f28811Oooo0oO = mutex;
                        oooO0OO.f28812Oooo0oo = null;
                        oooO0OO.f28815OoooO0O = 2;
                        if (o000o001.OooOO0(o000o0oo2, loadType, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o002 = o000o001;
                        r2 = mutex;
                        Unit unit = Unit.INSTANCE;
                        r2.unlock(null);
                        o00O00o0.OooO00o<Key> oooO00oOooO0oO = o000o002.OooO0oO(LoadType.REFRESH, o000o002.f28786OooO00o);
                        o00O00o0<Key, Value> o00o00o1 = o000o002.f28787OooO0O0;
                        oooO0OO.f28810Oooo0o = o000o002;
                        oooO0OO.f28811Oooo0oO = null;
                        oooO0OO.f28815OoooO0O = 3;
                        objOooO0Oo = o00o00o1.OooO0Oo(oooO00oOooO0oO, oooO0OO);
                        if (objOooO0Oo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o003 = o000o002;
                        oooO0O0 = (o00O00o0.OooO0O0) objOooO0Oo;
                        if (oooO0O0 instanceof o00O00o0.OooO0O0.OooO0OO) {
                            oooO00o3 = o000o003.f28795OooOO0O;
                            mutex3 = oooO00o3.f28868OooO00o;
                            oooO0OO.f28810Oooo0o = o000o003;
                            oooO0OO.f28811Oooo0oO = oooO0O0;
                            oooO0OO.f28812Oooo0oo = oooO00o3;
                            oooO0OO.f28809Oooo = mutex3;
                            oooO0OO.f28815OoooO0O = 4;
                            if (mutex3.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            try {
                                o000o0oo3 = oooO00o3.f28869OooO0O0;
                                LoadType loadType3 = LoadType.REFRESH;
                                zOooO0oO = o000o0oo3.OooO0oO(0, loadType3, (o00O00o0.OooO0O0.OooO0OO) oooO0O0);
                                o000o0oo3.f28867OooOO0o.OooO0O0(loadType3, o000000.OooO0OO.f28699OooO0OO);
                                if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28949OooO0O0 == null) {
                                    o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.PREPEND, o000000.OooO0OO.f28698OooO0O0);
                                }
                                if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28950OooO0OO == null) {
                                    o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.APPEND, o000000.OooO0OO.f28698OooO0O0);
                                }
                                mutex3.unlock(null);
                                if (zOooO0oO) {
                                    oooO00o4 = o000o003.f28795OooOO0O;
                                    mutex4 = oooO00o4.f28868OooO00o;
                                    oooO0OO.f28810Oooo0o = o000o003;
                                    oooO0OO.f28811Oooo0oO = oooO0O0;
                                    oooO0OO.f28812Oooo0oo = oooO00o4;
                                    oooO0OO.f28809Oooo = mutex4;
                                    oooO0OO.f28815OoooO0O = 5;
                                    if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex5 = mutex4;
                                    o000O0Oo<Key, Value> o000o0oo5 = oooO00o4.f28869OooO0O0;
                                    channel = o000o003.f28794OooOO0;
                                    o0000o0oOooOO0 = o000o0oo5.OooOO0((o00O00o0.OooO0O0.OooO0OO) oooO0O0, LoadType.REFRESH);
                                    oooO0OO.f28810Oooo0o = o000o003;
                                    oooO0OO.f28811Oooo0oO = oooO0O0;
                                    oooO0OO.f28812Oooo0oo = mutex5;
                                    oooO0OO.f28809Oooo = null;
                                    oooO0OO.f28815OoooO0O = 6;
                                    if (channel.send(o0000o0oOooOO0, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    oooO0O1 = oooO0O0;
                                    o000o004 = o000o003;
                                    r2 = mutex5;
                                    Unit unit2 = Unit.INSTANCE;
                                    r2.unlock(null);
                                } else {
                                    oooO0O1 = oooO0O0;
                                    o000o004 = o000o003;
                                }
                                if (o000o004.f28791OooO0o0 != null) {
                                    oooO0OO2 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                                    if (oooO0OO2.f28949OooO0O0 != null || oooO0OO2.f28950OooO0OO == null) {
                                        oooO00o5 = o000o004.f28795OooOO0O;
                                        mutex6 = oooO00o5.f28868OooO00o;
                                        oooO0OO.f28810Oooo0o = o000o004;
                                        oooO0OO.f28811Oooo0oO = oooO0O1;
                                        oooO0OO.f28812Oooo0oo = oooO00o5;
                                        oooO0OO.f28809Oooo = mutex6;
                                        oooO0OO.f28815OoooO0O = 7;
                                        if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex7 = mutex6;
                                        o000o005 = o000o004;
                                        try {
                                            o00o0OooO00o = oooO00o5.f28869OooO0O0.OooO00o(o000o005.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
                                            mutex7.unlock(null);
                                            oooO0OO3 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                                            if (oooO0OO3.f28949OooO0O0 == null) {
                                                o000o005.f28791OooO0o0.OooO0O0(LoadType.PREPEND, o00o0OooO00o);
                                            }
                                            if (oooO0OO3.f28950OooO0OO == null) {
                                                o000o005.f28791OooO0o0.OooO0O0(LoadType.APPEND, o00o0OooO00o);
                                            }
                                        } catch (Throwable th) {
                                            mutex7.unlock(null);
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                mutex3.unlock(null);
                                throw th2;
                            }
                            break;
                        } else {
                            if (oooO0O0 instanceof o00O00o0.OooO0O0.OooO00o) {
                                oooO00o2 = o000o003.f28795OooOO0O;
                                mutex2 = oooO00o2.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = oooO00o2;
                                oooO0OO.f28809Oooo = mutex2;
                                oooO0OO.f28815OoooO0O = 8;
                                if (mutex2.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                try {
                                    o000o0oo4 = oooO00o2.f28869OooO0O0;
                                    oooO00o6 = new o000000.OooO00o(((o00O00o0.OooO0O0.OooO00o) oooO0O0).f28947OooO00o);
                                    loadType2 = LoadType.REFRESH;
                                    oooO0OO.f28810Oooo0o = mutex2;
                                    oooO0OO.f28811Oooo0oO = null;
                                    oooO0OO.f28812Oooo0oo = null;
                                    oooO0OO.f28809Oooo = null;
                                    oooO0OO.f28815OoooO0O = 9;
                                    if (o000o003.OooO(o000o0oo4, loadType2, oooO00o6, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex8 = mutex2;
                                    Unit unit3 = Unit.INSTANCE;
                                    mutex8.unlock(null);
                                    return unit3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                            if (oooO0O0 instanceof o00O00o0.OooO0O0.C0312OooO0O0) {
                                Job.DefaultImpls.cancel$default((Job) o000o003.f28796OooOO0o, (CancellationException) null, 1, (Object) null);
                                o000o003.f28787OooO0O0.OooO0OO();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Mutex mutex10 = (Mutex) oooO0OO.f28812Oooo0oo;
                        oooO00o = (o000O0Oo.OooO00o) oooO0OO.f28811Oooo0oO;
                        o000o001 = (o000O000) oooO0OO.f28810Oooo0o;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        mutex = mutex10;
                        o000o0oo2 = oooO00o.f28869OooO0O0;
                        loadType = LoadType.REFRESH;
                        oooO0OO.f28810Oooo0o = o000o001;
                        oooO0OO.f28811Oooo0oO = mutex;
                        oooO0OO.f28812Oooo0oo = null;
                        oooO0OO.f28815OoooO0O = 2;
                        if (o000o001.OooOO0(o000o0oo2, loadType, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o002 = o000o001;
                        r2 = mutex;
                        Unit unit4 = Unit.INSTANCE;
                        r2.unlock(null);
                        o00O00o0.OooO00o<Key> oooO00oOooO0oO2 = o000o002.OooO0oO(LoadType.REFRESH, o000o002.f28786OooO00o);
                        o00O00o0<Key, Value> o00o00o2 = o000o002.f28787OooO0O0;
                        oooO0OO.f28810Oooo0o = o000o002;
                        oooO0OO.f28811Oooo0oO = null;
                        oooO0OO.f28815OoooO0O = 3;
                        objOooO0Oo = o00o00o2.OooO0Oo(oooO00oOooO0oO2, oooO0OO);
                        if (objOooO0Oo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o003 = o000o002;
                        oooO0O0 = (o00O00o0.OooO0O0) objOooO0Oo;
                        if (oooO0O0 instanceof o00O00o0.OooO0O0.OooO0OO) {
                            oooO00o3 = o000o003.f28795OooOO0O;
                            mutex3 = oooO00o3.f28868OooO00o;
                            oooO0OO.f28810Oooo0o = o000o003;
                            oooO0OO.f28811Oooo0oO = oooO0O0;
                            oooO0OO.f28812Oooo0oo = oooO00o3;
                            oooO0OO.f28809Oooo = mutex3;
                            oooO0OO.f28815OoooO0O = 4;
                            if (mutex3.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000o0oo3 = oooO00o3.f28869OooO0O0;
                            LoadType loadType4 = LoadType.REFRESH;
                            zOooO0oO = o000o0oo3.OooO0oO(0, loadType4, (o00O00o0.OooO0O0.OooO0OO) oooO0O0);
                            o000o0oo3.f28867OooOO0o.OooO0O0(loadType4, o000000.OooO0OO.f28699OooO0OO);
                            if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28949OooO0O0 == null) {
                                o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.PREPEND, o000000.OooO0OO.f28698OooO0O0);
                            }
                            if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28950OooO0OO == null) {
                                o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.APPEND, o000000.OooO0OO.f28698OooO0O0);
                            }
                            mutex3.unlock(null);
                            if (zOooO0oO) {
                                oooO00o4 = o000o003.f28795OooOO0O;
                                mutex4 = oooO00o4.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = oooO00o4;
                                oooO0OO.f28809Oooo = mutex4;
                                oooO0OO.f28815OoooO0O = 5;
                                if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex5 = mutex4;
                                o000O0Oo<Key, Value> o000o0oo6 = oooO00o4.f28869OooO0O0;
                                channel = o000o003.f28794OooOO0;
                                o0000o0oOooOO0 = o000o0oo6.OooOO0((o00O00o0.OooO0O0.OooO0OO) oooO0O0, LoadType.REFRESH);
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = mutex5;
                                oooO0OO.f28809Oooo = null;
                                oooO0OO.f28815OoooO0O = 6;
                                if (channel.send(o0000o0oOooOO0, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooO0O1 = oooO0O0;
                                o000o004 = o000o003;
                                r2 = mutex5;
                                Unit unit5 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                oooO0O1 = oooO0O0;
                                o000o004 = o000o003;
                            }
                            if (o000o004.f28791OooO0o0 != null) {
                                oooO0OO2 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                                if (oooO0OO2.f28949OooO0O0 != null) {
                                }
                                oooO00o5 = o000o004.f28795OooOO0O;
                                mutex6 = oooO00o5.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o004;
                                oooO0OO.f28811Oooo0oO = oooO0O1;
                                oooO0OO.f28812Oooo0oo = oooO00o5;
                                oooO0OO.f28809Oooo = mutex6;
                                oooO0OO.f28815OoooO0O = 7;
                                if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex7 = mutex6;
                                o000o005 = o000o004;
                                o00o0OooO00o = oooO00o5.f28869OooO0O0.OooO00o(o000o005.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
                                mutex7.unlock(null);
                                oooO0OO3 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                                if (oooO0OO3.f28949OooO0O0 == null) {
                                    o000o005.f28791OooO0o0.OooO0O0(LoadType.PREPEND, o00o0OooO00o);
                                }
                                if (oooO0OO3.f28950OooO0OO == null) {
                                    o000o005.f28791OooO0o0.OooO0O0(LoadType.APPEND, o00o0OooO00o);
                                }
                            }
                            break;
                        } else {
                            if (oooO0O0 instanceof o00O00o0.OooO0O0.OooO00o) {
                                oooO00o2 = o000o003.f28795OooOO0O;
                                mutex2 = oooO00o2.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = oooO00o2;
                                oooO0OO.f28809Oooo = mutex2;
                                oooO0OO.f28815OoooO0O = 8;
                                if (mutex2.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                o000o0oo4 = oooO00o2.f28869OooO0O0;
                                oooO00o6 = new o000000.OooO00o(((o00O00o0.OooO0O0.OooO00o) oooO0O0).f28947OooO00o);
                                loadType2 = LoadType.REFRESH;
                                oooO0OO.f28810Oooo0o = mutex2;
                                oooO0OO.f28811Oooo0oO = null;
                                oooO0OO.f28812Oooo0oo = null;
                                oooO0OO.f28809Oooo = null;
                                oooO0OO.f28815OoooO0O = 9;
                                if (o000o003.OooO(o000o0oo4, loadType2, oooO00o6, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex8 = mutex2;
                                Unit unit6 = Unit.INSTANCE;
                                mutex8.unlock(null);
                                return unit6;
                            }
                            if (oooO0O0 instanceof o00O00o0.OooO0O0.C0312OooO0O0) {
                                Job.DefaultImpls.cancel$default((Job) o000o003.f28796OooOO0o, (CancellationException) null, 1, (Object) null);
                                o000o003.f28787OooO0O0.OooO0OO();
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Mutex mutex11 = (Mutex) oooO0OO.f28811Oooo0oO;
                        o000o002 = (o000O000) oooO0OO.f28810Oooo0o;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        r2 = mutex11;
                        Unit unit7 = Unit.INSTANCE;
                        r2.unlock(null);
                        o00O00o0.OooO00o<Key> oooO00oOooO0oO3 = o000o002.OooO0oO(LoadType.REFRESH, o000o002.f28786OooO00o);
                        o00O00o0<Key, Value> o00o00o3 = o000o002.f28787OooO0O0;
                        oooO0OO.f28810Oooo0o = o000o002;
                        oooO0OO.f28811Oooo0oO = null;
                        oooO0OO.f28815OoooO0O = 3;
                        objOooO0Oo = o00o00o3.OooO0Oo(oooO00oOooO0oO3, oooO0OO);
                        if (objOooO0Oo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o003 = o000o002;
                        oooO0O0 = (o00O00o0.OooO0O0) objOooO0Oo;
                        if (oooO0O0 instanceof o00O00o0.OooO0O0.OooO0OO) {
                            oooO00o3 = o000o003.f28795OooOO0O;
                            mutex3 = oooO00o3.f28868OooO00o;
                            oooO0OO.f28810Oooo0o = o000o003;
                            oooO0OO.f28811Oooo0oO = oooO0O0;
                            oooO0OO.f28812Oooo0oo = oooO00o3;
                            oooO0OO.f28809Oooo = mutex3;
                            oooO0OO.f28815OoooO0O = 4;
                            if (mutex3.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000o0oo3 = oooO00o3.f28869OooO0O0;
                            LoadType loadType5 = LoadType.REFRESH;
                            zOooO0oO = o000o0oo3.OooO0oO(0, loadType5, (o00O00o0.OooO0O0.OooO0OO) oooO0O0);
                            o000o0oo3.f28867OooOO0o.OooO0O0(loadType5, o000000.OooO0OO.f28699OooO0OO);
                            if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28949OooO0O0 == null) {
                                o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.PREPEND, o000000.OooO0OO.f28698OooO0O0);
                            }
                            if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28950OooO0OO == null) {
                                o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.APPEND, o000000.OooO0OO.f28698OooO0O0);
                            }
                            mutex3.unlock(null);
                            if (zOooO0oO) {
                                oooO00o4 = o000o003.f28795OooOO0O;
                                mutex4 = oooO00o4.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = oooO00o4;
                                oooO0OO.f28809Oooo = mutex4;
                                oooO0OO.f28815OoooO0O = 5;
                                if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex5 = mutex4;
                                o000O0Oo<Key, Value> o000o0oo7 = oooO00o4.f28869OooO0O0;
                                channel = o000o003.f28794OooOO0;
                                o0000o0oOooOO0 = o000o0oo7.OooOO0((o00O00o0.OooO0O0.OooO0OO) oooO0O0, LoadType.REFRESH);
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = mutex5;
                                oooO0OO.f28809Oooo = null;
                                oooO0OO.f28815OoooO0O = 6;
                                if (channel.send(o0000o0oOooOO0, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooO0O1 = oooO0O0;
                                o000o004 = o000o003;
                                r2 = mutex5;
                                Unit unit8 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                oooO0O1 = oooO0O0;
                                o000o004 = o000o003;
                            }
                            if (o000o004.f28791OooO0o0 != null) {
                                oooO0OO2 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                                if (oooO0OO2.f28949OooO0O0 != null) {
                                }
                                oooO00o5 = o000o004.f28795OooOO0O;
                                mutex6 = oooO00o5.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o004;
                                oooO0OO.f28811Oooo0oO = oooO0O1;
                                oooO0OO.f28812Oooo0oo = oooO00o5;
                                oooO0OO.f28809Oooo = mutex6;
                                oooO0OO.f28815OoooO0O = 7;
                                if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex7 = mutex6;
                                o000o005 = o000o004;
                                o00o0OooO00o = oooO00o5.f28869OooO0O0.OooO00o(o000o005.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
                                mutex7.unlock(null);
                                oooO0OO3 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                                if (oooO0OO3.f28949OooO0O0 == null) {
                                    o000o005.f28791OooO0o0.OooO0O0(LoadType.PREPEND, o00o0OooO00o);
                                }
                                if (oooO0OO3.f28950OooO0OO == null) {
                                    o000o005.f28791OooO0o0.OooO0O0(LoadType.APPEND, o00o0OooO00o);
                                }
                            }
                            break;
                        } else {
                            if (oooO0O0 instanceof o00O00o0.OooO0O0.OooO00o) {
                                oooO00o2 = o000o003.f28795OooOO0O;
                                mutex2 = oooO00o2.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = oooO00o2;
                                oooO0OO.f28809Oooo = mutex2;
                                oooO0OO.f28815OoooO0O = 8;
                                if (mutex2.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                o000o0oo4 = oooO00o2.f28869OooO0O0;
                                oooO00o6 = new o000000.OooO00o(((o00O00o0.OooO0O0.OooO00o) oooO0O0).f28947OooO00o);
                                loadType2 = LoadType.REFRESH;
                                oooO0OO.f28810Oooo0o = mutex2;
                                oooO0OO.f28811Oooo0oO = null;
                                oooO0OO.f28812Oooo0oo = null;
                                oooO0OO.f28809Oooo = null;
                                oooO0OO.f28815OoooO0O = 9;
                                if (o000o003.OooO(o000o0oo4, loadType2, oooO00o6, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex8 = mutex2;
                                Unit unit9 = Unit.INSTANCE;
                                mutex8.unlock(null);
                                return unit9;
                            }
                            if (oooO0O0 instanceof o00O00o0.OooO0O0.C0312OooO0O0) {
                                Job.DefaultImpls.cancel$default((Job) o000o003.f28796OooOO0o, (CancellationException) null, 1, (Object) null);
                                o000o003.f28787OooO0O0.OooO0OO();
                            }
                        }
                        return Unit.INSTANCE;
                    case 3:
                        o000O000 o000o006 = (o000O000) oooO0OO.f28810Oooo0o;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        o000o003 = o000o006;
                        oooO0O0 = (o00O00o0.OooO0O0) objOooO0Oo;
                        if (oooO0O0 instanceof o00O00o0.OooO0O0.OooO0OO) {
                            oooO00o3 = o000o003.f28795OooOO0O;
                            mutex3 = oooO00o3.f28868OooO00o;
                            oooO0OO.f28810Oooo0o = o000o003;
                            oooO0OO.f28811Oooo0oO = oooO0O0;
                            oooO0OO.f28812Oooo0oo = oooO00o3;
                            oooO0OO.f28809Oooo = mutex3;
                            oooO0OO.f28815OoooO0O = 4;
                            if (mutex3.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000o0oo3 = oooO00o3.f28869OooO0O0;
                            LoadType loadType6 = LoadType.REFRESH;
                            zOooO0oO = o000o0oo3.OooO0oO(0, loadType6, (o00O00o0.OooO0O0.OooO0OO) oooO0O0);
                            o000o0oo3.f28867OooOO0o.OooO0O0(loadType6, o000000.OooO0OO.f28699OooO0OO);
                            if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28949OooO0O0 == null) {
                                o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.PREPEND, o000000.OooO0OO.f28698OooO0O0);
                            }
                            if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28950OooO0OO == null) {
                                o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.APPEND, o000000.OooO0OO.f28698OooO0O0);
                            }
                            mutex3.unlock(null);
                            if (zOooO0oO) {
                                oooO00o4 = o000o003.f28795OooOO0O;
                                mutex4 = oooO00o4.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = oooO00o4;
                                oooO0OO.f28809Oooo = mutex4;
                                oooO0OO.f28815OoooO0O = 5;
                                if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex5 = mutex4;
                                o000O0Oo<Key, Value> o000o0oo8 = oooO00o4.f28869OooO0O0;
                                channel = o000o003.f28794OooOO0;
                                o0000o0oOooOO0 = o000o0oo8.OooOO0((o00O00o0.OooO0O0.OooO0OO) oooO0O0, LoadType.REFRESH);
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = mutex5;
                                oooO0OO.f28809Oooo = null;
                                oooO0OO.f28815OoooO0O = 6;
                                if (channel.send(o0000o0oOooOO0, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooO0O1 = oooO0O0;
                                o000o004 = o000o003;
                                r2 = mutex5;
                                Unit unit10 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                oooO0O1 = oooO0O0;
                                o000o004 = o000o003;
                            }
                            if (o000o004.f28791OooO0o0 != null) {
                                oooO0OO2 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                                if (oooO0OO2.f28949OooO0O0 != null) {
                                }
                                oooO00o5 = o000o004.f28795OooOO0O;
                                mutex6 = oooO00o5.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o004;
                                oooO0OO.f28811Oooo0oO = oooO0O1;
                                oooO0OO.f28812Oooo0oo = oooO00o5;
                                oooO0OO.f28809Oooo = mutex6;
                                oooO0OO.f28815OoooO0O = 7;
                                if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex7 = mutex6;
                                o000o005 = o000o004;
                                o00o0OooO00o = oooO00o5.f28869OooO0O0.OooO00o(o000o005.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
                                mutex7.unlock(null);
                                oooO0OO3 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                                if (oooO0OO3.f28949OooO0O0 == null) {
                                    o000o005.f28791OooO0o0.OooO0O0(LoadType.PREPEND, o00o0OooO00o);
                                }
                                if (oooO0OO3.f28950OooO0OO == null) {
                                    o000o005.f28791OooO0o0.OooO0O0(LoadType.APPEND, o00o0OooO00o);
                                }
                            }
                            break;
                        } else {
                            if (oooO0O0 instanceof o00O00o0.OooO0O0.OooO00o) {
                                oooO00o2 = o000o003.f28795OooOO0O;
                                mutex2 = oooO00o2.f28868OooO00o;
                                oooO0OO.f28810Oooo0o = o000o003;
                                oooO0OO.f28811Oooo0oO = oooO0O0;
                                oooO0OO.f28812Oooo0oo = oooO00o2;
                                oooO0OO.f28809Oooo = mutex2;
                                oooO0OO.f28815OoooO0O = 8;
                                if (mutex2.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                o000o0oo4 = oooO00o2.f28869OooO0O0;
                                oooO00o6 = new o000000.OooO00o(((o00O00o0.OooO0O0.OooO00o) oooO0O0).f28947OooO00o);
                                loadType2 = LoadType.REFRESH;
                                oooO0OO.f28810Oooo0o = mutex2;
                                oooO0OO.f28811Oooo0oO = null;
                                oooO0OO.f28812Oooo0oo = null;
                                oooO0OO.f28809Oooo = null;
                                oooO0OO.f28815OoooO0O = 9;
                                if (o000o003.OooO(o000o0oo4, loadType2, oooO00o6, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex8 = mutex2;
                                Unit unit11 = Unit.INSTANCE;
                                mutex8.unlock(null);
                                return unit11;
                            }
                            if (oooO0O0 instanceof o00O00o0.OooO0O0.C0312OooO0O0) {
                                Job.DefaultImpls.cancel$default((Job) o000o003.f28796OooOO0o, (CancellationException) null, 1, (Object) null);
                                o000o003.f28787OooO0O0.OooO0OO();
                            }
                        }
                        return Unit.INSTANCE;
                    case 4:
                        mutex3 = oooO0OO.f28809Oooo;
                        oooO00o3 = (o000O0Oo.OooO00o) oooO0OO.f28812Oooo0oo;
                        oooO0O0 = (o00O00o0.OooO0O0) oooO0OO.f28811Oooo0oO;
                        o000o003 = (o000O000) oooO0OO.f28810Oooo0o;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        o000o0oo3 = oooO00o3.f28869OooO0O0;
                        LoadType loadType7 = LoadType.REFRESH;
                        zOooO0oO = o000o0oo3.OooO0oO(0, loadType7, (o00O00o0.OooO0O0.OooO0OO) oooO0O0);
                        o000o0oo3.f28867OooOO0o.OooO0O0(loadType7, o000000.OooO0OO.f28699OooO0OO);
                        if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28949OooO0O0 == null) {
                            o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.PREPEND, o000000.OooO0OO.f28698OooO0O0);
                        }
                        if (((o00O00o0.OooO0O0.OooO0OO) oooO0O0).f28950OooO0OO == null) {
                            o000o0oo3.f28867OooOO0o.OooO0O0(LoadType.APPEND, o000000.OooO0OO.f28698OooO0O0);
                            break;
                        }
                        mutex3.unlock(null);
                        if (zOooO0oO) {
                            oooO00o4 = o000o003.f28795OooOO0O;
                            mutex4 = oooO00o4.f28868OooO00o;
                            oooO0OO.f28810Oooo0o = o000o003;
                            oooO0OO.f28811Oooo0oO = oooO0O0;
                            oooO0OO.f28812Oooo0oo = oooO00o4;
                            oooO0OO.f28809Oooo = mutex4;
                            oooO0OO.f28815OoooO0O = 5;
                            if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex5 = mutex4;
                            o000O0Oo<Key, Value> o000o0oo9 = oooO00o4.f28869OooO0O0;
                            channel = o000o003.f28794OooOO0;
                            o0000o0oOooOO0 = o000o0oo9.OooOO0((o00O00o0.OooO0O0.OooO0OO) oooO0O0, LoadType.REFRESH);
                            oooO0OO.f28810Oooo0o = o000o003;
                            oooO0OO.f28811Oooo0oO = oooO0O0;
                            oooO0OO.f28812Oooo0oo = mutex5;
                            oooO0OO.f28809Oooo = null;
                            oooO0OO.f28815OoooO0O = 6;
                            if (channel.send(o0000o0oOooOO0, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            oooO0O1 = oooO0O0;
                            o000o004 = o000o003;
                            r2 = mutex5;
                            Unit unit12 = Unit.INSTANCE;
                            r2.unlock(null);
                        } else {
                            oooO0O1 = oooO0O0;
                            o000o004 = o000o003;
                        }
                        if (o000o004.f28791OooO0o0 != null) {
                            oooO0OO2 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                            if (oooO0OO2.f28949OooO0O0 != null) {
                            }
                            oooO00o5 = o000o004.f28795OooOO0O;
                            mutex6 = oooO00o5.f28868OooO00o;
                            oooO0OO.f28810Oooo0o = o000o004;
                            oooO0OO.f28811Oooo0oO = oooO0O1;
                            oooO0OO.f28812Oooo0oo = oooO00o5;
                            oooO0OO.f28809Oooo = mutex6;
                            oooO0OO.f28815OoooO0O = 7;
                            if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex7 = mutex6;
                            o000o005 = o000o004;
                            o00o0OooO00o = oooO00o5.f28869OooO0O0.OooO00o(o000o005.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
                            mutex7.unlock(null);
                            oooO0OO3 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                            if (oooO0OO3.f28949OooO0O0 == null) {
                                o000o005.f28791OooO0o0.OooO0O0(LoadType.PREPEND, o00o0OooO00o);
                            }
                            if (oooO0OO3.f28950OooO0OO == null) {
                                o000o005.f28791OooO0o0.OooO0O0(LoadType.APPEND, o00o0OooO00o);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        Mutex mutex12 = oooO0OO.f28809Oooo;
                        oooO00o4 = (o000O0Oo.OooO00o) oooO0OO.f28812Oooo0oo;
                        oooO0O0 = (o00O00o0.OooO0O0) oooO0OO.f28811Oooo0oO;
                        o000o003 = (o000O000) oooO0OO.f28810Oooo0o;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        mutex5 = mutex12;
                        o000O0Oo<Key, Value> o000o0oo10 = oooO00o4.f28869OooO0O0;
                        channel = o000o003.f28794OooOO0;
                        o0000o0oOooOO0 = o000o0oo10.OooOO0((o00O00o0.OooO0O0.OooO0OO) oooO0O0, LoadType.REFRESH);
                        oooO0OO.f28810Oooo0o = o000o003;
                        oooO0OO.f28811Oooo0oO = oooO0O0;
                        oooO0OO.f28812Oooo0oo = mutex5;
                        oooO0OO.f28809Oooo = null;
                        oooO0OO.f28815OoooO0O = 6;
                        if (channel.send(o0000o0oOooOO0, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oooO0O1 = oooO0O0;
                        o000o004 = o000o003;
                        r2 = mutex5;
                        Unit unit13 = Unit.INSTANCE;
                        r2.unlock(null);
                        if (o000o004.f28791OooO0o0 != null) {
                            oooO0OO2 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                            if (oooO0OO2.f28949OooO0O0 != null) {
                            }
                            oooO00o5 = o000o004.f28795OooOO0O;
                            mutex6 = oooO00o5.f28868OooO00o;
                            oooO0OO.f28810Oooo0o = o000o004;
                            oooO0OO.f28811Oooo0oO = oooO0O1;
                            oooO0OO.f28812Oooo0oo = oooO00o5;
                            oooO0OO.f28809Oooo = mutex6;
                            oooO0OO.f28815OoooO0O = 7;
                            if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex7 = mutex6;
                            o000o005 = o000o004;
                            o00o0OooO00o = oooO00o5.f28869OooO0O0.OooO00o(o000o005.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
                            mutex7.unlock(null);
                            oooO0OO3 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                            if (oooO0OO3.f28949OooO0O0 == null) {
                                o000o005.f28791OooO0o0.OooO0O0(LoadType.PREPEND, o00o0OooO00o);
                            }
                            if (oooO0OO3.f28950OooO0OO == null) {
                                o000o005.f28791OooO0o0.OooO0O0(LoadType.APPEND, o00o0OooO00o);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 6:
                        Mutex mutex13 = (Mutex) oooO0OO.f28812Oooo0oo;
                        oooO0O1 = (o00O00o0.OooO0O0) oooO0OO.f28811Oooo0oO;
                        o000o004 = (o000O000) oooO0OO.f28810Oooo0o;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        r2 = mutex13;
                        Unit unit14 = Unit.INSTANCE;
                        r2.unlock(null);
                        if (o000o004.f28791OooO0o0 != null) {
                            oooO0OO2 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                            if (oooO0OO2.f28949OooO0O0 != null) {
                            }
                            oooO00o5 = o000o004.f28795OooOO0O;
                            mutex6 = oooO00o5.f28868OooO00o;
                            oooO0OO.f28810Oooo0o = o000o004;
                            oooO0OO.f28811Oooo0oO = oooO0O1;
                            oooO0OO.f28812Oooo0oo = oooO00o5;
                            oooO0OO.f28809Oooo = mutex6;
                            oooO0OO.f28815OoooO0O = 7;
                            if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex7 = mutex6;
                            o000o005 = o000o004;
                            o00o0OooO00o = oooO00o5.f28869OooO0O0.OooO00o(o000o005.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
                            mutex7.unlock(null);
                            oooO0OO3 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                            if (oooO0OO3.f28949OooO0O0 == null) {
                                o000o005.f28791OooO0o0.OooO0O0(LoadType.PREPEND, o00o0OooO00o);
                            }
                            if (oooO0OO3.f28950OooO0OO == null) {
                                o000o005.f28791OooO0o0.OooO0O0(LoadType.APPEND, o00o0OooO00o);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 7:
                        mutex7 = oooO0OO.f28809Oooo;
                        oooO00o5 = (o000O0Oo.OooO00o) oooO0OO.f28812Oooo0oo;
                        oooO0O1 = (o00O00o0.OooO0O0) oooO0OO.f28811Oooo0oO;
                        o000o005 = (o000O000) oooO0OO.f28810Oooo0o;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        o00o0OooO00o = oooO00o5.f28869OooO0O0.OooO00o(o000o005.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
                        mutex7.unlock(null);
                        oooO0OO3 = (o00O00o0.OooO0O0.OooO0OO) oooO0O1;
                        if (oooO0OO3.f28949OooO0O0 == null) {
                            o000o005.f28791OooO0o0.OooO0O0(LoadType.PREPEND, o00o0OooO00o);
                        }
                        if (oooO0OO3.f28950OooO0OO == null) {
                            o000o005.f28791OooO0o0.OooO0O0(LoadType.APPEND, o00o0OooO00o);
                        }
                        return Unit.INSTANCE;
                    case 8:
                        mutex2 = oooO0OO.f28809Oooo;
                        oooO00o2 = (o000O0Oo.OooO00o) oooO0OO.f28812Oooo0oo;
                        oooO0O0 = (o00O00o0.OooO0O0) oooO0OO.f28811Oooo0oO;
                        o000o003 = (o000O000) oooO0OO.f28810Oooo0o;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        o000o0oo4 = oooO00o2.f28869OooO0O0;
                        oooO00o6 = new o000000.OooO00o(((o00O00o0.OooO0O0.OooO00o) oooO0O0).f28947OooO00o);
                        loadType2 = LoadType.REFRESH;
                        oooO0OO.f28810Oooo0o = mutex2;
                        oooO0OO.f28811Oooo0oO = null;
                        oooO0OO.f28812Oooo0oo = null;
                        oooO0OO.f28809Oooo = null;
                        oooO0OO.f28815OoooO0O = 9;
                        if (o000o003.OooO(o000o0oo4, loadType2, oooO00o6, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex8 = mutex2;
                        Unit unit15 = Unit.INSTANCE;
                        mutex8.unlock(null);
                        return unit15;
                    case 9:
                        mutex8 = (Mutex) oooO0OO.f28810Oooo0o;
                        try {
                            ResultKt.throwOnFailure(objOooO0Oo);
                            Unit unit16 = Unit.INSTANCE;
                            mutex8.unlock(null);
                            return unit16;
                        } catch (Throwable th4) {
                            th = th4;
                            mutex2 = mutex8;
                            mutex2.unlock(null);
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th5) {
                r2.unlock(null);
                throw th5;
            }
        } catch (Throwable th6) {
            r2.unlock(null);
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(@NotNull Continuation<? super o00O0<Key, Value>> continuation) {
        OooO0O0 oooO0O0;
        o000O0Oo.OooO00o<Key, Value> oooO00o;
        o000O000<Key, Value> o000o001;
        Mutex mutex;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f28807OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f28807OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(this, continuation);
        }
        Object obj = oooO0O0.f28803Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f28807OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            oooO00o = this.f28795OooOO0O;
            Mutex mutex2 = oooO00o.f28868OooO00o;
            oooO0O0.f28804Oooo0o = this;
            oooO0O0.f28805Oooo0oO = oooO00o;
            oooO0O0.f28806Oooo0oo = mutex2;
            oooO0O0.f28807OoooO0 = 1;
            if (mutex2.lock(null, oooO0O0) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000o001 = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = oooO0O0.f28806Oooo0oo;
            oooO00o = oooO0O0.f28805Oooo0oO;
            o000o001 = oooO0O0.f28804Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        try {
            return oooO00o.f28869OooO0O0.OooO00o(o000o001.f28793OooO0oo.f29070OooO00o.f29075OooO0OO);
        } finally {
            mutex.unlock(null);
        }
    }

    public final o00O00o0.OooO00o<Key> OooO0oO(LoadType loadType, Key key) {
        int i = loadType == LoadType.REFRESH ? this.f28788OooO0OO.f28928OooO0Oo : this.f28788OooO0OO.f28925OooO00o;
        boolean z = this.f28788OooO0OO.f28927OooO0OO;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i2 = oo00o.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i2 == 1) {
            return new o00O00o0.OooO00o.OooO0OO(key, i, z);
        }
        if (i2 == 2) {
            if (key != null) {
                return new o00O00o0.OooO00o.OooO0O0(key, i, z);
            }
            throw new IllegalArgumentException("key cannot be null for prepend".toString());
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (key != null) {
            return new o00O00o0.OooO00o.C0311OooO00o(key, i, z);
        }
        throw new IllegalArgumentException("key cannot be null for append".toString());
    }

    public final Key OooO0oo(o000O0Oo<Key, Value> o000o0oo2, LoadType loadType, int i, int i2) {
        int i3;
        Objects.requireNonNull(o000o0oo2);
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i4 = o000O0Oo.OooO0O0.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i4 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i4 == 2) {
            i3 = o000o0oo2.f28863OooO0oO;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = o000o0oo2.f28864OooO0oo;
        }
        if (i == i3 && !(o000o0oo2.f28867OooOO0o.OooO00o(loadType) instanceof o000000.OooO00o) && i2 < this.f28788OooO0OO.f28926OooO0O0) {
            return loadType == LoadType.PREPEND ? ((o00O00o0.OooO0O0.OooO0OO) CollectionsKt.first((List) o000o0oo2.f28859OooO0OO)).f28949OooO0O0 : ((o00O00o0.OooO0O0.OooO0OO) CollectionsKt.last((List) o000o0oo2.f28859OooO0OO)).f28950OooO0OO;
        }
        return null;
    }

    public final Object OooOO0(o000O0Oo<Key, Value> o000o0oo2, LoadType loadType, Continuation<? super Unit> continuation) {
        o000000 o000000VarOooO00o = o000o0oo2.f28867OooOO0o.OooO00o(loadType);
        o000000.OooO0O0 oooO0O0 = o000000.OooO0O0.f28697OooO0O0;
        if (Intrinsics.areEqual(o000000VarOooO00o, oooO0O0)) {
            return Unit.INSTANCE;
        }
        o000o0oo2.f28867OooOO0o.OooO0O0(loadType, oooO0O0);
        Object objSend = this.f28794OooOO0.send(new o0000O0O.OooO0OO(o000o0oo2.f28867OooOO0o.OooO0Oo(), null), continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }
}
