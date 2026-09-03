package com.common.support.longlinksocket;

import com.common.support.longlink.connection.Connection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/common/support/longlinksocket/SocketBasedConnectionFactory;", "Lcom/common/support/longlink/connection/Connection$Factory;", "socketConfig", "Lcom/common/support/longlinksocket/SocketConfig;", "(Lcom/common/support/longlinksocket/SocketConfig;)V", "newConnection", "Lcom/common/support/longlink/connection/Connection;", "longlink-socket_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SocketBasedConnectionFactory implements Connection.Factory {

    @NotNull
    private final SocketConfig socketConfig;

    public SocketBasedConnectionFactory(@NotNull SocketConfig socketConfig) {
        Intrinsics.checkNotNullParameter(socketConfig, "socketConfig");
        this.socketConfig = socketConfig;
    }

    @Override // com.common.support.longlink.connection.Connection.Factory
    @NotNull
    public Connection newConnection() {
        return new SocketConnection(this.socketConfig);
    }
}
