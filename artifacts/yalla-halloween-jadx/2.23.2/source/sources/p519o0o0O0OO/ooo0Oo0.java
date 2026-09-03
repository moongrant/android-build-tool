package p519o0o0O0OO;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentPoll;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0Oo0 extends Lambda implements Function1<MomentPoll, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52871OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f52872OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(MomentDetailModel momentDetailModel, boolean z) {
        super(1);
        this.f52871OooO0Oo = momentDetailModel;
        this.f52872OooO0o0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentPoll momentPoll) {
        MomentPoll momentPoll2 = momentPoll;
        if (momentPoll2 != null) {
            String jSONString = momentPoll2.toJSONString();
            MomentDetailModel momentDetailModel = this.f52871OooO0Oo;
            momentDetailModel.updatePollData(jSONString, momentPoll2);
            if (this.f52872OooO0o0) {
                LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH").post(momentDetailModel);
            }
        }
        return Unit.INSTANCE;
    }
}
