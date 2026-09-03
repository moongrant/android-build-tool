package com.common.support.longlink;

import android.content.Context;
import com.common.support.longlink.connection.Connection;
import com.common.support.longlink.connection.ReconnectionConfig;
import com.common.support.longlink.pulse.PulseAdapter;
import com.common.support.longlink.websocket.WebSocketConnectionFactory;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\bf\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0018\u0019J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH&J\b\u0010\u0017\u001a\u00020\u0004H&¨\u0006\u001a"}, d2 = {"Lcom/common/support/longlink/LongLink;", "IN", "", "addConnectionCallback", "", "callback", "Lcom/common/support/longlink/LongLink$ConnectionCallback;", "close", "code", "", "currentState", "getConnection", "Lcom/common/support/longlink/connection/Connection;", "getLogTag", "", "open", "removeConnectionCallback", "send", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Ljava/lang/Object;)I", "", "setLogTag", ViewHierarchyConstants.TAG_KEY, "startPulse", "Companion", "ConnectionCallback", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface LongLink<IN> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int SEND_RESULT_FAILED = 1;
    public static final int SEND_RESULT_PENDING = 2;
    public static final int SEND_RESULT_SUCCESS = 0;
    public static final int STATE_CLOSED = 4;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 3;
    public static final int STATE_NEW = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/common/support/longlink/LongLink$ConnectionCallback;", "", "onClosed", "", "code", "", "onConnected", "onConnecting", "onConnectionFailed", "throwable", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "onDisconnected", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface ConnectionCallback {

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onClosed(@NotNull ConnectionCallback connectionCallback, int i) {
                Intrinsics.checkNotNullParameter(connectionCallback, "this");
            }

            public static void onConnected(@NotNull ConnectionCallback connectionCallback) {
                Intrinsics.checkNotNullParameter(connectionCallback, "this");
            }

            public static void onConnecting(@NotNull ConnectionCallback connectionCallback) {
                Intrinsics.checkNotNullParameter(connectionCallback, "this");
            }

            public static void onConnectionFailed(@NotNull ConnectionCallback connectionCallback, @NotNull Throwable throwable, int i, @NotNull String message) {
                Intrinsics.checkNotNullParameter(connectionCallback, "this");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(message, "message");
            }

            public static void onDisconnected(@NotNull ConnectionCallback connectionCallback, int i, @NotNull String message) {
                Intrinsics.checkNotNullParameter(connectionCallback, "this");
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        void onClosed(int code);

        void onConnected();

        void onConnecting();

        void onConnectionFailed(@NotNull Throwable throwable, int code, @NotNull String message);

        void onDisconnected(int code, @NotNull String message);
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void close$default(LongLink longLink, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i2 & 1) != 0) {
                i = 1000;
            }
            longLink.close(i);
        }
    }

    void addConnectionCallback(@NotNull ConnectionCallback callback);

    void close(int code);

    /* JADX INFO: renamed from: currentState */
    int getState();

    @Nullable
    Connection getConnection();

    @NotNull
    String getLogTag();

    void open();

    void removeConnectionCallback(@NotNull ConnectionCallback callback);

    int send(IN message);

    int send(@NotNull byte[] message);

    void setLogTag(@NotNull String tag);

    void startPulse();

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+Jj\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010Jr\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010Jx\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/common/support/longlink/LongLink$Companion;", "", "IN", "OUT", "Landroid/content/Context;", "context", "Lcom/common/support/longlink/Protocol;", "protocol", "Lcom/common/support/longlink/MessageHandler;", "messageHandler", "Lcom/common/support/longlink/connection/Connection$Factory;", "connectionFactory", "Lcom/common/support/longlink/connection/ReconnectionConfig;", "reconnectionConfig", "Lcom/common/support/longlink/pulse/PulseAdapter;", "pulseAdapter", "Lkotlin/coroutines/CoroutineContext;", "coroutineParentContext", "Lcom/common/support/longlink/LongLink;", "create", "Lo0ooOO0o/o0OoO00O;", "okHttpClient", "Lo0ooOO0o/o0O00O0o;", "originalRequest", "createWebSocketLongLink", "Lkotlin/Function0;", "", "STATE_NEW", "I", "STATE_CONNECTING", "STATE_CONNECTED", "STATE_DISCONNECTED", "STATE_CLOSED", "SEND_RESULT_SUCCESS", "SEND_RESULT_FAILED", "SEND_RESULT_PENDING", "", "isLoggable", "Z", "()Z", "setLoggable", "(Z)V", "<init>", "()V", "longlink_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int SEND_RESULT_FAILED = 1;
        public static final int SEND_RESULT_PENDING = 2;
        public static final int SEND_RESULT_SUCCESS = 0;
        public static final int STATE_CLOSED = 4;
        public static final int STATE_CONNECTED = 2;
        public static final int STATE_CONNECTING = 1;
        public static final int STATE_DISCONNECTED = 3;
        public static final int STATE_NEW = 0;
        private static boolean isLoggable;

        private Companion() {
        }

        @NotNull
        public final <IN, OUT> LongLink<IN> create(@NotNull Context context, @NotNull Protocol<IN, OUT> protocol, @NotNull MessageHandler<OUT> messageHandler, @NotNull Connection.Factory connectionFactory, @NotNull ReconnectionConfig reconnectionConfig, @NotNull PulseAdapter pulseAdapter, @Nullable CoroutineContext coroutineParentContext) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
            Intrinsics.checkNotNullParameter(reconnectionConfig, "reconnectionConfig");
            Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
            return new LongLinkImpl(context, protocol, messageHandler, connectionFactory, reconnectionConfig, pulseAdapter, coroutineParentContext);
        }

        @NotNull
        public final <IN, OUT> LongLink<IN> createWebSocketLongLink(@NotNull Context context, @NotNull Protocol<IN, OUT> protocol, @NotNull MessageHandler<OUT> messageHandler, @NotNull o0OoO00O okHttpClient, @NotNull final o0O00O0o originalRequest, @NotNull ReconnectionConfig reconnectionConfig, @NotNull PulseAdapter pulseAdapter, @Nullable CoroutineContext coroutineParentContext) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
            Intrinsics.checkNotNullParameter(reconnectionConfig, "reconnectionConfig");
            Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
            return create(context, protocol, messageHandler, new WebSocketConnectionFactory(okHttpClient, new Function0<o0O00O0o>() { // from class: com.common.support.longlink.LongLink$Companion$createWebSocketLongLink$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final o0O00O0o invoke() {
                    return originalRequest;
                }
            }), reconnectionConfig, pulseAdapter, coroutineParentContext);
        }

        public final boolean isLoggable() {
            return isLoggable;
        }

        public final void setLoggable(boolean z) {
            isLoggable = z;
        }

        @NotNull
        public final <IN, OUT> LongLink<IN> createWebSocketLongLink(@NotNull Context context, @NotNull Protocol<IN, OUT> protocol, @NotNull MessageHandler<OUT> messageHandler, @NotNull o0OoO00O okHttpClient, @NotNull Function0<o0O00O0o> originalRequest, @NotNull ReconnectionConfig reconnectionConfig, @NotNull PulseAdapter pulseAdapter, @Nullable CoroutineContext coroutineParentContext) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
            Intrinsics.checkNotNullParameter(reconnectionConfig, "reconnectionConfig");
            Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
            return create(context, protocol, messageHandler, new WebSocketConnectionFactory(okHttpClient, originalRequest), reconnectionConfig, pulseAdapter, coroutineParentContext);
        }
    }
}
