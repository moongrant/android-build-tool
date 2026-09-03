package com.amazonaws.services.s3.model.analytics;

import com.amazonaws.services.s3.model.Tag;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsTagPredicate extends AnalyticsFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Tag f10976Oooo0o;

    public AnalyticsTagPredicate(Tag tag) {
        this.f10976Oooo0o = tag;
    }

    @Override // com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate
    public final void OooO00o(AnalyticsPredicateVisitor analyticsPredicateVisitor) {
        analyticsPredicateVisitor.OooO0O0(this);
    }
}
