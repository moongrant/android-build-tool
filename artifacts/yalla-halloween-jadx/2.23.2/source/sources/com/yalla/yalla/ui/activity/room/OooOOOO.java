package com.yalla.yalla.ui.activity.room;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.RoomBanEnterUser;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomBanEnterUser f26147OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(RoomBanEnterUser roomBanEnterUser) {
        super(0);
        this.f26147OooO0Oo = roomBanEnterUser;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomBanEnterUser roomBanEnterUser = this.f26147OooO0Oo;
        Long lValueOf = roomBanEnterUser != null ? Long.valueOf(roomBanEnterUser.getUserId()) : null;
        Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
        Intrinsics.checkNotNull(lValueOf);
        builderNewBuilder.setUserid(lValueOf.longValue());
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(10068, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
