package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f49154OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(MomentMessageListActivity momentMessageListActivity) {
        super(1);
        this.f49154OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        int i = MomentMessageListActivity.f25667OooOoOO;
        this.f49154OooO0Oo.OooOoOO(iIntValue);
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                OooO00o.OooO0O0("203011");
            } else if (iIntValue == 2) {
                OooO00o.OooO0O0("203012");
            } else if (iIntValue == 3) {
                OooO00o.OooO0O0("203013");
            } else if (iIntValue == 4) {
                OooO00o.OooO0O0("203014");
            } else if (iIntValue == 5) {
                OooO00o.OooO0O0("203015");
            }
        }
        return Unit.INSTANCE;
    }
}
