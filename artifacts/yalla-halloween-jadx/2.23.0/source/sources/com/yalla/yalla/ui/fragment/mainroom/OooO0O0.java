package com.yalla.yalla.ui.fragment.mainroom;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomFragment f28497OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(MainRoomFragment mainRoomFragment) {
        super(0);
        this.f28497OooO0Oo = mainRoomFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainRoomFragment mainRoomFragment = this.f28497OooO0Oo;
        if (mainRoomFragment.getBinding().f57906OooO0o0.getCurrentItem() == 1) {
            ((MainRoomBaseFragment) mainRoomFragment.fragments.get(1)).scrollToTop();
        } else {
            mainRoomFragment.getBinding().f57906OooO0o0.setCurrentItem(1);
        }
        return Unit.INSTANCE;
    }
}
