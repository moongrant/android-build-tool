package com.app.base.fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainMomentFragment f11612Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MainMomentFollowingFragment f11613Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(MainMomentFragment mainMomentFragment, MainMomentFollowingFragment mainMomentFollowingFragment) {
        super(0);
        this.f11612Oooo0o = mainMomentFragment;
        this.f11613Oooo0oO = mainMomentFollowingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f11612Oooo0o.getBinding().f49230OooO0o.getCurrentItem() == 0) {
            this.f11613Oooo0oO.scrollToTop();
        } else {
            this.f11612Oooo0o.getBinding().f49230OooO0o.setCurrentItem(0);
        }
        return Unit.INSTANCE;
    }
}
