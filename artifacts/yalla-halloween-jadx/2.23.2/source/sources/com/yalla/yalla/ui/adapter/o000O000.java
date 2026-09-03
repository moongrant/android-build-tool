package com.yalla.yalla.ui.adapter;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.adapter.roomMemberManager.RoomMemberManagerTag;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O000 extends p571o0oOoO0.o0000oo<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function3<? super RoomUserInfoModel, ? super Integer, ? super RoomMemberManagerTag, Unit> f27057OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27058OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(@NotNull FragmentActivity context) {
        super(context, p562o0oOo000.oo0o0Oo.item_room_member_manager);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27058OooOoo0 = context;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomUserInfoModel item = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i = p562o0oOo000.o0OO00O.item_room_member_manager_setting_iv;
        helper.setGone(i, false);
        int i2 = p562o0oOo000.o0OO00O.item_room_member_manager_tag_iv;
        helper.setImageResource(i2, p562o0oOo000.o0Oo0oo.icon_identity_gray);
        int i3 = p562o0oOo000.o0OO00O.item_room_member_manager_setting_layout;
        helper.setGone(i3, false);
        String strOooO0O0 = p412o0Oo0o0O.o000O000.OooO0O0(item.getUserId().getValue().longValue(), item.getUserName().getValue());
        int i4 = p562o0oOo000.o0OO00O.userTagView;
        UserTagView userTagView = (UserTagView) helper.getView(i4);
        userTagView.setVisibility(0);
        userTagView.setName(strOooO0O0);
        userTagView.setSex(item.getSex().getValue().intValue());
        userTagView.setLevel(item.getUserLevel().getValue().intValue());
        int iIntValue = item.getVipLevel().getValue().intValue();
        FragmentActivity fragmentActivity = this.f27058OooOoo0;
        userTagView.OooO0Oo(iIntValue, true, fragmentActivity);
        userTagView.OooO0oo(item.getPremiumLevel().getValue().intValue(), item.isPremium().getValue().booleanValue());
        userTagView.OooOO0(item.getMemberLevel().getValue(), item.getBadgeUrl().getValue(), item.isTopRank().getValue().booleanValue(), 9.0f);
        Intrinsics.checkNotNull(userTagView);
        UserTagView.OooOO0o(userTagView, fragmentActivity, item.getWealthLevel().getValue(), item.getWealthBadgeWithBg().getValue(), 8);
        helper.setText(p562o0oOo000.o0OO00O.item_room_member_manager_time_tv, o0O0O0o0.OooO0oo(item.getLasttime().getValue().longValue()));
        int iIntValue2 = item.getRoomMemberType().getValue().intValue();
        if (iIntValue2 != 1) {
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            if (iIntValue2 == 2) {
                if (oooO00o.OooO00o().OooOOO()) {
                    helper.setGone(i, true);
                }
                helper.setImageResource(i, p562o0oOo000.o0Oo0oo.icon_member_manage_below);
                helper.setImageResource(i2, p562o0oOo000.o0Oo0oo.icon_identity_yellow);
            } else if (iIntValue2 == 3) {
                if (oooO00o.OooO00o().OooOOO()) {
                    helper.setGone(i, true);
                }
                helper.setImageResource(i, p562o0oOo000.o0Oo0oo.icon_member_manage_below);
                helper.setImageResource(i2, p562o0oOo000.o0Oo0oo.icon_identity_green);
            }
        } else {
            helper.setImageDrawable(i, null);
            helper.setImageResource(i2, p562o0oOo000.o0Oo0oo.icon_identity_red);
        }
        helper.setGone(p562o0oOo000.o0OO00O.item_room_member_manager_iv_officials, item.getRole().getValue().intValue() == 2);
        if (item.isSetting().getValue().booleanValue()) {
            helper.setGone(i3, true);
            helper.setImageResource(i, p562o0oOo000.o0Oo0oo.icon_member_manage_top);
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
        oooO00o2.OooO00o(d1.OooO00o());
        oooO00o2.f43126OooO0OO = item.getUserHeader().getValue();
        oooO00o2.f43124OooO00o = 0;
        int i5 = p562o0oOo000.o0OO00O.item_room_member_manager_head_iv;
        oooO00o2.OooO0Oo((ImageView) helper.getView(i5));
        helper.setViewOnClickListener(i5, new o0000O00(this, item, helper));
        helper.setViewOnClickListener(i4, new o0000oo(this, item, helper));
        helper.setViewOnClickListener(p562o0oOo000.o0OO00O.item_room_member_manager_info_layout, new o0000O0(this, item, helper));
        helper.setViewOnClickListener(i2, new o0000O0O(this, item, helper));
        helper.setViewOnClickListener(i, new o000OO(this, item, helper));
        helper.setViewOnClickListener(p562o0oOo000.o0OO00O.item_room_member_manager_del_iv, new o0000O(this, item, helper));
        helper.setViewOnClickListener(p562o0oOo000.o0OO00O.item_room_member_manager_manager_iv, new o0000OO0(this, item, helper));
        helper.setViewOnClickListener(p562o0oOo000.o0OO00O.item_room_member_manager_member_iv, new o000(this, item, helper));
    }
}
