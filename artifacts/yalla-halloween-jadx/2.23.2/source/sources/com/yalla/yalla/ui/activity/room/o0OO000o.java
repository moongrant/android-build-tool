package com.yalla.yalla.ui.activity.room;

import android.widget.ImageView;
import android.widget.TextView;
import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.model.VoteRankModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function1<VoteDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f26471OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        super(1);
        this.f26471OooO0Oo = voteHistoryDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VoteDetailModel voteDetailModel) {
        String nickName;
        VoteModel voteActivity;
        VoteModel voteActivity2;
        VoteModel voteActivity3;
        VoteModel voteActivity4;
        VoteModel voteActivity5;
        String title;
        List<VoteRankModel> rank;
        VoteDetailModel voteDetailModel2 = voteDetailModel;
        int size = (voteDetailModel2 == null || (rank = voteDetailModel2.getRank()) == null) ? 0 : rank.size();
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f26471OooO0Oo;
        voteHistoryDetailActivity.f26337OooOoO0 = size;
        oo0ooO oo0ooo = voteHistoryDetailActivity.f26331OooOo;
        String strOooO00o = null;
        if (oo0ooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0ooo = null;
        }
        oo0ooo.OooOoO0(voteDetailModel2 != null ? voteDetailModel2.getRank() : null);
        if (voteHistoryDetailActivity.f26337OooOoO0 > 3) {
            ImageView ivVoteMore = voteHistoryDetailActivity.OooOoO0().f43708OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivVoteMore, "ivVoteMore");
            com.code.android.util.o000O.OooOOOO(ivVoteMore);
        } else {
            ImageView ivVoteMore2 = voteHistoryDetailActivity.OooOoO0().f43708OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivVoteMore2, "ivVoteMore");
            com.code.android.util.o000O.OooO0O0(ivVoteMore2);
        }
        TextView textView = voteHistoryDetailActivity.OooOoO0().f43711OooO0o;
        if (voteDetailModel2 != null && (voteActivity5 = voteDetailModel2.getVoteActivity()) != null && (title = voteActivity5.getTitle()) != null) {
            char[] cArr = p490o0o00O0O.o0ooOOo.f48928OooO00o;
            strOooO00o = o0o00O0O.o0ooOOo.OooO00o.OooO00o(title);
        }
        textView.setText(strOooO00o);
        TextView textView2 = voteHistoryDetailActivity.OooOoO0().f43710OooO0Oo;
        long endTime = 0;
        long userId = (voteDetailModel2 == null || (voteActivity4 = voteDetailModel2.getVoteActivity()) == null) ? 0L : voteActivity4.getUserId();
        if (voteDetailModel2 == null || (voteActivity3 = voteDetailModel2.getVoteActivity()) == null || (nickName = voteActivity3.getNickName()) == null) {
            nickName = "";
        }
        textView2.setText(p412o0Oo0o0O.o000O000.OooO0O0(userId, nickName));
        voteHistoryDetailActivity.OooOoO0().f43712OooO0o0.setText(p606o0oo0O0o.o0O0O0o0.OooO0OO((voteDetailModel2 == null || (voteActivity2 = voteDetailModel2.getVoteActivity()) == null) ? 0L : voteActivity2.getCreateTime(), "dd/MM/yyyy HH:mm"));
        TextView textView3 = voteHistoryDetailActivity.OooOoO0().f43709OooO0OO;
        if (voteDetailModel2 != null && (voteActivity = voteDetailModel2.getVoteActivity()) != null) {
            endTime = voteActivity.getEndTime();
        }
        textView3.setText(p606o0oo0O0o.o0O0O0o0.OooO0OO(endTime, "dd/MM/yyyy HH:mm"));
        return Unit.INSTANCE;
    }
}
