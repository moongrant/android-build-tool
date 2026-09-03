package com.amazonaws.services.s3.model.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface LifecyclePredicateVisitor {
    void OooO00o(LifecycleAndOperator lifecycleAndOperator);

    void OooO0O0(LifecyclePrefixPredicate lifecyclePrefixPredicate);

    void OooO0OO(LifecycleTagPredicate lifecycleTagPredicate);
}
