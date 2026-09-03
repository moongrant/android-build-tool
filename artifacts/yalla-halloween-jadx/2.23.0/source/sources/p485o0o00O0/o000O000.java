package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.PostGiftResultModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p203o00o0o0o.o0O000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 implements Observer<PostGiftResultModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47815OooO0Oo;

    public o000O000(MomentDetailActivity momentDetailActivity) {
        this.f47815OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(PostGiftResultModel postGiftResultModel) {
        PostGiftResultModel result = postGiftResultModel;
        Intrinsics.checkNotNullParameter(result, "result");
        int i = MomentDetailActivity.f26057Oooo0;
        MomentDetailActivity momentDetailActivity = this.f47815OooO0Oo;
        MomentDetailModel momentDetailModel = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
        if (momentDetailModel == null || momentDetailModel.getId() != result.getPostId()) {
            return;
        }
        momentDetailModel.setTotalPropValue(result.getTotalPropValue());
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel);
        momentDetailActivity.OooOoo().addSendGiftItem(result.getGiftId(), result.getGiftNum(), result.getPropImage());
    }
}
