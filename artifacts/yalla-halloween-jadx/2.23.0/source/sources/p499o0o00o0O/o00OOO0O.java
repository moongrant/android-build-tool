package p499o0o00o0O;

import com.code.android.util.OooOo00;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f49406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f49407OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(ShopVehicleListModel shopVehicleListModel, VehicleStoreActivity vehicleStoreActivity) {
        super(0);
        this.f49406OooO0Oo = vehicleStoreActivity;
        this.f49407OooO0o0 = shopVehicleListModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = VehicleStoreActivity.f27043OooOo;
        VehicleStoreActivity vehicleStoreActivity = this.f49406OooO0Oo;
        vehicleStoreActivity.getClass();
        ShopVehicleListModel shopVehicleListModel = this.f49407OooO0o0;
        if (!OooOo00.OooO00o(shopVehicleListModel) && !OooOo00.OooO00o(Long.valueOf(shopVehicleListModel.getShopId()))) {
            ((VehicleStoreVM) vehicleStoreActivity.f27046OooOo00.getValue()).personalVehicleList(String.valueOf(shopVehicleListModel.getShopId())).observe(vehicleStoreActivity, new o00OO00O(shopVehicleListModel, vehicleStoreActivity));
        }
        return Unit.INSTANCE;
    }
}
