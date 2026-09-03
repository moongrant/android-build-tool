package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainMomentFragment f28873OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentListFeaturedFragment f28874OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(MainMomentFragment mainMomentFragment, MomentListFeaturedFragment momentListFeaturedFragment) {
        super(0);
        this.f28873OooO0Oo = mainMomentFragment;
        this.f28874OooO0o0 = momentListFeaturedFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainMomentFragment mainMomentFragment = this.f28873OooO0Oo;
        if (mainMomentFragment.getBinding().f58503OooO0o.getCurrentItem() == 1) {
            this.f28874OooO0o0.scrollToTop();
        } else {
            mainMomentFragment.getBinding().f58503OooO0o.setCurrentItem(1);
        }
        return Unit.INSTANCE;
    }
}
