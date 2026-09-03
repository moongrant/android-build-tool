package p499o0o00o0O;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f49390OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(VehicleMineActivity vehicleMineActivity) {
        super(0);
        this.f49390OooO0Oo = vehicleMineActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("105031");
        int i = PremiumActivity.f27140Oooo0oO;
        VehicleMineActivity vehicleMineActivity = this.f49390OooO0Oo;
        vehicleMineActivity.getClass();
        PremiumActivity.OooO00o.OooO00o(vehicleMineActivity, PremiumLevel.Premium3);
        return Unit.INSTANCE;
    }
}
