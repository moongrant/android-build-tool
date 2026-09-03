package com.yalla.yalla.ui.vm.main;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f31275OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(MainRoomVM mainRoomVM) {
        super(0);
        this.f31275OooO0Oo = mainRoomVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainRoomVM mainRoomVM = this.f31275OooO0Oo;
        mainRoomVM.loadAction(new OooO00o(mainRoomVM));
        return Unit.INSTANCE;
    }
}
