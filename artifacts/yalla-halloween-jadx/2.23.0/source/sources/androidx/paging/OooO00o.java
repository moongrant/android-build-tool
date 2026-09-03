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

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final androidx.paging.OooO0O0<T> f7096OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<IndexedValue<Oooo000<T>>> f7097OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SharedFlow<IndexedValue<Oooo000<T>>> f7098OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Job f7099OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Flow<Oooo000<T>> f7100OooO0o0;

    /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO00o, reason: collision with other inner class name */
    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0147OooO00o extends SuspendLambda implements Function2<FlowCollector<? super Oooo000<T>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7101OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooO00o<T> f7102OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f7103OooO0o0;

        /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0148OooO00o extends SuspendLambda implements Function2<IndexedValue<? extends Oooo000<T>>, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f7104OooO0Oo;

            public C0148OooO00o(Continuation<? super C0148OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0148OooO00o c0148OooO00o = new C0148OooO00o(continuation);
                c0148OooO00o.f7104OooO0Oo = obj;
                return c0148OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
                return ((C0148OooO00o) create((IndexedValue) obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((IndexedValue) this.f7104OooO0Oo) != null);
            }
        }

        /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO00o$OooO0O0 */
        public static final class OooO0O0<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f7105OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ FlowCollector<Oooo000<T>> f7106OooO0o0;

            /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {106}, m = "emit", n = {"this", "indexedValue"}, s = {"L$0", "L$1"})
            public static final class C0149OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public OooO0O0 f7107OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public /* synthetic */ Object f7108OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public IndexedValue f7109OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ OooO0O0<T> f7110OooO0oO;

                /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
                public int f7111OooO0oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0149OooO00o(OooO0O0<? super T> oooO0O0, Continuation<? super C0149OooO00o> continuation) {
                    super(continuation);
                    this.f7110OooO0oO = oooO0O0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f7108OooO0o = obj;
                    this.f7111OooO0oo |= Integer.MIN_VALUE;
                    return this.f7110OooO0oO.emit(null, this);
                }
            }

            public OooO0O0(FlowCollector flowCollector, Ref.IntRef intRef) {
                this.f7105OooO0Oo = intRef;
                this.f7106OooO0o0 = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object emit(@Nullable IndexedValue<? extends Oooo000<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
                C0149OooO00o c0149OooO00o;
                OooO0O0<T> oooO0O0;
                if (continuation instanceof C0149OooO00o) {
                    c0149OooO00o = (C0149OooO00o) continuation;
                    int i = c0149OooO00o.f7111OooO0oo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0149OooO00o.f7111OooO0oo = i - Integer.MIN_VALUE;
                    } else {
                        c0149OooO00o = new C0149OooO00o(this, continuation);
                    }
                } else {
                    c0149OooO00o = new C0149OooO00o(this, continuation);
                }
                Object obj = c0149OooO00o.f7108OooO0o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0149OooO00o.f7111OooO0oo;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNull(indexedValue);
                    if (indexedValue.getIndex() > this.f7105OooO0Oo.element) {
                        Oooo000<T> value = indexedValue.getValue();
                        c0149OooO00o.f7107OooO0Oo = this;
                        c0149OooO00o.f7109OooO0o0 = indexedValue;
                        c0149OooO00o.f7111OooO0oo = 1;
                        if (this.f7106OooO0o0.emit(value, c0149OooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oooO0O0 = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                indexedValue = c0149OooO00o.f7109OooO0o0;
                oooO0O0 = c0149OooO00o.f7107OooO0Oo;
                ResultKt.throwOnFailure(obj);
                oooO0O0.f7105OooO0Oo.element = indexedValue.getIndex();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0147OooO00o(OooO00o<T> oooO00o, Continuation<? super C0147OooO00o> continuation) {
            super(2, continuation);
            this.f7102OooO0o = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C0147OooO00o c0147OooO00o = new C0147OooO00o(this.f7102OooO0o, continuation);
            c0147OooO00o.f7103OooO0o0 = obj;
            return c0147OooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C0147OooO00o) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7101OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f7103OooO0o0;
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = Integer.MIN_VALUE;
                Flow flowTakeWhile = FlowKt.takeWhile(this.f7102OooO0o.f7098OooO0OO, new C0148OooO00o(null));
                OooO0O0 oooO0O0 = new OooO0O0(flowCollector, intRef);
                this.f7101OooO0Oo = 1;
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
        public int f7112OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooO00o<T> f7113OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Flow<Oooo000<T>> f7114OooO0o0;

        /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static final class C0150OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f7115OooO0Oo;

            /* JADX INFO: renamed from: androidx.paging.OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {78, 79}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
            public static final class C0151OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public C0150OooO00o f7116OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public /* synthetic */ Object f7117OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public IndexedValue f7118OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ C0150OooO00o<T> f7119OooO0oO;

                /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
                public int f7120OooO0oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0151OooO00o(C0150OooO00o<? super T> c0150OooO00o, Continuation<? super C0151OooO00o> continuation) {
                    super(continuation);
                    this.f7119OooO0oO = c0150OooO00o;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f7117OooO0o = obj;
                    this.f7120OooO0oo |= Integer.MIN_VALUE;
                    return this.f7119OooO0oO.emit(null, this);
                }
            }

            public C0150OooO00o(OooO00o<T> oooO00o) {
                this.f7115OooO0Oo = oooO00o;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull IndexedValue<? extends Oooo000<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
                C0151OooO00o c0151OooO00o;
                C0150OooO00o<T> c0150OooO00o;
                if (continuation instanceof C0151OooO00o) {
                    c0151OooO00o = (C0151OooO00o) continuation;
                    int i = c0151OooO00o.f7120OooO0oo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0151OooO00o.f7120OooO0oo = i - Integer.MIN_VALUE;
                    } else {
                        c0151OooO00o = new C0151OooO00o(this, continuation);
                    }
                } else {
                    c0151OooO00o = new C0151OooO00o(this, continuation);
                }
                Object obj = c0151OooO00o.f7117OooO0o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0151OooO00o.f7120OooO0oo;
                if (i2 != 0) {
                    if (i2 == 1) {
                        indexedValue = c0151OooO00o.f7118OooO0o0;
                        c0150OooO00o = c0151OooO00o.f7116OooO0Oo;
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
                MutableSharedFlow<IndexedValue<Oooo000<T>>> mutableSharedFlow = this.f7115OooO0Oo.f7097OooO0O0;
                c0151OooO00o.f7116OooO0Oo = this;
                c0151OooO00o.f7118OooO0o0 = indexedValue;
                c0151OooO00o.f7120OooO0oo = 1;
                if (mutableSharedFlow.emit(indexedValue, c0151OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c0150OooO00o = this;
                androidx.paging.OooO0O0<T> oooO0O0 = c0150OooO00o.f7115OooO0Oo.f7096OooO00o;
                c0151OooO00o.f7116OooO0Oo = null;
                c0151OooO00o.f7118OooO0o0 = null;
                c0151OooO00o.f7120OooO0oo = 2;
                if (oooO0O0.OooO0O0(indexedValue, c0151OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Flow<? extends Oooo000<T>> flow, OooO00o<T> oooO00o, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f7114OooO0o0 = flow;
            this.f7113OooO0o = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f7114OooO0o0, this.f7113OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7112OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWithIndex = FlowKt.withIndex(this.f7114OooO0o0);
                C0150OooO00o c0150OooO00o = new C0150OooO00o(this.f7113OooO0o);
                this.f7112OooO0Oo = 1;
                if (flowWithIndex.collect(c0150OooO00o, this) == coroutine_suspended) {
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
        public final /* synthetic */ OooO00o<T> f7121OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO00o<T> oooO00o) {
            super(1);
            this.f7121OooO0Oo = oooO00o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            this.f7121OooO0Oo.f7097OooO0O0.tryEmit(null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", i = {0, 1}, l = {63, 68}, m = "invokeSuspend", n = {"$this$onSubscription", "$this$onSubscription"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/CachedPageEventFlow$sharedForDownstream$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1855#2,2:283\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/CachedPageEventFlow$sharedForDownstream$1\n*L\n67#1:283,2\n*E\n"})
    public static final class OooO0o extends SuspendLambda implements Function2<FlowCollector<? super IndexedValue<? extends Oooo000<T>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Iterator f7122OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f7123OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7124OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OooO00o<T> f7125OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooO00o<T> oooO00o, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f7125OooO0oO = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f7125OooO0oO, continuation);
            oooO0o.f7123OooO0o = obj;
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
            int i = this.f7124OooO0o0;
            OooO00o<T> oooO00o = this.f7125OooO0oO;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f7123OooO0o;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f7122OooO0Oo;
                    flowCollector2 = (FlowCollector) this.f7123OooO0o;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    indexedValue = (IndexedValue) it.next();
                    this.f7123OooO0o = flowCollector2;
                    this.f7122OooO0Oo = it;
                    this.f7124OooO0o0 = 2;
                    if (flowCollector2.emit(indexedValue, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.f7123OooO0o;
            androidx.paging.OooO0O0<T> oooO0O0 = oooO00o.f7096OooO00o;
            this.f7123OooO0o = flowCollector3;
            this.f7124OooO0o0 = 1;
            Object objOooO00o = oooO0O0.OooO00o(this);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector = flowCollector3;
            obj = objOooO00o;
            oooO00o.f7099OooO0Oo.start();
            flowCollector2 = flowCollector;
            it = ((List) obj).iterator();
            while (it.hasNext()) {
                indexedValue = (IndexedValue) it.next();
                this.f7123OooO0o = flowCollector2;
                this.f7122OooO0Oo = it;
                this.f7124OooO0o0 = 2;
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
        this.f7096OooO00o = new androidx.paging.OooO0O0<>();
        MutableSharedFlow<IndexedValue<Oooo000<T>>> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.f7097OooO0O0 = MutableSharedFlow;
        this.f7098OooO0OO = FlowKt.onSubscription(MutableSharedFlow, new OooO0o(this, null));
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, CoroutineStart.LAZY, new OooO0O0(src, this, null), 1, null);
        jobLaunch$default.invokeOnCompletion(new OooO0OO(this));
        this.f7099OooO0Oo = jobLaunch$default;
        this.f7100OooO0o0 = FlowKt.flow(new C0147OooO00o(this, null));
    }
}
