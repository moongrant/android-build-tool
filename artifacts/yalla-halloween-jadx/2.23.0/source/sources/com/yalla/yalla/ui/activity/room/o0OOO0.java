package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p406o0Oo0Ooo.oOO0O0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0 extends p564o0oOo0OO.o000O<VoteRankModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f26933OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0(VoteHistoryDetailActivity voteHistoryDetailActivity, int i) {
        super(voteHistoryDetailActivity, i);
        this.f26933OooOoo0 = voteHistoryDetailActivity;
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
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f26933OooOoo0;
        if (layoutPosition == 1) {
            voteHistoryDetailActivity.f26792OooOoOO = voteRankModel.getFCount() > 0;
        }
        int i = oO00O0oO.tvRanking;
        viewHolder.setGone(i, viewHolder.getLayoutPosition() > 3 || !voteHistoryDetailActivity.f26792OooOoOO);
        int i2 = oO00O0oO.ivRanking;
        int layoutPosition2 = viewHolder.getLayoutPosition();
        viewHolder.setGone(i2, (1 <= layoutPosition2 && layoutPosition2 < 4) && voteHistoryDetailActivity.f26792OooOoOO);
        NetImageView netImageView = (NetImageView) viewHolder.getView(oO00O0oO.ivUserHeader);
        Context context = this.f56196OooOo;
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(context);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43911OooO0OO = voteRankModel.getHeadImg();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        netImageView.setBordTrimSrc(true);
        netImageView.setBorderWidth(com.code.android.util.o0000O0.OooO00o(1));
        if (voteHistoryDetailActivity.f26792OooOoOO && viewHolder.getLayoutPosition() == 1) {
            netImageView.setBorderColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_FD4));
            ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.room_vote_game_rank_1);
        } else if (voteHistoryDetailActivity.f26792OooOoOO && viewHolder.getLayoutPosition() == 2) {
            netImageView.setBorderColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_ABE));
            ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.room_vote_game_rank_2);
        } else if (voteHistoryDetailActivity.f26792OooOoOO && viewHolder.getLayoutPosition() == 3) {
            netImageView.setBorderColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_EA7));
            ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.room_vote_game_rank_3);
        } else {
            netImageView.setBordTrimSrc(false);
            netImageView.setBorderWidth(0);
            netImageView.setBorderColor(0);
            viewHolder.setText(i, String.valueOf(viewHolder.getLayoutPosition()));
        }
        viewHolder.setText(oO00O0oO.tvUserName, oOO0O0O.OooO0O0(voteRankModel.getUserId(), voteRankModel.getNickName()));
        o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(context);
        oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0O0());
        oooO00o2.f43911OooO0OO = voteRankModel.getGiftImg();
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivGift));
        int i3 = oO00O0oO.tvGiftNum;
        boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
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
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f26933OooOoo0;
        if (voteHistoryDetailActivity.f26790OooOoO) {
            return voteHistoryDetailActivity.f26791OooOoO0;
        }
        int i = voteHistoryDetailActivity.f26791OooOoO0;
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
