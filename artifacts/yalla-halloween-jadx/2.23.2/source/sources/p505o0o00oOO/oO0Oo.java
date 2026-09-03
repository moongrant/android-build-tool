package p505o0o00oOO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.ShopVehicleModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f50378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f50379OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(ShopVehicleListModel shopVehicleListModel, VehicleStoreActivity vehicleStoreActivity) {
        super(0);
        this.f50378OooO0Oo = vehicleStoreActivity;
        this.f50379OooO0o0 = shopVehicleListModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = VehicleStoreActivity.f26578OooOo;
        final VehicleStoreActivity vehicleStoreActivity = this.f50378OooO0Oo;
        vehicleStoreActivity.getClass();
        final ShopVehicleListModel shopVehicleListModel = this.f50379OooO0o0;
        if (!OooOo00.OooO00o(shopVehicleListModel) && !OooOo00.OooO00o(Long.valueOf(shopVehicleListModel.getShopId()))) {
            ((VehicleStoreVM) vehicleStoreActivity.f26581OooOo00.getValue()).personalVehicleList(String.valueOf(shopVehicleListModel.getShopId())).observe(vehicleStoreActivity, new Observer() { // from class: o0o00oOO.o0OOO00
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Response response = (Response) obj;
                    int i2 = VehicleStoreActivity.f26578OooOo;
                    ShopVehicleListModel item = shopVehicleListModel;
                    Intrinsics.checkNotNullParameter(item, "$item");
                    VehicleStoreActivity this$0 = vehicleStoreActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (response.getIsSuccess()) {
                        boolean z = true;
                        item.setHave(1);
                        ShopVehicleModel shopVehicleModel = (ShopVehicleModel) response.getData();
                        if (shopVehicleModel != null) {
                            long balance = shopVehicleModel.getBalance();
                            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                            o0O00oO0.OooO0O0().postValue(Long.valueOf(balance));
                        }
                        o0OOOO0o o0oooo0o2 = this$0.f26580OooOo0;
                        if (o0oooo0o2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            o0oooo0o2 = null;
                        }
                        o0oooo0o2.notifyDataSetChanged();
                        String strOooO0OO = o0000.OooO0OO(o000000.Purchase_successful);
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                        if (!this$0.f26582OooOo0O) {
                            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 4, null, false, 6, null);
                        } else {
                            LiveEventBus.get("OUT_FIT_VEHICLES_REFRESH").post(Boolean.TRUE);
                            this$0.finish();
                        }
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
