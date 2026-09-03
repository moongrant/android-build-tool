package p614o0oo0Oo;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.MomentBarGetServerIpModel;
import com.app.base.model.RoomModel;
import com.yalla.support.common.util.OooO0OO;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p654o0ooo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f48377OooO00o;

    public class OooO00o extends o00000O0<MomentBarGetServerIpModel> {
    }

    public o000O0o(o0OoOo0 o0oooo1) {
        this.f48377OooO00o = o0oooo1;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(String str, String str2) {
        super.onError(str, str2);
        o000Oo0.f48378OooO00o = false;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        MomentBarGetServerIpModel momentBarGetServerIpModel = (MomentBarGetServerIpModel) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
        if (momentBarGetServerIpModel == null || !OooO0OO.OooO0O0(Long.valueOf(momentBarGetServerIpModel.getRoomid())) || !OooO0OO.OooO0O0(momentBarGetServerIpModel.getRoomserverip())) {
            o000Oo0.f48378OooO00o = false;
            return;
        }
        RoomModel roomModel = new RoomModel();
        roomModel.setId(momentBarGetServerIpModel.getRoomid());
        roomModel.setRoomIp(momentBarGetServerIpModel.getRoomserverip());
        o0OoOo0 o0oooo1 = this.f48377OooO00o;
        if (o0oooo1 != null) {
            o0oooo1.OooO00o(roomModel);
        }
        o000Oo0.f48378OooO00o = false;
    }
}
