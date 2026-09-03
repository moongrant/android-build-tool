package com.yalla.yalla.ui.activity.room;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.QuickCreatRoomModel;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26490OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(CreateRoomActivity createRoomActivity) {
        super(createRoomActivity);
        this.f26490OooO0o0 = createRoomActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        QuickCreatRoomModel.DataBean dataBean;
        Intrinsics.checkNotNullParameter(response, "response");
        CreateRoomActivity createRoomActivity = this.f26490OooO0o0;
        createRoomActivity.f26059OooOoO = false;
        QuickCreatRoomModel quickCreatRoomModel = (QuickCreatRoomModel) oOOO00.OooO00o(response, QuickCreatRoomModel.class);
        if (quickCreatRoomModel == null || (dataBean = quickCreatRoomModel.data) == null) {
            return;
        }
        o0oo0000.OooO00o.OooO0O0("201015");
        o0oo0000.OooO00o.OooO0O0("201003");
        p545o0oO0O00.OooOo00.OooO0O0(31, null);
        RoomModel roomModel = new RoomModel();
        String roomid = dataBean.roomid;
        Intrinsics.checkNotNullExpressionValue(roomid, "roomid");
        roomModel.setId(Long.parseLong(roomid));
        roomModel.setName(dataBean.name);
        roomModel.setRoomIp(dataBean.roomserverip);
        roomModel.websocketaddr = dataBean.websocketaddr;
        roomModel.setLevel(dataBean.level);
        MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
        p429o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Create_Auto_Room);
        LiveEventBus.get("refreshUniqueIDPage").post(null);
        o0O00OO.OooO00o.f41006OooO00o = 1;
        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
        Long l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
        String str = "CREATE_ROOM_" + l;
        SharedPreferences sharedPreferences = p269o00oooo0.o0O0oo0o.OooO00o().f48377OooO00o;
        if ((sharedPreferences != null ? sharedPreferences.getInt(str, 0) : 0) == 0) {
            p390o0OOooo.o00000.OooO00o("AFEventRoom", null);
            p269o00oooo0.o0O0oo0o.OooO00o().OooO0OO(1, "CREATE_ROOM_" + l);
        }
        createRoomActivity.finish();
    }
}
