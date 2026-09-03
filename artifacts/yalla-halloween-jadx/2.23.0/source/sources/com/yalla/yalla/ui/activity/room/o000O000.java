package com.yalla.yalla.ui.activity.room;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p406o0Oo0Ooo.oOO0O0O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.g9;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends p564o0oOo0OO.o000O<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f26844OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(MemberListRemoveActivity memberListRemoveActivity, int i) {
        super(memberListRemoveActivity, i);
        this.f26844OooOoo0 = memberListRemoveActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        final RoomUserInfoModel data = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "item");
        final MemberRemoveLayout memberRemoveLayout = (MemberRemoveLayout) helper.getView(oO00O0oO.member);
        MemberListRemoveActivity memberListRemoveActivity = this.f26844OooOoo0;
        memberRemoveLayout.setActivity(memberListRemoveActivity);
        g9 g9Var = memberRemoveLayout.f30498OooO0Oo;
        ImageView imageView = g9Var.f57985OooO0Oo;
        int i = oOo00OO0.room_ic_remove_member_select_gray;
        imageView.setImageResource(i);
        UserTagView userTagView = g9Var.f57986OooO0o;
        userTagView.OooO00o();
        ImageView imageView2 = g9Var.f57984OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.officials");
        com.code.android.util.o000OO00.OooO0O0(imageView2);
        TextView textView = g9Var.f57987OooO0o0;
        textView.setText("");
        final o000 o000Var = new o000(data, memberListRemoveActivity, memberRemoveLayout);
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isSelected().getValue().booleanValue()) {
            g9Var.f57985OooO0Oo.setImageResource(oOo00OO0.room_ic_remove_member_select_green);
        } else {
            g9Var.f57985OooO0Oo.setImageResource(i);
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(memberRemoveLayout.getContext());
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
        oooO00o.f43936OooOoo0 = 2;
        oooO00o.f43926OooOOoo = 3;
        oooO00o.f43911OooO0OO = data.getUserHeader().getValue();
        oooO00o.f43909OooO00o = 0;
        NetImageView netImageView = g9Var.f57983OooO0O0;
        oooO00o.OooO0Oo(netImageView);
        if (data.getRole().getValue().intValue() == 2) {
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.officials");
            com.code.android.util.o000OO00.OooOOOO(imageView2);
        }
        FragmentActivity fragmentActivity = memberRemoveLayout.activity;
        if (fragmentActivity != null) {
            userTagView.OooO0Oo(data.getVipLevel().getValue().intValue(), true, fragmentActivity);
        }
        userTagView.OooO0oo(data.getPremiumLevel().getValue().intValue(), data.isPremium().getValue().booleanValue());
        userTagView.setName(oOO0O0O.OooO0O0(data.getUserId().getValue().longValue(), data.getUserName().getValue()));
        userTagView.setSex(data.getSex().getValue().intValue());
        userTagView.setLevel(data.getUserLevel().getValue().intValue());
        textView.setText(p601o0oo0O0.o0000oo.OooO0oo(data.getLasttime().getValue().longValue()));
        g9Var.f57982OooO00o.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = MemberRemoveLayout.f30497OooO0o;
                Function0 function0 = o000Var;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        netImageView.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = MemberRemoveLayout.f30497OooO0o;
                MemberRemoveLayout this$0 = memberRemoveLayout;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RoomUserInfoModel item = data;
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f27240Oooo0o;
                Context context = this$0.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                UserInfoActivity.OooO00o.OooO0O0((Activity) context, String.valueOf(item.getUserId().getValue().longValue()), false, true, false, false);
            }
        });
    }
}
