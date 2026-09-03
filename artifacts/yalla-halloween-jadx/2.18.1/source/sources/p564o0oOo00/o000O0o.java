package p564o0oOo00;

import android.content.Intent;
import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.model.ShopVehicleModel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f45154Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f45155Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(VehicleStoreActivity vehicleStoreActivity, ShopVehicleListModel shopVehicleListModel) {
        super(0);
        this.f45154Oooo0o = vehicleStoreActivity;
        this.f45155Oooo0oO = shopVehicleListModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final VehicleStoreActivity vehicleStoreActivity = this.f45154Oooo0o;
        final ShopVehicleListModel shopVehicleListModel = this.f45155Oooo0oO;
        VehicleStoreActivity.OooO00o oooO00o = VehicleStoreActivity.f23259OooooOO;
        Objects.requireNonNull(vehicleStoreActivity);
        if (!OooO0OO.OooO00o(shopVehicleListModel) && !OooO0OO.OooO00o(Long.valueOf(shopVehicleListModel.getShopId()))) {
            ((VehicleStoreVM) vehicleStoreActivity.f23261Ooooo00.getValue()).personalVehicleList(String.valueOf(shopVehicleListModel.getShopId())).observe(vehicleStoreActivity, new Observer() { // from class: o0oOo00.o0000oo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    ShopVehicleListModel item = shopVehicleListModel;
                    VehicleStoreActivity context = vehicleStoreActivity;
                    Response response = (Response) obj;
                    VehicleStoreActivity.OooO00o oooO00o2 = VehicleStoreActivity.f23259OooooOO;
                    Intrinsics.checkNotNullParameter(item, "$item");
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    if (response.getIsSuccess()) {
                        boolean z = true;
                        item.setHave(1);
                        ShopVehicleModel shopVehicleModel = (ShopVehicleModel) response.getData();
                        if (shopVehicleModel != null) {
                            OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(shopVehicleModel.getBalance()));
                        }
                        p188o00o00o0.OooO0OO<ShopVehicleListModel> oooO0OO = context.f23262Ooooo0o;
                        if (oooO0OO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            oooO0OO = null;
                        }
                        oooO0OO.notifyDataSetChanged();
                        String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Purchase_successful);
                        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z = false;
                        }
                        if (!z) {
                            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o0o0oooOooO0O0.run();
                            } else {
                                o00O000 o00o001 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                            }
                        }
                        Intrinsics.checkNotNullParameter(context, "context");
                        context.startActivity(new Intent(context, (Class<?>) VehicleMineActivity.class));
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
