package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomReAnnouncementActivity f26489OooO0oO;

    public oOO00O(RoomReAnnouncementActivity roomReAnnouncementActivity) {
        this.f26489OooO0oO = roomReAnnouncementActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        RoomReAnnouncementActivity roomReAnnouncementActivity = this.f26489OooO0oO;
        String strTrim = roomReAnnouncementActivity.f26176OooOOo0.getText().toString().trim();
        roomReAnnouncementActivity.f26178OooOo0 = strTrim;
        Room.NoticeContentChangeRequest.Builder builderNewBuilder = Room.NoticeContentChangeRequest.newBuilder();
        builderNewBuilder.setNoticemsg(strTrim);
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(10059, builderNewBuilder.build().toByteArray());
        }
    }
}
