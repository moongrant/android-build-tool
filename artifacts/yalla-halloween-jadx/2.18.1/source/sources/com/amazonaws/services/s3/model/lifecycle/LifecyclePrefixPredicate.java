package com.amazonaws.services.s3.model.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class LifecyclePrefixPredicate extends LifecycleFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f10997Oooo0o;

    public LifecyclePrefixPredicate(String str) {
        this.f10997Oooo0o = str;
    }

    @Override // com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate
    public final void OooO00o(LifecyclePredicateVisitor lifecyclePredicateVisitor) {
        lifecyclePredicateVisitor.OooO0O0(this);
    }
}
