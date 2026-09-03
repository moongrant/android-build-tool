package com.amazonaws.services.s3.model.metrics;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MetricsNAryOperator extends MetricsFilterPredicate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<MetricsFilterPredicate> f9456OooO0Oo;

    public MetricsNAryOperator(List<MetricsFilterPredicate> list) {
        this.f9456OooO0Oo = list;
    }
}
