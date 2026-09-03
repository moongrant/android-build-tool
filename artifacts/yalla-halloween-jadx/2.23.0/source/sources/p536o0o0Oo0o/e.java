package p536o0o0Oo0o;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.user.UserOutFitVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o000O000;
import p420o0OoO0OO.o0OO00O;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f54926OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f54927OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserOutFitVM f54928OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54929OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ShopVehicleListModel shopVehicleListModel, UserOutFitVM userOutFitVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f54926OooO0Oo = shopVehicleListModel;
        this.f54928OooO0o0 = userOutFitVM;
        this.f54927OooO0o = o0o0ooo0;
        this.f54929OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleOwner lifecycleOwner = this.f54929OooO0oO;
        ShopVehicleListModel shopVehicleListModel = this.f54926OooO0Oo;
        boolean isFreeze = shopVehicleListModel.getIsFreeze();
        UserOutFitVM userOutFitVM = this.f54928OooO0o0;
        if (isFreeze) {
            userOutFitVM.getShowPremiumBuyFrozenDialog().setValue(Boolean.TRUE);
        } else {
            o0OO00O<ApiResult<String>> o0oo00oUseVehicleEdit = userOutFitVM.useVehicleEdit(shopVehicleListModel);
            v0.OooO0O0(o0oo00oUseVehicleEdit, this.f54927OooO0o, false, 6);
            o000O000.OooO0Oo(o0oo00oUseVehicleEdit, lifecycleOwner, false, null, null, new q(shopVehicleListModel), 14);
        }
        return Unit.INSTANCE;
    }
}
