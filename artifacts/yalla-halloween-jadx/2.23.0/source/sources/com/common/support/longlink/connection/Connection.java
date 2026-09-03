package com.common.support.longlink.connection;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0013"}, d2 = {"Lcom/common/support/longlink/connection/Connection;", "", "close", "", "code", "", "reason", "", "isNeedReconnected", "open", "", "setConnectionListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/longlink/connection/ConnectionListener;", "write", "bytes", "", "Companion", "Factory", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Connection {
    public static final int CLOSED_NORMALLY = 1000;
    public static final int CLOSED_PULSE_TIMEOUT = 4000;
    public static final int CONNECTION_RECONNECTION_RETCH_MAX_TIMES = -1002;
    public static final int CONNECTION_SUCCESSFUL = 100;
    public static final int CONNECTION_WRITE_OR_READ_ERROR = -1001;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/common/support/longlink/connection/Connection$Companion;", "", "()V", "CLOSED_NORMALLY", "", "CLOSED_PULSE_TIMEOUT", "CONNECTION_RECONNECTION_RETCH_MAX_TIMES", "CONNECTION_SUCCESSFUL", "CONNECTION_WRITE_OR_READ_ERROR", "isOpenSuccessful", "", "code", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CLOSED_NORMALLY = 1000;
        public static final int CLOSED_PULSE_TIMEOUT = 4000;
        public static final int CONNECTION_RECONNECTION_RETCH_MAX_TIMES = -1002;
        public static final int CONNECTION_SUCCESSFUL = 100;
        public static final int CONNECTION_WRITE_OR_READ_ERROR = -1001;

        private Companion() {
        }

        public final boolean isOpenSuccessful(int code) {
            return code == 100;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/common/support/longlink/connection/Connection$Factory;", "", "newConnection", "Lcom/common/support/longlink/connection/Connection;", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Factory {
        @NotNull
        Connection newConnection();
    }

    boolean close(int code, @NotNull String reason);

    boolean isNeedReconnected(int code);

    void open();

    void setConnectionListener(@NotNull ConnectionListener listener);

    boolean write(@NotNull byte[] bytes);
}
