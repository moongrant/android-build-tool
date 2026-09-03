package io.opentelemetry.sdk.trace.export;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.util.Collection;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
final class MultiSpanExporter implements SpanExporter {
    static {
        Logger.getLogger(MultiSpanExporter.class.getName());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown();
        throw null;
    }

    @Override // io.opentelemetry.sdk.trace.export.SpanExporter
    public final CompletableResultCode export(Collection<SpanData> collection) {
        throw null;
    }

    @Override // io.opentelemetry.sdk.trace.export.SpanExporter
    public final CompletableResultCode shutdown() {
        throw null;
    }
}
