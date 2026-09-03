package androidx.paging;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final androidx.paging.OooO0O0<T> f10190OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<IndexedValue<Oooo000<T>>> f10191OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SharedFlow<IndexedValue<Oooo000<T>>> f10192OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Job f10193OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Flow<Oooo000<T>> f10194OooO0o0;

    /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO00o, reason: collision with other inner class name */
    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0166OooO00o extends SuspendLambda implements Function2<FlowCollector<? super Oooo000<T>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f10195OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooO00o<T> f10196OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f10197OooO0o0;

        /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0167OooO00o extends SuspendLambda implements Function2<IndexedValue<? extends Oooo000<T>>, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f10198OooO0Oo;

            public C0167OooO00o(Continuation<? super C0167OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0167OooO00o c0167OooO00o = new C0167OooO00o(continuation);
                c0167OooO00o.f10198OooO0Oo = obj;
                return c0167OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
                return ((C0167OooO00o) create((IndexedValue) obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((IndexedValue) this.f10198OooO0Oo) != null);
            }
        }

        /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO00o$OooO0O0 */
        public static final class OooO0O0<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f10199OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ FlowCollector<Oooo000<T>> f10200OooO0o0;

            /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {106}, m = "emit", n = {"this", "indexedValue"}, s = {"L$0", "L$1"})
            public static final class C0168OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public OooO0O0 f10201OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public /* synthetic */ Object f10202OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public IndexedValue f10203OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ OooO0O0<T> f10204OooO0oO;

                /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
                public int f10205OooO0oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0168OooO00o(OooO0O0<? super T> oooO0O0, Continuation<? super C0168OooO00o> continuation) {
                    super(continuation);
                    this.f10204OooO0oO = oooO0O0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f10202OooO0o = obj;
                    this.f10205OooO0oo |= Integer.MIN_VALUE;
                    return this.f10204OooO0oO.emit(null, this);
                }
            }

            public OooO0O0(FlowCollector flowCollector, Ref.IntRef intRef) {
                this.f10199OooO0Oo = intRef;
                this.f10200OooO0o0 = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object emit(@Nullable IndexedValue<? extends Oooo000<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
                C0168OooO00o c0168OooO00o;
                OooO0O0<T> oooO0O0;
                if (continuation instanceof C0168OooO00o) {
                    c0168OooO00o = (C0168OooO00o) continuation;
                    int i = c0168OooO00o.f10205OooO0oo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0168OooO00o.f10205OooO0oo = i - Integer.MIN_VALUE;
                    } else {
                        c0168OooO00o = new C0168OooO00o(this, continuation);
                    }
                } else {
                    c0168OooO00o = new C0168OooO00o(this, continuation);
                }
                Object obj = c0168OooO00o.f10202OooO0o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0168OooO00o.f10205OooO0oo;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNull(indexedValue);
                    if (indexedValue.getIndex() > this.f10199OooO0Oo.element) {
                        Oooo000<T> value = indexedValue.getValue();
                        c0168OooO00o.f10201OooO0Oo = this;
                        c0168OooO00o.f10203OooO0o0 = indexedValue;
                        c0168OooO00o.f10205OooO0oo = 1;
                        if (this.f10200OooO0o0.emit(value, c0168OooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oooO0O0 = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                indexedValue = c0168OooO00o.f10203OooO0o0;
                oooO0O0 = c0168OooO00o.f10201OooO0Oo;
                ResultKt.throwOnFailure(obj);
                oooO0O0.f10199OooO0Oo.element = indexedValue.getIndex();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0166OooO00o(OooO00o<T> oooO00o, Continuation<? super C0166OooO00o> continuation) {
            super(2, continuation);
            this.f10196OooO0o = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C0166OooO00o c0166OooO00o = new C0166OooO00o(this.f10196OooO0o, continuation);
            c0166OooO00o.f10197OooO0o0 = obj;
            return c0166OooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C0166OooO00o) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10195OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f10197OooO0o0;
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = Integer.MIN_VALUE;
                Flow flowTakeWhile = FlowKt.takeWhile(this.f10196OooO0o.f10192OooO0OO, new C0167OooO00o(null));
                OooO0O0 oooO0O0 = new OooO0O0(flowCollector, intRef);
                this.f10195OooO0Oo = 1;
                if (flowTakeWhile.collect(oooO0O0, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f10206OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooO00o<T> f10207OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Flow<Oooo000<T>> f10208OooO0o0;

        /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static final class C0169OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f10209OooO0Oo;

            /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {78, 79}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
            public static final class C0170OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public C0169OooO00o f10210OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public /* synthetic */ Object f10211OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public IndexedValue f10212OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ C0169OooO00o<T> f10213OooO0oO;

                /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
                public int f10214OooO0oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0170OooO00o(C0169OooO00o<? super T> c0169OooO00o, Continuation<? super C0170OooO00o> continuation) {
                    super(continuation);
                    this.f10213OooO0oO = c0169OooO00o;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f10211OooO0o = obj;
                    this.f10214OooO0oo |= Integer.MIN_VALUE;
                    return this.f10213OooO0oO.emit(null, this);
                }
            }

            public C0169OooO00o(OooO00o<T> oooO00o) {
                this.f10209OooO0Oo = oooO00o;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull IndexedValue<? extends Oooo000<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
                C0170OooO00o c0170OooO00o;
                C0169OooO00o<T> c0169OooO00o;
                if (continuation instanceof C0170OooO00o) {
                    c0170OooO00o = (C0170OooO00o) continuation;
                    int i = c0170OooO00o.f10214OooO0oo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0170OooO00o.f10214OooO0oo = i - Integer.MIN_VALUE;
                    } else {
                        c0170OooO00o = new C0170OooO00o(this, continuation);
                    }
                } else {
                    c0170OooO00o = new C0170OooO00o(this, continuation);
                }
                Object obj = c0170OooO00o.f10211OooO0o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0170OooO00o.f10214OooO0oo;
                if (i2 != 0) {
                    if (i2 == 1) {
                        indexedValue = c0170OooO00o.f10212OooO0o0;
                        c0169OooO00o = c0170OooO00o.f10210OooO0Oo;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<IndexedValue<Oooo000<T>>> mutableSharedFlow = this.f10209OooO0Oo.f10191OooO0O0;
                c0170OooO00o.f10210OooO0Oo = this;
                c0170OooO00o.f10212OooO0o0 = indexedValue;
                c0170OooO00o.f10214OooO0oo = 1;
                if (mutableSharedFlow.emit(indexedValue, c0170OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c0169OooO00o = this;
                androidx.paging.OooO0O0<T> oooO0O0 = c0169OooO00o.f10209OooO0Oo.f10190OooO00o;
                c0170OooO00o.f10210OooO0Oo = null;
                c0170OooO00o.f10212OooO0o0 = null;
                c0170OooO00o.f10214OooO0oo = 2;
                if (oooO0O0.OooO0O0(indexedValue, c0170OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Flow<? extends Oooo000<T>> flow, OooO00o<T> oooO00o, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f10208OooO0o0 = flow;
            this.f10207OooO0o = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f10208OooO0o0, this.f10207OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10206OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWithIndex = FlowKt.withIndex(this.f10208OooO0o0);
                C0169OooO00o c0169OooO00o = new C0169OooO00o(this.f10207OooO0o);
                this.f10206OooO0Oo = 1;
                if (flowWithIndex.collect(c0169OooO00o, this) == coroutine_suspended) {
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

    public static final class OooO0OO extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO00o<T> f10215OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO00o<T> oooO00o) {
            super(1);
            this.f10215OooO0Oo = oooO00o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            this.f10215OooO0Oo.f10191OooO0O0.tryEmit(null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", i = {0, 1}, l = {63, 68}, m = "invokeSuspend", n = {"$this$onSubscription", "$this$onSubscription"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/CachedPageEventFlow$sharedForDownstream$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1855#2,2:283\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/CachedPageEventFlow$sharedForDownstream$1\n*L\n67#1:283,2\n*E\n"})
    public static final class OooO0o extends SuspendLambda implements Function2<FlowCollector<? super IndexedValue<? extends Oooo000<T>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Iterator f10216OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f10217OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f10218OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OooO00o<T> f10219OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooO00o<T> oooO00o, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f10219OooO0oO = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f10219OooO0oO, continuation);
            oooO0o.f10217OooO0o = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO0o) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0054  */
        /* JADX WARN: Code duplicated, block: B:23:0x0066 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:? A[LOOP:0: B:15:0x004e->B:25:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            Iterator<T> it;
            IndexedValue indexedValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10218OooO0o0;
            OooO00o<T> oooO00o = this.f10219OooO0oO;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f10217OooO0o;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f10216OooO0Oo;
                    flowCollector2 = (FlowCollector) this.f10217OooO0o;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    indexedValue = (IndexedValue) it.next();
                    this.f10217OooO0o = flowCollector2;
                    this.f10216OooO0Oo = it;
                    this.f10218OooO0o0 = 2;
                    if (flowCollector2.emit(indexedValue, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.f10217OooO0o;
            androidx.paging.OooO0O0<T> oooO0O0 = oooO00o.f10190OooO00o;
            this.f10217OooO0o = flowCollector3;
            this.f10218OooO0o0 = 1;
            Object objOooO00o = oooO0O0.OooO00o(this);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector = flowCollector3;
            obj = objOooO00o;
            oooO00o.f10193OooO0Oo.start();
            flowCollector2 = flowCollector;
            it = ((List) obj).iterator();
            while (it.hasNext()) {
                indexedValue = (IndexedValue) it.next();
                this.f10217OooO0o = flowCollector2;
                this.f10216OooO0Oo = it;
                this.f10218OooO0o0 = 2;
                if (flowCollector2.emit(indexedValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public OooO00o(@NotNull Flow<? extends Oooo000<T>> src, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f10190OooO00o = new androidx.paging.OooO0O0<>();
        MutableSharedFlow<IndexedValue<Oooo000<T>>> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.f10191OooO0O0 = MutableSharedFlow;
        this.f10192OooO0OO = FlowKt.onSubscription(MutableSharedFlow, new OooO0o(this, null));
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, CoroutineStart.LAZY, new OooO0O0(src, this, null), 1, null);
        jobLaunch$default.invokeOnCompletion(new OooO0OO(this));
        this.f10193OooO0Oo = jobLaunch$default;
        this.f10194OooO0o0 = FlowKt.flow(new C0166OooO00o(this, null));
    }
}
