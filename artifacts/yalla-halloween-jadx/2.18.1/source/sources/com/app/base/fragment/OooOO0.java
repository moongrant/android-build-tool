package com.app.base.fragment;

import com.yalla.yalla.ui.fragment.MainMomentTopicFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainMomentFragment f11614Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MainMomentTopicFragment f11615Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(MainMomentFragment mainMomentFragment, MainMomentTopicFragment mainMomentTopicFragment) {
        super(0);
        this.f11614Oooo0o = mainMomentFragment;
        this.f11615Oooo0oO = mainMomentTopicFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f11614Oooo0o.getBinding().f49230OooO0o.getCurrentItem() == 2) {
            this.f11615Oooo0oO.scrollToTop();
        } else {
            this.f11614Oooo0o.getBinding().f49230OooO0o.setCurrentItem(2);
        }
        return Unit.INSTANCE;
    }
}
