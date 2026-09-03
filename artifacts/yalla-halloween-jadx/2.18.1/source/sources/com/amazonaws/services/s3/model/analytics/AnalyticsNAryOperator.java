package com.amazonaws.services.s3.model.analytics;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class AnalyticsNAryOperator extends AnalyticsFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<AnalyticsFilterPredicate> f10970Oooo0o;

    public AnalyticsNAryOperator(List<AnalyticsFilterPredicate> list) {
        this.f10970Oooo0o = list;
    }
}
