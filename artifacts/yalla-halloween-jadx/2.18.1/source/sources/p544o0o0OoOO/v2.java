package p544o0o0OoOO;

import android.widget.ImageView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.RoomBanEnterUser;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p522o0o0O0o.oo0oOO0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends OooO0OO<RoomBanEnterUser> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f44325OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(BanEnterRoomListActivity banEnterRoomListActivity) {
        super(banEnterRoomListActivity, R.layout.activity_ban_enter_room_list_item);
        this.f44325OooO00o = banEnterRoomListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        RoomBanEnterUser roomBanEnterUser = (RoomBanEnterUser) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (roomBanEnterUser == null) {
            return;
        }
        try {
            helper.OooO0oO(R.id.iv_cancel_ban_enter_room, this.f44325OooO00o.f22747OoooOoO);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f44325OooO00o);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o2.f48429OooO0OO = roomBanEnterUser.getUserHeader();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.nv_ban_user_header));
            UserTagView userTagView = (UserTagView) helper.OooO0Oo(R.id.banEnterItemUserTagView);
            userTagView.setName(roomBanEnterUser.getUserName());
            userTagView.setNameTextColor(R.color.color_87000000);
            userTagView.setSex(roomBanEnterUser.getSex());
            userTagView.OooO0oO(roomBanEnterUser.isPremium(), roomBanEnterUser.getPremiumLevel());
            userTagView.setKaVip(roomBanEnterUser.getVipLevel());
            if (roomBanEnterUser.getExRole() == 1) {
                helper.OooOO0(R.id.tv_ban_user_reason, o000O0O0.OooO0OO(R.string.executedByYou));
            } else if (roomBanEnterUser.getExRole() == 2) {
                helper.OooOO0(R.id.tv_ban_user_reason, OooOo.OooO00o(oo0oOO0.OooO0OO(R.string.executedByAdmin), roomBanEnterUser.getExNickName()));
            }
            helper.OooOOOO(R.id.ll_ban_enter, new t2(this.f44325OooO00o, roomBanEnterUser));
            helper.OooOOOO(R.id.iv_cancel_ban_enter_room, new u2(this.f44325OooO00o, roomBanEnterUser));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
