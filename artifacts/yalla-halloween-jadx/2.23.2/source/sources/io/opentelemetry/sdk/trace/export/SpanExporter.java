package io.opentelemetry.sdk.trace.export;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.io.Closeable;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public interface SpanExporter extends Closeable {
    CompletableResultCode export(Collection<SpanData> collection);

    CompletableResultCode shutdown();
}
