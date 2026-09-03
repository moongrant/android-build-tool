package p494o0o00OoO;

import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.view.pop.roomExitPop.RoomExitTag;
import p427o0OoOO00.o0OOO0o;
import p587o0oOooo.o0OO000;
import p629o0ooO0O0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 implements o0000Ooo<AbsJavaBean, RoomExitTag> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f48759OooO00o;

    public o00OO0O0(o00OO00O o00oo00o) {
        this.f48759OooO00o = o00oo00o;
    }

    @Override // p629o0ooO0O0.o0000Ooo
    public final void OooO00o(int i, Object obj, Object obj2) {
        int i2 = o00OO00O.OooO0OO.f48758OooO00o[((RoomExitTag) obj2).ordinal()];
        if (i2 == 1) {
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            o0OOO0o.OooO00o();
            o0OO000.OooO00o("102262");
        } else if (i2 == 2) {
            MutableState mutableState2 = o0OOO0o.f45698OooO00o;
            o0OOO0o.f45698OooO00o.setValue(RoomState.Hook);
            LiveEventBus.get("Close_RoomUI").post(null);
            o0OO000.OooO00o("102261");
        }
        this.f48759OooO00o.f48754OooO0OO.dismiss();
    }
}
