package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ooo0Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49386OooO0o0;

    public /* synthetic */ ooo0Oo0(Object obj, int i) {
        this.f49385OooO0Oo = i;
        this.f49386OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49385OooO0Oo;
        Object obj2 = this.f49386OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                MomentDetailModel result = (MomentDetailModel) obj;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel value = this$0.OooOooO().getMPostDetailModel().getValue();
                if (value != null && value.getId() == result.getId()) {
                    value.setPraiseNum(result.getPraiseNum());
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(value);
                    this$0.OooOoo().selfPraiseItem(false);
                    break;
                }
                break;
            default:
                MainRoomFragment.initObserver$lambda$2((MainRoomFragment) obj2, obj);
                break;
        }
    }
}
