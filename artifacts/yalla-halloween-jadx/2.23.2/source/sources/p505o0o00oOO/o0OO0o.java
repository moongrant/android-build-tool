package p505o0o00oOO;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f50356OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(VehicleMineActivity vehicleMineActivity) {
        super(0);
        this.f50356OooO0Oo = vehicleMineActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("105031");
        int i = PremiumActivity.f26673Oooo0oO;
        VehicleMineActivity vehicleMineActivity = this.f50356OooO0Oo;
        vehicleMineActivity.getClass();
        PremiumActivity.OooO00o.OooO00o(vehicleMineActivity, PremiumLevel.Premium3);
        return Unit.INSTANCE;
    }
}
