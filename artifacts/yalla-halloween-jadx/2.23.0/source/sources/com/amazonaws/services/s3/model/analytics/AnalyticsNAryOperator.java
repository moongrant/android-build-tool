package com.amazonaws.services.s3.model.analytics;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AnalyticsNAryOperator extends AnalyticsFilterPredicate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<AnalyticsFilterPredicate> f9453OooO0Oo;

    public AnalyticsNAryOperator(List<AnalyticsFilterPredicate> list) {
        this.f9453OooO0Oo = list;
    }
}
