package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends p571o0oOoO0.o0000oo<Room.BonusDetail> {
    public o0000O0(LuckyPacketDetailActivity luckyPacketDetailActivity, int i) {
        super(luckyPacketDetailActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        Room.BonusDetail item = (Room.BonusDetail) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getBestluck() == 1) {
            int i = p562o0oOo000.o0OO00O.tvPacket;
            ((AppCompatTextView) helper.getView(i)).setVisibility(0);
            ((AppCompatTextView) helper.getView(i)).setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_FFC339));
            ((AppCompatTextView) helper.getView(i)).setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.luckiest_draw));
        }
        Context context = this.f56423OooOo;
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(context);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(item.getAvatarurl());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.head));
        ((AppCompatTextView) helper.getView(p562o0oOo000.o0OO00O.name)).setText(item.getUsername());
        helper.setText(p562o0oOo000.o0OO00O.time, p606o0oo0O0o.o0O0O0o0.OooO0Oo(item.getGettimestamp(), System.currentTimeMillis()));
        if (item.getBonustype() != 2) {
            ((NetImageView) helper.getView(p562o0oOo000.o0OO00O.pic)).setImageResource(p562o0oOo000.o0Oo0oo.room_dialog_lucky_golds_send_golds_size_12);
            ((AppCompatTextView) helper.getView(p562o0oOo000.o0OO00O.number)).setText(String.valueOf(item.getBonusnum()));
            return;
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(context);
        oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(item.getGiftimg());
        oooO00o2.f43124OooO00o = 0;
        oooO00o2.f43138OooOOOo = p562o0oOo000.o0Oo0oo.room_dialog_lucky_golds_send_gift_item_default;
        oooO00o2.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.pic));
        int iOooO0OO = p595o0oo00O.OooOo00.OooO0OO();
        if (iOooO0OO != 1 && iOooO0OO != 8) {
            ((AppCompatTextView) helper.getView(p562o0oOo000.o0OO00O.number)).setText("x" + item.getBonusnum());
            return;
        }
        ((AppCompatTextView) helper.getView(p562o0oOo000.o0OO00O.number)).setText(item.getBonusnum() + "x");
    }
}
