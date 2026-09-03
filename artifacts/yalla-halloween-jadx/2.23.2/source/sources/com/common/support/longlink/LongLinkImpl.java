package com.common.support.longlink;

import android.content.Context;
import com.common.support.longlink.connection.Connection;
import com.common.support.longlink.connection.ConnectionListener;
import com.common.support.longlink.connection.ConnectionMonitor;
import com.common.support.longlink.connection.ReconnectionConfig;
import com.common.support.longlink.log.LoggerKt;
import com.common.support.longlink.pulse.Pulse;
import com.common.support.longlink.pulse.PulseAdapter;
import com.common.support.longlink.pulse.PulseFactory;
import com.common.support.longlink.receiver.Receiver;
import com.common.support.longlink.receiver.ReceiverImpl;
import com.common.support.longlink.sender.SenderImpl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001<BS\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0015H\u0016J\u0010\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020'H\u0016J\b\u00100\u001a\u00020'H\u0016J\n\u00101\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u00102\u001a\u00020 H\u0016J\b\u00103\u001a\u00020,H\u0016J\u0010\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0015H\u0016J\u0015\u00105\u001a\u00020'2\u0006\u00106\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020 H\u0016J\b\u0010;\u001a\u00020,H\u0016R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0018\u00010\u001cR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020'@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006="}, d2 = {"Lcom/common/support/longlink/LongLinkImpl;", "IN", "OUT", "Lcom/common/support/longlink/ScopedLongLink;", "context", "Landroid/content/Context;", "protocol", "Lcom/common/support/longlink/Protocol;", "messageHandler", "Lcom/common/support/longlink/MessageHandler;", "connectionFactory", "Lcom/common/support/longlink/connection/Connection$Factory;", "reconnectionConfig", "Lcom/common/support/longlink/connection/ReconnectionConfig;", "pulseAdapter", "Lcom/common/support/longlink/pulse/PulseAdapter;", "coroutineParentContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lcom/common/support/longlink/Protocol;Lcom/common/support/longlink/MessageHandler;Lcom/common/support/longlink/connection/Connection$Factory;Lcom/common/support/longlink/connection/ReconnectionConfig;Lcom/common/support/longlink/pulse/PulseAdapter;Lkotlin/coroutines/CoroutineContext;)V", "callbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/common/support/longlink/LongLink$ConnectionCallback;", "<set-?>", "Lcom/common/support/longlink/connection/Connection;", "connection", "getConnection$longlink_release", "()Lcom/common/support/longlink/connection/Connection;", "connectionListener", "Lcom/common/support/longlink/LongLinkImpl$RealConnectionListener;", "connectionMonitor", "Lcom/common/support/longlink/connection/ConnectionMonitor;", "logTag", "", "pulse", "Lcom/common/support/longlink/pulse/Pulse;", "receiver", "Lcom/common/support/longlink/receiver/Receiver;", "sender", "Lcom/common/support/longlink/sender/SenderImpl;", "", "state", "getState$longlink_release", "()I", "addConnectionCallback", "", "callback", "close", "code", "currentState", "getConnection", "getLogTag", "open", "removeConnectionCallback", "send", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Ljava/lang/Object;)I", "", "setLogTag", ViewHierarchyConstants.TAG_KEY, "startPulse", "RealConnectionListener", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LongLinkImpl<IN, OUT> extends ScopedLongLink<IN> {

    @NotNull
    private CopyOnWriteArraySet<LongLink.ConnectionCallback> callbacks;

    @Nullable
    private Connection connection;

    @NotNull
    private final Connection.Factory connectionFactory;

    @Nullable
    private LongLinkImpl<IN, OUT>.RealConnectionListener connectionListener;

    @NotNull
    private ConnectionMonitor<IN> connectionMonitor;

    @NotNull
    private String logTag;

    @NotNull
    private Pulse pulse;

    @NotNull
    private final PulseAdapter pulseAdapter;

    @NotNull
    private Receiver<OUT> receiver;

    @NotNull
    private SenderImpl<IN> sender;
    private int state;

    public /* synthetic */ LongLinkImpl(Context context, Protocol protocol, MessageHandler messageHandler, Connection.Factory factory, ReconnectionConfig reconnectionConfig, PulseAdapter pulseAdapter, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, protocol, messageHandler, factory, reconnectionConfig, pulseAdapter, (i & 64) != 0 ? null : coroutineContext);
    }

    @Override // com.common.support.longlink.LongLink
    public void addConnectionCallback(@NotNull LongLink.ConnectionCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.add(callback);
    }

    @Override // com.common.support.longlink.ScopedLongLink, com.common.support.longlink.LongLink
    public synchronized void close(int code) {
        Connection connection;
        LoggerKt.logD(this.logTag, Intrinsics.stringPlus("Request close longlink, longlink state is ", Integer.valueOf(this.state)));
        int i = this.state;
        if ((i == 2 || i == 1) && (connection = this.connection) != null) {
            connection.close(1000, "Longlink closed by outside");
        }
        LongLinkImpl<IN, OUT>.RealConnectionListener realConnectionListener = this.connectionListener;
        if (realConnectionListener != null) {
            realConnectionListener.getIsClosed().set(true);
        }
        this.receiver.close();
        this.connectionMonitor.close();
        this.pulse.stop();
        this.state = 4;
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((LongLink.ConnectionCallback) it.next()).onClosed(code);
        }
        super.close(code);
    }

    @Override // com.common.support.longlink.LongLink
    /* JADX INFO: renamed from: currentState, reason: from getter */
    public int getState() {
        return this.state;
    }

    @Override // com.common.support.longlink.LongLink
    @Nullable
    public Connection getConnection() {
        return this.connection;
    }

    @Nullable
    public final Connection getConnection$longlink_release() {
        return this.connection;
    }

    @Override // com.common.support.longlink.LongLink
    @NotNull
    public String getLogTag() {
        return this.logTag;
    }

    public final int getState$longlink_release() {
        return this.state;
    }

    @Override // com.common.support.longlink.LongLink
    public synchronized void open() {
        LoggerKt.logD(this.logTag, Intrinsics.stringPlus("Request start connect, longlink state is ", Integer.valueOf(this.state)));
        int i = this.state;
        if (i == 0 || i == 3) {
            Connection connection = this.connection;
            if (connection != null) {
                connection.close(1000, "WebSocket is not null, so cancel and close it!");
            }
            LongLinkImpl<IN, OUT>.RealConnectionListener realConnectionListener = this.connectionListener;
            if (realConnectionListener != null) {
                realConnectionListener.getIsClosed().set(true);
            }
            this.state = 1;
            LongLinkImpl<IN, OUT>.RealConnectionListener realConnectionListener2 = new RealConnectionListener(this);
            Connection connectionNewConnection = this.connectionFactory.newConnection();
            connectionNewConnection.setConnectionListener(realConnectionListener2);
            this.connectionListener = realConnectionListener2;
            this.connection = connectionNewConnection;
            this.sender.setConnection(connectionNewConnection);
            connectionNewConnection.open();
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((LongLink.ConnectionCallback) it.next()).onConnecting();
            }
        }
    }

    @Override // com.common.support.longlink.LongLink
    public void removeConnectionCallback(@NotNull LongLink.ConnectionCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }

    @Override // com.common.support.longlink.LongLink
    public int send(@NotNull byte[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.sender.sendRawBytes(message);
    }

    @Override // com.common.support.longlink.LongLink
    public void setLogTag(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.logTag = tag;
    }

    @Override // com.common.support.longlink.LongLink
    public void startPulse() {
        if (this.pulseAdapter.getIsLazyStart()) {
            this.pulse.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongLinkImpl(@NotNull Context context, @NotNull Protocol<IN, OUT> protocol, @NotNull MessageHandler<OUT> messageHandler, @NotNull Connection.Factory connectionFactory, @NotNull ReconnectionConfig reconnectionConfig, @NotNull PulseAdapter pulseAdapter, @Nullable CoroutineContext coroutineContext) {
        super(coroutineContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(reconnectionConfig, "reconnectionConfig");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        this.connectionFactory = connectionFactory;
        this.pulseAdapter = pulseAdapter;
        this.logTag = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
        this.sender = new SenderImpl<>(protocol, new Function0<Integer>(this) { // from class: com.common.support.longlink.LongLinkImpl$sender$1
            final /* synthetic */ LongLinkImpl<IN, OUT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getState$longlink_release());
            }
        });
        this.receiver = new ReceiverImpl(this, protocol, messageHandler);
        final Pulse pulseCreatePulse = new PulseFactory().createPulse(this, pulseAdapter, this.sender, this.receiver, protocol);
        pulseCreatePulse.setOnPulseTimeoutListener(new Pulse.OnPulseTimeoutListener(this) { // from class: com.common.support.longlink.LongLinkImpl$pulse$1$1
            final /* synthetic */ LongLinkImpl<IN, OUT> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.common.support.longlink.pulse.Pulse.OnPulseTimeoutListener
            public void onPulseTimeout() {
                Connection connection$longlink_release = this.this$0.getConnection$longlink_release();
                if (connection$longlink_release != null) {
                    LongLinkImpl<IN, OUT> longLinkImpl = this.this$0;
                    connection$longlink_release.close(4000, "Pulse timeout!");
                    LongLinkImpl.RealConnectionListener realConnectionListener = ((LongLinkImpl) longLinkImpl).connectionListener;
                    if (realConnectionListener != null) {
                        realConnectionListener.onFailure(connection$longlink_release, new IllegalStateException("Pulse timeout!"), "");
                    }
                }
                pulseCreatePulse.stop();
                LoggerKt.logD(((LongLinkImpl) this.this$0).logTag, "Pulse timeout!");
            }
        });
        this.pulse = pulseCreatePulse;
        this.connectionMonitor = new ConnectionMonitor<>(context, this, reconnectionConfig, new Function1<Integer, Unit>(this) { // from class: com.common.support.longlink.LongLinkImpl$connectionMonitor$1
            final /* synthetic */ LongLinkImpl<IN, OUT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(int i) {
                this.this$0.close(i);
            }
        });
        this.receiver.run();
        this.callbacks = new CopyOnWriteArraySet<>();
    }

    @Override // com.common.support.longlink.LongLink
    public int send(IN message) {
        return this.sender.send(message);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J \u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/common/support/longlink/LongLinkImpl$RealConnectionListener;", "Lcom/common/support/longlink/connection/ConnectionListener;", "(Lcom/common/support/longlink/LongLinkImpl;)V", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setClosed", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "onClosed", "", "connection", "Lcom/common/support/longlink/connection/Connection;", "code", "", "reason", "", "onClosing", "onFailure", "t", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "onMessage", "bytes", "", ViewHierarchyConstants.TEXT_KEY, "onOpen", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class RealConnectionListener extends ConnectionListener {

        @NotNull
        private AtomicBoolean isClosed;
        final /* synthetic */ LongLinkImpl<IN, OUT> this$0;

        public RealConnectionListener(LongLinkImpl this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.isClosed = new AtomicBoolean(false);
        }

        @NotNull
        /* JADX INFO: renamed from: isClosed, reason: from getter */
        public final AtomicBoolean getIsClosed() {
            return this.isClosed;
        }

        @Override // com.common.support.longlink.connection.ConnectionListener
        public void onClosed(@NotNull Connection connection, int code, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(reason, "reason");
            LoggerKt.logD(((LongLinkImpl) this.this$0).logTag, "onClosed. { instance: " + connection.hashCode() + ", state: " + this.this$0.getState$longlink_release() + ", code: " + code + ", reason: " + reason + ", isClosed: " + this.isClosed + " }");
            if (this.isClosed.get()) {
                return;
            }
            LongLinkImpl<IN, OUT> longLinkImpl = this.this$0;
            synchronized (longLinkImpl) {
                ((LongLinkImpl) longLinkImpl).state = 3;
                Unit unit = Unit.INSTANCE;
            }
            CopyOnWriteArraySet<LongLink.ConnectionCallback> copyOnWriteArraySet = ((LongLinkImpl) this.this$0).callbacks;
            LongLinkImpl<IN, OUT> longLinkImpl2 = this.this$0;
            for (LongLink.ConnectionCallback connectionCallback : copyOnWriteArraySet) {
                ((LongLinkImpl) longLinkImpl2).pulse.stop();
                connectionCallback.onDisconnected(code, reason);
            }
            ((LongLinkImpl) this.this$0).connectionMonitor.onDisconnected$longlink_release(connection, code);
        }

        @Override // com.common.support.longlink.connection.ConnectionListener
        public void onClosing(@NotNull Connection connection, int code, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(reason, "reason");
            LoggerKt.logD(((LongLinkImpl) this.this$0).logTag, "onClosing. { instance: " + connection.hashCode() + ", state: " + this.this$0.getState$longlink_release() + ", code: " + code + ", reason: " + reason + " }");
        }

        @Override // com.common.support.longlink.connection.ConnectionListener
        public void onFailure(@NotNull Connection connection, @NotNull Throwable t, @Nullable String message) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(t, "t");
            LoggerKt.logD(((LongLinkImpl) this.this$0).logTag, "onFailure. { instance: " + connection.hashCode() + ", state: " + this.this$0.getState$longlink_release() + ", exception: " + t + ", isClose: " + this.isClosed + '}');
            if (this.isClosed.get()) {
                return;
            }
            LongLinkImpl<IN, OUT> longLinkImpl = this.this$0;
            synchronized (longLinkImpl) {
                ((LongLinkImpl) longLinkImpl).state = 3;
                Unit unit = Unit.INSTANCE;
            }
            if (message == null) {
                message = "";
            }
            CopyOnWriteArraySet<LongLink.ConnectionCallback> copyOnWriteArraySet = ((LongLinkImpl) this.this$0).callbacks;
            LongLinkImpl<IN, OUT> longLinkImpl2 = this.this$0;
            for (LongLink.ConnectionCallback connectionCallback : copyOnWriteArraySet) {
                ((LongLinkImpl) longLinkImpl2).pulse.stop();
                connectionCallback.onConnectionFailed(t, -1001, message);
                connectionCallback.onDisconnected(-1001, message);
            }
            ((LongLinkImpl) this.this$0).connectionMonitor.onDisconnected$longlink_release(connection, -1001);
        }

        @Override // com.common.support.longlink.connection.ConnectionListener
        public void onMessage(@NotNull Connection connection, @NotNull String text) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(text, "text");
            if (this.this$0.getState$longlink_release() != 2) {
                LoggerKt.logD(((LongLinkImpl) this.this$0).logTag, "onMessage. { instance: " + connection.hashCode() + ", Text Message: " + text + ", isClose: " + this.isClosed + " }");
            } else {
                LoggerKt.logE(((LongLinkImpl) this.this$0).logTag, "onMessage. { instance: " + connection.hashCode() + ", state: " + this.this$0.getState$longlink_release() + ", isClosed: " + this.isClosed + '}');
            }
            if (this.isClosed.get()) {
                return;
            }
            Receiver receiver = ((LongLinkImpl) this.this$0).receiver;
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            receiver.receive(bytes);
        }

        @Override // com.common.support.longlink.connection.ConnectionListener
        public void onOpen(@NotNull Connection connection, int code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(message, "message");
            if (this.isClosed.get()) {
                return;
            }
            boolean zIsOpenSuccessful = Connection.INSTANCE.isOpenSuccessful(code);
            LongLinkImpl<IN, OUT> longLinkImpl = this.this$0;
            synchronized (longLinkImpl) {
                if (longLinkImpl.getState$longlink_release() == 1 && zIsOpenSuccessful) {
                    ((LongLinkImpl) longLinkImpl).state = 2;
                    ((LongLinkImpl) longLinkImpl).connection = connection;
                    if (!((LongLinkImpl) longLinkImpl).pulseAdapter.getIsLazyStart()) {
                        ((LongLinkImpl) longLinkImpl).pulse.start();
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            if (zIsOpenSuccessful) {
                LoggerKt.logD(((LongLinkImpl) this.this$0).logTag, "open successful!");
                Iterator it = ((LongLinkImpl) this.this$0).callbacks.iterator();
                while (it.hasNext()) {
                    ((LongLink.ConnectionCallback) it.next()).onConnected();
                }
                ((LongLinkImpl) this.this$0).connectionMonitor.onConnected$longlink_release();
                return;
            }
            LoggerKt.logD(((LongLinkImpl) this.this$0).logTag, "open failure! { instance: " + connection.hashCode() + ", state: " + this.this$0.getState$longlink_release() + ", code: " + code + ", message: " + message + " }");
            Iterator it2 = ((LongLinkImpl) this.this$0).callbacks.iterator();
            while (it2.hasNext()) {
                ((LongLink.ConnectionCallback) it2.next()).onConnectionFailed(new Throwable("LongLink connection failed"), code, message);
            }
            ((LongLinkImpl) this.this$0).connectionMonitor.onDisconnected$longlink_release(connection, code);
        }

        public final void setClosed(@NotNull AtomicBoolean atomicBoolean) {
            Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
            this.isClosed = atomicBoolean;
        }

        @Override // com.common.support.longlink.connection.ConnectionListener
        public void onMessage(@NotNull Connection connection, @NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            if (this.this$0.getState$longlink_release() != 2) {
                LoggerKt.logD(((LongLinkImpl) this.this$0).logTag, "onMessage. { instance: " + connection.hashCode() + ", Byte Message Size: " + bytes.length + ", isClose: " + this.isClosed + " }");
            } else {
                LoggerKt.logE(((LongLinkImpl) this.this$0).logTag, "onMessage. { instance: " + connection.hashCode() + ", state: " + this.this$0.getState$longlink_release() + ", isClosed: " + this.isClosed + '}');
            }
            if (this.isClosed.get()) {
                return;
            }
            ((LongLinkImpl) this.this$0).receiver.receive(bytes);
        }
    }
}
