package com.yalla.yalla.ui.fragment.mainroom;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomFragment f27990OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(MainRoomFragment mainRoomFragment) {
        super(0);
        this.f27990OooO0Oo = mainRoomFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainRoomFragment mainRoomFragment = this.f27990OooO0Oo;
        if (mainRoomFragment.getBinding().f44786OooO0o0.getCurrentItem() == 0) {
            ((MainRoomBaseFragment) mainRoomFragment.fragments.get(0)).scrollToTop();
        } else {
            mainRoomFragment.getBinding().f44786OooO0o0.setCurrentItem(0);
        }
        return Unit.INSTANCE;
    }
}
