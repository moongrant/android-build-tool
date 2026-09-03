package com.common.support.longlinksocket;

import androidx.appcompat.widget.o0000O0;
import com.common.support.utils.LoopTask;
import java.io.IOException;
import java.io.InputStream;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/common/support/longlinksocket/MessageReader;", "Lcom/common/support/utils/LoopTask;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "inputStream", "Ljava/io/InputStream;", "socketConfig", "Lcom/common/support/longlinksocket/SocketConfig;", "onReadFrame", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "onReadError", "", "(Lkotlinx/coroutines/CoroutineScope;Ljava/io/InputStream;Lcom/common/support/longlinksocket/SocketConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "headerLength", "", "readBuffer", "Lcom/common/support/longlinksocket/ByteArrayBuffer;", "delayed", "", "onDoTaskError", "throwable", "read", "readBody", "readHeader", "task", "longlink-socket_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MessageReader extends LoopTask {
    private final int headerLength;

    @NotNull
    private final InputStream inputStream;

    @NotNull
    private final Function1<Throwable, Unit> onReadError;

    @NotNull
    private final Function1<byte[], Unit> onReadFrame;

    @NotNull
    private final ByteArrayBuffer readBuffer;

    @NotNull
    private final SocketConfig socketConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageReader(@NotNull CoroutineScope scope, @NotNull InputStream inputStream, @NotNull SocketConfig socketConfig, @NotNull Function1<? super byte[], Unit> onReadFrame, @NotNull Function1<? super Throwable, Unit> onReadError) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(socketConfig, "socketConfig");
        Intrinsics.checkNotNullParameter(onReadFrame, "onReadFrame");
        Intrinsics.checkNotNullParameter(onReadError, "onReadError");
        this.inputStream = inputStream;
        this.socketConfig = socketConfig;
        this.onReadFrame = onReadFrame;
        this.onReadError = onReadError;
        int headLength = socketConfig.getSocketProtocol().getHeadLength();
        this.headerLength = headLength;
        this.readBuffer = new ByteArrayBuffer(headLength);
    }

    private final byte[] read() throws IOException {
        if (this.readBuffer.getOffset() != 0) {
            LoggerKt.logD(Intrinsics.stringPlus("start loop, readBuffer offset = ", Integer.valueOf(this.readBuffer.getOffset())));
        }
        readHeader();
        if (this.readBuffer.getOffset() != this.headerLength) {
            LoggerKt.logD("Read header error, expected header length is " + this.headerLength + ",but read length from inputStream is " + this.readBuffer.getOffset());
        }
        int iBodyLength = this.socketConfig.getSocketProtocol().bodyLength(this.readBuffer.getArray());
        if (iBodyLength < 0) {
            throw new ReadException("Pkg total length read from the header is 0");
        }
        if (iBodyLength > this.socketConfig.getSocketProtocol().getMaxPkgSizeInByte() || this.readBuffer.getLength() > this.socketConfig.getSocketProtocol().getMaxPkgSizeInByte()) {
            throw new ReadException("Protocol allowed max package size in byte is " + this.socketConfig.getSocketProtocol().getMaxPkgSizeInByte() + ", but according to the pkg header the pkg size is " + iBodyLength);
        }
        this.readBuffer.reSize(iBodyLength);
        readBody();
        if (iBodyLength == this.readBuffer.getLength()) {
            byte[] array = this.readBuffer.getArray();
            this.readBuffer.reset();
            return array;
        }
        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Out of buffer! pkg total length is ", iBodyLength, ", read buffer length is ");
        sbOooO0O0.append(this.readBuffer.getLength());
        throw new ReadException(sbOooO0O0.toString());
    }

    private final void readBody() throws IOException {
        byte[] array = this.readBuffer.getArray();
        int length = this.readBuffer.getLength();
        int offset = this.readBuffer.getOffset();
        while (offset < length) {
            int i = this.inputStream.read(array, offset, length - offset);
            if (i == -1) {
                throw new ReadException("Touch the end of stream when reading body");
            }
            offset += i;
            this.readBuffer.flush(offset);
        }
    }

    private final void readHeader() throws IOException {
        byte[] array = this.readBuffer.getArray();
        int length = this.readBuffer.getLength();
        int offset = this.readBuffer.getOffset();
        while (offset < length) {
            int i = this.inputStream.read(array, offset, length - offset);
            if (i == -1) {
                throw new ReadException("Touch the end of stream when reading header");
            }
            offset += i;
            this.readBuffer.flush(offset);
        }
    }

    @Override // com.common.support.utils.LoopTask
    public long delayed() {
        return 0L;
    }

    @Override // com.common.support.utils.LoopTask
    public void onDoTaskError(@Nullable Throwable throwable) {
        if (throwable == null) {
            return;
        }
        this.onReadError.invoke(throwable);
        LoggerKt.logE(ExceptionsKt.stackTraceToString(throwable));
    }

    @Override // com.common.support.utils.LoopTask
    public void task() {
        this.onReadFrame.invoke(read());
    }
}
