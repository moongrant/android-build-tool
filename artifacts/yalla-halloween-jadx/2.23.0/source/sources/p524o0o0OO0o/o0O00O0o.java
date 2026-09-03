package p524o0o0OO0o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.UserOfficialsView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.room.RoomMemberConveneSelectItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p362o0OOo0O.OooOO0;
import p406o0Oo0Ooo.oOO0O0O;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.o9;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends o000O<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53496OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(o0O00 o0o01, Context context, int i) {
        super(context, i);
        this.f53496OooOoo0 = o0o01;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        final RoomUserInfoModel data = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "item");
        final RoomMemberConveneSelectItemView roomMemberConveneSelectItemView = (RoomMemberConveneSelectItemView) helper.getView(oO00O0oO.member);
        o0O00 o0o01 = this.f53496OooOoo0;
        roomMemberConveneSelectItemView.setConvening(o0o01.f53476OooOo0O);
        o9 o9Var = roomMemberConveneSelectItemView.f31329OooO0Oo;
        ImageView imageView = o9Var.f58537OooO;
        int i = oOo00OO0.room_ic_remove_member_select_gray;
        imageView.setImageResource(i);
        final o0OoO00O o0ooo00o2 = new o0OoO00O(roomMemberConveneSelectItemView, data, o0o01);
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isSelected().getValue().booleanValue()) {
            o9Var.f58537OooO.setImageResource(oOo00OO0.room_ic_remove_member_select_green);
        } else {
            o9Var.f58537OooO.setImageResource(i);
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(roomMemberConveneSelectItemView.getContext());
        oooO00o.OooO00o(OooO.OooO00o());
        oooO00o.f43936OooOoo0 = 2;
        oooO00o.f43926OooOOoo = 3;
        oooO00o.f43911OooO0OO = data.getUserHeader().getValue();
        oooO00o.f43909OooO00o = 0;
        NetImageView netImageView = o9Var.f58540OooO0OO;
        oooO00o.OooO0Oo(netImageView);
        UserOfficialsView userOfficialsView = o9Var.f58545OooO0oo;
        Intrinsics.checkNotNullExpressionValue(userOfficialsView, "binding.officials");
        int iIntValue = data.getRole().getValue().intValue();
        int i2 = UserOfficialsView.f30801OooO0Oo;
        userOfficialsView.getClass();
        if (iIntValue == 2 || iIntValue == 4) {
            userOfficialsView.setImageResource(oOo00OO0.icon_userinfo_official);
            o000OO00.OooOOOO(userOfficialsView);
        } else {
            userOfficialsView.setImageDrawable(null);
            o000OO00.OooO0O0(userOfficialsView);
        }
        o9Var.f58542OooO0o.setText(oOO0O0O.OooO0O0(data.getUserId().getValue().longValue(), data.getUserName().getValue()));
        o9Var.f58541OooO0Oo.OooO0OO(data.getRoomMemberType().getValue().intValue(), false, false);
        o9Var.f58539OooO0O0.OooO00o(data.getMemberLevel().getValue(), data.getBadgeUrl().getValue(), data.isTopRank().getValue().booleanValue(), 9.0f);
        o9Var.f58544OooO0oO.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.number_of_callable_xxx), data.getConveneNum().toString()));
        ImageView imageView2 = o9Var.f58543OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.inRoom");
        o000OO00.OooO0O0(imageView2);
        if (data.isInRoom().getValue().booleanValue()) {
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.inRoom");
            o000OO00.OooOOOO(imageView2);
        }
        o9Var.f58538OooO00o.setOnClickListener(new View.OnClickListener() { // from class: o0oOo.OooOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = RoomMemberConveneSelectItemView.f31328OooO0o;
                Function0 function0 = o0ooo00o2;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        netImageView.setOnClickListener(new View.OnClickListener() { // from class: o0oOo.Oooo000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = RoomMemberConveneSelectItemView.f31328OooO0o;
                RoomMemberConveneSelectItemView this$0 = roomMemberConveneSelectItemView;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RoomUserInfoModel item = data;
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f27240Oooo0o;
                Context context = this$0.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                UserInfoActivity.OooO00o.OooO0O0((Activity) context, String.valueOf(item.getUserId().getValue().longValue()), false, true, false, false);
            }
        });
        boolean z = roomMemberConveneSelectItemView.convening;
        ImageView imageView3 = o9Var.f58537OooO;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.select");
            o000OO00.OooO0O0(imageView3);
        } else {
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.select");
            o000OO00.OooOOOO(imageView3);
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.inRoom");
            o000OO00.OooO0O0(imageView2);
        }
    }
}
