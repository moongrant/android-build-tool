package p177o00Ooooo;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import kotlin.jvm.internal.Intrinsics;
import p159o00OoOO.o00O000;
import p186o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0O000 implements o0ooOOo, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f32893OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f32894OooO0o0;

    public /* synthetic */ oO0O000(Object obj, int i) {
        this.f32893OooO0Oo = i;
        this.f32894OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VoteHistoryActivity context = (VoteHistoryActivity) this.f32894OooO0o0;
        VoteHistoryActivity.OooO00o oooO00o = VoteHistoryActivity.f23083Oooooo;
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

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32893OooO0Oo) {
            case 0:
                ((oO0O000o) this.f32894OooO0o0).f32898OoooOo0 = true;
                o00O000.OooO().OooOOo(0L, 0, 0L);
                break;
            default:
                MainExploreFragment.m340initView$lambda4((MainExploreFragment) this.f32894OooO0o0);
                break;
        }
    }
}
