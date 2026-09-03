package p520o0o0O00o;

import androidx.lifecycle.Observer;
import com.app.base.model.RoomModel;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.model.RandomRoomModel;
import kotlin.jvm.internal.Intrinsics;
import p169o00Ooo0.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ o000Oo0 f42218OooO0O0 = new o000Oo0(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ o000Oo0 f42219OooO0OO = new o000Oo0(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f42220OooO00o;

    public /* synthetic */ o000Oo0(int i) {
        this.f42220OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f42220OooO00o) {
            case 0:
                SharedMessageVM.m296_get_unreadMessageCount_$lambda6$lambda2((Integer) obj);
                break;
            default:
                Response response = (Response) obj;
                if (response.getIsSuccess() && response.getData() != null) {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    String roomServerIP = ((RandomRoomModel) data).getRoomServerIP();
                    RoomModel roomModel = new RoomModel();
                    roomModel.setRoomIp(roomServerIP);
                    Object data2 = response.getData();
                    Intrinsics.checkNotNull(data2);
                    roomModel.setId(o0O0O00.OooOOO0(((RandomRoomModel) data2).getBarId()));
                    Object data3 = response.getData();
                    Intrinsics.checkNotNull(data3);
                    roomModel.setName(((RandomRoomModel) data3).getBarName());
                    Object data4 = response.getData();
                    Intrinsics.checkNotNull(data4);
                    roomModel.setLevel(((RandomRoomModel) data4).getBarLevel());
                    Object data5 = response.getData();
                    Intrinsics.checkNotNull(data5);
                    roomModel.setSessionId(((RandomRoomModel) data5).getSessionId());
                    if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                        RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Room_DailyTasks_go);
                    }
                    break;
                }
                break;
        }
    }
}
