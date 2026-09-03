package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainMomentFragment f28340OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentListFeaturedFragment f28341OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(MainMomentFragment mainMomentFragment, MomentListFeaturedFragment momentListFeaturedFragment) {
        super(0);
        this.f28340OooO0Oo = mainMomentFragment;
        this.f28341OooO0o0 = momentListFeaturedFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainMomentFragment mainMomentFragment = this.f28340OooO0Oo;
        if (mainMomentFragment.getBinding().f44387OooO0o.getCurrentItem() == 1) {
            this.f28341OooO0o0.scrollToTop();
        } else {
            mainMomentFragment.getBinding().f44387OooO0o.setCurrentItem(1);
        }
        return Unit.INSTANCE;
    }
}
