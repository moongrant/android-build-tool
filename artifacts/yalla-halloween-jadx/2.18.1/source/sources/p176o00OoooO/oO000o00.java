package p176o00OoooO;

import android.view.View;
import android.widget.ImageView;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.protobuf.room.Room;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class oO000o00 extends OooO0OO<Room.RoshamboModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameListDialog f32842OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(RoomMoraGameListDialog roomMoraGameListDialog, MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, (List) null);
        this.f32842OooO00o = roomMoraGameListDialog;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        Room.RoshamboModel roshamboModel = (Room.RoshamboModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (helper.getItemViewType() != RoomMoraGameListDialog.GuessType.ChallengeGuessing.getValue()) {
            RoomMoraGameListDialog roomMoraGameListDialog = this.f32842OooO00o;
            int i = RoomMoraGameListDialog.f12160OoooOo0;
            Objects.requireNonNull(roomMoraGameListDialog);
            if (roshamboModel != null) {
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(roomMoraGameListDialog.getContext());
                oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize$default(roshamboModel.getHeadphoto(), OooOo00.OooO00o(35), false, 2, null);
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.niv_header));
                helper.OooOO0(R.id.tv_name, roshamboModel.getName());
                oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(roomMoraGameListDialog.getContext());
                oooO00o3.f48429OooO0OO = roshamboModel.getGiftImage();
                oooO00o3.f48427OooO00o = 0;
                oooO00o3.OooO00o(o00OOO.OooO00o.OooO0Oo());
                oooO00o3.OooO0o((ImageView) helper.OooO0Oo(R.id.iv_mora_gift_icon));
                int moranum = roshamboModel.getMoranum() / 100;
                View viewOooO0Oo = helper.OooO0Oo(R.id.iv_hundred);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView(R.id.iv_hundred)");
                roomMoraGameListDialog.OooOOOO(moranum, (ImageView) viewOooO0Oo);
                int moranum2 = (roshamboModel.getMoranum() % 100) / 10;
                View viewOooO0Oo2 = helper.OooO0Oo(R.id.iv_ten);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo2, "helper.getView(R.id.iv_ten)");
                roomMoraGameListDialog.OooOOOO(moranum2, (ImageView) viewOooO0Oo2);
                int moranum3 = (roshamboModel.getMoranum() % 100) % 10;
                View viewOooO0Oo3 = helper.OooO0Oo(R.id.iv_one);
                Intrinsics.checkNotNullExpressionValue(viewOooO0Oo3, "helper.getView(R.id.iv_one)");
                roomMoraGameListDialog.OooOOOO(moranum3, (ImageView) viewOooO0Oo3);
                Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                long userId = roshamboModel.getUserId();
                if (value != null && value.longValue() == userId) {
                    helper.OooOO0o(R.id.iv_mora_pk, false);
                    return;
                } else {
                    helper.OooOO0o(R.id.iv_mora_pk, true);
                    return;
                }
            }
            return;
        }
        RoomMoraGameListDialog roomMoraGameListDialog2 = this.f32842OooO00o;
        int i2 = RoomMoraGameListDialog.f12160OoooOo0;
        Objects.requireNonNull(roomMoraGameListDialog2);
        if (roshamboModel != null) {
            oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(roomMoraGameListDialog2.getContext());
            float f = 30;
            oooO00o4.f48429OooO0OO = CloudImageUtilKt.imgSize$default(roshamboModel.getHeadphoto(), OooOo00.OooO00o(f), false, 2, null);
            oooO00o4.f48427OooO00o = 0;
            oooO00o4.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o4.OooO0o((ImageView) helper.OooO0Oo(R.id.niv_header));
            oO0O00.OooO00o oooO00o5 = new oO0O00.OooO00o(roomMoraGameListDialog2.getContext());
            oooO00o5.f48429OooO0OO = CloudImageUtilKt.imgSize$default(roshamboModel.getToHeadphoto(), OooOo00.OooO00o(f), false, 2, null);
            oooO00o5.f48427OooO00o = 0;
            oooO00o5.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o5.OooO0o((ImageView) helper.OooO0Oo(R.id.niv_header2));
            helper.OooOO0(R.id.tv_name, roshamboModel.getName());
            helper.OooOO0(R.id.tv_name2, roshamboModel.getToNickname());
            oO0O00.OooO00o oooO00o6 = new oO0O00.OooO00o(roomMoraGameListDialog2.getContext());
            oooO00o6.f48429OooO0OO = roshamboModel.getGiftImage();
            oooO00o6.f48427OooO00o = 0;
            oooO00o6.OooO00o(o00OOO.OooO00o.OooO0Oo());
            oooO00o6.OooO0o((ImageView) helper.OooO0Oo(R.id.iv_mora_gift_icon));
            int moranum4 = roshamboModel.getMoranum() / 100;
            View viewOooO0Oo4 = helper.OooO0Oo(R.id.iv_hundred);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo4, "helper.getView(R.id.iv_hundred)");
            roomMoraGameListDialog2.OooOOOO(moranum4, (ImageView) viewOooO0Oo4);
            int moranum5 = (roshamboModel.getMoranum() % 100) / 10;
            View viewOooO0Oo5 = helper.OooO0Oo(R.id.iv_ten);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo5, "helper.getView(R.id.iv_ten)");
            roomMoraGameListDialog2.OooOOOO(moranum5, (ImageView) viewOooO0Oo5);
            int moranum6 = (roshamboModel.getMoranum() % 100) % 10;
            View viewOooO0Oo6 = helper.OooO0Oo(R.id.iv_one);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo6, "helper.getView(R.id.iv_one)");
            roomMoraGameListDialog2.OooOOOO(moranum6, (ImageView) viewOooO0Oo6);
            Long value2 = OooOOO.f41216OooO00o.OooOo().getValue();
            long toUserId = roshamboModel.getToUserId();
            if (value2 != null && value2.longValue() == toUserId) {
                helper.OooOO0o(R.id.iv_mora_pk, true);
            } else {
                helper.OooOO0o(R.id.iv_mora_pk, false);
            }
        }
    }
}
