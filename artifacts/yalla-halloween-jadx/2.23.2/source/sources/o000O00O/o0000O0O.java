package o000O00O;

import android.view.View;
import androidx.media3.common.Player;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p475o0Ooooo0.o0O00oO0;
import p557o0oOOooO.oO0OO00o;
import p650o0ooo.oOOO0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0O implements o000OoO.o00000O0.OooO00o, oO0OO00o, BaseQuickAdapter.OooO0o, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34019OooO0Oo;

    public /* synthetic */ o0000O0O(Object obj) {
        this.f34019OooO0Oo = obj;
    }

    public final void OooO00o(String content) {
        MomentSendActivity this$0 = (MomentSendActivity) this.f34019OooO0Oo;
        int i = MomentSendActivity.f25726Oooo0OO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        p598o0oo00Oo.o0000O00.OooO0O0("onMaskAdd content = " + content);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this$0.f25739OooOooo > this$0.f25738OooOooO) {
            this$0.f25739OooOooo = timeInMillis;
            if (Intrinsics.areEqual(content, "@")) {
                this$0.OooOo().f44320OooO0o.OooO0oO(true);
            }
        }
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MainRoomRecommendFragment.initView$lambda$2((MainRoomRecommendFragment) this.f34019OooO0Oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f34019OooO0Oo;
        int i2 = RoomMoraGameListDialog.f27488OooOOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f27492OooOO0o.f13189OooOOoo.size() > i) {
            com.yalla.yalla.ui.dialog.Oooo000 oooo000 = this$0.f27492OooOO0o;
            long userId = ((Room.RoshamboModel) oooo000.f13189OooOOoo.get(i)).getUserId();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && userId == l.longValue()) {
                return;
            }
            if (oooo000.getItemViewType(i) == RoomMoraGameListDialog.GuessType.ChallengeGuessing.OooO00o()) {
                long toUserId = ((Room.RoshamboModel) oooo000.f13189OooOOoo.get(i)).getToUserId();
                Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
                if (l2 == null || toUserId != l2.longValue()) {
                    return;
                }
            }
            Object obj = oooo000.f13189OooOOoo.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Room.RoshamboModel roshamboModel = (Room.RoshamboModel) obj;
            o0oo0000.OooO00o.OooO0O0("102123");
            RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
            roomUserInfoModel.getUserHeader().setValue(p184o00o00O0.OooO0OO.OooO0Oo(roshamboModel.getHeadphoto()));
            MutableStateFlow<String> userName = roomUserInfoModel.getUserName();
            String name = roshamboModel.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            userName.setValue(name);
            roomUserInfoModel.getUserId().setValue(Long.valueOf(roshamboModel.getUserId()));
            oOOO0OO0 oooo0oo0 = new oOOO0OO0(this$0.f27489OooO, false);
            long morauuid = roshamboModel.getMorauuid();
            int moragiftid = roshamboModel.getMoragiftid();
            String giftImage = roshamboModel.getGiftImage();
            Intrinsics.checkNotNullExpressionValue(giftImage, "getGiftImage(...)");
            oooo0oo0.OooOO0O(morauuid, moragiftid, giftImage, String.valueOf(roshamboModel.getMoranum()), roshamboModel.getGiftprice(), roomUserInfoModel, roshamboModel.getToUserId());
            oooo0oo0.OooO();
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaybackSuppressionReasonChanged(((o00O0OO) this.f34019OooO0Oo).f34117OooOOO0);
    }
}
