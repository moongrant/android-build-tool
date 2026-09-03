package p535o0o0OOoO;

import com.app.base.model.RandomActivityModel;
import com.app.base.model.RoomModel;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p168o00Ooo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO0OO0O extends Lambda implements Function1<RandomActivityModel.DataBean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oOO0OO0O f43702Oooo0o = new oOO0OO0O();

    public oOO0OO0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RandomActivityModel.DataBean dataBean) {
        RandomActivityModel.DataBean dataBean2 = dataBean;
        if (OooO0OO.OooO0O0(dataBean2 != null ? dataBean2.barId : null)) {
            Intrinsics.checkNotNull(dataBean2);
            String str = dataBean2.roomServerIP;
            RoomModel roomModel = new RoomModel();
            roomModel.setRoomIp(str);
            roomModel.setId(o0O0O00.OooOOO0(dataBean2.barId));
            roomModel.setName(dataBean2.barName);
            roomModel.setLevel(dataBean2.barLevel);
            roomModel.setSessionId(dataBean2.sessionId);
            if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Room_DailyTasks_go);
            }
        }
        return Unit.INSTANCE;
    }
}
