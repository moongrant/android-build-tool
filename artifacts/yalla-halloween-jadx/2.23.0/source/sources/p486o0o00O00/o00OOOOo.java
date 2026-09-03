package p486o0o00O00;

import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOo00;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.RandomActivityModel;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p427o0OoOO00.o0OOO0o;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends Lambda implements Function1<RandomActivityModel.DataBean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00OOOOo f48327OooO0Oo = new o00OOOOo();

    public o00OOOOo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RandomActivityModel.DataBean dataBean) {
        RandomActivityModel.DataBean dataBean2 = dataBean;
        if (OooOo00.OooO0O0(dataBean2 != null ? dataBean2.barId : null)) {
            Intrinsics.checkNotNull(dataBean2);
            String str = dataBean2.roomServerIP;
            RoomModel roomModel = new RoomModel();
            roomModel.setRoomIp(str);
            roomModel.websocketaddr = dataBean2.websocketaddr;
            roomModel.setId(OooOOOO.OooOO0o(dataBean2.barId));
            roomModel.setName(dataBean2.barName);
            roomModel.setLevel(dataBean2.barLevel);
            roomModel.setSessionId(dataBean2.sessionId);
            if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                MutableState mutableState = o0OOO0o.f45698OooO00o;
                o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Room_DailyTasks_go);
            }
        }
        return Unit.INSTANCE;
    }
}
