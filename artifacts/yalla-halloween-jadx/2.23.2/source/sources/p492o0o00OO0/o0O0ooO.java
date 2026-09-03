package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49308OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(MomentDetailActivity momentDetailActivity) {
        super(1);
        this.f49308OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        MomentDetailActivity momentDetailActivity = this.f49308OooO0Oo;
        if (momentDetailActivity.f25620OooOooO == iIntValue) {
            if (iIntValue == 0) {
                momentDetailActivity.OooOoOO().tabRefreshData(true);
            } else if (iIntValue == 1) {
                momentDetailActivity.OooOoo().tabRefreshData(true);
            } else if (iIntValue == 2) {
                momentDetailActivity.OooOoo0().tabRefreshData(true);
            }
            momentDetailActivity.OooOoO().f44928OooO0O0.setExpanded(false);
        } else {
            momentDetailActivity.OooOoO().f44935OooOO0.setCurrentItem(iIntValue);
            momentDetailActivity.f25620OooOooO = iIntValue;
        }
        return Unit.INSTANCE;
    }
}
