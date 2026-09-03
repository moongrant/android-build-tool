package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomReAnnouncementActivity f26958OooO0oO;

    public oo00o(RoomReAnnouncementActivity roomReAnnouncementActivity) {
        this.f26958OooO0oO = roomReAnnouncementActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        RoomReAnnouncementActivity roomReAnnouncementActivity = this.f26958OooO0oO;
        String strTrim = roomReAnnouncementActivity.f26630OooOOo0.getText().toString().trim();
        roomReAnnouncementActivity.f26632OooOo0 = strTrim;
        Room.NoticeContentChangeRequest.Builder builderNewBuilder = Room.NoticeContentChangeRequest.newBuilder();
        builderNewBuilder.setNoticemsg(strTrim);
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(10059, builderNewBuilder.build().toByteArray());
        }
    }
}
