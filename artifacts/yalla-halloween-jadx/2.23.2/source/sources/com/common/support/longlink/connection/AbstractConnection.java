package com.common.support.longlink.connection;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/common/support/longlink/connection/AbstractConnection;", "Lcom/common/support/longlink/connection/Connection;", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/longlink/connection/ConnectionListener;", "getListener", "()Lcom/common/support/longlink/connection/ConnectionListener;", "setListener", "(Lcom/common/support/longlink/connection/ConnectionListener;)V", "setConnectionListener", "", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AbstractConnection implements Connection {

    @Nullable
    private ConnectionListener listener;

    @Nullable
    public final ConnectionListener getListener() {
        return this.listener;
    }

    @Override // com.common.support.longlink.connection.Connection
    public void setConnectionListener(@NotNull ConnectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setListener(@Nullable ConnectionListener connectionListener) {
        this.listener = connectionListener;
    }
}
