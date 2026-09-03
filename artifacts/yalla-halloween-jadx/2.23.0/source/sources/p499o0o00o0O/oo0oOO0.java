package p499o0o00o0O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVehicleMineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleMineActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleMineActivity$initObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,277:1\n1855#2,2:278\n*S KotlinDebug\n*F\n+ 1 VehicleMineActivity.kt\ncom/yalla/yalla/ui/activity/store/VehicleMineActivity$initObserver$1\n*L\n67#1:278,2\n*E\n"})
public final class oo0oOO0 implements Observer<Response<List<ShopVehicleListModel>>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f49420OooO0Oo;

    public oo0oOO0(VehicleMineActivity vehicleMineActivity) {
        this.f49420OooO0Oo = vehicleMineActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<List<ShopVehicleListModel>> response) {
        List<ShopVehicleListModel> data;
        Response<List<ShopVehicleListModel>> response2 = response;
        boolean isSuccess = response2.getIsSuccess();
        o00O0OOO o00o0ooo2 = null;
        VehicleMineActivity vehicleMineActivity = this.f49420OooO0Oo;
        if (isSuccess && (data = response2.getData()) != null) {
            for (ShopVehicleListModel shopVehicleListModel : data) {
                if (shopVehicleListModel.isSelected()) {
                    vehicleMineActivity.f27037OooOo0O = shopVehicleListModel.getShopId();
                }
            }
            o00O0OOO o00o0ooo3 = vehicleMineActivity.f27035OooOo0;
            if (o00o0ooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00o0ooo3 = null;
            }
            o00o0ooo3.OooOoO0(data);
        }
        o00O0OOO o00o0ooo4 = vehicleMineActivity.f27035OooOo0;
        if (o00o0ooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            o00o0ooo2 = o00o0ooo4;
        }
        o00o0ooo2.Oooo00o();
        vehicleMineActivity.OooOo().f58427OooO0OO.OooOooo(true, response2.getIsSuccess(), response2.getNoMoreData());
        vehicleMineActivity.OooOo0();
    }
}
