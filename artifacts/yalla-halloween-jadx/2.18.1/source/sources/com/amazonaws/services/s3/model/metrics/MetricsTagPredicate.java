package com.amazonaws.services.s3.model.metrics;

import com.amazonaws.services.s3.model.Tag;

/* JADX INFO: loaded from: classes.dex */
public final class MetricsTagPredicate extends MetricsFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Tag f11004Oooo0o;

    public MetricsTagPredicate(Tag tag) {
        this.f11004Oooo0o = tag;
    }

    @Override // com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate
    public final void OooO00o(MetricsPredicateVisitor metricsPredicateVisitor) {
        metricsPredicateVisitor.OooO00o(this);
    }
}
