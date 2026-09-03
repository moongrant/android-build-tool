package com.yalla.yalla.ui.activity.room;

import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import p406o0Oo0Ooo.oOO0O0O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends p564o0oOo0OO.o000O<VoteModel> {
    public o0OO0oO0(VoteHistoryActivity voteHistoryActivity, int i) {
        super(voteHistoryActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        VoteModel voteModel = (VoteModel) obj;
        if (viewHolder == null || voteModel == null) {
            return;
        }
        int i = oO00O0oO.tvHistoryTitle;
        char[] cArr = p483o0o000oo.o0OO00O.f47706OooO00o;
        viewHolder.setText(i, o0o000oo.o0OO00O.OooO00o.OooO00o(voteModel.getTitle()));
        String strOooO0O0 = oOO0O0O.OooO0O0(voteModel.getUserId(), voteModel.getNickName());
        viewHolder.setText(oO00O0oO.tvHistoryInitiator, com.code.android.util.o0000.OooO0OO(oO00OOo0.room_vote_game_history_initiator) + ZegoConstants.ZegoVideoDataAuxPublishingStream + strOooO0O0);
        viewHolder.setText(oO00O0oO.tvHistoryTime, p601o0oo0O0.o0000oo.OooO0Oo(voteModel.getCreateTime(), System.currentTimeMillis()));
    }
}
