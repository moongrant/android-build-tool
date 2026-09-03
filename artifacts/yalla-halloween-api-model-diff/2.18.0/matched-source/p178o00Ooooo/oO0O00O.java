package p178o00Ooooo;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import kotlin.jvm.internal.Intrinsics;
import p160o00OoOO.o00O000;
import p187o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0O00O implements o0ooOOo, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32920Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32921OoooO00;

    public /* synthetic */ oO0O00O(Object obj, int i) {
        this.f32920Oooo = i;
        this.f32921OoooO00 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VoteHistoryActivity context = (VoteHistoryActivity) this.f32921OoooO00;
        VoteHistoryActivity.OooO00o oooO00o = VoteHistoryActivity.f23102o0OoOo0;
        Intrinsics.checkNotNullParameter(context, "this$0");
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.VoteModel");
        VoteModel voteModel = (VoteModel) obj;
        long roomId = voteModel.getRoomId();
        long voteId = voteModel.getVoteId();
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) VoteHistoryDetailActivity.class);
        intent.putExtra("VOTE_GAME_ROOM_ID", roomId);
        intent.putExtra("VOTE_GAME_VOTE_ID", voteId);
        context.startActivity(intent);
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32920Oooo) {
            case 0:
                ((oO0O00o0) this.f32921OoooO00).f32926Ooooo00 = true;
                o00O000.OooO().OooOOo(0L, 0, 0L);
                break;
            default:
                MainExploreFragment.m340initView$lambda4((MainExploreFragment) this.f32921OoooO00);
                break;
        }
    }
}
