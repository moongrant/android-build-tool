package com.amazonaws.metrics;

import com.amazonaws.services.s3.metrics.S3ServiceMetric;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleMetricType implements MetricType {
    public final boolean equals(Object obj) {
        if (obj instanceof MetricType) {
            return ((S3ServiceMetric) this).f10687Oooo0o.equals(((MetricType) obj).name());
        }
        return false;
    }

    public final int hashCode() {
        return ((S3ServiceMetric) this).f10687Oooo0o.hashCode();
    }

    public final String toString() {
        return ((S3ServiceMetric) this).f10687Oooo0o;
    }
}
