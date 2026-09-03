package p089o000o000;

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
public final class OooO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0O<T> f28617OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<IndexedValue<o0000O0O<T>>> f28618OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SharedFlow<IndexedValue<o0000O0O<T>>> f28619OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Job f28620OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Flow<o0000O0O<T>> f28621OooO0o0;

    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<FlowCollector<? super o0000O0O<T>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f28622Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f28623Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooO<T> f28624Oooo0oo;

        /* JADX INFO: renamed from: o000o000.OooO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0303OooO00o extends SuspendLambda implements Function2<IndexedValue<? extends o0000O0O<T>>, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ Object f28625Oooo0o;

            public C0303OooO00o(Continuation<? super C0303OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0303OooO00o c0303OooO00o = new C0303OooO00o(continuation);
                c0303OooO00o.f28625Oooo0o = obj;
                return c0303OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
                return ((C0303OooO00o) create((IndexedValue) obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((IndexedValue) this.f28625Oooo0o) != null);
            }
        }

        public static final class OooO0O0<T> implements FlowCollector {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f28626Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ FlowCollector<o0000O0O<T>> f28627Oooo0oO;

            /* JADX INFO: renamed from: o000o000.OooO$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {106}, m = "emit", n = {"this", "indexedValue"}, s = {"L$0", "L$1"})
            public static final class C0304OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                public final /* synthetic */ OooO0O0<T> f28628Oooo;

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public OooO0O0 f28629Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public IndexedValue f28630Oooo0oO;

                /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                public /* synthetic */ Object f28631Oooo0oo;

                /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                public int f28632OoooO00;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0304OooO00o(OooO0O0<? super T> oooO0O0, Continuation<? super C0304OooO00o> continuation) {
                    super(continuation);
                    this.f28628Oooo = oooO0O0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f28631Oooo0oo = obj;
                    this.f28632OoooO00 |= Integer.MIN_VALUE;
                    return this.f28628Oooo.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(Ref.IntRef intRef, FlowCollector<? super o0000O0O<T>> flowCollector) {
                this.f28626Oooo0o = intRef;
                this.f28627Oooo0oO = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object emit(@Nullable IndexedValue<? extends o0000O0O<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
                C0304OooO00o c0304OooO00o;
                OooO0O0<T> oooO0O0;
                if (continuation instanceof C0304OooO00o) {
                    c0304OooO00o = (C0304OooO00o) continuation;
                    int i = c0304OooO00o.f28632OoooO00;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0304OooO00o.f28632OoooO00 = i - Integer.MIN_VALUE;
                    } else {
                        c0304OooO00o = new C0304OooO00o(this, continuation);
                    }
                } else {
                    c0304OooO00o = new C0304OooO00o(this, continuation);
                }
                Object obj = c0304OooO00o.f28631Oooo0oo;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0304OooO00o.f28632OoooO00;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNull(indexedValue);
                    if (indexedValue.getIndex() > this.f28626Oooo0o.element) {
                        FlowCollector<o0000O0O<T>> flowCollector = this.f28627Oooo0oO;
                        o0000O0O<T> value = indexedValue.getValue();
                        c0304OooO00o.f28629Oooo0o = this;
                        c0304OooO00o.f28630Oooo0oO = indexedValue;
                        c0304OooO00o.f28632OoooO00 = 1;
                        if (flowCollector.emit(value, c0304OooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oooO0O0 = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                indexedValue = c0304OooO00o.f28630Oooo0oO;
                oooO0O0 = c0304OooO00o.f28629Oooo0o;
                ResultKt.throwOnFailure(obj);
                oooO0O0.f28626Oooo0o.element = indexedValue.getIndex();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO<T> oooO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f28624Oooo0oo = oooO;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f28624Oooo0oo, continuation);
            oooO00o.f28623Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO00o) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28622Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f28623Oooo0oO;
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = Integer.MIN_VALUE;
                Flow flowTakeWhile = FlowKt.takeWhile(this.f28624Oooo0oo.f28619OooO0OO, new C0303OooO00o(null));
                OooO0O0 oooO0O0 = new OooO0O0(intRef, flowCollector);
                this.f28622Oooo0o = 1;
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f28633Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Flow<o0000O0O<T>> f28634Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooO<T> f28635Oooo0oo;

        public static final class OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ OooO<T> f28636Oooo0o;

            /* JADX INFO: renamed from: o000o000.OooO$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {78, 79}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
            public static final class C0305OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                public final /* synthetic */ OooO00o<T> f28637Oooo;

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public OooO00o f28638Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public IndexedValue f28639Oooo0oO;

                /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                public /* synthetic */ Object f28640Oooo0oo;

                /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                public int f28641OoooO00;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0305OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C0305OooO00o> continuation) {
                    super(continuation);
                    this.f28637Oooo = oooO00o;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f28640Oooo0oo = obj;
                    this.f28641OoooO00 |= Integer.MIN_VALUE;
                    return this.f28637Oooo.emit(null, this);
                }
            }

            public OooO00o(OooO<T> oooO) {
                this.f28636Oooo0o = oooO;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull IndexedValue<? extends o0000O0O<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
                C0305OooO00o c0305OooO00o;
                OooO00o<T> oooO00o;
                if (continuation instanceof C0305OooO00o) {
                    c0305OooO00o = (C0305OooO00o) continuation;
                    int i = c0305OooO00o.f28641OoooO00;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0305OooO00o.f28641OoooO00 = i - Integer.MIN_VALUE;
                    } else {
                        c0305OooO00o = new C0305OooO00o(this, continuation);
                    }
                } else {
                    c0305OooO00o = new C0305OooO00o(this, continuation);
                }
                Object obj = c0305OooO00o.f28640Oooo0oo;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0305OooO00o.f28641OoooO00;
                if (i2 != 0) {
                    if (i2 == 1) {
                        indexedValue = c0305OooO00o.f28639Oooo0oO;
                        oooO00o = c0305OooO00o.f28638Oooo0o;
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
                MutableSharedFlow<IndexedValue<o0000O0O<T>>> mutableSharedFlow = this.f28636Oooo0o.f28618OooO0O0;
                c0305OooO00o.f28638Oooo0o = this;
                c0305OooO00o.f28639Oooo0oO = indexedValue;
                c0305OooO00o.f28641OoooO00 = 1;
                if (mutableSharedFlow.emit(indexedValue, c0305OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO00o = this;
                o00O0O<T> o00o0o2 = oooO00o.f28636Oooo0o.f28617OooO00o;
                c0305OooO00o.f28638Oooo0o = null;
                c0305OooO00o.f28639Oooo0oO = null;
                c0305OooO00o.f28641OoooO00 = 2;
                if (o00o0o2.OooO0O0(indexedValue, c0305OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Flow<? extends o0000O0O<T>> flow, OooO<T> oooO, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f28634Oooo0oO = flow;
            this.f28635Oooo0oo = oooO;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f28634Oooo0oO, this.f28635Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28633Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWithIndex = FlowKt.withIndex(this.f28634Oooo0oO);
                OooO00o oooO00o = new OooO00o(this.f28635Oooo0oo);
                this.f28633Oooo0o = 1;
                if (flowWithIndex.collect(oooO00o, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO<T> f28642Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO<T> oooO) {
            super(1);
            this.f28642Oooo0o = oooO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            this.f28642Oooo0o.f28618OooO0O0.tryEmit(null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", i = {0, 1}, l = {63, 68}, m = "invokeSuspend", n = {"$this$onSubscription", "$this$onSubscription"}, s = {"L$0", "L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<FlowCollector<? super IndexedValue<? extends o0000O0O<T>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO<T> f28643Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Iterator f28644Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f28645Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f28646Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooO<T> oooO, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f28643Oooo = oooO;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f28643Oooo, continuation);
            oooO0o.f28646Oooo0oo = obj;
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
            Iterator<T> it;
            IndexedValue indexedValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28645Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    FlowCollector flowCollector2 = (FlowCollector) this.f28646Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f28644Oooo0o;
                    flowCollector = (FlowCollector) this.f28646Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    indexedValue = (IndexedValue) it.next();
                    this.f28646Oooo0oo = flowCollector;
                    this.f28644Oooo0o = it;
                    this.f28645Oooo0oO = 2;
                    if (flowCollector.emit(indexedValue, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.f28646Oooo0oo;
            o00O0O<T> o00o0o2 = this.f28643Oooo.f28617OooO00o;
            this.f28646Oooo0oo = flowCollector3;
            this.f28645Oooo0oO = 1;
            Object objOooO00o = o00o0o2.OooO00o(this);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector = flowCollector3;
            obj = objOooO00o;
            this.f28643Oooo.f28620OooO0Oo.start();
            it = ((List) obj).iterator();
            while (it.hasNext()) {
                indexedValue = (IndexedValue) it.next();
                this.f28646Oooo0oo = flowCollector;
                this.f28644Oooo0o = it;
                this.f28645Oooo0oO = 2;
                if (flowCollector.emit(indexedValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public OooO(@NotNull Flow<? extends o0000O0O<T>> src, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f28617OooO00o = new o00O0O<>();
        MutableSharedFlow<IndexedValue<o0000O0O<T>>> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.f28618OooO0O0 = MutableSharedFlow;
        this.f28619OooO0OO = FlowKt.onSubscription(MutableSharedFlow, new OooO0o(this, null));
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, CoroutineStart.LAZY, new OooO0O0(src, this, null), 1, null);
        jobLaunch$default.invokeOnCompletion(new OooO0OO(this));
        this.f28620OooO0Oo = jobLaunch$default;
        this.f28621OooO0o0 = FlowKt.flow(new OooO00o(this, null));
    }
}
