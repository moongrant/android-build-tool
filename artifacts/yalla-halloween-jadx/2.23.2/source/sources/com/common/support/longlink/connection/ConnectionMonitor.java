package com.common.support.longlink.connection;

import android.content.Context;
import androidx.lifecycle.FlowLiveDataConversions;
import com.common.support.longlink.ScopedLongLink;
import com.common.support.longlink.log.LoggerKt;
import com.common.support.networkstate.NetworkState;
import com.common.support.networkstate.NetworkStateUtil;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o000O0Oo.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ\b\u0010\u0017\u001a\u00020\fH\u0016J\u0011\u0010\u0018\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\r\u0010\u001f\u001a\u00020\fH\u0000¢\u0006\u0002\b J\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%H\u0002J\u001b\u0010&\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/common/support/longlink/connection/ConnectionMonitor;", "IN", "Ljava/io/Closeable;", "context", "Landroid/content/Context;", "longLink", "Lcom/common/support/longlink/ScopedLongLink;", "config", "Lcom/common/support/longlink/connection/ReconnectionConfig;", "onReconnectionFailed", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lcom/common/support/longlink/ScopedLongLink;Lcom/common/support/longlink/connection/ReconnectionConfig;Lkotlin/jvm/functions/Function1;)V", "delayedJob", "Lkotlinx/coroutines/Job;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "networkStateState", "reconnectionJob", "reconnectionTimes", "close", "delay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNeedToReconnect", "", "connection", "Lcom/common/support/longlink/connection/Connection;", "code", "onConnected", "onConnected$longlink_release", "onDisconnected", "onDisconnected$longlink_release", "onNetworkStateChanged", "state", "Lcom/common/support/networkstate/NetworkState;", "reconnectIfNeeded", "(Lcom/common/support/longlink/connection/Connection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ConnectionMonitor<IN> implements Closeable {

    @NotNull
    private final ReconnectionConfig config;

    @NotNull
    private final Context context;

    @Nullable
    private Job delayedJob;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final ScopedLongLink<IN> longLink;

    @NotNull
    private final Mutex mutex;

    @NotNull
    private final Job networkStateState;

    @NotNull
    private final Function1<Integer, Unit> onReconnectionFailed;

    @Nullable
    private Job reconnectionJob;
    private volatile int reconnectionTimes;

    /* JADX INFO: renamed from: com.common.support.longlink.connection.ConnectionMonitor$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"IN", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor$1", f = "ConnectionMonitor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ConnectionMonitor<IN> this$0;

        /* JADX INFO: renamed from: com.common.support.longlink.connection.ConnectionMonitor$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"IN", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor$1$1", f = "ConnectionMonitor.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConnectionMonitor<IN> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02091(ConnectionMonitor<IN> connectionMonitor, Continuation<? super C02091> continuation) {
                super(2, continuation);
                this.this$0 = connectionMonitor;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C02091(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDrop = FlowKt.drop(FlowLiveDataConversions.asFlow(NetworkStateUtil.INSTANCE.networkStateLiveData(((ConnectionMonitor) this.this$0).context)), 1);
                    final ConnectionMonitor<IN> connectionMonitor = this.this$0;
                    FlowCollector<NetworkState> flowCollector = new FlowCollector<NetworkState>() { // from class: com.common.support.longlink.connection.ConnectionMonitor$1$1$invokeSuspend$$inlined$collect$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(NetworkState networkState, @NotNull Continuation<? super Unit> continuation) {
                            NetworkState it = networkState;
                            ConnectionMonitor connectionMonitor2 = connectionMonitor;
                            Intrinsics.checkNotNullExpressionValue(it, "it");
                            connectionMonitor2.onNetworkStateChanged(it);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDrop.collect(flowCollector, this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C02091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectionMonitor<IN> connectionMonitor, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = connectionMonitor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C02091 c02091 = new C02091(this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c02091, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.longlink.connection.ConnectionMonitor$delay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor", f = "ConnectionMonitor.kt", i = {}, l = {125}, m = "delay", n = {}, s = {})
    public static final class C08611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ConnectionMonitor<IN> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08611(ConnectionMonitor<IN> connectionMonitor, Continuation<? super C08611> continuation) {
            super(continuation);
            this.this$0 = connectionMonitor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.delay(this);
        }
    }

    /* JADX INFO: renamed from: com.common.support.longlink.connection.ConnectionMonitor$onNetworkStateChanged$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"IN", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor$onNetworkStateChanged$1", f = "ConnectionMonitor.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ConnectionMonitor<IN> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08621(ConnectionMonitor<IN> connectionMonitor, Continuation<? super C08621> continuation) {
            super(2, continuation);
            this.this$0 = connectionMonitor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C08621(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((ConnectionMonitor) this.this$0).mutex.isLocked()) {
                    Job job = ((ConnectionMonitor) this.this$0).delayedJob;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
                LoggerKt.logD(((ConnectionMonitor) this.this$0).longLink.getLogTag(), "Reconnect if needed on network state changed");
                ConnectionMonitor<IN> connectionMonitor = this.this$0;
                this.label = 1;
                if (connectionMonitor.reconnectIfNeeded(null, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.longlink.connection.ConnectionMonitor$reconnectIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor", f = "ConnectionMonitor.kt", i = {0, 0, 0, 1, 1}, l = {142, 111}, m = "reconnectIfNeeded", n = {"this", "connection", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class C08631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ConnectionMonitor<IN> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08631(ConnectionMonitor<IN> connectionMonitor, Continuation<? super C08631> continuation) {
            super(continuation);
            this.this$0 = connectionMonitor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.reconnectIfNeeded(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionMonitor(@NotNull Context context, @NotNull ScopedLongLink<IN> longLink, @NotNull ReconnectionConfig config, @NotNull Function1<? super Integer, Unit> onReconnectionFailed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(longLink, "longLink");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onReconnectionFailed, "onReconnectionFailed");
        this.context = context;
        this.longLink = longLink;
        this.config = config;
        this.onReconnectionFailed = onReconnectionFailed;
        this.isClosed = new AtomicBoolean(false);
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.networkStateState = longLink.launch$longlink_release(new AnonymousClass1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object delay(Continuation<? super Unit> continuation) {
        C08611 c08611;
        if (continuation instanceof C08611) {
            c08611 = (C08611) continuation;
            int i = c08611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c08611.label = i - Integer.MIN_VALUE;
            } else {
                c08611 = new C08611(this, continuation);
            }
        } else {
            c08611 = new C08611(this, continuation);
        }
        Object obj = c08611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c08611.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                long jReconnectionGap = NetworkStateUtil.INSTANCE.isConnected(this.context) ? this.config.reconnectionGap(this.reconnectionTimes) : this.config.getMaxReconnectionGap();
                LoggerKt.logD(this.longLink.getLogTag(), "reconnectionTimes = " + this.reconnectionTimes + ", delayTime = " + jReconnectionGap);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.longLink.getLongLinkScope(), null, null, new ConnectionMonitor$delay$delayedJob$1(jReconnectionGap, null), 3, null);
                this.delayedJob = deferredAsync$default;
                c08611.label = 1;
                if (deferredAsync$default.await(c08611) == coroutine_suspended) {
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

    private final boolean isNeedToReconnect(Connection connection, int code) {
        boolean zIsNeedReconnected = connection.isNeedReconnected(code);
        String logTag = this.longLink.getLogTag();
        StringBuilder sb = new StringBuilder("isNeedToReconnect: Connection is ");
        sb.append(connection.hashCode());
        sb.append(", connection in longlink is ");
        Connection connection2 = this.longLink.getConnection();
        OooOOO0.OooO00o(sb, connection2 != null ? connection2.hashCode() : 0, ", code is ", code, ", connection.isNeedReconnected is ");
        sb.append(zIsNeedReconnected);
        sb.append(", isClosed is ");
        sb.append(this.isClosed.get());
        LoggerKt.logD(logTag, sb.toString());
        if (!zIsNeedReconnected && !this.isClosed.get()) {
            this.onReconnectionFailed.invoke(Integer.valueOf(code));
            close();
        }
        return zIsNeedReconnected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNetworkStateChanged(NetworkState state) {
        if (state.isConnected()) {
            this.reconnectionJob = this.longLink.launch$longlink_release(new C08621(this, null));
        } else {
            this.reconnectionTimes = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object reconnectIfNeeded(Connection connection, Continuation<? super Unit> continuation) throws Throwable {
        C08631 c08631;
        Mutex mutex;
        ConnectionMonitor connectionMonitor;
        Throwable th;
        Mutex mutex2;
        ConnectionMonitor connectionMonitor2;
        if (continuation instanceof C08631) {
            c08631 = (C08631) continuation;
            int i = c08631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c08631.label = i - Integer.MIN_VALUE;
            } else {
                c08631 = new C08631(this, continuation);
            }
        } else {
            c08631 = new C08631(this, continuation);
        }
        Object obj = c08631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c08631.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.mutex;
                c08631.L$0 = this;
                c08631.L$1 = connection;
                c08631.L$2 = mutex;
                c08631.label = 1;
                if (mutex.lock(null, c08631) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectionMonitor = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) c08631.L$1;
                    connectionMonitor2 = (ConnectionMonitor) c08631.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        LoggerKt.logD(connectionMonitor2.longLink.getLogTag(), "Connection Monitor request to reconnect!");
                        connectionMonitor2.longLink.open();
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex3 = (Mutex) c08631.L$2;
                Connection connection2 = (Connection) c08631.L$1;
                connectionMonitor = (ConnectionMonitor) c08631.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                connection = connection2;
            }
            if (connectionMonitor.isClosed.get()) {
                Unit unit2 = Unit.INSTANCE;
                mutex.unlock(null);
                return unit2;
            }
            if (connection != null) {
                int iHashCode = connection.hashCode();
                Connection connection3 = connectionMonitor.longLink.getConnection();
                if (iHashCode != (connection3 != null ? connection3.hashCode() : 0)) {
                    String logTag = connectionMonitor.longLink.getLogTag();
                    StringBuilder sb = new StringBuilder("Connection is not same one, old connection is ");
                    sb.append(connection.hashCode());
                    sb.append(", connection in longlink is ");
                    Connection connection4 = connectionMonitor.longLink.getConnection();
                    sb.append(connection4 != null ? connection4.hashCode() : 0);
                    LoggerKt.logD(logTag, sb.toString());
                    Unit unit3 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            if (connectionMonitor.config.getMaxReconnectionTimes() != -1 && connectionMonitor.reconnectionTimes + 1 > connectionMonitor.config.getMaxReconnectionTimes()) {
                if (connectionMonitor.isClosed.compareAndSet(false, true)) {
                    connectionMonitor.onReconnectionFailed.invoke(Boxing.boxInt(-1002));
                    connectionMonitor.close();
                }
                Unit unit4 = Unit.INSTANCE;
                mutex.unlock(null);
                return unit4;
            }
            ReconnectionConfig reconnectionConfig = connectionMonitor.config;
            connectionMonitor.reconnectionTimes++;
            reconnectionConfig.beforeReconnection(connectionMonitor.reconnectionTimes);
            c08631.L$0 = connectionMonitor;
            c08631.L$1 = mutex;
            c08631.L$2 = null;
            c08631.label = 2;
            if (connectionMonitor.delay(c08631) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            connectionMonitor2 = connectionMonitor;
            LoggerKt.logD(connectionMonitor2.longLink.getLogTag(), "Connection Monitor request to reconnect!");
            connectionMonitor2.longLink.open();
            Unit unit5 = Unit.INSTANCE;
            mutex2.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            Mutex mutex4 = mutex;
            th = th3;
            mutex2 = mutex4;
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Job.DefaultImpls.cancel$default(this.networkStateState, (CancellationException) null, 1, (Object) null);
        Job job = this.reconnectionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.isClosed.set(true);
    }

    public final void onConnected$longlink_release() {
        this.reconnectionTimes = 0;
    }

    public final void onDisconnected$longlink_release(@NotNull Connection connection, int code) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (isNeedToReconnect(connection, code)) {
            LoggerKt.logD(this.longLink.getLogTag(), Intrinsics.stringPlus("onDisconnected longLinkScope isActive = ", Boolean.valueOf(CoroutineScopeKt.isActive(this.longLink.getLongLinkScope()))));
            this.reconnectionJob = this.longLink.launch$longlink_release(new ConnectionMonitor$onDisconnected$1(this, connection, null));
        }
    }
}
