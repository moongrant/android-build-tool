package com.amazonaws.services.s3.model.analytics;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnalyticsAndOperator extends AnalyticsNAryOperator {
    public AnalyticsAndOperator(List<AnalyticsFilterPredicate> list) {
        super(list);
    }

    @Override // com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate
    public final void OooO00o(AnalyticsPredicateVisitor analyticsPredicateVisitor) {
        analyticsPredicateVisitor.OooO0OO(this);
    }

    public final List OooO0O0() {
        return this.f10970Oooo0o;
    }
}
