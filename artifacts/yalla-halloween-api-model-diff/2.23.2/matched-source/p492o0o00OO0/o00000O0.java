package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49116OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49117OooO0o0;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f49116OooO0Oo = i;
        this.f49117OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49116OooO0Oo;
        Object obj2 = this.f49117OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                MomentChangeUserIsInRoomModel result = (MomentChangeUserIsInRoomModel) obj;
                int i2 = MomentDetailActivity.f25608Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if (value != null && value.getUserId() == Long.parseLong(result.getUserId())) {
                    value.setInRoom(result.getIsInRoom());
                    break;
                }
                break;
            default:
                MainRoomMineFollowingFragment.onLazyInit$lambda$0((MainRoomMineFollowingFragment) obj2, obj);
                break;
        }
    }
}
