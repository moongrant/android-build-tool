package com.yalla.yalla.ui.fragment.room;

import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentListVM f28432OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(RoomInfoMomentListVM roomInfoMomentListVM) {
        super(0);
        this.f28432OooO0Oo = roomInfoMomentListVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomInfoMomentListVM roomInfoMomentListVM = this.f28432OooO0Oo;
        roomInfoMomentListVM.getContentState().setValue(ContentState.Loading);
        RoomInfoMomentListVM.getMoments$default(roomInfoMomentListVM, false, 1, null);
        return Unit.INSTANCE;
    }
}
