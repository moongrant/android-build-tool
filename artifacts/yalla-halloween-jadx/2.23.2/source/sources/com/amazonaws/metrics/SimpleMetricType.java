package com.amazonaws.metrics;

import com.amazonaws.services.s3.metrics.S3ServiceMetric;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleMetricType implements MetricType {
    public final boolean equals(Object obj) {
        if (!(obj instanceof MetricType)) {
            return false;
        }
        return ((S3ServiceMetric) this).f12435OooO0Oo.equals(((MetricType) obj).name());
    }

    public final int hashCode() {
        return ((S3ServiceMetric) this).f12435OooO0Oo.hashCode();
    }

    public final String toString() {
        return ((S3ServiceMetric) this).f12435OooO0Oo;
    }
}
