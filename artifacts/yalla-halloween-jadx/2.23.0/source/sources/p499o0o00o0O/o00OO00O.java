package p499o0o00o0O;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.ShopVehicleModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O implements Observer<Response<ShopVehicleModel>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f49399OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f49400OooO0o0;

    public o00OO00O(ShopVehicleListModel shopVehicleListModel, VehicleStoreActivity vehicleStoreActivity) {
        this.f49399OooO0Oo = shopVehicleListModel;
        this.f49400OooO0o0 = vehicleStoreActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<ShopVehicleModel> response) {
        Response<ShopVehicleModel> response2 = response;
        if (response2.getIsSuccess()) {
            boolean z = true;
            this.f49399OooO0Oo.setHave(1);
            ShopVehicleModel data = response2.getData();
            if (data != null) {
                long balance = data.getBalance();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooO0O0().postValue(Long.valueOf(balance));
            }
            VehicleStoreActivity vehicleStoreActivity = this.f49400OooO0o0;
            o00OO o00oo2 = vehicleStoreActivity.f27045OooOo0;
            if (o00oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00oo2 = null;
            }
            o00oo2.notifyDataSetChanged();
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Purchase_successful);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            if (!vehicleStoreActivity.f27047OooOo0O) {
                MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 4, null, false, 6, null);
            } else {
                LiveEventBus.get("OUT_FIT_VEHICLES_REFRESH").post(Boolean.TRUE);
                vehicleStoreActivity.finish();
            }
        }
    }
}
