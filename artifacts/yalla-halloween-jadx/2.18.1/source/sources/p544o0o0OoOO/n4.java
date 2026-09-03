package p544o0o0OoOO;

import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import p028Oooo0o0.o00O0O0O;
import p168o00Ooo0.oo000o;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class n4 extends OooO0OO<Room.BonusDetail> {
    public n4(LuckyPacketDetailActivity luckyPacketDetailActivity) {
        super(luckyPacketDetailActivity, R.layout.room_activity_lucky_packet_detail_item_layout);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        Room.BonusDetail item = (Room.BonusDetail) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getBestluck() == 1) {
            ((AppCompatTextView) helper.OooO0Oo(R.id.tvPacket)).setVisibility(0);
            ((AppCompatTextView) helper.OooO0Oo(R.id.tvPacket)).setTextColor(o000O0O0.OooO00o(R.color.color_FFC339));
            ((AppCompatTextView) helper.OooO0Oo(R.id.tvPacket)).setText(o000O0O0.OooO0OO(R.string.luckiest_draw));
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(item.getAvatarurl(), OooOo00.OooO00o(50), true);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.head));
        ((AppCompatTextView) helper.OooO0Oo(R.id.name)).setText(item.getUsername());
        helper.OooOO0(R.id.time, o00O0.f48624OooO00o.OooO0Oo(item.getGettimestamp(), System.currentTimeMillis()));
        if (item.getBonustype() != 2) {
            ((NetImageView) helper.OooO0Oo(R.id.pic)).setImageResource(R.drawable.room_dialog_lucky_golds_send_golds_size_12);
            ((AppCompatTextView) helper.OooO0Oo(R.id.number)).setText(String.valueOf(item.getBonusnum()));
            return;
        }
        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(getContext());
        oooO00o3.f48429OooO0OO = CloudImageUtilKt.imgFormat(item.getGiftimg());
        oooO00o3.f48427OooO00o = 0;
        oooO00o3.f48441OooOOOo = R.drawable.room_dialog_lucky_golds_send_gift_item_default;
        oooO00o3.OooO0o((ImageView) helper.OooO0Oo(R.id.pic));
        int iOooO0O0 = oo000o.OooO0O0();
        if (iOooO0O0 != 1 && iOooO0O0 != 8) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) helper.OooO0Oo(R.id.number);
            StringBuilder sbOooO00o = o00O0O0O.OooO00o('x');
            sbOooO00o.append(item.getBonusnum());
            appCompatTextView.setText(sbOooO00o.toString());
            return;
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) helper.OooO0Oo(R.id.number);
        StringBuilder sb = new StringBuilder();
        sb.append(item.getBonusnum());
        sb.append('x');
        appCompatTextView2.setText(sb.toString());
    }
}
