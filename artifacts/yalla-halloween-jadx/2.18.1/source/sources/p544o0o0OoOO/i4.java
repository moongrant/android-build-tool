package p544o0o0OoOO;

import android.widget.ImageView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.model.RoomKickUser;
import com.yalla.yalla.ui.activity.room.KickRecordActivity;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class i4 extends OooO0OO<RoomKickUser> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ KickRecordActivity f44249OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(KickRecordActivity kickRecordActivity) {
        super(kickRecordActivity, R.layout.room_item_kick_record);
        this.f44249OooO00o = kickRecordActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        RoomKickUser roomKickUser = (RoomKickUser) obj;
        if (oooO0o == null || roomKickUser == null) {
            return;
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f44249OooO00o);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48429OooO0OO = roomKickUser.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivUserHeader));
        UserTagView userTagView = (UserTagView) oooO0o.OooO0Oo(R.id.kickItemUserTagView);
        userTagView.OooO0oO(roomKickUser.isPremium(), roomKickUser.getPremiumLevel());
        userTagView.setName(roomKickUser.getUserName());
        userTagView.setSex(roomKickUser.getSex());
        userTagView.setKaVip(roomKickUser.getVipLevel());
        oooO0o.OooOO0(R.id.tvTips, roomKickUser.getExRole() == 1 ? o000O0O0.OooO0OO(R.string.room_kicked_by_you_self) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_kicked_by_admin), roomKickUser.getExNickName()));
        oooO0o.OooO0oO(R.id.tvForBid, roomKickUser.isForbid() == 1);
        oooO0o.OooOO0(R.id.tvTime, o00O0.f48624OooO00o.OooO0Oo(roomKickUser.getExTime(), System.currentTimeMillis()));
        oooO0o.OooO0O0(R.id.clKickRecord);
    }
}
