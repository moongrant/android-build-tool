package com.yalla.yalla.ui.activity.room;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.jvm.functions.Function0;
import p641o0ooOOOO.m1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O00O implements Function0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26862OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f26863OooO0o0;

    public /* synthetic */ o00O00O(Object obj, int i) {
        this.f26862OooO0Oo = i;
        this.f26863OooO0o0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26862OooO0Oo;
        Object obj = this.f26863OooO0o0;
        switch (i) {
            case 0:
                int i2 = RoomReAnnouncementActivity.f26628OooOo0O;
                ((RoomReAnnouncementActivity) obj).finish();
                break;
            default:
                m1 m1Var = (m1) obj;
                int i3 = oO0OO.OooOO0O.f60386OooOo0;
                int i4 = (com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25021OooOoO.getValue().booleanValue() || m1Var == null || !m1Var.f58392OooO0O0.isChecked()) ? 0 : 1;
                Room.kickTouristRequest.Builder builderNewBuilder = Room.kickTouristRequest.newBuilder();
                builderNewBuilder.setKickOp(i4);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10070, builderNewBuilder.build().toByteArray());
                }
                break;
        }
        return null;
    }
}
