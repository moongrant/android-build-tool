package p449o0OoOoOo;

import android.content.Context;
import androidx.lifecycle.FlowLiveDataConversions;
import io.agora.rtc.Constants;
import java.io.Closeable;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p277o0O000oo.OooO;
import p277o0O000oo.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class oO0Oo<IN> implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f40299Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Context f40300Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o0O000O.OooO00o<IN> f40301Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final oO00000 f40302Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public Deferred f40303OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f40304OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public volatile int f40305OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Job f40306OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Job f40307OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final Mutex f40308o000oOoO;

    @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor$1", f = "ConnectionMonitor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f40309Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<IN> f40310Oooo0oO;

        /* JADX INFO: renamed from: o0OoOoOo.oO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor$1$1", f = "ConnectionMonitor.kt", i = {}, l = {Constants.ERR_WATERMARK_READ}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0385OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f40311Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ oO0Oo<IN> f40312Oooo0oO;

            /* JADX INFO: renamed from: o0OoOoOo.oO0Oo$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0386OooO00o implements FlowCollector<p277o0O000oo.OooO0o> {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ oO0Oo f40313Oooo0o;

                public C0386OooO00o(oO0Oo oo0oo) {
                    this.f40313Oooo0o = oo0oo;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(p277o0O000oo.OooO0o oooO0o, @NotNull Continuation<? super Unit> continuation) {
                    p277o0O000oo.OooO0o it = oooO0o;
                    oO0Oo oo0oo = this.f40313Oooo0o;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    Objects.requireNonNull(oo0oo);
                    if (it.f35100OooO00o) {
                        oo0oo.f40306OoooO0O = o0O000O.OooO0o.OooO0O0(new o0oo0000(oo0oo, null));
                    } else {
                        oo0oo.f40305OoooO00 = 0;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0385OooO00o(oO0Oo<IN> oo0oo, Continuation<? super C0385OooO00o> continuation) {
                super(2, continuation);
                this.f40312Oooo0oO = oo0oo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0385OooO00o(this.f40312Oooo0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0385OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                OooO.OooO0O0 oooO0O0;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f40311Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OooO oooO = OooO.f35092OooO00o;
                    Context context = this.f40312Oooo0oO.f40300Oooo0o;
                    synchronized (oooO) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (OooO.f35093OooO0O0 == null) {
                            OooO.f35093OooO0O0 = new p277o0O000oo.OooO0OO(new OooOO0());
                        }
                        if (OooO.f35094OooO0OO == null) {
                            OooO.f35094OooO0OO = new OooO.OooO0O0(context);
                        }
                        oooO0O0 = OooO.f35094OooO0OO;
                        Intrinsics.checkNotNull(oooO0O0);
                    }
                    Flow flowDrop = FlowKt.drop(FlowLiveDataConversions.asFlow(oooO0O0), 1);
                    C0386OooO00o c0386OooO00o = new C0386OooO00o(this.f40312Oooo0oO);
                    this.f40311Oooo0o = 1;
                    if (flowDrop.collect(c0386OooO00o, this) == coroutine_suspended) {
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
        public OooO00o(oO0Oo<IN> oo0oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f40310Oooo0oO = oo0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f40310Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f40309Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0385OooO00o c0385OooO00o = new C0385OooO00o(this.f40310Oooo0oO, null);
                this.f40309Oooo0o = 1;
                if (BuildersKt.withContext(main, c0385OooO00o, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor", f = "ConnectionMonitor.kt", i = {}, l = {117}, m = "delay", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f40314Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<IN> f40315Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f40316Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(oO0Oo<IN> oo0oo, Continuation<? super OooO0O0> continuation) {
            super(continuation);
            this.f40315Oooo0oO = oo0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40314Oooo0o = obj;
            this.f40316Oooo0oo |= Integer.MIN_VALUE;
            return this.f40315Oooo0oO.OooO0O0(this);
        }
    }

    @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor$delay$delayedJob$1", f = "ConnectionMonitor.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f40317Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f40318Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f40318Oooo0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f40318Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f40317Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f40318Oooo0oO;
                this.f40317Oooo0o = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor$onDisconnected$1", f = "ConnectionMonitor.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f40319Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<IN> f40320Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0OOo000 f40321Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(oO0Oo<IN> oo0oo, o0OOo000 o0ooo001, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f40320Oooo0oO = oo0oo;
            this.f40321Oooo0oo = o0ooo001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f40320Oooo0oO, this.f40321Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f40319Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                oO0Oo<IN> oo0oo = this.f40320Oooo0oO;
                o0OOo000 o0ooo001 = this.f40321Oooo0oo;
                this.f40319Oooo0o = 1;
                if (oO0Oo.OooO00o(oo0oo, o0ooo001, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public oO0Oo(@NotNull Context context, @NotNull o0O000O.OooO00o<IN> longLink, @NotNull oO00000 config, @NotNull Function1<? super Integer, Unit> onReconnectionFailed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(longLink, "longLink");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onReconnectionFailed, "onReconnectionFailed");
        this.f40300Oooo0o = context;
        this.f40301Oooo0oO = longLink;
        this.f40302Oooo0oo = config;
        this.f40299Oooo = onReconnectionFailed;
        this.f40304OoooO0 = new AtomicBoolean(false);
        this.f40308o000oOoO = MutexKt.Mutex$default(false, 1, null);
        this.f40307OoooOO0 = o0O000O.OooO0o.OooO0O0(new OooO00o(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(oO0Oo oo0oo, o0OOo000 o0ooo001, Continuation continuation) throws Throwable {
        ooo0Oo0 ooo0oo0;
        Mutex mutex;
        Throwable th;
        oO0Oo oo0oo2;
        Mutex mutex2;
        Unit unit;
        Objects.requireNonNull(oo0oo);
        if (continuation instanceof ooo0Oo0) {
            ooo0oo0 = (ooo0Oo0) continuation;
            int i = ooo0oo0.f40326OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo0oo0.f40326OoooO0 = i - Integer.MIN_VALUE;
            } else {
                ooo0oo0 = new ooo0Oo0(oo0oo, continuation);
            }
        } else {
            ooo0oo0 = new ooo0Oo0(oo0oo, continuation);
        }
        Object obj = ooo0oo0.f40322Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ooo0oo0.f40326OoooO0;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = oo0oo.f40308o000oOoO;
                ooo0oo0.f40323Oooo0o = oo0oo;
                ooo0oo0.f40324Oooo0oO = o0ooo001;
                ooo0oo0.f40325Oooo0oo = mutex;
                ooo0oo0.f40326OoooO0 = 1;
                if (mutex.lock(null, ooo0oo0) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) ooo0oo0.f40324Oooo0oO;
                oo0oo2 = ooo0oo0.f40323Oooo0o;
                try {
                    ResultKt.throwOnFailure(obj);
                    oo0oo2.f40301Oooo0oO.open();
                    coroutine_suspended = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    mutex = mutex2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = ooo0oo0.f40325Oooo0oo;
            o0ooo001 = (o0OOo000) ooo0oo0.f40324Oooo0oO;
            oO0Oo oo0oo3 = ooo0oo0.f40323Oooo0o;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            oo0oo = oo0oo3;
            if (!oo0oo.f40304OoooO0.get()) {
                if (o0ooo001 != null) {
                    int iHashCode = o0ooo001.hashCode();
                    o0OOo000 o0ooo000OooO0O0 = oo0oo.f40301Oooo0oO.OooO0O0();
                    if (iHashCode != (o0ooo000OooO0O0 != null ? o0ooo000OooO0O0.hashCode() : 0)) {
                        String strOooO0OO = oo0oo.f40301Oooo0oO.OooO0OO();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Connection is not same one, old connection is ");
                        sb.append(o0ooo001.hashCode());
                        sb.append(", connection in longlink is ");
                        o0OOo000 o0ooo000OooO0O1 = oo0oo.f40301Oooo0oO.OooO0O0();
                        sb.append(o0ooo000OooO0O1 != null ? o0ooo000OooO0O1.hashCode() : 0);
                        o0O000Oo.OooO00o.OooO00o(strOooO0OO, sb.toString());
                        unit = Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                oo0oo.f40302Oooo0oo.OooO0O0();
                oo0oo.f40305OoooO00++;
                ooo0oo0.f40323Oooo0o = oo0oo;
                ooo0oo0.f40324Oooo0oO = mutex;
                ooo0oo0.f40325Oooo0oo = null;
                ooo0oo0.f40326OoooO0 = 2;
                if (oo0oo.OooO0O0(ooo0oo0) != coroutine_suspended) {
                    oo0oo2 = oo0oo;
                    mutex2 = mutex;
                    oo0oo2.f40301Oooo0oO.open();
                    coroutine_suspended = Unit.INSTANCE;
                    mutex2.unlock(null);
                }
                return coroutine_suspended;
            }
            unit = Unit.INSTANCE;
            coroutine_suspended = unit;
            mutex.unlock(null);
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0O0(Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        long jOooO00o;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f40316Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f40316Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(this, continuation);
        }
        Object obj = oooO0O0.f40314Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f40316Oooo0oo;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (OooO.f35092OooO00o.OooO0o0(this.f40300Oooo0o)) {
                    jOooO00o = this.f40302Oooo0oo.OooO00o(this.f40305OoooO00);
                } else {
                    this.f40302Oooo0oo.OooO0OO();
                    jOooO00o = 8000;
                }
                String strOooO0OO = this.f40301Oooo0oO.OooO0OO();
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("reconnectionTimes = ");
                sbOooO0o0.append(this.f40305OoooO00);
                sbOooO0o0.append(", delayTime = ");
                sbOooO0o0.append(jOooO00o);
                o0O000Oo.OooO00o.OooO00o(strOooO0OO, sbOooO0o0.toString());
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(o0O000O.OooO0o.OooO00o(), null, null, new OooO0OO(jOooO00o, null), 3, null);
                this.f40303OoooO = deferredAsync$default;
                oooO0O0.f40316Oooo0oo = 1;
                if (deferredAsync$default.await(oooO0O0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (CancellationException unused) {
        }
        return Unit.INSTANCE;
    }

    public final void OooO0Oo(@NotNull o0OOo000 connection, int i) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        boolean zOooOO0O = connection.OooOO0O(i);
        if (!zOooOO0O && !this.f40304OoooO0.get()) {
            this.f40299Oooo.invoke(Integer.valueOf(i));
            close();
        }
        if (zOooOO0O) {
            this.f40306OoooO0O = o0O000O.OooO0o.OooO0O0(new OooO0o(this, connection, null));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Job.DefaultImpls.cancel$default(this.f40307OoooOO0, (CancellationException) null, 1, (Object) null);
        Job job = this.f40306OoooO0O;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f40304OoooO0.set(true);
    }
}
