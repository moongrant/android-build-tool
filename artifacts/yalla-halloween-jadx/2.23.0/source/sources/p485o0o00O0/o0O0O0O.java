package p485o0o00O0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f47944OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(MomentDetailModel momentDetailModel) {
        super(1);
        this.f47944OooO0Oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        MomentDetailModel momentDetailModel = this.f47944OooO0Oo;
        if (iIntValue == 2095) {
            LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Long.valueOf(momentDetailModel.getId()));
        } else if (iIntValue == 4000) {
            LiveEventBus.get("MOMENT_BY_USER_REMOVE").post(Long.valueOf(momentDetailModel.getId()));
        }
        return Unit.INSTANCE;
    }
}
