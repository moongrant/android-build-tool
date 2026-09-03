package p037OoooOo0;

import androidx.media3.common.Player;
import androidx.media3.exoplayer.OooO;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.o00O0OO;
import p080o000OoO.o00000O0;
import p448o0OoOoo.o0O000o0;
import p559o0oOo.o00O0O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0000 implements o000Oo0.OooO0OO, o00000O0.OooO00o, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1567OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1568OooO0o0;

    public /* synthetic */ o00O0000(Object obj, int i) {
        this.f1567OooO0Oo = i;
        this.f1568OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = 1;
        int i2 = this.f1567OooO0Oo;
        Object obj = this.f1568OooO0o0;
        switch (i2) {
            case 2:
                VehicleMineActivity this$0 = (VehicleMineActivity) obj;
                int i3 = VehicleMineActivity.f26568OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                BaseActivityK.OooOo0o(this$0, null, 0L, 3);
                ((VehicleStoreVM) this$0.f26571OooOo00.getValue()).shopVehicleListMine().observe(this$0, new o0O000o0(this$0, i));
                break;
            case 3:
                RoomMoraGameListDialog this$1 = (RoomMoraGameListDialog) obj;
                int i4 = RoomMoraGameListDialog.f27488OooOOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.getClass();
                RoomMoraGameListDialog.OooOO0o(0L, true);
                break;
            default:
                MainRoomRecommendFragment.initView$lambda$3((MainRoomRecommendFragment) obj);
                break;
        }
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        ((o00oOoo) this.f1568OooO0o0).f1579OooOOO = oooO00o;
        return "SurfaceOutputImpl close future complete";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        o00O0OO o00o0oo2 = (o00O0OO) this.f1568OooO0o0;
        int i = OooO.f7121Ooooooo;
        ((Player.OooO0OO) obj).onIsPlayingChanged(o00o0oo2.OooOO0O());
    }
}
