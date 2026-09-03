package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainMomentFragment f28348OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainMomentFollowingFragment f28349OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(MainMomentFragment mainMomentFragment, MainMomentFollowingFragment mainMomentFollowingFragment) {
        super(0);
        this.f28348OooO0Oo = mainMomentFragment;
        this.f28349OooO0o0 = mainMomentFollowingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainMomentFragment mainMomentFragment = this.f28348OooO0Oo;
        if (mainMomentFragment.getBinding().f44387OooO0o.getCurrentItem() == 0) {
            this.f28349OooO0o0.scrollToTop();
        } else {
            mainMomentFragment.getBinding().f44387OooO0o.setCurrentItem(0);
        }
        return Unit.INSTANCE;
    }
}
