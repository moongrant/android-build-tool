package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47879OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(MomentDetailActivity momentDetailActivity) {
        super(1);
        this.f47879OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        MomentDetailActivity momentDetailActivity = this.f47879OooO0Oo;
        if (momentDetailActivity.f26069OooOooO == iIntValue) {
            if (iIntValue == 0) {
                momentDetailActivity.OooOoo0().tabRefreshData(true);
            } else if (iIntValue == 1) {
                momentDetailActivity.OooOooO().tabRefreshData(true);
            } else if (iIntValue == 2) {
                momentDetailActivity.OooOoo().tabRefreshData(true);
            }
            momentDetailActivity.OooOoOO().f59049OooO0O0.setExpanded(false);
        } else {
            momentDetailActivity.OooOoOO().f59056OooOO0.setCurrentItem(iIntValue);
            momentDetailActivity.f26069OooOooO = iIntValue;
        }
        return Unit.INSTANCE;
    }
}
