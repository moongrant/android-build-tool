package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f47834OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(MomentMessageListActivity momentMessageListActivity) {
        super(1);
        this.f47834OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        int i = MomentMessageListActivity.f26116OooOoOO;
        this.f47834OooO0Oo.OooOoOO(iIntValue);
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                o0OO000.OooO00o("203011");
            } else if (iIntValue == 2) {
                o0OO000.OooO00o("203012");
            } else if (iIntValue == 3) {
                o0OO000.OooO00o("203013");
            } else if (iIntValue == 4) {
                o0OO000.OooO00o("203014");
            } else if (iIntValue == 5) {
                o0OO000.OooO00o("203015");
            }
        }
        return Unit.INSTANCE;
    }
}
