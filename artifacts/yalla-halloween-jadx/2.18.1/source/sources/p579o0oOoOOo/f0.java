package p579o0oOoOOo;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.util.netimage.NetImageView;
import p028Oooo0o0.o00O0O0O;
import p168o00Ooo0.oo000o;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends OooO0OO<VoteRankModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f45953OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(RoomVoteDialog roomVoteDialog, Context context) {
        super(context, R.layout.room_item_vote_game_dialog);
        this.f45953OooO00o = roomVoteDialog;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        StringBuilder sbOooO00o;
        StringBuilder sbOooO00o2;
        OooO0o oooO0o = (OooO0o) oooO00o;
        VoteRankModel voteRankModel = (VoteRankModel) obj;
        if (oooO0o == null || voteRankModel == null) {
            return;
        }
        if (oooO0o.getLayoutPosition() == 0) {
            this.f45953OooO00o.f23778OoooOOo = voteRankModel.getFCount() > 0;
        }
        oooO0o.OooO0oO(R.id.tvRanking, oooO0o.getLayoutPosition() > 2 || !this.f45953OooO00o.f23778OoooOOo);
        int layoutPosition = oooO0o.getLayoutPosition();
        oooO0o.OooO0oO(R.id.ivRanking, (layoutPosition >= 0 && layoutPosition < 3) && this.f45953OooO00o.f23778OoooOOo);
        NetImageView netImageView = (NetImageView) oooO0o.OooO0Oo(R.id.ivUserAvatar);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48429OooO0OO = voteRankModel.getHeadImg();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(netImageView);
        netImageView.setBordTrimSrc(true);
        netImageView.setBorderWidth(OooOo00.OooO00o(1));
        if (this.f45953OooO00o.f23778OoooOOo && oooO0o.getLayoutPosition() == 0) {
            netImageView.setBorderColor(o000O0O0.OooO00o(R.color.color_FD4));
            ((ImageView) oooO0o.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.room_vote_game_rank_1);
        } else if (this.f45953OooO00o.f23778OoooOOo && oooO0o.getLayoutPosition() == 1) {
            netImageView.setBorderColor(o000O0O0.OooO00o(R.color.color_ABE));
            ((ImageView) oooO0o.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.room_vote_game_rank_2);
        } else if (this.f45953OooO00o.f23778OoooOOo && oooO0o.getLayoutPosition() == 2) {
            netImageView.setBorderColor(o000O0O0.OooO00o(R.color.color_EA7));
            ((ImageView) oooO0o.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.room_vote_game_rank_3);
        } else {
            netImageView.setBordTrimSrc(false);
            netImageView.setBorderWidth(0);
            netImageView.setBorderColor(0);
            oooO0o.OooOO0(R.id.tvRanking, String.valueOf(oooO0o.getLayoutPosition() + 1));
        }
        oooO0o.OooOO0(R.id.tvUserName, o00O0O.f42677OooO00o.OooO0O0(voteRankModel.getUserId(), voteRankModel.getNickName()));
        oooO0o.OooO0oO(R.id.ivGift, this.f45953OooO00o.f23777OoooOOO);
        oooO0o.OooO0oO(R.id.tvGiftNum, this.f45953OooO00o.f23777OoooOOO);
        oooO0o.OooO0oO(R.id.tvVote, this.f45953OooO00o.f23777OoooOOO);
        oooO0o.OooO0oO(R.id.ivEndGift, !this.f45953OooO00o.f23777OoooOOO);
        oooO0o.OooO0oO(R.id.tvEndGiftNum, true ^ this.f45953OooO00o.f23777OoooOOO);
        if (this.f45953OooO00o.f23777OoooOOO) {
            oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(getContext());
            oooO00o3.OooO00o(o00OOO.OooO00o.OooO0Oo());
            oooO00o3.f48429OooO0OO = voteRankModel.getGiftImg();
            oooO00o3.f48427OooO00o = 0;
            oooO00o3.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivGift));
            if (oo000o.OooO0o0()) {
                sbOooO00o2 = new StringBuilder();
                sbOooO00o2.append(voteRankModel.getFCount());
                sbOooO00o2.append('x');
            } else {
                sbOooO00o2 = o00O0O0O.OooO00o('x');
                sbOooO00o2.append(voteRankModel.getFCount());
            }
            oooO0o.OooOO0(R.id.tvGiftNum, sbOooO00o2.toString());
        } else {
            oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(getContext());
            oooO00o4.OooO00o(o00OOO.OooO00o.OooO0Oo());
            oooO00o4.f48429OooO0OO = voteRankModel.getGiftImg();
            oooO00o4.f48427OooO00o = 0;
            oooO00o4.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivEndGift));
            if (oo000o.OooO0o0()) {
                sbOooO00o = new StringBuilder();
                sbOooO00o.append(voteRankModel.getFCount());
                sbOooO00o.append('x');
            } else {
                sbOooO00o = o00O0O0O.OooO00o('x');
                sbOooO00o.append(voteRankModel.getFCount());
            }
            oooO0o.OooOO0(R.id.tvEndGiftNum, sbOooO00o.toString());
        }
        oooO0o.OooO0O0(R.id.ivUserAvatar);
    }
}
