package com.yalla.yalla.ui.activity.room;

import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends p571o0oOoO0.o0000oo<VoteModel> {
    public o0OO000(VoteHistoryActivity voteHistoryActivity, int i) {
        super(voteHistoryActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        VoteModel voteModel = (VoteModel) obj;
        if (viewHolder == null || voteModel == null) {
            return;
        }
        int i = p562o0oOo000.o0OO00O.tvHistoryTitle;
        char[] cArr = p490o0o00O0O.o0ooOOo.f48928OooO00o;
        viewHolder.setText(i, o0o00O0O.o0ooOOo.OooO00o.OooO00o(voteModel.getTitle()));
        String strOooO0O0 = p412o0Oo0o0O.o000O000.OooO0O0(voteModel.getUserId(), voteModel.getNickName());
        viewHolder.setText(p562o0oOo000.o0OO00O.tvHistoryInitiator, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_vote_game_history_initiator) + ZegoConstants.ZegoVideoDataAuxPublishingStream + strOooO0O0);
        viewHolder.setText(p562o0oOo000.o0OO00O.tvHistoryTime, p606o0oo0O0o.o0O0O0o0.OooO0Oo(voteModel.getCreateTime(), System.currentTimeMillis()));
    }
}
