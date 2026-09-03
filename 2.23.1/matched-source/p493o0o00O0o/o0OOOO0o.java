package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OOOO0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49203OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49204OooO0o0;

    public /* synthetic */ o0OOOO0o(Object obj, int i) {
        this.f49203OooO0Oo = i;
        this.f49204OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49203OooO0Oo;
        Object obj2 = this.f49204OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                MomentChangeUserIsInRoomModel result = (MomentChangeUserIsInRoomModel) obj;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if (value != null && value.getUserId() == Long.parseLong(result.getUserId())) {
                    value.setInRoom(result.getIsInRoom());
                    break;
                }
                break;
            default:
                MainRoomMineFragment.onLazyInit$lambda$1((MainRoomMineFragment) obj2, (Boolean) obj);
                break;
        }
    }
}
