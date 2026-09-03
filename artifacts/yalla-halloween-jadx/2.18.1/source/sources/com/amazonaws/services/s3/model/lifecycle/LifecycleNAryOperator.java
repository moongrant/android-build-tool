package com.amazonaws.services.s3.model.lifecycle;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class LifecycleNAryOperator extends LifecycleFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<LifecycleFilterPredicate> f10996Oooo0o;

    public LifecycleNAryOperator(List<LifecycleFilterPredicate> list) {
        this.f10996Oooo0o = list;
    }
}
