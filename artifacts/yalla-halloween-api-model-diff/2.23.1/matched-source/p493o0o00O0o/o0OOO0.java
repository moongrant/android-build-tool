package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.jvm.internal.Intrinsics;
import o000O0.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OOO0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49197OooO0o0;

    public /* synthetic */ o0OOO0(Object obj, int i) {
        this.f49196OooO0Oo = i;
        this.f49197OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49196OooO0Oo;
        Object obj2 = this.f49197OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                MomentDetailModel result = (MomentDetailModel) obj;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if (value != null && value.getId() == result.getId()) {
                    this$0.OooOooO().getMPostDetailModel().setValue(result);
                }
                MomentDetailModel momentDetailModel = (MomentDetailModel) Oooo0.OooO00o(this$0);
                if (momentDetailModel != null) {
                    this$0.OooOoOO().setPostDetailModel(momentDetailModel);
                    momentDetailModel.setSessionId(this$0.OooOooO().getMSessionId());
                    this$0.OooOoOO().setCount(momentDetailModel.getCommentNum());
                    this$0.OooOoo().setCount(momentDetailModel.getPraiseNum());
                    this$0.OooOoo0().setCount(momentDetailModel.getTotalPropValue());
                }
                break;
            default:
                MainRoomMineFollowingFragment.loadRecommendRoomList$lambda$8((MainRoomMineFollowingFragment) obj2, (Response) obj);
                break;
        }
    }
}
