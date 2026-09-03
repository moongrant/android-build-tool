package p509o0o0O0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentPoll;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function1<MomentPoll, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51218OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f51219OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(MomentDetailModel momentDetailModel, boolean z) {
        super(1);
        this.f51218OooO0Oo = momentDetailModel;
        this.f51219OooO0o0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentPoll momentPoll) {
        MomentPoll momentPoll2 = momentPoll;
        if (momentPoll2 != null) {
            String jSONString = momentPoll2.toJSONString();
            MomentDetailModel momentDetailModel = this.f51218OooO0Oo;
            momentDetailModel.updatePollData(jSONString, momentPoll2);
            if (this.f51219OooO0o0) {
                LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH").post(momentDetailModel);
            }
        }
        return Unit.INSTANCE;
    }
}
