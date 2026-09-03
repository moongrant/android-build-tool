package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.model.moment.MomentTypeDelete;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.jvm.internal.Intrinsics;
import o000O0.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OOO0OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49200OooO0o0;

    public /* synthetic */ o0OOO0OO(Object obj, int i) {
        this.f49199OooO0Oo = i;
        this.f49200OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MomentForwardContent forwardContent;
        MomentForwardContent forwardContent2;
        int i = this.f49199OooO0Oo;
        Object obj2 = this.f49200OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                Long l = (Long) obj;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if ((value == null || (forwardContent2 = value.getForwardContent()) == null || forwardContent2.getShareType() != 20) ? false : true) {
                    MomentDetailModel momentDetailModel = (MomentDetailModel) Oooo0.OooO00o(this$0);
                    if (Intrinsics.areEqual((momentDetailModel == null || (forwardContent = momentDetailModel.getForwardContent()) == null) ? null : Long.valueOf(forwardContent.getId()), l)) {
                        MomentDetailModel momentDetailModel2 = (MomentDetailModel) Oooo0.OooO00o(this$0);
                        if (momentDetailModel2 != null) {
                            momentDetailModel2.setDeleteType(MomentTypeDelete.EVENT.getValue());
                        }
                        this$0.Oooo000();
                    }
                }
                break;
            default:
                MainRoomMineFollowingFragment.followRoom$lambda$4((MainRoomMineFollowingFragment) obj2, (Response) obj);
                break;
        }
    }
}
