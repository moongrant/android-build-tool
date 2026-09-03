package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO extends p571o0oOoO0.o0000oo<VoteRankModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f26502OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0ooO(VoteHistoryDetailActivity voteHistoryDetailActivity, int i) {
        super(voteHistoryDetailActivity, i);
        this.f26502OooOoo0 = voteHistoryDetailActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        StringBuilder sb;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        VoteRankModel voteRankModel = (VoteRankModel) obj;
        if (viewHolder == null || voteRankModel == null) {
            return;
        }
        int layoutPosition = viewHolder.getLayoutPosition();
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f26502OooOoo0;
        if (layoutPosition == 1) {
            voteHistoryDetailActivity.f26338OooOoOO = voteRankModel.getFCount() > 0;
        }
        int i = p562o0oOo000.o0OO00O.tvRanking;
        viewHolder.setGone(i, viewHolder.getLayoutPosition() > 3 || !voteHistoryDetailActivity.f26338OooOoOO);
        int i2 = p562o0oOo000.o0OO00O.ivRanking;
        int layoutPosition2 = viewHolder.getLayoutPosition();
        viewHolder.setGone(i2, (1 <= layoutPosition2 && layoutPosition2 < 4) && voteHistoryDetailActivity.f26338OooOoOO);
        NetImageView netImageView = (NetImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivUserHeader);
        Context context = this.f56423OooOo;
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(context);
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = voteRankModel.getHeadImg();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        netImageView.setBordTrimSrc(true);
        netImageView.setBorderWidth(com.code.android.util.o0000O0.OooO00o(1));
        if (voteHistoryDetailActivity.f26338OooOoOO && viewHolder.getLayoutPosition() == 1) {
            netImageView.setBorderColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_FD4));
            ((ImageView) viewHolder.getView(i2)).setImageResource(p562o0oOo000.o0Oo0oo.room_vote_game_rank_1);
        } else if (voteHistoryDetailActivity.f26338OooOoOO && viewHolder.getLayoutPosition() == 2) {
            netImageView.setBorderColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_ABE));
            ((ImageView) viewHolder.getView(i2)).setImageResource(p562o0oOo000.o0Oo0oo.room_vote_game_rank_2);
        } else if (voteHistoryDetailActivity.f26338OooOoOO && viewHolder.getLayoutPosition() == 3) {
            netImageView.setBorderColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_EA7));
            ((ImageView) viewHolder.getView(i2)).setImageResource(p562o0oOo000.o0Oo0oo.room_vote_game_rank_3);
        } else {
            netImageView.setBordTrimSrc(false);
            netImageView.setBorderWidth(0);
            netImageView.setBorderColor(0);
            viewHolder.setText(i, String.valueOf(viewHolder.getLayoutPosition()));
        }
        viewHolder.setText(p562o0oOo000.o0OO00O.tvUserName, p412o0Oo0o0O.o000O000.OooO0O0(voteRankModel.getUserId(), voteRankModel.getNickName()));
        o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(context);
        oooO00o2.OooO00o(d1.OooO0O0());
        oooO00o2.f43126OooO0OO = voteRankModel.getGiftImg();
        oooO00o2.f43124OooO00o = 0;
        oooO00o2.OooO0Oo((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivGift));
        int i3 = p562o0oOo000.o0OO00O.tvGiftNum;
        boolean zOooO0o0 = p595o0oo00O.OooOo00.OooO0o0();
        int fCount = voteRankModel.getFCount();
        if (zOooO0o0) {
            sb = new StringBuilder();
            sb.append(fCount);
            sb.append("x");
        } else {
            sb = new StringBuilder("x");
            sb.append(fCount);
        }
        viewHolder.setText(i3, sb.toString());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f26502OooOoo0;
        if (voteHistoryDetailActivity.f26336OooOoO) {
            return voteHistoryDetailActivity.f26337OooOoO0;
        }
        int i = voteHistoryDetailActivity.f26337OooOoO0;
        boolean z = false;
        if (i >= 0 && i < 4) {
            z = true;
        }
        if (z) {
            return i;
        }
        return 3;
    }
}
