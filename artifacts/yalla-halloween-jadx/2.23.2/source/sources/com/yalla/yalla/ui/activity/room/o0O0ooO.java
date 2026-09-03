package com.yalla.yalla.ui.activity.room;

import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.MoraHistoryModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends p571o0oOoO0.o0000oo<MoraHistoryModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameHistoryActivity f26470OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(RoomMoraGameHistoryActivity roomMoraGameHistoryActivity, int i) {
        super(roomMoraGameHistoryActivity, i);
        this.f26470OooOoo0 = roomMoraGameHistoryActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MoraHistoryModel moraHistoryModel = (MoraHistoryModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        try {
            TextView textView = (TextView) helper.getView(p562o0oOo000.o0OO00O.tv_mora_history_title);
            Integer numValueOf = moraHistoryModel != null ? Integer.valueOf(moraHistoryModel.getUserType()) : null;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                textView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.you_state_a_mora));
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                textView.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.others_join_my_mora), moraHistoryModel.getOtherNickName()));
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                textView.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.you_join_a_mora), moraHistoryModel.getOtherNickName()));
            } else if (numValueOf != null && numValueOf.intValue() == 4) {
                textView.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_others_join_my_mora_challenge), moraHistoryModel.getOtherNickName()));
            } else if (numValueOf != null && numValueOf.intValue() == 5) {
                textView.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_you_join_a_mora_challenge), moraHistoryModel.getOtherNickName()));
            }
            helper.setText(p562o0oOo000.o0OO00O.tv_mora_history_time, p606o0oo0O0o.o0O0O0o0.OooO0Oo(p605o0oo0O0O.o0O0O0Oo.OooOO0o(moraHistoryModel != null ? moraHistoryModel.getCreateTime() : null), System.currentTimeMillis()));
            TextView textView2 = (TextView) helper.getView(p562o0oOo000.o0OO00O.tv_mora_history_label);
            Integer numValueOf2 = moraHistoryModel != null ? Integer.valueOf(moraHistoryModel.getFinalResult()) : null;
            if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                textView2.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.mora_waiting));
            } else if (numValueOf2 != null && numValueOf2.intValue() == 5) {
                textView2.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_FF5B48));
            } else if (numValueOf2 != null && numValueOf2.intValue() == 3) {
                textView2.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.theme_00c5b8));
            } else {
                textView2.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_999999));
            }
            Integer numValueOf3 = moraHistoryModel != null ? Integer.valueOf(moraHistoryModel.getFinalResult()) : null;
            RoomMoraGameHistoryActivity roomMoraGameHistoryActivity = this.f26470OooOoo0;
            if (numValueOf3 == null) {
                textView2.setText((CharSequence) roomMoraGameHistoryActivity.f26168OooOo0O.get(0));
            } else {
                textView2.setText((CharSequence) roomMoraGameHistoryActivity.f26168OooOo0O.get(moraHistoryModel.getFinalResult() - 1));
            }
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.f43126OooO0OO = moraHistoryModel != null ? moraHistoryModel.getImageUrl() : null;
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43138OooOOOo = p562o0oOo000.o0Oo0oo.icon_head_default;
            oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.iv_mora_history_gift));
            int i = p562o0oOo000.o0OO00O.tv_mora_history_gift_num;
            String[] strArr = new String[2];
            strArr[0] = "×";
            strArr[1] = String.valueOf(moraHistoryModel != null ? moraHistoryModel.getGiftNum() : 0);
            helper.setText(i, p605o0oo0O0O.o0O0O0Oo.OooO0oO(strArr));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
