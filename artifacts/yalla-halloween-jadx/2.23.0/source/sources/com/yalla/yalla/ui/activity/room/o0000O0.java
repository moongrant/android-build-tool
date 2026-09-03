package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends p564o0oOo0OO.o000O<Room.BonusDetail> {
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
            int i = oO00O0oO.tvPacket;
            ((AppCompatTextView) helper.getView(i)).setVisibility(0);
            ((AppCompatTextView) helper.getView(i)).setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_FFC339));
            ((AppCompatTextView) helper.getView(i)).setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.luckiest_draw));
        }
        Context context = this.f56196OooOo;
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(context);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
        oooO00o.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(item.getAvatarurl());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.head));
        ((AppCompatTextView) helper.getView(oO00O0oO.name)).setText(item.getUsername());
        helper.setText(oO00O0oO.time, p601o0oo0O0.o0000oo.OooO0Oo(item.getGettimestamp(), System.currentTimeMillis()));
        if (item.getBonustype() != 2) {
            ((NetImageView) helper.getView(oO00O0oO.pic)).setImageResource(oOo00OO0.room_dialog_lucky_golds_send_golds_size_12);
            ((AppCompatTextView) helper.getView(oO00O0oO.number)).setText(String.valueOf(item.getBonusnum()));
            return;
        }
        o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(context);
        oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(item.getGiftimg());
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.f43923OooOOOo = oOo00OO0.room_dialog_lucky_golds_send_gift_item_default;
        oooO00o2.OooO0Oo((ImageView) helper.getView(oO00O0oO.pic));
        int iOooO0OO = p591o0oo000O.OooO.OooO0OO();
        if (iOooO0OO != 1 && iOooO0OO != 8) {
            ((AppCompatTextView) helper.getView(oO00O0oO.number)).setText("x" + item.getBonusnum());
            return;
        }
        ((AppCompatTextView) helper.getView(oO00O0oO.number)).setText(item.getBonusnum() + "x");
    }
}
