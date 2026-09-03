package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.RoomModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.pageSource.GeneralRoomPageSource;
import p168o00Ooo0.o0O0O00;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GeneralRoomActivity f22913OooO0Oo;

    public OooO00o(GeneralRoomActivity generalRoomActivity) {
        this.f22913OooO0Oo = generalRoomActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        GeneralRoomPageSource generalRoomPageSource = this.f22913OooO0Oo.f22838Oooooo0;
        if (generalRoomPageSource != null) {
            int i2 = GeneralRoomActivity.OooO0O0.f22841OooO00o[generalRoomPageSource.ordinal()];
            if (i2 == 1) {
                o0O00000.OooO0o0("Room_country_room", o0O00000.OooO0O0(i));
            } else if (i2 == 2) {
                o0O00000.OooO0o0("Room_tag_room", o0O00000.OooO0O0(i));
            }
        }
        RoomIndexModel roomIndexModel = (RoomIndexModel) baseQuickAdapter.getData().get(i);
        String str = roomIndexModel.roomserverip;
        RoomModel roomModel = new RoomModel();
        roomModel.setName(roomIndexModel.barname);
        roomModel.setBaridx(roomIndexModel.baridx);
        roomModel.setImage(roomIndexModel.barimage);
        roomModel.setId(o0O0O00.OooOOO0(roomIndexModel.barid));
        roomModel.setRoomIp(str);
        GeneralRoomPageSource generalRoomPageSource2 = this.f22913OooO0Oo.f22838Oooooo0;
        if (generalRoomPageSource2 != null) {
            int i3 = GeneralRoomActivity.OooO0O0.f22841OooO00o[generalRoomPageSource2.ordinal()];
            if (i3 == 1) {
                RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Explore_Country);
            } else {
                if (i3 != 2) {
                    return;
                }
                RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Explore_Tag);
            }
        }
    }
}
