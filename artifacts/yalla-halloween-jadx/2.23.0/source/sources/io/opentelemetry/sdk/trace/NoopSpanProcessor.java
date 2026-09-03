package io.opentelemetry.sdk.trace;

import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.CompletableResultCode;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class NoopSpanProcessor implements SpanProcessor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final NoopSpanProcessor f33474OooO0Oo = new NoopSpanProcessor();

    private NoopSpanProcessor() {
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean OooOOO0() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().OooO0OO(10L, TimeUnit.SECONDS);
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean o0000O() {
        return false;
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0000Oo(ReadableSpan readableSpan) {
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0ooOO0(Context context, ReadWriteSpan readWriteSpan) {
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final CompletableResultCode shutdown() {
        return CompletableResultCode.f33192OooO0Oo;
    }
}
