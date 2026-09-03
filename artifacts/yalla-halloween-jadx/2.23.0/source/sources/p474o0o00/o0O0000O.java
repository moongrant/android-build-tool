package p474o0o00;

import android.view.View;
import androidx.compose.runtime.MutableState;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import com.yalla.yalla.ui.view.VerifyCodeView;
import kotlin.jvm.internal.Intrinsics;
import p427o0OoOO00.o0OOO0o;
import p500o0o00oO.o00000O0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0000O implements VerifyCodeView.OooO00o, BaseQuickAdapter.OooO0o, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f47295OooO0Oo;

    public /* synthetic */ o0O0000O(Object obj) {
        this.f47295OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainRoomMineFollowingFragment.initView$lambda$2((MainRoomMineFollowingFragment) this.f47295OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        UserRoomsActivity this$0 = (UserRoomsActivity) this.f47295OooO0Oo;
        int i2 = UserRoomsActivity.f27361OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00000O0<RoomIndexModel> o00000o1 = this$0.f27366OooOo0O;
        Intrinsics.checkNotNull(o00000o1);
        RoomIndexModel roomIndexModel = o00000o1.f10111OooOOoo.get(i);
        if (roomIndexModel == null) {
            return;
        }
        RoomModel roomModel = new RoomModel();
        roomModel.setId(OooOOOO.OooOO0o(roomIndexModel.barid));
        roomModel.setName(roomIndexModel.barname);
        roomModel.setBaridx(roomIndexModel.baridx);
        roomModel.setImage(roomIndexModel.barimage);
        roomModel.setRoomIp(roomIndexModel.roomserverip);
        roomModel.websocketaddr = roomIndexModel.websocketaddr;
        roomModel.setHeatDay(roomIndexModel.heatday);
        roomModel.setLevel(roomIndexModel.barlevel);
        roomModel.setKinds(OooOOOO.OooOO0O(roomIndexModel.variety));
        roomModel.setIsencrypt(roomIndexModel.isencrypt);
        if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Me_profile_room);
        }
    }
}
