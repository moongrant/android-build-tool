package p543o0o0Ooo0;

import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.vm.user.UserOutFitVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class c3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserOutFitVM f55382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f55383OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(UserOutFitVM userOutFitVM, ShopVehicleListModel shopVehicleListModel) {
        super(0);
        this.f55382OooO0Oo = userOutFitVM;
        this.f55383OooO0o0 = shopVehicleListModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String picDynamic = this.f55383OooO0o0.getPicDynamic();
        UserOutFitVM userOutFitVM = this.f55382OooO0Oo;
        userOutFitVM.setPicUrl(picDynamic);
        userOutFitVM.getShowVehicleDialog().setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
