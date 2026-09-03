package com.common.support.longlink.websocket;

import com.common.support.longlink.connection.AbstractConnection;
import com.common.support.longlink.connection.ConnectionListener;
import java.net.ProtocolException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O000;
import p634o0ooO0oO.o0O0000O;
import p634o0ooO0oO.o0oOOo;
import p635o0ooO0oo.o0O000Oo;
import p635o0ooO0oo.o0O000o0;
import p639o0ooOO0o.o00OO0O0;
import p646o0ooOoo.oO0Oo0oo;
import p654o0ooo0o.o00000;
import p654o0ooo0o.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0018\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/common/support/longlink/websocket/WebSocketConnection;", "Lcom/common/support/longlink/connection/AbstractConnection;", "", "open", "", "bytes", "", "write", "", "code", "", "reason", "close", "isNeedReconnected", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "Lo0ooO0oO/o00OOOO0;", "Lkotlin/Function0;", "Lo0ooO0oO/o00OOOOo;", "originalRequest", "Lkotlin/jvm/functions/Function0;", "Lo0ooO0oO/o0O0000O;", "webSocket", "Lo0ooO0oO/o0O0000O;", "com/common/support/longlink/websocket/WebSocketConnection$webSocketListener$1", "webSocketListener", "Lcom/common/support/longlink/websocket/WebSocketConnection$webSocketListener$1;", "<init>", "(Lo0ooO0oO/o00OOOO0;Lkotlin/jvm/functions/Function0;)V", "longlink_release"}, k = 1, mv = {1, 6, 0})
public class WebSocketConnection extends AbstractConnection {

    @NotNull
    private final o00OOOO0 okHttpClient;

    @NotNull
    private final Function0<o00OOOOo> originalRequest;

    @Nullable
    private o0O0000O webSocket;

