package com.common.support.longlink.sender;

import com.common.support.longlink.Protocol;
import com.common.support.longlink.connection.Connection;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0013H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/common/support/longlink/sender/SenderImpl;", "IN", "Lcom/common/support/longlink/sender/Sender;", "protocol", "Lcom/common/support/longlink/Protocol;", "state", "Lkotlin/Function0;", "", "(Lcom/common/support/longlink/Protocol;Lkotlin/jvm/functions/Function0;)V", "connection", "Lcom/common/support/longlink/connection/Connection;", "getConnection", "()Lcom/common/support/longlink/connection/Connection;", "setConnection", "(Lcom/common/support/longlink/connection/Connection;)V", "send", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Ljava/lang/Object;)I", "sendRawBytes", "", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SenderImpl<IN> implements Sender<IN> {
    public Connection connection;

    @NotNull
    private final Protocol<IN, ?> protocol;

    @NotNull
    private final Function0<Integer> state;

    public SenderImpl(@NotNull Protocol<IN, ?> protocol, @NotNull Function0<Integer> state) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(state, "state");
        this.protocol = protocol;
        this.state = state;
    }

    @NotNull
    public final Connection getConnection() {
        Connection connection = this.connection;
        if (connection != null) {
            return connection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("connection");
        return null;
    }

    @Override // com.common.support.longlink.sender.Sender
    public int send(IN message) {
        return sendRawBytes(this.protocol.pack(message));
    }

    @Override // com.common.support.longlink.sender.Sender
    public int sendRawBytes(@NotNull byte[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int iIntValue = this.state.invoke().intValue();
        if (iIntValue == 4) {
            return 1;
        }
        if (iIntValue == 2) {
            return getConnection().write(message) ? 0 : 1;
        }
        return 2;
    }

    public final void setConnection(@NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(connection, "<set-?>");
        this.connection = connection;
    }
}
