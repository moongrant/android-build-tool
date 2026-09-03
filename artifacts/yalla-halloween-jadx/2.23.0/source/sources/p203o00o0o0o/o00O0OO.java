package p203o00o0o0o;

import android.app.Activity;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.NumberDataPoint;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.o2;
import p592o0oo00O.OooOOO0;
import p598o0oo00oO.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OO implements o00O.OooO00o, o0000O00.OooO00o, BaseQuickAdapter.OooO0o, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39196OooO0Oo;

    public /* synthetic */ o00O0OO(Object obj) {
        this.f39196OooO0Oo = obj;
    }

    @Override // o0oo00oO.o0000O00.OooO00o
    public final void OooO0Oo() {
        OooOOO0.OooO0oO("onTextClicked setViewData 动态详情 postCommentDetailModel = " + ((MomentCommentDetailModel) this.f39196OooO0Oo));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomVoteDialog this$0 = (RoomVoteDialog) this.f39196OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RoomGameConfig.Vote value = OooO0O0.f24995OoooOOO.OooO00o().f25037Oooo0oO.getValue();
        if (value != null && value.getStatus() == RoomVoteDialog.VoteStatus.Ended.getValue()) {
            return;
        }
        o2 onLogin = new o2(baseQuickAdapter, i, this$0);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0O0((NumberDataPoint.Builder) this.f39196OooO0Oo, (AttributeKey) obj, obj2);
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaybackParametersChanged(((o0O000o0) this.f39196OooO0Oo).f39273OooOOO);
    }
}
