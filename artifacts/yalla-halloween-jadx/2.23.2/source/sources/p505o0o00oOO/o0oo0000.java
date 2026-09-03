package p505o0o00oOO;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oo0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f50375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f50376OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(ShopVehicleListModel shopVehicleListModel, VehicleStoreActivity vehicleStoreActivity) {
        super(0);
        this.f50375OooO0Oo = vehicleStoreActivity;
        this.f50376OooO0o0 = shopVehicleListModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PremiumActivity.f26673Oooo0oO;
        VehicleStoreActivity vehicleStoreActivity = this.f50375OooO0Oo;
        vehicleStoreActivity.getClass();
        PremiumActivity.OooO00o.OooO00o(vehicleStoreActivity, PremiumLevel.INSTANCE.of(Integer.valueOf(this.f50376OooO0o0.getNVehicleTagType())));
        return Unit.INSTANCE;
    }
}
