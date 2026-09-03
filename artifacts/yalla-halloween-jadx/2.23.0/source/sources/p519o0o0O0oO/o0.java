package p519o0o0O0oO;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.RandomRoomModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.jvm.internal.Intrinsics;
import p427o0OoOO00.o0OOO0o;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements Observer<ApiResult<RandomRoomModel>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0 f52446OooO0Oo = new o0();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ApiResult<RandomRoomModel> apiResult) {
        ApiResult<RandomRoomModel> apiResult2 = apiResult;
        if (!apiResult2.isSuccess() || apiResult2.getData() == null) {
            return;
        }
        RoomModel roomModel = new RoomModel();
        RandomRoomModel data = apiResult2.getData();
        Intrinsics.checkNotNull(data);
        roomModel.setRoomIp(data.getRoomServerIP());
        RandomRoomModel data2 = apiResult2.getData();
        Intrinsics.checkNotNull(data2);
        roomModel.websocketaddr = data2.getWebsocketaddr();
        RandomRoomModel data3 = apiResult2.getData();
        Intrinsics.checkNotNull(data3);
        roomModel.setId(OooOOOO.OooOO0o(data3.getBarId()));
        RandomRoomModel data4 = apiResult2.getData();
        Intrinsics.checkNotNull(data4);
        roomModel.setName(data4.getBarName());
        RandomRoomModel data5 = apiResult2.getData();
        Intrinsics.checkNotNull(data5);
        roomModel.setLevel(data5.getBarLevel());
        RandomRoomModel data6 = apiResult2.getData();
        Intrinsics.checkNotNull(data6);
        roomModel.setSessionId(data6.getSessionId());
        if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Room_DailyTasks_go);
        }
    }
}
