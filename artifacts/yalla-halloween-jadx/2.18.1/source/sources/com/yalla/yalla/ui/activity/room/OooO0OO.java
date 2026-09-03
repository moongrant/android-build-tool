package com.yalla.yalla.ui.activity.room;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.MemberConveneLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.oOO00O;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends p188o00o00o0.OooO0OO<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MemberListConveneActivity f22917OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(MemberListConveneActivity memberListConveneActivity) {
        super(memberListConveneActivity, R.layout.room_activity_member_convene_layout);
        this.f22917OooO00o = memberListConveneActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        final RoomUserInfoModel data = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "item");
        View viewOooO0Oo = helper.OooO0Oo(R.id.member);
        MemberListConveneActivity memberListConveneActivity = this.f22917OooO00o;
        final MemberConveneLayout memberConveneLayout = (MemberConveneLayout) viewOooO0Oo;
        memberConveneLayout.f24858Oooo0o.f50393OooO0o0.setImageResource(R.drawable.room_ic_remove_member_select_gray);
        memberConveneLayout.f24858Oooo0o.f50392OooO0o.setText("");
        final OooO0O0 oooO0O0 = new OooO0O0(data, memberListConveneActivity, memberConveneLayout);
        Intrinsics.checkNotNullParameter(data, "data");
        memberConveneLayout.OooO00o(data.getIsSelected());
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(memberConveneLayout.getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48454OooOoo0 = 2;
        oooO00o2.f48444OooOOoo = 3;
        oooO00o2.f48429OooO0OO = data.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(memberConveneLayout.f24858Oooo0o.f50389OooO0O0);
        ImageView imageView = memberConveneLayout.f24858Oooo0o.f50390OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.officials");
        oOO00O.OooO00o(imageView);
        if (data.getRole() == 2) {
            ImageView imageView2 = memberConveneLayout.f24858Oooo0o.f50390OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.officials");
            oOO00O.OooO(imageView2);
        }
        memberConveneLayout.f24858Oooo0o.f50394OooO0oO.setName(o00O0O.f42677OooO00o.OooO0O0(data.getUserId(), data.getUserName()));
        memberConveneLayout.f24858Oooo0o.f50394OooO0oO.setSex(data.getSex());
        memberConveneLayout.f24858Oooo0o.f50394OooO0oO.OooO0oO(data.isPremium(), data.getPremiumLevel());
        memberConveneLayout.f24858Oooo0o.f50394OooO0oO.setLevel(data.getUserLevel());
        memberConveneLayout.f24858Oooo0o.f50392OooO0o.setText(o00O0.f48624OooO00o.OooO(data.getLasttime()));
        int roomMemberType = data.getRoomMemberType();
        if (roomMemberType == 1) {
            memberConveneLayout.f24858Oooo0o.f50391OooO0Oo.setImageResource(R.drawable.icon_identity_red);
        } else if (roomMemberType == 2) {
            memberConveneLayout.f24858Oooo0o.f50391OooO0Oo.setImageResource(R.drawable.icon_identity_yellow);
        } else if (roomMemberType != 3) {
            memberConveneLayout.f24858Oooo0o.f50391OooO0Oo.setImageResource(R.drawable.icon_identity_gray);
        } else {
            memberConveneLayout.f24858Oooo0o.f50391OooO0Oo.setImageResource(R.drawable.icon_identity_green);
        }
        memberConveneLayout.f24858Oooo0o.f50388OooO00o.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.o00O0O0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function0 function0 = oooO0O0;
                int i = MemberConveneLayout.f24857Oooo0oO;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        memberConveneLayout.f24858Oooo0o.f50389OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.o00O0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberConveneLayout this$0 = memberConveneLayout;
                RoomUserInfoModel item = data;
                int i = MemberConveneLayout.f24857Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o3 = UserInfoActivity.f23452o0ooOO0;
                Context context = this$0.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                oooO00o3.OooO0OO((Activity) context, String.valueOf(item.getUserId()), false, true, false, false);
            }
        });
    }
}
