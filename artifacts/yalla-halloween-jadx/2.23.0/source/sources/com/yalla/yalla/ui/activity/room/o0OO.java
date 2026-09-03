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
import p406o0Oo0Ooo.oOO0O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO extends Lambda implements Function1<VoteDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f26919OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        super(1);
        this.f26919OooO0Oo = voteHistoryDetailActivity;
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
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f26919OooO0Oo;
        voteHistoryDetailActivity.f26791OooOoO0 = size;
        o0OOO0 o0ooo1 = voteHistoryDetailActivity.f26785OooOo;
        String strOooO00o = null;
        if (o0ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0ooo1 = null;
        }
        o0ooo1.OooOoO0(voteDetailModel2 != null ? voteDetailModel2.getRank() : null);
        if (voteHistoryDetailActivity.f26791OooOoO0 > 3) {
            ImageView imageView = voteHistoryDetailActivity.OooOoO0().f58419OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "footerBinding.ivVoteMore");
            com.code.android.util.o000OO00.OooOOOO(imageView);
        } else {
            ImageView imageView2 = voteHistoryDetailActivity.OooOoO0().f58419OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "footerBinding.ivVoteMore");
            com.code.android.util.o000OO00.OooO0O0(imageView2);
        }
        TextView textView = voteHistoryDetailActivity.OooOoO0().f58422OooO0o;
        if (voteDetailModel2 != null && (voteActivity5 = voteDetailModel2.getVoteActivity()) != null && (title = voteActivity5.getTitle()) != null) {
            char[] cArr = p483o0o000oo.o0OO00O.f47706OooO00o;
            strOooO00o = o0o000oo.o0OO00O.OooO00o.OooO00o(title);
        }
        textView.setText(strOooO00o);
        TextView textView2 = voteHistoryDetailActivity.OooOoO0().f58421OooO0Oo;
        long endTime = 0;
        long userId = (voteDetailModel2 == null || (voteActivity4 = voteDetailModel2.getVoteActivity()) == null) ? 0L : voteActivity4.getUserId();
        if (voteDetailModel2 == null || (voteActivity3 = voteDetailModel2.getVoteActivity()) == null || (nickName = voteActivity3.getNickName()) == null) {
            nickName = "";
        }
        textView2.setText(oOO0O0O.OooO0O0(userId, nickName));
        voteHistoryDetailActivity.OooOoO0().f58423OooO0o0.setText(p601o0oo0O0.o0000oo.OooO0OO((voteDetailModel2 == null || (voteActivity2 = voteDetailModel2.getVoteActivity()) == null) ? 0L : voteActivity2.getCreateTime(), "dd/MM/yyyy HH:mm"));
        TextView textView3 = voteHistoryDetailActivity.OooOoO0().f58420OooO0OO;
        if (voteDetailModel2 != null && (voteActivity = voteDetailModel2.getVoteActivity()) != null) {
            endTime = voteActivity.getEndTime();
        }
        textView3.setText(p601o0oo0O0.o0000oo.OooO0OO(endTime, "dd/MM/yyyy HH:mm"));
        return Unit.INSTANCE;
    }
}
