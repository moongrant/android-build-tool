package p601o0oo00Oo;

import com.app.base.model.RoomModel;
import com.app.base.view.pop.roomBroadcastPop.RoomBroadcastRoomModel;
import io.agora.rtc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p034OoooO0O.o0Oo0oo;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOooO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomBroadcastRoomModel f48225Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOooO0(RoomBroadcastRoomModel roomBroadcastRoomModel) {
        super(0);
        this.f48225Oooo0o = roomBroadcastRoomModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomModel roomModel = new RoomModel();
        roomModel.setId(this.f48225Oooo0o.getId());
        roomModel.setRoomIp(this.f48225Oooo0o.getRoomIp());
        o00O00.OooO0O0("跳转至发广播的房间 ： roomModel = " + roomModel.toJSONString());
        o0Oo0oo.OooO0o0(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR, roomModel);
        return Unit.INSTANCE;
    }
}
