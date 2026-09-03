package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import p203o00o0o0o.o0O000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 implements Observer<MomentDetailModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47814OooO0Oo;

    public o000O00(MomentDetailActivity momentDetailActivity) {
        this.f47814OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MomentDetailModel momentDetailModel) {
        MomentDetailModel momentDetailModel2 = momentDetailModel;
        int i = MomentDetailActivity.f26057Oooo0;
        MomentDetailActivity momentDetailActivity = this.f47814OooO0Oo;
        MomentDetailModel momentDetailModel3 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
        if (momentDetailModel3 == null || momentDetailModel3.getId() != momentDetailModel2.getId()) {
            return;
        }
        momentDetailModel3.setCommentNum(momentDetailModel2.getCommentNum());
        momentDetailActivity.OooOoo0().setCount(momentDetailModel3.getCommentNum());
    }
}
