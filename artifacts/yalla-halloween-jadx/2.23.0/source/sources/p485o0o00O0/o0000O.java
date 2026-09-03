package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import p203o00o0o0o.o0O000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47804OooO0Oo;

    public o0000O(MomentDetailActivity momentDetailActivity) {
        this.f47804OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Observable<Object> observable = LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE_FROM_MOMENT_DETAIL");
        int i = MomentDetailActivity.f26057Oooo0;
        MomentDetailModel momentDetailModel = (MomentDetailModel) o0O000Oo.OooO00o(this.f47804OooO0Oo);
        observable.post(momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null);
    }
}
