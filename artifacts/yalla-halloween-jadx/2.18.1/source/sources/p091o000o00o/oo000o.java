package p091o000o00o;

import androidx.room.RoomDatabase;
import io.agora.rtc.Constants;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
public final class oo000o extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f29220Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f29221Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f29222Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f29223Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f29224OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String[] f29225OoooO00;

    @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f29226Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f29227Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f29228Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f29229Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String[] f29230OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ FlowCollector<Object> f29231OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Callable<Object> f29232OoooO0O;

        /* JADX INFO: renamed from: o000o00o.oo000o$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {127, Constants.ERR_WATERMARK_READ}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0321OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ OooO0O0 f29233Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public ChannelIterator f29234Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public int f29235Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ RoomDatabase f29236Oooo0oo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ Callable<Object> f29237OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ Channel<Unit> f29238OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public final /* synthetic */ Channel<Object> f29239OoooO0O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0321OooO00o(RoomDatabase roomDatabase, OooO0O0 oooO0O0, Channel<Unit> channel, Callable<Object> callable, Channel<Object> channel2, Continuation<? super C0321OooO00o> continuation) {
                super(2, continuation);
                this.f29236Oooo0oo = roomDatabase;
                this.f29233Oooo = oooO0O0;
                this.f29238OoooO00 = channel;
                this.f29237OoooO0 = callable;
                this.f29239OoooO0O = channel2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0321OooO00o(this.f29236Oooo0oo, this.f29233Oooo, this.f29238OoooO00, this.f29237OoooO0, this.f29239OoooO0O, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0321OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    int r1 = r7.f29235Oooo0oO
                    r2 = 1
                    r3 = 2
                    if (r1 == 0) goto L25
                    if (r1 == r2) goto L1c
                    if (r1 != r3) goto L14
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.f29234Oooo0o
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L7d
                    goto L37
                L14:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1c:
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.f29234Oooo0o
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L7d
                    r4 = r1
                    r1 = r0
                    r0 = r7
                    goto L48
                L25:
                    kotlin.ResultKt.throwOnFailure(r8)
                    androidx.room.RoomDatabase r8 = r7.f29236Oooo0oo
                    o000o00o.o00000O0 r8 = r8.f9295OooO0o0
                    o000o00o.oo000o$OooO00o$OooO0O0 r1 = r7.f29233Oooo
                    r8.OooO00o(r1)
                    kotlinx.coroutines.channels.Channel<kotlin.Unit> r8 = r7.f29238OoooO00     // Catch: java.lang.Throwable -> L7d
                    kotlinx.coroutines.channels.ChannelIterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L7d
                L37:
                    r8 = r7
                L38:
                    r8.f29234Oooo0o = r1     // Catch: java.lang.Throwable -> L78
                    r8.f29235Oooo0oO = r2     // Catch: java.lang.Throwable -> L78
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
                    java.util.concurrent.Callable<java.lang.Object> r8 = r0.f29237OoooO0     // Catch: java.lang.Throwable -> L6a
                    java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L6a
                    kotlinx.coroutines.channels.Channel<java.lang.Object> r5 = r0.f29239OoooO0O     // Catch: java.lang.Throwable -> L6a
                    r0.f29234Oooo0o = r4     // Catch: java.lang.Throwable -> L6a
                    r0.f29235Oooo0oO = r3     // Catch: java.lang.Throwable -> L6a
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
                    androidx.room.RoomDatabase r8 = r0.f29236Oooo0oo
                    o000o00o.o00000O0 r8 = r8.f9295OooO0o0
                    o000o00o.oo000o$OooO00o$OooO0O0 r0 = r0.f29233Oooo
                    r8.OooO0o0(r0)
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
                    androidx.room.RoomDatabase r1 = r0.f29236Oooo0oo
                    o000o00o.o00000O0 r1 = r1.f9295OooO0o0
                    o000o00o.oo000o$OooO00o$OooO0O0 r0 = r0.f29233Oooo
                    r1.OooO0o0(r0)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o000o00o.oo000o.OooO00o.C0321OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static final class OooO0O0 extends o00000O0.OooO0OO {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ Channel<Unit> f29240OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(String[] strArr, Channel<Unit> channel) {
                super(strArr);
                this.f29240OooO0O0 = channel;
            }

            @Override // o000o00o.o00000O0.OooO0OO
            public final void OooO00o(@NotNull Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                this.f29240OooO0O0.mo2017trySendJP2dKIU(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, RoomDatabase roomDatabase, FlowCollector<Object> flowCollector, String[] strArr, Callable<Object> callable, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f29229Oooo0oo = z;
            this.f29226Oooo = roomDatabase;
            this.f29231OoooO00 = flowCollector;
            this.f29230OoooO0 = strArr;
            this.f29232OoooO0O = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f29229Oooo0oo, this.f29226Oooo, this.f29231OoooO00, this.f29230OoooO0, this.f29232OoooO0O, continuation);
            oooO00o.f29228Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29227Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f29228Oooo0oO;
                Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                OooO0O0 oooO0O0 = new OooO0O0(this.f29230OoooO0, channelChannel$default);
                channelChannel$default.mo2017trySendJP2dKIU(Unit.INSTANCE);
                o000 o000Var = (o000) coroutineScope.getCoroutineContext().get(o000.f29113Oooo);
                ContinuationInterceptor continuationInterceptorOooO0O0 = o000Var == null ? null : o000Var.f29115Oooo0oO;
                if (continuationInterceptorOooO0O0 == null) {
                    continuationInterceptorOooO0O0 = this.f29229Oooo0oo ? o0OO00O.OooO0O0(this.f29226Oooo) : o0OO00O.OooO00o(this.f29226Oooo);
                }
                Channel channelChannel$default2 = ChannelKt.Channel$default(0, null, null, 7, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, continuationInterceptorOooO0O0, null, new C0321OooO00o(this.f29226Oooo, oooO0O0, channelChannel$default, this.f29232OoooO0O, channelChannel$default2, null), 2, null);
                FlowCollector<Object> flowCollector = this.f29231OoooO00;
                this.f29227Oooo0o = 1;
                if (FlowKt.emitAll(flowCollector, channelChannel$default2, this) == coroutine_suspended) {
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
    public oo000o(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable<Object> callable, Continuation<? super oo000o> continuation) {
        super(2, continuation);
        this.f29223Oooo0oo = z;
        this.f29220Oooo = roomDatabase;
        this.f29225OoooO00 = strArr;
        this.f29224OoooO0 = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oo000o oo000oVar = new oo000o(this.f29223Oooo0oo, this.f29220Oooo, this.f29225OoooO00, this.f29224OoooO0, continuation);
        oo000oVar.f29222Oooo0oO = obj;
        return oo000oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((oo000o) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f29221Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO00o oooO00o = new OooO00o(this.f29223Oooo0oo, this.f29220Oooo, (FlowCollector) this.f29222Oooo0oO, this.f29225OoooO00, this.f29224OoooO0, null);
            this.f29221Oooo0o = 1;
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
