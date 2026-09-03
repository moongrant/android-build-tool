package o000O0O0;

import androidx.room.RoomDatabase;
import io.agora.rtc.Constants;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0O0 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f34705OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34706OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f34707OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f34708OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f34709OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String[] f34710OooO0oo;

    @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String[] f34711OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f34712OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f34713OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f34714OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f34715OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ FlowCollector<Object> f34716OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Callable<Object> f34717OooOO0;

        /* JADX INFO: renamed from: o000O0O0.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {127, Constants.ERR_WATERMARK_READ}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0407OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ Callable<Object> f34718OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public ChannelIterator f34719OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ RoomDatabase f34720OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f34721OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ C0408OooO0O0 f34722OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ Channel<Unit> f34723OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ Channel<Object> f34724OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0407OooO00o(RoomDatabase roomDatabase, C0408OooO0O0 c0408OooO0O0, Channel<Unit> channel, Callable<Object> callable, Channel<Object> channel2, Continuation<? super C0407OooO00o> continuation) {
                super(2, continuation);
                this.f34720OooO0o = roomDatabase;
                this.f34722OooO0oO = c0408OooO0O0;
                this.f34723OooO0oo = channel;
                this.f34718OooO = callable;
                this.f34724OooOO0 = channel2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0407OooO00o(this.f34720OooO0o, this.f34722OooO0oO, this.f34723OooO0oo, this.f34718OooO, this.f34724OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0407OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0042 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:20:0x0043  */
            /* JADX WARN: Code duplicated, block: B:23:0x0050 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0048, B:23:0x0050), top: B:39:0x0048 }] */
            /* JADX WARN: Code duplicated, block: B:25:0x0065 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:26:0x0066  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0066 -> B:37:0x0038). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f34721OooO0o0
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.f34719OooO0Oo
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L7d
                    goto L37
                L14:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1c:
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.f34719OooO0Oo
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L7d
                    r4 = r1
                    r1 = r0
                    r0 = r7
                    goto L48
                L25:
                    kotlin.ResultKt.throwOnFailure(r8)
                    androidx.room.RoomDatabase r8 = r7.f34720OooO0o
                    o000O0O0.OooOo r8 = r8.f7889OooO0o0
                    o000O0O0.OooO0O0$OooO00o$OooO0O0 r1 = r7.f34722OooO0oO
                    r8.OooO00o(r1)
                    kotlinx.coroutines.channels.Channel<kotlin.Unit> r8 = r7.f34723OooO0oo     // Catch: java.lang.Throwable -> L7d
                    kotlinx.coroutines.channels.ChannelIterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L7d
                L37:
                    r8 = r7
                L38:
                    r8.f34719OooO0Oo = r1     // Catch: java.lang.Throwable -> L78
                    r8.f34721OooO0o0 = r3     // Catch: java.lang.Throwable -> L78
                    java.lang.Object r4 = r1.hasNext(r8)     // Catch: java.lang.Throwable -> L78
                    if (r4 != r0) goto L43
                    return r0
                L43:
                    r6 = r0
                    r0 = r8
                    r8 = r4
                    r4 = r1
                    r1 = r6
                L48:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L6a
                    boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L6a
                    if (r8 == 0) goto L6c
                    r4.next()     // Catch: java.lang.Throwable -> L6a
                    java.util.concurrent.Callable<java.lang.Object> r8 = r0.f34718OooO     // Catch: java.lang.Throwable -> L6a
                    java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L6a
                    kotlinx.coroutines.channels.Channel<java.lang.Object> r5 = r0.f34724OooOO0     // Catch: java.lang.Throwable -> L6a
                    r0.f34719OooO0Oo = r4     // Catch: java.lang.Throwable -> L6a
                    r0.f34721OooO0o0 = r2     // Catch: java.lang.Throwable -> L6a
                    java.lang.Object r8 = r5.send(r8, r0)     // Catch: java.lang.Throwable -> L6a
                    if (r8 != r1) goto L66
                    return r1
                L66:
                    r8 = r0
                    r0 = r1
                    r1 = r4
                    goto L38
                L6a:
                    r8 = move-exception
                    goto L7f
                L6c:
                    androidx.room.RoomDatabase r8 = r0.f34720OooO0o
                    o000O0O0.OooOo r8 = r8.f7889OooO0o0
                    o000O0O0.OooO0O0$OooO00o$OooO0O0 r0 = r0.f34722OooO0oO
                    r8.OooO0Oo(r0)
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                L78:
                    r0 = move-exception
                    r6 = r0
                    r0 = r8
                    r8 = r6
                    goto L7f
                L7d:
                    r8 = move-exception
                    r0 = r7
                L7f:
                    androidx.room.RoomDatabase r1 = r0.f34720OooO0o
                    o000O0O0.OooOo r1 = r1.f7889OooO0o0
                    o000O0O0.OooO0O0$OooO00o$OooO0O0 r0 = r0.f34722OooO0oO
                    r1.OooO0Oo(r0)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o000O0O0.OooO0O0.OooO00o.C0407OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: o000O0O0.OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
        public static final class C0408OooO0O0 extends OooOo.OooO0OO {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ Channel<Unit> f34725OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0408OooO0O0(String[] strArr, Channel<Unit> channel) {
                super(strArr);
                this.f34725OooO0O0 = channel;
            }

            @Override // o000O0O0.OooOo.OooO0OO
            public final void OooO00o(@NotNull Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                this.f34725OooO0O0.mo5731trySendJP2dKIU(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, RoomDatabase roomDatabase, FlowCollector<Object> flowCollector, String[] strArr, Callable<Object> callable, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f34713OooO0o = z;
            this.f34715OooO0oO = roomDatabase;
            this.f34716OooO0oo = flowCollector;
            this.f34711OooO = strArr;
            this.f34717OooOO0 = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f34713OooO0o, this.f34715OooO0oO, this.f34716OooO0oo, this.f34711OooO, this.f34717OooOO0, continuation);
            oooO00o.f34714OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineDispatcher coroutineDispatcherOooO00o;
            ContinuationInterceptor continuationInterceptor;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f34712OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f34714OooO0o0;
                Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                C0408OooO0O0 c0408OooO0O0 = new C0408OooO0O0(this.f34711OooO, channelChannel$default);
                channelChannel$default.mo5731trySendJP2dKIU(Unit.INSTANCE);
                o000000O o000000o2 = (o000000O) coroutineScope.getCoroutineContext().get(o000000O.f34767OooO0o);
                if (o000000o2 == null || (continuationInterceptor = o000000o2.f34768OooO0Oo) == null) {
                    boolean z = this.f34713OooO0o;
                    RoomDatabase roomDatabase = this.f34715OooO0oO;
                    if (z) {
                        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
                        Map<String, Object> map = roomDatabase.f7893OooOO0O;
                        Object objFrom = map.get("TransactionDispatcher");
                        if (objFrom == null) {
                            o00000 o00000Var = roomDatabase.f7886OooO0OO;
                            if (o00000Var == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                                o00000Var = null;
                            }
                            objFrom = ExecutorsKt.from(o00000Var);
                            map.put("TransactionDispatcher", objFrom);
                        }
                        Intrinsics.checkNotNull(objFrom, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                        coroutineDispatcherOooO00o = (CoroutineDispatcher) objFrom;
                    } else {
                        coroutineDispatcherOooO00o = OooO0o.OooO00o(roomDatabase);
                    }
                    continuationInterceptor = coroutineDispatcherOooO00o;
                }
                Channel channelChannel$default2 = ChannelKt.Channel$default(0, null, null, 7, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, continuationInterceptor, null, new C0407OooO00o(this.f34715OooO0oO, c0408OooO0O0, channelChannel$default, this.f34717OooOO0, channelChannel$default2, null), 2, null);
                this.f34712OooO0Oo = 1;
                if (FlowKt.emitAll(this.f34716OooO0oo, channelChannel$default2, this) == coroutine_suspended) {
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
    public OooO0O0(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable<Object> callable, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f34707OooO0o = z;
        this.f34709OooO0oO = roomDatabase;
        this.f34710OooO0oo = strArr;
        this.f34705OooO = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f34707OooO0o, this.f34709OooO0oO, this.f34710OooO0oo, this.f34705OooO, continuation);
        oooO0O0.f34708OooO0o0 = obj;
        return oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((OooO0O0) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34706OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO00o oooO00o = new OooO00o(this.f34707OooO0o, this.f34709OooO0oO, (FlowCollector) this.f34708OooO0o0, this.f34710OooO0oo, this.f34705OooO, null);
            this.f34706OooO0Oo = 1;
            if (CoroutineScopeKt.coroutineScope(oooO00o, this) == coroutine_suspended) {
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
