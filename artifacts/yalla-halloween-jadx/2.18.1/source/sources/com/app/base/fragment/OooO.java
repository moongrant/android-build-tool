package com.app.base.fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainMomentFragment f11607Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentListFeaturedFragment f11608Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(MainMomentFragment mainMomentFragment, MomentListFeaturedFragment momentListFeaturedFragment) {
        super(0);
        this.f11607Oooo0o = mainMomentFragment;
        this.f11608Oooo0oO = momentListFeaturedFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f11607Oooo0o.getBinding().f49230OooO0o.getCurrentItem() == 1) {
            this.f11608Oooo0oO.scrollToTop();
        } else {
            this.f11607Oooo0o.getBinding().f49230OooO0o.setCurrentItem(1);
        }
        return Unit.INSTANCE;
    }
}
