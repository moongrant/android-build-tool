package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainMomentFragment f28875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainMomentTopicFragment f28876OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(MainMomentFragment mainMomentFragment, MainMomentTopicFragment mainMomentTopicFragment) {
        super(0);
        this.f28875OooO0Oo = mainMomentFragment;
        this.f28876OooO0o0 = mainMomentTopicFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainMomentFragment mainMomentFragment = this.f28875OooO0Oo;
        if (mainMomentFragment.getBinding().f58503OooO0o.getCurrentItem() == 2) {
            this.f28876OooO0o0.scrollToTop();
        } else {
            mainMomentFragment.getBinding().f58503OooO0o.setCurrentItem(2);
        }
        return Unit.INSTANCE;
    }
}
