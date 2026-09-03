package com.yalla.yalla.ui.activity.room;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.QuickCreatRoomModel;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26890OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(CreateRoomActivity createRoomActivity) {
        super(createRoomActivity);
        this.f26890OooO0o0 = createRoomActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        QuickCreatRoomModel.DataBean dataBean;
        Intrinsics.checkNotNullParameter(response, "response");
        CreateRoomActivity createRoomActivity = this.f26890OooO0o0;
        createRoomActivity.f26511OooOoO = false;
        QuickCreatRoomModel quickCreatRoomModel = (QuickCreatRoomModel) oOo00OO0.OooO00o(response, QuickCreatRoomModel.class);
        if (quickCreatRoomModel == null || (dataBean = quickCreatRoomModel.data) == null) {
            return;
        }
        p587o0oOooo.o0OO000.OooO00o("201015");
        p587o0oOooo.o0OO000.OooO00o("201003");
        com.squareup.okhttp.OooOo.OooO0OO(31, null);
        RoomModel roomModel = new RoomModel();
        String str = dataBean.roomid;
        Intrinsics.checkNotNullExpressionValue(str, "it.roomid");
        roomModel.setId(Long.parseLong(str));
        roomModel.setName(dataBean.name);
        roomModel.setRoomIp(dataBean.roomserverip);
        roomModel.websocketaddr = dataBean.websocketaddr;
        roomModel.setLevel(dataBean.level);
        MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
        p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Create_Auto_Room);
        LiveEventBus.get("refreshUniqueIDPage").post(null);
        p379o0OOoo.OooOOOO.f44246OooO0oO = 1;
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
        String str2 = "CREATE_ROOM_" + l;
        SharedPreferences sharedPreferences = com.android.billingclient.api.o0000OO0.OooO0O0().f47688OooO00o;
        if ((sharedPreferences != null ? sharedPreferences.getInt(str2, 0) : 0) == 0) {
            p386o0OOooOo.o00O0O0O.OooO00o("AFEventRoom", null);
            com.android.billingclient.api.o0000OO0.OooO0O0().OooO0OO(1, "CREATE_ROOM_" + l);
        }
        createRoomActivity.finish();
    }
}
