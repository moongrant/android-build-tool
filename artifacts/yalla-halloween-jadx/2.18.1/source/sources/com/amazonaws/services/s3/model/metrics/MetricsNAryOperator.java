package com.amazonaws.services.s3.model.metrics;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class MetricsNAryOperator extends MetricsFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<MetricsFilterPredicate> f11002Oooo0o;

    public MetricsNAryOperator(List<MetricsFilterPredicate> list) {
        this.f11002Oooo0o = list;
    }
}
