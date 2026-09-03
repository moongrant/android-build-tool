package p563o0oOo0;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.adapter.roomMemberManager.RoomMemberManagerTag;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p520o0o0O0O0.o00O0O;
import p530o0o0OOO.o00OO00O;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000OO00 extends OooO0OO<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Function3<? super RoomUserInfoModel, ? super Integer, ? super RoomMemberManagerTag, Unit> f45052OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(@NotNull FragmentActivity context) {
        super(context, R.layout.item_room_member_manager);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        RoomUserInfoModel item = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.OooO0oO(R.id.item_room_member_manager_setting_iv, false);
        helper.OooO0oo(R.id.item_room_member_manager_tag_iv, R.drawable.icon_identity_gray);
        helper.OooO0oO(R.id.item_room_member_manager_setting_layout, false);
        String strOooO0O0 = o00O0O.f42677OooO00o.OooO0O0(item.getUserId(), item.getUserName());
        UserTagView userTagView = (UserTagView) helper.OooO0Oo(R.id.userTagView);
        userTagView.setVisibility(0);
        userTagView.setName(strOooO0O0);
        userTagView.setSex(item.getSex());
        userTagView.setLevel(item.getUserLevel());
        userTagView.setKaVip(item.getVipLevel());
        userTagView.OooO0oO(item.isPremium(), item.getPremiumLevel());
        userTagView.OooO(Integer.valueOf(item.getMemberLevel()), item.getBadgeUrl(), item.getIsTopRank(), 9.0f);
        helper.OooOO0(R.id.item_room_member_manager_time_tv, o00O0.f48624OooO00o.OooO(item.getLasttime()));
        int roomMemberType = item.getRoomMemberType();
        if (roomMemberType == 1) {
            ((ImageView) helper.OooO0Oo(R.id.item_room_member_manager_setting_iv)).setImageDrawable(null);
            helper.OooO0oo(R.id.item_room_member_manager_tag_iv, R.drawable.icon_identity_red);
        } else if (roomMemberType == 2) {
            if (o00OO00O.f43313OooooOo.OooO00o().OooOOo0()) {
                helper.OooO0oO(R.id.item_room_member_manager_setting_iv, true);
            }
            helper.OooO0oo(R.id.item_room_member_manager_setting_iv, R.drawable.icon_member_manage_below);
            helper.OooO0oo(R.id.item_room_member_manager_tag_iv, R.drawable.icon_identity_yellow);
        } else if (roomMemberType == 3) {
            if (o00OO00O.f43313OooooOo.OooO00o().OooOOo0()) {
                helper.OooO0oO(R.id.item_room_member_manager_setting_iv, true);
            }
            helper.OooO0oo(R.id.item_room_member_manager_setting_iv, R.drawable.icon_member_manage_below);
            helper.OooO0oo(R.id.item_room_member_manager_tag_iv, R.drawable.icon_identity_green);
        }
        helper.OooO0oO(R.id.item_room_member_manager_iv_officials, item.getRole() == 2);
        if (item.getIsSetting()) {
            helper.OooO0oO(R.id.item_room_member_manager_setting_layout, true);
            helper.OooO0oo(R.id.item_room_member_manager_setting_iv, R.drawable.icon_member_manage_top);
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48429OooO0OO = item.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.item_room_member_manager_head_iv));
        helper.OooOOOO(R.id.item_room_member_manager_head_iv, new o000Oo0(this, item, helper));
        helper.OooOOOO(R.id.userTagView, new o000O00(this, item, helper));
        helper.OooOOOO(R.id.item_room_member_manager_info_layout, new o000O00O(this, item, helper));
        helper.OooOOOO(R.id.item_room_member_manager_tag_iv, new o000O0(this, item, helper));
        helper.OooOOOO(R.id.item_room_member_manager_setting_iv, new o000O0Oo(this, item, helper));
        helper.OooOOOO(R.id.item_room_member_manager_del_iv, new o000OO0O(this, item, helper));
        helper.OooOOOO(R.id.item_room_member_manager_manager_iv, new o000O0O0(this, item, helper));
        helper.OooOOOO(R.id.item_room_member_manager_member_iv, new o000O(this, item, helper));
    }
}
