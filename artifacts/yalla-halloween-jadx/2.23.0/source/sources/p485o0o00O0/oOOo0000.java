package p485o0o00O0;

import android.view.View;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.dialog.Oooo0;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p139o00OOooO.OooO0o;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.ooooO0O0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOOo0000 implements XRefreshLayout.OooO0OO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f48177OooO0Oo;

    public /* synthetic */ oOOo0000(Object obj) {
        this.f48177OooO0Oo = obj;
    }

    @Override // com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout.OooO0OO
    public final void OooO00o() {
        TopicSearchActivity this$0 = (TopicSearchActivity) this.f48177OooO0Oo;
        int i = TopicSearchActivity.f26398OooOoo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SoftwareKeyboardController softwareKeyboardController = this$0.f26406OooOoO0;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f48177OooO0Oo;
        int i2 = RoomMoraGameListDialog.f27951OooOOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f27955OooOO0o.f10111OooOOoo.size() > i) {
            Oooo0 oooo0 = this$0.f27955OooOO0o;
            long userId = ((Room.RoshamboModel) oooo0.f10111OooOOoo.get(i)).getUserId();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && userId == l.longValue()) {
                return;
            }
            if (oooo0.getItemViewType(i) == RoomMoraGameListDialog.GuessType.ChallengeGuessing.getValue()) {
                long toUserId = ((Room.RoshamboModel) oooo0.f10111OooOOoo.get(i)).getToUserId();
                Long l2 = (Long) o000000O.OooOOo0().getValue();
                if (l2 == null || toUserId != l2.longValue()) {
                    return;
                }
            }
            Object obj = oooo0.f10111OooOOoo.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "moraAdapter.data[position]");
            Room.RoshamboModel roshamboModel = (Room.RoshamboModel) obj;
            o0OO000.OooO00o("102123");
            RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
            roomUserInfoModel.getUserHeader().setValue(OooO0o.OooO0Oo(roshamboModel.getHeadphoto()));
            MutableStateFlow<String> userName = roomUserInfoModel.getUserName();
            String name = roshamboModel.getName();
            Intrinsics.checkNotNullExpressionValue(name, "model.name");
            userName.setValue(name);
            roomUserInfoModel.getUserId().setValue(Long.valueOf(roshamboModel.getUserId()));
            ooooO0O0 ooooo0o0 = new ooooO0O0(this$0.f27952OooO, false);
            long morauuid = roshamboModel.getMorauuid();
            int moragiftid = roshamboModel.getMoragiftid();
            String giftImage = roshamboModel.getGiftImage();
            Intrinsics.checkNotNullExpressionValue(giftImage, "model.giftImage");
            ooooo0o0.OooOO0O(morauuid, moragiftid, giftImage, String.valueOf(roshamboModel.getMoranum()), roshamboModel.getGiftprice(), roomUserInfoModel, roshamboModel.getToUserId());
            ooooo0o0.OooO();
        }
    }
}
