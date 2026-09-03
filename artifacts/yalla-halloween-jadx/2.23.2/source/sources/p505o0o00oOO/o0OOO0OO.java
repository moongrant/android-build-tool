package p505o0o00oOO;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f50364OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(VehicleStoreActivity vehicleStoreActivity) {
        super(0);
        this.f50364OooO0Oo = vehicleStoreActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PremiumActivity.f26673Oooo0oO;
        VehicleStoreActivity vehicleStoreActivity = this.f50364OooO0Oo;
        vehicleStoreActivity.getClass();
        PremiumActivity.OooO00o.OooO00o(vehicleStoreActivity, PremiumLevel.Premium3);
        return Unit.INSTANCE;
    }
}
