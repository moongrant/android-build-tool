package com.yalla.yalla.ui.fragment.mainroom;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomFragment f27992OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(MainRoomFragment mainRoomFragment) {
        super(0);
        this.f27992OooO0Oo = mainRoomFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainRoomFragment mainRoomFragment = this.f27992OooO0Oo;
        if (mainRoomFragment.getBinding().f44786OooO0o0.getCurrentItem() == 2) {
            ((MainRoomBaseFragment) mainRoomFragment.fragments.get(2)).scrollToTop();
        } else {
            mainRoomFragment.getBinding().f44786OooO0o0.setCurrentItem(2);
        }
        return Unit.INSTANCE;
    }
}
