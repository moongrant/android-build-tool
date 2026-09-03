package p530o0o0OOOO;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.UserOfficialsView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.room.RoomMemberConveneSelectItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.d1;
import p412o0Oo0o0O.o000O000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends o0000oo<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53445OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(o0O00oO0 o0o00oo1, Context context, int i) {
        super(context, i);
        this.f53445OooOoo0 = o0o00oo1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        final RoomUserInfoModel data = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "item");
        final RoomMemberConveneSelectItemView roomMemberConveneSelectItemView = (RoomMemberConveneSelectItemView) helper.getView(o0OO00O.member);
        o0O00oO0 o0o00oo1 = this.f53445OooOoo0;
        roomMemberConveneSelectItemView.setConvening(o0o00oo1.f53410OooOo0O);
        d1 d1Var = roomMemberConveneSelectItemView.f30788OooO0Oo;
        ImageView imageView = d1Var.f43774OooO;
        int i = o0Oo0oo.room_ic_remove_member_select_gray;
        imageView.setImageResource(i);
        final o0O0O0O o0o0o0o = new o0O0O0O(roomMemberConveneSelectItemView, data, o0o00oo1);
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isSelected().getValue().booleanValue()) {
            d1Var.f43774OooO.setImageResource(o0Oo0oo.room_ic_remove_member_select_green);
        } else {
            d1Var.f43774OooO.setImageResource(i);
        }
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(roomMemberConveneSelectItemView.getContext());
        oooO00o.OooO00o(p642o0ooOOO0.d1.OooO00o());
        oooO00o.f43151OooOoo0 = 2;
        oooO00o.f43141OooOOoo = 3;
        oooO00o.f43126OooO0OO = data.getUserHeader().getValue();
        oooO00o.f43124OooO00o = 0;
        NetImageView netImageView = d1Var.f43777OooO0OO;
        oooO00o.OooO0Oo(netImageView);
        UserOfficialsView officials = d1Var.f43782OooO0oo;
        Intrinsics.checkNotNullExpressionValue(officials, "officials");
        int iIntValue = data.getRole().getValue().intValue();
        int i2 = UserOfficialsView.f30256OooO0Oo;
        officials.getClass();
        if (iIntValue == 2 || iIntValue == 4) {
            officials.setImageResource(o0Oo0oo.icon_userinfo_official);
            o000O.OooOOOO(officials);
        } else {
            officials.setImageDrawable(null);
            o000O.OooO0O0(officials);
        }
        d1Var.f43779OooO0o.setText(o000O000.OooO0O0(data.getUserId().getValue().longValue(), data.getUserName().getValue()));
        d1Var.f43778OooO0Oo.OooO0OO(data.getRoomMemberType().getValue().intValue(), false, false);
        d1Var.f43776OooO0O0.OooO00o(data.getMemberLevel().getValue(), data.getBadgeUrl().getValue(), data.isTopRank().getValue().booleanValue(), 9.0f);
        d1Var.f43781OooO0oO.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.number_of_callable_xxx), String.valueOf(data.getConveneNum().getValue().intValue())));
        ImageView inRoom = d1Var.f43780OooO0o0;
        Intrinsics.checkNotNullExpressionValue(inRoom, "inRoom");
        o000O.OooO0O0(inRoom);
        if (data.isInRoom().getValue().booleanValue()) {
            Intrinsics.checkNotNullExpressionValue(inRoom, "inRoom");
            o000O.OooOOOO(inRoom);
        }
        d1Var.f43775OooO00o.setOnClickListener(new View.OnClickListener() { // from class: o0oOoO.o0000Ooo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = RoomMemberConveneSelectItemView.f30787OooO0o;
                Function0 function0 = o0o0o0o;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        netImageView.setOnClickListener(new View.OnClickListener() { // from class: o0oOoO.o0000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = RoomMemberConveneSelectItemView.f30787OooO0o;
                RoomMemberConveneSelectItemView this$0 = roomMemberConveneSelectItemView;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RoomUserInfoModel item = data;
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f26775Oooo0o;
                Context context = this$0.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                UserInfoActivity.OooO00o.OooO0O0((Activity) context, String.valueOf(item.getUserId().getValue().longValue()), false, true, false, false);
            }
        });
        boolean z = roomMemberConveneSelectItemView.convening;
        ImageView select = d1Var.f43774OooO;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(select, "select");
            o000O.OooO0O0(select);
        } else {
            Intrinsics.checkNotNullExpressionValue(select, "select");
            o000O.OooOOOO(select);
            Intrinsics.checkNotNullExpressionValue(inRoom, "inRoom");
            o000O.OooO0O0(inRoom);
        }
    }
}
