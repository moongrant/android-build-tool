package com.amazonaws.services.s3.model.lifecycle;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleAndOperator extends LifecycleNAryOperator {
    public LifecycleAndOperator(List<LifecycleFilterPredicate> list) {
        super(list);
    }

    @Override // com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate
    public final void OooO00o(LifecyclePredicateVisitor lifecyclePredicateVisitor) {
        lifecyclePredicateVisitor.OooO00o(this);
    }

    public final List OooO0O0() {
        return this.f10996Oooo0o;
    }
}
