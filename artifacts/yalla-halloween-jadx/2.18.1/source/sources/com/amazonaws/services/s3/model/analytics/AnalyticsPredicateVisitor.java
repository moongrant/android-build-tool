package com.amazonaws.services.s3.model.analytics;

/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsPredicateVisitor {
    void OooO00o(AnalyticsPrefixPredicate analyticsPrefixPredicate);

    void OooO0O0(AnalyticsTagPredicate analyticsTagPredicate);

    void OooO0OO(AnalyticsAndOperator analyticsAndOperator);
}
