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
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O0O0Oo;
import p641o0ooOO0o.o0O0oo0o;
import p641o0ooOO0o.o0OoO00O;
import p648o0ooOoo.oO000Oo;
import p648o0ooOoo.oO000o00;
import p652o0ooo000.o0000O00;
import p653o0ooo00O.o0000O0;
import p660o0oooO0.o000OO00;
import p660o0oooO0.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0018\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/common/support/longlink/websocket/WebSocketConnection;", "Lcom/common/support/longlink/connection/AbstractConnection;", "", "open", "", "bytes", "", "write", "", "code", "", "reason", "close", "isNeedReconnected", "Lo0ooOO0o/o0OoO00O;", "okHttpClient", "Lo0ooOO0o/o0OoO00O;", "Lkotlin/Function0;", "Lo0ooOO0o/o0O00O0o;", "originalRequest", "Lkotlin/jvm/functions/Function0;", "Lo0ooOO0o/o0O0oo0o;", "webSocket", "Lo0ooOO0o/o0O0oo0o;", "com/common/support/longlink/websocket/WebSocketConnection$webSocketListener$1", "webSocketListener", "Lcom/common/support/longlink/websocket/WebSocketConnection$webSocketListener$1;", "<init>", "(Lo0ooOO0o/o0OoO00O;Lkotlin/jvm/functions/Function0;)V", "longlink_release"}, k = 1, mv = {1, 6, 0})
public class WebSocketConnection extends AbstractConnection {

    @NotNull
    private final o0OoO00O okHttpClient;

    @NotNull
    private final Function0<o0O00O0o> originalRequest;

    @Nullable
    private o0O0oo0o webSocket;

    @NotNull
    private final WebSocketConnection$webSocketListener$1 webSocketListener;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.common.support.longlink.websocket.WebSocketConnection$webSocketListener$1] */
    public WebSocketConnection(@NotNull o0OoO00O okHttpClient, @NotNull Function0<o0O00O0o> originalRequest) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.okHttpClient = okHttpClient;
        this.originalRequest = originalRequest;
        this.webSocketListener = new o0O0O0Oo() { // from class: com.common.support.longlink.websocket.WebSocketConnection$webSocketListener$1
            @Override // p641o0ooOO0o.o0O0O0Oo
            public void onClosed(@NotNull o0O0oo0o webSocket, int code, @NotNull String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                listener.onClosed(this.this$0, code, reason);
            }

            @Override // p641o0ooOO0o.o0O0O0Oo
            public void onClosing(@NotNull o0O0oo0o webSocket, int code, @NotNull String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                listener.onClosing(this.this$0, code, reason);
            }

            @Override // p641o0ooOO0o.o0O0O0Oo
            public void onFailure(@NotNull o0O0oo0o webSocket, @NotNull Throwable t, @Nullable o0O00o00 response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t, "t");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                WebSocketConnection webSocketConnection = this.this$0;
                StringBuilder sb = new StringBuilder("response code is ");
                sb.append(response == null ? null : Integer.valueOf(response.f57850OooO0oO));
                sb.append(", ");
                sb.append((Object) (response != null ? response.f57848OooO0o : null));
                listener.onFailure(webSocketConnection, t, sb.toString());
            }

            @Override // p641o0ooOO0o.o0O0O0Oo
            public void onMessage(@NotNull o0O0oo0o webSocket, @NotNull String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                listener.onMessage(this.this$0, text);
            }

            @Override // p641o0ooOO0o.o0O0O0Oo
            public void onOpen(@NotNull o0O0oo0o webSocket, @NotNull o0O00o00 response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                ConnectionListener listener = this.this$0.getListener();
                if (listener == null) {
                    return;
                }
                WebSocketConnection webSocketConnection = this.this$0;
                int i = response.f57850OooO0oO;
                if (i == 101) {
                    i = 100;
                }
                listener.onOpen(webSocketConnection, i, response.f57848OooO0o);
            }

            @Override // p641o0ooOO0o.o0O0O0Oo
            public void onMessage(@NotNull o0O0oo0o webSocket, @NotNull ByteString bytes) {
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
        o0O0oo0o o0o0oo0o = this.webSocket;
        if (o0o0oo0o == null) {
            return false;
        }
        return o0o0oo0o.close(code, reason);
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
        o0OoO00O client = this.okHttpClient;
        o0O00O0o request = this.originalRequest.invoke();
        WebSocketConnection$webSocketListener$1 listener = this.webSocketListener;
        client.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000OO00 o000oo01 = new o000OO00(o0000O00.f59287OooO0oo, request, listener, new Random(), client.f57910OooOooO, client.f57911OooOooo);
        Intrinsics.checkNotNullParameter(client, "client");
        o0O00O0o o0o00o0o = o000oo01.f59667OooO00o;
        if (o0o00o0o.OooO0O0("Sec-WebSocket-Extensions") != null) {
            o000oo01.OooO0oo(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o(client);
            o0 eventListener = o0.NONE;
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            byte[] bArr = oO000o00.f58124OooO00o;
            Intrinsics.checkNotNullParameter(eventListener, "<this>");
            oO000Oo oo000oo = new oO000Oo(eventListener);
            Intrinsics.checkNotNullParameter(oo000oo, "<set-?>");
            oooO00o.f57919OooO0o0 = oo000oo;
            List<Protocol> protocols = o000OO00.f59665OooOo;
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
            if (!Intrinsics.areEqual(mutableList, oooO00o.f57931OooOOoo)) {
                oooO00o.f57940OooOoo = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            Intrinsics.checkNotNullParameter(listUnmodifiableList, "<set-?>");
            oooO00o.f57931OooOOoo = listUnmodifiableList;
            o0OoO00O o0ooo00o2 = new o0OoO00O(oooO00o);
            o0O00O0o.OooO00o oooO00o2 = new o0O00O0o.OooO00o(o0o00o0o);
            oooO00o2.OooO0Oo("Upgrade", "websocket");
            oooO00o2.OooO0Oo("Connection", "Upgrade");
            oooO00o2.OooO0Oo("Sec-WebSocket-Key", o000oo01.f59673OooO0oO);
            oooO00o2.OooO0Oo("Sec-WebSocket-Version", "13");
            oooO00o2.OooO0Oo("Sec-WebSocket-Extensions", "permessage-deflate");
            o0O00O0o o0o00o0oOooO0O0 = oooO00o2.OooO0O0();
            o0000O0 o0000o1 = new o0000O0(o0ooo00o2, o0o00o0oOooO0O0, true);
            o000oo01.f59674OooO0oo = o0000o1;
            Intrinsics.checkNotNull(o0000o1);
            o0000o1.OoooOOO(new o000OOo0(o000oo01, o0o00o0oOooO0O0));
        }
        this.webSocket = o000oo01;
    }

    @Override // com.common.support.longlink.connection.Connection
    public boolean write(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        o0O0oo0o o0o0oo0o = this.webSocket;
        if (o0o0oo0o == null) {
            return false;
        }
        ByteString byteString = ByteString.f60193OooO0oO;
        return o0o0oo0o.OooO00o(ByteString.OooO00o.OooO0o0(bytes));
    }
}
