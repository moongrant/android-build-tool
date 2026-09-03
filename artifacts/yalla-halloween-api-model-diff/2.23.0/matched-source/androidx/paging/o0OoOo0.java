package androidx.paging;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import o000O00O.o000OOo0;
import o000O00O.o00O0000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {645, 168, 657}, m = "invokeSuspend", n = {"$this$cancelableChannelFlow", "it", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,638:1\n391#2:639\n392#2:648\n391#2:651\n392#2:660\n107#3,8:640\n116#3:649\n115#3:650\n107#3,8:652\n116#3:661\n115#3:662\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1\n*L\n161#1:639\n161#1:648\n171#1:651\n171#1:660\n161#1:640,8\n161#1:649\n161#1:650\n171#1:652,8\n171#1:661\n171#1:662\n*E\n"})
public final class o0OoOo0 extends SuspendLambda implements Function2<o00O0000<Oooo000<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o000oOoO<Object, Object> f7385OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f7386OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Mutex f7387OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f7388OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f7389OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public /* synthetic */ Object f7390OooO0oo;

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7391OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O0000<Oooo000<Object>> f7392OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<Object, Object> f7393OooO0o0;

        /* JADX INFO: renamed from: androidx.paging.o0OoOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0157OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00O0000<Oooo000<Object>> f7394OooO0Oo;

            /* JADX INFO: renamed from: androidx.paging.o0OoOo0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", i = {}, l = {95}, m = "emit", n = {}, s = {})
            public static final class C0158OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public /* synthetic */ Object f7395OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public int f7396OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ C0157OooO00o<T> f7397OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0158OooO00o(C0157OooO00o<? super T> c0157OooO00o, Continuation<? super C0158OooO00o> continuation) {
                    super(continuation);
                    this.f7397OooO0o0 = c0157OooO00o;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f7395OooO0Oo = obj;
                    this.f7396OooO0o |= Integer.MIN_VALUE;
                    return this.f7397OooO0o0.emit(null, this);
                }
            }

            public C0157OooO00o(o00O0000<Oooo000<Object>> o00o0001) {
                this.f7394OooO0Oo = o00o0001;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull Oooo000<Object> oooo000, @NotNull Continuation<? super Unit> continuation) {
                C0158OooO00o c0158OooO00o;
                if (continuation instanceof C0158OooO00o) {
                    c0158OooO00o = (C0158OooO00o) continuation;
                    int i = c0158OooO00o.f7396OooO0o;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0158OooO00o.f7396OooO0o = i - Integer.MIN_VALUE;
                    } else {
                        c0158OooO00o = new C0158OooO00o(this, continuation);
                    }
                } else {
                    c0158OooO00o = new C0158OooO00o(this, continuation);
                }
                Object obj = c0158OooO00o.f7395OooO0Oo;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0158OooO00o.f7396OooO0o;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        o00O0000<Oooo000<Object>> o00o0001 = this.f7394OooO0Oo;
                        c0158OooO00o.f7396OooO0o = 1;
                        if (o00o0001.send(oooo000, c0158OooO00o) == coroutine_suspended) {
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
        public OooO00o(o000oOoO<Object, Object> o000oooo2, o00O0000<Oooo000<Object>> o00o0001, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f7393OooO0o0 = o000oooo2;
            this.f7392OooO0o = o00o0001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f7393OooO0o0, this.f7392OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7391OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.f7393OooO0o0.f7296OooOO0);
                C0157OooO00o c0157OooO00o = new C0157OooO00o(this.f7392OooO0o);
                this.f7391OooO0Oo = 1;
                if (flowConsumeAsFlow.collect(c0157OooO00o, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7398OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Channel<Unit> f7399OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<Object, Object> f7400OooO0o0;

        public static final class OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Channel<Unit> f7401OooO0Oo;

            public OooO00o(Channel<Unit> channel) {
                this.f7401OooO0Oo = channel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                this.f7401OooO0Oo.mo5731trySendJP2dKIU((Unit) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000oOoO o000oooo2, Continuation continuation, Channel channel) {
            super(2, continuation);
            this.f7400OooO0o0 = o000oooo2;
            this.f7399OooO0o = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f7400OooO0o0, continuation, this.f7399OooO0o);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7398OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Unit> flow = this.f7400OooO0o0.f7291OooO0Oo;
                OooO00o oooO00o = new OooO00o(this.f7399OooO0o);
                this.f7398OooO0Oo = 1;
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

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7402OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Channel<Unit> f7403OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f7404OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<Object, Object> f7405OooO0oO;

        @SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 LoadStates.kt\nandroidx/paging/LoadStates\n*L\n1#1,638:1\n391#2:639\n392#2:648\n391#2:652\n392#2:661\n391#2:664\n392#2:673\n391#2:676\n392#2:685\n391#2:689\n392#2:698\n391#2:701\n392#2:710\n391#2:713\n392#2:722\n391#2:726\n392#2:735\n391#2:738\n392#2:747\n391#2:750\n392#2:759\n107#3,8:640\n116#3:649\n115#3:650\n107#3,8:653\n116#3:662\n115#3:663\n107#3,8:665\n116#3:674\n115#3:675\n107#3,8:677\n116#3:686\n115#3:687\n107#3,8:690\n116#3:699\n115#3:700\n107#3,8:702\n116#3:711\n115#3:712\n107#3,8:714\n116#3:723\n115#3:724\n107#3,8:727\n116#3:736\n115#3:737\n107#3,8:739\n116#3:748\n115#3:749\n107#3,8:751\n116#3:760\n115#3:761\n36#4:651\n37#4:688\n38#4:725\n39#4:762\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1\n*L\n111#1:639\n111#1:648\n125#1:652\n125#1:661\n133#1:664\n133#1:673\n142#1:676\n142#1:685\n125#1:689\n125#1:698\n133#1:701\n133#1:710\n142#1:713\n142#1:722\n125#1:726\n125#1:735\n133#1:738\n133#1:747\n142#1:750\n142#1:759\n111#1:640,8\n111#1:649\n111#1:650\n125#1:653,8\n125#1:662\n125#1:663\n133#1:665,8\n133#1:674\n133#1:675\n142#1:677,8\n142#1:686\n142#1:687\n125#1:690,8\n125#1:699\n125#1:700\n133#1:702,8\n133#1:711\n133#1:712\n142#1:714,8\n142#1:723\n142#1:724\n125#1:727,8\n125#1:736\n125#1:737\n133#1:739,8\n133#1:748\n133#1:749\n142#1:751,8\n142#1:760\n142#1:761\n120#1:651\n120#1:688\n120#1:725\n120#1:762\n*E\n"})
        public static final class OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o000oOoO<Object, Object> f7406OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f7407OooO0o0;

            /* JADX INFO: renamed from: androidx.paging.o0OoOo0$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public /* synthetic */ class C0159OooO00o {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[LoadType.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public OooO00o(o000oOoO<Object, Object> o000oooo2, CoroutineScope coroutineScope) {
                this.f7406OooO0Oo = o000oooo2;
                this.f7407OooO0o0 = coroutineScope;
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
            /* JADX WARN: Code duplicated, block: B:130:0x03e9 A[PHI: r2 r6 r7
              0x03e9: PHI (r2v51 androidx.paging.OooOOO) = (r2v27 androidx.paging.OooOOO), (r2v57 androidx.paging.OooOOO) binds: [B:84:0x02f7, B:126:0x03df] A[DONT_GENERATE, DONT_INLINE]
              0x03e9: PHI (r6v53 androidx.paging.o000oOoO<java.lang.Object, java.lang.Object>) = 
              (r6v26 androidx.paging.o000oOoO<java.lang.Object, java.lang.Object>)
              (r6v56 androidx.paging.o000oOoO<java.lang.Object, java.lang.Object>)
             binds: [B:84:0x02f7, B:126:0x03df] A[DONT_GENERATE, DONT_INLINE]
              0x03e9: PHI (r7v49 kotlinx.coroutines.CoroutineScope) = (r7v23 kotlinx.coroutines.CoroutineScope), (r7v52 kotlinx.coroutines.CoroutineScope) binds: [B:84:0x02f7, B:126:0x03df] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:132:0x03f1  */
            /* JADX WARN: Code duplicated, block: B:134:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:136:0x040d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:137:0x040e  */
            /* JADX WARN: Code duplicated, block: B:140:0x0427 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:141:0x0428  */
            /* JADX WARN: Code duplicated, block: B:147:0x0437  */
            /* JADX WARN: Code duplicated, block: B:150:0x0443  */
            /* JADX WARN: Code duplicated, block: B:151:0x0448  */
            /* JADX WARN: Code duplicated, block: B:153:0x0464 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:154:0x0465  */
            /* JADX WARN: Code duplicated, block: B:159:0x0491 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:160:0x0492  */
            /* JADX WARN: Code duplicated, block: B:163:0x0499  */
            /* JADX WARN: Code duplicated, block: B:165:0x04af A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:166:0x04b0  */
            /* JADX WARN: Code duplicated, block: B:170:0x04c3  */
            /* JADX WARN: Code duplicated, block: B:50:0x023f  */
            /* JADX WARN: Code duplicated, block: B:53:0x0250  */
            /* JADX WARN: Code duplicated, block: B:56:0x025e  */
            /* JADX WARN: Code duplicated, block: B:57:0x0262  */
            /* JADX WARN: Code duplicated, block: B:59:0x027f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:60:0x0280  */
            /* JADX WARN: Code duplicated, block: B:65:0x02ac A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:66:0x02ad  */
            /* JADX WARN: Code duplicated, block: B:69:0x02b5  */
            /* JADX WARN: Code duplicated, block: B:71:0x02cc A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:75:0x02de  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code duplicated, block: B:83:0x02f1 A[PHI: r2 r6 r7
              0x02f1: PHI (r2v27 androidx.paging.OooOOO) = (r2v7 androidx.paging.OooOOO), (r2v30 androidx.paging.OooOOO) binds: [B:52:0x024e, B:79:0x02e7] A[DONT_GENERATE, DONT_INLINE]
              0x02f1: PHI (r6v26 androidx.paging.o000oOoO<java.lang.Object, java.lang.Object>) = 
              (r6v4 androidx.paging.o000oOoO<java.lang.Object, java.lang.Object>)
              (r6v29 androidx.paging.o000oOoO<java.lang.Object, java.lang.Object>)
             binds: [B:52:0x024e, B:79:0x02e7] A[DONT_GENERATE, DONT_INLINE]
              0x02f1: PHI (r7v23 kotlinx.coroutines.CoroutineScope) = (r7v2 kotlinx.coroutines.CoroutineScope), (r7v26 kotlinx.coroutines.CoroutineScope) binds: [B:52:0x024e, B:79:0x02e7] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:85:0x02f9  */
            /* JADX WARN: Code duplicated, block: B:87:0x02fd  */
            /* JADX WARN: Code duplicated, block: B:89:0x0316 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:90:0x0317  */
            /* JADX WARN: Code duplicated, block: B:93:0x0335 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:94:0x0336  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [int] */
            /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v14, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v38, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v66, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v84 */
            /* JADX WARN: Type inference failed for: r2v85 */
            /* JADX WARN: Type inference failed for: r2v88 */
            /* JADX WARN: Type inference failed for: r2v89 */
            /* JADX WARN: Type inference failed for: r2v91 */
            /* JADX WARN: Type inference failed for: r2v92 */
            @Nullable
            public final Object OooO00o(@NotNull Continuation continuation) {
                o00O0O o00o0o2;
                o000oOoO<Object, Object> o000oooo2;
                o00oO0o.OooO00o<Object, Object> oooO00o;
                Mutex mutex;
                OooO00o<T> oooO00o2;
                OooOOO oooOOO;
                o000000<Object, Object> o000000Var;
                o000OOo0<Object, Object> o000ooo1;
                LoadType loadType;
                boolean z;
                o000oOoO<Object, Object> o000oooo3;
                CoroutineScope coroutineScope;
                LoadType loadType2;
                OooOOO oooOOO2;
                o000oOoO<Object, Object> o000oooo4;
                CoroutineScope coroutineScope2;
                CoroutineScope coroutineScope3;
                o000oOoO<Object, Object> o000oooo5;
                OooOOO oooOOO3;
                o00oO0o.OooO00o<Object, Object> oooO00o3;
                Mutex mutex2;
                o000oOoO<Object, Object> o000oooo6;
                LoadType loadType3;
                o000oOoO<Object, Object> o000oooo7;
                o00000 o00000Var;
                LoadType loadType4;
                o000oOoO<Object, Object> o000oooo8;
                LoadType loadType5;
                CoroutineScope coroutineScope4;
                OooOOO oooOOO4;
                o00oO0o.OooO00o<Object, Object> oooO00o4;
                Mutex mutex3;
                LoadType loadType6;
                LoadType loadType7;
                OooOOO oooOOO5;
                o000oOoO<Object, Object> o000oooo9;
                CoroutineScope coroutineScope5;
                o00oO0o.OooO00o<Object, Object> oooO00o5;
                Mutex mutex4;
                OooOOO oooOOO6;
                Mutex mutex5;
                o000oOoO<Object, Object> o000oooo10;
                CoroutineScope coroutineScope6;
                OooOOO0 oooOOO0OooO00o;
                o00oO0o<Object, Object> o00oo0o2;
                o00oO0o.OooO00o<Object, Object> oooO00o6;
                Mutex mutex6;
                o000oOoO<Object, Object> o000oooo11;
                LoadType loadType8;
                o000oOoO<Object, Object> o000oooo12;
                o00000 o00000Var2;
                LoadType loadType9;
                o000oOoO<Object, Object> o000oooo13;
                LoadType loadType10;
                CoroutineScope coroutineScope7;
                OooOOO oooOOO7;
                o00oO0o.OooO00o<Object, Object> oooO00o7;
                Mutex mutex7;
                LoadType loadType11;
                o000oOoO<Object, Object> o000oooo14;
                CoroutineScope coroutineScope8;
                o00oO0o.OooO00o<Object, Object> oooO00o8;
                Mutex mutex8;
                o000oOoO<Object, Object> o000oooo15;
                CoroutineScope coroutineScope9;
                OooOOO0 oooOOO0OooO00o2;
                Mutex mutex9;
                o00oO0o<Object, Object> o00oo0o3;
                LoadType loadType12;
                o00oO0o.OooO00o<Object, Object> oooO00o9;
                Mutex mutex10;
                LoadType loadType13;
                LoadType loadType14;
                o000oOoO<Object, Object> o000oooo16;
                o000oOoO<Object, Object> o000oooo17;
                o00000 o00000Var3;
                LoadType loadType15;
                CoroutineScope coroutineScope10;
                o000oOoO<Object, Object> o000oooo18;
                o00oO0o.OooO00o<Object, Object> oooO00o10;
                Mutex mutex11;
                Mutex mutex12;
                o000oOoO<Object, Object> o000oooo19;
                OooOOO0 oooOOO0OooO00o3;
                if (continuation instanceof o00O0O) {
                    o00o0o2 = (o00O0O) continuation;
                    int i = o00o0o2.f7322OooOOO;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        o00o0o2.f7322OooOOO = i - Integer.MIN_VALUE;
                    } else {
                        o00o0o2 = new o00O0O(this, continuation);
                    }
                } else {
                    o00o0o2 = new o00O0O(this, continuation);
                }
                Object obj = o00o0o2.f7321OooOO0o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ?? r2 = o00o0o2.f7322OooOOO;
                try {
                    try {
                        try {
                            switch (r2) {
                                case 0:
                                    ResultKt.throwOnFailure(obj);
                                    o000oooo2 = this.f7406OooO0Oo;
                                    oooO00o = o000oooo2.f7297OooOO0O;
                                    mutex = oooO00o.f7346OooO00o;
                                    o00o0o2.f7314OooO0Oo = this;
                                    o00o0o2.f7316OooO0o0 = oooO00o;
                                    o00o0o2.f7315OooO0o = o000oooo2;
                                    o00o0o2.f7317OooO0oO = mutex;
                                    o00o0o2.f7322OooOOO = 1;
                                    if (mutex.lock(null, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    oooO00o2 = this;
                                    try {
                                        o00oO0o<Object, Object> o00oo0o4 = oooO00o.f7347OooO0O0;
                                        Pair pair = TuplesKt.to(o00oo0o4.f7345OooOO0o.OooO0Oo(), o00oo0o4.OooO00o(o000oooo2.f7295OooO0oo.f7146OooO00o.f7151OooO0OO));
                                        mutex.unlock(null);
                                        oooOOO = (OooOOO) pair.component1();
                                        o000000Var = (o000000) pair.component2();
                                        o000ooo1 = oooO00o2.f7406OooO0Oo.f7293OooO0o0;
                                        if (o000ooo1 != null) {
                                            o000ooo1.OooO0OO(o000000Var);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        loadType = LoadType.REFRESH;
                                        z = oooOOO.f7160OooO00o instanceof OooOOO0.OooO00o;
                                        o000oooo3 = oooO00o2.f7406OooO0Oo;
                                        coroutineScope = oooO00o2.f7407OooO0o0;
                                        if (z) {
                                            loadType6 = LoadType.PREPEND;
                                            if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                                if (loadType6 != LoadType.REFRESH) {
                                                    oooO00o5 = o000oooo3.f7297OooOO0O;
                                                    mutex4 = oooO00o5.f7346OooO00o;
                                                    o00o0o2.f7314OooO0Oo = oooOOO;
                                                    o00o0o2.f7316OooO0o0 = o000oooo3;
                                                    o00o0o2.f7315OooO0o = coroutineScope;
                                                    o00o0o2.f7317OooO0oO = loadType6;
                                                    o00o0o2.f7318OooO0oo = oooO00o5;
                                                    o00o0o2.f7313OooO = mutex4;
                                                    o00o0o2.f7322OooOOO = 7;
                                                    if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    oooOOO6 = oooOOO;
                                                    mutex5 = mutex4;
                                                    CoroutineScope coroutineScope11 = coroutineScope;
                                                    o000oooo10 = o000oooo3;
                                                    coroutineScope6 = coroutineScope11;
                                                    o00oo0o2 = oooO00o5.f7347OooO0O0;
                                                    o00o0o2.f7314OooO0Oo = oooOOO6;
                                                    o00o0o2.f7316OooO0o0 = o000oooo10;
                                                    o00o0o2.f7315OooO0o = coroutineScope6;
                                                    o00o0o2.f7317OooO0oO = loadType6;
                                                    o00o0o2.f7318OooO0oo = mutex5;
                                                    o00o0o2.f7313OooO = null;
                                                    o00o0o2.f7322OooOOO = 8;
                                                    if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    loadType7 = loadType6;
                                                    r2 = mutex5;
                                                    Unit unit2 = Unit.INSTANCE;
                                                    r2.unlock(null);
                                                    coroutineScope5 = coroutineScope6;
                                                    o000oooo9 = o000oooo10;
                                                    oooOOO5 = oooOOO6;
                                                } else {
                                                    loadType7 = loadType6;
                                                    oooOOO5 = oooOOO;
                                                    o000oooo9 = o000oooo3;
                                                    coroutineScope5 = coroutineScope;
                                                }
                                                if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                    o000oooo12 = o000oooo9;
                                                    o00000Var2 = null;
                                                    loadType9 = loadType7;
                                                } else {
                                                    oooO00o6 = o000oooo9.f7297OooOO0O;
                                                    mutex6 = oooO00o6.f7346OooO00o;
                                                    o00o0o2.f7314OooO0Oo = oooOOO5;
                                                    o00o0o2.f7316OooO0o0 = o000oooo9;
                                                    o00o0o2.f7315OooO0o = coroutineScope5;
                                                    o00o0o2.f7317OooO0oO = loadType7;
                                                    o00o0o2.f7318OooO0oo = oooO00o6;
                                                    o00o0o2.f7313OooO = mutex6;
                                                    o00o0o2.f7319OooOO0 = loadType7;
                                                    o00o0o2.f7320OooOO0O = o000oooo9;
                                                    o00o0o2.f7322OooOOO = 9;
                                                    if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    o000oooo11 = o000oooo9;
                                                    loadType8 = loadType7;
                                                    o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                                    mutex6.unlock(null);
                                                    o000oooo12 = o000oooo9;
                                                    loadType9 = loadType7;
                                                    loadType7 = loadType8;
                                                    o000oooo9 = o000oooo11;
                                                }
                                                o00o0o2.f7314OooO0Oo = oooOOO5;
                                                o00o0o2.f7316OooO0o0 = o000oooo9;
                                                o00o0o2.f7315OooO0o = coroutineScope5;
                                                o00o0o2.f7317OooO0oO = loadType7;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7313OooO = null;
                                                o00o0o2.f7319OooOO0 = null;
                                                o00o0o2.f7320OooOO0O = null;
                                                o00o0o2.f7322OooOOO = 10;
                                                if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000oooo13 = o000oooo9;
                                                loadType10 = loadType7;
                                                coroutineScope7 = coroutineScope5;
                                                oooOOO7 = oooOOO5;
                                                if (loadType10 == LoadType.REFRESH) {
                                                    oooO00o7 = o000oooo13.f7297OooOO0O;
                                                    mutex7 = oooO00o7.f7346OooO00o;
                                                    o00o0o2.f7314OooO0Oo = oooOOO7;
                                                    o00o0o2.f7316OooO0o0 = o000oooo13;
                                                    o00o0o2.f7315OooO0o = coroutineScope7;
                                                    o00o0o2.f7317OooO0oO = oooO00o7;
                                                    o00o0o2.f7318OooO0oo = mutex7;
                                                    o00o0o2.f7322OooOOO = 11;
                                                    if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex7.unlock(null);
                                                    if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                        o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                                    }
                                                }
                                                oooOOO = oooOOO7;
                                                o000oOoO<Object, Object> o000oooo20 = o000oooo13;
                                                coroutineScope = coroutineScope7;
                                                o000oooo3 = o000oooo20;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        loadType2 = loadType;
                                        oooOOO2 = oooOOO;
                                        o000oooo4 = o000oooo3;
                                        coroutineScope2 = coroutineScope;
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                            o000oooo7 = o000oooo4;
                                            o00000Var = null;
                                            loadType4 = loadType2;
                                        } else {
                                            oooO00o3 = o000oooo4.f7297OooOO0O;
                                            mutex2 = oooO00o3.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO2;
                                            o00o0o2.f7316OooO0o0 = o000oooo4;
                                            o00o0o2.f7315OooO0o = coroutineScope2;
                                            o00o0o2.f7317OooO0oO = loadType2;
                                            o00o0o2.f7318OooO0oo = oooO00o3;
                                            o00o0o2.f7313OooO = mutex2;
                                            o00o0o2.f7319OooOO0 = loadType2;
                                            o00o0o2.f7320OooOO0O = o000oooo4;
                                            o00o0o2.f7322OooOOO = 4;
                                            if (mutex2.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo6 = o000oooo4;
                                            loadType3 = loadType2;
                                            try {
                                                o00000Var = (o00000) oooO00o3.f7347OooO0O0.f7344OooOO0O.get(loadType3);
                                                mutex2.unlock(null);
                                                o000oooo7 = o000oooo4;
                                                loadType4 = loadType2;
                                                loadType2 = loadType3;
                                                o000oooo4 = o000oooo6;
                                            } catch (Throwable th) {
                                                mutex2.unlock(null);
                                                throw th;
                                            }
                                        }
                                        o00o0o2.f7314OooO0Oo = oooOOO2;
                                        o00o0o2.f7316OooO0o0 = o000oooo4;
                                        o00o0o2.f7315OooO0o = coroutineScope2;
                                        o00o0o2.f7317OooO0oO = loadType2;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7320OooOO0O = null;
                                        o00o0o2.f7322OooOOO = 5;
                                        if (o000oOoO.OooO0OO(o000oooo7, loadType4, o00000Var, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo8 = o000oooo4;
                                        loadType5 = loadType2;
                                        coroutineScope4 = coroutineScope2;
                                        oooOOO4 = oooOOO2;
                                        if (loadType5 == LoadType.REFRESH) {
                                            oooO00o4 = o000oooo8.f7297OooOO0O;
                                            mutex3 = oooO00o4.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO4;
                                            o00o0o2.f7316OooO0o0 = o000oooo8;
                                            o00o0o2.f7315OooO0o = coroutineScope4;
                                            o00o0o2.f7317OooO0oO = oooO00o4;
                                            o00o0o2.f7318OooO0oo = mutex3;
                                            o00o0o2.f7322OooOOO = 6;
                                            if (mutex3.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            try {
                                                oooOOO0OooO00o = oooO00o4.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex3.unlock(null);
                                                if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo8, coroutineScope4);
                                                }
                                            } catch (Throwable th2) {
                                                mutex3.unlock(null);
                                                throw th2;
                                            }
                                        }
                                        oooOOO = oooOOO4;
                                        o000oOoO<Object, Object> o000oooo21 = o000oooo8;
                                        coroutineScope = coroutineScope4;
                                        o000oooo3 = o000oooo21;
                                        loadType6 = LoadType.PREPEND;
                                        if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                            if (loadType6 != LoadType.REFRESH) {
                                                oooO00o5 = o000oooo3.f7297OooOO0O;
                                                mutex4 = oooO00o5.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = oooOOO;
                                                o00o0o2.f7316OooO0o0 = o000oooo3;
                                                o00o0o2.f7315OooO0o = coroutineScope;
                                                o00o0o2.f7317OooO0oO = loadType6;
                                                o00o0o2.f7318OooO0oo = oooO00o5;
                                                o00o0o2.f7313OooO = mutex4;
                                                o00o0o2.f7322OooOOO = 7;
                                                if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                oooOOO6 = oooOOO;
                                                mutex5 = mutex4;
                                                CoroutineScope coroutineScope12 = coroutineScope;
                                                o000oooo10 = o000oooo3;
                                                coroutineScope6 = coroutineScope12;
                                                o00oo0o2 = oooO00o5.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = oooOOO6;
                                                o00o0o2.f7316OooO0o0 = o000oooo10;
                                                o00o0o2.f7315OooO0o = coroutineScope6;
                                                o00o0o2.f7317OooO0oO = loadType6;
                                                o00o0o2.f7318OooO0oo = mutex5;
                                                o00o0o2.f7313OooO = null;
                                                o00o0o2.f7322OooOOO = 8;
                                                if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType7 = loadType6;
                                                r2 = mutex5;
                                                Unit unit3 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                coroutineScope5 = coroutineScope6;
                                                o000oooo9 = o000oooo10;
                                                oooOOO5 = oooOOO6;
                                            } else {
                                                loadType7 = loadType6;
                                                oooOOO5 = oooOOO;
                                                o000oooo9 = o000oooo3;
                                                coroutineScope5 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                o000oooo12 = o000oooo9;
                                                o00000Var2 = null;
                                                loadType9 = loadType7;
                                            } else {
                                                oooO00o6 = o000oooo9.f7297OooOO0O;
                                                mutex6 = oooO00o6.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = oooOOO5;
                                                o00o0o2.f7316OooO0o0 = o000oooo9;
                                                o00o0o2.f7315OooO0o = coroutineScope5;
                                                o00o0o2.f7317OooO0oO = loadType7;
                                                o00o0o2.f7318OooO0oo = oooO00o6;
                                                o00o0o2.f7313OooO = mutex6;
                                                o00o0o2.f7319OooOO0 = loadType7;
                                                o00o0o2.f7320OooOO0O = o000oooo9;
                                                o00o0o2.f7322OooOOO = 9;
                                                if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000oooo11 = o000oooo9;
                                                loadType8 = loadType7;
                                                try {
                                                    o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                                    mutex6.unlock(null);
                                                    o000oooo12 = o000oooo9;
                                                    loadType9 = loadType7;
                                                    loadType7 = loadType8;
                                                    o000oooo9 = o000oooo11;
                                                } catch (Throwable th3) {
                                                    mutex6.unlock(null);
                                                    throw th3;
                                                }
                                            }
                                            o00o0o2.f7314OooO0Oo = oooOOO5;
                                            o00o0o2.f7316OooO0o0 = o000oooo9;
                                            o00o0o2.f7315OooO0o = coroutineScope5;
                                            o00o0o2.f7317OooO0oO = loadType7;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7320OooOO0O = null;
                                            o00o0o2.f7322OooOOO = 10;
                                            if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo13 = o000oooo9;
                                            loadType10 = loadType7;
                                            coroutineScope7 = coroutineScope5;
                                            oooOOO7 = oooOOO5;
                                            if (loadType10 == LoadType.REFRESH) {
                                                oooO00o7 = o000oooo13.f7297OooOO0O;
                                                mutex7 = oooO00o7.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = oooOOO7;
                                                o00o0o2.f7316OooO0o0 = o000oooo13;
                                                o00o0o2.f7315OooO0o = coroutineScope7;
                                                o00o0o2.f7317OooO0oO = oooO00o7;
                                                o00o0o2.f7318OooO0oo = mutex7;
                                                o00o0o2.f7322OooOOO = 11;
                                                if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                try {
                                                    oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex7.unlock(null);
                                                    if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                        o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                                    }
                                                } catch (Throwable th4) {
                                                    mutex7.unlock(null);
                                                    throw th4;
                                                }
                                            }
                                            oooOOO = oooOOO7;
                                            o000oOoO<Object, Object> o000oooo22 = o000oooo13;
                                            coroutineScope = coroutineScope7;
                                            o000oooo3 = o000oooo22;
                                        }
                                        return Unit.INSTANCE;
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope13 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope13;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit4 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                try {
                                                    o00000 o00000Var4 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                    mutex10.unlock(null);
                                                    o000oOoO<Object, Object> o000oooo23 = o000oooo14;
                                                    o00000Var3 = o00000Var4;
                                                    loadType11 = loadType13;
                                                    o000oooo17 = o000oooo23;
                                                } catch (Throwable th5) {
                                                    mutex10.unlock(null);
                                                    throw th5;
                                                }
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                try {
                                                    oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                    mutex12.unlock(null);
                                                    if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                        o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                    }
                                                } catch (Throwable th6) {
                                                    mutex12.unlock(null);
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
                                    mutex = (Mutex) o00o0o2.f7317OooO0oO;
                                    o000oooo2 = (o000oOoO) o00o0o2.f7315OooO0o;
                                    oooO00o = (o00oO0o.OooO00o) o00o0o2.f7316OooO0o0;
                                    oooO00o2 = (OooO00o) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    o00oO0o<Object, Object> o00oo0o5 = oooO00o.f7347OooO0O0;
                                    Pair pair2 = TuplesKt.to(o00oo0o5.f7345OooOO0o.OooO0Oo(), o00oo0o5.OooO00o(o000oooo2.f7295OooO0oo.f7146OooO00o.f7151OooO0OO));
                                    mutex.unlock(null);
                                    oooOOO = (OooOOO) pair2.component1();
                                    o000000Var = (o000000) pair2.component2();
                                    o000ooo1 = oooO00o2.f7406OooO0Oo.f7293OooO0o0;
                                    if (o000ooo1 != null) {
                                        o000ooo1.OooO0OO(o000000Var);
                                        Unit unit5 = Unit.INSTANCE;
                                    }
                                    loadType = LoadType.REFRESH;
                                    z = oooOOO.f7160OooO00o instanceof OooOOO0.OooO00o;
                                    o000oooo3 = oooO00o2.f7406OooO0Oo;
                                    coroutineScope = oooO00o2.f7407OooO0o0;
                                    if (z) {
                                        loadType6 = LoadType.PREPEND;
                                        if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                            if (loadType6 != LoadType.REFRESH) {
                                                oooO00o5 = o000oooo3.f7297OooOO0O;
                                                mutex4 = oooO00o5.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = oooOOO;
                                                o00o0o2.f7316OooO0o0 = o000oooo3;
                                                o00o0o2.f7315OooO0o = coroutineScope;
                                                o00o0o2.f7317OooO0oO = loadType6;
                                                o00o0o2.f7318OooO0oo = oooO00o5;
                                                o00o0o2.f7313OooO = mutex4;
                                                o00o0o2.f7322OooOOO = 7;
                                                if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                oooOOO6 = oooOOO;
                                                mutex5 = mutex4;
                                                CoroutineScope coroutineScope14 = coroutineScope;
                                                o000oooo10 = o000oooo3;
                                                coroutineScope6 = coroutineScope14;
                                                o00oo0o2 = oooO00o5.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = oooOOO6;
                                                o00o0o2.f7316OooO0o0 = o000oooo10;
                                                o00o0o2.f7315OooO0o = coroutineScope6;
                                                o00o0o2.f7317OooO0oO = loadType6;
                                                o00o0o2.f7318OooO0oo = mutex5;
                                                o00o0o2.f7313OooO = null;
                                                o00o0o2.f7322OooOOO = 8;
                                                if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType7 = loadType6;
                                                r2 = mutex5;
                                                Unit unit6 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                coroutineScope5 = coroutineScope6;
                                                o000oooo9 = o000oooo10;
                                                oooOOO5 = oooOOO6;
                                            } else {
                                                loadType7 = loadType6;
                                                oooOOO5 = oooOOO;
                                                o000oooo9 = o000oooo3;
                                                coroutineScope5 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                o000oooo12 = o000oooo9;
                                                o00000Var2 = null;
                                                loadType9 = loadType7;
                                            } else {
                                                oooO00o6 = o000oooo9.f7297OooOO0O;
                                                mutex6 = oooO00o6.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = oooOOO5;
                                                o00o0o2.f7316OooO0o0 = o000oooo9;
                                                o00o0o2.f7315OooO0o = coroutineScope5;
                                                o00o0o2.f7317OooO0oO = loadType7;
                                                o00o0o2.f7318OooO0oo = oooO00o6;
                                                o00o0o2.f7313OooO = mutex6;
                                                o00o0o2.f7319OooOO0 = loadType7;
                                                o00o0o2.f7320OooOO0O = o000oooo9;
                                                o00o0o2.f7322OooOOO = 9;
                                                if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                o000oooo11 = o000oooo9;
                                                loadType8 = loadType7;
                                                o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                                mutex6.unlock(null);
                                                o000oooo12 = o000oooo9;
                                                loadType9 = loadType7;
                                                loadType7 = loadType8;
                                                o000oooo9 = o000oooo11;
                                            }
                                            o00o0o2.f7314OooO0Oo = oooOOO5;
                                            o00o0o2.f7316OooO0o0 = o000oooo9;
                                            o00o0o2.f7315OooO0o = coroutineScope5;
                                            o00o0o2.f7317OooO0oO = loadType7;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7320OooOO0O = null;
                                            o00o0o2.f7322OooOOO = 10;
                                            if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo13 = o000oooo9;
                                            loadType10 = loadType7;
                                            coroutineScope7 = coroutineScope5;
                                            oooOOO7 = oooOOO5;
                                            if (loadType10 == LoadType.REFRESH) {
                                                oooO00o7 = o000oooo13.f7297OooOO0O;
                                                mutex7 = oooO00o7.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = oooOOO7;
                                                o00o0o2.f7316OooO0o0 = o000oooo13;
                                                o00o0o2.f7315OooO0o = coroutineScope7;
                                                o00o0o2.f7317OooO0oO = oooO00o7;
                                                o00o0o2.f7318OooO0oo = mutex7;
                                                o00o0o2.f7322OooOOO = 11;
                                                if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                                }
                                            }
                                            oooOOO = oooOOO7;
                                            o000oOoO<Object, Object> o000oooo24 = o000oooo13;
                                            coroutineScope = coroutineScope7;
                                            o000oooo3 = o000oooo24;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    loadType2 = loadType;
                                    oooOOO2 = oooOOO;
                                    o000oooo4 = o000oooo3;
                                    coroutineScope2 = coroutineScope;
                                    if (C0159OooO00o.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                        o000oooo7 = o000oooo4;
                                        o00000Var = null;
                                        loadType4 = loadType2;
                                    } else {
                                        oooO00o3 = o000oooo4.f7297OooOO0O;
                                        mutex2 = oooO00o3.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO2;
                                        o00o0o2.f7316OooO0o0 = o000oooo4;
                                        o00o0o2.f7315OooO0o = coroutineScope2;
                                        o00o0o2.f7317OooO0oO = loadType2;
                                        o00o0o2.f7318OooO0oo = oooO00o3;
                                        o00o0o2.f7313OooO = mutex2;
                                        o00o0o2.f7319OooOO0 = loadType2;
                                        o00o0o2.f7320OooOO0O = o000oooo4;
                                        o00o0o2.f7322OooOOO = 4;
                                        if (mutex2.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo6 = o000oooo4;
                                        loadType3 = loadType2;
                                        o00000Var = (o00000) oooO00o3.f7347OooO0O0.f7344OooOO0O.get(loadType3);
                                        mutex2.unlock(null);
                                        o000oooo7 = o000oooo4;
                                        loadType4 = loadType2;
                                        loadType2 = loadType3;
                                        o000oooo4 = o000oooo6;
                                    }
                                    o00o0o2.f7314OooO0Oo = oooOOO2;
                                    o00o0o2.f7316OooO0o0 = o000oooo4;
                                    o00o0o2.f7315OooO0o = coroutineScope2;
                                    o00o0o2.f7317OooO0oO = loadType2;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7320OooOO0O = null;
                                    o00o0o2.f7322OooOOO = 5;
                                    if (o000oOoO.OooO0OO(o000oooo7, loadType4, o00000Var, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    o000oooo8 = o000oooo4;
                                    loadType5 = loadType2;
                                    coroutineScope4 = coroutineScope2;
                                    oooOOO4 = oooOOO2;
                                    if (loadType5 == LoadType.REFRESH) {
                                        oooO00o4 = o000oooo8.f7297OooOO0O;
                                        mutex3 = oooO00o4.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO4;
                                        o00o0o2.f7316OooO0o0 = o000oooo8;
                                        o00o0o2.f7315OooO0o = coroutineScope4;
                                        o00o0o2.f7317OooO0oO = oooO00o4;
                                        o00o0o2.f7318OooO0oo = mutex3;
                                        o00o0o2.f7322OooOOO = 6;
                                        if (mutex3.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o = oooO00o4.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex3.unlock(null);
                                        if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo8, coroutineScope4);
                                        }
                                    }
                                    oooOOO = oooOOO4;
                                    o000oOoO<Object, Object> o000oooo25 = o000oooo8;
                                    coroutineScope = coroutineScope4;
                                    o000oooo3 = o000oooo25;
                                    loadType6 = LoadType.PREPEND;
                                    if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                        if (loadType6 != LoadType.REFRESH) {
                                            oooO00o5 = o000oooo3.f7297OooOO0O;
                                            mutex4 = oooO00o5.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO;
                                            o00o0o2.f7316OooO0o0 = o000oooo3;
                                            o00o0o2.f7315OooO0o = coroutineScope;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = oooO00o5;
                                            o00o0o2.f7313OooO = mutex4;
                                            o00o0o2.f7322OooOOO = 7;
                                            if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO6 = oooOOO;
                                            mutex5 = mutex4;
                                            CoroutineScope coroutineScope15 = coroutineScope;
                                            o000oooo10 = o000oooo3;
                                            coroutineScope6 = coroutineScope15;
                                            o00oo0o2 = oooO00o5.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = oooOOO6;
                                            o00o0o2.f7316OooO0o0 = o000oooo10;
                                            o00o0o2.f7315OooO0o = coroutineScope6;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = mutex5;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7322OooOOO = 8;
                                            if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType7 = loadType6;
                                            r2 = mutex5;
                                            Unit unit7 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope5 = coroutineScope6;
                                            o000oooo9 = o000oooo10;
                                            oooOOO5 = oooOOO6;
                                        } else {
                                            loadType7 = loadType6;
                                            oooOOO5 = oooOOO;
                                            o000oooo9 = o000oooo3;
                                            coroutineScope5 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            o000oooo12 = o000oooo9;
                                            o00000Var2 = null;
                                            loadType9 = loadType7;
                                        } else {
                                            oooO00o6 = o000oooo9.f7297OooOO0O;
                                            mutex6 = oooO00o6.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO5;
                                            o00o0o2.f7316OooO0o0 = o000oooo9;
                                            o00o0o2.f7315OooO0o = coroutineScope5;
                                            o00o0o2.f7317OooO0oO = loadType7;
                                            o00o0o2.f7318OooO0oo = oooO00o6;
                                            o00o0o2.f7313OooO = mutex6;
                                            o00o0o2.f7319OooOO0 = loadType7;
                                            o00o0o2.f7320OooOO0O = o000oooo9;
                                            o00o0o2.f7322OooOOO = 9;
                                            if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo11 = o000oooo9;
                                            loadType8 = loadType7;
                                            o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                            mutex6.unlock(null);
                                            o000oooo12 = o000oooo9;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            o000oooo9 = o000oooo11;
                                        }
                                        o00o0o2.f7314OooO0Oo = oooOOO5;
                                        o00o0o2.f7316OooO0o0 = o000oooo9;
                                        o00o0o2.f7315OooO0o = coroutineScope5;
                                        o00o0o2.f7317OooO0oO = loadType7;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7320OooOO0O = null;
                                        o00o0o2.f7322OooOOO = 10;
                                        if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo13 = o000oooo9;
                                        loadType10 = loadType7;
                                        coroutineScope7 = coroutineScope5;
                                        oooOOO7 = oooOOO5;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o7 = o000oooo13.f7297OooOO0O;
                                            mutex7 = oooO00o7.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO7;
                                            o00o0o2.f7316OooO0o0 = o000oooo13;
                                            o00o0o2.f7315OooO0o = coroutineScope7;
                                            o00o0o2.f7317OooO0oO = oooO00o7;
                                            o00o0o2.f7318OooO0oo = mutex7;
                                            o00o0o2.f7322OooOOO = 11;
                                            if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                            }
                                        }
                                        oooOOO = oooOOO7;
                                        o000oOoO<Object, Object> o000oooo26 = o000oooo13;
                                        coroutineScope = coroutineScope7;
                                        o000oooo3 = o000oooo26;
                                    }
                                    return Unit.INSTANCE;
                                    loadType11 = LoadType.APPEND;
                                    if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                        if (loadType11 != LoadType.REFRESH) {
                                            oooO00o8 = o000oooo3.f7297OooOO0O;
                                            mutex8 = oooO00o8.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo3;
                                            o00o0o2.f7316OooO0o0 = coroutineScope;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o8;
                                            o00o0o2.f7318OooO0oo = mutex8;
                                            o00o0o2.f7322OooOOO = 12;
                                            if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            CoroutineScope coroutineScope16 = coroutineScope;
                                            o000oooo15 = o000oooo3;
                                            coroutineScope9 = coroutineScope16;
                                            mutex9 = mutex8;
                                            o00oo0o3 = oooO00o8.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = o000oooo15;
                                            o00o0o2.f7316OooO0o0 = coroutineScope9;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = mutex9;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7322OooOOO = 13;
                                            if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType12 = loadType11;
                                            r2 = mutex9;
                                            Unit unit8 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            loadType11 = loadType12;
                                            coroutineScope8 = coroutineScope9;
                                            o000oooo14 = o000oooo15;
                                        } else {
                                            o000oooo14 = o000oooo3;
                                            coroutineScope8 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                            loadType14 = loadType11;
                                            o000oooo17 = o000oooo14;
                                            o000oooo16 = o000oooo17;
                                            o00000Var3 = null;
                                        } else {
                                            oooO00o9 = o000oooo14.f7297OooOO0O;
                                            mutex10 = oooO00o9.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo14;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o9;
                                            o00o0o2.f7318OooO0oo = mutex10;
                                            o00o0o2.f7313OooO = loadType11;
                                            o00o0o2.f7319OooOO0 = o000oooo14;
                                            o00o0o2.f7322OooOOO = 14;
                                            if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType13 = loadType11;
                                            loadType14 = loadType13;
                                            o000oooo16 = o000oooo14;
                                            o00000 o00000Var5 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                            mutex10.unlock(null);
                                            o000oOoO<Object, Object> o000oooo27 = o000oooo14;
                                            o00000Var3 = o00000Var5;
                                            loadType11 = loadType13;
                                            o000oooo17 = o000oooo27;
                                        }
                                        o00o0o2.f7314OooO0Oo = o000oooo16;
                                        o00o0o2.f7316OooO0o0 = coroutineScope8;
                                        o00o0o2.f7315OooO0o = loadType14;
                                        o00o0o2.f7317OooO0oO = null;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7322OooOOO = 15;
                                        if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType14;
                                        coroutineScope10 = coroutineScope8;
                                        o000oooo18 = o000oooo16;
                                        if (loadType15 == LoadType.REFRESH) {
                                            oooO00o10 = o000oooo18.f7297OooOO0O;
                                            mutex11 = oooO00o10.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo18;
                                            o00o0o2.f7316OooO0o0 = coroutineScope10;
                                            o00o0o2.f7315OooO0o = oooO00o10;
                                            o00o0o2.f7317OooO0oO = mutex11;
                                            o00o0o2.f7322OooOOO = 16;
                                            if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutex12 = mutex11;
                                            o000oooo19 = o000oooo18;
                                            oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex12.unlock(null);
                                            if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 2:
                                    Mutex mutex13 = (Mutex) o00o0o2.f7313OooO;
                                    o00oO0o.OooO00o oooO00o11 = (o00oO0o.OooO00o) o00o0o2.f7318OooO0oo;
                                    LoadType loadType16 = (LoadType) o00o0o2.f7317OooO0oO;
                                    CoroutineScope coroutineScope17 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oOoO<Object, Object> o000oooo28 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    OooOOO oooOOO8 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    o00oO0o o00oo0o6 = oooO00o11.f7347OooO0O0;
                                    o00o0o2.f7314OooO0Oo = oooOOO8;
                                    o00o0o2.f7316OooO0o0 = o000oooo28;
                                    o00o0o2.f7315OooO0o = coroutineScope17;
                                    o00o0o2.f7317OooO0oO = loadType16;
                                    o00o0o2.f7318OooO0oo = mutex13;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7322OooOOO = 3;
                                    if (o000oooo28.OooOO0O(o00oo0o6, loadType16, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType2 = loadType16;
                                    coroutineScope3 = coroutineScope17;
                                    o000oooo5 = o000oooo28;
                                    oooOOO3 = oooOOO8;
                                    r2 = mutex13;
                                    Unit unit9 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    coroutineScope2 = coroutineScope3;
                                    o000oooo4 = o000oooo5;
                                    oooOOO2 = oooOOO3;
                                    if (C0159OooO00o.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                        o000oooo7 = o000oooo4;
                                        o00000Var = null;
                                        loadType4 = loadType2;
                                    } else {
                                        oooO00o3 = o000oooo4.f7297OooOO0O;
                                        mutex2 = oooO00o3.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO2;
                                        o00o0o2.f7316OooO0o0 = o000oooo4;
                                        o00o0o2.f7315OooO0o = coroutineScope2;
                                        o00o0o2.f7317OooO0oO = loadType2;
                                        o00o0o2.f7318OooO0oo = oooO00o3;
                                        o00o0o2.f7313OooO = mutex2;
                                        o00o0o2.f7319OooOO0 = loadType2;
                                        o00o0o2.f7320OooOO0O = o000oooo4;
                                        o00o0o2.f7322OooOOO = 4;
                                        if (mutex2.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo6 = o000oooo4;
                                        loadType3 = loadType2;
                                        o00000Var = (o00000) oooO00o3.f7347OooO0O0.f7344OooOO0O.get(loadType3);
                                        mutex2.unlock(null);
                                        o000oooo7 = o000oooo4;
                                        loadType4 = loadType2;
                                        loadType2 = loadType3;
                                        o000oooo4 = o000oooo6;
                                    }
                                    o00o0o2.f7314OooO0Oo = oooOOO2;
                                    o00o0o2.f7316OooO0o0 = o000oooo4;
                                    o00o0o2.f7315OooO0o = coroutineScope2;
                                    o00o0o2.f7317OooO0oO = loadType2;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7320OooOO0O = null;
                                    o00o0o2.f7322OooOOO = 5;
                                    if (o000oOoO.OooO0OO(o000oooo7, loadType4, o00000Var, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    o000oooo8 = o000oooo4;
                                    loadType5 = loadType2;
                                    coroutineScope4 = coroutineScope2;
                                    oooOOO4 = oooOOO2;
                                    if (loadType5 == LoadType.REFRESH) {
                                        oooO00o4 = o000oooo8.f7297OooOO0O;
                                        mutex3 = oooO00o4.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO4;
                                        o00o0o2.f7316OooO0o0 = o000oooo8;
                                        o00o0o2.f7315OooO0o = coroutineScope4;
                                        o00o0o2.f7317OooO0oO = oooO00o4;
                                        o00o0o2.f7318OooO0oo = mutex3;
                                        o00o0o2.f7322OooOOO = 6;
                                        if (mutex3.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o = oooO00o4.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex3.unlock(null);
                                        if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo8, coroutineScope4);
                                        }
                                    }
                                    oooOOO = oooOOO4;
                                    o000oOoO<Object, Object> o000oooo29 = o000oooo8;
                                    coroutineScope = coroutineScope4;
                                    o000oooo3 = o000oooo29;
                                    loadType6 = LoadType.PREPEND;
                                    if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                        if (loadType6 != LoadType.REFRESH) {
                                            oooO00o5 = o000oooo3.f7297OooOO0O;
                                            mutex4 = oooO00o5.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO;
                                            o00o0o2.f7316OooO0o0 = o000oooo3;
                                            o00o0o2.f7315OooO0o = coroutineScope;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = oooO00o5;
                                            o00o0o2.f7313OooO = mutex4;
                                            o00o0o2.f7322OooOOO = 7;
                                            if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO6 = oooOOO;
                                            mutex5 = mutex4;
                                            CoroutineScope coroutineScope18 = coroutineScope;
                                            o000oooo10 = o000oooo3;
                                            coroutineScope6 = coroutineScope18;
                                            o00oo0o2 = oooO00o5.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = oooOOO6;
                                            o00o0o2.f7316OooO0o0 = o000oooo10;
                                            o00o0o2.f7315OooO0o = coroutineScope6;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = mutex5;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7322OooOOO = 8;
                                            if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType7 = loadType6;
                                            r2 = mutex5;
                                            Unit unit10 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope5 = coroutineScope6;
                                            o000oooo9 = o000oooo10;
                                            oooOOO5 = oooOOO6;
                                        } else {
                                            loadType7 = loadType6;
                                            oooOOO5 = oooOOO;
                                            o000oooo9 = o000oooo3;
                                            coroutineScope5 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            o000oooo12 = o000oooo9;
                                            o00000Var2 = null;
                                            loadType9 = loadType7;
                                        } else {
                                            oooO00o6 = o000oooo9.f7297OooOO0O;
                                            mutex6 = oooO00o6.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO5;
                                            o00o0o2.f7316OooO0o0 = o000oooo9;
                                            o00o0o2.f7315OooO0o = coroutineScope5;
                                            o00o0o2.f7317OooO0oO = loadType7;
                                            o00o0o2.f7318OooO0oo = oooO00o6;
                                            o00o0o2.f7313OooO = mutex6;
                                            o00o0o2.f7319OooOO0 = loadType7;
                                            o00o0o2.f7320OooOO0O = o000oooo9;
                                            o00o0o2.f7322OooOOO = 9;
                                            if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo11 = o000oooo9;
                                            loadType8 = loadType7;
                                            o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                            mutex6.unlock(null);
                                            o000oooo12 = o000oooo9;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            o000oooo9 = o000oooo11;
                                        }
                                        o00o0o2.f7314OooO0Oo = oooOOO5;
                                        o00o0o2.f7316OooO0o0 = o000oooo9;
                                        o00o0o2.f7315OooO0o = coroutineScope5;
                                        o00o0o2.f7317OooO0oO = loadType7;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7320OooOO0O = null;
                                        o00o0o2.f7322OooOOO = 10;
                                        if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo13 = o000oooo9;
                                        loadType10 = loadType7;
                                        coroutineScope7 = coroutineScope5;
                                        oooOOO7 = oooOOO5;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o7 = o000oooo13.f7297OooOO0O;
                                            mutex7 = oooO00o7.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO7;
                                            o00o0o2.f7316OooO0o0 = o000oooo13;
                                            o00o0o2.f7315OooO0o = coroutineScope7;
                                            o00o0o2.f7317OooO0oO = oooO00o7;
                                            o00o0o2.f7318OooO0oo = mutex7;
                                            o00o0o2.f7322OooOOO = 11;
                                            if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                            }
                                        }
                                        oooOOO = oooOOO7;
                                        o000oOoO<Object, Object> o000oooo210 = o000oooo13;
                                        coroutineScope = coroutineScope7;
                                        o000oooo3 = o000oooo210;
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope19 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope19;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit11 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var6 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo211 = o000oooo14;
                                                o00000Var3 = o00000Var6;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo211;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    } else {
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope110 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope110;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit12 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var7 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo212 = o000oooo14;
                                                o00000Var3 = o00000Var7;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo212;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 3:
                                    Mutex mutex14 = (Mutex) o00o0o2.f7318OooO0oo;
                                    loadType2 = (LoadType) o00o0o2.f7317OooO0oO;
                                    coroutineScope3 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oooo5 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    oooOOO3 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    r2 = mutex14;
                                    Unit unit13 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    coroutineScope2 = coroutineScope3;
                                    o000oooo4 = o000oooo5;
                                    oooOOO2 = oooOOO3;
                                    if (C0159OooO00o.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                        o000oooo7 = o000oooo4;
                                        o00000Var = null;
                                        loadType4 = loadType2;
                                    } else {
                                        oooO00o3 = o000oooo4.f7297OooOO0O;
                                        mutex2 = oooO00o3.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO2;
                                        o00o0o2.f7316OooO0o0 = o000oooo4;
                                        o00o0o2.f7315OooO0o = coroutineScope2;
                                        o00o0o2.f7317OooO0oO = loadType2;
                                        o00o0o2.f7318OooO0oo = oooO00o3;
                                        o00o0o2.f7313OooO = mutex2;
                                        o00o0o2.f7319OooOO0 = loadType2;
                                        o00o0o2.f7320OooOO0O = o000oooo4;
                                        o00o0o2.f7322OooOOO = 4;
                                        if (mutex2.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo6 = o000oooo4;
                                        loadType3 = loadType2;
                                        o00000Var = (o00000) oooO00o3.f7347OooO0O0.f7344OooOO0O.get(loadType3);
                                        mutex2.unlock(null);
                                        o000oooo7 = o000oooo4;
                                        loadType4 = loadType2;
                                        loadType2 = loadType3;
                                        o000oooo4 = o000oooo6;
                                    }
                                    o00o0o2.f7314OooO0Oo = oooOOO2;
                                    o00o0o2.f7316OooO0o0 = o000oooo4;
                                    o00o0o2.f7315OooO0o = coroutineScope2;
                                    o00o0o2.f7317OooO0oO = loadType2;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7320OooOO0O = null;
                                    o00o0o2.f7322OooOOO = 5;
                                    if (o000oOoO.OooO0OO(o000oooo7, loadType4, o00000Var, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    o000oooo8 = o000oooo4;
                                    loadType5 = loadType2;
                                    coroutineScope4 = coroutineScope2;
                                    oooOOO4 = oooOOO2;
                                    if (loadType5 == LoadType.REFRESH) {
                                        oooO00o4 = o000oooo8.f7297OooOO0O;
                                        mutex3 = oooO00o4.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO4;
                                        o00o0o2.f7316OooO0o0 = o000oooo8;
                                        o00o0o2.f7315OooO0o = coroutineScope4;
                                        o00o0o2.f7317OooO0oO = oooO00o4;
                                        o00o0o2.f7318OooO0oo = mutex3;
                                        o00o0o2.f7322OooOOO = 6;
                                        if (mutex3.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o = oooO00o4.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex3.unlock(null);
                                        if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo8, coroutineScope4);
                                        }
                                    }
                                    oooOOO = oooOOO4;
                                    o000oOoO<Object, Object> o000oooo213 = o000oooo8;
                                    coroutineScope = coroutineScope4;
                                    o000oooo3 = o000oooo213;
                                    loadType6 = LoadType.PREPEND;
                                    if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope111 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope111;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit14 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var8 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo214 = o000oooo14;
                                                o00000Var3 = o00000Var8;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo214;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    } else {
                                        if (loadType6 != LoadType.REFRESH) {
                                            oooO00o5 = o000oooo3.f7297OooOO0O;
                                            mutex4 = oooO00o5.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO;
                                            o00o0o2.f7316OooO0o0 = o000oooo3;
                                            o00o0o2.f7315OooO0o = coroutineScope;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = oooO00o5;
                                            o00o0o2.f7313OooO = mutex4;
                                            o00o0o2.f7322OooOOO = 7;
                                            if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO6 = oooOOO;
                                            mutex5 = mutex4;
                                            CoroutineScope coroutineScope112 = coroutineScope;
                                            o000oooo10 = o000oooo3;
                                            coroutineScope6 = coroutineScope112;
                                            o00oo0o2 = oooO00o5.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = oooOOO6;
                                            o00o0o2.f7316OooO0o0 = o000oooo10;
                                            o00o0o2.f7315OooO0o = coroutineScope6;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = mutex5;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7322OooOOO = 8;
                                            if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType7 = loadType6;
                                            r2 = mutex5;
                                            Unit unit15 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope5 = coroutineScope6;
                                            o000oooo9 = o000oooo10;
                                            oooOOO5 = oooOOO6;
                                        } else {
                                            loadType7 = loadType6;
                                            oooOOO5 = oooOOO;
                                            o000oooo9 = o000oooo3;
                                            coroutineScope5 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            o000oooo12 = o000oooo9;
                                            o00000Var2 = null;
                                            loadType9 = loadType7;
                                        } else {
                                            oooO00o6 = o000oooo9.f7297OooOO0O;
                                            mutex6 = oooO00o6.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO5;
                                            o00o0o2.f7316OooO0o0 = o000oooo9;
                                            o00o0o2.f7315OooO0o = coroutineScope5;
                                            o00o0o2.f7317OooO0oO = loadType7;
                                            o00o0o2.f7318OooO0oo = oooO00o6;
                                            o00o0o2.f7313OooO = mutex6;
                                            o00o0o2.f7319OooOO0 = loadType7;
                                            o00o0o2.f7320OooOO0O = o000oooo9;
                                            o00o0o2.f7322OooOOO = 9;
                                            if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo11 = o000oooo9;
                                            loadType8 = loadType7;
                                            o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                            mutex6.unlock(null);
                                            o000oooo12 = o000oooo9;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            o000oooo9 = o000oooo11;
                                        }
                                        o00o0o2.f7314OooO0Oo = oooOOO5;
                                        o00o0o2.f7316OooO0o0 = o000oooo9;
                                        o00o0o2.f7315OooO0o = coroutineScope5;
                                        o00o0o2.f7317OooO0oO = loadType7;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7320OooOO0O = null;
                                        o00o0o2.f7322OooOOO = 10;
                                        if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo13 = o000oooo9;
                                        loadType10 = loadType7;
                                        coroutineScope7 = coroutineScope5;
                                        oooOOO7 = oooOOO5;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o7 = o000oooo13.f7297OooOO0O;
                                            mutex7 = oooO00o7.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO7;
                                            o00o0o2.f7316OooO0o0 = o000oooo13;
                                            o00o0o2.f7315OooO0o = coroutineScope7;
                                            o00o0o2.f7317OooO0oO = oooO00o7;
                                            o00o0o2.f7318OooO0oo = mutex7;
                                            o00o0o2.f7322OooOOO = 11;
                                            if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                            }
                                        }
                                        oooOOO = oooOOO7;
                                        o000oOoO<Object, Object> o000oooo215 = o000oooo13;
                                        coroutineScope = coroutineScope7;
                                        o000oooo3 = o000oooo215;
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope113 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope113;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit16 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var9 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo216 = o000oooo14;
                                                o00000Var3 = o00000Var9;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo216;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 4:
                                    o000oooo4 = o00o0o2.f7320OooOO0O;
                                    loadType2 = (LoadType) o00o0o2.f7319OooOO0;
                                    mutex2 = (Mutex) o00o0o2.f7313OooO;
                                    oooO00o3 = (o00oO0o.OooO00o) o00o0o2.f7318OooO0oo;
                                    loadType3 = (LoadType) o00o0o2.f7317OooO0oO;
                                    coroutineScope2 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oooo6 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    oooOOO2 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    o00000Var = (o00000) oooO00o3.f7347OooO0O0.f7344OooOO0O.get(loadType3);
                                    mutex2.unlock(null);
                                    o000oooo7 = o000oooo4;
                                    loadType4 = loadType2;
                                    loadType2 = loadType3;
                                    o000oooo4 = o000oooo6;
                                    o00o0o2.f7314OooO0Oo = oooOOO2;
                                    o00o0o2.f7316OooO0o0 = o000oooo4;
                                    o00o0o2.f7315OooO0o = coroutineScope2;
                                    o00o0o2.f7317OooO0oO = loadType2;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7320OooOO0O = null;
                                    o00o0o2.f7322OooOOO = 5;
                                    if (o000oOoO.OooO0OO(o000oooo7, loadType4, o00000Var, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    o000oooo8 = o000oooo4;
                                    loadType5 = loadType2;
                                    coroutineScope4 = coroutineScope2;
                                    oooOOO4 = oooOOO2;
                                    if (loadType5 == LoadType.REFRESH) {
                                        oooO00o4 = o000oooo8.f7297OooOO0O;
                                        mutex3 = oooO00o4.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO4;
                                        o00o0o2.f7316OooO0o0 = o000oooo8;
                                        o00o0o2.f7315OooO0o = coroutineScope4;
                                        o00o0o2.f7317OooO0oO = oooO00o4;
                                        o00o0o2.f7318OooO0oo = mutex3;
                                        o00o0o2.f7322OooOOO = 6;
                                        if (mutex3.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o = oooO00o4.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex3.unlock(null);
                                        if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo8, coroutineScope4);
                                        }
                                    }
                                    oooOOO = oooOOO4;
                                    o000oOoO<Object, Object> o000oooo217 = o000oooo8;
                                    coroutineScope = coroutineScope4;
                                    o000oooo3 = o000oooo217;
                                    loadType6 = LoadType.PREPEND;
                                    if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope114 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope114;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit17 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var10 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo218 = o000oooo14;
                                                o00000Var3 = o00000Var10;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo218;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    } else {
                                        if (loadType6 != LoadType.REFRESH) {
                                            oooO00o5 = o000oooo3.f7297OooOO0O;
                                            mutex4 = oooO00o5.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO;
                                            o00o0o2.f7316OooO0o0 = o000oooo3;
                                            o00o0o2.f7315OooO0o = coroutineScope;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = oooO00o5;
                                            o00o0o2.f7313OooO = mutex4;
                                            o00o0o2.f7322OooOOO = 7;
                                            if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO6 = oooOOO;
                                            mutex5 = mutex4;
                                            CoroutineScope coroutineScope115 = coroutineScope;
                                            o000oooo10 = o000oooo3;
                                            coroutineScope6 = coroutineScope115;
                                            o00oo0o2 = oooO00o5.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = oooOOO6;
                                            o00o0o2.f7316OooO0o0 = o000oooo10;
                                            o00o0o2.f7315OooO0o = coroutineScope6;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = mutex5;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7322OooOOO = 8;
                                            if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType7 = loadType6;
                                            r2 = mutex5;
                                            Unit unit18 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope5 = coroutineScope6;
                                            o000oooo9 = o000oooo10;
                                            oooOOO5 = oooOOO6;
                                        } else {
                                            loadType7 = loadType6;
                                            oooOOO5 = oooOOO;
                                            o000oooo9 = o000oooo3;
                                            coroutineScope5 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            o000oooo12 = o000oooo9;
                                            o00000Var2 = null;
                                            loadType9 = loadType7;
                                        } else {
                                            oooO00o6 = o000oooo9.f7297OooOO0O;
                                            mutex6 = oooO00o6.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO5;
                                            o00o0o2.f7316OooO0o0 = o000oooo9;
                                            o00o0o2.f7315OooO0o = coroutineScope5;
                                            o00o0o2.f7317OooO0oO = loadType7;
                                            o00o0o2.f7318OooO0oo = oooO00o6;
                                            o00o0o2.f7313OooO = mutex6;
                                            o00o0o2.f7319OooOO0 = loadType7;
                                            o00o0o2.f7320OooOO0O = o000oooo9;
                                            o00o0o2.f7322OooOOO = 9;
                                            if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo11 = o000oooo9;
                                            loadType8 = loadType7;
                                            o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                            mutex6.unlock(null);
                                            o000oooo12 = o000oooo9;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            o000oooo9 = o000oooo11;
                                        }
                                        o00o0o2.f7314OooO0Oo = oooOOO5;
                                        o00o0o2.f7316OooO0o0 = o000oooo9;
                                        o00o0o2.f7315OooO0o = coroutineScope5;
                                        o00o0o2.f7317OooO0oO = loadType7;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7320OooOO0O = null;
                                        o00o0o2.f7322OooOOO = 10;
                                        if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo13 = o000oooo9;
                                        loadType10 = loadType7;
                                        coroutineScope7 = coroutineScope5;
                                        oooOOO7 = oooOOO5;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o7 = o000oooo13.f7297OooOO0O;
                                            mutex7 = oooO00o7.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO7;
                                            o00o0o2.f7316OooO0o0 = o000oooo13;
                                            o00o0o2.f7315OooO0o = coroutineScope7;
                                            o00o0o2.f7317OooO0oO = oooO00o7;
                                            o00o0o2.f7318OooO0oo = mutex7;
                                            o00o0o2.f7322OooOOO = 11;
                                            if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                            }
                                        }
                                        oooOOO = oooOOO7;
                                        o000oOoO<Object, Object> o000oooo219 = o000oooo13;
                                        coroutineScope = coroutineScope7;
                                        o000oooo3 = o000oooo219;
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope116 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope116;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit19 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var11 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo2110 = o000oooo14;
                                                o00000Var3 = o00000Var11;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo2110;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 5:
                                    loadType5 = (LoadType) o00o0o2.f7317OooO0oO;
                                    CoroutineScope coroutineScope20 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oOoO<Object, Object> o000oooo30 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    OooOOO oooOOO9 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    oooOOO4 = oooOOO9;
                                    o000oooo8 = o000oooo30;
                                    coroutineScope4 = coroutineScope20;
                                    if (loadType5 == LoadType.REFRESH) {
                                        oooO00o4 = o000oooo8.f7297OooOO0O;
                                        mutex3 = oooO00o4.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO4;
                                        o00o0o2.f7316OooO0o0 = o000oooo8;
                                        o00o0o2.f7315OooO0o = coroutineScope4;
                                        o00o0o2.f7317OooO0oO = oooO00o4;
                                        o00o0o2.f7318OooO0oo = mutex3;
                                        o00o0o2.f7322OooOOO = 6;
                                        if (mutex3.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o = oooO00o4.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex3.unlock(null);
                                        if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo8, coroutineScope4);
                                        }
                                    }
                                    oooOOO = oooOOO4;
                                    o000oOoO<Object, Object> o000oooo2111 = o000oooo8;
                                    coroutineScope = coroutineScope4;
                                    o000oooo3 = o000oooo2111;
                                    loadType6 = LoadType.PREPEND;
                                    if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope117 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope117;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit110 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var12 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo2112 = o000oooo14;
                                                o00000Var3 = o00000Var12;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo2112;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    } else {
                                        if (loadType6 != LoadType.REFRESH) {
                                            oooO00o5 = o000oooo3.f7297OooOO0O;
                                            mutex4 = oooO00o5.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO;
                                            o00o0o2.f7316OooO0o0 = o000oooo3;
                                            o00o0o2.f7315OooO0o = coroutineScope;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = oooO00o5;
                                            o00o0o2.f7313OooO = mutex4;
                                            o00o0o2.f7322OooOOO = 7;
                                            if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO6 = oooOOO;
                                            mutex5 = mutex4;
                                            CoroutineScope coroutineScope118 = coroutineScope;
                                            o000oooo10 = o000oooo3;
                                            coroutineScope6 = coroutineScope118;
                                            o00oo0o2 = oooO00o5.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = oooOOO6;
                                            o00o0o2.f7316OooO0o0 = o000oooo10;
                                            o00o0o2.f7315OooO0o = coroutineScope6;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = mutex5;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7322OooOOO = 8;
                                            if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType7 = loadType6;
                                            r2 = mutex5;
                                            Unit unit111 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope5 = coroutineScope6;
                                            o000oooo9 = o000oooo10;
                                            oooOOO5 = oooOOO6;
                                        } else {
                                            loadType7 = loadType6;
                                            oooOOO5 = oooOOO;
                                            o000oooo9 = o000oooo3;
                                            coroutineScope5 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            o000oooo12 = o000oooo9;
                                            o00000Var2 = null;
                                            loadType9 = loadType7;
                                        } else {
                                            oooO00o6 = o000oooo9.f7297OooOO0O;
                                            mutex6 = oooO00o6.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO5;
                                            o00o0o2.f7316OooO0o0 = o000oooo9;
                                            o00o0o2.f7315OooO0o = coroutineScope5;
                                            o00o0o2.f7317OooO0oO = loadType7;
                                            o00o0o2.f7318OooO0oo = oooO00o6;
                                            o00o0o2.f7313OooO = mutex6;
                                            o00o0o2.f7319OooOO0 = loadType7;
                                            o00o0o2.f7320OooOO0O = o000oooo9;
                                            o00o0o2.f7322OooOOO = 9;
                                            if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo11 = o000oooo9;
                                            loadType8 = loadType7;
                                            o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                            mutex6.unlock(null);
                                            o000oooo12 = o000oooo9;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            o000oooo9 = o000oooo11;
                                        }
                                        o00o0o2.f7314OooO0Oo = oooOOO5;
                                        o00o0o2.f7316OooO0o0 = o000oooo9;
                                        o00o0o2.f7315OooO0o = coroutineScope5;
                                        o00o0o2.f7317OooO0oO = loadType7;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7320OooOO0O = null;
                                        o00o0o2.f7322OooOOO = 10;
                                        if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo13 = o000oooo9;
                                        loadType10 = loadType7;
                                        coroutineScope7 = coroutineScope5;
                                        oooOOO7 = oooOOO5;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o7 = o000oooo13.f7297OooOO0O;
                                            mutex7 = oooO00o7.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO7;
                                            o00o0o2.f7316OooO0o0 = o000oooo13;
                                            o00o0o2.f7315OooO0o = coroutineScope7;
                                            o00o0o2.f7317OooO0oO = oooO00o7;
                                            o00o0o2.f7318OooO0oo = mutex7;
                                            o00o0o2.f7322OooOOO = 11;
                                            if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                            }
                                        }
                                        oooOOO = oooOOO7;
                                        o000oOoO<Object, Object> o000oooo2113 = o000oooo13;
                                        coroutineScope = coroutineScope7;
                                        o000oooo3 = o000oooo2113;
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope119 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope119;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit112 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var13 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo2114 = o000oooo14;
                                                o00000Var3 = o00000Var13;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo2114;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 6:
                                    mutex3 = (Mutex) o00o0o2.f7318OooO0oo;
                                    oooO00o4 = (o00oO0o.OooO00o) o00o0o2.f7317OooO0oO;
                                    coroutineScope4 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oooo8 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    oooOOO4 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    oooOOO0OooO00o = oooO00o4.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                    mutex3.unlock(null);
                                    if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                                        o000oOoO.OooO0Oo(o000oooo8, coroutineScope4);
                                    }
                                    oooOOO = oooOOO4;
                                    o000oOoO<Object, Object> o000oooo2115 = o000oooo8;
                                    coroutineScope = coroutineScope4;
                                    o000oooo3 = o000oooo2115;
                                    loadType6 = LoadType.PREPEND;
                                    if (oooOOO.f7161OooO0O0 instanceof OooOOO0.OooO00o) {
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope1110 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope1110;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit113 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var14 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo2116 = o000oooo14;
                                                o00000Var3 = o00000Var14;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo2116;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    } else {
                                        if (loadType6 != LoadType.REFRESH) {
                                            oooO00o5 = o000oooo3.f7297OooOO0O;
                                            mutex4 = oooO00o5.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO;
                                            o00o0o2.f7316OooO0o0 = o000oooo3;
                                            o00o0o2.f7315OooO0o = coroutineScope;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = oooO00o5;
                                            o00o0o2.f7313OooO = mutex4;
                                            o00o0o2.f7322OooOOO = 7;
                                            if (mutex4.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO6 = oooOOO;
                                            mutex5 = mutex4;
                                            CoroutineScope coroutineScope1111 = coroutineScope;
                                            o000oooo10 = o000oooo3;
                                            coroutineScope6 = coroutineScope1111;
                                            o00oo0o2 = oooO00o5.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = oooOOO6;
                                            o00o0o2.f7316OooO0o0 = o000oooo10;
                                            o00o0o2.f7315OooO0o = coroutineScope6;
                                            o00o0o2.f7317OooO0oO = loadType6;
                                            o00o0o2.f7318OooO0oo = mutex5;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7322OooOOO = 8;
                                            if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType7 = loadType6;
                                            r2 = mutex5;
                                            Unit unit114 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope5 = coroutineScope6;
                                            o000oooo9 = o000oooo10;
                                            oooOOO5 = oooOOO6;
                                        } else {
                                            loadType7 = loadType6;
                                            oooOOO5 = oooOOO;
                                            o000oooo9 = o000oooo3;
                                            coroutineScope5 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            o000oooo12 = o000oooo9;
                                            o00000Var2 = null;
                                            loadType9 = loadType7;
                                        } else {
                                            oooO00o6 = o000oooo9.f7297OooOO0O;
                                            mutex6 = oooO00o6.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO5;
                                            o00o0o2.f7316OooO0o0 = o000oooo9;
                                            o00o0o2.f7315OooO0o = coroutineScope5;
                                            o00o0o2.f7317OooO0oO = loadType7;
                                            o00o0o2.f7318OooO0oo = oooO00o6;
                                            o00o0o2.f7313OooO = mutex6;
                                            o00o0o2.f7319OooOO0 = loadType7;
                                            o00o0o2.f7320OooOO0O = o000oooo9;
                                            o00o0o2.f7322OooOOO = 9;
                                            if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            o000oooo11 = o000oooo9;
                                            loadType8 = loadType7;
                                            o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                            mutex6.unlock(null);
                                            o000oooo12 = o000oooo9;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            o000oooo9 = o000oooo11;
                                        }
                                        o00o0o2.f7314OooO0Oo = oooOOO5;
                                        o00o0o2.f7316OooO0o0 = o000oooo9;
                                        o00o0o2.f7315OooO0o = coroutineScope5;
                                        o00o0o2.f7317OooO0oO = loadType7;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7320OooOO0O = null;
                                        o00o0o2.f7322OooOOO = 10;
                                        if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo13 = o000oooo9;
                                        loadType10 = loadType7;
                                        coroutineScope7 = coroutineScope5;
                                        oooOOO7 = oooOOO5;
                                        if (loadType10 == LoadType.REFRESH) {
                                            oooO00o7 = o000oooo13.f7297OooOO0O;
                                            mutex7 = oooO00o7.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = oooOOO7;
                                            o00o0o2.f7316OooO0o0 = o000oooo13;
                                            o00o0o2.f7315OooO0o = coroutineScope7;
                                            o00o0o2.f7317OooO0oO = oooO00o7;
                                            o00o0o2.f7318OooO0oo = mutex7;
                                            o00o0o2.f7322OooOOO = 11;
                                            if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex7.unlock(null);
                                            if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                            }
                                        }
                                        oooOOO = oooOOO7;
                                        o000oOoO<Object, Object> o000oooo2117 = o000oooo13;
                                        coroutineScope = coroutineScope7;
                                        o000oooo3 = o000oooo2117;
                                        loadType11 = LoadType.APPEND;
                                        if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                            if (loadType11 != LoadType.REFRESH) {
                                                oooO00o8 = o000oooo3.f7297OooOO0O;
                                                mutex8 = oooO00o8.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo3;
                                                o00o0o2.f7316OooO0o0 = coroutineScope;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o8;
                                                o00o0o2.f7318OooO0oo = mutex8;
                                                o00o0o2.f7322OooOOO = 12;
                                                if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                CoroutineScope coroutineScope1112 = coroutineScope;
                                                o000oooo15 = o000oooo3;
                                                coroutineScope9 = coroutineScope1112;
                                                mutex9 = mutex8;
                                                o00oo0o3 = oooO00o8.f7347OooO0O0;
                                                o00o0o2.f7314OooO0Oo = o000oooo15;
                                                o00o0o2.f7316OooO0o0 = coroutineScope9;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = mutex9;
                                                o00o0o2.f7318OooO0oo = null;
                                                o00o0o2.f7322OooOOO = 13;
                                                if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType12 = loadType11;
                                                r2 = mutex9;
                                                Unit unit115 = Unit.INSTANCE;
                                                r2.unlock(null);
                                                loadType11 = loadType12;
                                                coroutineScope8 = coroutineScope9;
                                                o000oooo14 = o000oooo15;
                                            } else {
                                                o000oooo14 = o000oooo3;
                                                coroutineScope8 = coroutineScope;
                                            }
                                            if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                loadType14 = loadType11;
                                                o000oooo17 = o000oooo14;
                                                o000oooo16 = o000oooo17;
                                                o00000Var3 = null;
                                            } else {
                                                oooO00o9 = o000oooo14.f7297OooOO0O;
                                                mutex10 = oooO00o9.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo14;
                                                o00o0o2.f7316OooO0o0 = coroutineScope8;
                                                o00o0o2.f7315OooO0o = loadType11;
                                                o00o0o2.f7317OooO0oO = oooO00o9;
                                                o00o0o2.f7318OooO0oo = mutex10;
                                                o00o0o2.f7313OooO = loadType11;
                                                o00o0o2.f7319OooOO0 = o000oooo14;
                                                o00o0o2.f7322OooOOO = 14;
                                                if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                loadType13 = loadType11;
                                                loadType14 = loadType13;
                                                o000oooo16 = o000oooo14;
                                                o00000 o00000Var15 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                                mutex10.unlock(null);
                                                o000oOoO<Object, Object> o000oooo2118 = o000oooo14;
                                                o00000Var3 = o00000Var15;
                                                loadType11 = loadType13;
                                                o000oooo17 = o000oooo2118;
                                            }
                                            o00o0o2.f7314OooO0Oo = o000oooo16;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType14;
                                            o00o0o2.f7317OooO0oO = null;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7313OooO = null;
                                            o00o0o2.f7319OooOO0 = null;
                                            o00o0o2.f7322OooOOO = 15;
                                            if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType15 = loadType14;
                                            coroutineScope10 = coroutineScope8;
                                            o000oooo18 = o000oooo16;
                                            if (loadType15 == LoadType.REFRESH) {
                                                oooO00o10 = o000oooo18.f7297OooOO0O;
                                                mutex11 = oooO00o10.f7346OooO00o;
                                                o00o0o2.f7314OooO0Oo = o000oooo18;
                                                o00o0o2.f7316OooO0o0 = coroutineScope10;
                                                o00o0o2.f7315OooO0o = oooO00o10;
                                                o00o0o2.f7317OooO0oO = mutex11;
                                                o00o0o2.f7322OooOOO = 16;
                                                if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutex12 = mutex11;
                                                o000oooo19 = o000oooo18;
                                                oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                                mutex12.unlock(null);
                                                if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                    o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                                }
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    Mutex mutex15 = (Mutex) o00o0o2.f7313OooO;
                                    oooO00o5 = (o00oO0o.OooO00o) o00o0o2.f7318OooO0oo;
                                    LoadType loadType17 = (LoadType) o00o0o2.f7317OooO0oO;
                                    CoroutineScope coroutineScope21 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oOoO<Object, Object> o000oooo31 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    OooOOO oooOOO10 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    loadType6 = loadType17;
                                    coroutineScope6 = coroutineScope21;
                                    o000oooo10 = o000oooo31;
                                    oooOOO6 = oooOOO10;
                                    mutex5 = mutex15;
                                    o00oo0o2 = oooO00o5.f7347OooO0O0;
                                    o00o0o2.f7314OooO0Oo = oooOOO6;
                                    o00o0o2.f7316OooO0o0 = o000oooo10;
                                    o00o0o2.f7315OooO0o = coroutineScope6;
                                    o00o0o2.f7317OooO0oO = loadType6;
                                    o00o0o2.f7318OooO0oo = mutex5;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7322OooOOO = 8;
                                    if (o000oooo10.OooOO0O(o00oo0o2, loadType6, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType7 = loadType6;
                                    r2 = mutex5;
                                    Unit unit116 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    coroutineScope5 = coroutineScope6;
                                    o000oooo9 = o000oooo10;
                                    oooOOO5 = oooOOO6;
                                    if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                        o000oooo12 = o000oooo9;
                                        o00000Var2 = null;
                                        loadType9 = loadType7;
                                    } else {
                                        oooO00o6 = o000oooo9.f7297OooOO0O;
                                        mutex6 = oooO00o6.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO5;
                                        o00o0o2.f7316OooO0o0 = o000oooo9;
                                        o00o0o2.f7315OooO0o = coroutineScope5;
                                        o00o0o2.f7317OooO0oO = loadType7;
                                        o00o0o2.f7318OooO0oo = oooO00o6;
                                        o00o0o2.f7313OooO = mutex6;
                                        o00o0o2.f7319OooOO0 = loadType7;
                                        o00o0o2.f7320OooOO0O = o000oooo9;
                                        o00o0o2.f7322OooOOO = 9;
                                        if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo11 = o000oooo9;
                                        loadType8 = loadType7;
                                        o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                        mutex6.unlock(null);
                                        o000oooo12 = o000oooo9;
                                        loadType9 = loadType7;
                                        loadType7 = loadType8;
                                        o000oooo9 = o000oooo11;
                                    }
                                    o00o0o2.f7314OooO0Oo = oooOOO5;
                                    o00o0o2.f7316OooO0o0 = o000oooo9;
                                    o00o0o2.f7315OooO0o = coroutineScope5;
                                    o00o0o2.f7317OooO0oO = loadType7;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7320OooOO0O = null;
                                    o00o0o2.f7322OooOOO = 10;
                                    if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    o000oooo13 = o000oooo9;
                                    loadType10 = loadType7;
                                    coroutineScope7 = coroutineScope5;
                                    oooOOO7 = oooOOO5;
                                    if (loadType10 == LoadType.REFRESH) {
                                        oooO00o7 = o000oooo13.f7297OooOO0O;
                                        mutex7 = oooO00o7.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO7;
                                        o00o0o2.f7316OooO0o0 = o000oooo13;
                                        o00o0o2.f7315OooO0o = coroutineScope7;
                                        o00o0o2.f7317OooO0oO = oooO00o7;
                                        o00o0o2.f7318OooO0oo = mutex7;
                                        o00o0o2.f7322OooOOO = 11;
                                        if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex7.unlock(null);
                                        if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                        }
                                    }
                                    oooOOO = oooOOO7;
                                    o000oOoO<Object, Object> o000oooo2119 = o000oooo13;
                                    coroutineScope = coroutineScope7;
                                    o000oooo3 = o000oooo2119;
                                    loadType11 = LoadType.APPEND;
                                    if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                        if (loadType11 != LoadType.REFRESH) {
                                            oooO00o8 = o000oooo3.f7297OooOO0O;
                                            mutex8 = oooO00o8.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo3;
                                            o00o0o2.f7316OooO0o0 = coroutineScope;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o8;
                                            o00o0o2.f7318OooO0oo = mutex8;
                                            o00o0o2.f7322OooOOO = 12;
                                            if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            CoroutineScope coroutineScope1113 = coroutineScope;
                                            o000oooo15 = o000oooo3;
                                            coroutineScope9 = coroutineScope1113;
                                            mutex9 = mutex8;
                                            o00oo0o3 = oooO00o8.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = o000oooo15;
                                            o00o0o2.f7316OooO0o0 = coroutineScope9;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = mutex9;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7322OooOOO = 13;
                                            if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType12 = loadType11;
                                            r2 = mutex9;
                                            Unit unit117 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            loadType11 = loadType12;
                                            coroutineScope8 = coroutineScope9;
                                            o000oooo14 = o000oooo15;
                                        } else {
                                            o000oooo14 = o000oooo3;
                                            coroutineScope8 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                            loadType14 = loadType11;
                                            o000oooo17 = o000oooo14;
                                            o000oooo16 = o000oooo17;
                                            o00000Var3 = null;
                                        } else {
                                            oooO00o9 = o000oooo14.f7297OooOO0O;
                                            mutex10 = oooO00o9.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo14;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o9;
                                            o00o0o2.f7318OooO0oo = mutex10;
                                            o00o0o2.f7313OooO = loadType11;
                                            o00o0o2.f7319OooOO0 = o000oooo14;
                                            o00o0o2.f7322OooOOO = 14;
                                            if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType13 = loadType11;
                                            loadType14 = loadType13;
                                            o000oooo16 = o000oooo14;
                                            o00000 o00000Var16 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                            mutex10.unlock(null);
                                            o000oOoO<Object, Object> o000oooo21110 = o000oooo14;
                                            o00000Var3 = o00000Var16;
                                            loadType11 = loadType13;
                                            o000oooo17 = o000oooo21110;
                                        }
                                        o00o0o2.f7314OooO0Oo = o000oooo16;
                                        o00o0o2.f7316OooO0o0 = coroutineScope8;
                                        o00o0o2.f7315OooO0o = loadType14;
                                        o00o0o2.f7317OooO0oO = null;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7322OooOOO = 15;
                                        if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType14;
                                        coroutineScope10 = coroutineScope8;
                                        o000oooo18 = o000oooo16;
                                        if (loadType15 == LoadType.REFRESH) {
                                            oooO00o10 = o000oooo18.f7297OooOO0O;
                                            mutex11 = oooO00o10.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo18;
                                            o00o0o2.f7316OooO0o0 = coroutineScope10;
                                            o00o0o2.f7315OooO0o = oooO00o10;
                                            o00o0o2.f7317OooO0oO = mutex11;
                                            o00o0o2.f7322OooOOO = 16;
                                            if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutex12 = mutex11;
                                            o000oooo19 = o000oooo18;
                                            oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex12.unlock(null);
                                            if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 8:
                                    Mutex mutex16 = (Mutex) o00o0o2.f7318OooO0oo;
                                    loadType7 = (LoadType) o00o0o2.f7317OooO0oO;
                                    coroutineScope6 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oooo10 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    oooOOO6 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    r2 = mutex16;
                                    Unit unit118 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    coroutineScope5 = coroutineScope6;
                                    o000oooo9 = o000oooo10;
                                    oooOOO5 = oooOOO6;
                                    if (C0159OooO00o.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                        o000oooo12 = o000oooo9;
                                        o00000Var2 = null;
                                        loadType9 = loadType7;
                                    } else {
                                        oooO00o6 = o000oooo9.f7297OooOO0O;
                                        mutex6 = oooO00o6.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO5;
                                        o00o0o2.f7316OooO0o0 = o000oooo9;
                                        o00o0o2.f7315OooO0o = coroutineScope5;
                                        o00o0o2.f7317OooO0oO = loadType7;
                                        o00o0o2.f7318OooO0oo = oooO00o6;
                                        o00o0o2.f7313OooO = mutex6;
                                        o00o0o2.f7319OooOO0 = loadType7;
                                        o00o0o2.f7320OooOO0O = o000oooo9;
                                        o00o0o2.f7322OooOOO = 9;
                                        if (mutex6.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        o000oooo11 = o000oooo9;
                                        loadType8 = loadType7;
                                        o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                        mutex6.unlock(null);
                                        o000oooo12 = o000oooo9;
                                        loadType9 = loadType7;
                                        loadType7 = loadType8;
                                        o000oooo9 = o000oooo11;
                                    }
                                    o00o0o2.f7314OooO0Oo = oooOOO5;
                                    o00o0o2.f7316OooO0o0 = o000oooo9;
                                    o00o0o2.f7315OooO0o = coroutineScope5;
                                    o00o0o2.f7317OooO0oO = loadType7;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7320OooOO0O = null;
                                    o00o0o2.f7322OooOOO = 10;
                                    if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    o000oooo13 = o000oooo9;
                                    loadType10 = loadType7;
                                    coroutineScope7 = coroutineScope5;
                                    oooOOO7 = oooOOO5;
                                    if (loadType10 == LoadType.REFRESH) {
                                        oooO00o7 = o000oooo13.f7297OooOO0O;
                                        mutex7 = oooO00o7.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO7;
                                        o00o0o2.f7316OooO0o0 = o000oooo13;
                                        o00o0o2.f7315OooO0o = coroutineScope7;
                                        o00o0o2.f7317OooO0oO = oooO00o7;
                                        o00o0o2.f7318OooO0oo = mutex7;
                                        o00o0o2.f7322OooOOO = 11;
                                        if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex7.unlock(null);
                                        if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                        }
                                    }
                                    oooOOO = oooOOO7;
                                    o000oOoO<Object, Object> o000oooo21111 = o000oooo13;
                                    coroutineScope = coroutineScope7;
                                    o000oooo3 = o000oooo21111;
                                    loadType11 = LoadType.APPEND;
                                    if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                        if (loadType11 != LoadType.REFRESH) {
                                            oooO00o8 = o000oooo3.f7297OooOO0O;
                                            mutex8 = oooO00o8.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo3;
                                            o00o0o2.f7316OooO0o0 = coroutineScope;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o8;
                                            o00o0o2.f7318OooO0oo = mutex8;
                                            o00o0o2.f7322OooOOO = 12;
                                            if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            CoroutineScope coroutineScope1114 = coroutineScope;
                                            o000oooo15 = o000oooo3;
                                            coroutineScope9 = coroutineScope1114;
                                            mutex9 = mutex8;
                                            o00oo0o3 = oooO00o8.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = o000oooo15;
                                            o00o0o2.f7316OooO0o0 = coroutineScope9;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = mutex9;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7322OooOOO = 13;
                                            if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType12 = loadType11;
                                            r2 = mutex9;
                                            Unit unit119 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            loadType11 = loadType12;
                                            coroutineScope8 = coroutineScope9;
                                            o000oooo14 = o000oooo15;
                                        } else {
                                            o000oooo14 = o000oooo3;
                                            coroutineScope8 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                            loadType14 = loadType11;
                                            o000oooo17 = o000oooo14;
                                            o000oooo16 = o000oooo17;
                                            o00000Var3 = null;
                                        } else {
                                            oooO00o9 = o000oooo14.f7297OooOO0O;
                                            mutex10 = oooO00o9.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo14;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o9;
                                            o00o0o2.f7318OooO0oo = mutex10;
                                            o00o0o2.f7313OooO = loadType11;
                                            o00o0o2.f7319OooOO0 = o000oooo14;
                                            o00o0o2.f7322OooOOO = 14;
                                            if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType13 = loadType11;
                                            loadType14 = loadType13;
                                            o000oooo16 = o000oooo14;
                                            o00000 o00000Var17 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                            mutex10.unlock(null);
                                            o000oOoO<Object, Object> o000oooo21112 = o000oooo14;
                                            o00000Var3 = o00000Var17;
                                            loadType11 = loadType13;
                                            o000oooo17 = o000oooo21112;
                                        }
                                        o00o0o2.f7314OooO0Oo = o000oooo16;
                                        o00o0o2.f7316OooO0o0 = coroutineScope8;
                                        o00o0o2.f7315OooO0o = loadType14;
                                        o00o0o2.f7317OooO0oO = null;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7322OooOOO = 15;
                                        if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType14;
                                        coroutineScope10 = coroutineScope8;
                                        o000oooo18 = o000oooo16;
                                        if (loadType15 == LoadType.REFRESH) {
                                            oooO00o10 = o000oooo18.f7297OooOO0O;
                                            mutex11 = oooO00o10.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo18;
                                            o00o0o2.f7316OooO0o0 = coroutineScope10;
                                            o00o0o2.f7315OooO0o = oooO00o10;
                                            o00o0o2.f7317OooO0oO = mutex11;
                                            o00o0o2.f7322OooOOO = 16;
                                            if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutex12 = mutex11;
                                            o000oooo19 = o000oooo18;
                                            oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex12.unlock(null);
                                            if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 9:
                                    o000oooo9 = o00o0o2.f7320OooOO0O;
                                    loadType7 = (LoadType) o00o0o2.f7319OooOO0;
                                    mutex6 = (Mutex) o00o0o2.f7313OooO;
                                    oooO00o6 = (o00oO0o.OooO00o) o00o0o2.f7318OooO0oo;
                                    loadType8 = (LoadType) o00o0o2.f7317OooO0oO;
                                    coroutineScope5 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oooo11 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    oooOOO5 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    o00000Var2 = (o00000) oooO00o6.f7347OooO0O0.f7344OooOO0O.get(loadType8);
                                    mutex6.unlock(null);
                                    o000oooo12 = o000oooo9;
                                    loadType9 = loadType7;
                                    loadType7 = loadType8;
                                    o000oooo9 = o000oooo11;
                                    o00o0o2.f7314OooO0Oo = oooOOO5;
                                    o00o0o2.f7316OooO0o0 = o000oooo9;
                                    o00o0o2.f7315OooO0o = coroutineScope5;
                                    o00o0o2.f7317OooO0oO = loadType7;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7320OooOO0O = null;
                                    o00o0o2.f7322OooOOO = 10;
                                    if (o000oOoO.OooO0OO(o000oooo12, loadType9, o00000Var2, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    o000oooo13 = o000oooo9;
                                    loadType10 = loadType7;
                                    coroutineScope7 = coroutineScope5;
                                    oooOOO7 = oooOOO5;
                                    if (loadType10 == LoadType.REFRESH) {
                                        oooO00o7 = o000oooo13.f7297OooOO0O;
                                        mutex7 = oooO00o7.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO7;
                                        o00o0o2.f7316OooO0o0 = o000oooo13;
                                        o00o0o2.f7315OooO0o = coroutineScope7;
                                        o00o0o2.f7317OooO0oO = oooO00o7;
                                        o00o0o2.f7318OooO0oo = mutex7;
                                        o00o0o2.f7322OooOOO = 11;
                                        if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex7.unlock(null);
                                        if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                        }
                                    }
                                    oooOOO = oooOOO7;
                                    o000oOoO<Object, Object> o000oooo21113 = o000oooo13;
                                    coroutineScope = coroutineScope7;
                                    o000oooo3 = o000oooo21113;
                                    loadType11 = LoadType.APPEND;
                                    if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                        if (loadType11 != LoadType.REFRESH) {
                                            oooO00o8 = o000oooo3.f7297OooOO0O;
                                            mutex8 = oooO00o8.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo3;
                                            o00o0o2.f7316OooO0o0 = coroutineScope;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o8;
                                            o00o0o2.f7318OooO0oo = mutex8;
                                            o00o0o2.f7322OooOOO = 12;
                                            if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            CoroutineScope coroutineScope1115 = coroutineScope;
                                            o000oooo15 = o000oooo3;
                                            coroutineScope9 = coroutineScope1115;
                                            mutex9 = mutex8;
                                            o00oo0o3 = oooO00o8.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = o000oooo15;
                                            o00o0o2.f7316OooO0o0 = coroutineScope9;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = mutex9;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7322OooOOO = 13;
                                            if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType12 = loadType11;
                                            r2 = mutex9;
                                            Unit unit1110 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            loadType11 = loadType12;
                                            coroutineScope8 = coroutineScope9;
                                            o000oooo14 = o000oooo15;
                                        } else {
                                            o000oooo14 = o000oooo3;
                                            coroutineScope8 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                            loadType14 = loadType11;
                                            o000oooo17 = o000oooo14;
                                            o000oooo16 = o000oooo17;
                                            o00000Var3 = null;
                                        } else {
                                            oooO00o9 = o000oooo14.f7297OooOO0O;
                                            mutex10 = oooO00o9.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo14;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o9;
                                            o00o0o2.f7318OooO0oo = mutex10;
                                            o00o0o2.f7313OooO = loadType11;
                                            o00o0o2.f7319OooOO0 = o000oooo14;
                                            o00o0o2.f7322OooOOO = 14;
                                            if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType13 = loadType11;
                                            loadType14 = loadType13;
                                            o000oooo16 = o000oooo14;
                                            o00000 o00000Var18 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                            mutex10.unlock(null);
                                            o000oOoO<Object, Object> o000oooo21114 = o000oooo14;
                                            o00000Var3 = o00000Var18;
                                            loadType11 = loadType13;
                                            o000oooo17 = o000oooo21114;
                                        }
                                        o00o0o2.f7314OooO0Oo = o000oooo16;
                                        o00o0o2.f7316OooO0o0 = coroutineScope8;
                                        o00o0o2.f7315OooO0o = loadType14;
                                        o00o0o2.f7317OooO0oO = null;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7322OooOOO = 15;
                                        if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType14;
                                        coroutineScope10 = coroutineScope8;
                                        o000oooo18 = o000oooo16;
                                        if (loadType15 == LoadType.REFRESH) {
                                            oooO00o10 = o000oooo18.f7297OooOO0O;
                                            mutex11 = oooO00o10.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo18;
                                            o00o0o2.f7316OooO0o0 = coroutineScope10;
                                            o00o0o2.f7315OooO0o = oooO00o10;
                                            o00o0o2.f7317OooO0oO = mutex11;
                                            o00o0o2.f7322OooOOO = 16;
                                            if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutex12 = mutex11;
                                            o000oooo19 = o000oooo18;
                                            oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex12.unlock(null);
                                            if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 10:
                                    loadType10 = (LoadType) o00o0o2.f7317OooO0oO;
                                    CoroutineScope coroutineScope22 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oOoO<Object, Object> o000oooo32 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    OooOOO oooOOO11 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    oooOOO7 = oooOOO11;
                                    o000oooo13 = o000oooo32;
                                    coroutineScope7 = coroutineScope22;
                                    if (loadType10 == LoadType.REFRESH) {
                                        oooO00o7 = o000oooo13.f7297OooOO0O;
                                        mutex7 = oooO00o7.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = oooOOO7;
                                        o00o0o2.f7316OooO0o0 = o000oooo13;
                                        o00o0o2.f7315OooO0o = coroutineScope7;
                                        o00o0o2.f7317OooO0oO = oooO00o7;
                                        o00o0o2.f7318OooO0oo = mutex7;
                                        o00o0o2.f7322OooOOO = 11;
                                        if (mutex7.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex7.unlock(null);
                                        if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                        }
                                    }
                                    oooOOO = oooOOO7;
                                    o000oOoO<Object, Object> o000oooo21115 = o000oooo13;
                                    coroutineScope = coroutineScope7;
                                    o000oooo3 = o000oooo21115;
                                    loadType11 = LoadType.APPEND;
                                    if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                        if (loadType11 != LoadType.REFRESH) {
                                            oooO00o8 = o000oooo3.f7297OooOO0O;
                                            mutex8 = oooO00o8.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo3;
                                            o00o0o2.f7316OooO0o0 = coroutineScope;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o8;
                                            o00o0o2.f7318OooO0oo = mutex8;
                                            o00o0o2.f7322OooOOO = 12;
                                            if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            CoroutineScope coroutineScope1116 = coroutineScope;
                                            o000oooo15 = o000oooo3;
                                            coroutineScope9 = coroutineScope1116;
                                            mutex9 = mutex8;
                                            o00oo0o3 = oooO00o8.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = o000oooo15;
                                            o00o0o2.f7316OooO0o0 = coroutineScope9;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = mutex9;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7322OooOOO = 13;
                                            if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType12 = loadType11;
                                            r2 = mutex9;
                                            Unit unit1111 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            loadType11 = loadType12;
                                            coroutineScope8 = coroutineScope9;
                                            o000oooo14 = o000oooo15;
                                        } else {
                                            o000oooo14 = o000oooo3;
                                            coroutineScope8 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                            loadType14 = loadType11;
                                            o000oooo17 = o000oooo14;
                                            o000oooo16 = o000oooo17;
                                            o00000Var3 = null;
                                        } else {
                                            oooO00o9 = o000oooo14.f7297OooOO0O;
                                            mutex10 = oooO00o9.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo14;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o9;
                                            o00o0o2.f7318OooO0oo = mutex10;
                                            o00o0o2.f7313OooO = loadType11;
                                            o00o0o2.f7319OooOO0 = o000oooo14;
                                            o00o0o2.f7322OooOOO = 14;
                                            if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType13 = loadType11;
                                            loadType14 = loadType13;
                                            o000oooo16 = o000oooo14;
                                            o00000 o00000Var19 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                            mutex10.unlock(null);
                                            o000oOoO<Object, Object> o000oooo21116 = o000oooo14;
                                            o00000Var3 = o00000Var19;
                                            loadType11 = loadType13;
                                            o000oooo17 = o000oooo21116;
                                        }
                                        o00o0o2.f7314OooO0Oo = o000oooo16;
                                        o00o0o2.f7316OooO0o0 = coroutineScope8;
                                        o00o0o2.f7315OooO0o = loadType14;
                                        o00o0o2.f7317OooO0oO = null;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7322OooOOO = 15;
                                        if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType14;
                                        coroutineScope10 = coroutineScope8;
                                        o000oooo18 = o000oooo16;
                                        if (loadType15 == LoadType.REFRESH) {
                                            oooO00o10 = o000oooo18.f7297OooOO0O;
                                            mutex11 = oooO00o10.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo18;
                                            o00o0o2.f7316OooO0o0 = coroutineScope10;
                                            o00o0o2.f7315OooO0o = oooO00o10;
                                            o00o0o2.f7317OooO0oO = mutex11;
                                            o00o0o2.f7322OooOOO = 16;
                                            if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutex12 = mutex11;
                                            o000oooo19 = o000oooo18;
                                            oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex12.unlock(null);
                                            if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    mutex7 = (Mutex) o00o0o2.f7318OooO0oo;
                                    oooO00o7 = (o00oO0o.OooO00o) o00o0o2.f7317OooO0oO;
                                    coroutineScope7 = (CoroutineScope) o00o0o2.f7315OooO0o;
                                    o000oooo13 = (o000oOoO) o00o0o2.f7316OooO0o0;
                                    oooOOO7 = (OooOOO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    oooOOO0OooO00o2 = oooO00o7.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                    mutex7.unlock(null);
                                    if (!(oooOOO0OooO00o2 instanceof OooOOO0.OooO00o)) {
                                        o000oOoO.OooO0Oo(o000oooo13, coroutineScope7);
                                    }
                                    oooOOO = oooOOO7;
                                    o000oOoO<Object, Object> o000oooo21117 = o000oooo13;
                                    coroutineScope = coroutineScope7;
                                    o000oooo3 = o000oooo21117;
                                    loadType11 = LoadType.APPEND;
                                    if (oooOOO.f7162OooO0OO instanceof OooOOO0.OooO00o) {
                                        if (loadType11 != LoadType.REFRESH) {
                                            oooO00o8 = o000oooo3.f7297OooOO0O;
                                            mutex8 = oooO00o8.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo3;
                                            o00o0o2.f7316OooO0o0 = coroutineScope;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o8;
                                            o00o0o2.f7318OooO0oo = mutex8;
                                            o00o0o2.f7322OooOOO = 12;
                                            if (mutex8.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            CoroutineScope coroutineScope1117 = coroutineScope;
                                            o000oooo15 = o000oooo3;
                                            coroutineScope9 = coroutineScope1117;
                                            mutex9 = mutex8;
                                            o00oo0o3 = oooO00o8.f7347OooO0O0;
                                            o00o0o2.f7314OooO0Oo = o000oooo15;
                                            o00o0o2.f7316OooO0o0 = coroutineScope9;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = mutex9;
                                            o00o0o2.f7318OooO0oo = null;
                                            o00o0o2.f7322OooOOO = 13;
                                            if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType12 = loadType11;
                                            r2 = mutex9;
                                            Unit unit1112 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            loadType11 = loadType12;
                                            coroutineScope8 = coroutineScope9;
                                            o000oooo14 = o000oooo15;
                                        } else {
                                            o000oooo14 = o000oooo3;
                                            coroutineScope8 = coroutineScope;
                                        }
                                        if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                            loadType14 = loadType11;
                                            o000oooo17 = o000oooo14;
                                            o000oooo16 = o000oooo17;
                                            o00000Var3 = null;
                                        } else {
                                            oooO00o9 = o000oooo14.f7297OooOO0O;
                                            mutex10 = oooO00o9.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo14;
                                            o00o0o2.f7316OooO0o0 = coroutineScope8;
                                            o00o0o2.f7315OooO0o = loadType11;
                                            o00o0o2.f7317OooO0oO = oooO00o9;
                                            o00o0o2.f7318OooO0oo = mutex10;
                                            o00o0o2.f7313OooO = loadType11;
                                            o00o0o2.f7319OooOO0 = o000oooo14;
                                            o00o0o2.f7322OooOOO = 14;
                                            if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType13 = loadType11;
                                            loadType14 = loadType13;
                                            o000oooo16 = o000oooo14;
                                            o00000 o00000Var110 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                            mutex10.unlock(null);
                                            o000oOoO<Object, Object> o000oooo21118 = o000oooo14;
                                            o00000Var3 = o00000Var110;
                                            loadType11 = loadType13;
                                            o000oooo17 = o000oooo21118;
                                        }
                                        o00o0o2.f7314OooO0Oo = o000oooo16;
                                        o00o0o2.f7316OooO0o0 = coroutineScope8;
                                        o00o0o2.f7315OooO0o = loadType14;
                                        o00o0o2.f7317OooO0oO = null;
                                        o00o0o2.f7318OooO0oo = null;
                                        o00o0o2.f7313OooO = null;
                                        o00o0o2.f7319OooOO0 = null;
                                        o00o0o2.f7322OooOOO = 15;
                                        if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType14;
                                        coroutineScope10 = coroutineScope8;
                                        o000oooo18 = o000oooo16;
                                        if (loadType15 == LoadType.REFRESH) {
                                            oooO00o10 = o000oooo18.f7297OooOO0O;
                                            mutex11 = oooO00o10.f7346OooO00o;
                                            o00o0o2.f7314OooO0Oo = o000oooo18;
                                            o00o0o2.f7316OooO0o0 = coroutineScope10;
                                            o00o0o2.f7315OooO0o = oooO00o10;
                                            o00o0o2.f7317OooO0oO = mutex11;
                                            o00o0o2.f7322OooOOO = 16;
                                            if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutex12 = mutex11;
                                            o000oooo19 = o000oooo18;
                                            oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                            mutex12.unlock(null);
                                            if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                                o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 12:
                                    Mutex mutex17 = (Mutex) o00o0o2.f7318OooO0oo;
                                    oooO00o8 = (o00oO0o.OooO00o) o00o0o2.f7317OooO0oO;
                                    LoadType loadType18 = (LoadType) o00o0o2.f7315OooO0o;
                                    CoroutineScope coroutineScope23 = (CoroutineScope) o00o0o2.f7316OooO0o0;
                                    o000oOoO<Object, Object> o000oooo33 = (o000oOoO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    loadType11 = loadType18;
                                    coroutineScope9 = coroutineScope23;
                                    o000oooo15 = o000oooo33;
                                    mutex9 = mutex17;
                                    o00oo0o3 = oooO00o8.f7347OooO0O0;
                                    o00o0o2.f7314OooO0Oo = o000oooo15;
                                    o00o0o2.f7316OooO0o0 = coroutineScope9;
                                    o00o0o2.f7315OooO0o = loadType11;
                                    o00o0o2.f7317OooO0oO = mutex9;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7322OooOOO = 13;
                                    if (o000oooo15.OooOO0O(o00oo0o3, loadType11, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType12 = loadType11;
                                    r2 = mutex9;
                                    Unit unit1113 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    loadType11 = loadType12;
                                    coroutineScope8 = coroutineScope9;
                                    o000oooo14 = o000oooo15;
                                    if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                        loadType14 = loadType11;
                                        o000oooo17 = o000oooo14;
                                        o000oooo16 = o000oooo17;
                                        o00000Var3 = null;
                                    } else {
                                        oooO00o9 = o000oooo14.f7297OooOO0O;
                                        mutex10 = oooO00o9.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = o000oooo14;
                                        o00o0o2.f7316OooO0o0 = coroutineScope8;
                                        o00o0o2.f7315OooO0o = loadType11;
                                        o00o0o2.f7317OooO0oO = oooO00o9;
                                        o00o0o2.f7318OooO0oo = mutex10;
                                        o00o0o2.f7313OooO = loadType11;
                                        o00o0o2.f7319OooOO0 = o000oooo14;
                                        o00o0o2.f7322OooOOO = 14;
                                        if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType13 = loadType11;
                                        loadType14 = loadType13;
                                        o000oooo16 = o000oooo14;
                                        o00000 o00000Var111 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                        mutex10.unlock(null);
                                        o000oOoO<Object, Object> o000oooo21119 = o000oooo14;
                                        o00000Var3 = o00000Var111;
                                        loadType11 = loadType13;
                                        o000oooo17 = o000oooo21119;
                                    }
                                    o00o0o2.f7314OooO0Oo = o000oooo16;
                                    o00o0o2.f7316OooO0o0 = coroutineScope8;
                                    o00o0o2.f7315OooO0o = loadType14;
                                    o00o0o2.f7317OooO0oO = null;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7322OooOOO = 15;
                                    if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType14;
                                    coroutineScope10 = coroutineScope8;
                                    o000oooo18 = o000oooo16;
                                    if (loadType15 == LoadType.REFRESH) {
                                        oooO00o10 = o000oooo18.f7297OooOO0O;
                                        mutex11 = oooO00o10.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = o000oooo18;
                                        o00o0o2.f7316OooO0o0 = coroutineScope10;
                                        o00o0o2.f7315OooO0o = oooO00o10;
                                        o00o0o2.f7317OooO0oO = mutex11;
                                        o00o0o2.f7322OooOOO = 16;
                                        if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex12 = mutex11;
                                        o000oooo19 = o000oooo18;
                                        oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 13:
                                    Mutex mutex18 = (Mutex) o00o0o2.f7317OooO0oO;
                                    loadType12 = (LoadType) o00o0o2.f7315OooO0o;
                                    coroutineScope9 = (CoroutineScope) o00o0o2.f7316OooO0o0;
                                    o000oooo15 = (o000oOoO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    r2 = mutex18;
                                    Unit unit1114 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    loadType11 = loadType12;
                                    coroutineScope8 = coroutineScope9;
                                    o000oooo14 = o000oooo15;
                                    if (C0159OooO00o.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                        loadType14 = loadType11;
                                        o000oooo17 = o000oooo14;
                                        o000oooo16 = o000oooo17;
                                        o00000Var3 = null;
                                    } else {
                                        oooO00o9 = o000oooo14.f7297OooOO0O;
                                        mutex10 = oooO00o9.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = o000oooo14;
                                        o00o0o2.f7316OooO0o0 = coroutineScope8;
                                        o00o0o2.f7315OooO0o = loadType11;
                                        o00o0o2.f7317OooO0oO = oooO00o9;
                                        o00o0o2.f7318OooO0oo = mutex10;
                                        o00o0o2.f7313OooO = loadType11;
                                        o00o0o2.f7319OooOO0 = o000oooo14;
                                        o00o0o2.f7322OooOOO = 14;
                                        if (mutex10.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType13 = loadType11;
                                        loadType14 = loadType13;
                                        o000oooo16 = o000oooo14;
                                        o00000 o00000Var112 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                        mutex10.unlock(null);
                                        o000oOoO<Object, Object> o000oooo211110 = o000oooo14;
                                        o00000Var3 = o00000Var112;
                                        loadType11 = loadType13;
                                        o000oooo17 = o000oooo211110;
                                    }
                                    o00o0o2.f7314OooO0Oo = o000oooo16;
                                    o00o0o2.f7316OooO0o0 = coroutineScope8;
                                    o00o0o2.f7315OooO0o = loadType14;
                                    o00o0o2.f7317OooO0oO = null;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7322OooOOO = 15;
                                    if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType14;
                                    coroutineScope10 = coroutineScope8;
                                    o000oooo18 = o000oooo16;
                                    if (loadType15 == LoadType.REFRESH) {
                                        oooO00o10 = o000oooo18.f7297OooOO0O;
                                        mutex11 = oooO00o10.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = o000oooo18;
                                        o00o0o2.f7316OooO0o0 = coroutineScope10;
                                        o00o0o2.f7315OooO0o = oooO00o10;
                                        o00o0o2.f7317OooO0oO = mutex11;
                                        o00o0o2.f7322OooOOO = 16;
                                        if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex12 = mutex11;
                                        o000oooo19 = o000oooo18;
                                        oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    o000oooo14 = (o000oOoO) o00o0o2.f7319OooOO0;
                                    loadType13 = (LoadType) o00o0o2.f7313OooO;
                                    mutex10 = (Mutex) o00o0o2.f7318OooO0oo;
                                    oooO00o9 = (o00oO0o.OooO00o) o00o0o2.f7317OooO0oO;
                                    loadType14 = (LoadType) o00o0o2.f7315OooO0o;
                                    coroutineScope8 = (CoroutineScope) o00o0o2.f7316OooO0o0;
                                    o000oooo16 = (o000oOoO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    o00000 o00000Var113 = (o00000) oooO00o9.f7347OooO0O0.f7344OooOO0O.get(loadType14);
                                    mutex10.unlock(null);
                                    o000oOoO<Object, Object> o000oooo211111 = o000oooo14;
                                    o00000Var3 = o00000Var113;
                                    loadType11 = loadType13;
                                    o000oooo17 = o000oooo211111;
                                    o00o0o2.f7314OooO0Oo = o000oooo16;
                                    o00o0o2.f7316OooO0o0 = coroutineScope8;
                                    o00o0o2.f7315OooO0o = loadType14;
                                    o00o0o2.f7317OooO0oO = null;
                                    o00o0o2.f7318OooO0oo = null;
                                    o00o0o2.f7313OooO = null;
                                    o00o0o2.f7319OooOO0 = null;
                                    o00o0o2.f7322OooOOO = 15;
                                    if (o000oOoO.OooO0OO(o000oooo17, loadType11, o00000Var3, o00o0o2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType14;
                                    coroutineScope10 = coroutineScope8;
                                    o000oooo18 = o000oooo16;
                                    if (loadType15 == LoadType.REFRESH) {
                                        oooO00o10 = o000oooo18.f7297OooOO0O;
                                        mutex11 = oooO00o10.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = o000oooo18;
                                        o00o0o2.f7316OooO0o0 = coroutineScope10;
                                        o00o0o2.f7315OooO0o = oooO00o10;
                                        o00o0o2.f7317OooO0oO = mutex11;
                                        o00o0o2.f7322OooOOO = 16;
                                        if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex12 = mutex11;
                                        o000oooo19 = o000oooo18;
                                        oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    loadType15 = (LoadType) o00o0o2.f7315OooO0o;
                                    coroutineScope10 = (CoroutineScope) o00o0o2.f7316OooO0o0;
                                    o000oooo18 = (o000oOoO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    if (loadType15 == LoadType.REFRESH) {
                                        oooO00o10 = o000oooo18.f7297OooOO0O;
                                        mutex11 = oooO00o10.f7346OooO00o;
                                        o00o0o2.f7314OooO0Oo = o000oooo18;
                                        o00o0o2.f7316OooO0o0 = coroutineScope10;
                                        o00o0o2.f7315OooO0o = oooO00o10;
                                        o00o0o2.f7317OooO0oO = mutex11;
                                        o00o0o2.f7322OooOOO = 16;
                                        if (mutex11.lock(null, o00o0o2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex12 = mutex11;
                                        o000oooo19 = o000oooo18;
                                        oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                            o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    mutex12 = (Mutex) o00o0o2.f7317OooO0oO;
                                    oooO00o10 = (o00oO0o.OooO00o) o00o0o2.f7315OooO0o;
                                    coroutineScope10 = (CoroutineScope) o00o0o2.f7316OooO0o0;
                                    o000oooo19 = (o000oOoO) o00o0o2.f7314OooO0Oo;
                                    ResultKt.throwOnFailure(obj);
                                    oooOOO0OooO00o3 = oooO00o10.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                                    mutex12.unlock(null);
                                    if (!(oooOOO0OooO00o3 instanceof OooOOO0.OooO00o)) {
                                        o000oOoO.OooO0Oo(o000oooo19, coroutineScope10);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Throwable th8) {
                            r2.unlock(null);
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        r2.unlock(null);
                        throw th9;
                    }
                } catch (Throwable th10) {
                    r2.unlock(null);
                    throw th10;
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return OooO00o(continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000oOoO o000oooo2, Continuation continuation, Channel channel) {
            super(2, continuation);
            this.f7403OooO0o = channel;
            this.f7405OooO0oO = o000oooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f7405OooO0oO, continuation, this.f7403OooO0o);
            oooO0OO.f7404OooO0o0 = obj;
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
            int i = this.f7402OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f7404OooO0o0;
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.f7403OooO0o);
                OooO00o oooO00o = new OooO00o(this.f7405OooO0oO, coroutineScope);
                this.f7402OooO0Oo = 1;
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
    public o0OoOo0(o000oOoO<Object, Object> o000oooo2, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f7385OooO = o000oooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OoOo0 o0oooo0 = new o0OoOo0(this.f7385OooO, continuation);
        o0oooo0.f7390OooO0oo = obj;
        return o0oooo0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00O0000<Oooo000<Object>> o00o0001, Continuation<? super Unit> continuation) {
        return ((o0OoOo0) create(o00o0001, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00O0000 o00o0001;
        o000OOo0<Object, Object> o000ooo1;
        o000000<Object, Object> o000000Var;
        o00oO0o.OooO00o<Object, Object> oooO00o;
        o00O0000 o00o0002;
        Mutex mutex;
        o00oO0o.OooO00o<Object, Object> oooO00o2;
        Mutex mutex2;
        o00O0000 o00o0003;
        o00oO0o.OooO00o<Object, Object> oooO00o3;
        OooOOO0 oooOOO0OooO00o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7389OooO0oO;
        o000oOoO<Object, Object> o000oooo2 = this.f7385OooO;
        try {
            if (i != 0) {
                if (i == 1) {
                    mutex = this.f7387OooO0o;
                    oooO00o = (o00oO0o.OooO00o) this.f7388OooO0o0;
                    o000ooo1 = (o000OOo0) this.f7386OooO0Oo;
                    o00o0002 = (o00O0000) this.f7390OooO0oo;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    o00o0001 = (o00O0000) this.f7390OooO0oo;
                    ResultKt.throwOnFailure(obj);
                    oooO00o2 = o000oooo2.f7297OooOO0O;
                    mutex2 = oooO00o2.f7346OooO00o;
                    this.f7390OooO0oo = o00o0001;
                    this.f7386OooO0Oo = oooO00o2;
                    this.f7388OooO0o0 = mutex2;
                    this.f7389OooO0oO = 3;
                    if (mutex2.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o00o0003 = o00o0001;
                    oooO00o3 = oooO00o2;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex3 = (Mutex) this.f7388OooO0o0;
                    oooO00o3 = (o00oO0o.OooO00o) this.f7386OooO0Oo;
                    o00o0003 = (o00O0000) this.f7390OooO0oo;
                    ResultKt.throwOnFailure(obj);
                    mutex2 = mutex3;
                }
                try {
                    oooOOO0OooO00o = oooO00o3.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
                    mutex2.unlock(null);
                    if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                        o000oOoO.OooO0Oo(o000oooo2, o00o0003);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    mutex2.unlock(null);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            o00o0001 = (o00O0000) this.f7390OooO0oo;
            if (!o000oooo2.f7287OooO.compareAndSet(false, true)) {
                throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?".toString());
            }
            BuildersKt__Builders_commonKt.launch$default(o00o0001, null, null, new OooO00o(o000oooo2, o00o0001, null), 3, null);
            Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(o00o0001, null, null, new OooO0O0(o000oooo2, null, channelChannel$default), 3, null);
            BuildersKt__Builders_commonKt.launch$default(o00o0001, null, null, new OooO0OO(o000oooo2, null, channelChannel$default), 3, null);
            o000ooo1 = o000oooo2.f7293OooO0o0;
            if (o000ooo1 != null) {
                o000000Var = o000oooo2.f7292OooO0o;
                if (o000000Var == null) {
                    o00oO0o.OooO00o<Object, Object> oooO00o4 = o000oooo2.f7297OooOO0O;
                    Mutex mutex4 = oooO00o4.f7346OooO00o;
                    this.f7390OooO0oo = o00o0001;
                    this.f7386OooO0Oo = o000ooo1;
                    this.f7388OooO0o0 = oooO00o4;
                    this.f7387OooO0o = mutex4;
                    this.f7389OooO0oO = 1;
                    if (mutex4.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooO00o = oooO00o4;
                    o00o0002 = o00o0001;
                    mutex = mutex4;
                }
                o000ooo1.OooO0Oo(o000000Var);
            }
            this.f7390OooO0oo = o00o0001;
            this.f7386OooO0Oo = null;
            this.f7388OooO0o0 = null;
            this.f7387OooO0o = null;
            this.f7389OooO0oO = 2;
            if (o000oooo2.OooO0o(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO00o2 = o000oooo2.f7297OooOO0O;
            mutex2 = oooO00o2.f7346OooO00o;
            this.f7390OooO0oo = o00o0001;
            this.f7386OooO0Oo = oooO00o2;
            this.f7388OooO0o0 = mutex2;
            this.f7389OooO0oO = 3;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o0003 = o00o0001;
            oooO00o3 = oooO00o2;
            oooOOO0OooO00o = oooO00o3.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
            mutex2.unlock(null);
            if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                o000oOoO.OooO0Oo(o000oooo2, o00o0003);
            }
            return Unit.INSTANCE;
            o000000<Object, Object> o000000VarOooO00o = oooO00o.f7347OooO0O0.OooO00o(null);
            mutex.unlock(null);
            o00o0001 = o00o0002;
            o000000Var = o000000VarOooO00o;
            o000ooo1.OooO0Oo(o000000Var);
            this.f7390OooO0oo = o00o0001;
            this.f7386OooO0Oo = null;
            this.f7388OooO0o0 = null;
            this.f7387OooO0o = null;
            this.f7389OooO0oO = 2;
            if (o000oooo2.OooO0o(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO00o2 = o000oooo2.f7297OooOO0O;
            mutex2 = oooO00o2.f7346OooO00o;
            this.f7390OooO0oo = o00o0001;
            this.f7386OooO0Oo = oooO00o2;
            this.f7388OooO0o0 = mutex2;
            this.f7389OooO0oO = 3;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o0003 = o00o0001;
            oooO00o3 = oooO00o2;
            oooOOO0OooO00o = oooO00o3.f7347OooO0O0.f7345OooOO0o.OooO00o(LoadType.REFRESH);
            mutex2.unlock(null);
            if (!(oooOOO0OooO00o instanceof OooOOO0.OooO00o)) {
                o000oOoO.OooO0Oo(o000oooo2, o00o0003);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }
}
