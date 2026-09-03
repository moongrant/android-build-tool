package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49114OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49115OooO0o0;

    public /* synthetic */ o00000O(Object obj, int i) {
        this.f49114OooO0Oo = i;
        this.f49115OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49114OooO0Oo;
        Object obj2 = this.f49115OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                MomentDetailModel result = (MomentDetailModel) obj;
                int i2 = MomentDetailActivity.f25608Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if (value != null && value.getId() == result.getId()) {
                    value.setPraiseNum(result.getPraiseNum());
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(value);
                    this$0.OooOoo().selfPraiseItem(true);
                    break;
                }
                break;
            default:
                MainRoomMineFragment.onLazyInit$lambda$1((MainRoomMineFragment) obj2, (Boolean) obj);
                break;
        }
    }
}
