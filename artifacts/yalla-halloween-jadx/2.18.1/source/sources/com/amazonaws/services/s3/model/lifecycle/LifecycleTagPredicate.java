package com.amazonaws.services.s3.model.lifecycle;

import com.amazonaws.services.s3.model.Tag;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleTagPredicate extends LifecycleFilterPredicate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Tag f10998Oooo0o;

    public LifecycleTagPredicate(Tag tag) {
        this.f10998Oooo0o = tag;
    }

    @Override // com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate
    public final void OooO00o(LifecyclePredicateVisitor lifecyclePredicateVisitor) {
        lifecyclePredicateVisitor.OooO0OO(this);
    }
}
