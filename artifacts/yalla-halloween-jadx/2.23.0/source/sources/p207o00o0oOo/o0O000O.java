package p207o00o0oOo;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.drm.OooO0O0;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O000O implements o00O0O00, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39439OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39440OooO0o0;

    public /* synthetic */ o0O000O(Object obj, int i) {
        this.f39439OooO0Oo = i;
        this.f39440OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f39439OooO0Oo;
        Object obj = this.f39440OooO0o0;
        switch (i2) {
            case 1:
                VoteHistoryActivity context = (VoteHistoryActivity) obj;
                int i3 = VoteHistoryActivity.f26766OooOoO;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Object obj2 = baseQuickAdapter.f10111OooOOoo.get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.model.VoteModel");
                VoteModel voteModel = (VoteModel) obj2;
                long roomId = voteModel.getRoomId();
                long voteId = voteModel.getVoteId();
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) VoteHistoryDetailActivity.class);
                intent.putExtra("VOTE_GAME_ROOM_ID", roomId);
                intent.putExtra("VOTE_GAME_VOTE_ID", voteId);
                context.startActivity(intent);
                break;
            default:
                ((ContributionFragment) obj).lambda$initView$0(baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p245o00oo0o.o00O0O00
    public final void accept(Object obj) {
        ((OooO0O0.OooO00o) obj).OooO0o0((Exception) this.f39440OooO0o0);
    }
}
