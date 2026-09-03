package com.common.support.longlink.connection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/common/support/longlink/connection/ReconnectionConfig;", "", "maxReconnectionGap", "", "getMaxReconnectionGap", "()J", "maxReconnectionTimes", "", "getMaxReconnectionTimes", "()I", "beforeReconnection", "", "retryTimes", "reconnectionGap", "Companion", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ReconnectionConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long DEFAULT_INITIAL_RECONNECTION_GAP = 2000;
    public static final long DEFAULT_MAX_RECONNECTION_GAP = 8000;
    public static final int RECONNECTION_INFINITE_TIMES = -1;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/common/support/longlink/connection/ReconnectionConfig$Companion;", "", "()V", "DEFAULT_INITIAL_RECONNECTION_GAP", "", "DEFAULT_MAX_RECONNECTION_GAP", "RECONNECTION_INFINITE_TIMES", "", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long DEFAULT_INITIAL_RECONNECTION_GAP = 2000;
        public static final long DEFAULT_MAX_RECONNECTION_GAP = 8000;
        public static final int RECONNECTION_INFINITE_TIMES = -1;

        private Companion() {
        }
    }

    void beforeReconnection(int retryTimes);

    long getMaxReconnectionGap();

    int getMaxReconnectionTimes();

    long reconnectionGap(int retryTimes);
}
