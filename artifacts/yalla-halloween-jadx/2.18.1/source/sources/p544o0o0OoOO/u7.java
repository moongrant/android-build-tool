package p544o0o0OoOO;

import android.widget.ImageView;
import android.widget.TextView;
import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.oOO00O;
import p503o0o00o00.OooOO0;
import p520o0o0O0O0.o00O0O;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class u7 extends Lambda implements Function1<VoteDetailModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f44324Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        super(1);
        this.f44324Oooo0o = voteHistoryDetailActivity;
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
        this.f44324Oooo0o.f23108Oooooo0 = (voteDetailModel2 == null || (rank = voteDetailModel2.getRank()) == null) ? 0 : rank.size();
        OooO0OO<VoteRankModel> oooO0OO = this.f44324Oooo0o.f23106OooooOo;
        String strOooO00o = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(voteDetailModel2 != null ? voteDetailModel2.getRank() : null);
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f44324Oooo0o;
        if (voteHistoryDetailActivity.f23108Oooooo0 > 3) {
            ImageView imageView = voteHistoryDetailActivity.OooOooO().f50897OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "footerBinding.ivVoteMore");
            oOO00O.OooO(imageView);
        } else {
            ImageView imageView2 = voteHistoryDetailActivity.OooOooO().f50897OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "footerBinding.ivVoteMore");
            oOO00O.OooO00o(imageView2);
        }
        TextView textView = this.f44324Oooo0o.OooOooO().f50900OooO0o;
        if (voteDetailModel2 != null && (voteActivity5 = voteDetailModel2.getVoteActivity()) != null && (title = voteActivity5.getTitle()) != null) {
            strOooO00o = OooOO0.f41606Oooo0o.OooO00o(title);
        }
        textView.setText(strOooO00o);
        TextView textView2 = this.f44324Oooo0o.OooOooO().f50899OooO0Oo;
        o00O0O o00o0o2 = o00O0O.f42677OooO00o;
        long endTime = 0;
        long userId = (voteDetailModel2 == null || (voteActivity4 = voteDetailModel2.getVoteActivity()) == null) ? 0L : voteActivity4.getUserId();
        if (voteDetailModel2 == null || (voteActivity3 = voteDetailModel2.getVoteActivity()) == null || (nickName = voteActivity3.getNickName()) == null) {
            nickName = "";
        }
        textView2.setText(o00o0o2.OooO0O0(userId, nickName));
        TextView textView3 = this.f44324Oooo0o.OooOooO().f50901OooO0o0;
        o00O0 o00o1 = o00O0.f48624OooO00o;
        textView3.setText(o00o1.OooO0OO((voteDetailModel2 == null || (voteActivity2 = voteDetailModel2.getVoteActivity()) == null) ? 0L : voteActivity2.getCreateTime(), "dd/MM/yyyy HH:mm"));
        TextView textView4 = this.f44324Oooo0o.OooOooO().f50898OooO0OO;
        if (voteDetailModel2 != null && (voteActivity = voteDetailModel2.getVoteActivity()) != null) {
            endTime = voteActivity.getEndTime();
        }
        textView4.setText(o00o1.OooO0OO(endTime, "dd/MM/yyyy HH:mm"));
        return Unit.INSTANCE;
    }
}
