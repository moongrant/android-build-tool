package com.yalla.yalla.ui.fragment.room;

import com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentListVM f28952OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(RoomInfoMomentListVM roomInfoMomentListVM) {
        super(0);
        this.f28952OooO0Oo = roomInfoMomentListVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomInfoMomentListVM.getMoments$default(this.f28952OooO0Oo, false, 1, null);
        return Unit.INSTANCE;
    }
}
