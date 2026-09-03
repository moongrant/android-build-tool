package com.amazonaws.services.s3.model.metrics;

/* JADX INFO: loaded from: classes.dex */
public final class MetricsPrefixPredicate extends MetricsFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f11003Oooo0o;

    public MetricsPrefixPredicate(String str) {
        this.f11003Oooo0o = str;
    }

    @Override // com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate
    public final void OooO00o(MetricsPredicateVisitor metricsPredicateVisitor) {
        metricsPredicateVisitor.OooO0OO(this);
    }
}
