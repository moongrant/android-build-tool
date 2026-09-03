package p544o0o0OoOO;

import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p503o0o00o00.OooOO0;
import p520o0o0O0O0.o00O0O;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class t7 extends OooO0OO<VoteModel> {
    public t7(VoteHistoryActivity voteHistoryActivity) {
        super(voteHistoryActivity, R.layout.room_item_vote_history);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        VoteModel voteModel = (VoteModel) obj;
        if (oooO0o == null || voteModel == null) {
            return;
        }
        oooO0o.OooOO0(R.id.tvHistoryTitle, OooOO0.f41606Oooo0o.OooO00o(voteModel.getTitle()));
        oooO0o.OooOO0(R.id.tvHistoryInitiator, o000O0O0.OooO0OO(R.string.room_vote_game_history_initiator) + ' ' + o00O0O.f42677OooO00o.OooO0O0(voteModel.getUserId(), voteModel.getNickName()));
        oooO0o.OooOO0(R.id.tvHistoryTime, o00O0.f48624OooO00o.OooO0Oo(voteModel.getCreateTime(), System.currentTimeMillis()));
    }
}
