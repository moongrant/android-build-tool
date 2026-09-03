package p559o0oOOoo0;

import com.app.base.bean.AbsJavaBean;
import com.app.base.view.pop.roomExitPop.RoomExitTag;
import com.yalla.yalla.common.manager.RoomStateManager;
import o00Oo00.OooO0O0;
import p391o0OOooOo.o0O00000;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO implements OooO0O0<AbsJavaBean, RoomExitTag> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f44845OooO0Oo;

    public o00OO(oo0O oo0o) {
        this.f44845OooO0Oo = oo0o;
    }

    @Override // o00Oo00.OooO0O0
    public final void OooO0O0(AbsJavaBean absJavaBean, int i, RoomExitTag roomExitTag) {
        int i2 = oo0O.OooO0OO.f44856OooO00o[roomExitTag.ordinal()];
        if (i2 == 1) {
            o0O00000.OooO0OO("InRoom_exit");
            RoomStateManager.INSTANCE.closeRoom();
            OooOo.OooO0O0("102262");
        } else if (i2 == 2) {
            o0O00000.OooO0OO("InRoom_keep");
            RoomStateManager.INSTANCE.hookRoom();
            OooOo.OooO0O0("102261");
        }
        this.f44845OooO0Oo.f44851OooO0Oo.dismiss();
    }
}
