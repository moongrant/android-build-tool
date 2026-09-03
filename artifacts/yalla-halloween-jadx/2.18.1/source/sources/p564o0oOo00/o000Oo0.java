package p564o0oOo00;

import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f45158Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f45159Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(VehicleStoreActivity vehicleStoreActivity, ShopVehicleListModel shopVehicleListModel) {
        super(0);
        this.f45158Oooo0o = vehicleStoreActivity;
        this.f45159Oooo0oO = shopVehicleListModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        VehicleStoreActivity vehicleStoreActivity = this.f45158Oooo0o;
        Objects.requireNonNull(vehicleStoreActivity);
        oooO00o.OooO00o(vehicleStoreActivity, PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(this.f45159Oooo0oO.getNVehicleTagType())));
        return Unit.INSTANCE;
    }
}
