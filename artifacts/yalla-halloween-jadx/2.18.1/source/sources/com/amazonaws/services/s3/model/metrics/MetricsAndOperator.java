package com.amazonaws.services.s3.model.metrics;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MetricsAndOperator extends MetricsNAryOperator {
    public MetricsAndOperator(List<MetricsFilterPredicate> list) {
        super(list);
    }

    @Override // com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate
    public final void OooO00o(MetricsPredicateVisitor metricsPredicateVisitor) {
        metricsPredicateVisitor.OooO0O0(this);
    }

    public final List OooO0O0() {
        return this.f11002Oooo0o;
    }
}
