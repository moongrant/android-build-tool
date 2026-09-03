package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;

/* JADX INFO: loaded from: classes5.dex */
class DuplicateMetricStorageException extends IllegalArgumentException {
    public DuplicateMetricStorageException(MetricDescriptor metricDescriptor, MetricDescriptor metricDescriptor2, String str) {
        super(str + " Found: " + metricDescriptor + ", Want: " + metricDescriptor2);
    }
}
