package p502o0o00o0O;

import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.view.pop.roomExitPop.RoomExitTag;
import o0oo0000.OooO00o;
import p400o0Oo0O0.OooOOO0;
import p429o0OoOO.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000 implements OooOOO0<AbsJavaBean, RoomExitTag> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o f50176OooO00o;

    public oO00000(o oVar) {
        this.f50176OooO00o = oVar;
    }

    @Override // p400o0Oo0O0.OooOOO0
    public final void OooO00o(int i, Object obj, Object obj2) {
        int i2 = o.OooO0OO.f50175OooO00o[((RoomExitTag) obj2).ordinal()];
        if (i2 == 1) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
            OooO00o.OooO0O0("102262");
        } else if (i2 == 2) {
            MutableState mutableState2 = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.f46817OooO00o.setValue(RoomState.Hook);
            LiveEventBus.get("Close_RoomUI").post(null);
            OooO00o.OooO0O0("102261");
        }
        this.f50176OooO00o.f50171OooO0OO.dismiss();
    }
}
