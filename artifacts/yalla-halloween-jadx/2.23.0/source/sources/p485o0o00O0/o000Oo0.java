package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.model.moment.MomentTypeDelete;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p203o00o0o0o.o0O000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47827OooO0Oo;

    public o000Oo0(MomentDetailActivity momentDetailActivity) {
        this.f47827OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        MomentForwardContent forwardContent;
        MomentForwardContent forwardContent2;
        Long l2 = l;
        int i = MomentDetailActivity.f26057Oooo0;
        MomentDetailActivity momentDetailActivity = this.f47827OooO0Oo;
        MomentDetailModel momentDetailModel = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
        if ((momentDetailModel == null || (forwardContent2 = momentDetailModel.getForwardContent()) == null || forwardContent2.getShareType() != 20) ? false : true) {
            MomentDetailModel momentDetailModel2 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
            if (Intrinsics.areEqual((momentDetailModel2 == null || (forwardContent = momentDetailModel2.getForwardContent()) == null) ? null : Long.valueOf(forwardContent.getId()), l2)) {
                MomentDetailModel momentDetailModel3 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
                if (momentDetailModel3 != null) {
                    momentDetailModel3.setDeleteType(MomentTypeDelete.EVENT.getValue());
                }
                MomentDetailActivity.OooOoO(momentDetailActivity);
            }
        }
    }
}
