package io.opentelemetry.sdk.metrics.export;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public interface MetricExporter {
    CompletableResultCode export(Collection<MetricData> collection);

    CompletableResultCode shutdown();
}
