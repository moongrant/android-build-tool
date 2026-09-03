package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OOO.v0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends p571o0oOoO0.o0000oo<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f26385OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(MemberListRemoveActivity memberListRemoveActivity, int i) {
        super(memberListRemoveActivity, i);
        this.f26385OooOoo0 = memberListRemoveActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomUserInfoModel data = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "item");
        MemberRemoveLayout memberRemoveLayout = (MemberRemoveLayout) helper.getView(p562o0oOo000.o0OO00O.member);
        MemberListRemoveActivity memberListRemoveActivity = this.f26385OooOoo0;
        memberRemoveLayout.setActivity(memberListRemoveActivity);
        v0 v0Var = memberRemoveLayout.f29953OooO0Oo;
        ImageView imageView = v0Var.f45614OooO0Oo;
        int i = p562o0oOo000.o0Oo0oo.room_ic_remove_member_select_gray;
        imageView.setImageResource(i);
        UserTagView userTagView = v0Var.f45615OooO0o;
        userTagView.OooO00o();
        ImageView officials = v0Var.f45613OooO0OO;
        Intrinsics.checkNotNullExpressionValue(officials, "officials");
        com.code.android.util.o000O.OooO0O0(officials);
        TextView textView = v0Var.f45616OooO0o0;
        textView.setText("");
        final o0000O o0000o2 = new o0000O(data, memberListRemoveActivity, memberRemoveLayout);
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isSelected().getValue().booleanValue()) {
            v0Var.f45614OooO0Oo.setImageResource(p562o0oOo000.o0Oo0oo.room_ic_remove_member_select_green);
        } else {
            v0Var.f45614OooO0Oo.setImageResource(i);
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(memberRemoveLayout.getContext());
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43151OooOoo0 = 2;
        oooO00o.f43141OooOOoo = 3;
        oooO00o.f43126OooO0OO = data.getUserHeader().getValue();
        oooO00o.f43124OooO00o = 0;
        NetImageView netImageView = v0Var.f45612OooO0O0;
        oooO00o.OooO0Oo(netImageView);
        if (data.getRole().getValue().intValue() == 2) {
            Intrinsics.checkNotNullExpressionValue(officials, "officials");
            com.code.android.util.o000O.OooOOOO(officials);
        }
        FragmentActivity fragmentActivity = memberRemoveLayout.activity;
        int i2 = 1;
        if (fragmentActivity != null) {
            userTagView.OooO0Oo(data.getVipLevel().getValue().intValue(), true, fragmentActivity);
        }
        userTagView.OooO0oo(data.getPremiumLevel().getValue().intValue(), data.isPremium().getValue().booleanValue());
        userTagView.setName(p412o0Oo0o0O.o000O000.OooO0O0(data.getUserId().getValue().longValue(), data.getUserName().getValue()));
        userTagView.setSex(data.getSex().getValue().intValue());
        userTagView.setLevel(data.getUserLevel().getValue().intValue());
        textView.setText(p606o0oo0O0o.o0O0O0o0.OooO0oo(data.getLasttime().getValue().longValue()));
        v0Var.f45611OooO00o.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = MemberRemoveLayout.f29952OooO0o;
                Function0 function0 = o0000o2;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        netImageView.setOnClickListener(new p492o0o00OO0.OooO(i2, memberRemoveLayout, data));
    }
}
