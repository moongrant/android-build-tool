package io.opentelemetry.sdk.metrics.testing;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.export.MetricExporter;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class InMemoryMetricExporter implements MetricExporter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedBlockingQueue f33407OooO00o = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f33408OooO0O0 = false;

    private InMemoryMetricExporter() {
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricExporter
    public final CompletableResultCode export(Collection<MetricData> collection) {
        if (this.f33408OooO0O0) {
            return CompletableResultCode.f33193OooO0o0;
        }
        this.f33407OooO00o.addAll(collection);
        return CompletableResultCode.f33192OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricExporter
    public final CompletableResultCode shutdown() {
        this.f33408OooO0O0 = true;
        this.f33407OooO00o.clear();
        return CompletableResultCode.f33192OooO0Oo;
    }
}