    @NotNull
    private final WebSocketConnection$webSocketListener$1 webSocketListener;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.common.support.longlink.websocket.WebSocketConnection$webSocketListener$1] */
    public WebSocketConnection(@NotNull o00OOOO0 okHttpClient, @NotNull Function0<o00OOOOo> originalRequest) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.okHttpClient = okHttpClient;
        this.originalRequest = originalRequest;
        this.webSocketListener = new o0O000() { // from class: com.common.support.longlink.websocket.WebSocketConnection$webSocketListener$1
            @Override // p634o0ooO0oO.o0O000
            public void onClosed(@NotNull o0O0000O webSocket, int code, @NotNull String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                listener.onClosed(this.this$0, code, reason);
            }

            @Override // p634o0ooO0oO.o0O000
            public void onClosing(@NotNull o0O0000O webSocket, int code, @NotNull String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                listener.onClosing(this.this$0, code, reason);
            }

            @Override // p634o0ooO0oO.o0O000
            public void onFailure(@NotNull o0O0000O webSocket, @NotNull Throwable t, @Nullable o0oOOo response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t, "t");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                WebSocketConnection webSocketConnection = this.this$0;
                StringBuilder sb = new StringBuilder("response code is ");
                sb.append(response == null ? null : Integer.valueOf(response.f57345OooO0oO));
                sb.append(", ");
                sb.append((Object) (response != null ? response.f57343OooO0o : null));
                listener.onFailure(webSocketConnection, t, sb.toString());
            }

            @Override // p634o0ooO0oO.o0O000
            public void onMessage(@NotNull o0O0000O webSocket, @NotNull String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                listener.onMessage(this.this$0, text);
            }

            @Override // p634o0ooO0oO.o0O000
            public void onOpen(@NotNull o0O0000O webSocket, @NotNull o0oOOo response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                WebSocketConnection webSocketConnection = this.this$0;
                int i = response.f57345OooO0oO;
                if (i == 101) {
                    i = 100;
                }
                listener.onOpen(webSocketConnection, i, response.f57343OooO0o);
            }

            @Override // p634o0ooO0oO.o0O000
            public void onMessage(@NotNull o0O0000O webSocket, @NotNull ByteString bytes) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                listener.onMessage(this.this$0, bytes.OooOOoo());
            }
        };
    }

    @Override // com.common.support.longlink.connection.Connection
    public boolean close(int code, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        o0O0000O o0o0000o2 = this.webSocket;
        if (o0o0000o2 == null) {
            return false;
        }
        return o0o0000o2.close(code, reason);
    }

    @Override // com.common.support.longlink.connection.Connection
    public boolean isNeedReconnected(int code) {
        if (code == 1000) {
            return false;
        }
        return !(400 <= code && code < 500);
    }

    @Override // com.common.support.longlink.connection.Connection
    public void open() {
        o00OOOO0 client = this.okHttpClient;
        o00OOOOo request = this.originalRequest.invoke();
        WebSocketConnection$webSocketListener$1 listener = this.webSocketListener;
        client.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000000O o000000o2 = new o000000O(o00OO0O0.f57441OooO0oo, request, listener, new Random(), client.f57281OooOooO, client.f57282OooOooo);
        Intrinsics.checkNotNullParameter(client, "client");
        o00OOOOo o00ooooo2 = o000000o2.f60064OooO00o;
        if (o00ooooo2.OooO0O0("Sec-WebSocket-Extensions") != null) {
            o000000o2.OooO0oo(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o(client);
            o00OO00O eventListener = o00OO00O.NONE;
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            byte[] bArr = o0O000o0.f57386OooO00o;
            Intrinsics.checkNotNullParameter(eventListener, "<this>");
            o0O000Oo o0o000oo2 = new o0O000Oo(eventListener);
            Intrinsics.checkNotNullParameter(o0o000oo2, "<set-?>");
            oooO00o.f57290OooO0o0 = o0o000oo2;
            List<Protocol> protocols = o000000O.f60062OooOo;
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt.toMutableList((Collection) protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!(mutableList.contains(protocol) || mutableList.contains(Protocol.HTTP_1_1))) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("protocols must contain h2_prior_knowledge or http/1.1: ", mutableList).toString());
            }
            if (!(!mutableList.contains(protocol) || mutableList.size() <= 1)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("protocols containing h2_prior_knowledge cannot use other protocols: ", mutableList).toString());
            }
            if (!(!mutableList.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("protocols must not contain http/1.0: ", mutableList).toString());
            }
            if (!(!mutableList.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            mutableList.remove(Protocol.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, oooO00o.f57302OooOOoo)) {
                oooO00o.f57311OooOoo = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            Intrinsics.checkNotNullParameter(listUnmodifiableList, "<set-?>");
            oooO00o.f57302OooOOoo = listUnmodifiableList;
            o00OOOO0 o00oooo1 = new o00OOOO0(oooO00o);
            o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o(o00ooooo2);
            oooO00o2.OooO0Oo("Upgrade", "websocket");
            oooO00o2.OooO0Oo("Connection", "Upgrade");
            oooO00o2.OooO0Oo("Sec-WebSocket-Key", o000000o2.f60070OooO0oO);
            oooO00o2.OooO0Oo("Sec-WebSocket-Version", "13");
            oooO00o2.OooO0Oo("Sec-WebSocket-Extensions", "permessage-deflate");
            o00OOOOo o00oooooOooO0O0 = oooO00o2.OooO0O0();
            oO0Oo0oo oo0oo0oo = new oO0Oo0oo(o00oooo1, o00oooooOooO0O0, true);
            o000000o2.f60071OooO0oo = oo0oo0oo;
            Intrinsics.checkNotNull(oo0oo0oo);
            oo0oo0oo.OooOOo0(new o00000(o000000o2, o00oooooOooO0O0));
        }
        this.webSocket = o000000o2;
    }

    @Override // com.common.support.longlink.connection.Connection
    public boolean write(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        o0O0000O o0o0000o2 = this.webSocket;
        if (o0o0000o2 == null) {
            return false;
        }
        ByteString byteString = ByteString.f60866OooO0oO;
        return o0o0000o2.OooO00o(ByteString.OooO00o.OooO0o0(bytes));
    }
}
