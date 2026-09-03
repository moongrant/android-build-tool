package p650o0ooo;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.RandomRoomModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.jvm.internal.Intrinsics;
import p429o0OoOO.o0Oo0oo;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O00o0 implements Observer {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ApiResult apiResult = (ApiResult) obj;
        if (!apiResult.isSuccess() || apiResult.getData() == null) {
            return;
        }
        RoomModel roomModel = new RoomModel();
        Object data = apiResult.getData();
        Intrinsics.checkNotNull(data);
        roomModel.setRoomIp(((RandomRoomModel) data).getRoomServerIP());
        Object data2 = apiResult.getData();
        Intrinsics.checkNotNull(data2);
        roomModel.websocketaddr = ((RandomRoomModel) data2).getWebsocketaddr();
        Object data3 = apiResult.getData();
        Intrinsics.checkNotNull(data3);
        roomModel.setId(o0O0O0Oo.OooOO0o(((RandomRoomModel) data3).getBarId()));
        Object data4 = apiResult.getData();
        Intrinsics.checkNotNull(data4);
        roomModel.setName(((RandomRoomModel) data4).getBarName());
        Object data5 = apiResult.getData();
        Intrinsics.checkNotNull(data5);
        roomModel.setLevel(((RandomRoomModel) data5).getBarLevel());
        Object data6 = apiResult.getData();
        Intrinsics.checkNotNull(data6);
        roomModel.setSessionId(((RandomRoomModel) data6).getSessionId());
        if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Room_DailyTasks_go);
        }
    }
}
