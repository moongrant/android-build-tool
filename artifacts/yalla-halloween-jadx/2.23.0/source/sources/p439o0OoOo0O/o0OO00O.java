package p439o0OoOo0O;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000O00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f46102OooO0Oo;

    public o0OO00O(RoomFrameUIController roomFrameUIController) {
        this.f46102OooO0Oo = roomFrameUIController;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        boolean z;
        String str2 = str;
        RoomFrameUIController roomFrameUIController = this.f46102OooO0Oo;
        if (str2 != null) {
            roomFrameUIController.getClass();
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        MixedRoomActivity mixedRoomActivity = roomFrameUIController.f23544OooO00o;
        NetImageView netImageView = roomFrameUIController.f23545OooO0O0;
        if (z) {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(mixedRoomActivity);
            int i = oOo00OO0.icon_room_bg;
            oooO00o.f43915OooO0oO = i;
            oooO00o.f43909OooO00o = 1;
            oooO00o.f43925OooOOo0 = netImageView.getDrawable();
            oooO00o.f43913OooO0o = i;
            oooO00o.OooO0Oo(netImageView);
            return;
        }
        if (netImageView.getDrawable() != null) {
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(mixedRoomActivity);
            oooO00o2.f43911OooO0OO = OooO0o.OooO0oo(o0000O00.OooO0O0(), o0000O00.OooO00o(), str2);
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.f43925OooOOo0 = netImageView.getDrawable();
            oooO00o2.f43913OooO0o = oOo00OO0.icon_room_bg;
            oooO00o2.OooO0Oo(netImageView);
            return;
        }
        OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(mixedRoomActivity);
        oooO00o3.f43911OooO0OO = OooO0o.OooO0oo(o0000O00.OooO0O0(), o0000O00.OooO00o(), str2);
        oooO00o3.f43909OooO00o = 0;
        int i2 = oOo00OO0.icon_room_bg;
        oooO00o3.f43923OooOOOo = i2;
        oooO00o3.f43913OooO0o = i2;
        oooO00o3.OooO0Oo(netImageView);
    }
}
