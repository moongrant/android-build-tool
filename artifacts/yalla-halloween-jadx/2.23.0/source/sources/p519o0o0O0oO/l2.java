package p519o0o0O0oO;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p362o0OOo0O.OooOO0;
import p406o0Oo0Ooo.oOO0O0O;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class l2 extends o000O<VoteRankModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f52417OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(RoomVoteDialog roomVoteDialog, Context context, int i) {
        super(context, i);
        this.f52417OooOoo0 = roomVoteDialog;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        StringBuilder sb;
        StringBuilder sb2;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        VoteRankModel voteRankModel = (VoteRankModel) obj;
        if (viewHolder == null || voteRankModel == null) {
            return;
        }
        int layoutPosition = viewHolder.getLayoutPosition();
        RoomVoteDialog roomVoteDialog = this.f52417OooOoo0;
        if (layoutPosition == 0) {
            roomVoteDialog.f27960OooOOOO = voteRankModel.getFCount() > 0;
        }
        int i = oO00O0oO.tvRanking;
        viewHolder.setGone(i, viewHolder.getLayoutPosition() > 2 || !roomVoteDialog.f27960OooOOOO);
        int i2 = oO00O0oO.ivRanking;
        int layoutPosition2 = viewHolder.getLayoutPosition();
        viewHolder.setGone(i2, (layoutPosition2 >= 0 && layoutPosition2 < 3) && roomVoteDialog.f27960OooOOOO);
        int i3 = oO00O0oO.ivUserAvatar;
        NetImageView netImageView = (NetImageView) viewHolder.getView(i3);
        Context context = this.f56196OooOo;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(context);
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.f43911OooO0OO = voteRankModel.getHeadImg();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        netImageView.setBordTrimSrc(true);
        netImageView.setBorderWidth(o0000O0.OooO00o(1));
        if (roomVoteDialog.f27960OooOOOO && viewHolder.getLayoutPosition() == 0) {
            netImageView.setBorderColor(o0000.OooO00o(oO00O0o.color_FD4));
            ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.room_vote_game_rank_1);
        } else if (roomVoteDialog.f27960OooOOOO && viewHolder.getLayoutPosition() == 1) {
            netImageView.setBorderColor(o0000.OooO00o(oO00O0o.color_ABE));
            ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.room_vote_game_rank_2);
        } else if (roomVoteDialog.f27960OooOOOO && viewHolder.getLayoutPosition() == 2) {
            netImageView.setBorderColor(o0000.OooO00o(oO00O0o.color_EA7));
            ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.room_vote_game_rank_3);
        } else {
            netImageView.setBordTrimSrc(false);
            netImageView.setBorderWidth(0);
            netImageView.setBorderColor(0);
            viewHolder.setText(i, String.valueOf(viewHolder.getLayoutPosition() + 1));
        }
        viewHolder.setText(oO00O0oO.tvUserName, oOO0O0O.OooO0O0(voteRankModel.getUserId(), voteRankModel.getNickName()));
        int i4 = oO00O0oO.ivGift;
        viewHolder.setGone(i4, roomVoteDialog.f27958OooOOO);
        int i5 = oO00O0oO.tvGiftNum;
        viewHolder.setGone(i5, roomVoteDialog.f27958OooOOO);
        viewHolder.setGone(oO00O0oO.tvVote, roomVoteDialog.f27958OooOOO);
        int i6 = oO00O0oO.ivEndGift;
        viewHolder.setGone(i6, !roomVoteDialog.f27958OooOOO);
        int i7 = oO00O0oO.tvEndGiftNum;
        viewHolder.setGone(i7, true ^ roomVoteDialog.f27958OooOOO);
        if (roomVoteDialog.f27958OooOOO) {
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(context);
            oooO00o2.OooO00o(OooO.OooO0O0());
            oooO00o2.f43911OooO0OO = voteRankModel.getGiftImg();
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i4));
            boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
            int fCount = voteRankModel.getFCount();
            if (zOooO0o0) {
                sb2 = new StringBuilder();
                sb2.append(fCount);
                sb2.append("x");
            } else {
                sb2 = new StringBuilder("x");
                sb2.append(fCount);
            }
            viewHolder.setText(i5, sb2.toString());
        } else {
            OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(context);
            oooO00o3.OooO00o(OooO.OooO0O0());
            oooO00o3.f43911OooO0OO = voteRankModel.getGiftImg();
            oooO00o3.f43909OooO00o = 0;
            oooO00o3.OooO0Oo((ImageView) viewHolder.getView(i6));
            boolean zOooO0o1 = p591o0oo000O.OooO.OooO0o0();
            int fCount2 = voteRankModel.getFCount();
            if (zOooO0o1) {
                sb = new StringBuilder();
                sb.append(fCount2);
                sb.append("x");
            } else {
                sb = new StringBuilder("x");
                sb.append(fCount2);
            }
            viewHolder.setText(i7, sb.toString());
        }
        viewHolder.addOnClickListener(i3);
    }
}
