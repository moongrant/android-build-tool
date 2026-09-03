package p039OoooOoo;

import android.view.View;
import androidx.compose.runtime.MutableState;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import kotlin.jvm.internal.Intrinsics;
import p429o0OoOO.o0Oo0oo;
import p507o0o00oo.o0ooOOo;
import p605o0oo0O0O.o0O0O0Oo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O000o0 implements o000Oo0.OooO0OO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1698OooO0Oo;

    public /* synthetic */ o0O000o0(Object obj) {
        this.f1698OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        UserRoomsActivity this$0 = (UserRoomsActivity) this.f1698OooO0Oo;
        int i2 = UserRoomsActivity.f26896OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0ooOOo<RoomIndexModel> o0ooooo = this$0.f26901OooOo0O;
        Intrinsics.checkNotNull(o0ooooo);
        RoomIndexModel roomIndexModel = o0ooooo.f13189OooOOoo.get(i);
        if (roomIndexModel == null) {
            return;
        }
        RoomModel roomModel = new RoomModel();
        roomModel.setId(o0O0O0Oo.OooOO0o(roomIndexModel.barid));
        roomModel.setName(roomIndexModel.barname);
        roomModel.setBaridx(roomIndexModel.baridx);
        roomModel.setImage(roomIndexModel.barimage);
        roomModel.setRoomIp(roomIndexModel.roomserverip);
        roomModel.websocketaddr = roomIndexModel.websocketaddr;
        roomModel.setHeatDay(roomIndexModel.heatday);
        roomModel.setLevel(roomIndexModel.barlevel);
        roomModel.setKinds(o0O0O0Oo.OooOO0O(roomIndexModel.variety));
        roomModel.setIsencrypt(roomIndexModel.isencrypt);
        if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Me_profile_room);
        }
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        o0O00OOO o0o00ooo2 = (o0O00OOO) this.f1698OooO0Oo;
        o0o00ooo2.f1716OooOOO0 = oooO00o;
        return "ReadyToReleaseFuture " + o0o00ooo2;
    }
}
