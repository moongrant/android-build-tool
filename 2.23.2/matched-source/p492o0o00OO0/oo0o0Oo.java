package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.jvm.internal.Intrinsics;
import o000O0.OooOo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0o0Oo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49545OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49546OooO0o0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f49545OooO0Oo = i;
        this.f49546OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49545OooO0Oo;
        Object obj2 = this.f49546OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj2;
                int i2 = MomentDetailActivity.f25608Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Observable<Object> observable = LiveEventBus.get("MOMENT_BY_USER_REMOVE_FROM_MOMENT_DETAIL");
                MomentDetailModel momentDetailModel = (MomentDetailModel) OooOo.OooO00o(this$0);
                observable.post(momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null);
                break;
            default:
                MainRoomMineFollowingFragment.followAllRoom$lambda$5((MainRoomMineFollowingFragment) obj2, (Response) obj);
                break;
        }
    }
}
