package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OOOO00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49202OooO0o0;

    public /* synthetic */ o0OOOO00(Object obj, int i) {
        this.f49201OooO0Oo = i;
        this.f49202OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49201OooO0Oo;
        Object obj2 = this.f49202OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                MomentDetailModel momentDetailModel = (MomentDetailModel) obj;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if (value != null && value.getId() == momentDetailModel.getId()) {
                    value.setCommentNum(momentDetailModel.getCommentNum());
                    this$0.OooOoOO().setCount(value.getCommentNum());
                    break;
                }
                break;
            default:
                MainRoomMineFollowingFragment.onLazyInit$lambda$0((MainRoomMineFollowingFragment) obj2, obj);
                break;
        }
    }
}
