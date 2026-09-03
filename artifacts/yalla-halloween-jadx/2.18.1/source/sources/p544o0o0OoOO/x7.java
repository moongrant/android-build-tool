package p544o0o0OoOO;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class x7 extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f44344Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        super(0L, 1, null);
        this.f44344Oooo0o = voteHistoryDetailActivity;
    }

    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        VoteHistoryDetailActivity voteHistoryDetailActivity = this.f44344Oooo0o;
        voteHistoryDetailActivity.f23107Oooooo = !voteHistoryDetailActivity.f23107Oooooo;
        OooO0OO<VoteRankModel> oooO0OO = voteHistoryDetailActivity.f23106OooooOo;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.notifyDataSetChanged();
        this.f44344Oooo0o.OooOooO().f50897OooO0O0.setImageResource(this.f44344Oooo0o.f23107Oooooo ? R.drawable.room_vote_game_less : R.drawable.room_vote_game_more);
    }
}
