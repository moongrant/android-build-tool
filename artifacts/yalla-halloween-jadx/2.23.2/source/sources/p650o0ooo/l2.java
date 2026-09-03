package p650o0ooo;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p368o0OOo0Oo.Oooo000;
import p412o0Oo0o0O.o000O000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p595o0oo00O.OooOo00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class l2 extends o0000oo<VoteRankModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f58373OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(RoomVoteDialog roomVoteDialog, Context context, int i) {
        super(context, i);
        this.f58373OooOoo0 = roomVoteDialog;
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
        RoomVoteDialog roomVoteDialog = this.f58373OooOoo0;
        if (layoutPosition == 0) {
            roomVoteDialog.f27497OooOOOO = voteRankModel.getFCount() > 0;
        }
        int i = o0OO00O.tvRanking;
        viewHolder.setGone(i, viewHolder.getLayoutPosition() > 2 || !roomVoteDialog.f27497OooOOOO);
        int i2 = o0OO00O.ivRanking;
        int layoutPosition2 = viewHolder.getLayoutPosition();
        viewHolder.setGone(i2, (layoutPosition2 >= 0 && layoutPosition2 < 3) && roomVoteDialog.f27497OooOOOO);
        int i3 = o0OO00O.ivUserAvatar;
        NetImageView netImageView = (NetImageView) viewHolder.getView(i3);
        Context context = this.f56423OooOo;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = voteRankModel.getHeadImg();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        netImageView.setBordTrimSrc(true);
        netImageView.setBorderWidth(o0000O0.OooO00o(1));
        if (roomVoteDialog.f27497OooOOOO && viewHolder.getLayoutPosition() == 0) {
            netImageView.setBorderColor(o0000.OooO00o(o0OOO0o.color_FD4));
            ((ImageView) viewHolder.getView(i2)).setImageResource(o0Oo0oo.room_vote_game_rank_1);
        } else if (roomVoteDialog.f27497OooOOOO && viewHolder.getLayoutPosition() == 1) {
            netImageView.setBorderColor(o0000.OooO00o(o0OOO0o.color_ABE));
            ((ImageView) viewHolder.getView(i2)).setImageResource(o0Oo0oo.room_vote_game_rank_2);
        } else if (roomVoteDialog.f27497OooOOOO && viewHolder.getLayoutPosition() == 2) {
            netImageView.setBorderColor(o0000.OooO00o(o0OOO0o.color_EA7));
            ((ImageView) viewHolder.getView(i2)).setImageResource(o0Oo0oo.room_vote_game_rank_3);
        } else {
            netImageView.setBordTrimSrc(false);
            netImageView.setBorderWidth(0);
            netImageView.setBorderColor(0);
            viewHolder.setText(i, String.valueOf(viewHolder.getLayoutPosition() + 1));
        }
        viewHolder.setText(o0OO00O.tvUserName, o000O000.OooO0O0(voteRankModel.getUserId(), voteRankModel.getNickName()));
        int i4 = o0OO00O.ivGift;
        viewHolder.setGone(i4, roomVoteDialog.f27495OooOOO);
        int i5 = o0OO00O.tvGiftNum;
        viewHolder.setGone(i5, roomVoteDialog.f27495OooOOO);
        viewHolder.setGone(o0OO00O.tvVote, roomVoteDialog.f27495OooOOO);
        int i6 = o0OO00O.ivEndGift;
        viewHolder.setGone(i6, !roomVoteDialog.f27495OooOOO);
        int i7 = o0OO00O.tvEndGiftNum;
        viewHolder.setGone(i7, true ^ roomVoteDialog.f27495OooOOO);
        if (roomVoteDialog.f27495OooOOO) {
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(context);
            oooO00o2.OooO00o(d1.OooO0O0());
            oooO00o2.f43126OooO0OO = voteRankModel.getGiftImg();
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i4));
            boolean zOooO0o0 = OooOo00.OooO0o0();
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
            Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(context);
            oooO00o3.OooO00o(d1.OooO0O0());
            oooO00o3.f43126OooO0OO = voteRankModel.getGiftImg();
            oooO00o3.f43124OooO00o = 0;
            oooO00o3.OooO0Oo((ImageView) viewHolder.getView(i6));
            boolean zOooO0o1 = OooOo00.OooO0o0();
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
