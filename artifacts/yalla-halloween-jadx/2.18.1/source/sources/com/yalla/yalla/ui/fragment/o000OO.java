package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserOfficialsView;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.RoomMemberConveneSelectItemView;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.oOO00O;
import p544o0o0OoOO.u3;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO extends p188o00o00o0.OooO0OO<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f24507OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(RoomMemberConveneListDialog roomMemberConveneListDialog, Context context) {
        super(context, R.layout.room_member_convene_item);
        this.f24507OooO00o = roomMemberConveneListDialog;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        final RoomUserInfoModel data = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "item");
        View viewOooO0Oo = helper.OooO0Oo(R.id.member);
        RoomMemberConveneListDialog roomMemberConveneListDialog = this.f24507OooO00o;
        final RoomMemberConveneSelectItemView roomMemberConveneSelectItemView = (RoomMemberConveneSelectItemView) viewOooO0Oo;
        roomMemberConveneSelectItemView.setConvening(roomMemberConveneListDialog.f24169OooooOO);
        roomMemberConveneSelectItemView.f25118Oooo0o.f51099OooO.setImageResource(R.drawable.room_ic_remove_member_select_gray);
        o0000O0O o0000o0o2 = new o0000O0O(roomMemberConveneSelectItemView, data, roomMemberConveneListDialog);
        Intrinsics.checkNotNullParameter(data, "data");
        roomMemberConveneSelectItemView.OooO00o(data.getIsSelected());
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(roomMemberConveneSelectItemView.getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        int i = 2;
        oooO00o2.f48454OooOoo0 = 2;
        oooO00o2.f48444OooOOoo = 3;
        oooO00o2.f48429OooO0OO = data.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(roomMemberConveneSelectItemView.f25118Oooo0o.f51102OooO0OO);
        UserOfficialsView userOfficialsView = roomMemberConveneSelectItemView.f25118Oooo0o.f51107OooO0oo;
        Intrinsics.checkNotNullExpressionValue(userOfficialsView, "binding.officials");
        int role = data.getRole();
        int i2 = UserOfficialsView.f21051Oooo;
        if (role == 2 || role == 4) {
            userOfficialsView.setImageResource(R.drawable.icon_userinfo_official);
            oOO00O.OooO(userOfficialsView);
        } else {
            userOfficialsView.setImageDrawable(null);
            oOO00O.OooO00o(userOfficialsView);
        }
        roomMemberConveneSelectItemView.f25118Oooo0o.f51104OooO0o.setText(p520o0o0O0O0.o00O0O.f42677OooO00o.OooO0O0(data.getUserId(), data.getUserName()));
        roomMemberConveneSelectItemView.f25118Oooo0o.f51103OooO0Oo.OooO0OO(data.getRoomMemberType(), false, false);
        roomMemberConveneSelectItemView.f25118Oooo0o.f51101OooO0O0.OooO00o(Integer.valueOf(data.getMemberLevel()), data.getBadgeUrl(), data.getIsTopRank(), 9.0f);
        roomMemberConveneSelectItemView.f25118Oooo0o.f51106OooO0oO.setText(p625o0oo0oo.o000O0O0.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.number_of_callable_xxx), String.valueOf(data.getConveneNum())));
        ImageView imageView = roomMemberConveneSelectItemView.f25118Oooo0o.f51105OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.inRoom");
        oOO00O.OooO00o(imageView);
        if (data.getInRoom() > 0) {
            ImageView imageView2 = roomMemberConveneSelectItemView.f25118Oooo0o.f51105OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.inRoom");
            oOO00O.OooO(imageView2);
        }
        roomMemberConveneSelectItemView.f25118Oooo0o.f51100OooO00o.setOnClickListener(new u3(o0000o0o2, i));
        roomMemberConveneSelectItemView.f25118Oooo0o.f51102OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.o0OO0oO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomMemberConveneSelectItemView this$0 = roomMemberConveneSelectItemView;
                RoomUserInfoModel item = data;
                int i3 = RoomMemberConveneSelectItemView.f25117Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o3 = UserInfoActivity.f23452o0ooOO0;
                Context context = this$0.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                oooO00o3.OooO0OO((Activity) context, String.valueOf(item.getUserId()), false, true, false, false);
            }
        });
        if (roomMemberConveneSelectItemView.convening) {
            ImageView imageView3 = roomMemberConveneSelectItemView.f25118Oooo0o.f51099OooO;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.select");
            oOO00O.OooO00o(imageView3);
        } else {
            ImageView imageView4 = roomMemberConveneSelectItemView.f25118Oooo0o.f51099OooO;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.select");
            oOO00O.OooO(imageView4);
            ImageView imageView5 = roomMemberConveneSelectItemView.f25118Oooo0o.f51105OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.inRoom");
            oOO00O.OooO00o(imageView5);
        }
    }
}
