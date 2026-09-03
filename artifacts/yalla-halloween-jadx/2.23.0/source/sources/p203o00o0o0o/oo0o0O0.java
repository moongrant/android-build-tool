package p203o00o0o0o;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.data.repository.VoteRepo$getUserInfo$1$1;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.SummaryDataPoint;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import p245o00oo0o.o00O;
import p377o0OOoOo.o0000OO0;
import p519o0o0O0oO.m2;
import p519o0o0O0oO.n2;
import p592o0oo00O.OooOOO0;
import p598o0oo00oO.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0o0O0 implements o00O.OooO00o, o0000O00.OooO00o, BaseQuickAdapter.OooO0O0, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39305OooO0Oo;

    public /* synthetic */ oo0o0O0(Object obj) {
        this.f39305OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomVoteDialog this$0 = (RoomVoteDialog) this.f39305OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object objOooOOO = baseQuickAdapter.OooOOO(i);
        Intrinsics.checkNotNull(objOooOOO, "null cannot be cast to non-null type com.yalla.yalla.model.VoteRankModel");
        VoteRankModel voteRankModel = (VoteRankModel) objOooOOO;
        ArrayList arrayList = OooO00o.f24973OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(Long.valueOf(voteRankModel.getUserId()));
        if (roomUserInfoModelOooO0o0 != null) {
            OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0.postValue(roomUserInfoModelOooO0o0);
            return;
        }
        long userId = voteRankModel.getUserId();
        long roomId = voteRankModel.getRoomId();
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new VoteRepo$getUserInfo$1$1(userId, roomId, mutableLiveData, null), 3, null);
        Context context = this$0.f52532OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        mutableLiveData.observe((FragmentActivity) context, new o0000OO0(m2.f52426OooO0Oo, new n2(voteRankModel), null, false, 12));
    }

    @Override // o0oo00oO.o0000O00.OooO00o
    public final void OooO0Oo() {
        OooOOO0.OooO0oO("onTextClicked setViewData 动态详情 postCommentDetailModel = " + ((MomentCommentDetailModel) this.f39305OooO0Oo));
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0OO((SummaryDataPoint.Builder) this.f39305OooO0Oo, (AttributeKey) obj, obj2);
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onIsPlayingChanged(((o0O000o0) this.f39305OooO0Oo).OooOO0O());
    }
}
