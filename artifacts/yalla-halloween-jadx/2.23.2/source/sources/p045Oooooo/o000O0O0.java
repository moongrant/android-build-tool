package p045Oooooo;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0O0 implements o000Oo0.OooO0OO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1959OooO0Oo;

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VoteHistoryActivity context = (VoteHistoryActivity) this.f1959OooO0Oo;
        int i2 = VoteHistoryActivity.f26312OooOoO;
        Intrinsics.checkNotNullParameter(context, "this$0");
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
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

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        ((AtomicReference) this.f1959OooO0Oo).set(oooO00o);
        return "Terminate InputBuffer";
    }
}
