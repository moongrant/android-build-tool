package p499o0o00o0O;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 implements Observer<Response<String>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f49396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f49397OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f49398OooO0o0;

    public o00OO000(Ref.IntRef intRef, ShopVehicleListModel shopVehicleListModel, VehicleMineActivity vehicleMineActivity) {
        this.f49396OooO0Oo = intRef;
        this.f49398OooO0o0 = shopVehicleListModel;
        this.f49397OooO0o = vehicleMineActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<String> response) {
        if (response.getIsSuccess()) {
            int i = this.f49396OooO0Oo.element;
            VehicleMineActivity vehicleMineActivity = this.f49397OooO0o;
            ShopVehicleListModel shopVehicleListModel = this.f49398OooO0o0;
            boolean z = true;
            if (i == 1) {
                shopVehicleListModel.setSelected(false);
                vehicleMineActivity.f27037OooOo0O = 0L;
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.vehicle_mine_inUse_successful);
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
            } else {
                shopVehicleListModel.setSelected(true);
                vehicleMineActivity.f27037OooOo0O = shopVehicleListModel.getShopId();
                String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.vehicle_mine_Use_successful);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            }
            o00O0OOO o00o0ooo2 = vehicleMineActivity.f27035OooOo0;
            if (o00o0ooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00o0ooo2 = null;
            }
            o00o0ooo2.notifyDataSetChanged();
        }
    }
}
