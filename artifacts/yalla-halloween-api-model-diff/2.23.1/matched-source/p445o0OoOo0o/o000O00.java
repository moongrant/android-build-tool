package p445o0OoOo0o;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000O00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.jvm.internal.Intrinsics;
import p184o00o00O0.OooO0OO;
import p370o0OOo0Oo.Oooo000;
import p565o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47287OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47288OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f47287OooO0Oo = i;
        this.f47288OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z;
        int i = this.f47287OooO0Oo;
        Object obj2 = this.f47288OooO0o0;
        switch (i) {
            case 0:
                RoomFrameUIController this$0 = (RoomFrameUIController) obj2;
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (str != null) {
                    this$0.getClass();
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                MixedRoomActivity mixedRoomActivity = this$0.f23095OooO00o;
                NetImageView netImageView = this$0.f23096OooO0O0;
                if (z) {
                    Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(mixedRoomActivity);
                    int i2 = o0OOO0o.icon_room_bg;
                    oooO00o.f43131OooO0oO = i2;
                    oooO00o.f43125OooO00o = 1;
                    oooO00o.f43141OooOOo0 = netImageView.getDrawable();
                    oooO00o.f43129OooO0o = i2;
                    oooO00o.OooO0Oo(netImageView);
                } else if (netImageView.getDrawable() != null) {
                    Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(mixedRoomActivity);
                    oooO00o2.f43127OooO0OO = OooO0OO.OooO0oo(o0000O00.OooO0OO(), o0000O00.OooO0O0(), str);
                    oooO00o2.f43125OooO00o = 0;
                    oooO00o2.f43141OooOOo0 = netImageView.getDrawable();
                    oooO00o2.f43129OooO0o = o0OOO0o.icon_room_bg;
                    oooO00o2.OooO0Oo(netImageView);
                } else {
                    Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(mixedRoomActivity);
                    oooO00o3.f43127OooO0OO = OooO0OO.OooO0oo(o0000O00.OooO0OO(), o0000O00.OooO0O0(), str);
                    oooO00o3.f43125OooO00o = 0;
                    int i3 = o0OOO0o.icon_room_bg;
                    oooO00o3.f43139OooOOOo = i3;
                    oooO00o3.f43129OooO0o = i3;
                    oooO00o3.OooO0Oo(netImageView);
                }
                break;
            default:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                newMomentVM.removeMoment(jLongValue);
                break;
        }
    }
}
