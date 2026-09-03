package p511o0o0O;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p368o0OOo0Oo.Oooo000;
import p403o0Oo0OO.OooO0OO;
import p412o0Oo0o0O.o000O000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends o0000oo<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f51032OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(Oooo000 oooo000, Context context, int i) {
        super(context, i);
        this.f51032OooOoo0 = oooo000;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomUserInfoModel item = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.getView(o0OO00O.vLine);
        Oooo000 oooo000 = this.f51032OooOoo0;
        view.setBackgroundColor(o0000.OooO00o(oooo000.f50940OooO0O0.f51043OooO0O0));
        view.setBackgroundColor(o0000.OooO00o(o0OOO0o.rec_color_00D8C9));
        if (helper.getLayoutPosition() < 0 || helper.getLayoutPosition() >= this.f13189OooOOoo.size()) {
            Intrinsics.checkNotNull(view);
            o000O.OooOOOO(view);
        } else {
            Intrinsics.checkNotNull(view);
            o000O.OooO0O0(view);
        }
        TextView textView = (TextView) helper.getView(o0OO00O.tv_user_select);
        NetImageView netImageView = (NetImageView) helper.getView(o0OO00O.nivHeader);
        textView.setTextColor(o0000.OooO00o(oooo000.f50940OooO0O0.f51047OooO0o0));
        if (Intrinsics.areEqual(item, Oooo000.f50938OooO0oO)) {
            textView.setText(o0000.OooO0OO(o000000.room_dialog_send_gift_all_in_mic));
            netImageView.setImageResource(item.getHeadPhotoResId().getValue().intValue());
            return;
        }
        textView.setText(o000O000.OooO0O0(item.getUserId().getValue().longValue(), item.getUserName().getValue()));
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = OooO0OO.OooO00o(item.getUserHeader().getValue());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0Oo(netImageView);
    }
}
