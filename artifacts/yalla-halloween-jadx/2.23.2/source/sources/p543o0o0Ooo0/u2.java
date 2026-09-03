package p543o0o0Ooo0;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.user.UserOutFitVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o00O0O;
import p424o0OoO0Oo.o00OO0O0;
import p516o0o0O00o.o0oOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f55690OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f55691OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserOutFitVM f55692OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55693OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(ShopVehicleListModel shopVehicleListModel, UserOutFitVM userOutFitVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f55690OooO0Oo = shopVehicleListModel;
        this.f55692OooO0o0 = userOutFitVM;
        this.f55691OooO0o = o0ooo0o1;
        this.f55693OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleOwner lifecycleOwner = this.f55693OooO0oO;
        ShopVehicleListModel shopVehicleListModel = this.f55690OooO0Oo;
        boolean isFreeze = shopVehicleListModel.getIsFreeze();
        UserOutFitVM userOutFitVM = this.f55692OooO0o0;
        if (isFreeze) {
            userOutFitVM.getShowPremiumBuyFrozenDialog().setValue(Boolean.TRUE);
        } else {
            o00OO0O0<ApiResult<String>> o00oo0o0UseVehicleEdit = userOutFitVM.useVehicleEdit(shopVehicleListModel);
            o0oOO.OooO0O0(o00oo0o0UseVehicleEdit, this.f55691OooO0o, false, 6);
            o00O0O.OooO0Oo(o00oo0o0UseVehicleEdit, lifecycleOwner, false, null, null, new f3(shopVehicleListModel), 14);
        }
        return Unit.INSTANCE;
    }
}
