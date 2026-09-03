package p466o0OooO0;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o0o0000.OooOo;
import p186o00o00Oo.o0ooOOo;
import p520o0o0O0O0.o00OOOO0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.g0;
import p579o0oOoOOo.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000 implements OooO0OO.OooO0O0, BaseQuickAdapter.OooOOO0, o0ooOOo, BaseQuickAdapter.OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f40481OooO0Oo;

    public /* synthetic */ o00000(Object obj) {
        this.f40481OooO0Oo = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OooOO0O(((OooOO0.OooO0O0) this.f40481OooO0Oo).f13238Oooo0o.f40566OooOO0o);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        TopicPostPopularFragment.m419initView$lambda12((TopicPostPopularFragment) this.f40481OooO0Oo);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MainMomentsTopicFollowingFragment.m352initView$lambda3((MainMomentsTopicFollowingFragment) this.f40481OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomVoteDialog this$0 = (RoomVoteDialog) this.f40481OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object item = baseQuickAdapter.getItem(i);
        Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.yalla.yalla.model.VoteRankModel");
        VoteRankModel voteRankModel = (VoteRankModel) item;
        RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(voteRankModel.getUserId());
        if (roomUserInfoModelOooOO0 != null) {
            o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo.postValue(roomUserInfoModelOooOO0);
            return;
        }
        long userId = voteRankModel.getUserId();
        long roomId = voteRankModel.getRoomId();
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o00OOOO0(mutableLiveData, userId, roomId, null), 3, null);
        Context context = this$0.f41543Oooo0o;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        mutableLiveData.observe((FragmentActivity) context, new OooOo(g0.f45956Oooo0o, new h0(voteRankModel), null, false, 12));
    }
}
