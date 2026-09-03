package com.amazonaws.services.s3.model.analytics;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsPrefixPredicate extends AnalyticsFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f10971Oooo0o;

    public AnalyticsPrefixPredicate(String str) {
        this.f10971Oooo0o = str;
    }

    @Override // com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate
    public final void OooO00o(AnalyticsPredicateVisitor analyticsPredicateVisitor) {
        analyticsPredicateVisitor.OooO00o(this);
    }
}
