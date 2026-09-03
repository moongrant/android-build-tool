package io.opentelemetry.sdk.trace;

import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.CompletableResultCode;
import java.io.Closeable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public interface SpanProcessor extends Closeable {
    boolean OooOOO();

    boolean o0000O();

    void o0000Oo(ReadableSpan readableSpan);

    void o0Oo0oo(Context context, ReadWriteSpan readWriteSpan);

    CompletableResultCode shutdown();
}
