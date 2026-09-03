package io.opentelemetry.sdk.trace.export;

import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.ReadableSpan;
import io.opentelemetry.sdk.trace.SpanProcessor;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class SimpleSpanProcessor implements SpanProcessor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Logger f33579OooO0Oo = Logger.getLogger(SimpleSpanProcessor.class.getName());

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean OooOOO0() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown();
        throw null;
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean o0000O() {
        return true;
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0000Oo(ReadableSpan readableSpan) {
        try {
            Collections.singletonList(readableSpan.OooO00o());
            throw null;
        } catch (RuntimeException e) {
            f33579OooO0Oo.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e);
        }
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0ooOO0(Context context, ReadWriteSpan readWriteSpan) {
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final CompletableResultCode shutdown() {
        throw null;
    }
}
