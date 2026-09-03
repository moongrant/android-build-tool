package com.yalla.yalla.ui.fragment.mainroom;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainRoomFragment f24454Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(MainRoomFragment mainRoomFragment) {
        super(0);
        this.f24454Oooo0o = mainRoomFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f24454Oooo0o.getBinding().f51009OooO0oo.getCurrentItem() == 0) {
            ((MainRoomBaseFragment) this.f24454Oooo0o.fragments.get(0)).scrollToTop();
        } else {
            this.f24454Oooo0o.getBinding().f51009OooO0oo.setCurrentItem(0);
        }
        return Unit.INSTANCE;
    }
}
