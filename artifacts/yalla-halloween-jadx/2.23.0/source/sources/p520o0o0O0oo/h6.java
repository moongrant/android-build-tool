package p520o0o0O0oo;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p362o0OOo0O.OooOO0;
import p396o0Oo0O.OooOOO;
import p406o0Oo0Ooo.oOO0O0O;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class h6 extends o000O<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ d6 f53287OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(d6 d6Var, Context context, int i) {
        super(context, i);
        this.f53287OooOoo0 = d6Var;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomUserInfoModel item = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View convert$lambda$0 = helper.getView(oO00O0oO.vLine);
        d6 d6Var = this.f53287OooOoo0;
        convert$lambda$0.setBackgroundColor(o0000.OooO00o(d6Var.f53268OooO0O0.f53294OooO0O0));
        convert$lambda$0.setBackgroundColor(o0000.OooO00o(oO00O0o.rec_color_00D8C9));
        if (helper.getLayoutPosition() < 0 || helper.getLayoutPosition() >= this.f10111OooOOoo.size()) {
            Intrinsics.checkNotNullExpressionValue(convert$lambda$0, "convert$lambda$0");
            o000OO00.OooOOOO(convert$lambda$0);
        } else {
            Intrinsics.checkNotNullExpressionValue(convert$lambda$0, "convert$lambda$0");
            o000OO00.OooO0O0(convert$lambda$0);
        }
        TextView textView = (TextView) helper.getView(oO00O0oO.tv_user_select);
        NetImageView netImageView = (NetImageView) helper.getView(oO00O0oO.nivHeader);
        textView.setTextColor(o0000.OooO00o(d6Var.f53268OooO0O0.f53298OooO0o0));
        if (Intrinsics.areEqual(item, d6.f53266OooO0oO)) {
            textView.setText(o0000.OooO0OO(oO00OOo0.room_dialog_send_gift_all_in_mic));
            netImageView.setImageResource(item.getHeadPhotoResId().getValue().intValue());
            return;
        }
        textView.setText(oOO0O0O.OooO0O0(item.getUserId().getValue().longValue(), item.getUserName().getValue()));
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = OooOOO.OooO00o(item.getUserHeader().getValue());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.OooO0Oo(netImageView);
    }
}
