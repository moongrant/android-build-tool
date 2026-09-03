package p544o0o0OoOO;

import com.android.billingclient.api.o00000O;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.QuickCreatRoomModel;
import com.app.base.model.RoomModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137o00OO0oo.OooO;
import p160o00OoOO0.o00OO0O0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class k3 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f44260OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(CreateRoomActivity createRoomActivity) {
        super(createRoomActivity);
        this.f44260OooO00o = createRoomActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        QuickCreatRoomModel.DataBean dataBean;
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        this.f44260OooO00o.f22783Oooooo = false;
        QuickCreatRoomModel quickCreatRoomModel = (QuickCreatRoomModel) o0Oo0oo.OooO0O0(response, QuickCreatRoomModel.class);
        if (quickCreatRoomModel == null || (dataBean = quickCreatRoomModel.data) == null) {
            return;
        }
        CreateRoomActivity createRoomActivity = this.f44260OooO00o;
        o0O00000.OooO0OO("Room_create_success");
        o0O00000.OooO0OO("Room_myroom");
        p034OoooO0O.o0Oo0oo.OooO0o0(31, null);
        String str = dataBean.roomserverip;
        RoomModel roomModel = new RoomModel();
        String str2 = dataBean.roomid;
        Intrinsics.checkNotNullExpressionValue(str2, "it.roomid");
        roomModel.setId(Long.parseLong(str2));
        roomModel.setName(dataBean.name);
        roomModel.setRoomIp(str);
        roomModel.setLevel(dataBean.level);
        RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Create_Auto_Room);
        LiveEventBus.get("refreshUniqueIDPage").post(null);
        OooO.f31646OooO00o = 1;
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        if (o00000O.OooO0O0().OooO00o("CREATE_ROOM_" + value) == 0) {
            p141o00OOoo.OooO.OooO00o("AFEventRoom", null);
            o00000O.OooO0O0().OooO0o0("CREATE_ROOM_" + value, 1);
        }
        createRoomActivity.finish();
    }
}
