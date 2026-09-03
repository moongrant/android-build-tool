package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p203o00o0o0o.o0O000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o implements Observer<MomentDetailModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47820OooO0Oo;

    public o000O0o(MomentDetailActivity momentDetailActivity) {
        this.f47820OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MomentDetailModel momentDetailModel) {
        MomentDetailModel result = momentDetailModel;
        Intrinsics.checkNotNullParameter(result, "result");
        int i = MomentDetailActivity.f26057Oooo0;
        MomentDetailActivity momentDetailActivity = this.f47820OooO0Oo;
        MomentDetailModel momentDetailModel2 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
        if (momentDetailModel2 != null && momentDetailModel2.getId() == result.getId()) {
            momentDetailActivity.OooOooo().getMPostDetailModel().setValue(result);
        }
        MomentDetailModel momentDetailModel3 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
        if (momentDetailModel3 != null) {
            momentDetailActivity.OooOoo0().setPostDetailModel(momentDetailModel3);
            momentDetailModel3.setSessionId(momentDetailActivity.OooOooo().getMSessionId());
            momentDetailActivity.OooOoo0().setCount(momentDetailModel3.getCommentNum());
            momentDetailActivity.OooOooO().setCount(momentDetailModel3.getPraiseNum());
            momentDetailActivity.OooOoo().setCount(momentDetailModel3.getTotalPropValue());
        }
    }
}
