package com.amazonaws.services.s3.model.lifecycle;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class LifecycleNAryOperator extends LifecycleFilterPredicate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<LifecycleFilterPredicate> f9455OooO0Oo;

    public LifecycleNAryOperator(List<LifecycleFilterPredicate> list) {
        this.f9455OooO0Oo = list;
    }
}
