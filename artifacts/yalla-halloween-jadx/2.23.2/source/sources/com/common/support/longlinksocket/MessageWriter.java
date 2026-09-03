package com.common.support.longlinksocket;

import com.common.support.utils.LoopTask;
import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/common/support/longlinksocket/MessageWriter;", "Lcom/common/support/utils/LoopTask;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "output", "Ljava/io/OutputStream;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/io/OutputStream;)V", "msgQueue", "Ljava/util/concurrent/LinkedBlockingQueue;", "", "afterTask", "", "beforeTask", "delayed", "", "task", "write", "", "msg", "longlink-socket_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MessageWriter extends LoopTask {

    @NotNull
    private final LinkedBlockingQueue<byte[]> msgQueue;

    @NotNull
    private final OutputStream output;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageWriter(@NotNull CoroutineScope scope, @NotNull OutputStream output) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(output, "output");
        this.output = output;
        this.msgQueue = new LinkedBlockingQueue<>();
    }

    @Override // com.common.support.utils.LoopTask
    public void afterTask() {
        LoggerKt.logD("MsgWriter end");
    }

    @Override // com.common.support.utils.LoopTask
    public void beforeTask() {
        LoggerKt.logD("MsgWriter start");
    }

    @Override // com.common.support.utils.LoopTask
    public long delayed() {
        return 0L;
    }

    @Override // com.common.support.utils.LoopTask
    public void task() {
        try {
            byte[] bArrTake = this.msgQueue.take();
            this.output.write(bArrTake, 0, bArrTake.length);
        } catch (InterruptedException unused) {
        } catch (Throwable unused2) {
            close();
        }
    }

    public final boolean write(@NotNull byte[] msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!(!(msg.length == 0))) {
            throw new IllegalArgumentException("empty msg".toString());
        }
        LoggerKt.logD("MsgWriter write msg");
        return this.msgQueue.offer(msg);
    }
}
