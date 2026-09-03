package p442o0OoOoO0;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p427o0OoOO00.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f46203OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(EventModel eventModel) {
        super(0);
        this.f46203OooO0Oo = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState mutableState = o0OOO0o.f45698OooO00o;
        RoomModel roomModel = new RoomModel();
        EventModel eventModel = this.f46203OooO0Oo;
        roomModel.setId(eventModel.getRoomId());
        roomModel.setImage(eventModel.getRoomImage());
        roomModel.setName(eventModel.getRoomName());
        roomModel.setRoomIp(eventModel.getRoomServerIP());
        roomModel.websocketaddr = eventModel.getWebsocketaddr();
        o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.EventList);
        return Unit.INSTANCE;
    }
}
