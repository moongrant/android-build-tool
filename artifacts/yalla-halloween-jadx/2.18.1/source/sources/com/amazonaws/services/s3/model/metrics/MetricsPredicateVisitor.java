package com.amazonaws.services.s3.model.metrics;

/* JADX INFO: loaded from: classes.dex */
public interface MetricsPredicateVisitor {
    void OooO00o(MetricsTagPredicate metricsTagPredicate);

    void OooO0O0(MetricsAndOperator metricsAndOperator);

    void OooO0OO(MetricsPrefixPredicate metricsPrefixPredicate);
}
