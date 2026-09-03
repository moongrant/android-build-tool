package p488o0o000oo;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.MomentBarGetServerIpModel;
import com.app.base.model.RoomModel;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Integer f40972OooO00o;

    public static final class OooO00o extends o00000O0<MomentBarGetServerIpModel> {
    }

    public o000OOo(Integer num) {
        this.f40972OooO00o = num;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        MomentBarGetServerIpModel momentBarGetServerIpModel = (MomentBarGetServerIpModel) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        if (momentBarGetServerIpModel != null && OooO0OO.OooO0O0(Long.valueOf(momentBarGetServerIpModel.getRoomid())) && OooO0OO.OooO0O0(momentBarGetServerIpModel.getRoomserverip())) {
            RoomModel roomModel = new RoomModel();
            roomModel.setId(momentBarGetServerIpModel.getRoomid());
            roomModel.setRoomIp(momentBarGetServerIpModel.getRoomserverip());
            RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Activity_Room);
            Integer num = this.f40972OooO00o;
            if (num == null || num.intValue() <= 0) {
                return;
            }
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43177Oooo0o = true;
            o00O.f43180Oooo0oo.setValue(Integer.valueOf(num.intValue()));
        }
    }
}
