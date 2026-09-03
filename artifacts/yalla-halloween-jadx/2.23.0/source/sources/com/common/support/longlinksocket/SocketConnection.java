package com.common.support.longlinksocket;

import com.common.support.longlink.connection.AbstractConnection;
import com.common.support.longlink.connection.ConnectionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/common/support/longlinksocket/SocketConnection;", "Lcom/common/support/longlink/connection/AbstractConnection;", "socketConfig", "Lcom/common/support/longlinksocket/SocketConfig;", "(Lcom/common/support/longlinksocket/SocketConfig;)V", "reader", "Lcom/common/support/longlinksocket/MessageReader;", "socket", "Ljava/net/Socket;", "socketScope", "Lkotlinx/coroutines/CoroutineScope;", "writer", "Lcom/common/support/longlinksocket/MessageWriter;", "close", "", "code", "", "reason", "", "isNeedReconnected", "open", "", "write", "bytes", "", "longlink-socket_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SocketConnection extends AbstractConnection {

    @Nullable
    private MessageReader reader;

    @Nullable
    private Socket socket;

    @NotNull
    private final SocketConfig socketConfig;

    @NotNull
    private final CoroutineScope socketScope;

    @Nullable
    private MessageWriter writer;

    /* JADX INFO: renamed from: com.common.support.longlinksocket.SocketConnection$open$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.common.support.longlinksocket.SocketConnection$open$1", f = "SocketConnection.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SocketConnection.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ConnectionListener listener;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Socket socket = new Socket();
            Address address = SocketConnection.this.socketConfig.address();
            try {
                socket.connect(new InetSocketAddress(address.getHost(), address.getPort()), SocketConnection.this.socketConfig.getConnectTimeout());
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                if (inputStream == null || outputStream == null) {
                    socket.close();
                    throw new ConnectException("Connection succeeded, but stream is null");
                }
                SocketConnection.this.socket = socket;
                CoroutineScope coroutineScope = SocketConnection.this.socketScope;
                SocketConfig socketConfig = SocketConnection.this.socketConfig;
                final SocketConnection socketConnection = SocketConnection.this;
                Function1<byte[], Unit> function1 = new Function1<byte[], Unit>() { // from class: com.common.support.longlinksocket.SocketConnection$open$1$messageReader$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
                        invoke2(bArr);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull byte[] $receiver) {
                        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                        ConnectionListener listener2 = socketConnection.getListener();
                        if (listener2 == null) {
                            return;
                        }
                        listener2.onMessage(socketConnection, $receiver);
                    }
                };
                final SocketConnection socketConnection2 = SocketConnection.this;
                MessageReader messageReader = new MessageReader(coroutineScope, inputStream, socketConfig, function1, new Function1<Throwable, Unit>() { // from class: com.common.support.longlinksocket.SocketConnection$open$1$messageReader$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable $receiver) {
                        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                        MessageReader messageReader2 = socketConnection2.reader;
                        if (messageReader2 != null) {
                            messageReader2.close();
                        }
                        MessageWriter messageWriter = socketConnection2.writer;
                        if (messageWriter != null) {
                            messageWriter.close();
                        }
                        ConnectionListener listener2 = socketConnection2.getListener();
                        if (listener2 == null) {
                            return;
                        }
                        listener2.onFailure(socketConnection2, $receiver, "Read error!");
                    }
                });
                MessageWriter messageWriter = new MessageWriter(SocketConnection.this.socketScope, outputStream);
                messageReader.run();
                messageWriter.run();
                SocketConnection.this.reader = messageReader;
                SocketConnection.this.writer = messageWriter;
                if (socket.isConnected() && (listener = SocketConnection.this.getListener()) != null) {
                    listener.onOpen(SocketConnection.this, 100, "Connection build successful!");
                }
                return Unit.INSTANCE;
            } catch (SocketTimeoutException e) {
                ConnectionListener listener2 = SocketConnection.this.getListener();
                if (listener2 != null) {
                    listener2.onFailure(SocketConnection.this, e, "Connection build timeout!");
                }
            } catch (Throwable th) {
                MessageReader messageReader2 = SocketConnection.this.reader;
                if (messageReader2 != null) {
                    messageReader2.close();
                }
                MessageWriter messageWriter2 = SocketConnection.this.writer;
                if (messageWriter2 != null) {
                    messageWriter2.close();
                }
                ConnectionListener listener3 = SocketConnection.this.getListener();
                if (listener3 != null) {
                    listener3.onFailure(SocketConnection.this, th, "Connection error!");
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SocketConnection(@NotNull SocketConfig socketConfig) {
        Intrinsics.checkNotNullParameter(socketConfig, "socketConfig");
        this.socketConfig = socketConfig;
        this.socketScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
    }

    @Override // com.common.support.longlink.connection.Connection
    public boolean close(int code, @NotNull String reason) throws IOException {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Socket socket = this.socket;
        if (socket == null) {
            return false;
        }
        MessageReader messageReader = this.reader;
        if (messageReader != null) {
            messageReader.close();
        }
        MessageWriter messageWriter = this.writer;
        if (messageWriter != null) {
            messageWriter.close();
        }
        socket.close();
        ConnectionListener listener = getListener();
        if (listener != null) {
            listener.onClosed(this, code, reason);
        }
        return true;
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
        BuildersKt__Builders_commonKt.launch$default(this.socketScope, Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    @Override // com.common.support.longlink.connection.Connection
    public boolean write(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        MessageWriter messageWriter = this.writer;
        if (messageWriter == null) {
            return false;
        }
        return messageWriter.write(bytes);
    }
}
