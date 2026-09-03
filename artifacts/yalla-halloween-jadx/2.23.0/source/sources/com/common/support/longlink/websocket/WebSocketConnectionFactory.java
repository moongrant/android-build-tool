package com.common.support.longlink.websocket;

import com.common.support.longlink.connection.Connection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/common/support/longlink/websocket/WebSocketConnectionFactory;", "Lcom/common/support/longlink/connection/Connection$Factory;", "Lcom/common/support/longlink/connection/Connection;", "newConnection", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "Lo0ooO0oO/o00OOOO0;", "Lkotlin/Function0;", "Lo0ooO0oO/o00OOOOo;", "originalRequest", "Lkotlin/jvm/functions/Function0;", "<init>", "(Lo0ooO0oO/o00OOOO0;Lkotlin/jvm/functions/Function0;)V", "longlink_release"}, k = 1, mv = {1, 6, 0})
public final class WebSocketConnectionFactory implements Connection.Factory {

    @NotNull
    private final o00OOOO0 okHttpClient;

    @NotNull
    private final Function0<o00OOOOo> originalRequest;

    public WebSocketConnectionFactory(@NotNull o00OOOO0 okHttpClient, @NotNull Function0<o00OOOOo> originalRequest) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.okHttpClient = okHttpClient;
        this.originalRequest = originalRequest;
    }

    @Override // com.common.support.longlink.connection.Connection.Factory
    @NotNull
    public Connection newConnection() {
        return new WebSocketConnection(this.okHttpClient, this.originalRequest);
    }
}
