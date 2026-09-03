package com.yalla.yalla.ui.activity.room;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.RoomBanEnterUser;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends p571o0oOoO0.o0000oo<RoomBanEnterUser> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26141OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(BanEnterRoomListActivity banEnterRoomListActivity, int i) {
        super(banEnterRoomListActivity, i);
        this.f26141OooOoo0 = banEnterRoomListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomBanEnterUser roomBanEnterUser = (RoomBanEnterUser) obj;
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26141OooOoo0;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (roomBanEnterUser == null) {
            return;
        }
        try {
            int i = p562o0oOo000.o0OO00O.iv_cancel_ban_enter_room;
            helper.setGone(i, banEnterRoomListActivity.f26014OooOOo);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(banEnterRoomListActivity);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = roomBanEnterUser.getUserHeader();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.nv_ban_user_header));
            UserTagView userTagView = (UserTagView) helper.getView(p562o0oOo000.o0OO00O.banEnterItemUserTagView);
            userTagView.setName(roomBanEnterUser.getUserName());
            userTagView.setNameTextColor(p562o0oOo000.o0OOO0o.color_87000000);
            userTagView.setSex(roomBanEnterUser.getSex());
            userTagView.OooO0oo(roomBanEnterUser.getPremiumLevel(), roomBanEnterUser.isPremium());
            userTagView.OooO0Oo(roomBanEnterUser.getVipLevel(), true, banEnterRoomListActivity);
            if (roomBanEnterUser.getExRole() == 1) {
                helper.setText(p562o0oOo000.o0OO00O.tv_ban_user_reason, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.executedByYou));
            } else if (roomBanEnterUser.getExRole() == 2) {
                helper.setText(p562o0oOo000.o0OO00O.tv_ban_user_reason, com.code.android.util.o0000O.OooO00o(p423o0OoO0OO.o000.OooO0OO(banEnterRoomListActivity, p562o0oOo000.o000000.executedByAdmin), roomBanEnterUser.getExNickName()));
            }
            helper.setViewOnClickListener(p562o0oOo000.o0OO00O.ll_ban_enter, new OooO00o(banEnterRoomListActivity, roomBanEnterUser));
            helper.setViewOnClickListener(i, new OooO0O0(banEnterRoomListActivity, roomBanEnterUser));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
