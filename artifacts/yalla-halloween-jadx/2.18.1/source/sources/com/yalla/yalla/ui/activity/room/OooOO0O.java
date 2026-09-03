package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o00000OO;
import p175o00OooOo.o0OO0o00;
import p254o00ooO0O.oOO00O;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends p188o00o00o0.OooO0OO<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f22922OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(MemberListRemoveActivity memberListRemoveActivity) {
        super(memberListRemoveActivity, R.layout.room_activity_member_remove_layout);
        this.f22922OooO00o = memberListRemoveActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        RoomUserInfoModel data = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "item");
        View viewOooO0Oo = helper.OooO0Oo(R.id.member);
        MemberListRemoveActivity memberListRemoveActivity = this.f22922OooO00o;
        MemberRemoveLayout memberRemoveLayout = (MemberRemoveLayout) viewOooO0Oo;
        memberRemoveLayout.f24860Oooo0o.f50488OooO0Oo.setImageResource(R.drawable.room_ic_remove_member_select_gray);
        memberRemoveLayout.f24860Oooo0o.f50489OooO0o.OooO00o();
        ImageView imageView = memberRemoveLayout.f24860Oooo0o.f50487OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.officials");
        oOO00O.OooO00o(imageView);
        memberRemoveLayout.f24860Oooo0o.f50490OooO0o0.setText("");
        OooOO0 oooOO1 = new OooOO0(data, memberListRemoveActivity, memberRemoveLayout);
        Intrinsics.checkNotNullParameter(data, "data");
        memberRemoveLayout.OooO00o(data.getIsSelected());
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(memberRemoveLayout.getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48454OooOoo0 = 2;
        oooO00o2.f48444OooOOoo = 3;
        oooO00o2.f48429OooO0OO = data.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(memberRemoveLayout.f24860Oooo0o.f50486OooO0O0);
        if (data.getRole() == 2) {
            ImageView imageView2 = memberRemoveLayout.f24860Oooo0o.f50487OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.officials");
            oOO00O.OooO(imageView2);
        }
        memberRemoveLayout.f24860Oooo0o.f50489OooO0o.OooO0oO(data.isPremium(), data.getPremiumLevel());
        memberRemoveLayout.f24860Oooo0o.f50489OooO0o.setName(o00O0O.f42677OooO00o.OooO0O0(data.getUserId(), data.getUserName()));
        memberRemoveLayout.f24860Oooo0o.f50489OooO0o.setSex(data.getSex());
        memberRemoveLayout.f24860Oooo0o.f50489OooO0o.setLevel(data.getUserLevel());
        memberRemoveLayout.f24860Oooo0o.f50490OooO0o0.setText(o00O0.f48624OooO00o.OooO(data.getLasttime()));
        memberRemoveLayout.f24860Oooo0o.f50485OooO00o.setOnClickListener(new o0OO0o00(oooOO1, 1));
        memberRemoveLayout.f24860Oooo0o.f50486OooO0O0.setOnClickListener(new o00000OO(memberRemoveLayout, data, 1));
    }
}
