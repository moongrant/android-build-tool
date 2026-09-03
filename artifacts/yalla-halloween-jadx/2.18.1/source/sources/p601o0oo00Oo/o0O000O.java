package p601o0oo00Oo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000O extends Lambda implements Function1<MomentPoll, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48169Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(MomentDetailView momentDetailView) {
        super(1);
        this.f48169Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentPoll momentPoll) {
        MomentPoll momentPoll2 = momentPoll;
        Intrinsics.checkNotNullParameter(momentPoll2, "momentPoll");
        MomentDetailModel momentDetailModel = this.f48169Oooo0o.f24941Oooo0oo;
        if (momentDetailModel != null) {
            momentDetailModel.setMomentPoll(momentPoll2.toJSONString());
        }
        if (this.f48169Oooo0o.f24952Ooooo00) {
            LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH").post(this.f48169Oooo0o.f24941Oooo0oo);
        }
        return Unit.INSTANCE;
    }
}
