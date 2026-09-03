package com.yalla.yalla.ui.activity.room;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.RoomBanEnterUser;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends p564o0oOo0OO.o000O<RoomBanEnterUser> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26594OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(BanEnterRoomListActivity banEnterRoomListActivity, int i) {
        super(banEnterRoomListActivity, i);
        this.f26594OooOoo0 = banEnterRoomListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomBanEnterUser roomBanEnterUser = (RoomBanEnterUser) obj;
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26594OooOoo0;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (roomBanEnterUser == null) {
            return;
        }
        try {
            int i = oO00O0oO.iv_cancel_ban_enter_room;
            helper.setGone(i, banEnterRoomListActivity.f26466OooOOo);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(banEnterRoomListActivity);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = roomBanEnterUser.getUserHeader();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.nv_ban_user_header));
            UserTagView userTagView = (UserTagView) helper.getView(oO00O0oO.banEnterItemUserTagView);
            userTagView.setName(roomBanEnterUser.getUserName());
            userTagView.setNameTextColor(oO00O0o.color_87000000);
            userTagView.setSex(roomBanEnterUser.getSex());
            userTagView.OooO0oo(roomBanEnterUser.getPremiumLevel(), roomBanEnterUser.isPremium());
            userTagView.OooO0Oo(roomBanEnterUser.getVipLevel(), true, banEnterRoomListActivity);
            if (roomBanEnterUser.getExRole() == 1) {
                helper.setText(oO00O0oO.tv_ban_user_reason, com.code.android.util.o0000.OooO0OO(oO00OOo0.executedByYou));
            } else if (roomBanEnterUser.getExRole() == 2) {
                helper.setText(oO00O0oO.tv_ban_user_reason, com.code.android.util.o0000O.OooO00o(p417o0OoO0.o00oO0o.OooO0OO(banEnterRoomListActivity, oO00OOo0.executedByAdmin), roomBanEnterUser.getExNickName()));
            }
            helper.setViewOnClickListener(oO00O0oO.ll_ban_enter, new OooO0O0(banEnterRoomListActivity, roomBanEnterUser));
            helper.setViewOnClickListener(i, new OooO0OO(banEnterRoomListActivity, roomBanEnterUser));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
