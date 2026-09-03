package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p203o00o0o0o.o0O000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo implements Observer<MomentDetailModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47809OooO0Oo;

    public o0000Ooo(MomentDetailActivity momentDetailActivity) {
        this.f47809OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MomentDetailModel momentDetailModel) {
        MomentDetailModel result = momentDetailModel;
        Intrinsics.checkNotNullParameter(result, "result");
        int i = MomentDetailActivity.f26057Oooo0;
        MomentDetailActivity momentDetailActivity = this.f47809OooO0Oo;
        MomentDetailModel momentDetailModel2 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
        if (momentDetailModel2 == null || momentDetailModel2.getId() != result.getId()) {
            return;
        }
        momentDetailModel2.setPraiseNum(result.getPraiseNum());
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel2);
        momentDetailActivity.OooOooO().selfPraiseItem(true);
    }
}
